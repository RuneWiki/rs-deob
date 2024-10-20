package deob;

@ObfuscatedName("bz")
public class class64 extends class204 {

    @ObfuscatedName("bz.a")
    public static class202 field726 = new class202(32);

    @ObfuscatedName("bz.w")
    public int[] field723 = new int[] { -1 };

    @ObfuscatedName("bz.e")
    public int[] field724 = new int[] { 0 };

    @ObfuscatedName("v.a(III)I")
    public static int method167(int arg0, int arg1) {
        class64 var2 = (class64) field726.method3387((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field723.length) {
            return var2.field723[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("q.w(IIB)I")
    public static int method137(int arg0, int arg1) {
        class64 var2 = (class64) field726.method3387((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field724.length) {
            return var2.field724[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("an.e(IIB)I")
    public static int method457(int arg0, int arg1) {
        class64 var2 = (class64) field726.method3387((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field724.length; var4++) {
                if (var2.field723[var4] == arg1) {
                    var3 += var2.field724[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ai.u(II)V")
    public static void method491(int arg0) {
        class64 var1 = (class64) field726.method3387((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field723.length; var2++) {
                var1.field723[var2] = -1;
                var1.field724[var2] = 0;
            }
        }
    }
}
