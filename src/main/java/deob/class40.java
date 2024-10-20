package deob;

@ObfuscatedName("ao")
public class class40 extends class174 {

    @ObfuscatedName("ao.k")
    public static class170 field990 = new class170(64);

    @ObfuscatedName("ao.n")
    public static class170 field982 = new class170(50);

    @ObfuscatedName("ao.s")
    public static class170 field987 = new class170(100);

    @ObfuscatedName("ao.b")
    public int field968;

    @ObfuscatedName("ao.j")
    public int field969;

    @ObfuscatedName("ao.p")
    public String field989 = "null";

    @ObfuscatedName("ao.l")
    public short[] field993;

    @ObfuscatedName("ao.i")
    public short[] field1002;

    @ObfuscatedName("ao.r")
    public short[] field973;

    @ObfuscatedName("ao.o")
    public short[] field974;

    @ObfuscatedName("ao.c")
    public int field975 = 2000;

    @ObfuscatedName("ao.f")
    public int field976 = 0;

    @ObfuscatedName("ao.a")
    public int field977 = 0;

    @ObfuscatedName("ao.t")
    public int field978 = 0;

    @ObfuscatedName("ao.u")
    public int field979 = 0;

    @ObfuscatedName("ao.z")
    public int field970 = 0;

    @ObfuscatedName("ao.v")
    public int field981 = 0;

    @ObfuscatedName("ao.w")
    public int field1009 = 1;

    @ObfuscatedName("ao.h")
    public boolean field983 = false;

    @ObfuscatedName("ao.q")
    public String[] field984 = new String[] { null, null, class134.field2081, null, null };

    @ObfuscatedName("ao.g")
    public String[] field980 = new String[] { null, null, null, null, class134.field2200 };

    @ObfuscatedName("ao.e")
    public int field986 = -1;

    @ObfuscatedName("ao.as")
    public int field967 = -1;

    @ObfuscatedName("ao.an")
    public int field988 = 0;

    @ObfuscatedName("ao.aj")
    public int field966 = -1;

    @ObfuscatedName("ao.ax")
    public int field965 = -1;

    @ObfuscatedName("ao.av")
    public int field991 = 0;

    @ObfuscatedName("ao.ae")
    public int field985 = -1;

    @ObfuscatedName("ao.am")
    public int field995 = -1;

    @ObfuscatedName("ao.aq")
    public int field994 = -1;

    @ObfuscatedName("ao.at")
    public int field963 = -1;

    @ObfuscatedName("ao.ac")
    public int field996 = -1;

    @ObfuscatedName("ao.al")
    public int field997 = -1;

    @ObfuscatedName("ao.ab")
    public int[] field998;

    @ObfuscatedName("ao.aa")
    public int[] field999;

    @ObfuscatedName("ao.ao")
    public int field1000 = -1;

    @ObfuscatedName("ao.ah")
    public int field1001 = -1;

    @ObfuscatedName("ao.au")
    public int field1006 = 128;

    @ObfuscatedName("ao.aw")
    public int field1003 = 128;

    @ObfuscatedName("ao.az")
    public int field1004 = 128;

    @ObfuscatedName("ao.af")
    public int field1005 = 0;

    @ObfuscatedName("ao.ap")
    public int field992 = 0;

    @ObfuscatedName("ao.ak")
    public int field1007 = 0;

    @ObfuscatedName("d.y(IB)Lao;")
    public static class40 method30(int arg0) {
        class40 var1 = (class40) field990.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field971.method2991(10, arg0);
        class40 var3 = new class40();
        var3.field968 = arg0;
        if (var2 != null) {
            var3.method864(new class127(var2));
        }
        var3.method843();
        if (var3.field1001 != -1) {
            var3.method846(method30(var3.field1001), method30(var3.field1000));
        }
        if (!Statics.field378 && var3.field983) {
            var3.field989 = class134.field2123;
            var3.field984 = null;
            var3.field980 = null;
            var3.field1007 = 0;
        }
        field990.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.m(S)V")
    public void method843() {
    }

    @ObfuscatedName("ao.d(Ldp;I)V")
    public void method864(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method845(arg0, var2);
        }
    }

