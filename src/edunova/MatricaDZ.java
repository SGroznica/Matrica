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

		// 1-5
		// for (int i = x - 1; i >= x - 1; i--) {
		for (int j = y - 1; j >= 0; j--) {
			matrica[x - 1][j] = broj++;

		}
		// 6-9
		for (int i = x - 2; i >= 0; i--) {
			// for (int j = 0; j >= 0; j--) {
			matrica[i][0] = broj++;
		}
		// 10-13
		// for (int i = 0; i >= 0; i--) {
		for (int j = 1; j <= y - 1; j++) {
			matrica[0][j] = broj++;
		}
		// 14-16
		for (int i = 1; i <= x - 2; i++) {
			matrica[i][y - 1] = broj++;
		}
		// 17-19
		for (int j = y - 2; j >= 1; j--) {
			matrica[x - 2][j] = broj++;
		}
		// 20-21
		for (int i = x - 3; i >= 1; i--) {
			matrica[i][1] = broj++;
		}

		// 22-23
		// for (int i = 1; i >= 1; i--) {
		for (int j = 2; j <= y - 2; j++) {
			matrica[1][j] = broj++;
		}

		// 24-25
		//for (int i = 2; i >= 2; i--) {
			for (int j = y - 2; j > 1; j--) {
				matrica[2][j] = broj++;
			}
		

		for (int a = 0; a < x; a++) {
			System.out.println(Arrays.toString(matrica[a]));
		}
	}

}
