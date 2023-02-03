package com.sofka.qa.TerminalTransporteApp.Service;

import com.sofka.qa.TerminalTransporteApp.Models.Destino;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService {
    private List<Destino> destinos = new ArrayList<>();

    public Destino registrarDestino(Destino destino) {
        destinos.add(destino);
        return destino;
    }

    public List<Destino> listarDestinos() {
        return destinos;
    }

    public Destino actualizarDestino(String id, Destino destinoActualizado) {
        Destino destinoEncontrado = destinos.stream()
                .filter(destino -> destino.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (destinoEncontrado != null) {
            int indice = destinos.indexOf(destinoEncontrado);
            destinos.set(indice, destinoActualizado);
        }

        return destinoEncontrado;
    }

    public Destino eliminarDestino(String id) {
        Destino destinoEncontrado = destinos.stream()
                .filter(destino -> destino.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (destinoEncontrado != null) {
            destinos.remove(destinoEncontrado);
        }

        return destinoEncontrado;
    }

    public List<Destino> obtenerDestinos() {
        return destinos;
    }
}

