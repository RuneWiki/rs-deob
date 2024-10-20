package deob;

@ObfuscatedName("gz")
public class class187 extends class428 {

    @ObfuscatedName("gz.q")
    public static class269 field2024 = new class269(64);

    @ObfuscatedName("gz.f")
    public static class269 field2021 = new class269(50);

    @ObfuscatedName("gz.r")
    public int field2026;

    @ObfuscatedName("gz.u")
    public String field2025 = class326.field3819;

    @ObfuscatedName("gz.b")
    public int field2035 = 1;

    @ObfuscatedName("gz.j")
    public int[] field2029;

    @ObfuscatedName("gz.g")
    public int[] field2027;

    @ObfuscatedName("gz.i")
    public int field2028 = -1;

    @ObfuscatedName("gz.o")
    public int field2032 = -1;

    @ObfuscatedName("gz.n")
    public int field2033 = -1;

    @ObfuscatedName("gz.k")
    public int field2034 = -1;

    @ObfuscatedName("gz.a")
    public int field2058 = -1;

    @ObfuscatedName("gz.s")
    public int field2054 = -1;

    @ObfuscatedName("gz.l")
    public int field2037 = -1;

    @ObfuscatedName("gz.t")
    public int field2036 = -1;

    @ObfuscatedName("gz.c")
    public int field2039 = -1;

    @ObfuscatedName("gz.p")
    public int field2040 = -1;

    @ObfuscatedName("gz.d")
    public int field2041 = -1;

    @ObfuscatedName("gz.y")
    public int field2042 = -1;

    @ObfuscatedName("gz.z")
    public int field2043 = -1;

    @ObfuscatedName("gz.w")
    public int field2044 = -1;

    @ObfuscatedName("gz.as")
    public int field2045 = -1;

    @ObfuscatedName("gz.ad")
    public short[] field2046;

    @ObfuscatedName("gz.ao")
    public short[] field2047;

    @ObfuscatedName("gz.am")
    public short[] field2048;

    @ObfuscatedName("gz.av")
    public short[] field2049;

    @ObfuscatedName("gz.au")
    public String[] field2050 = new String[5];

    @ObfuscatedName("gz.ar")
    public boolean field2051 = true;

    @ObfuscatedName("gz.at")
    public int field2052 = -1;

    @ObfuscatedName("gz.ay")
    public int field2061 = 128;

    @ObfuscatedName("gz.an")
    public int field2031 = 128;

    @ObfuscatedName("gz.ab")
    public boolean field2055 = false;

    @ObfuscatedName("gz.al")
    public int field2038 = 0;

    @ObfuscatedName("gz.ag")
    public int field2053 = 0;

    @ObfuscatedName("gz.az")
    public int field2065 = 32;

    @ObfuscatedName("gz.ak")
    public int[] field2059;

    @ObfuscatedName("gz.af")
    public int field2060 = -1;

    @ObfuscatedName("gz.ai")
    public int field2056 = -1;

    @ObfuscatedName("gz.ax")
    public boolean field2062 = true;

    @ObfuscatedName("gz.ah")
    public boolean field2063 = true;

    @ObfuscatedName("gz.aw")
    public boolean field2064 = false;

    @ObfuscatedName("gz.aj")
    public int[] field2066 = null;

    @ObfuscatedName("gz.aq")
    public short[] field2022 = null;

    @ObfuscatedName("gz.ap")
    public class443 field2067;

    @ObfuscatedName("de.h(Lly;Lly;ZII)V")
    public static void method2600(class333 arg0, class333 arg1, boolean arg2, int arg3) {
        Statics.field2030 = arg0;
        Statics.field4362 = arg1;
        Statics.field4276 = arg2;
        Statics.field2023 = arg3;
    }

    @ObfuscatedName("do.e(IB)Lgz;")
    public static class187 method2847(int arg0) {
        class187 var1 = (class187) field2024.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2030.method5909(9, arg0);
        class187 var3 = new class187();
        var3.field2026 = arg0;
        if (var2 != null) {
            var3.method3371(new class467(var2));
        }
        var3.method3317();
        field2024.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.v(B)V")
    public void method3317() {
    }

    @ObfuscatedName("gz.x(Lqy;B)V")
    public void method3371(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3331(arg0, var2);
        }
    }

