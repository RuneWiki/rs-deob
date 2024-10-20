package deob;

@ObfuscatedName("cv")
public class class77 extends class439 {

    @ObfuscatedName("cv.aj")
    public static class276 field969 = new class276(128);

    @ObfuscatedName("cv.al")
    public String field966;

    @ObfuscatedName("cv.ac")
    public int[] field971;

    @ObfuscatedName("cv.ab")
    public int[] field968;

    @ObfuscatedName("cv.an")
    public String[] field975;

    @ObfuscatedName("cv.ao")
    public int field970;

    @ObfuscatedName("cv.av")
    public int field965;

    @ObfuscatedName("cv.aq")
    public int field972;

    @ObfuscatedName("cv.ap")
    public int field967;

    @ObfuscatedName("cv.ar")
    public class454[] field974;

    @ObfuscatedName("dc.aj(II)Lcv;")
    public static class77 method2128(int arg0) {
        class77 var1 = (class77) field969.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1800.method5860(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class77 var3 = method11(var2);
            field969.method4923(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("nr.al(IIII)Lcv;")
    public static class77 method5970(int arg0, int arg1, int arg2) {
        int var3 = class331.method5759(arg1, arg0);
        class77 var4 = method3346(var3, arg0);
        if (var4 == null) {
            int var5 = (-3 - arg2 << 8) + arg0;
            class77 var7 = method3346(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("ho.ac(III)Lcv;")
    public static class77 method3346(int arg0, int arg1) {
        class77 var2 = (class77) field969.method4921((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1800.method5875(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1800.method5865(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class77 var6 = method11(var5);
            if (var6 != null) {
                field969.method4923(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("an.ab([BB)Lcv;")
    public static class77 method11(byte[] arg0) {
        class77 var1 = new class77();
        class478 var2 = new class478(arg0);
        var2.field4904 = var2.field4906.length - 2;
        int var3 = var2.method7905();
        int var4 = var2.field4906.length - 2 - var3 - 12;
        var2.field4904 = var4;
        int var5 = var2.method7908();
        var1.field970 = var2.method7905();
        var1.field965 = var2.method7905();
        var1.field972 = var2.method7905();
        var1.field967 = var2.method7905();
        int var6 = var2.method7909();
        if (var6 > 0) {
            var1.field974 = var1.method2033(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7905();
                class454 var9 = new class454(var8 > 0 ? class292.method4415(var8) : 1);
                var1.field974[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method7908();
                    int var11 = var2.method7908();
                    var9.method7595(new class443(var11), (long) var10);
                }
            }
        }
        var2.field4904 = 0;
        var1.field966 = var2.method8048();
        var1.field971 = new int[var5];
        var1.field968 = new int[var5];
        var1.field975 = new String[var5];
        int var12 = 0;
        while (var2.field4904 < var4) {
            int var13 = var2.method7905();
            if (var13 == 3) {
                var1.field975[var12] = var2.method7950();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field968[var12] = var2.method7909();
            } else {
                var1.field968[var12] = var2.method7908();
            }
            var1.field971[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cv.an(II)[Lrz;")
    public class454[] method2033(int arg0) {
        return new class454[arg0];
    }
}
