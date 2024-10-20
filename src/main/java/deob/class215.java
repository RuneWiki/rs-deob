package deob;

@ObfuscatedName("hm")
public class class215 {

    @ObfuscatedName("hm.x")
    public static class206 field3188 = new class206();

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.x(I)Z")
    public static boolean method3015() {
        class214 var0 = (class214) field3188.method3647();
        return var0 != null;
    }

    @ObfuscatedName("fb.j(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method3175(String arg0) throws ClassNotFoundException {
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
