package deob;

@ObfuscatedName("q")
public final class class24 extends class208 {

    @ObfuscatedName("q.g")
    public static class199 field615 = new class199();

    @ObfuscatedName("q.b")
    public int field606;

    @ObfuscatedName("q.w")
    public int field607;

    @ObfuscatedName("q.d")
    public int field605;

    @ObfuscatedName("q.z")
    public int field609;

    @ObfuscatedName("q.l")
    public int field608;

    @ObfuscatedName("q.m")
    public int field611;

    @ObfuscatedName("q.p")
    public int field612;

    @ObfuscatedName("q.u")
    public class65 field624;

    @ObfuscatedName("q.c")
    public int field614;

    @ObfuscatedName("q.v")
    public int field618;

    @ObfuscatedName("q.o")
    public int[] field622;

    @ObfuscatedName("q.n")
    public int field617;

    @ObfuscatedName("q.k")
    public class65 field613;

    @ObfuscatedName("q.f")
    public class41 field619;

    @ObfuscatedName("ad.g(I)V")
    public static void method727() {
        for (class24 var0 = (class24) field615.method3603(); var0 != null; var0 = (class24) field615.method3596()) {
            if (var0.field624 != null) {
                Statics.field82.method1155(var0.field624);
                var0.field624 = null;
            }
            if (var0.field613 != null) {
                Statics.field82.method1155(var0.field613);
                var0.field613 = null;
            }
        }
        field615.method3622();
    }

    @ObfuscatedName("q.b(I)V")
    public void method600() {
        int var1 = this.field612;
        class41 var2 = this.field619.method809();
        if (var2 == null) {
            this.field612 = -1;
            this.field611 = 0;
            this.field614 = 0;
            this.field618 = 0;
            this.field622 = null;
        } else {
            this.field612 = var2.field971;
            this.field611 = var2.field972 * 128;
            this.field614 = var2.field973;
            this.field618 = var2.field974;
            this.field622 = var2.field960;
        }
        if (this.field612 != var1 && this.field624 != null) {
            Statics.field82.method1155(this.field624);
            this.field624 = null;
        }
    }

    @ObfuscatedName("dk.w(IIILau;II)V")
    public static void method2680(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field606 = arg0;
        var5.field607 = arg1 * 128;
        var5.field605 = arg2 * 128;
        int var6 = arg3.field942;
        int var7 = arg3.field943;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field943;
            var7 = arg3.field942;
        }
        var5.field609 = (arg1 + var6) * 128;
        var5.field608 = (arg2 + var7) * 128;
        var5.field612 = arg3.field971;
        var5.field611 = arg3.field972 * 128;
        var5.field614 = arg3.field973;
        var5.field618 = arg3.field974;
        var5.field622 = arg3.field960;
        if (arg3.field968 != null) {
            var5.field619 = arg3;
            var5.method600();
        }
        field615.method3598(var5);
        if (var5.field622 != null) {
            var5.field617 = var5.field614 + (int) (Math.random() * (double) (var5.field618 - var5.field614));
        }
    }
}
