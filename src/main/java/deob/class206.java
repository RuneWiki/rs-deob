package deob;

@ObfuscatedName("gz")
public abstract class class206 {

    @ObfuscatedName("km.q(Ljava/lang/Object;ZI)[B")
    public static byte[] method5402(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class206) {
            class206 var6 = (class206) arg0;
            return var6.method3568();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gz.e(I)[B")
    public abstract byte[] method3568();

    @ObfuscatedName("gz.p([BI)V")
    public abstract void method3569(byte[] arg0);
}
