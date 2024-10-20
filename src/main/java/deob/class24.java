package deob;

@ObfuscatedName("f")
public final class class24 extends class208 {

    @ObfuscatedName("f.n")
    public static class199 field622 = new class199();

    @ObfuscatedName("f.q")
    public int field607;

    @ObfuscatedName("f.c")
    public int field608;

    @ObfuscatedName("f.l")
    public int field609;

    @ObfuscatedName("f.r")
    public class41 field620;

    @ObfuscatedName("f.u")
    public int field611;

    @ObfuscatedName("f.j")
    public int field606;

    @ObfuscatedName("f.w")
    public int field612;

    @ObfuscatedName("f.y")
    public int field613;

    @ObfuscatedName("f.o")
    public class65 field618;

    @ObfuscatedName("f.h")
    public int field615;

    @ObfuscatedName("f.e")
    public int field614;

    @ObfuscatedName("f.v")
    public int[] field617;

    @ObfuscatedName("f.p")
    public int field610;

    @ObfuscatedName("f.m")
    public class65 field619;

    @ObfuscatedName("f.n(I)V")
    public void method596() {
        int var1 = this.field613;
        class41 var2 = this.field620.method804();
        if (var2 == null) {
            this.field613 = -1;
            this.field612 = 0;
            this.field615 = 0;
            this.field614 = 0;
            this.field617 = null;
        } else {
            this.field613 = var2.field958;
            this.field612 = var2.field943 * 128;
            this.field615 = var2.field960;
            this.field614 = var2.field961;
            this.field617 = var2.field962;
        }
        if (this.field613 != var1 && this.field618 != null) {
            Statics.field266.method1133(this.field618);
            this.field618 = null;
        }
    }

    @ObfuscatedName("cs.q(IIILav;II)V")
    public static void method2064(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field607 = arg0;
        var5.field608 = arg1 * 128;
        var5.field609 = arg2 * 128;
        int var6 = arg3.field927;
        int var7 = arg3.field915;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field915;
            var7 = arg3.field927;
        }
        var5.field611 = (arg1 + var6) * 128;
        var5.field606 = (arg2 + var7) * 128;
        var5.field613 = arg3.field958;
        var5.field612 = arg3.field943 * 128;
        var5.field615 = arg3.field960;
        var5.field614 = arg3.field961;
        var5.field617 = arg3.field962;
        if (arg3.field964 != null) {
            var5.field620 = arg3;
            var5.method596();
        }
        field622.method3544(var5);
        if (var5.field617 != null) {
            var5.field610 = var5.field615 + (int) (Math.random() * (double) (var5.field614 - var5.field615));
        }
    }
}
