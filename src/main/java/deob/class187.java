package deob;

@ObfuscatedName("gc")
public class class187 extends class406 {

    @ObfuscatedName("gc.s")
    public static boolean field2079 = false;

    @ObfuscatedName("gc.v")
    public static class256 field2038 = new class256(4096);

    @ObfuscatedName("gc.c")
    public static class256 field2039 = new class256(500);

    @ObfuscatedName("gc.q")
    public static class256 field2040 = new class256(30);

    @ObfuscatedName("gc.i")
    public static class256 field2041 = new class256(30);

    @ObfuscatedName("gc.k")
    public static class196[] field2042 = new class196[4];

    @ObfuscatedName("gc.o")
    public int field2043;

    @ObfuscatedName("gc.n")
    public int[] field2044;

    @ObfuscatedName("gc.d")
    public int[] field2045;

    @ObfuscatedName("gc.a")
    public String field2046 = class309.field3624;

    @ObfuscatedName("gc.m")
    public short[] field2047;

    @ObfuscatedName("gc.u")
    public short[] field2062;

    @ObfuscatedName("gc.l")
    public short[] field2063;

    @ObfuscatedName("gc.z")
    public short[] field2061;

    @ObfuscatedName("gc.r")
    public int field2051 = 1;

    @ObfuscatedName("gc.y")
    public int field2052 = 1;

    @ObfuscatedName("gc.p")
    public int field2053 = 2;

    @ObfuscatedName("gc.e")
    public boolean field2048 = true;

    @ObfuscatedName("gc.b")
    public int field2075 = -1;

    @ObfuscatedName("gc.x")
    public int field2056 = -1;

    @ObfuscatedName("gc.f")
    public boolean field2085 = false;

    @ObfuscatedName("gc.t")
    public boolean field2035 = false;

    @ObfuscatedName("gc.j")
    public int field2066 = -1;

    @ObfuscatedName("gc.g")
    public int field2060 = 16;

    @ObfuscatedName("gc.ar")
    public int field2059 = 0;

    @ObfuscatedName("gc.aq")
    public int field2074 = 0;

    @ObfuscatedName("gc.av")
    public String[] field2072 = new String[5];

    @ObfuscatedName("gc.aj")
    public int field2064 = -1;

    @ObfuscatedName("gc.ax")
    public int field2065 = -1;

    @ObfuscatedName("gc.ab")
    public boolean field2057 = false;

    @ObfuscatedName("gc.ak")
    public boolean field2067 = true;

    @ObfuscatedName("gc.au")
    public int field2068 = 128;

    @ObfuscatedName("gc.ae")
    public int field2054 = 128;

    @ObfuscatedName("gc.as")
    public int field2070 = 128;

    @ObfuscatedName("gc.ay")
    public int field2050 = 0;

    @ObfuscatedName("gc.ag")
    public int field2055 = 0;

    @ObfuscatedName("gc.ad")
    public int field2073 = 0;

    @ObfuscatedName("gc.af")
    public boolean field2036 = false;

    @ObfuscatedName("gc.aw")
    public boolean field2069 = false;

    @ObfuscatedName("gc.ai")
    public int field2076 = -1;

    @ObfuscatedName("gc.ap")
    public int[] field2077;

    @ObfuscatedName("gc.az")
    public int field2078 = -1;

    @ObfuscatedName("gc.an")
    public int field2049 = -1;

    @ObfuscatedName("gc.ah")
    public int field2080 = -1;

    @ObfuscatedName("gc.aa")
    public int field2081 = 0;

    @ObfuscatedName("gc.am")
    public int field2082 = 0;

    @ObfuscatedName("gc.ao")
    public int field2083 = 0;

    @ObfuscatedName("gc.at")
    public int[] field2084;

    @ObfuscatedName("gc.al")
    public boolean field2086 = true;

    @ObfuscatedName("gc.ac")
    public class420 field2071;

