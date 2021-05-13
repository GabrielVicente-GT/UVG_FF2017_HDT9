public interface InterMaps <K,V> {
    void add(K key, V value);
    V get(K key);
    boolean buscar (K key);

}
