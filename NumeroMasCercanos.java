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
        Collections.sort(sobrantes);
        int diferencia = Integer.MAX_VALUE;
        int numero1 = 0, numero2 = 0;
        int pos = 0;
        for (int i=0; i < sobrantes.size()-1; i++) {
            if (sobrantes.get(i + 1) - sobrantes.get(i) <= diferencia && numero1 < sobrantes.get(i + 1) && numero2 < sobrantes.get(i)) {
                diferencia = sobrantes.get(i + 1) - sobrantes.get(i);
                numero1 = sobrantes.get(i + 1);
                numero2 = sobrantes.get(i);
                pos = i;
            }
        }
        solucion1.add(numero1);
        solucion2.add(numero2);
        sobrantes.remove(pos);
        sobrantes.remove(pos);
        int mitad = (sobrantes.size()/2);
        for(int i = 0; i < mitad; i++){
            solucion1.add(sobrantes.get(i));
        }
        Collections.reverse(sobrantes);
        for(int i = 0; i < mitad; i++){
            solucion2.add(sobrantes.get(i));
        }
        sobrantes.clear();
        utilidades.imprimeArray(conjuntoNumeros);
        for(int i = 0; i < solucion1.size(); i++){
            sol[0] = sol[0] * 10 + solucion1.get(i);
            sol[1] = sol[1] * 10 + solucion2.get(i);
        }
        return sol;

    }
}







