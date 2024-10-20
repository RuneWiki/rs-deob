package deob;

@ObfuscatedName("gv")
public abstract class class187 {

    @ObfuscatedName("gv.w")
    public static boolean field2366 = false;

    @ObfuscatedName("ft.e([BZI)Ljava/lang/Object;")
    public static Object method3064(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2366) {
            try {
                class181 var2 = new class181();
                var2.method3223(arg0);
                return var2;
            } catch (Throwable var4) {
                field2366 = true;
            }
        }
        return arg1 ? method996(arg0) : arg0;
    }

    @ObfuscatedName("ci.p(Ljava/lang/Object;ZB)[B")
    public static byte[] method2055(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method996(var2) : var2;
        } else if (arg0 instanceof class187) {
            class187 var3 = (class187) arg0;
            return var3.method3222();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bz.b([BB)[B")
    public static byte[] method996(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gv.z(B)[B")
    public abstract byte[] method3222();

    @ObfuscatedName("gv.w([BI)V")
    public abstract void method3223(byte[] arg0);
}
