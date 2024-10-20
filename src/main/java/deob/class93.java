package deob;

@ObfuscatedName("cj")
public class class93 extends class176 {

    @ObfuscatedName("cj.a")
    public static class146 field1255 = new class146(128);

    @ObfuscatedName("cj.t")
    public int[] field1260;

    @ObfuscatedName("cj.n")
    public int[] field1256;

    @ObfuscatedName("cj.q")
    public String[] field1262;

    @ObfuscatedName("cj.v")
    public int field1258;

    @ObfuscatedName("cj.l")
    public int field1257;

    @ObfuscatedName("cj.c")
    public int field1254;

    @ObfuscatedName("cj.o")
    public int field1261;

    @ObfuscatedName("cj.i")
    public class316[] field1259;

    @ObfuscatedName("d.a(II)Lcj;")
    public static class93 method126(int arg0) {
        class93 var1 = (class93) field1255.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1878.method3873(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method211(var2);
            field1255.method3122(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("w.t(IIII)Lcj;")
    public static class93 method300(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class93 var5 = (class93) field1255.method3120((long) (var3 << 16));
        class93 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field1878.method3891(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field1878.method3880(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class93 var10 = method211(var9);
                        if (var10 != null) {
                            field1255.method3122(var10, (long) (var3 << 16));
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
        class93 var14 = (class93) field1255.method3120((long) (var12 << 16));
        class93 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field1878.method3891(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field1878.method3880(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class93 var19 = method211(var18);
                    if (var19 != null) {
                        field1255.method3122(var19, (long) (var12 << 16));
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

    @ObfuscatedName("s.n([BB)Lcj;")
    public static class93 method211(byte[] arg0) {
        class93 var1 = new class93();
        class300 var2 = new class300(arg0);
        var2.field3694 = var2.field3699.length - 2;
        int var3 = var2.method5166();
        int var4 = var2.field3699.length - 2 - var3 - 12;
        var2.field3694 = var4;
        int var5 = var2.method5155();
        var1.field1258 = var2.method5166();
        var1.field1257 = var2.method5166();
        var1.field1254 = var2.method5166();
        var1.field1261 = var2.method5166();
        int var6 = var2.method5123();
        if (var6 > 0) {
            var1.field1259 = var1.method2145(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5166();
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
                var1.field1259[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method5155();
                    int var19 = var2.method5155();
                    var17.method5495(new class180(var19), (long) var18);
                }
            }
        }
        var2.field3694 = 0;
        var2.method5292();
        var1.field1260 = new int[var5];
        var1.field1256 = new int[var5];
        var1.field1262 = new String[var5];
        int var20 = 0;
        while (var2.field3694 < var4) {
            int var21 = var2.method5166();
            if (var21 == 3) {
                var1.field1262[var20] = var2.method5132();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1256[var20] = var2.method5123();
            } else {
                var1.field1256[var20] = var2.method5155();
            }
            var1.field1260[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cj.q(IB)[Llr;")
    public class316[] method2145(int arg0) {
        return new class316[arg0];
    }
}
