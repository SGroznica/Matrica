package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MatricaDZ {
	public static void main(String[] args) {

		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		int broj = 1;

		int[][] matrica = new int[x][y];
		for (int i = x - 1; i >= x - 1; i--) {
			for (int j = y - 1; j >= 0; j--) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = x - 2; i >= 0; i--) {
			for (int j = 0; j >= 0; j--) {
				matrica[i][j] = broj++;
			}
		}

		for (int a = 0; a < x; a++) {
			System.out.println(Arrays.toString(matrica[a]));
		}
	}

}
