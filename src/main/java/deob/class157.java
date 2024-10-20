package deob;

@ObfuscatedName("fa")
public class class157 {

    @ObfuscatedName("fa.c")
    public static int[] field2669 = new int[32];

    @ObfuscatedName("fa.j")
    public static int[] field2668;

    @ObfuscatedName("fa.y")
    public static int[] field2671;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2669[var1] = var0 - 1;
            var0 += var0;
        }
        field2668 = new int[2000];
        field2671 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.c(II)I")
    public static int method461(int arg0) {
        class43 var1 = (class43) class43.field978.method3178((long) arg0);
        class43 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field983.method2746(14, arg0);
            class43 var4 = new class43();
            if (var3 != null) {
                var4.method804(new class108(var3));
            }
            class43.field978.method3167(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field979;
        int var7 = var2.field984;
        int var8 = var2.field981;
        int var9 = field2669[var8 - var7];
        return field2671[var6] >> var7 & var9;
    }
}
