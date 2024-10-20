package deob;

@ObfuscatedName("u")
public class class16 extends class208 {

    @ObfuscatedName("u.k")
    public static class196 field217 = new class196(32);

    @ObfuscatedName("u.h")
    public int[] field212 = new int[] { -1 };

    @ObfuscatedName("u.o")
    public int[] field213 = new int[] { 0 };

    @ObfuscatedName("ba.k(IIB)I")
    public static int method1043(int arg0, int arg1) {
        class16 var2 = (class16) field217.method3559((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field212.length) {
            return var2.field212[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("s.h(III)I")
    public static int method551(int arg0, int arg1) {
        class16 var2 = (class16) field217.method3559((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field213.length) {
            return var2.field213[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("d.o(IIIII)V")
    public static void method75(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field217.method3559((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field217.method3560(var4, (long) arg0);
        }
        if (var4.field212.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field212.length; var7++) {
                var5[var7] = var4.field212[var7];
                var6[var7] = var4.field213[var7];
            }
            for (int var8 = var4.field212.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field212 = var5;
            var4.field213 = var6;
        }
        var4.field212[arg1] = arg2;
        var4.field213[arg1] = arg3;
    }

    @ObfuscatedName("fr.z(II)V")
    public static void method2978(int arg0) {
        class16 var1 = (class16) field217.method3559((long) arg0);
        if (var1 != null) {
            var1.method3679();
        }
    }
}
