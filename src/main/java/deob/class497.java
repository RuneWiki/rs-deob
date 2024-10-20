package deob;

@ObfuscatedName("ti")
public class class497 {

    @ObfuscatedName("ti.ap")
    public static final int[] field5053 = new int[16384];

    @ObfuscatedName("ti.an")
    public static final int[] field5052 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5053[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field5052[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class497() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nc.aq(III)I")
    public static int method5887(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ie.ad(II)I")
    public static int method3733(int arg0) {
        return field5053[arg0 & 0x3FFF];
    }

    @ObfuscatedName("aj.ag(II)I")
    public static int method37(int arg0) {
        return field5052[arg0 & 0x3FFF];
    }
}
