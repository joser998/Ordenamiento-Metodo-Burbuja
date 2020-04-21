import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuantos numeros quieres ordenar?");
        int cant=sc.nextInt();
        
        double numeros[] = new double [cant];
        
        System.out.println("Guardar Numeros\n");
        for(int i=0; i<numeros.length; i++){
            System.out.print("Numero: ");
            numeros[i]=sc.nextDouble();
        }
        
        //Ordenando Numeros Metodo Burbuja
        for(int i=0; i<numeros.length-1; i++){
            for(int j=0; j<numeros.length-1; j++){
                if(numeros[j] > numeros[j+1]){
                    double aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                }
            }
        }
        //Mostrando Numeros Menor a Mayor
        System.out.println("\nNumeros Menor a Mayor:");
        for(double mostrar: numeros)
            System.out.println(mostrar);
        
        //Mostrando Numeros Mayor a Menor
        System.out.println("\nNumeros Mayor a Menor:");
        for(int i=numeros.length-1; i>=0; i--)
            System.out.println(numeros[i]);   
    }
}
