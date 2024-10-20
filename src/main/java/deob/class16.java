package deob;

@ObfuscatedName("l")
public class class16 extends class209 {

    @ObfuscatedName("l.e")
    public static class197 field217 = new class197(32);

    @ObfuscatedName("l.w")
    public int[] field220 = new int[] { -1 };

    @ObfuscatedName("l.f")
    public int[] field218 = new int[] { 0 };

    @ObfuscatedName("v.e(IIIII)V")
    public static void method622(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field217.method3507((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field217.method3508(var4, (long) arg0);
        }
        if (var4.field220.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field220.length; var7++) {
                var5[var7] = var4.field220[var7];
                var6[var7] = var4.field218[var7];
            }
            for (int var8 = var4.field220.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field220 = var5;
            var4.field218 = var6;
        }
        var4.field220[arg1] = arg2;
        var4.field218[arg1] = arg3;
    }

    @ObfuscatedName("fg.w(II)V")
    public static void method3182(int arg0) {
        class16 var1 = (class16) field217.method3507((long) arg0);
        if (var1 != null) {
            var1.method3632();
        }
    }
}
