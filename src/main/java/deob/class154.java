package deob;

@ObfuscatedName("ea")
public class class154 {

    @ObfuscatedName("ea.j")
    public static int[] field2665 = new int[32];

    @ObfuscatedName("ea.z")
    public static int[] field2663;

    @ObfuscatedName("ea.y")
    public static int[] field2664;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2665[var1] = var0 - 1;
            var0 += var0;
        }
        field2663 = new int[2000];
        field2664 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.j(IB)I")
    public static int method480(int arg0) {
        class42 var1 = class42.method2467(arg0);
        int var2 = var1.field974;
        int var3 = var1.field983;
        int var4 = var1.field977;
        int var5 = field2665[var4 - var3];
        return field2664[var2] >> var3 & var5;
    }
}
