package deob;

@ObfuscatedName("oi")
public class class403 {

    @ObfuscatedName("oi.c")
    public static final int[] field4445 = new int[16384];

    @ObfuscatedName("oi.q")
    public static final int[] field4448 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4445[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4448[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class403() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.s(IB)F")
    public static float method383(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("mh.h(III)I")
    public static int method5643(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("r.w(II)I")
    public static int method200(int arg0) {
        return field4445[arg0 & 0x3FFF];
    }

    @ObfuscatedName("hm.v(II)I")
    public static int method4096(int arg0) {
        return field4448[arg0 & 0x3FFF];
    }
}
