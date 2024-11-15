# Álvarez Events.

![pixlr-image-generator-7b8f1e7e-6dfe-443b-a165-63cfce409867(1)](https://github.com/user-attachments/assets/792d1f88-2ab2-49d0-81d2-aa3607160e17)

# Práctica Obligatoria Tema 2
## Por Alfonso Álvarez Ocaña

## Índice
- 1.- Introducción
- 2.- Pre-requisitos
- 3.- Instalación
- 4.- Descarga del programa
- 5.- Ejecución del programa
- 6.- Menú principal
- 6.1.- Apartado a)
- 6.2.- Apartado b)
- 6.3.- Apartado c)
   

### 1. Introducción

<p>
Este programa se encarga de gestionar la venta y consulta de entradas para eventos que se realizarán en el Auditorio Municipal de Martos durante la temporada de invierno. Los eventos incluyen obras de teatro y conciertos, cada uno con precios específicos para distintas zonas (platea, butacas y anfiteatro) y descuentos por compra anticipada.</p>

### 2. Pre-requisitos
Para poder ejecutar el programa primero se deberá tener instalada la última versión del JDK, accediendo al siguiente enlace.
<p>https://www.oracle.com/cis/java/technologies/downloads/#java23</p>

<p>Se deberá elegir la opción compatible con tu dispoditivo.</p>

