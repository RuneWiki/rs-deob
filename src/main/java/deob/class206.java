package deob;

@ObfuscatedName("gp")
public abstract class class206 {

    @ObfuscatedName("ka.u(Ljava/lang/Object;ZB)[B")
    public static byte[] method4972(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1755(var2) : var2;
        } else if (arg0 instanceof class206) {
            class206 var3 = (class206) arg0;
            return var3.method3623();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bc.f([BI)[B")
    public static byte[] method1755(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gp.b(S)[B")
    public abstract byte[] method3623();

    @ObfuscatedName("gp.g([BI)V")
    public abstract void method3632(byte[] arg0);
}
