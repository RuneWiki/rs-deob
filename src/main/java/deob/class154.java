package deob;

@ObfuscatedName("ez")
public class class154 {

    @ObfuscatedName("ez.b")
    public static int[] field2663 = new int[32];

    @ObfuscatedName("ez.u")
    public static int[] field2656;

    @ObfuscatedName("ez.x")
    public static int[] field2657;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2663[var1] = var0 - 1;
            var0 += var0;
        }
        field2656 = new int[2000];
        field2657 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.b(II)I")
    public static int method140(int arg0) {
        class42 var1 = class42.method636(arg0);
        int var2 = var1.field980;
        int var3 = var1.field981;
        int var4 = var1.field979;
        int var5 = field2663[var4 - var3];
        return field2657[var2] >> var3 & var5;
    }
}
