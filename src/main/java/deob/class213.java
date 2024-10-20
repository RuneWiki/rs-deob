package deob;

@ObfuscatedName("hu")
public class class213 {

    @ObfuscatedName("hu.f")
    public static int[] field2512 = new int[32];

    @ObfuscatedName("hu.i")
    public static int[] field2510;

    @ObfuscatedName("hu.y")
    public static int[] field2511;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2512[var1] = var0 - 1;
            var0 += var0;
        }
        field2510 = new int[4000];
        field2511 = new int[4000];
    }

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.i(III)V")
    public static void method2069(int arg0, int arg1) {
        class249 var2 = class249.method3046(arg0);
        int var3 = var2.field3265;
        int var4 = var2.field3267;
        int var5 = var2.field3269;
        int var6 = field2512[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2511[var3] = field2511[var3] & ~var7 | arg1 << var4 & var7;
    }
}
