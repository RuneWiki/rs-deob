package deob;

@ObfuscatedName("cv")
public class class98 extends class206 {

    @ObfuscatedName("cv.n")
    public static class201 field1436 = new class201(128);

    @ObfuscatedName("cv.v")
    public int[] field1439;

    @ObfuscatedName("cv.y")
    public int[] field1433;

    @ObfuscatedName("cv.r")
    public String[] field1432;

    @ObfuscatedName("cv.h")
    public int field1435;

    @ObfuscatedName("cv.d")
    public int field1434;

    @ObfuscatedName("cv.s")
    public int field1437;

    @ObfuscatedName("cv.b")
    public int field1438;

    @ObfuscatedName("cv.e")
    public class198[] field1431;

    @ObfuscatedName("el.n(II)Lcv;")
    public static class98 method2717(int arg0) {
        class98 var1 = (class98) field1436.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2191.method3931(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class98 var3 = method3743(var2);
            field1436.method3408(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("cz.v(ILhg;I)Lcv;")
    public static class98 method1610(int arg0, class231 arg1) {
        class98 var2 = (class98) field1436.method3407((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2191.method4007(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2191.method3936(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class98 var6 = method3743(var5);
            if (var6 != null) {
                field1436.method3408(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("hm.y([BI)Lcv;")
    public static class98 method3743(byte[] arg0) {
        class98 var1 = new class98();
        class185 var2 = new class185(arg0);
        var2.field2529 = var2.field2528.length - 2;
        int var3 = var2.method3015();
        int var4 = var2.field2528.length - 2 - var3 - 12;
        var2.field2529 = var4;
        int var5 = var2.method3026();
        var1.field1435 = var2.method3015();
        var1.field1434 = var2.method3015();
        var1.field1437 = var2.method3015();
        var1.field1438 = var2.method3015();
        int var6 = var2.method3021();
        if (var6 > 0) {
            var1.field1431 = var1.method1718(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3015();
                class198 var9 = new class198(class189.method3889(var8));
                var1.field1431[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3026();
                    int var11 = var2.method3026();
                    var9.method3387(new class210(var11), (long) var10);
                }
            }
        }
        var2.field2529 = 0;
        var2.method3029();
        var1.field1439 = new int[var5];
        var1.field1433 = new int[var5];
        var1.field1432 = new String[var5];
        int var12 = 0;
        while (var2.field2529 < var4) {
            int var13 = var2.method3015();
            if (var13 == 3) {
                var1.field1432[var12] = var2.method3030();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1433[var12] = var2.method3021();
            } else {
                var1.field1433[var12] = var2.method3026();
            }
            var1.field1439[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cv.r(II)[Lgb;")
    public class198[] method1718(int arg0) {
        return new class198[arg0];
    }
}
