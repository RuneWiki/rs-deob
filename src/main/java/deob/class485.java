package deob;

@ObfuscatedName("sc")
public class class485 {

    @ObfuscatedName("sc.aw")
    public static final int field4974 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("sc.ac")
    public static final int field4975 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class485() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oy.af(IB)I")
    public static int method6561(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("qe.an(IB)I")
    public static int method7347(int arg0) {
        return arg0 >>> 4 & field4975;
    }

    @ObfuscatedName("fv.aw(II)I")
    public static int method3069(int arg0) {
        return (arg0 & field4974) - 1;
    }

    @ObfuscatedName("oe.ac(Lsg;[IB)[Ljava/lang/Object;")
    public static Object[] method6608(class489 arg0, int[] arg1) {
        int var2 = arg0.method8417();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class479 var7 = class477.method2573(arg1[var5]);
                var3[var6] = var7.method8100(arg0);
            }
        }
        return var3;
    }
}
