package deob;

@ObfuscatedName("gx")
public abstract class class188 {

    @ObfuscatedName("gx.i")
    public static boolean field2508 = false;

    @ObfuscatedName("fh.j([BZI)Ljava/lang/Object;")
    public static Object method3015(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2508) {
            try {
                class183 var2 = new class183();
                var2.method3101(arg0);
                return var2;
            } catch (Throwable var7) {
                field2508 = true;
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

    @ObfuscatedName("by.a(Ljava/lang/Object;ZB)[B")
    public static byte[] method685(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class188) {
            class188 var6 = (class188) arg0;
            return var6.method3100();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gx.p(I)[B")
    public abstract byte[] method3100();

    @ObfuscatedName("gx.i([BI)V")
    public abstract void method3101(byte[] arg0);
}
