package deob;

@ObfuscatedName("ca")
public final class class78 extends class249 {

    @ObfuscatedName("ca.az")
    public int field987;

    @ObfuscatedName("ca.ah")
    public int field968;

    @ObfuscatedName("ca.af")
    public int field969;

    @ObfuscatedName("ca.at")
    public int field970;

    @ObfuscatedName("ca.an")
    public int field988;

    @ObfuscatedName("ca.ao")
    public int field972;

    @ObfuscatedName("ca.ab")
    public int field973;

    @ObfuscatedName("ca.aw")
    public int field974;

    @ObfuscatedName("ca.ad")
    public int field975;

    @ObfuscatedName("ca.al")
    public int field976;

    @ObfuscatedName("ca.as")
    public int field977;

    @ObfuscatedName("ca.ag")
    public int field983;

    @ObfuscatedName("ca.ai")
    public int field979;

    @ObfuscatedName("ca.ax")
    public int field980;

    @ObfuscatedName("ca.ar")
    public int field984;

    @ObfuscatedName("ca.aj")
    public boolean field982;

    @ObfuscatedName("ca.au")
    public double field978;

    @ObfuscatedName("ca.ay")
    public double field985;

    @ObfuscatedName("ca.ap")
    public double field967;

    @ObfuscatedName("ca.av")
    public double field989;

    @ObfuscatedName("ca.aa")
    public double field981;

    @ObfuscatedName("ca.aq")
    public double field986;

    @ObfuscatedName("ca.am")
    public double field991;

    @ObfuscatedName("ca.ac")
    public double field990;

    @ObfuscatedName("ca.ae")
    public int field971;

    @ObfuscatedName("ca.ak")
    public int field992;

    @ObfuscatedName("ca.bp")
    public class225 field993;

    @ObfuscatedName("ca.bz")
    public int field994;

    @ObfuscatedName("ca.bc")
    public int field995;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field982 = false;
        this.field994 = 0;
        this.field995 = 0;
        this.field987 = arg0;
        this.field968 = arg1;
        this.field969 = arg2;
        this.field970 = arg3;
        this.field988 = arg4;
        this.field976 = arg5;
        this.field977 = arg6;
        this.field983 = arg7;
        this.field979 = arg8;
        this.field984 = arg9;
        this.field972 = arg10;
        this.field982 = false;
        int var12 = class213.method2771(this.field987).field2183;
        if (var12 == -1) {
            this.field993 = null;
        } else {
            this.field993 = class225.method288(var12);
        }
    }

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field980 = arg9;
    }

    @ObfuscatedName("ca.az(IIIII)V")
    public final void method2080(int arg0, int arg1, int arg2, int arg3) {
        this.field973 = arg0;
        this.field974 = arg1;
        this.field975 = arg2;
        if (!this.field982) {
            double var5 = (double) (this.field973 - this.field969);
            double var7 = (double) (this.field974 - this.field970);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field978 = (double) this.field979 * var5 / var9 + (double) this.field969;
            this.field985 = (double) this.field979 * var7 / var9 + (double) this.field970;
            this.field967 = (double) this.field988;
        }
        double var11 = (double) (this.field977 + 1 - arg3);
        this.field989 = ((double) this.field973 - this.field978) / var11;
        this.field981 = ((double) this.field974 - this.field985) / var11;
        this.field986 = Math.sqrt(this.field989 * this.field989 + this.field981 * this.field981);
        if (!this.field982) {
            this.field991 = -this.field986 * Math.tan((double) this.field983 * 0.02454369D);
        }
        this.field990 = ((double) this.field975 - this.field967 - this.field991 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ca.af(II)V")
    public final void method2071(int arg0) {
        this.field982 = true;
        this.field978 += (double) arg0 * this.field989;
        this.field985 += (double) arg0 * this.field981;
        this.field967 += this.field990 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field991;
        this.field991 += (double) arg0 * this.field990;
        this.field971 = (int) (Math.atan2(this.field989, this.field981) * 325.949D) + 1024 & 0x7FF;
        this.field992 = (int) (Math.atan2(this.field991, this.field986) * 325.949D) & 0x7FF;
        if (this.field993 == null) {
            return;
        }
        if (this.field993.method3940()) {
            this.field994 += arg0;
            int var2 = this.field993.method3904();
            if (this.field994 >= var2) {
                this.field994 = var2 - this.field993.field2390;
            }
            return;
        }
        this.field995 += arg0;
        while (true) {
            do {
                do {
                    if (this.field995 <= this.field993.field2393[this.field994]) {
                        return;
                    }
                    this.field995 -= this.field993.field2393[this.field994];
                    this.field994++;
                } while (this.field994 < this.field993.field2386.length);
                this.field994 -= this.field993.field2390;
            } while (this.field994 >= 0 && this.field994 < this.field993.field2386.length);
            this.field994 = 0;
        }
    }

    @ObfuscatedName("ca.ah(I)Ljn;")
    public final class256 method1979() {
        class213 var1 = class213.method2771(this.field987);
        class256 var2 = var1.method3609(this.field994);
        if (var2 == null) {
            return null;
        } else {
            var2.method4604(this.field992);
            return var2;
        }
    }
}
