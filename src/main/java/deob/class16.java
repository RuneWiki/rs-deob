package deob;

@ObfuscatedName("r")
public class class16 extends class208 {

    @ObfuscatedName("r.j")
    public static class196 field217 = new class196(32);

    @ObfuscatedName("r.m")
    public int[] field218 = new int[] { -1 };

    @ObfuscatedName("r.f")
    public int[] field215 = new int[] { 0 };

    @ObfuscatedName("ad.j(IIB)I")
    public static int method991(int arg0, int arg1) {
        class16 var2 = (class16) field217.method3571((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field218.length) {
            return var2.field218[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ab.m(IIIII)V")
    public static void method1027(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field217.method3571((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field217.method3574(var4, (long) arg0);
        }
        if (var4.field218.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field218.length; var7++) {
                var5[var7] = var4.field218[var7];
                var6[var7] = var4.field215[var7];
            }
            for (int var8 = var4.field218.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field218 = var5;
            var4.field215 = var6;
        }
        var4.field218[arg1] = arg2;
        var4.field215[arg1] = arg3;
    }

    @ObfuscatedName("as.f(II)V")
    public static void method681(int arg0) {
        class16 var1 = (class16) field217.method3571((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field218.length; var2++) {
                var1.field218[var2] = -1;
                var1.field215[var2] = 0;
            }
        }
    }

    @ObfuscatedName("r.l(B)V")
    public static void method196() {
        field217 = new class196(32);
    }
}
