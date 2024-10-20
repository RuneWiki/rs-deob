package deob;

@ObfuscatedName("fc")
public abstract class class178 {

    @ObfuscatedName("fc.n")
    public static boolean field2402 = false;

    @ObfuscatedName("ei.k(Ljava/lang/Object;ZI)[B")
    public static byte[] method2312(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class178) {
            class178 var6 = (class178) arg0;
            return var6.method2909();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fc.e(B)[B")
    public abstract byte[] method2909();

    @ObfuscatedName("fc.n([BI)V")
    public abstract void method2910(byte[] arg0);
}
