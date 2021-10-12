
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Room;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.RoomRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosRoom {
    @Autowired
    private RoomRepositorio metodosCrud;
    
    public List<Room> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Room> getRoom(int idRoom){
        return metodosCrud.getRoom(idRoom);
    }
    
    
    public Room save(Room room){
        if(room.getIdRoom()==null){
            return metodosCrud.save(room);
        }else{
            Optional<Room> evt=metodosCrud.getRoom(room.getIdRoom());
            if(evt.isEmpty()){
            return metodosCrud.save(room);
            }else{
                return room;
            }
        
        
        }
    
    }
      
}
