package deob;

@ObfuscatedName("kw")
public abstract class class310 {

    @ObfuscatedName("ha.h(Ljava/lang/Object;ZI)[B")
    public static byte[] method4233(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method7629(var2) : var2;
        } else if (arg0 instanceof class310) {
            class310 var3 = (class310) arg0;
            return var3.method5747();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("qk.e([BI)[B")
    public static byte[] method7629(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("kw.v(B)[B")
    public abstract byte[] method5747();

    @ObfuscatedName("kw.x([BI)V")
    public abstract void method5748(byte[] arg0);
}
