public class RuntimeException extends java.lang.RuntimeException {

    public RuntimeException(int value) {
        super("Коробка не заполнена! Количество пустых ячеек: " + value);
    }

}
