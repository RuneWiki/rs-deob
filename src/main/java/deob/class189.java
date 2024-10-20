package deob;

@ObfuscatedName("gz")
public abstract class class189 {

    @ObfuscatedName("gz.h")
    public static boolean field2426 = false;

    @ObfuscatedName("gs.d([BZI)Ljava/lang/Object;")
    public static Object method3562(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2426) {
            try {
                class183 var2 = new class183();
                var2.method3298(arg0);
                return var2;
            } catch (Throwable var7) {
                field2426 = true;
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

    @ObfuscatedName("ab.n(Ljava/lang/Object;ZB)[B")
    public static byte[] method650(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class189) {
            class189 var6 = (class189) arg0;
            return var6.method3299();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gz.h([BI)V")
    public abstract void method3298(byte[] arg0);

    @ObfuscatedName("gz.f(I)[B")
    public abstract byte[] method3299();
}
