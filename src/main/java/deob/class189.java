package deob;

@ObfuscatedName("gl")
public class class189 extends class406 {

    @ObfuscatedName("gl.v")
    public static class257 field2139 = new class257(64);

    @ObfuscatedName("gl.y")
    public static class257 field2150 = new class257(50);

    @ObfuscatedName("gl.c")
    public static class257 field2141 = new class257(200);

    @ObfuscatedName("gl.b")
    public int field2142;

    @ObfuscatedName("gl.t")
    public int field2143;

    @ObfuscatedName("gl.g")
    public String field2183 = class309.field3681;

    @ObfuscatedName("gl.x")
    public short[] field2145;

    @ObfuscatedName("gl.n")
    public short[] field2157;

    @ObfuscatedName("gl.e")
    public short[] field2185;

    @ObfuscatedName("gl.h")
    public short[] field2148;

    @ObfuscatedName("gl.f")
    public int field2149 = 2000;

    @ObfuscatedName("gl.d")
    public int field2161 = 0;

    @ObfuscatedName("gl.j")
    public int field2151 = 0;

    @ObfuscatedName("gl.z")
    public int field2152 = 0;

    @ObfuscatedName("gl.i")
    public int field2153 = 0;

    @ObfuscatedName("gl.u")
    public int field2154 = 0;

    @ObfuscatedName("gl.ag")
    public int field2146 = 0;

    @ObfuscatedName("gl.ar")
    public int field2186 = 1;

    @ObfuscatedName("gl.am")
    public boolean field2147 = false;

    @ObfuscatedName("gl.ac")
    public String[] field2156 = new String[] { null, null, class309.field3907, null, null };

    @ObfuscatedName("gl.ab")
    public String[] field2159 = new String[] { null, null, null, null, class309.field3652 };

    @ObfuscatedName("gl.ae")
    public int field2155 = -2;

    @ObfuscatedName("gl.az")
    public int field2166 = -1;

    @ObfuscatedName("gl.ap")
    public int field2162 = -1;

    @ObfuscatedName("gl.as")
    public int field2184 = 0;

    @ObfuscatedName("gl.au")
    public int field2158 = -1;

    @ObfuscatedName("gl.ak")
    public int field2165 = -1;

    @ObfuscatedName("gl.af")
    public int field2144 = 0;

    @ObfuscatedName("gl.al")
    public int field2167 = -1;

    @ObfuscatedName("gl.aq")
    public int field2168 = -1;

    @ObfuscatedName("gl.ad")
    public int field2169 = -1;

    @ObfuscatedName("gl.an")
    public int field2170 = -1;

    @ObfuscatedName("gl.aw")
    public int field2171 = -1;

    @ObfuscatedName("gl.ah")
    public int field2172 = -1;

    @ObfuscatedName("gl.ao")
    public int[] field2173;

    @ObfuscatedName("gl.av")
    public int[] field2174;

    @ObfuscatedName("gl.ai")
    public int field2175 = -1;

    @ObfuscatedName("gl.ay")
    public int field2176 = -1;

    @ObfuscatedName("gl.aa")
    public int field2177 = 128;

    @ObfuscatedName("gl.ax")
    public int field2178 = 128;

    @ObfuscatedName("gl.at")
    public int field2179 = 128;

    @ObfuscatedName("gl.br")
    public int field2140 = 0;

    @ObfuscatedName("gl.ba")
    public int field2137 = 0;

    @ObfuscatedName("gl.bk")
    public int field2164 = 0;

    @ObfuscatedName("gl.bi")
    public class420 field2182;

    @ObfuscatedName("gl.bc")
    public boolean field2138 = false;

    @ObfuscatedName("gl.bo")
    public int field2180 = -1;

    @ObfuscatedName("gl.bl")
    public int field2163 = -1;

    @ObfuscatedName("gl.bs")
    public int field2187 = -1;

    @ObfuscatedName("gl.bx")
    public int field2188 = -1;

