package deob;

@ObfuscatedName("mz")
public class class362 {

    @ObfuscatedName("mz.o")
    public static final int[] field4052 = new int[16384];

    @ObfuscatedName("mz.g")
    public static final int[] field4048 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4052[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4048[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class362() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kz.i(III)I")
    public static int method4956(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("je.w(IS)I")
    public static int method4646(int arg0) {
        return field4052[arg0 & 0x3FFF];
    }

    @ObfuscatedName("dc.s(IB)I")
    public static int method2377(int arg0) {
        return field4048[arg0 & 0x3FFF];
    }
}
