package deob;

@ObfuscatedName("fh")
public class class177 {

    @ObfuscatedName("fh.a")
    public static int[] field2910 = new int[32];

    @ObfuscatedName("fh.w")
    public static int[] field2907;

    @ObfuscatedName("fh.d")
    public static int[] field2906;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2910[var1] = var0 - 1;
            var0 += var0;
        }
        field2907 = new int[2000];
        field2906 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.a(IB)I")
    public static int method2119(int arg0) {
        class48 var1 = (class48) class48.field1074.method3579((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1908.method3188(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method1049(new class120(var3));
            }
            class48.field1074.method3581(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1075;
        int var7 = var2.field1076;
        int var8 = var2.field1077;
        int var9 = field2910[var8 - var7];
        return field2906[var6] >> var7 & var9;
    }

    @ObfuscatedName("fd.w(IIB)V")
    public static void method3052(int arg0, int arg1) {
        class48 var2 = (class48) class48.field1074.method3579((long) arg0);
        class48 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1908.method3188(14, arg0);
            class48 var5 = new class48();
            if (var4 != null) {
                var5.method1049(new class120(var4));
            }
            class48.field1074.method3581(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1075;
        int var8 = var3.field1076;
        int var9 = var3.field1077;
        int var10 = field2910[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2906[var7] = field2906[var7] & ~var11 | arg1 << var8 & var11;
    }
}
