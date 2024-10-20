package deob;

@ObfuscatedName("ax")
public class class43 extends class208 {

    @ObfuscatedName("ax.e")
    public static boolean field990 = false;

    @ObfuscatedName("ax.h")
    public static class197 field962 = new class197(64);

    @ObfuscatedName("ax.r")
    public static class197 field1007 = new class197(500);

    @ObfuscatedName("ax.a")
    public static class197 field964 = new class197(30);

    @ObfuscatedName("ax.b")
    public static class197 field987 = new class197(30);

    @ObfuscatedName("ax.u")
    public static class104[] field966 = new class104[4];

    @ObfuscatedName("ax.o")
    public int field975;

    @ObfuscatedName("ax.p")
    public int[] field968;

    @ObfuscatedName("ax.i")
    public int[] field969;

    @ObfuscatedName("ax.q")
    public String field965 = "null";

    @ObfuscatedName("ax.g")
    public short[] field971;

    @ObfuscatedName("ax.j")
    public short[] field992;

    @ObfuscatedName("ax.w")
    public short[] field973;

    @ObfuscatedName("ax.x")
    public short[] field974;

    @ObfuscatedName("ax.f")
    public int field960 = 1;

    @ObfuscatedName("ax.t")
    public int field1001 = 1;

    @ObfuscatedName("ax.z")
    public int field977 = 2;

    @ObfuscatedName("ax.y")
    public boolean field978 = true;

    @ObfuscatedName("ax.m")
    public int field972 = -1;

    @ObfuscatedName("ax.v")
    public int field980 = -1;

    @ObfuscatedName("ax.k")
    public boolean field981 = false;

    @ObfuscatedName("ax.n")
    public boolean field982 = false;

    @ObfuscatedName("ax.d")
    public int field983 = -1;

    @ObfuscatedName("ax.s")
    public int field961 = 16;

    @ObfuscatedName("ax.ah")
    public int field985 = 0;

    @ObfuscatedName("ax.ak")
    public int field986 = 0;

    @ObfuscatedName("ax.as")
    public String[] field963 = new String[5];

    @ObfuscatedName("ax.ae")
    public int field988 = -1;

    @ObfuscatedName("ax.ao")
    public int field989 = -1;

    @ObfuscatedName("ax.av")
    public boolean field967 = false;

    @ObfuscatedName("ax.al")
    public boolean field996 = true;

    @ObfuscatedName("ax.ap")
    public int field984 = 128;

    @ObfuscatedName("ax.an")
    public int field993 = 128;

    @ObfuscatedName("ax.aw")
    public int field994 = 128;

    @ObfuscatedName("ax.ad")
    public int field995 = 0;

    @ObfuscatedName("ax.aa")
    public int field979 = 0;

    @ObfuscatedName("ax.at")
    public int field997 = 0;

    @ObfuscatedName("ax.ag")
    public boolean field998 = false;

    @ObfuscatedName("ax.aq")
    public boolean field991 = false;

    @ObfuscatedName("ax.af")
    public int field1000 = -1;

    @ObfuscatedName("ax.ax")
    public int[] field970;

    @ObfuscatedName("ax.ai")
    public int field1002 = -1;

    @ObfuscatedName("ax.ar")
    public int field1003 = -1;

    @ObfuscatedName("ax.ab")
    public int field1004 = -1;

    @ObfuscatedName("ax.aj")
    public int field1005 = 0;

    @ObfuscatedName("ax.au")
    public int field1006 = 0;

    @ObfuscatedName("ax.am")
    public int field976 = 0;

    @ObfuscatedName("ax.az")
    public int[] field1008;

    @ObfuscatedName("dl.e(Lfe;Lfe;ZB)V")
    public static void method2382(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field3259 = arg0;
        Statics.field999 = arg1;
        field990 = arg2;
    }

