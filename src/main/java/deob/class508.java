package deob;

@ObfuscatedName("ty")
public class class508 {

    @ObfuscatedName("ty.ao")
    public static final int[] field5150 = new int[2048];

    @ObfuscatedName("ty.af")
    public static final int[] field5147 = new int[2048];

    static {
        double var0 = 0.0030679615757712823D;
        for (int var2 = 0; var2 < 2048; var2++) {
            field5150[var2] = (int) (65536.0D * Math.sin((double) var2 * var0));
            field5147[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
        }
    }

    public class508() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mx.ap(II)F")
    public static float method6195(int arg0) {
        int var1 = arg0 & 0x7FF;
        return (float) ((double) ((float) var1 / 2048.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("al.aw(FI)I")
    public static int method327(float arg0) {
        return (int) ((double) arg0 / 6.283185307179586D * 2048.0D) & 0x7FF;
    }

    @ObfuscatedName("kd.ak(II)I")
    public static int method5428(int arg0) {
        return field5150[arg0 & 0x7FF];
    }

    @ObfuscatedName("rn.aj(II)D")
    public static double method8149(int arg0) {
        int var1 = field5147[arg0 & 0x7FF];
        return (double) var1 / 65536.0D;
    }

    @ObfuscatedName("kr.ai(IIS)I")
    public static int method5247(int arg0, int arg1) {
        int var2 = arg1 - arg0 & 0x7FF;
        return var2 > 1024 ? -(2048 - var2) : var2;
    }
}
