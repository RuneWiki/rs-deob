package deob;

@ObfuscatedName("dp")
public abstract class class50 {

    @ObfuscatedName("dp.v")
    public static boolean field560 = false;

    @ObfuscatedName("dp.i(I)[B")
    public abstract byte[] method858();

    @ObfuscatedName("dp.m([BI)V")
    public abstract void method859(byte[] arg0);

    @ObfuscatedName("l.v([BZB)Ljava/lang/Object;")
    public static Object method1082(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field560) {
            try {
                class47 var2 = new class47();
                var2.method859(arg0);
                return var2;
            } catch (Throwable var4) {
                field560 = true;
            }
        }
        return arg1 ? method3401(arg0) : arg0;
    }

    @ObfuscatedName("client.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method1894(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3401(var2) : var2;
        } else if (arg0 instanceof class50) {
            class50 var3 = (class50) arg0;
            return var3.method858();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aa.b([BI)[B")
    public static byte[] method3401(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }
}
