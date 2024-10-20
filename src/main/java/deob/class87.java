package deob;

@ObfuscatedName("dx")
public class class87 extends class506 {

    @ObfuscatedName("dx.ab")
    public static class522 field1046 = new class522(32);

    @ObfuscatedName("dx.ay")
    public int[] field1042 = new int[] { -1 };

    @ObfuscatedName("dx.an")
    public int[] field1049 = new int[] { 0 };

    @ObfuscatedName("lb.ab(IIB)I")
    public static int method5419(int arg0, int arg1) {
        class87 var2 = (class87) field1046.method8544((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1042.length) {
            return var2.field1042[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fc.ay(IIB)I")
    public static int method3164(int arg0, int arg1) {
        class87 var2 = (class87) field1046.method8544((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1049.length) {
            return var2.field1049[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("np.au(IIIII)V")
    public static void method6533(int arg0, int arg1, int arg2, int arg3) {
        class87 var4 = (class87) field1046.method8544((long) arg0);
        if (var4 == null) {
            var4 = new class87();
            field1046.method8551(var4, (long) arg0);
        }
        if (var4.field1042.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1042.length; var7++) {
                var5[var7] = var4.field1042[var7];
                var6[var7] = var4.field1049[var7];
            }
            for (int var8 = var4.field1042.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1042 = var5;
            var4.field1049 = var6;
        }
        var4.field1042[arg1] = arg2;
        var4.field1049[arg1] = arg3;
    }

    @ObfuscatedName("pq.ax(II)V")
    public static void method6776(int arg0) {
        class87 var1 = (class87) field1046.method8544((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1042.length; var2++) {
                var1.field1042[var2] = -1;
                var1.field1049[var2] = 0;
            }
        }
    }

    @ObfuscatedName("kb.ao(IB)V")
    public static void method5006(int arg0) {
        class87 var1 = (class87) field1046.method8544((long) arg0);
        if (var1 != null) {
            var1.method8218();
        }
    }
}