![image](https://github.com/user-attachments/assets/6a0e97e5-86ab-4ac6-bcd3-eb17208792f2)

### 3. Instalación
Una vez elegida la opción compatible, la descarga comenzará automaticamente, cuando se descargue, al instalarlo se deberá verificar que la ruta de instalación sea (C:\Program Files\Java) y luego continuar con los pasos que te indique el instalador.

### 4. Descarga del programa
- Para descargar el programa, accederemos al enlace proporcionado.
Para descargar el programa deberemos clicar en el menú verde que pone "Code".

![image"](https://github.com/user-attachments/assets/a3d06996-b2e0-42dd-8be8-0d5a028276d3)

Una vez abierto el menú clicaremos en la opción que pone "Download ZIP".

![image](https://github.com/user-attachments/assets/d25ac8cc-7052-4ecd-a2c3-36a4134bd207)

### 5. Ejecución del programa

Cuando se descargue, tendremos que extraer el archivo ZIP, una vez extraido, para abrir el programa, haremos doble click, en el arciho .bat.

Cuando lo abramos, saldrá una opción de Windows Defender parecida a la de la siguiente imagen.

![Captura_de_pantalla_2024-11-14_164315](https://github.com/user-attachments/assets/b7977510-d4ad-4690-af3e-84dfc4774b05)

Esto sucede ya que Windows detecta el archivo como malicioso y no permite abrirlo por seguridad.

Pulsaremos en la opción que dice "Más infromación" y clicaremos en la opción que aparecerá después que dice "Ejecutar de todas formas".

![Captura_de_pantalla_2024-11-14_164325](https://github.com/user-attachments/assets/d061ed19-a7cc-4ef6-9895-edc4ea957c8e)

### 6. Menú principal

Una vez ejecutado el programa, aparecerá el menú de la siguiente imagen.

![image](https://github.com/user-attachments/assets/81b005a9-6446-4d7e-a281-12e22e906e3a)

El menú se divide en tres apartados principales.
- El primer apartado nos llevará al menú de compra de entradas
- El segundo apartado nos llevará al menú de información de cada evento
- El tercer apartado nos llevará al menú de Administrador

## 6.1. Apartado a) 
Al acceder a este apartado se mostrará un menú que indicará a que evento queremos acceder.

![image](https://github.com/user-attachments/assets/d11a0131-8328-466b-8fd4-b11e26be3641)

El principio de funcionamiento de los apartados (1,2,3) de este menú es el mismo.

Al elegir un evento saldrá una tabla con información sobre el evento en cuestión.

![image](https://github.com/user-attachments/assets/b1822646-353e-4ccc-a006-276973094021)
<br>
(Algunos caracteres no son interpretados por el CMD de Windows)

En esta parte se pide al usuario que seleccione que tipo de entrada quiere comprar (Platea, Butaca o Anfiteatro).

Una vez elegida la opción se le pedirá al usuario que introduzca la cantidad de entradas que quiere comprar.

![image](https://github.com/user-attachments/assets/053cd3be-03d8-427a-8ada-c3b4f634c9ea)

Cuando el usuario introduzca la cantidad de entradas aparecerá una opción que preguntará si se quiere simular la decha de comnpra.

![image](https://github.com/user-attachments/assets/c4835868-71a4-4269-9365-26c3469d82ea)

Si la respuesta es "Si" se pedirá al usuario que introduzca la fecha de compra simulada.

![image](https://github.com/user-attachments/assets/9ee8b8b8-3b6c-4e00-b4af-d5c6fd31c856)

![image](https://github.com/user-attachments/assets/2932961a-ee17-403e-912f-dcc0118285f9)

Si la fecha introducida está dentro del plazo de compra anticipada (mínimo 7 días antes de que comienze el evento) se informará al cliente de que tiene un descuento (que dependerá del evento en cuestión)
del precio base de la entrada, también se le informará del precio total de las entradas y se pedirá que introduzca la cantidad de dinero con la que va a pagar.

![image](https://github.com/user-attachments/assets/3191e8af-99a3-45b8-8a7e-fb54bb80c39b)

Una vez introducido el dinero se le informará al cliente de cuantas monedas y de que tipo han sido devueltas y el cambio total.

Al pulsar "Enter" se mostrarán las entradas de una en una.

![image](https://github.com/user-attachments/assets/09e4a5f9-a519-43e9-9417-581492584832)

Dentro de la entrada se mostrará todo tipo de información, como la fecha del evento, la hora, el nombre del evento y la ubicaión.

![image](https://github.com/user-attachments/assets/4a02aa51-96e2-471e-97cf-97147e47559b)

También se muestra la información de el precio de la entrada, así como su total.

![image](https://github.com/user-attachments/assets/755f451c-4a21-4009-bbd6-91d40ebfdd48)

En el apartado "Precio entrada", primero se ve el precio base con el descuento aplicado (en caso de tenerlo) más el IVA del 10%
El total es el precio entrada + precio distr.

![image](https://github.com/user-attachments/assets/4c9d51f3-6f44-4762-8e74-db7efe64a619)

Por último cada entrada tiene un código único para evitar falsificaciones.

![image](https://github.com/user-attachments/assets/71e7b249-0266-428b-a4b2-98ed0bfe852f)

- El primer digito es un contador que aumenta cada vez que se muestra una entrada.
- Los tres siguientes son el día del año del evento.
- Los dos siguientes indican el mes del evento.
- El siguiente digito es el número de entradas que se han comprado en cada compra.
- Por último la letra indica el tipo de entrada que es (P-Platea, B-Butacas, A-Anfiteatro).

Cuando se enseñen todas las entradas el programa volverá al menú principal.

![image](https://github.com/user-attachments/assets/273fb091-538c-43af-b842-d84093488273)

### Eventos que puedan ocurrir

Puede pasar que cuando el usuario quiera comprar entradas de un tipo, estén agotadas, si es así se mostrará un mensaje.

![image](https://github.com/user-attachments/assets/be9f9e09-fe2d-442b-9eda-1fb4a35e62a5)

Puede pasar que el usuario intente comprar una cantidad mayor a la del stock de entradas, en ese caso se mostrará un mensaje.

![image](https://github.com/user-attachments/assets/60781d0a-06bc-43f8-86ce-356efc4aaf4c)

Si se introduce "No" en la opción de simular la fecha se usará la fecha actual.

![image](https://github.com/user-attachments/assets/3a67f671-01bb-46b6-ac3b-458949483aef)
![image](https://github.com/user-attachments/assets/98da870c-5981-4ebb-8b5c-2ca183a8be04)

Si el usuario introduce una cantidad menor a la del precio total saldrá un mensaje y nos mandará al menú principal.

![image](https://github.com/user-attachments/assets/521fe530-401a-4bc6-8178-947482103aa1)
![image](https://github.com/user-attachments/assets/d8235e32-e0d2-497e-8aeb-a90ceec9432b)

Si el usuario introduce una cantidad mayor a la cantidad disponible para el cambio saldrá un mensaje.

![image](https://github.com/user-attachments/assets/d02acc29-55a4-401c-a58f-6f551fa0ace3)

## 6.2. Apartado b) 
Al acceder a este apartado se mostrará un menú que indicará a que evento queremos acceder.

![image](https://github.com/user-attachments/assets/029d9137-a62e-45f9-ad19-0610793cd611)

Y como en el primer apartado nos preguntará si queremos usar el simulador de fecha.
S introducimos "Si", nos saldrá el menu para introducir la fecha manualmente y si introducimos "No" se usará la fecha actual.

La información que se muestra de cada evento es la siguiente:
![image](https://github.com/user-attachments/assets/f51215cb-4095-4ee2-8598-217e5bf18aa8)

Dependiendo de la fecha se informará si se está dentro del plazo de descuento por compra anticipada o no.

Si se han vendido entradas la información dada cambiará.

![image](https://github.com/user-attachments/assets/6ded92d0-83ae-4d6e-bcd6-69739e6463f3)

## 6.3. Apartado c) 
En este apartado primero se pedirá un usuario y una contraseña.

El usuario solo tendrá 3 intentos. 

![image](https://github.com/user-attachments/assets/24fb2eef-8ff2-4989-bab2-c71ff5b78d82)

Si el usuario supera el límite de intentos, se volverá al menú principal.

![image](https://github.com/user-attachments/assets/bf716037-da4c-4650-9c16-d348b25fc5f1)

Si se introduce como usuario "admin" y "12345" como contraseña.

![image](https://github.com/user-attachments/assets/802f0beb-0e11-4a57-a0d2-6723ccb39035)

Accederemos al menú de administrador.

![image](https://github.com/user-attachments/assets/0819d1bf-ae2f-44d0-83a5-d975d9bf79da)

Si elegimos la primera opción nos mostrará los ingresos totales por evento.

![image](https://github.com/user-attachments/assets/69cdc51b-2630-4103-9b68-7d479323765f)

Nos preguntará si queremos seguir en el menú de administrador.

![image](https://github.com/user-attachments/assets/b46a6a50-8520-4cf2-935c-2967e82067f7)

Si elegimos "No" nos llevará de vuelta al menú principal y si elegimos "Si" volveremos al menú de administrador.

Si elegimos la segunda opción nos mostrará las monedas restantes que tenemos para el cambio y la suma total de dinero para el cambio que tenemos.

![image](https://github.com/user-attachments/assets/ef4ea051-e78e-4107-939c-5cb9d958aee5)

Por último si elegimos la tercera opción cerraremos el programa.

![image](https://github.com/user-attachments/assets/07d7cf57-d6e4-4f74-8a3b-be2c3de5f71b)

Y aqui finaliza el programa.


### ¡Muchas gracias!

































































