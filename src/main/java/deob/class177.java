package deob;

@ObfuscatedName("fw")
public class class177 {

    @ObfuscatedName("fw.s")
    public static int[] field2920 = new int[32];

    @ObfuscatedName("fw.j")
    public static int[] field2919;

    @ObfuscatedName("fw.p")
    public static int[] field2921;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2920[var1] = var0 - 1;
            var0 += var0;
        }
        field2919 = new int[2000];
        field2921 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.s(IB)I")
    public static int method680(int arg0) {
        class48 var1 = (class48) class48.field1066.method3484((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1071.method3014(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method935(new class120(var3));
            }
            class48.field1066.method3486(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1067;
        int var7 = var2.field1065;
        int var8 = var2.field1069;
        int var9 = field2920[var8 - var7];
        return field2921[var6] >> var7 & var9;
    }
}
