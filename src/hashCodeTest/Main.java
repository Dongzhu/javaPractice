package hashCodeTest;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<User, String> hashMap = new HashMap<>();
        hashMap.put(new User("Pheobus Bruce Li"), "123");

        System.out.println(hashMap.get(new User("Pheobus Bruce Li")));

    }
}
