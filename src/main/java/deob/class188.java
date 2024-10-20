package deob;

@ObfuscatedName("gs")
public class class188 extends class405 {

    @ObfuscatedName("gs.i")
    public static class256 field2097 = new class256(64);

    @ObfuscatedName("gs.s")
    public static class256 field2098 = new class256(50);

    @ObfuscatedName("gs.t")
    public static class256 field2099 = new class256(200);

    @ObfuscatedName("gs.r")
    public int field2127;

    @ObfuscatedName("gs.u")
    public int field2102;

    @ObfuscatedName("gs.k")
    public String field2103 = class308.field3624;

    @ObfuscatedName("gs.h")
    public short[] field2115;

    @ObfuscatedName("gs.x")
    public short[] field2105;

    @ObfuscatedName("gs.l")
    public short[] field2106;

    @ObfuscatedName("gs.a")
    public short[] field2107;

    @ObfuscatedName("gs.p")
    public int field2108 = 2000;

    @ObfuscatedName("gs.b")
    public int field2109 = 0;

    @ObfuscatedName("gs.n")
    public int field2110 = 0;

    @ObfuscatedName("gs.o")
    public int field2111 = 0;

    @ObfuscatedName("gs.m")
    public int field2112 = 0;

    @ObfuscatedName("gs.d")
    public int field2113 = 0;

    @ObfuscatedName("gs.ad")
    public int field2114 = 0;

    @ObfuscatedName("gs.ak")
    public int field2124 = 1;

    @ObfuscatedName("gs.al")
    public boolean field2139 = false;

    @ObfuscatedName("gs.ao")
    public String[] field2125 = new String[] { null, null, class308.field3617, null, null };

    @ObfuscatedName("gs.ab")
    public String[] field2118 = new String[] { null, null, null, null, class308.field3618 };

    @ObfuscatedName("gs.ac")
    public int field2148 = -2;

    @ObfuscatedName("gs.ae")
    public int field2120 = -1;

    @ObfuscatedName("gs.aj")
    public int field2121 = -1;

    @ObfuscatedName("gs.am")
    public int field2122 = 0;

    @ObfuscatedName("gs.an")
    public int field2123 = -1;

    @ObfuscatedName("gs.af")
    public int field2132 = -1;

    @ObfuscatedName("gs.ax")
    public int field2129 = 0;

    @ObfuscatedName("gs.ar")
    public int field2101 = -1;

    @ObfuscatedName("gs.at")
    public int field2140 = -1;

    @ObfuscatedName("gs.ag")
    public int field2128 = -1;

    @ObfuscatedName("gs.aq")
    public int field2117 = -1;

    @ObfuscatedName("gs.ah")
    public int field2130 = -1;

    @ObfuscatedName("gs.ai")
    public int field2131 = -1;

    @ObfuscatedName("gs.az")
    public int[] field2133;

    @ObfuscatedName("gs.av")
    public int[] field2137;

    @ObfuscatedName("gs.aw")
    public int field2134 = -1;

    @ObfuscatedName("gs.au")
    public int field2135 = -1;

    @ObfuscatedName("gs.aa")
    public int field2136 = 128;

    @ObfuscatedName("gs.ay")
    public int field2094 = 128;

    @ObfuscatedName("gs.as")
    public int field2093 = 128;

    @ObfuscatedName("gs.be")
    public int field2104 = 0;

    @ObfuscatedName("gs.bz")
    public int field2138 = 0;

    @ObfuscatedName("gs.bp")
    public int field2141 = 0;

    @ObfuscatedName("gs.bf")
    public class419 field2142;

    @ObfuscatedName("gs.bg")
    public boolean field2143 = false;

    @ObfuscatedName("gs.br")
    public int field2144 = -1;

    @ObfuscatedName("gs.bn")
    public int field2145 = -1;

    @ObfuscatedName("gs.bq")
    public int field2146 = -1;

    @ObfuscatedName("gs.bc")
    public int field2147 = -1;

    @ObfuscatedName("dl.c(Llh;Llh;ZLmt;I)V")
    public static void method2511(class315 arg0, class315 arg1, boolean arg2, class349 arg3) {
        Statics.field1377 = arg0;
        Statics.field2096 = arg1;
        Statics.field154 = arg2;
        Statics.field3030 = Statics.field1377.method5313(10);
        Statics.field2100 = arg3;
    }

