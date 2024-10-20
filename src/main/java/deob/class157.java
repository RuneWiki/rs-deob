package deob;

@ObfuscatedName("ff")
public abstract class class157 {

    @ObfuscatedName("ff.g")
    public static boolean field2114 = false;

    @ObfuscatedName("ah.o([BZI)Ljava/lang/Object;")
    public static Object method652(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2114) {
            try {
                class152 var2 = new class152();
                var2.method2570(arg0);
                return var2;
            } catch (Throwable var7) {
                field2114 = true;
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

    @ObfuscatedName("x.a(Ljava/lang/Object;ZI)[B")
    public static byte[] method33(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class157) {
            class157 var6 = (class157) arg0;
            return var6.method2569();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ff.p(I)[B")
    public abstract byte[] method2569();

    @ObfuscatedName("ff.g([BB)V")
    public abstract void method2570(byte[] arg0);
}
