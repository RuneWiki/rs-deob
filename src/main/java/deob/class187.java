package deob;

@ObfuscatedName("gk")
public class class187 extends class405 {

    @ObfuscatedName("gk.c")
    public static boolean field2074 = false;

    @ObfuscatedName("gk.f")
    public static class256 field2088 = new class256(4096);

    @ObfuscatedName("gk.j")
    public static class256 field2075 = new class256(500);

    @ObfuscatedName("gk.e")
    public static class256 field2069 = new class256(30);

    @ObfuscatedName("gk.g")
    public static class256 field2077 = new class256(30);

    @ObfuscatedName("gk.w")
    public static class196[] field2047 = new class196[4];

    @ObfuscatedName("gk.y")
    public int field2048;

    @ObfuscatedName("gk.i")
    public int[] field2049;

    @ObfuscatedName("gk.s")
    public int[] field2050;

    @ObfuscatedName("gk.t")
    public String field2051 = class308.field3624;

    @ObfuscatedName("gk.z")
    public short[] field2045;

    @ObfuscatedName("gk.r")
    public short[] field2053;

    @ObfuscatedName("gk.u")
    public short[] field2054;

    @ObfuscatedName("gk.k")
    public short[] field2055;

    @ObfuscatedName("gk.h")
    public int field2046 = 1;

    @ObfuscatedName("gk.x")
    public int field2057 = 1;

    @ObfuscatedName("gk.l")
    public int field2058 = 2;

    @ObfuscatedName("gk.a")
    public boolean field2044 = true;

    @ObfuscatedName("gk.p")
    public int field2060 = -1;

    @ObfuscatedName("gk.b")
    public int field2061 = -1;

    @ObfuscatedName("gk.n")
    public boolean field2062 = false;

    @ObfuscatedName("gk.o")
    public boolean field2063 = false;

    @ObfuscatedName("gk.m")
    public int field2064 = -1;

    @ObfuscatedName("gk.d")
    public int field2070 = 16;

    @ObfuscatedName("gk.ad")
    public int field2066 = 0;

    @ObfuscatedName("gk.ak")
    public int field2067 = 0;

    @ObfuscatedName("gk.al")
    public String[] field2068 = new String[5];

    @ObfuscatedName("gk.ao")
    public int field2089 = -1;

    @ObfuscatedName("gk.ab")
    public int field2090 = -1;

    @ObfuscatedName("gk.ap")
    public boolean field2071 = false;

    @ObfuscatedName("gk.ac")
    public boolean field2072 = true;

    @ObfuscatedName("gk.ae")
    public int field2073 = 128;

    @ObfuscatedName("gk.aj")
    public int field2043 = 128;

    @ObfuscatedName("gk.am")
    public int field2080 = 128;

    @ObfuscatedName("gk.an")
    public int field2076 = 0;

    @ObfuscatedName("gk.af")
    public int field2081 = 0;

    @ObfuscatedName("gk.ax")
    public int field2078 = 0;

    @ObfuscatedName("gk.ar")
    public boolean field2079 = false;

    @ObfuscatedName("gk.at")
    public boolean field2052 = false;

    @ObfuscatedName("gk.ag")
    public int field2059 = -1;

    @ObfuscatedName("gk.aq")
    public int[] field2082;

    @ObfuscatedName("gk.ah")
    public int field2083 = -1;

    @ObfuscatedName("gk.ai")
    public int field2056 = -1;

    @ObfuscatedName("gk.az")
    public int field2085 = -1;

    @ObfuscatedName("gk.av")
    public int field2086 = 0;

    @ObfuscatedName("gk.aw")
    public int field2065 = 0;

    @ObfuscatedName("gk.au")
    public int field2087 = 0;

    @ObfuscatedName("gk.aa")
    public int[] field2084;

    @ObfuscatedName("gk.ay")
    public boolean field2092 = true;

    @ObfuscatedName("gk.as")
    public class419 field2091;

