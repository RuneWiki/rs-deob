package deob;

@ObfuscatedName("hd")
public abstract class class229 {

    @ObfuscatedName("f.f(Ljava/lang/Object;ZB)[B")
    public static byte[] method12(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method938(var2) : var2;
        } else if (arg0 instanceof class229) {
            class229 var3 = (class229) arg0;
            return var3.method3814();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bg.o([BI)[B")
    public static byte[] method938(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("hd.p([BI)V")
    public abstract void method3813(byte[] arg0);

    @ObfuscatedName("hd.u(I)[B")
    public abstract byte[] method3814();
}
