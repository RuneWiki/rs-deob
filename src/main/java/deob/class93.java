package deob;

@ObfuscatedName("cg")
public class class93 extends class181 {

    @ObfuscatedName("cg.m")
    public static class146 field1267 = new class146(128);

    @ObfuscatedName("cg.f")
    public int[] field1257;

    @ObfuscatedName("cg.q")
    public int[] field1259;

    @ObfuscatedName("cg.w")
    public String[] field1260;

    @ObfuscatedName("cg.o")
    public int field1261;

    @ObfuscatedName("cg.u")
    public int field1262;

    @ObfuscatedName("cg.g")
    public int field1263;

    @ObfuscatedName("cg.l")
    public int field1264;

    @ObfuscatedName("cg.e")
    public class317[] field1265;

    @ObfuscatedName("dx.m(II)Lcg;")
    public static class93 method2238(int arg0) {
        class93 var1 = (class93) field1267.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1120.method4156(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method2984(var2);
            field1267.method3009(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("el.f(IIII)Lcg;")
    public static class93 method2978(int arg0, int arg1, int arg2) {
        int var3 = class234.method108(arg1, arg0);
        class93 var4 = method1037(var3, arg0);
        if (var4 == null) {
            int var5 = class234.method3723(arg2, arg0);
            class93 var6 = method1037(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("bx.q(IIB)Lcg;")
    public static class93 method1037(int arg0, int arg1) {
        class93 var2 = (class93) field1267.method3011((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1120.method4174(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1120.method4195(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class93 var6 = method2984(var5);
            if (var6 != null) {
                field1267.method3009(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ee.w([BI)Lcg;")
    public static class93 method2984(byte[] arg0) {
        class93 var1 = new class93();
        class202 var2 = new class202(arg0);
        var2.field2439 = var2.field2440.length - 2;
        int var3 = var2.method3530();
        int var4 = var2.field2440.length - 2 - var3 - 12;
        var2.field2439 = var4;
        int var5 = var2.method3620();
        var1.field1261 = var2.method3530();
        var1.field1262 = var2.method3530();
        var1.field1263 = var2.method3530();
        var1.field1264 = var2.method3530();
        int var6 = var2.method3551();
        if (var6 > 0) {
            var1.field1265 = var1.method2018(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3530();
                class317 var9 = new class317(var8 > 0 ? class207.method1594(var8) : 1);
                var1.field1265[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3620();
                    int var11 = var2.method3620();
                    var9.method5383(new class185(var11), (long) var10);
                }
            }
        }
        var2.field2439 = 0;
        var2.method3425();
        var1.field1257 = new int[var5];
        var1.field1259 = new int[var5];
        var1.field1260 = new String[var5];
        int var12 = 0;
        while (var2.field2439 < var4) {
            int var13 = var2.method3530();
            if (var13 == 3) {
                var1.field1260[var12] = var2.method3426();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1259[var12] = var2.method3551();
            } else {
                var1.field1259[var12] = var2.method3620();
            }
            var1.field1257[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cg.o(II)[Llh;")
    public class317[] method2018(int arg0) {
        return new class317[arg0];
    }
}
