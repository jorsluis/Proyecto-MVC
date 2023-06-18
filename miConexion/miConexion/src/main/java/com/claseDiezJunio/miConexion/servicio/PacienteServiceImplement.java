/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.claseDiezJunio.miConexion.servicio;

import com.claseDiezJunio.miConexion.dao.PacienteDao;
import com.claseDiezJunio.miConexion.models.Paciente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PacienteServiceImplement implements Servicios{
    
    @Autowired
    private PacienteDao pacienteDao;
    
    @Override
    public List<Paciente> listaPaciente() {
      
      return (List<Paciente>) pacienteDao.findAll();
     }
    
}
