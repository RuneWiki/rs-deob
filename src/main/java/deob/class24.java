package deob;

@ObfuscatedName("y")
public final class class24 extends class208 {

    @ObfuscatedName("y.z")
    public int field596;

    @ObfuscatedName("y.q")
    public static class199 field602 = new class199();

    @ObfuscatedName("y.k")
    public int field593;

    @ObfuscatedName("y.f")
    public int field594;

    @ObfuscatedName("y.d")
    public int field595;

    @ObfuscatedName("y.l")
    public int field597;

    @ObfuscatedName("y.r")
    public class41 field592;

    @ObfuscatedName("y.g")
    public int field607;

    @ObfuscatedName("y.h")
    public int field601;

    @ObfuscatedName("y.n")
    public class65 field600;

    @ObfuscatedName("y.j")
    public int field598;

    @ObfuscatedName("y.a")
    public int field604;

    @ObfuscatedName("y.b")
    public int[] field603;

    @ObfuscatedName("y.c")
    public int field599;

    @ObfuscatedName("y.v")
    public class65 field605;

    @ObfuscatedName("y.z(S)V")
    public void method557() {
        int var1 = this.field601;
        class41 var2 = this.field592.method770();
        if (var2 == null) {
            this.field601 = -1;
            this.field607 = 0;
            this.field598 = 0;
            this.field604 = 0;
            this.field603 = null;
        } else {
            this.field601 = var2.field957;
            this.field607 = var2.field958 * 128;
            this.field598 = var2.field959;
            this.field604 = var2.field940;
            this.field603 = var2.field961;
        }
        if (this.field601 != var1 && this.field600 != null) {
            Statics.field562.method1119(this.field600);
            this.field600 = null;
        }
    }
}
