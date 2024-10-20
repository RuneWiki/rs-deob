package deob;

@ObfuscatedName("mh")
public abstract class class317 {

    @ObfuscatedName("ja.aj([BZI)Ljava/lang/Object;")
    public static Object method4672(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0.length > 136) {
            class319 var2 = new class319();
            var2.method5728(arg0);
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

    @ObfuscatedName("ez.al(Ljava/lang/Object;ZI)[B")
    public static byte[] method2829(Object arg0, boolean arg1) {
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
        } else if (arg0 instanceof class317) {
            class317 var6 = (class317) arg0;
            return var6.method5734();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("mh.ab([BB)V")
    public abstract void method5728(byte[] arg0);

    @ObfuscatedName("mh.ac(B)[B")
    public abstract byte[] method5734();
}
