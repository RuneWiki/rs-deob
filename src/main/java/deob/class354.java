package deob;

@ObfuscatedName("ni")
public abstract class class354 {

    @ObfuscatedName("nl.az(Ljava/lang/Object;ZB)[B")
    public static byte[] method6213(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class354) {
            class354 var6 = (class354) arg0;
            return var6.method6222();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ni.ah(B)[B")
    public abstract byte[] method6222();

    @ObfuscatedName("ni.af([BB)V")
    public abstract void method6224(byte[] arg0);
}
