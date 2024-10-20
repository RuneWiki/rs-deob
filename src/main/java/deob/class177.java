package deob;

@ObfuscatedName("fz")
public abstract class class177 {

    @ObfuscatedName("fz.p")
    public static boolean field2420 = false;

    @ObfuscatedName("bd.g([BZI)Ljava/lang/Object;")
    public static Object method685(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2420) {
            try {
                class172 var2 = new class172();
                var2.method2895(arg0);
                return var2;
            } catch (Throwable var4) {
                field2420 = true;
            }
        }
        return arg1 ? method687(arg0) : arg0;
    }

    @ObfuscatedName("iq.e(Ljava/lang/Object;ZI)[B")
    public static byte[] method4060(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method687(var2) : var2;
        } else if (arg0 instanceof class177) {
            class177 var3 = (class177) arg0;
            return var3.method2894();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bc.o([BB)[B")
    public static byte[] method687(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fz.n(I)[B")
    public abstract byte[] method2894();

    @ObfuscatedName("fz.p([BB)V")
    public abstract void method2895(byte[] arg0);
}
