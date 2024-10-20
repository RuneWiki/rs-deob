package deob;

@ObfuscatedName("hy")
public class class195 extends class511 {

    @ObfuscatedName("hy.aj")
    public static class316 field2007 = new class316(64);

    @ObfuscatedName("hy.ai")
    public static class316 field2008 = new class316(50);

    @ObfuscatedName("hy.ay")
    public int field2009;

    @ObfuscatedName("hy.as")
    public String field2010 = class383.field4405;

    @ObfuscatedName("hy.ae")
    public int field2014 = 1;

    @ObfuscatedName("hy.am")
    public int[] field2012;

    @ObfuscatedName("hy.at")
    public int[] field2013;

    @ObfuscatedName("hy.au")
    public int field2029 = -1;

    @ObfuscatedName("hy.an")
    public int field2015 = -1;

    @ObfuscatedName("hy.ao")
    public int field2005 = -1;

    @ObfuscatedName("hy.af")
    public int field2019 = -1;

    @ObfuscatedName("hy.ar")
    public int field2034 = -1;

    @ObfuscatedName("hy.ab")
    public int field2038 = -1;

    @ObfuscatedName("hy.az")
    public int field2020 = -1;

    @ObfuscatedName("hy.ag")
    public int field2039 = -1;

    @ObfuscatedName("hy.ad")
    public int field2022 = -1;

    @ObfuscatedName("hy.ac")
    public int field2023 = -1;

    @ObfuscatedName("hy.av")
    public int field2024 = -1;

    @ObfuscatedName("hy.ax")
    public int field2025 = -1;

    @ObfuscatedName("hy.aq")
    public int field2026 = -1;

    @ObfuscatedName("hy.al")
    public int field2027 = -1;

    @ObfuscatedName("hy.aa")
    public int field2028 = -1;

    @ObfuscatedName("hy.ah")
    public short[] field2030;

    @ObfuscatedName("hy.bh")
    public short[] field2018;

    @ObfuscatedName("hy.bj")
    public short[] field2031;

    @ObfuscatedName("hy.bv")
    public short[] field2032;

    @ObfuscatedName("hy.bx")
    public String[] field2033 = new String[5];

    @ObfuscatedName("hy.bk")
    public boolean field2011 = true;

    @ObfuscatedName("hy.bb")
    public int field2035 = -1;

    @ObfuscatedName("hy.bq")
    public int field2036 = 128;

    @ObfuscatedName("hy.bp")
    public int field2037 = 128;

    @ObfuscatedName("hy.bz")
    public boolean field2017 = false;

    @ObfuscatedName("hy.bc")
    public int field2046 = 0;

    @ObfuscatedName("hy.by")
    public int field2021 = 0;

    @ObfuscatedName("hy.br")
    public int field2041 = 32;

    @ObfuscatedName("hy.bn")
    public int[] field2042;

    @ObfuscatedName("hy.bu")
    public int field2043 = -1;

    @ObfuscatedName("hy.bt")
    public int field2044 = -1;

    @ObfuscatedName("hy.bs")
    public boolean field2016 = true;

    @ObfuscatedName("hy.bm")
    public boolean field2045 = true;

    @ObfuscatedName("hy.bo")
    public boolean field2047 = false;

    @ObfuscatedName("hy.bd")
    public boolean field2048 = false;

    @ObfuscatedName("hy.ba")
    public int[] field2049 = null;

    @ObfuscatedName("hy.bw")
    public short[] field2050 = null;

    @ObfuscatedName("hy.bi")
    public int field2051 = -1;

    @ObfuscatedName("hy.bf")
    public class530 field2052;

    @ObfuscatedName("hy.bg")
    public int[] field2053 = new int[] { 1, 1, 1, 1, 1, 1 };

    @ObfuscatedName("sd.ap(II)Lhy;")
    public static class195 method8497(int arg0) {
        class195 var1 = (class195) field2007.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2006.method7009(9, arg0);
        class195 var3 = new class195();
        var3.field2009 = arg0;
        if (var2 != null) {
            var3.method3739(new class558(var2));
        }
        var3.method3727();
        field2007.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hy.aw(B)V")
    public void method3727() {
    }

    @ObfuscatedName("hy.ak(Lvl;B)V")
    public void method3739(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3729(arg0, var2);
        }
    }

