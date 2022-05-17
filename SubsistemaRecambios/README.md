# [Grupo 3] Especificación API REST Recambios

## Despliegue

Para desplegar un servidor *mock* y una *UI* con docker ejecutar el siguiente comando en la raíz del proyecto:

```console
$ docker compose up
```

o

```console
$ docker-compose up
```

Para parar, presionar `Ctrl + C` en el terminal (si se ha ejecutado sin desacoplar) o  ejecutar el siguiente comando en la raíz del proyecto:

```console
$ docker compose down
```

o

```console
$ docker-compose down
```

## Swagger UI

Con los servicios desplegados, se puede acceder a una interfaz desde la que se puede revisar la especificación y realizar consultas al servidor *mock*. Se puede acceder desde el navegador en el siguiente URL: `localhost:8000`. El puerto se puede cambiar en el fichero `docker-compose.yaml`.

## Fichero `http-requests.http`

En este fichero se encuentran varias muestras del funcionamiento del servicio.
