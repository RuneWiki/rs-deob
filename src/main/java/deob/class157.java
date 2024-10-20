package deob;

@ObfuscatedName("fx")
public abstract class class157 {

    @ObfuscatedName("fx.i")
    public static boolean field2133 = false;

    @ObfuscatedName("client.n([BZI)Ljava/lang/Object;")
    public static Object method426(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2133) {
            try {
                class152 var2 = new class152();
                var2.method2642(arg0);
                return var2;
            } catch (Throwable var4) {
                field2133 = true;
            }
        }
        return arg1 ? method801(arg0) : arg0;
    }

    @ObfuscatedName("ap.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method750(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method801(var2) : var2;
        } else if (arg0 instanceof class157) {
            class157 var3 = (class157) arg0;
            return var3.method2641();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ad.w([BS)[B")
    public static byte[] method801(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fx.f(B)[B")
    public abstract byte[] method2641();

    @ObfuscatedName("fx.i([BI)V")
    public abstract void method2642(byte[] arg0);
}
