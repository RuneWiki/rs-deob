package deob;

@ObfuscatedName("on")
public class class401 {

    @ObfuscatedName("on.b")
    public static final int[] field4390 = new int[16384];

    @ObfuscatedName("on.n")
    public static final int[] field4392 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4390[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4392[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class401() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("go.v(IIS)I")
    public static int method3545(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ci.c(IB)I")
    public static int method2240(int arg0) {
        return field4390[arg0 & 0x3FFF];
    }

    @ObfuscatedName("ew.i(IB)I")
    public static int method2817(int arg0) {
        return field4392[arg0 & 0x3FFF];
    }
}
