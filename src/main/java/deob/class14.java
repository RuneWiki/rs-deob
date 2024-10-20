package deob;

@ObfuscatedName("v")
public class class14 extends class186 {

    @ObfuscatedName("v.e")
    public static class174 field199 = new class174(32);

    @ObfuscatedName("v.o")
    public int[] field198 = new int[] { -1 };

    @ObfuscatedName("v.y")
    public int[] field200 = new int[] { 0 };

    @ObfuscatedName("dh.e(III)I")
    public static int method2498(int arg0, int arg1) {
        class14 var2 = (class14) field199.method3092((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field198.length) {
            return var2.field198[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("v.y(B)V")
    public static void method142() {
        field199 = new class174(32);
    }
}
