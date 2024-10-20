package deob;

@ObfuscatedName("at")
public final class class43 extends class90 {

    @ObfuscatedName("at.o")
    public int field872;

    @ObfuscatedName("at.m")
    public int field864;

    @ObfuscatedName("at.b")
    public int field865;

    @ObfuscatedName("at.g")
    public int field866;

    @ObfuscatedName("at.h")
    public int field867;

    @ObfuscatedName("at.v")
    public int field868;

    @ObfuscatedName("at.l")
    public int field869;

    @ObfuscatedName("at.c")
    public int field870;

    @ObfuscatedName("at.u")
    public int field871;

    @ObfuscatedName("at.k")
    public int field885;

    @ObfuscatedName("at.z")
    public int field877;

    @ObfuscatedName("at.y")
    public boolean field874 = false;

    @ObfuscatedName("at.j")
    public double field875;

    @ObfuscatedName("at.f")
    public double field876;

    @ObfuscatedName("at.p")
    public double field884;

    @ObfuscatedName("at.i")
    public double field878;

    @ObfuscatedName("at.s")
    public double field882;

    @ObfuscatedName("at.x")
    public double field873;

    @ObfuscatedName("at.d")
    public double field881;

    @ObfuscatedName("at.w")
    public double field887;

    @ObfuscatedName("at.n")
    public int field883;

    @ObfuscatedName("at.q")
    public int field879;

    @ObfuscatedName("at.t")
    public class202 field886;

    @ObfuscatedName("at.r")
    public int field880 = 0;

    @ObfuscatedName("at.a")
    public int field863 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field872 = arg0;
        this.field864 = arg1;
        this.field865 = arg2;
        this.field866 = arg3;
        this.field867 = arg4;
        this.field869 = arg5;
        this.field870 = arg6;
        this.field871 = arg7;
        this.field885 = arg8;
        this.field877 = arg9;
        this.field868 = arg10;
        this.field874 = false;
        int var12 = class191.method3446(this.field872).field2804;
        if (var12 == -1) {
            this.field886 = null;
        } else {
            this.field886 = class202.method658(var12);
        }
    }

    @ObfuscatedName("at.o(IIIII)V")
    public final void method757(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field874) {
            double var5 = (double) (arg0 - this.field865);
            double var7 = (double) (arg1 - this.field866);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field875 = (double) this.field885 * var5 / var9 + (double) this.field865;
            this.field876 = (double) this.field885 * var7 / var9 + (double) this.field866;
            this.field884 = (double) this.field867;
        }
        double var11 = (double) (this.field870 + 1 - arg3);
        this.field878 = ((double) arg0 - this.field875) / var11;
        this.field882 = ((double) arg1 - this.field876) / var11;
        this.field873 = Math.sqrt(this.field882 * this.field882 + this.field878 * this.field878);
        if (!this.field874) {
            this.field881 = -this.field873 * Math.tan((double) this.field871 * 0.02454369D);
        }
        this.field887 = ((double) arg2 - this.field884 - this.field881 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("at.m(II)V")
    public final void method758(int arg0) {
        this.field874 = true;
        this.field875 += (double) arg0 * this.field878;
        this.field876 += (double) arg0 * this.field882;
        this.field884 += this.field887 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field881;
        this.field881 += (double) arg0 * this.field887;
        this.field883 = (int) (Math.atan2(this.field878, this.field882) * 325.949D) + 1024 & 0x7FF;
        this.field879 = (int) (Math.atan2(this.field881, this.field873) * 325.949D) & 0x7FF;
        if (this.field886 == null) {
            return;
        }
        this.field863 += arg0;
        while (true) {
            do {
                do {
                    if (this.field863 <= this.field886.field3048[this.field880]) {
                        return;
                    }
                    this.field863 -= this.field886.field3048[this.field880];
                    this.field880++;
                } while (this.field880 < this.field886.field3051.length);
                this.field880 -= this.field886.field3055;
            } while (this.field880 >= 0 && this.field880 < this.field886.field3051.length);
            this.field880 = 0;
        }
    }

    @ObfuscatedName("at.b(B)Lcy;")
    public final class83 method212() {
        class191 var1 = class191.method3446(this.field872);
        class83 var2 = var1.method3188(this.field880);
        if (var2 == null) {
            return null;
        } else {
            var2.method1466(this.field879);
            return var2;
        }
    }
}
