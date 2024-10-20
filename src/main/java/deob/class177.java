package deob;

@ObfuscatedName("fe")
public abstract class class177 {

    @ObfuscatedName("fe.h")
    public static boolean field2406 = false;

    @ObfuscatedName("ag.b([BZB)Ljava/lang/Object;")
    public static Object method488(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2406) {
            try {
                class172 var2 = new class172();
                var2.method2903(arg0);
                return var2;
            } catch (Throwable var4) {
                field2406 = true;
            }
        }
        return arg1 ? method36(arg0) : arg0;
    }

    @ObfuscatedName("a.o([BI)[B")
    public static byte[] method36(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fe.i(B)[B")
    public abstract byte[] method2904();

    @ObfuscatedName("fe.h([BI)V")
    public abstract void method2903(byte[] arg0);
}
