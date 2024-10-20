package deob;

@ObfuscatedName("jr")
public abstract class class266 {

    @ObfuscatedName("u.l([BZB)Ljava/lang/Object;")
    public static Object method365(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class268 var2 = new class268();
            var2.method4650(arg0);
            return var2;
        } else if (arg1) {
            return method3567(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("gq.f([BB)[B")
    public static byte[] method3567(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jr.j(B)[B")
    public abstract byte[] method4644();

    @ObfuscatedName("jr.m([BI)V")
    public abstract void method4650(byte[] arg0);
}
