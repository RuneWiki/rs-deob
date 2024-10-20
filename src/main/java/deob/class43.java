package deob;

@ObfuscatedName("av")
public final class class43 extends class90 {

    @ObfuscatedName("av.f")
    public int field903;

    @ObfuscatedName("av.i")
    public int field875;

    @ObfuscatedName("av.u")
    public int field877;

    @ObfuscatedName("av.h")
    public int field874;

    @ObfuscatedName("av.r")
    public int field893;

    @ObfuscatedName("av.o")
    public int field879;

    @ObfuscatedName("av.l")
    public int field880;

    @ObfuscatedName("av.n")
    public int field895;

    @ObfuscatedName("av.m")
    public int field882;

    @ObfuscatedName("av.w")
    public int field887;

    @ObfuscatedName("av.j")
    public int field884;

    @ObfuscatedName("av.s")
    public boolean field876 = false;

    @ObfuscatedName("av.q")
    public double field886;

    @ObfuscatedName("av.d")
    public double field885;

    @ObfuscatedName("av.p")
    public double field888;

    @ObfuscatedName("av.y")
    public double field889;

    @ObfuscatedName("av.a")
    public double field890;

    @ObfuscatedName("av.v")
    public double field891;

    @ObfuscatedName("av.z")
    public double field892;

    @ObfuscatedName("av.x")
    public double field894;

    @ObfuscatedName("av.g")
    public int field896;

    @ObfuscatedName("av.b")
    public int field883;

    @ObfuscatedName("av.k")
    public class202 field881;

    @ObfuscatedName("av.t")
    public int field897 = 0;

    @ObfuscatedName("av.c")
    public int field898 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field903 = arg0;
        this.field875 = arg1;
        this.field877 = arg2;
        this.field874 = arg3;
        this.field893 = arg4;
        this.field880 = arg5;
        this.field895 = arg6;
        this.field882 = arg7;
        this.field887 = arg8;
        this.field884 = arg9;
        this.field879 = arg10;
        this.field876 = false;
        int var12 = class191.method2599(this.field903).field2809;
        if (var12 == -1) {
            this.field881 = null;
        } else {
            this.field881 = class202.method164(var12);
        }
    }

    @ObfuscatedName("av.f(IIIII)V")
    public final void method803(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field876) {
            double var5 = (double) (arg0 - this.field877);
            double var7 = (double) (arg1 - this.field874);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field886 = (double) this.field887 * var5 / var9 + (double) this.field877;
            this.field885 = (double) this.field887 * var7 / var9 + (double) this.field874;
            this.field888 = (double) this.field893;
        }
        double var11 = (double) (this.field895 + 1 - arg3);
        this.field889 = ((double) arg0 - this.field886) / var11;
        this.field890 = ((double) arg1 - this.field885) / var11;
        this.field891 = Math.sqrt(this.field890 * this.field890 + this.field889 * this.field889);
        if (!this.field876) {
            this.field892 = -this.field891 * Math.tan((double) this.field882 * 0.02454369D);
        }
        this.field894 = ((double) arg2 - this.field888 - this.field892 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("av.i(IB)V")
    public final void method808(int arg0) {
        this.field876 = true;
        this.field886 += (double) arg0 * this.field889;
        this.field885 += (double) arg0 * this.field890;
        this.field888 += this.field894 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field892;
        this.field892 += (double) arg0 * this.field894;
        this.field896 = (int) (Math.atan2(this.field889, this.field890) * 325.949D) + 1024 & 0x7FF;
        this.field883 = (int) (Math.atan2(this.field892, this.field891) * 325.949D) & 0x7FF;
        if (this.field881 == null) {
            return;
        }
        this.field898 += arg0;
        while (true) {
            do {
                do {
                    if (this.field898 <= this.field881.field3066[this.field897]) {
                        return;
                    }
                    this.field898 -= this.field881.field3066[this.field897];
                    this.field897++;
                } while (this.field897 < this.field881.field3061.length);
                this.field897 -= this.field881.field3065;
            } while (this.field897 >= 0 && this.field897 < this.field881.field3061.length);
            this.field897 = 0;
        }
    }

    @ObfuscatedName("av.u(B)Lce;")
    public final class83 method209() {
        class191 var1 = class191.method2599(this.field903);
        class83 var2 = var1.method3293(this.field897);
        if (var2 == null) {
            return null;
        } else {
            var2.method1505(this.field883);
            return var2;
        }
    }
}
