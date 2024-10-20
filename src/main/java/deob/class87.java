package deob;

@ObfuscatedName("cu")
public class class87 extends class209 {

    @ObfuscatedName("cu.y")
    public static class203 field1242 = new class203(128);

    @ObfuscatedName("cu.c")
    public int[] field1248;

    @ObfuscatedName("cu.n")
    public int[] field1240;

    @ObfuscatedName("cu.u")
    public String[] field1241;

    @ObfuscatedName("cu.i")
    public int field1243;

    @ObfuscatedName("cu.r")
    public int field1244;

    @ObfuscatedName("cu.j")
    public int field1245;

    @ObfuscatedName("cu.p")
    public int field1246;

    @ObfuscatedName("cu.e")
    public class200[] field1239;

    @ObfuscatedName("kw.y(IB)Lcu;")
    public static class87 method5123(int arg0) {
        class87 var1 = (class87) field1242.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field234.method4263(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method96(var2);
            field1242.method3687(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("dl.c(III)Lcu;")
    public static class87 method2562(int arg0, int arg1) {
        class87 var2 = (class87) field1242.method3685((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field234.method4274(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field234.method4326(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class87 var6 = method96(var5);
            if (var6 != null) {
                field1242.method3687(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("s.n([BI)Lcu;")
    public static class87 method96(byte[] arg0) {
        class87 var1 = new class87();
        class185 var2 = new class185(arg0);
        var2.field2374 = var2.field2373.length - 2;
        int var3 = var2.method3280();
        int var4 = var2.field2373.length - 2 - var3 - 12;
        var2.field2374 = var4;
        int var5 = var2.method3374();
        var1.field1243 = var2.method3280();
        var1.field1244 = var2.method3280();
        var1.field1245 = var2.method3280();
        var1.field1246 = var2.method3280();
        int var6 = var2.method3299();
        if (var6 > 0) {
            var1.field1239 = var1.method1871(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3280();
                class200 var9 = new class200(var8 > 0 ? class190.method2844(var8) : 1);
                var1.field1239[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3374();
                    int var11 = var2.method3374();
                    var9.method3651(new class214(var11), (long) var10);
                }
            }
        }
        var2.field2374 = 0;
        var2.method3276();
        var1.field1248 = new int[var5];
        var1.field1240 = new int[var5];
        var1.field1241 = new String[var5];
        int var12 = 0;
        while (var2.field2374 < var4) {
            int var13 = var2.method3280();
            if (var13 == 3) {
                var1.field1241[var12] = var2.method3277();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1240[var12] = var2.method3299();
            } else {
                var1.field1240[var12] = var2.method3374();
            }
            var1.field1248[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cu.u(II)[Lgo;")
    public class200[] method1871(int arg0) {
        return new class200[arg0];
    }
}
