package com.sofka.qa.TerminalTransporteApp.Controller;

import com.sofka.qa.TerminalTransporteApp.Models.Viaje;
import com.sofka.qa.TerminalTransporteApp.Service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    @PostMapping
    public ResponseEntity<Viaje> registrarViaje(@RequestBody Viaje viaje) {
        Viaje viajeRegistrado = viajeService.registrarViaje(viaje);
        return new ResponseEntity<Viaje>(viajeRegistrado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Viaje>> obtenerViajes() {
        List<Viaje> viajes = viajeService.obtenerViajes();
        return new ResponseEntity<List<Viaje>>(viajes, HttpStatus.OK);
    }
}

