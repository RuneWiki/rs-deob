package deob;

@ObfuscatedName("hs")
public class class191 extends class444 {

    @ObfuscatedName("hs.ac")
    public static class280 field2010 = new class280(64);

    @ObfuscatedName("hs.au")
    public static class280 field2011 = new class280(50);

    @ObfuscatedName("hs.ab")
    public int field2012;

    @ObfuscatedName("hs.aq")
    public String field2013 = class337.field3889;

    @ObfuscatedName("hs.al")
    public int field2042 = 1;

    @ObfuscatedName("hs.at")
    public int[] field2015;

    @ObfuscatedName("hs.aa")
    public int[] field2053;

    @ObfuscatedName("hs.ay")
    public int field2050 = -1;

    @ObfuscatedName("hs.ao")
    public int field2018 = -1;

    @ObfuscatedName("hs.ax")
    public int field2019 = -1;

    @ObfuscatedName("hs.ai")
    public int field2020 = -1;

    @ObfuscatedName("hs.ag")
    public int field2021 = -1;

    @ObfuscatedName("hs.ah")
    public int field2022 = -1;

    @ObfuscatedName("hs.av")
    public int field2023 = -1;

    @ObfuscatedName("hs.ar")
    public int field2049 = -1;

    @ObfuscatedName("hs.am")
    public int field2009 = -1;

    @ObfuscatedName("hs.as")
    public int field2026 = -1;

    @ObfuscatedName("hs.aj")
    public int field2038 = -1;

    @ObfuscatedName("hs.ak")
    public int field2024 = -1;

    @ObfuscatedName("hs.az")
    public int field2029 = -1;

    @ObfuscatedName("hs.ad")
    public int field2030 = -1;

    @ObfuscatedName("hs.ae")
    public int field2031 = -1;

    @ObfuscatedName("hs.ap")
    public short[] field2032;

    @ObfuscatedName("hs.by")
    public short[] field2027;

    @ObfuscatedName("hs.bb")
    public short[] field2034;

    @ObfuscatedName("hs.bi")
    public short[] field2035;

    @ObfuscatedName("hs.be")
    public String[] field2036 = new String[5];

    @ObfuscatedName("hs.bk")
    public boolean field2037 = true;

    @ObfuscatedName("hs.bx")
    public int field2046 = -1;

    @ObfuscatedName("hs.bo")
    public int field2039 = 128;

    @ObfuscatedName("hs.bz")
    public int field2040 = 128;

    @ObfuscatedName("hs.bm")
    public boolean field2028 = false;

    @ObfuscatedName("hs.bd")
    public int field2044 = 0;

    @ObfuscatedName("hs.bt")
    public int field2017 = 0;

    @ObfuscatedName("hs.bj")
    public int field2016 = 32;

    @ObfuscatedName("hs.bn")
    public int[] field2045;

    @ObfuscatedName("hs.bs")
    public int field2033 = -1;

    @ObfuscatedName("hs.br")
    public int field2047 = -1;

    @ObfuscatedName("hs.bg")
    public boolean field2048 = true;

    @ObfuscatedName("hs.bu")
    public boolean field2014 = true;

    @ObfuscatedName("hs.bf")
    public boolean field2025 = false;

    @ObfuscatedName("hs.bq")
    public int[] field2051 = null;

    @ObfuscatedName("hs.ba")
    public short[] field2052 = null;

    @ObfuscatedName("hs.bv")
    public class464 field2041;

    @ObfuscatedName("cb.af(Lnm;Lnm;I)V")
    public static void method1944(class344 arg0, class344 arg1) {
        Statics.field2008 = arg0;
        Statics.field2007 = arg1;
    }

    @ObfuscatedName("nm.an(IB)Lhs;")
    public static class191 method6098(int arg0) {
        class191 var1 = (class191) field2010.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2008.method6090(9, arg0);
        class191 var3 = new class191();
        var3.field2012 = arg0;
        if (var2 != null) {
            var3.method3453(new class489(var2));
        }
        var3.method3461();
        field2010.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hs.aw(I)V")
    public void method3461() {
    }

    @ObfuscatedName("hs.ac(Lsg;I)V")
    public void method3453(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3475(arg0, var2);
        }
    }

