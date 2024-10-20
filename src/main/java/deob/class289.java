package deob;

@ObfuscatedName("kn")
public class class289 {

    @ObfuscatedName("kn.o")
    public static int[] field3347 = new int[32];

    @ObfuscatedName("kn.q")
    public static int[] field3346;

    @ObfuscatedName("kn.l")
    public static int[] field3348;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3347[var1] = var0 - 1;
            var0 += var0;
        }
        field3346 = new int[4000];
        field3348 = new int[4000];
    }

    public class289() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.o(IB)I")
    public static int method241(int arg0) {
        class184 var1 = class184.method10(arg0);
        int var2 = var1.field2035;
        int var3 = var1.field2037;
        int var4 = var1.field2039;
        int var5 = field3347[var4 - var3];
        return field3348[var2] >> var3 & var5;
    }

    @ObfuscatedName("cw.q(III)V")
    public static void method2245(int arg0, int arg1) {
        class184 var2 = class184.method10(arg0);
        int var3 = var2.field2035;
        int var4 = var2.field2037;
        int var5 = var2.field2039;
        int var6 = field3347[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3348[var3] = field3348[var3] & ~var7 | arg1 << var4 & var7;
    }
}
