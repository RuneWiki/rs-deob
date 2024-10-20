package deob;

@ObfuscatedName("k")
public final class class20 extends class184 {

    @ObfuscatedName("k.z")
    public int field537;

    @ObfuscatedName("k.j")
    public static class177 field528 = new class177();

    @ObfuscatedName("k.a")
    public int field525;

    @ObfuscatedName("k.y")
    public int field526;

    @ObfuscatedName("k.i")
    public int field527;

    @ObfuscatedName("k.b")
    public int field529;

    @ObfuscatedName("k.s")
    public int field524;

    @ObfuscatedName("k.q")
    public int field530;

    @ObfuscatedName("k.p")
    public int field531;

    @ObfuscatedName("k.h")
    public class58 field532;

    @ObfuscatedName("k.r")
    public class36 field533;

    @ObfuscatedName("k.o")
    public int field539;

    @ObfuscatedName("k.f")
    public int[] field535;

    @ObfuscatedName("k.u")
    public int field536;

    @ObfuscatedName("k.c")
    public class58 field538;

    @ObfuscatedName("n.z(I)V")
    public static void method499() {
        for (class20 var0 = (class20) field528.method3232(); var0 != null; var0 = (class20) field528.method3251()) {
            if (var0.field533 != null) {
                var0.method472();
            }
        }
    }

    @ObfuscatedName("k.j(I)V")
    public void method472() {
        int var1 = this.field531;
        class36 var2 = this.field533.method636();
        if (var2 == null) {
            this.field531 = -1;
            this.field530 = 0;
            this.field524 = 0;
            this.field539 = 0;
            this.field535 = null;
        } else {
            this.field531 = var2.field828;
            this.field530 = var2.field831 * 128;
            this.field524 = var2.field845;
            this.field539 = var2.field854;
            this.field535 = var2.field850;
        }
        if (this.field531 != var1 && this.field532 != null) {
            Statics.field461.method950(this.field532);
            this.field532 = null;
        }
    }

    @ObfuscatedName("dp.a(IIILai;II)V")
    public static void method2578(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field525 = arg0;
        var5.field526 = arg1 * 128;
        var5.field527 = arg2 * 128;
        int var6 = arg3.field822;
        int var7 = arg3.field823;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field823;
            var7 = arg3.field822;
        }
        var5.field537 = (arg1 + var6) * 128;
        var5.field529 = (arg2 + var7) * 128;
        var5.field531 = arg3.field828;
        var5.field530 = arg3.field831 * 128;
        var5.field524 = arg3.field845;
        var5.field539 = arg3.field854;
        var5.field535 = arg3.field850;
        if (arg3.field848 != null) {
            var5.field533 = arg3;
            var5.method472();
        }
        field528.method3227(var5);
        if (var5.field535 != null) {
            var5.field536 = var5.field524 + (int) (Math.random() * (double) (var5.field539 - var5.field524));
        }
    }
}
