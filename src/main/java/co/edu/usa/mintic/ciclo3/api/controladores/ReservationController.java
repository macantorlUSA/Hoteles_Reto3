package co.edu.usa.mintic.ciclo3.api.controladores;

import java.util.List;
import java.util.Optional;
import co.edu.usa.mintic.ciclo3.api.modelos.Reservation;
import co.edu.usa.mintic.ciclo3.api.servicios.ServiciosReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ReservationController {

    @Autowired
    private ServiciosReservation servicios;

    @GetMapping("/all")
    public List<Reservation> getCategoria() {
        return servicios.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getCategoria(@PathVariable("id") int id) {
        return servicios.getReservation(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Reservation reserva) {
        servicios.save(reserva);
    }
}
