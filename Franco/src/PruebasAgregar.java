import static org.junit.Assert.*;

public class PruebasAgregar {

    @org.junit.Test
    public void addHash() {
        HashingMap almacen = new HashingMap();
        almacen.add("peubas","valor");
        almacen.add("dos","valor");

        assertEquals(2,almacen.size());
    }

    @org.junit.Test
    public void addRedBlack() {
        RedBlackTree almacen = new RedBlackTree();
        almacen.add("peubas","valor");
        almacen.add("dos","valor");

        assertEquals("valor",almacen.get("dos"));
    }



}