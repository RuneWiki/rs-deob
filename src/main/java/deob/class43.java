package deob;

@ObfuscatedName("ai")
public class class43 extends class208 {

    @ObfuscatedName("ai.k")
    public static boolean field967 = false;

    @ObfuscatedName("ai.c")
    public static class197 field938 = new class197(64);

    @ObfuscatedName("ai.v")
    public static class197 field939 = new class197(500);

    @ObfuscatedName("ai.j")
    public static class197 field958 = new class197(30);

    @ObfuscatedName("ai.m")
    public static class197 field985 = new class197(30);

    @ObfuscatedName("ai.y")
    public static class104[] field942 = new class104[4];

    @ObfuscatedName("ai.u")
    public int field976;

    @ObfuscatedName("ai.h")
    public int[] field959;

    @ObfuscatedName("ai.l")
    public int[] field945;

    @ObfuscatedName("ai.b")
    public String field946 = "null";

    @ObfuscatedName("ai.g")
    public short[] field947;

    @ObfuscatedName("ai.e")
    public short[] field948;

    @ObfuscatedName("ai.p")
    public short[] field935;

    @ObfuscatedName("ai.s")
    public short[] field950;

    @ObfuscatedName("ai.w")
    public int field951 = 1;

    @ObfuscatedName("ai.i")
    public int field949 = 1;

    @ObfuscatedName("ai.r")
    public int field953 = 2;

    @ObfuscatedName("ai.a")
    public boolean field954 = true;

    @ObfuscatedName("ai.n")
    public int field983 = -1;

    @ObfuscatedName("ai.z")
    public int field956 = -1;

    @ObfuscatedName("ai.x")
    public boolean field957 = false;

    @ObfuscatedName("ai.d")
    public boolean field952 = false;

    @ObfuscatedName("ai.t")
    public int field965 = -1;

    @ObfuscatedName("ai.o")
    public int field960 = 16;

    @ObfuscatedName("ai.aq")
    public int field955 = 0;

    @ObfuscatedName("ai.al")
    public int field962 = 0;

    @ObfuscatedName("ai.av")
    public String[] field963 = new String[5];

    @ObfuscatedName("ai.ad")
    public int field964 = -1;

    @ObfuscatedName("ai.at")
    public int field961 = -1;

    @ObfuscatedName("ai.aj")
    public boolean field966 = false;

    @ObfuscatedName("ai.am")
    public boolean field972 = true;

    @ObfuscatedName("ai.ay")
    public int field940 = 128;

    @ObfuscatedName("ai.ag")
    public int field969 = 128;

    @ObfuscatedName("ai.aa")
    public int field970 = 128;

    @ObfuscatedName("ai.ak")
    public int field968 = 0;

    @ObfuscatedName("ai.ar")
    public int field943 = 0;

    @ObfuscatedName("ai.ax")
    public int field973 = 0;

    @ObfuscatedName("ai.ap")
    public boolean field974 = false;

    @ObfuscatedName("ai.ao")
    public boolean field975 = false;

    @ObfuscatedName("ai.aw")
    public int field941 = -1;

    @ObfuscatedName("ai.ai")
    public int[] field977;

    @ObfuscatedName("ai.af")
    public int field978 = -1;

    @ObfuscatedName("ai.an")
    public int field979 = -1;

    @ObfuscatedName("ai.au")
    public int field980 = -1;

    @ObfuscatedName("ai.ac")
    public int field981 = 0;

    @ObfuscatedName("ai.ae")
    public int field982 = 0;

    @ObfuscatedName("ai.az")
    public int field944 = 0;

    @ObfuscatedName("ai.ah")
    public int[] field984;

    @ObfuscatedName("af.k(Lfo;Lfo;ZI)V")
    public static void method854(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field936 = arg0;
        Statics.field937 = arg1;
        field967 = arg2;
    }

