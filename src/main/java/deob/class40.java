package deob;

@ObfuscatedName("ad")
public class class40 extends class174 {

    @ObfuscatedName("ad.a")
    public static class170 field955 = new class170(64);

    @ObfuscatedName("ad.q")
    public static class170 field959 = new class170(50);

    @ObfuscatedName("ad.j")
    public static class170 field957 = new class170(100);

    @ObfuscatedName("ad.w")
    public int field958;

    @ObfuscatedName("ad.l")
    public int field984;

    @ObfuscatedName("ad.s")
    public String field960 = "null";

    @ObfuscatedName("ad.n")
    public short[] field961;

    @ObfuscatedName("ad.c")
    public short[] field962;

    @ObfuscatedName("ad.h")
    public short[] field966;

    @ObfuscatedName("ad.u")
    public short[] field964;

    @ObfuscatedName("ad.y")
    public int field983 = 2000;

    @ObfuscatedName("ad.b")
    public int field997 = 0;

    @ObfuscatedName("ad.t")
    public int field967 = 0;

    @ObfuscatedName("ad.r")
    public int field971 = 0;

    @ObfuscatedName("ad.g")
    public int field969 = 0;

    @ObfuscatedName("ad.m")
    public int field979 = 0;

    @ObfuscatedName("ad.o")
    public int field985 = 0;

    @ObfuscatedName("ad.e")
    public int field998 = 1;

    @ObfuscatedName("ad.f")
    public boolean field972 = false;

    @ObfuscatedName("ad.i")
    public String[] field982 = new String[] { null, null, class134.field2055, null, null };

    @ObfuscatedName("ad.d")
    public String[] field975 = new String[] { null, null, null, null, class134.field2056 };

    @ObfuscatedName("ad.z")
    public int field976 = -1;

    @ObfuscatedName("ad.ai")
    public int field977 = -1;

    @ObfuscatedName("ad.ag")
    public int field978 = 0;

    @ObfuscatedName("ad.as")
    public int field996 = -1;

    @ObfuscatedName("ad.al")
    public int field980 = -1;

    @ObfuscatedName("ad.aj")
    public int field981 = 0;

    @ObfuscatedName("ad.am")
    public int field990 = -1;

    @ObfuscatedName("ad.ab")
    public int field973 = -1;

    @ObfuscatedName("ad.ao")
    public int field963 = -1;

    @ObfuscatedName("ad.ac")
    public int field954 = -1;

    @ObfuscatedName("ad.ap")
    public int field986 = -1;

    @ObfuscatedName("ad.at")
    public int field987 = -1;

    @ObfuscatedName("ad.az")
    public int[] field988;

    @ObfuscatedName("ad.ae")
    public int[] field989;

    @ObfuscatedName("ad.ad")
    public int field968 = -1;

    @ObfuscatedName("ad.aw")
    public int field991 = -1;

    @ObfuscatedName("ad.an")
    public int field970 = 128;

    @ObfuscatedName("ad.aq")
    public int field993 = 128;

    @ObfuscatedName("ad.ax")
    public int field994 = 128;

    @ObfuscatedName("ad.af")
    public int field995 = 0;

    @ObfuscatedName("ad.ar")
    public int field974 = 0;

    @ObfuscatedName("ad.ay")
    public int field956 = 0;

    @ObfuscatedName("c.p(II)Lad;")
    public static class40 method125(int arg0) {
        class40 var1 = (class40) field955.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2698.method2920(10, arg0);
        class40 var3 = new class40();
        var3.field958 = arg0;
        if (var2 != null) {
            var3.method806(new class127(var2));
        }
        var3.method805();
        if (var3.field991 != -1) {
            var3.method808(method125(var3.field991), method125(var3.field968));
        }
        if (!Statics.field2828 && var3.field972) {
            var3.field960 = class134.field2246;
            var3.field982 = null;
            var3.field975 = null;
            var3.field956 = 0;
        }
        field955.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.k(B)V")
    public void method805() {
    }

    @ObfuscatedName("ad.a(Ldg;I)V")
    public void method806(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method819(arg0, var2);
        }
    }

