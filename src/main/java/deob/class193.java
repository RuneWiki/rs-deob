package deob;

@ObfuscatedName("hl")
public class class193 extends class439 {

    @ObfuscatedName("hl.ab")
    public static class276 field2030 = new class276(64);

    @ObfuscatedName("hl.an")
    public static class276 field2002 = new class276(50);

    @ObfuscatedName("hl.ao")
    public int field2026;

    @ObfuscatedName("hl.av")
    public String field1993 = class333.field3824;

    @ObfuscatedName("hl.aq")
    public int field1994 = 1;

    @ObfuscatedName("hl.ap")
    public int[] field2028;

    @ObfuscatedName("hl.ar")
    public int[] field1996;

    @ObfuscatedName("hl.ak")
    public int field1997 = -1;

    @ObfuscatedName("hl.ax")
    public int field1998 = -1;

    @ObfuscatedName("hl.as")
    public int field1995 = -1;

    @ObfuscatedName("hl.ay")
    public int field2000 = -1;

    @ObfuscatedName("hl.am")
    public int field2001 = -1;

    @ObfuscatedName("hl.az")
    public int field2029 = -1;

    @ObfuscatedName("hl.ae")
    public int field2003 = -1;

    @ObfuscatedName("hl.au")
    public int field2004 = -1;

    @ObfuscatedName("hl.ag")
    public int field2005 = -1;

    @ObfuscatedName("hl.at")
    public int field2006 = -1;

    @ObfuscatedName("hl.af")
    public int field2007 = -1;

    @ObfuscatedName("hl.ai")
    public int field2008 = -1;

    @ObfuscatedName("hl.aw")
    public int field2009 = -1;

    @ObfuscatedName("hl.aa")
    public int field2010 = -1;

    @ObfuscatedName("hl.ah")
    public int field1990 = -1;

    @ObfuscatedName("hl.ad")
    public short[] field1992;

    @ObfuscatedName("hl.bm")
    public short[] field2013;

    @ObfuscatedName("hl.bv")
    public short[] field2014;

    @ObfuscatedName("hl.bo")
    public short[] field2015;

    @ObfuscatedName("hl.bs")
    public String[] field2016 = new String[5];

    @ObfuscatedName("hl.bg")
    public boolean field2018 = true;

    @ObfuscatedName("hl.bh")
    public int field1991 = -1;

    @ObfuscatedName("hl.bl")
    public int field2019 = 128;

    @ObfuscatedName("hl.bk")
    public int field2017 = 128;

    @ObfuscatedName("hl.br")
    public boolean field2021 = false;

    @ObfuscatedName("hl.ba")
    public int field2011 = 0;

    @ObfuscatedName("hl.bz")
    public int field2023 = 0;

    @ObfuscatedName("hl.bq")
    public int field2024 = 32;

    @ObfuscatedName("hl.bc")
    public int[] field2032;

    @ObfuscatedName("hl.bt")
    public int field1987 = -1;

    @ObfuscatedName("hl.be")
    public int field2027 = -1;

    @ObfuscatedName("hl.bu")
    public boolean field1999 = true;

    @ObfuscatedName("hl.bd")
    public boolean field2012 = true;

    @ObfuscatedName("hl.by")
    public boolean field2020 = false;

    @ObfuscatedName("hl.bp")
    public int[] field2025 = null;

    @ObfuscatedName("hl.bb")
    public short[] field2031 = null;

    @ObfuscatedName("hl.bx")
    public class454 field2033;

    @ObfuscatedName("hs.aj(II)Lhl;")
    public static class193 method3331(int arg0) {
        class193 var1 = (class193) field2030.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1988.method5860(9, arg0);
        class193 var3 = new class193();
        var3.field2026 = arg0;
        if (var2 != null) {
            var3.method3350(new class478(var2));
        }
        var3.method3386();
        field2030.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hl.al(I)V")
    public void method3386() {
    }

    @ObfuscatedName("hl.ac(Lsy;I)V")
    public void method3350(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3351(arg0, var2);
        }
    }

