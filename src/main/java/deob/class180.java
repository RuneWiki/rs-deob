package deob;

@ObfuscatedName("fc")
public abstract class class180 {

    @ObfuscatedName("fc.c")
    public static boolean field2431 = false;

    @ObfuscatedName("k.p([BZI)Ljava/lang/Object;")
    public static Object method73(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2431) {
            try {
                class175 var2 = new class175();
                var2.method2942(arg0);
                return var2;
            } catch (Throwable var4) {
                field2431 = true;
            }
        }
        return arg1 ? method94(arg0) : arg0;
    }

    @ObfuscatedName("ck.d(Ljava/lang/Object;ZI)[B")
    public static byte[] method1638(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method94(var2) : var2;
        } else if (arg0 instanceof class180) {
            class180 var3 = (class180) arg0;
            return var3.method2943();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("r.n([BB)[B")
    public static byte[] method94(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fc.s(B)[B")
    public abstract byte[] method2943();

    @ObfuscatedName("fc.c([BI)V")
    public abstract void method2942(byte[] arg0);
}
