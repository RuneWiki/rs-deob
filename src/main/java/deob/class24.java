package deob;

@ObfuscatedName("x")
public final class class24 extends class208 {

    @ObfuscatedName("x.j")
    public static class199 field616 = new class199();

    @ObfuscatedName("x.l")
    public int field604;

    @ObfuscatedName("x.a")
    public int field603;

    @ObfuscatedName("x.i")
    public int field606;

    @ObfuscatedName("x.f")
    public int field611;

    @ObfuscatedName("x.m")
    public int field608;

    @ObfuscatedName("x.o")
    public int field609;

    @ObfuscatedName("x.h")
    public int field610;

    @ObfuscatedName("x.n")
    public class65 field605;

    @ObfuscatedName("x.k")
    public int field612;

    @ObfuscatedName("x.r")
    public class41 field617;

    @ObfuscatedName("x.b")
    public int field615;

    @ObfuscatedName("x.q")
    public int[] field620;

    @ObfuscatedName("x.u")
    public int field613;

    @ObfuscatedName("x.g")
    public class65 field607;

    @ObfuscatedName("cc.j(B)V")
    public static void method2118() {
        for (class24 var0 = (class24) field616.method3528(); var0 != null; var0 = (class24) field616.method3527()) {
            if (var0.field617 != null) {
                var0.method580();
            }
        }
    }

    @ObfuscatedName("x.l(B)V")
    public void method580() {
        int var1 = this.field610;
        class41 var2 = this.field617.method809();
        if (var2 == null) {
            this.field610 = -1;
            this.field609 = 0;
            this.field612 = 0;
            this.field615 = 0;
            this.field620 = null;
        } else {
            this.field610 = var2.field968;
            this.field609 = var2.field963 * 128;
            this.field612 = var2.field964;
            this.field615 = var2.field965;
            this.field620 = var2.field966;
        }
        if (this.field610 != var1 && this.field605 != null) {
            Statics.field253.method1122(this.field605);
            this.field605 = null;
        }
    }
}
