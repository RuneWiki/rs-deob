package deob;

@ObfuscatedName("fe")
public abstract class class180 {

    @ObfuscatedName("fe.o")
    public static boolean field2438 = false;

    @ObfuscatedName("cz.j([BZB)Ljava/lang/Object;")
    public static Object method1554(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2438) {
            try {
                class175 var2 = new class175();
                var2.method2861(arg0);
                return var2;
            } catch (Throwable var7) {
                field2438 = true;
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

    @ObfuscatedName("cq.m(Ljava/lang/Object;ZI)[B")
    public static byte[] method1530(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class180) {
            class180 var6 = (class180) arg0;
            return var6.method2860();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fe.o([BI)V")
    public abstract void method2861(byte[] arg0);

    @ObfuscatedName("fe.w(I)[B")
    public abstract byte[] method2860();
}
