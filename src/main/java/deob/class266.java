package deob;

@ObfuscatedName("jt")
public abstract class class266 {

    @ObfuscatedName("be.i(Ljava/lang/Object;ZI)[B")
    public static byte[] method1907(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2796(var2) : var2;
        } else if (arg0 instanceof class266) {
            class266 var3 = (class266) arg0;
            return var3.method4625();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fi.w([BI)[B")
    public static byte[] method2796(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jt.s(B)[B")
    public abstract byte[] method4625();

    @ObfuscatedName("jt.a([BB)V")
    public abstract void method4626(byte[] arg0);
}
