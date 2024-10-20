package deob;

@ObfuscatedName("f")
public class class19 extends class181 {

    @ObfuscatedName("f.e")
    public static class177 field292 = new class177(32);

    @ObfuscatedName("f.i")
    public int[] field287 = new int[] { -1 };

    @ObfuscatedName("f.k")
    public int[] field289 = new int[] { 0 };

    @ObfuscatedName("t.e(III)I")
    public static int method154(int arg0, int arg1) {
        class19 var2 = (class19) field292.method3314((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field287.length) {
            return var2.field287[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("el.i(III)I")
    public static int method2738(int arg0, int arg1) {
        class19 var2 = (class19) field292.method3314((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field289.length) {
            return var2.field289[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("n.k(IIIII)V")
    public static void method243(int arg0, int arg1, int arg2, int arg3) {
        class19 var4 = (class19) field292.method3314((long) arg0);
        if (var4 == null) {
            var4 = new class19();
            field292.method3311(var4, (long) arg0);
        }
        if (var4.field287.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field287.length; var7++) {
                var5[var7] = var4.field287[var7];
                var6[var7] = var4.field289[var7];
            }
            for (int var8 = var4.field287.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field287 = var5;
            var4.field289 = var6;
        }
        var4.field287[arg1] = arg2;
        var4.field289[arg1] = arg3;
    }

    @ObfuscatedName("cc.q(II)V")
    public static void method2130(int arg0) {
        class19 var1 = (class19) field292.method3314((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field287.length; var2++) {
                var1.field287[var2] = -1;
                var1.field289[var2] = 0;
            }
        }
    }

    @ObfuscatedName("o.j(II)V")
    public static void method163(int arg0) {
        class19 var1 = (class19) field292.method3314((long) arg0);
        if (var1 != null) {
            var1.method3366();
        }
    }

    @ObfuscatedName("b.z(I)V")
    public static void method174() {
        field292 = new class177(32);
    }
}
