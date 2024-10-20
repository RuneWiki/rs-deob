package deob;

@ObfuscatedName("cf")
public class class87 extends class348 {

    @ObfuscatedName("cf.f")
    public static class222 field1071 = new class222(128);

    @ObfuscatedName("cf.e")
    public String field1070;

    @ObfuscatedName("cf.v")
    public int[] field1073;

    @ObfuscatedName("cf.y")
    public int[] field1077;

    @ObfuscatedName("cf.j")
    public String[] field1069;

    @ObfuscatedName("cf.o")
    public int field1074;

    @ObfuscatedName("cf.m")
    public int field1072;

    @ObfuscatedName("cf.r")
    public int field1076;

    @ObfuscatedName("cf.h")
    public int field1075;

    @ObfuscatedName("cf.d")
    public class362[] field1078;

    @ObfuscatedName("ne.f(II)Lcf;")
    public static class87 method5821(int arg0) {
        class87 var1 = (class87) field1071.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1388.method4504(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method2388(var2);
            field1071.method3988(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("eh.e(IIIB)Lcf;")
    public static class87 method2658(int arg0, int arg1, int arg2) {
        int var3 = class267.method4245(arg1, arg0);
        class87 var4 = (class87) field1071.method3987((long) (var3 << 16));
        class87 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field1388.method4582(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field1388.method4511(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class87 var9 = method2388(var8);
                        if (var9 != null) {
                            field1071.method3988(var9, (long) (var3 << 16));
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
        int var11 = class267.method2622(arg2, arg0);
        class87 var12 = (class87) field1071.method3987((long) (var11 << 16));
        class87 var13;
        if (var12 == null) {
            String var14 = String.valueOf(var11);
            int var15 = Statics.field1388.method4582(var14);
            if (var15 == -1) {
                var13 = null;
            } else {
                byte[] var16 = Statics.field1388.method4511(var15);
                if (var16 != null) {
                    if (var16.length <= 1) {
                        var13 = null;
                        return var13 == null ? null : var13;
                    }
                    class87 var17 = method2388(var16);
                    if (var17 != null) {
                        field1071.method3988(var17, (long) (var11 << 16));
                        var13 = var17;
                        return var13 == null ? null : var13;
                    }
                }
                var13 = null;
            }
        } else {
            var13 = var12;
        }
        return var13 == null ? null : var13;
    }

    @ObfuscatedName("ea.v([BI)Lcf;")
    public static class87 method2388(byte[] arg0) {
        class87 var1 = new class87();
        class384 var2 = new class384(arg0);
        var2.field4161 = var2.field4160.length - 2;
        int var3 = var2.method5899();
        int var4 = var2.field4160.length - 2 - var3 - 12;
        var2.field4161 = var4;
        int var5 = var2.method5965();
        var1.field1074 = var2.method5899();
        var1.field1072 = var2.method5899();
        var1.field1076 = var2.method5899();
        var1.field1075 = var2.method5899();
        int var6 = var2.method5902();
        if (var6 > 0) {
            var1.field1078 = var1.method1831(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5899();
                class362 var9 = new class362(var8 > 0 ? class232.method2226(var8) : 1);
                var1.field1078[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5965();
                    int var11 = var2.method5965();
                    var9.method5669(new class352(var11), (long) var10);
                }
            }
        }
        var2.field4161 = 0;
        var1.field1070 = var2.method5940();
        var1.field1073 = new int[var5];
        var1.field1077 = new int[var5];
        var1.field1069 = new String[var5];
        int var12 = 0;
        while (var2.field4161 < var4) {
            int var13 = var2.method5899();
            if (var13 == 3) {
                var1.field1069[var12] = var2.method5906();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1077[var12] = var2.method5902();
            } else {
                var1.field1077[var12] = var2.method5965();
            }
            var1.field1073[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cf.y(II)[Lmo;")
    public class362[] method1831(int arg0) {
        return new class362[arg0];
    }
}
