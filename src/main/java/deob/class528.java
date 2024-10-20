package deob;

@ObfuscatedName("ux")
public class class528 {

    @ObfuscatedName("ux.al")
    public static final int field5153 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("ux.ai")
    public static final int field5155 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class528() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.aq(IB)I")
    public static int method2964(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("ie.aw(IB)I")
    public static int method4037(int arg0) {
        return arg0 >>> 4 & field5155;
    }

    @ObfuscatedName("go.al(II)I")
    public static int method3193(int arg0) {
        return (arg0 & field5153) - 1;
    }

    @ObfuscatedName("cq.ai(Luq;[II)[Ljava/lang/Object;")
    public static Object[] method2029(class534 arg0, int[] arg1) {
        int var2 = arg0.method8820();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class522 var7 = class520.method5378(arg1[var5]);
                var3[var6] = var7.method8455(arg0);
            }
        }
        return var3;
    }
}
