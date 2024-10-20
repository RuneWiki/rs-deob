package deob;

@ObfuscatedName("da")
public class class85 extends class489 {

    @ObfuscatedName("da.am")
    public static class505 field1041 = new class505(32);

    @ObfuscatedName("da.ap")
    public int[] field1038 = new int[] { -1 };

    @ObfuscatedName("da.af")
    public int[] field1039 = new int[] { 0 };

    @ObfuscatedName("rj.am(III)I")
    public static int method7656(int arg0, int arg1) {
        class85 var2 = (class85) field1041.method8301((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1038.length) {
            return var2.field1038[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hu.ap(III)I")
    public static int method3390(int arg0, int arg1) {
        class85 var2 = (class85) field1041.method8301((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1039.length) {
            return var2.field1039[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fq.af(III)I")
    public static int method3103(int arg0, int arg1) {
        class85 var2 = (class85) field1041.method8301((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1039.length; var4++) {
                if (var2.field1038[var4] == arg1) {
                    var3 += var2.field1039[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("kw.aj(IIIIB)V")
    public static void method5126(int arg0, int arg1, int arg2, int arg3) {
        class85 var4 = (class85) field1041.method8301((long) arg0);
        if (var4 == null) {
            var4 = new class85();
            field1041.method8307(var4, (long) arg0);
        }
        if (var4.field1038.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1038.length; var7++) {
                var5[var7] = var4.field1038[var7];
                var6[var7] = var4.field1039[var7];
            }
            for (int var8 = var4.field1038.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1038 = var5;
            var4.field1039 = var6;
        }
        var4.field1038[arg1] = arg2;
        var4.field1039[arg1] = arg3;
    }

    @ObfuscatedName("ef.aq(II)V")
    public static void method2905(int arg0) {
        class85 var1 = (class85) field1041.method8301((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1038.length; var2++) {
                var1.field1038[var2] = -1;
                var1.field1039[var2] = 0;
            }
        }
    }

    @ObfuscatedName("cm.ar(II)V")
    public static void method2069(int arg0) {
        class85 var1 = (class85) field1041.method8301((long) arg0);
        if (var1 != null) {
            var1.method7988();
        }
    }

    @ObfuscatedName("au.ag(B)V")
    public static void method84() {
        field1041 = new class505(32);
    }
}
