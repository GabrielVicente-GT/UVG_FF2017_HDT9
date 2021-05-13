import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[]args){
        Factory<String,String> imp = new Factory<String,String>();
        InterMaps almacen;
        Vector <String> varios = new Vector<String>();
        Traductor esperanza = new Traductor();

        int res = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido lector de cartas ");
        System.out.println("Seleccione la implementacion que desea utizar para el stack: ");
        System.out.println("[ 1 ] Red Black Tree.");
        System.out.println("[ 2 ] HashMap.");

        while(true){
            try{
                res = s.nextInt();

                if(res>=1 && res<=2){
                    break;
                }else{
                    System.out.println("Ingrese valores entre 1 y 2 !");
                }
            }catch(Exception e){
                System.out.println("Ingrese valores numericos ! ! !");
            }
        }

        almacen = imp.getStack(res);



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

                System.out.println(Arrays.toString(partes));
                almacen.add(llave,valor);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        /***
         * Se lee un archivo txt (diccionario)
         */

        try{
            FileReader r = new FileReader("texto.txt");
            BufferedReader buffer = new BufferedReader(r);

            String temp ="";

            while(temp!=null){
                temp = buffer.readLine();
                if(temp == null){
                    break;
                }
                varios.add(temp);

            }
        }catch(Exception e){
            System.out.println("archivo no encontrado");
        }

        /***
         * Impresion de lo que hay en el archivo y se pasa la calculadora
         */

        System.out.println("\nOraciones a traducir en texto.txt");
        System.out.println();
        for(int a =0;a<varios.size();a++){
            System.out.println(varios.get(a));
        }
        System.out.println("");
        System.out.println("\nTraducciones\n");

        int numero = 0;
        int a = 0;
        while(a<varios.size()){
            numero++;
            try{
                System.out.println(" ESTA ES LA TRADUCCION ---> "+esperanza.Calculo(varios.get(a),almacen) +" ");
                System.out.println(" ESTA ES LA ORIGINAL   ---> "+varios.get(a) +" ");
                System.out.println();

            }catch(Exception e){
                System.out.println(" Error");
                System.out.println();

            }
            a++;
        }
        
    }
}
