package deob;

@ObfuscatedName("df")
public final class class80 extends class248 {

    @ObfuscatedName("df.ac")
    public int field1004;

    @ObfuscatedName("df.ae")
    public int field990;

    @ObfuscatedName("df.ag")
    public int field991;

    @ObfuscatedName("df.am")
    public int field992;

    @ObfuscatedName("df.ax")
    public int field993;

    @ObfuscatedName("df.aq")
    public int field994;

    @ObfuscatedName("df.af")
    public int field1000;

    @ObfuscatedName("df.at")
    public int field995;

    @ObfuscatedName("df.au")
    public int field997;

    @ObfuscatedName("df.ar")
    public int field1016;

    @ObfuscatedName("df.al")
    public int field999;

    @ObfuscatedName("df.ad")
    public int field1008;

    @ObfuscatedName("df.ah")
    public int field1001;

    @ObfuscatedName("df.ap")
    public int field1017;

    @ObfuscatedName("df.ab")
    public int field1003;

    @ObfuscatedName("df.az")
    public boolean field1002;

    @ObfuscatedName("df.aa")
    public double field1005;

    @ObfuscatedName("df.ai")
    public double field1006;

    @ObfuscatedName("df.ao")
    public double field1007;

    @ObfuscatedName("df.as")
    public double field996;

    @ObfuscatedName("df.ay")
    public double field1009;

    @ObfuscatedName("df.aj")
    public double field1010;

    @ObfuscatedName("df.av")
    public double field1011;

    @ObfuscatedName("df.aw")
    public double field1012;

    @ObfuscatedName("df.an")
    public int field1013;

    @ObfuscatedName("df.ak")
    public int field1018;

    @ObfuscatedName("df.bn")
    public class213 field1015;

    @ObfuscatedName("df.bh")
    public int field1014;

    @ObfuscatedName("df.bd")
    public int field989;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1002 = false;
        this.field1014 = 0;
        this.field989 = 0;
        this.field1004 = arg0;
        this.field990 = arg1;
        this.field991 = arg2;
        this.field992 = arg3;
        this.field993 = arg4;
        this.field1016 = arg5;
        this.field999 = arg6;
        this.field1008 = arg7;
        this.field1001 = arg8;
        this.field1003 = arg9;
        this.field994 = arg10;
        this.field1002 = false;
        int var12 = class200.method3501(this.field1004).field2091;
        if (var12 == -1) {
            this.field1015 = null;
        } else {
            this.field1015 = class213.method2555(var12);
        }
    }

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field1017 = arg9;
    }

    @ObfuscatedName("df.ac(IIIII)V")
    public final void method2251(int arg0, int arg1, int arg2, int arg3) {
        this.field1000 = arg0;
        this.field995 = arg1;
        this.field997 = arg2;
        if (!this.field1002) {
            double var5 = (double) (this.field1000 - this.field991);
            double var7 = (double) (this.field995 - this.field992);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1005 = (double) this.field1001 * var5 / var9 + (double) this.field991;
            this.field1006 = (double) this.field1001 * var7 / var9 + (double) this.field992;
            this.field1007 = (double) this.field993;
        }
        double var11 = (double) (this.field999 + 1 - arg3);
        this.field996 = ((double) this.field1000 - this.field1005) / var11;
        this.field1009 = ((double) this.field995 - this.field1006) / var11;
        this.field1010 = Math.sqrt(this.field996 * this.field996 + this.field1009 * this.field1009);
        if (!this.field1002) {
            this.field1011 = -this.field1010 * Math.tan((double) this.field1008 * 0.02454369D);
        }
        this.field1012 = ((double) this.field997 - this.field1007 - this.field1011 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("df.ae(IB)V")
    public final void method2252(int arg0) {
        this.field1002 = true;
        this.field1005 += (double) arg0 * this.field996;
        this.field1006 += (double) arg0 * this.field1009;
        this.field1007 += this.field1012 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1011;
        this.field1011 += (double) arg0 * this.field1012;
        this.field1013 = (int) (Math.atan2(this.field996, this.field1009) * 325.949D) + 1024 & 0x7FF;
        this.field1018 = (int) (Math.atan2(this.field1011, this.field1010) * 325.949D) & 0x7FF;
        if (this.field1015 == null) {
            return;
        }
        if (this.field1015.method3954()) {
            this.field1014 += arg0;
            int var2 = this.field1015.method3999();
            if (this.field1014 >= var2) {
                this.field1014 = var2 - this.field1015.field2318;
            }
            return;
        }
        this.field989 += arg0;
        while (true) {
            do {
                do {
                    if (this.field989 <= this.field1015.field2316[this.field1014]) {
                        return;
                    }
                    this.field989 -= this.field1015.field2316[this.field1014];
                    this.field1014++;
                } while (this.field1014 < this.field1015.field2314.length);
                this.field1014 -= this.field1015.field2318;
            } while (this.field1014 >= 0 && this.field1014 < this.field1015.field2314.length);
            this.field1014 = 0;
        }
    }

    @ObfuscatedName("df.ad(B)Ljm;")
    public final class256 method2182() {
        class200 var1 = class200.method3501(this.field1004);
        class256 var2 = var1.method3676(this.field1014);
        if (var2 == null) {
            return null;
        } else {
            var2.method4923(this.field1018);
            return var2;
        }
    }
}
