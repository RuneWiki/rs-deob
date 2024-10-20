package deob;

@ObfuscatedName("ai")
public class class39 extends class172 {

    @ObfuscatedName("ai.z")
    public static class168 field957 = new class168(64);

    @ObfuscatedName("ai.c")
    public static class168 field958 = new class168(50);

    @ObfuscatedName("ai.e")
    public static class168 field968 = new class168(100);

    @ObfuscatedName("ai.i")
    public int field976;

    @ObfuscatedName("ai.g")
    public int field961;

    @ObfuscatedName("ai.q")
    public String field960 = "null";

    @ObfuscatedName("ai.w")
    public short[] field985;

    @ObfuscatedName("ai.k")
    public short[] field988;

    @ObfuscatedName("ai.v")
    public short[] field965;

    @ObfuscatedName("ai.o")
    public short[] field966;

    @ObfuscatedName("ai.m")
    public int field967 = 2000;

    @ObfuscatedName("ai.u")
    public int field986 = 0;

    @ObfuscatedName("ai.r")
    public int field995 = 0;

    @ObfuscatedName("ai.d")
    public int field970 = 0;

    @ObfuscatedName("ai.n")
    public int field971 = 0;

    @ObfuscatedName("ai.b")
    public int field972 = 0;

    @ObfuscatedName("ai.p")
    public int field973 = 0;

    @ObfuscatedName("ai.t")
    public int field974 = 1;

    @ObfuscatedName("ai.l")
    public boolean field975 = false;

    @ObfuscatedName("ai.a")
    public String[] field977 = new String[] { null, null, class133.field2255, null, null };

    @ObfuscatedName("ai.f")
    public String[] field964 = new String[] { null, null, null, null, class133.field2061 };

    @ObfuscatedName("ai.h")
    public int field978 = -1;

    @ObfuscatedName("ai.az")
    public int field979 = -1;

    @ObfuscatedName("ai.ao")
    public int field982 = 0;

    @ObfuscatedName("ai.au")
    public int field981 = -1;

    @ObfuscatedName("ai.aw")
    public int field969 = -1;

    @ObfuscatedName("ai.ad")
    public int field994 = 0;

    @ObfuscatedName("ai.av")
    public int field997 = -1;

    @ObfuscatedName("ai.am")
    public int field984 = -1;

    @ObfuscatedName("ai.an")
    public int field955 = -1;

    @ObfuscatedName("ai.ac")
    public int field959 = -1;

    @ObfuscatedName("ai.at")
    public int field980 = -1;

    @ObfuscatedName("ai.ax")
    public int field989 = -1;

    @ObfuscatedName("ai.aj")
    public int[] field990;

    @ObfuscatedName("ai.ai")
    public int[] field991;

    @ObfuscatedName("ai.ay")
    public int field992 = -1;

    @ObfuscatedName("ai.ag")
    public int field993 = -1;

    @ObfuscatedName("ai.ar")
    public int field962 = 128;

    @ObfuscatedName("ai.ae")
    public int field963 = 128;

    @ObfuscatedName("ai.ah")
    public int field996 = 128;

    @ObfuscatedName("ai.aa")
    public int field983 = 0;

    @ObfuscatedName("ai.ab")
    public int field998 = 0;

    @ObfuscatedName("ai.ak")
    public int field999 = 0;

    @ObfuscatedName("cp.j(II)Lai;")
    public static class39 method1818(int arg0) {
        class39 var1 = (class39) field957.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field987.method2903(10, arg0);
        class39 var3 = new class39();
        var3.field976 = arg0;
        if (var2 != null) {
            var3.method862(new class126(var2));
        }
        var3.method816();
        if (var3.field993 != -1) {
            var3.method819(method1818(var3.field993), method1818(var3.field992));
        }
        if (!Statics.field1740 && var3.field975) {
            var3.field960 = class133.field2198;
            var3.field977 = null;
            var3.field964 = null;
            var3.field999 = 0;
        }
        field957.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.y(S)V")
    public void method816() {
    }

    @ObfuscatedName("ai.x(Ldr;I)V")
    public void method862(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method825(arg0, var2);
        }
    }

