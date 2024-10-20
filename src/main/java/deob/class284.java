package deob;

@ObfuscatedName("je")
public abstract class class284 {

    @ObfuscatedName("cc.v([BZI)Ljava/lang/Object;")
    public static Object method1992(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class286 var2 = new class286();
            var2.method4950(arg0);
            return var2;
        } else if (arg1) {
            return method738(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("dx.c(Ljava/lang/Object;ZI)[B")
    public static byte[] method2511(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method738(var2) : var2;
        } else if (arg0 instanceof class284) {
            class284 var3 = (class284) arg0;
            return var3.method4948();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ah.i([BI)[B")
    public static byte[] method738(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("je.f(I)[B")
    public abstract byte[] method4948();

    @ObfuscatedName("je.b([BI)V")
    public abstract void method4950(byte[] arg0);
}