    @ObfuscatedName("ad.q(Ldg;II)V")
    public void method819(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field984 = arg0.method2539();
        } else if (arg1 == 2) {
            this.field960 = arg0.method2571();
        } else if (arg1 == 4) {
            this.field983 = arg0.method2539();
        } else if (arg1 == 5) {
            this.field997 = arg0.method2539();
        } else if (arg1 == 6) {
            this.field967 = arg0.method2539();
        } else if (arg1 == 7) {
            this.field969 = arg0.method2539();
            if (this.field969 > 32767) {
                this.field969 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field979 = arg0.method2539();
            if (this.field979 > 32767) {
                this.field979 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field985 = 1;
        } else if (arg1 == 12) {
            this.field998 = arg0.method2415();
        } else if (arg1 == 16) {
            this.field972 = true;
        } else if (arg1 == 23) {
            this.field976 = arg0.method2539();
            this.field978 = arg0.method2484();
        } else if (arg1 == 24) {
            this.field977 = arg0.method2539();
        } else if (arg1 == 25) {
            this.field996 = arg0.method2539();
            this.field981 = arg0.method2484();
        } else if (arg1 == 26) {
            this.field980 = arg0.method2539();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field982[arg1 - 30] = arg0.method2571();
            if (this.field982[arg1 - 30].equalsIgnoreCase(class134.field2057)) {
                this.field982[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field975[arg1 - 35] = arg0.method2571();
        } else if (arg1 == 40) {
            int var3 = arg0.method2484();
            this.field961 = new short[var3];
            this.field962 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field961[var4] = (short) arg0.method2539();
                this.field962[var4] = (short) arg0.method2539();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2484();
            this.field966 = new short[var5];
            this.field964 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field966[var6] = (short) arg0.method2539();
                this.field964[var6] = (short) arg0.method2539();
            }
        } else if (arg1 == 78) {
            this.field990 = arg0.method2539();
        } else if (arg1 == 79) {
            this.field973 = arg0.method2539();
        } else if (arg1 == 90) {
            this.field963 = arg0.method2539();
        } else if (arg1 == 91) {
            this.field986 = arg0.method2539();
        } else if (arg1 == 92) {
            this.field954 = arg0.method2539();
        } else if (arg1 == 93) {
            this.field987 = arg0.method2539();
        } else if (arg1 == 95) {
            this.field971 = arg0.method2539();
        } else if (arg1 == 97) {
            this.field968 = arg0.method2539();
        } else if (arg1 == 98) {
            this.field991 = arg0.method2539();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field988 == null) {
                this.field988 = new int[10];
                this.field989 = new int[10];
            }
            this.field988[arg1 - 100] = arg0.method2539();
            this.field989[arg1 - 100] = arg0.method2539();
        } else if (arg1 == 110) {
            this.field970 = arg0.method2539();
        } else if (arg1 == 111) {
            this.field993 = arg0.method2539();
        } else if (arg1 == 112) {
            this.field994 = arg0.method2539();
        } else if (arg1 == 113) {
            this.field995 = arg0.method2411();
        } else if (arg1 == 114) {
            this.field974 = arg0.method2411() * 5;
        } else if (arg1 == 115) {
            this.field956 = arg0.method2484();
        }
    }

    @ObfuscatedName("ad.j(Lad;Lad;I)V")
    public void method808(class40 arg0, class40 arg1) {
        this.field984 = arg0.field984;
        this.field983 = arg0.field983;
        this.field997 = arg0.field997;
        this.field967 = arg0.field967;
        this.field971 = arg0.field971;
        this.field969 = arg0.field969;
        this.field979 = arg0.field979;
        this.field961 = arg0.field961;
        this.field962 = arg0.field962;
        this.field966 = arg0.field966;
        this.field964 = arg0.field964;
        this.field960 = arg1.field960;
        this.field972 = arg1.field972;
        this.field998 = arg1.field998;
        this.field985 = 1;
    }

    @ObfuscatedName("ad.v(II)Lcy;")
    public final class101 method836(int arg0) {
        if (this.field988 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field989[var3] && this.field989[var3] != 0) {
                    var2 = this.field988[var3];
                }
            }
            if (var2 != -1) {
                return method125(var2).method836(1);
            }
        }
        class101 var4 = class101.method2034(Statics.field965, this.field984, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field970 != 128 || this.field993 != 128 || this.field994 != 128) {
            var4.method2003(this.field970, this.field993, this.field994);
        }
        if (this.field961 != null) {
            for (int var5 = 0; var5 < this.field961.length; var5++) {
                var4.method2016(this.field961[var5], this.field962[var5]);
            }
        }
        if (this.field966 != null) {
            for (int var6 = 0; var6 < this.field966.length; var6++) {
                var4.method2017(this.field966[var6], this.field964[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.w(IB)Ldi;")
    public final class112 method810(int arg0) {
        if (this.field988 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field989[var3] && this.field989[var3] != 0) {
                    var2 = this.field988[var3];
                }
            }
            if (var2 != -1) {
                return method125(var2).method810(1);
            }
        }
        class112 var4 = (class112) field959.method3196((long) this.field958);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2034(Statics.field965, this.field984, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field970 != 128 || this.field993 != 128 || this.field994 != 128) {
            var5.method2003(this.field970, this.field993, this.field994);
        }
        if (this.field961 != null) {
            for (int var6 = 0; var6 < this.field961.length; var6++) {
                var5.method2016(this.field961[var6], this.field962[var6]);
            }
        }
        if (this.field966 != null) {
            for (int var7 = 0; var7 < this.field966.length; var7++) {
                var5.method2017(this.field966[var7], this.field964[var7]);
            }
        }
        class112 var8 = var5.method2004(this.field995 + 64, this.field974 + 768, -50, -10, -50);
        var8.field1854 = true;
        field959.method3197(var8, (long) this.field958);
        return var8;
    }

    @ObfuscatedName("ad.l(IS)Lad;")
    public class40 method811(int arg0) {
        if (this.field988 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field989[var3] && this.field989[var3] != 0) {
                    var2 = this.field988[var3];
                }
            }
            if (var2 != -1) {
                return method125(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("e.s(IIIIZI)Lcm;")
    public static final class86 method202(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field957.method3196(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method125(arg0);
        if (arg1 > 1 && var8.field988 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field989[var10] && var8.field989[var10] != 0) {
                    var9 = var8.field988[var10];
                }
            }
            if (var9 != -1) {
                var8 = method125(var9);
            }
        }
        class112 var11 = var8.method810(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field991 != -1) {
            var12 = method202(var8.field968, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1467;
        int var14 = Statics.field1462;
        int var15 = Statics.field1463;
        int[] var16 = new int[4];
        class89.method1771(var16);
        class86 var17 = new class86(36, 32);
        class89.method1729(var17.field1444, 36, 32);
        class89.method1735();
        class104.method2086();
        class104.method2089(16, 16);
        class104.field1732 = false;
        int var18 = var8.field983;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1752[var8.field997] * var18 >> 16;
        int var20 = class104.field1731[var8.field997] * var18 >> 16;
        var11.method2242();
        var11.method2205(0, var8.field967, var8.field971, var8.field997, var8.field969, var8.field979 + var11.field1524 / 2 + var19, var8.field979 + var20);
        if (arg2 >= 1) {
            var17.method1631(1);
        }
        if (arg2 >= 2) {
            var17.method1631(16777215);
        }
        if (arg3 != 0) {
            var17.method1661(arg3);
        }
        class89.method1729(var17.field1444, 36, 32);
        if (var8.field991 != -1) {
            var12.method1635(0, 0);
        }
        if (!arg4 && (var8.field985 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field2443.method3327(method1484(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field957.method3197(var17, var5);
        }
        class89.method1729(var13, var14, var15);
        class89.method1734(var16);
        class104.method2086();
        class104.field1732 = true;
        return var17;
    }

    @ObfuscatedName("bp.n(II)Ljava/lang/String;")
    public static final String method1484(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class134.field2081 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class134.field2207 + "</col>";
        }
    }

    @ObfuscatedName("ad.c(ZI)Z")
    public final boolean method812(boolean arg0) {
        int var2 = this.field976;
        int var3 = this.field977;
        int var4 = this.field990;
        if (arg0) {
            var2 = this.field996;
            var3 = this.field980;
            var4 = this.field973;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field965.method2983(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field965.method2983(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field965.method2983(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.h(ZB)Lcy;")
    public final class101 method813(boolean arg0) {
        int var2 = this.field976;
        int var3 = this.field977;
        int var4 = this.field990;
        if (arg0) {
            var2 = this.field996;
            var3 = this.field980;
            var4 = this.field973;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2034(Statics.field965, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2034(Statics.field965, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2034(Statics.field965, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field978 != 0) {
            var5.method2015(0, this.field978, 0);
        }
        if (arg0 && this.field981 != 0) {
            var5.method2015(0, this.field981, 0);
        }
        if (this.field961 != null) {
            for (int var10 = 0; var10 < this.field961.length; var10++) {
                var5.method2016(this.field961[var10], this.field962[var10]);
            }
        }
        if (this.field966 != null) {
            for (int var11 = 0; var11 < this.field966.length; var11++) {
                var5.method2017(this.field966[var11], this.field964[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.u(ZB)Z")
    public final boolean method821(boolean arg0) {
        int var2 = this.field963;
        int var3 = this.field954;
        if (arg0) {
            var2 = this.field986;
            var3 = this.field987;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field965.method2983(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field965.method2983(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.y(ZB)Lcy;")
    public final class101 method815(boolean arg0) {
        int var2 = this.field963;
        int var3 = this.field954;
        if (arg0) {
            var2 = this.field986;
            var3 = this.field987;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2034(Statics.field965, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2034(Statics.field965, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field961 != null) {
            for (int var7 = 0; var7 < this.field961.length; var7++) {
                var4.method2016(this.field961[var7], this.field962[var7]);
            }
        }
        if (this.field966 != null) {
            for (int var8 = 0; var8 < this.field966.length; var8++) {
                var4.method2017(this.field966[var8], this.field964[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("am.b(ZI)V")
    public static void method649(boolean arg0) {
        if (Statics.field2828 != arg0) {
            field955.method3198();
            field959.method3198();
            field957.method3198();
            Statics.field2828 = arg0;
        }
    }
}
