package deob;

@ObfuscatedName("cx")
public class class97 extends class219 {

    @ObfuscatedName("cx.c")
    public static class213 field1450 = new class213(128);

    @ObfuscatedName("cx.i")
    public int[] field1445;

    @ObfuscatedName("cx.o")
    public int[] field1444;

    @ObfuscatedName("cx.j")
    public String[] field1447;

    @ObfuscatedName("cx.k")
    public int field1449;

    @ObfuscatedName("cx.x")
    public int field1446;

    @ObfuscatedName("cx.z")
    public int field1454;

    @ObfuscatedName("cx.p")
    public int field1451;

    @ObfuscatedName("cx.w")
    public class210[] field1452;

    @ObfuscatedName("av.c(Liz;III)Lcx;")
    public static class97 method606(class246 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2955;
        class97 var5 = (class97) field1450.method3625((long) (var3 << 16));
        class97 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field446.method4245(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field446.method4251(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class97 var10 = method1773(var9);
                        if (var10 != null) {
                            field1450.method3628(var10, (long) (var3 << 16));
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
        int var12 = (arg2 + 40000 << 8) + arg0.field2955;
        class97 var14 = (class97) field1450.method3625((long) (var12 << 16));
        class97 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field446.method4245(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field446.method4251(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class97 var19 = method1773(var18);
                    if (var19 != null) {
                        field1450.method3628(var19, (long) (var12 << 16));
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

    @ObfuscatedName("ci.i([BB)Lcx;")
    public static class97 method1773(byte[] arg0) {
        class97 var1 = new class97();
        class195 var2 = new class195(arg0);
        var2.field2566 = var2.field2567.length - 2;
        int var3 = var2.method3218();
        int var4 = var2.field2567.length - 2 - var3 - 12;
        var2.field2566 = var4;
        int var5 = var2.method3230();
        var1.field1449 = var2.method3218();
        var1.field1446 = var2.method3218();
        var1.field1454 = var2.method3218();
        var1.field1451 = var2.method3218();
        int var6 = var2.method3429();
        if (var6 > 0) {
            var1.field1452 = var1.method1859(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3218();
                class210 var9 = new class210(var8 > 0 ? class200.method2857(var8) : 1);
                var1.field1452[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3230();
                    int var11 = var2.method3230();
                    var9.method3610(new class224(var11), (long) var10);
                }
            }
        }
        var2.field2566 = 0;
        var2.method3419();
        var1.field1445 = new int[var5];
        var1.field1444 = new int[var5];
        var1.field1447 = new String[var5];
        int var12 = 0;
        while (var2.field2566 < var4) {
            int var13 = var2.method3218();
            if (var13 == 3) {
                var1.field1447[var12] = var2.method3427();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1444[var12] = var2.method3429();
            } else {
                var1.field1444[var12] = var2.method3230();
            }
            var1.field1445[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cx.o(II)[Lhz;")
    public class210[] method1859(int arg0) {
        return new class210[arg0];
    }
}
