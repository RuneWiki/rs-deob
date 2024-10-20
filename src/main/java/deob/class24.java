package deob;

@ObfuscatedName("o")
public final class class24 extends class209 {

    @ObfuscatedName("o.j")
    public static class200 field594 = new class200();

    @ObfuscatedName("o.h")
    public int field586;

    @ObfuscatedName("o.m")
    public int field585;

    @ObfuscatedName("o.z")
    public int field589;

    @ObfuscatedName("o.x")
    public int field588;

    @ObfuscatedName("o.e")
    public int field596;

    @ObfuscatedName("o.i")
    public int field591;

    @ObfuscatedName("o.c")
    public int field603;

    @ObfuscatedName("o.n")
    public class65 field593;

    @ObfuscatedName("o.l")
    public int field597;

    @ObfuscatedName("o.u")
    public int field587;

    @ObfuscatedName("o.r")
    public class41 field590;

    @ObfuscatedName("o.a")
    public int[] field600;

    @ObfuscatedName("o.d")
    public int field592;

    @ObfuscatedName("o.p")
    public class65 field598;

    @ObfuscatedName("bu.j(I)V")
    public static void method1501() {
        for (class24 var0 = (class24) field594.method3540(); var0 != null; var0 = (class24) field594.method3533()) {
            if (var0.field593 != null) {
                Statics.field2067.method1120(var0.field593);
                var0.field593 = null;
            }
            if (var0.field598 != null) {
                Statics.field2067.method1120(var0.field598);
                var0.field598 = null;
            }
        }
        field594.method3545();
    }

    @ObfuscatedName("da.h(I)V")
    public static void method2301() {
        for (class24 var0 = (class24) field594.method3540(); var0 != null; var0 = (class24) field594.method3533()) {
            if (var0.field590 != null) {
                var0.method585();
            }
        }
    }

    @ObfuscatedName("o.m(I)V")
    public void method585() {
        int var1 = this.field603;
        class41 var2 = this.field590.method791();
        if (var2 == null) {
            this.field603 = -1;
            this.field591 = 0;
            this.field597 = 0;
            this.field587 = 0;
            this.field600 = null;
        } else {
            this.field603 = var2.field952;
            this.field591 = var2.field951 * 128;
            this.field597 = var2.field915;
            this.field587 = var2.field953;
            this.field600 = var2.field954;
        }
        if (this.field603 != var1 && this.field593 != null) {
            Statics.field2067.method1120(this.field593);
            this.field593 = null;
        }
    }
}
