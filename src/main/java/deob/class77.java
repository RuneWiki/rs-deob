package deob;

@ObfuscatedName("ck")
public final class class77 extends class273 {

    @ObfuscatedName("ck.at")
    public int field959;

    @ObfuscatedName("ck.ah")
    public int field963;

    @ObfuscatedName("ck.ar")
    public int field940;

    @ObfuscatedName("ck.ao")
    public int field962;

    @ObfuscatedName("ck.ab")
    public int field942;

    @ObfuscatedName("ck.au")
    public int field943;

    @ObfuscatedName("ck.aa")
    public int field961;

    @ObfuscatedName("ck.ac")
    public int field939;

    @ObfuscatedName("ck.al")
    public int field946;

    @ObfuscatedName("ck.az")
    public int field948;

    @ObfuscatedName("ck.ap")
    public int field967;

    @ObfuscatedName("ck.av")
    public int field949;

    @ObfuscatedName("ck.ax")
    public int field950;

    @ObfuscatedName("ck.as")
    public int field951;

    @ObfuscatedName("ck.ay")
    public int field952;

    @ObfuscatedName("ck.ak")
    public boolean field953;

    @ObfuscatedName("ck.aj")
    public double field954;

    @ObfuscatedName("ck.am")
    public double field955;

    @ObfuscatedName("ck.aq")
    public double field956;

    @ObfuscatedName("ck.ai")
    public double field957;

    @ObfuscatedName("ck.aw")
    public double field958;

    @ObfuscatedName("ck.ae")
    public double field945;

    @ObfuscatedName("ck.an")
    public double field947;

    @ObfuscatedName("ck.ag")
    public double field944;

    @ObfuscatedName("ck.ad")
    public int field941;

    @ObfuscatedName("ck.af")
    public int field960;

    @ObfuscatedName("ck.be")
    public class205 field964;

    @ObfuscatedName("ck.bd")
    public int field965;

    @ObfuscatedName("ck.bl")
    public int field966;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field953 = false;
        this.field965 = 0;
        this.field966 = 0;
        this.field959 = arg0;
        this.field963 = arg1;
        this.field940 = arg2;
        this.field962 = arg3;
        this.field942 = arg4;
        this.field948 = arg5;
        this.field967 = arg6;
        this.field949 = arg7;
        this.field950 = arg8;
        this.field952 = arg9;
        this.field943 = arg10;
        this.field953 = false;
        int var12 = class194.method318(this.field959).field2009;
        if (var12 == -1) {
            this.field964 = null;
        } else {
            this.field964 = class205.method2129(var12);
        }
    }

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field951 = arg9;
    }

    @ObfuscatedName("ck.at(IIIII)V")
    public final void method2097(int arg0, int arg1, int arg2, int arg3) {
        this.field961 = arg0;
        this.field939 = arg1;
        this.field946 = arg2;
        if (!this.field953) {
            double var5 = (double) (this.field961 - this.field940);
            double var7 = (double) (this.field939 - this.field962);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field954 = (double) this.field950 * var5 / var9 + (double) this.field940;
            this.field955 = (double) this.field950 * var7 / var9 + (double) this.field962;
            this.field956 = (double) this.field942;
        }
        double var11 = (double) (this.field967 + 1 - arg3);
        this.field957 = ((double) this.field961 - this.field954) / var11;
        this.field958 = ((double) this.field939 - this.field955) / var11;
        this.field945 = Math.sqrt(this.field958 * this.field958 + this.field957 * this.field957);
        if (!this.field953) {
            this.field947 = -this.field945 * Math.tan((double) this.field949 * 0.02454369D);
        }
        this.field944 = ((double) this.field946 - this.field956 - this.field947 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.ar(II)V")
    public final void method2093(int arg0) {
        this.field953 = true;
        this.field954 += (double) arg0 * this.field957;
        this.field955 += (double) arg0 * this.field958;
        this.field956 += this.field944 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field947;
        this.field947 += (double) arg0 * this.field944;
        this.field941 = (int) (Math.atan2(this.field957, this.field958) * 325.949D) + 1024 & 0x7FF;
        this.field960 = (int) (Math.atan2(this.field947, this.field945) * 325.949D) & 0x7FF;
        if (this.field964 == null) {
            return;
        }
        if (this.field964.method3733()) {
            this.field965 += arg0;
            int var2 = this.field964.method3749();
            if (this.field965 >= var2) {
                this.field965 = var2 - this.field964.field2228;
            }
            return;
        }
        this.field966 += arg0;
        while (true) {
            do {
                do {
                    if (this.field966 <= this.field964.field2218[this.field965]) {
                        return;
                    }
                    this.field966 -= this.field964.field2218[this.field965];
                    this.field965++;
                } while (this.field965 < this.field964.field2216.length);
                this.field965 -= this.field964.field2228;
            } while (this.field965 >= 0 && this.field965 < this.field964.field2216.length);
            this.field965 = 0;
        }
    }

    @ObfuscatedName("ck.ah(B)Lka;")
    public final class280 method2019() {
        class194 var1 = class194.method318(this.field959);
        class280 var2 = var1.method3447(this.field965);
        if (var2 == null) {
            return null;
        } else {
            var2.method5100(this.field960);
            return var2;
        }
    }
}
