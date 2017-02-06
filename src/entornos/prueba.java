package entornos;

public class prueba {
	
	static java.util.Scanner in;

	public static void casoDePrueba() {
		int n = in.nextInt();
		int m = in.nextInt();
		int resultado = n* m * 4;
		System.out.println(resultado);
	}
	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int Casos;
		Casos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < Casos; i++)
		casoDePrueba();
		}
			
	}