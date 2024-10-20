package deob;

@ObfuscatedName("gr")
public abstract class class199 {

    @ObfuscatedName("gr.q")
    public static boolean field2582 = false;

    @ObfuscatedName("hi.x([BZB)Ljava/lang/Object;")
    public static Object method3839(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2582) {
            try {
                class193 var2 = new class193();
                var2.method3211(arg0);
                return var2;
            } catch (Throwable var7) {
                field2582 = true;
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

    @ObfuscatedName("cb.p(Ljava/lang/Object;ZI)[B")
    public static byte[] method1577(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class199) {
            class199 var6 = (class199) arg0;
            return var6.method3210();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gr.t(B)[B")
    public abstract byte[] method3210();

    @ObfuscatedName("gr.q([BI)V")
    public abstract void method3211(byte[] arg0);
}
