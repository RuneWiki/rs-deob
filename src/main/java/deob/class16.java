package deob;

@ObfuscatedName("p")
public class class16 extends class208 {

    @ObfuscatedName("p.z")
    public static class196 field218 = new class196(32);

    @ObfuscatedName("p.q")
    public int[] field213 = new int[] { -1 };

    @ObfuscatedName("p.k")
    public int[] field214 = new int[] { 0 };

    @ObfuscatedName("ac.z(III)I")
    public static int method681(int arg0, int arg1) {
        class16 var2 = (class16) field218.method3462((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field214.length; var4++) {
                if (var2.field213[var4] == arg1) {
                    var3 += var2.field214[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ca.q(IIIIB)V")
    public static void method1970(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field218.method3462((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field218.method3470(var4, (long) arg0);
        }
        if (var4.field213.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field213.length; var7++) {
                var5[var7] = var4.field213[var7];
                var6[var7] = var4.field214[var7];
            }
            for (int var8 = var4.field213.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field213 = var5;
            var4.field214 = var6;
        }
        var4.field213[arg1] = arg2;
        var4.field214[arg1] = arg3;
    }

    @ObfuscatedName("ca.k(I)V")
    public static void method1969() {
        field218 = new class196(32);
    }
}
