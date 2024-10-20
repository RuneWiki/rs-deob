package deob;

@ObfuscatedName("r")
public final class class20 extends class186 {

    @ObfuscatedName("r.t")
    public static class177 field545 = new class177();

    @ObfuscatedName("r.s")
    public int field546;

    @ObfuscatedName("r.f")
    public int field530;

    @ObfuscatedName("r.e")
    public int field532;

    @ObfuscatedName("r.d")
    public int field533;

    @ObfuscatedName("r.n")
    public int field534;

    @ObfuscatedName("r.v")
    public int field535;

    @ObfuscatedName("r.z")
    public int field537;

    @ObfuscatedName("r.j")
    public int field539;

    @ObfuscatedName("r.u")
    public class58 field538;

    @ObfuscatedName("r.g")
    public int field540;

    @ObfuscatedName("r.a")
    public int[] field543;

    @ObfuscatedName("r.c")
    public int field542;

    @ObfuscatedName("r.w")
    public class58 field531;

    @ObfuscatedName("r.l")
    public class36 field544;

    @ObfuscatedName("s.t(I)V")
    public static void method10() {
        for (class20 var0 = (class20) field545.method3239(); var0 != null; var0 = (class20) field545.method3248()) {
            if (var0.field538 != null) {
                Statics.field1445.method958(var0.field538);
                var0.field538 = null;
            }
            if (var0.field531 != null) {
                Statics.field1445.method958(var0.field531);
                var0.field531 = null;
            }
        }
        field545.method3241();
    }

    @ObfuscatedName("r.s(I)V")
    public void method466() {
        int var1 = this.field539;
        class36 var2 = this.field544.method649();
        if (var2 == null) {
            this.field539 = -1;
            this.field537 = 0;
            this.field546 = 0;
            this.field540 = 0;
            this.field543 = null;
        } else {
            this.field539 = var2.field868;
            this.field537 = var2.field848 * 128;
            this.field546 = var2.field870;
            this.field540 = var2.field847;
            this.field543 = var2.field872;
        }
        if (this.field539 != var1 && this.field538 != null) {
            Statics.field1445.method958(this.field538);
            this.field538 = null;
        }
    }
}
