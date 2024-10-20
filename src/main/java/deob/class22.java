package deob;

@ObfuscatedName("z")
public final class class22 extends class199 {

    @ObfuscatedName("z.o")
    public static class190 field583 = new class190();

    @ObfuscatedName("z.l")
    public int field578;

    @ObfuscatedName("z.g")
    public int field582;

    @ObfuscatedName("z.u")
    public int field580;

    @ObfuscatedName("z.q")
    public int field581;

    @ObfuscatedName("z.r")
    public class38 field591;

    @ObfuscatedName("z.v")
    public int field590;

    @ObfuscatedName("z.y")
    public int field579;

    @ObfuscatedName("z.k")
    public int field584;

    @ObfuscatedName("z.c")
    public class60 field585;

    @ObfuscatedName("z.j")
    public int field586;

    @ObfuscatedName("z.m")
    public int field587;

    @ObfuscatedName("z.a")
    public int[] field588;

    @ObfuscatedName("z.f")
    public int field592;

    @ObfuscatedName("z.i")
    public class60 field596;

    @ObfuscatedName("t.o(I)V")
    public static void method526() {
        for (class22 var0 = (class22) field583.method3499(); var0 != null; var0 = (class22) field583.method3482()) {
            if (var0.field585 != null) {
                Statics.field2120.method1032(var0.field585);
                var0.field585 = null;
            }
            if (var0.field596 != null) {
                Statics.field2120.method1032(var0.field596);
                var0.field596 = null;
            }
        }
        field583.method3483();
    }

    @ObfuscatedName("z.l(I)V")
    public void method551() {
        int var1 = this.field584;
        class38 var2 = this.field591.method704();
        if (var2 == null) {
            this.field584 = -1;
            this.field579 = 0;
            this.field586 = 0;
            this.field587 = 0;
            this.field588 = null;
        } else {
            this.field584 = var2.field903;
            this.field579 = var2.field904 * 128;
            this.field586 = var2.field858;
            this.field587 = var2.field860;
            this.field588 = var2.field907;
        }
        if (this.field584 != var1 && this.field585 != null) {
            Statics.field2120.method1032(this.field585);
            this.field585 = null;
        }
    }
}