    @ObfuscatedName("hy.aj(Lvl;II)V")
    public void method3729(class558 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method9258();
            this.field2012 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2012[var4] = arg0.method9260();
            }
        } else if (arg1 == 2) {
            this.field2010 = arg0.method9269();
        } else if (arg1 == 12) {
            this.field2014 = arg0.method9258();
        } else if (arg1 == 13) {
            this.field2029 = arg0.method9260();
        } else if (arg1 == 14) {
            this.field2019 = arg0.method9260();
        } else if (arg1 == 15) {
            this.field2015 = arg0.method9260();
        } else if (arg1 == 16) {
            this.field2005 = arg0.method9260();
        } else if (arg1 == 17) {
            this.field2019 = arg0.method9260();
            this.field2034 = arg0.method9260();
            this.field2038 = arg0.method9260();
            this.field2020 = arg0.method9260();
        } else if (arg1 == 18) {
            arg0.method9260();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2033[arg1 - 30] = arg0.method9269();
            if (this.field2033[arg1 - 30].equalsIgnoreCase(class383.field4183)) {
                this.field2033[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method9258();
            this.field2030 = new short[var5];
            this.field2018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2030[var6] = (short) arg0.method9260();
                this.field2018[var6] = (short) arg0.method9260();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method9258();
            this.field2031 = new short[var7];
            this.field2032 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2031[var8] = (short) arg0.method9260();
                this.field2032[var8] = (short) arg0.method9260();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method9258();
            this.field2013 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2013[var10] = arg0.method9260();
            }
        } else if (arg1 == 74) {
            this.field2053[0] = arg0.method9260();
        } else if (arg1 == 75) {
            this.field2053[1] = arg0.method9260();
        } else if (arg1 == 76) {
            this.field2053[2] = arg0.method9260();
        } else if (arg1 == 77) {
            this.field2053[3] = arg0.method9260();
        } else if (arg1 == 78) {
            this.field2053[4] = arg0.method9260();
        } else if (arg1 == 79) {
            this.field2053[5] = arg0.method9260();
        } else if (arg1 == 93) {
            this.field2011 = false;
        } else if (arg1 == 95) {
            this.field2035 = arg0.method9260();
        } else if (arg1 == 97) {
            this.field2036 = arg0.method9260();
        } else if (arg1 == 98) {
            this.field2037 = arg0.method9260();
        } else if (arg1 == 99) {
            this.field2017 = true;
        } else if (arg1 == 100) {
            this.field2046 = arg0.method9259();
        } else if (arg1 == 101) {
            this.field2021 = arg0.method9259();
        } else if (arg1 == 102) {
            int var11 = arg0.method9258();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2049 = new int[var12];
            this.field2050 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2049[var14] = -1;
                    this.field2050[var14] = -1;
                } else {
                    this.field2049[var14] = arg0.method9278();
                    this.field2050[var14] = (short) arg0.method9275();
                }
            }
        } else if (arg1 == 103) {
            this.field2041 = arg0.method9260();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2043 = arg0.method9260();
            if (this.field2043 == 65535) {
                this.field2043 = -1;
            }
            this.field2044 = arg0.method9260();
            if (this.field2044 == 65535) {
                this.field2044 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method9260();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method9258();
            this.field2042 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2042[var17] = arg0.method9260();
                if (this.field2042[var17] == 65535) {
                    this.field2042[var17] = -1;
                }
            }
            this.field2042[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2016 = false;
        } else if (arg1 == 109) {
            this.field2045 = false;
        } else if (arg1 == 114) {
            this.field2039 = arg0.method9260();
        } else if (arg1 == 115) {
            this.field2039 = arg0.method9260();
            this.field2022 = arg0.method9260();
            this.field2023 = arg0.method9260();
            this.field2024 = arg0.method9260();
        } else if (arg1 == 116) {
            this.field2025 = arg0.method9260();
        } else if (arg1 == 117) {
            this.field2025 = arg0.method9260();
            this.field2026 = arg0.method9260();
            this.field2027 = arg0.method9260();
            this.field2028 = arg0.method9260();
        } else if (arg1 == 122) {
            this.field2047 = true;
        } else if (arg1 == 123) {
            this.field2048 = true;
        } else if (arg1 == 124) {
            this.field2051 = arg0.method9260();
        } else if (arg1 == 249) {
            this.field2052 = class188.method2372(arg0, this.field2052);
        }
    }

    @ObfuscatedName("hy.ai(Liu;ILiu;ILhn;B)Ljy;")
    public final class256 method3775(class213 arg0, int arg1, class213 arg2, int arg3, class194 arg4) {
        if (this.field2042 != null) {
            class195 var6 = this.method3733();
            return var6 == null ? null : var6.method3775(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2009;
        if (arg4 != null) {
            var7 |= arg4.field2002 << 16;
        }
        class256 var9 = (class256) field2008.method5928(var7);
        if (var9 == null) {
            class235 var10 = this.method3732(this.field2012, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4460(this.field2046 + 64, this.field2021 * 5 + 850, -30, -50, -30);
            field2008.method5931(var9, var7);
        }
        class256 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method4097(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method4139(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4997(true);
        } else {
            var11 = arg2.method4139(var9, arg3);
        }
        if (this.field2036 != 128 || this.field2037 != 128) {
            var11.method4999(this.field2036, this.field2037, this.field2036);
        }
        return var11;
    }

    @ObfuscatedName("hy.ay(Lhn;I)Ljj;")
    public final class235 method3762(class194 arg0) {
        if (this.field2042 == null) {
            return this.method3732(this.field2013, arg0);
        } else {
            class195 var2 = this.method3733();
            return var2 == null ? null : var2.method3762(arg0);
        }
    }

    @ObfuscatedName("hy.as([ILhn;I)Ljj;")
    public class235 method3732(int[] arg0, class194 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2000 != null) {
            var3 = arg1.field2000;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field4644.method7023(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class235[] var6 = new class235[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class235.method4408(Statics.field4644, var3[var7], 0);
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
        if (this.field2030 != null) {
            short[] var9 = this.field2018;
            if (arg1 != null && arg1.field2001 != null) {
                var9 = arg1.field2001;
            }
            for (int var10 = 0; var10 < this.field2030.length; var10++) {
                var8.method4393(this.field2030[var10], var9[var10]);
            }
        }
        if (this.field2031 != null) {
            short[] var11 = this.field2032;
            if (arg1 != null && arg1.field2004 != null) {
                var11 = arg1.field2004;
            }
            for (int var12 = 0; var12 < this.field2031.length; var12++) {
                var8.method4394(this.field2031[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hy.ae(I)Lhy;")
    public final class195 method3733() {
        int var1 = -1;
        if (this.field2043 != -1) {
            var1 = class350.method2339(this.field2043);
        } else if (this.field2044 != -1) {
            var1 = class350.field3773[this.field2044];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2042.length - 1) {
            var2 = this.field2042[var1];
        } else {
            var2 = this.field2042[this.field2042.length - 1];
        }
        return var2 == -1 ? null : method8497(var2);
    }

    @ObfuscatedName("hy.am(I)Z")
    public boolean method3763() {
        if (this.field2042 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2043 != -1) {
            var1 = class350.method2339(this.field2043);
        } else if (this.field2044 != -1) {
            var1 = class350.field3773[this.field2044];
        }
        if (var1 >= 0 && var1 < this.field2042.length) {
            return this.field2042[var1] != -1;
        } else {
            return this.field2042[this.field2042.length - 1] != -1;
        }
    }

    @ObfuscatedName("hy.at(IIS)I")
    public int method3735(int arg0, int arg1) {
        return class188.method3588(this.field2052, arg0, arg1);
    }

    @ObfuscatedName("hy.au(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3736(int arg0, String arg1) {
        return class188.method5808(this.field2052, arg0, arg1);
    }

    @ObfuscatedName("ga.an(I)V")
    public static void method3522() {
        field2007.method5930();
        field2008.method5930();
    }

    @ObfuscatedName("hy.ao(I)Z")
    public boolean method3737() {
        return this.field2049 != null && this.field2050 != null;
    }

    @ObfuscatedName("hy.af(I)[I")
    public int[] method3738() {
        return this.field2049;
    }

    @ObfuscatedName("hy.ar(II)I")
    public int method3734(int arg0) {
        return this.field2049 == null || arg0 >= this.field2049.length ? -1 : this.field2049[arg0];
    }

    @ObfuscatedName("hy.ab(B)[S")
    public short[] method3740() {
        return this.field2050;
    }

    @ObfuscatedName("hy.az(IB)S")
    public short method3741(int arg0) {
        return this.field2050 == null || arg0 >= this.field2050.length ? -1 : this.field2050[arg0];
    }
}
