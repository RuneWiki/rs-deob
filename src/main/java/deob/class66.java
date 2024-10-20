package deob;

@ObfuscatedName("n")
public final class class66 extends class4 {

    @ObfuscatedName("n.f")
    public class160 field613;

    @ObfuscatedName("n.g")
    public int field611;

    @ObfuscatedName("n.e")
    public int field612;

    @ObfuscatedName("n.n")
    public int field610;

    @ObfuscatedName("n.o")
    public int field616;

    @ObfuscatedName("n.l")
    public int[] field605;

    @ObfuscatedName("n.j")
    public static class13 field621 = new class13();

    @ObfuscatedName("n.h")
    public int field609;

    @ObfuscatedName("n.i")
    public class160 field608;

    @ObfuscatedName("n.w")
    public int field617;

    @ObfuscatedName("n.t")
    public int field607;

    @ObfuscatedName("n.r")
    public class184 field619;

    @ObfuscatedName("n.p")
    public int field606;

    @ObfuscatedName("n.z")
    public int field615;

    @ObfuscatedName("n.x")
    public int field614;

    @ObfuscatedName("n.p(I)V")
    public void method898() {
        int var1 = this.field612;
        class184 var2 = this.field619.method3503();
        if (var2 == null) {
            this.field612 = -1;
            this.field611 = 0;
            this.field614 = 0;
            this.field615 = 0;
            this.field605 = null;
        } else {
            this.field612 = var2.field2795;
            this.field611 = var2.field2835 * 128;
            this.field614 = var2.field2836;
            this.field615 = var2.field2818;
            this.field605 = var2.field2838;
        }
        if (this.field612 != var1 && this.field613 != null) {
            Statics.field1908.method3238(this.field613);
            this.field613 = null;
        }
    }

    @ObfuscatedName("bk.j(I)V")
    public static void method2092() {
        for (class66 var0 = (class66) field621.method253(); var0 != null; var0 = (class66) field621.method255()) {
            if (var0.field613 != null) {
                Statics.field1908.method3238(var0.field613);
                var0.field613 = null;
            }
            if (var0.field608 != null) {
                Statics.field1908.method3238(var0.field608);
                var0.field608 = null;
            }
        }
        field621.method247();
    }

    @ObfuscatedName("ab.o(IIILah;IB)V")
    public static void method3457(int arg0, int arg1, int arg2, class184 arg3, int arg4) {
        class66 var5 = new class66();
        var5.field606 = arg0;
        var5.field616 = arg1 * 128;
        var5.field607 = arg2 * 128;
        int var6 = arg3.field2804;
        int var7 = arg3.field2834;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2834;
            var7 = arg3.field2804;
        }
        var5.field609 = (arg1 + var6) * 128;
        var5.field610 = (arg2 + var7) * 128;
        var5.field612 = arg3.field2795;
        var5.field611 = arg3.field2835 * 128;
        var5.field614 = arg3.field2836;
        var5.field615 = arg3.field2818;
        var5.field605 = arg3.field2838;
        if (arg3.field2831 != null) {
            var5.field619 = arg3;
            var5.method898();
        }
        field621.method248(var5);
        if (var5.field605 != null) {
            var5.field617 = var5.field614 + (int) (Math.random() * (double) (var5.field615 - var5.field614));
        }
    }
}
