package p4_Entornos;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Como te llamas:");
		String name=sc.nextLine();
		Personas p1=new Personas(name);
		System.out.println("hola me llamo "+p1.getNombre());

	}

}
