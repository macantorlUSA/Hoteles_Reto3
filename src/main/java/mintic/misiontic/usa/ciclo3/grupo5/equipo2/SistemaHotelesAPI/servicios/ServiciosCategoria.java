
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Category;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.CategoriaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosCategoria {
     @Autowired
    private CategoriaRepositorio metodosCrud;
    
    public List<Category> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Category> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    
    public Category save(Category categoria){
        if(categoria.getIdCategory()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Category> evt=metodosCrud.getCategoria(categoria.getIdCategory());
            if(evt.isEmpty()){
            return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        
        
        }
    
    }
}
