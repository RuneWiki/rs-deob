package deob;

@ObfuscatedName("n")
public final class class24 extends class209 {

    @ObfuscatedName("n.w")
    public static class200 field619 = new class200();

    @ObfuscatedName("n.x")
    public int field613;

    @ObfuscatedName("n.t")
    public int field611;

    @ObfuscatedName("n.p")
    public int field612;

    @ObfuscatedName("n.e")
    public int field614;

    @ObfuscatedName("n.y")
    public int field615;

    @ObfuscatedName("n.m")
    public int field624;

    @ObfuscatedName("n.c")
    public int field617;

    @ObfuscatedName("n.v")
    public class65 field618;

    @ObfuscatedName("n.l")
    public int field610;

    @ObfuscatedName("n.z")
    public int field620;

    @ObfuscatedName("n.s")
    public int[] field622;

    @ObfuscatedName("n.j")
    public int field616;

    @ObfuscatedName("n.q")
    public class65 field621;

    @ObfuscatedName("n.a")
    public class41 field627;

    @ObfuscatedName("z.w(I)V")
    public static void method125() {
        for (class24 var0 = (class24) field619.method3585(); var0 != null; var0 = (class24) field619.method3590()) {
            if (var0.field618 != null) {
                Statics.field1354.method1134(var0.field618);
                var0.field618 = null;
            }
            if (var0.field621 != null) {
                Statics.field1354.method1134(var0.field621);
                var0.field621 = null;
            }
        }
        field619.method3582();
    }

    @ObfuscatedName("n.x(I)V")
    public void method598() {
        int var1 = this.field617;
        class41 var2 = this.field627.method823();
        if (var2 == null) {
            this.field617 = -1;
            this.field624 = 0;
            this.field610 = 0;
            this.field620 = 0;
            this.field622 = null;
        } else {
            this.field617 = var2.field964;
            this.field624 = var2.field972 * 128;
            this.field610 = var2.field973;
            this.field620 = var2.field961;
            this.field622 = var2.field975;
        }
        if (this.field617 != var1 && this.field618 != null) {
            Statics.field1354.method1134(this.field618);
            this.field618 = null;
        }
    }
}
