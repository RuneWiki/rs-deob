package deob;

@ObfuscatedName("w")
public final class class25 extends class212 {

    @ObfuscatedName("w.x")
    public int field606;

    @ObfuscatedName("w.r")
    public class43 field617;

    @ObfuscatedName("w.j")
    public static class203 field605 = new class203();

    @ObfuscatedName("w.z")
    public int field607;

    @ObfuscatedName("w.i")
    public int field603;

    @ObfuscatedName("w.b")
    public int field615;

    @ObfuscatedName("w.l")
    public int field608;

    @ObfuscatedName("w.m")
    public int field609;

    @ObfuscatedName("w.p")
    public int field612;

    @ObfuscatedName("w.f")
    public class68 field611;

    @ObfuscatedName("w.d")
    public int field604;

    @ObfuscatedName("w.v")
    public int field613;

    @ObfuscatedName("w.q")
    public int[] field620;

    @ObfuscatedName("w.t")
    public int field614;

    @ObfuscatedName("w.g")
    public class68 field616;

    @ObfuscatedName("x.x(I)V")
    public static void method2() {
        for (class25 var0 = (class25) field605.method3600(); var0 != null; var0 = (class25) field605.method3602()) {
            if (var0.field617 != null) {
                var0.method561();
            }
        }
    }

    @ObfuscatedName("w.r(B)V")
    public void method561() {
        int var1 = this.field612;
        class43 var2 = this.field617.method776();
        if (var2 == null) {
            this.field612 = -1;
            this.field609 = 0;
            this.field604 = 0;
            this.field613 = 0;
            this.field620 = null;
        } else {
            this.field612 = var2.field949;
            this.field609 = var2.field969 * 128;
            this.field604 = var2.field930;
            this.field613 = var2.field975;
            this.field620 = var2.field965;
        }
        if (this.field612 != var1 && this.field611 != null) {
            Statics.field206.method1149(this.field611);
            this.field611 = null;
        }
    }

    @ObfuscatedName("x.j(IIILac;II)V")
    public static void method3(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field603 = arg0;
        var5.field615 = arg1 * 128;
        var5.field606 = arg2 * 128;
        int var6 = arg3.field939;
        int var7 = arg3.field940;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field940;
            var7 = arg3.field939;
        }
        var5.field607 = (arg1 + var6) * 128;
        var5.field608 = (arg2 + var7) * 128;
        var5.field612 = arg3.field949;
        var5.field609 = arg3.field969 * 128;
        var5.field604 = arg3.field930;
        var5.field613 = arg3.field975;
        var5.field620 = arg3.field965;
        if (arg3.field971 != null) {
            var5.field617 = arg3;
            var5.method561();
        }
        field605.method3594(var5);
        if (var5.field620 != null) {
            var5.field614 = var5.field604 + (int) (Math.random() * (double) (var5.field613 - var5.field604));
        }
    }
}
