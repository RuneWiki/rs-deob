package deob;

@ObfuscatedName("my")
public abstract class class334 {

    @ObfuscatedName("ee.at([BZI)Ljava/lang/Object;")
    public static Object method2528(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class336 var2 = new class336();
            var2.method5964(arg0);
            return var2;
        } else if (arg1) {
            return method74(arg0);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("mq.an(Ljava/lang/Object;ZI)[B")
    public static byte[] method5391(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class334) {
            class334 var6 = (class334) arg0;
            return var6.method5963();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("af.av([BB)[B")
    public static byte[] method74(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("my.as(I)[B")
    public abstract byte[] method5963();

    @ObfuscatedName("my.ax([BI)V")
    public abstract void method5964(byte[] arg0);
}
