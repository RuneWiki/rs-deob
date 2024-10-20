package deob;

@ObfuscatedName("g")
public final class class21 extends class191 {

    @ObfuscatedName("g.a")
    public static class182 field559 = new class182();

    @ObfuscatedName("g.v")
    public int field565;

    @ObfuscatedName("g.i")
    public int field555;

    @ObfuscatedName("g.b")
    public int field554;

    @ObfuscatedName("g.l")
    public int field556;

    @ObfuscatedName("g.m")
    public int field558;

    @ObfuscatedName("g.w")
    public int field557;

    @ObfuscatedName("g.e")
    public int field560;

    @ObfuscatedName("g.n")
    public class59 field553;

    @ObfuscatedName("g.s")
    public int field564;

    @ObfuscatedName("g.k")
    public int field563;

    @ObfuscatedName("g.f")
    public int[] field561;

    @ObfuscatedName("g.d")
    public int field566;

    @ObfuscatedName("g.x")
    public class59 field562;

    @ObfuscatedName("g.o")
    public class37 field567;

    @ObfuscatedName("db.a(I)V")
    public static void method2506() {
        for (class21 var0 = (class21) field559.method3251(); var0 != null; var0 = (class21) field559.method3261()) {
            if (var0.field553 != null) {
                Statics.field376.method969(var0.field553);
                var0.field553 = null;
            }
            if (var0.field562 != null) {
                Statics.field376.method969(var0.field562);
                var0.field562 = null;
            }
        }
        field559.method3284();
    }

    @ObfuscatedName("dq.v(I)V")
    public static void method2359() {
        for (class21 var0 = (class21) field559.method3251(); var0 != null; var0 = (class21) field559.method3261()) {
            if (var0.field567 != null) {
                var0.method512();
            }
        }
    }

    @ObfuscatedName("g.i(B)V")
    public void method512() {
        int var1 = this.field560;
        class37 var2 = this.field567.method675();
        if (var2 == null) {
            this.field560 = -1;
            this.field557 = 0;
            this.field564 = 0;
            this.field563 = 0;
            this.field561 = null;
        } else {
            this.field560 = var2.field887;
            this.field557 = var2.field872 * 128;
            this.field564 = var2.field889;
            this.field563 = var2.field890;
            this.field561 = var2.field885;
        }
        if (this.field560 != var1 && this.field553 != null) {
            Statics.field376.method969(this.field553);
            this.field553 = null;
        }
    }
}
