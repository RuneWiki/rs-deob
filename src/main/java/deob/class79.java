package deob;

@ObfuscatedName("dd")
public class class79 extends class457 {

    @ObfuscatedName("dd.at")
    public static class287 field999 = new class287(128);

    @ObfuscatedName("dd.an")
    public String field993;

    @ObfuscatedName("dd.av")
    public int[] field992;

    @ObfuscatedName("dd.as")
    public int[] field990;

    @ObfuscatedName("dd.ax")
    public String[] field994;

    @ObfuscatedName("dd.ap")
    public int field995;

    @ObfuscatedName("dd.ab")
    public int field996;

    @ObfuscatedName("dd.ak")
    public int field997;

    @ObfuscatedName("dd.ae")
    public int field998;

    @ObfuscatedName("dd.af")
    public class476[] field991;

    @ObfuscatedName("hc.at(II)Ldd;")
    public static class79 method3345(int arg0) {
        class79 var1 = (class79) field999.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field173.method6080(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class79 var3 = method3093(var2);
            field999.method5123(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("pl.an(IIII)Ldd;")
    public static class79 method7069(int arg0, int arg1, int arg2) {
        int var3 = class348.method7457(arg1, arg0);
        class79 var4 = method2710(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class348.method6286(arg2, arg0);
        class79 var6 = method2710(var5, arg0);
        if (var6 == null) {
            int var7 = arg0 + -512;
            class79 var9 = method2710(var7, arg0);
            return var9 == null ? null : var9;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ec.av(III)Ldd;")
    public static class79 method2710(int arg0, int arg1) {
        class79 var2 = (class79) field999.method5121((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field173.method6097(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field173.method6143(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class79 var6 = method3093(var5);
            if (var6 != null) {
                field999.method5123(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("gt.as([BB)Ldd;")
    public static class79 method3093(byte[] arg0) {
        class79 var1 = new class79();
        class501 var2 = new class501(arg0);
        var2.field5017 = var2.field5016.length - 2;
        int var3 = var2.method8195();
        int var4 = var2.field5016.length - 2 - var3 - 12;
        var2.field5017 = var4;
        int var5 = var2.method8134();
        var1.field995 = var2.method8195();
        var1.field996 = var2.method8195();
        var1.field997 = var2.method8195();
        var1.field998 = var2.method8195();
        int var6 = var2.method8129();
        if (var6 > 0) {
            var1.field991 = var1.method2043(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8195();
                class476 var9 = new class476(var8 > 0 ? class303.method2820(var8) : 1);
                var1.field991[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8134();
                    int var11 = var2.method8134();
                    var9.method7857(new class460(var11), (long) var10);
                }
            }
        }
        var2.field5017 = 0;
        var1.field993 = var2.method8128();
        var1.field992 = new int[var5];
        var1.field990 = new int[var5];
        var1.field994 = new String[var5];
        int var12 = 0;
        while (var2.field5017 < var4) {
            int var13 = var2.method8195();
            if (var13 == 3) {
                var1.field994[var12] = var2.method8253();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field990[var12] = var2.method8129();
            } else {
                var1.field990[var12] = var2.method8134();
            }
            var1.field992[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dd.ax(II)[Lsv;")
    public class476[] method2043(int arg0) {
        return new class476[arg0];
    }
}