    @ObfuscatedName("m.q(II)Lai;")
    public static class43 method91(int arg0) {
        class43 var1 = (class43) field938.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method3097(6, arg0);
        class43 var3 = new class43();
        var3.field976 = arg0;
        if (var2 != null) {
            var3.method802(new class123(var2));
        }
        var3.method821();
        if (var3.field975) {
            var3.field953 = 0;
            var3.field954 = false;
        }
        field938.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.f(B)V")
    public void method821() {
        if (this.field983 == -1) {
            this.field983 = 0;
            if (this.field959 != null && (this.field945 == null || this.field945[0] == 10)) {
                this.field983 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field963[var1] != null) {
                    this.field983 = 1;
                }
            }
        }
        if (this.field941 == -1) {
            this.field941 = this.field953 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.c(Lde;I)V")
    public void method802(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("ai.v(Lde;IS)V")
    public void method828(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2427();
            if (var3 > 0) {
                if (this.field959 == null || field967) {
                    this.field945 = new int[var3];
                    this.field959 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field959[var4] = arg0.method2547();
                        this.field945[var4] = arg0.method2427();
                    }
                } else {
                    arg0.field2060 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field946 = arg0.method2435();
        } else if (arg1 == 5) {
            int var5 = arg0.method2427();
            if (var5 > 0) {
                if (this.field959 == null || field967) {
                    this.field945 = null;
                    this.field959 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field959[var6] = arg0.method2547();
                    }
                } else {
                    arg0.field2060 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field951 = arg0.method2427();
        } else if (arg1 == 15) {
            this.field949 = arg0.method2427();
        } else if (arg1 == 17) {
            this.field953 = 0;
            this.field954 = false;
        } else if (arg1 == 18) {
            this.field954 = false;
        } else if (arg1 == 19) {
            this.field983 = arg0.method2427();
        } else if (arg1 == 21) {
            this.field956 = 0;
        } else if (arg1 == 22) {
            this.field957 = true;
        } else if (arg1 == 23) {
            this.field952 = true;
        } else if (arg1 == 24) {
            this.field965 = arg0.method2547();
            if (this.field965 == 65535) {
                this.field965 = -1;
            }
        } else if (arg1 == 27) {
            this.field953 = 1;
        } else if (arg1 == 28) {
            this.field960 = arg0.method2427();
        } else if (arg1 == 29) {
            this.field955 = arg0.method2428();
        } else if (arg1 == 39) {
            this.field962 = arg0.method2428() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field963[arg1 - 30] = arg0.method2435();
            if (this.field963[arg1 - 30].equalsIgnoreCase(class161.field2547)) {
                this.field963[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2427();
            this.field947 = new short[var7];
            this.field948 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field947[var8] = (short) arg0.method2547();
                this.field948[var8] = (short) arg0.method2547();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2427();
            this.field935 = new short[var9];
            this.field950 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field935[var10] = (short) arg0.method2547();
                this.field950[var10] = (short) arg0.method2547();
            }
        } else if (arg1 == 60) {
            this.field964 = arg0.method2547();
        } else if (arg1 == 62) {
            this.field966 = true;
        } else if (arg1 == 64) {
            this.field972 = false;
        } else if (arg1 == 65) {
            this.field940 = arg0.method2547();
        } else if (arg1 == 66) {
            this.field969 = arg0.method2547();
        } else if (arg1 == 67) {
            this.field970 = arg0.method2547();
        } else if (arg1 == 68) {
            this.field961 = arg0.method2547();
        } else if (arg1 == 69) {
            arg0.method2427();
        } else if (arg1 == 70) {
            this.field968 = arg0.method2430();
        } else if (arg1 == 71) {
            this.field943 = arg0.method2430();
        } else if (arg1 == 72) {
            this.field973 = arg0.method2430();
        } else if (arg1 == 73) {
            this.field974 = true;
        } else if (arg1 == 74) {
            this.field975 = true;
        } else if (arg1 == 75) {
            this.field941 = arg0.method2427();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field978 = arg0.method2547();
            if (this.field978 == 65535) {
                this.field978 = -1;
            }
            this.field979 = arg0.method2547();
            if (this.field979 == 65535) {
                this.field979 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2547();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2427();
            this.field977 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field977[var15] = arg0.method2547();
                if (this.field977[var15] == 65535) {
                    this.field977[var15] = -1;
                }
            }
            this.field977[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field980 = arg0.method2547();
            this.field981 = arg0.method2427();
        } else if (arg1 == 79) {
            this.field982 = arg0.method2547();
            this.field944 = arg0.method2547();
            this.field981 = arg0.method2427();
            int var11 = arg0.method2427();
            this.field984 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field984[var12] = arg0.method2547();
            }
        } else if (arg1 == 81) {
            this.field956 = arg0.method2427() * 256;
        }
    }

    @ObfuscatedName("ai.j(II)Z")
    public final boolean method804(int arg0) {
        if (this.field945 != null) {
            for (int var4 = 0; var4 < this.field945.length; var4++) {
                if (this.field945[var4] == arg0) {
                    return Statics.field937.method3074(this.field959[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field959 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field959.length; var3++) {
                var2 &= Statics.field937.method3074(this.field959[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.m(I)Z")
    public final boolean method805() {
        if (this.field959 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field959.length; var2++) {
            var1 &= Statics.field937.method3074(this.field959[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.y(II[[IIIIB)Lcg;")
    public final class89 method841(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field945 == null) {
            var7 = (long) ((this.field976 << 10) + arg1);
        } else {
            var7 = (long) ((this.field976 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field958.method3535(var7);
        if (var9 == null) {
            class104 var10 = this.method819(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field957) {
                var10.field1780 = (short) (this.field955 + 64);
                var10.field1792 = (short) (this.field962 + 768);
                var10.method2156();
                var9 = var10;
            } else {
                var9 = var10.method2160(this.field955 + 64, this.field962 + 768, -50, -10, -50);
            }
            field958.method3537(var9, var7);
        }
        if (this.field957) {
            var9 = ((class104) var9).method2144();
        }
        if (this.field956 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2236(arg2, arg3, arg4, arg5, true, this.field956);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2145(arg2, arg3, arg4, arg5, true, this.field956);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.u(II[[IIIII)Ldj;")
    public final class109 method807(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field945 == null) {
            var7 = (long) ((this.field976 << 10) + arg1);
        } else {
            var7 = (long) ((this.field976 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field985.method3535(var7);
        if (var9 == null) {
            class104 var10 = this.method819(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2160(this.field955 + 64, this.field962 + 768, -50, -10, -50);
            field985.method3537(var9, var7);
        }
        if (this.field956 >= 0) {
            var9 = var9.method2236(arg2, arg3, arg4, arg5, true, this.field956);
        }
        return var9;
    }

    @ObfuscatedName("ai.h(II[[IIIILan;IB)Ldj;")
    public final class109 method808(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field945 == null) {
            var9 = (long) ((this.field976 << 10) + arg1);
        } else {
            var9 = (long) ((this.field976 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field985.method3535(var9);
        if (var11 == null) {
            class104 var12 = this.method819(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2160(this.field955 + 64, this.field962 + 768, -50, -10, -50);
            field985.method3537(var11, var9);
        }
        if (arg6 == null && this.field956 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2266(true);
        } else {
            var13 = arg6.method865(var11, arg7, arg1);
        }
        if (this.field956 >= 0) {
            var13 = var13.method2236(arg2, arg3, arg4, arg5, false, this.field956);
        }
        return var13;
    }

    @ObfuscatedName("ai.l(III)Lcr;")
    public final class104 method819(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field945 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field959 == null) {
                return null;
            }
            boolean var4 = this.field966;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field959.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field959[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field939.method3535((long) var7);
                if (var3 == null) {
                    var3 = class104.method2141(Statics.field937, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2154();
                    }
                    field939.method3537(var3, (long) var7);
                }
                if (var5 > 1) {
                    field942[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field942, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field945.length; var9++) {
                if (this.field945[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field959[var8];
            boolean var11 = this.field966 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field939.method3535((long) var10);
            if (var3 == null) {
                var3 = class104.method2141(Statics.field937, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2154();
                }
                field939.method3537(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field940 == 128 && this.field969 == 128 && this.field970 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field968 == 0 && this.field943 == 0 && this.field973 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field947 == null, this.field935 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2150(256);
            var14.method2142(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2147();
        } else if (var15 == 2) {
            var14.method2148();
        } else if (var15 == 3) {
            var14.method2149();
        }
        if (this.field947 != null) {
            for (int var16 = 0; var16 < this.field947.length; var16++) {
                var14.method2152(this.field947[var16], this.field948[var16]);
            }
        }
        if (this.field935 != null) {
            for (int var17 = 0; var17 < this.field935.length; var17++) {
                var14.method2153(this.field935[var17], this.field950[var17]);
            }
        }
        if (var12) {
            var14.method2207(this.field940, this.field969, this.field970);
        }
        if (var13) {
            var14.method2142(this.field968, this.field943, this.field973);
        }
        return var14;
    }

    @ObfuscatedName("ai.b(B)Lai;")
    public final class43 method810() {
        int var1 = -1;
        if (this.field978 != -1) {
            var1 = class180.method3744(this.field978);
        } else if (this.field979 != -1) {
            var1 = class180.field2953[this.field979];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field977.length - 1) {
            var2 = this.field977[var1];
        } else {
            var2 = this.field977[this.field977.length - 1];
        }
        return var2 == -1 ? null : method91(var2);
    }

    @ObfuscatedName("ai.g(B)Z")
    public boolean method811() {
        if (this.field977 == null) {
            return this.field980 != -1 || this.field984 != null;
        }
        for (int var1 = 0; var1 < this.field977.length; var1++) {
            if (this.field977[var1] != -1) {
                class43 var2 = method91(this.field977[var1]);
                if (var2.field980 != -1 || var2.field984 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
