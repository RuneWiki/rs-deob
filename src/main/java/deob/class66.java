package deob;

@ObfuscatedName("bq")
public class class66 extends class217 {

    @ObfuscatedName("bq.o")
    public static class215 field772 = new class215(32);

    @ObfuscatedName("bq.k")
    public int[] field769 = new int[] { -1 };

    @ObfuscatedName("bq.t")
    public int[] field768 = new int[] { 0 };

    @ObfuscatedName("bn.o(III)I")
    public static int method959(int arg0, int arg1) {
        class66 var2 = (class66) field772.method3637((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field769.length) {
            return var2.field769[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("x.k(IIB)I")
    public static int method37(int arg0, int arg1) {
        class66 var2 = (class66) field772.method3637((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field768.length) {
            return var2.field768[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.t(IIIIB)V")
    public static void method1525(int arg0, int arg1, int arg2, int arg3) {
        class66 var4 = (class66) field772.method3637((long) arg0);
        if (var4 == null) {
            var4 = new class66();
            field772.method3638(var4, (long) arg0);
        }
        if (var4.field769.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field769.length; var7++) {
                var5[var7] = var4.field769[var7];
                var6[var7] = var4.field768[var7];
            }
            for (int var8 = var4.field769.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field769 = var5;
            var4.field768 = var6;
        }
        var4.field769[arg1] = arg2;
        var4.field768[arg1] = arg3;
    }

    @ObfuscatedName("aa.d(I)V")
    public static void method506() {
        field772 = new class215(32);
    }
}
