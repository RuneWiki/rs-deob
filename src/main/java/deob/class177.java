package deob;

@ObfuscatedName("fx")
public abstract class class177 {

    @ObfuscatedName("fx.o")
    public static boolean field2377 = false;

    @ObfuscatedName("et.v([BZI)Ljava/lang/Object;")
    public static Object method2607(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2377) {
            try {
                class172 var2 = new class172();
                var2.method2832(arg0);
                return var2;
            } catch (Throwable var7) {
                field2377 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("av.h(Ljava/lang/Object;ZI)[B")
    public static byte[] method233(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2602(var2) : var2;
        } else if (arg0 instanceof class177) {
            class177 var3 = (class177) arg0;
            return var3.method2840();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ev.t([BI)[B")
    public static byte[] method2602(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fx.c(I)[B")
    public abstract byte[] method2840();

    @ObfuscatedName("fx.o([BI)V")
    public abstract void method2832(byte[] arg0);
}
