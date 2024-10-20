package deob;

@ObfuscatedName("hn")
public class class223 {

    @ObfuscatedName("hn.n")
    public static int[] field2728 = new int[32];

    @ObfuscatedName("hn.v")
    public static int[] field2725;

    @ObfuscatedName("hn.y")
    public static int[] field2726;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2728[var1] = var0 - 1;
            var0 += var0;
        }
        field2725 = new int[2000];
        field2726 = new int[2000];
    }

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.n(II)I")
    public static int method1428(int arg0) {
        class262 var1 = class262.method3884(arg0);
        int var2 = var1.field3473;
        int var3 = var1.field3472;
        int var4 = var1.field3474;
        int var5 = field2728[var4 - var3];
        return field2726[var2] >> var3 & var5;
    }
}
