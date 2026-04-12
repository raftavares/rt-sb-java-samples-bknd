package com.rt.samples.application.ports.out;

/**
 * Interface de saída (Port) para execução de ferramentas externas.
 * Segue o princípio da inversão de dependência da Arquitetura Hexagonal.
 */
public interface ExternalToolPort {
    void executeTool();
}