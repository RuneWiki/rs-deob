package deob;

@ObfuscatedName("ry")
public class class466 {

    @ObfuscatedName("ry.as")
    public static final int[] field4787 = new int[16384];

    @ObfuscatedName("ry.aj")
    public static final int[] field4789 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4787[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4789[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class466() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ov.aw(IIB)I")
    public static int method6317(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("qj.ay(II)I")
    public static int method7341(int arg0) {
        return field4787[arg0 & 0x3FFF];
    }
}
