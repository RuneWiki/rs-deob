package deob;

@ObfuscatedName("d")
public final class class21 extends class189 {

    @ObfuscatedName("d.c")
    public static class180 field549 = new class180();

    @ObfuscatedName("d.j")
    public int field550;

    @ObfuscatedName("d.y")
    public int field567;

    @ObfuscatedName("d.r")
    public class37 field561;

    @ObfuscatedName("d.f")
    public int field552;

    @ObfuscatedName("d.l")
    public int field553;

    @ObfuscatedName("d.b")
    public int field554;

    @ObfuscatedName("d.k")
    public int field555;

    @ObfuscatedName("d.g")
    public int field556;

    @ObfuscatedName("d.v")
    public class59 field563;

    @ObfuscatedName("d.i")
    public int field558;

    @ObfuscatedName("d.x")
    public int field559;

    @ObfuscatedName("d.h")
    public int[] field560;

    @ObfuscatedName("d.w")
    public int field564;

    @ObfuscatedName("d.s")
    public class59 field562;

    @ObfuscatedName("d.c(I)V")
    public void method485() {
        int var1 = this.field556;
        class37 var2 = this.field561.method673();
        if (var2 == null) {
            this.field556 = -1;
            this.field555 = 0;
            this.field558 = 0;
            this.field559 = 0;
            this.field560 = null;
        } else {
            this.field556 = var2.field884;
            this.field555 = var2.field859 * 128;
            this.field558 = var2.field856;
            this.field559 = var2.field845;
            this.field560 = var2.field888;
        }
        if (this.field556 != var1 && this.field563 != null) {
            Statics.field1750.method996(this.field563);
            this.field563 = null;
        }
    }
}
