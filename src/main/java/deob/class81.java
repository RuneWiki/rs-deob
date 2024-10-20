package deob;

@ObfuscatedName("dp")
public class class81 extends class502 {

    @ObfuscatedName("dp.ab")
    public static class315 field991 = new class315(128);

    @ObfuscatedName("dp.ay")
    public String field985;

    @ObfuscatedName("dp.an")
    public int[] field995;

    @ObfuscatedName("dp.au")
    public int[] field984;

    @ObfuscatedName("dp.ax")
    public String[] field986;

    @ObfuscatedName("dp.ao")
    public int field982;

    @ObfuscatedName("dp.am")
    public int field988;

    @ObfuscatedName("dp.ac")
    public int field989;

    @ObfuscatedName("dp.ae")
    public int field983;

    @ObfuscatedName("dp.ad")
    public class521[] field990;

    @ObfuscatedName("dc.ab(II)Ldp;")
    public static class81 method2333(int arg0) {
        class81 var1 = (class81) field991.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field63.method6670(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class81 var3 = method2215(var2);
            field991.method5589(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("cr.ay(IIIB)Ldp;")
    public static class81 method1077(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class81 var5 = method793(var3, arg0);
        if (var5 != null) {
            return var5;
        }
        int var6 = class378.method7335(arg2, arg0);
        class81 var7 = method793(var6, arg0);
        if (var7 == null) {
            int var8 = arg0 + -512;
            class81 var10 = method793(var8, arg0);
            return var10 == null ? null : var10;
        } else {
            return var7;
        }
    }

    @ObfuscatedName("ba.an(III)Ldp;")
    public static class81 method793(int arg0, int arg1) {
        class81 var2 = (class81) field991.method5586((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field63.method6654(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field63.method6644(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class81 var6 = method2215(var5);
            if (var6 != null) {
                field991.method5589(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("dp.au([BI)Ldp;")
    public static class81 method2215(byte[] arg0) {
        class81 var1 = new class81();
        class549 var2 = new class549(arg0);
        var2.field5378 = var2.field5381.length - 2;
        int var3 = var2.method8968();
        int var4 = var2.field5381.length - 2 - var3 - 12;
        var2.field5378 = var4;
        int var5 = var2.method8803();
        var1.field982 = var2.method8968();
        var1.field988 = var2.method8968();
        var1.field989 = var2.method8968();
        var1.field983 = var2.method8968();
        int var6 = var2.method9025();
        if (var6 > 0) {
            var1.field990 = var1.method2197(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8968();
                class521 var9 = new class521(var8 > 0 ? class331.method5556(var8) : 1);
                var1.field990[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8803();
                    int var11 = var2.method8803();
                    var9.method8513(new class505(var11), (long) var10);
                }
            }
        }
        var2.field5378 = 0;
        var1.field985 = var2.method8807();
        var1.field995 = new int[var5];
        var1.field984 = new int[var5];
        var1.field986 = new String[var5];
        int var12 = 0;
        while (var2.field5378 < var4) {
            int var13 = var2.method8968();
            if (var13 == 3) {
                var1.field986[var12] = var2.method8808();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field984[var12] = var2.method9025();
            } else {
                var1.field984[var12] = var2.method8803();
            }
            var1.field995[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dp.ax(II)[Lud;")
    public class521[] method2197(int arg0) {
        return new class521[arg0];
    }

    @ObfuscatedName("gt.ao(I)V")
    public static void method3530() {
        field991.method5588();
    }
}
