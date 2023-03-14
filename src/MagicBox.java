import java.util.Random;

public class MagicBox<T> {

    protected T[] objects;
    Random random = new Random();

    //Конструктор коробки
    public MagicBox(int objAmnt) {
        objects = (T[]) new Object[objAmnt];
    }

    //Добавление нового объекта
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

    //Метод выбора случайного объекта
    public T pick() {
        int itemsCount = 0;
        if (objects[objects.length - 1] == null) {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null) {
                    itemsCount = i;
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
