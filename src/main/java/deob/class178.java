package deob;

@ObfuscatedName("fm")
public abstract class class178 {

    @ObfuscatedName("fm.j")
    public static boolean field2415 = false;

    @ObfuscatedName("ah.q([BZB)Ljava/lang/Object;")
    public static Object method557(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2415) {
            try {
                class173 var2 = new class173();
                var2.method2973(arg0);
                return var2;
            } catch (Throwable var7) {
                field2415 = true;
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

    @ObfuscatedName("fh.b(Ljava/lang/Object;ZS)[B")
    public static byte[] method2884(Object arg0, boolean arg1) {
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
            return var6.method2970();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fm.i(S)[B")
    public abstract byte[] method2970();

    @ObfuscatedName("fm.j([BI)V")
    public abstract void method2973(byte[] arg0);
}
