package view;

import controller.ThreadNumero;

public class Principal {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread threadN = new  ThreadNumero();
			threadN.start();
			
		}

	}

}
