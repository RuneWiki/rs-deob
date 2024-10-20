package deob;

@ObfuscatedName("j")
public final class class20 extends class186 {

    @ObfuscatedName("j.e")
    public static class177 field552 = new class177();

    @ObfuscatedName("j.o")
    public int field563;

    @ObfuscatedName("j.y")
    public int field553;

    @ObfuscatedName("j.b")
    public int field554;

    @ObfuscatedName("j.w")
    public int field555;

    @ObfuscatedName("j.r")
    public class36 field565;

    @ObfuscatedName("j.l")
    public int field568;

    @ObfuscatedName("j.s")
    public int field560;

    @ObfuscatedName("j.f")
    public int field556;

    @ObfuscatedName("j.x")
    public int field558;

    @ObfuscatedName("j.h")
    public class58 field559;

    @ObfuscatedName("j.a")
    public int field561;

    @ObfuscatedName("j.u")
    public int[] field562;

    @ObfuscatedName("j.v")
    public int field557;

    @ObfuscatedName("j.i")
    public class58 field564;

    @ObfuscatedName("aw.e(I)V")
    public static void method836() {
        for (class20 var0 = (class20) field552.method3122(); var0 != null; var0 = (class20) field552.method3124()) {
            if (var0.field559 != null) {
                Statics.field11.method924(var0.field559);
                var0.field559 = null;
            }
            if (var0.field564 != null) {
                Statics.field11.method924(var0.field564);
                var0.field564 = null;
            }
        }
        field552.method3134();
    }

    @ObfuscatedName("j.o(I)V")
    public void method480() {
        int var1 = this.field558;
        class36 var2 = this.field565.method637();
        if (var2 == null) {
            this.field558 = -1;
            this.field556 = 0;
            this.field560 = 0;
            this.field561 = 0;
            this.field562 = null;
        } else {
            this.field558 = var2.field860;
            this.field556 = var2.field846 * 128;
            this.field560 = var2.field891;
            this.field561 = var2.field872;
            this.field562 = var2.field863;
        }
        if (this.field558 != var1 && this.field559 != null) {
            Statics.field11.method924(this.field559);
            this.field559 = null;
        }
    }
}