    @ObfuscatedName("ai.z(Ldr;II)V")
    public void method825(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2405();
        } else if (arg1 == 2) {
            this.field960 = arg0.method2390();
        } else if (arg1 == 4) {
            this.field967 = arg0.method2405();
        } else if (arg1 == 5) {
            this.field986 = arg0.method2405();
        } else if (arg1 == 6) {
            this.field995 = arg0.method2405();
        } else if (arg1 == 7) {
            this.field971 = arg0.method2405();
            if (this.field971 > 32767) {
                this.field971 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field972 = arg0.method2405();
            if (this.field972 > 32767) {
                this.field972 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field973 = 1;
        } else if (arg1 == 12) {
            this.field974 = arg0.method2387();
        } else if (arg1 == 16) {
            this.field975 = true;
        } else if (arg1 == 23) {
            this.field978 = arg0.method2405();
            this.field982 = arg0.method2399();
        } else if (arg1 == 24) {
            this.field979 = arg0.method2405();
        } else if (arg1 == 25) {
            this.field981 = arg0.method2405();
            this.field994 = arg0.method2399();
        } else if (arg1 == 26) {
            this.field969 = arg0.method2405();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field977[arg1 - 30] = arg0.method2390();
            if (this.field977[arg1 - 30].equalsIgnoreCase(class133.field2229)) {
                this.field977[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field964[arg1 - 35] = arg0.method2390();
        } else if (arg1 == 40) {
            int var3 = arg0.method2399();
            this.field985 = new short[var3];
            this.field988 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field985[var4] = (short) arg0.method2405();
                this.field988[var4] = (short) arg0.method2405();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2399();
            this.field965 = new short[var5];
            this.field966 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field965[var6] = (short) arg0.method2405();
                this.field966[var6] = (short) arg0.method2405();
            }
        } else if (arg1 == 78) {
            this.field997 = arg0.method2405();
        } else if (arg1 == 79) {
            this.field984 = arg0.method2405();
        } else if (arg1 == 90) {
            this.field955 = arg0.method2405();
        } else if (arg1 == 91) {
            this.field980 = arg0.method2405();
        } else if (arg1 == 92) {
            this.field959 = arg0.method2405();
        } else if (arg1 == 93) {
            this.field989 = arg0.method2405();
        } else if (arg1 == 95) {
            this.field970 = arg0.method2405();
        } else if (arg1 == 97) {
            this.field992 = arg0.method2405();
        } else if (arg1 == 98) {
            this.field993 = arg0.method2405();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field990 == null) {
                this.field990 = new int[10];
                this.field991 = new int[10];
            }
            this.field990[arg1 - 100] = arg0.method2405();
            this.field991[arg1 - 100] = arg0.method2405();
        } else if (arg1 == 110) {
            this.field962 = arg0.method2405();
        } else if (arg1 == 111) {
            this.field963 = arg0.method2405();
        } else if (arg1 == 112) {
            this.field996 = arg0.method2405();
        } else if (arg1 == 113) {
            this.field983 = arg0.method2383();
        } else if (arg1 == 114) {
            this.field998 = arg0.method2383() * 5;
        } else if (arg1 == 115) {
            this.field999 = arg0.method2399();
        }
    }

    @ObfuscatedName("ai.c(Lai;Lai;I)V")
    public void method819(class39 arg0, class39 arg1) {
        this.field961 = arg0.field961;
        this.field967 = arg0.field967;
        this.field986 = arg0.field986;
        this.field995 = arg0.field995;
        this.field970 = arg0.field970;
        this.field971 = arg0.field971;
        this.field972 = arg0.field972;
        this.field985 = arg0.field985;
        this.field988 = arg0.field988;
        this.field965 = arg0.field965;
        this.field966 = arg0.field966;
        this.field960 = arg1.field960;
        this.field975 = arg1.field975;
        this.field974 = arg1.field974;
        this.field973 = 1;
    }

    @ObfuscatedName("ai.e(II)Lck;")
    public final class100 method820(int arg0) {
        if (this.field990 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field991[var3] && this.field991[var3] != 0) {
                    var2 = this.field990[var3];
                }
            }
            if (var2 != -1) {
                return method1818(var2).method820(1);
            }
        }
        class100 var4 = class100.method2001(Statics.field956, this.field961, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field962 != 128 || this.field963 != 128 || this.field996 != 128) {
            var4.method2016(this.field962, this.field963, this.field996);
        }
        if (this.field985 != null) {
            for (int var5 = 0; var5 < this.field985.length; var5++) {
                var4.method2013(this.field985[var5], this.field988[var5]);
            }
        }
        if (this.field965 != null) {
            for (int var6 = 0; var6 < this.field965.length; var6++) {
                var4.method2000(this.field965[var6], this.field966[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.s(II)Ldh;")
    public final class111 method821(int arg0) {
        if (this.field990 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field991[var3] && this.field991[var3] != 0) {
                    var2 = this.field990[var3];
                }
            }
            if (var2 != -1) {
                return method1818(var2).method821(1);
            }
        }
        class111 var4 = (class111) field958.method3191((long) this.field976);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2001(Statics.field956, this.field961, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field962 != 128 || this.field963 != 128 || this.field996 != 128) {
            var5.method2016(this.field962, this.field963, this.field996);
        }
        if (this.field985 != null) {
            for (int var6 = 0; var6 < this.field985.length; var6++) {
                var5.method2013(this.field985[var6], this.field988[var6]);
            }
        }
        if (this.field965 != null) {
            for (int var7 = 0; var7 < this.field965.length; var7++) {
                var5.method2000(this.field965[var7], this.field966[var7]);
            }
        }
        class111 var8 = var5.method2057(this.field983 + 64, this.field998 + 768, -50, -10, -50);
        var8.field1866 = true;
        field958.method3181(var8, (long) this.field976);
        return var8;
    }

    @ObfuscatedName("ai.i(II)Lai;")
    public class39 method827(int arg0) {
        if (this.field990 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field991[var3] && this.field991[var3] != 0) {
                    var2 = this.field990[var3];
                }
            }
            if (var2 != -1) {
                return method1818(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cm.g(IIIIZI)Lct;")
    public static final class85 method2075(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field968.method3191(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method1818(arg0);
        if (arg1 > 1 && var8.field990 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field991[var10] && var8.field991[var10] != 0) {
                    var9 = var8.field990[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1818(var9);
            }
        }
        class111 var11 = var8.method821(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field993 != -1) {
            var12 = method2075(var8.field992, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1473;
        int var14 = Statics.field1476;
        int var15 = Statics.field1474;
        int[] var16 = new int[4];
        class88.method1751(var16);
        class85 var17 = new class85(36, 32);
        class88.method1747(var17.field1459, 36, 32);
        class88.method1759();
        class103.method2080();
        class103.method2124(16, 16);
        class103.field1744 = false;
        int var18 = var8.field967;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1764[var8.field986] * var18 >> 16;
        int var20 = class103.field1765[var8.field986] * var18 >> 16;
        var11.method2170();
        var11.method2166(0, var8.field995, var8.field970, var8.field986, var8.field971, var8.field972 + var11.field1534 / 2 + var19, var8.field972 + var20);
        if (arg2 >= 1) {
            var17.method1671(1);
        }
        if (arg2 >= 2) {
            var17.method1671(16777215);
        }
        if (arg3 != 0) {
            var17.method1653(arg3);
        }
        class88.method1747(var17.field1459, 36, 32);
        if (var8.field993 != -1) {
            var12.method1656(0, 0);
        }
        if (!arg4 && (var8.field973 == 1 || arg1 != 1) && arg1 != -1) {
            class181 var21 = Statics.field2504;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class133.field2214 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class133.field2219 + "</col>";
            }
            var21.method3322(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field968.method3181(var17, var5);
        }
        class88.method1747(var13, var14, var15);
        class88.method1748(var16);
        class103.method2080();
        class103.field1744 = true;
        return var17;
    }

    @ObfuscatedName("ai.q(ZI)Z")
    public final boolean method823(boolean arg0) {
        int var2 = this.field978;
        int var3 = this.field979;
        int var4 = this.field997;
        if (arg0) {
            var2 = this.field981;
            var3 = this.field969;
            var4 = this.field984;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field956.method2965(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field956.method2965(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field956.method2965(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ai.w(ZB)Lck;")
    public final class100 method824(boolean arg0) {
        int var2 = this.field978;
        int var3 = this.field979;
        int var4 = this.field997;
        if (arg0) {
            var2 = this.field981;
            var3 = this.field969;
            var4 = this.field984;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2001(Statics.field956, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2001(Statics.field956, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2001(Statics.field956, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field982 != 0) {
            var5.method2062(0, this.field982, 0);
        }
        if (arg0 && this.field994 != 0) {
            var5.method2062(0, this.field994, 0);
        }
        if (this.field985 != null) {
            for (int var10 = 0; var10 < this.field985.length; var10++) {
                var5.method2013(this.field985[var10], this.field988[var10]);
            }
        }
        if (this.field965 != null) {
            for (int var11 = 0; var11 < this.field965.length; var11++) {
                var5.method2000(this.field965[var11], this.field966[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ai.k(ZS)Z")
    public final boolean method815(boolean arg0) {
        int var2 = this.field955;
        int var3 = this.field959;
        if (arg0) {
            var2 = this.field980;
            var3 = this.field989;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field956.method2965(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field956.method2965(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ai.v(ZI)Lck;")
    public final class100 method826(boolean arg0) {
        int var2 = this.field955;
        int var3 = this.field959;
        if (arg0) {
            var2 = this.field980;
            var3 = this.field989;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2001(Statics.field956, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2001(Statics.field956, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field985 != null) {
            for (int var7 = 0; var7 < this.field985.length; var7++) {
                var4.method2013(this.field985[var7], this.field988[var7]);
            }
        }
        if (this.field965 != null) {
            for (int var8 = 0; var8 < this.field965.length; var8++) {
                var4.method2000(this.field965[var8], this.field966[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ax.o(I)V")
    public static void method800() {
        field957.method3185();
        field958.method3185();
        field968.method3185();
    }
}
