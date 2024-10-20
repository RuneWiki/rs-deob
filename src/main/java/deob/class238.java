package deob;

@ObfuscatedName("im")
public class class238 {

    @ObfuscatedName("im.g")
    public static int[] field2787 = new int[32];

    @ObfuscatedName("im.e")
    public static int[] field2786;

    @ObfuscatedName("im.b")
    public static int[] field2788;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2787[var1] = var0 - 1;
            var0 += var0;
        }
        field2786 = new int[2000];
        field2788 = new int[2000];
    }

    public class238() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jp.g(II)I")
    public static int method4502(int arg0) {
        class278 var1 = (class278) class278.field3544.method3706((long) arg0);
        class278 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3541.method4294(14, arg0);
            class278 var4 = new class278();
            if (var3 != null) {
                var4.method4592(new class195(var3));
            }
            class278.field3544.method3712(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3540;
        int var7 = var2.field3543;
        int var8 = var2.field3542;
        int var9 = field2787[var8 - var7];
        return field2788[var6] >> var7 & var9;
    }
}
