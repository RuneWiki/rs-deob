package deob;

@ObfuscatedName("hi")
public class class196 extends class470 {

    @ObfuscatedName("hi.am")
    public static class289 field2009 = new class289(64);

    @ObfuscatedName("hi.as")
    public static class289 field2000 = new class289(50);

    @ObfuscatedName("hi.aj")
    public int field2001;

    @ObfuscatedName("hi.ag")
    public String field2034 = class353.field3906;

    @ObfuscatedName("hi.az")
    public int field2003 = 1;

    @ObfuscatedName("hi.av")
    public int[] field2023;

    @ObfuscatedName("hi.ap")
    public int[] field2005;

    @ObfuscatedName("hi.aq")
    public int field2006 = -1;

    @ObfuscatedName("hi.at")
    public int field2004 = -1;

    @ObfuscatedName("hi.ah")
    public int field2008 = -1;

    @ObfuscatedName("hi.ax")
    public int field2037 = -1;

    @ObfuscatedName("hi.aa")
    public int field2015 = -1;

    @ObfuscatedName("hi.au")
    public int field2011 = -1;

    @ObfuscatedName("hi.ae")
    public int field2012 = -1;

    @ObfuscatedName("hi.ab")
    public int field1997 = -1;

    @ObfuscatedName("hi.ad")
    public int field2014 = -1;

    @ObfuscatedName("hi.ao")
    public int field1999 = -1;

    @ObfuscatedName("hi.ac")
    public int field2016 = -1;

    @ObfuscatedName("hi.ak")
    public int field2017 = -1;

    @ObfuscatedName("hi.an")
    public int field2018 = -1;

    @ObfuscatedName("hi.af")
    public int field2019 = -1;

    @ObfuscatedName("hi.ai")
    public int field2025 = -1;

    @ObfuscatedName("hi.al")
    public short[] field2007;

    @ObfuscatedName("hi.bd")
    public short[] field2022;

    @ObfuscatedName("hi.bb")
    public short[] field2021;

    @ObfuscatedName("hi.bn")
    public short[] field2010;

    @ObfuscatedName("hi.ba")
    public String[] field2026 = new String[5];

    @ObfuscatedName("hi.bf")
    public boolean field2030 = true;

    @ObfuscatedName("hi.bs")
    public int field2027 = -1;

    @ObfuscatedName("hi.bp")
    public int field2028 = 128;

    @ObfuscatedName("hi.bv")
    public int field2029 = 128;

    @ObfuscatedName("hi.bq")
    public boolean field2013 = false;

    @ObfuscatedName("hi.bo")
    public int field2031 = 0;

    @ObfuscatedName("hi.br")
    public int field2032 = 0;

    @ObfuscatedName("hi.bw")
    public int field2033 = 32;

    @ObfuscatedName("hi.be")
    public int[] field2020;

    @ObfuscatedName("hi.bc")
    public int field2035 = -1;

    @ObfuscatedName("hi.bi")
    public int field2042 = -1;

    @ObfuscatedName("hi.bu")
    public boolean field2036 = true;

    @ObfuscatedName("hi.bk")
    public boolean field2038 = true;

    @ObfuscatedName("hi.bz")
    public boolean field2039 = false;

    @ObfuscatedName("hi.bx")
    public int[] field2040 = null;

    @ObfuscatedName("hi.bh")
    public short[] field2041 = null;

    @ObfuscatedName("hi.bm")
    public class489 field2024;

    @ObfuscatedName("il.aw(II)Lhi;")
    public static class196 method4032(int arg0) {
        class196 var1 = (class196) field2009.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5212.method6117(9, arg0);
        class196 var3 = new class196();
        var3.field2001 = arg0;
        if (var2 != null) {
            var3.method3431(new class514(var2));
        }
        var3.method3407();
        field2009.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hi.ay(I)V")
    public void method3407() {
    }

    @ObfuscatedName("hi.ar(Lty;B)V")
    public void method3431(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3424(arg0, var2);
        }
    }

