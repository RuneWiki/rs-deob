package deob;

@ObfuscatedName("fx")
public class class181 extends class382 {

    @ObfuscatedName("fx.r")
    public static class249 field2008 = new class249(64);

    @ObfuscatedName("fx.o")
    public static class249 field2009 = new class249(50);

    @ObfuscatedName("fx.v")
    public static class249 field2010 = new class249(200);

    @ObfuscatedName("fx.h")
    public int field2022;

    @ObfuscatedName("fx.g")
    public int field2031;

    @ObfuscatedName("fx.e")
    public String field2014 = class295.field3477;

    @ObfuscatedName("fx.a")
    public short[] field2015;

    @ObfuscatedName("fx.u")
    public short[] field2035;

    @ObfuscatedName("fx.k")
    public short[] field2017;

    @ObfuscatedName("fx.f")
    public short[] field2025;

    @ObfuscatedName("fx.l")
    public int field2019 = 2000;

    @ObfuscatedName("fx.q")
    public int field2020 = 0;

    @ObfuscatedName("fx.x")
    public int field2021 = 0;

    @ObfuscatedName("fx.z")
    public int field2005 = 0;

    @ObfuscatedName("fx.i")
    public int field2060 = 0;

    @ObfuscatedName("fx.y")
    public int field2024 = 0;

    @ObfuscatedName("fx.ah")
    public int field2018 = 0;

    @ObfuscatedName("fx.ao")
    public int field2026 = 1;

    @ObfuscatedName("fx.ab")
    public boolean field2027 = false;

    @ObfuscatedName("fx.an")
    public String[] field2016 = new String[] { null, null, class295.field3470, null, null };

    @ObfuscatedName("fx.ax")
    public String[] field2050 = new String[] { null, null, null, null, class295.field3471 };

    @ObfuscatedName("fx.az")
    public int field2030 = -2;

    @ObfuscatedName("fx.au")
    public int field2029 = -1;

    @ObfuscatedName("fx.av")
    public int field2052 = -1;

    @ObfuscatedName("fx.ap")
    public int field2058 = 0;

    @ObfuscatedName("fx.ac")
    public int field2034 = -1;

    @ObfuscatedName("fx.aj")
    public int field2051 = -1;

    @ObfuscatedName("fx.af")
    public int field2032 = 0;

    @ObfuscatedName("fx.ar")
    public int field2037 = -1;

    @ObfuscatedName("fx.ag")
    public int field2038 = -1;

    @ObfuscatedName("fx.al")
    public int field2039 = -1;

    @ObfuscatedName("fx.aa")
    public int field2040 = -1;

    @ObfuscatedName("fx.as")
    public int field2036 = -1;

    @ObfuscatedName("fx.at")
    public int field2042 = -1;

    @ObfuscatedName("fx.ai")
    public int[] field2033;

    @ObfuscatedName("fx.aq")
    public int[] field2044;

    @ObfuscatedName("fx.aw")
    public int field2045 = -1;

    @ObfuscatedName("fx.ay")
    public int field2046 = -1;

    @ObfuscatedName("fx.ae")
    public int field2047 = 128;

    @ObfuscatedName("fx.ak")
    public int field2048 = 128;

    @ObfuscatedName("fx.ad")
    public int field2049 = 128;

    @ObfuscatedName("fx.bp")
    public int field2041 = 0;

    @ObfuscatedName("fx.bd")
    public int field2055 = 0;

    @ObfuscatedName("fx.ba")
    public int field2003 = 0;

    @ObfuscatedName("fx.bq")
    public class396 field2053;

    @ObfuscatedName("fx.bg")
    public boolean field2054 = false;

    @ObfuscatedName("fx.br")
    public int field2023 = -1;

    @ObfuscatedName("fx.bi")
    public int field2056 = -1;

    @ObfuscatedName("fx.bm")
    public int field2057 = -1;

    @ObfuscatedName("fx.bw")
    public int field2028 = -1;

