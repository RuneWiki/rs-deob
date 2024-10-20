package deob;

@ObfuscatedName("eo")
public class class154 {

    @ObfuscatedName("eo.z")
    public static int[] field2645 = new int[32];

    @ObfuscatedName("eo.j")
    public static int[] field2646;

    @ObfuscatedName("eo.a")
    public static int[] field2649;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2645[var1] = var0 - 1;
            var0 += var0;
        }
        field2646 = new int[2000];
        field2649 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.z(II)I")
    public static int method2824(int arg0) {
        class42 var1 = class42.method565(arg0);
        int var2 = var1.field954;
        int var3 = var1.field951;
        int var4 = var1.field952;
        int var5 = field2645[var4 - var3];
        return field2649[var2] >> var3 & var5;
    }
}
