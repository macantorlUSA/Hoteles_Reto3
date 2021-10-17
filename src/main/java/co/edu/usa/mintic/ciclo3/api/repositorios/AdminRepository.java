package co.edu.usa.mintic.ciclo3.api.repositorios;

import java.util.List;
import java.util.Optional;
import co.edu.usa.mintic.ciclo3.api.modelos.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.usa.mintic.ciclo3.api.repositorios.crud.InterfaceAdmin;

@Repository
public class AdminRepository {

    @Autowired
    private InterfaceAdmin crud;

    public List<Admin> getAll() {
        return (List<Admin>) crud.findAll();
    }

    public Optional<Admin> getCategoria(int id) {
        return crud.findById(id);
    }

    public Admin save(Admin categoria) {
        return crud.save(categoria);
    }

}
