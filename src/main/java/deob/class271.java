package deob;

@ObfuscatedName("jx")
public abstract class class271 {

    @ObfuscatedName("bm.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method1082(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2774(var2) : var2;
        } else if (arg0 instanceof class271) {
            class271 var3 = (class271) arg0;
            return var3.method4800();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eb.b([BI)[B")
    public static byte[] method2774(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jx.m([BI)V")
    public abstract void method4799(byte[] arg0);

    @ObfuscatedName("jx.p(I)[B")
    public abstract byte[] method4800();
}
