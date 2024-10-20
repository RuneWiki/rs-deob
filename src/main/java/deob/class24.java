package deob;

@ObfuscatedName("q")
public final class class24 extends class209 {

    @ObfuscatedName("q.s")
    public int field598;

    @ObfuscatedName("q.j")
    public static class200 field616 = new class200();

    @ObfuscatedName("q.p")
    public int field607;

    @ObfuscatedName("q.x")
    public int field601;

    @ObfuscatedName("q.d")
    public int field600;

    @ObfuscatedName("q.u")
    public int field602;

    @ObfuscatedName("q.o")
    public int field603;

    @ObfuscatedName("q.b")
    public int field604;

    @ObfuscatedName("q.k")
    public int field605;

    @ObfuscatedName("q.c")
    public class65 field599;

    @ObfuscatedName("q.l")
    public int field608;

    @ObfuscatedName("q.t")
    public int[] field609;

    @ObfuscatedName("q.i")
    public int field610;

    @ObfuscatedName("q.r")
    public class41 field612;

    @ObfuscatedName("q.m")
    public class65 field611;

    @ObfuscatedName("o.s(B)V")
    public static void method97() {
        for (class24 var0 = (class24) field616.method3553(); var0 != null; var0 = (class24) field616.method3558()) {
            if (var0.field612 != null) {
                var0.method568();
            }
        }
    }

    @ObfuscatedName("q.j(I)V")
    public void method568() {
        int var1 = this.field605;
        class41 var2 = this.field612.method763();
        if (var2 == null) {
            this.field605 = -1;
            this.field604 = 0;
            this.field598 = 0;
            this.field608 = 0;
            this.field609 = null;
        } else {
            this.field605 = var2.field937;
            this.field604 = var2.field970 * 128;
            this.field598 = var2.field941;
            this.field608 = var2.field969;
            this.field609 = var2.field973;
        }
        if (this.field605 != var1 && this.field599 != null) {
            Statics.field1979.method1097(this.field599);
            this.field599 = null;
        }
    }
}
