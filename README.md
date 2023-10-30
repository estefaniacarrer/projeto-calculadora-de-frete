# Projeto AdaTech Catalogo Filmes
Modulo 5 - Programação Web II - Spring Framework

## 🚩 Descrição: 

Calculador de Frete é uma solução de software que permite que empresas de transporte calculem facilmente a precificação de frete com base em diferentes tipos pacotes. Projetada para otimizar a logística e operações de transporte, essa API oferece uma maneira eficiente e confiável de calculo de custos, facilitando as operações diárias de transporte.

### História do usuário:
Como uma empresa de logística, precisamos de uma solução de cálculo de frete que aceite o tipo de pacote como entrada e retorne instantaneamente o custo de frete correspondente, tornando nossas operações de transporte mais ágeis.

 ## <img width="30" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">  Requisitos Técnicos:

   Java 17 ou superior
   Spring Boot</br>
   Spring Security</br>
   Model Mapper</br>
   JWT (JSON Web Tokens)</br>
   Lombok</br>
   H2 Database</br>
   Spring Validation</br>
   Springdoc OpenAPI</br>
   Google Maps Services</br>
   <i>OBS: é necessário uma API KEY do Google para o calculo do frete.</i>

## Acesso:
```
senha admin = Pr0j3t0!!
senha departamento = D3partam3nt0!*
```

## { } Exemplos json encomendas:
```
{
  "nomeRemetente": "Roberto Castro",
  "nomeDestinatario": "Sandra Santos",
  "descricao": "Livros",
  "tipoPacote": "MEDIO",
  "enderecoOrigem": {
    "logradouro": "Rua dos Cravos",
    "numero": "20",
    "cidade": "Recife",
    "estado": "PE",
    "codigoPostal": "67890-123"
  },
  "enderecoDestino": {
    "logradouro": "Avenida das Rosas",
    "numero": "10",
    "cidade": "João Pessoa",
    "estado": "PB",
    "codigoPostal": "56789-012"
  },
  "username": "tiago.santos"
}
```
```
{
  "nomeRemetente": "Lucas Oliveira",
  "nomeDestinatario": "Vinicius Santos",
  "descricao": "Roupas",
  "tipoPacote": "PEQUENO",
  "enderecoOrigem": {
    "logradouro": "Avenida das Acácias",
    "numero": "30",
    "cidade": "Natal",
    "estado": "RN",
    "codigoPostal": "12345-678"
  },
  "enderecoDestino": {
    "logradouro": "Rua das Bromélias",
    "numero": "25",
    "cidade": "João Pessoa",
    "estado": "PB",
    "codigoPostal": "23456-789"
  },
  "username": "miguel.ferreira"
}
```
```
{
  "nomeRemetente": "Carlos Santos",
  "nomeDestinatario": "Ana Lima",
  "descricao": "Roupas",
  "tipoPacote": "GRANDE",
  "enderecoOrigem": {
    "logradouro": "Rua das Margaridas",
    "numero": "30",
    "cidade": "Salvador",
    "estado": "BA",
    "codigoPostal": "02345-678"
  },
  "enderecoDestino": {
    "logradouro": "Avenida das Acácias",
    "numero": "40",
    "cidade": "Brasília",
    "estado": "DF",
    "codigoPostal": "06789-012"
  },
  "username": "carolina.sousa"
}
```
## Integrantes do grupo:

* Estefania Carrer

* Iury R

* Jefferson Sousa

* Mateus Milane


