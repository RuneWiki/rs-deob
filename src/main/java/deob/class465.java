package deob;

@ObfuscatedName("rx")
public class class465 {

    @ObfuscatedName("rx.ac")
    public static final int[] field4787 = new int[16384];

    @ObfuscatedName("rx.ai")
    public static final int[] field4788 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4787[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4788[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class465() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ni.au(III)I")
    public static int method6059(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("jt.ae(II)I")
    public static int method4395(int arg0) {
        return field4787[arg0 & 0x3FFF];
    }

    @ObfuscatedName("pm.ao(II)I")
    public static int method6998(int arg0) {
        return field4788[arg0 & 0x3FFF];
    }
}
