package deob;

@ObfuscatedName("gl")
public abstract class class199 {

    @ObfuscatedName("gl.k")
    public static boolean field2599 = false;

    @ObfuscatedName("br.m([BZB)Ljava/lang/Object;")
    public static Object method921(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2599) {
            try {
                class193 var2 = new class193();
                var2.method3180(arg0);
                return var2;
            } catch (Throwable var4) {
                field2599 = true;
            }
        }
        return arg1 ? method135(arg0) : arg0;
    }

    @ObfuscatedName("at.z(Ljava/lang/Object;ZB)[B")
    public static byte[] method265(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method135(var2) : var2;
        } else if (arg0 instanceof class199) {
            class199 var3 = (class199) arg0;
            return var3.method3181();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("r.i([BS)[B")
    public static byte[] method135(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("gl.o(I)[B")
    public abstract byte[] method3181();

    @ObfuscatedName("gl.k([BI)V")
    public abstract void method3180(byte[] arg0);
}
