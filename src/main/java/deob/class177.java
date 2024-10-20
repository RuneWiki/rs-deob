package deob;

@ObfuscatedName("fa")
public abstract class class177 {

    @ObfuscatedName("fa.s")
    public static boolean field2411 = false;

    @ObfuscatedName("bv.e([BZI)Ljava/lang/Object;")
    public static Object method847(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2411) {
            try {
                class172 var2 = new class172();
                var2.method2949(arg0);
                return var2;
            } catch (Throwable var4) {
                field2411 = true;
            }
        }
        return arg1 ? method1772(arg0) : arg0;
    }

    @ObfuscatedName("fk.d(Ljava/lang/Object;ZI)[B")
    public static byte[] method2890(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1772(var2) : var2;
        } else if (arg0 instanceof class177) {
            class177 var3 = (class177) arg0;
            return var3.method2948();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cv.x([BI)[B")
    public static byte[] method1772(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fa.w(I)[B")
    public abstract byte[] method2948();

    @ObfuscatedName("fa.s([BI)V")
    public abstract void method2949(byte[] arg0);
}
