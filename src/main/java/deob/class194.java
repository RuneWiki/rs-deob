package deob;

@ObfuscatedName("gr")
public abstract class class194 {

    @ObfuscatedName("gr.h")
    public static boolean field2446 = false;

    @ObfuscatedName("bu.j([BZB)Ljava/lang/Object;")
    public static Object method945(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2446) {
            try {
                class188 var2 = new class188();
                var2.method3486(arg0);
                return var2;
            } catch (Throwable var4) {
                field2446 = true;
            }
        }
        return arg1 ? method3193(arg0) : arg0;
    }

    @ObfuscatedName("ev.d(Ljava/lang/Object;ZI)[B")
    public static byte[] method3079(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3193(var2) : var2;
        } else if (arg0 instanceof class194) {
            class194 var3 = (class194) arg0;
            return var3.method3489();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("er.i([BI)[B")
    public static byte[] method3193(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gr.n(I)[B")
    public abstract byte[] method3489();

    @ObfuscatedName("gr.h([BB)V")
    public abstract void method3486(byte[] arg0);
}
