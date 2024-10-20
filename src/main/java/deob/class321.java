package deob;

@ObfuscatedName("mx")
public abstract class class321 {

    @ObfuscatedName("ef.af([BZI)Ljava/lang/Object;")
    public static Object method2705(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class323 var2 = new class323();
            var2.method5950(arg0);
            return var2;
        } else if (arg1) {
            return method3051(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("hm.an(Ljava/lang/Object;ZI)[B")
    public static byte[] method3419(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class321) {
            class321 var6 = (class321) arg0;
            return var6.method5953();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fy.aw([BB)[B")
    public static byte[] method3051(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("mx.au([BI)V")
    public abstract void method5950(byte[] arg0);

    @ObfuscatedName("mx.ac(I)[B")
    public abstract byte[] method5953();
}
