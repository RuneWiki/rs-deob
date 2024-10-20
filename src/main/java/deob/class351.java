package deob;

@ObfuscatedName("nn")
public abstract class class351 {

    @ObfuscatedName("fe.ac(Ljava/lang/Object;ZI)[B")
    public static byte[] method2920(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class351) {
            class351 var6 = (class351) arg0;
            return var6.method6149();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("nn.al(I)[B")
    public abstract byte[] method6149();

    @ObfuscatedName("nn.ak([BI)V")
    public abstract void method6150(byte[] arg0);
}
