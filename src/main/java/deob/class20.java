package deob;

@ObfuscatedName("h")
public final class class20 extends class186 {

    @ObfuscatedName("h.k")
    public static class177 field546 = new class177();

    @ObfuscatedName("h.r")
    public class36 field552;

    @ObfuscatedName("h.y")
    public int field539;

    @ObfuscatedName("h.w")
    public int field550;

    @ObfuscatedName("h.m")
    public int field548;

    @ObfuscatedName("h.j")
    public int field542;

    @ObfuscatedName("h.g")
    public int field543;

    @ObfuscatedName("h.p")
    public int field544;

    @ObfuscatedName("h.o")
    public int field545;

    @ObfuscatedName("h.b")
    public class58 field541;

    @ObfuscatedName("h.x")
    public int field547;

    @ObfuscatedName("h.n")
    public int field556;

    @ObfuscatedName("h.d")
    public int[] field549;

    @ObfuscatedName("h.s")
    public int field538;

    @ObfuscatedName("h.v")
    public class58 field551;

    @ObfuscatedName("ci.k(S)V")
    public static void method1869() {
        for (class20 var0 = (class20) field546.method3195(); var0 != null; var0 = (class20) field546.method3212()) {
            if (var0.field541 != null) {
                Statics.field2370.method977(var0.field541);
                var0.field541 = null;
            }
            if (var0.field551 != null) {
                Statics.field2370.method977(var0.field551);
                var0.field551 = null;
            }
        }
        field546.method3189();
    }

    @ObfuscatedName("h.r(I)V")
    public void method459() {
        int var1 = this.field545;
        class36 var2 = this.field552.method636();
        if (var2 == null) {
            this.field545 = -1;
            this.field544 = 0;
            this.field547 = 0;
            this.field556 = 0;
            this.field549 = null;
        } else {
            this.field545 = var2.field882;
            this.field544 = var2.field874 * 128;
            this.field547 = var2.field884;
            this.field556 = var2.field885;
            this.field549 = var2.field886;
        }
        if (this.field545 != var1 && this.field541 != null) {
            Statics.field2370.method977(this.field541);
            this.field541 = null;
        }
    }
}
