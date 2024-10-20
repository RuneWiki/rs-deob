package deob;

@ObfuscatedName("bk")
public abstract class class62 {

    @ObfuscatedName("bk.q")
    public static boolean field820 = false;

    @ObfuscatedName("ah.q([BZB)Ljava/lang/Object;")
    public static Object method698(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field820) {
            try {
                class120 var2 = new class120();
                var2.method772(arg0);
                return var2;
            } catch (Throwable var4) {
                field820 = true;
            }
        }
        return arg1 ? method1336(arg0) : arg0;
    }

    @ObfuscatedName("ah.l(Ljava/lang/Object;ZB)[B")
    public static byte[] method695(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method1336(var2) : var2;
        } else if (arg0 instanceof class62) {
            class62 var3 = (class62) arg0;
            return var3.method776();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.a([BI)[B")
    public static byte[] method1336(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("bk.c([BB)V")
    public abstract void method772(byte[] arg0);

    @ObfuscatedName("bk.o(I)[B")
    public abstract byte[] method776();
}
