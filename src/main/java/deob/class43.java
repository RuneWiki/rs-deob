package deob;

@ObfuscatedName("ab")
public final class class43 extends class90 {

    @ObfuscatedName("ab.d")
    public int field860;

    @ObfuscatedName("ab.c")
    public int field849;

    @ObfuscatedName("ab.n")
    public int field850;

    @ObfuscatedName("ab.q")
    public int field862;

    @ObfuscatedName("ab.t")
    public int field852;

    @ObfuscatedName("ab.p")
    public int field853;

    @ObfuscatedName("ab.u")
    public int field856;

    @ObfuscatedName("ab.z")
    public int field855;

    @ObfuscatedName("ab.l")
    public int field863;

    @ObfuscatedName("ab.v")
    public int field848;

    @ObfuscatedName("ab.g")
    public int field858;

    @ObfuscatedName("ab.w")
    public boolean field859 = false;

    @ObfuscatedName("ab.r")
    public double field865;

    @ObfuscatedName("ab.s")
    public double field851;

    @ObfuscatedName("ab.k")
    public double field854;

    @ObfuscatedName("ab.e")
    public double field870;

    @ObfuscatedName("ab.j")
    public double field867;

    @ObfuscatedName("ab.i")
    public double field857;

    @ObfuscatedName("ab.a")
    public double field864;

    @ObfuscatedName("ab.x")
    public double field861;

    @ObfuscatedName("ab.h")
    public int field868;

    @ObfuscatedName("ab.b")
    public int field869;

    @ObfuscatedName("ab.f")
    public class207 field866;

    @ObfuscatedName("ab.o")
    public int field871 = 0;

    @ObfuscatedName("ab.m")
    public int field872 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field860 = arg0;
        this.field849 = arg1;
        this.field850 = arg2;
        this.field862 = arg3;
        this.field852 = arg4;
        this.field856 = arg5;
        this.field855 = arg6;
        this.field863 = arg7;
        this.field848 = arg8;
        this.field858 = arg9;
        this.field853 = arg10;
        this.field859 = false;
        int var12 = class193.method3249(this.field860).field2812;
        if (var12 == -1) {
            this.field866 = null;
        } else {
            this.field866 = class207.method3621(var12);
        }
    }

    @ObfuscatedName("ab.d(IIIII)V")
    public final void method800(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field859) {
            double var5 = (double) (arg0 - this.field850);
            double var7 = (double) (arg1 - this.field862);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field865 = (double) this.field848 * var5 / var9 + (double) this.field850;
            this.field851 = (double) this.field848 * var7 / var9 + (double) this.field862;
            this.field854 = (double) this.field852;
        }
        double var11 = (double) (this.field855 + 1 - arg3);
        this.field870 = ((double) arg0 - this.field865) / var11;
        this.field867 = ((double) arg1 - this.field851) / var11;
        this.field857 = Math.sqrt(this.field870 * this.field870 + this.field867 * this.field867);
        if (!this.field859) {
            this.field864 = -this.field857 * Math.tan((double) this.field863 * 0.02454369D);
        }
        this.field861 = ((double) arg2 - this.field854 - this.field864 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ab.c(II)V")
    public final void method796(int arg0) {
        this.field859 = true;
        this.field865 += (double) arg0 * this.field870;
        this.field851 += (double) arg0 * this.field867;
        this.field854 += this.field861 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field864;
        this.field864 += (double) arg0 * this.field861;
        this.field868 = (int) (Math.atan2(this.field870, this.field867) * 325.949D) + 1024 & 0x7FF;
        this.field869 = (int) (Math.atan2(this.field864, this.field857) * 325.949D) & 0x7FF;
        if (this.field866 == null) {
            return;
        }
        this.field872 += arg0;
        while (true) {
            do {
                do {
                    if (this.field872 <= this.field866.field3092[this.field871]) {
                        return;
                    }
                    this.field872 -= this.field866.field3092[this.field871];
                    this.field871++;
                } while (this.field871 < this.field866.field3093.length);
                this.field871 -= this.field866.field3094;
            } while (this.field871 >= 0 && this.field871 < this.field866.field3093.length);
            this.field871 = 0;
        }
    }

    @ObfuscatedName("ab.n(B)Lcf;")
    public final class83 method230() {
        class193 var1 = class193.method3249(this.field860);
        class83 var2 = var1.method3265(this.field871);
        if (var2 == null) {
            return null;
        } else {
            var2.method1496(this.field869);
            return var2;
        }
    }
}