    @ObfuscatedName("hi.am(Lty;II)V")
    public void method3424(class514 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8244();
            this.field2023 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2023[var4] = arg0.method8246();
            }
        } else if (arg1 == 2) {
            this.field2034 = arg0.method8369();
        } else if (arg1 == 12) {
            this.field2003 = arg0.method8244();
        } else if (arg1 == 13) {
            this.field2006 = arg0.method8246();
        } else if (arg1 == 14) {
            this.field2037 = arg0.method8246();
        } else if (arg1 == 15) {
            this.field2004 = arg0.method8246();
        } else if (arg1 == 16) {
            this.field2008 = arg0.method8246();
        } else if (arg1 == 17) {
            this.field2037 = arg0.method8246();
            this.field2015 = arg0.method8246();
            this.field2011 = arg0.method8246();
            this.field2012 = arg0.method8246();
        } else if (arg1 == 18) {
            arg0.method8246();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2026[arg1 - 30] = arg0.method8369();
            if (this.field2026[arg1 - 30].equalsIgnoreCase(class353.field4029)) {
                this.field2026[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8244();
            this.field2007 = new short[var5];
            this.field2022 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2007[var6] = (short) arg0.method8246();
                this.field2022[var6] = (short) arg0.method8246();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8244();
            this.field2021 = new short[var7];
            this.field2010 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2021[var8] = (short) arg0.method8246();
                this.field2010[var8] = (short) arg0.method8246();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8244();
            this.field2005 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2005[var10] = arg0.method8246();
            }
        } else if (arg1 == 93) {
            this.field2030 = false;
        } else if (arg1 == 95) {
            this.field2027 = arg0.method8246();
        } else if (arg1 == 97) {
            this.field2028 = arg0.method8246();
        } else if (arg1 == 98) {
            this.field2029 = arg0.method8246();
        } else if (arg1 == 99) {
            this.field2013 = true;
        } else if (arg1 == 100) {
            this.field2031 = arg0.method8264();
        } else if (arg1 == 101) {
            this.field2032 = arg0.method8264() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method8244();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2040 = new int[var12];
            this.field2041 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2040[var14] = -1;
                    this.field2041[var14] = -1;
                } else {
                    this.field2040[var14] = arg0.method8310();
                    this.field2041[var14] = (short) arg0.method8419();
                }
            }
        } else if (arg1 == 103) {
            this.field2033 = arg0.method8246();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2035 = arg0.method8246();
            if (this.field2035 == 65535) {
                this.field2035 = -1;
            }
            this.field2042 = arg0.method8246();
            if (this.field2042 == 65535) {
                this.field2042 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8246();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8244();
            this.field2020 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2020[var17] = arg0.method8246();
                if (this.field2020[var17] == 65535) {
                    this.field2020[var17] = -1;
                }
            }
            this.field2020[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2036 = false;
        } else if (arg1 == 109) {
            this.field2038 = false;
        } else if (arg1 == 111) {
            this.field2039 = true;
        } else if (arg1 == 114) {
            this.field1997 = arg0.method8246();
        } else if (arg1 == 115) {
            this.field1997 = arg0.method8246();
            this.field2014 = arg0.method8246();
            this.field1999 = arg0.method8246();
            this.field2016 = arg0.method8246();
        } else if (arg1 == 116) {
            this.field2017 = arg0.method8246();
        } else if (arg1 == 117) {
            this.field2017 = arg0.method8246();
            this.field2018 = arg0.method8246();
            this.field2019 = arg0.method8246();
            this.field2025 = arg0.method8246();
        } else if (arg1 == 249) {
            this.field2024 = class192.method2956(arg0, this.field2024);
        }
    }

    @ObfuscatedName("hi.as(Lig;ILig;ILhs;I)Ljo;")
    public final class241 method3374(class210 arg0, int arg1, class210 arg2, int arg3, class195 arg4) {
        if (this.field2020 != null) {
            class196 var6 = this.method3412();
            return var6 == null ? null : var6.method3374(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2001;
        if (arg4 != null) {
            var7 |= arg4.field1991 << 16;
        }
        class241 var9 = (class241) field2000.method5152(var7);
        if (var9 == null) {
            class223 var10 = this.method3380(this.field2023, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3950(this.field2031 + 64, this.field2032 + 850, -30, -50, -30);
            field2000.method5149(var9, var7);
        }
        class241 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3735(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3732(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4423(true);
        } else {
            var11 = arg2.method3732(var9, arg3);
        }
        if (this.field2028 != 128 || this.field2029 != 128) {
            var11.method4443(this.field2028, this.field2029, this.field2028);
        }
        return var11;
    }

    @ObfuscatedName("hi.aj(Lhs;I)Lie;")
    public final class223 method3379(class195 arg0) {
        if (this.field2020 == null) {
            return this.method3380(this.field2005, arg0);
        } else {
            class196 var2 = this.method3412();
            return var2 == null ? null : var2.method3379(arg0);
        }
    }

    @ObfuscatedName("hi.ag([ILhs;I)Lie;")
    public class223 method3380(int[] arg0, class195 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1994 != null) {
            var3 = arg1.field1994;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1998.method6190(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class223[] var6 = new class223[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class223.method3926(Statics.field1998, var3[var7], 0);
        }
        class223 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class223(var6, var6.length);
            }
        } else {
            var8 = new class223(var6, var6.length);
        }
        if (this.field2007 != null) {
            short[] var9 = this.field2022;
            if (arg1 != null && arg1.field1993 != null) {
                var9 = arg1.field1993;
            }
            for (int var10 = 0; var10 < this.field2007.length; var10++) {
                var8.method3942(this.field2007[var10], var9[var10]);
            }
        }
        if (this.field2021 != null) {
            short[] var11 = this.field2010;
            if (arg1 != null && arg1.field1996 != null) {
                var11 = arg1.field1996;
            }
            for (int var12 = 0; var12 < this.field2021.length; var12++) {
                var8.method3943(this.field2021[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hi.az(I)Lhi;")
    public final class196 method3412() {
        int var1 = -1;
        if (this.field2035 != -1) {
            var1 = class323.method4655(this.field2035);
        } else if (this.field2042 != -1) {
            var1 = class323.field3532[this.field2042];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2020.length - 1) {
            var2 = this.field2020[var1];
        } else {
            var2 = this.field2020[this.field2020.length - 1];
        }
        return var2 == -1 ? null : method4032(var2);
    }

    @ObfuscatedName("hi.av(I)Z")
    public boolean method3386() {
        if (this.field2020 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2035 != -1) {
            var1 = class323.method4655(this.field2035);
        } else if (this.field2042 != -1) {
            var1 = class323.field3532[this.field2042];
        }
        if (var1 >= 0 && var1 < this.field2020.length) {
            return this.field2020[var1] != -1;
        } else {
            return this.field2020[this.field2020.length - 1] != -1;
        }
    }

    @ObfuscatedName("hi.ap(IIB)I")
    public int method3376(int arg0, int arg1) {
        return class192.method3237(this.field2024, arg0, arg1);
    }

    @ObfuscatedName("hi.aq(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3384(int arg0, String arg1) {
        class489 var3 = this.field2024;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class471 var5 = (class471) var3.method7961((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4815;
            }
        }
        return var4;
    }

    @ObfuscatedName("eg.at(I)V")
    public static void method2757() {
        field2009.method5146();
        field2000.method5146();
    }

    @ObfuscatedName("hi.ah(I)Z")
    public boolean method3385() {
        return this.field2040 != null && this.field2041 != null;
    }

    @ObfuscatedName("hi.ax(I)[I")
    public int[] method3390() {
        return this.field2040;
    }

    @ObfuscatedName("hi.aa(II)I")
    public int method3383(int arg0) {
        return this.field2040 == null || arg0 >= this.field2040.length ? -1 : this.field2040[arg0];
    }

    @ObfuscatedName("hi.au(I)[S")
    public short[] method3420() {
        return this.field2041;
    }

    @ObfuscatedName("hi.ae(II)S")
    public short method3389(int arg0) {
        return this.field2041 == null || arg0 >= this.field2041.length ? -1 : this.field2041[arg0];
    }
}
