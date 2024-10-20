package deob;

@ObfuscatedName("dt")
public class class79 extends class481 {

    @ObfuscatedName("dt.at")
    public static class299 field979 = new class299(128);

    @ObfuscatedName("dt.ah")
    public String field975;

    @ObfuscatedName("dt.ar")
    public int[] field974;

    @ObfuscatedName("dt.ao")
    public int[] field977;

    @ObfuscatedName("dt.ab")
    public String[] field978;

    @ObfuscatedName("dt.au")
    public int field980;

    @ObfuscatedName("dt.aa")
    public int field976;

    @ObfuscatedName("dt.ac")
    public int field981;

    @ObfuscatedName("dt.al")
    public int field982;

    @ObfuscatedName("dt.az")
    public class500[] field983;

    @ObfuscatedName("dv.at(II)Ldt;")
    public static class79 method2373(int arg0) {
        class79 var1 = (class79) field979.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field319.method6284(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class79 var3 = method3377(var2);
            field979.method5303(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("jo.ar(III)Ldt;")
    public static class79 method4407(int arg0, int arg1) {
        class79 var2 = (class79) field979.method5289((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field319.method6300(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field319.method6298(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class79 var6 = method3377(var5);
            if (var6 != null) {
                field979.method5303(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("hf.ao([BI)Ldt;")
    public static class79 method3377(byte[] arg0) {
        class79 var1 = new class79();
        class527 var2 = new class527(arg0);
        var2.field5137 = var2.field5140.length - 2;
        int var3 = var2.method8412();
        int var4 = var2.field5140.length - 2 - var3 - 12;
        var2.field5137 = var4;
        int var5 = var2.method8416();
        var1.field980 = var2.method8412();
        var1.field976 = var2.method8412();
        var1.field981 = var2.method8412();
        var1.field982 = var2.method8412();
        int var6 = var2.method8410();
        if (var6 > 0) {
            var1.field983 = var1.method2111(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8412();
                class500 var9 = new class500(var8 > 0 ? class315.method3369(var8) : 1);
                var1.field983[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8416();
                    int var11 = var2.method8416();
                    var9.method8135(new class484(var11), (long) var10);
                }
            }
        }
        var2.field5137 = 0;
        var1.field975 = var2.method8420();
        var1.field974 = new int[var5];
        var1.field977 = new int[var5];
        var1.field978 = new String[var5];
        int var12 = 0;
        while (var2.field5137 < var4) {
            int var13 = var2.method8412();
            if (var13 == 3) {
                var1.field978[var12] = var2.method8535();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field977[var12] = var2.method8410();
            } else {
                var1.field977[var12] = var2.method8416();
            }
            var1.field974[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("dt.ab(II)[Ltz;")
    public class500[] method2111(int arg0) {
        return new class500[arg0];
    }

    @ObfuscatedName("ag.au(B)V")
    public static void method323() {
        field979.method5292();
    }
}
