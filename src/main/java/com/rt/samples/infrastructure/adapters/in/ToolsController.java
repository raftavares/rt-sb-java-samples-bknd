package com.rt.samples.infrastructure.adapters.in;

import com.rt.samples.application.ports.out.ExternalToolPort;
import com.rt.samples.domain.models.RunCalculator200Response;
import com.rt.samples.infrastructure.adapters.in.api.ToolsApi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
// Importe a interface gerada pelo OpenAPI (pode variar o nome conforme o seu YAML)
// import com.rt.samples.infrastructure.adapters.in.api.ToolsApi;

@RestController
public class ToolsController implements ToolsApi {

    private final ExternalToolPort externalToolPort;

    // Injeção de dependência via construtor (Boa prática!)
    public ToolsController(ExternalToolPort externalToolPort) {
        this.externalToolPort = externalToolPort;
    }

    @Override
    public ResponseEntity<RunCalculator200Response> runCalculator() {
        // 1. Executa a lógica nativa
        externalToolPort.executeTool();

        // 2. Cria o objeto de resposta exigido pelo contrato
        RunCalculator200Response response = new RunCalculator200Response();
        response.setStatus("Processo calc.exe iniciado");

        // 3. Retorna o tipo correto
        return ResponseEntity.ok(response);
    }

}
