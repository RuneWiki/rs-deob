package deob;

@ObfuscatedName("pf")
public class class422 {

    @ObfuscatedName("pf.h")
    public static final int[] field4616 = new int[16384];

    @ObfuscatedName("pf.j")
    public static final int[] field4612 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4616[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4612[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class422() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.a(II)F")
    public static float method3367(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("ie.f(III)I")
    public static int method4695(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("lh.c(IB)I")
    public static int method5693(int arg0) {
        return field4616[arg0 & 0x3FFF];
    }

    @ObfuscatedName("fv.x(IB)I")
    public static int method3123(int arg0) {
        return field4612[arg0 & 0x3FFF];
    }
}
