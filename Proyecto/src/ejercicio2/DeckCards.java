package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		// Define los palos de la baraja
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };

		// Define los valores de las cartas de la baraja
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Se crea un ArrayList de tipo Card para almacenar las cartas de la baraja
		ArrayList<Card> deck = new ArrayList<Card>();

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				// Crea una nueva carta con el palo y el valor correspondientes
				Card card = new Card(suits[i], values[j]);

				// Añade la carta al ArrayList deck
				deck.add(card);
			}
		}

		for (int i = 0; i < deck.size(); i++) {
			// Genera un índice aleatorio entre 0 y i
			int j = (int) Math.floor(Math.random() * i);

			// Intercambia las cartas en las posiciones i y j
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		// Imprime las primeras 5 cartas de la baraja después de haber sido mezclada
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}
	}
}
