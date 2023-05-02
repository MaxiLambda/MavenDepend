package org.example;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Class.forName("org.example.MoinMeister").getCanonicalName());
        Class.forName(getPrefix(args[0]) + args[0]);
        external(".MyClass");
        external2(getPrefix(""), "Stuff", "ignore me :(", "Some");

        String s = "my.app.";
        if (args[0].isEmpty()) s = "you.app.";
        s += "CoolClass";
        App.class.getClassLoader().loadClass(s);
    }

    public static String external(String s) {
        return "no see";
    }

    public static String external2(String a1, String b2, String c3, String d4) {
        return "no see too";
    }

    public static String getPrefix(String s) {
        return s.length() > 0 ? "org.slf4j" : "com.lol";
    }
}
