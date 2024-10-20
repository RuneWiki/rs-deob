package deob;

@ObfuscatedName("sx")
public class class484 {

    @ObfuscatedName("sx.ar")
    public static final int[] field4893 = new int[16384];

    @ObfuscatedName("sx.as")
    public static final int[] field4888 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4893[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4888[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class484() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pz.aq(IIB)I")
    public static int method6935(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ld.aw(II)I")
    public static int method5425(int arg0) {
        return field4893[arg0 & 0x3FFF];
    }

    @ObfuscatedName("bc.al(IB)I")
    public static int method803(int arg0) {
        return field4888[arg0 & 0x3FFF];
    }
}
