package deob;

@ObfuscatedName("tr")
public class class509 {

    @ObfuscatedName("tr.ao")
    public static final int field5059 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("tr.at")
    public static final int field5060 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class509() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.au(II)I")
    public static int method2770(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("hq.ae(IB)I")
    public static int method3402(int arg0) {
        return arg0 >>> 4 & field5060;
    }

    @ObfuscatedName("in.ao(II)I")
    public static int method3918(int arg0) {
        return (arg0 & field5059) - 1;
    }

    @ObfuscatedName("ak.at(Ltm;[II)[Ljava/lang/Object;")
    public static Object[] method373(class515 arg0, int[] arg1) {
        int var2 = arg0.method8436();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class503 var7 = class501.method3784(arg1[var5]);
                var3[var6] = var7.method8169(arg0);
            }
        }
        return var3;
    }
}
