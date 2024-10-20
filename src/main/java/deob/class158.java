package deob;

@ObfuscatedName("fx")
public class class158 {

    @ObfuscatedName("fx.p")
    public static int[] field2698 = new int[32];

    @ObfuscatedName("fx.j")
    public static int[] field2699;

    @ObfuscatedName("fx.w")
    public static int[] field2700;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2698[var1] = var0 - 1;
            var0 += var0;
        }
        field2699 = new int[2000];
        field2700 = new int[2000];
    }

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.p(II)I")
    public static int method1991(int arg0) {
        class37 var1 = (class37) class37.field951.method3214((long) arg0);
        class37 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field952.method2973(14, arg0);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method784(new class126(var3));
            }
            class37.field951.method3223(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field957;
        int var7 = var2.field953;
        int var8 = var2.field954;
        int var9 = field2698[var8 - var7];
        return field2700[var6] >> var7 & var9;
    }
}
