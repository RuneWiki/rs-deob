package deob;

@ObfuscatedName("ba")
public final class class70 extends class198 {

    @ObfuscatedName("ba.c")
    public int field934;

    @ObfuscatedName("ba.l")
    public int field936;

    @ObfuscatedName("ba.s")
    public int field930;

    @ObfuscatedName("ba.e")
    public int field931;

    @ObfuscatedName("ba.r")
    public int field947;

    @ObfuscatedName("ba.o")
    public int field933;

    @ObfuscatedName("ba.i")
    public int field945;

    @ObfuscatedName("ba.w")
    public int field935;

    @ObfuscatedName("ba.v")
    public int field943;

    @ObfuscatedName("ba.a")
    public int field937;

    @ObfuscatedName("ba.y")
    public int field938;

    @ObfuscatedName("ba.u")
    public boolean field946 = false;

    @ObfuscatedName("ba.h")
    public double field940;

    @ObfuscatedName("ba.q")
    public double field941;

    @ObfuscatedName("ba.x")
    public double field942;

    @ObfuscatedName("ba.p")
    public double field954;

    @ObfuscatedName("ba.n")
    public double field944;

    @ObfuscatedName("ba.m")
    public double field929;

    @ObfuscatedName("ba.d")
    public double field932;

    @ObfuscatedName("ba.j")
    public double field928;

    @ObfuscatedName("ba.f")
    public int field948;

    @ObfuscatedName("ba.g")
    public int field949;

    @ObfuscatedName("ba.t")
    public class183 field950;

    @ObfuscatedName("ba.k")
    public int field951 = 0;

    @ObfuscatedName("ba.b")
    public int field952 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field934 = arg0;
        this.field936 = arg1;
        this.field930 = arg2;
        this.field931 = arg3;
        this.field947 = arg4;
        this.field945 = arg5;
        this.field935 = arg6;
        this.field943 = arg7;
        this.field937 = arg8;
        this.field938 = arg9;
        this.field933 = arg10;
        this.field946 = false;
        int var12 = class173.method4901(this.field934).field1900;
        if (var12 == -1) {
            this.field950 = null;
        } else {
            this.field950 = class183.method1980(var12);
        }
    }

    @ObfuscatedName("ba.c(IIIII)V")
    public final void method1870(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field946) {
            double var5 = (double) (arg0 - this.field930);
            double var7 = (double) (arg1 - this.field931);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field940 = (double) this.field937 * var5 / var9 + (double) this.field930;
            this.field941 = (double) this.field937 * var7 / var9 + (double) this.field931;
            this.field942 = (double) this.field947;
        }
        double var11 = (double) (this.field935 + 1 - arg3);
        this.field954 = ((double) arg0 - this.field940) / var11;
        this.field944 = ((double) arg1 - this.field941) / var11;
        this.field929 = Math.sqrt(this.field954 * this.field954 + this.field944 * this.field944);
        if (!this.field946) {
            this.field932 = -this.field929 * Math.tan((double) this.field943 * 0.02454369D);
        }
        this.field928 = ((double) arg2 - this.field942 - this.field932 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ba.s(II)V")
    public final void method1868(int arg0) {
        this.field946 = true;
        this.field940 += (double) arg0 * this.field954;
        this.field941 += (double) arg0 * this.field944;
        this.field942 += this.field928 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field932;
        this.field932 += (double) arg0 * this.field928;
        this.field948 = (int) (Math.atan2(this.field954, this.field944) * 325.949D) + 1024 & 0x7FF;
        this.field949 = (int) (Math.atan2(this.field932, this.field929) * 325.949D) & 0x7FF;
        if (this.field950 == null) {
            return;
        }
        if (this.field950.method3284()) {
            this.field951 += arg0;
            int var2 = this.field950.method3321();
            if (this.field951 >= var2) {
                this.field951 = var2 - this.field950.field2111;
            }
            return;
        }
        this.field952 += arg0;
        while (true) {
            do {
                do {
                    if (this.field952 <= this.field950.field2094[this.field951]) {
                        return;
                    }
                    this.field952 -= this.field950.field2094[this.field951];
                    this.field951++;
                } while (this.field951 < this.field950.field2107.length);
                this.field951 -= this.field950.field2111;
            } while (this.field951 >= 0 && this.field951 < this.field950.field2107.length);
            this.field951 = 0;
        }
    }

    @ObfuscatedName("ba.l(B)Lgf;")
    public final class204 method1790() {
        class173 var1 = class173.method4901(this.field934);
        class204 var2 = var1.method3009(this.field951);
        if (var2 == null) {
            return null;
        } else {
            var2.method3822(this.field949);
            return var2;
        }
    }
}
