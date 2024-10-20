package deob;

@ObfuscatedName("ey")
public class class150 {

    @ObfuscatedName("ey.z")
    public static int[] field2624 = new int[32];

    @ObfuscatedName("ey.n")
    public static int[] field2622;

    @ObfuscatedName("ey.u")
    public static int[] field2625;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2624[var1] = var0 - 1;
            var0 += var0;
        }
        field2622 = new int[2000];
        field2625 = new int[2000];
    }

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.z(II)I")
    public static int method117(int arg0) {
        class39 var1 = class39.method3172(arg0);
        int var2 = var1.field954;
        int var3 = var1.field948;
        int var4 = var1.field952;
        int var5 = field2624[var4 - var3];
        return field2625[var2] >> var3 & var5;
    }

    @ObfuscatedName("z.n(III)V")
    public static void method4(int arg0, int arg1) {
        class39 var2 = class39.method3172(arg0);
        int var3 = var2.field954;
        int var4 = var2.field948;
        int var5 = var2.field952;
        int var6 = field2624[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2625[var3] = field2625[var3] & ~var7 | arg1 << var4 & var7;
    }
}
