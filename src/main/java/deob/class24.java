package deob;

@ObfuscatedName("b")
public final class class24 extends class208 {

    @ObfuscatedName("b.v")
    public static class199 field617 = new class199();

    @ObfuscatedName("b.f")
    public int field603;

    @ObfuscatedName("b.i")
    public int field604;

    @ObfuscatedName("b.d")
    public int field605;

    @ObfuscatedName("b.o")
    public int field606;

    @ObfuscatedName("b.c")
    public int field614;

    @ObfuscatedName("b.p")
    public int field608;

    @ObfuscatedName("b.j")
    public int field609;

    @ObfuscatedName("b.a")
    public class65 field602;

    @ObfuscatedName("b.y")
    public int field611;

    @ObfuscatedName("b.h")
    public int field612;

    @ObfuscatedName("b.z")
    public int[] field613;

    @ObfuscatedName("b.w")
    public int field610;

    @ObfuscatedName("b.l")
    public class65 field615;

    @ObfuscatedName("b.q")
    public class41 field616;

    @ObfuscatedName("b.f(B)V")
    public void method565() {
        int var1 = this.field609;
        class41 var2 = this.field616.method780();
        if (var2 == null) {
            this.field609 = -1;
            this.field608 = 0;
            this.field611 = 0;
            this.field612 = 0;
            this.field613 = null;
        } else {
            this.field609 = var2.field924;
            this.field608 = var2.field947 * 128;
            this.field611 = var2.field934;
            this.field612 = var2.field964;
            this.field613 = var2.field965;
        }
        if (this.field609 != var1 && this.field602 != null) {
            Statics.field2905.method1120(this.field602);
            this.field602 = null;
        }
    }
}
