package deob;

@ObfuscatedName("m")
public final class class21 extends class189 {

    @ObfuscatedName("m.f")
    public static class180 field560 = new class180();

    @ObfuscatedName("m.k")
    public int field549;

    @ObfuscatedName("m.y")
    public int field550;

    @ObfuscatedName("m.e")
    public int field551;

    @ObfuscatedName("m.r")
    public class37 field562;

    @ObfuscatedName("m.a")
    public int field556;

    @ObfuscatedName("m.n")
    public int field548;

    @ObfuscatedName("m.x")
    public int field554;

    @ObfuscatedName("m.g")
    public int field553;

    @ObfuscatedName("m.o")
    public class59 field555;

    @ObfuscatedName("m.p")
    public int field557;

    @ObfuscatedName("m.v")
    public int field558;

    @ObfuscatedName("m.w")
    public int[] field559;

    @ObfuscatedName("m.t")
    public int field561;

    @ObfuscatedName("m.s")
    public class59 field552;

    @ObfuscatedName("cz.f(B)V")
    public static void method1915() {
        for (class21 var0 = (class21) field560.method3285(); var0 != null; var0 = (class21) field560.method3286()) {
            if (var0.field555 != null) {
                Statics.field491.method1002(var0.field555);
                var0.field555 = null;
            }
            if (var0.field552 != null) {
                Statics.field491.method1002(var0.field552);
                var0.field552 = null;
            }
        }
        field560.method3292();
    }

    @ObfuscatedName("en.k(I)V")
    public static void method2737() {
        for (class21 var0 = (class21) field560.method3285(); var0 != null; var0 = (class21) field560.method3286()) {
            if (var0.field562 != null) {
                var0.method511();
            }
        }
    }

    @ObfuscatedName("m.y(I)V")
    public void method511() {
        int var1 = this.field553;
        class37 var2 = this.field562.method689();
        if (var2 == null) {
            this.field553 = -1;
            this.field554 = 0;
            this.field557 = 0;
            this.field558 = 0;
            this.field559 = null;
        } else {
            this.field553 = var2.field892;
            this.field554 = var2.field859 * 128;
            this.field557 = var2.field894;
            this.field558 = var2.field895;
            this.field559 = var2.field869;
        }
        if (this.field553 != var1 && this.field555 != null) {
            Statics.field491.method1002(this.field555);
            this.field555 = null;
        }
    }
}
