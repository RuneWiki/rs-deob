package deob;

@ObfuscatedName("ka")
public class class289 {

    @ObfuscatedName("ka.s")
    public static int[] field3312 = new int[32];

    @ObfuscatedName("ka.h")
    public static int[] field3314;

    @ObfuscatedName("ka.w")
    public static int[] field3313;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3312[var1] = var0 - 1;
            var0 += var0;
        }
        field3314 = new int[4000];
        field3313 = new int[4000];
    }

    public class289() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hv.h(IIB)V")
    public static void method4085(int arg0, int arg1) {
        class183 var2 = class183.method2581(arg0);
        int var3 = var2.field1988;
        int var4 = var2.field1991;
        int var5 = var2.field1987;
        int var6 = field3312[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field3313[var3] = field3313[var3] & ~var7 | arg1 << var4 & var7;
    }
}
