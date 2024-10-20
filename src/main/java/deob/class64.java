package deob;

@ObfuscatedName("bd")
public class class64 extends class193 {

    @ObfuscatedName("bd.d")
    public static class191 field756 = new class191(32);

    @ObfuscatedName("bd.q")
    public int[] field761 = new int[] { -1 };

    @ObfuscatedName("bd.x")
    public int[] field755 = new int[] { 0 };

    @ObfuscatedName("cm.d(IIB)I")
    public static int method1558(int arg0, int arg1) {
        class64 var2 = (class64) field756.method3263((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field755.length) {
            return var2.field755[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("hu.q(IIS)I")
    public static int method3736(int arg0, int arg1) {
        class64 var2 = (class64) field756.method3263((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field755.length; var4++) {
                if (var2.field761[var4] == arg1) {
                    var3 += var2.field755[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("cv.y(II)V")
    public static void method1721(int arg0) {
        class64 var1 = (class64) field756.method3263((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field761.length; var2++) {
                var1.field761[var2] = -1;
                var1.field755[var2] = 0;
            }
        }
    }
}
