package deob;

@ObfuscatedName("nx")
public abstract class class362 {

    @ObfuscatedName("nh.ak(Ljava/lang/Object;ZI)[B")
    public static byte[] method6276(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method7616(var2) : var2;
        } else if (arg0 instanceof class362) {
            class362 var3 = (class362) arg0;
            return var3.method6469();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("rz.al([BI)[B")
    public static byte[] method7616(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("nx.az([BI)V")
    public abstract void method6459(byte[] arg0);

    @ObfuscatedName("nx.aj(B)[B")
    public abstract byte[] method6469();
}
