import java.util.ArrayList;
public class MagicBox<T> {

    protected ArrayList objects;
    private int objCount;
    private int maxObj;

    public MagicBox (int objAmnt) {
        objects = new ArrayList(objAmnt);
        maxObj = objAmnt;
    }

    public boolean add(T item) {
        if (objCount < maxObj) {
            objects.add(item);
            objCount++;
            return true;
        } else {
            return false;
        }
    }

    public T pick() {
        if (objCount != maxObj) {
            throw new RuntimeException(maxObj - objCount);
        } else {
            //TODO random
        }
    }
}
