package deob;

@ObfuscatedName("em")
public abstract class class133 {

    @ObfuscatedName("em.c")
    public static boolean field1982 = false;

    @ObfuscatedName("m.p([BZB)Ljava/lang/Object;")
    public static Object method258(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field1982) {
            try {
                class128 var2 = new class128();
                var2.method2208(arg0);
                return var2;
            } catch (Throwable var4) {
                field1982 = true;
            }
        }
        return arg1 ? method2452(arg0) : arg0;
    }

    @ObfuscatedName("cg.u(Ljava/lang/Object;ZB)[B")
    public static byte[] method1814(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2452(var2) : var2;
        } else if (arg0 instanceof class133) {
            class133 var3 = (class133) arg0;
            return var3.method2206();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("eg.w([BB)[B")
    public static byte[] method2452(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("em.d(B)[B")
    public abstract byte[] method2206();

    @ObfuscatedName("em.c([BI)V")
    public abstract void method2208(byte[] arg0);
}
