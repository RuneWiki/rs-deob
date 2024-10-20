package deob;

@ObfuscatedName("bm")
public class class76 extends class428 {

    @ObfuscatedName("bm.h")
    public static class269 field997 = new class269(128);

    @ObfuscatedName("bm.e")
    public String field991;

    @ObfuscatedName("bm.v")
    public int[] field992;

    @ObfuscatedName("bm.x")
    public int[] field993;

    @ObfuscatedName("bm.m")
    public String[] field998;

    @ObfuscatedName("bm.q")
    public int field994;

    @ObfuscatedName("bm.f")
    public int field996;

    @ObfuscatedName("bm.r")
    public int field1001;

    @ObfuscatedName("bm.u")
    public int field995;

    @ObfuscatedName("bm.b")
    public class443[] field999;

    @ObfuscatedName("gu.h(IB)Lbm;")
    public static class76 method3435(int arg0) {
        class76 var1 = (class76) field997.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field908.method5909(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class76 var3 = method1751(var2);
            field997.method4925(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("am.e(IIIB)Lbm;")
    public static class76 method423(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class76 var5 = (class76) field997.method4917((long) (var3 << 16));
        class76 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field908.method5861(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field908.method5851(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class76 var10 = method1751(var9);
                        if (var10 != null) {
                            field997.method4925(var10, (long) (var3 << 16));
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
        class76 var14 = (class76) field997.method4917((long) (var12 << 16));
        class76 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field908.method5861(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field908.method5851(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class76 var19 = method1751(var18);
                    if (var19 != null) {
                        field997.method4925(var19, (long) (var12 << 16));
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

    @ObfuscatedName("bi.v([BI)Lbm;")
    public static class76 method1751(byte[] arg0) {
        class76 var1 = new class76();
        class467 var2 = new class467(arg0);
        var2.field4915 = var2.field4917.length - 2;
        int var3 = var2.method7794();
        int var4 = var2.field4917.length - 2 - var3 - 12;
        var2.field4915 = var4;
        int var5 = var2.method7946();
        var1.field994 = var2.method7794();
        var1.field996 = var2.method7794();
        var1.field1001 = var2.method7794();
        var1.field995 = var2.method7794();
        int var6 = var2.method7792();
        if (var6 > 0) {
            var1.field999 = var1.method2011(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7794();
                class443 var9 = new class443(var8 > 0 ? class285.method7578(var8) : 1);
                var1.field999[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method7946();
                    int var11 = var2.method7946();
                    var9.method7523(new class432(var11), (long) var10);
                }
            }
        }
        var2.field4915 = 0;
        var1.field991 = var2.method7800();
        var1.field992 = new int[var5];
        var1.field993 = new int[var5];
        var1.field998 = new String[var5];
        int var12 = 0;
        while (var2.field4915 < var4) {
            int var13 = var2.method7794();
            if (var13 == 3) {
                var1.field998[var12] = var2.method7801();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field993[var12] = var2.method7792();
            } else {
                var1.field993[var12] = var2.method7946();
            }
            var1.field992[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bm.x(II)[Lql;")
    public class443[] method2011(int arg0) {
        return new class443[arg0];
    }
}
