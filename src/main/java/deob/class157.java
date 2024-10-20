package deob;

@ObfuscatedName("fj")
public abstract class class157 {

    @ObfuscatedName("fj.c")
    public static boolean field2126 = false;

    @ObfuscatedName("k.x([BZI)Ljava/lang/Object;")
    public static Object method74(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2126) {
            try {
                class152 var2 = new class152();
                var2.method2522(arg0);
                return var2;
            } catch (Throwable var4) {
                field2126 = true;
            }
        }
        return arg1 ? method2457(arg0) : arg0;
    }

    @ObfuscatedName("fz.r(Ljava/lang/Object;ZI)[B")
    public static byte[] method2865(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2457(var2) : var2;
        } else if (arg0 instanceof class157) {
            class157 var3 = (class157) arg0;
            return var3.method2521();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eo.n([BI)[B")
    public static byte[] method2457(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fj.c([BB)V")
    public abstract void method2522(byte[] arg0);

    @ObfuscatedName("fj.s(B)[B")
    public abstract byte[] method2521();
}
