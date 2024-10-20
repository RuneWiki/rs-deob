package deob;

@ObfuscatedName("g")
public class class16 extends class208 {

    @ObfuscatedName("g.h")
    public static class196 field220 = new class196(32);

    @ObfuscatedName("g.m")
    public int[] field211 = new int[] { -1 };

    @ObfuscatedName("g.i")
    public int[] field210 = new int[] { 0 };

    @ObfuscatedName("cr.h(IIB)I")
    public static int method2010(int arg0, int arg1) {
        class16 var2 = (class16) field220.method3519((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field211.length) {
            return var2.field211[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ax.m(IIIII)V")
    public static void method626(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field220.method3519((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field220.method3513(var4, (long) arg0);
        }
        if (var4.field211.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field211.length; var7++) {
                var5[var7] = var4.field211[var7];
                var6[var7] = var4.field210[var7];
            }
            for (int var8 = var4.field211.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field211 = var5;
            var4.field210 = var6;
        }
        var4.field211[arg1] = arg2;
        var4.field210[arg1] = arg3;
    }

    @ObfuscatedName("cc.i(II)V")
    public static void method2022(int arg0) {
        class16 var1 = (class16) field220.method3519((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field211.length; var2++) {
                var1.field211[var2] = -1;
                var1.field210[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dn.q(II)V")
    public static void method2559(int arg0) {
        class16 var1 = (class16) field220.method3519((long) arg0);
        if (var1 != null) {
            var1.method3625();
        }
    }

    @ObfuscatedName("l.p(I)V")
    public static void method115() {
        field220 = new class196(32);
    }
}
