import java.util.Scanner;

public class MoviesDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner movie = new Scanner(System.in);
		System.out.println("Cuantos años tienes?: ");
		double edad = movie.nextDouble();
		double descuento = 0;
		if ( edad>60) {
			descuento =55;
		}else if(edad>=1 && edad <=5) {
			descuento =60;
		}else if(edad>=6 && edad <= 59){
			descuento =0;
			System.out.println("No te podemos hacer descuentos, tienes que pagar precio completo $7" );
		}//if else
		System.out.println("Tu descuento es de:" + descuento + "%");
		movie.close();
	}

}
