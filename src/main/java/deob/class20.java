package deob;

@ObfuscatedName("n")
public final class class20 extends class187 {

    @ObfuscatedName("n.g")
    public static class178 field551 = new class178();

    @ObfuscatedName("n.i")
    public int field547;

    @ObfuscatedName("n.k")
    public int field543;

    @ObfuscatedName("n.e")
    public int field542;

    @ObfuscatedName("n.w")
    public int field545;

    @ObfuscatedName("n.m")
    public int field544;

    @ObfuscatedName("n.u")
    public int field556;

    @ObfuscatedName("n.j")
    public int field548;

    @ObfuscatedName("n.o")
    public class58 field552;

    @ObfuscatedName("n.h")
    public int field550;

    @ObfuscatedName("n.b")
    public int field549;

    @ObfuscatedName("n.r")
    public class36 field555;

    @ObfuscatedName("n.l")
    public int[] field541;

    @ObfuscatedName("n.x")
    public int field553;

    @ObfuscatedName("n.q")
    public class58 field554;

    @ObfuscatedName("cn.g(B)V")
    public static void method1739() {
        for (class20 var0 = (class20) field551.method3200(); var0 != null; var0 = (class20) field551.method3209()) {
            if (var0.field552 != null) {
                Statics.field708.method941(var0.field552);
                var0.field552 = null;
            }
            if (var0.field554 != null) {
                Statics.field708.method941(var0.field554);
                var0.field554 = null;
            }
        }
        field551.method3201();
    }

    @ObfuscatedName("n.i(I)V")
    public void method473() {
        int var1 = this.field548;
        class36 var2 = this.field555.method633();
        if (var2 == null) {
            this.field548 = -1;
            this.field556 = 0;
            this.field550 = 0;
            this.field549 = 0;
            this.field541 = null;
        } else {
            this.field548 = var2.field890;
            this.field556 = var2.field891 * 128;
            this.field550 = var2.field892;
            this.field549 = var2.field881;
            this.field541 = var2.field861;
        }
        if (this.field548 != var1 && this.field552 != null) {
            Statics.field708.method941(this.field552);
            this.field552 = null;
        }
    }
}