    @ObfuscatedName("cs.c(Llh;Llh;ZI)V")
    public static void method2396(class315 arg0, class315 arg1, boolean arg2) {
        Statics.field4085 = arg0;
        Statics.field2042 = arg1;
        field2074 = arg2;
    }

    @ObfuscatedName("fl.v(II)Lgk;")
    public static class187 method3000(int arg0) {
        class187 var1 = (class187) field2088.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4085.method5305(6, arg0);
        class187 var3 = new class187();
        var3.field2048 = arg0;
        if (var2 != null) {
            var3.method3329(new class443(var2));
        }
        var3.method3330();
        if (var3.field2052) {
            var3.field2058 = 0;
            var3.field2044 = false;
        }
        field2088.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.q(B)V")
    public void method3330() {
        if (this.field2060 == -1) {
            this.field2060 = 0;
            if (this.field2049 != null && (this.field2050 == null || this.field2050[0] == 10)) {
                this.field2060 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2068[var1] != null) {
                    this.field2060 = 1;
                }
            }
        }
        if (this.field2059 == -1) {
            this.field2059 = this.field2058 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gk.f(Lqt;B)V")
    public void method3329(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3339(arg0, var2);
        }
    }

    @ObfuscatedName("gk.j(Lqt;II)V")
    public void method3339(class443 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7047();
            if (var3 > 0) {
                if (this.field2049 == null || field2074) {
                    this.field2050 = new int[var3];
                    this.field2049 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2049[var4] = arg0.method7049();
                        this.field2050[var4] = arg0.method7047();
                    }
                } else {
                    arg0.field4700 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2051 = arg0.method7057();
        } else if (arg1 == 5) {
            int var5 = arg0.method7047();
            if (var5 > 0) {
                if (this.field2049 == null || field2074) {
                    this.field2050 = null;
                    this.field2049 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2049[var6] = arg0.method7049();
                    }
                } else {
                    arg0.field4700 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2046 = arg0.method7047();
        } else if (arg1 == 15) {
            this.field2057 = arg0.method7047();
        } else if (arg1 == 17) {
            this.field2058 = 0;
            this.field2044 = false;
        } else if (arg1 == 18) {
            this.field2044 = false;
        } else if (arg1 == 19) {
            this.field2060 = arg0.method7047();
        } else if (arg1 == 21) {
            this.field2061 = 0;
        } else if (arg1 == 22) {
            this.field2062 = true;
        } else if (arg1 == 23) {
            this.field2063 = true;
        } else if (arg1 == 24) {
            this.field2064 = arg0.method7049();
            if (this.field2064 == 65535) {
                this.field2064 = -1;
            }
        } else if (arg1 == 27) {
            this.field2058 = 1;
        } else if (arg1 == 28) {
            this.field2070 = arg0.method7047();
        } else if (arg1 == 29) {
            this.field2066 = arg0.method7048();
        } else if (arg1 == 39) {
            this.field2067 = arg0.method7048() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2068[arg1 - 30] = arg0.method7057();
            if (this.field2068[arg1 - 30].equalsIgnoreCase(class308.field3619)) {
                this.field2068[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7047();
            this.field2045 = new short[var7];
            this.field2053 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2045[var8] = (short) arg0.method7049();
                this.field2053[var8] = (short) arg0.method7049();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7047();
            this.field2054 = new short[var9];
            this.field2055 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2054[var10] = (short) arg0.method7049();
                this.field2055[var10] = (short) arg0.method7049();
            }
        } else if (arg1 == 61) {
            arg0.method7049();
        } else if (arg1 == 62) {
            this.field2071 = true;
        } else if (arg1 == 64) {
            this.field2072 = false;
        } else if (arg1 == 65) {
            this.field2073 = arg0.method7049();
        } else if (arg1 == 66) {
            this.field2043 = arg0.method7049();
        } else if (arg1 == 67) {
            this.field2080 = arg0.method7049();
        } else if (arg1 == 68) {
            this.field2090 = arg0.method7049();
        } else if (arg1 == 69) {
            arg0.method7047();
        } else if (arg1 == 70) {
            this.field2076 = arg0.method7216();
        } else if (arg1 == 71) {
            this.field2081 = arg0.method7216();
        } else if (arg1 == 72) {
            this.field2078 = arg0.method7216();
        } else if (arg1 == 73) {
            this.field2079 = true;
        } else if (arg1 == 74) {
            this.field2052 = true;
        } else if (arg1 == 75) {
            this.field2059 = arg0.method7047();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2083 = arg0.method7049();
            if (this.field2083 == 65535) {
                this.field2083 = -1;
            }
            this.field2056 = arg0.method7049();
            if (this.field2056 == 65535) {
                this.field2056 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7049();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7047();
            this.field2082 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2082[var15] = arg0.method7049();
                if (this.field2082[var15] == 65535) {
                    this.field2082[var15] = -1;
                }
            }
            this.field2082[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2085 = arg0.method7049();
            this.field2086 = arg0.method7047();
        } else if (arg1 == 79) {
            this.field2065 = arg0.method7049();
            this.field2087 = arg0.method7049();
            this.field2086 = arg0.method7047();
            int var11 = arg0.method7047();
            this.field2084 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2084[var12] = arg0.method7049();
            }
        } else if (arg1 == 81) {
            this.field2061 = arg0.method7047() * 256;
        } else if (arg1 == 82) {
            this.field2089 = arg0.method7049();
        } else if (arg1 == 89) {
            this.field2092 = false;
        } else if (arg1 == 249) {
            this.field2091 = class175.method2132(arg0, this.field2091);
        }
    }

    @ObfuscatedName("gk.e(IB)Z")
    public final boolean method3333(int arg0) {
        if (this.field2050 != null) {
            for (int var4 = 0; var4 < this.field2050.length; var4++) {
                if (this.field2050[var4] == arg0) {
                    return Statics.field2042.method5302(this.field2049[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2049 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2049.length; var3++) {
                var2 &= Statics.field2042.method5302(this.field2049[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gk.g(I)Z")
    public final boolean method3334() {
        if (this.field2049 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2049.length; var2++) {
            var1 &= Statics.field2042.method5302(this.field2049[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gk.w(II[[IIIII)Lgj;")
    public final class205 method3335(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2050 == null) {
            var7 = (long) ((this.field2048 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2048 << 10) + (arg0 << 3) + arg1);
        }
        class205 var9 = (class205) field2069.method4691(var7);
        if (var9 == null) {
            class196 var10 = this.method3372(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2062) {
                var10.field2268 = (short) (this.field2066 + 64);
                var10.field2269 = (short) (this.field2067 + 768);
                var10.method3610();
                var9 = var10;
            } else {
                var9 = var10.method3658(this.field2066 + 64, this.field2067 + 768, -50, -10, -50);
            }
            field2069.method4693(var9, var7);
        }
        if (this.field2062) {
            var9 = ((class196) var9).method3598();
        }
        if (this.field2061 >= 0) {
            if (var9 instanceof class211) {
                var9 = ((class211) var9).method4051(arg2, arg3, arg4, arg5, true, this.field2061);
            } else if (var9 instanceof class196) {
                var9 = ((class196) var9).method3590(arg2, arg3, arg4, arg5, true, this.field2061);
            }
        }
        return var9;
    }

    @ObfuscatedName("gk.y(II[[IIIII)Lhy;")
    public final class211 method3336(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2050 == null) {
            var7 = (long) ((this.field2048 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2048 << 10) + (arg0 << 3) + arg1);
        }
        class211 var9 = (class211) field2077.method4691(var7);
        if (var9 == null) {
            class196 var10 = this.method3372(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3658(this.field2066 + 64, this.field2067 + 768, -50, -10, -50);
            field2077.method4693(var9, var7);
        }
        if (this.field2061 >= 0) {
            var9 = var9.method4051(arg2, arg3, arg4, arg5, true, this.field2061);
        }
        return var9;
    }

    @ObfuscatedName("gk.i(II[[IIIILgc;II)Lhy;")
    public final class211 method3337(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class190 arg6, int arg7) {
        long var9;
        if (this.field2050 == null) {
            var9 = (long) ((this.field2048 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2048 << 10) + (arg0 << 3) + arg1);
        }
        class211 var11 = (class211) field2077.method4691(var9);
        if (var11 == null) {
            class196 var12 = this.method3372(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3658(this.field2066 + 64, this.field2067 + 768, -50, -10, -50);
            field2077.method4693(var11, var9);
        }
        if (arg6 == null && this.field2061 == -1) {
            return var11;
        }
        class211 var13;
        if (arg6 == null) {
            var13 = var11.method4074(true);
        } else {
            var13 = arg6.method3504(var11, arg7, arg1);
        }
        if (this.field2061 >= 0) {
            var13 = var13.method4051(arg2, arg3, arg4, arg5, false, this.field2061);
        }
        return var13;
    }

    @ObfuscatedName("gk.s(III)Lgw;")
    public final class196 method3372(int arg0, int arg1) {
        class196 var3 = null;
        if (this.field2050 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2049 == null) {
                return null;
            }
            boolean var4 = this.field2071;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2049.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2049[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class196) field2075.method4691((long) var7);
                if (var3 == null) {
                    var3 = class196.method3646(Statics.field2042, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3642();
                    }
                    field2075.method4693(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2047[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class196(field2047, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2050.length; var9++) {
                if (this.field2050[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2049[var8];
            boolean var11 = this.field2071 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class196) field2075.method4691((long) var10);
            if (var3 == null) {
                var3 = class196.method3646(Statics.field2042, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3642();
                }
                field2075.method4693(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2073 == 128 && this.field2043 == 128 && this.field2080 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2076 == 0 && this.field2081 == 0 && this.field2078 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class196 var14 = new class196(var3, arg1 == 0 && !var12 && !var13, this.field2045 == null, this.field2054 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3604(256);
            var14.method3605(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3601();
        } else if (var15 == 2) {
            var14.method3602();
        } else if (var15 == 3) {
            var14.method3611();
        }
        if (this.field2045 != null) {
            for (int var16 = 0; var16 < this.field2045.length; var16++) {
                var14.method3606(this.field2045[var16], this.field2053[var16]);
            }
        }
        if (this.field2054 != null) {
            for (int var17 = 0; var17 < this.field2054.length; var17++) {
                var14.method3626(this.field2054[var17], this.field2055[var17]);
            }
        }
        if (var12) {
            var14.method3600(this.field2073, this.field2043, this.field2080);
        }
        if (var13) {
            var14.method3605(this.field2076, this.field2081, this.field2078);
        }
        return var14;
    }

    @ObfuscatedName("gk.t(I)Lgk;")
    public final class187 method3361() {
        int var1 = -1;
        if (this.field2083 != -1) {
            var1 = class288.method6395(this.field2083);
        } else if (this.field2056 != -1) {
            var1 = class288.field3326[this.field2056];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2082.length - 1) {
            var2 = this.field2082[var1];
        } else {
            var2 = this.field2082[this.field2082.length - 1];
        }
        return var2 == -1 ? null : method3000(var2);
    }

    @ObfuscatedName("gk.z(IIB)I")
    public int method3340(int arg0, int arg1) {
        return class175.method2678(this.field2091, arg0, arg1);
    }

    @ObfuscatedName("gk.r(ILjava/lang/String;S)Ljava/lang/String;")
    public String method3341(int arg0, String arg1) {
        class419 var3 = this.field2091;
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

    @ObfuscatedName("ec.u(I)V")
    public static void method2821() {
        field2088.method4695();
        field2075.method4695();
        field2069.method4695();
        field2077.method4695();
    }

    @ObfuscatedName("gk.k(I)Z")
    public boolean method3342() {
        if (this.field2082 == null) {
            return this.field2085 != -1 || this.field2084 != null;
        }
        for (int var1 = 0; var1 < this.field2082.length; var1++) {
            if (this.field2082[var1] != -1) {
                class187 var2 = method3000(this.field2082[var1]);
                if (var2.field2085 != -1 || var2.field2084 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
