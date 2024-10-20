package deob;

@ObfuscatedName("da")
public class class82 extends class511 {

    @ObfuscatedName("da.ap")
    public static class316 field1009 = new class316(128);

    @ObfuscatedName("da.aw")
    public String field1003;

    @ObfuscatedName("da.ak")
    public int[] field1004;

    @ObfuscatedName("da.aj")
    public int[] field1006;

    @ObfuscatedName("da.ai")
    public String[] field1007;

    @ObfuscatedName("da.ay")
    public int field1008;

    @ObfuscatedName("da.as")
    public int field1005;

    @ObfuscatedName("da.ae")
    public int field1010;

    @ObfuscatedName("da.am")
    public int field1011;

    @ObfuscatedName("da.at")
    public class530[] field1012;

    @ObfuscatedName("ly.ap(IS)Lda;")
    public static class82 method5804(int arg0) {
        class82 var1 = (class82) field1009.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3.method7009(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class82 var3 = method2473(var2);
            field1009.method5931(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("us.aw(IIII)Lda;")
    public static class82 method8938(int arg0, int arg1, int arg2) {
        int var3 = class382.method5947(arg1, arg0);
        class82 var4 = method4343(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class382.method9115(arg2, arg0);
        class82 var6 = method4343(var5, arg0);
        if (var6 == null) {
            int var7 = class382.method2433(arg0);
            class82 var8 = method4343(var7, arg0);
            return var8 == null ? null : var8;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ig.ak(III)Lda;")
    public static class82 method4343(int arg0, int arg1) {
        class82 var2 = (class82) field1009.method5928((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field3.method7010(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field3.method7052(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class82 var6 = method2473(var5);
            if (var6 != null) {
                field1009.method5931(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("dm.aj([BI)Lda;")
    public static class82 method2473(byte[] arg0) {
        class82 var1 = new class82();
        class558 var2 = new class558(arg0);
        var2.field5462 = var2.field5463.length - 2;
        int var3 = var2.method9260();
        int var4 = var2.field5463.length - 2 - var3 - 12;
        var2.field5462 = var4;
        int var5 = var2.method9264();
        var1.field1008 = var2.method9260();
        var1.field1005 = var2.method9260();
        var1.field1010 = var2.method9260();
        var1.field1011 = var2.method9260();
        int var6 = var2.method9258();
        if (var6 > 0) {
            var1.field1012 = var1.method2353(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method9260();
                class530 var9 = new class530(var8 > 0 ? class332.method2832(var8) : 1);
                var1.field1012[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method9264();
                    int var11 = var2.method9264();
                    var9.method8970(new class514(var11), (long) var10);
                }
            }
        }
        var2.field5462 = 0;
        var1.field1003 = var2.method9268();
        var1.field1004 = new int[var5];
        var1.field1006 = new int[var5];
        var1.field1007 = new String[var5];
        int var12 = 0;
        while (var2.field5462 < var4) {
            int var13 = var2.method9260();
            if (var13 == 3) {
                var1.field1007[var12] = var2.method9269();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1006[var12] = var2.method9258();
            } else {
                var1.field1006[var12] = var2.method9264();
            }
            var1.field1004[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("da.ai(IS)[Lum;")
    public class530[] method2353(int arg0) {
        return new class530[arg0];
    }

    @ObfuscatedName("az.ay(S)V")
    public static void method199() {
        field1009.method5930();
    }
}
