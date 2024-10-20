package deob;

@ObfuscatedName("hd")
public class class195 extends class457 {

    @ObfuscatedName("hd.as")
    public static class287 field1997 = new class287(64);

    @ObfuscatedName("hd.ax")
    public static class287 field2035 = new class287(50);

    @ObfuscatedName("hd.ap")
    public int field1999;

    @ObfuscatedName("hd.ab")
    public String field1998 = class350.field3887;

    @ObfuscatedName("hd.ak")
    public int field2029 = 1;

    @ObfuscatedName("hd.ae")
    public int[] field2041;

    @ObfuscatedName("hd.af")
    public int[] field2003;

    @ObfuscatedName("hd.ao")
    public int field2040 = -1;

    @ObfuscatedName("hd.aa")
    public int field2031 = -1;

    @ObfuscatedName("hd.aj")
    public int field2004 = -1;

    @ObfuscatedName("hd.ad")
    public int field2007 = -1;

    @ObfuscatedName("hd.ac")
    public int field2008 = -1;

    @ObfuscatedName("hd.ag")
    public int field1994 = -1;

    @ObfuscatedName("hd.ar")
    public int field2010 = -1;

    @ObfuscatedName("hd.ah")
    public int field2015 = -1;

    @ObfuscatedName("hd.az")
    public int field2012 = -1;

    @ObfuscatedName("hd.au")
    public int field2013 = -1;

    @ObfuscatedName("hd.ai")
    public int field2014 = -1;

    @ObfuscatedName("hd.aq")
    public int field1995 = -1;

    @ObfuscatedName("hd.aw")
    public int field2016 = -1;

    @ObfuscatedName("hd.ay")
    public int field2017 = -1;

    @ObfuscatedName("hd.al")
    public int field2018 = -1;

    @ObfuscatedName("hd.am")
    public short[] field2019;

    @ObfuscatedName("hd.bs")
    public short[] field2020;

    @ObfuscatedName("hd.bc")
    public short[] field2021;

    @ObfuscatedName("hd.bj")
    public short[] field2005;

    @ObfuscatedName("hd.bo")
    public String[] field2023 = new String[5];

    @ObfuscatedName("hd.bq")
    public boolean field2006 = true;

    @ObfuscatedName("hd.bg")
    public int field2025 = -1;

    @ObfuscatedName("hd.bf")
    public int field2026 = 128;

    @ObfuscatedName("hd.bd")
    public int field2027 = 128;

    @ObfuscatedName("hd.ba")
    public boolean field2028 = false;

    @ObfuscatedName("hd.bn")
    public int field2037 = 0;

    @ObfuscatedName("hd.bb")
    public int field2030 = 0;

    @ObfuscatedName("hd.bx")
    public int field2009 = 32;

    @ObfuscatedName("hd.be")
    public int[] field2022;

    @ObfuscatedName("hd.bh")
    public int field2033 = -1;

    @ObfuscatedName("hd.bp")
    public int field2034 = -1;

    @ObfuscatedName("hd.bw")
    public boolean field2001 = true;

    @ObfuscatedName("hd.bi")
    public boolean field2036 = true;

    @ObfuscatedName("hd.bk")
    public boolean field2032 = false;

    @ObfuscatedName("hd.bv")
    public int[] field2038 = null;

    @ObfuscatedName("hd.bz")
    public short[] field2039 = null;

    @ObfuscatedName("hd.bm")
    public class476 field2011;

    @ObfuscatedName("ek.at(Lnq;Lnq;I)V")
    public static void method2703(class357 arg0, class357 arg1) {
        Statics.field2002 = arg0;
        Statics.field1996 = arg1;
    }

    @ObfuscatedName("qs.an(II)Lhd;")
    public static class195 method7336(int arg0) {
        class195 var1 = (class195) field1997.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2002.method6080(9, arg0);
        class195 var3 = new class195();
        var3.field1999 = arg0;
        if (var2 != null) {
            var3.method3419(new class501(var2));
        }
        var3.method3396();
        field1997.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hd.av(I)V")
    public void method3396() {
    }

    @ObfuscatedName("hd.as(Ltz;I)V")
    public void method3419(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3369(arg0, var2);
        }
    }

