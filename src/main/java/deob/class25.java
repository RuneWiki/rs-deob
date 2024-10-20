package deob;

@ObfuscatedName("c")
public final class class25 extends class212 {

    @ObfuscatedName("c.a")
    public static class203 field630 = new class203();

    @ObfuscatedName("c.d")
    public int field611;

    @ObfuscatedName("c.v")
    public int field621;

    @ObfuscatedName("c.r")
    public class43 field624;

    @ObfuscatedName("c.z")
    public int field614;

    @ObfuscatedName("c.t")
    public int field613;

    @ObfuscatedName("c.n")
    public int field615;

    @ObfuscatedName("c.i")
    public int field626;

    @ObfuscatedName("c.g")
    public int field617;

    @ObfuscatedName("c.m")
    public class68 field618;

    @ObfuscatedName("c.k")
    public int field619;

    @ObfuscatedName("c.x")
    public int field612;

    @ObfuscatedName("c.u")
    public int[] field623;

    @ObfuscatedName("c.j")
    public int field622;

    @ObfuscatedName("c.q")
    public class68 field620;

    @ObfuscatedName("c.a(I)V")
    public void method591() {
        int var1 = this.field617;
        class43 var2 = this.field624.method851();
        if (var2 == null) {
            this.field617 = -1;
            this.field626 = 0;
            this.field619 = 0;
            this.field612 = 0;
            this.field623 = null;
        } else {
            this.field617 = var2.field961;
            this.field626 = var2.field969 * 128;
            this.field619 = var2.field993;
            this.field612 = var2.field948;
            this.field623 = var2.field977;
        }
        if (this.field617 != var1 && this.field618 != null) {
            Statics.field1760.method1166(this.field618);
            this.field618 = null;
        }
    }
}
