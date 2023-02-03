package com.sofka.qa.TerminalTransporteApp.Service;

import com.sofka.qa.TerminalTransporteApp.Models.Viaje;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViajeService {
    private List<Viaje> viajes = new ArrayList<>();

    public Viaje registrarViaje(Viaje viaje) {
        viajes.add(viaje);
        return viaje;
    }
    public List<Viaje> listarViajes() {
        return viajes;
    }

    public ViajeService() {
        this.viajes = new ArrayList<>();
    }
    public List<Viaje> obtenerViajes() {
        return viajes;
    }

}



