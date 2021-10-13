import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int operaciones=input.nextInt();
		input.nextLine();
		double prnt[] = new double[operaciones];
		String str[] = new String[operaciones];
		for(int i=0;i<operaciones;i++) {
		String data = input.nextLine();
		String[] partes = data.split(" ");
		prnt[i]=Operation(GetOper(partes), GetNum(partes));
		str[i]=data;
		}
		for(int i=0; i<operaciones;i++) {
			System.out.printf("%s = %.1f \n",str[i],prnt[i]);
		}
	}
	
	/*
	 * Este metodo recibe dos arreglos, uno con los operandos y el otro con los valores
	 * que va a operar.
	 * Retorna un entero con el valor de la suma de los arreglos insertados
	 */
	public static double Operation(String[] op, double[] num) {
		int pos=1; 
		double suma=num[0];
		for(int i=0; i<op.length;i++) {
			switch(op[i]) {
			case "+":
				suma += num[pos];
				break;
			case "-":
				suma -= num[pos];
				break;
			case "*":
				suma *= num[pos];
				break;
			case "x":
				suma *= num[pos];
				break;
			case "X":
				suma *= num[pos];
				break;
			case "/":
				suma /= num[pos];
				break;
			}			
			pos++;	
		}
		return suma;
	}
	/*
	 * Este metodo recibe un arreglo de string del cual solo se tomaran los operandos
	 * y se guardaran en un nuevo arreglo
	 * @retorna un array con los operadores en el orden de ingreso 
	 */
	public static String[] GetOper(String[] array) {
		int count=0;
		String[] op= new String[array.length/2];
		for(int i=1; i<array.length; i+=2) {
			op[count] = array[i];
			count++;
		}
		return op;
		
	}
	/*
	 * Metodo que recibe un array de operaciones separadas por su operando
	 * y solo obtiene los numeros a operar omitiendo el operando ingresado 
	 * 
	 * debuelve un array de enteros con los numeros a operar
	 */
	public static double[] GetNum(String[] array) {
		int count=0;
		double[] num= new double[array.length/2+1];
		for(int i=0; i<array.length; i+=2) {
			num[count] = Double.parseDouble(array[i]);
			count++;
		}
		return num;
	}

}
