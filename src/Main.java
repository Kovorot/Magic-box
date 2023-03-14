public class Main {
    public static void main(String[] args) {

        //Коробка стрингов
        MagicBox<String> box1 = new MagicBox<>(6);
        System.out.println(box1.add("Smile"));    //true
        System.out.println(box1.add("Sweet"));    //true
        System.out.println(box1.add("Sister"));   //true
        System.out.println(box1.add("Sadistic")); //true
        System.out.println(box1.add("Surprise")); //true
        System.out.println(box1.add("Service"));  //true
        System.out.println(box1.add("Brah"));     //false
        System.out.println(box1.pick());          //Выведет рандомный текст

        //Коробка интов
        MagicBox<Integer> box2 = new MagicBox<>(7);
        System.out.println(box2.add(4));  //true
        System.out.println(box2.add(8));  //true
        System.out.println(box2.add(15)); //true
        System.out.println(box2.add(16)); //true
        System.out.println(box2.add(23)); //true
        System.out.println(box2.add(42)); //true
        System.out.println(box2.pick());  //Выкинет ошибку кол-во пустых ячеек: 1
    }
}