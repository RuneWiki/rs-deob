package deob;

@ObfuscatedName("hr")
public class class211 {

    @ObfuscatedName("hr.f")
    public static class202 field3121 = new class202();

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.f(B)V")
    public static void method48() {
        field3121 = new class202();
    }

    @ObfuscatedName("bj.s(S)Z")
    public static boolean method1606() {
        class210 var0 = (class210) field3121.method3608();
        return var0 != null;
    }

    @ObfuscatedName("fz.g(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method3149(String arg0) throws ClassNotFoundException {
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