    @ObfuscatedName("ff.s(II)Lgc;")
    public static class187 method2907(int arg0) {
        class187 var1 = (class187) field2038.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2058.method5179(6, arg0);
        class187 var3 = new class187();
        var3.field2043 = arg0;
        if (var2 != null) {
            var3.method3270(new class444(var2));
        }
        var3.method3240();
        if (var3.field2069) {
            var3.field2053 = 0;
            var3.field2048 = false;
        }
        field2038.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.h(I)V")
    public void method3240() {
        if (this.field2075 == -1) {
            this.field2075 = 0;
            if (this.field2044 != null && (this.field2045 == null || this.field2045[0] == 10)) {
                this.field2075 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2072[var1] != null) {
                    this.field2075 = 1;
                }
            }
        }
        if (this.field2076 == -1) {
            this.field2076 = this.field2053 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gc.w(Lqr;I)V")
    public void method3270(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3283(arg0, var2);
        }
    }

    @ObfuscatedName("gc.v(Lqr;IB)V")
    public void method3283(class444 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6929();
            if (var3 > 0) {
                if (this.field2044 == null || field2079) {
                    this.field2045 = new int[var3];
                    this.field2044 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2044[var4] = arg0.method7120();
                        this.field2045[var4] = arg0.method6929();
                    }
                } else {
                    arg0.field4708 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2046 = arg0.method6975();
        } else if (arg1 == 5) {
            int var5 = arg0.method6929();
            if (var5 > 0) {
                if (this.field2044 == null || field2079) {
                    this.field2045 = null;
                    this.field2044 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2044[var6] = arg0.method7120();
                    }
                } else {
                    arg0.field4708 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2051 = arg0.method6929();
        } else if (arg1 == 15) {
            this.field2052 = arg0.method6929();
        } else if (arg1 == 17) {
            this.field2053 = 0;
            this.field2048 = false;
        } else if (arg1 == 18) {
            this.field2048 = false;
        } else if (arg1 == 19) {
            this.field2075 = arg0.method6929();
        } else if (arg1 == 21) {
            this.field2056 = 0;
        } else if (arg1 == 22) {
            this.field2085 = true;
        } else if (arg1 == 23) {
            this.field2035 = true;
        } else if (arg1 == 24) {
            this.field2066 = arg0.method7120();
            if (this.field2066 == 65535) {
                this.field2066 = -1;
            }
        } else if (arg1 == 27) {
            this.field2053 = 1;
        } else if (arg1 == 28) {
            this.field2060 = arg0.method6929();
        } else if (arg1 == 29) {
            this.field2059 = arg0.method6930();
        } else if (arg1 == 39) {
            this.field2074 = arg0.method6930() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2072[arg1 - 30] = arg0.method6975();
            if (this.field2072[arg1 - 30].equalsIgnoreCase(class309.field3619)) {
                this.field2072[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6929();
            this.field2047 = new short[var7];
            this.field2062 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2047[var8] = (short) arg0.method7120();
                this.field2062[var8] = (short) arg0.method7120();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6929();
            this.field2063 = new short[var9];
            this.field2061 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2063[var10] = (short) arg0.method7120();
                this.field2061[var10] = (short) arg0.method7120();
            }
        } else if (arg1 == 61) {
            arg0.method7120();
        } else if (arg1 == 62) {
            this.field2057 = true;
        } else if (arg1 == 64) {
            this.field2067 = false;
        } else if (arg1 == 65) {
            this.field2068 = arg0.method7120();
        } else if (arg1 == 66) {
            this.field2054 = arg0.method7120();
        } else if (arg1 == 67) {
            this.field2070 = arg0.method7120();
        } else if (arg1 == 68) {
            this.field2065 = arg0.method7120();
        } else if (arg1 == 69) {
            arg0.method6929();
        } else if (arg1 == 70) {
            this.field2050 = arg0.method6932();
        } else if (arg1 == 71) {
            this.field2055 = arg0.method6932();
        } else if (arg1 == 72) {
            this.field2073 = arg0.method6932();
        } else if (arg1 == 73) {
            this.field2036 = true;
        } else if (arg1 == 74) {
            this.field2069 = true;
        } else if (arg1 == 75) {
            this.field2076 = arg0.method6929();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2078 = arg0.method7120();
            if (this.field2078 == 65535) {
                this.field2078 = -1;
            }
            this.field2049 = arg0.method7120();
            if (this.field2049 == 65535) {
                this.field2049 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7120();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6929();
            this.field2077 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2077[var15] = arg0.method7120();
                if (this.field2077[var15] == 65535) {
                    this.field2077[var15] = -1;
                }
            }
            this.field2077[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2080 = arg0.method7120();
            this.field2081 = arg0.method6929();
        } else if (arg1 == 79) {
            this.field2082 = arg0.method7120();
            this.field2083 = arg0.method7120();
            this.field2081 = arg0.method6929();
            int var11 = arg0.method6929();
            this.field2084 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2084[var12] = arg0.method7120();
            }
        } else if (arg1 == 81) {
            this.field2056 = arg0.method6929() * 256;
        } else if (arg1 == 82) {
            this.field2064 = arg0.method7120();
        } else if (arg1 == 89) {
            this.field2086 = false;
        } else if (arg1 == 249) {
            this.field2071 = class175.method1527(arg0, this.field2071);
        }
    }

    @ObfuscatedName("gc.c(II)Z")
    public final boolean method3243(int arg0) {
        if (this.field2045 != null) {
            for (int var4 = 0; var4 < this.field2045.length; var4++) {
                if (this.field2045[var4] == arg0) {
                    return Statics.field2037.method5234(this.field2044[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2044 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2044.length; var3++) {
                var2 &= Statics.field2037.method5234(this.field2044[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gc.q(I)Z")
    public final boolean method3244() {
        if (this.field2044 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2044.length; var2++) {
            var1 &= Statics.field2037.method5234(this.field2044[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gc.i(II[[IIIII)Lgq;")
    public final class205 method3242(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2045 == null) {
            var7 = (long) ((this.field2043 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2043 << 10) + (arg0 << 3) + arg1);
        }
        class205 var9 = (class205) field2040.method4599(var7);
        if (var9 == null) {
            class196 var10 = this.method3248(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2085) {
                var10.field2260 = (short) (this.field2059 + 64);
                var10.field2262 = (short) (this.field2074 + 768);
                var10.method3532();
                var9 = var10;
            } else {
                var9 = var10.method3565(this.field2059 + 64, this.field2074 + 768, -50, -10, -50);
            }
            field2040.method4600(var9, var7);
        }
        if (this.field2085) {
            var9 = ((class196) var9).method3515();
        }
        if (this.field2056 >= 0) {
            if (var9 instanceof class211) {
                var9 = ((class211) var9).method3925(arg2, arg3, arg4, arg5, true, this.field2056);
            } else if (var9 instanceof class196) {
                var9 = ((class196) var9).method3490(arg2, arg3, arg4, arg5, true, this.field2056);
            }
        }
        return var9;
    }

    @ObfuscatedName("gc.k(II[[IIIII)Lhp;")
    public final class211 method3246(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2045 == null) {
            var7 = (long) ((this.field2043 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2043 << 10) + (arg0 << 3) + arg1);
        }
        class211 var9 = (class211) field2041.method4599(var7);
        if (var9 == null) {
            class196 var10 = this.method3248(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3565(this.field2059 + 64, this.field2074 + 768, -50, -10, -50);
            field2041.method4600(var9, var7);
        }
        if (this.field2056 >= 0) {
            var9 = var9.method3925(arg2, arg3, arg4, arg5, true, this.field2056);
        }
        return var9;
    }

    @ObfuscatedName("gc.o(II[[IIIILgh;IB)Lhp;")
    public final class211 method3252(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class190 arg6, int arg7) {
        long var9;
        if (this.field2045 == null) {
            var9 = (long) ((this.field2043 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2043 << 10) + (arg0 << 3) + arg1);
        }
        class211 var11 = (class211) field2041.method4599(var9);
        if (var11 == null) {
            class196 var12 = this.method3248(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3565(this.field2059 + 64, this.field2074 + 768, -50, -10, -50);
            field2041.method4600(var11, var9);
        }
        if (arg6 == null && this.field2056 == -1) {
            return var11;
        }
        class211 var13;
        if (arg6 == null) {
            var13 = var11.method3965(true);
        } else {
            var13 = arg6.method3401(var11, arg7, arg1);
        }
        if (this.field2056 >= 0) {
            var13 = var13.method3925(arg2, arg3, arg4, arg5, false, this.field2056);
        }
        return var13;
    }

    @ObfuscatedName("gc.n(III)Lgp;")
    public final class196 method3248(int arg0, int arg1) {
        class196 var3 = null;
        if (this.field2045 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2044 == null) {
                return null;
            }
            boolean var4 = this.field2057;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2044.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2044[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class196) field2039.method4599((long) var7);
                if (var3 == null) {
                    var3 = class196.method3512(Statics.field2037, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3499();
                    }
                    field2039.method4600(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2042[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class196(field2042, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2045.length; var9++) {
                if (this.field2045[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2044[var8];
            boolean var11 = this.field2057 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class196) field2039.method4599((long) var10);
            if (var3 == null) {
                var3 = class196.method3512(Statics.field2037, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3499();
                }
                field2039.method4600(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2068 == 128 && this.field2054 == 128 && this.field2070 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2050 == 0 && this.field2055 == 0 && this.field2073 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class196 var14 = new class196(var3, arg1 == 0 && !var12 && !var13, this.field2047 == null, this.field2063 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3495(256);
            var14.method3496(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3492();
        } else if (var15 == 2) {
            var14.method3493();
        } else if (var15 == 3) {
            var14.method3482();
        }
        if (this.field2047 != null) {
            for (int var16 = 0; var16 < this.field2047.length; var16++) {
                var14.method3497(this.field2047[var16], this.field2062[var16]);
            }
        }
        if (this.field2063 != null) {
            for (int var17 = 0; var17 < this.field2063.length; var17++) {
                var14.method3500(this.field2063[var17], this.field2061[var17]);
            }
        }
        if (var12) {
            var14.method3509(this.field2068, this.field2054, this.field2070);
        }
        if (var13) {
            var14.method3496(this.field2050, this.field2055, this.field2073);
        }
        return var14;
    }

    @ObfuscatedName("gc.d(I)Lgc;")
    public final class187 method3247() {
        int var1 = -1;
        if (this.field2078 != -1) {
            var1 = Statics.method2652(this.field2078);
        } else if (this.field2049 != -1) {
            var1 = class289.field3313[this.field2049];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2077.length - 1) {
            var2 = this.field2077[var1];
        } else {
            var2 = this.field2077[this.field2077.length - 1];
        }
        return var2 == -1 ? null : method2907(var2);
    }

    @ObfuscatedName("gc.a(IIS)I")
    public int method3250(int arg0, int arg1) {
        return class175.method959(this.field2071, arg0, arg1);
    }

    @ObfuscatedName("gc.m(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3251(int arg0, String arg1) {
        return class175.method2648(this.field2071, arg0, arg1);
    }

    @ObfuscatedName("dx.u(I)V")
    public static void method2502() {
        field2038.method4603();
        field2039.method4603();
        field2040.method4603();
        field2041.method4603();
    }

    @ObfuscatedName("gc.l(I)Z")
    public boolean method3249() {
        if (this.field2077 == null) {
            return this.field2080 != -1 || this.field2084 != null;
        }
        for (int var1 = 0; var1 < this.field2077.length; var1++) {
            if (this.field2077[var1] != -1) {
                class187 var2 = method2907(this.field2077[var1]);
                if (var2.field2080 != -1 || var2.field2084 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
