package deob;

@ObfuscatedName("g")
public final class class24 extends class208 {

    @ObfuscatedName("g.d")
    public static class199 field614 = new class199();

    @ObfuscatedName("g.p")
    public int field603;

    @ObfuscatedName("g.v")
    public int field604;

    @ObfuscatedName("g.l")
    public int field605;

    @ObfuscatedName("g.y")
    public int field602;

    @ObfuscatedName("g.w")
    public int field608;

    @ObfuscatedName("g.u")
    public int field617;

    @ObfuscatedName("g.a")
    public int field616;

    @ObfuscatedName("g.e")
    public class65 field610;

    @ObfuscatedName("g.b")
    public int field611;

    @ObfuscatedName("g.o")
    public int field612;

    @ObfuscatedName("g.m")
    public int[] field606;

    @ObfuscatedName("g.x")
    public int field607;

    @ObfuscatedName("g.k")
    public class65 field615;

    @ObfuscatedName("g.n")
    public class41 field619;

    @ObfuscatedName("w.d(I)V")
    public static void method94() {
        for (class24 var0 = (class24) field614.method3613(); var0 != null; var0 = (class24) field614.method3615()) {
            if (var0.field619 != null) {
                var0.method570();
            }
        }
    }

    @ObfuscatedName("g.p(I)V")
    public void method570() {
        int var1 = this.field616;
        class41 var2 = this.field619.method795();
        if (var2 == null) {
            this.field616 = -1;
            this.field617 = 0;
            this.field611 = 0;
            this.field612 = 0;
            this.field606 = null;
        } else {
            this.field616 = var2.field972;
            this.field617 = var2.field973 * 128;
            this.field611 = var2.field934;
            this.field612 = var2.field975;
            this.field606 = var2.field950;
        }
        if (this.field616 != var1 && this.field610 != null) {
            Statics.field251.method1116(this.field610);
            this.field610 = null;
        }
    }
}
