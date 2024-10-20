package deob;

@ObfuscatedName("vi")
public class class551 {

    @ObfuscatedName("vi.ak")
    public static final int field5409 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("vi.aj")
    public static final int field5412 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class551() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ul.ap(II)I")
    public static int method8934(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("cj.aw(II)I")
    public static int method2002(int arg0) {
        return arg0 >>> 4 & field5412;
    }

    @ObfuscatedName("ea.ak(IB)I")
    public static int method3203(int arg0) {
        return (arg0 & field5409) - 1;
    }

    @ObfuscatedName("bk.aj(Lvl;[II)[Ljava/lang/Object;")
    public static Object[] method457(class558 arg0, int[] arg1) {
        int var2 = arg0.method9274();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class545 var7 = class543.method4246(arg1[var5]);
                var3[var6] = var7.method9112(arg0);
            }
        }
        return var3;
    }
}
