package edunova;

import java.util.Arrays;

public class PomocnaMatrica {

	public static void main(String[] args) {

		int[][] matrica = new int[5][5];

		matrica[4][4] = 1;
		matrica[4][3] = 2;
		matrica[4][2] = 3;
		matrica[4][1] = 4;
		matrica[4][0] = 5;

		matrica[3][0] = 6;
		matrica[2][0] = 7;
		matrica[1][0] = 8;
		matrica[0][0] = 9;

		matrica[0][1] = 10;
		matrica[0][2] = 11;
		matrica[0][3] = 12;
		matrica[0][4] = 13;

		matrica[1][4] = 14;
		matrica[2][4] = 15;
		matrica[3][4] = 16;

		matrica[3][3] = 17;
		matrica[3][2] = 18;
		matrica[3][1] = 19;

		matrica[2][1] = 20;
		matrica[1][1] = 21;

		matrica[1][2] = 22;
		matrica[1][3] = 23;

		matrica[2][3] = 24;
		matrica[2][2] = 25;

		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}

	}

}