    @ObfuscatedName("gz.m(Lqy;II)V")
    public void method3331(class467 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7792();
            this.field2029 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2029[var4] = arg0.method7794();
            }
        } else if (arg1 == 2) {
            this.field2025 = arg0.method7801();
        } else if (arg1 == 12) {
            this.field2035 = arg0.method7792();
        } else if (arg1 == 13) {
            this.field2028 = arg0.method7794();
        } else if (arg1 == 14) {
            this.field2034 = arg0.method7794();
        } else if (arg1 == 15) {
            this.field2032 = arg0.method7794();
        } else if (arg1 == 16) {
            this.field2033 = arg0.method7794();
        } else if (arg1 == 17) {
            this.field2034 = arg0.method7794();
            this.field2058 = arg0.method7794();
            this.field2054 = arg0.method7794();
            this.field2037 = arg0.method7794();
        } else if (arg1 == 18) {
            arg0.method7794();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2050[arg1 - 30] = arg0.method7801();
            if (this.field2050[arg1 - 30].equalsIgnoreCase(class326.field3820)) {
                this.field2050[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7792();
            this.field2046 = new short[var5];
            this.field2047 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2046[var6] = (short) arg0.method7794();
                this.field2047[var6] = (short) arg0.method7794();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7792();
            this.field2048 = new short[var7];
            this.field2049 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2048[var8] = (short) arg0.method7794();
                this.field2049[var8] = (short) arg0.method7794();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7792();
            this.field2027 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2027[var10] = arg0.method7794();
            }
        } else if (arg1 == 93) {
            this.field2051 = false;
        } else if (arg1 == 95) {
            this.field2052 = arg0.method7794();
        } else if (arg1 == 97) {
            this.field2061 = arg0.method7794();
        } else if (arg1 == 98) {
            this.field2031 = arg0.method7794();
        } else if (arg1 == 99) {
            this.field2055 = true;
        } else if (arg1 == 100) {
            this.field2038 = arg0.method7793();
        } else if (arg1 == 101) {
            this.field2053 = arg0.method7793();
        } else if (arg1 == 102) {
            if (Statics.field4276) {
                this.field2066 = new int[1];
                this.field2022 = new short[1];
                this.field2066[0] = Statics.field2023;
                this.field2022[0] = (short) arg0.method7794();
            } else {
                int var11 = arg0.method7792();
                int var12 = 0;
                for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                    var12++;
                }
                this.field2066 = new int[var12];
                this.field2022 = new short[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    if ((var11 & 0x1 << var14) == 0) {
                        this.field2066[var14] = -1;
                        this.field2022[var14] = -1;
                    } else {
                        this.field2066[var14] = arg0.method7810();
                        this.field2022[var14] = (short) arg0.method8023();
                    }
                }
            }
        } else if (arg1 == 103) {
            this.field2065 = arg0.method7794();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2060 = arg0.method7794();
            if (this.field2060 == 65535) {
                this.field2060 = -1;
            }
            this.field2056 = arg0.method7794();
            if (this.field2056 == 65535) {
                this.field2056 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method7794();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method7792();
            this.field2059 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2059[var17] = arg0.method7794();
                if (this.field2059[var17] == 65535) {
                    this.field2059[var17] = -1;
                }
            }
            this.field2059[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2062 = false;
        } else if (arg1 == 109) {
            this.field2063 = false;
        } else if (arg1 == 111) {
            this.field2064 = true;
        } else if (arg1 == 114) {
            this.field2036 = arg0.method7794();
        } else if (arg1 == 115) {
            this.field2036 = arg0.method7794();
            this.field2039 = arg0.method7794();
            this.field2040 = arg0.method7794();
            this.field2041 = arg0.method7794();
        } else if (arg1 == 116) {
            this.field2042 = arg0.method7794();
        } else if (arg1 == 117) {
            this.field2042 = arg0.method7794();
            this.field2043 = arg0.method7794();
            this.field2044 = arg0.method7794();
            this.field2045 = arg0.method7794();
        } else if (arg1 == 249) {
            this.field2067 = class183.method2026(arg0, this.field2067);
        }
    }

    @ObfuscatedName("gz.q(Lga;ILga;ILgp;B)Lhh;")
    public final class224 method3378(class199 arg0, int arg1, class199 arg2, int arg3, class186 arg4) {
        if (this.field2059 != null) {
            class187 var6 = this.method3323();
            return var6 == null ? null : var6.method3378(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2026;
        if (arg4 != null) {
            var7 |= arg4.field2019 << 16;
        }
        class224 var9 = (class224) field2021.method4917(var7);
        if (var9 == null) {
            class208 var10 = this.method3324(this.field2029, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3836(this.field2038 + 64, this.field2053 * 5 + 850, -30, -50, -30);
            field2021.method4925(var9, var7);
        }
        class224 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3709(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3668(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4271(true);
        } else {
            var11 = arg2.method3668(var9, arg3);
        }
        if (this.field2061 != 128 || this.field2031 != 128) {
            var11.method4324(this.field2061, this.field2031, this.field2061);
        }
        return var11;
    }

    @ObfuscatedName("gz.f(Lgp;I)Lgi;")
    public final class208 method3321(class186 arg0) {
        if (this.field2059 == null) {
            return this.method3324(this.field2027, arg0);
        } else {
            class187 var2 = this.method3323();
            return var2 == null ? null : var2.method3321(arg0);
        }
    }

    @ObfuscatedName("gz.r([ILgp;I)Lgi;")
    public class208 method3324(int[] arg0, class186 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2014 != null) {
            var3 = arg1.field2014;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field4362.method5901(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class208[] var6 = new class208[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class208.method3813(Statics.field4362, var3[var7], 0);
        }
        class208 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class208(var6, var6.length);
            }
        } else {
            var8 = new class208(var6, var6.length);
        }
        if (this.field2046 != null) {
            short[] var9 = this.field2047;
            if (arg1 != null && arg1.field2016 != null) {
                var9 = arg1.field2016;
            }
            for (int var10 = 0; var10 < this.field2046.length; var10++) {
                var8.method3828(this.field2046[var10], var9[var10]);
            }
        }
        if (this.field2048 != null) {
            short[] var11 = this.field2049;
            if (arg1 != null && arg1.field2017 != null) {
                var11 = arg1.field2017;
            }
            for (int var12 = 0; var12 < this.field2048.length; var12++) {
                var8.method3829(this.field2048[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("gz.u(I)Lgz;")
    public final class187 method3323() {
        int var1 = -1;
        if (this.field2060 != -1) {
            var1 = class296.method3182(this.field2060);
        } else if (this.field2056 != -1) {
            var1 = class296.field3445[this.field2056];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2059.length - 1) {
            var2 = this.field2059[var1];
        } else {
            var2 = this.field2059[this.field2059.length - 1];
        }
        return var2 == -1 ? null : method2847(var2);
    }

    @ObfuscatedName("gz.b(I)Z")
    public boolean method3364() {
        if (this.field2059 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2060 != -1) {
            var1 = class296.method3182(this.field2060);
        } else if (this.field2056 != -1) {
            var1 = class296.field3445[this.field2056];
        }
        if (var1 >= 0 && var1 < this.field2059.length) {
            return this.field2059[var1] != -1;
        } else {
            return this.field2059[this.field2059.length - 1] != -1;
        }
    }

    @ObfuscatedName("gz.j(III)I")
    public int method3325(int arg0, int arg1) {
        return class183.method2676(this.field2067, arg0, arg1);
    }

    @ObfuscatedName("gz.g(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3326(int arg0, String arg1) {
        class443 var3 = this.field2067;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class429 var5 = (class429) var3.method7525((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4680;
            }
        }
        return var4;
    }

    @ObfuscatedName("ny.i(I)V")
    public static void method6515() {
        field2024.method4918();
        field2021.method4918();
    }

    @ObfuscatedName("gz.o(I)Z")
    public boolean method3327() {
        return this.field2066 != null && this.field2022 != null;
    }

    @ObfuscatedName("gz.n(I)[I")
    public int[] method3333() {
        return this.field2066;
    }

    @ObfuscatedName("gz.k(II)I")
    public int method3318(int arg0) {
        return this.field2066 == null || arg0 >= this.field2066.length ? -1 : this.field2066[arg0];
    }

    @ObfuscatedName("gz.a(I)[S")
    public short[] method3370() {
        return this.field2022;
    }

    @ObfuscatedName("gz.s(II)S")
    public short method3328(int arg0) {
        return this.field2022 == null || arg0 >= this.field2022.length ? -1 : this.field2022[arg0];
    }
}
