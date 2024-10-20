package deob;

@ObfuscatedName("gg")
public abstract class class199 {

    @ObfuscatedName("gg.z")
    public static boolean field2600 = false;

    @ObfuscatedName("fn.t([BZI)Ljava/lang/Object;")
    public static Object method3158(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2600) {
            try {
                class193 var2 = new class193();
                var2.method3236(arg0);
                return var2;
            } catch (Throwable var4) {
                field2600 = true;
            }
        }
        return arg1 ? method49(arg0) : arg0;
    }

    @ObfuscatedName("fp.i(Ljava/lang/Object;ZS)[B")
    public static byte[] method3096(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method49(var2) : var2;
        } else if (arg0 instanceof class199) {
            class199 var3 = (class199) arg0;
            return var3.method3230();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("x.u([BI)[B")
    public static byte[] method49(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gg.d(B)[B")
    public abstract byte[] method3230();

    @ObfuscatedName("gg.z([BI)V")
    public abstract void method3236(byte[] arg0);
}
