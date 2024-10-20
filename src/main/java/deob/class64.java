package deob;

@ObfuscatedName("bk")
public class class64 extends class193 {

    @ObfuscatedName("bk.a")
    public static class191 field786 = new class191(32);

    @ObfuscatedName("bk.j")
    public int[] field777 = new int[] { -1 };

    @ObfuscatedName("bk.n")
    public int[] field779 = new int[] { 0 };

    @ObfuscatedName("v.a(III)I")
    public static int method13(int arg0, int arg1) {
        class64 var2 = (class64) field786.method3264((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field777.length) {
            return var2.field777[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("p.n(IB)V")
    public static void method49(int arg0) {
        class64 var1 = (class64) field786.method3264((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field777.length; var2++) {
                var1.field777[var2] = -1;
                var1.field779[var2] = 0;
            }
        }
    }
}
