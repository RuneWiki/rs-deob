package deob;

@ObfuscatedName("s")
public class class16 extends class212 {

    @ObfuscatedName("s.x")
    public static class200 field229 = new class200(32);

    @ObfuscatedName("s.r")
    public int[] field221 = new int[] { -1 };

    @ObfuscatedName("s.j")
    public int[] field227 = new int[] { 0 };

    @ObfuscatedName("ad.x(III)I")
    public static int method738(int arg0, int arg1) {
        class16 var2 = (class16) field229.method3580((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field221.length) {
            return var2.field221[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("client.r(IIB)I")
    public static int method359(int arg0, int arg1) {
        class16 var2 = (class16) field229.method3580((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field227.length) {
            return var2.field227[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("i.j(IIS)I")
    public static int method48(int arg0, int arg1) {
        class16 var2 = (class16) field229.method3580((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field227.length; var4++) {
                if (var2.field221[var4] == arg1) {
                    var3 += var2.field227[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("eh.z(IIIII)V")
    public static void method2873(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field229.method3580((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field229.method3569(var4, (long) arg0);
        }
        if (var4.field221.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field221.length; var7++) {
                var5[var7] = var4.field221[var7];
                var6[var7] = var4.field227[var7];
            }
            for (int var8 = var4.field221.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field221 = var5;
            var4.field227 = var6;
        }
        var4.field221[arg1] = arg2;
        var4.field227[arg1] = arg3;
    }

    @ObfuscatedName("dr.i(II)V")
    public static void method2206(int arg0) {
        class16 var1 = (class16) field229.method3580((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field221.length; var2++) {
                var1.field221[var2] = -1;
                var1.field227[var2] = 0;
            }
        }
    }
}
