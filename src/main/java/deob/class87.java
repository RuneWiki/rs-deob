package deob;

@ObfuscatedName("da")
public class class87 extends class504 {

    @ObfuscatedName("da.ak")
    public static class520 field1078 = new class520(32);

    @ObfuscatedName("da.al")
    public int[] field1076 = new int[] { -1 };

    @ObfuscatedName("da.aj")
    public int[] field1077 = new int[] { 0 };

    @ObfuscatedName("cj.ak(IIB)I")
    public static int method2028(int arg0, int arg1) {
        class87 var2 = (class87) field1078.method8528((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1076.length) {
            return var2.field1076[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fq.al(III)I")
    public static int method3085(int arg0, int arg1) {
        class87 var2 = (class87) field1078.method8528((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1077.length) {
            return var2.field1077[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cx.aj(III)I")
    public static int method2036(int arg0, int arg1) {
        class87 var2 = (class87) field1078.method8528((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1077.length; var4++) {
                if (var2.field1076[var4] == arg1) {
                    var3 += var2.field1077[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ix.az(IIIII)V")
    public static void method3992(int arg0, int arg1, int arg2, int arg3) {
        class87 var4 = (class87) field1078.method8528((long) arg0);
        if (var4 == null) {
            var4 = new class87();
            field1078.method8527(var4, (long) arg0);
        }
        if (var4.field1076.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1076.length; var7++) {
                var5[var7] = var4.field1076[var7];
                var6[var7] = var4.field1077[var7];
            }
            for (int var8 = var4.field1076.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1076 = var5;
            var4.field1077 = var6;
        }
        var4.field1076[arg1] = arg2;
        var4.field1077[arg1] = arg3;
    }

    @ObfuscatedName("ad.af(II)V")
    public static void method270(int arg0) {
        class87 var1 = (class87) field1078.method8528((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1076.length; var2++) {
                var1.field1076[var2] = -1;
                var1.field1077[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ro.aa(II)V")
    public static void method7840(int arg0) {
        class87 var1 = (class87) field1078.method8528((long) arg0);
        if (var1 != null) {
            var1.method8189();
        }
    }

    @ObfuscatedName("fn.at(B)V")
    public static void method3061() {
        field1078 = new class520(32);
    }
}
