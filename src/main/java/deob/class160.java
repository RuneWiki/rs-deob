package deob;

@ObfuscatedName("fg")
public class class160 {

    @ObfuscatedName("fg.g")
    public static int[] field2731 = new int[32];

    @ObfuscatedName("fg.h")
    public static int[] field2726;

    @ObfuscatedName("fg.s")
    public static int[] field2727;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2731[var1] = var0 - 1;
            var0 += var0;
        }
        field2726 = new int[2000];
        field2727 = new int[2000];
    }

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.g(IB)I")
    public static int method154(int arg0) {
        class38 var1 = class38.method831(arg0);
        int var2 = var1.field958;
        int var3 = var1.field966;
        int var4 = var1.field960;
        int var5 = field2731[var4 - var3];
        return field2727[var2] >> var3 & var5;
    }

    @ObfuscatedName("cx.h(IIS)V")
    public static void method1699(int arg0, int arg1) {
        class38 var2 = class38.method831(arg0);
        int var3 = var2.field958;
        int var4 = var2.field966;
        int var5 = var2.field960;
        int var6 = field2731[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2727[var3] = field2727[var3] & ~var7 | arg1 << var4 & var7;
    }
}
