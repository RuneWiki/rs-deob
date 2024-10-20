package deob;

@ObfuscatedName("jp")
public abstract class class266 {

    @ObfuscatedName("hc.n([BZB)Ljava/lang/Object;")
    public static Object method4122(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class268 var2 = new class268();
            var2.method4608(arg0);
            return var2;
        } else if (arg1) {
            return method2784(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ff.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method2917(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2784(var2) : var2;
        } else if (arg0 instanceof class266) {
            class266 var3 = (class266) arg0;
            return var3.method4615();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fv.m([BI)[B")
    public static byte[] method2784(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jp.o([BS)V")
    public abstract void method4608(byte[] arg0);

    @ObfuscatedName("jp.k(S)[B")
    public abstract byte[] method4615();
}
