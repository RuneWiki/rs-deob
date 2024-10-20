package deob;

@ObfuscatedName("gl")
public abstract class class206 {

    @ObfuscatedName("en.s([BZB)Ljava/lang/Object;")
    public static Object method3022(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class207 var2 = new class207();
            var2.method3586(arg0);
            return var2;
        } else if (arg1) {
            int var3 = arg0.length;
            byte[] var4 = new byte[var3];
            System.arraycopy(arg0, 0, var4, 0, var3);
            return var4;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ap.j(Ljava/lang/Object;ZI)[B")
    public static byte[] method637(Object arg0, boolean arg1) {
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
            return var6.method3585();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gl.i(I)[B")
    public abstract byte[] method3585();

    @ObfuscatedName("gl.k([BI)V")
    public abstract void method3586(byte[] arg0);
}
