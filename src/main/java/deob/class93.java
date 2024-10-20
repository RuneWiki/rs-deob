package deob;

@ObfuscatedName("cx")
public class class93 extends class176 {

    @ObfuscatedName("cx.q")
    public static class146 field1292 = new class146(128);

    @ObfuscatedName("cx.w")
    public int[] field1285;

    @ObfuscatedName("cx.e")
    public int[] field1289;

    @ObfuscatedName("cx.p")
    public String[] field1287;

    @ObfuscatedName("cx.k")
    public int field1284;

    @ObfuscatedName("cx.l")
    public int field1286;

    @ObfuscatedName("cx.b")
    public int field1290;

    @ObfuscatedName("cx.i")
    public int field1291;

    @ObfuscatedName("cx.c")
    public class317[] field1288;

    @ObfuscatedName("di.q(IB)Lcx;")
    public static class93 method2690(int arg0) {
        class93 var1 = (class93) field1292.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1972.method3775(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method1540(var2);
            field1292.method3041(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bv.w(IIIS)Lcx;")
    public static class93 method1663(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class93 var5 = method683(var3, arg0);
        if (var5 == null) {
            int var6 = class223.method5428(arg2, arg0);
            class93 var7 = method683(var6, arg0);
            return var7 == null ? null : var7;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("ay.e(IIB)Lcx;")
    public static class93 method683(int arg0, int arg1) {
        class93 var2 = (class93) field1292.method3039((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1972.method3791(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1972.method3839(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class93 var6 = method1540(var5);
            if (var6 != null) {
                field1292.method3041(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bw.p([BI)Lcx;")
    public static class93 method1540(byte[] arg0) {
        class93 var1 = new class93();
        class301 var2 = new class301(arg0);
        var2.field3733 = var2.field3731.length - 2;
        int var3 = var2.method5069();
        int var4 = var2.field3731.length - 2 - var3 - 12;
        var2.field3733 = var4;
        int var5 = var2.method5072();
        var1.field1284 = var2.method5069();
        var1.field1286 = var2.method5069();
        var1.field1290 = var2.method5069();
        var1.field1291 = var2.method5069();
        int var6 = var2.method5077();
        if (var6 > 0) {
            var1.field1288 = var1.method1991(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5069();
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
                class317 var17 = new class317(var16);
                var1.field1288[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method5072();
                    int var19 = var2.method5072();
                    var17.method5465(new class180(var19), (long) var18);
                }
            }
        }
        var2.field3733 = 0;
        var2.method5049();
        var1.field1285 = new int[var5];
        var1.field1289 = new int[var5];
        var1.field1287 = new String[var5];
        int var20 = 0;
        while (var2.field3733 < var4) {
            int var21 = var2.method5069();
            if (var21 == 3) {
                var1.field1287[var20] = var2.method5076();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1289[var20] = var2.method5077();
            } else {
                var1.field1289[var20] = var2.method5072();
            }
            var1.field1285[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cx.k(IB)[Lla;")
    public class317[] method1991(int arg0) {
        return new class317[arg0];
    }
}
