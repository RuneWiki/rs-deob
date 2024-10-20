package deob;

@ObfuscatedName("j")
public final class class24 extends class208 {

    @ObfuscatedName("j.h")
    public static class199 field607 = new class199();

    @ObfuscatedName("j.m")
    public int field602;

    @ObfuscatedName("j.i")
    public int field603;

    @ObfuscatedName("j.q")
    public int field614;

    @ObfuscatedName("j.p")
    public int field608;

    @ObfuscatedName("j.c")
    public int field604;

    @ObfuscatedName("j.f")
    public int field605;

    @ObfuscatedName("j.y")
    public int field619;

    @ObfuscatedName("j.w")
    public class65 field609;

    @ObfuscatedName("j.l")
    public int field610;

    @ObfuscatedName("j.v")
    public int field611;

    @ObfuscatedName("j.k")
    public int[] field615;

    @ObfuscatedName("j.o")
    public int field613;

    @ObfuscatedName("j.u")
    public class65 field601;

    @ObfuscatedName("j.s")
    public class41 field606;

    @ObfuscatedName("q.h(I)V")
    public static void method37() {
        for (class24 var0 = (class24) field607.method3546(); var0 != null; var0 = (class24) field607.method3548()) {
            if (var0.field609 != null) {
                Statics.field1633.method1114(var0.field609);
                var0.field609 = null;
            }
            if (var0.field601 != null) {
                Statics.field1633.method1114(var0.field601);
                var0.field601 = null;
            }
        }
        field607.method3540();
    }

    @ObfuscatedName("ch.m(I)V")
    public static void method2107() {
        for (class24 var0 = (class24) field607.method3546(); var0 != null; var0 = (class24) field607.method3548()) {
            if (var0.field606 != null) {
                var0.method568();
            }
        }
    }

    @ObfuscatedName("j.i(I)V")
    public void method568() {
        int var1 = this.field619;
        class41 var2 = this.field606.method766();
        if (var2 == null) {
            this.field619 = -1;
            this.field605 = 0;
            this.field610 = 0;
            this.field611 = 0;
            this.field615 = null;
        } else {
            this.field619 = var2.field973;
            this.field605 = var2.field941 * 128;
            this.field610 = var2.field953;
            this.field611 = var2.field937;
            this.field615 = var2.field977;
        }
        if (this.field619 != var1 && this.field609 != null) {
            Statics.field1633.method1114(this.field609);
            this.field609 = null;
        }
    }
}
