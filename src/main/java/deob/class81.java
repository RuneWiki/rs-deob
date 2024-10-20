package deob;

@ObfuscatedName("dg")
public class class81 extends class501 {

    @ObfuscatedName("dg.aq")
    public static class313 field1008 = new class313(128);

    @ObfuscatedName("dg.ad")
    public String field1012;

    @ObfuscatedName("dg.ag")
    public int[] field1004;

    @ObfuscatedName("dg.ak")
    public int[] field1005;

    @ObfuscatedName("dg.ap")
    public String[] field1006;

    @ObfuscatedName("dg.an")
    public int field1007;

    @ObfuscatedName("dg.aj")
    public int field1003;

    @ObfuscatedName("dg.av")
    public int field1009;

    @ObfuscatedName("dg.ab")
    public int field1010;

    @ObfuscatedName("dg.ai")
    public class520[] field1011;

    @ObfuscatedName("hn.aq(II)Ldg;")
    public static class81 method3463(int arg0) {
        class81 var1 = (class81) field1008.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4978.method6539(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class81 var3 = method3109(var2);
            field1008.method5498(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ix.ad(IIIB)Ldg;")
    public static class81 method4011(int arg0, int arg1, int arg2) {
        int var3 = class378.method3798(arg1, arg0);
        class81 var4 = method3041(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = (-3 - arg2 << 8) + arg0;
        class81 var7 = method3041(var5, arg0);
        if (var7 == null) {
            int var8 = Statics.method3198(arg0);
            class81 var9 = method3041(var8, arg0);
            return var9 == null ? null : var9;
        } else {
            return var7;
        }
    }

    @ObfuscatedName("fz.ag(III)Ldg;")
    public static class81 method3041(int arg0, int arg1) {
        class81 var2 = (class81) field1008.method5495((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field4978.method6555(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field4978.method6545(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class81 var6 = method3109(var5);
            if (var6 != null) {
                field1008.method5498(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("fx.ak([BI)Ldg;")
    public static class81 method3109(byte[] arg0) {
        class81 var1 = new class81();
        class547 var2 = new class547(arg0);
        var2.field5363 = var2.field5364.length - 2;
        int var3 = var2.method8899();
        int var4 = var2.field5364.length - 2 - var3 - 12;
        var2.field5363 = var4;
        int var5 = var2.method8734();
        var1.field1007 = var2.method8899();
        var1.field1003 = var2.method8899();
        var1.field1009 = var2.method8899();
        var1.field1010 = var2.method8899();
        int var6 = var2.method8804();
        if (var6 > 0) {
            var1.field1011 = var1.method2151(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8899();
                class520 var9 = new class520(var8 > 0 ? class329.method6778(var8) : 1);
                var1.field1011[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8734();
                    int var11 = var2.method8734();
                    var9.method8443(new class504(var11), (long) var10);
                }
            }
        }
        var2.field5363 = 0;
        var1.field1012 = var2.method8738();
        var1.field1004 = new int[var5];
        var1.field1005 = new int[var5];
        var1.field1006 = new String[var5];
        int var12 = 0;
        while (var2.field5363 < var4) {
            int var13 = var2.method8899();
            if (var13 == 3) {
                var1.field1006[var12] = var2.method8739();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1005[var12] = var2.method8804();
            } else {
                var1.field1005[var12] = var2.method8734();
            }
            var1.field1004[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dg.ap(II)[Lth;")
    public class520[] method2151(int arg0) {
        return new class520[arg0];
    }
}
