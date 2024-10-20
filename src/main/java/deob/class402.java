package deob;

@ObfuscatedName("ov")
public class class402 {

    @ObfuscatedName("ov.j")
    public static final int[] field4443 = new int[16384];

    @ObfuscatedName("ov.e")
    public static final int[] field4444 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4443[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4444[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class402() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.c(III)I")
    public static int method2730(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("nj.v(IB)I")
    public static int method6062(int arg0) {
        return field4443[arg0 & 0x3FFF];
    }

    @ObfuscatedName("es.q(II)I")
    public static int method2909(int arg0) {
        return field4444[arg0 & 0x3FFF];
    }
}
