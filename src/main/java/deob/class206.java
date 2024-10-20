package deob;

@ObfuscatedName("gu")
public abstract class class206 {

    @ObfuscatedName("gu.f")
    public static boolean field2464 = false;

    @ObfuscatedName("cb.o([BZB)Ljava/lang/Object;")
    public static Object method1903(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2464) {
            try {
                class200 var2 = new class200();
                var2.method3395(arg0);
                return var2;
            } catch (Throwable var7) {
                field2464 = true;
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

    @ObfuscatedName("dl.u(Ljava/lang/Object;ZB)[B")
    public static byte[] method2524(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class206) {
            class206 var6 = (class206) arg0;
            return var6.method3396();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gu.f([BI)V")
    public abstract void method3395(byte[] arg0);

    @ObfuscatedName("gu.m(I)[B")
    public abstract byte[] method3396();
}
