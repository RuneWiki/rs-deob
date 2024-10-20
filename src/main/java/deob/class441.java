package deob;

@ObfuscatedName("pp")
public class class441 {

    @ObfuscatedName("pp.f")
    public static final int field4721 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("pp.n")
    public static final int field4722 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class441() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pj.c(II)I")
    public static int method6969(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("fr.p(II)I")
    public static int method3090(int arg0) {
        return arg0 >>> 4 & field4722;
    }

    @ObfuscatedName("gg.f(II)I")
    public static int method4088(int arg0) {
        return (arg0 & field4721) - 1;
    }

    @ObfuscatedName("mb.n(Lqq;[IB)[Ljava/lang/Object;")
    public static Object[] method6112(class445 arg0, int[] arg1) {
        int var2 = arg0.method7211();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class435 var7 = class433.method6114(arg1[var5]);
                var3[var6] = var7.method7060(arg0);
            }
        }
        return var3;
    }
}
