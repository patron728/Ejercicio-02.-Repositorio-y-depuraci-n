package ejercicio2;

public class Card {

	// Guarda el palo y el valor de la carta
	public String suit; // El palo de la carta
	public String value; // El valor de la carta

	// Recibe dos parámetros para juntar una carta con un palo y un valor
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	public String toString() {
		// Devuelve una cadena con el palo y el valor de la carta, separados por un guion
		return (this.suit + "-" + this.value);
	}
}
