public class MagicBox<T> {

    protected T[] objects;

    public MagicBox (int objAmnt) {
        objects = new T[objAmnt];
    }
}
