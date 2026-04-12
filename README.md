# 🚀 RT-SB-JAVA-SAMPLES-BKND

Este repositório é um **Showcase Técnico** focado em **Arquitetura Hexagonal (Ports & Adapters)** utilizando **Java 17** e **Spring Boot 3**. O objetivo é demonstrar uma estrutura desacoplada, testável e pronta para escala industrial.

## 🏗️ Design Arquitetural
A aplicação segue os princípios da **Clean Architecture**, isolando o domínio das complexidades de infraestrutura:

*   **domain**: Regras de negócio puras e modelos (POJOs), livres de frameworks.
*   **application**: Casos de uso e as **Ports** (interfaces) que definem o contrato de entrada e saída.
*   **infrastructure**: Implementação dos **Adapters** (REST Controllers, Integrações Nativas e Configurações).

## 🛠️ Diferenciais Técnicos
*   ✅ **Contract-First:** Uso de **OpenAPI Generator** para sincronização rigorosa entre Front e Back.
*   ✅ **Integração Nativa:** Camada de infraestrutura preparada para disparar processos nativos do SO (Ex: Motores C++/Binários).
*   ✅ **Qualidade:** Estrutura pronta para **JUnit**, **Mockito** e automação de comportamento com **Cucumber (BDD)**.
