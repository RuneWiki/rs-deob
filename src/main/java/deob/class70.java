package deob;

@ObfuscatedName("bf")
public final class class70 extends class206 {

    @ObfuscatedName("bf.c")
    public int field947;

    @ObfuscatedName("bf.p")
    public int field948;

    @ObfuscatedName("bf.f")
    public int field933;

    @ObfuscatedName("bf.n")
    public int field945;

    @ObfuscatedName("bf.k")
    public int field935;

    @ObfuscatedName("bf.w")
    public int field936;

    @ObfuscatedName("bf.s")
    public int field937;

    @ObfuscatedName("bf.q")
    public int field938;

    @ObfuscatedName("bf.m")
    public int field939;

    @ObfuscatedName("bf.x")
    public int field932;

    @ObfuscatedName("bf.j")
    public int field941;

    @ObfuscatedName("bf.v")
    public boolean field949 = false;

    @ObfuscatedName("bf.h")
    public double field943;

    @ObfuscatedName("bf.t")
    public double field946;

    @ObfuscatedName("bf.u")
    public double field942;

    @ObfuscatedName("bf.d")
    public double field934;

    @ObfuscatedName("bf.b")
    public double field931;

    @ObfuscatedName("bf.a")
    public double field956;

    @ObfuscatedName("bf.l")
    public double field940;

    @ObfuscatedName("bf.e")
    public double field953;

    @ObfuscatedName("bf.g")
    public int field951;

    @ObfuscatedName("bf.y")
    public int field952;

    @ObfuscatedName("bf.i")
    public class191 field944;

    @ObfuscatedName("bf.r")
    public int field954 = 0;

    @ObfuscatedName("bf.z")
    public int field955 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field947 = arg0;
        this.field948 = arg1;
        this.field933 = arg2;
        this.field945 = arg3;
        this.field935 = arg4;
        this.field937 = arg5;
        this.field938 = arg6;
        this.field939 = arg7;
        this.field932 = arg8;
        this.field941 = arg9;
        this.field936 = arg10;
        this.field949 = false;
        int var12 = class181.method5344(this.field947).field1993;
        if (var12 == -1) {
            this.field944 = null;
        } else {
            this.field944 = class191.method22(var12);
        }
    }

    @ObfuscatedName("bf.c(IIIIB)V")
    public final void method1998(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field949) {
            double var5 = (double) (arg0 - this.field933);
            double var7 = (double) (arg1 - this.field945);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field943 = (double) this.field932 * var5 / var9 + (double) this.field933;
            this.field946 = (double) this.field932 * var7 / var9 + (double) this.field945;
            this.field942 = (double) this.field935;
        }
        double var11 = (double) (this.field938 + 1 - arg3);
        this.field934 = ((double) arg0 - this.field943) / var11;
        this.field931 = ((double) arg1 - this.field946) / var11;
        this.field956 = Math.sqrt(this.field934 * this.field934 + this.field931 * this.field931);
        if (!this.field949) {
            this.field940 = -this.field956 * Math.tan((double) this.field939 * 0.02454369D);
        }
        this.field953 = ((double) arg2 - this.field942 - this.field940 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bf.f(II)V")
    public final void method2004(int arg0) {
        this.field949 = true;
        this.field943 += (double) arg0 * this.field934;
        this.field946 += (double) arg0 * this.field931;
        this.field942 += this.field953 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field940;
        this.field940 += (double) arg0 * this.field953;
        this.field951 = (int) (Math.atan2(this.field934, this.field931) * 325.949D) + 1024 & 0x7FF;
        this.field952 = (int) (Math.atan2(this.field940, this.field956) * 325.949D) & 0x7FF;
        if (this.field944 == null) {
            return;
        }
        if (this.field944.method3578()) {
            this.field954 += arg0;
            int var2 = this.field944.method3583();
            if (this.field954 >= var2) {
                this.field954 = var2 - this.field944.field2209;
            }
            return;
        }
        this.field955 += arg0;
        while (true) {
            do {
                do {
                    if (this.field955 <= this.field944.field2221[this.field954]) {
                        return;
                    }
                    this.field955 -= this.field944.field2221[this.field954];
                    this.field954++;
                } while (this.field954 < this.field944.field2205.length);
                this.field954 -= this.field944.field2209;
            } while (this.field954 >= 0 && this.field954 < this.field944.field2205.length);
            this.field954 = 0;
        }
    }

    @ObfuscatedName("bf.p(B)Lha;")
    public final class212 method1926() {
        class181 var1 = class181.method5344(this.field947);
        class212 var2 = var1.method3307(this.field954);
        if (var2 == null) {
            return null;
        } else {
            var2.method4151(this.field952);
            return var2;
        }
    }
}
