package deob;

@ObfuscatedName("bu")
public class class64 extends class193 {

    @ObfuscatedName("bu.e")
    public static class191 field778 = new class191(32);

    @ObfuscatedName("bu.o")
    public int[] field776 = new int[] { -1 };

    @ObfuscatedName("bu.m")
    public int[] field777 = new int[] { 0 };

    @ObfuscatedName("bw.e(III)I")
    public static int method982(int arg0, int arg1) {
        class64 var2 = (class64) field778.method3268((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field776.length) {
            return var2.field776[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("v.o(III)I")
    public static int method69(int arg0, int arg1) {
        class64 var2 = (class64) field778.method3268((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field777.length) {
            return var2.field777[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ad.m(III)I")
    public static int method187(int arg0, int arg1) {
        class64 var2 = (class64) field778.method3268((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field777.length; var4++) {
                if (var2.field776[var4] == arg1) {
                    var3 += var2.field777[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("bo.d(II)V")
    public static void method686(int arg0) {
        class64 var1 = (class64) field778.method3268((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field776.length; var2++) {
                var1.field776[var2] = -1;
                var1.field777[var2] = 0;
            }
        }
    }

    @ObfuscatedName("bt.k(B)V")
    public static void method981() {
        field778 = new class191(32);
    }
}
