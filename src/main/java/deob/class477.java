package deob;

@ObfuscatedName("sc")
public class class477 {

    @ObfuscatedName("sc.ab")
    public static final int[] field4818 = new int[16384];

    @ObfuscatedName("sc.au")
    public static final int[] field4821 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4818[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4821[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class477() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hh.ar(IB)I")
    public static int method3485(int arg0) {
        return field4821[arg0 & 0x3FFF];
    }
}
