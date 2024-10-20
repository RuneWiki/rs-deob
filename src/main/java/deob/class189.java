package deob;

@ObfuscatedName("ga")
public abstract class class189 {

    @ObfuscatedName("ga.r")
    public static boolean field2438 = false;

    @ObfuscatedName("z.j([BZI)Ljava/lang/Object;")
    public static Object method311(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2438) {
            try {
                class183 var2 = new class183();
                var2.method3438(arg0);
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

    @ObfuscatedName("fa.x(Ljava/lang/Object;ZB)[B")
    public static byte[] method3271(Object arg0, boolean arg1) {
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
            return var6.method3437();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ga.g(S)[B")
    public abstract byte[] method3437();

    @ObfuscatedName("ga.r([BI)V")
    public abstract void method3438(byte[] arg0);
}
