# MicroserviceTest


## Spring doc

### doc json

`http://localhost:8001/v3/api-docs
`

### interface gui de la doc 

`http://localhost:8001/swagger-ui/index.html
`
## Spring data rest 

### pagination 
Permet la pagination et lorsque on utilise le controlleur on peut paginé notre page de résutlat grace à :

`http://localhost:8001/comptes?pages=0&size=2`

### Projection

utilisation :

`http://localhost:8001/comptes/1?projection=comptep1`


Pour utilisé nos propre méthode 

`http://localhost:8001/comptes/search/byType?type=COURANT`

### Actuator 

Liste de tous les endpoint : 

`http://localhost:8001/actuator`

nombre de requêtes traitées par le serveur
`http://localhost:8001/actuator/metrics/http.server.requests`


### Hal Browser ce rendre sur la page par défault:
`
http://localhost:8001/`
