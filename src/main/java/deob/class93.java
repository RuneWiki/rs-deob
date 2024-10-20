package deob;

@ObfuscatedName("cr")
public class class93 extends class176 {

    @ObfuscatedName("cr.s")
    public static class146 field1255 = new class146(128);

    @ObfuscatedName("cr.j")
    public int[] field1254;

    @ObfuscatedName("cr.i")
    public int[] field1259;

    @ObfuscatedName("cr.k")
    public String[] field1256;

    @ObfuscatedName("cr.u")
    public int field1258;

    @ObfuscatedName("cr.n")
    public int field1257;

    @ObfuscatedName("cr.t")
    public int field1260;

    @ObfuscatedName("cr.q")
    public int field1261;

    @ObfuscatedName("cr.x")
    public class316[] field1262;

    @ObfuscatedName("bh.s(II)Lcr;")
    public static class93 method978(int arg0) {
        class93 var1 = (class93) field1255.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field440.method3790(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method5749(var2);
            field1255.method3067(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("az.j(IIII)Lcr;")
    public static class93 method473(int arg0, int arg1, int arg2) {
        int var3 = class223.method2084(arg1, arg0);
        class93 var4 = (class93) field1255.method3065((long) (var3 << 16));
        class93 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field440.method3775(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field440.method3831(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class93 var9 = method5749(var8);
                        if (var9 != null) {
                            field1255.method3067(var9, (long) (var3 << 16));
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
        class93 var13 = (class93) field1255.method3065((long) (var11 << 16));
        class93 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field440.method3775(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field440.method3831(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class93 var18 = method5749(var17);
                    if (var18 != null) {
                        field1255.method3067(var18, (long) (var11 << 16));
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

    @ObfuscatedName("lk.i([BS)Lcr;")
    public static class93 method5749(byte[] arg0) {
        class93 var1 = new class93();
        class300 var2 = new class300(arg0);
        var2.field3704 = var2.field3701.length - 2;
        int var3 = var2.method5054();
        int var4 = var2.field3701.length - 2 - var3 - 12;
        var2.field3704 = var4;
        int var5 = var2.method5056();
        var1.field1258 = var2.method5054();
        var1.field1257 = var2.method5054();
        var1.field1260 = var2.method5054();
        var1.field1261 = var2.method5054();
        int var6 = var2.method5179();
        if (var6 > 0) {
            var1.field1262 = var1.method2017(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5054();
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
                var1.field1262[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method5056();
                    int var19 = var2.method5056();
                    var17.method5400(new class180(var19), (long) var18);
                }
            }
        }
        var2.field3704 = 0;
        var2.method5059();
        var1.field1254 = new int[var5];
        var1.field1259 = new int[var5];
        var1.field1256 = new String[var5];
        int var20 = 0;
        while (var2.field3704 < var4) {
            int var21 = var2.method5054();
            if (var21 == 3) {
                var1.field1256[var20] = var2.method5150();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1259[var20] = var2.method5179();
            } else {
                var1.field1259[var20] = var2.method5056();
            }
            var1.field1254[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cr.k(II)[Lln;")
    public class316[] method2017(int arg0) {
        return new class316[arg0];
    }
}
