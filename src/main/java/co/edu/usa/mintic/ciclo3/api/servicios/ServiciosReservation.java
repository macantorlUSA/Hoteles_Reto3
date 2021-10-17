package co.edu.usa.mintic.ciclo3.api.servicios;

import java.util.List;
import java.util.Optional;
import co.edu.usa.mintic.ciclo3.api.modelos.Reservation;
import co.edu.usa.mintic.ciclo3.api.repositorios.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosReservation {

    @Autowired
    private ReservationRepository metodosCrud;

    public List<Reservation> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return metodosCrud.getReservation(id);
    }

    public void save(Reservation reservation) {
        if (reservation.getId() == null) {
            metodosCrud.save(reservation);
        } else {
            Optional<Reservation> evt = metodosCrud.getReservation(reservation.getId());
            if (evt.isEmpty()) {
                metodosCrud.save(reservation);
            }
        }
    }
}
