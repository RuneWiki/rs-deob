package deob;

@ObfuscatedName("ss")
public class class485 {

    @ObfuscatedName("ss.an")
    public static final int[] field4916 = new int[16384];

    @ObfuscatedName("ss.ao")
    public static final int[] field4919 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4916[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4919[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class485() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sy.az(III)I")
    public static int method7753(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ep.ah(IB)I")
    public static int method2799(int arg0) {
        return field4916[arg0 & 0x3FFF];
    }

    @ObfuscatedName("jr.af(IB)I")
    public static int method4299(int arg0) {
        return field4919[arg0 & 0x3FFF];
    }
}
