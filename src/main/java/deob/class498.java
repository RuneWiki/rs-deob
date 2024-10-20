package deob;

@ObfuscatedName("ti")
public class class498 {

    @ObfuscatedName("ti.ax")
    public static final int[] field5037 = new int[16384];

    @ObfuscatedName("ti.ao")
    public static final int[] field5036 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5037[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field5036[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class498() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.ab(IS)F")
    public static float method2761(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("cw.ay(III)I")
    public static int method2085(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ha.an(II)I")
    public static int method3835(int arg0) {
        return field5037[arg0 & 0x3FFF];
    }

    @ObfuscatedName("cl.au(II)I")
    public static int method1044(int arg0) {
        return field5036[arg0 & 0x3FFF];
    }
}
