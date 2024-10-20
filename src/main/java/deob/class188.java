package deob;

@ObfuscatedName("gb")
public class class188 extends class406 {

    @ObfuscatedName("gb.n")
    public static class256 field2126 = new class256(64);

    @ObfuscatedName("gb.d")
    public static class256 field2095 = new class256(50);

    @ObfuscatedName("gb.a")
    public static class256 field2096 = new class256(200);

    @ObfuscatedName("gb.u")
    public int field2137;

    @ObfuscatedName("gb.l")
    public int field2090;

    @ObfuscatedName("gb.z")
    public String field2110 = class309.field3624;

    @ObfuscatedName("gb.r")
    public short[] field2100;

    @ObfuscatedName("gb.y")
    public short[] field2092;

    @ObfuscatedName("gb.p")
    public short[] field2102;

    @ObfuscatedName("gb.e")
    public short[] field2103;

    @ObfuscatedName("gb.b")
    public int field2104 = 2000;

    @ObfuscatedName("gb.x")
    public int field2105 = 0;

    @ObfuscatedName("gb.f")
    public int field2128 = 0;

    @ObfuscatedName("gb.t")
    public int field2107 = 0;

    @ObfuscatedName("gb.j")
    public int field2108 = 0;

    @ObfuscatedName("gb.g")
    public int field2109 = 0;

    @ObfuscatedName("gb.ar")
    public int field2134 = 0;

    @ObfuscatedName("gb.aq")
    public int field2111 = 1;

    @ObfuscatedName("gb.av")
    public boolean field2101 = false;

    @ObfuscatedName("gb.aj")
    public String[] field2113 = new String[] { null, null, class309.field3780, null, null };

    @ObfuscatedName("gb.ax")
    public String[] field2088 = new String[] { null, null, null, null, class309.field3914 };

    @ObfuscatedName("gb.ak")
    public int field2112 = -2;

    @ObfuscatedName("gb.au")
    public int field2116 = -1;

    @ObfuscatedName("gb.ae")
    public int field2117 = -1;

    @ObfuscatedName("gb.as")
    public int field2118 = 0;

    @ObfuscatedName("gb.ay")
    public int field2119 = -1;

    @ObfuscatedName("gb.ag")
    public int field2120 = -1;

    @ObfuscatedName("gb.ad")
    public int field2121 = 0;

    @ObfuscatedName("gb.af")
    public int field2106 = -1;

    @ObfuscatedName("gb.aw")
    public int field2123 = -1;

    @ObfuscatedName("gb.ai")
    public int field2124 = -1;

    @ObfuscatedName("gb.ap")
    public int field2114 = -1;

    @ObfuscatedName("gb.az")
    public int field2138 = -1;

    @ObfuscatedName("gb.an")
    public int field2127 = -1;

    @ObfuscatedName("gb.ah")
    public int[] field2139;

    @ObfuscatedName("gb.aa")
    public int[] field2129;

    @ObfuscatedName("gb.am")
    public int field2130 = -1;

    @ObfuscatedName("gb.ao")
    public int field2131 = -1;

    @ObfuscatedName("gb.at")
    public int field2132 = 128;

    @ObfuscatedName("gb.al")
    public int field2133 = 128;

    @ObfuscatedName("gb.ac")
    public int field2093 = 128;

    @ObfuscatedName("gb.bq")
    public int field2125 = 0;

    @ObfuscatedName("gb.bn")
    public int field2136 = 0;

    @ObfuscatedName("gb.bl")
    public int field2094 = 0;

    @ObfuscatedName("gb.bv")
    public class420 field2115;

    @ObfuscatedName("gb.bu")
    public boolean field2099 = false;

    @ObfuscatedName("gb.bb")
    public int field2140 = -1;

    @ObfuscatedName("gb.bt")
    public int field2141 = -1;

    @ObfuscatedName("gb.bw")
    public int field2142 = -1;

    @ObfuscatedName("gb.bd")
    public int field2143 = -1;

    @ObfuscatedName("je.s(Lls;Lls;ZLmg;I)V")
    public static void method4782(class316 arg0, class316 arg1, boolean arg2, class350 arg3) {
        Statics.field2135 = arg0;
        Statics.field2089 = arg1;
        Statics.field1021 = arg2;
        Statics.field1645 = Statics.field2135.method5184(10);
        Statics.field1595 = arg3;
    }

