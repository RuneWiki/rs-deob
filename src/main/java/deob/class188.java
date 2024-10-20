package deob;

@ObfuscatedName("gj")
public class class188 extends class404 {

    @ObfuscatedName("gj.v")
    public static boolean field2038 = false;

    @ObfuscatedName("gj.f")
    public static class257 field2056 = new class257(4096);

    @ObfuscatedName("gj.b")
    public static class257 field2018 = new class257(500);

    @ObfuscatedName("gj.n")
    public static class257 field2029 = new class257(30);

    @ObfuscatedName("gj.s")
    public static class257 field2032 = new class257(30);

    @ObfuscatedName("gj.l")
    public static class226[] field2021 = new class226[4];

    @ObfuscatedName("gj.q")
    public int field2022;

    @ObfuscatedName("gj.o")
    public int[] field2023;

    @ObfuscatedName("gj.r")
    public int[] field2024;

    @ObfuscatedName("gj.p")
    public String field2025 = class309.field3599;

    @ObfuscatedName("gj.w")
    public short[] field2026;

    @ObfuscatedName("gj.k")
    public short[] field2027;

    @ObfuscatedName("gj.d")
    public short[] field2015;

    @ObfuscatedName("gj.m")
    public short[] field2047;

    @ObfuscatedName("gj.u")
    public int field2031 = 1;

    @ObfuscatedName("gj.t")
    public int field2057 = 1;

    @ObfuscatedName("gj.g")
    public int field2016 = 2;

    @ObfuscatedName("gj.x")
    public boolean field2028 = true;

    @ObfuscatedName("gj.a")
    public int field2034 = -1;

    @ObfuscatedName("gj.y")
    public int field2035 = -1;

    @ObfuscatedName("gj.j")
    public boolean field2030 = false;

    @ObfuscatedName("gj.e")
    public boolean field2037 = false;

    @ObfuscatedName("gj.z")
    public int field2061 = -1;

    @ObfuscatedName("gj.h")
    public int field2039 = 16;

    @ObfuscatedName("gj.ae")
    public int field2040 = 0;

    @ObfuscatedName("gj.aq")
    public int field2041 = 0;

    @ObfuscatedName("gj.aw")
    public String[] field2042 = new String[5];

    @ObfuscatedName("gj.am")
    public int field2043 = -1;

    @ObfuscatedName("gj.ak")
    public int field2044 = -1;

    @ObfuscatedName("gj.ao")
    public boolean field2036 = false;

    @ObfuscatedName("gj.aj")
    public boolean field2046 = true;

    @ObfuscatedName("gj.al")
    public int field2054 = 128;

    @ObfuscatedName("gj.av")
    public int field2048 = 128;

    @ObfuscatedName("gj.at")
    public int field2049 = 128;

    @ObfuscatedName("gj.an")
    public int field2052 = 0;

    @ObfuscatedName("gj.ay")
    public int field2051 = 0;

    @ObfuscatedName("gj.ag")
    public int field2033 = 0;

    @ObfuscatedName("gj.ah")
    public boolean field2053 = false;

    @ObfuscatedName("gj.ac")
    public boolean field2017 = false;

    @ObfuscatedName("gj.ab")
    public int field2055 = -1;

    @ObfuscatedName("gj.au")
    public int[] field2062;

    @ObfuscatedName("gj.af")
    public int field2050 = -1;

    @ObfuscatedName("gj.ad")
    public int field2019 = -1;

    @ObfuscatedName("gj.ai")
    public int field2059 = -1;

    @ObfuscatedName("gj.ax")
    public int field2060 = 0;

    @ObfuscatedName("gj.ar")
    public int field2020 = 0;

    @ObfuscatedName("gj.ap")
    public int field2058 = 0;

    @ObfuscatedName("gj.az")
    public int[] field2063;

    @ObfuscatedName("gj.as")
    public boolean field2064 = true;

    @ObfuscatedName("gj.aa")
    public class418 field2065;

