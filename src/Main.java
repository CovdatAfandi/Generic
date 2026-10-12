import java.util.List;

public class Main {
    public static <T> void swap(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static double sum(List<? extends Number> numbers) {
        double total = 0;

        for (Number number : numbers) {
            total += number.doubleValue();
        }

        return total;
    }


    public static void main(String[] args) {

        List<Integer> numberss = List.of(10, 20, 30);
        System.out.println(sum(numberss)); // 60.0

       /* Box<String> box = new Box<>(null);

        System.out.println(box.isEmpty());

        box.set("Java");

        System.out.println(box.get());
        System.out.println(box.isEmpty());*/

      /*  Pair<Integer, String> pair = new Pair<>(101, "Ali");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());*/

        Integer[] numbers = {10, 20, 30};

        swap(numbers, 0, 2);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}

/*
class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }
}*/

class Pair<K,V>{

    private K key;
    private V value;


    public Pair(K key,V value) {
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }
    public V getValue(){
        return value;
    }


}
