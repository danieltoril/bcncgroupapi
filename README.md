# ZARA Prices API REST

## Tutorial

Mediante esta API podremos consultar el precio de un producto a una fecha/hora determinada, ya que las tarifas de precios pueden variar en cualquier momento
debido por ejemplo a ofertas puntuales.

Ejemplo de uso:

```URL
http://servidor:puerto/Prices?applyDate=2020-06-15-10.00.00&productId=35455&brandId=1
```

Respuesta del servicio:


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

## Licencia
Este código es de uso libre para cualquier fin.
## Soporte
Para cualquier duda o incidencia, por favor contacte con danieltoril@hotmail.com
 