package deob;

@ObfuscatedName("hk")
public abstract class class215 {

    @ObfuscatedName("y.h(Ljava/lang/Object;ZI)[B")
    public static byte[] method166(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class215) {
            class215 var6 = (class215) arg0;
            return var6.method3624();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("hk.v(I)[B")
    public abstract byte[] method3624();

    @ObfuscatedName("hk.x([BI)V")
    public abstract void method3625(byte[] arg0);
}
