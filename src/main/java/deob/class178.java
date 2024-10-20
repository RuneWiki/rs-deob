package deob;

@ObfuscatedName("fq")
public abstract class class178 {

    @ObfuscatedName("fq.h")
    public static boolean field2417 = false;

    @ObfuscatedName("cm.l([BZI)Ljava/lang/Object;")
    public static Object method1483(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !field2417) {
            try {
                class173 var2 = new class173();
                var2.method2881(arg0);
                return var2;
            } catch (Throwable var7) {
                field2417 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ce.w(Ljava/lang/Object;ZI)[B")
    public static byte[] method1573(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class178) {
            class178 var6 = (class178) arg0;
            return var6.method2882();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fq.j(I)[B")
    public abstract byte[] method2882();

    @ObfuscatedName("fq.h([BS)V")
    public abstract void method2881(byte[] arg0);
}
