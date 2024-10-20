package deob;

@ObfuscatedName("ck")
public final class class77 extends class233 {

    @ObfuscatedName("ck.au")
    public int field986;

    @ObfuscatedName("ck.ae")
    public int field974;

    @ObfuscatedName("ck.ao")
    public int field984;

    @ObfuscatedName("ck.at")
    public int field973;

    @ObfuscatedName("ck.ac")
    public int field982;

    @ObfuscatedName("ck.ai")
    public int field978;

    @ObfuscatedName("ck.az")
    public int field979;

    @ObfuscatedName("ck.ap")
    public int field980;

    @ObfuscatedName("ck.aa")
    public int field981;

    @ObfuscatedName("ck.af")
    public int field998;

    @ObfuscatedName("ck.ad")
    public int field983;

    @ObfuscatedName("ck.aq")
    public int field976;

    @ObfuscatedName("ck.al")
    public int field988;

    @ObfuscatedName("ck.an")
    public int field989;

    @ObfuscatedName("ck.ar")
    public int field987;

    @ObfuscatedName("ck.ab")
    public boolean field975;

    @ObfuscatedName("ck.ag")
    public double field997;

    @ObfuscatedName("ck.am")
    public double field990;

    @ObfuscatedName("ck.ax")
    public double field991;

    @ObfuscatedName("ck.ah")
    public double field992;

    @ObfuscatedName("ck.as")
    public double field993;

    @ObfuscatedName("ck.ay")
    public double field994;

    @ObfuscatedName("ck.aj")
    public double field995;

    @ObfuscatedName("ck.av")
    public double field985;

    @ObfuscatedName("ck.aw")
    public int field977;

    @ObfuscatedName("ck.ak")
    public int field996;

    @ObfuscatedName("ck.bh")
    public class209 field999;

    @ObfuscatedName("ck.bj")
    public int field1000;

    @ObfuscatedName("ck.bk")
    public int field1001;

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field975 = false;
        this.field1000 = 0;
        this.field1001 = 0;
        this.field986 = arg0;
        this.field974 = arg1;
        this.field984 = arg2;
        this.field973 = arg3;
        this.field982 = arg4;
        this.field998 = arg5;
        this.field983 = arg6;
        this.field976 = arg7;
        this.field988 = arg8;
        this.field987 = arg9;
        this.field978 = arg10;
        this.field975 = false;
        int var12 = class199.method3551(this.field986).field2102;
        if (var12 == -1) {
            this.field999 = null;
        } else {
            this.field999 = class209.method3394(var12);
        }
    }

    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg10, arg11);
        this.field989 = arg9;
    }

    @ObfuscatedName("ck.au(IIIII)V")
    public final void method2053(int arg0, int arg1, int arg2, int arg3) {
        this.field979 = arg0;
        this.field980 = arg1;
        this.field981 = arg2;
        if (!this.field975) {
            double var5 = (double) (this.field979 - this.field984);
            double var7 = (double) (this.field980 - this.field973);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field997 = (double) this.field988 * var5 / var9 + (double) this.field984;
            this.field990 = (double) this.field988 * var7 / var9 + (double) this.field973;
            this.field991 = (double) this.field982;
        }
        double var11 = (double) (this.field983 + 1 - arg3);
        this.field992 = ((double) this.field979 - this.field997) / var11;
        this.field993 = ((double) this.field980 - this.field990) / var11;
        this.field994 = Math.sqrt(this.field993 * this.field993 + this.field992 * this.field992);
        if (!this.field975) {
            this.field995 = -this.field994 * Math.tan((double) this.field976 * 0.02454369D);
        }
        this.field985 = ((double) this.field981 - this.field991 - this.field995 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.ao(IB)V")
    public final void method2054(int arg0) {
        this.field975 = true;
        this.field997 += (double) arg0 * this.field992;
        this.field990 += (double) arg0 * this.field993;
        this.field991 += this.field985 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field995;
        this.field995 += (double) arg0 * this.field985;
        this.field977 = (int) (Math.atan2(this.field992, this.field993) * 325.949D) + 1024 & 0x7FF;
        this.field996 = (int) (Math.atan2(this.field995, this.field994) * 325.949D) & 0x7FF;
        if (this.field999 == null) {
            return;
        }
        if (this.field999.method3775()) {
            this.field1000 += arg0;
            int var2 = this.field999.method3747();
            if (this.field1000 >= var2) {
                this.field1000 = var2 - this.field999.field2317;
            }
            return;
        }
        this.field1001 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1001 <= this.field999.field2324[this.field1000]) {
                        return;
                    }
                    this.field1001 -= this.field999.field2324[this.field1000];
                    this.field1000++;
                } while (this.field1000 < this.field999.field2313.length);
                this.field1000 -= this.field999.field2317;
            } while (this.field1000 >= 0 && this.field1000 < this.field999.field2313.length);
            this.field1000 = 0;
        }
    }

    @ObfuscatedName("ck.ae(I)Ljr;")
    public final class240 method1990() {
        class199 var1 = class199.method3551(this.field986);
        class240 var2 = var1.method3462(this.field1000);
        if (var2 == null) {
            return null;
        } else {
            var2.method4505(this.field996);
            return var2;
        }
    }
}