    @ObfuscatedName("ao.k(Ldp;II)V")
    public void method845(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field969 = arg0.method2460();
        } else if (arg1 == 2) {
            this.field989 = arg0.method2466();
        } else if (arg1 == 4) {
            this.field975 = arg0.method2460();
        } else if (arg1 == 5) {
            this.field976 = arg0.method2460();
        } else if (arg1 == 6) {
            this.field977 = arg0.method2460();
        } else if (arg1 == 7) {
            this.field979 = arg0.method2460();
            if (this.field979 > 32767) {
                this.field979 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field970 = arg0.method2460();
            if (this.field970 > 32767) {
                this.field970 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field981 = 1;
        } else if (arg1 == 12) {
            this.field1009 = arg0.method2628();
        } else if (arg1 == 16) {
            this.field983 = true;
        } else if (arg1 == 23) {
            this.field986 = arg0.method2460();
            this.field988 = arg0.method2534();
        } else if (arg1 == 24) {
            this.field967 = arg0.method2460();
        } else if (arg1 == 25) {
            this.field966 = arg0.method2460();
            this.field991 = arg0.method2534();
        } else if (arg1 == 26) {
            this.field965 = arg0.method2460();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field984[arg1 - 30] = arg0.method2466();
            if (this.field984[arg1 - 30].equalsIgnoreCase(class134.field2083)) {
                this.field984[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field980[arg1 - 35] = arg0.method2466();
        } else if (arg1 == 40) {
            int var3 = arg0.method2534();
            this.field993 = new short[var3];
            this.field1002 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field993[var4] = (short) arg0.method2460();
                this.field1002[var4] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2534();
            this.field973 = new short[var5];
            this.field974 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field973[var6] = (short) arg0.method2460();
                this.field974[var6] = (short) arg0.method2460();
            }
        } else if (arg1 == 78) {
            this.field985 = arg0.method2460();
        } else if (arg1 == 79) {
            this.field995 = arg0.method2460();
        } else if (arg1 == 90) {
            this.field994 = arg0.method2460();
        } else if (arg1 == 91) {
            this.field996 = arg0.method2460();
        } else if (arg1 == 92) {
            this.field963 = arg0.method2460();
        } else if (arg1 == 93) {
            this.field997 = arg0.method2460();
        } else if (arg1 == 95) {
            this.field978 = arg0.method2460();
        } else if (arg1 == 97) {
            this.field1000 = arg0.method2460();
        } else if (arg1 == 98) {
            this.field1001 = arg0.method2460();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field998 == null) {
                this.field998 = new int[10];
                this.field999 = new int[10];
            }
            this.field998[arg1 - 100] = arg0.method2460();
            this.field999[arg1 - 100] = arg0.method2460();
        } else if (arg1 == 110) {
            this.field1006 = arg0.method2460();
        } else if (arg1 == 111) {
            this.field1003 = arg0.method2460();
        } else if (arg1 == 112) {
            this.field1004 = arg0.method2460();
        } else if (arg1 == 113) {
            this.field1005 = arg0.method2459();
        } else if (arg1 == 114) {
            this.field992 = arg0.method2459() * 5;
        } else if (arg1 == 115) {
            this.field1007 = arg0.method2534();
        }
    }

    @ObfuscatedName("ao.n(Lao;Lao;I)V")
    public void method846(class40 arg0, class40 arg1) {
        this.field969 = arg0.field969;
        this.field975 = arg0.field975;
        this.field976 = arg0.field976;
        this.field977 = arg0.field977;
        this.field978 = arg0.field978;
        this.field979 = arg0.field979;
        this.field970 = arg0.field970;
        this.field993 = arg0.field993;
        this.field1002 = arg0.field1002;
        this.field973 = arg0.field973;
        this.field974 = arg0.field974;
        this.field989 = arg1.field989;
        this.field983 = arg1.field983;
        this.field1009 = arg1.field1009;
        this.field981 = 1;
    }

    @ObfuscatedName("ao.s(II)Lcq;")
    public final class101 method842(int arg0) {
        if (this.field998 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field999[var3] && this.field999[var3] != 0) {
                    var2 = this.field998[var3];
                }
            }
            if (var2 != -1) {
                return method30(var2).method842(1);
            }
        }
        class101 var4 = class101.method2060(Statics.field964, this.field969, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1006 != 128 || this.field1003 != 128 || this.field1004 != 128) {
            var4.method2112(this.field1006, this.field1003, this.field1004);
        }
        if (this.field993 != null) {
            for (int var5 = 0; var5 < this.field993.length; var5++) {
                var4.method2108(this.field993[var5], this.field1002[var5]);
            }
        }
        if (this.field973 != null) {
            for (int var6 = 0; var6 < this.field973.length; var6++) {
                var4.method2073(this.field973[var6], this.field974[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ao.x(II)Ldw;")
    public final class112 method863(int arg0) {
        if (this.field998 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field999[var3] && this.field999[var3] != 0) {
                    var2 = this.field998[var3];
                }
            }
            if (var2 != -1) {
                return method30(var2).method863(1);
            }
        }
        class112 var4 = (class112) field982.method3288((long) this.field968);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2060(Statics.field964, this.field969, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1006 != 128 || this.field1003 != 128 || this.field1004 != 128) {
            var5.method2112(this.field1006, this.field1003, this.field1004);
        }
        if (this.field993 != null) {
            for (int var6 = 0; var6 < this.field993.length; var6++) {
                var5.method2108(this.field993[var6], this.field1002[var6]);
            }
        }
        if (this.field973 != null) {
            for (int var7 = 0; var7 < this.field973.length; var7++) {
                var5.method2073(this.field973[var7], this.field974[var7]);
            }
        }
        class112 var8 = var5.method2081(this.field1005 + 64, this.field992 + 768, -50, -10, -50);
        var8.field1885 = true;
        field982.method3291(var8, (long) this.field968);
        return var8;
    }

    @ObfuscatedName("ao.b(II)Lao;")
    public class40 method849(int arg0) {
        if (this.field998 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field999[var3] && this.field999[var3] != 0) {
                    var2 = this.field998[var3];
                }
            }
            if (var2 != -1) {
                return method30(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("c.j(IIIIZI)Lcz;")
    public static final class86 method128(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field987.method3288(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method30(arg0);
        if (arg1 > 1 && var8.field998 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field999[var10] && var8.field999[var10] != 0) {
                    var9 = var8.field998[var10];
                }
            }
            if (var9 != -1) {
                var8 = method30(var9);
            }
        }
        class112 var11 = var8.method863(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1001 != -1) {
            var12 = method128(var8.field1000, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1480;
        int var14 = Statics.field1481;
        int var15 = Statics.field1486;
        int[] var16 = new int[4];
        class89.method1841(var16);
        class86 var17 = new class86(36, 32);
        class89.method1793(var17.field1459, 36, 32);
        class89.method1799();
        class104.method2155();
        class104.method2147(16, 16);
        class104.field1750 = false;
        int var18 = var8.field975;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1770[var8.field976] * var18 >> 16;
        int var20 = class104.field1771[var8.field976] * var18 >> 16;
        var11.method2277();
        var11.method2260(0, var8.field977, var8.field978, var8.field976, var8.field979, var8.field970 + var11.field1541 / 2 + var19, var8.field970 + var20);
        if (arg2 >= 1) {
            var17.method1691(1);
        }
        if (arg2 >= 2) {
            var17.method1691(16777215);
        }
        if (arg3 != 0) {
            var17.method1717(arg3);
        }
        class89.method1793(var17.field1459, 36, 32);
        if (var8.field1001 != -1) {
            var12.method1704(0, 0);
        }
        if (!arg4 && (var8.field981 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field250.method3484(method839(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field987.method3291(var17, var5);
        }
        class89.method1793(var13, var14, var15);
        class89.method1823(var16);
        class104.method2155();
        class104.field1750 = true;
        return var17;
    }

    @ObfuscatedName("aa.p(II)Ljava/lang/String;")
    public static final String method839(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class134.field2235 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class134.field2233 + "</col>";
        }
    }

    @ObfuscatedName("ao.l(ZI)Z")
    public final boolean method850(boolean arg0) {
        int var2 = this.field986;
        int var3 = this.field967;
        int var4 = this.field985;
        if (arg0) {
            var2 = this.field966;
            var3 = this.field965;
            var4 = this.field995;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field964.method2993(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field964.method2993(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field964.method2993(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ao.i(ZI)Lcq;")
    public final class101 method856(boolean arg0) {
        int var2 = this.field986;
        int var3 = this.field967;
        int var4 = this.field985;
        if (arg0) {
            var2 = this.field966;
            var3 = this.field965;
            var4 = this.field995;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2060(Statics.field964, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2060(Statics.field964, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2060(Statics.field964, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field988 != 0) {
            var5.method2072(0, this.field988, 0);
        }
        if (arg0 && this.field991 != 0) {
            var5.method2072(0, this.field991, 0);
        }
        if (this.field993 != null) {
            for (int var10 = 0; var10 < this.field993.length; var10++) {
                var5.method2108(this.field993[var10], this.field1002[var10]);
            }
        }
        if (this.field973 != null) {
            for (int var11 = 0; var11 < this.field973.length; var11++) {
                var5.method2073(this.field973[var11], this.field974[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ao.r(ZB)Z")
    public final boolean method852(boolean arg0) {
        int var2 = this.field994;
        int var3 = this.field963;
        if (arg0) {
            var2 = this.field996;
            var3 = this.field997;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field964.method2993(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field964.method2993(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ao.o(ZI)Lcq;")
    public final class101 method853(boolean arg0) {
        int var2 = this.field994;
        int var3 = this.field963;
        if (arg0) {
            var2 = this.field996;
            var3 = this.field997;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2060(Statics.field964, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2060(Statics.field964, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field993 != null) {
            for (int var7 = 0; var7 < this.field993.length; var7++) {
                var4.method2108(this.field993[var7], this.field1002[var7]);
            }
        }
        if (this.field973 != null) {
            for (int var8 = 0; var8 < this.field973.length; var8++) {
                var4.method2073(this.field973[var8], this.field974[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cf.c(ZS)V")
    public static void method2056(boolean arg0) {
        if (Statics.field378 != arg0) {
            field990.method3297();
            field982.method3297();
            field987.method3297();
            Statics.field378 = arg0;
        }
    }
}
