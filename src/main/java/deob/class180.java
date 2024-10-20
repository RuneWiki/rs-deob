package deob;

@ObfuscatedName("fb")
public class class180 {

    @ObfuscatedName("fb.a")
    public static int[] field2968 = new int[32];

    @ObfuscatedName("fb.d")
    public static int[] field2966;

    @ObfuscatedName("fb.v")
    public static int[] field2969;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2968[var1] = var0 - 1;
            var0 += var0;
        }
        field2966 = new int[2000];
        field2969 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.a(II)I")
    public static int method3001(int arg0) {
        class51 var1 = class51.method599(arg0);
        int var2 = var1.field1112;
        int var3 = var1.field1111;
        int var4 = var1.field1114;
        int var5 = field2968[var4 - var3];
        return field2969[var2] >> var3 & var5;
    }
}
