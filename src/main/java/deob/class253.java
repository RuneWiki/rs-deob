package deob;

@ObfuscatedName("ig")
public abstract class class253 {

    @ObfuscatedName("iu.s(Ljava/lang/Object;ZI)[B")
    public static byte[] method4181(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3765(var2) : var2;
        } else if (arg0 instanceof class253) {
            class253 var3 = (class253) arg0;
            return var3.method4353();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gm.t([BI)[B")
    public static byte[] method3765(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ig.j([BI)V")
    public abstract void method4342(byte[] arg0);

    @ObfuscatedName("ig.v(B)[B")
    public abstract byte[] method4353();
}
