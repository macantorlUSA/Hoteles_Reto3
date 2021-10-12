package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Message;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosMessage {

    @Autowired
    private MessageRepository metodosCrud;

    public List<Message> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Message> getMessage(int id) {
        return metodosCrud.getMessage(id);
    }

    public void save(Message message) {
        if (message.getIdMessage()== null) {
            metodosCrud.save(message);
        } else {
            Optional<Message> evt = metodosCrud.getMessage(message.getIdMessage());
            if (evt.isEmpty()) {
                metodosCrud.save(message);
            }
        }
    }
}
