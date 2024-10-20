package deob;

@ObfuscatedName("qr")
public class class436 {

    @ObfuscatedName("qr.an")
    public static final int[] field4651 = new int[16384];

    @ObfuscatedName("qr.ao")
    public static final int[] field4652 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4651[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4652[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class436() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ja.aj(IIB)I")
    public static int method4573(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("hx.al(IB)I")
    public static int method3692(int arg0) {
        return field4651[arg0 & 0x3FFF];
    }

    @ObfuscatedName("dz.ac(IB)I")
    public static int method2500(int arg0) {
        return field4652[arg0 & 0x3FFF];
    }
}
