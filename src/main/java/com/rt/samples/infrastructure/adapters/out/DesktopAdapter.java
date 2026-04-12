package com.rt.samples.infrastructure.adapters.out;

import com.rt.samples.application.ports.out.ExternalToolPort;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class DesktopAdapter implements ExternalToolPort {

    @Override
    public void executeTool() {
        try {
            // O "Vrau" para abrir a calculadora no Windows
            Runtime.getRuntime().exec("calc.exe");
        } catch (IOException e) {
            // Log de erro na infraestrutura
            System.err.println("Erro ao disparar processo nativo: " + e.getMessage());
        }
    }
}