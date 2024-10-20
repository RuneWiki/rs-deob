package deob;

@ObfuscatedName("g")
public final class class56 extends class107 {

    @ObfuscatedName("g.f")
    public double field627;

    @ObfuscatedName("g.g")
    public int field618;

    @ObfuscatedName("g.d")
    public int field624;

    @ObfuscatedName("g.e")
    public double field623;

    @ObfuscatedName("g.b")
    public int field611;

    @ObfuscatedName("g.c")
    public int field610;

    @ObfuscatedName("g.a")
    public boolean field637 = false;

    @ObfuscatedName("g.n")
    public int field617 = 0;

    @ObfuscatedName("g.o")
    public double field625;

    @ObfuscatedName("g.l")
    public int field634 = 0;

    @ObfuscatedName("g.m")
    public int field613;

    @ObfuscatedName("g.j")
    public int field619;

    @ObfuscatedName("g.k")
    public double field622;

    @ObfuscatedName("g.h")
    public double field628;

    @ObfuscatedName("g.i")
    public int field612;

    @ObfuscatedName("g.w")
    public int field630;

    @ObfuscatedName("g.v")
    public int field633;

    @ObfuscatedName("g.u")
    public double field621;

    @ObfuscatedName("g.t")
    public int field629;

    @ObfuscatedName("g.s")
    public double field626;

    @ObfuscatedName("g.r")
    public class165 field631;

    @ObfuscatedName("g.p")
    public double field632;

    @ObfuscatedName("g.z")
    public int field614;

    @ObfuscatedName("g.y")
    public int field616;

    @ObfuscatedName("g.x")
    public int field615;

    @ObfuscatedName("g.b(II)V")
    public final void method905(int arg0) {
        this.field637 = true;
        this.field621 += (double) arg0 * this.field632;
        this.field622 += (double) arg0 * this.field625;
        this.field623 += this.field628 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field627;
        this.field627 += (double) arg0 * this.field628;
        this.field629 = (int) (Math.atan2(this.field632, this.field625) * 325.949D) + 1024 & 0x7FF;
        this.field630 = (int) (Math.atan2(this.field627, this.field626) * 325.949D) & 0x7FF;
        if (this.field631 == null) {
            return;
        }
        this.field617 += arg0;
        while (true) {
            do {
                do {
                    if (this.field617 <= this.field631.field2526[this.field634]) {
                        return;
                    }
                    this.field617 -= this.field631.field2526[this.field634];
                    this.field634++;
                } while (this.field634 < this.field631.field2522.length);
                this.field634 -= this.field631.field2536;
            } while (this.field634 >= 0 && this.field634 < this.field631.field2522.length);
            this.field634 = 0;
        }
    }

    @ObfuscatedName("g.c(I)Ldk;")
    public final class43 method908() {
        class173 var1 = class173.method1223(this.field633);
        class43 var2 = var1.method3134(this.field634);
        if (var2 == null) {
            return null;
        } else {
            var2.method785(this.field630);
            return var2;
        }
    }

    @ObfuscatedName("g.v(IIIIB)V")
    public final void method914(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field637) {
            double var5 = (double) (arg0 - this.field611);
            double var7 = (double) (arg1 - this.field612);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field621 = (double) this.field618 * var5 / var9 + (double) this.field611;
            this.field622 = (double) this.field618 * var7 / var9 + (double) this.field612;
            this.field623 = (double) this.field613;
        }
        double var11 = (double) (this.field624 + 1 - arg3);
        this.field632 = ((double) arg0 - this.field621) / var11;
        this.field625 = ((double) arg1 - this.field622) / var11;
        this.field626 = Math.sqrt(this.field632 * this.field632 + this.field625 * this.field625);
        if (!this.field637) {
            this.field627 = -this.field626 * Math.tan((double) this.field619 * 0.02454369D);
        }
        this.field628 = ((double) arg2 - this.field623 - this.field627 * var11) * 2.0D / (var11 * var11);
    }

    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field633 = arg0;
        this.field610 = arg1;
        this.field611 = arg2;
        this.field612 = arg3;
        this.field613 = arg4;
        this.field615 = arg5;
        this.field624 = arg6;
        this.field619 = arg7;
        this.field618 = arg8;
        this.field616 = arg9;
        this.field614 = arg10;
        this.field637 = false;
        int var12 = class173.method1223(this.field633).field2661;
        if (var12 == -1) {
            this.field631 = null;
        } else {
            this.field631 = class165.method3233(var12);
        }
    }
}
