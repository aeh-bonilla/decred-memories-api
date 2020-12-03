# **decred-memories-api**

## Descripción:

El aplicativo decred-memories-api obtiene información de diversas fuentes de datos con el proposito de dar una panorama
general sobre las noticias de actualidad y los eventos que estan aconteciendo en el ecosistema de decred, con esta información se espera que los usuarios finales puedan encontrar relaciones en cuanto acomo afecta el acontecer diario a
al mundo de las blockchains y en especial a decred. 

**Fuentes de datos**:

*Las fuentes de datos utilizadas por la aplicación son:*

- https://newsapi.org/ para obtener las últimas noticias del acontecer diario.
- https://coinmarketcap.com para obtener información relacionada al precio diario de las criptomonedas.
- https://dcrdata.decred.org/api/agendas para recuperar la información relacionada a las agendas de decred.
- https://dcrdata.decred.org/api/chart para recuperar información historica del precio de los tickets de decred.

**Elementos de la aplicación**:

La aplicación cuenta con los siguientes controladores:

- dcrdata-chart-controller para recuperar información del grafico de precio de tickets.
- dcrdata-agendas-controller para recuperar la información de las gendas.
- news-controller para recuperar la información de las noticias.
- symbol-price-controller para recuperar la información de los precios.
  
Adicionalmente cuenta con un modulo para inicializar una base de datos a través de docker y con ello poder implementar un mecanismo para almacenamiento local.
