package deob;

@ObfuscatedName("np")
public abstract class class346 {

    @ObfuscatedName("gk.at([BZI)Ljava/lang/Object;")
    public static Object method3287(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class348 var2 = new class348();
            var2.method6162(arg0);
            return var2;
        } else if (arg1) {
            int var3 = arg0.length;
            byte[] var4 = new byte[var3];
            System.arraycopy(arg0, 0, var4, 0, var3);
            return var4;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ej.ah(Ljava/lang/Object;ZI)[B")
    public static byte[] method2926(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            if (arg1) {
                int var3 = var2.length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var2, 0, var4, 0, var3);
                return var4;
            } else {
                return var2;
            }
        } else if (arg0 instanceof class346) {
            class346 var6 = (class346) arg0;
            return var6.method6161();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("np.ar(B)[B")
    public abstract byte[] method6161();

    @ObfuscatedName("np.ao([BB)V")
    public abstract void method6162(byte[] arg0);
}
