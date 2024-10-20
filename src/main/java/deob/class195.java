package deob;

@ObfuscatedName("gp")
public class class195 extends class425 {

    @ObfuscatedName("gp.r")
    public static class266 field2139 = new class266(64);

    @ObfuscatedName("gp.l")
    public static class266 field2186 = new class266(50);

    @ObfuscatedName("gp.s")
    public static class266 field2176 = new class266(200);

    @ObfuscatedName("gp.b")
    public int field2142;

    @ObfuscatedName("gp.o")
    public int field2164;

    @ObfuscatedName("gp.u")
    public String field2144 = class323.field3774;

    @ObfuscatedName("gp.z")
    public short[] field2145;

    @ObfuscatedName("gp.t")
    public short[] field2146;

    @ObfuscatedName("gp.w")
    public short[] field2173;

    @ObfuscatedName("gp.m")
    public short[] field2148;

    @ObfuscatedName("gp.q")
    public int field2157 = 2000;

    @ObfuscatedName("gp.i")
    public int field2150 = 0;

    @ObfuscatedName("gp.e")
    public int field2151 = 0;

    @ObfuscatedName("gp.g")
    public int field2152 = 0;

    @ObfuscatedName("gp.k")
    public int field2153 = 0;

    @ObfuscatedName("gp.v")
    public int field2141 = 0;

    @ObfuscatedName("gp.aj")
    public int field2155 = 0;

    @ObfuscatedName("gp.an")
    public int field2156 = 1;

    @ObfuscatedName("gp.ah")
    public int field2143 = -1;

    @ObfuscatedName("gp.ao")
    public int field2158 = -1;

    @ObfuscatedName("gp.ac")
    public int field2159 = -1;

    @ObfuscatedName("gp.af")
    public boolean field2175 = false;

    @ObfuscatedName("gp.ad")
    public String[] field2161 = new String[] { null, null, class323.field3824, null, null };

    @ObfuscatedName("gp.av")
    public String[] field2162 = new String[] { null, null, null, null, class323.field3768 };

    @ObfuscatedName("gp.ae")
    public int field2190 = -2;

    @ObfuscatedName("gp.ap")
    public int field2134 = -1;

    @ObfuscatedName("gp.as")
    public int field2170 = -1;

    @ObfuscatedName("gp.aq")
    public int field2166 = 0;

    @ObfuscatedName("gp.al")
    public int field2167 = -1;

    @ObfuscatedName("gp.ag")
    public int field2168 = -1;

    @ObfuscatedName("gp.am")
    public int field2169 = 0;

    @ObfuscatedName("gp.az")
    public int field2163 = -1;

    @ObfuscatedName("gp.ab")
    public int field2171 = -1;

    @ObfuscatedName("gp.ai")
    public int field2174 = -1;

    @ObfuscatedName("gp.au")
    public int field2154 = -1;

    @ObfuscatedName("gp.aw")
    public int field2193 = -1;

    @ObfuscatedName("gp.at")
    public int field2140 = -1;

    @ObfuscatedName("gp.ar")
    public int[] field2149;

    @ObfuscatedName("gp.ay")
    public int[] field2177;

    @ObfuscatedName("gp.ax")
    public int field2178 = -1;

    @ObfuscatedName("gp.aa")
    public int field2179 = -1;

    @ObfuscatedName("gp.bx")
    public int field2180 = 128;

    @ObfuscatedName("gp.bh")
    public int field2181 = 128;

    @ObfuscatedName("gp.bm")
    public int field2182 = 128;

    @ObfuscatedName("gp.bp")
    public int field2172 = 0;

    @ObfuscatedName("gp.bl")
    public int field2184 = 0;

    @ObfuscatedName("gp.bo")
    public int field2185 = 0;

    @ObfuscatedName("gp.bg")
    public int field2183 = 0;

    @ObfuscatedName("gp.bd")
    public class440 field2187;

    @ObfuscatedName("gp.bq")
    public boolean field2188 = false;

    @ObfuscatedName("gp.bk")
    public int field2160 = -1;

    @ObfuscatedName("gp.bc")
    public int field2136 = -1;

    @ObfuscatedName("gp.bv")
    public int field2165 = -1;

    @ObfuscatedName("gp.bt")
    public int field2192 = -1;

