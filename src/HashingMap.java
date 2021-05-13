import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashingMap<K,V>implements InterMaps<K,V> , Map{

    public HashMap<Object, Object> almacen;

    public HashingMap(){
        almacen = new HashMap<>();
    }

    public void add(K key, V value) {
        almacen.put(key, value);

    }


    public boolean buscar(K key) {
        return almacen.containsKey(key);
    }


    public int size() {
        return almacen.size();
    }


    public boolean isEmpty() {
        return almacen.isEmpty();
    }


    public boolean containsKey(Object key) {
        return almacen.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return almacen.containsValue(value);
    }


    public Object get(Object key) {
        return almacen.get(key);
    }


    public Object put(Object key, Object value) {
        return almacen.put(key,value);
    }

    @Override
    public Object remove(Object key) {
        return almacen.remove(key);
    }

    @Override
    public void putAll(Map m) {
        almacen.putAll(m);

    }

    @Override
    public void clear() {
        almacen.clear();
    }

    @Override
    public Set keySet() {
        return almacen.keySet();
    }

    @Override
    public Collection values() {
        return almacen.values();
    }

    @Override
    public Set<Entry<Object,Object>> entrySet() {
        return almacen.entrySet();
    }
}
