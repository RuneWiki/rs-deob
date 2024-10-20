package deob;

@ObfuscatedName("cf")
public class class87 extends class347 {

    @ObfuscatedName("cf.v")
    public static class221 field1087 = new class221(128);

    @ObfuscatedName("cf.n")
    public String field1085;

    @ObfuscatedName("cf.f")
    public int[] field1089;

    @ObfuscatedName("cf.y")
    public int[] field1088;

    @ObfuscatedName("cf.p")
    public String[] field1096;

    @ObfuscatedName("cf.j")
    public int field1090;

    @ObfuscatedName("cf.r")
    public int field1091;

    @ObfuscatedName("cf.b")
    public int field1092;

    @ObfuscatedName("cf.d")
    public int field1093;

    @ObfuscatedName("cf.s")
    public class361[] field1094;

    @ObfuscatedName("bb.v(II)Lcf;")
    public static class87 method1002(int arg0) {
        class87 var1 = (class87) field1087.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1440.method4468(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method5296(var2);
            field1087.method3947(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ao.n(IIIB)Lcf;")
    public static class87 method342(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class87 var5 = (class87) field1087.method3948((long) (var3 << 16));
        class87 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field1440.method4484(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field1440.method4474(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class87 var10 = method5296(var9);
                        if (var10 != null) {
                            field1087.method3947(var10, (long) (var3 << 16));
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
        int var12 = (-3 - arg2 << 8) + arg0;
        class87 var14 = (class87) field1087.method3948((long) (var12 << 16));
        class87 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field1440.method4484(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field1440.method4474(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class87 var19 = method5296(var18);
                    if (var19 != null) {
                        field1087.method3947(var19, (long) (var12 << 16));
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

    @ObfuscatedName("lj.f([BI)Lcf;")
    public static class87 method5296(byte[] arg0) {
        class87 var1 = new class87();
        class383 var2 = new class383(arg0);
        var2.field4158 = var2.field4155.length - 2;
        int var3 = var2.method5967();
        int var4 = var2.field4155.length - 2 - var3 - 12;
        var2.field4158 = var4;
        int var5 = var2.method5970();
        var1.field1090 = var2.method5967();
        var1.field1091 = var2.method5967();
        var1.field1092 = var2.method5967();
        var1.field1093 = var2.method5967();
        int var6 = var2.method5965();
        if (var6 > 0) {
            var1.field1094 = var1.method1800(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5967();
                class361 var9 = new class361(var8 > 0 ? class231.method1933(var8) : 1);
                var1.field1094[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5970();
                    int var11 = var2.method5970();
                    var9.method5754(new class351(var11), (long) var10);
                }
            }
        }
        var2.field4158 = 0;
        var1.field1085 = var2.method6180();
        var1.field1089 = new int[var5];
        var1.field1088 = new int[var5];
        var1.field1096 = new String[var5];
        int var12 = 0;
        while (var2.field4158 < var4) {
            int var13 = var2.method5967();
            if (var13 == 3) {
                var1.field1096[var12] = var2.method5974();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1088[var12] = var2.method5965();
            } else {
                var1.field1088[var12] = var2.method5970();
            }
            var1.field1089[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cf.y(II)[Lmr;")
    public class361[] method1800(int arg0) {
        return new class361[arg0];
    }
}
