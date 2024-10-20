package deob;

@ObfuscatedName("gm")
public abstract class class197 {

    @ObfuscatedName("gm.q")
    public static boolean field2564 = false;

    @ObfuscatedName("gl.l([BZI)Ljava/lang/Object;")
    public static Object method3226(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2564) {
            try {
                class192 var2 = new class192();
                var2.method3217(arg0);
                return var2;
            } catch (Throwable var7) {
                field2564 = true;
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

    @ObfuscatedName("ip.y(Ljava/lang/Object;ZB)[B")
    public static byte[] method4136(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class197) {
            class197 var6 = (class197) arg0;
            return var6.method3218();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gm.b(B)[B")
    public abstract byte[] method3218();

    @ObfuscatedName("gm.q([BI)V")
    public abstract void method3217(byte[] arg0);
}
