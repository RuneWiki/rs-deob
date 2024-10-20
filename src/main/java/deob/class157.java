package deob;

@ObfuscatedName("fg")
public class class157 {

    @ObfuscatedName("fg.l")
    public static int[] field2656 = new int[32];

    @ObfuscatedName("fg.y")
    public static int[] field2654;

    @ObfuscatedName("fg.g")
    public static int[] field2655;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2656[var1] = var0 - 1;
            var0 += var0;
        }
        field2654 = new int[2000];
        field2655 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.l(II)I")
    public static int method3208(int arg0) {
        class43 var1 = (class43) class43.field976.method3225((long) arg0);
        class43 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field977.method2752(14, arg0);
            class43 var4 = new class43();
            if (var3 != null) {
                var4.method827(new class108(var3));
            }
            class43.field976.method3211(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field974;
        int var7 = var2.field979;
        int var8 = var2.field978;
        int var9 = field2656[var8 - var7];
        return field2655[var6] >> var7 & var9;
    }
}
