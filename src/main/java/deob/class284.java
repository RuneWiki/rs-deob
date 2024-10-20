package deob;

@ObfuscatedName("jc")
public abstract class class284 {

    @ObfuscatedName("it.o([BZI)Ljava/lang/Object;")
    public static Object method4521(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class286 var2 = new class286();
            var2.method4884(arg0);
            return var2;
        } else if (arg1) {
            return method2402(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("dm.q(Ljava/lang/Object;ZI)[B")
    public static byte[] method2637(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method2402(var2) : var2;
        } else if (arg0 instanceof class284) {
            class284 var3 = (class284) arg0;
            return var3.method4886();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ce.l([BB)[B")
    public static byte[] method2402(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("jc.a([BI)V")
    public abstract void method4884(byte[] arg0);

    @ObfuscatedName("jc.k(B)[B")
    public abstract byte[] method4886();
}
