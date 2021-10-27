/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.Repository.crud;

import co.usa.ciclo3.ciclo3.Modelo.Reservaciones;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author roll-
 */
public interface ReservacionesCrudRepository extends CrudRepository<Reservaciones,Integer>{
    
    
    public List<Reservaciones> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
    
}
