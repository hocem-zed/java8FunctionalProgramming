package callbacksandlambdas;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("john", null, value -> {
            System.out.println("lastName not provided for " + value);
        });
    }

    // pour utiliser un callback sans parametre, changer Consumer par Runnable
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
