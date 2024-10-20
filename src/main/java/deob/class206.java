package deob;

@ObfuscatedName("gb")
public abstract class class206 {

    @ObfuscatedName("eu.c([BZB)Ljava/lang/Object;")
    public static Object method3126(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class207 var2 = new class207();
            var2.method3614(arg0);
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

    @ObfuscatedName("fs.x(Ljava/lang/Object;ZB)[B")
    public static byte[] method3190(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class206) {
            class206 var6 = (class206) arg0;
            return var6.method3621();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("gb.g([BI)V")
    public abstract void method3614(byte[] arg0);

    @ObfuscatedName("gb.t(B)[B")
    public abstract byte[] method3621();
}
