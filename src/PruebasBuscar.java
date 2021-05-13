import static org.junit.Assert.*;

public class PruebasBuscar {

    @org.junit.Test
    public void buscarHash() {
        HashingMap almacen = new HashingMap();
        almacen.add("peubas","valor");
        almacen.add("dos","valor");

        assertEquals(true,almacen.buscar("dos"));
    }

    @org.junit.Test
    public void buscarRedBlack() {
        RedBlackTree almacen = new RedBlackTree();
        almacen.add("peubas","valor");
        almacen.add("dos","valor");

        assertEquals(true,almacen.buscar("peubas"));
    }



}