package deob;

@ObfuscatedName("fu")
public abstract class class157 {

    @ObfuscatedName("fu.n")
    public static boolean field2112 = false;

    @ObfuscatedName("df.k([BZI)Ljava/lang/Object;")
    public static Object method2059(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2112) {
            try {
                class152 var2 = new class152();
                var2.method2675(arg0);
                return var2;
            } catch (Throwable var7) {
                field2112 = true;
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

    @ObfuscatedName("bb.f(Ljava/lang/Object;ZS)[B")
    public static byte[] method1195(Object arg0, boolean arg1) {
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
            return var6.method2678();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fu.n([BI)V")
    public abstract void method2675(byte[] arg0);

    @ObfuscatedName("fu.x(B)[B")
    public abstract byte[] method2678();
}
