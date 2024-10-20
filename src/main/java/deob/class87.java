package deob;

@ObfuscatedName("cb")
public class class87 extends class209 {

    @ObfuscatedName("cb.c")
    public static class203 field1256 = new class203(128);

    @ObfuscatedName("cb.q")
    public int[] field1247;

    @ObfuscatedName("cb.m")
    public int[] field1249;

    @ObfuscatedName("cb.j")
    public String[] field1248;

    @ObfuscatedName("cb.g")
    public int field1246;

    @ObfuscatedName("cb.i")
    public int field1250;

    @ObfuscatedName("cb.h")
    public int field1251;

    @ObfuscatedName("cb.l")
    public int field1252;

    @ObfuscatedName("cb.d")
    public class200[] field1245;

    @ObfuscatedName("gj.c(III)Lcb;")
    public static class87 method3558(int arg0, int arg1) {
        class87 var2 = (class87) field1256.method3654((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field26.method4228(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field26.method4217(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class87 var6 = method2552(var5);
            if (var6 != null) {
                field1256.method3646(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("dz.q([BB)Lcb;")
    public static class87 method2552(byte[] arg0) {
        class87 var1 = new class87();
        class185 var2 = new class185(arg0);
        var2.field2386 = var2.field2388.length - 2;
        int var3 = var2.method3245();
        int var4 = var2.field2388.length - 2 - var3 - 12;
        var2.field2386 = var4;
        int var5 = var2.method3323();
        var1.field1246 = var2.method3245();
        var1.field1250 = var2.method3245();
        var1.field1251 = var2.method3245();
        var1.field1252 = var2.method3245();
        int var6 = var2.method3243();
        if (var6 > 0) {
            var1.field1245 = var1.method1825(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3245();
                class200 var9 = new class200(var8 > 0 ? class190.method2942(var8) : 1);
                var1.field1245[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3323();
                    int var11 = var2.method3323();
                    var9.method3626(new class214(var11), (long) var10);
                }
            }
        }
        var2.field2386 = 0;
        var2.method3250();
        var1.field1247 = new int[var5];
        var1.field1249 = new int[var5];
        var1.field1248 = new String[var5];
        int var12 = 0;
        while (var2.field2386 < var4) {
            int var13 = var2.method3245();
            if (var13 == 3) {
                var1.field1248[var12] = var2.method3251();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1249[var12] = var2.method3243();
            } else {
                var1.field1249[var12] = var2.method3323();
            }
            var1.field1247[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cb.m(IB)[Lgz;")
    public class200[] method1825(int arg0) {
        return new class200[arg0];
    }
}
