package deob;

@ObfuscatedName("gd")
public abstract class class188 {

    @ObfuscatedName("gd.w")
    public static boolean field2536 = false;

    @ObfuscatedName("ad.t([BZB)Ljava/lang/Object;")
    public static Object method205(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2536) {
            try {
                class183 var2 = new class183();
                var2.method2939(arg0);
                return var2;
            } catch (Throwable var4) {
                field2536 = true;
            }
        }
        return arg1 ? method580(arg0) : arg0;
    }

    @ObfuscatedName("dc.f(Ljava/lang/Object;ZB)[B")
    public static byte[] method2201(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method580(var2) : var2;
        } else if (arg0 instanceof class188) {
            class188 var3 = (class188) arg0;
            return var3.method2937();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ae.g([BI)[B")
    public static byte[] method580(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gd.a(I)[B")
    public abstract byte[] method2937();

    @ObfuscatedName("gd.w([BI)V")
    public abstract void method2939(byte[] arg0);
}
