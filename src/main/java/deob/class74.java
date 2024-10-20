package deob;

@ObfuscatedName("bj")
public final class class74 extends class218 {

    @ObfuscatedName("bj.h")
    public int field971;

    @ObfuscatedName("bj.e")
    public int field980;

    @ObfuscatedName("bj.v")
    public int field959;

    @ObfuscatedName("bj.x")
    public int field960;

    @ObfuscatedName("bj.m")
    public int field962;

    @ObfuscatedName("bj.q")
    public int field958;

    @ObfuscatedName("bj.f")
    public int field968;

    @ObfuscatedName("bj.r")
    public int field964;

    @ObfuscatedName("bj.u")
    public int field974;

    @ObfuscatedName("bj.b")
    public int field957;

    @ObfuscatedName("bj.j")
    public int field967;

    @ObfuscatedName("bj.g")
    public boolean field966 = false;

    @ObfuscatedName("bj.i")
    public double field969;

    @ObfuscatedName("bj.o")
    public double field970;

    @ObfuscatedName("bj.n")
    public double field965;

    @ObfuscatedName("bj.k")
    public double field972;

    @ObfuscatedName("bj.a")
    public double field973;

    @ObfuscatedName("bj.s")
    public double field961;

    @ObfuscatedName("bj.l")
    public double field975;

    @ObfuscatedName("bj.t")
    public double field976;

    @ObfuscatedName("bj.c")
    public int field977;

    @ObfuscatedName("bj.p")
    public int field978;

    @ObfuscatedName("bj.d")
    public class199 field979;

    @ObfuscatedName("bj.y")
    public int field963 = 0;

    @ObfuscatedName("bj.z")
    public int field981 = 0;

    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field971 = arg0;
        this.field980 = arg1;
        this.field959 = arg2;
        this.field960 = arg3;
        this.field962 = arg4;
        this.field968 = arg5;
        this.field964 = arg6;
        this.field974 = arg7;
        this.field957 = arg8;
        this.field967 = arg9;
        this.field958 = arg10;
        this.field966 = false;
        int var12 = class189.method3000(this.field971).field2084;
        if (var12 == -1) {
            this.field979 = null;
        } else {
            this.field979 = class199.method4223(var12);
        }
    }

    @ObfuscatedName("bj.h(IIIII)V")
    public final void method1990(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field966) {
            double var5 = (double) (arg0 - this.field959);
            double var7 = (double) (arg1 - this.field960);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field969 = (double) this.field957 * var5 / var9 + (double) this.field959;
            this.field970 = (double) this.field957 * var7 / var9 + (double) this.field960;
            this.field965 = (double) this.field962;
        }
        double var11 = (double) (this.field964 + 1 - arg3);
        this.field972 = ((double) arg0 - this.field969) / var11;
        this.field973 = ((double) arg1 - this.field970) / var11;
        this.field961 = Math.sqrt(this.field973 * this.field973 + this.field972 * this.field972);
        if (!this.field966) {
            this.field975 = -this.field961 * Math.tan((double) this.field974 * 0.02454369D);
        }
        this.field976 = ((double) arg2 - this.field965 - this.field975 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bj.m(II)V")
    public final void method1991(int arg0) {
        this.field966 = true;
        this.field969 += (double) arg0 * this.field972;
        this.field970 += (double) arg0 * this.field973;
        this.field965 += this.field976 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field975;
        this.field975 += (double) arg0 * this.field976;
        this.field977 = (int) (Math.atan2(this.field972, this.field973) * 325.949D) + 1024 & 0x7FF;
        this.field978 = (int) (Math.atan2(this.field975, this.field961) * 325.949D) & 0x7FF;
        if (this.field979 == null) {
            return;
        }
        if (this.field979.method3671()) {
            this.field963 += arg0;
            int var2 = this.field979.method3675();
            if (this.field963 >= var2) {
                this.field963 = var2 - this.field979.field2298;
            }
            return;
        }
        this.field981 += arg0;
        while (true) {
            do {
                do {
                    if (this.field981 <= this.field979.field2289[this.field963]) {
                        return;
                    }
                    this.field981 -= this.field979.field2289[this.field963];
                    this.field963++;
                } while (this.field963 < this.field979.field2295.length);
                this.field963 -= this.field979.field2298;
            } while (this.field963 >= 0 && this.field963 < this.field979.field2295.length);
            this.field963 = 0;
        }
    }

    @ObfuscatedName("bj.e(I)Lhh;")
    public final class224 method1915() {
        class189 var1 = class189.method3000(this.field971);
        class224 var2 = var1.method3385(this.field963);
        if (var2 == null) {
            return null;
        } else {
            var2.method4328(this.field978);
            return var2;
        }
    }
}
