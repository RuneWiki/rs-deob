package deob;

@ObfuscatedName("d")
public class class16 extends class212 {

    @ObfuscatedName("d.f")
    public static class200 field221 = new class200(32);

    @ObfuscatedName("d.e")
    public int[] field219 = new int[] { -1 };

    @ObfuscatedName("d.n")
    public int[] field218 = new int[] { 0 };

    @ObfuscatedName("f.f(IIB)I")
    public static int method3(int arg0, int arg1) {
        class16 var2 = (class16) field221.method3605((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field219.length) {
            return var2.field219[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("a.e(IIB)I")
    public static int method562(int arg0, int arg1) {
        class16 var2 = (class16) field221.method3605((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field218.length) {
            return var2.field218[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("af.n(III)I")
    public static int method939(int arg0, int arg1) {
        class16 var2 = (class16) field221.method3605((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field218.length; var4++) {
                if (var2.field219[var4] == arg1) {
                    var3 += var2.field218[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("k.t(IIIIB)V")
    public static void method94(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = (class16) field221.method3605((long) arg0);
        if (var4 == null) {
            var4 = new class16();
            field221.method3606(var4, (long) arg0);
        }
        if (var4.field219.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field219.length; var7++) {
                var5[var7] = var4.field219[var7];
                var6[var7] = var4.field218[var7];
            }
            for (int var8 = var4.field219.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field219 = var5;
            var4.field218 = var6;
        }
        var4.field219[arg1] = arg2;
        var4.field218[arg1] = arg3;
    }

    @ObfuscatedName("k.v(II)V")
    public static void method91(int arg0) {
        class16 var1 = (class16) field221.method3605((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field219.length; var2++) {
                var1.field219[var2] = -1;
                var1.field218[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ak.b(IB)V")
    public static void method835(int arg0) {
        class16 var1 = (class16) field221.method3605((long) arg0);
        if (var1 != null) {
            var1.method3744();
        }
    }

    @ObfuscatedName("ez.m(I)V")
    public static void method2958() {
        field221 = new class200(32);
    }
}
