package deob;

@ObfuscatedName("mg")
public class class361 {

    @ObfuscatedName("mg.o")
    public static final int[] field4036 = new int[16384];

    @ObfuscatedName("mg.g")
    public static final int[] field4034 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4036[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4034[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class361() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mq.n(III)I")
    public static int method5572(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ho.m(II)I")
    public static int method4132(int arg0) {
        return field4034[arg0 & 0x3FFF];
    }
}
