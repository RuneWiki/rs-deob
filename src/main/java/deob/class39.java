package deob;

@ObfuscatedName("an")
public class class39 extends class173 {

    @ObfuscatedName("an.c")
    public static class169 field958 = new class169(64);

    @ObfuscatedName("an.r")
    public static class169 field959 = new class169(50);

    @ObfuscatedName("an.k")
    public static class169 field971 = new class169(100);

    @ObfuscatedName("an.q")
    public int field979;

    @ObfuscatedName("an.u")
    public int field963;

    @ObfuscatedName("an.s")
    public String field964 = "null";

    @ObfuscatedName("an.l")
    public short[] field965;

    @ObfuscatedName("an.o")
    public short[] field966;

    @ObfuscatedName("an.h")
    public short[] field983;

    @ObfuscatedName("an.p")
    public short[] field991;

    @ObfuscatedName("an.d")
    public int field969 = 2000;

    @ObfuscatedName("an.m")
    public int field970 = 0;

    @ObfuscatedName("an.z")
    public int field980 = 0;

    @ObfuscatedName("an.t")
    public int field972 = 0;

    @ObfuscatedName("an.i")
    public int field962 = 0;

    @ObfuscatedName("an.j")
    public int field973 = 0;

    @ObfuscatedName("an.a")
    public int field975 = 0;

    @ObfuscatedName("an.g")
    public int field1000 = 1;

    @ObfuscatedName("an.x")
    public boolean field977 = false;

    @ObfuscatedName("an.b")
    public String[] field978 = new String[] { null, null, class133.field2091, null, null };

    @ObfuscatedName("an.w")
    public String[] field1001 = new String[] { null, null, null, null, class133.field2068 };

    @ObfuscatedName("an.y")
    public int field981 = -1;

    @ObfuscatedName("an.au")
    public int field1005 = -1;

    @ObfuscatedName("an.az")
    public int field982 = 0;

    @ObfuscatedName("an.ak")
    public int field1006 = -1;

    @ObfuscatedName("an.ah")
    public int field968 = -1;

    @ObfuscatedName("an.aa")
    public int field985 = 0;

    @ObfuscatedName("an.am")
    public int field986 = -1;

    @ObfuscatedName("an.al")
    public int field987 = -1;

    @ObfuscatedName("an.ae")
    public int field988 = -1;

    @ObfuscatedName("an.ab")
    public int field996 = -1;

    @ObfuscatedName("an.as")
    public int field974 = -1;

    @ObfuscatedName("an.ai")
    public int field976 = -1;

    @ObfuscatedName("an.aj")
    public int[] field992;

    @ObfuscatedName("an.an")
    public int[] field993;

    @ObfuscatedName("an.av")
    public int field994 = -1;

    @ObfuscatedName("an.af")
    public int field995 = -1;

    @ObfuscatedName("an.ax")
    public int field990 = 128;

    @ObfuscatedName("an.ao")
    public int field997 = 128;

    @ObfuscatedName("an.aw")
    public int field998 = 128;

    @ObfuscatedName("an.ap")
    public int field999 = 0;

    @ObfuscatedName("an.ay")
    public int field967 = 0;

    @ObfuscatedName("an.ag")
    public int field989 = 0;

    @ObfuscatedName("at.v(IS)Lan;")
    public static class39 method1211(int arg0) {
        class39 var1 = (class39) field958.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field984.method3020(10, arg0);
        class39 var3 = new class39();
        var3.field979 = arg0;
        if (var2 != null) {
            var3.method835(new class126(var2));
        }
        var3.method834();
        if (var3.field995 != -1) {
            var3.method837(method1211(var3.field995), method1211(var3.field994));
        }
        if (!Statics.field957 && var3.field977) {
            var3.field964 = class133.field2166;
            var3.field978 = null;
            var3.field1001 = null;
            var3.field989 = 0;
        }
        field958.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(I)V")
    public void method834() {
    }

    @ObfuscatedName("an.n(Ldr;I)V")
    public void method835(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method836(arg0, var2);
        }
    }

