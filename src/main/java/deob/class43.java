package deob;

@ObfuscatedName("ai")
public class class43 extends class208 {

    @ObfuscatedName("ai.i")
    public static boolean field959 = false;

    @ObfuscatedName("ai.g")
    public static class197 field968 = new class197(64);

    @ObfuscatedName("ai.n")
    public static class197 field948 = new class197(500);

    @ObfuscatedName("ai.u")
    public static class197 field949 = new class197(30);

    @ObfuscatedName("ai.d")
    public static class197 field980 = new class197(30);

    @ObfuscatedName("ai.l")
    public static class104[] field951 = new class104[4];

    @ObfuscatedName("ai.m")
    public int field955;

    @ObfuscatedName("ai.j")
    public int[] field974;

    @ObfuscatedName("ai.y")
    public int[] field954;

    @ObfuscatedName("ai.s")
    public String field982 = "null";

    @ObfuscatedName("ai.p")
    public short[] field990;

    @ObfuscatedName("ai.v")
    public short[] field950;

    @ObfuscatedName("ai.r")
    public short[] field958;

    @ObfuscatedName("ai.c")
    public short[] field971;

    @ObfuscatedName("ai.w")
    public int field960 = 1;

    @ObfuscatedName("ai.x")
    public int field961 = 1;

    @ObfuscatedName("ai.k")
    public int field962 = 2;

    @ObfuscatedName("ai.z")
    public boolean field963 = true;

    @ObfuscatedName("ai.q")
    public int field964 = -1;

    @ObfuscatedName("ai.o")
    public int field965 = -1;

    @ObfuscatedName("ai.f")
    public boolean field966 = false;

    @ObfuscatedName("ai.b")
    public boolean field967 = false;

    @ObfuscatedName("ai.t")
    public int field956 = -1;

    @ObfuscatedName("ai.a")
    public int field945 = 16;

    @ObfuscatedName("ai.am")
    public int field970 = 0;

    @ObfuscatedName("ai.as")
    public int field995 = 0;

    @ObfuscatedName("ai.ad")
    public String[] field972 = new String[5];

    @ObfuscatedName("ai.af")
    public int field973 = -1;

    @ObfuscatedName("ai.ak")
    public int field957 = -1;

    @ObfuscatedName("ai.aq")
    public boolean field975 = false;

    @ObfuscatedName("ai.an")
    public boolean field976 = true;

    @ObfuscatedName("ai.ag")
    public int field977 = 128;

    @ObfuscatedName("ai.al")
    public int field978 = 128;

    @ObfuscatedName("ai.au")
    public int field979 = 128;

    @ObfuscatedName("ai.ar")
    public int field969 = 0;

    @ObfuscatedName("ai.aw")
    public int field981 = 0;

    @ObfuscatedName("ai.ah")
    public int field946 = 0;

    @ObfuscatedName("ai.ao")
    public boolean field983 = false;

    @ObfuscatedName("ai.ax")
    public boolean field984 = false;

    @ObfuscatedName("ai.ac")
    public int field985 = -1;

    @ObfuscatedName("ai.ai")
    public int[] field986;

    @ObfuscatedName("ai.ap")
    public int field952 = -1;

    @ObfuscatedName("ai.aa")
    public int field988 = -1;

    @ObfuscatedName("ai.ay")
    public int field989 = -1;

    @ObfuscatedName("ai.ab")
    public int field953 = 0;

    @ObfuscatedName("ai.aj")
    public int field991 = 0;

    @ObfuscatedName("ai.az")
    public int field992 = 0;

    @ObfuscatedName("ai.av")
    public int[] field944;

    @ObfuscatedName("p.i(Lfu;Lfu;ZB)V")
    public static void method145(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field993 = arg0;
        Statics.field987 = arg1;
        field959 = arg2;
    }

