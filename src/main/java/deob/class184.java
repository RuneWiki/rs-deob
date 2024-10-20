package deob;

@ObfuscatedName("gc")
public abstract class class184 {

    @ObfuscatedName("gc.x")
    public static boolean field2516 = false;

    @ObfuscatedName("e.b([BZB)Ljava/lang/Object;")
    public static Object method148(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2516) {
            try {
                class179 var2 = new class179();
                var2.method3011(arg0);
                return var2;
            } catch (Throwable var7) {
                field2516 = true;
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

    @ObfuscatedName("av.t(Ljava/lang/Object;ZI)[B")
    public static byte[] method641(Object arg0, boolean arg1) {
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
            return var6.method3012();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gc.x([BB)V")
    public abstract void method3011(byte[] arg0);

    @ObfuscatedName("gc.d(I)[B")
    public abstract byte[] method3012();
}
