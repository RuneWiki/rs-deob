package deob;

@ObfuscatedName("jb")
public abstract class class283 {

    @ObfuscatedName("hg.c([BZB)Ljava/lang/Object;")
    public static Object method4271(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class285 var2 = new class285();
            var2.method4966(arg0);
            return var2;
        } else if (arg1) {
            return method4929(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("kr.v(Ljava/lang/Object;ZB)[B")
    public static byte[] method5000(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method4929(var2) : var2;
        } else if (arg0 instanceof class283) {
            class283 var3 = (class283) arg0;
            return var3.method4970();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("jg.q([BB)[B")
    public static byte[] method4929(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jb.j([BI)V")
    public abstract void method4966(byte[] arg0);

    @ObfuscatedName("jb.f(B)[B")
    public abstract byte[] method4970();
}
