package deob;

@ObfuscatedName("fq")
public class class176 {

    @ObfuscatedName("fq.l")
    public static int[] field2887 = new int[32];

    @ObfuscatedName("fq.e")
    public static int[] field2888;

    @ObfuscatedName("fq.q")
    public static int[] field2889;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2887[var1] = var0 - 1;
            var0 += var0;
        }
        field2888 = new int[2000];
        field2889 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.e(III)V")
    public static void method187(int arg0, int arg1) {
        class48 var2 = class48.method2746(arg0);
        int var3 = var2.field1057;
        int var4 = var2.field1058;
        int var5 = var2.field1056;
        int var6 = field2887[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2889[var3] = field2889[var3] & ~var7 | arg1 << var4 & var7;
    }
}
