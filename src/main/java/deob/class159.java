package deob;

@ObfuscatedName("fq")
public class class159 {

    @ObfuscatedName("fq.y")
    public static int[] field2707 = new int[32];

    @ObfuscatedName("fq.m")
    public static int[] field2704;

    @ObfuscatedName("fq.d")
    public static int[] field2705;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2707[var1] = var0 - 1;
            var0 += var0;
        }
        field2704 = new int[2000];
        field2705 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.y(II)I")
    public static int method2974(int arg0) {
        class38 var1 = class38.method788(arg0);
        int var2 = var1.field942;
        int var3 = var1.field944;
        int var4 = var1.field943;
        int var5 = field2707[var4 - var3];
        return field2705[var2] >> var3 & var5;
    }

    @ObfuscatedName("ca.m(III)V")
    public static void method1682(int arg0, int arg1) {
        class38 var2 = class38.method788(arg0);
        int var3 = var2.field942;
        int var4 = var2.field944;
        int var5 = var2.field943;
        int var6 = field2707[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2705[var3] = field2705[var3] & ~var7 | arg1 << var4 & var7;
    }
}
