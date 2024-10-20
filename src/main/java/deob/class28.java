package deob;

@ObfuscatedName("dv")
public abstract class class28 {

    @ObfuscatedName("dv.j")
    public static boolean field159 = false;

    @ObfuscatedName("dv.t(I)[B")
    public abstract byte[] method302();

    @ObfuscatedName("dv.h([BB)V")
    public abstract void method307(byte[] arg0);

    @ObfuscatedName("dr.o([BI)[B")
    public static byte[] method768(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("b.j([BZI)Ljava/lang/Object;")
    public static Object method859(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field159) {
            try {
                class32 var2 = new class32();
                var2.method307(arg0);
                return var2;
            } catch (Throwable var4) {
                field159 = true;
            }
        }
        return arg1 ? method768(arg0) : arg0;
    }

    @ObfuscatedName("af.p(Ljava/lang/Object;ZS)[B")
    public static byte[] method3574(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method768(var2) : var2;
        } else if (arg0 instanceof class28) {
            class28 var3 = (class28) arg0;
            return var3.method302();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
