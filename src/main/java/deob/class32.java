package deob;

@ObfuscatedName("ad")
public final class class32 extends class128 {

    @ObfuscatedName("ad.x")
    public int field717;

    @ObfuscatedName("ad.n")
    public static class129 field704 = new class129();

    @ObfuscatedName("ad.g")
    public int field703;

    @ObfuscatedName("ad.v")
    public int field705;

    @ObfuscatedName("ad.y")
    public int field706;

    @ObfuscatedName("ad.p")
    public int field707;

    @ObfuscatedName("ad.j")
    public int field713;

    @ObfuscatedName("ad.m")
    public int field709;

    @ObfuscatedName("ad.a")
    public class67 field710;

    @ObfuscatedName("ad.i")
    public int field711;

    @ObfuscatedName("ad.s")
    public int field712;

    @ObfuscatedName("ad.k")
    public int[] field715;

    @ObfuscatedName("ad.f")
    public int field714;

    @ObfuscatedName("ad.o")
    public class67 field702;

    @ObfuscatedName("ad.q")
    public class198 field716;

    @ObfuscatedName("al.x(I)V")
    public static void method690() {
        for (class32 var0 = (class32) field704.method2352(); var0 != null; var0 = (class32) field704.method2341()) {
            if (var0.field710 != null) {
                Statics.field573.method978(var0.field710);
                var0.field710 = null;
            }
            if (var0.field702 != null) {
                Statics.field573.method978(var0.field702);
                var0.field702 = null;
            }
        }
        field704.method2356();
    }

    @ObfuscatedName("bh.n(B)V")
    public static void method1429() {
        for (class32 var0 = (class32) field704.method2352(); var0 != null; var0 = (class32) field704.method2341()) {
            if (var0.field716 != null) {
                var0.method704();
            }
        }
    }

    @ObfuscatedName("ad.g(I)V")
    public void method704() {
        int var1 = this.field709;
        class198 var2 = this.field716.method3493();
        if (var2 == null) {
            this.field709 = -1;
            this.field713 = 0;
            this.field711 = 0;
            this.field712 = 0;
            this.field715 = null;
        } else {
            this.field709 = var2.field2943;
            this.field713 = var2.field2911 * 128;
            this.field711 = var2.field2908;
            this.field712 = var2.field2917;
            this.field715 = var2.field2947;
        }
        if (this.field709 != var1 && this.field710 != null) {
            Statics.field573.method978(this.field710);
            this.field710 = null;
        }
    }

    @ObfuscatedName("ab.v(IIILgt;II)V")
    public static void method620(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field703 = arg0;
        var5.field705 = arg1 * 128;
        var5.field717 = arg2 * 128;
        int var6 = arg3.field2914;
        int var7 = arg3.field2933;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2933;
            var7 = arg3.field2914;
        }
        var5.field706 = (arg1 + var6) * 128;
        var5.field707 = (arg2 + var7) * 128;
        var5.field709 = arg3.field2943;
        var5.field713 = arg3.field2911 * 128;
        var5.field711 = arg3.field2908;
        var5.field712 = arg3.field2917;
        var5.field715 = arg3.field2947;
        if (arg3.field2940 != null) {
            var5.field716 = arg3;
            var5.method704();
        }
        field704.method2360(var5);
        if (var5.field715 != null) {
            var5.field714 = var5.field711 + (int) (Math.random() * (double) (var5.field712 - var5.field711));
        }
    }
}
