package edunova;

import javax.swing.JOptionPane;

public class MatricaDZ {
	public static void main(String[] args) {
		
		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		int[][] matrica = new int[x][y];
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				System.out.println(matrica[i][j] + " ");

			}
			System.out.println();
		
		}
	}
	

}
