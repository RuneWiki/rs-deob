package deob;

@ObfuscatedName("gw")
public abstract class class189 {

    @ObfuscatedName("gw.s")
    public static boolean field2411 = false;

    @ObfuscatedName("eu.z([BZI)Ljava/lang/Object;")
    public static Object method2897(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2411) {
            try {
                class183 var2 = new class183();
                var2.method3245(arg0);
                return var2;
            } catch (Throwable var4) {
                field2411 = true;
            }
        }
        return arg1 ? method2861(arg0) : arg0;
    }

    @ObfuscatedName("gw.e(Ljava/lang/Object;ZI)[B")
    public static byte[] method3528(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2861(var2) : var2;
        } else if (arg0 instanceof class189) {
            class189 var3 = (class189) arg0;
            return var3.method3244();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("en.q([BI)[B")
    public static byte[] method2861(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gw.v(I)[B")
    public abstract byte[] method3244();

    @ObfuscatedName("gw.s([BB)V")
    public abstract void method3245(byte[] arg0);
}
