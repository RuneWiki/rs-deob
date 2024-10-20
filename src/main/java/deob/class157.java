package deob;

@ObfuscatedName("fs")
public abstract class class157 {

    @ObfuscatedName("fs.l")
    public static boolean field2114 = false;

    @ObfuscatedName("gq.x([BZI)Ljava/lang/Object;")
    public static Object method3713(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2114) {
            try {
                class152 var2 = new class152();
                var2.method2655(arg0);
                return var2;
            } catch (Throwable var4) {
                field2114 = true;
            }
        }
        return arg1 ? method752(arg0) : arg0;
    }

    @ObfuscatedName("dj.z(Ljava/lang/Object;ZI)[B")
    public static byte[] method1985(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method752(var2) : var2;
        } else if (arg0 instanceof class157) {
            class157 var3 = (class157) arg0;
            return var3.method2656();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ae.p([BB)[B")
    public static byte[] method752(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("fs.b(I)[B")
    public abstract byte[] method2656();

    @ObfuscatedName("fs.l([BI)V")
    public abstract void method2655(byte[] arg0);
}