    @ObfuscatedName("hd.ax(Ltz;II)V")
    public void method3369(class501 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8129();
            this.field2041 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2041[var4] = arg0.method8195();
            }
        } else if (arg1 == 2) {
            this.field1998 = arg0.method8253();
        } else if (arg1 == 12) {
            this.field2029 = arg0.method8129();
        } else if (arg1 == 13) {
            this.field2040 = arg0.method8195();
        } else if (arg1 == 14) {
            this.field2007 = arg0.method8195();
        } else if (arg1 == 15) {
            this.field2031 = arg0.method8195();
        } else if (arg1 == 16) {
            this.field2004 = arg0.method8195();
        } else if (arg1 == 17) {
            this.field2007 = arg0.method8195();
            this.field2008 = arg0.method8195();
            this.field1994 = arg0.method8195();
            this.field2010 = arg0.method8195();
        } else if (arg1 == 18) {
            arg0.method8195();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2023[arg1 - 30] = arg0.method8253();
            if (this.field2023[arg1 - 30].equalsIgnoreCase(class350.field4141)) {
                this.field2023[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8129();
            this.field2019 = new short[var5];
            this.field2020 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2019[var6] = (short) arg0.method8195();
                this.field2020[var6] = (short) arg0.method8195();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8129();
            this.field2021 = new short[var7];
            this.field2005 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2021[var8] = (short) arg0.method8195();
                this.field2005[var8] = (short) arg0.method8195();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8129();
            this.field2003 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2003[var10] = arg0.method8195();
            }
        } else if (arg1 == 93) {
            this.field2006 = false;
        } else if (arg1 == 95) {
            this.field2025 = arg0.method8195();
        } else if (arg1 == 97) {
            this.field2026 = arg0.method8195();
        } else if (arg1 == 98) {
            this.field2027 = arg0.method8195();
        } else if (arg1 == 99) {
            this.field2028 = true;
        } else if (arg1 == 100) {
            this.field2037 = arg0.method8130();
        } else if (arg1 == 101) {
            this.field2030 = arg0.method8130();
        } else if (arg1 == 102) {
            int var11 = arg0.method8129();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2038 = new int[var12];
            this.field2039 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2038[var14] = -1;
                    this.field2039[var14] = -1;
                } else {
                    this.field2038[var14] = arg0.method8148();
                    this.field2039[var14] = (short) arg0.method8158();
                }
            }
        } else if (arg1 == 103) {
            this.field2009 = arg0.method8195();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2033 = arg0.method8195();
            if (this.field2033 == 65535) {
                this.field2033 = -1;
            }
            this.field2034 = arg0.method8195();
            if (this.field2034 == 65535) {
                this.field2034 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8195();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8129();
            this.field2022 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2022[var17] = arg0.method8195();
                if (this.field2022[var17] == 65535) {
                    this.field2022[var17] = -1;
                }
            }
            this.field2022[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2001 = false;
        } else if (arg1 == 109) {
            this.field2036 = false;
        } else if (arg1 == 111) {
            this.field2032 = true;
        } else if (arg1 == 114) {
            this.field2015 = arg0.method8195();
        } else if (arg1 == 115) {
            this.field2015 = arg0.method8195();
            this.field2012 = arg0.method8195();
            this.field2013 = arg0.method8195();
            this.field2014 = arg0.method8195();
        } else if (arg1 == 116) {
            this.field1995 = arg0.method8195();
        } else if (arg1 == 117) {
            this.field1995 = arg0.method8195();
            this.field2016 = arg0.method8195();
            this.field2017 = arg0.method8195();
            this.field2018 = arg0.method8195();
        } else if (arg1 == 249) {
            this.field2011 = class191.method661(arg0, this.field2011);
        }
    }

    @ObfuscatedName("hd.ap(Lhy;ILhy;ILhs;I)Ljd;")
    public final class239 method3370(class208 arg0, int arg1, class208 arg2, int arg3, class194 arg4) {
        if (this.field2022 != null) {
            class195 var6 = this.method3404();
            return var6 == null ? null : var6.method3370(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field1999;
        if (arg4 != null) {
            var7 |= arg4.field1990 << 16;
        }
        class239 var9 = (class239) field2035.method5121(var7);
        if (var9 == null) {
            class221 var10 = this.method3372(this.field2041, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3934(this.field2037 + 64, this.field2030 * 5 + 850, -30, -50, -30);
            field2035.method5123(var9, var7);
        }
        class239 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3724(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3721(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4411(true);
        } else {
            var11 = arg2.method3721(var9, arg3);
        }
        if (this.field2026 != 128 || this.field2027 != 128) {
            var11.method4430(this.field2026, this.field2027, this.field2026);
        }
        return var11;
    }

    @ObfuscatedName("hd.ab(Lhs;I)Lit;")
    public final class221 method3371(class194 arg0) {
        if (this.field2022 == null) {
            return this.method3372(this.field2003, arg0);
        } else {
            class195 var2 = this.method3404();
            return var2 == null ? null : var2.method3371(arg0);
        }
    }

    @ObfuscatedName("hd.ak([ILhs;I)Lit;")
    public class221 method3372(int[] arg0, class194 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1988 != null) {
            var3 = arg1.field1988;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1996.method6082(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class221[] var6 = new class221[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class221.method3913(Statics.field1996, var3[var7], 0);
        }
        class221 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class221(var6, var6.length);
            }
        } else {
            var8 = new class221(var6, var6.length);
        }
        if (this.field2019 != null) {
            short[] var9 = this.field2020;
            if (arg1 != null && arg1.field1989 != null) {
                var9 = arg1.field1989;
            }
            for (int var10 = 0; var10 < this.field2019.length; var10++) {
                var8.method3995(this.field2019[var10], var9[var10]);
            }
        }
        if (this.field2021 != null) {
            short[] var11 = this.field2005;
            if (arg1 != null && arg1.field1992 != null) {
                var11 = arg1.field1992;
            }
            for (int var12 = 0; var12 < this.field2021.length; var12++) {
                var8.method3965(this.field2021[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hd.ae(B)Lhd;")
    public final class195 method3404() {
        int var1 = -1;
        if (this.field2033 != -1) {
            var1 = class320.method5997(this.field2033);
        } else if (this.field2034 != -1) {
            var1 = class320.field3514[this.field2034];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2022.length - 1) {
            var2 = this.field2022[var1];
        } else {
            var2 = this.field2022[this.field2022.length - 1];
        }
        return var2 == -1 ? null : method7336(var2);
    }

    @ObfuscatedName("hd.af(B)Z")
    public boolean method3374() {
        if (this.field2022 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2033 != -1) {
            var1 = class320.method5997(this.field2033);
        } else if (this.field2034 != -1) {
            var1 = class320.field3514[this.field2034];
        }
        if (var1 >= 0 && var1 < this.field2022.length) {
            return this.field2022[var1] != -1;
        } else {
            return this.field2022[this.field2022.length - 1] != -1;
        }
    }

    @ObfuscatedName("hd.ao(III)I")
    public int method3395(int arg0, int arg1) {
        class476 var3 = this.field2011;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class460 var5 = (class460) var3.method7848((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4754;
            }
        }
        return var4;
    }

    @ObfuscatedName("hd.aa(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3376(int arg0, String arg1) {
        return class191.method3094(this.field2011, arg0, arg1);
    }

    @ObfuscatedName("fv.aj(I)V")
    public static void method2935() {
        field1997.method5124();
        field2035.method5124();
    }

    @ObfuscatedName("hd.ad(B)Z")
    public boolean method3377() {
        return this.field2038 != null && this.field2039 != null;
    }

    @ObfuscatedName("hd.ac(I)[I")
    public int[] method3378() {
        return this.field2038;
    }

    @ObfuscatedName("hd.ag(IB)I")
    public int method3366(int arg0) {
        return this.field2038 == null || arg0 >= this.field2038.length ? -1 : this.field2038[arg0];
    }

    @ObfuscatedName("hd.ar(I)[S")
    public short[] method3385() {
        return this.field2039;
    }

    @ObfuscatedName("hd.ah(IB)S")
    public short method3414(int arg0) {
        return this.field2039 == null || arg0 >= this.field2039.length ? -1 : this.field2039[arg0];
    }
}
