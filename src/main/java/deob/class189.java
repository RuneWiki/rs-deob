package deob;

@ObfuscatedName("gf")
public class class189 extends class404 {

    @ObfuscatedName("gf.o")
    public static class257 field2114 = new class257(64);

    @ObfuscatedName("gf.r")
    public static class257 field2072 = new class257(50);

    @ObfuscatedName("gf.p")
    public static class257 field2074 = new class257(200);

    @ObfuscatedName("gf.k")
    public int field2103;

    @ObfuscatedName("gf.d")
    public int field2075;

    @ObfuscatedName("gf.m")
    public String field2076 = class309.field3599;

    @ObfuscatedName("gf.u")
    public short[] field2119;

    @ObfuscatedName("gf.t")
    public short[] field2089;

    @ObfuscatedName("gf.g")
    public short[] field2101;

    @ObfuscatedName("gf.x")
    public short[] field2088;

    @ObfuscatedName("gf.a")
    public int field2081 = 2000;

    @ObfuscatedName("gf.y")
    public int field2082 = 0;

    @ObfuscatedName("gf.j")
    public int field2083 = 0;

    @ObfuscatedName("gf.e")
    public int field2084 = 0;

    @ObfuscatedName("gf.z")
    public int field2098 = 0;

    @ObfuscatedName("gf.h")
    public int field2086 = 0;

    @ObfuscatedName("gf.ae")
    public int field2087 = 0;

    @ObfuscatedName("gf.aq")
    public int field2073 = 1;

    @ObfuscatedName("gf.aw")
    public boolean field2080 = false;

    @ObfuscatedName("gf.am")
    public String[] field2111 = new String[] { null, null, class309.field3721, null, null };

    @ObfuscatedName("gf.ak")
    public String[] field2091 = new String[] { null, null, null, null, class309.field3593 };

    @ObfuscatedName("gf.aj")
    public int field2092 = -2;

    @ObfuscatedName("gf.al")
    public int field2093 = -1;

    @ObfuscatedName("gf.av")
    public int field2094 = -1;

    @ObfuscatedName("gf.at")
    public int field2095 = 0;

    @ObfuscatedName("gf.an")
    public int field2105 = -1;

    @ObfuscatedName("gf.ay")
    public int field2097 = -1;

    @ObfuscatedName("gf.ag")
    public int field2067 = 0;

    @ObfuscatedName("gf.ah")
    public int field2099 = -1;

    @ObfuscatedName("gf.ac")
    public int field2100 = -1;

    @ObfuscatedName("gf.ab")
    public int field2078 = -1;

    @ObfuscatedName("gf.au")
    public int field2102 = -1;

    @ObfuscatedName("gf.af")
    public int field2121 = -1;

    @ObfuscatedName("gf.ad")
    public int field2104 = -1;

    @ObfuscatedName("gf.ai")
    public int[] field2090;

    @ObfuscatedName("gf.ax")
    public int[] field2106;

    @ObfuscatedName("gf.ar")
    public int field2085 = -1;

    @ObfuscatedName("gf.ap")
    public int field2108 = -1;

    @ObfuscatedName("gf.az")
    public int field2109 = 128;

    @ObfuscatedName("gf.as")
    public int field2110 = 128;

    @ObfuscatedName("gf.aa")
    public int field2071 = 128;

    @ObfuscatedName("gf.bj")
    public int field2112 = 0;

    @ObfuscatedName("gf.bm")
    public int field2113 = 0;

    @ObfuscatedName("gf.br")
    public int field2096 = 0;

    @ObfuscatedName("gf.bo")
    public class418 field2115;

    @ObfuscatedName("gf.bl")
    public boolean field2116 = false;

    @ObfuscatedName("gf.be")
    public int field2107 = -1;

    @ObfuscatedName("gf.bh")
    public int field2118 = -1;

    @ObfuscatedName("gf.bf")
    public int field2117 = -1;

    @ObfuscatedName("gf.bb")
    public int field2120 = -1;

