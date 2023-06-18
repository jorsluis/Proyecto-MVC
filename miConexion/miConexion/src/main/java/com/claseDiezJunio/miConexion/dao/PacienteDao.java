/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.claseDiezJunio.miConexion.dao;

import com.claseDiezJunio.miConexion.models.Paciente;
import org.springframework.data.repository.CrudRepository;


public interface PacienteDao extends CrudRepository<Paciente, Integer>{
    
}