    @ObfuscatedName("hl.ab(Lsy;IS)V")
    public void method3351(class478 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7909();
            this.field2028 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2028[var4] = arg0.method7905();
            }
        } else if (arg1 == 2) {
            this.field1993 = arg0.method7950();
        } else if (arg1 == 12) {
            this.field1994 = arg0.method7909();
        } else if (arg1 == 13) {
            this.field1997 = arg0.method7905();
        } else if (arg1 == 14) {
            this.field2000 = arg0.method7905();
        } else if (arg1 == 15) {
            this.field1998 = arg0.method7905();
        } else if (arg1 == 16) {
            this.field1995 = arg0.method7905();
        } else if (arg1 == 17) {
            this.field2000 = arg0.method7905();
            this.field2001 = arg0.method7905();
            this.field2029 = arg0.method7905();
            this.field2003 = arg0.method7905();
        } else if (arg1 == 18) {
            arg0.method7905();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2016[arg1 - 30] = arg0.method7950();
            if (this.field2016[arg1 - 30].equalsIgnoreCase(class333.field3865)) {
                this.field2016[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7909();
            this.field1992 = new short[var5];
            this.field2013 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1992[var6] = (short) arg0.method7905();
                this.field2013[var6] = (short) arg0.method7905();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7909();
            this.field2014 = new short[var7];
            this.field2015 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2014[var8] = (short) arg0.method7905();
                this.field2015[var8] = (short) arg0.method7905();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7909();
            this.field1996 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1996[var10] = arg0.method7905();
            }
        } else if (arg1 == 93) {
            this.field2018 = false;
        } else if (arg1 == 95) {
            this.field1991 = arg0.method7905();
        } else if (arg1 == 97) {
            this.field2019 = arg0.method7905();
        } else if (arg1 == 98) {
            this.field2017 = arg0.method7905();
        } else if (arg1 == 99) {
            this.field2021 = true;
        } else if (arg1 == 100) {
            this.field2011 = arg0.method8163();
        } else if (arg1 == 101) {
            this.field2023 = arg0.method8163() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method7909();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2025 = new int[var12];
            this.field2031 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2025[var14] = -1;
                    this.field2031[var14] = -1;
                } else {
                    this.field2025[var14] = arg0.method7922();
                    this.field2031[var14] = (short) arg0.method7912();
                }
            }
        } else if (arg1 == 103) {
            this.field2024 = arg0.method7905();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1987 = arg0.method7905();
            if (this.field1987 == 65535) {
                this.field1987 = -1;
            }
            this.field2027 = arg0.method7905();
            if (this.field2027 == 65535) {
                this.field2027 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method7905();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method7909();
            this.field2032 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2032[var17] = arg0.method7905();
                if (this.field2032[var17] == 65535) {
                    this.field2032[var17] = -1;
                }
            }
            this.field2032[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field1999 = false;
        } else if (arg1 == 109) {
            this.field2012 = false;
        } else if (arg1 == 111) {
            this.field2020 = true;
        } else if (arg1 == 114) {
            this.field2004 = arg0.method7905();
        } else if (arg1 == 115) {
            this.field2004 = arg0.method7905();
            this.field2005 = arg0.method7905();
            this.field2006 = arg0.method7905();
            this.field2007 = arg0.method7905();
        } else if (arg1 == 116) {
            this.field2008 = arg0.method7905();
        } else if (arg1 == 117) {
            this.field2008 = arg0.method7905();
            this.field2009 = arg0.method7905();
            this.field2010 = arg0.method7905();
            this.field1990 = arg0.method7905();
        } else if (arg1 == 249) {
            this.field2033 = class189.method4194(arg0, this.field2033);
        }
    }

    @ObfuscatedName("hl.an(Lhx;ILhx;ILhj;B)Lix;")
    public final class231 method3352(class206 arg0, int arg1, class206 arg2, int arg3, class192 arg4) {
        if (this.field2032 != null) {
            class193 var6 = this.method3355();
            return var6 == null ? null : var6.method3352(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2026;
        if (arg4 != null) {
            var7 |= arg4.field1986 << 16;
        }
        class231 var9 = (class231) field2002.method4921(var7);
        if (var9 == null) {
            class215 var10 = this.method3363(this.field2028, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3833(this.field2011 + 64, this.field2023 + 850, -30, -50, -30);
            field2002.method4923(var9, var7);
        }
        class231 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3691(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3710(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4239(true);
        } else {
            var11 = arg2.method3710(var9, arg3);
        }
        if (this.field2019 != 128 || this.field2017 != 128) {
            var11.method4266(this.field2019, this.field2017, this.field2019);
        }
        return var11;
    }

    @ObfuscatedName("hl.ao(Lhj;B)Liu;")
    public final class215 method3353(class192 arg0) {
        if (this.field2032 == null) {
            return this.method3363(this.field1996, arg0);
        } else {
            class193 var2 = this.method3355();
            return var2 == null ? null : var2.method3353(arg0);
        }
    }

    @ObfuscatedName("hl.av([ILhj;I)Liu;")
    public class215 method3363(int[] arg0, class192 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1983 != null) {
            var3 = arg1.field1983;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1989.method5862(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class215[] var6 = new class215[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class215.method3812(Statics.field1989, var3[var7], 0);
        }
        class215 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class215(var6, var6.length);
            }
        } else {
            var8 = new class215(var6, var6.length);
        }
        if (this.field1992 != null) {
            short[] var9 = this.field2013;
            if (arg1 != null && arg1.field1984 != null) {
                var9 = arg1.field1984;
            }
            for (int var10 = 0; var10 < this.field1992.length; var10++) {
                var8.method3817(this.field1992[var10], var9[var10]);
            }
        }
        if (this.field2014 != null) {
            short[] var11 = this.field2015;
            if (arg1 != null && arg1.field1985 != null) {
                var11 = arg1.field1985;
            }
            for (int var12 = 0; var12 < this.field2014.length; var12++) {
                var8.method3826(this.field2014[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hl.aq(B)Lhl;")
    public final class193 method3355() {
        int var1 = -1;
        if (this.field1987 != -1) {
            var1 = class303.method233(this.field1987);
        } else if (this.field2027 != -1) {
            var1 = class303.field3428[this.field2027];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2032.length - 1) {
            var2 = this.field2032[var1];
        } else {
            var2 = this.field2032[this.field2032.length - 1];
        }
        return var2 == -1 ? null : method3331(var2);
    }

    @ObfuscatedName("hl.ap(I)Z")
    public boolean method3370() {
        if (this.field2032 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1987 != -1) {
            var1 = class303.method233(this.field1987);
        } else if (this.field2027 != -1) {
            var1 = class303.field3428[this.field2027];
        }
        if (var1 >= 0 && var1 < this.field2032.length) {
            return this.field2032[var1] != -1;
        } else {
            return this.field2032[this.field2032.length - 1] != -1;
        }
    }

    @ObfuscatedName("hl.ar(III)I")
    public int method3357(int arg0, int arg1) {
        return class189.method2941(this.field2033, arg0, arg1);
    }

    @ObfuscatedName("hl.ak(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3358(int arg0, String arg1) {
        return class189.method7298(this.field2033, arg0, arg1);
    }

    @ObfuscatedName("hl.ax(S)Z")
    public boolean method3359() {
        return this.field2025 != null && this.field2031 != null;
    }

    @ObfuscatedName("hl.as(B)[I")
    public int[] method3360() {
        return this.field2025;
    }

    @ObfuscatedName("hl.ay(II)I")
    public int method3361(int arg0) {
        return this.field2025 == null || arg0 >= this.field2025.length ? -1 : this.field2025[arg0];
    }

    @ObfuscatedName("hl.am(I)[S")
    public short[] method3356() {
        return this.field2031;
    }

    @ObfuscatedName("hl.az(II)S")
    public short method3383(int arg0) {
        return this.field2031 == null || arg0 >= this.field2031.length ? -1 : this.field2031[arg0];
    }
}
