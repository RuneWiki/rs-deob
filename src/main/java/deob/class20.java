package deob;

@ObfuscatedName("a")
public final class class20 extends class184 {

    @ObfuscatedName("a.b")
    public static class177 field541 = new class177();

    @ObfuscatedName("a.u")
    public int field549;

    @ObfuscatedName("a.x")
    public int field544;

    @ObfuscatedName("a.j")
    public int field543;

    @ObfuscatedName("a.o")
    public int field545;

    @ObfuscatedName("a.n")
    public int field546;

    @ObfuscatedName("a.y")
    public int field547;

    @ObfuscatedName("a.f")
    public int field548;

    @ObfuscatedName("a.p")
    public class58 field542;

    @ObfuscatedName("a.l")
    public int field555;

    @ObfuscatedName("a.k")
    public int field554;

    @ObfuscatedName("a.q")
    public int[] field552;

    @ObfuscatedName("a.e")
    public int field553;

    @ObfuscatedName("a.t")
    public class58 field550;

    @ObfuscatedName("a.g")
    public class36 field551;

    @ObfuscatedName("u.b(I)V")
    public static void method7() {
        for (class20 var0 = (class20) field541.method3185(); var0 != null; var0 = (class20) field541.method3187()) {
            if (var0.field542 != null) {
                Statics.field632.method937(var0.field542);
                var0.field542 = null;
            }
            if (var0.field550 != null) {
                Statics.field632.method937(var0.field550);
                var0.field550 = null;
            }
        }
        field541.method3179();
    }

    @ObfuscatedName("a.u(I)V")
    public void method491() {
        int var1 = this.field548;
        class36 var2 = this.field551.method663();
        if (var2 == null) {
            this.field548 = -1;
            this.field547 = 0;
            this.field555 = 0;
            this.field554 = 0;
            this.field552 = null;
        } else {
            this.field548 = var2.field877;
            this.field547 = var2.field878 * 128;
            this.field555 = var2.field869;
            this.field554 = var2.field880;
            this.field552 = var2.field881;
        }
        if (this.field548 != var1 && this.field542 != null) {
            Statics.field632.method937(this.field542);
            this.field542 = null;
        }
    }
}