    @ObfuscatedName("hs.au(Lsg;II)V")
    public void method3475(class489 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8248();
            this.field2015 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2015[var4] = arg0.method8250();
            }
        } else if (arg1 == 2) {
            this.field2013 = arg0.method8259();
        } else if (arg1 == 12) {
            this.field2042 = arg0.method8248();
        } else if (arg1 == 13) {
            this.field2050 = arg0.method8250();
        } else if (arg1 == 14) {
            this.field2020 = arg0.method8250();
        } else if (arg1 == 15) {
            this.field2018 = arg0.method8250();
        } else if (arg1 == 16) {
            this.field2019 = arg0.method8250();
        } else if (arg1 == 17) {
            this.field2020 = arg0.method8250();
            this.field2021 = arg0.method8250();
            this.field2022 = arg0.method8250();
            this.field2023 = arg0.method8250();
        } else if (arg1 == 18) {
            arg0.method8250();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2036[arg1 - 30] = arg0.method8259();
            if (this.field2036[arg1 - 30].equalsIgnoreCase(class337.field4129)) {
                this.field2036[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8248();
            this.field2032 = new short[var5];
            this.field2027 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2032[var6] = (short) arg0.method8250();
                this.field2027[var6] = (short) arg0.method8250();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8248();
            this.field2034 = new short[var7];
            this.field2035 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2034[var8] = (short) arg0.method8250();
                this.field2035[var8] = (short) arg0.method8250();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8248();
            this.field2053 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2053[var10] = arg0.method8250();
            }
        } else if (arg1 == 93) {
            this.field2037 = false;
        } else if (arg1 == 95) {
            this.field2046 = arg0.method8250();
        } else if (arg1 == 97) {
            this.field2039 = arg0.method8250();
        } else if (arg1 == 98) {
            this.field2040 = arg0.method8250();
        } else if (arg1 == 99) {
            this.field2028 = true;
        } else if (arg1 == 100) {
            this.field2044 = arg0.method8249();
        } else if (arg1 == 101) {
            this.field2017 = arg0.method8249() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method8248();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2051 = new int[var12];
            this.field2052 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2051[var14] = -1;
                    this.field2052[var14] = -1;
                } else {
                    this.field2051[var14] = arg0.method8300();
                    this.field2052[var14] = (short) arg0.method8265();
                }
            }
        } else if (arg1 == 103) {
            this.field2016 = arg0.method8250();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2033 = arg0.method8250();
            if (this.field2033 == 65535) {
                this.field2033 = -1;
            }
            this.field2047 = arg0.method8250();
            if (this.field2047 == 65535) {
                this.field2047 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8250();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8248();
            this.field2045 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2045[var17] = arg0.method8250();
                if (this.field2045[var17] == 65535) {
                    this.field2045[var17] = -1;
                }
            }
            this.field2045[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2048 = false;
        } else if (arg1 == 109) {
            this.field2014 = false;
        } else if (arg1 == 111) {
            this.field2025 = true;
        } else if (arg1 == 114) {
            this.field2049 = arg0.method8250();
        } else if (arg1 == 115) {
            this.field2049 = arg0.method8250();
            this.field2009 = arg0.method8250();
            this.field2026 = arg0.method8250();
            this.field2038 = arg0.method8250();
        } else if (arg1 == 116) {
            this.field2024 = arg0.method8250();
        } else if (arg1 == 117) {
            this.field2024 = arg0.method8250();
            this.field2029 = arg0.method8250();
            this.field2030 = arg0.method8250();
            this.field2031 = arg0.method8250();
        } else if (arg1 == 249) {
            this.field2041 = class187.method2057(arg0, this.field2041);
        }
    }

    @ObfuscatedName("hs.ab(Lha;ILha;ILhv;B)Lit;")
    public final class232 method3455(class204 arg0, int arg1, class204 arg2, int arg3, class190 arg4) {
        if (this.field2045 != null) {
            class191 var6 = this.method3458();
            return var6 == null ? null : var6.method3455(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2012;
        if (arg4 != null) {
            var7 |= arg4.field2003 << 16;
        }
        class232 var9 = (class232) field2011.method5119(var7);
        if (var9 == null) {
            class214 var10 = this.method3457(this.field2015, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3979(this.field2044 + 64, this.field2017 + 850, -30, -50, -30);
            field2011.method5121(var9, var7);
        }
        class232 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3857(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3810(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4390(true);
        } else {
            var11 = arg2.method3810(var9, arg3);
        }
        if (this.field2039 != 128 || this.field2040 != 128) {
            var11.method4460(this.field2039, this.field2040, this.field2039);
        }
        return var11;
    }

    @ObfuscatedName("hs.aq(Lhv;B)Liz;")
    public final class214 method3456(class190 arg0) {
        if (this.field2045 == null) {
            return this.method3457(this.field2053, arg0);
        } else {
            class191 var2 = this.method3458();
            return var2 == null ? null : var2.method3456(arg0);
        }
    }

    @ObfuscatedName("hs.al([ILhv;I)Liz;")
    public class214 method3457(int[] arg0, class190 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2002 != null) {
            var3 = arg1.field2002;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field2007.method6073(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class214[] var6 = new class214[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class214.method4017(Statics.field2007, var3[var7], 0);
        }
        class214 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class214(var6, var6.length);
            }
        } else {
            var8 = new class214(var6, var6.length);
        }
        if (this.field2032 != null) {
            short[] var9 = this.field2027;
            if (arg1 != null && arg1.field2001 != null) {
                var9 = arg1.field2001;
            }
            for (int var10 = 0; var10 < this.field2032.length; var10++) {
                var8.method3971(this.field2032[var10], var9[var10]);
            }
        }
        if (this.field2034 != null) {
            short[] var11 = this.field2035;
            if (arg1 != null && arg1.field2004 != null) {
                var11 = arg1.field2004;
            }
            for (int var12 = 0; var12 < this.field2034.length; var12++) {
                var8.method4022(this.field2034[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hs.at(I)Lhs;")
    public final class191 method3458() {
        int var1 = -1;
        if (this.field2033 != -1) {
            var1 = class307.method4941(this.field2033);
        } else if (this.field2047 != -1) {
            var1 = class307.field3482[this.field2047];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2045.length - 1) {
            var2 = this.field2045[var1];
        } else {
            var2 = this.field2045[this.field2045.length - 1];
        }
        return var2 == -1 ? null : method6098(var2);
    }

    @ObfuscatedName("hs.aa(I)Z")
    public boolean method3459() {
        if (this.field2045 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2033 != -1) {
            var1 = class307.method4941(this.field2033);
        } else if (this.field2047 != -1) {
            var1 = class307.field3482[this.field2047];
        }
        if (var1 >= 0 && var1 < this.field2045.length) {
            return this.field2045[var1] != -1;
        } else {
            return this.field2045[this.field2045.length - 1] != -1;
        }
    }

    @ObfuscatedName("hs.ay(III)I")
    public int method3460(int arg0, int arg1) {
        class464 var3 = this.field2041;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class448 var5 = (class448) var3.method7945((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4744;
            }
        }
        return var4;
    }

    @ObfuscatedName("hs.ao(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3507(int arg0, String arg1) {
        return class187.method3440(this.field2041, arg0, arg1);
    }

    @ObfuscatedName("gq.ax(B)V")
    public static void method3308() {
        field2010.method5125();
        field2011.method5125();
    }

    @ObfuscatedName("hs.ai(B)Z")
    public boolean method3462() {
        return this.field2051 != null && this.field2052 != null;
    }

    @ObfuscatedName("hs.ag(I)[I")
    public int[] method3463() {
        return this.field2051;
    }

    @ObfuscatedName("hs.ah(IB)I")
    public int method3464(int arg0) {
        return this.field2051 == null || arg0 >= this.field2051.length ? -1 : this.field2051[arg0];
    }

    @ObfuscatedName("hs.av(I)[S")
    public short[] method3465() {
        return this.field2052;
    }

    @ObfuscatedName("hs.ar(II)S")
    public short method3469(int arg0) {
        return this.field2052 == null || arg0 >= this.field2052.length ? -1 : this.field2052[arg0];
    }
}
