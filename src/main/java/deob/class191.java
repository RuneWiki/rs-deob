package deob;

@ObfuscatedName("go")
public class class191 extends class435 {

    @ObfuscatedName("go.s")
    public static class273 field2026 = new class273(64);

    @ObfuscatedName("go.z")
    public static class273 field2027 = new class273(50);

    @ObfuscatedName("go.j")
    public int field2028;

    @ObfuscatedName("go.i")
    public String field2029 = class330.field3846;

    @ObfuscatedName("go.n")
    public int field2030 = 1;

    @ObfuscatedName("go.l")
    public int[] field2045;

    @ObfuscatedName("go.k")
    public int[] field2032;

    @ObfuscatedName("go.c")
    public int field2048 = -1;

    @ObfuscatedName("go.r")
    public int field2034 = -1;

    @ObfuscatedName("go.b")
    public int field2035 = -1;

    @ObfuscatedName("go.m")
    public int field2061 = -1;

    @ObfuscatedName("go.t")
    public int field2037 = -1;

    @ObfuscatedName("go.h")
    public int field2038 = -1;

    @ObfuscatedName("go.p")
    public int field2039 = -1;

    @ObfuscatedName("go.o")
    public int field2040 = -1;

    @ObfuscatedName("go.u")
    public int field2041 = -1;

    @ObfuscatedName("go.x")
    public int field2060 = -1;

    @ObfuscatedName("go.a")
    public int field2043 = -1;

    @ObfuscatedName("go.q")
    public int field2044 = -1;

    @ObfuscatedName("go.d")
    public int field2066 = -1;

    @ObfuscatedName("go.e")
    public int field2046 = -1;

    @ObfuscatedName("go.g")
    public int field2058 = -1;

    @ObfuscatedName("go.y")
    public short[] field2047;

    @ObfuscatedName("go.af")
    public short[] field2063;

    @ObfuscatedName("go.aa")
    public short[] field2050;

    @ObfuscatedName("go.ai")
    public short[] field2024;

    @ObfuscatedName("go.ag")
    public String[] field2052 = new String[5];

    @ObfuscatedName("go.aw")
    public boolean field2053 = true;

    @ObfuscatedName("go.ar")
    public int field2033 = -1;

    @ObfuscatedName("go.al")
    public int field2055 = 128;

    @ObfuscatedName("go.at")
    public int field2056 = 128;

    @ObfuscatedName("go.aj")
    public boolean field2054 = false;

    @ObfuscatedName("go.ax")
    public int field2042 = 0;

    @ObfuscatedName("go.az")
    public int field2059 = 0;

    @ObfuscatedName("go.ap")
    public int field2031 = 32;

    @ObfuscatedName("go.ay")
    public int[] field2023;

    @ObfuscatedName("go.ac")
    public int field2062 = -1;

    @ObfuscatedName("go.av")
    public int field2057 = -1;

    @ObfuscatedName("go.aq")
    public boolean field2064 = true;

    @ObfuscatedName("go.ak")
    public boolean field2065 = true;

    @ObfuscatedName("go.au")
    public boolean field2036 = false;

    @ObfuscatedName("go.ae")
    public int[] field2067 = null;

    @ObfuscatedName("go.ah")
    public short[] field2068 = null;

    @ObfuscatedName("go.ad")
    public class450 field2051;

    @ObfuscatedName("iy.f(Lln;Lln;I)V")
    public static void method4909(class337 arg0, class337 arg1) {
        Statics.field2069 = arg0;
        Statics.field2025 = arg1;
    }

    @ObfuscatedName("es.w(IS)Lgo;")
    public static class191 method2988(int arg0) {
        class191 var1 = (class191) field2026.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2069.method5990(9, arg0);
        class191 var3 = new class191();
        var3.field2028 = arg0;
        if (var2 != null) {
            var3.method3429(new class474(var2));
        }
        var3.method3422();
        field2026.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.v(B)V")
    public void method3422() {
    }

    @ObfuscatedName("go.s(Lrd;I)V")
    public void method3429(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3423(arg0, var2);
        }
    }

