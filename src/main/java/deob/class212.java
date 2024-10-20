package deob;

@ObfuscatedName("ha")
public class class212 {

    @ObfuscatedName("ha.d")
    public static int[] field2583 = new int[32];

    @ObfuscatedName("ha.q")
    public static int[] field2588;

    @ObfuscatedName("ha.x")
    public static int[] field2585;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2583[var1] = var0 - 1;
            var0 += var0;
        }
        field2588 = new int[2000];
        field2585 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.d(IB)I")
    public static int method1567(int arg0) {
        class251 var1 = class251.method1392(arg0);
        int var2 = var1.field3363;
        int var3 = var1.field3364;
        int var4 = var1.field3365;
        int var5 = field2583[var4 - var3];
        return field2585[var2] >> var3 & var5;
    }
}
