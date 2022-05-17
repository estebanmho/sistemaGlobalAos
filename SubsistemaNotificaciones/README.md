# API REST Taller: Notificaciones 🔔

![Logo](https://cdn.discordapp.com/attachments/687992493308117019/964896224828346439/APINotificacionesTaller.png)

Esta API es una OpenAPI 3.0 que forma parte de un sistema para la gestión de un taller mecánico, en concreto la parte encargada de las **notificaciones** enviadas a los clientes sobre el estado de su vehículo. 
Forma parte de la Práctica 1 de la asignatura Arquitectura Orientada a Servicios (AOS).



# Files 📂
Los archivos correspondientes a este servicio son: _notificaciones.yaml_, la carpeta _schemas_ compuesta por todos los esquemas utilizados. Además se incluyen los archivos necesarios para el despliegue con **Docker**.

# Funciones de la API ⚙

Esta API se compone de un único recurso que se llama **🔔Notificación**. Las notificaciones se componen por los siguientes atributos: _notificacionId, clienteId, vehiculo_ y _tipo._
- **_notificacionId_** representa el identificador único de la notificación.
- **_clienteId_** representa el identificador único de un cliente.
- **_vehiculo_** representa el código único VIN, compuesto por 17 caracteres alfanuméricos,  para la identificación del vehículo.
- **_tipo_** es un enumerado compuesto por los siguientes valores que representan el tipo de notificación o estado del vehículo:

	  - Llegada
      - Comienzo de Evaluación
      - Comienzo de Reparación
      - Imprevisto detectado
      - Reparación finalizada
      - Envío de factura
      - Otro
      - Salida
      
Las operaciones que se pueden realizar en nuestra API son: 

- _**GET** /notificacion_: para obtener TODAS las notificaciones o pasa el id de un cliente (_clienteId_) para obtener las notificaciones de ese cliente
- _**POST** /notificacion_: para crear una nueva notificación 
- _**OPTIONS** /notificacion_: que muestra las operaciones que se pueden realizar sobre este path 
- _**GET** /notificacion/{notificacionId}_: que devuelve la notificación identificada por el id dado 
- _**DELETE** /notificacion/{notificacionId}_: que borra la notificación identificada por el id dado 
- _**OPTIONS** /notificacion/{notificacionId}_: que muestra las operaciones que se pueden realizar sobre este path
 - _**PUT** /notificacion/{notificacionId}_: para modificar una notificación ya existente

## HATEOAS 💡

El path _**GET**_ _/notificacion_ puede recibir el parámetro clienteId para devolver todas las notificaciones de un único cliente. Al ser devuelta cualquier notificación, automáticamente se generará un link el cual te lleva a todas las notificaciones del mismo cliente que la notificación original. De esta manera, puedes obtener de manera sencilla todas las notificaciones que ha recibido un cliente para ver el historial de su vehículo.

## Despliegue 📦

Para realizar el despliegue simplemente hay que utilizar el fichero _**docker-compose**_ , ejecutando el comando `docker-compose up` en la propia carpeta mediante un terminal. Todo esto se debe realizar con **Docker** en ejecución.

## Autores ✏
Enrique Martín Gutiérrez
Eduardo Mena Caballero
