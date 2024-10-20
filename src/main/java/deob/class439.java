package deob;

@ObfuscatedName("pp")
public class class439 {

    @ObfuscatedName("pp.q")
    public static final int field4681 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("pp.f")
    public static final int field4684 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class439() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.c(II)I")
    public static int method4986(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("cp.v(II)I")
    public static int method2091(int arg0) {
        return arg0 >>> 4 & field4684;
    }

    @ObfuscatedName("ec.q(II)I")
    public static int method2822(int arg0) {
        return (arg0 & field4681) - 1;
    }

    @ObfuscatedName("gh.f(Lqt;[II)[Ljava/lang/Object;")
    public static Object[] method4019(class443 arg0, int[] arg1) {
        int var2 = arg0.method7062();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class433 var7 = class431.method4951(arg1[var5]);
                var3[var6] = var7.method6887(arg0);
            }
        }
        return var3;
    }
}
