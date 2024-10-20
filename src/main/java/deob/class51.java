package deob;

@ObfuscatedName("ds")
public abstract class class51 {

    @ObfuscatedName("ds.b")
    public static boolean field545 = false;

    @ObfuscatedName("ds.w(S)[B")
    public abstract byte[] method593();

    @ObfuscatedName("ds.t([BB)V")
    public abstract void method595(byte[] arg0);

    @ObfuscatedName("m.k([BI)[B")
    public static byte[] method1149(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ar.b([BZI)Ljava/lang/Object;")
    public static Object method2870(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field545) {
            try {
                class43 var2 = new class43();
                var2.method595(arg0);
                return var2;
            } catch (Throwable var4) {
                field545 = true;
            }
        }
        return arg1 ? method1149(arg0) : arg0;
    }
}
