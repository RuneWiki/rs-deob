package deob;

@ObfuscatedName("x")
public final class class22 extends class198 {

    @ObfuscatedName("x.e")
    public static class189 field547 = new class189();

    @ObfuscatedName("x.a")
    public int field538;

    @ObfuscatedName("x.l")
    public int field537;

    @ObfuscatedName("x.c")
    public int field555;

    @ObfuscatedName("x.u")
    public int field539;

    @ObfuscatedName("x.w")
    public int field540;

    @ObfuscatedName("x.i")
    public int field541;

    @ObfuscatedName("x.r")
    public class38 field549;

    @ObfuscatedName("x.f")
    public int field542;

    @ObfuscatedName("x.g")
    public class60 field543;

    @ObfuscatedName("x.o")
    public int field544;

    @ObfuscatedName("x.h")
    public int field551;

    @ObfuscatedName("x.s")
    public int[] field546;

    @ObfuscatedName("x.j")
    public int field535;

    @ObfuscatedName("x.m")
    public class60 field548;

    @ObfuscatedName("b.e(I)V")
    public static void method525() {
        for (class22 var0 = (class22) field547.method3378(); var0 != null; var0 = (class22) field547.method3394()) {
            if (var0.field549 != null) {
                var0.method527();
            }
        }
    }

    @ObfuscatedName("x.a(B)V")
    public void method527() {
        int var1 = this.field542;
        class38 var2 = this.field549.method689();
        if (var2 == null) {
            this.field542 = -1;
            this.field541 = 0;
            this.field544 = 0;
            this.field551 = 0;
            this.field546 = null;
        } else {
            this.field542 = var2.field873;
            this.field541 = var2.field874 * 128;
            this.field544 = var2.field875;
            this.field551 = var2.field862;
            this.field546 = var2.field880;
        }
        if (this.field542 != var1 && this.field543 != null) {
            Statics.field191.method1000(this.field543);
            this.field543 = null;
        }
    }

    @ObfuscatedName("l.l(IIILag;II)V")
    public static void method31(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field538 = arg0;
        var5.field537 = arg1 * 128;
        var5.field555 = arg2 * 128;
        int var6 = arg3.field867;
        int var7 = arg3.field845;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field845;
            var7 = arg3.field867;
        }
        var5.field539 = (arg1 + var6) * 128;
        var5.field540 = (arg2 + var7) * 128;
        var5.field542 = arg3.field873;
        var5.field541 = arg3.field874 * 128;
        var5.field544 = arg3.field875;
        var5.field551 = arg3.field862;
        var5.field546 = arg3.field880;
        if (arg3.field870 != null) {
            var5.field549 = arg3;
            var5.method527();
        }
        field547.method3374(var5);
        if (var5.field546 != null) {
            var5.field535 = var5.field544 + (int) (Math.random() * (double) (var5.field551 - var5.field544));
        }
    }
}
