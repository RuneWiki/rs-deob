package deob;

@ObfuscatedName("as")
public class class40 extends class174 {

    @ObfuscatedName("as.x")
    public static class170 field970 = new class170(64);

    @ObfuscatedName("as.o")
    public static class170 field971 = new class170(50);

    @ObfuscatedName("as.a")
    public static class170 field981 = new class170(100);

    @ObfuscatedName("as.i")
    public int field974;

    @ObfuscatedName("as.y")
    public int field975;

    @ObfuscatedName("as.m")
    public String field988 = "null";

    @ObfuscatedName("as.u")
    public short[] field1007;

    @ObfuscatedName("as.s")
    public short[] field972;

    @ObfuscatedName("as.e")
    public short[] field979;

    @ObfuscatedName("as.r")
    public short[] field996;

    @ObfuscatedName("as.n")
    public int field997 = 2000;

    @ObfuscatedName("as.g")
    public int field982 = 0;

    @ObfuscatedName("as.c")
    public int field983 = 0;

    @ObfuscatedName("as.v")
    public int field984 = 0;

    @ObfuscatedName("as.b")
    public int field968 = 0;

    @ObfuscatedName("as.k")
    public int field986 = 0;

    @ObfuscatedName("as.t")
    public int field987 = 0;

    @ObfuscatedName("as.f")
    public int field973 = 1;

    @ObfuscatedName("as.h")
    public boolean field1003 = false;

    @ObfuscatedName("as.j")
    public String[] field990 = new String[] { null, null, class135.field2312, null, null };

    @ObfuscatedName("as.q")
    public String[] field991 = new String[] { null, null, null, null, class135.field2091 };

    @ObfuscatedName("as.z")
    public int field992 = -1;

    @ObfuscatedName("as.af")
    public int field989 = -1;

    @ObfuscatedName("as.ap")
    public int field994 = 0;

    @ObfuscatedName("as.ah")
    public int field995 = -1;

    @ObfuscatedName("as.at")
    public int field993 = -1;

    @ObfuscatedName("as.aa")
    public int field985 = 0;

    @ObfuscatedName("as.ae")
    public int field977 = -1;

    @ObfuscatedName("as.aw")
    public int field999 = -1;

    @ObfuscatedName("as.ar")
    public int field1000 = -1;

    @ObfuscatedName("as.ai")
    public int field980 = -1;

    @ObfuscatedName("as.au")
    public int field1002 = -1;

    @ObfuscatedName("as.ay")
    public int field976 = -1;

    @ObfuscatedName("as.an")
    public int[] field1004;

    @ObfuscatedName("as.al")
    public int[] field1001;

    @ObfuscatedName("as.as")
    public int field1006 = -1;

    @ObfuscatedName("as.az")
    public int field978 = -1;

    @ObfuscatedName("as.aq")
    public int field1008 = 128;

    @ObfuscatedName("as.ag")
    public int field998 = 128;

    @ObfuscatedName("as.aj")
    public int field1010 = 128;

    @ObfuscatedName("as.ak")
    public int field1011 = 0;

    @ObfuscatedName("as.ac")
    public int field1012 = 0;

    @ObfuscatedName("as.ab")
    public int field1013 = 0;

    @ObfuscatedName("ej.p(Leh;Leh;ZLgg;I)V")
    public static void method3033(class153 arg0, class153 arg1, boolean arg2, class183 arg3) {
        Statics.field1009 = arg0;
        Statics.field1005 = arg1;
        Statics.field245 = arg2;
        Statics.field1009.method3117(10);
        Statics.field969 = arg3;
    }

    @ObfuscatedName("o.l(II)Las;")
    public static class40 method31(int arg0) {
        class40 var1 = (class40) field970.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1009.method3078(10, arg0);
        class40 var3 = new class40();
        var3.field974 = arg0;
        if (var2 != null) {
            var3.method841(new class127(var2));
        }
        var3.method840();
        if (var3.field978 != -1) {
            var3.method839(method31(var3.field978), method31(var3.field1006));
        }
        if (!Statics.field245 && var3.field1003) {
            var3.field988 = class135.field2115;
            var3.field990 = null;
            var3.field991 = null;
            var3.field1013 = 0;
        }
        field970.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.d(I)V")
    public void method840() {
    }

    @ObfuscatedName("as.x(Lds;I)V")
    public void method841(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method851(arg0, var2);
        }
    }

