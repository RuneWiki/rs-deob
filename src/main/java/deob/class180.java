package deob;

@ObfuscatedName("fa")
public class class180 {

    @ObfuscatedName("fa.x")
    public static int[] field2958 = new int[32];

    @ObfuscatedName("fa.r")
    public static int[] field2959;

    @ObfuscatedName("fa.j")
    public static int[] field2960;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2958[var1] = var0 - 1;
            var0 += var0;
        }
        field2959 = new int[2000];
        field2960 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.x(IB)I")
    public static int method870(int arg0) {
        class51 var1 = class51.method643(arg0);
        int var2 = var1.field1091;
        int var3 = var1.field1094;
        int var4 = var1.field1093;
        int var5 = field2958[var4 - var3];
        return field2960[var2] >> var3 & var5;
    }
}
