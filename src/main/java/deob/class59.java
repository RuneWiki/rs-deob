package deob;

@ObfuscatedName("bd")
public class class59 extends class349 {

    @ObfuscatedName("bd.s")
    public static class223 field862 = new class223(128);

    @ObfuscatedName("bd.t")
    public String field863;

    @ObfuscatedName("bd.v")
    public int[] field865;

    @ObfuscatedName("bd.j")
    public int[] field870;

    @ObfuscatedName("bd.l")
    public String[] field866;

    @ObfuscatedName("bd.n")
    public int field864;

    @ObfuscatedName("bd.w")
    public int field868;

    @ObfuscatedName("bd.f")
    public int field869;

    @ObfuscatedName("bd.o")
    public int field867;

    @ObfuscatedName("bd.x")
    public class363[] field871;

    @ObfuscatedName("f.s(II)Lbd;")
    public static class59 method41(int arg0) {
        class59 var1 = (class59) field862.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field391.method4459(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class59 var3 = method3884(var2);
            field862.method3929(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("fb.t(IIIS)Lbd;")
    public static class59 method3150(int arg0, int arg1, int arg2) {
        int var3 = class268.method4389(arg1, arg0);
        class59 var4 = method2218(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = (-3 - arg2 << 8) + arg0;
        class59 var7 = (class59) field862.method3927((long) (var5 << 16));
        class59 var8;
        if (var7 == null) {
            String var9 = String.valueOf(var5);
            int var10 = Statics.field391.method4474(var9);
            if (var10 == -1) {
                var8 = null;
            } else {
                byte[] var11 = Statics.field391.method4466(var10);
                if (var11 != null) {
                    if (var11.length <= 1) {
                        var8 = null;
                        return var8 == null ? null : var8;
                    }
                    class59 var12 = method3884(var11);
                    if (var12 != null) {
                        field862.method3929(var12, (long) (var5 << 16));
                        var8 = var12;
                        return var8 == null ? null : var8;
                    }
                }
                var8 = null;
            }
        } else {
            var8 = var7;
        }
        return var8 == null ? null : var8;
    }

    @ObfuscatedName("du.v(III)Lbd;")
    public static class59 method2218(int arg0, int arg1) {
        class59 var2 = (class59) field862.method3927((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field391.method4474(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field391.method4466(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class59 var6 = method3884(var5);
            if (var6 != null) {
                field862.method3929(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ho.j([BI)Lbd;")
    public static class59 method3884(byte[] arg0) {
        class59 var1 = new class59();
        class385 var2 = new class385(arg0);
        var2.field4182 = var2.field4184.length - 2;
        int var3 = var2.method6053();
        int var4 = var2.field4184.length - 2 - var3 - 12;
        var2.field4182 = var4;
        int var5 = var2.method6182();
        var1.field864 = var2.method6053();
        var1.field868 = var2.method6053();
        var1.field869 = var2.method6053();
        var1.field867 = var2.method6053();
        int var6 = var2.method5958();
        if (var6 > 0) {
            var1.field871 = var1.method1624(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method6053();
                class363 var9 = new class363(var8 > 0 ? class233.method506(var8) : 1);
                var1.field871[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6182();
                    int var11 = var2.method6182();
                    var9.method5737(new class353(var11), (long) var10);
                }
            }
        }
        var2.field4182 = 0;
        var1.field863 = var2.method5966();
        var1.field865 = new int[var5];
        var1.field870 = new int[var5];
        var1.field866 = new String[var5];
        int var12 = 0;
        while (var2.field4182 < var4) {
            int var13 = var2.method6053();
            if (var13 == 3) {
                var1.field866[var12] = var2.method5967();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field870[var12] = var2.method5958();
            } else {
                var1.field870[var12] = var2.method6182();
            }
            var1.field865[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bd.l(II)[Lmc;")
    public class363[] method1624(int arg0) {
        return new class363[arg0];
    }
}