    @ObfuscatedName("j.h(II)Lai;")
    public static class43 method117(int arg0) {
        class43 var1 = (class43) field968.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field993.method3086(6, arg0);
        class43 var3 = new class43();
        var3.field955 = arg0;
        if (var2 != null) {
            var3.method806(new class123(var2));
        }
        var3.method809();
        if (var3.field984) {
            var3.field962 = 0;
            var3.field963 = false;
        }
        field968.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.e(I)V")
    public void method809() {
        if (this.field964 == -1) {
            this.field964 = 0;
            if (this.field974 != null && (this.field954 == null || this.field954[0] == 10)) {
                this.field964 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field972[var1] != null) {
                    this.field964 = 1;
                }
            }
        }
        if (this.field985 == -1) {
            this.field985 = this.field962 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.g(Ldn;I)V")
    public void method806(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method807(arg0, var2);
        }
    }

    @ObfuscatedName("ai.n(Ldn;II)V")
    public void method807(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2404();
            if (var3 > 0) {
                if (this.field974 == null || field959) {
                    this.field954 = new int[var3];
                    this.field974 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field974[var4] = arg0.method2406();
                        this.field954[var4] = arg0.method2404();
                    }
                } else {
                    arg0.field2046 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field982 = arg0.method2412();
        } else if (arg1 == 5) {
            int var5 = arg0.method2404();
            if (var5 > 0) {
                if (this.field974 == null || field959) {
                    this.field954 = null;
                    this.field974 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field974[var6] = arg0.method2406();
                    }
                } else {
                    arg0.field2046 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field960 = arg0.method2404();
        } else if (arg1 == 15) {
            this.field961 = arg0.method2404();
        } else if (arg1 == 17) {
            this.field962 = 0;
            this.field963 = false;
        } else if (arg1 == 18) {
            this.field963 = false;
        } else if (arg1 == 19) {
            this.field964 = arg0.method2404();
        } else if (arg1 == 21) {
            this.field965 = 0;
        } else if (arg1 == 22) {
            this.field966 = true;
        } else if (arg1 == 23) {
            this.field967 = true;
        } else if (arg1 == 24) {
            this.field956 = arg0.method2406();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
        } else if (arg1 == 27) {
            this.field962 = 1;
        } else if (arg1 == 28) {
            this.field945 = arg0.method2404();
        } else if (arg1 == 29) {
            this.field970 = arg0.method2405();
        } else if (arg1 == 39) {
            this.field995 = arg0.method2405();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field972[arg1 - 30] = arg0.method2412();
            if (this.field972[arg1 - 30].equalsIgnoreCase(class161.field2437)) {
                this.field972[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2404();
            this.field990 = new short[var7];
            this.field950 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field990[var8] = (short) arg0.method2406();
                this.field950[var8] = (short) arg0.method2406();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2404();
            this.field958 = new short[var9];
            this.field971 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field958[var10] = (short) arg0.method2406();
                this.field971[var10] = (short) arg0.method2406();
            }
        } else if (arg1 == 60) {
            this.field973 = arg0.method2406();
        } else if (arg1 == 62) {
            this.field975 = true;
        } else if (arg1 == 64) {
            this.field976 = false;
        } else if (arg1 == 65) {
            this.field977 = arg0.method2406();
        } else if (arg1 == 66) {
            this.field978 = arg0.method2406();
        } else if (arg1 == 67) {
            this.field979 = arg0.method2406();
        } else if (arg1 == 68) {
            this.field957 = arg0.method2406();
        } else if (arg1 == 69) {
            arg0.method2404();
        } else if (arg1 == 70) {
            this.field969 = arg0.method2407();
        } else if (arg1 == 71) {
            this.field981 = arg0.method2407();
        } else if (arg1 == 72) {
            this.field946 = arg0.method2407();
        } else if (arg1 == 73) {
            this.field983 = true;
        } else if (arg1 == 74) {
            this.field984 = true;
        } else if (arg1 == 75) {
            this.field985 = arg0.method2404();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field952 = arg0.method2406();
            if (this.field952 == 65535) {
                this.field952 = -1;
            }
            this.field988 = arg0.method2406();
            if (this.field988 == 65535) {
                this.field988 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2406();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2404();
            this.field986 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field986[var15] = arg0.method2406();
                if (this.field986[var15] == 65535) {
                    this.field986[var15] = -1;
                }
            }
            this.field986[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field989 = arg0.method2406();
            this.field953 = arg0.method2404();
        } else if (arg1 == 79) {
            this.field991 = arg0.method2406();
            this.field992 = arg0.method2406();
            this.field953 = arg0.method2404();
            int var11 = arg0.method2404();
            this.field944 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field944[var12] = arg0.method2406();
            }
        } else if (arg1 == 81) {
            this.field965 = arg0.method2404() * 256;
        }
    }

    @ObfuscatedName("ai.u(IB)Z")
    public final boolean method808(int arg0) {
        if (this.field954 != null) {
            for (int var4 = 0; var4 < this.field954.length; var4++) {
                if (this.field954[var4] == arg0) {
                    return Statics.field987.method3085(this.field974[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field974 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field974.length; var3++) {
                var2 &= Statics.field987.method3085(this.field974[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.d(B)Z")
    public final boolean method812() {
        if (this.field974 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field974.length; var2++) {
            var1 &= Statics.field987.method3085(this.field974[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.l(II[[IIIII)Lcp;")
    public final class89 method810(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field954 == null) {
            var7 = (long) ((this.field955 << 10) + arg1);
        } else {
            var7 = (long) ((this.field955 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field949.method3541(var7);
        if (var9 == null) {
            class104 var10 = this.method824(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field966) {
                var10.field1780 = (short) (this.field970 + 64);
                var10.field1784 = (short) (this.field995 * 25 + 768);
                var10.method2131();
                var9 = var10;
            } else {
                var9 = var10.method2135(this.field970 + 64, this.field995 * 25 + 768, -50, -10, -50);
            }
            field949.method3532(var9, var7);
        }
        if (this.field966) {
            var9 = ((class104) var9).method2119();
        }
        if (this.field965 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2223(arg2, arg3, arg4, arg5, true, this.field965);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2181(arg2, arg3, arg4, arg5, true, this.field965);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.m(II[[IIIII)Ldo;")
    public final class109 method811(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field954 == null) {
            var7 = (long) ((this.field955 << 10) + arg1);
        } else {
            var7 = (long) ((this.field955 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field980.method3541(var7);
        if (var9 == null) {
            class104 var10 = this.method824(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2135(this.field970 + 64, this.field995 * 25 + 768, -50, -10, -50);
            field980.method3532(var9, var7);
        }
        if (this.field965 >= 0) {
            var9 = var9.method2223(arg2, arg3, arg4, arg5, true, this.field965);
        }
        return var9;
    }

    @ObfuscatedName("ai.j(II[[IIIILaa;II)Ldo;")
    public final class109 method818(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field954 == null) {
            var9 = (long) ((this.field955 << 10) + arg1);
        } else {
            var9 = (long) ((this.field955 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field980.method3541(var9);
        if (var11 == null) {
            class104 var12 = this.method824(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2135(this.field970 + 64, this.field995 * 25 + 768, -50, -10, -50);
            field980.method3532(var11, var9);
        }
        if (arg6 == null && this.field965 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2227(true);
        } else {
            var13 = arg6.method867(var11, arg7, arg1);
        }
        if (this.field965 >= 0) {
            var13 = var13.method2223(arg2, arg3, arg4, arg5, false, this.field965);
        }
        return var13;
    }

    @ObfuscatedName("ai.y(III)Lco;")
    public final class104 method824(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field954 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field974 == null) {
                return null;
            }
            boolean var4 = this.field975;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field974.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field974[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field948.method3541((long) var7);
                if (var3 == null) {
                    var3 = class104.method2115(Statics.field987, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2129();
                    }
                    field948.method3532(var3, (long) var7);
                }
                if (var5 > 1) {
                    field951[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field951, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field954.length; var9++) {
                if (this.field954[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field974[var8];
            boolean var11 = this.field975 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field948.method3541((long) var10);
            if (var3 == null) {
                var3 = class104.method2115(Statics.field987, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2129();
                }
                field948.method3532(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field977 == 128 && this.field978 == 128 && this.field979 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field969 == 0 && this.field981 == 0 && this.field946 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field990 == null, this.field958 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2142(256);
            var14.method2120(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2122();
        } else if (var15 == 2) {
            var14.method2123();
        } else if (var15 == 3) {
            var14.method2180();
        }
        if (this.field990 != null) {
            for (int var16 = 0; var16 < this.field990.length; var16++) {
                var14.method2185(this.field990[var16], this.field950[var16]);
            }
        }
        if (this.field958 != null) {
            for (int var17 = 0; var17 < this.field958.length; var17++) {
                var14.method2128(this.field958[var17], this.field971[var17]);
            }
        }
        if (var12) {
            var14.method2130(this.field977, this.field978, this.field979);
        }
        if (var13) {
            var14.method2120(this.field969, this.field981, this.field946);
        }
        return var14;
    }

    @ObfuscatedName("ai.s(B)Lai;")
    public final class43 method847() {
        int var1 = -1;
        if (this.field952 != -1) {
            var1 = class180.method123(this.field952);
        } else if (this.field988 != -1) {
            var1 = class180.field2955[this.field988];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field986.length - 1) {
            var2 = this.field986[var1];
        } else {
            var2 = this.field986[this.field986.length - 1];
        }
        return var2 == -1 ? null : method117(var2);
    }

    @ObfuscatedName("w.p(I)V")
    public static void method181() {
        field968.method3533();
        field948.method3533();
        field949.method3533();
        field980.method3533();
    }

    @ObfuscatedName("ai.v(I)Z")
    public boolean method815() {
        if (this.field986 == null) {
            return this.field989 != -1 || this.field944 != null;
        }
        for (int var1 = 0; var1 < this.field986.length; var1++) {
            if (this.field986[var1] != -1) {
                class43 var2 = method117(this.field986[var1]);
                if (var2.field989 != -1 || var2.field944 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
