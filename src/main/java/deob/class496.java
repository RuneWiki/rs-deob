package deob;

@ObfuscatedName("ti")
public class class496 {

    @ObfuscatedName("ti.af")
    public static final int[] field5020 = new int[16384];

    @ObfuscatedName("ti.aa")
    public static final int[] field5021 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5020[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field5021[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class496() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sg.ak(III)I")
    public static int method7895(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("ri.al(IB)I")
    public static int method7668(int arg0) {
        return field5020[arg0 & 0x3FFF];
    }

    @ObfuscatedName("sm.aj(II)I")
    public static int method8019(int arg0) {
        return field5021[arg0 & 0x3FFF];
    }
}
