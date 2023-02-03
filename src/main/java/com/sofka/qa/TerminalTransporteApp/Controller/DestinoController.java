package com.sofka.qa.TerminalTransporteApp.Controller;

import com.sofka.qa.TerminalTransporteApp.Models.Destino;
import com.sofka.qa.TerminalTransporteApp.Service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @PostMapping
    public ResponseEntity<Destino> registrarDestino(@RequestBody Destino destino) {
        Destino destinoRegistrado = destinoService.registrarDestino(destino);
        return new ResponseEntity<>(destinoRegistrado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Destino>> obtenerDestinos() {
        List<Destino> destinos = destinoService.obtenerDestinos();
        return new ResponseEntity<>(destinos, HttpStatus.OK);
    }

}
