package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Data;

@Data
@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "room")
    @JsonIgnoreProperties("reservations")
    Room room;
    
    /*@ManyToOne
    @JoinColumn(name = "client")
    @JsonIgnoreProperties("client")
    Room room;*/
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date startDate;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date endDate;
    
    String status;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date creationDate;
}
