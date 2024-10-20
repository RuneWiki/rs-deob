package deob;

@ObfuscatedName("ge")
public class class190 {

    @ObfuscatedName("ge.p")
    public static class181 field2892 = new class181();

    public class190() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.p(I)Z")
    public static boolean method3002() {
        class189 var0 = (class189) field2892.method3330();
        return var0 != null;
    }

    @ObfuscatedName("w.x(Ljava/lang/String;S)Ljava/lang/Class;")
    public static Class method89(String arg0) throws ClassNotFoundException {
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
        } else if (arg0.equals("void")) {
            return Void.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
