package deob;

@ObfuscatedName("hq")
public abstract class class215 {

    @ObfuscatedName("iw.o(Ljava/lang/Object;ZB)[B")
    public static byte[] method4182(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3400(var2) : var2;
        } else if (arg0 instanceof class215) {
            class215 var3 = (class215) arg0;
            return var3.method3675();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("go.q([BI)[B")
    public static byte[] method3400(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("hq.j(I)[B")
    public abstract byte[] method3675();

    @ObfuscatedName("hq.p([BB)V")
    public abstract void method3682(byte[] arg0);
}
