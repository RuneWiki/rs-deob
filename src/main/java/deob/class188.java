package deob;

@ObfuscatedName("gg")
public abstract class class188 {

    @ObfuscatedName("gg.g")
    public static boolean field2530 = false;

    @ObfuscatedName("iw.z([BZB)Ljava/lang/Object;")
    public static Object method4462(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2530) {
            try {
                class183 var2 = new class183();
                var2.method3210(arg0);
                return var2;
            } catch (Throwable var4) {
                field2530 = true;
            }
        }
        return arg1 ? method5138(arg0) : arg0;
    }

    @ObfuscatedName("jm.k(Ljava/lang/Object;ZI)[B")
    public static byte[] method4743(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method5138(var2) : var2;
        } else if (arg0 instanceof class188) {
            class188 var3 = (class188) arg0;
            return var3.method3211();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kc.c([BB)[B")
    public static byte[] method5138(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gg.s(I)[B")
    public abstract byte[] method3211();

    @ObfuscatedName("gg.g([BI)V")
    public abstract void method3210(byte[] arg0);
}