    @ObfuscatedName("dt.c(II)Lfx;")
    public static class181 method2432(int arg0) {
        class181 var1 = (class181) field2008.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2043.method5053(10, arg0);
        class181 var3 = new class181();
        var3.field2022 = arg0;
        if (var2 != null) {
            var3.method3236(new class419(var2));
        }
        var3.method3235();
        if (var3.field2046 != -1) {
            var3.method3238(method2432(var3.field2046), method2432(var3.field2045));
        }
        if (var3.field2056 != -1) {
            var3.method3270(method2432(var3.field2056), method2432(var3.field2023));
        }
        if (var3.field2028 != -1) {
            var3.method3240(method2432(var3.field2028), method2432(var3.field2057));
        }
        if (!Statics.field2007 && var3.field2027) {
            var3.field2014 = class295.field3705;
            var3.field2054 = false;
            for (int var4 = 0; var4 < var3.field2016.length; var4++) {
                var3.field2016[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2050.length; var5++) {
                if (var5 != 4) {
                    var3.field2050[var5] = null;
                }
            }
            var3.field2030 = -2;
            var3.field2003 = 0;
            if (var3.field2053 != null) {
                boolean var6 = false;
                for (class387 var7 = var3.field2053.method6437(); var7 != null; var7 = var3.field2053.method6434()) {
                    class177 var8 = class177.method3028((int) var7.field4257);
                    if (var8.field1918) {
                        var7.method6163();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2053 = null;
                }
            }
        }
        field2008.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fx.b(I)V")
    public void method3235() {
    }

    @ObfuscatedName("fx.p(Lpi;I)V")
    public void method3236(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3299(arg0, var2);
        }
    }

    @ObfuscatedName("fx.m(Lpi;II)V")
    public void method3299(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2031 = arg0.method6672();
        } else if (arg1 == 2) {
            this.field2014 = arg0.method6707();
        } else if (arg1 == 4) {
            this.field2019 = arg0.method6672();
        } else if (arg1 == 5) {
            this.field2020 = arg0.method6672();
        } else if (arg1 == 6) {
            this.field2021 = arg0.method6672();
        } else if (arg1 == 7) {
            this.field2060 = arg0.method6672();
            if (this.field2060 > 32767) {
                this.field2060 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2024 = arg0.method6672();
            if (this.field2024 > 32767) {
                this.field2024 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6707();
        } else if (arg1 == 11) {
            this.field2018 = 1;
        } else if (arg1 == 12) {
            this.field2026 = arg0.method6675();
        } else if (arg1 == 16) {
            this.field2027 = true;
        } else if (arg1 == 23) {
            this.field2029 = arg0.method6672();
            this.field2058 = arg0.method6781();
        } else if (arg1 == 24) {
            this.field2052 = arg0.method6672();
        } else if (arg1 == 25) {
            this.field2034 = arg0.method6672();
            this.field2032 = arg0.method6781();
        } else if (arg1 == 26) {
            this.field2051 = arg0.method6672();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2016[arg1 - 30] = arg0.method6707();
            if (this.field2016[arg1 - 30].equalsIgnoreCase(class295.field3472)) {
                this.field2016[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2050[arg1 - 35] = arg0.method6707();
        } else if (arg1 == 40) {
            int var3 = arg0.method6781();
            this.field2015 = new short[var3];
            this.field2035 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2015[var4] = (short) arg0.method6672();
                this.field2035[var4] = (short) arg0.method6672();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6781();
            this.field2017 = new short[var5];
            this.field2025 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2017[var6] = (short) arg0.method6672();
                this.field2025[var6] = (short) arg0.method6672();
            }
        } else if (arg1 == 42) {
            this.field2030 = arg0.method6846();
        } else if (arg1 == 65) {
            this.field2054 = true;
        } else if (arg1 == 78) {
            this.field2037 = arg0.method6672();
        } else if (arg1 == 79) {
            this.field2038 = arg0.method6672();
        } else if (arg1 == 90) {
            this.field2039 = arg0.method6672();
        } else if (arg1 == 91) {
            this.field2036 = arg0.method6672();
        } else if (arg1 == 92) {
            this.field2040 = arg0.method6672();
        } else if (arg1 == 93) {
            this.field2042 = arg0.method6672();
        } else if (arg1 == 94) {
            arg0.method6672();
        } else if (arg1 == 95) {
            this.field2005 = arg0.method6672();
        } else if (arg1 == 97) {
            this.field2045 = arg0.method6672();
        } else if (arg1 == 98) {
            this.field2046 = arg0.method6672();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2033 == null) {
                this.field2033 = new int[10];
                this.field2044 = new int[10];
            }
            this.field2033[arg1 - 100] = arg0.method6672();
            this.field2044[arg1 - 100] = arg0.method6672();
        } else if (arg1 == 110) {
            this.field2047 = arg0.method6672();
        } else if (arg1 == 111) {
            this.field2048 = arg0.method6672();
        } else if (arg1 == 112) {
            this.field2049 = arg0.method6672();
        } else if (arg1 == 113) {
            this.field2041 = arg0.method6846();
        } else if (arg1 == 114) {
            this.field2055 = arg0.method6846();
        } else if (arg1 == 115) {
            this.field2003 = arg0.method6781();
        } else if (arg1 == 139) {
            this.field2023 = arg0.method6672();
        } else if (arg1 == 140) {
            this.field2056 = arg0.method6672();
        } else if (arg1 == 148) {
            this.field2057 = arg0.method6672();
        } else if (arg1 == 149) {
            this.field2028 = arg0.method6672();
        } else if (arg1 == 249) {
            this.field2053 = class168.method399(arg0, this.field2053);
        }
    }

    @ObfuscatedName("fx.t(Lfx;Lfx;I)V")
    public void method3238(class181 arg0, class181 arg1) {
        this.field2031 = arg0.field2031;
        this.field2019 = arg0.field2019;
        this.field2020 = arg0.field2020;
        this.field2021 = arg0.field2021;
        this.field2005 = arg0.field2005;
        this.field2060 = arg0.field2060;
        this.field2024 = arg0.field2024;
        this.field2015 = arg0.field2015;
        this.field2035 = arg0.field2035;
        this.field2017 = arg0.field2017;
        this.field2025 = arg0.field2025;
        this.field2014 = arg1.field2014;
        this.field2027 = arg1.field2027;
        this.field2026 = arg1.field2026;
        this.field2018 = 1;
    }

    @ObfuscatedName("fx.s(Lfx;Lfx;I)V")
    public void method3270(class181 arg0, class181 arg1) {
        this.field2031 = arg0.field2031;
        this.field2019 = arg0.field2019;
        this.field2020 = arg0.field2020;
        this.field2021 = arg0.field2021;
        this.field2005 = arg0.field2005;
        this.field2060 = arg0.field2060;
        this.field2024 = arg0.field2024;
        this.field2015 = arg1.field2015;
        this.field2035 = arg1.field2035;
        this.field2017 = arg1.field2017;
        this.field2025 = arg1.field2025;
        this.field2014 = arg1.field2014;
        this.field2027 = arg1.field2027;
        this.field2018 = arg1.field2018;
        this.field2029 = arg1.field2029;
        this.field2052 = arg1.field2052;
        this.field2037 = arg1.field2037;
        this.field2034 = arg1.field2034;
        this.field2051 = arg1.field2051;
        this.field2038 = arg1.field2038;
        this.field2039 = arg1.field2039;
        this.field2040 = arg1.field2040;
        this.field2036 = arg1.field2036;
        this.field2042 = arg1.field2042;
        this.field2003 = arg1.field2003;
        this.field2016 = arg1.field2016;
        this.field2050 = new String[5];
        if (arg1.field2050 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2050[var3] = arg1.field2050[var3];
            }
        }
        this.field2050[4] = class295.field3476;
        this.field2026 = 0;
    }

    @ObfuscatedName("fx.j(Lfx;Lfx;B)V")
    public void method3240(class181 arg0, class181 arg1) {
        this.field2031 = arg0.field2031;
        this.field2019 = arg0.field2019;
        this.field2020 = arg0.field2020;
        this.field2021 = arg0.field2021;
        this.field2005 = arg0.field2005;
        this.field2060 = arg0.field2060;
        this.field2024 = arg0.field2024;
        this.field2015 = arg0.field2015;
        this.field2035 = arg0.field2035;
        this.field2017 = arg0.field2017;
        this.field2025 = arg0.field2025;
        this.field2018 = arg0.field2018;
        this.field2014 = arg1.field2014;
        this.field2026 = 0;
        this.field2027 = false;
        this.field2054 = false;
    }

    @ObfuscatedName("fx.w(IB)Lge;")
    public final class189 method3241(int arg0) {
        if (this.field2033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2044[var3] && this.field2044[var3] != 0) {
                    var2 = this.field2033[var3];
                }
            }
            if (var2 != -1) {
                return method2432(var2).method3241(1);
            }
        }
        class189 var4 = class189.method3427(Statics.field2006, this.field2031, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2047 != 128 || this.field2048 != 128 || this.field2049 != 128) {
            var4.method3453(this.field2047, this.field2048, this.field2049);
        }
        if (this.field2015 != null) {
            for (int var5 = 0; var5 < this.field2015.length; var5++) {
                var4.method3443(this.field2015[var5], this.field2035[var5]);
            }
        }
        if (this.field2017 != null) {
            for (int var6 = 0; var6 < this.field2017.length; var6++) {
                var4.method3456(this.field2017[var6], this.field2025[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fx.n(II)Lgo;")
    public final class204 method3242(int arg0) {
        if (this.field2033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2044[var3] && this.field2044[var3] != 0) {
                    var2 = this.field2033[var3];
                }
            }
            if (var2 != -1) {
                return method2432(var2).method3242(1);
            }
        }
        class204 var4 = (class204) field2009.method4514((long) this.field2022);
        if (var4 != null) {
            return var4;
        }
        class189 var5 = class189.method3427(Statics.field2006, this.field2031, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2047 != 128 || this.field2048 != 128 || this.field2049 != 128) {
            var5.method3453(this.field2047, this.field2048, this.field2049);
        }
        if (this.field2015 != null) {
            for (int var6 = 0; var6 < this.field2015.length; var6++) {
                var5.method3443(this.field2015[var6], this.field2035[var6]);
            }
        }
        if (this.field2017 != null) {
            for (int var7 = 0; var7 < this.field2017.length; var7++) {
                var5.method3456(this.field2017[var7], this.field2025[var7]);
            }
        }
        class204 var8 = var5.method3450(this.field2041 + 64, this.field2055 * 5 + 768, -50, -10, -50);
        var8.field2429 = true;
        field2009.method4515(var8, (long) this.field2022);
        return var8;
    }

    @ObfuscatedName("fx.r(II)Lfx;")
    public class181 method3243(int arg0) {
        if (this.field2033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2044[var3] && this.field2044[var3] != 0) {
                    var2 = this.field2033[var3];
                }
            }
            if (var2 != -1) {
                return method2432(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fz.o(IIIIIZI)Lpl;")
    public static final class432 method2985(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class432 var8 = (class432) field2010.method4514(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class181 var9 = method2432(arg0);
        if (arg1 > 1 && var9.field2033 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2044[var11] && var9.field2044[var11] != 0) {
                    var10 = var9.field2033[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2432(var10);
            }
        }
        class204 var12 = var9.method3242(1);
        if (var12 == null) {
            return null;
        }
        class432 var13 = null;
        if (var9.field2046 != -1) {
            var13 = method2985(var9.field2045, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2056 != -1) {
            var13 = method2985(var9.field2023, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2028 != -1) {
            var13 = method2985(var9.field2057, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4546;
        int var15 = Statics.field4542;
        int var16 = Statics.field4543;
        int[] var17 = new int[4];
        class428.method6937(var17);
        class432 var18 = new class432(36, 32);
        class428.method6933(var18.field4571, 36, 32);
        class428.method6939();
        class194.method3544();
        class194.method3597(16, 16);
        class194.field2277 = false;
        if (var9.field2028 != -1) {
            var13.method7120(0, 0);
        }
        int var19 = var9.field2019;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class194.field2276[var9.field2020] * var19 >> 16;
        int var21 = class194.field2271[var9.field2020] * var19 >> 16;
        var12.method3872();
        var12.method3919(0, var9.field2021, var9.field2005, var9.field2020, var9.field2060, var9.field2024 + var12.field2360 / 2 + var20, var9.field2024 + var21);
        if (var9.field2056 != -1) {
            var13.method7120(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7047(1);
        }
        if (arg2 >= 2) {
            var18.method7047(16777215);
        }
        if (arg3 != 0) {
            var18.method7048(arg3);
        }
        class428.method6933(var18.field4571, 36, 32);
        if (var9.field2046 != -1) {
            var13.method7120(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2018 == 1) {
            class327 var22 = Statics.field2011;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class295.field3646 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class295.field3683 + "</col>";
            }
            var22.method5462(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2010.method4515(var18, var6);
        }
        class428.method6933(var14, var15, var16);
        class428.method6938(var17);
        class194.method3544();
        class194.field2277 = true;
        return var18;
    }

    @ObfuscatedName("fx.v(ZS)Z")
    public final boolean method3277(boolean arg0) {
        int var2 = this.field2029;
        int var3 = this.field2052;
        int var4 = this.field2037;
        if (arg0) {
            var2 = this.field2034;
            var3 = this.field2051;
            var4 = this.field2038;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2006.method5055(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2006.method5055(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2006.method5055(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fx.d(ZI)Lge;")
    public final class189 method3245(boolean arg0) {
        int var2 = this.field2029;
        int var3 = this.field2052;
        int var4 = this.field2037;
        if (arg0) {
            var2 = this.field2034;
            var3 = this.field2051;
            var4 = this.field2038;
        }
        if (var2 == -1) {
            return null;
        }
        class189 var5 = class189.method3427(Statics.field2006, var2, 0);
        if (var3 != -1) {
            class189 var6 = class189.method3427(Statics.field2006, var3, 0);
            if (var4 == -1) {
                class189[] var9 = new class189[] { var5, var6 };
                var5 = new class189(var9, 2);
            } else {
                class189 var7 = class189.method3427(Statics.field2006, var4, 0);
                class189[] var8 = new class189[] { var5, var6, var7 };
                var5 = new class189(var8, 3);
            }
        }
        if (!arg0 && this.field2058 != 0) {
            var5.method3459(0, this.field2058, 0);
        }
        if (arg0 && this.field2032 != 0) {
            var5.method3459(0, this.field2032, 0);
        }
        if (this.field2015 != null) {
            for (int var10 = 0; var10 < this.field2015.length; var10++) {
                var5.method3443(this.field2015[var10], this.field2035[var10]);
            }
        }
        if (this.field2017 != null) {
            for (int var11 = 0; var11 < this.field2017.length; var11++) {
                var5.method3456(this.field2017[var11], this.field2025[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fx.h(ZI)Z")
    public final boolean method3246(boolean arg0) {
        int var2 = this.field2039;
        int var3 = this.field2040;
        if (arg0) {
            var2 = this.field2036;
            var3 = this.field2042;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2006.method5055(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2006.method5055(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fx.g(ZI)Lge;")
    public final class189 method3292(boolean arg0) {
        int var2 = this.field2039;
        int var3 = this.field2040;
        if (arg0) {
            var2 = this.field2036;
            var3 = this.field2042;
        }
        if (var2 == -1) {
            return null;
        }
        class189 var4 = class189.method3427(Statics.field2006, var2, 0);
        if (var3 != -1) {
            class189 var5 = class189.method3427(Statics.field2006, var3, 0);
            class189[] var6 = new class189[] { var4, var5 };
            var4 = new class189(var6, 2);
        }
        if (this.field2015 != null) {
            for (int var7 = 0; var7 < this.field2015.length; var7++) {
                var4.method3443(this.field2015[var7], this.field2035[var7]);
            }
        }
        if (this.field2017 != null) {
            for (int var8 = 0; var8 < this.field2017.length; var8++) {
                var4.method3456(this.field2017[var8], this.field2025[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fx.e(IIB)I")
    public int method3248(int arg0, int arg1) {
        return class168.method150(this.field2053, arg0, arg1);
    }

    @ObfuscatedName("fx.a(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3249(int arg0, String arg1) {
        return class168.method3632(this.field2053, arg0, arg1);
    }

    @ObfuscatedName("fx.u(B)I")
    public int method3250() {
        if (this.field2030 == -1 || this.field2050 == null) {
            return -1;
        } else if (this.field2030 >= 0) {
            return this.field2050[this.field2030] == null ? -1 : this.field2030;
        } else if (class295.field3471.equalsIgnoreCase(this.field2050[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fs.k(B)V")
    public static void method3029() {
        field2010.method4518();
    }

    @ObfuscatedName("dt.f(ZB)V")
    public static void method2429(boolean arg0) {
        if (Statics.field2007 != arg0) {
            field2008.method4518();
            field2009.method4518();
            field2010.method4518();
            Statics.field2007 = arg0;
        }
    }

    @ObfuscatedName("fx.l(I)Z")
    public boolean method3251() {
        return this.field2035 != null;
    }

    @ObfuscatedName("fx.q(B)Z")
    public boolean method3263() {
        return this.field2025 != null;
    }
}
