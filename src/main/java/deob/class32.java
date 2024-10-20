package deob;

@ObfuscatedName("ax")
public final class class32 extends class128 {

    @ObfuscatedName("ax.p")
    public static class129 field712 = new class129();

    @ObfuscatedName("ax.g")
    public int field708;

    @ObfuscatedName("ax.x")
    public int field698;

    @ObfuscatedName("ax.q")
    public int field697;

    @ObfuscatedName("ax.d")
    public int field699;

    @ObfuscatedName("ax.k")
    public int field700;

    @ObfuscatedName("ax.j")
    public int field710;

    @ObfuscatedName("ax.s")
    public int field704;

    @ObfuscatedName("ax.o")
    public int field705;

    @ObfuscatedName("ax.a")
    public class67 field703;

    @ObfuscatedName("ax.c")
    public int field696;

    @ObfuscatedName("ax.m")
    public int[] field701;

    @ObfuscatedName("ax.h")
    public int field702;

    @ObfuscatedName("ax.r")
    public class198 field709;

    @ObfuscatedName("ax.u")
    public class67 field707;

    @ObfuscatedName("gd.p(I)V")
    public static void method3454() {
        for (class32 var0 = (class32) field712.method2237(); var0 != null; var0 = (class32) field712.method2251()) {
            if (var0.field703 != null) {
                Statics.field754.method871(var0.field703);
                var0.field703 = null;
            }
            if (var0.field707 != null) {
                Statics.field754.method871(var0.field707);
                var0.field707 = null;
            }
        }
        field712.method2230();
    }

    @ObfuscatedName("ax.x(I)V")
    public void method661() {
        int var1 = this.field705;
        class198 var2 = this.field709.method3357();
        if (var2 == null) {
            this.field705 = -1;
            this.field710 = 0;
            this.field704 = 0;
            this.field696 = 0;
            this.field701 = null;
        } else {
            this.field705 = var2.field2934;
            this.field710 = var2.field2911 * 128;
            this.field704 = var2.field2889;
            this.field696 = var2.field2912;
            this.field701 = var2.field2938;
        }
        if (this.field705 != var1 && this.field703 != null) {
            Statics.field754.method871(this.field703);
            this.field703 = null;
        }
    }
}
