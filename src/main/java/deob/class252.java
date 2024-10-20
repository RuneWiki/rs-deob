package deob;

@ObfuscatedName("ii")
public abstract class class252 {

    @ObfuscatedName("kt.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method5001(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class252) {
            class252 var6 = (class252) arg0;
            return var6.method4411();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ii.y([BI)V")
    public abstract void method4406(byte[] arg0);

    @ObfuscatedName("ii.v(I)[B")
    public abstract byte[] method4411();
}
