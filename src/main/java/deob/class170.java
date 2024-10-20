package deob;

@ObfuscatedName("fd")
public class class170 {

    @ObfuscatedName("fd.j")
    public static int[] field2825 = new int[32];

    @ObfuscatedName("fd.y")
    public static int[] field2824;

    @ObfuscatedName("fd.z")
    public static int[] field2823;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2825[var1] = var0 - 1;
            var0 += var0;
        }
        field2824 = new int[2000];
        field2823 = new int[2000];
    }

    public class170() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.j(IB)I")
    public static int method2874(int arg0) {
        class46 var1 = class46.method177(arg0);
        int var2 = var1.field1042;
        int var3 = var1.field1045;
        int var4 = var1.field1043;
        int var5 = field2825[var4 - var3];
        return field2823[var2] >> var3 & var5;
    }

    @ObfuscatedName("ey.y(III)V")
    public static void method2901(int arg0, int arg1) {
        class46 var2 = class46.method177(arg0);
        int var3 = var2.field1042;
        int var4 = var2.field1045;
        int var5 = var2.field1043;
        int var6 = field2825[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2823[var3] = field2823[var3] & ~var7 | arg1 << var4 & var7;
    }
}
