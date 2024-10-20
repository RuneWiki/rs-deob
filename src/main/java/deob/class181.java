package deob;

@ObfuscatedName("fn")
public class class181 extends class387 {

    @ObfuscatedName("fn.a")
    public static class249 field2051 = new class249(64);

    @ObfuscatedName("fn.y")
    public static class249 field2023 = new class249(50);

    @ObfuscatedName("fn.u")
    public static class249 field2025 = new class249(200);

    @ObfuscatedName("fn.q")
    public int field2026;

    @ObfuscatedName("fn.x")
    public int field2049;

    @ObfuscatedName("fn.p")
    public String field2028 = class300.field3605;

    @ObfuscatedName("fn.n")
    public short[] field2029;

    @ObfuscatedName("fn.m")
    public short[] field2030;

    @ObfuscatedName("fn.d")
    public short[] field2031;

    @ObfuscatedName("fn.j")
    public short[] field2067;

    @ObfuscatedName("fn.f")
    public int field2033 = 2000;

    @ObfuscatedName("fn.g")
    public int field2034 = 0;

    @ObfuscatedName("fn.t")
    public int field2066 = 0;

    @ObfuscatedName("fn.k")
    public int field2036 = 0;

    @ObfuscatedName("fn.b")
    public int field2042 = 0;

    @ObfuscatedName("fn.z")
    public int field2038 = 0;

    @ObfuscatedName("fn.ap")
    public int field2039 = 0;

    @ObfuscatedName("fn.af")
    public int field2040 = 1;

    @ObfuscatedName("fn.ak")
    public boolean field2041 = false;

    @ObfuscatedName("fn.av")
    public String[] field2064 = new String[] { null, null, class300.field3525, null, null };

    @ObfuscatedName("fn.ar")
    public String[] field2043 = new String[] { null, null, null, null, class300.field3746 };

    @ObfuscatedName("fn.aa")
    public int field2044 = -2;

    @ObfuscatedName("fn.ao")
    public int field2045 = -1;

    @ObfuscatedName("fn.aq")
    public int field2046 = -1;

    @ObfuscatedName("fn.ay")
    public int field2047 = 0;

    @ObfuscatedName("fn.ac")
    public int field2048 = -1;

    @ObfuscatedName("fn.ab")
    public int field2024 = -1;

    @ObfuscatedName("fn.as")
    public int field2050 = 0;

    @ObfuscatedName("fn.ag")
    public int field2037 = -1;

    @ObfuscatedName("fn.az")
    public int field2052 = -1;

    @ObfuscatedName("fn.ad")
    public int field2032 = -1;

    @ObfuscatedName("fn.au")
    public int field2054 = -1;

    @ObfuscatedName("fn.at")
    public int field2061 = -1;

    @ObfuscatedName("fn.ae")
    public int field2056 = -1;

    @ObfuscatedName("fn.an")
    public int[] field2057;

    @ObfuscatedName("fn.aw")
    public int[] field2058;

    @ObfuscatedName("fn.aj")
    public int field2059 = -1;

    @ObfuscatedName("fn.ax")
    public int field2053 = -1;

    @ObfuscatedName("fn.ah")
    public int field2020 = 128;

    @ObfuscatedName("fn.ai")
    public int field2062 = 128;

    @ObfuscatedName("fn.am")
    public int field2060 = 128;

    @ObfuscatedName("fn.be")
    public int field2055 = 0;

    @ObfuscatedName("fn.bt")
    public int field2065 = 0;

    @ObfuscatedName("fn.bn")
    public int field2035 = 0;

    @ObfuscatedName("fn.bz")
    public class401 field2027;

    @ObfuscatedName("fn.bx")
    public boolean field2068 = false;

    @ObfuscatedName("fn.bd")
    public int field2069 = -1;

    @ObfuscatedName("fn.bg")
    public int field2063 = -1;

    @ObfuscatedName("fn.bm")
    public int field2070 = -1;

    @ObfuscatedName("fn.bi")
    public int field2072 = -1;

