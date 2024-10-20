package deob;

@ObfuscatedName("kh")
public abstract class class307 {

    @ObfuscatedName("el.a([BZI)Ljava/lang/Object;")
    public static Object method2844(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class309 var2 = new class309();
            var2.method5665(arg0);
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

    @ObfuscatedName("lq.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method5701(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class307) {
            class307 var6 = (class307) arg0;
            return var6.method5672();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("kh.x([BI)V")
    public abstract void method5665(byte[] arg0);

    @ObfuscatedName("kh.c(B)[B")
    public abstract byte[] method5672();
}
