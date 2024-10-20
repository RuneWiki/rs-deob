package deob;

@ObfuscatedName("dd")
public final class class80 extends class248 {

    @ObfuscatedName("dd.ap")
    public int field994;

    @ObfuscatedName("dd.aw")
    public int field967;

    @ObfuscatedName("dd.ak")
    public int field968;

    @ObfuscatedName("dd.aj")
    public int field969;

    @ObfuscatedName("dd.ai")
    public int field970;

    @ObfuscatedName("dd.ay")
    public int field971;

    @ObfuscatedName("dd.as")
    public int field972;

    @ObfuscatedName("dd.ae")
    public int field973;

    @ObfuscatedName("dd.am")
    public int field974;

    @ObfuscatedName("dd.at")
    public int field990;

    @ObfuscatedName("dd.au")
    public int field992;

    @ObfuscatedName("dd.an")
    public int field986;

    @ObfuscatedName("dd.ao")
    public int field978;

    @ObfuscatedName("dd.af")
    public int field979;

    @ObfuscatedName("dd.ar")
    public int field980;

    @ObfuscatedName("dd.ab")
    public boolean field985;

    @ObfuscatedName("dd.az")
    public double field975;

    @ObfuscatedName("dd.ag")
    public double field983;

    @ObfuscatedName("dd.ad")
    public double field984;

    @ObfuscatedName("dd.ac")
    public double field976;

    @ObfuscatedName("dd.av")
    public double field982;

    @ObfuscatedName("dd.ax")
    public double field987;

    @ObfuscatedName("dd.aq")
    public double field988;

    @ObfuscatedName("dd.al")
    public double field977;

    @ObfuscatedName("dd.aa")
    public int field989;

    @ObfuscatedName("dd.ah")
    public int field991;

    @ObfuscatedName("dd.bh")
    public class213 field981;

    @ObfuscatedName("dd.bj")
    public int field993;

    @ObfuscatedName("dd.bv")
    public int field996;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field985 = false;
        this.field993 = 0;
        this.field996 = 0;
        this.field994 = arg0;
        this.field967 = arg1;
        this.field968 = arg2;
        this.field969 = arg3;
        this.field970 = arg4;
        this.field990 = arg5;
        this.field992 = arg6;
        this.field986 = arg7;
        this.field978 = arg8;
        this.field980 = arg9;
        this.field971 = arg10;
        this.field985 = false;
        int var12 = class200.method6851(this.field994).field2087;
        if (var12 == -1) {
            this.field981 = null;
        } else {
            this.field981 = class213.method6692(var12);
        }
    }

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field979 = arg9;
    }

    @ObfuscatedName("dd.ap(IIIII)V")
    public final void method2332(int arg0, int arg1, int arg2, int arg3) {
        this.field972 = arg0;
        this.field973 = arg1;
        this.field974 = arg2;
        if (!this.field985) {
            double var5 = (double) (this.field972 - this.field968);
            double var7 = (double) (this.field973 - this.field969);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field975 = (double) this.field978 * var5 / var9 + (double) this.field968;
            this.field983 = (double) this.field978 * var7 / var9 + (double) this.field969;
            this.field984 = (double) this.field970;
        }
        double var11 = (double) (this.field992 + 1 - arg3);
        this.field976 = ((double) this.field972 - this.field975) / var11;
        this.field982 = ((double) this.field973 - this.field983) / var11;
        this.field987 = Math.sqrt(this.field982 * this.field982 + this.field976 * this.field976);
        if (!this.field985) {
            this.field988 = -this.field987 * Math.tan((double) this.field986 * 0.02454369D);
        }
        this.field977 = ((double) this.field974 - this.field984 - this.field988 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("dd.aw(IB)V")
    public final void method2335(int arg0) {
        this.field985 = true;
        this.field975 += (double) arg0 * this.field976;
        this.field983 += (double) arg0 * this.field982;
        this.field984 += this.field977 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field988;
        this.field988 += (double) arg0 * this.field977;
        this.field989 = (int) (Math.atan2(this.field976, this.field982) * 325.949D) + 1024 & 0x7FF;
        this.field991 = (int) (Math.atan2(this.field988, this.field987) * 325.949D) & 0x7FF;
        if (this.field981 == null) {
            return;
        }
        if (this.field981.method4100()) {
            this.field993 += arg0;
            int var2 = this.field981.method4101();
            if (this.field993 >= var2) {
                this.field993 = var2 - this.field981.field2309;
            }
            return;
        }
        this.field996 += arg0;
        while (true) {
            do {
                do {
                    if (this.field996 <= this.field981.field2316[this.field993]) {
                        return;
                    }
                    this.field996 -= this.field981.field2316[this.field993];
                    this.field993++;
                } while (this.field993 < this.field981.field2314.length);
                this.field993 -= this.field981.field2309;
            } while (this.field993 >= 0 && this.field993 < this.field981.field2314.length);
            this.field993 = 0;
        }
    }

    @ObfuscatedName("dd.au(I)Ljy;")
    public final class256 method2245() {
        class200 var1 = class200.method6851(this.field994);
        class256 var2 = var1.method3812(this.field993);
        if (var2 == null) {
            return null;
        } else {
            var2.method5022(this.field991);
            return var2;
        }
    }
}
