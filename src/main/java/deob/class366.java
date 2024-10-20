package deob;

@ObfuscatedName("oe")
public abstract class class366 {

    @ObfuscatedName("ke.ap([BZI)Ljava/lang/Object;")
    public static Object method5310(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class368 var2 = new class368();
            var2.method6884(arg0);
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

    @ObfuscatedName("oe.ak(I)[B")
    public abstract byte[] method6883();

    @ObfuscatedName("oe.aj([BI)V")
    public abstract void method6884(byte[] arg0);
}
