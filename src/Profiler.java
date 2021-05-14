import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;
public class Profiler {
    @org.junit.Test
    public void LlegarHash() {
        InterMaps almacen = new RedBlackTree();
        try{
            File file = new File("Spanish.txt");
            Scanner input = new Scanner (file);
            while(input.hasNextLine()){
                String dato = input.nextLine();
                String[] partes = dato.split("\\s+");
                String llave = "";
                String valor = "";
                if(partes.length<=2){
                    llave = partes[0];
                    valor = partes[1];
                }else{
                    llave = partes[0];
                    valor = partes[2];
                }

                almacen.add(llave,valor);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }


        assertEquals(true,almacen.buscar("dog"));
    }
}
