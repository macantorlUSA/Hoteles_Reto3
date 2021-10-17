package co.edu.usa.mintic.ciclo3.api.servicios;

import java.util.List;
import java.util.Optional;
import co.edu.usa.mintic.ciclo3.api.modelos.Admin;
import co.edu.usa.mintic.ciclo3.api.repositorios.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosAdmin {

    @Autowired
    private AdminRepository metodosCrud;

    public List<Admin> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Admin> getCategoria(int id) {
        return metodosCrud.getCategoria(id);
    }

    public void save(Admin categoria) {
        if (categoria.getId() == null) {
            metodosCrud.save(categoria);
        } else {
            Optional<Admin> evt = metodosCrud.getCategoria(categoria.getId());
            if (evt.isEmpty()) {
                metodosCrud.save(categoria);
            }
        }
    }
}
