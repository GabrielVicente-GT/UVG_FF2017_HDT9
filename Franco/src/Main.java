import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Factory<String,String> imp = new Factory<String,String>();
        InterMaps almacen;



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
                String llave = partes[0];
                String valor = partes[1];
                System.out.println(Arrays.toString(partes));
                almacen.add(llave,valor);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
