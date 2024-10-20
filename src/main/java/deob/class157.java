package deob;

@ObfuscatedName("ft")
public abstract class class157 {

    @ObfuscatedName("ft.j")
    public static boolean field2107 = false;

    @ObfuscatedName("ak.e([BZB)Ljava/lang/Object;")
    public static Object method800(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2107) {
            try {
                class152 var2 = new class152();
                var2.method2613(arg0);
                return var2;
            } catch (Throwable var4) {
                field2107 = true;
            }
        }
        return arg1 ? method843(arg0) : arg0;
    }

    @ObfuscatedName("ce.q(Ljava/lang/Object;ZI)[B")
    public static byte[] method1665(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method843(var2) : var2;
        } else if (arg0 instanceof class157) {
            class157 var3 = (class157) arg0;
            return var3.method2614();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aj.v([BI)[B")
    public static byte[] method843(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ft.j([BI)V")
    public abstract void method2613(byte[] arg0);

    @ObfuscatedName("ft.x(I)[B")
    public abstract byte[] method2614();
}
