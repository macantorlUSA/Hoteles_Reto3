
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.crud.InterfaceCategoria;

@Repository
public class CategoriaRepositorio {
    
     @Autowired
    private InterfaceCategoria crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    public Optional <Category> getCategoria(int id){
        return crud.findById(id);
    }
    
    public Category save(Category categoria){
        return crud.save(categoria);
    }
    
}
