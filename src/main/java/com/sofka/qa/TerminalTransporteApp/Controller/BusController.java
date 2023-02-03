package com.sofka.qa.TerminalTransporteApp.Controller;

import com.sofka.qa.TerminalTransporteApp.Models.Bus;
import com.sofka.qa.TerminalTransporteApp.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @PostMapping
    public ResponseEntity<Bus> registrarBus(@RequestBody Bus bus) {
        Bus busRegistrado = busService.registrarBus(bus);
        return new ResponseEntity<Bus>(busRegistrado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Bus>> obtenerBuses() {
        List<Bus> buses = busService.obtenerBuses();
        return new ResponseEntity<List<Bus>>(buses, HttpStatus.OK);
    }
}

