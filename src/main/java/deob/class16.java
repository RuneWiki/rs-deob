package deob;

@ObfuscatedName("a")
public class class16 extends class212 {

    @ObfuscatedName("a.s")
    public static class200 field207 = new class200(32);

    @ObfuscatedName("a.z")
    public int[] field202 = new int[] { -1 };

    @ObfuscatedName("a.t")
    public int[] field203 = new int[] { 0 };

    @ObfuscatedName("dd.s(III)I")
    public static int method2301(int arg0, int arg1) {
        class16 var2 = (class16) field207.method3555((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field202.length) {
            return var2.field202[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ah.z(III)I")
    public static int method654(int arg0, int arg1) {
        class16 var2 = (class16) field207.method3555((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field203.length) {
            return var2.field203[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ah.t(IIIIS)V")
    public static void method650(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field207.method3555((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field207.method3556(var4, (long) arg0);
        }
        if (var4.field202.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field202.length; var7++) {
                var5[var7] = var4.field202[var7];
                var6[var7] = var4.field203[var7];
            }
            for (int var8 = var4.field202.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field202 = var5;
            var4.field203 = var6;
        }
        var4.field202[arg1] = arg2;
        var4.field203[arg1] = arg3;
    }

    @ObfuscatedName("h.y(IB)V")
    public static void method122(int arg0) {
        class16 var1 = (class16) field207.method3555((long) arg0);
        if (var1 != null) {
            var1.method3699();
        }
    }
}
