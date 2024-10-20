package deob;

@ObfuscatedName("ax")
public final class class32 extends class128 {

    @ObfuscatedName("ax.s")
    public int field713;

    @ObfuscatedName("ax.c")
    public static class129 field704 = new class129();

    @ObfuscatedName("ax.f")
    public int field705;

    @ObfuscatedName("ax.h")
    public int field706;

    @ObfuscatedName("ax.a")
    public int field716;

    @ObfuscatedName("ax.g")
    public int field707;

    @ObfuscatedName("ax.k")
    public int field709;

    @ObfuscatedName("ax.u")
    public int field711;

    @ObfuscatedName("ax.b")
    public int field708;

    @ObfuscatedName("ax.x")
    public class67 field712;

    @ObfuscatedName("ax.r")
    public class198 field718;

    @ObfuscatedName("ax.n")
    public int field714;

    @ObfuscatedName("ax.m")
    public int[] field710;

    @ObfuscatedName("ax.j")
    public int field715;

    @ObfuscatedName("ax.w")
    public class67 field717;

    @ObfuscatedName("x.s(I)V")
    public static void method97() {
        for (class32 var0 = (class32) field704.method2187(); var0 != null; var0 = (class32) field704.method2203()) {
            if (var0.field712 != null) {
                Statics.field759.method849(var0.field712);
                var0.field712 = null;
            }
            if (var0.field717 != null) {
                Statics.field759.method849(var0.field717);
                var0.field717 = null;
            }
        }
        field704.method2181();
    }

    @ObfuscatedName("ax.c(I)V")
    public void method651() {
        int var1 = this.field708;
        class198 var2 = this.field718.method3288();
        if (var2 == null) {
            this.field708 = -1;
            this.field711 = 0;
            this.field713 = 0;
            this.field714 = 0;
            this.field710 = null;
        } else {
            this.field708 = var2.field2944;
            this.field711 = var2.field2945 * 128;
            this.field713 = var2.field2946;
            this.field714 = var2.field2947;
            this.field710 = var2.field2938;
        }
        if (this.field708 != var1 && this.field712 != null) {
            Statics.field759.method849(this.field712);
            this.field712 = null;
        }
    }
}
