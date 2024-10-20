package deob;

@ObfuscatedName("hb")
public class class193 extends class501 {

    @ObfuscatedName("hb.ak")
    public static class313 field1995 = new class313(64);

    @ObfuscatedName("hb.ap")
    public static class313 field1988 = new class313(50);

    @ObfuscatedName("hb.an")
    public int field1989;

    @ObfuscatedName("hb.aj")
    public String field1990 = class379.field4390;

    @ObfuscatedName("hb.av")
    public int field1991 = 1;

    @ObfuscatedName("hb.ab")
    public int[] field2013;

    @ObfuscatedName("hb.ai")
    public int[] field1993;

    @ObfuscatedName("hb.ae")
    public int field1994 = -1;

    @ObfuscatedName("hb.au")
    public int field1985 = -1;

    @ObfuscatedName("hb.ah")
    public int field1996 = -1;

    @ObfuscatedName("hb.az")
    public int field1997 = -1;

    @ObfuscatedName("hb.ax")
    public int field1992 = -1;

    @ObfuscatedName("hb.ac")
    public int field1999 = -1;

    @ObfuscatedName("hb.al")
    public int field2000 = -1;

    @ObfuscatedName("hb.ay")
    public int field2001 = -1;

    @ObfuscatedName("hb.ao")
    public int field2007 = -1;

    @ObfuscatedName("hb.aa")
    public int field2003 = -1;

    @ObfuscatedName("hb.as")
    public int field2030 = -1;

    @ObfuscatedName("hb.aw")
    public int field2005 = -1;

    @ObfuscatedName("hb.at")
    public int field2006 = -1;

    @ObfuscatedName("hb.af")
    public int field2012 = -1;

    @ObfuscatedName("hb.am")
    public int field2008 = -1;

    @ObfuscatedName("hb.ar")
    public short[] field2004;

    @ObfuscatedName("hb.bt")
    public short[] field2034;

    @ObfuscatedName("hb.bj")
    public short[] field2011;

    @ObfuscatedName("hb.be")
    public short[] field1998;

    @ObfuscatedName("hb.bm")
    public String[] field2020 = new String[5];

    @ObfuscatedName("hb.bo")
    public boolean field2025 = true;

    @ObfuscatedName("hb.bi")
    public int field2015 = -1;

    @ObfuscatedName("hb.ba")
    public int field2016 = 128;

    @ObfuscatedName("hb.bg")
    public int field2035 = 128;

    @ObfuscatedName("hb.bs")
    public boolean field2018 = false;

    @ObfuscatedName("hb.bp")
    public int field2019 = 0;

    @ObfuscatedName("hb.bx")
    public int field2009 = 0;

    @ObfuscatedName("hb.bu")
    public int field2021 = 32;

    @ObfuscatedName("hb.by")
    public int[] field2014;

    @ObfuscatedName("hb.bw")
    public int field2023 = -1;

    @ObfuscatedName("hb.bl")
    public int field2024 = -1;

    @ObfuscatedName("hb.bc")
    public boolean field2022 = true;

    @ObfuscatedName("hb.bv")
    public boolean field2026 = true;

    @ObfuscatedName("hb.bb")
    public boolean field2027 = false;

    @ObfuscatedName("hb.bn")
    public boolean field2028 = false;

    @ObfuscatedName("hb.bh")
    public int[] field2029 = null;

    @ObfuscatedName("hb.bq")
    public short[] field2010 = null;

    @ObfuscatedName("hb.bd")
    public int field2031 = -1;

    @ObfuscatedName("hb.bz")
    public class520 field2032;

    @ObfuscatedName("hb.bk")
    public int[] field2033 = new int[] { 1, 1, 1, 1, 1, 1 };

    @ObfuscatedName("cx.aq(IB)Lhb;")
    public static class193 method2064(int arg0) {
        class193 var1 = (class193) field1995.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4678.method6539(9, arg0);
        class193 var3 = new class193();
        var3.field1989 = arg0;
        if (var2 != null) {
            var3.method3403(new class547(var2));
        }
        var3.method3405();
        field1995.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.ad(I)V")
    public void method3405() {
    }

    @ObfuscatedName("hb.ag(Lvp;I)V")
    public void method3403(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3404(arg0, var2);
        }
    }

