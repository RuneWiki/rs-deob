package deob;

@ObfuscatedName("gj")
public abstract class class188 {

    @ObfuscatedName("gj.v")
    public static boolean field2547 = false;

    @ObfuscatedName("br.f([BZI)Ljava/lang/Object;")
    public static Object method1074(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2547) {
            try {
                class183 var2 = new class183();
                var2.method2994(arg0);
                return var2;
            } catch (Throwable var4) {
                field2547 = true;
            }
        }
        return arg1 ? method2808(arg0) : arg0;
    }

    @ObfuscatedName("i.u(Ljava/lang/Object;ZB)[B")
    public static byte[] method108(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2808(var2) : var2;
        } else if (arg0 instanceof class188) {
            class188 var3 = (class188) arg0;
            return var3.method2998();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fr.t([BI)[B")
    public static byte[] method2808(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gj.n(I)[B")
    public abstract byte[] method2998();

    @ObfuscatedName("gj.v([BB)V")
    public abstract void method2994(byte[] arg0);
}
