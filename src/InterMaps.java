/**
 * Interface Intermaps
 * @param <K> Valor de la llave
 * @param <V> Valor
 */
public interface InterMaps <K,V> {
    /**
     * add
     * @param key llave a agregar
     * @param value valor a agregar
     */
    void add(K key, V value);

    /**
     * obtener get
     * @param key llave con valor a obtener
     * @return llave y valor
     */
    V get(K key);

    /**
     * buscar
     * @param key llave a buscar
     * @return true or false
     */
    boolean buscar (K key);

}
