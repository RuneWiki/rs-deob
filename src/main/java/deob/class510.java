package deob;

@ObfuscatedName("tq")
public class class510 {

    @ObfuscatedName("tq.ar")
    public static final int field5055 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("tq.am")
    public static final int field5056 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class510() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jr.aw(II)I")
    public static int method4557(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("cx.ay(IB)I")
    public static int method1171(int arg0) {
        return arg0 >>> 4 & field5056;
    }

    @ObfuscatedName("aq.am(Lty;[II)[Ljava/lang/Object;")
    public static Object[] method96(class514 arg0, int[] arg1) {
        int var2 = arg0.method8260();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class504 var7 = class502.method6796(arg1[var5]);
                var3[var6] = var7.method8108(arg0);
            }
        }
        return var3;
    }
}
