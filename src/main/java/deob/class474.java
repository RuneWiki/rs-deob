package deob;

@ObfuscatedName("sk")
public class class474 {

    @ObfuscatedName("sk.ac")
    public static final int field4888 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("sk.ab")
    public static final int field4886 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class474() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.aj(IB)I")
    public static int method668(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("jm.al(IB)I")
    public static int method4400(int arg0) {
        return arg0 >>> 4 & field4886;
    }

    @ObfuscatedName("gj.ac(IB)I")
    public static int method3222(int arg0) {
        return (arg0 & field4888) - 1;
    }

    @ObfuscatedName("gj.ab(Lsy;[II)[Ljava/lang/Object;")
    public static Object[] method3216(class478 arg0, int[] arg1) {
        int var2 = arg0.method7918();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class468 var7 = class466.method7647(arg1[var5]);
                var3[var6] = var7.method7756(arg0);
            }
        }
        return var3;
    }
}
