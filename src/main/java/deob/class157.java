package deob;

@ObfuscatedName("fa")
public abstract class class157 {

    @ObfuscatedName("fa.e")
    public static boolean field2107 = false;

    @ObfuscatedName("ay.k([BZI)Ljava/lang/Object;")
    public static Object method844(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2107) {
            try {
                class152 var2 = new class152();
                var2.method2645(arg0);
                return var2;
            } catch (Throwable var4) {
                field2107 = true;
            }
        }
        return arg1 ? method1844(arg0) : arg0;
    }

    @ObfuscatedName("i.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method202(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1844(var2) : var2;
        } else if (arg0 instanceof class157) {
            class157 var3 = (class157) arg0;
            return var3.method2644();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cx.a([BI)[B")
    public static byte[] method1844(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fa.b(B)[B")
    public abstract byte[] method2644();

    @ObfuscatedName("fa.e([BI)V")
    public abstract void method2645(byte[] arg0);
}
