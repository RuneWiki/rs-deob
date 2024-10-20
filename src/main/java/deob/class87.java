package deob;

@ObfuscatedName("cc")
public class class87 extends class346 {

    @ObfuscatedName("cc.f")
    public static class199 field1061 = new class199(128);

    @ObfuscatedName("cc.o")
    public String field1059;

    @ObfuscatedName("cc.u")
    public int[] field1060;

    @ObfuscatedName("cc.p")
    public int[] field1064;

    @ObfuscatedName("cc.b")
    public String[] field1062;

    @ObfuscatedName("cc.e")
    public int field1063;

    @ObfuscatedName("cc.k")
    public int field1067;

    @ObfuscatedName("cc.g")
    public int field1065;

    @ObfuscatedName("cc.h")
    public int field1058;

    @ObfuscatedName("cc.n")
    public class360[] field1066;

    @ObfuscatedName("s.f(II)Lcc;")
    public static class87 method199(int arg0) {
        class87 var1 = (class87) field1061.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1449.method3933(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method2386(var2);
            field1061.method3400(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ch.o(IIII)Lcc;")
    public static class87 method1806(int arg0, int arg1, int arg2) {
        int var3 = class244.method2340(arg1, arg0);
        class87 var4 = method3777(var3, arg0);
        if (var4 == null) {
            int var5 = class244.method2203(arg2, arg0);
            class87 var6 = method3777(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("hu.u(IIB)Lcc;")
    public static class87 method3777(int arg0, int arg1) {
        class87 var2 = (class87) field1061.method3398((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1449.method3950(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1449.method3939(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class87 var6 = method2386(var5);
            if (var6 != null) {
                field1061.method3400(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("eu.p([BB)Lcc;")
    public static class87 method2386(byte[] arg0) {
        class87 var1 = new class87();
        class382 var2 = new class382(arg0);
        var2.field4155 = var2.field4153.length - 2;
        int var3 = var2.method5858();
        int var4 = var2.field4153.length - 2 - var3 - 12;
        var2.field4155 = var4;
        int var5 = var2.method5861();
        var1.field1063 = var2.method5858();
        var1.field1067 = var2.method5858();
        var1.field1065 = var2.method5858();
        var1.field1058 = var2.method5858();
        int var6 = var2.method5856();
        if (var6 > 0) {
            var1.field1066 = var1.method1732(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5858();
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
                class360 var17 = new class360(var16);
                var1.field1066[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method5861();
                    int var19 = var2.method5861();
                    var17.method5630(new class350(var19), (long) var18);
                }
            }
        }
        var2.field4155 = 0;
        var1.field1059 = var2.method5837();
        var1.field1060 = new int[var5];
        var1.field1064 = new int[var5];
        var1.field1062 = new String[var5];
        int var20 = 0;
        while (var2.field4155 < var4) {
            int var21 = var2.method5858();
            if (var21 == 3) {
                var1.field1062[var20] = var2.method5865();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1064[var20] = var2.method5856();
            } else {
                var1.field1064[var20] = var2.method5861();
            }
            var1.field1060[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cc.b(IB)[Lme;")
    public class360[] method1732(int arg0) {
        return new class360[arg0];
    }
}
