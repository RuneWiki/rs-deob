package deob;

@ObfuscatedName("pw")
public class class432 {

    @ObfuscatedName("pw.z")
    public static final int[] field4689 = new int[16384];

    @ObfuscatedName("pw.j")
    public static final int[] field4691 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4689[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4691[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class432() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hd.f(III)I")
    public static int method4290(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("cf.w(II)I")
    public static int method2553(int arg0) {
        return field4689[arg0 & 0x3FFF];
    }

    @ObfuscatedName("nl.v(IS)I")
    public static int method6896(int arg0) {
        return field4691[arg0 & 0x3FFF];
    }
}
