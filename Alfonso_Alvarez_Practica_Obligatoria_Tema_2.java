import java.util.Scanner;
import java.time.LocalDate;

public class Alfonso_Alvarez_Practica_Obligatoria_Tema_2 {
    public static void main(String[] args) {

        // Variables para la fecha
        final LocalDate fechaEvento1 = LocalDate.of(2024,11,20);
        final LocalDate fechaEvento2 = LocalDate.of(2024,11,28);
        final LocalDate fechaEvento3 = LocalDate.of(2024,12,6);

        final float descuento1 = 0.05f;
        final float descuento2 = 0.07f;
        final float descuento3 = 0.03f;

        Scanner s = new Scanner(System.in);

        // Variables para la fecha
        String resSimFecha;
        boolean simFecha;
        LocalDate fechaEvento = LocalDate.now();
        LocalDate fecha = LocalDate.now();
        int diaHoy, diaEvento, diasRestantes;

        // Variables para el primer y tercer menu
        char respuesta;
        int admin;

        // Variables para los eventos
        int resEventoA, resEventoB, resTipoEntrada = 0, entradas = 0,
                platea = 0, butacas = 0, anfiteatro = 0, cantEntradasP, cantEntradasB, cantEntradasA;
        String evento = "", ubicacion = "", hora = "22:00", resInfo = "", descuentoEntrada = "";
        int entradasPE1 = 0, entradasBE1 = 0, entradasAE1 = 0, entradasPE2 = 0, entradasBE2 = 0, entradasAE2 = 0,
                entradasPE3 = 0, entradasBE3 = 0, entradasAE3 = 0;
        int plateaE1Dispo = 140, butacaE1Dispo = 200, anfiteatroE1Dispo = 200,
                plateaE2Dispo = 140, butacaE2Dispo = 200, anfiteatroE2Dispo = 200,
                plateaE3Dispo = 140, butacaE3Dispo = 200, anfiteatroE3Dispo = 200;
        boolean evento1 = false, evento2 = false, evento3 = false;
        boolean entradaE1, entradaE2, entradaE3, stockDispo,
                agotadasP, agotadasB, agotadasA;

        // Variables para cambio de monedas
        float dineroCliente, cambio;
        int bill50 = 80, bill20 = 75, bill10 = 100, bill5 = 100, moneda2 = 250, moneda1 = 250, cent50 = 500,
                cent20 = 500, cent10 = 500, cent5 = 500, cent2 = 200, cent1 = 100;
        int contBill50 = 0, contBill20 = 0, contBill10 = 0, contBill5 = 0, contMoneda2 = 0, contMoneda1 = 0,
                contCent50 = 0, contCent20 = 0, contCent10 = 0, contCent5 = 0, contCent2 = 0, contCent1 = 0;

        // Variables para la venta de entradas
        float totalIngresosCria = 0, totalIngresosOto = 0, totalIngresosJazz = 0, resultadoIva, iva = 10;
        float totalPrecioE, precioUbi = 0, total, totalEntradas, totalIndividual, precioDistr = 4.13f, precioDistrIVA, descuento = 0, auxDescuento,
                totalDispo;
        int cont = 0;

        // Variables booleanas
        boolean bloqueo, logueado, encendido = true, pago = true;



        // COMIENZO DEL PROGRAMA

        // Pregunto al cliente y valido la respuesta
        do {
            // Calculo el total de dinero restante para el cambio
            totalDispo = ((bill50 - contBill50) * 50f) + ((bill20 - contBill20) * 20f) + ((bill10 - contBill10) * 10f)
                    + ((bill5 - contBill5) * 5f) + ((moneda2 - contMoneda2) * 2f)
                    + (moneda1 - contMoneda1) + ((cent50 - contCent50) * 0.5f) + ((cent20 - contCent20) * 0.2f) + ((cent10 - contCent10) * 0.1f)
                    + ((cent5 - contCent5) * 0.05f) + ((cent2 - contCent2) * 0.02f) + ((cent1 - contCent1) * 0.01f);

            // Asigno las banderas a false en caso de que cambien
            entradaE1 = false;
            entradaE2 = false;
            entradaE3 = false;
            agotadasP = false;
            agotadasB = false;
            agotadasA = false;
            entradaE1 = false;
            entradaE2 = false;
            entradaE3 = false;
            pago = true;
            bloqueo = false;

            System.out.print("""
                    ╔═══════════════════════════════════════╗
                    ║ a.- Comprar entradas para un evento.  ║
                    ║ b.- Consultar el estado de un evento. ║
                    ║ c.- Menú de administrador.            ║
                    ╚═══════════════════════════════════════╝
                    
                    Seleccione una opción indicando el apartado al que se quiere dirigir:\s""");
            respuesta = s.nextLine().toLowerCase().charAt(0);

            // Limpio la pantalla
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }

            switch (respuesta) {
                case 'a': // Menu de compra de entradas
                    if (totalDispo > 0) {
                        // Pido datos y los valido
                        do {
                            System.out.print("""
                                        ╔════════════════════════════╗
                                        ║ 1.- Las criadas.           ║
                                        ║ 2.- II Concierto de Otoño. ║
                                        ║ 3.- Concierto de Jazz.     ║
                                        ╚════════════════════════════╝
                                        
                                        Seleccione el evento al que quiere asistir indicando su número:\s""");
                            resEventoA = Integer.parseInt(s.nextLine());
                            // Limpio la pantalla
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }
                            if (resEventoA < 1 || resEventoA > 3) {
                                System.out.println("Datos introducidos incorrectamente");
                                System.out.println("══════════════════════════════════\n");
                            }
                        } while (resEventoA < 1 || resEventoA > 3);

                        switch (resEventoA) {
                            case 1: // Evento Las criadas
                                // Doy valor a las variables
                                evento2 = false;
                                evento3 = false;
                                evento1 = true;
                                entradaE1 = true;
                                // Pido datos y los valido
                                do {
                                    System.out.print("""
                                                ╔═════════════╦════════════╦═══════════╗
                                                ║ Evento      ║ Fecha      ║ Descuento ║
                                                ╠═════════════╬════════════╬═══════════╣
                                                ║ Las criadas ║ 20/11/2024 ║     5%    ║
                                                ╚═════════════╩════════════╩═══════════╝
                                                ╔═════════════╦════════════╦═══════════╗
                                                ║ Número      ║ Tipo       ║ Precio    ║
                                                ╠═════════════╬════════════╬═══════════╣
                                                ║ 1.          ║ Platea     ║    17€    ║
                                                ║ 2.          ║ Butacas    ║    20€    ║
                                                ║ 3.          ║ Anfiteatro ║    13€    ║
                                                ╚═════════════╩════════════╩═══════════╝
                                                
                                                Seleccione el tipo de entrada indicando su número:\s""");
                                    resTipoEntrada = Integer.parseInt(s.nextLine());
                                    // Limpio la pantalla
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                    if (resTipoEntrada < 1 || resTipoEntrada > 3) {
                                        System.out.println("Datos introducidos incorrectamente");
                                        System.out.println("══════════════════════════════════\n");
                                    }
                                } while (resTipoEntrada < 1 || resTipoEntrada > 3);

                                // Doy valor a las variables para mostrarlas en la entrada
                                descuentoEntrada = "5%";
                                descuento = descuento1;
                                fechaEvento = fechaEvento1;
                                platea = 17;
                                butacas = 20;
                                anfiteatro = 13;
                                evento = "Las criadas          ";
                                break;

                            case 2: // Evento II Concierto de Otoño
                                // Doy valor a las variables
                                evento1 = false;
                                evento3 = false;
                                evento2 = true;
                                entradaE2 = true;
                                // Pido datos y los valido
                                do {
                                    System.out.print("""
                                                ╔══════════════╦════════════╦═══════════╗
                                                ║ Evento       ║ Fecha      ║ Descuento ║
                                                ╠══════════════╬════════════╬═══════════╣
                                                ║ II Concierto ║ 28/11/2024 ║     7%    ║
                                                ║   de Otoño   ║            ║           ║
                                                ╚══════════════╩════════════╩═══════════╝
                                                ╔══════════════╦════════════╦═══════════╗
                                                ║ Número       ║ Tipo       ║ Precio    ║
                                                ╠══════════════╬════════════╬═══════════╣
                                                ║ 1.           ║ Platea     ║    12€    ║
                                                ║ 2.           ║ Butacas    ║    15€    ║
                                                ║ 3.           ║ Anfiteatro ║     8€    ║
                                                ╚══════════════╩════════════╩═══════════╝
                                                
                                                Seleccione el tipo de entrada indicando su número:\s""");
                                    resTipoEntrada = Integer.parseInt(s.nextLine());
                                    // Limpio la pantalla
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                    if (resTipoEntrada < 1 || resTipoEntrada > 3) {
                                        System.out.println("Datos introducidos incorrectamente");
                                        System.out.println("══════════════════════════════════\n");
                                    }
                                } while (resTipoEntrada < 1 || resTipoEntrada > 3);

                                // Doy valor a las variables para mostrarlas en la entrada
                                descuentoEntrada = "7%";
                                descuento = descuento2;
                                fechaEvento = fechaEvento2;
                                platea = 12;
                                butacas = 15;
                                anfiteatro = 8;
                                evento = "II Concierto de Otoño";
                                break;

                            case 3: // Evento Concierto de Jazz
                                // Doy valor a las variables
                                evento1 = false;
                                evento2 = false;
                                evento3 = true;
                                entradaE3 = true;
                                // Pido datos y los valido
                                do {
                                    System.out.print("""
                                                ╔══════════════╦════════════╦═══════════╗
                                                ║    Evento    ║   Fecha    ║ Descuento ║
                                                ╠══════════════╬════════════╬═══════════╣
                                                ║ Concierto de ║ 06/12/2024 ║     3%    ║
                                                ║     Jazz     ║            ║           ║
                                                ╚══════════════╩════════════╩═══════════╝
                                                ╔══════════════╦════════════╦═══════════╗
                                                ║ Número       ║ Tipo       ║ Precio    ║
                                                ╠══════════════╬════════════╬═══════════╣
                                                ║ 1.           ║ Platea     ║    20€    ║
                                                ║ 2.           ║ Butacas    ║    25€    ║
                                                ║ 3.           ║ Anfiteatro ║    15€    ║
                                                ╚══════════════╩════════════╩═══════════╝
                                                
                                                Seleccione el tipo de entrada indicando su número:\s""");
                                    resTipoEntrada = Integer.parseInt(s.nextLine());
                                    // Limpio la pantalla
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                    if (resTipoEntrada < 1 || resTipoEntrada > 3) {
                                        System.out.println("Datos introducidos incorrectamente");
                                        System.out.println("══════════════════════════════════\n");
                                    }
                                } while (resTipoEntrada < 1 || resTipoEntrada > 3);

                                // Doy valor a las variables para mostrarlas en la entrada
                                descuentoEntrada = "3%";
                                descuento = descuento3;
                                fechaEvento = fechaEvento3;
                                platea = 20;
                                butacas = 25;
                                anfiteatro = 15;
                                evento = "Concierto de Jazz    ";
                                break;

                            default:
                               // Limpio la pantalla
                               for (int i = 0; i < 100; i++) {
                                    System.out.println();
                               }
                               System.out.println("Datos introducidos incorrectamente");
                               System.out.println("══════════════════════════════════\n");
                        }

                        // Pregunto que tipo de entrada quiere el cliente
                        switch (resTipoEntrada) {
                            case 1: // Comprar entradas platea
                                if ((entradasPE1 >= 140 && entradaE1) || (entradasPE2 >= 140 && entradaE2) || (entradasPE3 >= 140 && entradaE3)) {
                                    System.out.println("No es posible comprar entradas, están agotadas");
                                    agotadasP = true;
                                } else {
                                    precioUbi = platea;
                                    ubicacion = "Platea    ";
                                    do { // Pido datos los valido
                                        stockDispo = true;
                                        System.out.print("¿Cuantas entradas quieres comprar para la platea?: ");
                                        cantEntradasP = Integer.parseInt(s.nextLine());
                                        if ((cantEntradasP + entradasPE1 > 140 && entradaE1) || (cantEntradasP + entradasPE2 > 140 && entradaE2) || (cantEntradasP + entradasPE3 > 140 && entradaE3)) {
                                            System.out.println("La cantidad de entradas a comprar supera el límite de stock de entradas.");
                                            stockDispo = false;
                                        } else {
                                            entradas = cantEntradasP;
                                            if (entradaE1) entradasPE1 += cantEntradasP;
                                            if (entradaE2) entradasPE2 += cantEntradasP;
                                            if (entradaE3) entradasPE3 += cantEntradasP;
                                            // Limpio la pantalla
                                            for (int i = 0; i < 100; i++) {
                                                System.out.println();
                                            }
                                            if (cantEntradasP < 0 || cantEntradasP > 140) {
                                                System.out.println("Error, datos introducidos fuera de rango.");
                                                System.out.println("═════════════════════════════════════════\n");
                                            }
                                        }
                                    } while (cantEntradasP < 0 || cantEntradasP > 140 || !stockDispo);
                                }

                                break;
                            case 2: // Comprar entradas butacas
                                if ((entradasBE1 >= 200 && entradaE1) || (entradasBE2 >= 200 && entradaE2) || (entradasBE3 >= 200 && entradaE3)) {
                                    System.out.println("No es posible comprar entradas, están agotadas");
                                    agotadasB = true;
                                } else {
                                    precioUbi = butacas;
                                    ubicacion = "Butacas   ";
                                    do { // Pido datos y los valido
                                        stockDispo = true;
                                        System.out.print("¿Cuantas entradas quieres comprar para la zona de butacas?: ");
                                        cantEntradasB = Integer.parseInt(s.nextLine());
                                        if ((cantEntradasB + entradasBE1 > 200 && entradaE1) || (cantEntradasB + entradasBE2 > 200 && entradaE2) || (cantEntradasB + entradasBE3 > 200 && entradaE3)) {
                                            System.out.println("La cantidad de entradas a comprar supera el límite de stock de entradas.");
                                            stockDispo = false;
                                        } else {
                                            entradas = cantEntradasB;
                                            if (entradaE1) entradasBE1 += cantEntradasB;
                                            if (entradaE2) entradasBE2 += cantEntradasB;
                                            if (entradaE3) entradasBE3 += cantEntradasB;
                                            // Limpio la pantalla
                                            for (int i = 0; i < 100; i++) {
                                                System.out.println();
                                            }
                                            if (cantEntradasB < 0 || cantEntradasB > 200) {
                                                System.out.println("Error, datos introducidos fuera de rango.");
                                                System.out.println("═════════════════════════════════════════\n");
                                            }
                                        }
                                    } while (cantEntradasB < 0 || cantEntradasB > 200 || !stockDispo);
                                }

                                break;
                            case 3: // Comprar entradas anfiteatro
                                if ((entradasAE1 >= 200 && entradaE1) || (entradasAE2 >= 200 && entradaE2) || (entradasAE3 >= 200 && entradaE3)) {
                                    System.out.println("No es posible comprar entradas, están agotadas");
                                    agotadasA = true;
                                } else {
                                    precioUbi = anfiteatro;
                                    ubicacion = "Anfiteatro";
                                    do { // Pido datos y los valido
                                        stockDispo = true;
                                        System.out.print("¿Cuantas entradas quieres comprar para el anfiteatro?: ");
                                        cantEntradasA = Integer.parseInt(s.nextLine());
                                        if ((cantEntradasA + entradasAE1 > 200 && entradaE1) || (cantEntradasA + entradasAE2 > 200 && entradaE2) || (cantEntradasA + entradasAE3 > 200 && entradaE3)) {
                                            System.out.println("La cantidad de entradas a comprar supera el límite de stock de entradas.");
                                            stockDispo = false;
                                        } else {
                                            entradas = cantEntradasA;
                                            if (entradaE1) entradasAE1 += cantEntradasA;
                                            if (entradaE2) entradasAE2 += cantEntradasA;
                                            if (entradaE3) entradasAE3 += cantEntradasA;
                                            // Limpio la pantalla
                                            for (int i = 0; i < 100; i++) {
                                                System.out.println();
                                            }
                                            if (cantEntradasA < 0 || cantEntradasA > 200) {
                                                System.out.println("Error, datos introducidos fuera de rango.");
                                                System.out.println("═════════════════════════════════════════\n");
                                            }
                                        }
                                    } while (cantEntradasA < 0 || cantEntradasA > 200 || !stockDispo);
                                }
                            break;
                        }
                        // TODO mirar este if
                        if (agotadasP || agotadasB || agotadasA) {
                            System.out.print("Volviendo al menú principal, pulsa 'Enter' para continuar: ");
                            s.nextLine();
                        } else { // Pregunto si se quiere usar el simulador de fecha
                            do {
                                System.out.print("¿Quieres simular la fecha de compra? (SI/NO): ");
                                resSimFecha = s.nextLine().toUpperCase();
                                if (resSimFecha.equals("SI")) simFecha = true;
                                else {
                                    simFecha = false;
                                    fecha = LocalDate.now();
                                }
                            } while (!resSimFecha.equals("SI") && !resSimFecha.equals("NO"));
                            // Limpio la pantalla
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }

                            // Suponiendo que el cliente tiene neuronas no lo valido :)
                            if (simFecha) {
                                System.out.print("Introduce la fecha de compra (yyyy-MM-dd): ");
                                fecha = LocalDate.parse(s.nextLine());
                            }
                            if (fecha.isBefore(fechaEvento.minusDays(7))) {
                                System.out.printf("¡Se te aplicará un descuento del %s en el precio base de cada entrada!\n", descuentoEntrada);
                                auxDescuento = precioUbi * descuento;
                                precioUbi = precioUbi - auxDescuento;
                            } else {
                                System.out.println("No se te aplicará descuento debido a que la compra está fuera del plazo");
                                descuentoEntrada = "No";
                            }


                            // Calculo las variables a mostrar
                            precioDistrIVA = (precioDistr * 0.21f) + precioDistr;
                            resultadoIva = (iva * precioUbi) / 100;
                            totalPrecioE = precioUbi + resultadoIva;
                            total = totalPrecioE;
                            totalIndividual = total + precioDistrIVA;
                            totalEntradas = (total + precioDistrIVA) * entradas;

                            // Doy el total de todas las entradas
                            System.out.printf("El total de todas las entradas es de: (%.2f + %.2f) * %d = %.2f€\n", total, precioDistrIVA, entradas, totalEntradas);

                            // Pregunto por la cantidad que va a pagar el clente
                            do {
                                System.out.print("Introduce la cantidad de dinero con la que va a pagar: ");
                                dineroCliente = Float.parseFloat(s.nextLine());
                                cambio = dineroCliente - totalEntradas;
                                if (totalDispo < dineroCliente)
                                    System.out.println("Lo sentimos, no tenemos suficiente cambio para darte");
                            } while (totalDispo < dineroCliente);

                            // Aqui doy el cambio al cliente
                            do {
                                if (dineroCliente < totalEntradas) {
                                    pago = false;
                                } else {
                                    if ((cambio >= 50) && (bill50 > 0)) {
                                        cambio -= 50;
                                        contBill50++;
                                        bill50--;

                                    } else {
                                        if ((cambio >= 20) && (bill20 > 0)) {
                                            cambio -= 20;
                                            contBill20++;
                                            bill20--;

                                        } else {
                                            if ((cambio >= 10) && (bill10 > 0)) {
                                                cambio -= 10;
                                                contBill10++;
                                                bill10--;

                                            } else {
                                                if ((cambio >= 5) && (bill5 > 0)) {
                                                    cambio -= 5;
                                                    contBill5++;
                                                    bill5--;

                                                } else {
                                                    if ((cambio >= 2) && (moneda2 > 0)) {
                                                        cambio -= 2;
                                                        contMoneda2++;
                                                        moneda2--;

                                                    } else {
                                                        if ((cambio >= 1) && (moneda1 > 0)) {
                                                            cambio -= 1;
                                                            contMoneda1++;
                                                            moneda1--;

                                                        } else {
                                                            if ((cambio >= 0.5) && (cent50 > 0)) {
                                                                cambio -= 0.5f;
                                                                contCent50++;
                                                                cent50--;

                                                            } else {
                                                                if ((cambio >= 0.2) && (cent20 > 0)) {
                                                                    cambio -= 0.2f;
                                                                    contCent20++;
                                                                    cent20--;

                                                                } else {
                                                                    if ((cambio >= 0.1) && (cent10 > 0)) {
                                                                        cambio -= 0.1f;
                                                                        contCent10++;
                                                                        cent10--;

                                                                    } else {
                                                                        if ((cambio >= 0.05) && (cent5 > 0)) {
                                                                            cambio -= 0.05f;
                                                                            contCent5++;
                                                                            cent5--;

                                                                        } else {
                                                                            if ((cambio >= 0.02) && (cent2 > 0)) {
                                                                                cambio -= 0.02f;
                                                                                contCent2++;
                                                                                cent2--;

                                                                            } else {
                                                                                if ((cambio >= 0.01) && (cent1 > 0)) {
                                                                                    cambio -= 0.01f;
                                                                                    contCent1++;
                                                                                    cent1--;

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } while (cambio > 0.01);

                            // Guardo el pago para mostrar el total de las ganancias por evento
                            if (evento1 && !evento2 && !evento3) totalIngresosCria += totalEntradas;
                            if (evento2 && !evento1 && !evento3) totalIngresosOto += totalEntradas;
                            if (evento3 && !evento1 && !evento2) totalIngresosJazz += totalEntradas;

                            // Digo el numero de monedas que devuelvo de cada tipo
                            if (pago) {
                                if (contBill50 > 0) System.out.printf("Billetes de 50€ devueltos.   --> %d\n", contBill50);
                                if (contBill20 > 0) System.out.printf("Billetes de 20€ devueltos.   --> %d\n", contBill20);
                                if (contBill10 > 0) System.out.printf("Billetes de 10€ devueltos.   --> %d\n", contBill10);
                                if (contBill5 > 0) System.out.printf("Billetes de 5€ devueltos.    --> %d\n", contBill5);
                                if (contMoneda2 > 0) System.out.printf("Monedas de 2€ devueltas.     --> %d\n", contMoneda2);
                                if (contMoneda1 > 0) System.out.printf("Monedas de 1€ devueltas.     --> %d\n", contMoneda1);
                                if (contCent50 > 0) System.out.printf("Monedas de 0.50€ devueltas.  --> %d\n", contCent50);
                                if (contCent20 > 0) System.out.printf("Monedas de 0.20€ devueltas.  --> %d\n", contCent20);
                                if (contCent10 > 0) System.out.printf("Monedas de 0.10€ devueltas.  --> %d\n", contCent10);
                                if (contCent5 > 0) System.out.printf("Monedas de 0.05€ devueltas.  --> %d\n", contCent5);
                                if (contCent2 > 0) System.out.printf("Monedas de 0.02€ devueltas.  --> %d\n", contCent2);
                                if (contCent1 > 0) System.out.printf("Monedas de 0.01€ devueltas.  --> %d\n", contCent1);
                            }


                            // Devuelvo el valor a cambio y lo saco por pantalla
                            if (pago) {
                                cambio = dineroCliente - totalEntradas;
                                System.out.printf("El cambio es de: %.2f€\n", cambio);
                                System.out.print("Pulsa 'Enter' para ver las entradas");
                                s.nextLine();
                            }


                            // Enseño las entradas
                            if (pago) {
                                for (int i = 0; i < entradas; i++) {
                                    cont++;
                                    String codigo = cont + String.valueOf(fechaEvento.getDayOfYear()) + (fechaEvento.getMonthValue()) + entradas + (ubicacion.charAt(0));
                                    System.out.println("Entrada " + (i + 1) + " de " + entradas);
                                    System.out.printf("""
                                                ╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗
                                                ║     __  ___                __                 __   __                               ___    __                      ║
                                                ║    /  |/  /___ ____  _____/ /__________     _/_/  / /   ______ _________  ____     /   |  / /___  ____  _________  ║
                                                ║   / /|_/ / __ `/ _ \\/ ___/ __/ ___/ __ \\   / _ | / / | / / __ `/ ___/ _ \\/_  /    / /| | / / __ \\/ __ \\/ ___/ __ \\ ║
                                                ║  / /  / / /_/ /  __(__  ) /_/ /  / /_/ /  / __ |/ /| |/ / /_/ / /  /  __/ / /_   / ___ |/ / /_/ / / / (__  ) /_/ / ║
                                                ║ /_/  /_/\\__,_/\\___/____/\\__/_/   \\____/  /_/ |_/_/ |___/\\__,_/_/   \\___/ /___/  /_/  |_/_/\\____/_/ /_/____/\\____/  ║
                                                ║                                                                                                                    ║
                                                ╠════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣
                                                ║ Fecha: %s               Hora: %s             Dirección: Parque Manuel Carrasco, s/n, 23600 Martos, Jaén
                                                ║ Evento: %s   Ubicación: %s                                      Empresa: Álvarez Events
                                                ║ Precio Entrada: %.2f€ + IVA %s%%: %.2f€ = %.2f€      Descuento: %s      %s
                                                ║ Precio Distr: 4,13€ + IVA 21%%: 0,87€ = 5,00€                                                       TOTAL: %.2f€
                                                ╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝
                                                """, fechaEvento, hora, evento, ubicacion, precioUbi, iva, resultadoIva, totalPrecioE, descuentoEntrada, codigo, totalIndividual);
                                    System.out.println("Pulsa 'Enter' para continuar");
                                    s.nextLine();
                                }
                                System.out.println("\n ¡¡GRACIAS POR SU COMPRA, VUELVA PRONTO!!\n");
                                System.out.print("Pulse 'Enter' para volver al menú principal");
                                s.nextLine();

                            }
                             // limpio pantalla
                             for (int i = 0; i < 100; i++) {
                                  System.out.println();
                             }
                             if (!pago) System.out.println("Debes introducir una cantidad mayor o igual al total a pagar");
                        }
                    } else { System.out.println("Lo sentimos nos hemos quedado sin fondos para el cambio");
                        System.out.print("Pulsa 'Enter' para continuar");
                        s.nextLine();
                        // Limpio la pantalla
                        for (int i = 0; i < 100; i++) {
                            System.out.println();
                        }
                    }
                    break;

                case 'b': // Muestra informacion de cada evento
                    do {
                        do {
                            System.out.print("""
                         ╔════════════════════════════╗
                         ║ 1.- Las criadas.           ║
                         ║ 2.- II Concierto de Otoño. ║
                         ║ 3.- Concierto de Jazz.     ║
                         ╚════════════════════════════╝
                         
                         Seleccione el evento al que quiere acceder indicando su apartado (1,2,3):\s""");
                            resEventoB = Integer.parseInt(s.nextLine());
                        } while (resEventoB < 1 || resEventoB > 3 );

                        do {
                            System.out.print("\n¿Quieres simular la fecha de compra? (SI/NO): ");
                            resSimFecha = s.nextLine().toUpperCase();
                            if (resSimFecha.equals("SI")) simFecha = true;
                            else {
                                simFecha = false;
                                fecha = LocalDate.now();
                            }
                        } while (!resSimFecha.equals("SI") && !resSimFecha.equals("NO"));

                        if (simFecha) {
                            System.out.print("\nIntroduce la fecha deseada (yyyy-MM-dd): ");
                            fecha = LocalDate.parse(s.nextLine());
                        }
                        // Limpio la pantalla
                        for (int i = 0; i < 100; i++) {
                            System.out.println();
                        }
                        switch (resEventoB) {
                            case 1: // Mostramos informacion del primer evento
                                if (entradasPE1 > 0 || entradasBE1 > 0 || entradasAE1 > 0)
                                    evento1 = true;
                                if (fecha.isBefore(fechaEvento1)) {
                                    diaHoy = fecha.getDayOfYear();
                                    diaEvento = fechaEvento1.getDayOfYear();
                                    diasRestantes = diaEvento - diaHoy;
                                    System.out.printf("\nLa fecha del evento es: %s. Días restantes para el evento: %d\n", fechaEvento1, diasRestantes);
                                    if (fecha.isBefore(fechaEvento1.minusDays(7)))
                                        System.out.println("\n¡Estás en el peridodo de descuento por compra anticipada!\n");
                                    else System.out.println("\n¡No estás dentro del plazo de compra anticipada!\n");
                                }
                                if (fecha.equals(fechaEvento1)) System.out.println("\n¡El evento es hoy!\n");
                                if (fecha.isAfter(fechaEvento1)) System.out.println("\nEl evento ya ha finalizado\n");
                                if (evento1) {
                                    System.out.printf("Se han vendido %d entradas para Platea. Entradas restantes: %d\n",     entradasPE1, (plateaE1Dispo - entradasPE1));
                                    System.out.printf("Se han vendido %d entradas para Butacas. Entradas restantes: %d\n",    entradasBE1, (butacaE1Dispo - entradasBE1));
                                    System.out.printf("Se han vendido %d entradas para Anfiteatro. Entradas restantes: %d\n", entradasAE1, (anfiteatroE1Dispo - entradasAE1));
                                } else {
                                    System.out.printf("Todavia no se han vendido entradas para Platea.     Total: %d\n", plateaE1Dispo);
                                    System.out.printf("Todavia no se han vendido entradas para Butacas.    Total: %d\n", butacaE1Dispo);
                                    System.out.printf("Todavia no se han vendido entradas para Anfiteatro. Total: %d\n", anfiteatroE1Dispo);
                                }
                                break;
                            case 2: // Mostramos informacion del segundo evento
                                if (entradasPE2 > 0 || entradasBE2 > 0 || entradasAE2 > 0)
                                    evento2 = true;
                                if (fecha.isBefore(fechaEvento2)) {
                                    diaHoy = fecha.getDayOfYear();
                                    diaEvento = fechaEvento2.getDayOfYear();
                                    diasRestantes = diaEvento - diaHoy;
                                    System.out.printf("\nLa fecha del evento es: %s. Días restantes para el evento: %d\n", fechaEvento2, diasRestantes);
                                    if (fecha.isBefore(fechaEvento2.minusDays(7)))
                                        System.out.println("\n¡Estás en el peridodo de descuento por compra anticipada!\n");
                                    else System.out.println("\nNo estás dentro del plazo de compra anticipada\n");
                                }
                                if (fecha.equals(fechaEvento2)) System.out.println("\n¡El evento es hoy!\n");
                                if (fecha.isAfter(fechaEvento2)) System.out.println("\nEl evento ya ha finalizado\n");
                                if (evento2) {
                                    System.out.printf("Se han vendido %d entradas para Platea. Entradas restantes: %d\n",     entradasPE2, (plateaE2Dispo - entradasPE2));
                                    System.out.printf("Se han vendido %d entradas para Butacas. Entradas restantes: %d\n",    entradasBE2, (butacaE2Dispo - entradasBE2));
                                    System.out.printf("Se han vendido %d entradas para Anfiteatro. Entradas restantes: %d\n", entradasAE2, (anfiteatroE2Dispo - entradasAE2));
                                } else {
                                    System.out.printf("Todavia no se han vendido entradas para Platea.     Total: %d\n", plateaE2Dispo);
                                    System.out.printf("Todavia no se han vendido entradas para Butacas.    Total: %d\n", butacaE2Dispo);
                                    System.out.printf("Todavia no se han vendido entradas para Anfiteatro. Total: %d\n", anfiteatroE2Dispo);
                                }
                                break;
                            case 3: // Mostramos informacion del tercer evento
                                if (entradasPE3 > 0 || entradasBE3 > 0 || entradasAE3 > 0)
                                    evento3 = true;
                                if (fecha.isBefore(fechaEvento3)) {
                                    diaHoy = fecha.getDayOfYear();
                                    diaEvento = fechaEvento3.getDayOfYear();
                                    diasRestantes = diaEvento - diaHoy;
                                    System.out.printf("\nLa fecha del evento es: %s. Días restantes para el evento: %d\n", fechaEvento3, diasRestantes);
                                    if (fecha.isBefore(fechaEvento3.minusDays(7)))
                                        System.out.println("\n¡Estás en el peridodo de descuento por compra anticipada!\n");
                                    else System.out.println("\nNo estás dentro del plazo de compra anticipada\n");
                                }
                                if (fecha.equals(fechaEvento3)) System.out.println("\n¡El evento es hoy!\n");
                                if (fecha.isAfter(fechaEvento3)) System.out.println("\nEl evento ya ha finalizado\n");
                                if (evento3) {
                                    System.out.printf("Se han vendido %d entradas para Platea. Entradas restantes: %d\n",     entradasPE3, (plateaE3Dispo - entradasPE3));
                                    System.out.printf("Se han vendido %d entradas para Butacas. Entradas restantes: %d\n",    entradasBE3, (butacaE3Dispo - entradasBE3));
                                    System.out.printf("Se han vendido %d entradas para Anfiteatro. Entradas restantes: %d\n", entradasAE3, (anfiteatroE3Dispo - entradasAE3));
                                } else {
                                    System.out.printf("Todavia no se han vendido entradas para Platea.     Total: %d\n", plateaE3Dispo);
                                    System.out.printf("Todavia no se han vendido entradas para Butacas.    Total: %d\n", butacaE3Dispo);
                                    System.out.printf("Todavia no se han vendido entradas para Anfiteatro. Total: %d\n", anfiteatroE3Dispo);
                                }
                                break;
                        }
                        do {
                            System.out.print("\n¿Quieres saber información de otro evento? (SI/NO): ");
                            resInfo = s.nextLine().toUpperCase();
                            if (!resInfo.equals("SI") && !resInfo.equals("NO")) System.out.println("\nERROR, Debes introducir 'SI' o 'NO'\n");
                            else {
                                // Limpio la pantalla
                                for (int i = 0; i < 100; i++) {
                                    System.out.println();
                                }
                            }
                        } while (!resInfo.equals("SI") && !resInfo.equals("NO"));
                    } while (resInfo.equals("SI"));
                    System.out.print("\nPulse 'Enter' para volver al menú principal");
                    s.nextLine();
                    // Limpio la pantalla
                    for (int i = 0; i < 100; i++) {
                        System.out.println();
                    }
                    break;

                case 'c':
                    // Devuelvo el valor a las variables
                    logueado = false;
                    int intentos = 2;
                    // Loguin administrador
                    do {
                        System.out.print("\nUsuario: ");
                        String user = s.nextLine();
                        System.out.print("Contraseña: ");
                        String pass = s.nextLine();
                        if (user.equals("admin") && pass.equals("12345")) {
                            // Limpio la pantalla
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }
                            System.out.println("\n¡Bienvenido!\n");
                            logueado = true;
                        } else if (intentos != 0) {
                            System.out.println("\nUsuario y/o contraseña incorrectos");
                            System.out.println("Intentos restantes: " + (intentos--));
                        } else bloqueo = true;
                    } while (!bloqueo && !logueado);

                    if (bloqueo) {
                        for (int i = 0; i < 100; i++) {
                            System.out.println();
                        }
                        System.out.println("¡Has fallado 3 veces!, Volviendo al menú inicial.");
                        System.out.println("═════════════════════════════════════════════════\n");
                        // Limpio la pantalla

                    } else {
                        do {
                            System.out.print("""
                                    ╔═════════════════════════════════════════════════════╗
                                    ║ 1.- Consultar los ingresos totales por evento.      ║
                                    ║ 2.- Consultar las monedas restantes para el cambio. ║
                                    ║ 3.- Apagar el software.                             ║
                                    ╚═════════════════════════════════════════════════════╝
                                    
                                    Seleccione una opción indicando su apartado (1,2,3):\s""");
                            admin = Integer.parseInt(s.nextLine());
                            // Limpio la pantalla
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }

                            switch (admin) {
                                case 1: // Se muestran los ingresos totales del evento
                                    System.out.println("INGRESOS TOTALES");
                                    System.out.printf("Ingresos totales de Las Criadas: %.2f euros\n", totalIngresosCria);
                                    System.out.printf("Ingresos totales de II Concierto de Otoño: %.2f euros\n", totalIngresosOto);
                                    System.out.printf("Ingresos totales de Concierto de Jazz: %.2f euros\n", totalIngresosJazz);
                                    System.out.print("\nPulsa 'Enter' para continuar");
                                    s.nextLine();
                                    // limpio pantalla
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case 2: // Se consultan las monedas restantes y la cantidad total de dinero disponible
                                    // Sumo el total de los billetes restantes
                                    System.out.printf("""
                                            Billetes de 50 euros:   %d
                                            Billetes de 20 euros:   %d
                                            Billetes de 10 euros:   %d
                                            Billetes de 5 euros:    %d
                                            Monedas de 2 euros:     %d
                                            Monedas de 1 euro:      %d
                                            Monedas de 50 céntimos: %d
                                            Monedas de 20 céntimos: %d
                                            Monedas de 10 céntimos: %d
                                            Monedas de 5 céntimos:  %d
                                            Monedas de 2 céntimos:  %d
                                            Monedas de 1 céntimos:  %d
                                            
                                            El total disponible de dinero es de: %.2f euros.
                                            """, bill50, bill20, bill10, bill5, moneda2, moneda1, cent50, cent20, cent10, cent5, cent2, cent1, totalDispo);
                                    System.out.print("\nPulsa 'Enter' para continuar");
                                    s.nextLine();
                                    // limpio pantalla
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                    break;

                                case 3: // Apagar el software
                                    encendido = false;
                                    break;
                                default:
                                    System.out.println("Datos introducidos incorrectamente");
                                    System.out.println("══════════════════════════════════\n");

                            }
                            if (!encendido) {
                                System.out.print("\nPulse 'Enter' para apagar el programa");
                                s.nextLine();
                            } else {
                                do {
                                    System.out.print("\n¿Quieres realizar otra acción en el menú de admnistrador? (SI/NO): ");
                                    resInfo = s.nextLine().toUpperCase();
                                    if (!resInfo.equals("SI") && !resInfo.equals("NO"))
                                        System.out.println("Debes introducir 'SI' o 'NO'");
                                    else {
                                        // Limpio la pantalla
                                        for (int i = 0; i < 100; i++) {
                                            System.out.println();
                                        }
                                    }
                                } while (!resInfo.equals("SI") && !resInfo.equals("NO"));
                            }
                        } while (resInfo.equals("SI") && admin != 3) ;
                    }
                    break;

                default:
                    System.out.println("Datos introducidos incorrectamente");
                    System.out.println("══════════════════════════════════\n");
            }
        } while (respuesta != 'a' && respuesta != 'b' && respuesta != 'c' || bloqueo || encendido);
    }
}