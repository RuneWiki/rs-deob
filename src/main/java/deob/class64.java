package deob;

@ObfuscatedName("bt")
public class class64 extends class204 {

    @ObfuscatedName("bt.n")
    public static class202 field755 = new class202(32);

    @ObfuscatedName("bt.v")
    public int[] field754 = new int[] { -1 };

    @ObfuscatedName("bt.y")
    public int[] field759 = new int[] { 0 };

    @ObfuscatedName("bp.n(III)I")
    public static int method1007(int arg0, int arg1) {
        class64 var2 = (class64) field755.method3416((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field754.length) {
            return var2.field754[arg1];
        } else {
            return -1;
        }
    }
}
