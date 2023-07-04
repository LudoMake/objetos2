/**
 * 
 */
package app;

import java.util.Scanner;

import clases.Cafetera;

/**
 * @author IFCD0111ADRI
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Programa para realizar cafes de manera automatica");
		Cafetera saimaza = new Cafetera();

		System.out.println("Creando cafetera 1");

		System.out.println("Introduce una cantidad: ");
		int capacidad = teclado.nextInt();

		Cafetera bonka = new Cafetera(capacidad);
		System.out.println("Creando cafetera 2");

		System.out.println("Creando cafetera 3");
		System.out.println("Capacidad maxima: ");
		capacidad = teclado.nextInt();

		System.out.println("Capacidad actual: ");
		int capAct = teclado.nextInt();

		System.out.println("La cafetera 1 es: " + saimaza);
		System.out.println("La cafetera 2 es: " + bonka);

		Cafetera servicio = saimaza;
		int opcion = 0;
		do {
			System.out.println("1. Seleccionar maquina");
			System.out.println("2. Llenar cafetera");
			System.out.println("3. Servir taza");
			System.out.println("4. Vaciar cafetera");
			System.out.println("5. Agregar cafe");
			System.out.println("0. Salir");

			System.out.println("Elige una opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Selecciona maquina");
				System.out.println("1. saimaza");
				System.out.println("2. bonka");

				System.out.println("que maquina quieres");
				int maquina = teclado.nextInt();
				switch (maquina) {
				case 1:
					servicio = saimaza;
					break;
				case 2:
					servicio = bonka;
					break;
				default:
					System.out.println("Maquina no encontrada");
				}
				break;
			case 2:
				System.out.println("Llenando cafetera...");
				servicio.llenarCafetera();
				System.out.println(servicio);
				break;
			case 3:
				System.out.println("Cuanta capacidad quieres");
				capacidad = teclado.nextInt();
				System.out.println("Sirviendo taza...");
				int servido = servicio.servirTaza(capacidad);
				if (servido == capacidad) {
					System.out.println("Cafe servido correctamente");
				} else {
					System.out.println("Cafe incompleto, servidos " + servido + "cc");
				}
				break;
			case 4:
				System.out.println("Vaciando cafetera...");
				servicio.vaciarCafetera();
				System.out.println("Maquina: "+servicio);
				break;
			case 5:
				System.out.println("Cuanto quieres añadir");
				capacidad=teclado.nextInt();
				System.out.println("Añadiendo cafe..");
				servicio.agregarCafe(capacidad);
				System.out.println("Maquina: "+servicio);
			case 0:
				System.out.println("Hasta luego LucasH");
				break;
				default: System.out.println("Opcion incorrecta");
			}
		} while (opcion != 0);
		teclado.close();
	}
}