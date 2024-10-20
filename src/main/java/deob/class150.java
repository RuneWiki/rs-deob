package deob;

@ObfuscatedName("ed")
public class class150 {

    @ObfuscatedName("ed.m")
    public static int[] field2607 = new int[32];

    @ObfuscatedName("ed.k")
    public static int[] field2602;

    @ObfuscatedName("ed.y")
    public static int[] field2603;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2607[var1] = var0 - 1;
            var0 += var0;
        }
        field2602 = new int[2000];
        field2603 = new int[2000];
    }

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.m(IB)I")
    public static int method88(int arg0) {
        class39 var1 = (class39) class39.field947.method3137((long) arg0);
        class39 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field945.method2725(14, arg0);
            class39 var4 = new class39();
            if (var3 != null) {
                var4.method760(new class104(var3));
            }
            class39.field947.method3130(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field954;
        int var7 = var2.field948;
        int var8 = var2.field949;
        int var9 = field2607[var8 - var7];
        return field2603[var6] >> var7 & var9;
    }
}
