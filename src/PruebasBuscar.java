import static org.junit.Assert.*;

/**
 * pruebas unitarias
 */
public class PruebasBuscar {
    /**
     * pruebas de buscar
     */
    @org.junit.Test
    public void buscarHash() {
        HashingMap almacen = new HashingMap();
        almacen.add("peubas","valor");
        almacen.add("dos","valor");

        assertEquals(true,almacen.buscar("dos"));
    }

    /**
     * pruebas de buscar
     */
    @org.junit.Test
    public void buscarRedBlack() {
        RedBlackTree almacen = new RedBlackTree();
        almacen.add("peubas","valor");
        almacen.add("dos","valor");

        assertEquals(true,almacen.buscar("peubas"));
    }



}