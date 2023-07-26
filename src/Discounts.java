import java.util.Scanner;

public class Discounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner commission = new Scanner (System.in);
		System.out.println("ingresa la cantidad que deseas depositar en numeros: ");
		double venta = commission.nextDouble();
		double ventaP = 0;
		if (venta>10000) {
			ventaP =30;
		} else if (venta>=5001 && venta <=9999){
			ventaP= 20;
		}else if(venta>=1001 && venta <=5000) {
			ventaP =10;
		}else if(venta>=0){
			ventaP =-1;
			System.out.println("No se aceptan cantidades inferiores a 1000");
		}//if else
		System.out.println("Tu cantidad es:" + ventaP + "%");
		commission.close();
	}

}
