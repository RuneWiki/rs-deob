package deob;

@ObfuscatedName("nf")
public class class379 {

    @ObfuscatedName("nf.t")
    public static final int[] field4234 = new int[16384];

    @ObfuscatedName("nf.s")
    public static final int[] field4238 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4234[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4238[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class379() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lt.c(II)F")
    public static float method5565(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("aa.p(II)I")
    public static int method803(int arg0) {
        return field4234[arg0 & 0x3FFF];
    }

    @ObfuscatedName("ki.m(II)I")
    public static int method5179(int arg0) {
        return field4238[arg0 & 0x3FFF];
    }
}
