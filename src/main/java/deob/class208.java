package deob;

@ObfuscatedName("gu")
public abstract class class208 {

    @ObfuscatedName("jz.f(Ljava/lang/Object;ZI)[B")
    public static byte[] method4619(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class208) {
            class208 var6 = (class208) arg0;
            return var6.method3582();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gu.y([BB)V")
    public abstract void method3577(byte[] arg0);

    @ObfuscatedName("gu.i(I)[B")
    public abstract byte[] method3582();
}
