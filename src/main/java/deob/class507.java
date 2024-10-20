package deob;

@ObfuscatedName("tx")
public class class507 {

    @ObfuscatedName("tx.ay")
    public static final int[] field5145 = new int[16384];

    @ObfuscatedName("tx.as")
    public static final int[] field5146 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5145[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field5146[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class507() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kb.ap(III)I")
    public static int method5581(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ac.aw(II)I")
    public static int method284(int arg0) {
        return field5145[arg0 & 0x3FFF];
    }

    @ObfuscatedName("sk.ak(II)I")
    public static int method8307(int arg0) {
        return field5146[arg0 & 0x3FFF];
    }
}
