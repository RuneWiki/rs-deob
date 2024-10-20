package deob;

@ObfuscatedName("gj")
public abstract class class184 {

    @ObfuscatedName("gj.s")
    public static boolean field2511 = false;

    @ObfuscatedName("fq.u([BZI)Ljava/lang/Object;")
    public static Object method2915(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2511) {
            try {
                class179 var2 = new class179();
                var2.method2921(arg0);
                return var2;
            } catch (Throwable var7) {
                field2511 = true;
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

    @ObfuscatedName("bx.t(Ljava/lang/Object;ZI)[B")
    public static byte[] method961(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class184) {
            class184 var6 = (class184) arg0;
            return var6.method2919();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gj.b(B)[B")
    public abstract byte[] method2919();

    @ObfuscatedName("gj.s([BI)V")
    public abstract void method2921(byte[] arg0);
}
