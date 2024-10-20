package deob;

@ObfuscatedName("sy")
public class class480 {

    @ObfuscatedName("sy.ao")
    public static final int[] field4824 = new int[16384];

    @ObfuscatedName("sy.ah")
    public static final int[] field4826 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4824[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4826[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class480() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.ac(II)F")
    public static float method2971(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("db.al(IIS)I")
    public static int method2502(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("kl.ak(II)I")
    public static int method4780(int arg0) {
        return field4824[arg0 & 0x3FFF];
    }

    @ObfuscatedName("ka.ax(II)I")
    public static int method4806(int arg0) {
        return field4826[arg0 & 0x3FFF];
    }
}
