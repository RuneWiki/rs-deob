package deob;

@ObfuscatedName("v")
public class class14 extends class187 {

    @ObfuscatedName("v.p")
    public static class175 field198 = new class175(32);

    @ObfuscatedName("v.g")
    public int[] field202 = new int[] { -1 };

    @ObfuscatedName("v.x")
    public int[] field199 = new int[] { 0 };

    @ObfuscatedName("ce.p(III)I")
    public static int method2027(int arg0, int arg1) {
        class14 var2 = (class14) field198.method3263((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field202.length) {
            return var2.field202[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bb.g(III)I")
    public static int method1649(int arg0, int arg1) {
        class14 var2 = (class14) field198.method3263((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field199.length; var4++) {
                if (var2.field202[var4] == arg1) {
                    var3 += var2.field199[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("aw.c(II)V")
    public static void method556(int arg0) {
        class14 var1 = (class14) field198.method3263((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field202.length; var2++) {
                var1.field202[var2] = -1;
                var1.field199[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ev.n(I)V")
    public static void method2766() {
        field198 = new class175(32);
    }
}
