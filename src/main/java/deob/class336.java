package deob;

@ObfuscatedName("ma")
public abstract class class336 {

    @ObfuscatedName("ex.au(Ljava/lang/Object;ZI)[B")
    public static byte[] method2805(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class336) {
            class336 var6 = (class336) arg0;
            return var6.method6029();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ma.ao([BI)V")
    public abstract void method6025(byte[] arg0);

    @ObfuscatedName("ma.ae(I)[B")
    public abstract byte[] method6029();
}
