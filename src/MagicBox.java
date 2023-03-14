import java.util.ArrayList;
import java.util.Random;
public class MagicBox<T> {

    protected T[] objects;
    Random random = new Random();

    public MagicBox (int objAmnt) {
        objects = (T[]) new Object[objAmnt];
    }

    public boolean add(T item) {
        if (objects[objects.length - 1] == null) {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null) {
                    objects[i] = item;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public T pick() {
        int itemsCount = 0;
        if (objects[objects.length - 1] == null) {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null) {
                    itemsCount = i -1;
                    break;
                }
            }
            throw new RuntimeException(objects.length - itemsCount);
        } else {
            int randomInt = random.nextInt(objects.length);
            return objects[randomInt];
        }
    }
}
