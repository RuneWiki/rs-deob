package deob;

@ObfuscatedName("cw")
public final class class73 extends class225 {

    @ObfuscatedName("cw.af")
    public int field940;

    @ObfuscatedName("cw.an")
    public int field931;

    @ObfuscatedName("cw.aw")
    public int field933;

    @ObfuscatedName("cw.ac")
    public int field934;

    @ObfuscatedName("cw.au")
    public int field935;

    @ObfuscatedName("cw.ab")
    public int field936;

    @ObfuscatedName("cw.aq")
    public int field937;

    @ObfuscatedName("cw.al")
    public int field938;

    @ObfuscatedName("cw.at")
    public int field939;

    @ObfuscatedName("cw.aa")
    public int field949;

    @ObfuscatedName("cw.ay")
    public int field941;

    @ObfuscatedName("cw.ao")
    public boolean field942 = false;

    @ObfuscatedName("cw.ax")
    public double field943;

    @ObfuscatedName("cw.ai")
    public double field944;

    @ObfuscatedName("cw.ag")
    public double field945;

    @ObfuscatedName("cw.ah")
    public double field946;

    @ObfuscatedName("cw.av")
    public double field953;

    @ObfuscatedName("cw.ar")
    public double field948;

    @ObfuscatedName("cw.am")
    public double field932;

    @ObfuscatedName("cw.as")
    public double field950;

    @ObfuscatedName("cw.aj")
    public int field951;

    @ObfuscatedName("cw.ak")
    public int field952;

    @ObfuscatedName("cw.az")
    public class204 field947;

    @ObfuscatedName("cw.ad")
    public int field954 = 0;

    @ObfuscatedName("cw.ae")
    public int field955 = 0;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field940 = arg0;
        this.field931 = arg1;
        this.field933 = arg2;
        this.field934 = arg3;
        this.field935 = arg4;
        this.field937 = arg5;
        this.field938 = arg6;
        this.field939 = arg7;
        this.field949 = arg8;
        this.field941 = arg9;
        this.field936 = arg10;
        this.field942 = false;
        int var12 = class194.method2130(this.field940).field2079;
        if (var12 == -1) {
            this.field947 = null;
        } else {
            this.field947 = class204.method2139(var12);
        }
    }

    @ObfuscatedName("cw.af(IIIII)V")
    public final void method2010(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field942) {
            double var5 = (double) (arg0 - this.field933);
            double var7 = (double) (arg1 - this.field934);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field943 = (double) this.field949 * var5 / var9 + (double) this.field933;
            this.field944 = (double) this.field949 * var7 / var9 + (double) this.field934;
            this.field945 = (double) this.field935;
        }
        double var11 = (double) (this.field938 + 1 - arg3);
        this.field946 = ((double) arg0 - this.field943) / var11;
        this.field953 = ((double) arg1 - this.field944) / var11;
        this.field948 = Math.sqrt(this.field953 * this.field953 + this.field946 * this.field946);
        if (!this.field942) {
            this.field932 = -this.field948 * Math.tan((double) this.field939 * 0.02454369D);
        }
        this.field950 = ((double) arg2 - this.field945 - this.field932 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cw.aw(II)V")
    public final void method2009(int arg0) {
        this.field942 = true;
        this.field943 += (double) arg0 * this.field946;
        this.field944 += (double) arg0 * this.field953;
        this.field945 += this.field950 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field932;
        this.field932 += (double) arg0 * this.field950;
        this.field951 = (int) (Math.atan2(this.field946, this.field953) * 325.949D) + 1024 & 0x7FF;
        this.field952 = (int) (Math.atan2(this.field932, this.field948) * 325.949D) & 0x7FF;
        if (this.field947 == null) {
            return;
        }
        if (this.field947.method3816()) {
            this.field954 += arg0;
            int var2 = this.field947.method3817();
            if (this.field954 >= var2) {
                this.field954 = var2 - this.field947.field2301;
            }
            return;
        }
        this.field955 += arg0;
        while (true) {
            do {
                do {
                    if (this.field955 <= this.field947.field2304[this.field954]) {
                        return;
                    }
                    this.field955 -= this.field947.field2304[this.field954];
                    this.field954++;
                } while (this.field954 < this.field947.field2300.length);
                this.field954 -= this.field947.field2301;
            } while (this.field954 >= 0 && this.field954 < this.field947.field2300.length);
            this.field954 = 0;
        }
    }

    @ObfuscatedName("cw.an(B)Lit;")
    public final class232 method1921() {
        class194 var1 = class194.method2130(this.field940);
        class232 var2 = var1.method3516(this.field954);
        if (var2 == null) {
            return null;
        } else {
            var2.method4391(this.field952);
            return var2;
        }
    }
}