    @ObfuscatedName("fg.o(IB)Lgl;")
    public static class189 method2903(int arg0) {
        class189 var1 = (class189) field2139.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2181.method5249(10, arg0);
        class189 var3 = new class189();
        var3.field2142 = arg0;
        if (var2 != null) {
            var3.method3326(new class440(var2));
        }
        var3.method3367();
        if (var3.field2176 != -1) {
            var3.method3362(method2903(var3.field2176), method2903(var3.field2175));
        }
        if (var3.field2163 != -1) {
            var3.method3384(method2903(var3.field2163), method2903(var3.field2180));
        }
        if (var3.field2188 != -1) {
            var3.method3330(method2903(var3.field2188), method2903(var3.field2187));
        }
        if (!Statics.field1081 && var3.field2147) {
            var3.field2183 = class309.field3939;
            var3.field2138 = false;
            for (int var4 = 0; var4 < var3.field2156.length; var4++) {
                var3.field2156[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2159.length; var5++) {
                if (var5 != 4) {
                    var3.field2159[var5] = null;
                }
            }
            var3.field2155 = -2;
            var3.field2164 = 0;
            if (var3.field2182 != null) {
                boolean var6 = false;
                for (class411 var7 = var3.field2182.method6684(); var7 != null; var7 = var3.field2182.method6669()) {
                    class185 var8 = class185.method1959((int) var7.field4468);
                    if (var8.field2045) {
                        var7.method6399();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2182 = null;
                }
            }
        }
        field2139.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.q(I)V")
    public void method3367() {
    }

    @ObfuscatedName("gl.l(Lpx;I)V")
    public void method3326(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3327(arg0, var2);
        }
    }

    @ObfuscatedName("gl.k(Lpx;II)V")
    public void method3327(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2143 = arg0.method7082();
        } else if (arg1 == 2) {
            this.field2183 = arg0.method7044();
        } else if (arg1 == 4) {
            this.field2149 = arg0.method7082();
        } else if (arg1 == 5) {
            this.field2161 = arg0.method7082();
        } else if (arg1 == 6) {
            this.field2151 = arg0.method7082();
        } else if (arg1 == 7) {
            this.field2153 = arg0.method7082();
            if (this.field2153 > 32767) {
                this.field2153 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2154 = arg0.method7082();
            if (this.field2154 > 32767) {
                this.field2154 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7044();
        } else if (arg1 == 11) {
            this.field2146 = 1;
        } else if (arg1 == 12) {
            this.field2186 = arg0.method6898();
        } else if (arg1 == 16) {
            this.field2147 = true;
        } else if (arg1 == 23) {
            this.field2166 = arg0.method7082();
            this.field2184 = arg0.method7071();
        } else if (arg1 == 24) {
            this.field2162 = arg0.method7082();
        } else if (arg1 == 25) {
            this.field2158 = arg0.method7082();
            this.field2144 = arg0.method7071();
        } else if (arg1 == 26) {
            this.field2165 = arg0.method7082();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2156[arg1 - 30] = arg0.method7044();
            if (this.field2156[arg1 - 30].equalsIgnoreCase(class309.field3689)) {
                this.field2156[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2159[arg1 - 35] = arg0.method7044();
        } else if (arg1 == 40) {
            int var3 = arg0.method7071();
            this.field2145 = new short[var3];
            this.field2157 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2145[var4] = (short) arg0.method7082();
                this.field2157[var4] = (short) arg0.method7082();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7071();
            this.field2185 = new short[var5];
            this.field2148 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2185[var6] = (short) arg0.method7082();
                this.field2148[var6] = (short) arg0.method7082();
            }
        } else if (arg1 == 42) {
            this.field2155 = arg0.method7034();
        } else if (arg1 == 65) {
            this.field2138 = true;
        } else if (arg1 == 78) {
            this.field2167 = arg0.method7082();
        } else if (arg1 == 79) {
            this.field2168 = arg0.method7082();
        } else if (arg1 == 90) {
            this.field2169 = arg0.method7082();
        } else if (arg1 == 91) {
            this.field2171 = arg0.method7082();
        } else if (arg1 == 92) {
            this.field2170 = arg0.method7082();
        } else if (arg1 == 93) {
            this.field2172 = arg0.method7082();
        } else if (arg1 == 94) {
            arg0.method7082();
        } else if (arg1 == 95) {
            this.field2152 = arg0.method7082();
        } else if (arg1 == 97) {
            this.field2175 = arg0.method7082();
        } else if (arg1 == 98) {
            this.field2176 = arg0.method7082();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2173 == null) {
                this.field2173 = new int[10];
                this.field2174 = new int[10];
            }
            this.field2173[arg1 - 100] = arg0.method7082();
            this.field2174[arg1 - 100] = arg0.method7082();
        } else if (arg1 == 110) {
            this.field2177 = arg0.method7082();
        } else if (arg1 == 111) {
            this.field2178 = arg0.method7082();
        } else if (arg1 == 112) {
            this.field2179 = arg0.method7082();
        } else if (arg1 == 113) {
            this.field2140 = arg0.method7034();
        } else if (arg1 == 114) {
            this.field2137 = arg0.method7034() * 5;
        } else if (arg1 == 115) {
            this.field2164 = arg0.method7071();
        } else if (arg1 == 139) {
            this.field2180 = arg0.method7082();
        } else if (arg1 == 140) {
            this.field2163 = arg0.method7082();
        } else if (arg1 == 148) {
            this.field2187 = arg0.method7082();
        } else if (arg1 == 149) {
            this.field2188 = arg0.method7082();
        } else if (arg1 == 249) {
            this.field2182 = class176.method2892(arg0, this.field2182);
        }
    }

    @ObfuscatedName("gl.a(Lgl;Lgl;I)V")
    public void method3362(class189 arg0, class189 arg1) {
        this.field2143 = arg0.field2143;
        this.field2149 = arg0.field2149;
        this.field2161 = arg0.field2161;
        this.field2151 = arg0.field2151;
        this.field2152 = arg0.field2152;
        this.field2153 = arg0.field2153;
        this.field2154 = arg0.field2154;
        this.field2145 = arg0.field2145;
        this.field2157 = arg0.field2157;
        this.field2185 = arg0.field2185;
        this.field2148 = arg0.field2148;
        this.field2183 = arg1.field2183;
        this.field2147 = arg1.field2147;
        this.field2186 = arg1.field2186;
        this.field2146 = 1;
    }

    @ObfuscatedName("gl.m(Lgl;Lgl;I)V")
    public void method3384(class189 arg0, class189 arg1) {
        this.field2143 = arg0.field2143;
        this.field2149 = arg0.field2149;
        this.field2161 = arg0.field2161;
        this.field2151 = arg0.field2151;
        this.field2152 = arg0.field2152;
        this.field2153 = arg0.field2153;
        this.field2154 = arg0.field2154;
        this.field2145 = arg1.field2145;
        this.field2157 = arg1.field2157;
        this.field2185 = arg1.field2185;
        this.field2148 = arg1.field2148;
        this.field2183 = arg1.field2183;
        this.field2147 = arg1.field2147;
        this.field2146 = arg1.field2146;
        this.field2166 = arg1.field2166;
        this.field2162 = arg1.field2162;
        this.field2167 = arg1.field2167;
        this.field2158 = arg1.field2158;
        this.field2165 = arg1.field2165;
        this.field2168 = arg1.field2168;
        this.field2169 = arg1.field2169;
        this.field2170 = arg1.field2170;
        this.field2171 = arg1.field2171;
        this.field2172 = arg1.field2172;
        this.field2164 = arg1.field2164;
        this.field2156 = arg1.field2156;
        this.field2159 = new String[5];
        if (arg1.field2159 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2159[var3] = arg1.field2159[var3];
            }
        }
        this.field2159[4] = class309.field3657;
        this.field2186 = 0;
    }

    @ObfuscatedName("gl.p(Lgl;Lgl;I)V")
    public void method3330(class189 arg0, class189 arg1) {
        this.field2143 = arg0.field2143;
        this.field2149 = arg0.field2149;
        this.field2161 = arg0.field2161;
        this.field2151 = arg0.field2151;
        this.field2152 = arg0.field2152;
        this.field2153 = arg0.field2153;
        this.field2154 = arg0.field2154;
        this.field2145 = arg0.field2145;
        this.field2157 = arg0.field2157;
        this.field2185 = arg0.field2185;
        this.field2148 = arg0.field2148;
        this.field2146 = arg0.field2146;
        this.field2183 = arg1.field2183;
        this.field2186 = 0;
        this.field2147 = false;
        this.field2138 = false;
    }

    @ObfuscatedName("gl.s(II)Lgs;")
    public final class197 method3331(int arg0) {
        if (this.field2173 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2174[var3] && this.field2174[var3] != 0) {
                    var2 = this.field2173[var3];
                }
            }
            if (var2 != -1) {
                return method2903(var2).method3331(1);
            }
        }
        class197 var4 = class197.method3507(Statics.field2132, this.field2143, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2177 != 128 || this.field2178 != 128 || this.field2179 != 128) {
            var4.method3525(this.field2177, this.field2178, this.field2179);
        }
        if (this.field2145 != null) {
            for (int var5 = 0; var5 < this.field2145.length; var5++) {
                var4.method3574(this.field2145[var5], this.field2157[var5]);
            }
        }
        if (this.field2185 != null) {
            for (int var6 = 0; var6 < this.field2185.length; var6++) {
                var4.method3523(this.field2185[var6], this.field2148[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gl.r(II)Lhv;")
    public final class212 method3332(int arg0) {
        if (this.field2173 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2174[var3] && this.field2174[var3] != 0) {
                    var2 = this.field2173[var3];
                }
            }
            if (var2 != -1) {
                return method2903(var2).method3332(1);
            }
        }
        class212 var4 = (class212) field2150.method4566((long) this.field2142);
        if (var4 != null) {
            return var4;
        }
        class197 var5 = class197.method3507(Statics.field2132, this.field2143, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2177 != 128 || this.field2178 != 128 || this.field2179 != 128) {
            var5.method3525(this.field2177, this.field2178, this.field2179);
        }
        if (this.field2145 != null) {
            for (int var6 = 0; var6 < this.field2145.length; var6++) {
                var5.method3574(this.field2145[var6], this.field2157[var6]);
            }
        }
        if (this.field2185 != null) {
            for (int var7 = 0; var7 < this.field2185.length; var7++) {
                var5.method3523(this.field2185[var7], this.field2148[var7]);
            }
        }
        class212 var8 = var5.method3530(this.field2140 + 64, this.field2137 + 768, -50, -10, -50);
        var8.field2624 = true;
        field2150.method4571(var8, (long) this.field2142);
        return var8;
    }

    @ObfuscatedName("gl.v(II)Lgl;")
    public class189 method3352(int arg0) {
        if (this.field2173 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2174[var3] && this.field2174[var3] != 0) {
                    var2 = this.field2173[var3];
                }
            }
            if (var2 != -1) {
                return method2903(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cz.y(IIIIIZB)Lqr;")
    public static final class453 method2379(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class453 var8 = (class453) field2141.method4566(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class189 var9 = method2903(arg0);
        if (arg1 > 1 && var9.field2173 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2174[var11] && var9.field2174[var11] != 0) {
                    var10 = var9.field2173[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2903(var10);
            }
        }
        class212 var12 = var9.method3332(1);
        if (var12 == null) {
            return null;
        }
        class453 var13 = null;
        if (var9.field2176 != -1) {
            var13 = method2379(var9.field2175, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2163 != -1) {
            var13 = method2379(var9.field2180, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2188 != -1) {
            var13 = method2379(var9.field2187, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4744;
        int var15 = Statics.field4745;
        int var16 = Statics.field4746;
        int[] var17 = new int[4];
        class449.method7198(var17);
        class453 var18 = new class453(36, 32);
        class449.method7227(var18.field4767, 36, 32);
        class449.method7196();
        class202.method3637();
        class202.method3636(16, 16);
        class202.field2380 = false;
        if (var9.field2188 != -1) {
            var13.method7322(0, 0);
        }
        int var19 = var9.field2149;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class202.field2402[var9.field2161] * var19 >> 16;
        int var21 = class202.field2377[var9.field2161] * var19 >> 16;
        var12.method3946();
        var12.method3964(0, var9.field2151, var9.field2152, var9.field2161, var9.field2153, var9.field2154 + var12.field2487 / 2 + var20, var9.field2154 + var21);
        if (var9.field2163 != -1) {
            var13.method7322(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7318(1);
        }
        if (arg2 >= 2) {
            var18.method7318(16777215);
        }
        if (arg3 != 0) {
            var18.method7323(arg3);
        }
        class449.method7227(var18.field4767, 36, 32);
        if (var9.field2176 != -1) {
            var13.method7322(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2146 == 1) {
            Statics.field1695.method5729(method5118(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2141.method4571(var18, var6);
        }
        class449.method7227(var14, var15, var16);
        class449.method7253(var17);
        class202.method3637();
        class202.field2380 = true;
        return var18;
    }

    @ObfuscatedName("kr.c(II)Ljava/lang/String;")
    public static final String method5118(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class309.field3872 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class309.field3825 + "</col>";
        }
    }

    @ObfuscatedName("gl.w(ZI)Z")
    public final boolean method3334(boolean arg0) {
        int var2 = this.field2166;
        int var3 = this.field2162;
        int var4 = this.field2167;
        if (arg0) {
            var2 = this.field2158;
            var3 = this.field2165;
            var4 = this.field2168;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2132.method5237(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2132.method5237(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2132.method5237(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gl.b(ZI)Lgs;")
    public final class197 method3335(boolean arg0) {
        int var2 = this.field2166;
        int var3 = this.field2162;
        int var4 = this.field2167;
        if (arg0) {
            var2 = this.field2158;
            var3 = this.field2165;
            var4 = this.field2168;
        }
        if (var2 == -1) {
            return null;
        }
        class197 var5 = class197.method3507(Statics.field2132, var2, 0);
        if (var3 != -1) {
            class197 var6 = class197.method3507(Statics.field2132, var3, 0);
            if (var4 == -1) {
                class197[] var9 = new class197[] { var5, var6 };
                var5 = new class197(var9, 2);
            } else {
                class197 var7 = class197.method3507(Statics.field2132, var4, 0);
                class197[] var8 = new class197[] { var5, var6, var7 };
                var5 = new class197(var8, 3);
            }
        }
        if (!arg0 && this.field2184 != 0) {
            var5.method3521(0, this.field2184, 0);
        }
        if (arg0 && this.field2144 != 0) {
            var5.method3521(0, this.field2144, 0);
        }
        if (this.field2145 != null) {
            for (int var10 = 0; var10 < this.field2145.length; var10++) {
                var5.method3574(this.field2145[var10], this.field2157[var10]);
            }
        }
        if (this.field2185 != null) {
            for (int var11 = 0; var11 < this.field2185.length; var11++) {
                var5.method3523(this.field2185[var11], this.field2148[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gl.t(ZI)Z")
    public final boolean method3336(boolean arg0) {
        int var2 = this.field2169;
        int var3 = this.field2170;
        if (arg0) {
            var2 = this.field2171;
            var3 = this.field2172;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2132.method5237(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2132.method5237(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gl.g(ZI)Lgs;")
    public final class197 method3337(boolean arg0) {
        int var2 = this.field2169;
        int var3 = this.field2170;
        if (arg0) {
            var2 = this.field2171;
            var3 = this.field2172;
        }
        if (var2 == -1) {
            return null;
        }
        class197 var4 = class197.method3507(Statics.field2132, var2, 0);
        if (var3 != -1) {
            class197 var5 = class197.method3507(Statics.field2132, var3, 0);
            class197[] var6 = new class197[] { var4, var5 };
            var4 = new class197(var6, 2);
        }
        if (this.field2145 != null) {
            for (int var7 = 0; var7 < this.field2145.length; var7++) {
                var4.method3574(this.field2145[var7], this.field2157[var7]);
            }
        }
        if (this.field2185 != null) {
            for (int var8 = 0; var8 < this.field2185.length; var8++) {
                var4.method3523(this.field2185[var8], this.field2148[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gl.x(III)I")
    public int method3348(int arg0, int arg1) {
        return class176.method2802(this.field2182, arg0, arg1);
    }

    @ObfuscatedName("gl.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3339(int arg0, String arg1) {
        return class176.method2266(this.field2182, arg0, arg1);
    }

    @ObfuscatedName("gl.e(I)I")
    public int method3340() {
        if (this.field2155 == -1 || this.field2159 == null) {
            return -1;
        } else if (this.field2155 >= 0) {
            return this.field2159[this.field2155] == null ? -1 : this.field2155;
        } else if (class309.field3652.equalsIgnoreCase(this.field2159[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cw.h(I)V")
    public static void method2243() {
        field2139.method4569();
        field2150.method4569();
        field2141.method4569();
    }

    @ObfuscatedName("fk.f(I)V")
    public static void method3151() {
        field2141.method4569();
    }

    @ObfuscatedName("gl.d(I)Z")
    public boolean method3341() {
        return this.field2157 != null;
    }

    @ObfuscatedName("gl.j(B)Z")
    public boolean method3342() {
        return this.field2148 != null;
    }
}
