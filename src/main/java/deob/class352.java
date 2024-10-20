package deob;

@ObfuscatedName("no")
public abstract class class352 {

    @ObfuscatedName("lf.aq(Ljava/lang/Object;ZI)[B")
    public static byte[] method5373(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class352) {
            class352 var6 = (class352) arg0;
            return var6.method6289();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("no.aw(I)[B")
    public abstract byte[] method6289();

    @ObfuscatedName("no.al([BI)V")
    public abstract void method6290(byte[] arg0);
}
