package com.sofka.qa.TerminalTransporteApp.Service;

import com.sofka.qa.TerminalTransporteApp.Models.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService {
    private List<Bus> buses = new ArrayList<>();

    public Bus registrarBus(Bus bus) {
        buses.add(bus);
        return bus;
    }
    public List<Bus> listarBuses() {
        return buses;
    }

    public Bus actualizarBus(String id, Bus busActualizado) {
        Bus busEncontrado = buses.stream()
                .filter(bus -> bus.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (busEncontrado != null) {
            int indice = buses.indexOf(busEncontrado);
            buses.set(indice, busActualizado);
        }

        return busEncontrado;
    }

    public Bus eliminarBus(String id) {
        Bus busEncontrado = buses.stream()
                .filter(bus -> bus.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (busEncontrado != null) {
            buses.remove(busEncontrado);
        }

        return busEncontrado;
    }

    public List<Bus> obtenerBuses() {
        return buses;
    }
}

