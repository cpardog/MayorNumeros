package Numeros;

public class Mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Saludando a los queridos compañeros nuevo en eclipse");
		
		int x[] ={5,3,2,50,45};
		int temp =0;
		System.out.println("Arreglo antes");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length-1; j++) {
				if (x[i] < x[j]) {
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		System.out.println("Arreglo Después");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

	}

}
