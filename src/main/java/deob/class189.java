package deob;

@ObfuscatedName("gf")
public abstract class class189 {

    @ObfuscatedName("gf.l")
    public static boolean field2441 = false;

    @ObfuscatedName("fd.r([BZI)Ljava/lang/Object;")
    public static Object method3071(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2441) {
            try {
                class183 var2 = new class183();
                var2.method3320(arg0);
                return var2;
            } catch (Throwable var4) {
                field2441 = true;
            }
        }
        return arg1 ? method1027(arg0) : arg0;
    }

    @ObfuscatedName("gj.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method3648(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1027(var2) : var2;
        } else if (arg0 instanceof class189) {
            class189 var3 = (class189) arg0;
            return var3.method3321();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bm.d([BI)[B")
    public static byte[] method1027(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gf.f(B)[B")
    public abstract byte[] method3321();

    @ObfuscatedName("gf.l([BI)V")
    public abstract void method3320(byte[] arg0);
}
