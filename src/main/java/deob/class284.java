package deob;

@ObfuscatedName("jr")
public abstract class class284 {

    @ObfuscatedName("oj.s(Ljava/lang/Object;ZI)[B")
    public static byte[] method6391(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class284) {
            class284 var6 = (class284) arg0;
            return var6.method4884();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("jr.h(I)[B")
    public abstract byte[] method4884();

    @ObfuscatedName("jr.w([BI)V")
    public abstract void method4885(byte[] arg0);
}
