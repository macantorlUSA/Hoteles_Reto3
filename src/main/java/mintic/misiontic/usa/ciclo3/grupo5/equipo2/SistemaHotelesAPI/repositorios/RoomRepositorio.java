
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.crud.InterfaceRoom;




@Repository
public class RoomRepositorio {
    @Autowired
    private InterfaceRoom crud;
    
    public List<Room> getAll(){
        return (List<Room>) crud.findAll();
    }
    public Optional <Room> getRoom(int id){
        return crud.findById(id);
    }
    
    public Room save(Room room){
        return crud.save(room);
    }
    
}
