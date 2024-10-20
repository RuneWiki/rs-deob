package deob;

@ObfuscatedName("fc")
public abstract class class177 {

    @ObfuscatedName("fc.q")
    public static boolean field2385 = false;

    @ObfuscatedName("bo.i([BZB)Ljava/lang/Object;")
    public static Object method1056(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2385) {
            try {
                class172 var2 = new class172();
                var2.method2890(arg0);
                return var2;
            } catch (Throwable var4) {
                field2385 = true;
            }
        }
        return arg1 ? method3388(arg0) : arg0;
    }

    @ObfuscatedName("fv.r(Ljava/lang/Object;ZS)[B")
    public static byte[] method2762(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3388(var2) : var2;
        } else if (arg0 instanceof class177) {
            class177 var3 = (class177) arg0;
            return var3.method2895();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gk.g([BI)[B")
    public static byte[] method3388(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fc.q([BB)V")
    public abstract void method2890(byte[] arg0);

    @ObfuscatedName("fc.d(I)[B")
    public abstract byte[] method2895();
}
