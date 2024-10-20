package deob;

@ObfuscatedName("so")
public class class481 {

    @ObfuscatedName("so.aq")
    public static final int[] field4860 = new int[16384];

    @ObfuscatedName("so.ar")
    public static final int[] field4861 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4860[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4861[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class481() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nk.am(II)F")
    public static float method6312(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("nn.ap(III)I")
    public static int method6237(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("gc.af(IB)I")
    public static int method3254(int arg0) {
        return field4860[arg0 & 0x3FFF];
    }

    @ObfuscatedName("mo.aj(IB)I")
    public static int method5446(int arg0) {
        return field4861[arg0 & 0x3FFF];
    }
}
