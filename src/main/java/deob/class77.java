package deob;

@ObfuscatedName("cx")
public final class class77 extends class276 {

    @ObfuscatedName("cx.am")
    public int field947;

    @ObfuscatedName("cx.ap")
    public int field948;

    @ObfuscatedName("cx.af")
    public int field949;

    @ObfuscatedName("cx.aj")
    public int field953;

    @ObfuscatedName("cx.aq")
    public int field951;

    @ObfuscatedName("cx.ar")
    public int field975;

    @ObfuscatedName("cx.ag")
    public int field961;

    @ObfuscatedName("cx.ao")
    public int field954;

    @ObfuscatedName("cx.ae")
    public int field955;

    @ObfuscatedName("cx.aa")
    public int field956;

    @ObfuscatedName("cx.au")
    public int field957;

    @ObfuscatedName("cx.an")
    public int field958;

    @ObfuscatedName("cx.ad")
    public int field959;

    @ObfuscatedName("cx.ax")
    public int field960;

    @ObfuscatedName("cx.aw")
    public int field968;

    @ObfuscatedName("cx.az")
    public boolean field962;

    @ObfuscatedName("cx.av")
    public double field963;

    @ObfuscatedName("cx.ak")
    public double field952;

    @ObfuscatedName("cx.ay")
    public double field965;

    @ObfuscatedName("cx.as")
    public double field971;

    @ObfuscatedName("cx.ab")
    public double field967;

    @ObfuscatedName("cx.ah")
    public double field950;

    @ObfuscatedName("cx.ai")
    public double field969;

    @ObfuscatedName("cx.ac")
    public double field970;

    @ObfuscatedName("cx.al")
    public int field964;

    @ObfuscatedName("cx.at")
    public int field972;

    @ObfuscatedName("cx.bj")
    public class205 field973;

    @ObfuscatedName("cx.bd")
    public int field974;

    @ObfuscatedName("cx.bg")
    public int field966;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field962 = false;
        this.field974 = 0;
        this.field966 = 0;
        this.field947 = arg0;
        this.field948 = arg1;
        this.field949 = arg2;
        this.field953 = arg3;
        this.field951 = arg4;
        this.field956 = arg5;
        this.field957 = arg6;
        this.field958 = arg7;
        this.field959 = arg8;
        this.field968 = arg9;
        this.field975 = arg10;
        this.field962 = false;
        int var12 = class194.method3107(this.field947).field2023;
        if (var12 == -1) {
            this.field973 = null;
        } else {
            this.field973 = class205.method73(var12);
        }
    }

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field960 = arg9;
    }

    @ObfuscatedName("cx.am(IIIII)V")
    public final void method2131(int arg0, int arg1, int arg2, int arg3) {
        this.field961 = arg0;
        this.field954 = arg1;
        this.field955 = arg2;
        if (!this.field962) {
            double var5 = (double) (this.field961 - this.field949);
            double var7 = (double) (this.field954 - this.field953);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field963 = (double) this.field959 * var5 / var9 + (double) this.field949;
            this.field952 = (double) this.field959 * var7 / var9 + (double) this.field953;
            this.field965 = (double) this.field951;
        }
        double var11 = (double) (this.field957 + 1 - arg3);
        this.field971 = ((double) this.field961 - this.field963) / var11;
        this.field967 = ((double) this.field954 - this.field952) / var11;
        this.field950 = Math.sqrt(this.field971 * this.field971 + this.field967 * this.field967);
        if (!this.field962) {
            this.field969 = -this.field950 * Math.tan((double) this.field958 * 0.02454369D);
        }
        this.field970 = ((double) this.field955 - this.field965 - this.field969 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cx.af(IB)V")
    public final void method2132(int arg0) {
        this.field962 = true;
        this.field963 += (double) arg0 * this.field971;
        this.field952 += (double) arg0 * this.field967;
        this.field965 += this.field970 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field969;
        this.field969 += (double) arg0 * this.field970;
        this.field964 = (int) (Math.atan2(this.field971, this.field967) * 325.949D) + 1024 & 0x7FF;
        this.field972 = (int) (Math.atan2(this.field969, this.field950) * 325.949D) & 0x7FF;
        if (this.field973 == null) {
            return;
        }
        if (this.field973.method3760()) {
            this.field974 += arg0;
            int var2 = this.field973.method3784();
            if (this.field974 >= var2) {
                this.field974 = var2 - this.field973.field2238;
            }
            return;
        }
        this.field966 += arg0;
        while (true) {
            do {
                do {
                    if (this.field966 <= this.field973.field2234[this.field974]) {
                        return;
                    }
                    this.field966 -= this.field973.field2234[this.field974];
                    this.field974++;
                } while (this.field974 < this.field973.field2222.length);
                this.field974 -= this.field973.field2238;
            } while (this.field974 >= 0 && this.field974 < this.field973.field2222.length);
            this.field974 = 0;
        }
    }

    @ObfuscatedName("cx.ap(I)Lko;")
    public final class283 method2053() {
        class194 var1 = class194.method3107(this.field947);
        class283 var2 = var1.method3472(this.field974);
        if (var2 == null) {
            return null;
        } else {
            var2.method5137(this.field972);
            return var2;
        }
    }
}
