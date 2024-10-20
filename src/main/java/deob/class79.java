package deob;

@ObfuscatedName("dv")
public final class class79 extends class189 {

    @ObfuscatedName("dv.ab")
    public int field967;

    @ObfuscatedName("dv.ay")
    public int field945;

    @ObfuscatedName("dv.an")
    public int field947;

    @ObfuscatedName("dv.au")
    public int field948;

    @ObfuscatedName("dv.ax")
    public int field949;

    @ObfuscatedName("dv.ao")
    public int field969;

    @ObfuscatedName("dv.am")
    public int field946;

    @ObfuscatedName("dv.ac")
    public int field965;

    @ObfuscatedName("dv.ae")
    public int field976;

    @ObfuscatedName("dv.ad")
    public int field954;

    @ObfuscatedName("dv.aq")
    public int field955;

    @ObfuscatedName("dv.al")
    public int field956;

    @ObfuscatedName("dv.aj")
    public int field957;

    @ObfuscatedName("dv.as")
    public int field958;

    @ObfuscatedName("dv.aw")
    public int field951;

    @ObfuscatedName("dv.af")
    public boolean field960;

    @ObfuscatedName("dv.aa")
    public double field961;

    @ObfuscatedName("dv.ah")
    public double field962;

    @ObfuscatedName("dv.ag")
    public double field963;

    @ObfuscatedName("dv.av")
    public double field964;

    @ObfuscatedName("dv.ar")
    public double field959;

    @ObfuscatedName("dv.ap")
    public double field970;

    @ObfuscatedName("dv.ak")
    public double field952;

    @ObfuscatedName("dv.ai")
    public double field953;

    @ObfuscatedName("dv.at")
    public int field950;

    @ObfuscatedName("dv.az")
    public int field966;

    @ObfuscatedName("dv.bg")
    public class264 field971;

    @ObfuscatedName("dv.bz")
    public int field972;

    @ObfuscatedName("dv.bj")
    public int field973;

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field960 = false;
        this.field972 = 0;
        this.field973 = 0;
        this.field967 = arg0;
        this.field945 = arg1;
        this.field947 = arg2;
        this.field948 = arg3;
        this.field949 = arg4;
        this.field954 = arg5;
        this.field955 = arg6;
        this.field956 = arg7;
        this.field957 = arg8;
        this.field951 = arg9;
        this.field969 = arg10;
        this.field960 = false;
        int var12 = class251.method5487(this.field967).field2649;
        if (var12 == -1) {
            this.field971 = null;
        } else {
            this.field971 = class264.method3551(var12);
        }
    }

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field958 = arg9;
    }

    @ObfuscatedName("dv.ab(IIIIB)V")
    public final void method2185(int arg0, int arg1, int arg2, int arg3) {
        this.field946 = arg0;
        this.field965 = arg1;
        this.field976 = arg2;
        if (!this.field960) {
            double var5 = (double) (this.field946 - this.field947);
            double var7 = (double) (this.field965 - this.field948);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field961 = (double) this.field957 * var5 / var9 + (double) this.field947;
            this.field962 = (double) this.field957 * var7 / var9 + (double) this.field948;
            this.field963 = (double) this.field949;
        }
        double var11 = (double) (this.field955 + 1 - arg3);
        this.field964 = ((double) this.field946 - this.field961) / var11;
        this.field959 = ((double) this.field965 - this.field962) / var11;
        this.field970 = Math.sqrt(this.field964 * this.field964 + this.field959 * this.field959);
        if (!this.field960) {
            this.field952 = -this.field970 * Math.tan((double) this.field956 * 0.02454369D);
        }
        this.field953 = ((double) this.field976 - this.field963 - this.field952 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("dv.ay(II)V")
    public final void method2178(int arg0) {
        this.field960 = true;
        this.field961 += (double) arg0 * this.field964;
        this.field962 += (double) arg0 * this.field959;
        this.field963 += this.field953 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field952;
        this.field952 += (double) arg0 * this.field953;
        this.field950 = (int) (Math.atan2(this.field964, this.field959) * 325.949D) + 1024 & 0x7FF;
        this.field966 = (int) (Math.atan2(this.field952, this.field970) * 325.949D) & 0x7FF;
        if (this.field971 == null) {
            return;
        }
        if (this.field971.method4915()) {
            this.field972 += arg0;
            int var2 = this.field971.method4907();
            if (this.field972 >= var2) {
                this.field972 = var2 - this.field971.field2876;
            }
            return;
        }
        this.field973 += arg0;
        while (true) {
            do {
                do {
                    if (this.field973 <= this.field971.field2874[this.field972]) {
                        return;
                    }
                    this.field973 -= this.field971.field2874[this.field972];
                    this.field972++;
                } while (this.field972 < this.field971.field2872.length);
                this.field972 -= this.field971.field2876;
            } while (this.field972 >= 0 && this.field972 < this.field971.field2872.length);
            this.field972 = 0;
        }
    }

    @ObfuscatedName("dv.ae(I)Lhr;")
    public final class197 method2088() {
        class251 var1 = class251.method5487(this.field967);
        class197 var2 = var1.method4597(this.field972);
        if (var2 == null) {
            return null;
        } else {
            var2.method3923(this.field966);
            return var2;
        }
    }
}
