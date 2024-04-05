package lesson11.additionalTask;


public class Main {

    public static void main(String[] args) {
        ArraySlava array = new ArraySlava();
        ArraySlava array2 = new ArraySlava(3);
        array2.print();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.print();
        array.remove(4);
        array.print();
        array.getElements(2);
        array.search(3);
        array.search(7);
        array.clean();
        array.print();

    }
}
