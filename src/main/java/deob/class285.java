package deob;

@ObfuscatedName("jv")
public abstract class class285 {

    @ObfuscatedName("ek.c(Ljava/lang/Object;ZB)[B")
    public static byte[] method2859(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2666(var2) : var2;
        } else if (arg0 instanceof class285) {
            class285 var3 = (class285) arg0;
            return var3.method5088();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.p([BI)[B")
    public static byte[] method2666(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jv.f(B)[B")
    public abstract byte[] method5088();

    @ObfuscatedName("jv.n([BB)V")
    public abstract void method5094(byte[] arg0);
}
