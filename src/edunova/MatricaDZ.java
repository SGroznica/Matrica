package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MatricaDZ {
	public static void main(String[] args) {

		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		int broj = 1;
		int red = x - 1;
		int stupac = y - 1;
		int min = 0;
		int max = x * y;
		int[][] matrica = new int[x][y];

		while (broj <= max) {

			for (int j = stupac - min; j >= min; j--) {
				if (broj <= max) {
					matrica[red - min][j] = broj++;
				}
			}

			for (int i = red - (1 + min); i >= min; i--) {
				if (broj <= max) {
					matrica[i][min] = broj++;
				}
			}

			for (int j = min + 1; j <= stupac - min; j++) {
				if (broj <= max) {
					matrica[min][j] = broj++;
				}

			}

			for (int i = min + 1; i < red - min; i++) {
				if (broj <= max) {
					matrica[i][stupac - min] = broj++;
				}
			}
			min++;

		}

		for (int a = 0; a < x; a++) {
			System.out.println(Arrays.toString(matrica[a]));
		}

	}

}
