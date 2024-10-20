package deob;

@ObfuscatedName("do")
public class class85 extends class474 {

    @ObfuscatedName("do.aw")
    public static class490 field1050 = new class490(32);

    @ObfuscatedName("do.ay")
    public int[] field1052 = new int[] { -1 };

    @ObfuscatedName("do.ar")
    public int[] field1049 = new int[] { 0 };

    @ObfuscatedName("lv.aw(III)I")
    public static int method5177(int arg0, int arg1) {
        class85 var2 = (class85) field1050.method7981((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1052.length) {
            return var2.field1052[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("sg.ay(III)I")
    public static int method7936(int arg0, int arg1) {
        class85 var2 = (class85) field1050.method7981((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1049.length) {
            return var2.field1049[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cy.ar(IIB)I")
    public static int method1856(int arg0, int arg1) {
        class85 var2 = (class85) field1050.method7981((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1049.length; var4++) {
                if (var2.field1052[var4] == arg1) {
                    var3 += var2.field1049[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("hb.am(IIIII)V")
    public static void method3627(int arg0, int arg1, int arg2, int arg3) {
        class85 var4 = (class85) field1050.method7981((long) arg0);
        if (var4 == null) {
            var4 = new class85();
            field1050.method7990(var4, (long) arg0);
        }
        if (var4.field1052.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1052.length; var7++) {
                var5[var7] = var4.field1052[var7];
                var6[var7] = var4.field1049[var7];
            }
            for (int var8 = var4.field1052.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1052 = var5;
            var4.field1049 = var6;
        }
        var4.field1052[arg1] = arg2;
        var4.field1049[arg1] = arg3;
    }

    @ObfuscatedName("cw.aj(II)V")
    public static void method1105(int arg0) {
        class85 var1 = (class85) field1050.method7981((long) arg0);
        if (var1 != null) {
            var1.method7662();
        }
    }
}
