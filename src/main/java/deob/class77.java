package deob;

@ObfuscatedName("co")
public final class class77 extends class232 {

    @ObfuscatedName("co.at")
    public int field969;

    @ObfuscatedName("co.an")
    public int field958;

    @ObfuscatedName("co.av")
    public int field982;

    @ObfuscatedName("co.as")
    public int field959;

    @ObfuscatedName("co.ax")
    public int field963;

    @ObfuscatedName("co.ap")
    public int field962;

    @ObfuscatedName("co.ab")
    public int field980;

    @ObfuscatedName("co.ak")
    public int field964;

    @ObfuscatedName("co.ae")
    public int field965;

    @ObfuscatedName("co.af")
    public int field966;

    @ObfuscatedName("co.ao")
    public int field967;

    @ObfuscatedName("co.aa")
    public boolean field961 = false;

    @ObfuscatedName("co.aj")
    public double field975;

    @ObfuscatedName("co.ad")
    public double field973;

    @ObfuscatedName("co.ac")
    public double field970;

    @ObfuscatedName("co.ag")
    public double field972;

    @ObfuscatedName("co.ar")
    public double field968;

    @ObfuscatedName("co.ah")
    public double field974;

    @ObfuscatedName("co.az")
    public double field981;

    @ObfuscatedName("co.au")
    public double field976;

    @ObfuscatedName("co.ai")
    public int field977;

    @ObfuscatedName("co.aq")
    public int field978;

    @ObfuscatedName("co.aw")
    public class208 field979;

    @ObfuscatedName("co.ay")
    public int field957 = 0;

    @ObfuscatedName("co.al")
    public int field960 = 0;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field969 = arg0;
        this.field958 = arg1;
        this.field982 = arg2;
        this.field959 = arg3;
        this.field963 = arg4;
        this.field980 = arg5;
        this.field964 = arg6;
        this.field965 = arg7;
        this.field966 = arg8;
        this.field967 = arg9;
        this.field962 = arg10;
        this.field961 = false;
        int var12 = class198.method983(this.field969).field2068;
        if (var12 == -1) {
            this.field979 = null;
        } else {
            this.field979 = class208.method4648(var12);
        }
    }

    @ObfuscatedName("co.at(IIIIB)V")
    public final void method2023(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field961) {
            double var5 = (double) (arg0 - this.field982);
            double var7 = (double) (arg1 - this.field959);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field975 = (double) this.field966 * var5 / var9 + (double) this.field982;
            this.field973 = (double) this.field966 * var7 / var9 + (double) this.field959;
            this.field970 = (double) this.field963;
        }
        double var11 = (double) (this.field964 + 1 - arg3);
        this.field972 = ((double) arg0 - this.field975) / var11;
        this.field968 = ((double) arg1 - this.field973) / var11;
        this.field974 = Math.sqrt(this.field972 * this.field972 + this.field968 * this.field968);
        if (!this.field961) {
            this.field981 = -this.field974 * Math.tan((double) this.field965 * 0.02454369D);
        }
        this.field976 = ((double) arg2 - this.field970 - this.field981 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("co.av(IB)V")
    public final void method2022(int arg0) {
        this.field961 = true;
        this.field975 += (double) arg0 * this.field972;
        this.field973 += (double) arg0 * this.field968;
        this.field970 += this.field976 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field981;
        this.field981 += (double) arg0 * this.field976;
        this.field977 = (int) (Math.atan2(this.field972, this.field968) * 325.949D) + 1024 & 0x7FF;
        this.field978 = (int) (Math.atan2(this.field981, this.field974) * 325.949D) & 0x7FF;
        if (this.field979 == null) {
            return;
        }
        if (this.field979.method3754()) {
            this.field957 += arg0;
            int var2 = this.field979.method3757();
            if (this.field957 >= var2) {
                this.field957 = var2 - this.field979.field2289;
            }
            return;
        }
        this.field960 += arg0;
        while (true) {
            do {
                do {
                    if (this.field960 <= this.field979.field2287[this.field957]) {
                        return;
                    }
                    this.field960 -= this.field979.field2287[this.field957];
                    this.field957++;
                } while (this.field957 < this.field979.field2285.length);
                this.field957 -= this.field979.field2289;
            } while (this.field957 >= 0 && this.field957 < this.field979.field2285.length);
            this.field957 = 0;
        }
    }

    @ObfuscatedName("co.an(I)Ljd;")
    public final class239 method1952() {
        class198 var1 = class198.method983(this.field969);
        class239 var2 = var1.method3438(this.field957);
        if (var2 == null) {
            return null;
        } else {
            var2.method4475(this.field978);
            return var2;
        }
    }
}
