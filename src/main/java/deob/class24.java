package deob;

@ObfuscatedName("c")
public final class class24 extends class208 {

    @ObfuscatedName("c.f")
    public static class199 field618 = new class199();

    @ObfuscatedName("c.s")
    public int field629;

    @ObfuscatedName("c.q")
    public int field611;

    @ObfuscatedName("c.g")
    public int field613;

    @ObfuscatedName("c.m")
    public int field614;

    @ObfuscatedName("c.t")
    public int field615;

    @ObfuscatedName("c.j")
    public int field616;

    @ObfuscatedName("c.n")
    public int field627;

    @ObfuscatedName("c.l")
    public int field624;

    @ObfuscatedName("c.i")
    public class65 field619;

    @ObfuscatedName("c.w")
    public int field621;

    @ObfuscatedName("c.v")
    public int[] field612;

    @ObfuscatedName("c.o")
    public int field623;

    @ObfuscatedName("c.p")
    public class65 field620;

    @ObfuscatedName("c.b")
    public class41 field625;

    @ObfuscatedName("ct.f(I)V")
    public static void method1961() {
        for (class24 var0 = (class24) field618.method3566(); var0 != null; var0 = (class24) field618.method3567()) {
            if (var0.field619 != null) {
                Statics.field1900.method1135(var0.field619);
                var0.field619 = null;
            }
            if (var0.field620 != null) {
                Statics.field1900.method1135(var0.field620);
                var0.field620 = null;
            }
        }
        field618.method3560();
    }

    @ObfuscatedName("ff.s(I)V")
    public static void method2954() {
        for (class24 var0 = (class24) field618.method3566(); var0 != null; var0 = (class24) field618.method3567()) {
            if (var0.field625 != null) {
                var0.method577();
            }
        }
    }

    @ObfuscatedName("c.q(I)V")
    public void method577() {
        int var1 = this.field624;
        class41 var2 = this.field625.method798();
        if (var2 == null) {
            this.field624 = -1;
            this.field627 = 0;
            this.field629 = 0;
            this.field621 = 0;
            this.field612 = null;
        } else {
            this.field624 = var2.field969;
            this.field627 = var2.field940 * 128;
            this.field629 = var2.field971;
            this.field621 = var2.field972;
            this.field612 = var2.field941;
        }
        if (this.field624 != var1 && this.field619 != null) {
            Statics.field1900.method1135(this.field619);
            this.field619 = null;
        }
    }
}
