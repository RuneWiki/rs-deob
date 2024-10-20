package deob;

@ObfuscatedName("gh")
public abstract class class199 {

    @ObfuscatedName("gh.i")
    public static boolean field2593 = false;

    @ObfuscatedName("bp.p([BZS)Ljava/lang/Object;")
    public static Object method954(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2593) {
            try {
                class193 var2 = new class193();
                var2.method3200(arg0);
                return var2;
            } catch (Throwable var4) {
                field2593 = true;
            }
        }
        return arg1 ? method2867(arg0) : arg0;
    }

    @ObfuscatedName("ao.w(Ljava/lang/Object;ZB)[B")
    public static byte[] method481(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2867(var2) : var2;
        } else if (arg0 instanceof class199) {
            class199 var3 = (class199) arg0;
            return var3.method3198();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eu.r([BI)[B")
    public static byte[] method2867(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gh.c(I)[B")
    public abstract byte[] method3198();

    @ObfuscatedName("gh.i([BB)V")
    public abstract void method3200(byte[] arg0);
}
