package deob;

@ObfuscatedName("aa")
public final class class32 extends class128 {

    @ObfuscatedName("aa.k")
    public static class129 field694 = new class129();

    @ObfuscatedName("aa.y")
    public int field704;

    @ObfuscatedName("aa.o")
    public int field700;

    @ObfuscatedName("aa.r")
    public class198 field707;

    @ObfuscatedName("aa.w")
    public int field693;

    @ObfuscatedName("aa.j")
    public int field697;

    @ObfuscatedName("aa.q")
    public int field705;

    @ObfuscatedName("aa.d")
    public int field699;

    @ObfuscatedName("aa.n")
    public int field695;

    @ObfuscatedName("aa.c")
    public class67 field701;

    @ObfuscatedName("aa.s")
    public int field702;

    @ObfuscatedName("aa.g")
    public int field703;

    @ObfuscatedName("aa.i")
    public int[] field696;

    @ObfuscatedName("aa.v")
    public int field698;

    @ObfuscatedName("aa.a")
    public class67 field706;

    @ObfuscatedName("m.k(I)V")
    public static void method233() {
        for (class32 var0 = (class32) field694.method2243(); var0 != null; var0 = (class32) field694.method2238()) {
            if (var0.field707 != null) {
                var0.method696();
            }
        }
    }

    @ObfuscatedName("aa.y(B)V")
    public void method696() {
        int var1 = this.field695;
        class198 var2 = this.field707.method3409();
        if (var2 == null) {
            this.field695 = -1;
            this.field699 = 0;
            this.field702 = 0;
            this.field703 = 0;
            this.field696 = null;
        } else {
            this.field695 = var2.field2901;
            this.field699 = var2.field2920 * 128;
            this.field702 = var2.field2875;
            this.field703 = var2.field2922;
            this.field696 = var2.field2923;
        }
        if (this.field695 != var1 && this.field701 != null) {
            Statics.field2291.method892(this.field701);
            this.field701 = null;
        }
    }
}
