package deob;

@ObfuscatedName("px")
public class class425 {

    @ObfuscatedName("px.m")
    public static final int[] field4665 = new int[16384];

    @ObfuscatedName("px.q")
    public static final int[] field4666 = new int[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4665[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field4666[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
    }

    public class425() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oq.h(III)I")
    public static int method6931(int arg0, int arg1) {
        return (int) Math.round(Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
    }

    @ObfuscatedName("fk.e(II)I")
    public static int method3103(int arg0) {
        return field4665[arg0 & 0x3FFF];
    }

    @ObfuscatedName("aw.v(II)I")
    public static int method837(int arg0) {
        return field4666[arg0 & 0x3FFF];
    }
}
