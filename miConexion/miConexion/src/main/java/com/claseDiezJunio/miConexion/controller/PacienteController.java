/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.claseDiezJunio.miConexion.controller;

import com.claseDiezJunio.miConexion.models.Paciente;
import com.claseDiezJunio.miConexion.servicio.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {
    
    @Autowired
    private Servicios servicio;
    
    @GetMapping("/listar")
    public String consultaPaciente(Model model){
        
        List<Paciente> listPaciente = servicio.listaPaciente();
        model.addAttribute("paciente", listPaciente);
        return "listadoPacientes";
    }
    
}
