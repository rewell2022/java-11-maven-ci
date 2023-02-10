# Formation DevOps

## Module CI (Java Maven Jenkins, Gitlab CI)

### Le But de Cette Exercice est de construire le dockerfile 

Nous avons une application Java Spring qui est pose une variable d'environement ***PORT*** 
Votre but lors de cette exercice est de mettre un dockerfile qui permet de lancer cette en donant la possibilite de changer le port de l'application au runtime.

Pour verifier que l'application fonctionne faire un Get ou via le navigateur sur l'url : ***http://localhost:8080/api/status***

### Note d'Aide 

- Maven Build Artificat avec maven installer Globalement
 
```sh
mvn clean install package -DskipTests
```
- Pourrrr build avec le maven embarque qui est la methode recommande
```sh
./mvnw clean install package -DskipTests
```
- Le Jar artifiat se trouve dans le dossier 
***target/***

## Livrable Pour cette partie 

- Creer 3 dockerfiles : 
- Le premier avec jar ***jar.Dockerfile***
- le second doit builder le jar lors de la construision de l'application ***build.Dockerfile***
- le 3 ieme doit se base sur le multi stage building ***stage.Dockerfile***
- Pousser les images crees sur docker hub. 