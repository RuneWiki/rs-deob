package deob;

@ObfuscatedName("np")
public abstract class class361 {

    @ObfuscatedName("mn.aq([BZB)Ljava/lang/Object;")
    public static Object method5537(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class363 var2 = new class363();
            var2.method6392(arg0);
            return var2;
        } else if (arg1) {
            return method3241(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ln.ad(Ljava/lang/Object;ZB)[B")
    public static byte[] method5229(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method3241(var2) : var2;
        } else if (arg0 instanceof class361) {
            class361 var3 = (class361) arg0;
            return var3.method6395();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gz.ag([BB)[B")
    public static byte[] method3241(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("np.ap([BI)V")
    public abstract void method6392(byte[] arg0);

    @ObfuscatedName("np.ak(B)[B")
    public abstract byte[] method6395();
}
