package deob;

@ObfuscatedName("gc")
public abstract class class206 {

    @ObfuscatedName("gd.a([BZB)Ljava/lang/Object;")
    public static Object method3654(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class207 var2 = new class207();
            var2.method3672(arg0);
            return var2;
        } else if (arg1) {
            return method1138(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("bt.n([BI)[B")
    public static byte[] method1138(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gc.q(B)[B")
    public abstract byte[] method3671();

    @ObfuscatedName("gc.v([BB)V")
    public abstract void method3672(byte[] arg0);
}
