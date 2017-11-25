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
    ArrayList<Integer> solucionA = new ArrayList<>(conjuntoNumeros.size());
    ArrayList<Integer> solucionB = new ArrayList<>(conjuntoNumeros.size());
    int numeroA = 0, numeroB = 0, c;
    while(!conjuntoNumeros.isEmpty()){
        c = seleccionarCandidato(conjuntoNumeros);
        conjuntoNumeros.remove(new Integer(c));
                if(numeroA > numeroB){
                    solucionB.add(c);
                    numeroB += c;
                } else{
                    solucionA.add(c);
                    numeroA += c;
                }
    }
    utilidades.imprimeArray(solucionA);
    utilidades.imprimeArray(solucionB);
    return null;
    }

    private int seleccionarCandidato(ArrayList<Integer> candidatos){
    int c = candidatos.get(0);
    for(int i = 1; i < candidatos.size(); i++)
        if(c < candidatos.get(i)) c = candidatos.get(i);
    return c;
    }
}






