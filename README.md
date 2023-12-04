
# ZARA Prices API REST

## Tutorial

Mediante  esta API podremos  consultar el precio  de  un  producto a una  fecha/hora  determinada, ya  que  las  tarifas  de  precios  pueden  variar  en  cualquier  momento debido  por  ejemplo a ofertas  puntuales.

Ejemplo  de  uso:

```URL
http://servidor:puerto/Prices?applyDate=2020-06-15-10.00.00&productId=35455&brandId=1
```

Respuesta  del  servicio:

```JSON
{
"price_list": 3,
"brand_id": 1,
"start_date": "2020-06-14 22:00:00",
"end_date": "2020-06-15 09:00:00",
"product_id": 35455,
"priority": 1,
"price": 30.5,
"curr": "EUR"
}
```
Con el fin de  que  esta API sea siempre  funcional, se ha provisto  de  una  clase JUnit para  poder  verificar el correcto  funcionamiento  de  nuestra API, para  ello  bastará  con  ejecutar  la  clase `TestZaraRESTAPI` mediante JUnit.
## Metodología
Para el desarrollo  de  esta API se ha utilizado el framework SpringBoot con  las  dependencias:
- Web
- JPA
- H2

El siguiente código define un Price en nuestro sistema.

`/src/main/java/com/zara/testproject/dao/Price.java`

Esta clase Java contiene los atributos de los que se compone un Price en nuestro sistema, y mediante la anotación JPA `@Entity`  se prepara el objeto para almacenarlo mediante JPA (Java Persistence Api) [Spring Data JPA](https://spring.io/guides/gs/accessing-data-jpa/)  para manejar las interacciones con la base de datos.

Spring Data JPA repositorios son interfaces con métodos que soportan la creación, lectura, actualización y borrado de registros contra un sistema de almacenamiento. 

Spring hace que el acceso a datos sea sencillo, simplemente declarando la siguiente interfaz `PriceRepository`  automáticamente tendremos la posibilidad de 

-   Crear nuevos Prices
-   Actualizar existentens
-   Borrar Prices
-   Buscar Prices (uno, todos, o buscar por propiedades simples o complejas)

`/src/main/java/com/zara/testproject/dao/PriceRepository.java`

Una Spring Boot application es, como mínimo, a  `public static void main`  con la anotación `@SpringBootApplication`. 

`/src/main/java/com/zara/testproject/TestprojectApplication.java`

`@SpringBootApplication`  es una meta anotación que lanza **component scanning**,  **autoconfiguration**, y  **property support**. Qué básicamente levanta un Servlet que hace que esté operativa nuestra aplicación/servicio.

Una aplicación sin datos no es interesante, por lo que para las pruebas debemos precargarlos. La siguiente clases hará la carga de manera automática por Spring:

`/src/main/java/com/zara/testproject/LoadDatabase.java`

## Licencia
Este  código  es  de  uso  libre  para  cualquier fin.
## Soporte
Para  cualquier  duda o incidencia, por favor contacte  con  danieltoril@hotmail.com