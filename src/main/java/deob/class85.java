package deob;

@ObfuscatedName("dw")
public class class85 extends class461 {

    @ObfuscatedName("dw.at")
    public static class477 field1042 = new class477(32);

    @ObfuscatedName("dw.an")
    public int[] field1041 = new int[] { -1 };

    @ObfuscatedName("dw.av")
    public int[] field1043 = new int[] { 0 };

    @ObfuscatedName("jq.at(IIB)I")
    public static int method4669(int arg0, int arg1) {
        class85 var2 = (class85) field1042.method7872((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1041.length) {
            return var2.field1041[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("is.an(III)I")
    public static int method3888(int arg0, int arg1) {
        class85 var2 = (class85) field1042.method7872((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1043.length) {
            return var2.field1043[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("mu.av(IIS)I")
    public static int method5379(int arg0, int arg1) {
        class85 var2 = (class85) field1042.method7872((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1043.length; var4++) {
                if (var2.field1041[var4] == arg1) {
                    var3 += var2.field1043[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ct.as(IIIII)V")
    public static void method1968(int arg0, int arg1, int arg2, int arg3) {
        class85 var4 = (class85) field1042.method7872((long) arg0);
        if (var4 == null) {
            var4 = new class85();
            field1042.method7878(var4, (long) arg0);
        }
        if (var4.field1041.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1041.length; var7++) {
                var5[var7] = var4.field1041[var7];
                var6[var7] = var4.field1043[var7];
            }
            for (int var8 = var4.field1041.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1041 = var5;
            var4.field1043 = var6;
        }
        var4.field1041[arg1] = arg2;
        var4.field1043[arg1] = arg3;
    }

    @ObfuscatedName("li.ax(IB)V")
    public static void method5133(int arg0) {
        class85 var1 = (class85) field1042.method7872((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1041.length; var2++) {
                var1.field1041[var2] = -1;
                var1.field1043[var2] = 0;
            }
        }
    }

    @ObfuscatedName("hj.ap(II)V")
    public static void method3511(int arg0) {
        class85 var1 = (class85) field1042.method7872((long) arg0);
        if (var1 != null) {
            var1.method7560();
        }
    }

    @ObfuscatedName("ab.ab(I)V")
    public static void method35() {
        field1042 = new class477(32);
    }
}
