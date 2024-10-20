package deob;

@ObfuscatedName("cr")
public final class class78 extends class278 {

    @ObfuscatedName("cr.aq")
    public int field987;

    @ObfuscatedName("cr.aw")
    public int field985;

    @ObfuscatedName("cr.al")
    public int field990;

    @ObfuscatedName("cr.ai")
    public int field984;

    @ObfuscatedName("cr.ar")
    public int field982;

    @ObfuscatedName("cr.as")
    public int field986;

    @ObfuscatedName("cr.aa")
    public int field1009;

    @ObfuscatedName("cr.az")
    public int field988;

    @ObfuscatedName("cr.ao")
    public int field989;

    @ObfuscatedName("cr.au")
    public int field1002;

    @ObfuscatedName("cr.ak")
    public int field1008;

    @ObfuscatedName("cr.ah")
    public int field992;

    @ObfuscatedName("cr.aj")
    public int field997;

    @ObfuscatedName("cr.af")
    public int field994;

    @ObfuscatedName("cr.ax")
    public int field995;

    @ObfuscatedName("cr.an")
    public boolean field996;

    @ObfuscatedName("cr.ag")
    public double field981;

    @ObfuscatedName("cr.am")
    public double field998;

    @ObfuscatedName("cr.ad")
    public double field999;

    @ObfuscatedName("cr.at")
    public double field1000;

    @ObfuscatedName("cr.ay")
    public double field1001;

    @ObfuscatedName("cr.ae")
    public double field991;

    @ObfuscatedName("cr.ac")
    public double field1003;

    @ObfuscatedName("cr.ab")
    public double field1004;

    @ObfuscatedName("cr.av")
    public int field1005;

    @ObfuscatedName("cr.ap")
    public int field1006;

    @ObfuscatedName("cr.bu")
    public class207 field1007;

    @ObfuscatedName("cr.bo")
    public int field983;

    @ObfuscatedName("cr.bd")
    public int field1012;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field996 = false;
        this.field983 = 0;
        this.field1012 = 0;
        this.field987 = arg0;
        this.field985 = arg1;
        this.field990 = arg2;
        this.field984 = arg3;
        this.field982 = arg4;
        this.field1002 = arg5;
        this.field1008 = arg6;
        this.field992 = arg7;
        this.field997 = arg8;
        this.field995 = arg9;
        this.field986 = arg10;
        this.field996 = false;
        int var12 = Statics.method3501(this.field987).field2040;
        if (var12 == -1) {
            this.field1007 = null;
        } else {
            this.field1007 = class207.method3902(var12);
        }
    }

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field994 = arg9;
    }

    @ObfuscatedName("cr.aq(IIIII)V")
    public final void method2118(int arg0, int arg1, int arg2, int arg3) {
        this.field1009 = arg0;
        this.field988 = arg1;
        this.field989 = arg2;
        if (!this.field996) {
            double var5 = (double) (this.field1009 - this.field990);
            double var7 = (double) (this.field988 - this.field984);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field981 = (double) this.field997 * var5 / var9 + (double) this.field990;
            this.field998 = (double) this.field997 * var7 / var9 + (double) this.field984;
            this.field999 = (double) this.field982;
        }
        double var11 = (double) (this.field1008 + 1 - arg3);
        this.field1000 = ((double) this.field1009 - this.field981) / var11;
        this.field1001 = ((double) this.field988 - this.field998) / var11;
        this.field991 = Math.sqrt(this.field1001 * this.field1001 + this.field1000 * this.field1000);
        if (!this.field996) {
            this.field1003 = -this.field991 * Math.tan((double) this.field992 * 0.02454369D);
        }
        this.field1004 = ((double) this.field989 - this.field999 - this.field1003 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cr.al(II)V")
    public final void method2110(int arg0) {
        this.field996 = true;
        this.field981 += (double) arg0 * this.field1000;
        this.field998 += (double) arg0 * this.field1001;
        this.field999 += this.field1004 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1003;
        this.field1003 += (double) arg0 * this.field1004;
        this.field1005 = (int) (Math.atan2(this.field1000, this.field1001) * 325.949D) + 1024 & 0x7FF;
        this.field1006 = (int) (Math.atan2(this.field1003, this.field991) * 325.949D) & 0x7FF;
        if (this.field1007 == null) {
            return;
        }
        if (this.field1007.method3731()) {
            this.field983 += arg0;
            int var2 = this.field1007.method3732();
            if (this.field983 >= var2) {
                this.field983 = var2 - this.field1007.field2247;
            }
            return;
        }
        this.field1012 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1012 <= this.field1007.field2257[this.field983]) {
                        return;
                    }
                    this.field1012 -= this.field1007.field2257[this.field983];
                    this.field983++;
                } while (this.field983 < this.field1007.field2259.length);
                this.field983 -= this.field1007.field2247;
            } while (this.field983 >= 0 && this.field983 < this.field1007.field2259.length);
            this.field983 = 0;
        }
    }

    @ObfuscatedName("cr.aw(I)Lkz;")
    public final class285 method2016() {
        class195 var1 = Statics.method3501(this.field987);
        class285 var2 = var1.method3453(this.field983);
        if (var2 == null) {
            return null;
        } else {
            var2.method5166(this.field1006);
            return var2;
        }
    }
}
