import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        Stack<String> animal = new Stack<>();

        animals.push("Buffalo");
        animals.push("Ox");
        animals.push("Cow");
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");

        System.out.println(animals.pop());
        System.out.println(animals.size());
        System.out.println(animals.peek());
        System.out.println(animal.isEmpty());
        System.out.println(animals.contains("Horse"));
    }
}
