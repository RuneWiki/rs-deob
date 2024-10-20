package deob;

@ObfuscatedName("im")
public abstract class class251 {

    @ObfuscatedName("jj.v([BZI)Ljava/lang/Object;")
    public static Object method4623(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class253 var2 = new class253();
            var2.method4371(arg0);
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

    @ObfuscatedName("ke.n(Ljava/lang/Object;ZB)[B")
    public static byte[] method5100(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class251) {
            class251 var6 = (class251) arg0;
            return var6.method4369();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("im.f(B)[B")
    public abstract byte[] method4369();

    @ObfuscatedName("im.y([BB)V")
    public abstract void method4371(byte[] arg0);
}
