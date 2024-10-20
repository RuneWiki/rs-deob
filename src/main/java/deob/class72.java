package deob;

@ObfuscatedName("bb")
public class class72 extends class406 {

    @ObfuscatedName("bb.o")
    public static class257 field952 = new class257(128);

    @ObfuscatedName("bb.q")
    public String field950;

    @ObfuscatedName("bb.l")
    public int[] field949;

    @ObfuscatedName("bb.k")
    public int[] field959;

    @ObfuscatedName("bb.a")
    public String[] field953;

    @ObfuscatedName("bb.m")
    public int field954;

    @ObfuscatedName("bb.p")
    public int field951;

    @ObfuscatedName("bb.s")
    public int field956;

    @ObfuscatedName("bb.r")
    public int field957;

    @ObfuscatedName("bb.v")
    public class420[] field958;

    @ObfuscatedName("kr.o(IB)Lbb;")
    public static class72 method5117(int arg0) {
        class72 var1 = (class72) field952.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1464.method5249(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method698(var2);
            field952.method4571(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("hx.q(IIIB)Lbb;")
    public static class72 method4072(int arg0, int arg1, int arg2) {
        int var3 = class308.method718(arg1, arg0);
        class72 var4 = (class72) field952.method4566((long) (var3 << 16));
        class72 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field1464.method5206(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field1464.method5195(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class72 var9 = method698(var8);
                        if (var9 != null) {
                            field952.method4571(var9, (long) (var3 << 16));
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
        int var11 = (-3 - arg2 << 8) + arg0;
        class72 var13 = (class72) field952.method4566((long) (var11 << 16));
        class72 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field1464.method5206(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field1464.method5195(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class72 var18 = method698(var17);
                    if (var18 != null) {
                        field952.method4571(var18, (long) (var11 << 16));
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

    @ObfuscatedName("al.l([BI)Lbb;")
    public static class72 method698(byte[] arg0) {
        class72 var1 = new class72();
        class440 var2 = new class440(arg0);
        var2.field4678 = var2.field4679.length - 2;
        int var3 = var2.method7082();
        int var4 = var2.field4679.length - 2 - var3 - 12;
        var2.field4678 = var4;
        int var5 = var2.method6898();
        var1.field954 = var2.method7082();
        var1.field951 = var2.method7082();
        var1.field956 = var2.method7082();
        var1.field957 = var2.method7082();
        int var6 = var2.method7071();
        if (var6 > 0) {
            var1.field958 = var1.method1845(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7082();
                class420 var9 = new class420(var8 > 0 ? class272.method6642(var8) : 1);
                var1.field958[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6898();
                    int var11 = var2.method6898();
                    var9.method6666(new class410(var11), (long) var10);
                }
            }
        }
        var2.field4678 = 0;
        var1.field950 = var2.method6902();
        var1.field949 = new int[var5];
        var1.field959 = new int[var5];
        var1.field953 = new String[var5];
        int var12 = 0;
        while (var2.field4678 < var4) {
            int var13 = var2.method7082();
            if (var13 == 3) {
                var1.field953[var12] = var2.method7044();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field959[var12] = var2.method7071();
            } else {
                var1.field959[var12] = var2.method6898();
            }
            var1.field949[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bb.k(IB)[Lpt;")
    public class420[] method1845(int arg0) {
        return new class420[arg0];
    }
}