    @ObfuscatedName("cs.h(IB)Lgb;")
    public static class188 method2231(int arg0) {
        class188 var1 = (class188) field2126.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2135.method5179(10, arg0);
        class188 var3 = new class188();
        var3.field2137 = arg0;
        if (var2 != null) {
            var3.method3347(new class444(var2));
        }
        var3.method3289();
        if (var3.field2131 != -1) {
            var3.method3291(method2231(var3.field2131), method2231(var3.field2130));
        }
        if (var3.field2141 != -1) {
            var3.method3292(method2231(var3.field2141), method2231(var3.field2140));
        }
        if (var3.field2143 != -1) {
            var3.method3346(method2231(var3.field2143), method2231(var3.field2142));
        }
        if (!Statics.field1021 && var3.field2101) {
            var3.field2110 = class309.field3878;
            var3.field2099 = false;
            for (int var4 = 0; var4 < var3.field2113.length; var4++) {
                var3.field2113[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2088.length; var5++) {
                if (var5 != 4) {
                    var3.field2088[var5] = null;
                }
            }
            var3.field2112 = -2;
            var3.field2094 = 0;
            if (var3.field2115 != null) {
                boolean var6 = false;
                for (class411 var7 = var3.field2115.method6671(); var7 != null; var7 = var3.field2115.method6675()) {
                    class184 var8 = class184.method6425((int) var7.field4468);
                    if (var8.field1996) {
                        var7.method6409();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2115 = null;
                }
            }
        }
        field2126.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.w(B)V")
    public void method3289() {
    }

    @ObfuscatedName("gb.v(Lqr;S)V")
    public void method3347(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3311(arg0, var2);
        }
    }

    @ObfuscatedName("gb.c(Lqr;II)V")
    public void method3311(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2090 = arg0.method7120();
        } else if (arg1 == 2) {
            this.field2110 = arg0.method6975();
        } else if (arg1 == 4) {
            this.field2104 = arg0.method7120();
        } else if (arg1 == 5) {
            this.field2105 = arg0.method7120();
        } else if (arg1 == 6) {
            this.field2128 = arg0.method7120();
        } else if (arg1 == 7) {
            this.field2108 = arg0.method7120();
            if (this.field2108 > 32767) {
                this.field2108 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2109 = arg0.method7120();
            if (this.field2109 > 32767) {
                this.field2109 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6975();
        } else if (arg1 == 11) {
            this.field2134 = 1;
        } else if (arg1 == 12) {
            this.field2111 = arg0.method6934();
        } else if (arg1 == 16) {
            this.field2101 = true;
        } else if (arg1 == 23) {
            this.field2116 = arg0.method7120();
            this.field2118 = arg0.method6929();
        } else if (arg1 == 24) {
            this.field2117 = arg0.method7120();
        } else if (arg1 == 25) {
            this.field2119 = arg0.method7120();
            this.field2121 = arg0.method6929();
        } else if (arg1 == 26) {
            this.field2120 = arg0.method7120();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2113[arg1 - 30] = arg0.method6975();
            if (this.field2113[arg1 - 30].equalsIgnoreCase(class309.field3619)) {
                this.field2113[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2088[arg1 - 35] = arg0.method6975();
        } else if (arg1 == 40) {
            int var3 = arg0.method6929();
            this.field2100 = new short[var3];
            this.field2092 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2100[var4] = (short) arg0.method7120();
                this.field2092[var4] = (short) arg0.method7120();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6929();
            this.field2102 = new short[var5];
            this.field2103 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2102[var6] = (short) arg0.method7120();
                this.field2103[var6] = (short) arg0.method7120();
            }
        } else if (arg1 == 42) {
            this.field2112 = arg0.method6930();
        } else if (arg1 == 65) {
            this.field2099 = true;
        } else if (arg1 == 78) {
            this.field2106 = arg0.method7120();
        } else if (arg1 == 79) {
            this.field2123 = arg0.method7120();
        } else if (arg1 == 90) {
            this.field2124 = arg0.method7120();
        } else if (arg1 == 91) {
            this.field2138 = arg0.method7120();
        } else if (arg1 == 92) {
            this.field2114 = arg0.method7120();
        } else if (arg1 == 93) {
            this.field2127 = arg0.method7120();
        } else if (arg1 == 94) {
            arg0.method7120();
        } else if (arg1 == 95) {
            this.field2107 = arg0.method7120();
        } else if (arg1 == 97) {
            this.field2130 = arg0.method7120();
        } else if (arg1 == 98) {
            this.field2131 = arg0.method7120();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2139 == null) {
                this.field2139 = new int[10];
                this.field2129 = new int[10];
            }
            this.field2139[arg1 - 100] = arg0.method7120();
            this.field2129[arg1 - 100] = arg0.method7120();
        } else if (arg1 == 110) {
            this.field2132 = arg0.method7120();
        } else if (arg1 == 111) {
            this.field2133 = arg0.method7120();
        } else if (arg1 == 112) {
            this.field2093 = arg0.method7120();
        } else if (arg1 == 113) {
            this.field2125 = arg0.method6930();
        } else if (arg1 == 114) {
            this.field2136 = arg0.method6930();
        } else if (arg1 == 115) {
            this.field2094 = arg0.method6929();
        } else if (arg1 == 139) {
            this.field2140 = arg0.method7120();
        } else if (arg1 == 140) {
            this.field2141 = arg0.method7120();
        } else if (arg1 == 148) {
            this.field2142 = arg0.method7120();
        } else if (arg1 == 149) {
            this.field2143 = arg0.method7120();
        } else if (arg1 == 249) {
            this.field2115 = class175.method1527(arg0, this.field2115);
        }
    }

    @ObfuscatedName("gb.q(Lgb;Lgb;B)V")
    public void method3291(class188 arg0, class188 arg1) {
        this.field2090 = arg0.field2090;
        this.field2104 = arg0.field2104;
        this.field2105 = arg0.field2105;
        this.field2128 = arg0.field2128;
        this.field2107 = arg0.field2107;
        this.field2108 = arg0.field2108;
        this.field2109 = arg0.field2109;
        this.field2100 = arg0.field2100;
        this.field2092 = arg0.field2092;
        this.field2102 = arg0.field2102;
        this.field2103 = arg0.field2103;
        this.field2110 = arg1.field2110;
        this.field2101 = arg1.field2101;
        this.field2111 = arg1.field2111;
        this.field2134 = 1;
    }

    @ObfuscatedName("gb.i(Lgb;Lgb;I)V")
    public void method3292(class188 arg0, class188 arg1) {
        this.field2090 = arg0.field2090;
        this.field2104 = arg0.field2104;
        this.field2105 = arg0.field2105;
        this.field2128 = arg0.field2128;
        this.field2107 = arg0.field2107;
        this.field2108 = arg0.field2108;
        this.field2109 = arg0.field2109;
        this.field2100 = arg1.field2100;
        this.field2092 = arg1.field2092;
        this.field2102 = arg1.field2102;
        this.field2103 = arg1.field2103;
        this.field2110 = arg1.field2110;
        this.field2101 = arg1.field2101;
        this.field2134 = arg1.field2134;
        this.field2116 = arg1.field2116;
        this.field2117 = arg1.field2117;
        this.field2106 = arg1.field2106;
        this.field2119 = arg1.field2119;
        this.field2120 = arg1.field2120;
        this.field2123 = arg1.field2123;
        this.field2124 = arg1.field2124;
        this.field2114 = arg1.field2114;
        this.field2138 = arg1.field2138;
        this.field2127 = arg1.field2127;
        this.field2094 = arg1.field2094;
        this.field2113 = arg1.field2113;
        this.field2088 = new String[5];
        if (arg1.field2088 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2088[var3] = arg1.field2088[var3];
            }
        }
        this.field2088[4] = class309.field3623;
        this.field2111 = 0;
    }

    @ObfuscatedName("gb.k(Lgb;Lgb;B)V")
    public void method3346(class188 arg0, class188 arg1) {
        this.field2090 = arg0.field2090;
        this.field2104 = arg0.field2104;
        this.field2105 = arg0.field2105;
        this.field2128 = arg0.field2128;
        this.field2107 = arg0.field2107;
        this.field2108 = arg0.field2108;
        this.field2109 = arg0.field2109;
        this.field2100 = arg0.field2100;
        this.field2092 = arg0.field2092;
        this.field2102 = arg0.field2102;
        this.field2103 = arg0.field2103;
        this.field2134 = arg0.field2134;
        this.field2110 = arg1.field2110;
        this.field2111 = 0;
        this.field2101 = false;
        this.field2099 = false;
    }

    @ObfuscatedName("gb.o(II)Lgp;")
    public final class196 method3294(int arg0) {
        if (this.field2139 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2129[var3] && this.field2129[var3] != 0) {
                    var2 = this.field2139[var3];
                }
            }
            if (var2 != -1) {
                return method2231(var2).method3294(1);
            }
        }
        class196 var4 = class196.method3512(Statics.field2089, this.field2090, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2132 != 128 || this.field2133 != 128 || this.field2093 != 128) {
            var4.method3509(this.field2132, this.field2133, this.field2093);
        }
        if (this.field2100 != null) {
            for (int var5 = 0; var5 < this.field2100.length; var5++) {
                var4.method3497(this.field2100[var5], this.field2092[var5]);
            }
        }
        if (this.field2102 != null) {
            for (int var6 = 0; var6 < this.field2102.length; var6++) {
                var4.method3500(this.field2102[var6], this.field2103[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gb.n(IB)Lhp;")
    public final class211 method3295(int arg0) {
        if (this.field2139 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2129[var3] && this.field2129[var3] != 0) {
                    var2 = this.field2139[var3];
                }
            }
            if (var2 != -1) {
                return method2231(var2).method3295(1);
            }
        }
        class211 var4 = (class211) field2095.method4599((long) this.field2137);
        if (var4 != null) {
            return var4;
        }
        class196 var5 = class196.method3512(Statics.field2089, this.field2090, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2132 != 128 || this.field2133 != 128 || this.field2093 != 128) {
            var5.method3509(this.field2132, this.field2133, this.field2093);
        }
        if (this.field2100 != null) {
            for (int var6 = 0; var6 < this.field2100.length; var6++) {
                var5.method3497(this.field2100[var6], this.field2092[var6]);
            }
        }
        if (this.field2102 != null) {
            for (int var7 = 0; var7 < this.field2102.length; var7++) {
                var5.method3500(this.field2102[var7], this.field2103[var7]);
            }
        }
        class211 var8 = var5.method3565(this.field2125 + 64, this.field2136 * 5 + 768, -50, -10, -50);
        var8.field2541 = true;
        field2095.method4600(var8, (long) this.field2137);
        return var8;
    }

    @ObfuscatedName("gb.d(II)Lgb;")
    public class188 method3325(int arg0) {
        if (this.field2139 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2129[var3] && this.field2129[var3] != 0) {
                    var2 = this.field2139[var3];
                }
            }
            if (var2 != -1) {
                return method2231(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ch.a(IIIIIZI)Lqn;")
    public static final class457 method1975(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class457 var8 = (class457) field2096.method4599(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class188 var9 = method2231(arg0);
        if (arg1 > 1 && var9.field2139 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2129[var11] && var9.field2129[var11] != 0) {
                    var10 = var9.field2139[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2231(var10);
            }
        }
        class211 var12 = var9.method3295(1);
        if (var12 == null) {
            return null;
        }
        class457 var13 = null;
        if (var9.field2131 != -1) {
            var13 = method1975(var9.field2130, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2141 != -1) {
            var13 = method1975(var9.field2140, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2143 != -1) {
            var13 = method1975(var9.field2142, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4775;
        int var15 = Statics.field4772;
        int var16 = Statics.field4771;
        int[] var17 = new int[4];
        class453.method7240(var17);
        class457 var18 = new class457(36, 32);
        class453.method7236(var18.field4803, 36, 32);
        class453.method7241();
        class201.method3640();
        class201.method3667(16, 16);
        class201.field2353 = false;
        if (var9.field2143 != -1) {
            var13.method7352(0, 0);
        }
        int var19 = var9.field2104;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class201.field2346[var9.field2105] * var19 >> 16;
        int var21 = class201.field2363[var9.field2105] * var19 >> 16;
        var12.method3930();
        var12.method4018(0, var9.field2128, var9.field2107, var9.field2105, var9.field2108, var9.field2109 + var12.field2449 / 2 + var20, var9.field2109 + var21);
        if (var9.field2141 != -1) {
            var13.method7352(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7348(1);
        }
        if (arg2 >= 2) {
            var18.method7348(16777215);
        }
        if (arg3 != 0) {
            var18.method7369(arg3);
        }
        class453.method7236(var18.field4803, 36, 32);
        if (var9.field2131 != -1) {
            var13.method7352(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2134 == 1) {
            class350 var22 = Statics.field1595;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class309.field3793 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class309.field3801 + "</col>";
            }
            var22.method5725(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2096.method4600(var18, var6);
        }
        class453.method7236(var14, var15, var16);
        class453.method7250(var17);
        class201.method3640();
        class201.field2353 = true;
        return var18;
    }

    @ObfuscatedName("gb.m(ZI)Z")
    public final boolean method3297(boolean arg0) {
        int var2 = this.field2116;
        int var3 = this.field2117;
        int var4 = this.field2106;
        if (arg0) {
            var2 = this.field2119;
            var3 = this.field2120;
            var4 = this.field2123;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2089.method5234(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2089.method5234(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2089.method5234(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gb.u(ZI)Lgp;")
    public final class196 method3298(boolean arg0) {
        int var2 = this.field2116;
        int var3 = this.field2117;
        int var4 = this.field2106;
        if (arg0) {
            var2 = this.field2119;
            var3 = this.field2120;
            var4 = this.field2123;
        }
        if (var2 == -1) {
            return null;
        }
        class196 var5 = class196.method3512(Statics.field2089, var2, 0);
        if (var3 != -1) {
            class196 var6 = class196.method3512(Statics.field2089, var3, 0);
            if (var4 == -1) {
                class196[] var9 = new class196[] { var5, var6 };
                var5 = new class196(var9, 2);
            } else {
                class196 var7 = class196.method3512(Statics.field2089, var4, 0);
                class196[] var8 = new class196[] { var5, var6, var7 };
                var5 = new class196(var8, 3);
            }
        }
        if (!arg0 && this.field2118 != 0) {
            var5.method3496(0, this.field2118, 0);
        }
        if (arg0 && this.field2121 != 0) {
            var5.method3496(0, this.field2121, 0);
        }
        if (this.field2100 != null) {
            for (int var10 = 0; var10 < this.field2100.length; var10++) {
                var5.method3497(this.field2100[var10], this.field2092[var10]);
            }
        }
        if (this.field2102 != null) {
            for (int var11 = 0; var11 < this.field2102.length; var11++) {
                var5.method3500(this.field2102[var11], this.field2103[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gb.l(ZI)Z")
    public final boolean method3293(boolean arg0) {
        int var2 = this.field2124;
        int var3 = this.field2114;
        if (arg0) {
            var2 = this.field2138;
            var3 = this.field2127;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2089.method5234(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2089.method5234(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gb.z(ZI)Lgp;")
    public final class196 method3300(boolean arg0) {
        int var2 = this.field2124;
        int var3 = this.field2114;
        if (arg0) {
            var2 = this.field2138;
            var3 = this.field2127;
        }
        if (var2 == -1) {
            return null;
        }
        class196 var4 = class196.method3512(Statics.field2089, var2, 0);
        if (var3 != -1) {
            class196 var5 = class196.method3512(Statics.field2089, var3, 0);
            class196[] var6 = new class196[] { var4, var5 };
            var4 = new class196(var6, 2);
        }
        if (this.field2100 != null) {
            for (int var7 = 0; var7 < this.field2100.length; var7++) {
                var4.method3497(this.field2100[var7], this.field2092[var7]);
            }
        }
        if (this.field2102 != null) {
            for (int var8 = 0; var8 < this.field2102.length; var8++) {
                var4.method3500(this.field2102[var8], this.field2103[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gb.r(III)I")
    public int method3301(int arg0, int arg1) {
        return class175.method959(this.field2115, arg0, arg1);
    }

    @ObfuscatedName("gb.y(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3302(int arg0, String arg1) {
        return class175.method2648(this.field2115, arg0, arg1);
    }

    @ObfuscatedName("gb.p(I)I")
    public int method3348() {
        if (this.field2112 == -1 || this.field2088 == null) {
            return -1;
        } else if (this.field2112 >= 0) {
            return this.field2088[this.field2112] == null ? -1 : this.field2112;
        } else if (class309.field3914.equalsIgnoreCase(this.field2088[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dm.e(I)V")
    public static void method2590() {
        field2126.method4603();
        field2095.method4603();
        field2096.method4603();
    }

    @ObfuscatedName("jx.b(I)V")
    public static void method4636() {
        field2096.method4603();
    }

    @ObfuscatedName("gb.x(I)Z")
    public boolean method3304() {
        return this.field2092 != null;
    }

    @ObfuscatedName("gb.f(I)Z")
    public boolean method3305() {
        return this.field2103 != null;
    }
}
