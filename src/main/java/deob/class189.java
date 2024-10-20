package deob;

@ObfuscatedName("gc")
public abstract class class189 {

    @ObfuscatedName("gc.q")
    public static boolean field2409 = false;

    @ObfuscatedName("bz.h([BZB)Ljava/lang/Object;")
    public static Object method1638(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2409) {
            try {
                class183 var2 = new class183();
                var2.method3220(arg0);
                return var2;
            } catch (Throwable var4) {
                field2409 = true;
            }
        }
        return arg1 ? method1683(arg0) : arg0;
    }

    @ObfuscatedName("bs.l(Ljava/lang/Object;ZB)[B")
    public static byte[] method973(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1683(var2) : var2;
        } else if (arg0 instanceof class189) {
            class189 var3 = (class189) arg0;
            return var3.method3223();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bk.o([BB)[B")
    public static byte[] method1683(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gc.c(I)[B")
    public abstract byte[] method3223();

    @ObfuscatedName("gc.q([BI)V")
    public abstract void method3220(byte[] arg0);
}
