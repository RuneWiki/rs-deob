package deob;

@ObfuscatedName("fq")
public abstract class class157 {

    @ObfuscatedName("fq.d")
    public static boolean field2121 = false;

    @ObfuscatedName("w.n([BZI)Ljava/lang/Object;")
    public static Object method206(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2121) {
            try {
                class152 var2 = new class152();
                var2.method2641(arg0);
                return var2;
            } catch (Throwable var4) {
                field2121 = true;
            }
        }
        return arg1 ? method208(arg0) : arg0;
    }

    @ObfuscatedName("ab.c(Ljava/lang/Object;ZB)[B")
    public static byte[] method903(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method208(var2) : var2;
        } else if (arg0 instanceof class157) {
            class157 var3 = (class157) arg0;
            return var3.method2642();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("w.o([BI)[B")
    public static byte[] method208(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fq.q(B)[B")
    public abstract byte[] method2642();

    @ObfuscatedName("fq.d([BI)V")
    public abstract void method2641(byte[] arg0);
}
