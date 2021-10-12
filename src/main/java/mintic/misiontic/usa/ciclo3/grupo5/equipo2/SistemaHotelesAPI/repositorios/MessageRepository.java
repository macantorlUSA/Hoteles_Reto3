
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Message;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.crud.InterfaceMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    @Autowired
    private InterfaceMessage crud;
    
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    public Optional <Message> getMessage(int id){
        return crud.findById(id);
    }
    
    public Message save(Message message){
        return crud.save(message);
    }
    
}
