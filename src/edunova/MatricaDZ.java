package edunova;

import java.lang.reflect.Array;
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

			// 1-5
			// for (int i = x - 1; i >= x - 1; i--) {
			// lijevo
			for (int j = stupac - min; j >= min; j--) {
				System.out.println("1. FOR:[" + (red - min) + "][" + j + "] = " + broj);
				matrica[red - min][j] = broj++;

			}
			// 6-9
			// gore
			for (int i = red - (1 + min); i >= min; i--) {
				// for (int j = 0; j >= 0; j--) {
				System.out.println("2. FOR:[" + (i) + "][" + min + "] = " + broj);
				matrica[i][min] = broj++;

			}
			// 10-13
			// desno
			// for (int i = 0; i >= 0; i--) {
			for (int j = min + 1; j <= stupac - min; j++) {
				if (broj < max) {
					matrica[min][j] = broj++;
				}
				System.out.println("nije stalo");

				System.out.println("3. FOR:[" + (min) + "][" + j + "] = " + broj);
				
				
			}
			// 14-16
			// dolje
			for (int i = min + 1; i < red - min; i++) {
				System.out.println("4. FOR:[" + (i) + "][" + (stupac - min) + "] = " + broj);
				matrica[i][stupac - min] = broj++;

			}
			min++;

		}

		// 17-19
		// for (int j = y - 2; j >= 1; j--) {
		// matrica[x - 2][j] = broj++;
		// }
		// 20-21
		// for (int i = x - 3; i >= 1; i--) {
		// matrica[i][1] = broj++;
		// }

		// 22-23
		// for (int i = 1; i >= 1; i--) {
		// for (int j = 2; j <= y - 2; j++) {
		// matrica[1][j] = broj++;
		// }

		// 24-25
		// for (int i = 2; i >= 2; i--) {
		// for (int j = y - 2; j > 1; j--) {
		// matrica[2][j] = broj++;
		// }

		for (int a = 0; a < x; a++) {
			System.out.println(Arrays.toString(matrica[a]));
		}

	}

}
