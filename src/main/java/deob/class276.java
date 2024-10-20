package deob;

@ObfuscatedName("jc")
public abstract class class276 {

    @ObfuscatedName("bo.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method1938(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method4496(var2) : var2;
        } else if (arg0 instanceof class276) {
            class276 var3 = (class276) arg0;
            return var3.method4774();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ij.l([BS)[B")
    public static byte[] method4496(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jc.s(I)[B")
    public abstract byte[] method4774();

    @ObfuscatedName("jc.e([BB)V")
    public abstract void method4776(byte[] arg0);
}
