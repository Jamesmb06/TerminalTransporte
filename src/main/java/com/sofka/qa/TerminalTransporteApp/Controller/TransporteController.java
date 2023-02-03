package com.sofka.qa.TerminalTransporteApp.Controller;

import com.sofka.qa.TerminalTransporteApp.Models.Bus;
import com.sofka.qa.TerminalTransporteApp.Models.Destino;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transporte")
public class TransporteController {
    private List<Destino> destinos = new ArrayList<>();
    private List<Bus> buses = new ArrayList<>();

    @PostMapping("/destinos")
    public void registrarDestino(@RequestBody Destino destino) {
        destinos.add(destino);
    }

    @GetMapping("/destinos")
    public List<Destino> obtenerDestinos() {
        return destinos;
    }

    @PutMapping("/destinos/{id}")
    public void actualizarDestino(@PathVariable int id, @RequestBody Destino destino) {
        destinos.set(id, destino);
    }@PostMapping("/buses")
    public void registrarBus(@RequestBody Bus bus) {
        buses.add(bus);
    }

    @GetMapping("/buses")
    public List<Bus> obtenerBuses() {
        return buses;
    }

    @PutMapping("/buses/{id}")
    public void actualizarBus(@PathVariable int id, @RequestBody Bus bus) {
        buses.set(id, bus);
    }
}


