package deob;

@ObfuscatedName("fd")
public class class180 {

    @ObfuscatedName("fd.s")
    public static int[] field2950 = new int[32];

    @ObfuscatedName("fd.z")
    public static int[] field2953;

    @ObfuscatedName("fd.t")
    public static int[] field2952;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2950[var1] = var0 - 1;
            var0 += var0;
        }
        field2953 = new int[2000];
        field2952 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.s(II)I")
    public static int method3191(int arg0) {
        class51 var1 = (class51) class51.field1064.method3523((long) arg0);
        class51 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1066.method3091(14, arg0);
            class51 var4 = new class51();
            if (var3 != null) {
                var4.method985(new class123(var3));
            }
            class51.field1064.method3521(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1071;
        int var7 = var2.field1067;
        int var8 = var2.field1068;
        int var9 = field2950[var8 - var7];
        return field2952[var6] >> var7 & var9;
    }
}
