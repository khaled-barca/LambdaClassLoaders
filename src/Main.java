import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> lambda = (Integer i) -> {
        };
        Consumer<Integer> methodRef = Main::methodRef;
        LambdaInt customLambda = () -> {};
        LambdaInt customMethodRef = Main::methodRef;
        System.out.println(customMethodRef.getClass().getClassLoader());
        System.out.println(customLambda.getClass().getClassLoader());
        System.out.println(lambda.getClass().getClassLoader());
        System.out.println(methodRef.getClass().getClassLoader());
    }

    public static void methodRef(Integer i) {
    }

    public static void methodRef() {

    }
}
