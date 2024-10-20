package deob;

@ObfuscatedName("a")
public final class class20 extends class186 {

    @ObfuscatedName("a.t")
    public static class177 field542 = new class177();

    @ObfuscatedName("a.o")
    public int field551;

    @ObfuscatedName("a.i")
    public int field534;

    @ObfuscatedName("a.p")
    public int field535;

    @ObfuscatedName("a.c")
    public int field536;

    @ObfuscatedName("a.y")
    public int field537;

    @ObfuscatedName("a.g")
    public int field538;

    @ObfuscatedName("a.l")
    public int field550;

    @ObfuscatedName("a.h")
    public class58 field540;

    @ObfuscatedName("a.n")
    public int field539;

    @ObfuscatedName("a.w")
    public int field533;

    @ObfuscatedName("a.m")
    public int[] field543;

    @ObfuscatedName("a.x")
    public int field532;

    @ObfuscatedName("a.b")
    public class58 field541;

    @ObfuscatedName("a.u")
    public class36 field546;

    @ObfuscatedName("cw.t(I)V")
    public static void method2073() {
        for (class20 var0 = (class20) field542.method3170(); var0 != null; var0 = (class20) field542.method3172()) {
            if (var0.field546 != null) {
                var0.method470();
            }
        }
    }

    @ObfuscatedName("a.o(I)V")
    public void method470() {
        int var1 = this.field550;
        class36 var2 = this.field546.method648();
        if (var2 == null) {
            this.field550 = -1;
            this.field538 = 0;
            this.field539 = 0;
            this.field533 = 0;
            this.field543 = null;
        } else {
            this.field550 = var2.field869;
            this.field538 = var2.field826 * 128;
            this.field539 = var2.field843;
            this.field533 = var2.field829;
            this.field543 = var2.field879;
        }
        if (this.field550 != var1 && this.field540 != null) {
            Statics.field585.method936(this.field540);
            this.field540 = null;
        }
    }

    @ObfuscatedName("bd.i(IIILaf;II)V")
    public static void method1041(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field551 = arg0;
        var5.field534 = arg1 * 128;
        var5.field535 = arg2 * 128;
        int var6 = arg3.field856;
        int var7 = arg3.field841;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field841;
            var7 = arg3.field856;
        }
        var5.field536 = (arg1 + var6) * 128;
        var5.field537 = (arg2 + var7) * 128;
        var5.field550 = arg3.field869;
        var5.field538 = arg3.field826 * 128;
        var5.field539 = arg3.field843;
        var5.field533 = arg3.field829;
        var5.field543 = arg3.field879;
        if (arg3.field866 != null) {
            var5.field546 = arg3;
            var5.method470();
        }
        field542.method3166(var5);
        if (var5.field543 != null) {
            var5.field532 = var5.field539 + (int) (Math.random() * (double) (var5.field533 - var5.field539));
        }
    }
}
