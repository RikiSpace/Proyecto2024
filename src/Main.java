import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nEdad,sumaP=0, contador5=0, sumaN=0, promedioP=0, promedioN=0, contadorN=0, contadorP=0, grado[];

        System.out.println("Por favor ingrese la cantidad de grados y edades que va a ingresar");
        nEdad = entrada.nextInt();

        grado = new int[nEdad];
        for (int i = 0; i < nEdad; i++) {
            System.out.println("Por favor digite los grados");
            grado[i] = entrada.nextInt();

        }
        int edad[] = new int[nEdad];
        for (int i = 0; i < nEdad; i++) {
            System.out.println("Por favor digite las edades");
            edad[i] = entrada.nextInt();

            /*if (edad[i] == 5) {
                contador5++;
            } else if (edad[i] > 5) {
                contadorP++;
                sumaP += edad[i];
            } else {
                contadorN++;
                sumaN += edad[i];
            }*/
        }
        //int mostrar[] = new int[nEdad];
        int i=0;
        for (int j=0;j<nEdad;j++);{
            System.out.println((i+1)+"La edad es: "+edad[i]+" - El grado es: "+grado[i]);

        }

        /*
        if (contadorP==0){
            System.out.println("No se puede hacer el promdeio de edades mayores a 5 años");
        }
        else  {
            promedioP = sumaP/contadorP;
            System.out.println("\nEl promedio de las edades mayor a 5 es: "+promedioP);
        }
        if (contadorN==0){
            System.out.println("No se puede hacer el promdeio de edades menores a 5 años");
        }
        else {
            promedioN = sumaN/contadorN;
            System.out.println("\nEl promdeio de las edades menores a 5 años es: "+promedioN);
        }
        System.out.println("\n Las edades son: ");


        for (int i=0;i<nEdad;i++){
            mostrar[j]=grado[i];
            j++;
            mostrar[j]=edad[i];
            j++;
            System.out.println(edad[i] + " ");+

            System.out.println("\nLa cantidad de estudiantes que tienen 5 años es:"+contador5);*/

       /* int mostrar[] = new int[nEdad];
        int i=0;

        for (int j=0;j<nEdad*2;j++);{
            System.out.println("La edad es: "+edad[i]+" - El grado es: "+grado[i]);

        }*/

    }
}