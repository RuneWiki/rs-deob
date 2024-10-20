package deob;

@ObfuscatedName("na")
public abstract class class349 {

    @ObfuscatedName("gu.am([BZB)Ljava/lang/Object;")
    public static Object method3191(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class351 var2 = new class351();
            var2.method6260(arg0);
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

    @ObfuscatedName("hf.ap(Ljava/lang/Object;ZI)[B")
    public static byte[] method3515(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class349) {
            class349 var6 = (class349) arg0;
            return var6.method6265();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("na.aj([BI)V")
    public abstract void method6260(byte[] arg0);

    @ObfuscatedName("na.af(I)[B")
    public abstract byte[] method6265();
}
