package deob;

@ObfuscatedName("dj")
public final class class79 extends class256 {

    @ObfuscatedName("dj.ak")
    public int field992;

    @ObfuscatedName("dj.al")
    public int field1007;

    @ObfuscatedName("dj.aj")
    public int field981;

    @ObfuscatedName("dj.az")
    public int field1004;

    @ObfuscatedName("dj.af")
    public int field983;

    @ObfuscatedName("dj.aa")
    public int field1005;

    @ObfuscatedName("dj.at")
    public int field985;

    @ObfuscatedName("dj.ab")
    public int field986;

    @ObfuscatedName("dj.ac")
    public int field982;

    @ObfuscatedName("dj.ao")
    public int field980;

    @ObfuscatedName("dj.ah")
    public int field989;

    @ObfuscatedName("dj.av")
    public int field990;

    @ObfuscatedName("dj.aq")
    public int field991;

    @ObfuscatedName("dj.ap")
    public int field1006;

    @ObfuscatedName("dj.ae")
    public int field993;

    @ObfuscatedName("dj.ax")
    public boolean field994;

    @ObfuscatedName("dj.ay")
    public double field995;

    @ObfuscatedName("dj.au")
    public double field996;

    @ObfuscatedName("dj.as")
    public double field997;

    @ObfuscatedName("dj.aw")
    public double field998;

    @ObfuscatedName("dj.ad")
    public double field999;

    @ObfuscatedName("dj.ai")
    public double field1000;

    @ObfuscatedName("dj.an")
    public double field1001;

    @ObfuscatedName("dj.am")
    public double field1002;

    @ObfuscatedName("dj.ar")
    public int field988;

    @ObfuscatedName("dj.ag")
    public int field984;

    @ObfuscatedName("dj.bs")
    public class227 field987;

    @ObfuscatedName("dj.bf")
    public int field1003;

    @ObfuscatedName("dj.bo")
    public int field979;

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field994 = false;
        this.field1003 = 0;
        this.field979 = 0;
        this.field992 = arg0;
        this.field1007 = arg1;
        this.field981 = arg2;
        this.field1004 = arg3;
        this.field983 = arg4;
        this.field980 = arg5;
        this.field989 = arg6;
        this.field990 = arg7;
        this.field991 = arg8;
        this.field993 = arg9;
        this.field1005 = arg10;
        this.field994 = false;
        int var12 = class215.method3870(this.field992).field2196;
        if (var12 == -1) {
            this.field987 = null;
        } else {
            this.field987 = class227.method4744(var12);
        }
    }

    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field1006 = arg9;
    }

    @ObfuscatedName("dj.ak(IIIII)V")
    public final void method2097(int arg0, int arg1, int arg2, int arg3) {
        this.field985 = arg0;
        this.field986 = arg1;
        this.field982 = arg2;
        if (!this.field994) {
            double var5 = (double) (this.field985 - this.field981);
            double var7 = (double) (this.field986 - this.field1004);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field995 = (double) this.field991 * var5 / var9 + (double) this.field981;
            this.field996 = (double) this.field991 * var7 / var9 + (double) this.field1004;
            this.field997 = (double) this.field983;
        }
        double var11 = (double) (this.field989 + 1 - arg3);
        this.field998 = ((double) this.field985 - this.field995) / var11;
        this.field999 = ((double) this.field986 - this.field996) / var11;
        this.field1000 = Math.sqrt(this.field999 * this.field999 + this.field998 * this.field998);
        if (!this.field994) {
            this.field1001 = -this.field1000 * Math.tan((double) this.field990 * 0.02454369D);
        }
        this.field1002 = ((double) this.field982 - this.field997 - this.field1001 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("dj.al(II)V")
    public final void method2101(int arg0) {
        this.field994 = true;
        this.field995 += (double) arg0 * this.field998;
        this.field996 += (double) arg0 * this.field999;
        this.field997 += this.field1002 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1001;
        this.field1001 += (double) arg0 * this.field1002;
        this.field988 = (int) (Math.atan2(this.field998, this.field999) * 325.949D) + 1024 & 0x7FF;
        this.field984 = (int) (Math.atan2(this.field1001, this.field1000) * 325.949D) & 0x7FF;
        if (this.field987 == null) {
            return;
        }
        if (this.field987.method4051()) {
            this.field1003 += arg0;
            int var2 = this.field987.method4018();
            if (this.field1003 >= var2) {
                this.field1003 = var2 - this.field987.field2425;
            }
            return;
        }
        this.field979 += arg0;
        while (true) {
            do {
                do {
                    if (this.field979 <= this.field987.field2421[this.field1003]) {
                        return;
                    }
                    this.field979 -= this.field987.field2421[this.field1003];
                    this.field1003++;
                } while (this.field1003 < this.field987.field2424.length);
                this.field1003 -= this.field987.field2425;
            } while (this.field1003 >= 0 && this.field1003 < this.field987.field2424.length);
            this.field1003 = 0;
        }
    }

    @ObfuscatedName("dj.ah(I)Lkb;")
    public final class264 method2007() {
        class215 var1 = class215.method3870(this.field992);
        class264 var2 = var1.method3727(this.field1003);
        if (var2 == null) {
            return null;
        } else {
            var2.method4879(this.field984);
            return var2;
        }
    }
}
