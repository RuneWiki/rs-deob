package deob;

@ObfuscatedName("dh")
public class class79 extends class469 {

    @ObfuscatedName("dh.au")
    public static class288 field1010 = new class288(128);

    @ObfuscatedName("dh.ae")
    public String field1015;

    @ObfuscatedName("dh.ao")
    public int[] field1011;

    @ObfuscatedName("dh.at")
    public int[] field1012;

    @ObfuscatedName("dh.ac")
    public String[] field1013;

    @ObfuscatedName("dh.ai")
    public int field1014;

    @ObfuscatedName("dh.az")
    public int field1018;

    @ObfuscatedName("dh.ap")
    public int field1016;

    @ObfuscatedName("dh.aa")
    public int field1017;

    @ObfuscatedName("dh.af")
    public class488[] field1019;

    @ObfuscatedName("fl.au(IB)Ldh;")
    public static class79 method2912(int arg0) {
        class79 var1 = (class79) field1010.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4358.method6128(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class79 var3 = method3568(var2);
            field1010.method5177(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("om.ae(IIII)Ldh;")
    public static class79 method6284(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class79 var5 = method6376(var3, arg0);
        if (var5 != null) {
            return var5;
        }
        int var6 = (-3 - arg2 << 8) + arg0;
        class79 var8 = method6376(var6, arg0);
        if (var8 == null) {
            int var9 = arg0 + -512;
            class79 var11 = method6376(var9, arg0);
            return var11 == null ? null : var11;
        } else {
            return var8;
        }
    }

    @ObfuscatedName("oe.ao(III)Ldh;")
    public static class79 method6376(int arg0, int arg1) {
        class79 var2 = (class79) field1010.method5182((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field4358.method6167(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field4358.method6134(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class79 var6 = method3568(var5);
            if (var6 != null) {
                field1010.method5177(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("hm.at([BB)Ldh;")
    public static class79 method3568(byte[] arg0) {
        class79 var1 = new class79();
        class515 var2 = new class515(arg0);
        var2.field5111 = var2.field5108.length - 2;
        int var3 = var2.method8448();
        int var4 = var2.field5108.length - 2 - var3 - 12;
        var2.field5111 = var4;
        int var5 = var2.method8306();
        var1.field1014 = var2.method8448();
        var1.field1018 = var2.method8448();
        var1.field1016 = var2.method8448();
        var1.field1017 = var2.method8448();
        int var6 = var2.method8300();
        if (var6 > 0) {
            var1.field1019 = var1.method2081(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8448();
                class488 var9 = new class488(var8 > 0 ? class304.method4709(var8) : 1);
                var1.field1019[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8306();
                    int var11 = var2.method8306();
                    var9.method8016(new class472(var11), (long) var10);
                }
            }
        }
        var2.field5111 = 0;
        var1.field1015 = var2.method8497();
        var1.field1011 = new int[var5];
        var1.field1012 = new int[var5];
        var1.field1013 = new String[var5];
        int var12 = 0;
        while (var2.field5111 < var4) {
            int var13 = var2.method8448();
            if (var13 == 3) {
                var1.field1013[var12] = var2.method8311();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1012[var12] = var2.method8300();
            } else {
                var1.field1012[var12] = var2.method8306();
            }
            var1.field1011[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dh.ac(II)[Lsf;")
    public class488[] method2081(int arg0) {
        return new class488[arg0];
    }
}
