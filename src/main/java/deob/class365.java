package deob;

@ObfuscatedName("oc")
public abstract class class365 {

    @ObfuscatedName("jv.ab([BZB)Ljava/lang/Object;")
    public static Object method4614(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class367 var2 = new class367();
            var2.method6545(arg0);
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

    @ObfuscatedName("bi.ay(Ljava/lang/Object;ZB)[B")
    public static byte[] method773(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class365) {
            class365 var6 = (class365) arg0;
            return var6.method6535();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("oc.an(I)[B")
    public abstract byte[] method6535();

    @ObfuscatedName("oc.au([BB)V")
    public abstract void method6545(byte[] arg0);
}
