package deob;

@ObfuscatedName("bv")
public final class class57 extends class201 {

    @ObfuscatedName("bv.s")
    public int field836;

    @ObfuscatedName("bv.t")
    public int field837;

    @ObfuscatedName("bv.v")
    public int field834;

    @ObfuscatedName("bv.j")
    public int field838;

    @ObfuscatedName("bv.l")
    public int field848;

    @ObfuscatedName("bv.n")
    public int field846;

    @ObfuscatedName("bv.w")
    public int field839;

    @ObfuscatedName("bv.f")
    public int field844;

    @ObfuscatedName("bv.o")
    public int field840;

    @ObfuscatedName("bv.x")
    public int field842;

    @ObfuscatedName("bv.r")
    public int field856;

    @ObfuscatedName("bv.p")
    public boolean field843 = false;

    @ObfuscatedName("bv.h")
    public double field832;

    @ObfuscatedName("bv.k")
    public double field845;

    @ObfuscatedName("bv.a")
    public double field833;

    @ObfuscatedName("bv.q")
    public double field847;

    @ObfuscatedName("bv.u")
    public double field841;

    @ObfuscatedName("bv.e")
    public double field849;

    @ObfuscatedName("bv.c")
    public double field850;

    @ObfuscatedName("bv.i")
    public double field851;

    @ObfuscatedName("bv.m")
    public int field852;

    @ObfuscatedName("bv.b")
    public int field853;

    @ObfuscatedName("bv.z")
    public class159 field854;

    @ObfuscatedName("bv.d")
    public int field855 = 0;

    @ObfuscatedName("bv.y")
    public int field835 = 0;

    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field836 = arg0;
        this.field837 = arg1;
        this.field834 = arg2;
        this.field838 = arg3;
        this.field848 = arg4;
        this.field839 = arg5;
        this.field844 = arg6;
        this.field840 = arg7;
        this.field842 = arg8;
        this.field856 = arg9;
        this.field846 = arg10;
        this.field843 = false;
        int var12 = class150.method455(this.field836).field1664;
        if (var12 == -1) {
            this.field854 = null;
        } else {
            this.field854 = class159.method1334(var12);
        }
    }

    @ObfuscatedName("bv.s(IIIII)V")
    public final void method1606(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field843) {
            double var5 = (double) (arg0 - this.field834);
            double var7 = (double) (arg1 - this.field838);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field832 = (double) this.field842 * var5 / var9 + (double) this.field834;
            this.field845 = (double) this.field842 * var7 / var9 + (double) this.field838;
            this.field833 = (double) this.field848;
        }
        double var11 = (double) (this.field844 + 1 - arg3);
        this.field847 = ((double) arg0 - this.field832) / var11;
        this.field841 = ((double) arg1 - this.field845) / var11;
        this.field849 = Math.sqrt(this.field847 * this.field847 + this.field841 * this.field841);
        if (!this.field843) {
            this.field850 = -this.field849 * Math.tan((double) this.field840 * 0.02454369D);
        }
        this.field851 = ((double) arg2 - this.field833 - this.field850 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bv.v(II)V")
    public final void method1607(int arg0) {
        this.field843 = true;
        this.field832 += (double) arg0 * this.field847;
        this.field845 += (double) arg0 * this.field841;
        this.field833 += this.field851 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field850;
        this.field850 += (double) arg0 * this.field851;
        this.field852 = (int) (Math.atan2(this.field847, this.field841) * 325.949D) + 1024 & 0x7FF;
        this.field853 = (int) (Math.atan2(this.field850, this.field849) * 325.949D) & 0x7FF;
        if (this.field854 == null) {
            return;
        }
        this.field835 += arg0;
        while (true) {
            do {
                do {
                    if (this.field835 <= this.field854.field1865[this.field855]) {
                        return;
                    }
                    this.field835 -= this.field854.field1865[this.field855];
                    this.field855++;
                } while (this.field855 < this.field854.field1863.length);
                this.field855 -= this.field854.field1862;
            } while (this.field855 >= 0 && this.field855 < this.field854.field1863.length);
            this.field855 = 0;
        }
    }

    @ObfuscatedName("bv.t(I)Lgl;")
    public final class207 method1550() {
        class150 var1 = class150.method455(this.field836);
        class207 var2 = var1.method2541(this.field855);
        if (var2 == null) {
            return null;
        } else {
            var2.method3766(this.field853);
            return var2;
        }
    }
}
