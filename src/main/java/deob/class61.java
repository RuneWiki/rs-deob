package deob;

@ObfuscatedName("bq")
public abstract class class61 {

    @ObfuscatedName("bq.t")
    public static boolean field796 = false;

    @ObfuscatedName("de.n(Ljava/lang/Object;ZI)[B")
    public static byte[] method1324(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class61) {
            class61 var6 = (class61) arg0;
            return var6.method767();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bq.h([BI)V")
    public abstract void method765(byte[] arg0);

    @ObfuscatedName("bq.q(B)[B")
    public abstract byte[] method767();
}
