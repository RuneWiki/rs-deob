package deob;

@ObfuscatedName("fq")
public class class157 {

    @ObfuscatedName("fq.z")
    public static int[] field2633 = new int[32];

    @ObfuscatedName("fq.h")
    public static int[] field2632;

    @ObfuscatedName("fq.c")
    public static int[] field2634;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2633[var1] = var0 - 1;
            var0 += var0;
        }
        field2632 = new int[2000];
        field2634 = new int[2000];
    }

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eu.z(II)I")
    public static int method3063(int arg0) {
        class37 var1 = (class37) class37.field954.method3240((long) arg0);
        class37 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field961.method2951(14, arg0);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method808(new class126(var3));
            }
            class37.field954.method3237(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field952;
        int var7 = var2.field953;
        int var8 = var2.field950;
        int var9 = field2633[var8 - var7];
        return field2634[var6] >> var7 & var9;
    }
}
