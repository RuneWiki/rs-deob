package deob;

@ObfuscatedName("iy")
public class class260 extends class185 {

    @ObfuscatedName("iy.b")
    public static class155 field3322 = new class155(64);

    @ObfuscatedName("iy.l")
    public int field3323;

    @ObfuscatedName("iy.m")
    public int field3324;

    @ObfuscatedName("iy.z")
    public int field3325;

    @ObfuscatedName("iy.f(Lkb;B)V")
    public void method4257(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4248(arg0, var2);
        }
    }

    @ObfuscatedName("iy.b(Lkb;IB)V")
    public void method4248(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3323 = arg0.method5163();
            this.field3324 = arg0.method5276();
            this.field3325 = arg0.method5276();
        }
    }

    @ObfuscatedName("is.l(B)V")
    public static void method3878() {
        field3322.method3158();
    }
}