    @ObfuscatedName("fa.v(Lln;Lln;ZLmd;I)V")
    public static void method3006(class316 arg0, class316 arg1, boolean arg2, class344 arg3) {
        Statics.field317 = arg0;
        Statics.field1259 = arg1;
        Statics.field157 = arg2;
        Statics.field3314 = Statics.field317.method5305(10);
        Statics.field1978 = arg3;
    }

    @ObfuscatedName("gf.i(I)V")
    public void method3391() {
    }

    @ObfuscatedName("gf.f(Lpi;B)V")
    public void method3403(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3431(arg0, var2);
        }
    }

    @ObfuscatedName("gf.b(Lpi;II)V")
    public void method3431(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2075 = arg0.method7148();
        } else if (arg1 == 2) {
            this.field2076 = arg0.method6981();
        } else if (arg1 == 4) {
            this.field2081 = arg0.method7148();
        } else if (arg1 == 5) {
            this.field2082 = arg0.method7148();
        } else if (arg1 == 6) {
            this.field2083 = arg0.method7148();
        } else if (arg1 == 7) {
            this.field2098 = arg0.method7148();
            if (this.field2098 > 32767) {
                this.field2098 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2086 = arg0.method7148();
            if (this.field2086 > 32767) {
                this.field2086 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6981();
        } else if (arg1 == 11) {
            this.field2087 = 1;
        } else if (arg1 == 12) {
            this.field2073 = arg0.method6976();
        } else if (arg1 == 16) {
            this.field2080 = true;
        } else if (arg1 == 23) {
            this.field2093 = arg0.method7148();
            this.field2095 = arg0.method6971();
        } else if (arg1 == 24) {
            this.field2094 = arg0.method7148();
        } else if (arg1 == 25) {
            this.field2105 = arg0.method7148();
            this.field2067 = arg0.method6971();
        } else if (arg1 == 26) {
            this.field2097 = arg0.method7148();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2111[arg1 - 30] = arg0.method6981();
            if (this.field2111[arg1 - 30].equalsIgnoreCase(class309.field3594)) {
                this.field2111[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2091[arg1 - 35] = arg0.method6981();
        } else if (arg1 == 40) {
            int var3 = arg0.method6971();
            this.field2119 = new short[var3];
            this.field2089 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2119[var4] = (short) arg0.method7148();
                this.field2089[var4] = (short) arg0.method7148();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6971();
            this.field2101 = new short[var5];
            this.field2088 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2101[var6] = (short) arg0.method7148();
                this.field2088[var6] = (short) arg0.method7148();
            }
        } else if (arg1 == 42) {
            this.field2092 = arg0.method7093();
        } else if (arg1 == 65) {
            this.field2116 = true;
        } else if (arg1 == 78) {
            this.field2099 = arg0.method7148();
        } else if (arg1 == 79) {
            this.field2100 = arg0.method7148();
        } else if (arg1 == 90) {
            this.field2078 = arg0.method7148();
        } else if (arg1 == 91) {
            this.field2121 = arg0.method7148();
        } else if (arg1 == 92) {
            this.field2102 = arg0.method7148();
        } else if (arg1 == 93) {
            this.field2104 = arg0.method7148();
        } else if (arg1 == 94) {
            arg0.method7148();
        } else if (arg1 == 95) {
            this.field2084 = arg0.method7148();
        } else if (arg1 == 97) {
            this.field2085 = arg0.method7148();
        } else if (arg1 == 98) {
            this.field2108 = arg0.method7148();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2090 == null) {
                this.field2090 = new int[10];
                this.field2106 = new int[10];
            }
            this.field2090[arg1 - 100] = arg0.method7148();
            this.field2106[arg1 - 100] = arg0.method7148();
        } else if (arg1 == 110) {
            this.field2109 = arg0.method7148();
        } else if (arg1 == 111) {
            this.field2110 = arg0.method7148();
        } else if (arg1 == 112) {
            this.field2071 = arg0.method7148();
        } else if (arg1 == 113) {
            this.field2112 = arg0.method7093();
        } else if (arg1 == 114) {
            this.field2113 = arg0.method7093() * 5;
        } else if (arg1 == 115) {
            this.field2096 = arg0.method6971();
        } else if (arg1 == 139) {
            this.field2107 = arg0.method7148();
        } else if (arg1 == 140) {
            this.field2118 = arg0.method7148();
        } else if (arg1 == 148) {
            this.field2117 = arg0.method7148();
        } else if (arg1 == 149) {
            this.field2120 = arg0.method7148();
        } else if (arg1 == 249) {
            this.field2115 = class176.method3942(arg0, this.field2115);
        }
    }

    @ObfuscatedName("gf.n(Lgf;Lgf;B)V")
    public void method3424(class189 arg0, class189 arg1) {
        this.field2075 = arg0.field2075;
        this.field2081 = arg0.field2081;
        this.field2082 = arg0.field2082;
        this.field2083 = arg0.field2083;
        this.field2084 = arg0.field2084;
        this.field2098 = arg0.field2098;
        this.field2086 = arg0.field2086;
        this.field2119 = arg0.field2119;
        this.field2089 = arg0.field2089;
        this.field2101 = arg0.field2101;
        this.field2088 = arg0.field2088;
        this.field2076 = arg1.field2076;
        this.field2080 = arg1.field2080;
        this.field2073 = arg1.field2073;
        this.field2087 = 1;
    }

    @ObfuscatedName("gf.s(Lgf;Lgf;I)V")
    public void method3373(class189 arg0, class189 arg1) {
        this.field2075 = arg0.field2075;
        this.field2081 = arg0.field2081;
        this.field2082 = arg0.field2082;
        this.field2083 = arg0.field2083;
        this.field2084 = arg0.field2084;
        this.field2098 = arg0.field2098;
        this.field2086 = arg0.field2086;
        this.field2119 = arg1.field2119;
        this.field2089 = arg1.field2089;
        this.field2101 = arg1.field2101;
        this.field2088 = arg1.field2088;
        this.field2076 = arg1.field2076;
        this.field2080 = arg1.field2080;
        this.field2087 = arg1.field2087;
        this.field2093 = arg1.field2093;
        this.field2094 = arg1.field2094;
        this.field2099 = arg1.field2099;
        this.field2105 = arg1.field2105;
        this.field2097 = arg1.field2097;
        this.field2100 = arg1.field2100;
        this.field2078 = arg1.field2078;
        this.field2102 = arg1.field2102;
        this.field2121 = arg1.field2121;
        this.field2104 = arg1.field2104;
        this.field2096 = arg1.field2096;
        this.field2111 = arg1.field2111;
        this.field2091 = new String[5];
        if (arg1.field2091 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2091[var3] = arg1.field2091[var3];
            }
        }
        this.field2091[4] = class309.field3598;
        this.field2073 = 0;
    }

    @ObfuscatedName("gf.l(Lgf;Lgf;B)V")
    public void method3374(class189 arg0, class189 arg1) {
        this.field2075 = arg0.field2075;
        this.field2081 = arg0.field2081;
        this.field2082 = arg0.field2082;
        this.field2083 = arg0.field2083;
        this.field2084 = arg0.field2084;
        this.field2098 = arg0.field2098;
        this.field2086 = arg0.field2086;
        this.field2119 = arg0.field2119;
        this.field2089 = arg0.field2089;
        this.field2101 = arg0.field2101;
        this.field2088 = arg0.field2088;
        this.field2087 = arg0.field2087;
        this.field2076 = arg1.field2076;
        this.field2073 = 0;
        this.field2080 = false;
        this.field2116 = false;
    }

    @ObfuscatedName("gf.q(IB)Lhc;")
    public final class226 method3375(int arg0) {
        if (this.field2090 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2106[var3] && this.field2106[var3] != 0) {
                    var2 = this.field2090[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method268(var2).method3375(1);
            }
        }
        class226 var4 = class226.method4089(Statics.field1259, this.field2075, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2109 != 128 || this.field2110 != 128 || this.field2071 != 128) {
            var4.method4080(this.field2109, this.field2110, this.field2071);
        }
        if (this.field2119 != null) {
            for (int var5 = 0; var5 < this.field2119.length; var5++) {
                var4.method4046(this.field2119[var5], this.field2089[var5]);
            }
        }
        if (this.field2101 != null) {
            for (int var6 = 0; var6 < this.field2101.length; var6++) {
                var4.method4047(this.field2101[var6], this.field2088[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gf.o(II)Liq;")
    public final class241 method3397(int arg0) {
        if (this.field2090 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2106[var3] && this.field2106[var3] != 0) {
                    var2 = this.field2090[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method268(var2).method3397(1);
            }
        }
        class241 var4 = (class241) field2072.method4644((long) this.field2103);
        if (var4 != null) {
            return var4;
        }
        class226 var5 = class226.method4089(Statics.field1259, this.field2075, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2109 != 128 || this.field2110 != 128 || this.field2071 != 128) {
            var5.method4080(this.field2109, this.field2110, this.field2071);
        }
        if (this.field2119 != null) {
            for (int var6 = 0; var6 < this.field2119.length; var6++) {
                var5.method4046(this.field2119[var6], this.field2089[var6]);
            }
        }
        if (this.field2101 != null) {
            for (int var7 = 0; var7 < this.field2101.length; var7++) {
                var5.method4047(this.field2101[var7], this.field2088[var7]);
            }
        }
        class241 var8 = var5.method4054(this.field2112 + 64, this.field2113 + 768, -50, -10, -50);
        var8.field2751 = true;
        field2072.method4651(var8, (long) this.field2103);
        return var8;
    }

    @ObfuscatedName("gf.r(II)Lgf;")
    public class189 method3377(int arg0) {
        if (this.field2090 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2106[var3] && this.field2106[var3] != 0) {
                    var2 = this.field2090[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method268(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ei.p(IIIIIZI)Lqi;")
    public static final class451 method2718(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class451 var8 = (class451) field2074.method4644(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class189 var9 = Statics.method268(arg0);
        if (arg1 > 1 && var9.field2090 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2106[var11] && var9.field2106[var11] != 0) {
                    var10 = var9.field2090[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method268(var10);
            }
        }
        class241 var12 = var9.method3397(1);
        if (var12 == null) {
            return null;
        }
        class451 var13 = null;
        if (var9.field2108 != -1) {
            var13 = method2718(var9.field2085, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2118 != -1) {
            var13 = method2718(var9.field2107, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2120 != -1) {
            var13 = method2718(var9.field2117, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4686;
        int var15 = Statics.field4689;
        int var16 = Statics.field4687;
        int[] var17 = new int[4];
        class447.method7313(var17);
        class451 var18 = new class451(36, 32);
        class447.method7248(var18.field4717, 36, 32);
        class447.method7315();
        class231.method4165();
        class231.method4153(16, 16);
        class231.field2554 = false;
        if (var9.field2120 != -1) {
            var13.method7474(0, 0);
        }
        int var19 = var9.field2081;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class231.field2576[var9.field2082] * var19 >> 16;
        int var21 = class231.field2551[var9.field2082] * var19 >> 16;
        var12.method4539();
        var12.method4518(0, var9.field2083, var9.field2084, var9.field2082, var9.field2098, var9.field2086 + var12.field2659 / 2 + var20, var9.field2086 + var21);
        if (var9.field2118 != -1) {
            var13.method7474(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7365(1);
        }
        if (arg2 >= 2) {
            var18.method7365(16777215);
        }
        if (arg3 != 0) {
            var18.method7400(arg3);
        }
        class447.method7248(var18.field4717, 36, 32);
        if (var9.field2108 != -1) {
            var13.method7474(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2087 == 1) {
            class344 var22 = Statics.field1978;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class309.field3768 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class309.field3766 + "</col>";
            }
            var22.method5782(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2074.method4651(var18, var6);
        }
        class447.method7248(var14, var15, var16);
        class447.method7253(var17);
        class231.method4165();
        class231.field2554 = true;
        return var18;
    }

    @ObfuscatedName("gf.w(ZI)Z")
    public final boolean method3378(boolean arg0) {
        int var2 = this.field2093;
        int var3 = this.field2094;
        int var4 = this.field2099;
        if (arg0) {
            var2 = this.field2105;
            var3 = this.field2097;
            var4 = this.field2100;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1259.method5359(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1259.method5359(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1259.method5359(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gf.k(ZI)Lhc;")
    public final class226 method3382(boolean arg0) {
        int var2 = this.field2093;
        int var3 = this.field2094;
        int var4 = this.field2099;
        if (arg0) {
            var2 = this.field2105;
            var3 = this.field2097;
            var4 = this.field2100;
        }
        if (var2 == -1) {
            return null;
        }
        class226 var5 = class226.method4089(Statics.field1259, var2, 0);
        if (var3 != -1) {
            class226 var6 = class226.method4089(Statics.field1259, var3, 0);
            if (var4 == -1) {
                class226[] var9 = new class226[] { var5, var6 };
                var5 = new class226(var9, 2);
            } else {
                class226 var7 = class226.method4089(Statics.field1259, var4, 0);
                class226[] var8 = new class226[] { var5, var6, var7 };
                var5 = new class226(var8, 3);
            }
        }
        if (!arg0 && this.field2095 != 0) {
            var5.method4045(0, this.field2095, 0);
        }
        if (arg0 && this.field2067 != 0) {
            var5.method4045(0, this.field2067, 0);
        }
        if (this.field2119 != null) {
            for (int var10 = 0; var10 < this.field2119.length; var10++) {
                var5.method4046(this.field2119[var10], this.field2089[var10]);
            }
        }
        if (this.field2101 != null) {
            for (int var11 = 0; var11 < this.field2101.length; var11++) {
                var5.method4047(this.field2101[var11], this.field2088[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gf.d(ZI)Z")
    public final boolean method3386(boolean arg0) {
        int var2 = this.field2078;
        int var3 = this.field2102;
        if (arg0) {
            var2 = this.field2121;
            var3 = this.field2104;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1259.method5359(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1259.method5359(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gf.m(ZI)Lhc;")
    public final class226 method3381(boolean arg0) {
        int var2 = this.field2078;
        int var3 = this.field2102;
        if (arg0) {
            var2 = this.field2121;
            var3 = this.field2104;
        }
        if (var2 == -1) {
            return null;
        }
        class226 var4 = class226.method4089(Statics.field1259, var2, 0);
        if (var3 != -1) {
            class226 var5 = class226.method4089(Statics.field1259, var3, 0);
            class226[] var6 = new class226[] { var4, var5 };
            var4 = new class226(var6, 2);
        }
        if (this.field2119 != null) {
            for (int var7 = 0; var7 < this.field2119.length; var7++) {
                var4.method4046(this.field2119[var7], this.field2089[var7]);
            }
        }
        if (this.field2101 != null) {
            for (int var8 = 0; var8 < this.field2101.length; var8++) {
                var4.method4047(this.field2101[var8], this.field2088[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gf.u(III)I")
    public int method3372(int arg0, int arg1) {
        class418 var3 = this.field2115;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4409;
            }
        }
        return var4;
    }

    @ObfuscatedName("gf.t(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3383(int arg0, String arg1) {
        class418 var3 = this.field2115;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class405 var5 = (class405) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4406;
            }
        }
        return var4;
    }

    @ObfuscatedName("gf.g(I)I")
    public int method3384() {
        if (this.field2092 == -1 || this.field2091 == null) {
            return -1;
        } else if (this.field2092 >= 0) {
            return this.field2091[this.field2092] == null ? -1 : this.field2092;
        } else if (class309.field3593.equalsIgnoreCase(this.field2091[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ex.x(ZB)V")
    public static void method2808(boolean arg0) {
        if (Statics.field157 != arg0) {
            field2114.method4647();
            field2072.method4647();
            field2074.method4647();
            Statics.field157 = arg0;
        }
    }

    @ObfuscatedName("gf.a(I)Z")
    public boolean method3385() {
        return this.field2089 != null;
    }

    @ObfuscatedName("gf.y(I)Z")
    public boolean method3371() {
        return this.field2088 != null;
    }
}
