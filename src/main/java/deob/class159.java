package deob;

@ObfuscatedName("fh")
public class class159 {

    @ObfuscatedName("fh.g")
    public static int[] field2692 = new int[32];

    @ObfuscatedName("fh.m")
    public static int[] field2691;

    @ObfuscatedName("fh.v")
    public static int[] field2693;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2692[var1] = var0 - 1;
            var0 += var0;
        }
        field2691 = new int[2000];
        field2693 = new int[2000];
    }

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.g(IB)I")
    public static int method2666(int arg0) {
        class38 var1 = (class38) class38.field944.method3245((long) arg0);
        class38 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field950.method2968(14, arg0);
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method802(new class127(var3));
            }
            class38.field944.method3249(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field945;
        int var7 = var2.field952;
        int var8 = var2.field947;
        int var9 = field2692[var8 - var7];
        return field2693[var6] >> var7 & var9;
    }
}
