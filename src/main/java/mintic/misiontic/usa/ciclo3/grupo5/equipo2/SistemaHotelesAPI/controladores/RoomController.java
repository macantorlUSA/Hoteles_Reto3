
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.controladores;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Room;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios.ServiciosRoom;

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
@RequestMapping("/api/Room")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RoomController {
    @GetMapping("/holaMundo")
    public String saludad(){
    return "Hola Mundo Tutoria";
    }
    
    @Autowired
    private ServiciosRoom servicios;
    @GetMapping("/all")
    public List <Room> getRoom(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Room> getRoom(@PathVariable("id") int idRoom) {
        return servicios.getRoom(idRoom);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Room save(@RequestBody Room room) {
        return servicios.save(room);
    }
    
    
}