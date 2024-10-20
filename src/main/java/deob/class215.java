package deob;

@ObfuscatedName("hh")
public abstract class class215 {

    @ObfuscatedName("cf.z([BZB)Ljava/lang/Object;")
    public static Object method1964(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class216 var2 = new class216();
            var2.method3678(arg0);
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

    @ObfuscatedName("cy.k(Ljava/lang/Object;ZB)[B")
    public static byte[] method2137(Object arg0, boolean arg1) {
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
            return var6.method3677();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("hh.s(I)[B")
    public abstract byte[] method3677();

    @ObfuscatedName("hh.t([BI)V")
    public abstract void method3678(byte[] arg0);
}
