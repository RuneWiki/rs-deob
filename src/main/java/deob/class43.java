package deob;

@ObfuscatedName("ag")
public final class class43 extends class90 {

    @ObfuscatedName("ag.q")
    public int field892;

    @ObfuscatedName("ag.d")
    public int field879;

    @ObfuscatedName("ag.h")
    public int field880;

    @ObfuscatedName("ag.p")
    public int field881;

    @ObfuscatedName("ag.j")
    public int field893;

    @ObfuscatedName("ag.n")
    public int field882;

    @ObfuscatedName("ag.r")
    public int field884;

    @ObfuscatedName("ag.c")
    public int field878;

    @ObfuscatedName("ag.i")
    public int field903;

    @ObfuscatedName("ag.o")
    public int field887;

    @ObfuscatedName("ag.m")
    public int field888;

    @ObfuscatedName("ag.s")
    public boolean field885 = false;

    @ObfuscatedName("ag.u")
    public double field890;

    @ObfuscatedName("ag.b")
    public double field896;

    @ObfuscatedName("ag.v")
    public double field889;

    @ObfuscatedName("ag.f")
    public double field898;

    @ObfuscatedName("ag.z")
    public double field894;

    @ObfuscatedName("ag.t")
    public double field895;

    @ObfuscatedName("ag.y")
    public double field902;

    @ObfuscatedName("ag.w")
    public double field897;

    @ObfuscatedName("ag.a")
    public int field883;

    @ObfuscatedName("ag.k")
    public int field899;

    @ObfuscatedName("ag.l")
    public class202 field900;

    @ObfuscatedName("ag.x")
    public int field886 = 0;

    @ObfuscatedName("ag.g")
    public int field901 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field892 = arg0;
        this.field879 = arg1;
        this.field880 = arg2;
        this.field881 = arg3;
        this.field893 = arg4;
        this.field884 = arg5;
        this.field878 = arg6;
        this.field903 = arg7;
        this.field887 = arg8;
        this.field888 = arg9;
        this.field882 = arg10;
        this.field885 = false;
        int var12 = class191.method1883(this.field892).field2808;
        if (var12 == -1) {
            this.field900 = null;
        } else {
            this.field900 = class202.method3379(var12);
        }
    }

    @ObfuscatedName("ag.q(IIIII)V")
    public final void method856(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field885) {
            double var5 = (double) (arg0 - this.field880);
            double var7 = (double) (arg1 - this.field881);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field890 = (double) this.field887 * var5 / var9 + (double) this.field880;
            this.field896 = (double) this.field887 * var7 / var9 + (double) this.field881;
            this.field889 = (double) this.field893;
        }
        double var11 = (double) (this.field878 + 1 - arg3);
        this.field898 = ((double) arg0 - this.field890) / var11;
        this.field894 = ((double) arg1 - this.field896) / var11;
        this.field895 = Math.sqrt(this.field898 * this.field898 + this.field894 * this.field894);
        if (!this.field885) {
            this.field902 = -this.field895 * Math.tan((double) this.field903 * 0.02454369D);
        }
        this.field897 = ((double) arg2 - this.field889 - this.field902 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ag.d(II)V")
    public final void method857(int arg0) {
        this.field885 = true;
        this.field890 += (double) arg0 * this.field898;
        this.field896 += (double) arg0 * this.field894;
        this.field889 += this.field897 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field902;
        this.field902 += (double) arg0 * this.field897;
        this.field883 = (int) (Math.atan2(this.field898, this.field894) * 325.949D) + 1024 & 0x7FF;
        this.field899 = (int) (Math.atan2(this.field902, this.field895) * 325.949D) & 0x7FF;
        if (this.field900 == null) {
            return;
        }
        this.field901 += arg0;
        while (true) {
            do {
                do {
                    if (this.field901 <= this.field900.field3064[this.field886]) {
                        return;
                    }
                    this.field901 -= this.field900.field3064[this.field886];
                    this.field886++;
                } while (this.field886 < this.field900.field3057.length);
                this.field886 -= this.field900.field3068;
            } while (this.field886 >= 0 && this.field886 < this.field900.field3057.length);
            this.field886 = 0;
        }
    }

    @ObfuscatedName("ag.h(I)Lcf;")
    public final class83 method229() {
        class191 var1 = class191.method1883(this.field892);
        class83 var2 = var1.method3279(this.field886);
        if (var2 == null) {
            return null;
        } else {
            var2.method1546(this.field899);
            return var2;
        }
    }
}
