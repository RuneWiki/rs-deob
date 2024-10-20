package deob;

@ObfuscatedName("ap")
public final class class43 extends class90 {

    @ObfuscatedName("ap.x")
    public int field901;

    @ObfuscatedName("ap.j")
    public int field885;

    @ObfuscatedName("ap.c")
    public int field886;

    @ObfuscatedName("ap.d")
    public int field904;

    @ObfuscatedName("ap.w")
    public int field898;

    @ObfuscatedName("ap.h")
    public int field895;

    @ObfuscatedName("ap.u")
    public int field889;

    @ObfuscatedName("ap.k")
    public int field891;

    @ObfuscatedName("ap.g")
    public int field892;

    @ObfuscatedName("ap.y")
    public int field893;

    @ObfuscatedName("ap.e")
    public int field894;

    @ObfuscatedName("ap.q")
    public boolean field887 = false;

    @ObfuscatedName("ap.v")
    public double field909;

    @ObfuscatedName("ap.l")
    public double field897;

    @ObfuscatedName("ap.s")
    public double field902;

    @ObfuscatedName("ap.r")
    public double field899;

    @ObfuscatedName("ap.m")
    public double field900;

    @ObfuscatedName("ap.i")
    public double field908;

    @ObfuscatedName("ap.f")
    public double field896;

    @ObfuscatedName("ap.b")
    public double field903;

    @ObfuscatedName("ap.t")
    public int field888;

    @ObfuscatedName("ap.z")
    public int field905;

    @ObfuscatedName("ap.p")
    public class202 field906;

    @ObfuscatedName("ap.n")
    public int field907 = 0;

    @ObfuscatedName("ap.a")
    public int field890 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field901 = arg0;
        this.field885 = arg1;
        this.field886 = arg2;
        this.field904 = arg3;
        this.field898 = arg4;
        this.field889 = arg5;
        this.field891 = arg6;
        this.field892 = arg7;
        this.field893 = arg8;
        this.field894 = arg9;
        this.field895 = arg10;
        this.field887 = false;
        int var12 = class191.method3043(this.field901).field2793;
        if (var12 == -1) {
            this.field906 = null;
        } else {
            this.field906 = class202.method2997(var12);
        }
    }

    @ObfuscatedName("ap.x(IIIII)V")
    public final void method848(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field887) {
            double var5 = (double) (arg0 - this.field886);
            double var7 = (double) (arg1 - this.field904);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field909 = (double) this.field893 * var5 / var9 + (double) this.field886;
            this.field897 = (double) this.field893 * var7 / var9 + (double) this.field904;
            this.field902 = (double) this.field898;
        }
        double var11 = (double) (this.field891 + 1 - arg3);
        this.field899 = ((double) arg0 - this.field909) / var11;
        this.field900 = ((double) arg1 - this.field897) / var11;
        this.field908 = Math.sqrt(this.field900 * this.field900 + this.field899 * this.field899);
        if (!this.field887) {
            this.field896 = -this.field908 * Math.tan((double) this.field892 * 0.02454369D);
        }
        this.field903 = ((double) arg2 - this.field902 - this.field896 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ap.j(II)V")
    public final void method847(int arg0) {
        this.field887 = true;
        this.field909 += (double) arg0 * this.field899;
        this.field897 += (double) arg0 * this.field900;
        this.field902 += this.field903 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field896;
        this.field896 += (double) arg0 * this.field903;
        this.field888 = (int) (Math.atan2(this.field899, this.field900) * 325.949D) + 1024 & 0x7FF;
        this.field905 = (int) (Math.atan2(this.field896, this.field908) * 325.949D) & 0x7FF;
        if (this.field906 == null) {
            return;
        }
        this.field890 += arg0;
        while (true) {
            do {
                do {
                    if (this.field890 <= this.field906.field3061[this.field907]) {
                        return;
                    }
                    this.field890 -= this.field906.field3061[this.field907];
                    this.field907++;
                } while (this.field907 < this.field906.field3064.length);
                this.field907 -= this.field906.field3063;
            } while (this.field907 >= 0 && this.field907 < this.field906.field3064.length);
            this.field907 = 0;
        }
    }

    @ObfuscatedName("ap.c(S)Lcj;")
    public final class83 method247() {
        class191 var1 = class191.method3043(this.field901);
        class83 var2 = var1.method3261(this.field907);
        if (var2 == null) {
            return null;
        } else {
            var2.method1541(this.field905);
            return var2;
        }
    }
}
