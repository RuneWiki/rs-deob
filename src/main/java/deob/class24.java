package deob;

@ObfuscatedName("u")
public final class class24 extends class208 {

    @ObfuscatedName("u.y")
    public static class199 field617 = new class199();

    @ObfuscatedName("u.d")
    public int field609;

    @ObfuscatedName("u.g")
    public int field608;

    @ObfuscatedName("u.w")
    public int field613;

    @ObfuscatedName("u.e")
    public int field616;

    @ObfuscatedName("u.c")
    public int field611;

    @ObfuscatedName("u.a")
    public int field612;

    @ObfuscatedName("u.q")
    public int field610;

    @ObfuscatedName("u.m")
    public class65 field614;

    @ObfuscatedName("u.n")
    public int field615;

    @ObfuscatedName("u.k")
    public int field606;

    @ObfuscatedName("u.o")
    public int[] field618;

    @ObfuscatedName("u.f")
    public int field607;

    @ObfuscatedName("u.s")
    public class65 field619;

    @ObfuscatedName("u.z")
    public class41 field620;

    @ObfuscatedName("eg.d(I)V")
    public static void method2754() {
        for (class24 var0 = (class24) field617.method3493(); var0 != null; var0 = (class24) field617.method3495()) {
            if (var0.field620 != null) {
                var0.method581();
            }
        }
    }

    @ObfuscatedName("u.g(I)V")
    public void method581() {
        int var1 = this.field610;
        class41 var2 = this.field620.method769();
        if (var2 == null) {
            this.field610 = -1;
            this.field612 = 0;
            this.field615 = 0;
            this.field606 = 0;
            this.field618 = null;
        } else {
            this.field610 = var2.field958;
            this.field612 = var2.field959 * 128;
            this.field615 = var2.field940;
            this.field606 = var2.field961;
            this.field618 = var2.field939;
        }
        if (this.field610 != var1 && this.field614 != null) {
            Statics.field1215.method1113(this.field614);
            this.field614 = null;
        }
    }
}
