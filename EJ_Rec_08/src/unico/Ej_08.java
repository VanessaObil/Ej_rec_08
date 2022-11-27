package unico;

public class Ej_08 {

	public static void main(String[] args) {
		//Implementar un método recursivo que permita sumar los dígitos de un número.

		//sumarDigitos(234) = 2 + 3 + 4 = 9

		int n;
		n= Util.leerInt("introduce un numero de mas de un digito: ");
		sumarDigitos(n);
		Util.escribirInt(sumarDigitos(n));
	}

	private static  int sumarDigitos(int n) {
		int r;
		if(n==0) {
			r= 0;
		}else{
			 r= sumarDigitos(n/10) + n%10;
		}    
		return r;
		
	}

}
