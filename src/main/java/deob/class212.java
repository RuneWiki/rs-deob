package deob;

@ObfuscatedName("hl")
public class class212 {

    @ObfuscatedName("hl.a")
    public static int[] field2610 = new int[32];

    @ObfuscatedName("hl.j")
    public static int[] field2608;

    @ObfuscatedName("hl.n")
    public static int[] field2613;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2610[var1] = var0 - 1;
            var0 += var0;
        }
        field2608 = new int[2000];
        field2613 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.a(II)I")
    public static int method4(int arg0) {
        class251 var1 = (class251) class251.field3380.method3245((long) arg0);
        class251 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3379.method3787(14, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method4039(new class174(var3));
            }
            class251.field3380.method3247(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3383;
        int var7 = var2.field3382;
        int var8 = var2.field3381;
        int var9 = field2610[var8 - var7];
        return field2613[var6] >> var7 & var9;
    }
}
