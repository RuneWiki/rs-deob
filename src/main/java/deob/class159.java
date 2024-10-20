package deob;

@ObfuscatedName("fy")
public class class159 {

    @ObfuscatedName("fy.i")
    public static int[] field2703 = new int[32];

    @ObfuscatedName("fy.v")
    public static int[] field2706;

    @ObfuscatedName("fy.m")
    public static int[] field2705;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2703[var1] = var0 - 1;
            var0 += var0;
        }
        field2706 = new int[2000];
        field2705 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.i(II)I")
    public static int method923(int arg0) {
        class38 var1 = class38.method235(arg0);
        int var2 = var1.field964;
        int var3 = var1.field963;
        int var4 = var1.field969;
        int var5 = field2703[var4 - var3];
        return field2705[var2] >> var3 & var5;
    }

    @ObfuscatedName("bg.v(IIB)V")
    public static void method1404(int arg0, int arg1) {
        class38 var2 = class38.method235(arg0);
        int var3 = var2.field964;
        int var4 = var2.field963;
        int var5 = var2.field969;
        int var6 = field2703[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2705[var3] = field2705[var3] & ~var7 | arg1 << var4 & var7;
    }
}
