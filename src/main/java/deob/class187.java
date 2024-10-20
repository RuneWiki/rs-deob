package deob;

@ObfuscatedName("gf")
public class class187 {

    @ObfuscatedName("gf.z")
    public static class177 field2871 = new class177();

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.z(B)V")
    public static void method3155() {
        field2871 = new class177();
    }

    @ObfuscatedName("k.a(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method484(String arg0) throws ClassNotFoundException {
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
