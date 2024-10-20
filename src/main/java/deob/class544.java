package deob;

@ObfuscatedName("um")
public class class544 {

    @ObfuscatedName("um.ag")
    public static final int field5362 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("um.am")
    public static final int field5360 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class544() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ln.ac(II)I")
    public static int method5604(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("gn.ae(IB)I")
    public static int method3441(int arg0) {
        return arg0 >>> 4 & field5360;
    }

    @ObfuscatedName("qi.ag(II)I")
    public static int method7198(int arg0) {
        return (arg0 & field5362) - 1;
    }

    @ObfuscatedName("mi.am(Lvf;[IB)[Ljava/lang/Object;")
    public static Object[] method5769(class551 arg0, int[] arg1) {
        int var2 = arg0.method8989();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class538 var7 = class536.method2596(arg1[var5]);
                var3[var6] = var7.method8823(arg0);
            }
        }
        return var3;
    }
}
