import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by matrix on 30/10/17.
 */
public class NumeroMasCercanos {


    public NumeroMasCercanos() {

    }

    public long[] VorazNumerosCercanos(ArrayList<Integer> conjuntoNumeros) {
        UtilArrays utilidades = new UtilArrays();
        ArrayList<Integer> solucion1 = new ArrayList<>(conjuntoNumeros.size());
        ArrayList<Integer> solucion2 = new ArrayList<>(conjuntoNumeros.size());
        ArrayList<Integer> sobrantes = new ArrayList<>(conjuntoNumeros.size());
        long[] sol = new long[2];
        int candidato = 9, c;
        boolean fin = false;
        while (!fin) {
            c = 0;
            for(int i= 0; i < conjuntoNumeros.size(); i++){
                if(conjuntoNumeros.get(i) == candidato) c++;
            }
            if (c > 0){
                if(c % 2 == 0){
                    for(int i = 0; i < c; i++){
                        if(i % 2 == 0) solucion1.add(candidato);
                        else solucion2.add(candidato);
                    }
                }
                else{
                    sobrantes.add(candidato);
                    c--;
                    for(int i = 0; i < c; i++){
                        if(i % 2 == 0) solucion1.add(candidato);
                        else solucion2.add(candidato);
                    }
                }
            }
            candidato--;
            if(candidato == 0) fin = true;
        }
        utilidades.imprimeArray(conjuntoNumeros);
        utilidades.imprimeArray(solucion1);
        utilidades.imprimeArray(solucion1);
        Collections.sort(sobrantes);
        utilidades.imprimeArray(sobrantes);
        return sol;

    }
}







