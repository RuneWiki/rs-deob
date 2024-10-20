package deob;

@ObfuscatedName("cu")
public class class93 extends class183 {

    @ObfuscatedName("cu.f")
    public static class155 field1263 = new class155(128);

    @ObfuscatedName("cu.i")
    public int[] field1261;

    @ObfuscatedName("cu.y")
    public int[] field1262;

    @ObfuscatedName("cu.w")
    public String[] field1260;

    @ObfuscatedName("cu.p")
    public int field1272;

    @ObfuscatedName("cu.b")
    public int field1265;

    @ObfuscatedName("cu.e")
    public int field1266;

    @ObfuscatedName("cu.x")
    public int field1267;

    @ObfuscatedName("cu.a")
    public class316[] field1264;

    @ObfuscatedName("bq.f(IB)Lcu;")
    public static class93 method1005(int arg0) {
        class93 var1 = (class93) field1263.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1398.method3752(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method1004(var2);
            field1263.method3101(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("t.i(IIII)Lcu;")
    public static class93 method160(int arg0, int arg1, int arg2) {
        int var3 = class223.method3722(arg1, arg0);
        class93 var4 = (class93) field1263.method3099((long) (var3 << 16));
        class93 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field1398.method3847(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field1398.method3759(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class93 var9 = method1004(var8);
                        if (var9 != null) {
                            field1263.method3101(var9, (long) (var3 << 16));
                            var5 = var9;
                            break label47;
                        }
                    }
                    var5 = null;
                }
            }
        } else {
            var5 = var4;
        }
        if (var5 != null) {
            return var5;
        }
        int var11 = (arg2 + 40000 << 8) + arg0;
        class93 var13 = (class93) field1263.method3099((long) (var11 << 16));
        class93 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field1398.method3847(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field1398.method3759(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class93 var18 = method1004(var17);
                    if (var18 != null) {
                        field1263.method3101(var18, (long) (var11 << 16));
                        var14 = var18;
                        return var14 == null ? null : var14;
                    }
                }
                var14 = null;
            }
        } else {
            var14 = var13;
        }
        return var14 == null ? null : var14;
    }

    @ObfuscatedName("bl.y([BI)Lcu;")
    public static class93 method1004(byte[] arg0) {
        class93 var1 = new class93();
        class300 var2 = new class300(arg0);
        var2.field3703 = var2.field3704.length - 2;
        int var3 = var2.method5112();
        int var4 = var2.field3704.length - 2 - var3 - 12;
        var2.field3703 = var4;
        int var5 = var2.method5192();
        var1.field1272 = var2.method5112();
        var1.field1265 = var2.method5112();
        var1.field1266 = var2.method5112();
        var1.field1267 = var2.method5112();
        int var6 = var2.method5110();
        if (var6 > 0) {
            var1.field1264 = var1.method2060(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5112();
                int var16;
                if (var8 > 0) {
                    int var9 = var8 - 1;
                    int var10 = var9 | var9 >>> 1;
                    int var11 = var10 | var10 >>> 2;
                    int var12 = var11 | var11 >>> 4;
                    int var13 = var12 | var12 >>> 8;
                    int var14 = var13 | var13 >>> 16;
                    int var15 = var14 + 1;
                    var16 = var15;
                } else {
                    var16 = 1;
                }
                class316 var17 = new class316(var16);
                var1.field1264[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method5192();
                    int var19 = var2.method5192();
                    var17.method5469(new class187(var19), (long) var18);
                }
            }
        }
        var2.field3703 = 0;
        var2.method5118();
        var1.field1261 = new int[var5];
        var1.field1262 = new int[var5];
        var1.field1260 = new String[var5];
        int var20 = 0;
        while (var2.field3703 < var4) {
            int var21 = var2.method5112();
            if (var21 == 3) {
                var1.field1260[var20] = var2.method5119();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1262[var20] = var2.method5110();
            } else {
                var1.field1262[var20] = var2.method5192();
            }
            var1.field1261[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cu.w(IB)[Llc;")
    public class316[] method2060(int arg0) {
        return new class316[arg0];
    }
}
