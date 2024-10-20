package deob;

@ObfuscatedName("z")
public final class class22 extends class199 {

    @ObfuscatedName("z.t")
    public static class190 field560 = new class190();

    @ObfuscatedName("z.b")
    public int field563;

    @ObfuscatedName("z.p")
    public int field573;

    @ObfuscatedName("z.e")
    public int field559;

    @ObfuscatedName("z.i")
    public int field557;

    @ObfuscatedName("z.o")
    public int field570;

    @ObfuscatedName("z.f")
    public int field562;

    @ObfuscatedName("z.d")
    public int field561;

    @ObfuscatedName("z.j")
    public class60 field564;

    @ObfuscatedName("z.x")
    public int field558;

    @ObfuscatedName("z.v")
    public int field566;

    @ObfuscatedName("z.a")
    public int[] field567;

    @ObfuscatedName("z.l")
    public int field568;

    @ObfuscatedName("z.h")
    public class60 field569;

    @ObfuscatedName("z.c")
    public class38 field565;

    @ObfuscatedName("bo.t(I)V")
    public static void method1414() {
        for (class22 var0 = (class22) field560.method3415(); var0 != null; var0 = (class22) field560.method3419()) {
            if (var0.field564 != null) {
                Statics.field992.method1034(var0.field564);
                var0.field564 = null;
            }
            if (var0.field569 != null) {
                Statics.field992.method1034(var0.field569);
                var0.field569 = null;
            }
        }
        field560.method3420();
    }

    @ObfuscatedName("z.b(I)V")
    public void method547() {
        int var1 = this.field561;
        class38 var2 = this.field565.method724();
        if (var2 == null) {
            this.field561 = -1;
            this.field562 = 0;
            this.field558 = 0;
            this.field566 = 0;
            this.field567 = null;
        } else {
            this.field561 = var2.field889;
            this.field562 = var2.field885 * 128;
            this.field558 = var2.field872;
            this.field566 = var2.field892;
            this.field567 = var2.field893;
        }
        if (this.field561 != var1 && this.field564 != null) {
            Statics.field992.method1034(this.field564);
            this.field564 = null;
        }
    }
}
