package deob;

@ObfuscatedName("dt")
public class class82 extends class504 {

    @ObfuscatedName("dt.ac")
    public static class317 field1030 = new class317(128);

    @ObfuscatedName("dt.ae")
    public String field1027;

    @ObfuscatedName("dt.ag")
    public int[] field1034;

    @ObfuscatedName("dt.am")
    public int[] field1029;

    @ObfuscatedName("dt.ax")
    public String[] field1037;

    @ObfuscatedName("dt.aq")
    public int field1031;

    @ObfuscatedName("dt.af")
    public int field1026;

    @ObfuscatedName("dt.at")
    public int field1033;

    @ObfuscatedName("dt.au")
    public int field1032;

    @ObfuscatedName("dt.ar")
    public class523[] field1039;

    @ObfuscatedName("ay.ac(II)Ldt;")
    public static class82 method285(int arg0) {
        class82 var1 = (class82) field1030.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1961.method6782(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class82 var3 = method3297(var2);
            field1030.method5735(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gv.ae(IIIS)Ldt;")
    public static class82 method3420(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class82 var5 = method3141(var3, arg0);
        if (var5 != null) {
            return var5;
        }
        int var6 = class381.method425(arg2, arg0);
        class82 var7 = method3141(var6, arg0);
        if (var7 == null) {
            int var8 = arg0 + -512;
            class82 var10 = method3141(var8, arg0);
            return var10 == null ? null : var10;
        } else {
            return var7;
        }
    }

    @ObfuscatedName("fp.ag(IIB)Ldt;")
    public static class82 method3141(int arg0, int arg1) {
        class82 var2 = (class82) field1030.method5733((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1961.method6797(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1961.method6788(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class82 var6 = method3297(var5);
            if (var6 != null) {
                field1030.method5735(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("gb.am([BI)Ldt;")
    public static class82 method3297(byte[] arg0) {
        class82 var1 = new class82();
        class551 var2 = new class551(arg0);
        var2.field5415 = var2.field5413.length - 2;
        int var3 = var2.method9119();
        int var4 = var2.field5413.length - 2 - var3 - 12;
        var2.field5415 = var4;
        int var5 = var2.method9110();
        var1.field1031 = var2.method9119();
        var1.field1026 = var2.method9119();
        var1.field1033 = var2.method9119();
        var1.field1032 = var2.method9119();
        int var6 = var2.method8955();
        if (var6 > 0) {
            var1.field1039 = var1.method2275(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method9119();
                class523 var9 = new class523(var8 > 0 ? class333.method44(var8) : 1);
                var1.field1039[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method9110();
                    int var11 = var2.method9110();
                    var9.method8663(new class507(var11), (long) var10);
                }
            }
        }
        var2.field5415 = 0;
        var1.field1027 = var2.method8987();
        var1.field1034 = new int[var5];
        var1.field1029 = new int[var5];
        var1.field1037 = new String[var5];
        int var12 = 0;
        while (var2.field5415 < var4) {
            int var13 = var2.method9119();
            if (var13 == 3) {
                var1.field1037[var12] = var2.method9166();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1029[var12] = var2.method8955();
            } else {
                var1.field1029[var12] = var2.method9110();
            }
            var1.field1034[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dt.ax(II)[Lui;")
    public class523[] method2275(int arg0) {
        return new class523[arg0];
    }

    @ObfuscatedName("fq.aq(I)V")
    public static void method3201() {
        field1030.method5736();
    }
}
