package deob;

@ObfuscatedName("fi")
public abstract class class164 {

    @ObfuscatedName("fi.d")
    public static boolean field2315 = false;

    @ObfuscatedName("bx.q([BZB)Ljava/lang/Object;")
    public static Object method1394(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2315) {
            try {
                class159 var2 = new class159();
                var2.method2756(arg0);
                return var2;
            } catch (Throwable var4) {
                field2315 = true;
            }
        }
        return arg1 ? method692(arg0) : arg0;
    }

    @ObfuscatedName("ak.l(Ljava/lang/Object;ZB)[B")
    public static byte[] method865(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method692(var2) : var2;
        } else if (arg0 instanceof class164) {
            class164 var3 = (class164) arg0;
            return var3.method2755();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aq.y([BB)[B")
    public static byte[] method692(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fi.d([BI)V")
    public abstract void method2756(byte[] arg0);

    @ObfuscatedName("fi.n(I)[B")
    public abstract byte[] method2755();
}
