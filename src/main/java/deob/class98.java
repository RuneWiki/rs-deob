package deob;

@ObfuscatedName("ck")
public class class98 extends class206 {

    @ObfuscatedName("ck.a")
    public static class201 field1432 = new class201(128);

    @ObfuscatedName("ck.w")
    public int[] field1422;

    @ObfuscatedName("ck.e")
    public int[] field1423;

    @ObfuscatedName("ck.k")
    public String[] field1427;

    @ObfuscatedName("ck.u")
    public int field1425;

    @ObfuscatedName("ck.z")
    public int field1426;

    @ObfuscatedName("ck.t")
    public int field1421;

    @ObfuscatedName("ck.f")
    public int field1428;

    @ObfuscatedName("ck.g")
    public class198[] field1429;

    @ObfuscatedName("bm.a(II)Lck;")
    public static class98 method944(int arg0) {
        class98 var1 = (class98) field1432.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2159.method3897(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class98 var3 = method947(var2);
            field1432.method3375(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("y.w(ILhi;B)Lck;")
    public static class98 method72(int arg0, class231 arg1) {
        class98 var2 = (class98) field1432.method3373((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2159.method3962(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2159.method3902(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class98 var6 = method947(var5);
            if (var6 != null) {
                field1432.method3375(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bt.e([BI)Lck;")
    public static class98 method947(byte[] arg0) {
        class98 var1 = new class98();
        class185 var2 = new class185(arg0);
        var2.field2509 = var2.field2512.length - 2;
        int var3 = var2.method3194();
        int var4 = var2.field2512.length - 2 - var3 - 12;
        var2.field2509 = var4;
        int var5 = var2.method2967();
        var1.field1425 = var2.method3194();
        var1.field1426 = var2.method3194();
        var1.field1421 = var2.method3194();
        var1.field1428 = var2.method3194();
        int var6 = var2.method2962();
        if (var6 > 0) {
            var1.field1429 = var1.method1681(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3194();
                class198 var9 = new class198(class189.method2871(var8));
                var1.field1429[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2967();
                    int var11 = var2.method2967();
                    var9.method3341(new class210(var11), (long) var10);
                }
            }
        }
        var2.field2509 = 0;
        var2.method3090();
        var1.field1422 = new int[var5];
        var1.field1423 = new int[var5];
        var1.field1427 = new String[var5];
        int var12 = 0;
        while (var2.field2509 < var4) {
            int var13 = var2.method3194();
            if (var13 == 3) {
                var1.field1427[var12] = var2.method3168();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1423[var12] = var2.method2962();
            } else {
                var1.field1423[var12] = var2.method2967();
            }
            var1.field1422[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ck.k(II)[Lgr;")
    public class198[] method1681(int arg0) {
        return new class198[arg0];
    }
}
