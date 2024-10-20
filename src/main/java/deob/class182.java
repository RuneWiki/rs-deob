package deob;

@ObfuscatedName("fc")
public class class182 {

    @ObfuscatedName("fc.f")
    public static class177 field2829 = new class177();

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.f(I)V")
    public static void method3040() {
        field2829 = new class177();
    }

    @ObfuscatedName("ej.n(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method2726(String arg0) throws ClassNotFoundException {
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
