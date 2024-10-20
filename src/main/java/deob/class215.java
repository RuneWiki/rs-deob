package deob;

@ObfuscatedName("hs")
public abstract class class215 {

    @ObfuscatedName("cu.n([BZB)Ljava/lang/Object;")
    public static Object method2026(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class216 var2 = new class216();
            var2.method3774(arg0);
            return var2;
        } else if (arg1) {
            return method3198(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ct.v(Ljava/lang/Object;ZI)[B")
    public static byte[] method2225(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3198(var2) : var2;
        } else if (arg0 instanceof class215) {
            class215 var3 = (class215) arg0;
            return var3.method3784();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ed.d([BI)[B")
    public static byte[] method3198(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("hs.y([BI)V")
    public abstract void method3774(byte[] arg0);

    @ObfuscatedName("hs.c(I)[B")
    public abstract byte[] method3784();
}
