package deob;

@ObfuscatedName("ch")
public class class75 extends class444 {

    @ObfuscatedName("ch.af")
    public static class280 field972 = new class280(128);

    @ObfuscatedName("ch.an")
    public String field962;

    @ObfuscatedName("ch.aw")
    public int[] field964;

    @ObfuscatedName("ch.ac")
    public int[] field965;

    @ObfuscatedName("ch.au")
    public String[] field966;

    @ObfuscatedName("ch.ab")
    public int field967;

    @ObfuscatedName("ch.aq")
    public int field968;

    @ObfuscatedName("ch.al")
    public int field970;

    @ObfuscatedName("ch.at")
    public int field969;

    @ObfuscatedName("ch.aa")
    public class464[] field971;

    @ObfuscatedName("mx.af(II)Lch;")
    public static class75 method5959(int arg0) {
        class75 var1 = (class75) field972.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1541.method6090(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class75 var3 = method500(var2);
            field972.method5121(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("fg.an(IIII)Lch;")
    public static class75 method3139(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class75 var5 = method3708(var3, arg0);
        if (var5 != null) {
            return var5;
        }
        int var6 = class335.method4995(arg2, arg0);
        class75 var7 = (class75) field972.method5119((long) (var6 << 16));
        class75 var8;
        if (var7 == null) {
            String var9 = String.valueOf(var6);
            int var10 = Statics.field1541.method6086(var9);
            if (var10 == -1) {
                var8 = null;
            } else {
                byte[] var11 = Statics.field1541.method6117(var10);
                if (var11 != null) {
                    if (var11.length <= 1) {
                        var8 = null;
                        return var8 == null ? null : var8;
                    }
                    class75 var12 = method500(var11);
                    if (var12 != null) {
                        field972.method5121(var12, (long) (var6 << 16));
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

    @ObfuscatedName("hq.aw(IIB)Lch;")
    public static class75 method3708(int arg0, int arg1) {
        class75 var2 = (class75) field972.method5119((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1541.method6086(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1541.method6117(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class75 var6 = method500(var5);
            if (var6 != null) {
                field972.method5121(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bz.ac([BB)Lch;")
    public static class75 method500(byte[] arg0) {
        class75 var1 = new class75();
        class489 var2 = new class489(arg0);
        var2.field4989 = var2.field4991.length - 2;
        int var3 = var2.method8250();
        int var4 = var2.field4991.length - 2 - var3 - 12;
        var2.field4989 = var4;
        int var5 = var2.method8254();
        var1.field967 = var2.method8250();
        var1.field968 = var2.method8250();
        var1.field970 = var2.method8250();
        var1.field969 = var2.method8250();
        int var6 = var2.method8248();
        if (var6 > 0) {
            var1.field971 = var1.method2031(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8250();
                class464 var9 = new class464(var8 > 0 ? class296.method1948(var8) : 1);
                var1.field971[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8254();
                    int var11 = var2.method8254();
                    var9.method7946(new class448(var11), (long) var10);
                }
            }
        }
        var2.field4989 = 0;
        var1.field962 = var2.method8305();
        var1.field964 = new int[var5];
        var1.field965 = new int[var5];
        var1.field966 = new String[var5];
        int var12 = 0;
        while (var2.field4989 < var4) {
            int var13 = var2.method8250();
            if (var13 == 3) {
                var1.field966[var12] = var2.method8259();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field965[var12] = var2.method8248();
            } else {
                var1.field965[var12] = var2.method8254();
            }
            var1.field964[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ch.au(II)[Lro;")
    public class464[] method2031(int arg0) {
        return new class464[arg0];
    }
}
