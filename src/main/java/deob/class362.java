package deob;

@ObfuscatedName("mb")
public class class362 {

    @ObfuscatedName("mb.m")
    public static final int[] field4057 = new int[16384];

    @ObfuscatedName("mb.k")
    public static final int[] field4055 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4057[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4055[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class362() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.l(IIS)I")
    public static int method2541(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("gh.q(IB)I")
    public static int method3503(int arg0) {
        return field4057[arg0 & 0x3FFF];
    }

    @ObfuscatedName("jm.f(II)I")
    public static int method4686(int arg0) {
        return field4055[arg0 & 0x3FFF];
    }
}
