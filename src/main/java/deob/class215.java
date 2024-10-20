package deob;

@ObfuscatedName("hh")
public abstract class class215 {

    @ObfuscatedName("hh.f([BZI)Ljava/lang/Object;")
    public static Object method3699(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class216 var2 = new class216();
            var2.method3701(arg0);
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

    @ObfuscatedName("fh.b(Ljava/lang/Object;ZI)[B")
    public static byte[] method3393(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class215) {
            class215 var6 = (class215) arg0;
            return var6.method3700();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("hh.l(B)[B")
    public abstract byte[] method3700();

    @ObfuscatedName("hh.m([BB)V")
    public abstract void method3701(byte[] arg0);
}
