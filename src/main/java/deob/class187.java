package deob;

@ObfuscatedName("gi")
public abstract class class187 {

    @ObfuscatedName("gi.m")
    public static boolean field2393 = false;

    @ObfuscatedName("di.s([BZI)Ljava/lang/Object;")
    public static Object method2683(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2393) {
            try {
                class181 var2 = new class181();
                var2.method3237(arg0);
                return var2;
            } catch (Throwable var7) {
                field2393 = true;
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

    @ObfuscatedName("at.p(Ljava/lang/Object;ZI)[B")
    public static byte[] method457(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class187) {
            class187 var6 = (class187) arg0;
            return var6.method3235();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gi.w(B)[B")
    public abstract byte[] method3235();

    @ObfuscatedName("gi.m([BI)V")
    public abstract void method3237(byte[] arg0);
}
