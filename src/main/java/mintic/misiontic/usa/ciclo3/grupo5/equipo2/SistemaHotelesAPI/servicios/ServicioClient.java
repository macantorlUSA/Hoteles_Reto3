package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Client;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.RepositorioClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioClient {

    @Autowired
    private RepositorioClient metodosCrud;

    public List<Client> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Client> getCategoria(int id) {
        return metodosCrud.getCategoria(id);
    }

    public void save(Client categoria) {
        if (categoria.getIdClient() == null) {
            metodosCrud.save(categoria);
        } else {
            Optional<Client> evt = metodosCrud.getCategoria(categoria.getIdClient());
            if (evt.isEmpty()) {
                metodosCrud.save(categoria);
            }
        }
    }
}