    @ObfuscatedName("client.c(II)Lfn;")
    public static class181 method1538(int arg0) {
        class181 var1 = (class181) field2051.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4209.method5066(10, arg0);
        class181 var3 = new class181();
        var3.field2026 = arg0;
        if (var2 != null) {
            var3.method3243(new class421(var2));
        }
        var3.method3234();
        if (var3.field2053 != -1) {
            var3.method3196(method1538(var3.field2053), method1538(var3.field2059));
        }
        if (var3.field2063 != -1) {
            var3.method3197(method1538(var3.field2063), method1538(var3.field2069));
        }
        if (var3.field2072 != -1) {
            var3.method3199(method1538(var3.field2072), method1538(var3.field2070));
        }
        if (!Statics.field1730 && var3.field2041) {
            var3.field2028 = class300.field3578;
            var3.field2068 = false;
            for (int var4 = 0; var4 < var3.field2064.length; var4++) {
                var3.field2064[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2043.length; var5++) {
                if (var5 != 4) {
                    var3.field2043[var5] = null;
                }
            }
            var3.field2044 = -2;
            var3.field2035 = 0;
            if (var3.field2027 != null) {
                boolean var6 = false;
                for (class392 var7 = var3.field2027.method6434(); var7 != null; var7 = var3.field2027.method6431()) {
                    class177 var8 = class177.method2070((int) var7.field4301);
                    if (var8.field1934) {
                        var7.method6167();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2027 = null;
                }
            }
        }
        field2051.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fn.l(B)V")
    public void method3234() {
    }

    @ObfuscatedName("fn.s(Lpi;I)V")
    public void method3243(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3195(arg0, var2);
        }
    }

    @ObfuscatedName("fn.e(Lpi;II)V")
    public void method3195(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2049 = arg0.method6666();
        } else if (arg1 == 2) {
            this.field2028 = arg0.method6674();
        } else if (arg1 == 4) {
            this.field2033 = arg0.method6666();
        } else if (arg1 == 5) {
            this.field2034 = arg0.method6666();
        } else if (arg1 == 6) {
            this.field2066 = arg0.method6666();
        } else if (arg1 == 7) {
            this.field2042 = arg0.method6666();
            if (this.field2042 > 32767) {
                this.field2042 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2038 = arg0.method6666();
            if (this.field2038 > 32767) {
                this.field2038 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6674();
        } else if (arg1 == 11) {
            this.field2039 = 1;
        } else if (arg1 == 12) {
            this.field2040 = arg0.method6669();
        } else if (arg1 == 16) {
            this.field2041 = true;
        } else if (arg1 == 23) {
            this.field2045 = arg0.method6666();
            this.field2047 = arg0.method6686();
        } else if (arg1 == 24) {
            this.field2046 = arg0.method6666();
        } else if (arg1 == 25) {
            this.field2048 = arg0.method6666();
            this.field2050 = arg0.method6686();
        } else if (arg1 == 26) {
            this.field2024 = arg0.method6666();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2064[arg1 - 30] = arg0.method6674();
            if (this.field2064[arg1 - 30].equalsIgnoreCase(class300.field3527)) {
                this.field2064[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2043[arg1 - 35] = arg0.method6674();
        } else if (arg1 == 40) {
            int var3 = arg0.method6686();
            this.field2029 = new short[var3];
            this.field2030 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2029[var4] = (short) arg0.method6666();
                this.field2030[var4] = (short) arg0.method6666();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6686();
            this.field2031 = new short[var5];
            this.field2067 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2031[var6] = (short) arg0.method6666();
                this.field2067[var6] = (short) arg0.method6666();
            }
        } else if (arg1 == 42) {
            this.field2044 = arg0.method6664();
        } else if (arg1 == 65) {
            this.field2068 = true;
        } else if (arg1 == 78) {
            this.field2037 = arg0.method6666();
        } else if (arg1 == 79) {
            this.field2052 = arg0.method6666();
        } else if (arg1 == 90) {
            this.field2032 = arg0.method6666();
        } else if (arg1 == 91) {
            this.field2061 = arg0.method6666();
        } else if (arg1 == 92) {
            this.field2054 = arg0.method6666();
        } else if (arg1 == 93) {
            this.field2056 = arg0.method6666();
        } else if (arg1 == 94) {
            arg0.method6666();
        } else if (arg1 == 95) {
            this.field2036 = arg0.method6666();
        } else if (arg1 == 97) {
            this.field2059 = arg0.method6666();
        } else if (arg1 == 98) {
            this.field2053 = arg0.method6666();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2057 == null) {
                this.field2057 = new int[10];
                this.field2058 = new int[10];
            }
            this.field2057[arg1 - 100] = arg0.method6666();
            this.field2058[arg1 - 100] = arg0.method6666();
        } else if (arg1 == 110) {
            this.field2020 = arg0.method6666();
        } else if (arg1 == 111) {
            this.field2062 = arg0.method6666();
        } else if (arg1 == 112) {
            this.field2060 = arg0.method6666();
        } else if (arg1 == 113) {
            this.field2055 = arg0.method6664();
        } else if (arg1 == 114) {
            this.field2065 = arg0.method6664() * 5;
        } else if (arg1 == 115) {
            this.field2035 = arg0.method6686();
        } else if (arg1 == 139) {
            this.field2069 = arg0.method6666();
        } else if (arg1 == 140) {
            this.field2063 = arg0.method6666();
        } else if (arg1 == 148) {
            this.field2070 = arg0.method6666();
        } else if (arg1 == 149) {
            this.field2072 = arg0.method6666();
        } else if (arg1 == 249) {
            this.field2027 = class168.method4950(arg0, this.field2027);
        }
    }

    @ObfuscatedName("fn.r(Lfn;Lfn;I)V")
    public void method3196(class181 arg0, class181 arg1) {
        this.field2049 = arg0.field2049;
        this.field2033 = arg0.field2033;
        this.field2034 = arg0.field2034;
        this.field2066 = arg0.field2066;
        this.field2036 = arg0.field2036;
        this.field2042 = arg0.field2042;
        this.field2038 = arg0.field2038;
        this.field2029 = arg0.field2029;
        this.field2030 = arg0.field2030;
        this.field2031 = arg0.field2031;
        this.field2067 = arg0.field2067;
        this.field2028 = arg1.field2028;
        this.field2041 = arg1.field2041;
        this.field2040 = arg1.field2040;
        this.field2039 = 1;
    }

    @ObfuscatedName("fn.o(Lfn;Lfn;B)V")
    public void method3197(class181 arg0, class181 arg1) {
        this.field2049 = arg0.field2049;
        this.field2033 = arg0.field2033;
        this.field2034 = arg0.field2034;
        this.field2066 = arg0.field2066;
        this.field2036 = arg0.field2036;
        this.field2042 = arg0.field2042;
        this.field2038 = arg0.field2038;
        this.field2029 = arg1.field2029;
        this.field2030 = arg1.field2030;
        this.field2031 = arg1.field2031;
        this.field2067 = arg1.field2067;
        this.field2028 = arg1.field2028;
        this.field2041 = arg1.field2041;
        this.field2039 = arg1.field2039;
        this.field2045 = arg1.field2045;
        this.field2046 = arg1.field2046;
        this.field2037 = arg1.field2037;
        this.field2048 = arg1.field2048;
        this.field2024 = arg1.field2024;
        this.field2052 = arg1.field2052;
        this.field2032 = arg1.field2032;
        this.field2054 = arg1.field2054;
        this.field2061 = arg1.field2061;
        this.field2056 = arg1.field2056;
        this.field2035 = arg1.field2035;
        this.field2064 = arg1.field2064;
        this.field2043 = new String[5];
        if (arg1.field2043 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2043[var3] = arg1.field2043[var3];
            }
        }
        this.field2043[4] = class300.field3531;
        this.field2040 = 0;
    }

    @ObfuscatedName("fn.i(Lfn;Lfn;I)V")
    public void method3199(class181 arg0, class181 arg1) {
        this.field2049 = arg0.field2049;
        this.field2033 = arg0.field2033;
        this.field2034 = arg0.field2034;
        this.field2066 = arg0.field2066;
        this.field2036 = arg0.field2036;
        this.field2042 = arg0.field2042;
        this.field2038 = arg0.field2038;
        this.field2029 = arg0.field2029;
        this.field2030 = arg0.field2030;
        this.field2031 = arg0.field2031;
        this.field2067 = arg0.field2067;
        this.field2039 = arg0.field2039;
        this.field2028 = arg1.field2028;
        this.field2040 = 0;
        this.field2041 = false;
        this.field2068 = false;
    }

    @ObfuscatedName("fn.w(IB)Lgq;")
    public final class189 method3239(int arg0) {
        if (this.field2057 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2058[var3] && this.field2058[var3] != 0) {
                    var2 = this.field2057[var3];
                }
            }
            if (var2 != -1) {
                return method1538(var2).method3239(1);
            }
        }
        class189 var4 = class189.method3374(Statics.field22, this.field2049, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2020 != 128 || this.field2062 != 128 || this.field2060 != 128) {
            var4.method3391(this.field2020, this.field2062, this.field2060);
        }
        if (this.field2029 != null) {
            for (int var5 = 0; var5 < this.field2029.length; var5++) {
                var4.method3380(this.field2029[var5], this.field2030[var5]);
            }
        }
        if (this.field2031 != null) {
            for (int var6 = 0; var6 < this.field2031.length; var6++) {
                var4.method3404(this.field2031[var6], this.field2067[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fn.v(IB)Lgf;")
    public final class204 method3200(int arg0) {
        if (this.field2057 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2058[var3] && this.field2058[var3] != 0) {
                    var2 = this.field2057[var3];
                }
            }
            if (var2 != -1) {
                return method1538(var2).method3200(1);
            }
        }
        class204 var4 = (class204) field2023.method4472((long) this.field2026);
        if (var4 != null) {
            return var4;
        }
        class189 var5 = class189.method3374(Statics.field22, this.field2049, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2020 != 128 || this.field2062 != 128 || this.field2060 != 128) {
            var5.method3391(this.field2020, this.field2062, this.field2060);
        }
        if (this.field2029 != null) {
            for (int var6 = 0; var6 < this.field2029.length; var6++) {
                var5.method3380(this.field2029[var6], this.field2030[var6]);
            }
        }
        if (this.field2031 != null) {
            for (int var7 = 0; var7 < this.field2031.length; var7++) {
                var5.method3404(this.field2031[var7], this.field2067[var7]);
            }
        }
        class204 var8 = var5.method3396(this.field2055 + 64, this.field2065 + 768, -50, -10, -50);
        var8.field2498 = true;
        field2023.method4482(var8, (long) this.field2026);
        return var8;
    }

    @ObfuscatedName("fn.a(IB)Lfn;")
    public class181 method3201(int arg0) {
        if (this.field2057 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2058[var3] && this.field2058[var3] != 0) {
                    var2 = this.field2057[var3];
                }
            }
            if (var2 != -1) {
                return method1538(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("nq.y(IIIIIZI)Lpt;")
    public static final class434 method6011(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class434 var8 = (class434) field2025.method4472(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class181 var9 = method1538(arg0);
        if (arg1 > 1 && var9.field2057 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2058[var11] && var9.field2058[var11] != 0) {
                    var10 = var9.field2057[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1538(var10);
            }
        }
        class204 var12 = var9.method3200(1);
        if (var12 == null) {
            return null;
        }
        class434 var13 = null;
        if (var9.field2053 != -1) {
            var13 = method6011(var9.field2059, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2063 != -1) {
            var13 = method6011(var9.field2069, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2072 != -1) {
            var13 = method6011(var9.field2070, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4578;
        int var15 = Statics.field4579;
        int var16 = Statics.field4580;
        int[] var17 = new int[4];
        class430.method6990(var17);
        class434 var18 = new class434(36, 32);
        class430.method6948(var18.field4606, 36, 32);
        class430.method6988();
        class194.method3490();
        class194.method3463(16, 16);
        class194.field2262 = false;
        if (var9.field2072 != -1) {
            var13.method7066(0, 0);
        }
        int var19 = var9.field2033;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class194.field2271[var9.field2034] * var19 >> 16;
        int var21 = class194.field2280[var9.field2034] * var19 >> 16;
        var12.method3807();
        var12.method3884(0, var9.field2066, var9.field2036, var9.field2034, var9.field2042, var9.field2038 + var12.field2372 / 2 + var20, var9.field2038 + var21);
        if (var9.field2063 != -1) {
            var13.method7066(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7062(1);
        }
        if (arg2 >= 2) {
            var18.method7062(16777215);
        }
        if (arg3 != 0) {
            var18.method7063(arg3);
        }
        class430.method6948(var18.field4606, 36, 32);
        if (var9.field2053 != -1) {
            var13.method7066(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2039 == 1) {
            class332 var22 = Statics.field889;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class300.field3701 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class300.field3699 + "</col>";
            }
            var22.method5446(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2025.method4482(var18, var6);
        }
        class430.method6948(var14, var15, var16);
        class430.method6957(var17);
        class194.method3490();
        class194.field2262 = true;
        return var18;
    }

    @ObfuscatedName("fn.u(ZB)Z")
    public final boolean method3202(boolean arg0) {
        int var2 = this.field2045;
        int var3 = this.field2046;
        int var4 = this.field2037;
        if (arg0) {
            var2 = this.field2048;
            var3 = this.field2024;
            var4 = this.field2052;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field22.method5057(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field22.method5057(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field22.method5057(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fn.h(ZI)Lgq;")
    public final class189 method3203(boolean arg0) {
        int var2 = this.field2045;
        int var3 = this.field2046;
        int var4 = this.field2037;
        if (arg0) {
            var2 = this.field2048;
            var3 = this.field2024;
            var4 = this.field2052;
        }
        if (var2 == -1) {
            return null;
        }
        class189 var5 = class189.method3374(Statics.field22, var2, 0);
        if (var3 != -1) {
            class189 var6 = class189.method3374(Statics.field22, var3, 0);
            if (var4 == -1) {
                class189[] var9 = new class189[] { var5, var6 };
                var5 = new class189(var9, 2);
            } else {
                class189 var7 = class189.method3374(Statics.field22, var4, 0);
                class189[] var8 = new class189[] { var5, var6, var7 };
                var5 = new class189(var8, 3);
            }
        }
        if (!arg0 && this.field2047 != 0) {
            var5.method3390(0, this.field2047, 0);
        }
        if (arg0 && this.field2050 != 0) {
            var5.method3390(0, this.field2050, 0);
        }
        if (this.field2029 != null) {
            for (int var10 = 0; var10 < this.field2029.length; var10++) {
                var5.method3380(this.field2029[var10], this.field2030[var10]);
            }
        }
        if (this.field2031 != null) {
            for (int var11 = 0; var11 < this.field2031.length; var11++) {
                var5.method3404(this.field2031[var11], this.field2067[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fn.q(ZI)Z")
    public final boolean method3193(boolean arg0) {
        int var2 = this.field2032;
        int var3 = this.field2054;
        if (arg0) {
            var2 = this.field2061;
            var3 = this.field2056;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field22.method5057(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field22.method5057(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fn.x(ZI)Lgq;")
    public final class189 method3205(boolean arg0) {
        int var2 = this.field2032;
        int var3 = this.field2054;
        if (arg0) {
            var2 = this.field2061;
            var3 = this.field2056;
        }
        if (var2 == -1) {
            return null;
        }
        class189 var4 = class189.method3374(Statics.field22, var2, 0);
        if (var3 != -1) {
            class189 var5 = class189.method3374(Statics.field22, var3, 0);
            class189[] var6 = new class189[] { var4, var5 };
            var4 = new class189(var6, 2);
        }
        if (this.field2029 != null) {
            for (int var7 = 0; var7 < this.field2029.length; var7++) {
                var4.method3380(this.field2029[var7], this.field2030[var7]);
            }
        }
        if (this.field2031 != null) {
            for (int var8 = 0; var8 < this.field2031.length; var8++) {
                var4.method3404(this.field2031[var8], this.field2067[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fn.p(III)I")
    public int method3194(int arg0, int arg1) {
        return class168.method6932(this.field2027, arg0, arg1);
    }

    @ObfuscatedName("fn.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3207(int arg0, String arg1) {
        return class168.method4942(this.field2027, arg0, arg1);
    }

    @ObfuscatedName("fn.m(S)I")
    public int method3208() {
        if (this.field2044 == -1 || this.field2043 == null) {
            return -1;
        } else if (this.field2044 >= 0) {
            return this.field2043[this.field2044] == null ? -1 : this.field2044;
        } else if (class300.field3746.equalsIgnoreCase(this.field2043[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bb.d(I)V")
    public static void method1797() {
        field2025.method4475();
    }

    @ObfuscatedName("dt.j(ZI)V")
    public static void method2511(boolean arg0) {
        if (Statics.field1730 != arg0) {
            field2051.method4475();
            field2023.method4475();
            field2025.method4475();
            Statics.field1730 = arg0;
        }
    }

    @ObfuscatedName("fn.f(I)Z")
    public boolean method3209() {
        return this.field2030 != null;
    }

    @ObfuscatedName("fn.g(I)Z")
    public boolean method3237() {
        return this.field2067 != null;
    }
}
