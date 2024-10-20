package deob;

@ObfuscatedName("fr")
public abstract class class177 {

    @ObfuscatedName("fr.c")
    public static boolean field2428 = false;

    @ObfuscatedName("ae.n([BZI)Ljava/lang/Object;")
    public static Object method455(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2428) {
            try {
                class172 var2 = new class172();
                var2.method2851(arg0);
                return var2;
            } catch (Throwable var4) {
                field2428 = true;
            }
        }
        return arg1 ? method1411(arg0) : arg0;
    }

    @ObfuscatedName("dz.a(Ljava/lang/Object;ZB)[B")
    public static byte[] method2146(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1411(var2) : var2;
        } else if (arg0 instanceof class177) {
            class177 var3 = (class177) arg0;
            return var3.method2844();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ce.o([BI)[B")
    public static byte[] method1411(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fr.c([BI)V")
    public abstract void method2851(byte[] arg0);

    @ObfuscatedName("fr.i(B)[B")
    public abstract byte[] method2844();
}
