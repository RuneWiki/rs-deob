package deob;

@ObfuscatedName("df")
public final class class79 extends class286 {

    @ObfuscatedName("df.aq")
    public int field972;

    @ObfuscatedName("df.ad")
    public int field963;

    @ObfuscatedName("df.ag")
    public int field965;

    @ObfuscatedName("df.ak")
    public int field966;

    @ObfuscatedName("df.ap")
    public int field967;

    @ObfuscatedName("df.an")
    public int field977;

    @ObfuscatedName("df.aj")
    public int field969;

    @ObfuscatedName("df.av")
    public int field986;

    @ObfuscatedName("df.ab")
    public int field971;

    @ObfuscatedName("df.ai")
    public int field970;

    @ObfuscatedName("df.ae")
    public int field973;

    @ObfuscatedName("df.au")
    public int field974;

    @ObfuscatedName("df.ah")
    public int field975;

    @ObfuscatedName("df.az")
    public int field976;

    @ObfuscatedName("df.ax")
    public int field989;

    @ObfuscatedName("df.ac")
    public boolean field993;

    @ObfuscatedName("df.al")
    public double field979;

    @ObfuscatedName("df.ay")
    public double field980;

    @ObfuscatedName("df.ao")
    public double field981;

    @ObfuscatedName("df.aa")
    public double field982;

    @ObfuscatedName("df.as")
    public double field983;

    @ObfuscatedName("df.aw")
    public double field985;

    @ObfuscatedName("df.at")
    public double field988;

    @ObfuscatedName("df.af")
    public double field964;

    @ObfuscatedName("df.am")
    public int field987;

    @ObfuscatedName("df.ar")
    public int field984;

    @ObfuscatedName("df.bt")
    public class210 field968;

    @ObfuscatedName("df.bj")
    public int field990;

    @ObfuscatedName("df.be")
    public int field991;

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field993 = false;
        this.field990 = 0;
        this.field991 = 0;
        this.field972 = arg0;
        this.field963 = arg1;
        this.field965 = arg2;
        this.field966 = arg3;
        this.field967 = arg4;
        this.field970 = arg5;
        this.field973 = arg6;
        this.field974 = arg7;
        this.field975 = arg8;
        this.field989 = arg9;
        this.field977 = arg10;
        this.field993 = false;
        int var12 = class198.method3271(this.field972).field2081;
        if (var12 == -1) {
            this.field968 = null;
        } else {
            this.field968 = class210.method5910(var12);
        }
    }

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field976 = arg9;
    }

    @ObfuscatedName("df.aq(IIIII)V")
    public final void method2126(int arg0, int arg1, int arg2, int arg3) {
        this.field969 = arg0;
        this.field986 = arg1;
        this.field971 = arg2;
        if (!this.field993) {
            double var5 = (double) (this.field969 - this.field965);
            double var7 = (double) (this.field986 - this.field966);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field979 = (double) this.field975 * var5 / var9 + (double) this.field965;
            this.field980 = (double) this.field975 * var7 / var9 + (double) this.field966;
            this.field981 = (double) this.field967;
        }
        double var11 = (double) (this.field973 + 1 - arg3);
        this.field982 = ((double) this.field969 - this.field979) / var11;
        this.field983 = ((double) this.field986 - this.field980) / var11;
        this.field985 = Math.sqrt(this.field983 * this.field983 + this.field982 * this.field982);
        if (!this.field993) {
            this.field988 = -this.field985 * Math.tan((double) this.field974 * 0.02454369D);
        }
        this.field964 = ((double) this.field971 - this.field981 - this.field988 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("df.ad(II)V")
    public final void method2127(int arg0) {
        this.field993 = true;
        this.field979 += (double) arg0 * this.field982;
        this.field980 += (double) arg0 * this.field983;
        this.field981 += this.field964 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field988;
        this.field988 += (double) arg0 * this.field964;
        this.field987 = (int) (Math.atan2(this.field982, this.field983) * 325.949D) + 1024 & 0x7FF;
        this.field984 = (int) (Math.atan2(this.field988, this.field985) * 325.949D) & 0x7FF;
        if (this.field968 == null) {
            return;
        }
        if (this.field968.method3748()) {
            this.field990 += arg0;
            int var2 = this.field968.method3757();
            if (this.field990 >= var2) {
                this.field990 = var2 - this.field968.field2295;
            }
            return;
        }
        this.field991 += arg0;
        while (true) {
            do {
                do {
                    if (this.field991 <= this.field968.field2285[this.field990]) {
                        return;
                    }
                    this.field991 -= this.field968.field2285[this.field990];
                    this.field990++;
                } while (this.field990 < this.field968.field2291.length);
                this.field990 -= this.field968.field2295;
            } while (this.field990 >= 0 && this.field990 < this.field968.field2291.length);
            this.field990 = 0;
        }
    }

    @ObfuscatedName("df.ah(I)Llv;")
    public final class294 method2050() {
        class198 var1 = class198.method3271(this.field972);
        class294 var2 = var1.method3467(this.field990);
        if (var2 == null) {
            return null;
        } else {
            var2.method5287(this.field984);
            return var2;
        }
    }
}