    @ObfuscatedName("go.z(Lrd;IB)V")
    public void method3423(class474 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7964();
            this.field2045 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2045[var4] = arg0.method8032();
            }
        } else if (arg1 == 2) {
            this.field2029 = arg0.method7983();
        } else if (arg1 == 12) {
            this.field2030 = arg0.method7964();
        } else if (arg1 == 13) {
            this.field2048 = arg0.method8032();
        } else if (arg1 == 14) {
            this.field2061 = arg0.method8032();
        } else if (arg1 == 15) {
            this.field2034 = arg0.method8032();
        } else if (arg1 == 16) {
            this.field2035 = arg0.method8032();
        } else if (arg1 == 17) {
            this.field2061 = arg0.method8032();
            this.field2037 = arg0.method8032();
            this.field2038 = arg0.method8032();
            this.field2039 = arg0.method8032();
        } else if (arg1 == 18) {
            arg0.method8032();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2052[arg1 - 30] = arg0.method7983();
            if (this.field2052[arg1 - 30].equalsIgnoreCase(class330.field3841)) {
                this.field2052[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7964();
            this.field2047 = new short[var5];
            this.field2063 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2047[var6] = (short) arg0.method8032();
                this.field2063[var6] = (short) arg0.method8032();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7964();
            this.field2050 = new short[var7];
            this.field2024 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2050[var8] = (short) arg0.method8032();
                this.field2024[var8] = (short) arg0.method8032();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7964();
            this.field2032 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2032[var10] = arg0.method8032();
            }
        } else if (arg1 == 93) {
            this.field2053 = false;
        } else if (arg1 == 95) {
            this.field2033 = arg0.method8032();
        } else if (arg1 == 97) {
            this.field2055 = arg0.method8032();
        } else if (arg1 == 98) {
            this.field2056 = arg0.method8032();
        } else if (arg1 == 99) {
            this.field2054 = true;
        } else if (arg1 == 100) {
            this.field2042 = arg0.method7965();
        } else if (arg1 == 101) {
            this.field2059 = arg0.method7965() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method7964();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2067 = new int[var12];
            this.field2068 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2067[var14] = -1;
                    this.field2068[var14] = -1;
                } else {
                    this.field2067[var14] = arg0.method8029();
                    this.field2068[var14] = (short) arg0.method7980();
                }
            }
        } else if (arg1 == 103) {
            this.field2031 = arg0.method8032();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2062 = arg0.method8032();
            if (this.field2062 == 65535) {
                this.field2062 = -1;
            }
            this.field2057 = arg0.method8032();
            if (this.field2057 == 65535) {
                this.field2057 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8032();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method7964();
            this.field2023 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2023[var17] = arg0.method8032();
                if (this.field2023[var17] == 65535) {
                    this.field2023[var17] = -1;
                }
            }
            this.field2023[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2064 = false;
        } else if (arg1 == 109) {
            this.field2065 = false;
        } else if (arg1 == 111) {
            this.field2036 = true;
        } else if (arg1 == 114) {
            this.field2040 = arg0.method8032();
        } else if (arg1 == 115) {
            this.field2040 = arg0.method8032();
            this.field2041 = arg0.method8032();
            this.field2060 = arg0.method8032();
            this.field2043 = arg0.method8032();
        } else if (arg1 == 116) {
            this.field2044 = arg0.method8032();
        } else if (arg1 == 117) {
            this.field2044 = arg0.method8032();
            this.field2066 = arg0.method8032();
            this.field2046 = arg0.method8032();
            this.field2058 = arg0.method8032();
        } else if (arg1 == 249) {
            this.field2051 = class187.method2938(arg0, this.field2051);
        }
    }

    @ObfuscatedName("go.j(Lge;ILge;ILgj;I)Lhs;")
    public final class228 method3424(class203 arg0, int arg1, class203 arg2, int arg3, class190 arg4) {
        if (this.field2023 != null) {
            class191 var6 = this.method3427();
            return var6 == null ? null : var6.method3424(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2028;
        if (arg4 != null) {
            var7 |= arg4.field2022 << 16;
        }
        class228 var9 = (class228) field2027.method5028(var7);
        if (var9 == null) {
            class212 var10 = this.method3425(this.field2045, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3888(this.field2042 + 64, this.field2059 + 850, -30, -50, -30);
            field2027.method5027(var9, var7);
        }
        class228 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3767(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3747(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4404(true);
        } else {
            var11 = arg2.method3747(var9, arg3);
        }
        if (this.field2055 != 128 || this.field2056 != 128) {
            var11.method4354(this.field2055, this.field2056, this.field2055);
        }
        return var11;
    }

    @ObfuscatedName("go.i(Lgj;I)Lhe;")
    public final class212 method3451(class190 arg0) {
        if (this.field2023 == null) {
            return this.method3425(this.field2032, arg0);
        } else {
            class191 var2 = this.method3427();
            return var2 == null ? null : var2.method3451(arg0);
        }
    }

    @ObfuscatedName("go.n([ILgj;I)Lhe;")
    public class212 method3425(int[] arg0, class190 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2019 != null) {
            var3 = arg1.field2019;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field2025.method5983(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class212[] var6 = new class212[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class212.method3915(Statics.field2025, var3[var7], 0);
        }
        class212 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class212(var6, var6.length);
            }
        } else {
            var8 = new class212(var6, var6.length);
        }
        if (this.field2047 != null) {
            short[] var9 = this.field2063;
            if (arg1 != null && arg1.field2020 != null) {
                var9 = arg1.field2020;
            }
            for (int var10 = 0; var10 < this.field2047.length; var10++) {
                var8.method3902(this.field2047[var10], var9[var10]);
            }
        }
        if (this.field2050 != null) {
            short[] var11 = this.field2024;
            if (arg1 != null && arg1.field2021 != null) {
                var11 = arg1.field2021;
            }
            for (int var12 = 0; var12 < this.field2050.length; var12++) {
                var8.method3943(this.field2050[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("go.l(I)Lgo;")
    public final class191 method3427() {
        int var1 = -1;
        if (this.field2062 != -1) {
            var1 = class300.method2093(this.field2062);
        } else if (this.field2057 != -1) {
            var1 = class300.field3459[this.field2057];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2023.length - 1) {
            var2 = this.field2023[var1];
        } else {
            var2 = this.field2023[this.field2023.length - 1];
        }
        return var2 == -1 ? null : method2988(var2);
    }

    @ObfuscatedName("go.k(I)Z")
    public boolean method3428() {
        if (this.field2023 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2062 != -1) {
            var1 = class300.method2093(this.field2062);
        } else if (this.field2057 != -1) {
            var1 = class300.field3459[this.field2057];
        }
        if (var1 >= 0 && var1 < this.field2023.length) {
            return this.field2023[var1] != -1;
        } else {
            return this.field2023[this.field2023.length - 1] != -1;
        }
    }

    @ObfuscatedName("go.c(III)I")
    public int method3432(int arg0, int arg1) {
        class450 var3 = this.field2051;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class439 var5 = (class439) var3.method7691((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4708;
            }
        }
        return var4;
    }

    @ObfuscatedName("go.r(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3430(int arg0, String arg1) {
        return class187.method3012(this.field2051, arg0, arg1);
    }

    @ObfuscatedName("fq.b(B)V")
    public static void method3233() {
        field2026.method5033();
        field2027.method5033();
    }

    @ObfuscatedName("go.m(I)Z")
    public boolean method3431() {
        return this.field2067 != null && this.field2068 != null;
    }

    @ObfuscatedName("go.t(I)[I")
    public int[] method3458() {
        return this.field2067;
    }

    @ObfuscatedName("go.h(II)I")
    public int method3452(int arg0) {
        return this.field2067 == null || arg0 >= this.field2067.length ? -1 : this.field2067[arg0];
    }

    @ObfuscatedName("go.p(B)[S")
    public short[] method3450() {
        return this.field2068;
    }

    @ObfuscatedName("go.o(II)S")
    public short method3435(int arg0) {
        return this.field2068 == null || arg0 >= this.field2068.length ? -1 : this.field2068[arg0];
    }
}
