package deob;

@ObfuscatedName("gk")
public class class189 extends class407 {

    @ObfuscatedName("gk.x")
    public static class257 field2128 = new class257(64);

    @ObfuscatedName("gk.j")
    public static class257 field2154 = new class257(50);

    @ObfuscatedName("gk.v")
    public static class257 field2127 = new class257(200);

    @ObfuscatedName("gk.t")
    public int field2131;

    @ObfuscatedName("gk.u")
    public int field2179;

    @ObfuscatedName("gk.d")
    public String field2139 = class310.field3924;

    @ObfuscatedName("gk.b")
    public short[] field2134;

    @ObfuscatedName("gk.a")
    public short[] field2135;

    @ObfuscatedName("gk.l")
    public short[] field2136;

    @ObfuscatedName("gk.e")
    public short[] field2137;

    @ObfuscatedName("gk.g")
    public int field2138 = 2000;

    @ObfuscatedName("gk.y")
    public int field2150 = 0;

    @ObfuscatedName("gk.i")
    public int field2140 = 0;

    @ObfuscatedName("gk.r")
    public int field2141 = 0;

    @ObfuscatedName("gk.z")
    public int field2142 = 0;

    @ObfuscatedName("gk.o")
    public int field2143 = 0;

    @ObfuscatedName("gk.as")
    public int field2133 = 0;

    @ObfuscatedName("gk.ac")
    public int field2145 = 1;

    @ObfuscatedName("gk.ao")
    public boolean field2146 = false;

    @ObfuscatedName("gk.ar")
    public String[] field2147 = new String[] { null, null, class310.field3656, null, null };

    @ObfuscatedName("gk.aq")
    public String[] field2170 = new String[] { null, null, null, null, class310.field3657 };

    @ObfuscatedName("gk.an")
    public int field2160 = -2;

    @ObfuscatedName("gk.aa")
    public int field2151 = -1;

    @ObfuscatedName("gk.ak")
    public int field2152 = -1;

    @ObfuscatedName("gk.am")
    public int field2153 = 0;

    @ObfuscatedName("gk.ap")
    public int field2175 = -1;

    @ObfuscatedName("gk.ab")
    public int field2155 = -1;

    @ObfuscatedName("gk.az")
    public int field2156 = 0;

    @ObfuscatedName("gk.ad")
    public int field2157 = -1;

    @ObfuscatedName("gk.af")
    public int field2132 = -1;

    @ObfuscatedName("gk.aj")
    public int field2159 = -1;

    @ObfuscatedName("gk.ax")
    public int field2171 = -1;

    @ObfuscatedName("gk.av")
    public int field2161 = -1;

    @ObfuscatedName("gk.ae")
    public int field2144 = -1;

    @ObfuscatedName("gk.ay")
    public int[] field2129;

    @ObfuscatedName("gk.ag")
    public int[] field2148;

    @ObfuscatedName("gk.aw")
    public int field2165 = -1;

    @ObfuscatedName("gk.ah")
    public int field2166 = -1;

    @ObfuscatedName("gk.at")
    public int field2167 = 128;

    @ObfuscatedName("gk.al")
    public int field2168 = 128;

    @ObfuscatedName("gk.au")
    public int field2169 = 128;

    @ObfuscatedName("gk.bg")
    public int field2130 = 0;

    @ObfuscatedName("gk.bw")
    public int field2125 = 0;

    @ObfuscatedName("gk.bc")
    public int field2172 = 0;

    @ObfuscatedName("gk.bv")
    public class421 field2173;

    @ObfuscatedName("gk.bi")
    public boolean field2162 = false;

    @ObfuscatedName("gk.bj")
    public int field2122 = -1;

    @ObfuscatedName("gk.by")
    public int field2176 = -1;

    @ObfuscatedName("gk.bz")
    public int field2177 = -1;

    @ObfuscatedName("gk.bo")
    public int field2178 = -1;

    @ObfuscatedName("fz.c(Llv;Llv;ZLmv;I)V")
    public static void method3333(class317 arg0, class317 arg1, boolean arg2, class351 arg3) {
        Statics.field2163 = arg0;
        Statics.field2126 = arg1;
        Statics.field103 = arg2;
        Statics.field2174 = Statics.field2163.method5425(10);
        Statics.field3552 = arg3;
    }