    @ObfuscatedName("an.c(Ldr;II)V")
    public void method836(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field963 = arg0.method2468();
        } else if (arg1 == 2) {
            this.field964 = arg0.method2462();
        } else if (arg1 == 4) {
            this.field969 = arg0.method2468();
        } else if (arg1 == 5) {
            this.field970 = arg0.method2468();
        } else if (arg1 == 6) {
            this.field980 = arg0.method2468();
        } else if (arg1 == 7) {
            this.field962 = arg0.method2468();
            if (this.field962 > 32767) {
                this.field962 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field973 = arg0.method2468();
            if (this.field973 > 32767) {
                this.field973 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field975 = 1;
        } else if (arg1 == 12) {
            this.field1000 = arg0.method2500();
        } else if (arg1 == 16) {
            this.field977 = true;
        } else if (arg1 == 23) {
            this.field981 = arg0.method2468();
            this.field982 = arg0.method2466();
        } else if (arg1 == 24) {
            this.field1005 = arg0.method2468();
        } else if (arg1 == 25) {
            this.field1006 = arg0.method2468();
            this.field985 = arg0.method2466();
        } else if (arg1 == 26) {
            this.field968 = arg0.method2468();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field978[arg1 - 30] = arg0.method2462();
            if (this.field978[arg1 - 30].equalsIgnoreCase(class133.field2069)) {
                this.field978[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1001[arg1 - 35] = arg0.method2462();
        } else if (arg1 == 40) {
            int var3 = arg0.method2466();
            this.field965 = new short[var3];
            this.field966 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field965[var4] = (short) arg0.method2468();
                this.field966[var4] = (short) arg0.method2468();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2466();
            this.field983 = new short[var5];
            this.field991 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field983[var6] = (short) arg0.method2468();
                this.field991[var6] = (short) arg0.method2468();
            }
        } else if (arg1 == 78) {
            this.field986 = arg0.method2468();
        } else if (arg1 == 79) {
            this.field987 = arg0.method2468();
        } else if (arg1 == 90) {
            this.field988 = arg0.method2468();
        } else if (arg1 == 91) {
            this.field974 = arg0.method2468();
        } else if (arg1 == 92) {
            this.field996 = arg0.method2468();
        } else if (arg1 == 93) {
            this.field976 = arg0.method2468();
        } else if (arg1 == 95) {
            this.field972 = arg0.method2468();
        } else if (arg1 == 97) {
            this.field994 = arg0.method2468();
        } else if (arg1 == 98) {
            this.field995 = arg0.method2468();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field992 == null) {
                this.field992 = new int[10];
                this.field993 = new int[10];
            }
            this.field992[arg1 - 100] = arg0.method2468();
            this.field993[arg1 - 100] = arg0.method2468();
        } else if (arg1 == 110) {
            this.field990 = arg0.method2468();
        } else if (arg1 == 111) {
            this.field997 = arg0.method2468();
        } else if (arg1 == 112) {
            this.field998 = arg0.method2468();
        } else if (arg1 == 113) {
            this.field999 = arg0.method2499();
        } else if (arg1 == 114) {
            this.field967 = arg0.method2499();
        } else if (arg1 == 115) {
            this.field989 = arg0.method2466();
        }
    }

    @ObfuscatedName("an.r(Lan;Lan;I)V")
    public void method837(class39 arg0, class39 arg1) {
        this.field963 = arg0.field963;
        this.field969 = arg0.field969;
        this.field970 = arg0.field970;
        this.field980 = arg0.field980;
        this.field972 = arg0.field972;
        this.field962 = arg0.field962;
        this.field973 = arg0.field973;
        this.field965 = arg0.field965;
        this.field966 = arg0.field966;
        this.field983 = arg0.field983;
        this.field991 = arg0.field991;
        this.field964 = arg1.field964;
        this.field977 = arg1.field977;
        this.field1000 = arg1.field1000;
        this.field975 = 1;
    }

    @ObfuscatedName("an.k(II)Lcw;")
    public final class100 method838(int arg0) {
        if (this.field992 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field993[var3] && this.field993[var3] != 0) {
                    var2 = this.field992[var3];
                }
            }
            if (var2 != -1) {
                return method1211(var2).method838(1);
            }
        }
        class100 var4 = class100.method2060(Statics.field1431, this.field963, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field990 != 128 || this.field997 != 128 || this.field998 != 128) {
            var4.method2083(this.field990, this.field997, this.field998);
        }
        if (this.field965 != null) {
            for (int var5 = 0; var5 < this.field965.length; var5++) {
                var4.method2082(this.field965[var5], this.field966[var5]);
            }
        }
        if (this.field983 != null) {
            for (int var6 = 0; var6 < this.field983.length; var6++) {
                var4.method2101(this.field983[var6], this.field991[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.e(II)Ldf;")
    public final class111 method878(int arg0) {
        if (this.field992 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field993[var3] && this.field993[var3] != 0) {
                    var2 = this.field992[var3];
                }
            }
            if (var2 != -1) {
                return method1211(var2).method878(1);
            }
        }
        class111 var4 = (class111) field959.method3224((long) this.field979);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2060(Statics.field1431, this.field963, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field990 != 128 || this.field997 != 128 || this.field998 != 128) {
            var5.method2083(this.field990, this.field997, this.field998);
        }
        if (this.field965 != null) {
            for (int var6 = 0; var6 < this.field965.length; var6++) {
                var5.method2082(this.field965[var6], this.field966[var6]);
            }
        }
        if (this.field983 != null) {
            for (int var7 = 0; var7 < this.field983.length; var7++) {
                var5.method2101(this.field983[var7], this.field991[var7]);
            }
        }
        class111 var8 = var5.method2080(this.field999 + 64, this.field967 * 5 + 768, -50, -10, -50);
        var8.field1868 = true;
        field959.method3231(var8, (long) this.field979);
        return var8;
    }

    @ObfuscatedName("an.q(II)Lan;")
    public class39 method840(int arg0) {
        if (this.field992 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field993[var3] && this.field993[var3] != 0) {
                    var2 = this.field992[var3];
                }
            }
            if (var2 != -1) {
                return method1211(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("n.u(IIIIZS)Lcc;")
    public static final class85 method20(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field971.method3224(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method1211(arg0);
        if (arg1 > 1 && var8.field992 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field993[var10] && var8.field993[var10] != 0) {
                    var9 = var8.field992[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1211(var9);
            }
        }
        class111 var11 = var8.method878(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field995 != -1) {
            var12 = method20(var8.field994, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1468;
        int var14 = Statics.field1465;
        int var15 = Statics.field1469;
        int[] var16 = new int[4];
        class88.method1812(var16);
        class85 var17 = new class85(36, 32);
        class88.method1835(var17.field1448, 36, 32);
        class88.method1814();
        class103.method2143();
        class103.method2146(16, 16);
        class103.field1750 = false;
        int var18 = var8.field969;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1765[var8.field970] * var18 >> 16;
        int var20 = class103.field1771[var8.field970] * var18 >> 16;
        var11.method2253();
        var11.method2265(0, var8.field980, var8.field972, var8.field970, var8.field962, var8.field973 + var11.field1531 / 2 + var19, var8.field973 + var20);
        if (arg2 >= 1) {
            var17.method1711(1);
        }
        if (arg2 >= 2) {
            var17.method1711(16777215);
        }
        if (arg3 != 0) {
            var17.method1712(arg3);
        }
        class88.method1835(var17.field1448, 36, 32);
        if (var8.field995 != -1) {
            var12.method1715(0, 0);
        }
        if (!arg4 && (var8.field975 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field961.method3361(method53(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field971.method3231(var17, var5);
        }
        class88.method1835(var13, var14, var15);
        class88.method1810(var16);
        class103.method2143();
        class103.field1750 = true;
        return var17;
    }

    @ObfuscatedName("q.s(II)Ljava/lang/String;")
    public static final String method53(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class133.field2221 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class133.field2232 + "</col>";
        }
    }

    @ObfuscatedName("an.l(ZI)Z")
    public final boolean method871(boolean arg0) {
        int var2 = this.field981;
        int var3 = this.field1005;
        int var4 = this.field986;
        if (arg0) {
            var2 = this.field1006;
            var3 = this.field968;
            var4 = this.field987;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1431.method2993(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1431.method2993(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1431.method2993(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.o(ZI)Lcw;")
    public final class100 method842(boolean arg0) {
        int var2 = this.field981;
        int var3 = this.field1005;
        int var4 = this.field986;
        if (arg0) {
            var2 = this.field1006;
            var3 = this.field968;
            var4 = this.field987;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2060(Statics.field1431, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2060(Statics.field1431, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2060(Statics.field1431, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field982 != 0) {
            var5.method2072(0, this.field982, 0);
        }
        if (arg0 && this.field985 != 0) {
            var5.method2072(0, this.field985, 0);
        }
        if (this.field965 != null) {
            for (int var10 = 0; var10 < this.field965.length; var10++) {
                var5.method2082(this.field965[var10], this.field966[var10]);
            }
        }
        if (this.field983 != null) {
            for (int var11 = 0; var11 < this.field983.length; var11++) {
                var5.method2101(this.field983[var11], this.field991[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.h(ZB)Z")
    public final boolean method850(boolean arg0) {
        int var2 = this.field988;
        int var3 = this.field996;
        if (arg0) {
            var2 = this.field974;
            var3 = this.field976;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1431.method2993(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1431.method2993(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.p(ZI)Lcw;")
    public final class100 method844(boolean arg0) {
        int var2 = this.field988;
        int var3 = this.field996;
        if (arg0) {
            var2 = this.field974;
            var3 = this.field976;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2060(Statics.field1431, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2060(Statics.field1431, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field965 != null) {
            for (int var7 = 0; var7 < this.field965.length; var7++) {
                var4.method2082(this.field965[var7], this.field966[var7]);
            }
        }
        if (this.field983 != null) {
            for (int var8 = 0; var8 < this.field983.length; var8++) {
                var4.method2101(this.field983[var8], this.field991[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cl.d(I)V")
    public static void method1626() {
        field958.method3227();
        field959.method3227();
        field971.method3227();
    }

    @ObfuscatedName("aa.m(I)V")
    public static void method679() {
        field971.method3227();
    }
}
