package deob;

@ObfuscatedName("oj")
public class class404 {

    @ObfuscatedName("oj.k")
    public static final int[] field4483 = new int[16384];

    @ObfuscatedName("oj.w")
    public static final int[] field4487 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4483[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4487[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class404() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("na.p(III)I")
    public static int method6170(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("gv.f(II)I")
    public static int method3342(int arg0) {
        return field4483[arg0 & 0x3FFF];
    }

    @ObfuscatedName("nv.n(IB)I")
    public static int method6413(int arg0) {
        return field4487[arg0 & 0x3FFF];
    }
}
