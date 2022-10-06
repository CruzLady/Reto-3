/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.MachineInterface;
import com.example.demo.Modelo.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public class MachineRepository {
     @Autowired
    private MachineInterface extencionesCrud;
    
    public List<Machine> getAll (){
        return (List<Machine>) extencionesCrud.findAll();
    }
    
    public Optional<Machine> getMachine (int id){
        return extencionesCrud.findById(id);
        
        }
    public Machine save (Machine machine){
        return extencionesCrud.save (machine);
}
}