    @ObfuscatedName("dp.p(II)Lgk;")
    public static class189 method2643(int arg0) {
        class189 var1 = (class189) field2128.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2163.method5499(10, arg0);
        class189 var3 = new class189();
        var3.field2131 = arg0;
        if (var2 != null) {
            var3.method3487(new class445(var2));
        }
        var3.method3467();
        if (var3.field2166 != -1) {
            var3.method3510(method2643(var3.field2166), method2643(var3.field2165));
        }
        if (var3.field2176 != -1) {
            var3.method3471(method2643(var3.field2176), method2643(var3.field2122));
        }
        if (var3.field2178 != -1) {
            var3.method3472(method2643(var3.field2178), method2643(var3.field2177));
        }
        if (!Statics.field103 && var3.field2146) {
            var3.field2139 = class310.field3890;
            var3.field2162 = false;
            for (int var4 = 0; var4 < var3.field2147.length; var4++) {
                var3.field2147[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2170.length; var5++) {
                if (var5 != 4) {
                    var3.field2170[var5] = null;
                }
            }
            var3.field2160 = -2;
            var3.field2172 = 0;
            if (var3.field2173 != null) {
                boolean var6 = false;
                for (class412 var7 = var3.field2173.method6925(); var7 != null; var7 = var3.field2173.method6916()) {
                    class185 var8 = class185.method2006((int) var7.field4504);
                    if (var8.field2033) {
                        var7.method6657();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2173 = null;
                }
            }
        }
        field2128.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.f(I)V")
    public void method3467() {
    }

    @ObfuscatedName("gk.n(Lqq;I)V")
    public void method3487(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3469(arg0, var2);
        }
    }

    @ObfuscatedName("gk.k(Lqq;II)V")
    public void method3469(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2179 = arg0.method7198();
        } else if (arg1 == 2) {
            this.field2139 = arg0.method7206();
        } else if (arg1 == 4) {
            this.field2138 = arg0.method7198();
        } else if (arg1 == 5) {
            this.field2150 = arg0.method7198();
        } else if (arg1 == 6) {
            this.field2140 = arg0.method7198();
        } else if (arg1 == 7) {
            this.field2142 = arg0.method7198();
            if (this.field2142 > 32767) {
                this.field2142 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2143 = arg0.method7198();
            if (this.field2143 > 32767) {
                this.field2143 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7206();
        } else if (arg1 == 11) {
            this.field2133 = 1;
        } else if (arg1 == 12) {
            this.field2145 = arg0.method7201();
        } else if (arg1 == 16) {
            this.field2146 = true;
        } else if (arg1 == 23) {
            this.field2151 = arg0.method7198();
            this.field2153 = arg0.method7196();
        } else if (arg1 == 24) {
            this.field2152 = arg0.method7198();
        } else if (arg1 == 25) {
            this.field2175 = arg0.method7198();
            this.field2156 = arg0.method7196();
        } else if (arg1 == 26) {
            this.field2155 = arg0.method7198();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2147[arg1 - 30] = arg0.method7206();
            if (this.field2147[arg1 - 30].equalsIgnoreCase(class310.field3658)) {
                this.field2147[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2170[arg1 - 35] = arg0.method7206();
        } else if (arg1 == 40) {
            int var3 = arg0.method7196();
            this.field2134 = new short[var3];
            this.field2135 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2134[var4] = (short) arg0.method7198();
                this.field2135[var4] = (short) arg0.method7198();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7196();
            this.field2136 = new short[var5];
            this.field2137 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2136[var6] = (short) arg0.method7198();
                this.field2137[var6] = (short) arg0.method7198();
            }
        } else if (arg1 == 42) {
            this.field2160 = arg0.method7197();
        } else if (arg1 == 65) {
            this.field2162 = true;
        } else if (arg1 == 78) {
            this.field2157 = arg0.method7198();
        } else if (arg1 == 79) {
            this.field2132 = arg0.method7198();
        } else if (arg1 == 90) {
            this.field2159 = arg0.method7198();
        } else if (arg1 == 91) {
            this.field2161 = arg0.method7198();
        } else if (arg1 == 92) {
            this.field2171 = arg0.method7198();
        } else if (arg1 == 93) {
            this.field2144 = arg0.method7198();
        } else if (arg1 == 94) {
            arg0.method7198();
        } else if (arg1 == 95) {
            this.field2141 = arg0.method7198();
        } else if (arg1 == 97) {
            this.field2165 = arg0.method7198();
        } else if (arg1 == 98) {
            this.field2166 = arg0.method7198();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2129 == null) {
                this.field2129 = new int[10];
                this.field2148 = new int[10];
            }
            this.field2129[arg1 - 100] = arg0.method7198();
            this.field2148[arg1 - 100] = arg0.method7198();
        } else if (arg1 == 110) {
            this.field2167 = arg0.method7198();
        } else if (arg1 == 111) {
            this.field2168 = arg0.method7198();
        } else if (arg1 == 112) {
            this.field2169 = arg0.method7198();
        } else if (arg1 == 113) {
            this.field2130 = arg0.method7197();
        } else if (arg1 == 114) {
            this.field2125 = arg0.method7197() * 5;
        } else if (arg1 == 115) {
            this.field2172 = arg0.method7196();
        } else if (arg1 == 139) {
            this.field2122 = arg0.method7198();
        } else if (arg1 == 140) {
            this.field2176 = arg0.method7198();
        } else if (arg1 == 148) {
            this.field2177 = arg0.method7198();
        } else if (arg1 == 149) {
            this.field2178 = arg0.method7198();
        } else if (arg1 == 249) {
            this.field2173 = class176.method643(arg0, this.field2173);
        }
    }

    @ObfuscatedName("gk.w(Lgk;Lgk;B)V")
    public void method3510(class189 arg0, class189 arg1) {
        this.field2179 = arg0.field2179;
        this.field2138 = arg0.field2138;
        this.field2150 = arg0.field2150;
        this.field2140 = arg0.field2140;
        this.field2141 = arg0.field2141;
        this.field2142 = arg0.field2142;
        this.field2143 = arg0.field2143;
        this.field2134 = arg0.field2134;
        this.field2135 = arg0.field2135;
        this.field2136 = arg0.field2136;
        this.field2137 = arg0.field2137;
        this.field2139 = arg1.field2139;
        this.field2146 = arg1.field2146;
        this.field2145 = arg1.field2145;
        this.field2133 = 1;
    }

    @ObfuscatedName("gk.s(Lgk;Lgk;B)V")
    public void method3471(class189 arg0, class189 arg1) {
        this.field2179 = arg0.field2179;
        this.field2138 = arg0.field2138;
        this.field2150 = arg0.field2150;
        this.field2140 = arg0.field2140;
        this.field2141 = arg0.field2141;
        this.field2142 = arg0.field2142;
        this.field2143 = arg0.field2143;
        this.field2134 = arg1.field2134;
        this.field2135 = arg1.field2135;
        this.field2136 = arg1.field2136;
        this.field2137 = arg1.field2137;
        this.field2139 = arg1.field2139;
        this.field2146 = arg1.field2146;
        this.field2133 = arg1.field2133;
        this.field2151 = arg1.field2151;
        this.field2152 = arg1.field2152;
        this.field2157 = arg1.field2157;
        this.field2175 = arg1.field2175;
        this.field2155 = arg1.field2155;
        this.field2132 = arg1.field2132;
        this.field2159 = arg1.field2159;
        this.field2171 = arg1.field2171;
        this.field2161 = arg1.field2161;
        this.field2144 = arg1.field2144;
        this.field2172 = arg1.field2172;
        this.field2147 = arg1.field2147;
        this.field2170 = new String[5];
        if (arg1.field2170 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2170[var3] = arg1.field2170[var3];
            }
        }
        this.field2170[4] = class310.field3901;
        this.field2145 = 0;
    }

    @ObfuscatedName("gk.q(Lgk;Lgk;B)V")
    public void method3472(class189 arg0, class189 arg1) {
        this.field2179 = arg0.field2179;
        this.field2138 = arg0.field2138;
        this.field2150 = arg0.field2150;
        this.field2140 = arg0.field2140;
        this.field2141 = arg0.field2141;
        this.field2142 = arg0.field2142;
        this.field2143 = arg0.field2143;
        this.field2134 = arg0.field2134;
        this.field2135 = arg0.field2135;
        this.field2136 = arg0.field2136;
        this.field2137 = arg0.field2137;
        this.field2133 = arg0.field2133;
        this.field2139 = arg1.field2139;
        this.field2145 = 0;
        this.field2146 = false;
        this.field2162 = false;
    }

    @ObfuscatedName("gk.m(IB)Lgu;")
    public final class197 method3512(int arg0) {
        if (this.field2129 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2148[var3] && this.field2148[var3] != 0) {
                    var2 = this.field2129[var3];
                }
            }
            if (var2 != -1) {
                return method2643(var2).method3512(1);
            }
        }
        class197 var4 = class197.method3742(Statics.field2126, this.field2179, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2167 != 128 || this.field2168 != 128 || this.field2169 != 128) {
            var4.method3686(this.field2167, this.field2168, this.field2169);
        }
        if (this.field2134 != null) {
            for (int var5 = 0; var5 < this.field2134.length; var5++) {
                var4.method3683(this.field2134[var5], this.field2135[var5]);
            }
        }
        if (this.field2136 != null) {
            for (int var6 = 0; var6 < this.field2136.length; var6++) {
                var4.method3722(this.field2136[var6], this.field2137[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gk.x(IB)Lha;")
    public final class212 method3498(int arg0) {
        if (this.field2129 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2148[var3] && this.field2148[var3] != 0) {
                    var2 = this.field2129[var3];
                }
            }
            if (var2 != -1) {
                return method2643(var2).method3498(1);
            }
        }
        class212 var4 = (class212) field2154.method4789((long) this.field2131);
        if (var4 != null) {
            return var4;
        }
        class197 var5 = class197.method3742(Statics.field2126, this.field2179, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2167 != 128 || this.field2168 != 128 || this.field2169 != 128) {
            var5.method3686(this.field2167, this.field2168, this.field2169);
        }
        if (this.field2134 != null) {
            for (int var6 = 0; var6 < this.field2134.length; var6++) {
                var5.method3683(this.field2134[var6], this.field2135[var6]);
            }
        }
        if (this.field2136 != null) {
            for (int var7 = 0; var7 < this.field2136.length; var7++) {
                var5.method3722(this.field2136[var7], this.field2137[var7]);
            }
        }
        class212 var8 = var5.method3690(this.field2130 + 64, this.field2125 + 768, -50, -10, -50);
        var8.field2567 = true;
        field2154.method4781(var8, (long) this.field2131);
        return var8;
    }

    @ObfuscatedName("gk.j(IB)Lgk;")
    public class189 method3479(int arg0) {
        if (this.field2129 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2148[var3] && this.field2148[var3] != 0) {
                    var2 = this.field2129[var3];
                }
            }
            if (var2 != -1) {
                return method2643(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ao.v(IIIIIZB)Lqi;")
    public static final class458 method407(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class458 var8 = (class458) field2127.method4789(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class189 var9 = method2643(arg0);
        if (arg1 > 1 && var9.field2129 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2148[var11] && var9.field2148[var11] != 0) {
                    var10 = var9.field2129[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2643(var10);
            }
        }
        class212 var12 = var9.method3498(1);
        if (var12 == null) {
            return null;
        }
        class458 var13 = null;
        if (var9.field2166 != -1) {
            var13 = method407(var9.field2165, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2176 != -1) {
            var13 = method407(var9.field2122, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2178 != -1) {
            var13 = method407(var9.field2177, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4804;
        int var15 = Statics.field4800;
        int var16 = Statics.field4801;
        int[] var17 = new int[4];
        class454.method7485(var17);
        class458 var18 = new class458(36, 32);
        class454.method7486(var18.field4826, 36, 32);
        class454.method7491();
        class202.method3759();
        class202.method3826(16, 16);
        class202.field2378 = false;
        if (var9.field2178 != -1) {
            var13.method7604(0, 0);
        }
        int var19 = var9.field2138;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class202.field2396[var9.field2150] * var19 >> 16;
        int var21 = class202.field2381[var9.field2150] * var19 >> 16;
        var12.method4136();
        var12.method4154(0, var9.field2140, var9.field2141, var9.field2150, var9.field2142, var9.field2143 + var12.field2479 / 2 + var20, var9.field2143 + var21);
        if (var9.field2176 != -1) {
            var13.method7604(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7688(1);
        }
        if (arg2 >= 2) {
            var18.method7688(16777215);
        }
        if (arg3 != 0) {
            var18.method7601(arg3);
        }
        class454.method7486(var18.field4826, 36, 32);
        if (var9.field2166 != -1) {
            var13.method7604(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2133 == 1) {
            Statics.field3552.method5953(method5630(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2127.method4781(var18, var6);
        }
        class454.method7486(var14, var15, var16);
        class454.method7529(var17);
        class202.method3759();
        class202.field2378 = true;
        return var18;
    }

    @ObfuscatedName("lu.h(II)Ljava/lang/String;")
    public static final String method5630(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class310.field3832 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class310.field3830 + "</col>";
        }
    }

    @ObfuscatedName("gk.t(ZB)Z")
    public final boolean method3476(boolean arg0) {
        int var2 = this.field2151;
        int var3 = this.field2152;
        int var4 = this.field2157;
        if (arg0) {
            var2 = this.field2175;
            var3 = this.field2155;
            var4 = this.field2132;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2126.method5490(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2126.method5490(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2126.method5490(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gk.u(ZI)Lgu;")
    public final class197 method3520(boolean arg0) {
        int var2 = this.field2151;
        int var3 = this.field2152;
        int var4 = this.field2157;
        if (arg0) {
            var2 = this.field2175;
            var3 = this.field2155;
            var4 = this.field2132;
        }
        if (var2 == -1) {
            return null;
        }
        class197 var5 = class197.method3742(Statics.field2126, var2, 0);
        if (var3 != -1) {
            class197 var6 = class197.method3742(Statics.field2126, var3, 0);
            if (var4 == -1) {
                class197[] var9 = new class197[] { var5, var6 };
                var5 = new class197(var9, 2);
            } else {
                class197 var7 = class197.method3742(Statics.field2126, var4, 0);
                class197[] var8 = new class197[] { var5, var6, var7 };
                var5 = new class197(var8, 3);
            }
        }
        if (!arg0 && this.field2153 != 0) {
            var5.method3682(0, this.field2153, 0);
        }
        if (arg0 && this.field2156 != 0) {
            var5.method3682(0, this.field2156, 0);
        }
        if (this.field2134 != null) {
            for (int var10 = 0; var10 < this.field2134.length; var10++) {
                var5.method3683(this.field2134[var10], this.field2135[var10]);
            }
        }
        if (this.field2136 != null) {
            for (int var11 = 0; var11 < this.field2136.length; var11++) {
                var5.method3722(this.field2136[var11], this.field2137[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gk.d(ZI)Z")
    public final boolean method3466(boolean arg0) {
        int var2 = this.field2159;
        int var3 = this.field2171;
        if (arg0) {
            var2 = this.field2161;
            var3 = this.field2144;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2126.method5490(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2126.method5490(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gk.b(ZI)Lgu;")
    public final class197 method3478(boolean arg0) {
        int var2 = this.field2159;
        int var3 = this.field2171;
        if (arg0) {
            var2 = this.field2161;
            var3 = this.field2144;
        }
        if (var2 == -1) {
            return null;
        }
        class197 var4 = class197.method3742(Statics.field2126, var2, 0);
        if (var3 != -1) {
            class197 var5 = class197.method3742(Statics.field2126, var3, 0);
            class197[] var6 = new class197[] { var4, var5 };
            var4 = new class197(var6, 2);
        }
        if (this.field2134 != null) {
            for (int var7 = 0; var7 < this.field2134.length; var7++) {
                var4.method3683(this.field2134[var7], this.field2135[var7]);
            }
        }
        if (this.field2136 != null) {
            for (int var8 = 0; var8 < this.field2136.length; var8++) {
                var4.method3722(this.field2136[var8], this.field2137[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gk.a(IIB)I")
    public int method3474(int arg0, int arg1) {
        return class176.method3147(this.field2173, arg0, arg1);
    }

    @ObfuscatedName("gk.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3506(int arg0, String arg1) {
        class421 var3 = this.field2173;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6917((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4500;
            }
        }
        return var4;
    }

    @ObfuscatedName("gk.e(I)I")
    public int method3516() {
        if (this.field2160 == -1 || this.field2170 == null) {
            return -1;
        } else if (this.field2160 >= 0) {
            return this.field2170[this.field2160] == null ? -1 : this.field2160;
        } else if (class310.field3657.equalsIgnoreCase(this.field2170[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cn.g(I)V")
    public static void method2152() {
        field2127.method4782();
    }

    @ObfuscatedName("gk.i(I)Z")
    public boolean method3481() {
        return this.field2135 != null;
    }

    @ObfuscatedName("gk.r(I)Z")
    public boolean method3473() {
        return this.field2137 != null;
    }
}
