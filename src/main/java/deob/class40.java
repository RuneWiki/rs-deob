package deob;

@ObfuscatedName("az")
public class class40 extends class174 {

    @ObfuscatedName("az.i")
    public static class170 field982 = new class170(64);

    @ObfuscatedName("az.k")
    public static class170 field980 = new class170(50);

    @ObfuscatedName("az.q")
    public static class170 field1014 = new class170(100);

    @ObfuscatedName("az.v")
    public int field1008;

    @ObfuscatedName("az.y")
    public int field983;

    @ObfuscatedName("az.w")
    public String field977 = "null";

    @ObfuscatedName("az.g")
    public short[] field985;

    @ObfuscatedName("az.s")
    public short[] field1026;

    @ObfuscatedName("az.n")
    public short[] field987;

    @ObfuscatedName("az.x")
    public short[] field988;

    @ObfuscatedName("az.o")
    public int field989 = 2000;

    @ObfuscatedName("az.l")
    public int field990 = 0;

    @ObfuscatedName("az.u")
    public int field1027 = 0;

    @ObfuscatedName("az.z")
    public int field992 = 0;

    @ObfuscatedName("az.d")
    public int field1021 = 0;

    @ObfuscatedName("az.m")
    public int field994 = 0;

    @ObfuscatedName("az.f")
    public int field995 = 0;

    @ObfuscatedName("az.a")
    public int field996 = 1;

    @ObfuscatedName("az.h")
    public boolean field997 = false;

    @ObfuscatedName("az.p")
    public String[] field998 = new String[] { null, null, class135.field2246, null, null };

    @ObfuscatedName("az.e")
    public String[] field1018 = new String[] { null, null, null, null, class135.field2123 };

    @ObfuscatedName("az.r")
    public int field1000 = -1;

    @ObfuscatedName("az.av")
    public int field1001 = -1;

    @ObfuscatedName("az.an")
    public int field1002 = 0;

    @ObfuscatedName("az.ae")
    public int field1003 = -1;

    @ObfuscatedName("az.au")
    public int field1025 = -1;

    @ObfuscatedName("az.ag")
    public int field984 = 0;

    @ObfuscatedName("az.at")
    public int field1006 = -1;

    @ObfuscatedName("az.ac")
    public int field1007 = -1;

    @ObfuscatedName("az.aw")
    public int field1020 = -1;

    @ObfuscatedName("az.ah")
    public int field1009 = -1;

    @ObfuscatedName("az.ai")
    public int field1010 = -1;

    @ObfuscatedName("az.ap")
    public int field999 = -1;

    @ObfuscatedName("az.ad")
    public int[] field1012;

    @ObfuscatedName("az.ay")
    public int[] field1013;

    @ObfuscatedName("az.az")
    public int field1016 = -1;

    @ObfuscatedName("az.ab")
    public int field1015 = -1;

    @ObfuscatedName("az.am")
    public int field1011 = 128;

    @ObfuscatedName("az.as")
    public int field1017 = 128;

    @ObfuscatedName("az.aa")
    public int field1004 = 128;

    @ObfuscatedName("az.af")
    public int field1019 = 0;

    @ObfuscatedName("az.ax")
    public int field981 = 0;

    @ObfuscatedName("az.aq")
    public int field1005 = 0;

    @ObfuscatedName("j.b(Leo;Leo;ZLgw;S)V")
    public static void method24(class153 arg0, class153 arg1, boolean arg2, class183 arg3) {
        Statics.field991 = arg0;
        Statics.field413 = arg1;
        Statics.field978 = arg2;
        Statics.field991.method2973(10);
        Statics.field205 = arg3;
    }

    @ObfuscatedName("cj.c(IB)Laz;")
    public static class40 method1565(int arg0) {
        class40 var1 = (class40) field982.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field991.method2964(10, arg0);
        class40 var3 = new class40();
        var3.field1008 = arg0;
        if (var2 != null) {
            var3.method869(new class127(var2));
        }
        var3.method841();
        if (var3.field1015 != -1) {
            var3.method822(method1565(var3.field1015), method1565(var3.field1016));
        }
        if (!Statics.field978 && var3.field997) {
            var3.field977 = class135.field2168;
            var3.field998 = null;
            var3.field1018 = null;
            var3.field1005 = 0;
        }
        field982.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.j(B)V")
    public void method841() {
    }

    @ObfuscatedName("az.i(Ldv;I)V")
    public void method869(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method821(arg0, var2);
        }
    }