    @ObfuscatedName("fs.v(IB)Lgs;")
    public static class188 method3161(int arg0) {
        class188 var1 = (class188) field2097.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1377.method5305(10, arg0);
        class188 var3 = new class188();
        var3.field2127 = arg0;
        if (var2 != null) {
            var3.method3387(new class443(var2));
        }
        var3.method3439();
        if (var3.field2135 != -1) {
            var3.method3409(method3161(var3.field2135), method3161(var3.field2134));
        }
        if (var3.field2145 != -1) {
            var3.method3420(method3161(var3.field2145), method3161(var3.field2144));
        }
        if (var3.field2147 != -1) {
            var3.method3429(method3161(var3.field2147), method3161(var3.field2146));
        }
        if (!Statics.field154 && var3.field2139) {
            var3.field2103 = class308.field3655;
            var3.field2143 = false;
            for (int var4 = 0; var4 < var3.field2125.length; var4++) {
                var3.field2125[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2118.length; var5++) {
                if (var5 != 4) {
                    var3.field2118[var5] = null;
                }
            }
            var3.field2148 = -2;
            var3.field2141 = 0;
            if (var3.field2142 != null) {
                boolean var6 = false;
                for (class410 var7 = var3.field2142.method6749(); var7 != null; var7 = var3.field2142.method6750()) {
                    class184 var8 = class184.method3143((int) var7.field4462);
                    if (var8.field2004) {
                        var7.method6497();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2142 = null;
                }
            }
        }
        field2097.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.q(I)V")
    public void method3439() {
    }

    @ObfuscatedName("gs.f(Lqt;I)V")
    public void method3387(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3388(arg0, var2);
        }
    }

    @ObfuscatedName("gs.j(Lqt;II)V")
    public void method3388(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2102 = arg0.method7049();
        } else if (arg1 == 2) {
            this.field2103 = arg0.method7057();
        } else if (arg1 == 4) {
            this.field2108 = arg0.method7049();
        } else if (arg1 == 5) {
            this.field2109 = arg0.method7049();
        } else if (arg1 == 6) {
            this.field2110 = arg0.method7049();
        } else if (arg1 == 7) {
            this.field2112 = arg0.method7049();
            if (this.field2112 > 32767) {
                this.field2112 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2113 = arg0.method7049();
            if (this.field2113 > 32767) {
                this.field2113 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7057();
        } else if (arg1 == 11) {
            this.field2114 = 1;
        } else if (arg1 == 12) {
            this.field2124 = arg0.method7052();
        } else if (arg1 == 16) {
            this.field2139 = true;
        } else if (arg1 == 23) {
            this.field2120 = arg0.method7049();
            this.field2122 = arg0.method7047();
        } else if (arg1 == 24) {
            this.field2121 = arg0.method7049();
        } else if (arg1 == 25) {
            this.field2123 = arg0.method7049();
            this.field2129 = arg0.method7047();
        } else if (arg1 == 26) {
            this.field2132 = arg0.method7049();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2125[arg1 - 30] = arg0.method7057();
            if (this.field2125[arg1 - 30].equalsIgnoreCase(class308.field3619)) {
                this.field2125[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2118[arg1 - 35] = arg0.method7057();
        } else if (arg1 == 40) {
            int var3 = arg0.method7047();
            this.field2115 = new short[var3];
            this.field2105 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2115[var4] = (short) arg0.method7049();
                this.field2105[var4] = (short) arg0.method7049();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7047();
            this.field2106 = new short[var5];
            this.field2107 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2106[var6] = (short) arg0.method7049();
                this.field2107[var6] = (short) arg0.method7049();
            }
        } else if (arg1 == 42) {
            this.field2148 = arg0.method7048();
        } else if (arg1 == 65) {
            this.field2143 = true;
        } else if (arg1 == 78) {
            this.field2101 = arg0.method7049();
        } else if (arg1 == 79) {
            this.field2140 = arg0.method7049();
        } else if (arg1 == 90) {
            this.field2128 = arg0.method7049();
        } else if (arg1 == 91) {
            this.field2130 = arg0.method7049();
        } else if (arg1 == 92) {
            this.field2117 = arg0.method7049();
        } else if (arg1 == 93) {
            this.field2131 = arg0.method7049();
        } else if (arg1 == 94) {
            arg0.method7049();
        } else if (arg1 == 95) {
            this.field2111 = arg0.method7049();
        } else if (arg1 == 97) {
            this.field2134 = arg0.method7049();
        } else if (arg1 == 98) {
            this.field2135 = arg0.method7049();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2133 == null) {
                this.field2133 = new int[10];
                this.field2137 = new int[10];
            }
            this.field2133[arg1 - 100] = arg0.method7049();
            this.field2137[arg1 - 100] = arg0.method7049();
        } else if (arg1 == 110) {
            this.field2136 = arg0.method7049();
        } else if (arg1 == 111) {
            this.field2094 = arg0.method7049();
        } else if (arg1 == 112) {
            this.field2093 = arg0.method7049();
        } else if (arg1 == 113) {
            this.field2104 = arg0.method7048();
        } else if (arg1 == 114) {
            this.field2138 = arg0.method7048() * 5;
        } else if (arg1 == 115) {
            this.field2141 = arg0.method7047();
        } else if (arg1 == 139) {
            this.field2144 = arg0.method7049();
        } else if (arg1 == 140) {
            this.field2145 = arg0.method7049();
        } else if (arg1 == 148) {
            this.field2146 = arg0.method7049();
        } else if (arg1 == 149) {
            this.field2147 = arg0.method7049();
        } else if (arg1 == 249) {
            this.field2142 = class175.method2132(arg0, this.field2142);
        }
    }

    @ObfuscatedName("gs.e(Lgs;Lgs;I)V")
    public void method3409(class188 arg0, class188 arg1) {
        this.field2102 = arg0.field2102;
        this.field2108 = arg0.field2108;
        this.field2109 = arg0.field2109;
        this.field2110 = arg0.field2110;
        this.field2111 = arg0.field2111;
        this.field2112 = arg0.field2112;
        this.field2113 = arg0.field2113;
        this.field2115 = arg0.field2115;
        this.field2105 = arg0.field2105;
        this.field2106 = arg0.field2106;
        this.field2107 = arg0.field2107;
        this.field2103 = arg1.field2103;
        this.field2139 = arg1.field2139;
        this.field2124 = arg1.field2124;
        this.field2114 = 1;
    }

    @ObfuscatedName("gs.g(Lgs;Lgs;B)V")
    public void method3420(class188 arg0, class188 arg1) {
        this.field2102 = arg0.field2102;
        this.field2108 = arg0.field2108;
        this.field2109 = arg0.field2109;
        this.field2110 = arg0.field2110;
        this.field2111 = arg0.field2111;
        this.field2112 = arg0.field2112;
        this.field2113 = arg0.field2113;
        this.field2115 = arg1.field2115;
        this.field2105 = arg1.field2105;
        this.field2106 = arg1.field2106;
        this.field2107 = arg1.field2107;
        this.field2103 = arg1.field2103;
        this.field2139 = arg1.field2139;
        this.field2114 = arg1.field2114;
        this.field2120 = arg1.field2120;
        this.field2121 = arg1.field2121;
        this.field2101 = arg1.field2101;
        this.field2123 = arg1.field2123;
        this.field2132 = arg1.field2132;
        this.field2140 = arg1.field2140;
        this.field2128 = arg1.field2128;
        this.field2117 = arg1.field2117;
        this.field2130 = arg1.field2130;
        this.field2131 = arg1.field2131;
        this.field2141 = arg1.field2141;
        this.field2125 = arg1.field2125;
        this.field2118 = new String[5];
        if (arg1.field2118 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2118[var3] = arg1.field2118[var3];
            }
        }
        this.field2118[4] = class308.field3623;
        this.field2124 = 0;
    }

    @ObfuscatedName("gs.w(Lgs;Lgs;I)V")
    public void method3429(class188 arg0, class188 arg1) {
        this.field2102 = arg0.field2102;
        this.field2108 = arg0.field2108;
        this.field2109 = arg0.field2109;
        this.field2110 = arg0.field2110;
        this.field2111 = arg0.field2111;
        this.field2112 = arg0.field2112;
        this.field2113 = arg0.field2113;
        this.field2115 = arg0.field2115;
        this.field2105 = arg0.field2105;
        this.field2106 = arg0.field2106;
        this.field2107 = arg0.field2107;
        this.field2114 = arg0.field2114;
        this.field2103 = arg1.field2103;
        this.field2124 = 0;
        this.field2139 = false;
        this.field2143 = false;
    }

    @ObfuscatedName("gs.y(II)Lgw;")
    public final class196 method3392(int arg0) {
        if (this.field2133 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2137[var3] && this.field2137[var3] != 0) {
                    var2 = this.field2133[var3];
                }
            }
            if (var2 != -1) {
                return method3161(var2).method3392(1);
            }
        }
        class196 var4 = class196.method3646(Statics.field2096, this.field2102, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2136 != 128 || this.field2094 != 128 || this.field2093 != 128) {
            var4.method3600(this.field2136, this.field2094, this.field2093);
        }
        if (this.field2115 != null) {
            for (int var5 = 0; var5 < this.field2115.length; var5++) {
                var4.method3606(this.field2115[var5], this.field2105[var5]);
            }
        }
        if (this.field2106 != null) {
            for (int var6 = 0; var6 < this.field2106.length; var6++) {
                var4.method3626(this.field2106[var6], this.field2107[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gs.i(IB)Lhy;")
    public final class211 method3393(int arg0) {
        if (this.field2133 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2137[var3] && this.field2137[var3] != 0) {
                    var2 = this.field2133[var3];
                }
            }
            if (var2 != -1) {
                return method3161(var2).method3393(1);
            }
        }
        class211 var4 = (class211) field2098.method4691((long) this.field2127);
        if (var4 != null) {
            return var4;
        }
        class196 var5 = class196.method3646(Statics.field2096, this.field2102, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2136 != 128 || this.field2094 != 128 || this.field2093 != 128) {
            var5.method3600(this.field2136, this.field2094, this.field2093);
        }
        if (this.field2115 != null) {
            for (int var6 = 0; var6 < this.field2115.length; var6++) {
                var5.method3606(this.field2115[var6], this.field2105[var6]);
            }
        }
        if (this.field2106 != null) {
            for (int var7 = 0; var7 < this.field2106.length; var7++) {
                var5.method3626(this.field2106[var7], this.field2107[var7]);
            }
        }
        class211 var8 = var5.method3658(this.field2104 + 64, this.field2138 + 768, -50, -10, -50);
        var8.field2537 = true;
        field2098.method4693(var8, (long) this.field2127);
        return var8;
    }

    @ObfuscatedName("gs.s(IS)Lgs;")
    public class188 method3394(int arg0) {
        if (this.field2133 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2137[var3] && this.field2137[var3] != 0) {
                    var2 = this.field2133[var3];
                }
            }
            if (var2 != -1) {
                return method3161(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("me.t(IIIIIZI)Lqe;")
    public static final class456 method5769(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class456 var8 = (class456) field2099.method4691(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class188 var9 = method3161(arg0);
        if (arg1 > 1 && var9.field2133 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2137[var11] && var9.field2137[var11] != 0) {
                    var10 = var9.field2133[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3161(var10);
            }
        }
        class211 var12 = var9.method3393(1);
        if (var12 == null) {
            return null;
        }
        class456 var13 = null;
        if (var9.field2135 != -1) {
            var13 = method5769(var9.field2134, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2145 != -1) {
            var13 = method5769(var9.field2144, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2147 != -1) {
            var13 = method5769(var9.field2146, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4770;
        int var15 = Statics.field4773;
        int var16 = Statics.field4769;
        int[] var17 = new int[4];
        class452.method7407(var17);
        class456 var18 = new class456(36, 32);
        class452.method7393(var18.field4804, 36, 32);
        class452.method7347();
        class201.method3691();
        class201.method3690(16, 16);
        class201.field2341 = false;
        if (var9.field2147 != -1) {
            var13.method7460(0, 0);
        }
        int var19 = var9.field2108;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class201.field2363[var9.field2109] * var19 >> 16;
        int var21 = class201.field2352[var9.field2109] * var19 >> 16;
        var12.method4080();
        var12.method4108(0, var9.field2110, var9.field2111, var9.field2109, var9.field2112, var9.field2113 + var12.field2447 / 2 + var20, var9.field2113 + var21);
        if (var9.field2145 != -1) {
            var13.method7460(0, 0);
        }
        if (arg2 >= 1) {
            var18.method7456(1);
        }
        if (arg2 >= 2) {
            var18.method7456(16777215);
        }
        if (arg3 != 0) {
            var18.method7457(arg3);
        }
        class452.method7393(var18.field4804, 36, 32);
        if (var9.field2135 != -1) {
            var13.method7460(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2114 == 1) {
            Statics.field2100.method5806(method3307(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2099.method4693(var18, var6);
        }
        class452.method7393(var14, var15, var16);
        class452.method7340(var17);
        class201.method3691();
        class201.field2341 = true;
        return var18;
    }

    @ObfuscatedName("gr.z(IB)Ljava/lang/String;")
    public static final String method3307(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class308.field3835 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class308.field3791 + "</col>";
        }
    }

    @ObfuscatedName("gs.r(ZB)Z")
    public final boolean method3450(boolean arg0) {
        int var2 = this.field2120;
        int var3 = this.field2121;
        int var4 = this.field2101;
        if (arg0) {
            var2 = this.field2123;
            var3 = this.field2132;
            var4 = this.field2140;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2096.method5302(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2096.method5302(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2096.method5302(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gs.u(ZI)Lgw;")
    public final class196 method3396(boolean arg0) {
        int var2 = this.field2120;
        int var3 = this.field2121;
        int var4 = this.field2101;
        if (arg0) {
            var2 = this.field2123;
            var3 = this.field2132;
            var4 = this.field2140;
        }
        if (var2 == -1) {
            return null;
        }
        class196 var5 = class196.method3646(Statics.field2096, var2, 0);
        if (var3 != -1) {
            class196 var6 = class196.method3646(Statics.field2096, var3, 0);
            if (var4 == -1) {
                class196[] var9 = new class196[] { var5, var6 };
                var5 = new class196(var9, 2);
            } else {
                class196 var7 = class196.method3646(Statics.field2096, var4, 0);
                class196[] var8 = new class196[] { var5, var6, var7 };
                var5 = new class196(var8, 3);
            }
        }
        if (!arg0 && this.field2122 != 0) {
            var5.method3605(0, this.field2122, 0);
        }
        if (arg0 && this.field2129 != 0) {
            var5.method3605(0, this.field2129, 0);
        }
        if (this.field2115 != null) {
            for (int var10 = 0; var10 < this.field2115.length; var10++) {
                var5.method3606(this.field2115[var10], this.field2105[var10]);
            }
        }
        if (this.field2106 != null) {
            for (int var11 = 0; var11 < this.field2106.length; var11++) {
                var5.method3626(this.field2106[var11], this.field2107[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gs.k(ZB)Z")
    public final boolean method3421(boolean arg0) {
        int var2 = this.field2128;
        int var3 = this.field2117;
        if (arg0) {
            var2 = this.field2130;
            var3 = this.field2131;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2096.method5302(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2096.method5302(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gs.h(ZB)Lgw;")
    public final class196 method3398(boolean arg0) {
        int var2 = this.field2128;
        int var3 = this.field2117;
        if (arg0) {
            var2 = this.field2130;
            var3 = this.field2131;
        }
        if (var2 == -1) {
            return null;
        }
        class196 var4 = class196.method3646(Statics.field2096, var2, 0);
        if (var3 != -1) {
            class196 var5 = class196.method3646(Statics.field2096, var3, 0);
            class196[] var6 = new class196[] { var4, var5 };
            var4 = new class196(var6, 2);
        }
        if (this.field2115 != null) {
            for (int var7 = 0; var7 < this.field2115.length; var7++) {
                var4.method3606(this.field2115[var7], this.field2105[var7]);
            }
        }
        if (this.field2106 != null) {
            for (int var8 = 0; var8 < this.field2106.length; var8++) {
                var4.method3626(this.field2106[var8], this.field2107[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gs.x(IIB)I")
    public int method3413(int arg0, int arg1) {
        return class175.method2678(this.field2142, arg0, arg1);
    }

    @ObfuscatedName("gs.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3400(int arg0, String arg1) {
        class419 var3 = this.field2142;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class406 var5 = (class406) var3.method6756((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4458;
            }
        }
        return var4;
    }

    @ObfuscatedName("gs.a(B)I")
    public int method3397() {
        if (this.field2148 == -1 || this.field2118 == null) {
            return -1;
        } else if (this.field2148 >= 0) {
            return this.field2118[this.field2148] == null ? -1 : this.field2148;
        } else if (class308.field3618.equalsIgnoreCase(this.field2118[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bv.p(I)V")
    public static void method1613() {
        field2097.method4695();
        field2098.method4695();
        field2099.method4695();
    }

    @ObfuscatedName("bu.b(B)V")
    public static void method1867() {
        field2099.method4695();
    }

    @ObfuscatedName("bq.n(ZB)V")
    public static void method1026(boolean arg0) {
        if (Statics.field154 != arg0) {
            method1613();
            Statics.field154 = arg0;
        }
    }

    @ObfuscatedName("gs.o(I)Z")
    public boolean method3412() {
        return this.field2105 != null;
    }

    @ObfuscatedName("gs.m(I)Z")
    public boolean method3403() {
        return this.field2107 != null;
    }
}
