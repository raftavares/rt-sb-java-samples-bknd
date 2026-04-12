package com.rt.samples.infrastructure.adapters.in;

import com.rt.samples.domain.models.HelloResponse;
import com.rt.samples.infrastructure.adapters.in.api.HelloApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi { // Nome da interface gerada

    @Override
    public ResponseEntity<HelloResponse> getHello() {
        HelloResponse response = new HelloResponse();
        response.setMessage("System Ready - OpenAPI Generated!");
        response.setArchitecture("Hexagonal");
        // O setTimestamp o plugin costuma gerar como OffsetDateTime

        return ResponseEntity.ok(response);
    }
}