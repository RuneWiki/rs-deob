package deob;

@ObfuscatedName("hi")
public abstract class class215 {

    @ObfuscatedName("aq.x(Ljava/lang/Object;ZI)[B")
    public static byte[] method572(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method4386(var2) : var2;
        } else if (arg0 instanceof class215) {
            class215 var3 = (class215) arg0;
            return var3.method3655();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("je.m([BI)[B")
    public static byte[] method4386(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("hi.k(I)[B")
    public abstract byte[] method3655();

    @ObfuscatedName("hi.d([BB)V")
    public abstract void method3656(byte[] arg0);
}