    @ObfuscatedName("hb.ak(Lvp;IS)V")
    public void method3404(class547 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8804();
            this.field2013 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2013[var4] = arg0.method8899();
            }
        } else if (arg1 == 2) {
            this.field1990 = arg0.method8739();
        } else if (arg1 == 12) {
            this.field1991 = arg0.method8804();
        } else if (arg1 == 13) {
            this.field1994 = arg0.method8899();
        } else if (arg1 == 14) {
            this.field1997 = arg0.method8899();
        } else if (arg1 == 15) {
            this.field1985 = arg0.method8899();
        } else if (arg1 == 16) {
            this.field1996 = arg0.method8899();
        } else if (arg1 == 17) {
            this.field1997 = arg0.method8899();
            this.field1992 = arg0.method8899();
            this.field1999 = arg0.method8899();
            this.field2000 = arg0.method8899();
        } else if (arg1 == 18) {
            arg0.method8899();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2020[arg1 - 30] = arg0.method8739();
            if (this.field2020[arg1 - 30].equalsIgnoreCase(class379.field4384)) {
                this.field2020[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8804();
            this.field2004 = new short[var5];
            this.field2034 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2004[var6] = (short) arg0.method8899();
                this.field2034[var6] = (short) arg0.method8899();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8804();
            this.field2011 = new short[var7];
            this.field1998 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2011[var8] = (short) arg0.method8899();
                this.field1998[var8] = (short) arg0.method8899();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8804();
            this.field1993 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1993[var10] = arg0.method8899();
            }
        } else if (arg1 == 74) {
            this.field2033[0] = arg0.method8899();
        } else if (arg1 == 75) {
            this.field2033[1] = arg0.method8899();
        } else if (arg1 == 76) {
            this.field2033[2] = arg0.method8899();
        } else if (arg1 == 77) {
            this.field2033[3] = arg0.method8899();
        } else if (arg1 == 78) {
            this.field2033[4] = arg0.method8899();
        } else if (arg1 == 79) {
            this.field2033[5] = arg0.method8899();
        } else if (arg1 == 93) {
            this.field2025 = false;
        } else if (arg1 == 95) {
            this.field2015 = arg0.method8899();
        } else if (arg1 == 97) {
            this.field2016 = arg0.method8899();
        } else if (arg1 == 98) {
            this.field2035 = arg0.method8899();
        } else if (arg1 == 99) {
            this.field2018 = true;
        } else if (arg1 == 100) {
            this.field2019 = arg0.method8857();
        } else if (arg1 == 101) {
            this.field2009 = arg0.method8857();
        } else if (arg1 == 102) {
            int var11 = arg0.method8804();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2029 = new int[var12];
            this.field2010 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2029[var14] = -1;
                    this.field2010[var14] = -1;
                } else {
                    this.field2029[var14] = arg0.method8773();
                    this.field2010[var14] = (short) arg0.method8745();
                }
            }
        } else if (arg1 == 103) {
            this.field2021 = arg0.method8899();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2023 = arg0.method8899();
            if (this.field2023 == 65535) {
                this.field2023 = -1;
            }
            this.field2024 = arg0.method8899();
            if (this.field2024 == 65535) {
                this.field2024 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8899();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8804();
            this.field2014 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2014[var17] = arg0.method8899();
                if (this.field2014[var17] == 65535) {
                    this.field2014[var17] = -1;
                }
            }
            this.field2014[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2022 = false;
        } else if (arg1 == 109) {
            this.field2026 = false;
        } else if (arg1 == 114) {
            this.field2001 = arg0.method8899();
        } else if (arg1 == 115) {
            this.field2001 = arg0.method8899();
            this.field2007 = arg0.method8899();
            this.field2003 = arg0.method8899();
            this.field2030 = arg0.method8899();
        } else if (arg1 == 116) {
            this.field2005 = arg0.method8899();
        } else if (arg1 == 117) {
            this.field2005 = arg0.method8899();
            this.field2006 = arg0.method8899();
            this.field2012 = arg0.method8899();
            this.field2008 = arg0.method8899();
        } else if (arg1 == 122) {
            this.field2027 = true;
        } else if (arg1 == 123) {
            this.field2028 = true;
        } else if (arg1 == 124) {
            this.field2031 = arg0.method8899();
        } else if (arg1 == 249) {
            this.field2032 = class186.method2650(arg0, this.field2032);
        }
    }

    @ObfuscatedName("hb.ap(Lii;ILii;ILhh;I)Llv;")
    public final class294 method3450(class210 arg0, int arg1, class210 arg2, int arg3, class192 arg4) {
        if (this.field2014 != null) {
            class193 var6 = this.method3408();
            return var6 == null ? null : var6.method3450(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field1989;
        if (arg4 != null) {
            var7 |= arg4.field1982 << 16;
        }
        class294 var9 = (class294) field1988.method5495(var7);
        if (var9 == null) {
            class273 var10 = this.method3407(this.field2013, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4682(this.field2019 + 64, this.field2009 * 5 + 850, -30, -50, -30);
            field1988.method5498(var9, var7);
        }
        class294 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3754(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3751(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method5311(true);
        } else {
            var11 = arg2.method3751(var9, arg3);
        }
        if (this.field2016 != 128 || this.field2035 != 128) {
            var11.method5265(this.field2016, this.field2035, this.field2016);
        }
        return var11;
    }

    @ObfuscatedName("hb.an(Lhh;I)Lkr;")
    public final class273 method3406(class192 arg0) {
        if (this.field2014 == null) {
            return this.method3407(this.field1993, arg0);
        } else {
            class193 var2 = this.method3408();
            return var2 == null ? null : var2.method3406(arg0);
        }
    }

    @ObfuscatedName("hb.aj([ILhh;I)Lkr;")
    public class273 method3407(int[] arg0, class192 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1979 != null) {
            var3 = arg1.field1979;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1986.method6541(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class273[] var6 = new class273[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class273.method4687(Statics.field1986, var3[var7], 0);
        }
        class273 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class273(var6, var6.length);
            }
        } else {
            var8 = new class273(var6, var6.length);
        }
        if (this.field2004 != null) {
            short[] var9 = this.field2034;
            if (arg1 != null && arg1.field1980 != null) {
                var9 = arg1.field1980;
            }
            for (int var10 = 0; var10 < this.field2004.length; var10++) {
                var8.method4732(this.field2004[var10], var9[var10]);
            }
        }
        if (this.field2011 != null) {
            short[] var11 = this.field1998;
            if (arg1 != null && arg1.field1983 != null) {
                var11 = arg1.field1983;
            }
            for (int var12 = 0; var12 < this.field2011.length; var12++) {
                var8.method4741(this.field2011[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hb.av(I)Lhb;")
    public final class193 method3408() {
        int var1 = -1;
        if (this.field2023 != -1) {
            var1 = class347.method3186(this.field2023);
        } else if (this.field2024 != -1) {
            var1 = class347.field3731[this.field2024];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2014.length - 1) {
            var2 = this.field2014[var1];
        } else {
            var2 = this.field2014[this.field2014.length - 1];
        }
        return var2 == -1 ? null : method2064(var2);
    }

    @ObfuscatedName("hb.ab(I)I")
    public final int method3431() {
        if (this.field2014 != null) {
            class193 var1 = this.method3408();
            if (var1 != null) {
                return var1.field1989;
            }
        }
        return -1;
    }

    @ObfuscatedName("hb.ai(I)Z")
    public boolean method3437() {
        if (this.field2014 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2023 != -1) {
            var1 = class347.method3186(this.field2023);
        } else if (this.field2024 != -1) {
            var1 = class347.field3731[this.field2024];
        }
        if (var1 >= 0 && var1 < this.field2014.length) {
            return this.field2014[var1] != -1;
        } else {
            return this.field2014[this.field2014.length - 1] != -1;
        }
    }

    @ObfuscatedName("hb.ae(IIS)I")
    public int method3410(int arg0, int arg1) {
        return class186.method4567(this.field2032, arg0, arg1);
    }

    @ObfuscatedName("hb.au(ILjava/lang/String;S)Ljava/lang/String;")
    public String method3409(int arg0, String arg1) {
        return class186.method2668(this.field2032, arg0, arg1);
    }

    @ObfuscatedName("hb.ah(I)Z")
    public boolean method3412() {
        return this.field2029 != null && this.field2010 != null;
    }

    @ObfuscatedName("hb.az(I)[I")
    public int[] method3413() {
        return this.field2029;
    }

    @ObfuscatedName("hb.ax(II)I")
    public int method3402(int arg0) {
        return this.field2029 == null || arg0 >= this.field2029.length ? -1 : this.field2029[arg0];
    }

    @ObfuscatedName("hb.ac(B)[S")
    public short[] method3415() {
        return this.field2010;
    }

    @ObfuscatedName("hb.al(II)S")
    public short method3416(int arg0) {
        return this.field2010 == null || arg0 >= this.field2010.length ? -1 : this.field2010[arg0];
    }
}
