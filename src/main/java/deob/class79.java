package deob;

@ObfuscatedName("dv")
public final class class79 extends class247 {

    @ObfuscatedName("dv.ac")
    public int field984;

    @ObfuscatedName("dv.al")
    public int field970;

    @ObfuscatedName("dv.ak")
    public int field971;

    @ObfuscatedName("dv.ax")
    public int field972;

    @ObfuscatedName("dv.ao")
    public int field982;

    @ObfuscatedName("dv.ah")
    public int field993;

    @ObfuscatedName("dv.ar")
    public int field975;

    @ObfuscatedName("dv.ab")
    public int field976;

    @ObfuscatedName("dv.am")
    public int field990;

    @ObfuscatedName("dv.av")
    public int field973;

    @ObfuscatedName("dv.ag")
    public int field979;

    @ObfuscatedName("dv.aa")
    public int field980;

    @ObfuscatedName("dv.ap")
    public int field981;

    @ObfuscatedName("dv.ay")
    public int field977;

    @ObfuscatedName("dv.as")
    public int field969;

    @ObfuscatedName("dv.aj")
    public boolean field995;

    @ObfuscatedName("dv.an")
    public double field978;

    @ObfuscatedName("dv.au")
    public double field986;

    @ObfuscatedName("dv.ai")
    public double field987;

    @ObfuscatedName("dv.ae")
    public double field988;

    @ObfuscatedName("dv.aw")
    public double field989;

    @ObfuscatedName("dv.aq")
    public double field974;

    @ObfuscatedName("dv.az")
    public double field991;

    @ObfuscatedName("dv.at")
    public double field992;

    @ObfuscatedName("dv.af")
    public int field985;

    @ObfuscatedName("dv.ad")
    public int field994;

    @ObfuscatedName("dv.bn")
    public class223 field983;

    @ObfuscatedName("dv.bk")
    public int field996;

    @ObfuscatedName("dv.by")
    public int field997;

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field995 = false;
        this.field996 = 0;
        this.field997 = 0;
        this.field984 = arg0;
        this.field970 = arg1;
        this.field971 = arg2;
        this.field972 = arg3;
        this.field982 = arg4;
        this.field973 = arg5;
        this.field979 = arg6;
        this.field980 = arg7;
        this.field981 = arg8;
        this.field969 = arg9;
        this.field993 = arg10;
        this.field995 = false;
        int var12 = class211.method6757(this.field984).field2127;
        if (var12 == -1) {
            this.field983 = null;
        } else {
            this.field983 = class223.method687(var12);
        }
    }

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field977 = arg9;
    }

    @ObfuscatedName("dv.ac(IIIII)V")
    public final void method2084(int arg0, int arg1, int arg2, int arg3) {
        this.field975 = arg0;
        this.field976 = arg1;
        this.field990 = arg2;
        if (!this.field995) {
            double var5 = (double) (this.field975 - this.field971);
            double var7 = (double) (this.field976 - this.field972);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field978 = (double) this.field981 * var5 / var9 + (double) this.field971;
            this.field986 = (double) this.field981 * var7 / var9 + (double) this.field972;
            this.field987 = (double) this.field982;
        }
        double var11 = (double) (this.field979 + 1 - arg3);
        this.field988 = ((double) this.field975 - this.field978) / var11;
        this.field989 = ((double) this.field976 - this.field986) / var11;
        this.field974 = Math.sqrt(this.field989 * this.field989 + this.field988 * this.field988);
        if (!this.field995) {
            this.field991 = -this.field974 * Math.tan((double) this.field980 * 0.02454369D);
        }
        this.field992 = ((double) this.field990 - this.field987 - this.field991 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("dv.ak(II)V")
    public final void method2083(int arg0) {
        this.field995 = true;
        this.field978 += (double) arg0 * this.field988;
        this.field986 += (double) arg0 * this.field989;
        this.field987 += this.field992 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field991;
        this.field991 += (double) arg0 * this.field992;
        this.field985 = (int) (Math.atan2(this.field988, this.field989) * 325.949D) + 1024 & 0x7FF;
        this.field994 = (int) (Math.atan2(this.field991, this.field974) * 325.949D) & 0x7FF;
        if (this.field983 == null) {
            return;
        }
        if (this.field983.method3851()) {
            this.field996 += arg0;
            int var2 = this.field983.method3860();
            if (this.field996 >= var2) {
                this.field996 = var2 - this.field983.field2330;
            }
            return;
        }
        this.field997 += arg0;
        while (true) {
            do {
                do {
                    if (this.field997 <= this.field983.field2313[this.field996]) {
                        return;
                    }
                    this.field997 -= this.field983.field2313[this.field996];
                    this.field996++;
                } while (this.field996 < this.field983.field2326.length);
                this.field996 -= this.field983.field2330;
            } while (this.field996 >= 0 && this.field996 < this.field983.field2326.length);
            this.field996 = 0;
        }
    }

    @ObfuscatedName("dv.al(B)Ljn;")
    public final class254 method2007() {
        class211 var1 = class211.method6757(this.field984);
        class254 var2 = var1.method3537(this.field996);
        if (var2 == null) {
            return null;
        } else {
            var2.method4542(this.field994);
            return var2;
        }
    }
}
