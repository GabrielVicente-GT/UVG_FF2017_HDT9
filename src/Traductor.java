/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
import java.io.*;
import java.util.ArrayList;
public class Traductor {
    /***
     * Calculo para analizar la oracion a traducir
     * @param expresion traduccion a realizar
     *
     * @return traduccion final
     */
    public String Calculo(String expresion,InterMaps almacen){
        String traduccion = "";

        String[] expresion_separada = expresion.replace(".","").toLowerCase().split(" ");

        ArrayList<String> Cadena = new ArrayList<String>();

        for (int n = 0; n <expresion_separada.length; n++) {

            Cadena.add(String.valueOf(expresion_separada[n]));
        }

        for (int i = 0; i < Cadena.size(); i++){
            if(Cadena.get(i).equals(" ")){
                Cadena.remove(i);
            }
        }
        for (int a =0;a<Cadena.size();a++){
            if (almacen.buscar(Cadena.get(a))==true){
                String prueba = (String) almacen.get(Cadena.get(a));
                traduccion = traduccion + prueba+" ";
            }else{
                traduccion = traduccion +"*"+Cadena.get(a)+"*"+" ";
            }
        }
        return traduccion;
    }
}
