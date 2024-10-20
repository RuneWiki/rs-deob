package deob;

@ObfuscatedName("hn")
public class class195 extends class504 {

    @ObfuscatedName("hn.am")
    public static class317 field2006 = new class317(64);

    @ObfuscatedName("hn.ax")
    public static class317 field2026 = new class317(50);

    @ObfuscatedName("hn.aq")
    public int field2008;

    @ObfuscatedName("hn.af")
    public String field2009 = class382.field4298;

    @ObfuscatedName("hn.at")
    public int field2010 = 1;

    @ObfuscatedName("hn.au")
    public int[] field2011;

    @ObfuscatedName("hn.ar")
    public int[] field2012;

    @ObfuscatedName("hn.al")
    public int field2007 = -1;

    @ObfuscatedName("hn.ad")
    public int field2014 = -1;

    @ObfuscatedName("hn.ah")
    public int field2004 = -1;

    @ObfuscatedName("hn.ap")
    public int field2015 = -1;

    @ObfuscatedName("hn.ab")
    public int field2017 = -1;

    @ObfuscatedName("hn.az")
    public int field2018 = -1;

    @ObfuscatedName("hn.aa")
    public int field2019 = -1;

    @ObfuscatedName("hn.ai")
    public int field2013 = -1;

    @ObfuscatedName("hn.ao")
    public int field2016 = -1;

    @ObfuscatedName("hn.as")
    public int field2022 = -1;

    @ObfuscatedName("hn.ay")
    public int field2030 = -1;

    @ObfuscatedName("hn.aj")
    public int field2024 = -1;

    @ObfuscatedName("hn.av")
    public int field2052 = -1;

    @ObfuscatedName("hn.aw")
    public int field2021 = -1;

    @ObfuscatedName("hn.an")
    public int field2027 = -1;

    @ObfuscatedName("hn.ak")
    public short[] field2028;

    @ObfuscatedName("hn.bn")
    public short[] field2029;

    @ObfuscatedName("hn.bh")
    public short[] field2020;

    @ObfuscatedName("hn.bd")
    public short[] field2031;

    @ObfuscatedName("hn.bx")
    public String[] field2032 = new String[5];

    @ObfuscatedName("hn.bf")
    public boolean field2033 = true;

    @ObfuscatedName("hn.bm")
    public int field2034 = -1;

    @ObfuscatedName("hn.bs")
    public int field2035 = 128;

    @ObfuscatedName("hn.bw")
    public int field2036 = 128;

    @ObfuscatedName("hn.ba")
    public boolean field2037 = false;

    @ObfuscatedName("hn.bj")
    public int field2005 = 0;

    @ObfuscatedName("hn.bp")
    public int field2039 = 0;

    @ObfuscatedName("hn.by")
    public int field2040 = 32;

    @ObfuscatedName("hn.bb")
    public int[] field2041;

    @ObfuscatedName("hn.bi")
    public int field2042 = -1;

    @ObfuscatedName("hn.bg")
    public int field2043 = -1;

    @ObfuscatedName("hn.bl")
    public boolean field2047 = true;

    @ObfuscatedName("hn.bz")
    public boolean field2045 = true;

    @ObfuscatedName("hn.bu")
    public boolean field2046 = false;

    @ObfuscatedName("hn.br")
    public boolean field2003 = false;

    @ObfuscatedName("hn.bo")
    public int[] field2048 = null;

    @ObfuscatedName("hn.bv")
    public short[] field2049 = null;

    @ObfuscatedName("hn.bt")
    public int field2050 = -1;

    @ObfuscatedName("hn.bq")
    public class523 field2051;

    @ObfuscatedName("hn.bk")
    public int[] field2023 = new int[] { 1, 1, 1, 1, 1, 1 };

    @ObfuscatedName("gt.ac(IB)Lhn;")
    public static class195 method3383(int arg0) {
        class195 var1 = (class195) field2006.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2038.method6782(9, arg0);
        class195 var3 = new class195();
        var3.field2008 = arg0;
        if (var2 != null) {
            var3.method3598(new class551(var2));
        }
        var3.method3597();
        field2006.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hn.ae(I)V")
    public void method3597() {
    }

    @ObfuscatedName("hn.ag(Lvf;B)V")
    public void method3598(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3639(arg0, var2);
        }
    }