    @ObfuscatedName("jr.a(II)Lgp;")
    public static class195 method5052(int arg0) {
        class195 var1 = (class195) field2139.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3388.method5859(10, arg0);
        class195 var3 = new class195();
        var3.field2142 = arg0;
        if (var2 != null) {
            var3.method3471(new class464(var2));
        }
        var3.method3465();
        if (var3.field2179 != -1) {
            var3.method3468(method5052(var3.field2179), method5052(var3.field2178));
        }
        if (var3.field2136 != -1) {
            var3.method3472(method5052(var3.field2136), method5052(var3.field2160));
        }
        if (var3.field2192 != -1) {
            var3.method3488(method5052(var3.field2192), method5052(var3.field2165));
        }
        if (!Statics.field1 && var3.field2175) {
            var3.field2144 = class323.field3866;
            var3.field2188 = false;
            for (int var4 = 0; var4 < var3.field2161.length; var4++) {
                var3.field2161[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2162.length; var5++) {
                if (var5 != 4) {
                    var3.field2162[var5] = null;
                }
            }
            var3.field2190 = -2;
            var3.field2185 = 0;
            if (var3.field2187 != null) {
                boolean var6 = false;
                for (class430 var7 = var3.field2187.method7454(); var7 != null; var7 = var3.field2187.method7456()) {
                    class191 var8 = class191.method4313((int) var7.field4635);
                    if (var8.field2046) {
                        var7.method7170();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2187 = null;
                }
            }
        }
        field2139.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.f(B)V")
    public void method3465() {
        if (this.field2155 == 1) {
            this.field2183 = 0;
        }
    }

    @ObfuscatedName("gp.c(Lqr;I)V")
    public void method3471(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3467(arg0, var2);
        }
    }

    @ObfuscatedName("gp.x(Lqr;II)V")
    public void method3467(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2164 = arg0.method7716();
        } else if (arg1 == 2) {
            this.field2144 = arg0.method7725();
        } else if (arg1 == 4) {
            this.field2157 = arg0.method7716();
        } else if (arg1 == 5) {
            this.field2150 = arg0.method7716();
        } else if (arg1 == 6) {
            this.field2151 = arg0.method7716();
        } else if (arg1 == 7) {
            this.field2153 = arg0.method7716();
            if (this.field2153 > 32767) {
                this.field2153 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2141 = arg0.method7716();
            if (this.field2141 > 32767) {
                this.field2141 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7725();
        } else if (arg1 == 11) {
            this.field2155 = 1;
        } else if (arg1 == 12) {
            this.field2156 = arg0.method7720();
        } else if (arg1 == 13) {
            this.field2143 = arg0.method7735();
        } else if (arg1 == 14) {
            this.field2158 = arg0.method7735();
        } else if (arg1 == 16) {
            this.field2175 = true;
        } else if (arg1 == 23) {
            this.field2134 = arg0.method7716();
            this.field2166 = arg0.method7735();
        } else if (arg1 == 24) {
            this.field2170 = arg0.method7716();
        } else if (arg1 == 25) {
            this.field2167 = arg0.method7716();
            this.field2169 = arg0.method7735();
        } else if (arg1 == 26) {
            this.field2168 = arg0.method7716();
        } else if (arg1 == 27) {
            this.field2159 = arg0.method7735();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2161[arg1 - 30] = arg0.method7725();
            if (this.field2161[arg1 - 30].equalsIgnoreCase(class323.field3769)) {
                this.field2161[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2162[arg1 - 35] = arg0.method7725();
        } else if (arg1 == 40) {
            int var3 = arg0.method7735();
            this.field2145 = new short[var3];
            this.field2146 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2145[var4] = (short) arg0.method7716();
                this.field2146[var4] = (short) arg0.method7716();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7735();
            this.field2173 = new short[var5];
            this.field2148 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2173[var6] = (short) arg0.method7716();
                this.field2148[var6] = (short) arg0.method7716();
            }
        } else if (arg1 == 42) {
            this.field2190 = arg0.method7881();
        } else if (arg1 == 65) {
            this.field2188 = true;
        } else if (arg1 == 75) {
            this.field2183 = arg0.method7798();
        } else if (arg1 == 78) {
            this.field2163 = arg0.method7716();
        } else if (arg1 == 79) {
            this.field2171 = arg0.method7716();
        } else if (arg1 == 90) {
            this.field2174 = arg0.method7716();
        } else if (arg1 == 91) {
            this.field2193 = arg0.method7716();
        } else if (arg1 == 92) {
            this.field2154 = arg0.method7716();
        } else if (arg1 == 93) {
            this.field2140 = arg0.method7716();
        } else if (arg1 == 94) {
            arg0.method7716();
        } else if (arg1 == 95) {
            this.field2152 = arg0.method7716();
        } else if (arg1 == 97) {
            this.field2178 = arg0.method7716();
        } else if (arg1 == 98) {
            this.field2179 = arg0.method7716();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2149 == null) {
                this.field2149 = new int[10];
                this.field2177 = new int[10];
            }
            this.field2149[arg1 - 100] = arg0.method7716();
            this.field2177[arg1 - 100] = arg0.method7716();
        } else if (arg1 == 110) {
            this.field2180 = arg0.method7716();
        } else if (arg1 == 111) {
            this.field2181 = arg0.method7716();
        } else if (arg1 == 112) {
            this.field2182 = arg0.method7716();
        } else if (arg1 == 113) {
            this.field2172 = arg0.method7881();
        } else if (arg1 == 114) {
            this.field2184 = arg0.method7881() * 5;
        } else if (arg1 == 115) {
            this.field2185 = arg0.method7735();
        } else if (arg1 == 139) {
            this.field2160 = arg0.method7716();
        } else if (arg1 == 140) {
            this.field2136 = arg0.method7716();
        } else if (arg1 == 148) {
            this.field2165 = arg0.method7716();
        } else if (arg1 == 149) {
            this.field2192 = arg0.method7716();
        } else if (arg1 == 249) {
            this.field2187 = class182.method4112(arg0, this.field2187);
        }
    }

    @ObfuscatedName("gp.h(Lgp;Lgp;I)V")
    public void method3468(class195 arg0, class195 arg1) {
        this.field2164 = arg0.field2164;
        this.field2157 = arg0.field2157;
        this.field2150 = arg0.field2150;
        this.field2151 = arg0.field2151;
        this.field2152 = arg0.field2152;
        this.field2153 = arg0.field2153;
        this.field2141 = arg0.field2141;
        this.field2145 = arg0.field2145;
        this.field2146 = arg0.field2146;
        this.field2173 = arg0.field2173;
        this.field2148 = arg0.field2148;
        this.field2144 = arg1.field2144;
        this.field2175 = arg1.field2175;
        this.field2156 = arg1.field2156;
        this.field2155 = 1;
    }

    @ObfuscatedName("gp.j(Lgp;Lgp;I)V")
    public void method3472(class195 arg0, class195 arg1) {
        this.field2164 = arg0.field2164;
        this.field2157 = arg0.field2157;
        this.field2150 = arg0.field2150;
        this.field2151 = arg0.field2151;
        this.field2152 = arg0.field2152;
        this.field2153 = arg0.field2153;
        this.field2141 = arg0.field2141;
        this.field2145 = arg1.field2145;
        this.field2146 = arg1.field2146;
        this.field2173 = arg1.field2173;
        this.field2148 = arg1.field2148;
        this.field2144 = arg1.field2144;
        this.field2175 = arg1.field2175;
        this.field2155 = arg1.field2155;
        this.field2143 = arg1.field2143;
        this.field2158 = arg1.field2158;
        this.field2159 = arg1.field2159;
        this.field2134 = arg1.field2134;
        this.field2170 = arg1.field2170;
        this.field2163 = arg1.field2163;
        this.field2167 = arg1.field2167;
        this.field2168 = arg1.field2168;
        this.field2171 = arg1.field2171;
        this.field2174 = arg1.field2174;
        this.field2154 = arg1.field2154;
        this.field2193 = arg1.field2193;
        this.field2140 = arg1.field2140;
        this.field2185 = arg1.field2185;
        this.field2161 = arg1.field2161;
        this.field2183 = arg1.field2183;
        this.field2162 = new String[5];
        if (arg1.field2162 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2162[var3] = arg1.field2162[var3];
            }
        }
        this.field2162[4] = class323.field4006;
        this.field2156 = 0;
    }

    @ObfuscatedName("gp.y(Lgp;Lgp;B)V")
    public void method3488(class195 arg0, class195 arg1) {
        this.field2164 = arg0.field2164;
        this.field2157 = arg0.field2157;
        this.field2150 = arg0.field2150;
        this.field2151 = arg0.field2151;
        this.field2152 = arg0.field2152;
        this.field2153 = arg0.field2153;
        this.field2141 = arg0.field2141;
        this.field2145 = arg0.field2145;
        this.field2146 = arg0.field2146;
        this.field2173 = arg0.field2173;
        this.field2148 = arg0.field2148;
        this.field2155 = arg0.field2155;
        this.field2144 = arg1.field2144;
        this.field2156 = 0;
        this.field2175 = false;
        this.field2188 = false;
    }

    @ObfuscatedName("gp.d(II)Lgs;")
    public final class206 method3487(int arg0) {
        if (this.field2149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2177[var3] && this.field2177[var3] != 0) {
                    var2 = this.field2149[var3];
                }
            }
            if (var2 != -1) {
                return method5052(var2).method3487(1);
            }
        }
        class206 var4 = class206.method3710(Statics.field2138, this.field2164, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2180 != 128 || this.field2181 != 128 || this.field2182 != 128) {
            var4.method3712(this.field2180, this.field2181, this.field2182);
        }
        if (this.field2145 != null) {
            for (int var5 = 0; var5 < this.field2145.length; var5++) {
                var4.method3726(this.field2145[var5], this.field2146[var5]);
            }
        }
        if (this.field2173 != null) {
            for (int var6 = 0; var6 < this.field2173.length; var6++) {
                var4.method3727(this.field2173[var6], this.field2148[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gp.n(IB)Lha;")
    public final class221 method3470(int arg0) {
        if (this.field2149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2177[var3] && this.field2177[var3] != 0) {
                    var2 = this.field2149[var3];
                }
            }
            if (var2 != -1) {
                return method5052(var2).method3470(1);
            }
        }
        class221 var4 = (class221) field2186.method4839((long) this.field2142);
        if (var4 != null) {
            return var4;
        }
        class206 var5 = class206.method3710(Statics.field2138, this.field2164, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2180 != 128 || this.field2181 != 128 || this.field2182 != 128) {
            var5.method3712(this.field2180, this.field2181, this.field2182);
        }
        if (this.field2145 != null) {
            for (int var6 = 0; var6 < this.field2145.length; var6++) {
                var5.method3726(this.field2145[var6], this.field2146[var6]);
            }
        }
        if (this.field2173 != null) {
            for (int var7 = 0; var7 < this.field2173.length; var7++) {
                var5.method3727(this.field2173[var7], this.field2148[var7]);
            }
        }
        class221 var8 = var5.method3732(this.field2172 + 64, this.field2184 + 768, -50, -10, -50);
        var8.field2620 = true;
        field2186.method4834(var8, (long) this.field2142);
        return var8;
    }

    @ObfuscatedName("gp.r(II)Lgp;")
    public class195 method3473(int arg0) {
        if (this.field2149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2177[var3] && this.field2177[var3] != 0) {
                    var2 = this.field2149[var3];
                }
            }
            if (var2 != -1) {
                return method5052(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bs.l(IIIIIZB)Lri;")
    public static final class477 method2054(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class477 var8 = (class477) field2176.method4839(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class195 var9 = method5052(arg0);
        if (arg1 > 1 && var9.field2149 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2177[var11] && var9.field2177[var11] != 0) {
                    var10 = var9.field2149[var11];
                }
            }
            if (var10 != -1) {
                var9 = method5052(var10);
            }
        }
        class221 var12 = var9.method3470(1);
        if (var12 == null) {
            return null;
        }
        class477 var13 = null;
        if (var9.field2179 != -1) {
            var13 = method2054(var9.field2178, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2136 != -1) {
            var13 = method2054(var9.field2160, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2192 != -1) {
            var13 = method2054(var9.field2165, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4934;
        int var15 = Statics.field4935;
        int var16 = Statics.field4936;
        int[] var17 = new int[4];
        class473.method8080(var17);
        class477 var18 = new class477(36, 32);
        class473.method8013(var18.field4959, 36, 32);
        class473.method8018();
        class211.method3802();
        class211.method3845(16, 16);
        class211.field2415 = false;
        if (var9.field2192 != -1) {
            var13.method8174(0, 0);
        }
        int var19 = var9.field2157;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class211.field2437[var9.field2150] * var19 >> 16;
        int var21 = class211.field2438[var9.field2150] * var19 >> 16;
        var12.method4232();
        var12.method4239(0, var9.field2151, var9.field2152, var9.field2150, var9.field2153, var9.field2141 + var12.field2521 / 2 + var20, var9.field2141 + var21);
        if (var9.field2136 != -1) {
            var13.method8174(0, 0);
        }
        if (arg2 >= 1) {
            var18.method8166(1);
        }
        if (arg2 >= 2) {
            var18.method8166(16777215);
        }
        if (arg3 != 0) {
            var18.method8130(arg3);
        }
        class473.method8013(var18.field4959, 36, 32);
        if (var9.field2179 != -1) {
            var13.method8174(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2155 == 1) {
            class365 var22 = Statics.field1618;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class323.field3943 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class323.field3941 + "</col>";
            }
            var22.method6429(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2176.method4834(var18, var6);
        }
        class473.method8013(var14, var15, var16);
        class473.method8017(var17);
        class211.method3802();
        class211.field2415 = true;
        return var18;
    }

    @ObfuscatedName("gp.s(II)Z")
    public final boolean method3516(int arg0) {
        int var2 = this.field2134;
        int var3 = this.field2170;
        int var4 = this.field2163;
        if (arg0 == 1) {
            var2 = this.field2167;
            var3 = this.field2168;
            var4 = this.field2171;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2138.method5784(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2138.method5784(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2138.method5784(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gp.p(II)Lgs;")
    public final class206 method3469(int arg0) {
        int var2 = this.field2134;
        int var3 = this.field2170;
        int var4 = this.field2163;
        if (arg0 == 1) {
            var2 = this.field2167;
            var3 = this.field2168;
            var4 = this.field2171;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var5 = class206.method3710(Statics.field2138, var2, 0);
        if (var3 != -1) {
            class206 var6 = class206.method3710(Statics.field2138, var3, 0);
            if (var4 == -1) {
                class206[] var9 = new class206[] { var5, var6 };
                var5 = new class206(var9, 2);
            } else {
                class206 var7 = class206.method3710(Statics.field2138, var4, 0);
                class206[] var8 = new class206[] { var5, var6, var7 };
                var5 = new class206(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2166 != 0) {
            var5.method3758(0, this.field2166, 0);
        }
        if (arg0 == 1 && this.field2169 != 0) {
            var5.method3758(0, this.field2169, 0);
        }
        if (this.field2145 != null) {
            for (int var10 = 0; var10 < this.field2145.length; var10++) {
                var5.method3726(this.field2145[var10], this.field2146[var10]);
            }
        }
        if (this.field2173 != null) {
            for (int var11 = 0; var11 < this.field2173.length; var11++) {
                var5.method3727(this.field2173[var11], this.field2148[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gp.b(II)Z")
    public final boolean method3514(int arg0) {
        int var2 = this.field2174;
        int var3 = this.field2154;
        if (arg0 == 1) {
            var2 = this.field2193;
            var3 = this.field2140;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2138.method5784(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2138.method5784(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gp.o(IB)Lgs;")
    public final class206 method3477(int arg0) {
        int var2 = this.field2174;
        int var3 = this.field2154;
        if (arg0 == 1) {
            var2 = this.field2193;
            var3 = this.field2140;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var4 = class206.method3710(Statics.field2138, var2, 0);
        if (var3 != -1) {
            class206 var5 = class206.method3710(Statics.field2138, var3, 0);
            class206[] var6 = new class206[] { var4, var5 };
            var4 = new class206(var6, 2);
        }
        if (this.field2145 != null) {
            for (int var7 = 0; var7 < this.field2145.length; var7++) {
                var4.method3726(this.field2145[var7], this.field2146[var7]);
            }
        }
        if (this.field2173 != null) {
            for (int var8 = 0; var8 < this.field2173.length; var8++) {
                var4.method3727(this.field2173[var8], this.field2148[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gp.u(III)I")
    public int method3478(int arg0, int arg1) {
        return class182.method6006(this.field2187, arg0, arg1);
    }

    @ObfuscatedName("gp.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3479(int arg0, String arg1) {
        return class182.method6701(this.field2187, arg0, arg1);
    }

    @ObfuscatedName("gp.t(I)I")
    public int method3480() {
        if (this.field2190 == -1 || this.field2162 == null) {
            return -1;
        } else if (this.field2190 >= 0) {
            return this.field2162[this.field2190] == null ? -1 : this.field2190;
        } else if (class323.field3768.equalsIgnoreCase(this.field2162[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hx.w(I)V")
    public static void method4346() {
        field2139.method4837();
        field2186.method4837();
        field2176.method4837();
    }

    @ObfuscatedName("ak.m(I)V")
    public static void method498() {
        field2176.method4837();
    }

    @ObfuscatedName("ji.q(ZI)V")
    public static void method4851(boolean arg0) {
        if (Statics.field1 != arg0) {
            method4346();
            Statics.field1 = arg0;
        }
    }

    @ObfuscatedName("gp.i(I)Z")
    public boolean method3475() {
        return this.field2146 != null;
    }

    @ObfuscatedName("gp.e(S)Z")
    public boolean method3511() {
        return this.field2148 != null;
    }
}
