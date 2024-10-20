package deob;

@ObfuscatedName("oe")
public abstract class class367 {

    @ObfuscatedName("no.ac(Ljava/lang/Object;ZI)[B")
    public static byte[] method6074(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class367) {
            class367 var6 = (class367) arg0;
            return var6.method6682();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("oe.ag([BB)V")
    public abstract void method6681(byte[] arg0);

    @ObfuscatedName("oe.ae(I)[B")
    public abstract byte[] method6682();
}
