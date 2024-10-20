package deob;

@ObfuscatedName("tl")
public class class500 {

    @ObfuscatedName("tl.aq")
    public static final int[] field5098 = new int[16384];

    @ObfuscatedName("tl.af")
    public static final int[] field5099 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5098[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field5099[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class500() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("no.ac(IS)F")
    public static float method6075(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1) * 3.834951969714103E-4D);
    }

    @ObfuscatedName("tk.ae(III)I")
    public static int method8333(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("pc.ag(IB)I")
    public static int method7011(int arg0) {
        return field5098[arg0 & 0x3FFF];
    }

    @ObfuscatedName("bp.am(II)I")
    public static int method702(int arg0) {
        return field5099[arg0 & 0x3FFF];
    }
}
