package deob;

@ObfuscatedName("th")
public class class497 {

    @ObfuscatedName("th.av")
    public static final int field5003 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("th.as")
    public static final int field5001 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class497() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.at(IS)I")
    public static int method2971(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("sm.an(IB)I")
    public static int method7905(int arg0) {
        return arg0 >>> 4 & field5001;
    }

    @ObfuscatedName("ke.av(II)I")
    public static int method5087(int arg0) {
        return (arg0 & field5003) - 1;
    }

    @ObfuscatedName("fn.as(Ltz;[IS)[Ljava/lang/Object;")
    public static Object[] method3042(class501 arg0, int[] arg1) {
        int var2 = arg0.method8144();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class491 var7 = class489.method4988(arg1[var5]);
                var3[var6] = var7.method7988(arg0);
            }
        }
        return var3;
    }
}
