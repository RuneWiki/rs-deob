package deob;

@ObfuscatedName("dd")
public class class79 extends class485 {

    @ObfuscatedName("dd.am")
    public static class302 field981 = new class302(128);

    @ObfuscatedName("dd.ap")
    public String field980;

    @ObfuscatedName("dd.af")
    public int[] field986;

    @ObfuscatedName("dd.aj")
    public int[] field982;

    @ObfuscatedName("dd.aq")
    public String[] field983;

    @ObfuscatedName("dd.ar")
    public int field979;

    @ObfuscatedName("dd.ag")
    public int field985;

    @ObfuscatedName("dd.ao")
    public int field984;

    @ObfuscatedName("dd.ae")
    public int field987;

    @ObfuscatedName("dd.aa")
    public class504[] field988;

    @ObfuscatedName("kr.am(II)Ldd;")
    public static class79 method4874(int arg0) {
        class79 var1 = (class79) field981.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3891.method6396(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class79 var3 = method2291(var2);
            field981.method5402(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("tq.ap(IIII)Ldd;")
    public static class79 method8426(int arg0, int arg1, int arg2) {
        int var3 = class366.method2701(arg1, arg0);
        class79 var4 = method2793(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class366.method6551(arg2, arg0);
        class79 var6 = method2793(var5, arg0);
        if (var6 == null) {
            int var7 = class366.method6311(arg0);
            class79 var8 = method2793(var7, arg0);
            return var8 == null ? null : var8;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("em.af(III)Ldd;")
    public static class79 method2793(int arg0, int arg1) {
        class79 var2 = (class79) field981.method5400((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field3891.method6412(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field3891.method6402(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class79 var6 = method2291(var5);
            if (var6 != null) {
                field981.method5402(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("de.aj([BI)Ldd;")
    public static class79 method2291(byte[] arg0) {
        class79 var1 = new class79();
        class531 var2 = new class531(arg0);
        var2.field5181 = var2.field5178.length - 2;
        int var3 = var2.method8775();
        int var4 = var2.field5178.length - 2 - var3 - 12;
        var2.field5181 = var4;
        int var5 = var2.method8566();
        var1.field979 = var2.method8775();
        var1.field985 = var2.method8775();
        var1.field984 = var2.method8775();
        var1.field987 = var2.method8775();
        int var6 = var2.method8561();
        if (var6 > 0) {
            var1.field988 = var1.method2160(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8775();
                class504 var9 = new class504(var8 > 0 ? class318.method2259(var8) : 1);
                var1.field988[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8566();
                    int var11 = var2.method8566();
                    var9.method8292(new class488(var11), (long) var10);
                }
            }
        }
        var2.field5181 = 0;
        var1.field980 = var2.method8602();
        var1.field986 = new int[var5];
        var1.field982 = new int[var5];
        var1.field983 = new String[var5];
        int var12 = 0;
        while (var2.field5181 < var4) {
            int var13 = var2.method8775();
            if (var13 == 3) {
                var1.field983[var12] = var2.method8641();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field982[var12] = var2.method8561();
            } else {
                var1.field982[var12] = var2.method8566();
            }
            var1.field986[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dd.aq(II)[Ltb;")
    public class504[] method2160(int arg0) {
        return new class504[arg0];
    }
}
