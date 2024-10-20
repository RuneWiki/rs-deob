package deob;

@ObfuscatedName("e")
public final class class25 extends class212 {

    @ObfuscatedName("e.s")
    public int field593;

    @ObfuscatedName("e.z")
    public int field602;

    @ObfuscatedName("e.t")
    public static class203 field591 = new class203();

    @ObfuscatedName("e.y")
    public int field592;

    @ObfuscatedName("e.p")
    public int field595;

    @ObfuscatedName("e.g")
    public int field594;

    @ObfuscatedName("e.m")
    public int field596;

    @ObfuscatedName("e.f")
    public int field597;

    @ObfuscatedName("e.k")
    public int field598;

    @ObfuscatedName("e.h")
    public class68 field599;

    @ObfuscatedName("e.r")
    public class43 field605;

    @ObfuscatedName("e.w")
    public int field601;

    @ObfuscatedName("e.u")
    public int[] field606;

    @ObfuscatedName("e.n")
    public int field603;

    @ObfuscatedName("e.d")
    public class68 field600;

    @ObfuscatedName("v.s(B)V")
    public static void method565() {
        for (class25 var0 = (class25) field591.method3588(); var0 != null; var0 = (class25) field591.method3590()) {
            if (var0.field599 != null) {
                Statics.field1390.method1129(var0.field599);
                var0.field599 = null;
            }
            if (var0.field600 != null) {
                Statics.field1390.method1129(var0.field600);
                var0.field600 = null;
            }
        }
        field591.method3582();
    }

    @ObfuscatedName("e.t(I)V")
    public void method581() {
        int var1 = this.field598;
        class43 var2 = this.field605.method807();
        if (var2 == null) {
            this.field598 = -1;
            this.field597 = 0;
            this.field593 = 0;
            this.field601 = 0;
            this.field606 = null;
        } else {
            this.field598 = var2.field953;
            this.field597 = var2.field954 * 128;
            this.field593 = var2.field955;
            this.field601 = var2.field956;
            this.field606 = var2.field957;
        }
        if (this.field598 != var1 && this.field599 != null) {
            Statics.field1390.method1129(this.field599);
            this.field599 = null;
        }
    }
}
