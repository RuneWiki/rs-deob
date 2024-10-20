package deob;

@ObfuscatedName("y")
public final class class24 extends class208 {

    @ObfuscatedName("y.i")
    public static class199 field607 = new class199();

    @ObfuscatedName("y.v")
    public int field602;

    @ObfuscatedName("y.f")
    public int field604;

    @ObfuscatedName("y.h")
    public int field614;

    @ObfuscatedName("y.a")
    public int field610;

    @ObfuscatedName("y.s")
    public int field611;

    @ObfuscatedName("y.p")
    public int field616;

    @ObfuscatedName("y.r")
    public class41 field605;

    @ObfuscatedName("y.k")
    public int field608;

    @ObfuscatedName("y.d")
    public int field609;

    @ObfuscatedName("y.n")
    public class65 field603;

    @ObfuscatedName("y.z")
    public int field612;

    @ObfuscatedName("y.c")
    public int[] field613;

    @ObfuscatedName("y.b")
    public int field606;

    @ObfuscatedName("y.w")
    public class65 field615;

    @ObfuscatedName("eb.i(I)V")
    public static void method2642() {
        for (class24 var0 = (class24) field607.method3535(); var0 != null; var0 = (class24) field607.method3537()) {
            if (var0.field603 != null) {
                Statics.field31.method1076(var0.field603);
                var0.field603 = null;
            }
            if (var0.field615 != null) {
                Statics.field31.method1076(var0.field615);
                var0.field615 = null;
            }
        }
        field607.method3560();
    }

    @ObfuscatedName("a.v(I)V")
    public static void method54() {
        for (class24 var0 = (class24) field607.method3535(); var0 != null; var0 = (class24) field607.method3537()) {
            if (var0.field605 != null) {
                var0.method536();
            }
        }
    }

    @ObfuscatedName("y.f(I)V")
    public void method536() {
        int var1 = this.field609;
        class41 var2 = this.field605.method757();
        if (var2 == null) {
            this.field609 = -1;
            this.field608 = 0;
            this.field611 = 0;
            this.field612 = 0;
            this.field613 = null;
        } else {
            this.field609 = var2.field980;
            this.field608 = var2.field964 * 128;
            this.field611 = var2.field982;
            this.field612 = var2.field983;
            this.field613 = var2.field984;
        }
        if (this.field609 != var1 && this.field603 != null) {
            Statics.field31.method1076(this.field603);
            this.field603 = null;
        }
    }

    @ObfuscatedName("cv.h(IIILaf;II)V")
    public static void method2100(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field602 = arg0;
        var5.field604 = arg1 * 128;
        var5.field614 = arg2 * 128;
        int var6 = arg3.field944;
        int var7 = arg3.field952;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field952;
            var7 = arg3.field944;
        }
        var5.field610 = (arg1 + var6) * 128;
        var5.field616 = (arg2 + var7) * 128;
        var5.field609 = arg3.field980;
        var5.field608 = arg3.field964 * 128;
        var5.field611 = arg3.field982;
        var5.field612 = arg3.field983;
        var5.field613 = arg3.field984;
        if (arg3.field977 != null) {
            var5.field605 = arg3;
            var5.method536();
        }
        field607.method3545(var5);
        if (var5.field613 != null) {
            var5.field606 = var5.field611 + (int) (Math.random() * (double) (var5.field612 - var5.field611));
        }
    }
}
