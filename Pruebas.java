import java.util.ArrayList;

public class Pruebas {
    /*
    NOTA IMPORTANTE: Haciendo las pruebas, me he dado cuenta de que es imposible hacerlas con más de 36 cifras debido al
    formato de long. long puede almacenar un entero con signo de 64-bits, desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807.
    Debido a ello, las pruebas que se realizan con 38 cifras (enteros de 19 cifras) y con 40 (enteros de 20) suelen dar error,
    como se puede comprobar en el siguiente resultado:

    Los 38 números del ArrayList son: 4,5,9,1,4,5,9,1,8,3,1,6,6,7,5,9,8,2,5,4,8,9,5,6,4,4,8,2,1,3,6,8,1,6,1,5,5,8
    Los 19 números del ArrayList son: 9,9,8,8,8,6,6,5,5,5,4,4,3,2,1,1,1,7,4
    Los 19 números del ArrayList son: 9,9,8,8,8,6,6,5,5,5,4,4,3,2,1,1,1,6,5
    El primer  Numero es: -8457877518266340442
    El segundo Numero es: -8457877518266340451
    Los 40 números del ArrayList son: 9,5,8,8,9,6,6,9,9,4,9,1,4,3,8,4,3,7,8,2,3,5,4,4,4,4,1,2,1,7,4,9,2,6,6,3,5,7,4,8
    Los 20 números del ArrayList son: 9,9,9,8,8,7,6,6,5,4,4,4,4,3,3,2,1,8,1,2
    Los 20 números del ArrayList son: 9,9,9,8,8,7,6,6,5,4,4,4,4,3,3,2,1,7,5,4
    El primer  Numero es: 7755046175895563732
    El segundo Numero es: 7755046175895563674

     */
    private static final int cifra1=2;
    private static final int cifra2=4;
    private static final int cifra3=6;
    private static final int cifra4=8;
    private static final int cifra5=10;
    private static final int cifra6=12;
    private static final int cifra7=14;
    private static final int cifra8=16;
    private static final int cifra9=18;
    private static final int cifra10=20;
    private static final int cifra11=22;
    private static final int cifra12=24;
    private static final int cifra13=26;
    private static final int cifra14=28;
    private static final int cifra15=30;
    private static final int cifra16=32;
    private static final int cifra17=34;
    private static final int cifra18=36;
    //private static final int cifra19=38;
    //private static final int cifra20=40;


    public static void main(String[] args){
        NumeroMasCercanos rm = new NumeroMasCercanos();
        UtilArrays genNumeros=new UtilArrays();
        ArrayList<Integer> conjuntoCifras;
        long [] resul;

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra1);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra2);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra3);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra4);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra5);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra6);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra7);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra8);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra9);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra10);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra11);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra12);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra13);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra14);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra15);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra16);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra17);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra18);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);
        /*
        conjuntoCifras=genNumeros.rellenaCandidatos(cifra19);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);

        conjuntoCifras=genNumeros.rellenaCandidatos(cifra20);
        resul=rm.VorazNumerosCercanos(conjuntoCifras);
        System.out.println("El primer  Numero es: " +resul[0]);
        System.out.println("El segundo Numero es: " +resul[1]);
        */
                }
    }

