package deob;

@ObfuscatedName("mv")
public class class346 {

    @ObfuscatedName("mv.l")
    public static final int[] field3942 = new int[16384];

    @ObfuscatedName("mv.n")
    public static final int[] field3946 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3942[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field3946[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class346() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ii.s(III)I")
    public static int method4214(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ce.t(II)I")
    public static int method1896(int arg0) {
        return field3942[arg0 & 0x3FFF];
    }

    @ObfuscatedName("cj.v(II)I")
    public static int method2005(int arg0) {
        return field3946[arg0 & 0x3FFF];
    }
}
