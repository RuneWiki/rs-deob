package deob;

@ObfuscatedName("af")
public final class class32 extends class128 {

    @ObfuscatedName("af.b")
    public static class129 field712 = new class129();

    @ObfuscatedName("af.e")
    public int field700;

    @ObfuscatedName("af.c")
    public int field708;

    @ObfuscatedName("af.l")
    public int field703;

    @ObfuscatedName("af.y")
    public int field704;

    @ObfuscatedName("af.j")
    public int field717;

    @ObfuscatedName("af.g")
    public int field706;

    @ObfuscatedName("af.s")
    public int field709;

    @ObfuscatedName("af.r")
    public class198 field714;

    @ObfuscatedName("af.t")
    public int field707;

    @ObfuscatedName("af.k")
    public class67 field701;

    @ObfuscatedName("af.f")
    public int field710;

    @ObfuscatedName("af.a")
    public int[] field705;

    @ObfuscatedName("af.v")
    public int field711;

    @ObfuscatedName("af.d")
    public class67 field702;

    @ObfuscatedName("x.b(B)V")
    public static void method208() {
        for (class32 var0 = (class32) field712.method2315(); var0 != null; var0 = (class32) field712.method2332()) {
            if (var0.field701 != null) {
                Statics.field1431.method921(var0.field701);
                var0.field701 = null;
            }
            if (var0.field702 != null) {
                Statics.field1431.method921(var0.field702);
                var0.field702 = null;
            }
        }
        field712.method2307();
    }

    @ObfuscatedName("af.e(B)V")
    public void method665() {
        int var1 = this.field707;
        class198 var2 = this.field714.method3445();
        if (var2 == null) {
            this.field707 = -1;
            this.field706 = 0;
            this.field709 = 0;
            this.field710 = 0;
            this.field705 = null;
        } else {
            this.field707 = var2.field2909;
            this.field706 = var2.field2947 * 128;
            this.field709 = var2.field2917;
            this.field710 = var2.field2949;
            this.field705 = var2.field2944;
        }
        if (this.field707 != var1 && this.field701 != null) {
            Statics.field1431.method921(this.field701);
            this.field701 = null;
        }
    }
}
