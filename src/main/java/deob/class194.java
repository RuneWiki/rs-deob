package deob;

@ObfuscatedName("gl")
public abstract class class194 {

    @ObfuscatedName("gl.s")
    public static boolean field2452 = false;

    @ObfuscatedName("bu.h([BZI)Ljava/lang/Object;")
    public static Object method1658(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2452) {
            try {
                class188 var2 = new class188();
                var2.method3431(arg0);
                return var2;
            } catch (Throwable var7) {
                field2452 = true;
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

    @ObfuscatedName("bl.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method1094(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class194) {
            class194 var6 = (class194) arg0;
            return var6.method3432();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gl.a(I)[B")
    public abstract byte[] method3432();

    @ObfuscatedName("gl.s([BB)V")
    public abstract void method3431(byte[] arg0);
}
