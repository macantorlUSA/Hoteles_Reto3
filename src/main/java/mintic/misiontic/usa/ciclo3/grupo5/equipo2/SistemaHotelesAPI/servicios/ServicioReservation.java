package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Reservation;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.RepositorioReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioReservation {

    @Autowired
    private RepositorioReservation metodosCrud;

    public List<Reservation> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Reservation> getCategoria(int id) {
        return metodosCrud.getCategoria(id);
    }

    public void save(Reservation categoria) {
        if (categoria.getIdReservation()== null) {
            metodosCrud.save(categoria);
        } else {
            Optional<Reservation> evt = metodosCrud.getCategoria(categoria.getIdReservation());
            if (evt.isEmpty()) {
                metodosCrud.save(categoria);
            }
        }
    }
}
