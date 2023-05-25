import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyOwnArrayList<Integer> ints = new MyOwnArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(10);
        ints.add(11);
        ints.add(15);
        System.out.println(ints.getSize());
        System.out.println(ints.contains(24));
        System.out.println(ints.contains(88));
        System.out.println(ints.get(4));
        System.out.println(ints.get(8));
        System.out.println(ints.indexOf(48));
        System.out.println(ints.indexOf(55));
        System.out.println(ints.remove(4));
        System.out.println(ints.remove(25));
        System.out.println(Arrays.toString(ints.toArray()));

    }
}