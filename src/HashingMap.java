import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * clase de hashingMap
 * @param <K> Tipo a almacenar
 * @param <V> Tipo a almacenar
 */
public class HashingMap<K,V>implements InterMaps<K,V> , Map{
    /**
     * instancia de hashmap
     */

    public HashMap<Object, Object> almacen;

    /**
     * Constructor de HashingMap
     */

    public HashingMap(){
        almacen = new HashMap<>();
    }

    /**
     * Agrega un valor al hashmap
     * @param key tipo de llave
     * @param value tipo del valor
     */
    public void add(K key, V value) {
        almacen.put(key, value);

    }

    /**
     * verifica si se encuentra un valor
     * @param key valor a buscar
     * @return true o false dependiendo el resultado
     */

    public boolean buscar(K key) {
        return almacen.containsKey(key);
    }

    /**
     * retornar el largo
     * @return largo
     */
    public int size() {
        return almacen.size();
    }

    /**
     * verifica si es empty
     * @return
     */
    public boolean isEmpty() {
        return almacen.isEmpty();
    }

    /**
     * verifica si contiene una llave
     * @param key llave a buscar
     * @return true or false
     */
    public boolean containsKey(Object key) {
        return almacen.containsKey(key);
    }

    /**
     * verifica si contiene un valor
     * @param value valor a buscar
     * @return true or false
     */
    public boolean containsValue(Object value) {
        return almacen.containsValue(value);
    }

    /**
     * busca
     * @param key objeto a buscar
     * @return el objeto encontrado
     */
    public Object get(Object key) {
        return almacen.get(key);
    }

    /**
     * Put
     * @param key llave
     * @param value valor
     * @return encontrado
     */
    public Object put(Object key, Object value) {
        return almacen.put(key,value);
    }

    /**
     * Remove
     * @param key llave a remover
     * @return quitar el objeto
     */
    @Override
    public Object remove(Object key) {
        return almacen.remove(key);
    }

    /**
     * sustituyepor un mapa
     * @param m mapa a susstituir
     */
    @Override
    public void putAll(Map m) {
        almacen.putAll(m);

    }

    /**
     * limpia Hashing map
     */
    @Override
    public void clear() {
        almacen.clear();
    }

    /**
     * Regresa todas las llaves
     * @return las llaves
     */
    @Override
    public Set keySet() {
        return almacen.keySet();
    }

    /**
     * regresa los valores
     * @return valores
     */
    @Override
    public Collection values() {
        return almacen.values();
    }

    /**
     * Almacena, cambia
     * @return almacenar el entry
     */
    @Override
    public Set<Entry<Object,Object>> entrySet() {
        return almacen.entrySet();
    }
}
