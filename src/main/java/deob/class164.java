package deob;

@ObfuscatedName("fs")
public abstract class class164 {

    @ObfuscatedName("fs.y")
    public static boolean field2285 = false;

    @ObfuscatedName("s.j([BZI)Ljava/lang/Object;")
    public static Object method126(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2285) {
            try {
                class159 var2 = new class159();
                var2.method2711(arg0);
                return var2;
            } catch (Throwable var7) {
                field2285 = true;
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

    @ObfuscatedName("as.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method679(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class164) {
            class164 var6 = (class164) arg0;
            return var6.method2709();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fs.k(I)[B")
    public abstract byte[] method2709();

    @ObfuscatedName("fs.y([BI)V")
    public abstract void method2711(byte[] arg0);
}
