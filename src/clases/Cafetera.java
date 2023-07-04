package clases;

public class Cafetera {
	// variable miembro o de estancia
	private int capacidad_maxima;
	private int cantidad_actual;

	private final static int capmax = 1000;

	// primer constructor

	public Cafetera() {
		this.capacidad_maxima = capmax;
		this.cantidad_actual = 0;
	}

	// segundo constructor

	public Cafetera(int capacidad) {
		this.cantidad_actual = capacidad_maxima = capacidad;
	}

	// tercer constructor

	public Cafetera(int capacidad_maxima, int cantidad_actual) {
		this.capacidad_maxima = capacidad_maxima;
		this.cantidad_actual = cantidad_actual;

		if (this.cantidad_actual > this.capacidad_maxima)
			; //
		this.cantidad_actual = this.capacidad_maxima; // this.capacidad_actual=Math.min(capacidad_maxima,
														// cantidad_actual);
	}

	// Getter y setter
	public int getCapacidad_maxima() {
		return this.capacidad_maxima;
	}

	public int getCapacidad_actual() {
		return this.cantidad_actual;
	}

	public void setCapacidad_maxima(int capacidad_maxima) {
		this.capacidad_maxima = capacidad_maxima;
	}

	public void setCantidad_actual(int cantidad) {
		this.cantidad_actual = cantidad;
		if (this.cantidad_actual > this.capacidad_maxima) {
			this.cantidad_actual = this.capacidad_maxima;
		}
	}

	// Metodo de la clase llenar la cafetera

	public void llenarCafetera() {
		this.cantidad_actual = this.capacidad_maxima;
	}

	// Metodo para rellenar la cantidad faltante a la taza

	public int servirTaza(int cantidadTaza) {
		if (this.cantidad_actual < cantidadTaza) {
			int resto = this.cantidad_actual;
			this.cantidad_actual = 0;
			return resto;
		}
		this.cantidad_actual = this.cantidad_actual - cantidadTaza;
		return cantidadTaza;
	}

	// Metodo vaciar cafetera

	public void vaciarCafetera() {
		this.cantidad_actual = 0;
	}

	// Metodo agregar cafe

	public void agregarCafe(int cantidad) {
		setCantidad_actual(this.cantidad_actual + cantidad);
	}

	@Override
	public String toString() {
		return "Cafetera [capacidad_maxima=" + capacidad_maxima + ", cantidad_actual=" + cantidad_actual + "]";
	}
}