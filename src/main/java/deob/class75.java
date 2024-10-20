package deob;

@ObfuscatedName("ci")
public final class class75 extends class225 {

    @ObfuscatedName("ci.aj")
    public int field953;

    @ObfuscatedName("ci.al")
    public int field930;

    @ObfuscatedName("ci.ac")
    public int field931;

    @ObfuscatedName("ci.ab")
    public int field957;

    @ObfuscatedName("ci.an")
    public int field935;

    @ObfuscatedName("ci.ao")
    public int field934;

    @ObfuscatedName("ci.av")
    public int field952;

    @ObfuscatedName("ci.aq")
    public int field936;

    @ObfuscatedName("ci.ap")
    public int field937;

    @ObfuscatedName("ci.ar")
    public int field932;

    @ObfuscatedName("ci.ak")
    public int field939;

    @ObfuscatedName("ci.ax")
    public boolean field940 = false;

    @ObfuscatedName("ci.as")
    public double field955;

    @ObfuscatedName("ci.ay")
    public double field942;

    @ObfuscatedName("ci.am")
    public double field943;

    @ObfuscatedName("ci.az")
    public double field944;

    @ObfuscatedName("ci.ae")
    public double field945;

    @ObfuscatedName("ci.au")
    public double field933;

    @ObfuscatedName("ci.ag")
    public double field949;

    @ObfuscatedName("ci.at")
    public double field948;

    @ObfuscatedName("ci.af")
    public int field946;

    @ObfuscatedName("ci.ai")
    public int field950;

    @ObfuscatedName("ci.aw")
    public class206 field951;

    @ObfuscatedName("ci.aa")
    public int field938 = 0;

    @ObfuscatedName("ci.ah")
    public int field947 = 0;

    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field953 = arg0;
        this.field930 = arg1;
        this.field931 = arg2;
        this.field957 = arg3;
        this.field935 = arg4;
        this.field952 = arg5;
        this.field936 = arg6;
        this.field937 = arg7;
        this.field932 = arg8;
        this.field939 = arg9;
        this.field934 = arg10;
        this.field940 = false;
        int var12 = class195.method298(this.field953).field2057;
        if (var12 == -1) {
            this.field951 = null;
        } else {
            this.field951 = class206.method5217(var12);
        }
    }

    @ObfuscatedName("ci.aj(IIIII)V")
    public final void method2014(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field940) {
            double var5 = (double) (arg0 - this.field931);
            double var7 = (double) (arg1 - this.field957);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field955 = (double) this.field932 * var5 / var9 + (double) this.field931;
            this.field942 = (double) this.field932 * var7 / var9 + (double) this.field957;
            this.field943 = (double) this.field935;
        }
        double var11 = (double) (this.field936 + 1 - arg3);
        this.field944 = ((double) arg0 - this.field955) / var11;
        this.field945 = ((double) arg1 - this.field942) / var11;
        this.field933 = Math.sqrt(this.field945 * this.field945 + this.field944 * this.field944);
        if (!this.field940) {
            this.field949 = -this.field933 * Math.tan((double) this.field937 * 0.02454369D);
        }
        this.field948 = ((double) arg2 - this.field943 - this.field949 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ci.ac(IS)V")
    public final void method2016(int arg0) {
        this.field940 = true;
        this.field955 += (double) arg0 * this.field944;
        this.field942 += (double) arg0 * this.field945;
        this.field943 += this.field948 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field949;
        this.field949 += (double) arg0 * this.field948;
        this.field946 = (int) (Math.atan2(this.field944, this.field945) * 325.949D) + 1024 & 0x7FF;
        this.field950 = (int) (Math.atan2(this.field949, this.field933) * 325.949D) & 0x7FF;
        if (this.field951 == null) {
            return;
        }
        if (this.field951.method3694()) {
            this.field938 += arg0;
            int var2 = this.field951.method3695();
            if (this.field938 >= var2) {
                this.field938 = var2 - this.field951.field2263;
            }
            return;
        }
        this.field947 += arg0;
        while (true) {
            do {
                do {
                    if (this.field947 <= this.field951.field2264[this.field938]) {
                        return;
                    }
                    this.field947 -= this.field951.field2264[this.field938];
                    this.field938++;
                } while (this.field938 < this.field951.field2276.length);
                this.field938 -= this.field951.field2263;
            } while (this.field938 >= 0 && this.field938 < this.field951.field2276.length);
            this.field938 = 0;
        }
    }

    @ObfuscatedName("ci.al(I)Lix;")
    public final class231 method1936() {
        class195 var1 = class195.method298(this.field953);
        class231 var2 = var1.method3405(this.field938);
        if (var2 == null) {
            return null;
        } else {
            var2.method4257(this.field950);
            return var2;
        }
    }
}
