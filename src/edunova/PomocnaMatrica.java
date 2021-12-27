package edunova;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PomocnaMatrica {

	public static void main(String[] args) {

		int[][] matrica = new int[5][5];
		int broj = 1;

		for (int i = 4; i >= 4; i--) {
			for (int j = 4; j >= 0; j--) {
				matrica[i][j] = broj++;

				// if (i == 4 && j == 4) {
				// matrica[i][j] = 1;
				// } else if (i == 4 && j == 3) {
				// matrica[i][j] = 2;
				// } else if (i == 4 && j == 2) {
				// matrica[i][j] = 3;
				// } else if (i == 4 && j == 1) {
				// matrica[i][j] = 4;
				// } else if (i == 4 && j == 0) {
				// matrica[i][j] = 5;
				// }
			}
		}

		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j >= 0; j--) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = 0; i >= 0; i--) {
			for (int j = 1; j <= 4; j++) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = 1; i <= 3; i++) {
			for (int j = 4; j >= 4; j--) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = 3; i >= 3; i--) {
			for (int j = 3; j >= 1; j--) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = 2; i >= 1; i--) {
			for (int j = 1; j >= 1; j--) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = 1; i >= 1; i--) {
			for (int j = 2; j <= 3; j++) {
				matrica[i][j] = broj++;

			}

		}

		for (int i = 2; i >= 2; i--) {
			for (int j = 3; j >= 2; j--) {
				matrica[i][j] = broj++;

			}

		}

		for (int a = 0; a < 5; a++) {
			System.out.println(Arrays.toString(matrica[a]));
		}

		// matrica[4][4] = 1;
		// matrica[4][3] = 2;
		// matrica[4][2] = 3;
		// matrica[4][1] = 4;
		// matrica[4][0] = 5;

		// matrica[3][0] = 6;
		// matrica[2][0] = 7;
		// matrica[1][0] = 8;
		// matrica[0][0] = 9;

		// matrica[0][1] = 10;
		// matrica[0][2] = 11;
		// matrica[0][3] = 12;
		// matrica[0][4] = 13;

		// matrica[1][4] = 14;
		// matrica[2][4] = 15;
		// matrica[3][4] = 16;

		// matrica[3][3] = 17;
		// matrica[3][2] = 18;
		// matrica[3][1] = 19;

		// matrica[2][1] = 20;
		// matrica[1][1] = 21;

		// matrica[1][2] = 22;
		// matrica[1][3] = 23;

		// matrica[2][3] = 24;
		// matrica[2][2] = 25;

	}

}
