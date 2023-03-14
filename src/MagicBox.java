import java.util.ArrayList;
import java.util.Random;
public class MagicBox<T> {

    protected ArrayList objects;
    private int objCount;
    private int maxObj;
    Random random = new Random();

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
            int randomInt = random.nextInt(maxObj);
            return (T) objects.get(randomInt);
        }
    }
}
