package deob;

@ObfuscatedName("dc")
public class class80 extends class488 {

    @ObfuscatedName("dc.aq")
    public static class304 field1017 = new class304(128);

    @ObfuscatedName("dc.aw")
    public String field1029;

    @ObfuscatedName("dc.al")
    public int[] field1019;

    @ObfuscatedName("dc.ai")
    public int[] field1020;

    @ObfuscatedName("dc.ar")
    public String[] field1021;

    @ObfuscatedName("dc.as")
    public int field1028;

    @ObfuscatedName("dc.aa")
    public int field1023;

    @ObfuscatedName("dc.az")
    public int field1024;

    @ObfuscatedName("dc.ao")
    public int field1022;

    @ObfuscatedName("dc.au")
    public class507[] field1026;

    @ObfuscatedName("ce.aq(II)Ldc;")
    public static class80 method1131(int arg0) {
        class80 var1 = (class80) field1017.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2612.method6489(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class80 var3 = method4580(var2);
            field1017.method5421(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ia.aw(IIII)Ldc;")
    public static class80 method4011(int arg0, int arg1, int arg2) {
        int var3 = Statics.method2322(arg1, arg0);
        class80 var4 = method4610(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = (-3 - arg2 << 8) + arg0;
        class80 var7 = method4610(var5, arg0);
        if (var7 == null) {
            int var8 = arg0 + -512;
            class80 var10 = method4610(var8, arg0);
            return var10 == null ? null : var10;
        } else {
            return var7;
        }
    }

    @ObfuscatedName("ki.al(III)Ldc;")
    public static class80 method4610(int arg0, int arg1) {
        class80 var2 = (class80) field1017.method5414((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2612.method6435(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2612.method6425(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class80 var6 = method4580(var5);
            if (var6 != null) {
                field1017.method5421(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("jp.ai([BB)Ldc;")
    public static class80 method4580(byte[] arg0) {
        class80 var1 = new class80();
        class534 var2 = new class534(arg0);
        var2.field5200 = var2.field5199.length - 2;
        int var3 = var2.method8593();
        int var4 = var2.field5199.length - 2 - var3 - 12;
        var2.field5200 = var4;
        int var5 = var2.method8597();
        var1.field1028 = var2.method8593();
        var1.field1023 = var2.method8593();
        var1.field1024 = var2.method8593();
        var1.field1022 = var2.method8593();
        int var6 = var2.method8591();
        if (var6 > 0) {
            var1.field1026 = var1.method2133(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8593();
                class507 var9 = new class507(var8 > 0 ? class320.method5477(var8) : 1);
                var1.field1026[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8597();
                    int var11 = var2.method8597();
                    var9.method8319(new class491(var11), (long) var10);
                }
            }
        }
        var2.field5200 = 0;
        var1.field1029 = var2.method8601();
        var1.field1019 = new int[var5];
        var1.field1020 = new int[var5];
        var1.field1021 = new String[var5];
        int var12 = 0;
        while (var2.field5200 < var4) {
            int var13 = var2.method8593();
            if (var13 == 3) {
                var1.field1021[var12] = var2.method8741();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1020[var12] = var2.method8591();
            } else {
                var1.field1020[var12] = var2.method8597();
            }
            var1.field1019[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dc.ar(II)[Lta;")
    public class507[] method2133(int arg0) {
        return new class507[arg0];
    }
}
