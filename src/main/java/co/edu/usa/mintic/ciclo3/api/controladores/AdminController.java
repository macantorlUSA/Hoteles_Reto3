package co.edu.usa.mintic.ciclo3.api.controladores;

import java.util.List;
import java.util.Optional;
import co.edu.usa.mintic.ciclo3.api.modelos.Admin;
import co.edu.usa.mintic.ciclo3.api.servicios.ServiciosAdmin;
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
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AdminController {

    @Autowired
    private ServiciosAdmin servicios;

    @GetMapping("/all")
    public List<Admin> getCategoria() {
        return servicios.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Admin> getCategoria(@PathVariable("id") int idCategoria) {
        return servicios.getCategoria(idCategoria);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Admin categoria) {
        servicios.save(categoria);
    }
}
