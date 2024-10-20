package deob;

@ObfuscatedName("fo")
public class class19 {

    @ObfuscatedName("fo.o")
    public static int[] field88;

    @ObfuscatedName("fo.j")
    public static int[] field89 = new int[32];

    @ObfuscatedName("fo.p")
    public static int[] field87;

    public class19() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field89[var1] = var0 - 1;
            var0 += var0;
        }
        field87 = new int[2000];
        field88 = new int[2000];
    }

    @ObfuscatedName("cd.j(II)I")
    public static int method2891(int arg0) {
        class182 var1 = class182.method934(arg0);
        int var2 = var1.field2750;
        int var3 = var1.field2744;
        int var4 = var1.field2745;
        int var5 = field89[var4 - var3];
        return field88[var2] >> var3 & var5;
    }
}
