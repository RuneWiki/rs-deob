package deob;

@ObfuscatedName("fu")
public class class176 {

    @ObfuscatedName("fu.j")
    public static int[] field2886 = new int[32];

    @ObfuscatedName("fu.m")
    public static int[] field2888;

    @ObfuscatedName("fu.f")
    public static int[] field2885;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2886[var1] = var0 - 1;
            var0 += var0;
        }
        field2888 = new int[2000];
        field2885 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.j(II)I")
    public static int method2999(int arg0) {
        class48 var1 = class48.method664(arg0);
        int var2 = var1.field1051;
        int var3 = var1.field1049;
        int var4 = var1.field1058;
        int var5 = field2886[var4 - var3];
        return field2885[var2] >> var3 & var5;
    }

    @ObfuscatedName("ct.m(III)V")
    public static void method2058(int arg0, int arg1) {
        class48 var2 = class48.method664(arg0);
        int var3 = var2.field1051;
        int var4 = var2.field1049;
        int var5 = var2.field1058;
        int var6 = field2886[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2885[var3] = field2885[var3] & ~var7 | arg1 << var4 & var7;
    }
}
