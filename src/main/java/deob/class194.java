package deob;

@ObfuscatedName("gm")
public class class194 extends class425 {

    @ObfuscatedName("gm.a")
    public static boolean field2111 = false;

    @ObfuscatedName("gm.x")
    public static class266 field2084 = new class266(4096);

    @ObfuscatedName("gm.h")
    public static class266 field2085 = new class266(500);

    @ObfuscatedName("gm.j")
    public static class266 field2103 = new class266(30);

    @ObfuscatedName("gm.y")
    public static class266 field2087 = new class266(30);

    @ObfuscatedName("gm.d")
    public static class206[] field2088 = new class206[4];

    @ObfuscatedName("gm.n")
    public int field2081;

    @ObfuscatedName("gm.r")
    public int[] field2086;

    @ObfuscatedName("gm.l")
    public int[] field2108;

    @ObfuscatedName("gm.s")
    public String field2092 = class323.field3774;

    @ObfuscatedName("gm.p")
    public short[] field2093;

    @ObfuscatedName("gm.b")
    public short[] field2121;

    @ObfuscatedName("gm.o")
    public short[] field2095;

    @ObfuscatedName("gm.u")
    public short[] field2096;

    @ObfuscatedName("gm.z")
    public int field2129 = 1;

    @ObfuscatedName("gm.t")
    public int field2098 = 1;

    @ObfuscatedName("gm.w")
    public int field2099 = 2;

    @ObfuscatedName("gm.m")
    public boolean field2100 = true;

    @ObfuscatedName("gm.q")
    public int field2101 = -1;

    @ObfuscatedName("gm.i")
    public int field2102 = -1;

    @ObfuscatedName("gm.e")
    public boolean field2094 = false;

    @ObfuscatedName("gm.g")
    public boolean field2120 = false;

    @ObfuscatedName("gm.k")
    public int field2105 = -1;

    @ObfuscatedName("gm.v")
    public int field2106 = 16;

    @ObfuscatedName("gm.aj")
    public int field2090 = 0;

    @ObfuscatedName("gm.an")
    public int field2107 = 0;

    @ObfuscatedName("gm.ah")
    public String[] field2089 = new String[5];

    @ObfuscatedName("gm.ao")
    public int field2110 = -1;

    @ObfuscatedName("gm.ac")
    public int field2104 = -1;

    @ObfuscatedName("gm.af")
    public boolean field2112 = false;

    @ObfuscatedName("gm.ad")
    public boolean field2113 = true;

    @ObfuscatedName("gm.av")
    public int field2109 = 128;

    @ObfuscatedName("gm.ak")
    public int field2091 = 128;

    @ObfuscatedName("gm.ae")
    public int field2116 = 128;

    @ObfuscatedName("gm.ap")
    public int field2117 = 0;

    @ObfuscatedName("gm.as")
    public int field2118 = 0;

    @ObfuscatedName("gm.aq")
    public int field2119 = 0;

    @ObfuscatedName("gm.al")
    public boolean field2097 = false;

    @ObfuscatedName("gm.ag")
    public boolean field2114 = false;

    @ObfuscatedName("gm.am")
    public int field2122 = -1;

    @ObfuscatedName("gm.az")
    public int[] field2123;

    @ObfuscatedName("gm.ab")
    public int field2124 = -1;

    @ObfuscatedName("gm.ai")
    public int field2125 = -1;

    @ObfuscatedName("gm.au")
    public int field2126 = -1;

    @ObfuscatedName("gm.aw")
    public int field2127 = 0;

    @ObfuscatedName("gm.at")
    public int field2115 = 0;

    @ObfuscatedName("gm.ar")
    public int field2131 = 0;

    @ObfuscatedName("gm.ay")
    public int[] field2130;

    @ObfuscatedName("gm.ax")
    public boolean field2128 = true;

    @ObfuscatedName("gm.aa")
    public class440 field2132;

