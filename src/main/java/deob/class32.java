package deob;

@ObfuscatedName("ac")
public final class class32 extends class128 {

    @ObfuscatedName("ac.b")
    public static class129 field701 = new class129();

    @ObfuscatedName("ac.l")
    public int field698;

    @ObfuscatedName("ac.i")
    public int field711;

    @ObfuscatedName("ac.t")
    public int field700;

    @ObfuscatedName("ac.k")
    public int field705;

    @ObfuscatedName("ac.h")
    public int field702;

    @ObfuscatedName("ac.n")
    public int field703;

    @ObfuscatedName("ac.f")
    public int field704;

    @ObfuscatedName("ac.a")
    public class67 field697;

    @ObfuscatedName("ac.r")
    public class198 field715;

    @ObfuscatedName("ac.x")
    public int field706;

    @ObfuscatedName("ac.z")
    public int field707;

    @ObfuscatedName("ac.p")
    public int[] field699;

    @ObfuscatedName("ac.s")
    public int field709;

    @ObfuscatedName("ac.o")
    public class67 field710;

    @ObfuscatedName("dq.b(I)V")
    public static void method1967() {
        for (class32 var0 = (class32) field701.method2324(); var0 != null; var0 = (class32) field701.method2331()) {
            if (var0.field697 != null) {
                Statics.field169.method965(var0.field697);
                var0.field697 = null;
            }
            if (var0.field710 != null) {
                Statics.field169.method965(var0.field710);
                var0.field710 = null;
            }
        }
        field701.method2319();
    }

    @ObfuscatedName("ac.l(I)V")
    public void method700() {
        int var1 = this.field704;
        class198 var2 = this.field715.method3484();
        if (var2 == null) {
            this.field704 = -1;
            this.field703 = 0;
            this.field706 = 0;
            this.field707 = 0;
            this.field699 = null;
        } else {
            this.field704 = var2.field2942;
            this.field703 = var2.field2940 * 128;
            this.field706 = var2.field2948;
            this.field707 = var2.field2945;
            this.field699 = var2.field2934;
        }
        if (this.field704 != var1 && this.field697 != null) {
            Statics.field169.method965(this.field697);
            this.field697 = null;
        }
    }

    @ObfuscatedName("n.i(IIILgv;II)V")
    public static void method98(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field698 = arg0;
        var5.field711 = arg1 * 128;
        var5.field700 = arg2 * 128;
        int var6 = arg3.field2913;
        int var7 = arg3.field2914;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2914;
            var7 = arg3.field2913;
        }
        var5.field705 = (arg1 + var6) * 128;
        var5.field702 = (arg2 + var7) * 128;
        var5.field704 = arg3.field2942;
        var5.field703 = arg3.field2940 * 128;
        var5.field706 = arg3.field2948;
        var5.field707 = arg3.field2945;
        var5.field699 = arg3.field2934;
        if (arg3.field2939 != null) {
            var5.field715 = arg3;
            var5.method700();
        }
        field701.method2320(var5);
        if (var5.field699 != null) {
            var5.field709 = var5.field706 + (int) (Math.random() * (double) (var5.field707 - var5.field706));
        }
    }
}