    @ObfuscatedName("ew.l(II)Lax;")
    public static class43 method2943(int arg0) {
        class43 var1 = (class43) field962.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3259.method3130(6, arg0);
        class43 var3 = new class43();
        var3.field975 = arg0;
        if (var2 != null) {
            var3.method807(new class123(var2));
        }
        var3.method834();
        if (var3.field991) {
            var3.field977 = 0;
            var3.field978 = false;
        }
        field962.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.c(I)V")
    public void method834() {
        if (this.field972 == -1) {
            this.field972 = 0;
            if (this.field968 != null && (this.field969 == null || this.field969[0] == 10)) {
                this.field972 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field963[var1] != null) {
                    this.field972 = 1;
                }
            }
        }
        if (this.field1000 == -1) {
            this.field1000 = this.field977 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ax.h(Ldd;I)V")
    public void method807(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("ax.r(Ldd;IB)V")
    public void method808(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2464();
            if (var3 > 0) {
                if (this.field968 == null || field990) {
                    this.field969 = new int[var3];
                    this.field968 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field968[var4] = arg0.method2466();
                        this.field969[var4] = arg0.method2464();
                    }
                } else {
                    arg0.field2062 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field965 = arg0.method2471();
        } else if (arg1 == 5) {
            int var5 = arg0.method2464();
            if (var5 > 0) {
                if (this.field968 == null || field990) {
                    this.field969 = null;
                    this.field968 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field968[var6] = arg0.method2466();
                    }
                } else {
                    arg0.field2062 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field960 = arg0.method2464();
        } else if (arg1 == 15) {
            this.field1001 = arg0.method2464();
        } else if (arg1 == 17) {
            this.field977 = 0;
            this.field978 = false;
        } else if (arg1 == 18) {
            this.field978 = false;
        } else if (arg1 == 19) {
            this.field972 = arg0.method2464();
        } else if (arg1 == 21) {
            this.field980 = 0;
        } else if (arg1 == 22) {
            this.field981 = true;
        } else if (arg1 == 23) {
            this.field982 = true;
        } else if (arg1 == 24) {
            this.field983 = arg0.method2466();
            if (this.field983 == 65535) {
                this.field983 = -1;
            }
        } else if (arg1 == 27) {
            this.field977 = 1;
        } else if (arg1 == 28) {
            this.field961 = arg0.method2464();
        } else if (arg1 == 29) {
            this.field985 = arg0.method2465();
        } else if (arg1 == 39) {
            this.field986 = arg0.method2465() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field963[arg1 - 30] = arg0.method2471();
            if (this.field963[arg1 - 30].equalsIgnoreCase(class161.field2362)) {
                this.field963[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2464();
            this.field971 = new short[var7];
            this.field992 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field971[var8] = (short) arg0.method2466();
                this.field992[var8] = (short) arg0.method2466();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2464();
            this.field973 = new short[var9];
            this.field974 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field973[var10] = (short) arg0.method2466();
                this.field974[var10] = (short) arg0.method2466();
            }
        } else if (arg1 == 60) {
            this.field988 = arg0.method2466();
        } else if (arg1 == 62) {
            this.field967 = true;
        } else if (arg1 == 64) {
            this.field996 = false;
        } else if (arg1 == 65) {
            this.field984 = arg0.method2466();
        } else if (arg1 == 66) {
            this.field993 = arg0.method2466();
        } else if (arg1 == 67) {
            this.field994 = arg0.method2466();
        } else if (arg1 == 68) {
            this.field989 = arg0.method2466();
        } else if (arg1 == 69) {
            arg0.method2464();
        } else if (arg1 == 70) {
            this.field995 = arg0.method2467();
        } else if (arg1 == 71) {
            this.field979 = arg0.method2467();
        } else if (arg1 == 72) {
            this.field997 = arg0.method2467();
        } else if (arg1 == 73) {
            this.field998 = true;
        } else if (arg1 == 74) {
            this.field991 = true;
        } else if (arg1 == 75) {
            this.field1000 = arg0.method2464();
        } else if (arg1 == 77) {
            this.field1002 = arg0.method2466();
            if (this.field1002 == 65535) {
                this.field1002 = -1;
            }
            this.field1003 = arg0.method2466();
            if (this.field1003 == 65535) {
                this.field1003 = -1;
            }
            int var11 = arg0.method2464();
            this.field970 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field970[var12] = arg0.method2466();
                if (this.field970[var12] == 65535) {
                    this.field970[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field1004 = arg0.method2466();
            this.field1005 = arg0.method2464();
        } else if (arg1 == 79) {
            this.field1006 = arg0.method2466();
            this.field976 = arg0.method2466();
            this.field1005 = arg0.method2464();
            int var13 = arg0.method2464();
            this.field1008 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1008[var14] = arg0.method2466();
            }
        } else if (arg1 == 81) {
            this.field980 = arg0.method2464() * 256;
        }
    }

    @ObfuscatedName("ax.a(II)Z")
    public final boolean method809(int arg0) {
        if (this.field969 != null) {
            for (int var4 = 0; var4 < this.field969.length; var4++) {
                if (this.field969[var4] == arg0) {
                    return Statics.field999.method3134(this.field968[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field968 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field968.length; var3++) {
                var2 &= Statics.field999.method3134(this.field968[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ax.b(I)Z")
    public final boolean method810() {
        if (this.field968 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field968.length; var2++) {
            var1 &= Statics.field999.method3134(this.field968[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ax.u(II[[IIIII)Lcu;")
    public final class89 method811(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field969 == null) {
            var7 = (long) ((this.field975 << 10) + arg1);
        } else {
            var7 = (long) ((this.field975 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field964.method3589(var7);
        if (var9 == null) {
            class104 var10 = this.method814(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field981) {
                var10.field1781 = (short) (this.field985 + 64);
                var10.field1775 = (short) (this.field986 + 768);
                var10.method2171();
                var9 = var10;
            } else {
                var9 = var10.method2175(this.field985 + 64, this.field986 + 768, -50, -10, -50);
            }
            field964.method3591(var9, var7);
        }
        if (this.field981) {
            var9 = ((class104) var9).method2159();
        }
        if (this.field980 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2244(arg2, arg3, arg4, arg5, true, this.field980);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2160(arg2, arg3, arg4, arg5, true, this.field980);
            }
        }
        return var9;
    }

    @ObfuscatedName("ax.o(II[[IIIII)Lds;")
    public final class109 method812(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field969 == null) {
            var7 = (long) ((this.field975 << 10) + arg1);
        } else {
            var7 = (long) ((this.field975 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field987.method3589(var7);
        if (var9 == null) {
            class104 var10 = this.method814(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2175(this.field985 + 64, this.field986 + 768, -50, -10, -50);
            field987.method3591(var9, var7);
        }
        if (this.field980 >= 0) {
            var9 = var9.method2244(arg2, arg3, arg4, arg5, true, this.field980);
        }
        return var9;
    }

    @ObfuscatedName("ax.p(II[[IIIILar;II)Lds;")
    public final class109 method813(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field969 == null) {
            var9 = (long) ((this.field975 << 10) + arg1);
        } else {
            var9 = (long) ((this.field975 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field987.method3589(var9);
        if (var11 == null) {
            class104 var12 = this.method814(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2175(this.field985 + 64, this.field986 + 768, -50, -10, -50);
            field987.method3591(var11, var9);
        }
        if (arg6 == null && this.field980 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2315(true);
        } else {
            var13 = arg6.method908(var11, arg7, arg1);
        }
        if (this.field980 >= 0) {
            var13 = var13.method2244(arg2, arg3, arg4, arg5, false, this.field980);
        }
        return var13;
    }

    @ObfuscatedName("ax.i(IIB)Lcv;")
    public final class104 method814(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field969 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field968 == null) {
                return null;
            }
            boolean var4 = this.field967;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field968.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field968[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field1007.method3589((long) var7);
                if (var3 == null) {
                    var3 = class104.method2178(Statics.field999, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2207();
                    }
                    field1007.method3591(var3, (long) var7);
                }
                if (var5 > 1) {
                    field966[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field966, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field969.length; var9++) {
                if (this.field969[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field968[var8];
            boolean var11 = this.field967 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field1007.method3589((long) var10);
            if (var3 == null) {
                var3 = class104.method2178(Statics.field999, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2207();
                }
                field1007.method3591(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field984 == 128 && this.field993 == 128 && this.field994 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field995 == 0 && this.field979 == 0 && this.field997 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field971 == null, this.field973 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2165(256);
            var14.method2169(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2181();
        } else if (var15 == 2) {
            var14.method2154();
        } else if (var15 == 3) {
            var14.method2164();
        }
        if (this.field971 != null) {
            for (int var16 = 0; var16 < this.field971.length; var16++) {
                var14.method2217(this.field971[var16], this.field992[var16]);
            }
        }
        if (this.field973 != null) {
            for (int var17 = 0; var17 < this.field973.length; var17++) {
                var14.method2168(this.field973[var17], this.field974[var17]);
            }
        }
        if (var12) {
            var14.method2170(this.field984, this.field993, this.field994);
        }
        if (var13) {
            var14.method2169(this.field995, this.field979, this.field997);
        }
        return var14;
    }

    @ObfuscatedName("ax.q(B)Lax;")
    public final class43 method815() {
        int var1 = -1;
        if (this.field1002 != -1) {
            var1 = class180.method3258(this.field1002);
        } else if (this.field1003 != -1) {
            var1 = class180.field2945[this.field1003];
        }
        return var1 < 0 || var1 >= this.field970.length || this.field970[var1] == -1 ? null : method2943(this.field970[var1]);
    }

    @ObfuscatedName("ax.g(I)Z")
    public boolean method816() {
        if (this.field970 == null) {
            return this.field1004 != -1 || this.field1008 != null;
        }
        for (int var1 = 0; var1 < this.field970.length; var1++) {
            if (this.field970[var1] != -1) {
                class43 var2 = method2943(this.field970[var1]);
                if (var2.field1004 != -1 || var2.field1008 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
