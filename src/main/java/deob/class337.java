package deob;

@ObfuscatedName("me")
public abstract class class337 {

    @ObfuscatedName("mw.aw([BZI)Ljava/lang/Object;")
    public static Object method5456(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class339 var2 = new class339();
            var2.method6005(arg0);
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

    @ObfuscatedName("fk.ay(Ljava/lang/Object;ZB)[B")
    public static byte[] method2990(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class337) {
            class337 var6 = (class337) arg0;
            return var6.method6015();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("me.am([BI)V")
    public abstract void method6005(byte[] arg0);

    @ObfuscatedName("me.ar(I)[B")
    public abstract byte[] method6015();
}
