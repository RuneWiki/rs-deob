package deob;

@ObfuscatedName("cv")
public final class class77 extends class234 {

    @ObfuscatedName("cv.aw")
    public int field976;

    @ObfuscatedName("cv.ay")
    public int field967;

    @ObfuscatedName("cv.ar")
    public int field964;

    @ObfuscatedName("cv.am")
    public int field965;

    @ObfuscatedName("cv.as")
    public int field962;

    @ObfuscatedName("cv.aj")
    public int field985;

    @ObfuscatedName("cv.ag")
    public int field968;

    @ObfuscatedName("cv.az")
    public int field969;

    @ObfuscatedName("cv.av")
    public int field970;

    @ObfuscatedName("cv.ap")
    public int field971;

    @ObfuscatedName("cv.aq")
    public int field972;

    @ObfuscatedName("cv.at")
    public boolean field973 = false;

    @ObfuscatedName("cv.ah")
    public double field974;

    @ObfuscatedName("cv.ax")
    public double field975;

    @ObfuscatedName("cv.aa")
    public double field984;

    @ObfuscatedName("cv.au")
    public double field977;

    @ObfuscatedName("cv.ae")
    public double field978;

    @ObfuscatedName("cv.ab")
    public double field979;

    @ObfuscatedName("cv.ad")
    public double field980;

    @ObfuscatedName("cv.ao")
    public double field981;

    @ObfuscatedName("cv.ac")
    public int field966;

    @ObfuscatedName("cv.ak")
    public int field987;

    @ObfuscatedName("cv.an")
    public class210 field982;

    @ObfuscatedName("cv.af")
    public int field963 = 0;

    @ObfuscatedName("cv.ai")
    public int field986 = 0;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field976 = arg0;
        this.field967 = arg1;
        this.field964 = arg2;
        this.field965 = arg3;
        this.field962 = arg4;
        this.field968 = arg5;
        this.field969 = arg6;
        this.field970 = arg7;
        this.field971 = arg8;
        this.field972 = arg9;
        this.field985 = arg10;
        this.field973 = false;
        int var12 = class199.method3394(this.field976).field2061;
        if (var12 == -1) {
            this.field982 = null;
        } else {
            this.field982 = class210.method2904(var12);
        }
    }

    @ObfuscatedName("cv.aw(IIIIB)V")
    public final void method2046(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field973) {
            double var5 = (double) (arg0 - this.field964);
            double var7 = (double) (arg1 - this.field965);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field974 = (double) this.field971 * var5 / var9 + (double) this.field964;
            this.field975 = (double) this.field971 * var7 / var9 + (double) this.field965;
            this.field984 = (double) this.field962;
        }
        double var11 = (double) (this.field969 + 1 - arg3);
        this.field977 = ((double) arg0 - this.field974) / var11;
        this.field978 = ((double) arg1 - this.field975) / var11;
        this.field979 = Math.sqrt(this.field978 * this.field978 + this.field977 * this.field977);
        if (!this.field973) {
            this.field980 = -this.field979 * Math.tan((double) this.field970 * 0.02454369D);
        }
        this.field981 = ((double) arg2 - this.field984 - this.field980 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cv.ar(II)V")
    public final void method2047(int arg0) {
        this.field973 = true;
        this.field974 += (double) arg0 * this.field977;
        this.field975 += (double) arg0 * this.field978;
        this.field984 += this.field981 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field980;
        this.field980 += (double) arg0 * this.field981;
        this.field966 = (int) (Math.atan2(this.field977, this.field978) * 325.949D) + 1024 & 0x7FF;
        this.field987 = (int) (Math.atan2(this.field980, this.field979) * 325.949D) & 0x7FF;
        if (this.field982 == null) {
            return;
        }
        if (this.field982.method3738()) {
            this.field963 += arg0;
            int var2 = this.field982.method3739();
            if (this.field963 >= var2) {
                this.field963 = var2 - this.field982.field2284;
            }
            return;
        }
        this.field986 += arg0;
        while (true) {
            do {
                do {
                    if (this.field986 <= this.field982.field2273[this.field963]) {
                        return;
                    }
                    this.field986 -= this.field982.field2273[this.field963];
                    this.field963++;
                } while (this.field963 < this.field982.field2265.length);
                this.field963 -= this.field982.field2284;
            } while (this.field963 >= 0 && this.field963 < this.field982.field2265.length);
            this.field963 = 0;
        }
    }

    @ObfuscatedName("cv.ay(I)Ljo;")
    public final class241 method1986() {
        class199 var1 = class199.method3394(this.field976);
        class241 var2 = var1.method3442(this.field963);
        if (var2 == null) {
            return null;
        } else {
            var2.method4442(this.field987);
            return var2;
        }
    }
}
