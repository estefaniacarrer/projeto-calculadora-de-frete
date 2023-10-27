utilizar a API MATRIX

MATRIX ------------------------------------------------------------------------------------------------------------
https://maps.googleapis.com/maps/api/distancematrix/json
  ?destinations=New%20York%20City%2C%20NY
  &origins=Washington%2C%20DC
  &units=imperial
  &key=YOUR_API_KEY

retorno
{
  "destination_addresses": ["New York, NY, USA"],
  "origin_addresses": ["Washington, DC, USA"],
  "rows":
    [
      {
        "elements":
          [
            {
              "distance": { "text": "228 mi", "value": 367654 },
              "duration": { "text": "3 hours 55 mins", "value": 14078 },
              "status": "OK",
            },
          ],
      },
    ],
  "status": "OK",
}

------------------------------------------------------------------------------------------------------------------


preciso de 3 telas: login, cadastro e calculo de frete (sprint 1)
preciso calcular o valor do frete baseado: distancia(api externa), tamanho, peso, tipo de envio(api propria) (sprint 1)
fazer enum de tamanho do pacote: valores definidos de altura, largura, comprimento (sprint 1)


preciso de recuperação de senha (sprint 2)
preciso de uma interface gráfica (sprint 2)



variaveis:

private String nome;
private String nomeDestinatario;
private String cepOrigem;
private String cepDestino;
private double altura;
private double comprimento;
private double largura;
private double peso;