    @ObfuscatedName("ck.a(IB)Lgm;")
    public static class194 method2141(int arg0) {
        class194 var1 = (class194) field2084.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2082.method5859(6, arg0);
        class194 var3 = new class194();
        var3.field2081 = arg0;
        if (var2 != null) {
            var3.method3410(new class464(var2));
        }
        var3.method3412();
        if (var3.field2114) {
            var3.field2099 = 0;
            var3.field2100 = false;
        }
        field2084.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.f(B)V")
    public void method3412() {
        if (this.field2101 == -1) {
            this.field2101 = 0;
            if (this.field2086 != null && (this.field2108 == null || this.field2108[0] == 10)) {
                this.field2101 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2089[var1] != null) {
                    this.field2101 = 1;
                }
            }
        }
        if (this.field2122 == -1) {
            this.field2122 = this.field2099 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gm.c(Lqr;B)V")
    public void method3410(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3411(arg0, var2);
        }
    }

    @ObfuscatedName("gm.x(Lqr;IS)V")
    public void method3411(class464 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7735();
            if (var3 > 0) {
                if (this.field2086 == null || field2111) {
                    this.field2108 = new int[var3];
                    this.field2086 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2086[var4] = arg0.method7716();
                        this.field2108[var4] = arg0.method7735();
                    }
                } else {
                    arg0.field4864 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2092 = arg0.method7725();
        } else if (arg1 == 5) {
            int var5 = arg0.method7735();
            if (var5 > 0) {
                if (this.field2086 == null || field2111) {
                    this.field2108 = null;
                    this.field2086 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2086[var6] = arg0.method7716();
                    }
                } else {
                    arg0.field4864 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2129 = arg0.method7735();
        } else if (arg1 == 15) {
            this.field2098 = arg0.method7735();
        } else if (arg1 == 17) {
            this.field2099 = 0;
            this.field2100 = false;
        } else if (arg1 == 18) {
            this.field2100 = false;
        } else if (arg1 == 19) {
            this.field2101 = arg0.method7735();
        } else if (arg1 == 21) {
            this.field2102 = 0;
        } else if (arg1 == 22) {
            this.field2094 = true;
        } else if (arg1 == 23) {
            this.field2120 = true;
        } else if (arg1 == 24) {
            this.field2105 = arg0.method7716();
            if (this.field2105 == 65535) {
                this.field2105 = -1;
            }
        } else if (arg1 == 27) {
            this.field2099 = 1;
        } else if (arg1 == 28) {
            this.field2106 = arg0.method7735();
        } else if (arg1 == 29) {
            this.field2090 = arg0.method7881();
        } else if (arg1 == 39) {
            this.field2107 = arg0.method7881() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2089[arg1 - 30] = arg0.method7725();
            if (this.field2089[arg1 - 30].equalsIgnoreCase(class323.field3769)) {
                this.field2089[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7735();
            this.field2093 = new short[var7];
            this.field2121 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2093[var8] = (short) arg0.method7716();
                this.field2121[var8] = (short) arg0.method7716();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7735();
            this.field2095 = new short[var9];
            this.field2096 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2095[var10] = (short) arg0.method7716();
                this.field2096[var10] = (short) arg0.method7716();
            }
        } else if (arg1 == 61) {
            arg0.method7716();
        } else if (arg1 == 62) {
            this.field2112 = true;
        } else if (arg1 == 64) {
            this.field2113 = false;
        } else if (arg1 == 65) {
            this.field2109 = arg0.method7716();
        } else if (arg1 == 66) {
            this.field2091 = arg0.method7716();
        } else if (arg1 == 67) {
            this.field2116 = arg0.method7716();
        } else if (arg1 == 68) {
            this.field2104 = arg0.method7716();
        } else if (arg1 == 69) {
            arg0.method7735();
        } else if (arg1 == 70) {
            this.field2117 = arg0.method7798();
        } else if (arg1 == 71) {
            this.field2118 = arg0.method7798();
        } else if (arg1 == 72) {
            this.field2119 = arg0.method7798();
        } else if (arg1 == 73) {
            this.field2097 = true;
        } else if (arg1 == 74) {
            this.field2114 = true;
        } else if (arg1 == 75) {
            this.field2122 = arg0.method7735();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2124 = arg0.method7716();
            if (this.field2124 == 65535) {
                this.field2124 = -1;
            }
            this.field2125 = arg0.method7716();
            if (this.field2125 == 65535) {
                this.field2125 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7716();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7735();
            this.field2123 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2123[var15] = arg0.method7716();
                if (this.field2123[var15] == 65535) {
                    this.field2123[var15] = -1;
                }
            }
            this.field2123[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2126 = arg0.method7716();
            this.field2127 = arg0.method7735();
        } else if (arg1 == 79) {
            this.field2115 = arg0.method7716();
            this.field2131 = arg0.method7716();
            this.field2127 = arg0.method7735();
            int var11 = arg0.method7735();
            this.field2130 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2130[var12] = arg0.method7716();
            }
        } else if (arg1 == 81) {
            this.field2102 = arg0.method7735() * 256;
        } else if (arg1 == 82) {
            this.field2110 = arg0.method7716();
        } else if (arg1 == 89) {
            this.field2128 = false;
        } else if (arg1 == 249) {
            this.field2132 = class182.method4112(arg0, this.field2132);
        }
    }

    @ObfuscatedName("gm.h(II)Z")
    public final boolean method3449(int arg0) {
        if (this.field2108 != null) {
            for (int var4 = 0; var4 < this.field2108.length; var4++) {
                if (this.field2108[var4] == arg0) {
                    return Statics.field2083.method5784(this.field2086[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2086 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2086.length; var3++) {
                var2 &= Statics.field2083.method5784(this.field2086[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gm.j(I)Z")
    public final boolean method3417() {
        if (this.field2086 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2086.length; var2++) {
            var1 &= Statics.field2083.method5784(this.field2086[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gm.y(II[[IIIII)Lhd;")
    public final class215 method3414(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2108 == null) {
            var7 = (long) ((this.field2081 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2081 << 10) + (arg0 << 3) + arg1);
        }
        class215 var9 = (class215) field2103.method4839(var7);
        if (var9 == null) {
            class206 var10 = this.method3409(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2094) {
                var10.field2340 = (short) (this.field2090 + 64);
                var10.field2341 = (short) (this.field2107 + 768);
                var10.method3729();
                var9 = var10;
            } else {
                var9 = var10.method3732(this.field2090 + 64, this.field2107 + 768, -50, -10, -50);
            }
            field2103.method4834(var9, var7);
        }
        if (this.field2094) {
            var9 = ((class206) var9).method3718();
        }
        if (this.field2102 >= 0) {
            if (var9 instanceof class221) {
                var9 = ((class221) var9).method4177(arg2, arg3, arg4, arg5, true, this.field2102);
            } else if (var9 instanceof class206) {
                var9 = ((class206) var9).method3734(arg2, arg3, arg4, arg5, true, this.field2102);
            }
        }
        return var9;
    }

    @ObfuscatedName("gm.d(II[[IIIII)Lha;")
    public final class221 method3428(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2108 == null) {
            var7 = (long) ((this.field2081 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2081 << 10) + (arg0 << 3) + arg1);
        }
        class221 var9 = (class221) field2087.method4839(var7);
        if (var9 == null) {
            class206 var10 = this.method3409(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3732(this.field2090 + 64, this.field2107 + 768, -50, -10, -50);
            field2087.method4834(var9, var7);
        }
        if (this.field2102 >= 0) {
            var9 = var9.method4177(arg2, arg3, arg4, arg5, true, this.field2102);
        }
        return var9;
    }

    @ObfuscatedName("gm.n(II[[IIIILgg;II)Lha;")
    public final class221 method3416(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class197 arg6, int arg7) {
        long var9;
        if (this.field2108 == null) {
            var9 = (long) ((this.field2081 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2081 << 10) + (arg0 << 3) + arg1);
        }
        class221 var11 = (class221) field2087.method4839(var9);
        if (var11 == null) {
            class206 var12 = this.method3409(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3732(this.field2090 + 64, this.field2107 + 768, -50, -10, -50);
            field2087.method4834(var11, var9);
        }
        if (arg6 == null && this.field2102 == -1) {
            return var11;
        }
        class221 var13;
        if (arg6 == null) {
            var13 = var11.method4154(true);
        } else {
            var13 = arg6.method3560(var11, arg7, arg1);
        }
        if (this.field2102 >= 0) {
            var13 = var13.method4177(arg2, arg3, arg4, arg5, false, this.field2102);
        }
        return var13;
    }

    @ObfuscatedName("gm.r(IIB)Lgs;")
    public final class206 method3409(int arg0, int arg1) {
        class206 var3 = null;
        if (this.field2108 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2086 == null) {
                return null;
            }
            boolean var4 = this.field2112;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2086.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2086[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class206) field2085.method4839((long) var7);
                if (var3 == null) {
                    var3 = class206.method3710(Statics.field2083, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3728();
                    }
                    field2085.method4834(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2088[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class206(field2088, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2108.length; var9++) {
                if (this.field2108[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2086[var8];
            boolean var11 = this.field2112 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class206) field2085.method4839((long) var10);
            if (var3 == null) {
                var3 = class206.method3710(Statics.field2083, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3728();
                }
                field2085.method4834(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2109 == 128 && this.field2091 == 128 && this.field2116 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2117 == 0 && this.field2118 == 0 && this.field2119 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class206 var14 = new class206(var3, arg1 == 0 && !var12 && !var13, this.field2093 == null, this.field2095 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3724(256);
            var14.method3758(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3757();
        } else if (var15 == 2) {
            var14.method3722();
        } else if (var15 == 3) {
            var14.method3723();
        }
        if (this.field2093 != null) {
            for (int var16 = 0; var16 < this.field2093.length; var16++) {
                var14.method3726(this.field2093[var16], this.field2121[var16]);
            }
        }
        if (this.field2095 != null) {
            for (int var17 = 0; var17 < this.field2095.length; var17++) {
                var14.method3727(this.field2095[var17], this.field2096[var17]);
            }
        }
        if (var12) {
            var14.method3712(this.field2109, this.field2091, this.field2116);
        }
        if (var13) {
            var14.method3758(this.field2117, this.field2118, this.field2119);
        }
        return var14;
    }

    @ObfuscatedName("gm.l(B)Lgm;")
    public final class194 method3418() {
        int var1 = -1;
        if (this.field2124 != -1) {
            var1 = class293.method1999(this.field2124);
        } else if (this.field2125 != -1) {
            var1 = class293.field3391[this.field2125];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2123.length - 1) {
            var2 = this.field2123[var1];
        } else {
            var2 = this.field2123[this.field2123.length - 1];
        }
        return var2 == -1 ? null : method2141(var2);
    }

    @ObfuscatedName("gm.s(III)I")
    public int method3444(int arg0, int arg1) {
        return class182.method6006(this.field2132, arg0, arg1);
    }

    @ObfuscatedName("gm.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3420(int arg0, String arg1) {
        return class182.method6701(this.field2132, arg0, arg1);
    }

    @ObfuscatedName("ea.b(I)V")
    public static void method2872() {
        field2084.method4837();
        field2085.method4837();
        field2103.method4837();
        field2087.method4837();
    }

    @ObfuscatedName("gm.o(B)Z")
    public boolean method3408() {
        if (this.field2123 == null) {
            return this.field2126 != -1 || this.field2130 != null;
        }
        for (int var1 = 0; var1 < this.field2123.length; var1++) {
            if (this.field2123[var1] != -1) {
                class194 var2 = method2141(this.field2123[var1]);
                if (var2.field2126 != -1 || var2.field2130 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
