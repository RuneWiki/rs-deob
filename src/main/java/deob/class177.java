package deob;

@ObfuscatedName("fb")
public abstract class class177 {

    @ObfuscatedName("fb.m")
    public static boolean field2429 = false;

    @ObfuscatedName("h.o([BZI)Ljava/lang/Object;")
    public static Object method157(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2429) {
            try {
                class172 var2 = new class172();
                var2.method2784(arg0);
                return var2;
            } catch (Throwable var7) {
                field2429 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("hb.q(Ljava/lang/Object;ZI)[B")
    public static byte[] method3688(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class177) {
            class177 var6 = (class177) arg0;
            return var6.method2785();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fb.p(S)[B")
    public abstract byte[] method2785();

    @ObfuscatedName("fb.m([BB)V")
    public abstract void method2784(byte[] arg0);
}
