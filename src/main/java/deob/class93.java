package deob;

@ObfuscatedName("ci")
public class class93 extends class176 {

    @ObfuscatedName("ci.u")
    public static class146 field1278 = new class146(128);

    @ObfuscatedName("ci.f")
    public int[] field1277;

    @ObfuscatedName("ci.b")
    public int[] field1280;

    @ObfuscatedName("ci.g")
    public String[] field1279;

    @ObfuscatedName("ci.z")
    public int field1276;

    @ObfuscatedName("ci.p")
    public int field1281;

    @ObfuscatedName("ci.h")
    public int field1282;

    @ObfuscatedName("ci.y")
    public int field1283;

    @ObfuscatedName("ci.w")
    public class316[] field1284;

    @ObfuscatedName("ag.u(II)Lci;")
    public static class93 method500(int arg0) {
        class93 var1 = (class93) field1278.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3558.method3928(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method357(var2);
            field1278.method3078(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gk.f(IIII)Lci;")
    public static class93 method3403(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class93 var5 = method729(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0;
            class93 var8 = method729(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("au.b(IIB)Lci;")
    public static class93 method729(int arg0, int arg1) {
        class93 var2 = (class93) field1278.method3076((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field3558.method3917(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field3558.method3850(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class93 var6 = method357(var5);
            if (var6 != null) {
                field1278.method3078(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("af.g([BI)Lci;")
    public static class93 method357(byte[] arg0) {
        class93 var1 = new class93();
        class300 var2 = new class300(arg0);
        var2.field3707 = var2.field3708.length - 2;
        int var3 = var2.method5337();
        int var4 = var2.field3708.length - 2 - var3 - 12;
        var2.field3707 = var4;
        int var5 = var2.method5277();
        var1.field1276 = var2.method5337();
        var1.field1281 = var2.method5337();
        var1.field1282 = var2.method5337();
        var1.field1283 = var2.method5337();
        int var6 = var2.method5138();
        if (var6 > 0) {
            var1.field1284 = var1.method2042(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5337();
                class316 var9 = new class316(var8 > 0 ? class189.method502(var8) : 1);
                var1.field1284[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5277();
                    int var11 = var2.method5277();
                    var9.method5531(new class180(var11), (long) var10);
                }
            }
        }
        var2.field3707 = 0;
        var2.method5146();
        var1.field1277 = new int[var5];
        var1.field1280 = new int[var5];
        var1.field1279 = new String[var5];
        int var12 = 0;
        while (var2.field3707 < var4) {
            int var13 = var2.method5337();
            if (var13 == 3) {
                var1.field1279[var12] = var2.method5147();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1280[var12] = var2.method5138();
            } else {
                var1.field1280[var12] = var2.method5277();
            }
            var1.field1277[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ci.z(II)[Llb;")
    public class316[] method2042(int arg0) {
        return new class316[arg0];
    }
}
