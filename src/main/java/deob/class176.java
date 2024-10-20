package deob;

@ObfuscatedName("fd")
public class class176 {

    @ObfuscatedName("fd.g")
    public static int[] field2883 = new int[32];

    @ObfuscatedName("fd.b")
    public static int[] field2884;

    @ObfuscatedName("fd.w")
    public static int[] field2885;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2883[var1] = var0 - 1;
            var0 += var0;
        }
        field2884 = new int[2000];
        field2885 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.g(II)I")
    public static int method98(int arg0) {
        class48 var1 = class48.method733(arg0);
        int var2 = var1.field1068;
        int var3 = var1.field1076;
        int var4 = var1.field1069;
        int var5 = field2883[var4 - var3];
        return field2885[var2] >> var3 & var5;
    }
}
