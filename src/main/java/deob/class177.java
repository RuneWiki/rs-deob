package deob;

@ObfuscatedName("ff")
public class class177 {

    @ObfuscatedName("ff.b")
    public static int[] field2899 = new int[32];

    @ObfuscatedName("ff.g")
    public static int[] field2895;

    @ObfuscatedName("ff.j")
    public static int[] field2897;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2899[var1] = var0 - 1;
            var0 += var0;
        }
        field2895 = new int[2000];
        field2897 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.b(IB)I")
    public static int method89(int arg0) {
        class48 var1 = (class48) class48.field1043.method3495((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1045.method3037(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method957(new class120(var3));
            }
            class48.field1043.method3490(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1044;
        int var7 = var2.field1046;
        int var8 = var2.field1048;
        int var9 = field2899[var8 - var7];
        return field2897[var6] >> var7 & var9;
    }
}
