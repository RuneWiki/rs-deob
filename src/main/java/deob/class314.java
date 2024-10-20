package deob;

@ObfuscatedName("lh")
public abstract class class314 {

    @ObfuscatedName("it.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method4852(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            if (arg1) {
                int var3 = var2.length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var2, 0, var4, 0, var3);
                return var4;
            } else {
                return var2;
            }
        } else if (arg0 instanceof class314) {
            class314 var6 = (class314) arg0;
            return var6.method5862();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("lh.w(I)[B")
    public abstract byte[] method5862();

    @ObfuscatedName("lh.v([BI)V")
    public abstract void method5863(byte[] arg0);
}
