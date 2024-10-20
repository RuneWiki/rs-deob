package deob;

@ObfuscatedName("rv")
public class class453 {

    @ObfuscatedName("rv.ax")
    public static final int[] field4732 = new int[16384];

    @ObfuscatedName("rv.ap")
    public static final int[] field4731 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4732[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4731[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class453() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.at(III)I")
    public static int method2716(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("bn.an(II)I")
    public static int method648(int arg0) {
        return field4732[arg0 & 0x3FFF];
    }

    @ObfuscatedName("nk.av(II)I")
    public static int method6207(int arg0) {
        return field4731[arg0 & 0x3FFF];
    }
}