    @ObfuscatedName("as.o(Lds;II)V")
    public void method851(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field975 = arg0.method2581();
        } else if (arg1 == 2) {
            this.field988 = arg0.method2506();
        } else if (arg1 == 4) {
            this.field997 = arg0.method2581();
        } else if (arg1 == 5) {
            this.field982 = arg0.method2581();
        } else if (arg1 == 6) {
            this.field983 = arg0.method2581();
        } else if (arg1 == 7) {
            this.field968 = arg0.method2581();
            if (this.field968 > 32767) {
                this.field968 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field986 = arg0.method2581();
            if (this.field986 > 32767) {
                this.field986 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field987 = 1;
        } else if (arg1 == 12) {
            this.field973 = arg0.method2489();
        } else if (arg1 == 16) {
            this.field1003 = true;
        } else if (arg1 == 23) {
            this.field992 = arg0.method2581();
            this.field994 = arg0.method2498();
        } else if (arg1 == 24) {
            this.field989 = arg0.method2581();
        } else if (arg1 == 25) {
            this.field995 = arg0.method2581();
            this.field985 = arg0.method2498();
        } else if (arg1 == 26) {
            this.field993 = arg0.method2581();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field990[arg1 - 30] = arg0.method2506();
            if (this.field990[arg1 - 30].equalsIgnoreCase(class135.field2210)) {
                this.field990[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field991[arg1 - 35] = arg0.method2506();
        } else if (arg1 == 40) {
            int var3 = arg0.method2498();
            this.field1007 = new short[var3];
            this.field972 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1007[var4] = (short) arg0.method2581();
                this.field972[var4] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2498();
            this.field979 = new short[var5];
            this.field996 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field979[var6] = (short) arg0.method2581();
                this.field996[var6] = (short) arg0.method2581();
            }
        } else if (arg1 == 78) {
            this.field977 = arg0.method2581();
        } else if (arg1 == 79) {
            this.field999 = arg0.method2581();
        } else if (arg1 == 90) {
            this.field1000 = arg0.method2581();
        } else if (arg1 == 91) {
            this.field1002 = arg0.method2581();
        } else if (arg1 == 92) {
            this.field980 = arg0.method2581();
        } else if (arg1 == 93) {
            this.field976 = arg0.method2581();
        } else if (arg1 == 95) {
            this.field984 = arg0.method2581();
        } else if (arg1 == 97) {
            this.field1006 = arg0.method2581();
        } else if (arg1 == 98) {
            this.field978 = arg0.method2581();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1004 == null) {
                this.field1004 = new int[10];
                this.field1001 = new int[10];
            }
            this.field1004[arg1 - 100] = arg0.method2581();
            this.field1001[arg1 - 100] = arg0.method2581();
        } else if (arg1 == 110) {
            this.field1008 = arg0.method2581();
        } else if (arg1 == 111) {
            this.field998 = arg0.method2581();
        } else if (arg1 == 112) {
            this.field1010 = arg0.method2581();
        } else if (arg1 == 113) {
            this.field1011 = arg0.method2499();
        } else if (arg1 == 114) {
            this.field1012 = arg0.method2499() * 5;
        } else if (arg1 == 115) {
            this.field1013 = arg0.method2498();
        }
    }

    @ObfuscatedName("as.a(Las;Las;I)V")
    public void method839(class40 arg0, class40 arg1) {
        this.field975 = arg0.field975;
        this.field997 = arg0.field997;
        this.field982 = arg0.field982;
        this.field983 = arg0.field983;
        this.field984 = arg0.field984;
        this.field968 = arg0.field968;
        this.field986 = arg0.field986;
        this.field1007 = arg0.field1007;
        this.field972 = arg0.field972;
        this.field979 = arg0.field979;
        this.field996 = arg0.field996;
        this.field988 = arg1.field988;
        this.field1003 = arg1.field1003;
        this.field973 = arg1.field973;
        this.field987 = 1;
    }

    @ObfuscatedName("as.w(II)Lcm;")
    public final class101 method844(int arg0) {
        if (this.field1004 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1001[var3] && this.field1001[var3] != 0) {
                    var2 = this.field1004[var3];
                }
            }
            if (var2 != -1) {
                return method31(var2).method844(1);
            }
        }
        class101 var4 = class101.method2098(Statics.field1005, this.field975, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1008 != 128 || this.field998 != 128 || this.field1010 != 128) {
            var4.method2100(this.field1008, this.field998, this.field1010);
        }
        if (this.field1007 != null) {
            for (int var5 = 0; var5 < this.field1007.length; var5++) {
                var4.method2097(this.field1007[var5], this.field972[var5]);
            }
        }
        if (this.field979 != null) {
            for (int var6 = 0; var6 < this.field979.length; var6++) {
                var4.method2138(this.field979[var6], this.field996[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.i(II)Ldl;")
    public final class112 method845(int arg0) {
        if (this.field1004 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1001[var3] && this.field1001[var3] != 0) {
                    var2 = this.field1004[var3];
                }
            }
            if (var2 != -1) {
                return method31(var2).method845(1);
            }
        }
        class112 var4 = (class112) field971.method3357((long) this.field974);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2098(Statics.field1005, this.field975, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1008 != 128 || this.field998 != 128 || this.field1010 != 128) {
            var5.method2100(this.field1008, this.field998, this.field1010);
        }
        if (this.field1007 != null) {
            for (int var6 = 0; var6 < this.field1007.length; var6++) {
                var5.method2097(this.field1007[var6], this.field972[var6]);
            }
        }
        if (this.field979 != null) {
            for (int var7 = 0; var7 < this.field979.length; var7++) {
                var5.method2138(this.field979[var7], this.field996[var7]);
            }
        }
        class112 var8 = var5.method2084(this.field1011 + 64, this.field1012 + 768, -50, -10, -50);
        var8.field1877 = true;
        field971.method3364(var8, (long) this.field974);
        return var8;
    }

    @ObfuscatedName("as.y(II)Las;")
    public class40 method846(int arg0) {
        if (this.field1004 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1001[var3] && this.field1001[var3] != 0) {
                    var2 = this.field1004[var3];
                }
            }
            if (var2 != -1) {
                return method31(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("u.m(IIIIZI)Lcv;")
    public static final class86 method101(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field981.method3357(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method31(arg0);
        if (arg1 > 1 && var8.field1004 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1001[var10] && var8.field1001[var10] != 0) {
                    var9 = var8.field1004[var10];
                }
            }
            if (var9 != -1) {
                var8 = method31(var9);
            }
        }
        class112 var11 = var8.method845(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field978 != -1) {
            var12 = method101(var8.field1006, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1482;
        int var14 = Statics.field1481;
        int var15 = Statics.field1485;
        int[] var16 = new int[4];
        class89.method1827(var16);
        class86 var17 = new class86(36, 32);
        class89.method1840(var17.field1459, 36, 32);
        class89.method1829();
        class104.method2173();
        class104.method2228(16, 16);
        class104.field1760 = false;
        int var18 = var8.field997;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1779[var8.field982] * var18 >> 16;
        int var20 = class104.field1780[var8.field982] * var18 >> 16;
        var11.method2274();
        var11.method2285(0, var8.field983, var8.field984, var8.field982, var8.field968, var8.field986 + var11.field1546 / 2 + var19, var8.field986 + var20);
        if (arg2 >= 1) {
            var17.method1727(1);
        }
        if (arg2 >= 2) {
            var17.method1727(16777215);
        }
        if (arg3 != 0) {
            var17.method1728(arg3);
        }
        class89.method1840(var17.field1459, 36, 32);
        if (var8.field978 != -1) {
            var12.method1763(0, 0);
        }
        if (!arg4 && (var8.field987 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field969.method3540(method33(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field981.method3364(var17, var5);
        }
        class89.method1840(var13, var14, var15);
        class89.method1828(var16);
        class104.method2173();
        class104.field1760 = true;
        return var17;
    }

    @ObfuscatedName("o.u(II)Ljava/lang/String;")
    public static final String method33(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class135.field2216 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class135.field2095 + "</col>";
        }
    }

    @ObfuscatedName("as.s(ZB)Z")
    public final boolean method847(boolean arg0) {
        int var2 = this.field992;
        int var3 = this.field989;
        int var4 = this.field977;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field993;
            var4 = this.field999;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1005.method3080(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1005.method3080(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1005.method3080(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("as.e(ZS)Lcm;")
    public final class101 method888(boolean arg0) {
        int var2 = this.field992;
        int var3 = this.field989;
        int var4 = this.field977;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field993;
            var4 = this.field999;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2098(Statics.field1005, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2098(Statics.field1005, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2098(Statics.field1005, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field994 != 0) {
            var5.method2162(0, this.field994, 0);
        }
        if (arg0 && this.field985 != 0) {
            var5.method2162(0, this.field985, 0);
        }
        if (this.field1007 != null) {
            for (int var10 = 0; var10 < this.field1007.length; var10++) {
                var5.method2097(this.field1007[var10], this.field972[var10]);
            }
        }
        if (this.field979 != null) {
            for (int var11 = 0; var11 < this.field979.length; var11++) {
                var5.method2138(this.field979[var11], this.field996[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("as.r(ZI)Z")
    public final boolean method863(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field980;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field976;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1005.method3080(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1005.method3080(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("as.n(ZB)Lcm;")
    public final class101 method857(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field980;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field976;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2098(Statics.field1005, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2098(Statics.field1005, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1007 != null) {
            for (int var7 = 0; var7 < this.field1007.length; var7++) {
                var4.method2097(this.field1007[var7], this.field972[var7]);
            }
        }
        if (this.field979 != null) {
            for (int var8 = 0; var8 < this.field979.length; var8++) {
                var4.method2138(this.field979[var8], this.field996[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("d.g(I)V")
    public static void method10() {
        field970.method3360();
        field971.method3360();
        field981.method3360();
    }

    @ObfuscatedName("af.c(I)V")
    public static void method240() {
        field981.method3360();
    }
}
