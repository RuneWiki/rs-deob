package deob;

@ObfuscatedName("ns")
public class class384 {

    @ObfuscatedName("ns.r")
    public static final int[] field4279 = new int[16384];

    @ObfuscatedName("ns.o")
    public static final int[] field4277 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4279[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4277[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class384() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.c(II)F")
    public static float method2482(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("mf.l(IIB)I")
    public static int method5651(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("jw.s(II)I")
    public static int method4788(int arg0) {
        return field4279[arg0 & 0x3FFF];
    }

    @ObfuscatedName("cm.e(II)I")
    public static int method2308(int arg0) {
        return field4277[arg0 & 0x3FFF];
    }
}
