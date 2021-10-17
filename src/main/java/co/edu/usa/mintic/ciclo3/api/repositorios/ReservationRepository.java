package co.edu.usa.mintic.ciclo3.api.repositorios;

import java.util.List;
import java.util.Optional;
import co.edu.usa.mintic.ciclo3.api.modelos.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.usa.mintic.ciclo3.api.repositorios.crud.InterfaceReservation;

@Repository
public class ReservationRepository {

    @Autowired
    private InterfaceReservation crud;

    public List<Reservation> getAll() {
        return (List<Reservation>) crud.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return crud.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return crud.save(reservation);
    }
}
