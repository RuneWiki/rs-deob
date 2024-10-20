package deob;

@ObfuscatedName("gk")
public abstract class class184 {

    @ObfuscatedName("gk.p")
    public static boolean field2513 = false;

    @ObfuscatedName("gm.c([BZI)Ljava/lang/Object;")
    public static Object method3244(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2513) {
            try {
                class179 var2 = new class179();
                var2.method2986(arg0);
                return var2;
            } catch (Throwable var4) {
                field2513 = true;
            }
        }
        return arg1 ? method1644(arg0) : arg0;
    }

    @ObfuscatedName("ey.a(Ljava/lang/Object;ZI)[B")
    public static byte[] method2774(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1644(var2) : var2;
        } else if (arg0 instanceof class184) {
            class184 var3 = (class184) arg0;
            return var3.method2984();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ci.y([BB)[B")
    public static byte[] method1644(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gk.m(I)[B")
    public abstract byte[] method2984();

    @ObfuscatedName("gk.p([BI)V")
    public abstract void method2986(byte[] arg0);
}
