import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by matrix on 30/10/17.
 */
public class NumeroMasCercanos {


    public NumeroMasCercanos() {

    }
    /*
    Función que recibe por parámetro un ArrayList de números enteros y devuelve un long[] con dos números
    cuya diferencia es la menor en la mayoría de los casos. Por tanto, la función es óptima en una gran mayoría de
    casos.
     */
    public long[] VorazNumerosCercanos(ArrayList<Integer> conjuntoNumeros) {
        UtilArrays utilidades = new UtilArrays();
        //Inicialización de las estructuras en las que tenemos que almacenar la solución.
        //Ambos números se irán formando con los elementos de solucion1 y solucion2.
        ArrayList<Integer> solucion1 = new ArrayList<>();
        ArrayList<Integer> solucion2 = new ArrayList<>();
        //En este ArrayList meteremos los elementos cuyo número es impar. Por ejemplo, si hay 3 treses, se almacena uno aquí.
        ArrayList<Integer> sobrantes = new ArrayList<>();
        //Inicialización del vector que devolverá
        long[] sol = new long[2];
        //Candidato es el mayor número posible. Va reduciéndose. C es el contador de candidatos.
        int candidato = 9, c;
        //fin indicará cuando se ha recorrido el conjunto de candidatos completamente
        boolean fin = false;
        while (!fin) {
            //Inicializamos el contador a 0 al empezar la vuelta.
            c = 0;
            //Se recorre el ArrayList para averiguar el número de candidatos que hay.
            for(int i= 0; i < conjuntoNumeros.size(); i++){
                if(conjuntoNumeros.get(i) == candidato) c++;
            }
            //Si hay más de 0 candidatos, entramos en este if (CANDIDATO ACEPTABLE)
            if (c > 0){
                //Si el número de candidatos es par, asignamos a cada número la mitad de ellos.
                if(c % 2 == 0){
                    for(int i = 0; i < c; i++){
                        if(i % 2 == 0) solucion1.add(candidato);
                        else solucion2.add(candidato);
                    }
                }
                //Si no es par, añadimos un candidato al ArrayList de sobrantes, y asignamos la mitad de los restantes a un número y la otra mitad al otro.
                else{
                    sobrantes.add(candidato);
                    c--;
                    for(int i = 0; i < c; i++){
                        if(i % 2 == 0) solucion1.add(candidato);
                        else solucion2.add(candidato);
                    }
                }
            }
            //Se selecciona el siguiente candidato
            candidato--;
            if(candidato == 0) fin = true;
        }
        /*
        A partir de este punto, tenemos dos números exactamente iguales, cuya diferencia es 0. El objetivo es obtener una solución lo más óptima
        posible. Para ello, realizamos el siguiente conjunto de pasos:
         */
        //Ordenamos el array de sobrantes de menor a mayor.
        if(!sobrantes.isEmpty()) {
            Collections.sort(sobrantes);
            //Inicializamos la diferencia al máximo posible, y los dos números iniciales a 0, así como la posición.
            int diferencia = Integer.MAX_VALUE;
            int numero1 = 0, numero2 = 0;
            int pos = 0;
            //Obtenemos los dos números mayores que tengan la menor diferencia entre ellos, y añadimos uno al número 1 y el anterior al número 2.
            for (int i = 0; i < sobrantes.size() - 1; i++) {
                if (sobrantes.get(i + 1) - sobrantes.get(i) <= diferencia && numero1 < sobrantes.get(i + 1) && numero2 < sobrantes.get(i)) {
                    diferencia = sobrantes.get(i + 1) - sobrantes.get(i);
                    numero1 = sobrantes.get(i + 1);
                    numero2 = sobrantes.get(i);
                    pos = i;
                }
            }
            solucion1.add(numero1);
            solucion2.add(numero2);
            //Quitamos estos dos elementos del array de sobrantes
            sobrantes.remove(pos);
            sobrantes.remove(pos);
            //Hallamos el número medio para recorrer el array de sobrantes hasta la mitad.
            int mitad = (sobrantes.size() / 2);
            //Metemos la primera mitad (los números menores del array) en el número que tenía el número más mayor, en orden de menor a mayor.
            for (int i = 0; i < mitad; i++) {
                solucion1.add(sobrantes.get(i));
            }
            //Revertimos el array de forma que queda de mayor a menor de nuevo.
            Collections.reverse(sobrantes);
            //Metemos los números de mayor a menor en el segundo número
            for (int i = 0; i < mitad; i++) {
                solucion2.add(sobrantes.get(i));
            }
            //Limpiamos el array de sobrantes, todos los elementos están colocados.
            sobrantes.clear();
        }
        utilidades.imprimeArray(conjuntoNumeros);
        //Para meter los números en el vector, metemos los números de 1 en 1, multiplicando en cada paso por 10 para avanzar una posición.
        for(int i = 0; i < solucion1.size(); i++){
            sol[0] = sol[0] * 10 + solucion1.get(i);
            sol[1] = sol[1] * 10 + solucion2.get(i);
        }
        //Devolvemos el vector.
        return sol;

    }
}







