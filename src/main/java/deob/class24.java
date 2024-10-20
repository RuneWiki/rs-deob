package deob;

@ObfuscatedName("d")
public final class class24 extends class208 {

    @ObfuscatedName("d.l")
    public static class199 field610 = new class199();

    @ObfuscatedName("d.e")
    public int field608;

    @ObfuscatedName("d.q")
    public int field624;

    @ObfuscatedName("d.o")
    public int field613;

    @ObfuscatedName("d.g")
    public int field611;

    @ObfuscatedName("d.m")
    public int field612;

    @ObfuscatedName("d.b")
    public int field615;

    @ObfuscatedName("d.p")
    public int field614;

    @ObfuscatedName("d.t")
    public class65 field609;

    @ObfuscatedName("d.w")
    public int field607;

    @ObfuscatedName("d.x")
    public int field617;

    @ObfuscatedName("d.k")
    public int[] field618;

    @ObfuscatedName("d.z")
    public int field619;

    @ObfuscatedName("d.v")
    public class65 field620;

    @ObfuscatedName("d.j")
    public class41 field621;

    @ObfuscatedName("s.l(I)V")
    public static void method182() {
        for (class24 var0 = (class24) field610.method3544(); var0 != null; var0 = (class24) field610.method3538()) {
            if (var0.field621 != null) {
                var0.method594();
            }
        }
    }

    @ObfuscatedName("d.e(I)V")
    public void method594() {
        int var1 = this.field614;
        class41 var2 = this.field621.method819();
        if (var2 == null) {
            this.field614 = -1;
            this.field615 = 0;
            this.field607 = 0;
            this.field617 = 0;
            this.field618 = null;
        } else {
            this.field614 = var2.field964;
            this.field615 = var2.field958 * 128;
            this.field607 = var2.field966;
            this.field617 = var2.field967;
            this.field618 = var2.field968;
        }
        if (this.field614 != var1 && this.field609 != null) {
            Statics.field256.method1138(this.field609);
            this.field609 = null;
        }
    }
}
