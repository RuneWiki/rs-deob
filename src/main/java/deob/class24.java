package deob;

@ObfuscatedName("z")
public final class class24 extends class208 {

    @ObfuscatedName("z.c")
    public static class199 field607 = new class199();

    @ObfuscatedName("z.h")
    public int field597;

    @ObfuscatedName("z.k")
    public int field598;

    @ObfuscatedName("z.t")
    public int field599;

    @ObfuscatedName("z.g")
    public int field596;

    @ObfuscatedName("z.o")
    public int field601;

    @ObfuscatedName("z.i")
    public int field616;

    @ObfuscatedName("z.w")
    public int field603;

    @ObfuscatedName("z.m")
    public class65 field604;

    @ObfuscatedName("z.r")
    public class41 field610;

    @ObfuscatedName("z.y")
    public int field605;

    @ObfuscatedName("z.q")
    public int field606;

    @ObfuscatedName("z.f")
    public int[] field615;

    @ObfuscatedName("z.x")
    public int field609;

    @ObfuscatedName("z.d")
    public class65 field611;

    @ObfuscatedName("z.c(B)V")
    public void method573() {
        int var1 = this.field603;
        class41 var2 = this.field610.method783();
        if (var2 == null) {
            this.field603 = -1;
            this.field616 = 0;
            this.field605 = 0;
            this.field606 = 0;
            this.field615 = null;
        } else {
            this.field603 = var2.field945;
            this.field616 = var2.field940 * 128;
            this.field605 = var2.field931;
            this.field606 = var2.field970;
            this.field615 = var2.field971;
        }
        if (this.field603 != var1 && this.field604 != null) {
            Statics.field198.method1093(this.field604);
            this.field604 = null;
        }
    }

    @ObfuscatedName("g.h(IIILai;IB)V")
    public static void method44(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field597 = arg0;
        var5.field598 = arg1 * 128;
        var5.field599 = arg2 * 128;
        int var6 = arg3.field958;
        int var7 = arg3.field939;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field939;
            var7 = arg3.field958;
        }
        var5.field596 = (arg1 + var6) * 128;
        var5.field601 = (arg2 + var7) * 128;
        var5.field603 = arg3.field945;
        var5.field616 = arg3.field940 * 128;
        var5.field605 = arg3.field931;
        var5.field606 = arg3.field970;
        var5.field615 = arg3.field971;
        if (arg3.field953 != null) {
            var5.field610 = arg3;
            var5.method573();
        }
        field607.method3585(var5);
        if (var5.field615 != null) {
            var5.field609 = var5.field605 + (int) (Math.random() * (double) (var5.field606 - var5.field605));
        }
    }
}
