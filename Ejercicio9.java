import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la lista");
		int a = sc.nextInt();
		
		imprimir(rellenar(a));
		

	}
	
	public static void imprimir(int lista[]) {
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma = suma + lista[i];
			System.out.println("En la posicion "+i+ " hay el valor "+lista[i]);
		}
		System.out.println("La suma de la lista es: " + suma);
	}
	
	public static int [] rellenar (int a) {
		int max = 9;
		int min = 0;
		int num[]= new int [a];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * (max - min - 1) + (min)) + 1;
		}
		
		return num;
	}

}
