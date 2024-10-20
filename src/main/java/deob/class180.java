package deob;

@ObfuscatedName("fw")
public class class180 {

    @ObfuscatedName("fw.m")
    public static int[] field2953 = new int[32];

    @ObfuscatedName("fw.w")
    public static int[] field2951;

    @ObfuscatedName("fw.e")
    public static int[] field2950;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2953[var1] = var0 - 1;
            var0 += var0;
        }
        field2951 = new int[2000];
        field2950 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.m(IB)I")
    public static int method145(int arg0) {
        class51 var1 = class51.method99(arg0);
        int var2 = var1.field1113;
        int var3 = var1.field1108;
        int var4 = var1.field1107;
        int var5 = field2953[var4 - var3];
        return field2950[var2] >> var3 & var5;
    }

    @ObfuscatedName("fp.w(III)V")
    public static void method3050(int arg0, int arg1) {
        class51 var2 = class51.method99(arg0);
        int var3 = var2.field1113;
        int var4 = var2.field1108;
        int var5 = var2.field1107;
        int var6 = field2953[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2950[var3] = field2950[var3] & ~var7 | arg1 << var4 & var7;
    }
}
