public class Main {
    public static void main(String[] args) {
        Stack <String> names = new Stack<>(4);
        names.push("AAA");
        names.push("BBB");
        names.push("CCC");
        names.push("DDD");

        names.display();

        System.out.println();

        System.out.println(" Popped element is : " +names.pop());
//        names.pop();
//        System.out.println(names.pop());

//        names.display();

    }
}