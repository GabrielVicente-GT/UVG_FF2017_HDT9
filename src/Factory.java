/**
 * Clase factory
 * @param <E> Tipo de dato a almacenar como llave
 * @param <F> Tipo de dato a almacenar como valor
 */

public class Factory <E,F>{
    /**
     * regresa una de la implementaciones (Redblacktree o HashingMap)
     * @param resp numero que indica que implementacion regresar
     * @return implementacion
     */
    public InterMaps<E,F> getStack(int resp){
        if(resp==1){
            return new RedBlackTree();

        }else if(resp==2){
            return new HashingMap();
        }
        return null;
    }
}