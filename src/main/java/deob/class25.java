package deob;

@ObfuscatedName("t")
public final class class25 extends class212 {

    @ObfuscatedName("t.k")
    public static class203 field610 = new class203();

    @ObfuscatedName("t.q")
    public int field617;

    @ObfuscatedName("t.f")
    public int field604;

    @ObfuscatedName("t.c")
    public int field605;

    @ObfuscatedName("t.v")
    public int field606;

    @ObfuscatedName("t.j")
    public int field608;

    @ObfuscatedName("t.m")
    public int field607;

    @ObfuscatedName("t.y")
    public int field609;

    @ObfuscatedName("t.u")
    public class68 field602;

    @ObfuscatedName("t.h")
    public int field611;

    @ObfuscatedName("t.l")
    public int field612;

    @ObfuscatedName("t.b")
    public int[] field613;

    @ObfuscatedName("t.g")
    public int field614;

    @ObfuscatedName("t.e")
    public class68 field615;

    @ObfuscatedName("t.p")
    public class43 field616;

    @ObfuscatedName("f.k(I)V")
    public static void method21() {
        for (class25 var0 = (class25) field610.method3616(); var0 != null; var0 = (class25) field610.method3603()) {
            if (var0.field616 != null) {
                var0.method589();
            }
        }
    }

    @ObfuscatedName("t.q(S)V")
    public void method589() {
        int var1 = this.field609;
        class43 var2 = this.field616.method810();
        if (var2 == null) {
            this.field609 = -1;
            this.field607 = 0;
            this.field611 = 0;
            this.field612 = 0;
            this.field613 = null;
        } else {
            this.field609 = var2.field980;
            this.field607 = var2.field981 * 128;
            this.field611 = var2.field982;
            this.field612 = var2.field944;
            this.field613 = var2.field984;
        }
        if (this.field609 != var1 && this.field602 != null) {
            Statics.field1971.method1143(this.field602);
            this.field602 = null;
        }
    }

    @ObfuscatedName("h.f(IIILai;II)V")
    public static void method109(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field617 = arg0;
        var5.field604 = arg1 * 128;
        var5.field605 = arg2 * 128;
        int var6 = arg3.field951;
        int var7 = arg3.field949;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field949;
            var7 = arg3.field951;
        }
        var5.field606 = (arg1 + var6) * 128;
        var5.field608 = (arg2 + var7) * 128;
        var5.field609 = arg3.field980;
        var5.field607 = arg3.field981 * 128;
        var5.field611 = arg3.field982;
        var5.field612 = arg3.field944;
        var5.field613 = arg3.field984;
        if (arg3.field977 != null) {
            var5.field616 = arg3;
            var5.method589();
        }
        field610.method3596(var5);
        if (var5.field613 != null) {
            var5.field614 = var5.field611 + (int) (Math.random() * (double) (var5.field612 - var5.field611));
        }
    }
}
