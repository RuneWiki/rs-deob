package deob;

@ObfuscatedName("gx")
public abstract class class206 {

    @ObfuscatedName("q.z([BZB)Ljava/lang/Object;")
    public static Object method62(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class207 var2 = new class207();
            var2.method3532(arg0);
            return var2;
        } else if (arg1) {
            return method305(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("c.n(Ljava/lang/Object;ZI)[B")
    public static byte[] method127(Object arg0, boolean arg1) {
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
            return var6.method3531();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ac.v([BB)[B")
    public static byte[] method305(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gx.u(B)[B")
    public abstract byte[] method3531();

    @ObfuscatedName("gx.r([BI)V")
    public abstract void method3532(byte[] arg0);
}
