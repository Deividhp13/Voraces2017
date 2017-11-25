import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by matrix on 30/10/17.
 */
public class NumeroMasCercanos {


    public NumeroMasCercanos() {

    }

    public long[] VorazNumerosCercanos(ArrayList<Integer> conjuntoNumeros){
        UtilArrays utilidades = new UtilArrays();
      ArrayList<Integer> solucion1 = new ArrayList<>(conjuntoNumeros.size());
        ArrayList<Integer> solucion2 = new ArrayList<>(conjuntoNumeros.size());
        ArrayList<Integer> sobrantes = new ArrayList<>(conjuntoNumeros.size());
      long [] sol = new long [2];
      int candidato = 9, c = 0;
      boolean fin = false;
        while (!fin) {
            for(int i = 0; i < conjuntoNumeros.size(); i++) {
                if (conjuntoNumeros.get(i) == candidato) c++;
            }
            if (c % 2 != 0) sobrantes.add(candidato);
                if(c > 0){
                        for(int i = 0; i < (c/2); i++) {
                            solucion1.add(candidato);
                            solucion2.add(candidato);
                            c = c-2;
                    }
                }
                candidato--;
                if(candidato == 0) fin = true;
            }
            Collections.sort(sobrantes);
        utilidades.imprimeArray(solucion1);
        utilidades.imprimeArray(solucion2);
        utilidades.imprimeArray(sobrantes);
            for(int i = 0; i < sobrantes.size(); i++){
                if (i % 2 == 0) solucion1.add(sobrantes.get(i));
                else solucion2.add(sobrantes.get(i));

            }


        return sol;
        }


    }