    @ObfuscatedName("et.v(IB)Lgj;")
    public static class188 method2828(int arg0) {
        class188 var1 = (class188) field2056.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2199.method5296(6, arg0);
        class188 var3 = new class188();
        var3.field2022 = arg0;
        if (var2 != null) {
            var3.method3325(new class438(var2));
        }
        var3.method3367();
        if (var3.field2017) {
            var3.field2016 = 0;
            var3.field2028 = false;
        }
        field2056.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.c(B)V")
    public void method3367() {
        if (this.field2034 == -1) {
            this.field2034 = 0;
            if (this.field2023 != null && (this.field2024 == null || this.field2024[0] == 10)) {
                this.field2034 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2042[var1] != null) {
                    this.field2034 = 1;
                }
            }
        }
        if (this.field2055 == -1) {
            this.field2055 = this.field2016 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gj.i(Lpi;I)V")
    public void method3325(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3326(arg0, var2);
        }
    }

    @ObfuscatedName("gj.f(Lpi;II)V")
    public void method3326(class438 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6971();
            if (var3 > 0) {
                if (this.field2023 == null || field2038) {
                    this.field2024 = new int[var3];
                    this.field2023 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2023[var4] = arg0.method7148();
                        this.field2024[var4] = arg0.method6971();
                    }
                } else {
                    arg0.field4621 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2025 = arg0.method6981();
        } else if (arg1 == 5) {
            int var5 = arg0.method6971();
            if (var5 > 0) {
                if (this.field2023 == null || field2038) {
                    this.field2024 = null;
                    this.field2023 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2023[var6] = arg0.method7148();
                    }
                } else {
                    arg0.field4621 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2031 = arg0.method6971();
        } else if (arg1 == 15) {
            this.field2057 = arg0.method6971();
        } else if (arg1 == 17) {
            this.field2016 = 0;
            this.field2028 = false;
        } else if (arg1 == 18) {
            this.field2028 = false;
        } else if (arg1 == 19) {
            this.field2034 = arg0.method6971();
        } else if (arg1 == 21) {
            this.field2035 = 0;
        } else if (arg1 == 22) {
            this.field2030 = true;
        } else if (arg1 == 23) {
            this.field2037 = true;
        } else if (arg1 == 24) {
            this.field2061 = arg0.method7148();
            if (this.field2061 == 65535) {
                this.field2061 = -1;
            }
        } else if (arg1 == 27) {
            this.field2016 = 1;
        } else if (arg1 == 28) {
            this.field2039 = arg0.method6971();
        } else if (arg1 == 29) {
            this.field2040 = arg0.method7093();
        } else if (arg1 == 39) {
            this.field2041 = arg0.method7093() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2042[arg1 - 30] = arg0.method6981();
            if (this.field2042[arg1 - 30].equalsIgnoreCase(class309.field3594)) {
                this.field2042[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6971();
            this.field2026 = new short[var7];
            this.field2027 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2026[var8] = (short) arg0.method7148();
                this.field2027[var8] = (short) arg0.method7148();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6971();
            this.field2015 = new short[var9];
            this.field2047 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2015[var10] = (short) arg0.method7148();
                this.field2047[var10] = (short) arg0.method7148();
            }
        } else if (arg1 == 61) {
            arg0.method7148();
        } else if (arg1 == 62) {
            this.field2036 = true;
        } else if (arg1 == 64) {
            this.field2046 = false;
        } else if (arg1 == 65) {
            this.field2054 = arg0.method7148();
        } else if (arg1 == 66) {
            this.field2048 = arg0.method7148();
        } else if (arg1 == 67) {
            this.field2049 = arg0.method7148();
        } else if (arg1 == 68) {
            this.field2044 = arg0.method7148();
        } else if (arg1 == 69) {
            arg0.method6971();
        } else if (arg1 == 70) {
            this.field2052 = arg0.method6974();
        } else if (arg1 == 71) {
            this.field2051 = arg0.method6974();
        } else if (arg1 == 72) {
            this.field2033 = arg0.method6974();
        } else if (arg1 == 73) {
            this.field2053 = true;
        } else if (arg1 == 74) {
            this.field2017 = true;
        } else if (arg1 == 75) {
            this.field2055 = arg0.method6971();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2050 = arg0.method7148();
            if (this.field2050 == 65535) {
                this.field2050 = -1;
            }
            this.field2019 = arg0.method7148();
            if (this.field2019 == 65535) {
                this.field2019 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7148();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6971();
            this.field2062 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2062[var15] = arg0.method7148();
                if (this.field2062[var15] == 65535) {
                    this.field2062[var15] = -1;
                }
            }
            this.field2062[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2059 = arg0.method7148();
            this.field2060 = arg0.method6971();
        } else if (arg1 == 79) {
            this.field2020 = arg0.method7148();
            this.field2058 = arg0.method7148();
            this.field2060 = arg0.method6971();
            int var11 = arg0.method6971();
            this.field2063 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2063[var12] = arg0.method7148();
            }
        } else if (arg1 == 81) {
            this.field2035 = arg0.method6971() * 256;
        } else if (arg1 == 82) {
            this.field2043 = arg0.method7148();
        } else if (arg1 == 89) {
            this.field2064 = false;
        } else if (arg1 == 249) {
            this.field2065 = class176.method3942(arg0, this.field2065);
        }
    }

    @ObfuscatedName("gj.b(II)Z")
    public final boolean method3327(int arg0) {
        if (this.field2024 != null) {
            for (int var4 = 0; var4 < this.field2024.length; var4++) {
                if (this.field2024[var4] == arg0) {
                    return Statics.field2045.method5359(this.field2023[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2023 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2023.length; var3++) {
                var2 &= Statics.field2045.method5359(this.field2023[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.n(I)Z")
    public final boolean method3334() {
        if (this.field2023 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2023.length; var2++) {
            var1 &= Statics.field2045.method5359(this.field2023[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gj.s(II[[IIIIB)Lix;")
    public final class235 method3329(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2024 == null) {
            var7 = (long) ((this.field2022 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2022 << 10) + (arg0 << 3) + arg1);
        }
        class235 var9 = (class235) field2029.method4644(var7);
        if (var9 == null) {
            class226 var10 = this.method3328(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2030) {
                var10.field2478 = (short) (this.field2040 + 64);
                var10.field2479 = (short) (this.field2041 + 768);
                var10.method4050();
                var9 = var10;
            } else {
                var9 = var10.method4054(this.field2040 + 64, this.field2041 + 768, -50, -10, -50);
            }
            field2029.method4651(var9, var7);
        }
        if (this.field2030) {
            var9 = ((class226) var9).method4038();
        }
        if (this.field2035 >= 0) {
            if (var9 instanceof class241) {
                var9 = ((class241) var9).method4495(arg2, arg3, arg4, arg5, true, this.field2035);
            } else if (var9 instanceof class226) {
                var9 = ((class226) var9).method4039(arg2, arg3, arg4, arg5, true, this.field2035);
            }
        }
        return var9;
    }

    @ObfuscatedName("gj.l(II[[IIIII)Liq;")
    public final class241 method3330(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2024 == null) {
            var7 = (long) ((this.field2022 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2022 << 10) + (arg0 << 3) + arg1);
        }
        class241 var9 = (class241) field2032.method4644(var7);
        if (var9 == null) {
            class226 var10 = this.method3328(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4054(this.field2040 + 64, this.field2041 + 768, -50, -10, -50);
            field2032.method4651(var9, var7);
        }
        if (this.field2035 >= 0) {
            var9 = var9.method4495(arg2, arg3, arg4, arg5, true, this.field2035);
        }
        return var9;
    }

    @ObfuscatedName("gj.q(II[[IIIILgw;II)Liq;")
    public final class241 method3331(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class191 arg6, int arg7) {
        long var9;
        if (this.field2024 == null) {
            var9 = (long) ((this.field2022 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2022 << 10) + (arg0 << 3) + arg1);
        }
        class241 var11 = (class241) field2032.method4644(var9);
        if (var11 == null) {
            class226 var12 = this.method3328(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4054(this.field2040 + 64, this.field2041 + 768, -50, -10, -50);
            field2032.method4651(var11, var9);
        }
        if (arg6 == null && this.field2035 == -1) {
            return var11;
        }
        class241 var13;
        if (arg6 == null) {
            var13 = var11.method4485(true);
        } else {
            var13 = arg6.method3457(var11, arg7, arg1);
        }
        if (this.field2035 >= 0) {
            var13 = var13.method4495(arg2, arg3, arg4, arg5, false, this.field2035);
        }
        return var13;
    }

    @ObfuscatedName("gj.o(III)Lhc;")
    public final class226 method3328(int arg0, int arg1) {
        class226 var3 = null;
        if (this.field2024 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2023 == null) {
                return null;
            }
            boolean var4 = this.field2036;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2023.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2023[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class226) field2018.method4644((long) var7);
                if (var3 == null) {
                    var3 = class226.method4089(Statics.field2045, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4048();
                    }
                    field2018.method4651(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2021[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class226(field2021, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2024.length; var9++) {
                if (this.field2024[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2023[var8];
            boolean var11 = this.field2036 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class226) field2018.method4644((long) var10);
            if (var3 == null) {
                var3 = class226.method4089(Statics.field2045, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4048();
                }
                field2018.method4651(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2054 == 128 && this.field2048 == 128 && this.field2049 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2052 == 0 && this.field2051 == 0 && this.field2033 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class226 var14 = new class226(var3, arg1 == 0 && !var12 && !var13, this.field2026 == null, this.field2015 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4034(256);
            var14.method4045(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4075();
        } else if (var15 == 2) {
            var14.method4042();
        } else if (var15 == 3) {
            var14.method4043();
        }
        if (this.field2026 != null) {
            for (int var16 = 0; var16 < this.field2026.length; var16++) {
                var14.method4046(this.field2026[var16], this.field2027[var16]);
            }
        }
        if (this.field2015 != null) {
            for (int var17 = 0; var17 < this.field2015.length; var17++) {
                var14.method4047(this.field2015[var17], this.field2047[var17]);
            }
        }
        if (var12) {
            var14.method4080(this.field2054, this.field2048, this.field2049);
        }
        if (var13) {
            var14.method4045(this.field2052, this.field2051, this.field2033);
        }
        return var14;
    }

    @ObfuscatedName("gj.r(B)Lgj;")
    public final class188 method3333() {
        int var1 = -1;
        if (this.field2050 != -1) {
            var1 = class289.method1960(this.field2050);
        } else if (this.field2019 != -1) {
            var1 = class289.field3284[this.field2019];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2062.length - 1) {
            var2 = this.field2062[var1];
        } else {
            var2 = this.field2062[this.field2062.length - 1];
        }
        return var2 == -1 ? null : method2828(var2);
    }

    @ObfuscatedName("gj.p(IIB)I")
    public int method3323(int arg0, int arg1) {
        class418 var3 = this.field2065;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4409;
            }
        }
        return var4;
    }

    @ObfuscatedName("gj.w(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3335(int arg0, String arg1) {
        class418 var3 = this.field2065;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class405 var5 = (class405) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4406;
            }
        }
        return var4;
    }

    @ObfuscatedName("fv.k(B)V")
    public static void method3135() {
        field2056.method4647();
        field2018.method4647();
        field2029.method4647();
        field2032.method4647();
    }

    @ObfuscatedName("gj.d(B)Z")
    public boolean method3336() {
        if (this.field2062 == null) {
            return this.field2059 != -1 || this.field2063 != null;
        }
        for (int var1 = 0; var1 < this.field2062.length; var1++) {
            if (this.field2062[var1] != -1) {
                class188 var2 = method2828(this.field2062[var1]);
                if (var2.field2059 != -1 || var2.field2063 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