    @ObfuscatedName("hn.am(Lvf;II)V")
    public void method3639(class551 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8955();
            this.field2011 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2011[var4] = arg0.method9119();
            }
        } else if (arg1 == 2) {
            this.field2009 = arg0.method9166();
        } else if (arg1 == 12) {
            this.field2010 = arg0.method8955();
        } else if (arg1 == 13) {
            this.field2007 = arg0.method9119();
        } else if (arg1 == 14) {
            this.field2015 = arg0.method9119();
        } else if (arg1 == 15) {
            this.field2014 = arg0.method9119();
        } else if (arg1 == 16) {
            this.field2004 = arg0.method9119();
        } else if (arg1 == 17) {
            this.field2015 = arg0.method9119();
            this.field2017 = arg0.method9119();
            this.field2018 = arg0.method9119();
            this.field2019 = arg0.method9119();
        } else if (arg1 == 18) {
            arg0.method9119();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2032[arg1 - 30] = arg0.method9166();
            if (this.field2032[arg1 - 30].equalsIgnoreCase(class382.field4140)) {
                this.field2032[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8955();
            this.field2028 = new short[var5];
            this.field2029 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2028[var6] = (short) arg0.method9119();
                this.field2029[var6] = (short) arg0.method9119();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8955();
            this.field2020 = new short[var7];
            this.field2031 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2020[var8] = (short) arg0.method9119();
                this.field2031[var8] = (short) arg0.method9119();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8955();
            this.field2012 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2012[var10] = arg0.method9119();
            }
        } else if (arg1 == 74) {
            this.field2023[0] = arg0.method9119();
        } else if (arg1 == 75) {
            this.field2023[1] = arg0.method9119();
        } else if (arg1 == 76) {
            this.field2023[2] = arg0.method9119();
        } else if (arg1 == 77) {
            this.field2023[3] = arg0.method9119();
        } else if (arg1 == 78) {
            this.field2023[4] = arg0.method9119();
        } else if (arg1 == 79) {
            this.field2023[5] = arg0.method9119();
        } else if (arg1 == 93) {
            this.field2033 = false;
        } else if (arg1 == 95) {
            this.field2034 = arg0.method9119();
        } else if (arg1 == 97) {
            this.field2035 = arg0.method9119();
        } else if (arg1 == 98) {
            this.field2036 = arg0.method9119();
        } else if (arg1 == 99) {
            this.field2037 = true;
        } else if (arg1 == 100) {
            this.field2005 = arg0.method8975();
        } else if (arg1 == 101) {
            this.field2039 = arg0.method8975();
        } else if (arg1 == 102) {
            int var11 = arg0.method8955();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2048 = new int[var12];
            this.field2049 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2048[var14] = -1;
                    this.field2049[var14] = -1;
                } else {
                    this.field2048[var14] = arg0.method9205();
                    this.field2049[var14] = (short) arg0.method8990();
                }
            }
        } else if (arg1 == 103) {
            this.field2040 = arg0.method9119();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2042 = arg0.method9119();
            if (this.field2042 == 65535) {
                this.field2042 = -1;
            }
            this.field2043 = arg0.method9119();
            if (this.field2043 == 65535) {
                this.field2043 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method9119();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8955();
            this.field2041 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2041[var17] = arg0.method9119();
                if (this.field2041[var17] == 65535) {
                    this.field2041[var17] = -1;
                }
            }
            this.field2041[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2047 = false;
        } else if (arg1 == 109) {
            this.field2045 = false;
        } else if (arg1 == 114) {
            this.field2013 = arg0.method9119();
        } else if (arg1 == 115) {
            this.field2013 = arg0.method9119();
            this.field2016 = arg0.method9119();
            this.field2022 = arg0.method9119();
            this.field2030 = arg0.method9119();
        } else if (arg1 == 116) {
            this.field2024 = arg0.method9119();
        } else if (arg1 == 117) {
            this.field2024 = arg0.method9119();
            this.field2052 = arg0.method9119();
            this.field2021 = arg0.method9119();
            this.field2027 = arg0.method9119();
        } else if (arg1 == 122) {
            this.field2046 = true;
        } else if (arg1 == 123) {
            this.field2003 = true;
        } else if (arg1 == 124) {
            this.field2050 = arg0.method9119();
        } else if (arg1 == 249) {
            this.field2051 = class188.method3374(arg0, this.field2051);
        }
    }

    @ObfuscatedName("hn.ax(Lif;ILif;ILhp;I)Ljm;")
    public final class256 method3600(class213 arg0, int arg1, class213 arg2, int arg3, class194 arg4) {
        if (this.field2041 != null) {
            class195 var6 = this.method3603();
            return var6 == null ? null : var6.method3600(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2008;
        if (arg4 != null) {
            var7 |= arg4.field1997 << 16;
        }
        class256 var9 = (class256) field2026.method5733(var7);
        if (var9 == null) {
            class235 var10 = this.method3617(this.field2011, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4266(this.field2005 + 64, this.field2039 * 5 + 850, -30, -50, -30);
            field2026.method5735(var9, var7);
        }
        class256 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3951(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3948(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4810(true);
        } else {
            var11 = arg2.method3948(var9, arg3);
        }
        if (this.field2035 != 128 || this.field2036 != 128) {
            var11.method4829(this.field2035, this.field2036, this.field2035);
        }
        return var11;
    }

    @ObfuscatedName("hn.aq(Lhp;I)Ljv;")
    public final class235 method3601(class194 arg0) {
        if (this.field2041 == null) {
            return this.method3617(this.field2012, arg0);
        } else {
            class195 var2 = this.method3603();
            return var2 == null ? null : var2.method3601(arg0);
        }
    }

    @ObfuscatedName("hn.af([ILhp;I)Ljv;")
    public class235 method3617(int[] arg0, class194 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2002 != null) {
            var3 = arg1.field2002;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field2044.method6784(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class235[] var6 = new class235[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class235.method4302(Statics.field2044, var3[var7], 0);
        }
        class235 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class235(var6, var6.length);
            }
        } else {
            var8 = new class235(var6, var6.length);
        }
        if (this.field2028 != null) {
            short[] var9 = this.field2029;
            if (arg1 != null && arg1.field1995 != null) {
                var9 = arg1.field1995;
            }
            for (int var10 = 0; var10 < this.field2028.length; var10++) {
                var8.method4254(this.field2028[var10], var9[var10]);
            }
        }
        if (this.field2020 != null) {
            short[] var11 = this.field2031;
            if (arg1 != null && arg1.field1994 != null) {
                var11 = arg1.field1994;
            }
            for (int var12 = 0; var12 < this.field2020.length; var12++) {
                var8.method4259(this.field2020[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hn.at(B)Lhn;")
    public final class195 method3603() {
        int var1 = -1;
        if (this.field2042 != -1) {
            var1 = class351.method3259(this.field2042);
        } else if (this.field2043 != -1) {
            var1 = class351.field3752[this.field2043];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2041.length - 1) {
            var2 = this.field2041[var1];
        } else {
            var2 = this.field2041[this.field2041.length - 1];
        }
        return var2 == -1 ? null : method3383(var2);
    }

    @ObfuscatedName("hn.au(B)Z")
    public boolean method3636() {
        if (this.field2041 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2042 != -1) {
            var1 = class351.method3259(this.field2042);
        } else if (this.field2043 != -1) {
            var1 = class351.field3752[this.field2043];
        }
        if (var1 >= 0 && var1 < this.field2041.length) {
            return this.field2041[var1] != -1;
        } else {
            return this.field2041[this.field2041.length - 1] != -1;
        }
    }

    @ObfuscatedName("hn.ar(IIB)I")
    public int method3644(int arg0, int arg1) {
        return class188.method414(this.field2051, arg0, arg1);
    }

    @ObfuscatedName("hn.al(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3606(int arg0, String arg1) {
        class523 var3 = this.field2051;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8666((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field5118;
            }
        }
        return var4;
    }

    @ObfuscatedName("hn.ad(B)Z")
    public boolean method3596() {
        return this.field2048 != null && this.field2049 != null;
    }

    @ObfuscatedName("hn.ah(I)[I")
    public int[] method3608() {
        return this.field2048;
    }

    @ObfuscatedName("hn.ap(II)I")
    public int method3642(int arg0) {
        return this.field2048 == null || arg0 >= this.field2048.length ? -1 : this.field2048[arg0];
    }

    @ObfuscatedName("hn.ab(I)[S")
    public short[] method3610() {
        return this.field2049;
    }

    @ObfuscatedName("hn.az(II)S")
    public short method3641(int arg0) {
        return this.field2049 == null || arg0 >= this.field2049.length ? -1 : this.field2049[arg0];
    }
}
