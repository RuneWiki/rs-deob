package deob;

@ObfuscatedName("qo")
public class class440 {

    @ObfuscatedName("qo.au")
    public static final int[] field4719 = new int[16384];

    @ObfuscatedName("qo.ab")
    public static final int[] field4720 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4719[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4720[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class440() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lq.af(IS)F")
    public static float method5395(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("ea.an(III)I")
    public static int method2742(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("dj.aw(II)I")
    public static int method2527(int arg0) {
        return field4719[arg0 & 0x3FFF];
    }
}
