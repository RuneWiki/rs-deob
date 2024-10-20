package deob;

@ObfuscatedName("gi")
public abstract class class189 {

    @ObfuscatedName("gi.c")
    public static boolean field2408 = false;

    @ObfuscatedName("bt.s([BZI)Ljava/lang/Object;")
    public static Object method1701(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2408) {
            try {
                class183 var2 = new class183();
                var2.method3244(arg0);
                return var2;
            } catch (Throwable var7) {
                field2408 = true;
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

    @ObfuscatedName("cw.v(Ljava/lang/Object;ZI)[B")
    public static byte[] method1921(Object arg0, boolean arg1) {
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
            return var6.method3243();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gi.y(I)[B")
    public abstract byte[] method3243();

    @ObfuscatedName("gi.c([BI)V")
    public abstract void method3244(byte[] arg0);
}
