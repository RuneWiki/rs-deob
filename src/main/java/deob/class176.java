package deob;

@ObfuscatedName("fk")
public class class176 {

    @ObfuscatedName("fk.m")
    public static int[] field2883 = new int[32];

    @ObfuscatedName("fk.l")
    public static int[] field2879;

    @ObfuscatedName("fk.y")
    public static int[] field2878;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2883[var1] = var0 - 1;
            var0 += var0;
        }
        field2879 = new int[2000];
        field2878 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.m(IB)I")
    public static int method2171(int arg0) {
        class48 var1 = class48.method3213(arg0);
        int var2 = var1.field1029;
        int var3 = var1.field1038;
        int var4 = var1.field1030;
        int var5 = field2883[var4 - var3];
        return field2878[var2] >> var3 & var5;
    }
}
