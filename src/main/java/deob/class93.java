package deob;

@ObfuscatedName("cu")
public class class93 extends class176 {

    @ObfuscatedName("cu.c")
    public static class146 field1262 = new class146(128);

    @ObfuscatedName("cu.x")
    public int[] field1252;

    @ObfuscatedName("cu.t")
    public int[] field1254;

    @ObfuscatedName("cu.g")
    public String[] field1255;

    @ObfuscatedName("cu.l")
    public int field1253;

    @ObfuscatedName("cu.u")
    public int field1256;

    @ObfuscatedName("cu.j")
    public int field1258;

    @ObfuscatedName("cu.v")
    public int field1259;

    @ObfuscatedName("cu.d")
    public class316[] field1260;

    @ObfuscatedName("bp.c(II)Lcu;")
    public static class93 method918(int arg0) {
        class93 var1 = (class93) field1262.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field576.method3825(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method1902(var2);
            field1262.method3062(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("hl.x(IIIS)Lcu;")
    public static class93 method3712(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class93 var5 = (class93) field1262.method3061((long) (var3 << 16));
        class93 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field576.method3843(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field576.method3832(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class93 var10 = method1902(var9);
                        if (var10 != null) {
                            field1262.method3062(var10, (long) (var3 << 16));
                            var6 = var10;
                            break label47;
                        }
                    }
                    var6 = null;
                }
            }
        } else {
            var6 = var5;
        }
        if (var6 != null) {
            return var6;
        }
        int var12 = (arg2 + 40000 << 8) + arg0;
        class93 var14 = (class93) field1262.method3061((long) (var12 << 16));
        class93 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field576.method3843(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field576.method3832(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class93 var19 = method1902(var18);
                    if (var19 != null) {
                        field1262.method3062(var19, (long) (var12 << 16));
                        var15 = var19;
                        return var15 == null ? null : var15;
                    }
                }
                var15 = null;
            }
        } else {
            var15 = var14;
        }
        return var15 == null ? null : var15;
    }

    @ObfuscatedName("cl.t([BI)Lcu;")
    public static class93 method1902(byte[] arg0) {
        class93 var1 = new class93();
        class300 var2 = new class300(arg0);
        var2.field3696 = var2.field3694.length - 2;
        int var3 = var2.method5304();
        int var4 = var2.field3694.length - 2 - var3 - 12;
        var2.field3696 = var4;
        int var5 = var2.method5208();
        var1.field1253 = var2.method5304();
        var1.field1256 = var2.method5304();
        var1.field1258 = var2.method5304();
        var1.field1259 = var2.method5304();
        int var6 = var2.method5103();
        if (var6 > 0) {
            var1.field1260 = var1.method2047(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5304();
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
                var1.field1260[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method5208();
                    int var19 = var2.method5208();
                    var17.method5497(new class180(var19), (long) var18);
                }
            }
        }
        var2.field3696 = 0;
        var2.method5108();
        var1.field1252 = new int[var5];
        var1.field1254 = new int[var5];
        var1.field1255 = new String[var5];
        int var20 = 0;
        while (var2.field3696 < var4) {
            int var21 = var2.method5304();
            if (var21 == 3) {
                var1.field1255[var20] = var2.method5112();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1254[var20] = var2.method5103();
            } else {
                var1.field1254[var20] = var2.method5208();
            }
            var1.field1252[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cu.g(IB)[Llj;")
    public class316[] method2047(int arg0) {
        return new class316[arg0];
    }
}