    @ObfuscatedName("az.k(Ldv;II)V")
    public void method821(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field983 = arg0.method2394();
        } else if (arg1 == 2) {
            this.field977 = arg0.method2473();
        } else if (arg1 == 4) {
            this.field989 = arg0.method2394();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2394();
        } else if (arg1 == 6) {
            this.field1027 = arg0.method2394();
        } else if (arg1 == 7) {
            this.field1021 = arg0.method2394();
            if (this.field1021 > 32767) {
                this.field1021 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field994 = arg0.method2394();
            if (this.field994 > 32767) {
                this.field994 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field995 = 1;
        } else if (arg1 == 12) {
            this.field996 = arg0.method2455();
        } else if (arg1 == 16) {
            this.field997 = true;
        } else if (arg1 == 23) {
            this.field1000 = arg0.method2394();
            this.field1002 = arg0.method2416();
        } else if (arg1 == 24) {
            this.field1001 = arg0.method2394();
        } else if (arg1 == 25) {
            this.field1003 = arg0.method2394();
            this.field984 = arg0.method2416();
        } else if (arg1 == 26) {
            this.field1025 = arg0.method2394();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field998[arg1 - 30] = arg0.method2473();
            if (this.field998[arg1 - 30].equalsIgnoreCase(class135.field2310)) {
                this.field998[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1018[arg1 - 35] = arg0.method2473();
        } else if (arg1 == 40) {
            int var3 = arg0.method2416();
            this.field985 = new short[var3];
            this.field1026 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field985[var4] = (short) arg0.method2394();
                this.field1026[var4] = (short) arg0.method2394();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2416();
            this.field987 = new short[var5];
            this.field988 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field987[var6] = (short) arg0.method2394();
                this.field988[var6] = (short) arg0.method2394();
            }
        } else if (arg1 == 78) {
            this.field1006 = arg0.method2394();
        } else if (arg1 == 79) {
            this.field1007 = arg0.method2394();
        } else if (arg1 == 90) {
            this.field1020 = arg0.method2394();
        } else if (arg1 == 91) {
            this.field1010 = arg0.method2394();
        } else if (arg1 == 92) {
            this.field1009 = arg0.method2394();
        } else if (arg1 == 93) {
            this.field999 = arg0.method2394();
        } else if (arg1 == 95) {
            this.field992 = arg0.method2394();
        } else if (arg1 == 97) {
            this.field1016 = arg0.method2394();
        } else if (arg1 == 98) {
            this.field1015 = arg0.method2394();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1012 == null) {
                this.field1012 = new int[10];
                this.field1013 = new int[10];
            }
            this.field1012[arg1 - 100] = arg0.method2394();
            this.field1013[arg1 - 100] = arg0.method2394();
        } else if (arg1 == 110) {
            this.field1011 = arg0.method2394();
        } else if (arg1 == 111) {
            this.field1017 = arg0.method2394();
        } else if (arg1 == 112) {
            this.field1004 = arg0.method2394();
        } else if (arg1 == 113) {
            this.field1019 = arg0.method2397();
        } else if (arg1 == 114) {
            this.field981 = arg0.method2397();
        } else if (arg1 == 115) {
            this.field1005 = arg0.method2416();
        }
    }

    @ObfuscatedName("az.q(Laz;Laz;I)V")
    public void method822(class40 arg0, class40 arg1) {
        this.field983 = arg0.field983;
        this.field989 = arg0.field989;
        this.field990 = arg0.field990;
        this.field1027 = arg0.field1027;
        this.field992 = arg0.field992;
        this.field1021 = arg0.field1021;
        this.field994 = arg0.field994;
        this.field985 = arg0.field985;
        this.field1026 = arg0.field1026;
        this.field987 = arg0.field987;
        this.field988 = arg0.field988;
        this.field977 = arg1.field977;
        this.field997 = arg1.field997;
        this.field996 = arg1.field996;
        this.field995 = 1;
    }

    @ObfuscatedName("az.t(II)Lcu;")
    public final class101 method833(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method1565(var2).method833(1);
            }
        }
        class101 var4 = class101.method2065(Statics.field413, this.field983, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1011 != 128 || this.field1017 != 128 || this.field1004 != 128) {
            var4.method2022(this.field1011, this.field1017, this.field1004);
        }
        if (this.field985 != null) {
            for (int var5 = 0; var5 < this.field985.length; var5++) {
                var4.method2077(this.field985[var5], this.field1026[var5]);
            }
        }
        if (this.field987 != null) {
            for (int var6 = 0; var6 < this.field987.length; var6++) {
                var4.method2013(this.field987[var6], this.field988[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.v(II)Ldr;")
    public final class112 method824(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method1565(var2).method824(1);
            }
        }
        class112 var4 = (class112) field980.method3188((long) this.field1008);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2065(Statics.field413, this.field983, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1011 != 128 || this.field1017 != 128 || this.field1004 != 128) {
            var5.method2022(this.field1011, this.field1017, this.field1004);
        }
        if (this.field985 != null) {
            for (int var6 = 0; var6 < this.field985.length; var6++) {
                var5.method2077(this.field985[var6], this.field1026[var6]);
            }
        }
        if (this.field987 != null) {
            for (int var7 = 0; var7 < this.field987.length; var7++) {
                var5.method2013(this.field987[var7], this.field988[var7]);
            }
        }
        class112 var8 = var5.method2046(this.field1019 + 64, this.field981 * 5 + 768, -50, -10, -50);
        var8.field1895 = true;
        field980.method3190(var8, (long) this.field1008);
        return var8;
    }

    @ObfuscatedName("az.y(II)Laz;")
    public class40 method848(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method1565(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("o.w(IIIIZI)Lcs;")
    public static final class86 method158(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field1014.method3188(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method1565(arg0);
        if (arg1 > 1 && var8.field1012 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1013[var10] && var8.field1013[var10] != 0) {
                    var9 = var8.field1012[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1565(var9);
            }
        }
        class112 var11 = var8.method824(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1015 != -1) {
            var12 = method158(var8.field1016, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1518;
        int var14 = Statics.field1513;
        int var15 = Statics.field1514;
        int[] var16 = new int[4];
        class89.method1745(var16);
        class86 var17 = new class86(36, 32);
        class89.method1741(var17.field1498, 36, 32);
        class89.method1747();
        class104.method2080();
        class104.method2083(16, 16);
        class104.field1780 = false;
        int var18 = var8.field989;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1800[var8.field990] * var18 >> 16;
        int var20 = class104.field1801[var8.field990] * var18 >> 16;
        var11.method2196();
        var11.method2239(0, var8.field1027, var8.field992, var8.field990, var8.field1021, var8.field994 + var11.field1572 / 2 + var19, var8.field994 + var20);
        if (arg2 >= 1) {
            var17.method1704(1);
        }
        if (arg2 >= 2) {
            var17.method1704(16777215);
        }
        if (arg3 != 0) {
            var17.method1720(arg3);
        }
        class89.method1741(var17.field1498, 36, 32);
        if (var8.field1015 != -1) {
            var12.method1659(0, 0);
        }
        if (!arg4 && (var8.field995 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field205;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class135.field2276 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class135.field2274 + "</col>";
            }
            var21.method3367(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1014.method3190(var17, var5);
        }
        class89.method1741(var13, var14, var15);
        class89.method1746(var16);
        class104.method2080();
        class104.field1780 = true;
        return var17;
    }

    @ObfuscatedName("az.g(ZB)Z")
    public final boolean method826(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        int var4 = this.field1006;
        if (arg0) {
            var2 = this.field1003;
            var3 = this.field1025;
            var4 = this.field1007;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field413.method3032(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field413.method3032(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field413.method3032(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("az.s(ZI)Lcu;")
    public final class101 method827(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        int var4 = this.field1006;
        if (arg0) {
            var2 = this.field1003;
            var3 = this.field1025;
            var4 = this.field1007;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2065(Statics.field413, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2065(Statics.field413, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2065(Statics.field413, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1002 != 0) {
            var5.method2067(0, this.field1002, 0);
        }
        if (arg0 && this.field984 != 0) {
            var5.method2067(0, this.field984, 0);
        }
        if (this.field985 != null) {
            for (int var10 = 0; var10 < this.field985.length; var10++) {
                var5.method2077(this.field985[var10], this.field1026[var10]);
            }
        }
        if (this.field987 != null) {
            for (int var11 = 0; var11 < this.field987.length; var11++) {
                var5.method2013(this.field987[var11], this.field988[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("az.n(ZI)Z")
    public final boolean method840(boolean arg0) {
        int var2 = this.field1020;
        int var3 = this.field1009;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field999;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field413.method3032(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field413.method3032(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("az.x(ZI)Lcu;")
    public final class101 method829(boolean arg0) {
        int var2 = this.field1020;
        int var3 = this.field1009;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field999;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2065(Statics.field413, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2065(Statics.field413, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field985 != null) {
            for (int var7 = 0; var7 < this.field985.length; var7++) {
                var4.method2077(this.field985[var7], this.field1026[var7]);
            }
        }
        if (this.field987 != null) {
            for (int var8 = 0; var8 < this.field987.length; var8++) {
                var4.method2013(this.field987[var8], this.field988[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ft.o(I)V")
    public static void method3181() {
        field982.method3191();
        field980.method3191();
        field1014.method3191();
    }

    @ObfuscatedName("ah.l(ZI)V")
    public static void method744(boolean arg0) {
        if (Statics.field978 != arg0) {
            method3181();
            Statics.field978 = arg0;
        }
    }
}
