package deob;

@ObfuscatedName("aj")
public class class40 extends class174 {

    @ObfuscatedName("aj.h")
    public static class170 field977 = new class170(64);

    @ObfuscatedName("aj.u")
    public static class170 field991 = new class170(50);

    @ObfuscatedName("aj.a")
    public static class170 field1019 = new class170(100);

    @ObfuscatedName("aj.t")
    public int field981;

    @ObfuscatedName("aj.n")
    public int field982;

    @ObfuscatedName("aj.i")
    public String field1009 = "null";

    @ObfuscatedName("aj.c")
    public short[] field984;

    @ObfuscatedName("aj.b")
    public short[] field997;

    @ObfuscatedName("aj.m")
    public short[] field986;

    @ObfuscatedName("aj.g")
    public short[] field987;

    @ObfuscatedName("aj.x")
    public int field974 = 2000;

    @ObfuscatedName("aj.r")
    public int field989 = 0;

    @ObfuscatedName("aj.s")
    public int field990 = 0;

    @ObfuscatedName("aj.l")
    public int field979 = 0;

    @ObfuscatedName("aj.k")
    public int field992 = 0;

    @ObfuscatedName("aj.w")
    public int field993 = 0;

    @ObfuscatedName("aj.z")
    public int field988 = 0;

    @ObfuscatedName("aj.p")
    public int field995 = 1;

    @ObfuscatedName("aj.v")
    public boolean field1021 = false;

    @ObfuscatedName("aj.d")
    public String[] field1024 = new String[] { null, null, class135.field2244, null, null };

    @ObfuscatedName("aj.e")
    public String[] field1022 = new String[] { null, null, null, null, class135.field2098 };

    @ObfuscatedName("aj.y")
    public int field999 = -1;

    @ObfuscatedName("aj.aw")
    public int field1000 = -1;

    @ObfuscatedName("aj.ai")
    public int field1001 = 0;

    @ObfuscatedName("aj.ah")
    public int field1002 = -1;

    @ObfuscatedName("aj.ad")
    public int field1020 = -1;

    @ObfuscatedName("aj.ak")
    public int field975 = 0;

    @ObfuscatedName("aj.ap")
    public int field1005 = -1;

    @ObfuscatedName("aj.al")
    public int field1006 = -1;

    @ObfuscatedName("aj.am")
    public int field1007 = -1;

    @ObfuscatedName("aj.ab")
    public int field1008 = -1;

    @ObfuscatedName("aj.ax")
    public int field1004 = -1;

    @ObfuscatedName("aj.az")
    public int field1010 = -1;

    @ObfuscatedName("aj.at")
    public int[] field1011;

    @ObfuscatedName("aj.as")
    public int[] field996;

    @ObfuscatedName("aj.aj")
    public int field1013 = -1;

    @ObfuscatedName("aj.aa")
    public int field1014 = -1;

    @ObfuscatedName("aj.au")
    public int field1015 = 128;

    @ObfuscatedName("aj.ae")
    public int field1016 = 128;

    @ObfuscatedName("aj.ao")
    public int field1017 = 128;

    @ObfuscatedName("aj.af")
    public int field1018 = 0;

    @ObfuscatedName("aj.ar")
    public int field1003 = 0;

    @ObfuscatedName("aj.ay")
    public int field983 = 0;

    @ObfuscatedName("al.j(II)Laj;")
    public static class40 method712(int arg0) {
        class40 var1 = (class40) field977.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field998.method3027(10, arg0);
        class40 var3 = new class40();
        var3.field981 = arg0;
        if (var2 != null) {
            var3.method834(new class127(var2));
        }
        var3.method843();
        if (var3.field1014 != -1) {
            var3.method869(method712(var3.field1014), method712(var3.field1013));
        }
        if (!Statics.field976 && var3.field1021) {
            var3.field1009 = class135.field2118;
            var3.field1024 = null;
            var3.field1022 = null;
            var3.field983 = 0;
        }
        field977.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.f(B)V")
    public void method843() {
    }

    @ObfuscatedName("aj.o(Ldq;B)V")
    public void method834(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method835(arg0, var2);
        }
    }

    @ObfuscatedName("aj.h(Ldq;II)V")
    public void method835(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field982 = arg0.method2582();
        } else if (arg1 == 2) {
            this.field1009 = arg0.method2518();
        } else if (arg1 == 4) {
            this.field974 = arg0.method2582();
        } else if (arg1 == 5) {
            this.field989 = arg0.method2582();
        } else if (arg1 == 6) {
            this.field990 = arg0.method2582();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2582();
            if (this.field992 > 32767) {
                this.field992 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field993 = arg0.method2582();
            if (this.field993 > 32767) {
                this.field993 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field988 = 1;
        } else if (arg1 == 12) {
            this.field995 = arg0.method2508();
        } else if (arg1 == 16) {
            this.field1021 = true;
        } else if (arg1 == 23) {
            this.field999 = arg0.method2582();
            this.field1001 = arg0.method2464();
        } else if (arg1 == 24) {
            this.field1000 = arg0.method2582();
        } else if (arg1 == 25) {
            this.field1002 = arg0.method2582();
            this.field975 = arg0.method2464();
        } else if (arg1 == 26) {
            this.field1020 = arg0.method2582();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1024[arg1 - 30] = arg0.method2518();
            if (this.field1024[arg1 - 30].equalsIgnoreCase(class135.field2099)) {
                this.field1024[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1022[arg1 - 35] = arg0.method2518();
        } else if (arg1 == 40) {
            int var3 = arg0.method2464();
            this.field984 = new short[var3];
            this.field997 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field984[var4] = (short) arg0.method2582();
                this.field997[var4] = (short) arg0.method2582();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2464();
            this.field986 = new short[var5];
            this.field987 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field986[var6] = (short) arg0.method2582();
                this.field987[var6] = (short) arg0.method2582();
            }
        } else if (arg1 == 78) {
            this.field1005 = arg0.method2582();
        } else if (arg1 == 79) {
            this.field1006 = arg0.method2582();
        } else if (arg1 == 90) {
            this.field1007 = arg0.method2582();
        } else if (arg1 == 91) {
            this.field1004 = arg0.method2582();
        } else if (arg1 == 92) {
            this.field1008 = arg0.method2582();
        } else if (arg1 == 93) {
            this.field1010 = arg0.method2582();
        } else if (arg1 == 95) {
            this.field979 = arg0.method2582();
        } else if (arg1 == 97) {
            this.field1013 = arg0.method2582();
        } else if (arg1 == 98) {
            this.field1014 = arg0.method2582();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1011 == null) {
                this.field1011 = new int[10];
                this.field996 = new int[10];
            }
            this.field1011[arg1 - 100] = arg0.method2582();
            this.field996[arg1 - 100] = arg0.method2582();
        } else if (arg1 == 110) {
            this.field1015 = arg0.method2582();
        } else if (arg1 == 111) {
            this.field1016 = arg0.method2582();
        } else if (arg1 == 112) {
            this.field1017 = arg0.method2582();
        } else if (arg1 == 113) {
            this.field1018 = arg0.method2449();
        } else if (arg1 == 114) {
            this.field1003 = arg0.method2449();
        } else if (arg1 == 115) {
            this.field983 = arg0.method2464();
        }
    }

    @ObfuscatedName("aj.u(Laj;Laj;I)V")
    public void method869(class40 arg0, class40 arg1) {
        this.field982 = arg0.field982;
        this.field974 = arg0.field974;
        this.field989 = arg0.field989;
        this.field990 = arg0.field990;
        this.field979 = arg0.field979;
        this.field992 = arg0.field992;
        this.field993 = arg0.field993;
        this.field984 = arg0.field984;
        this.field997 = arg0.field997;
        this.field986 = arg0.field986;
        this.field987 = arg0.field987;
        this.field1009 = arg1.field1009;
        this.field1021 = arg1.field1021;
        this.field995 = arg1.field995;
        this.field988 = 1;
    }

    @ObfuscatedName("aj.a(IB)Lch;")
    public final class101 method837(int arg0) {
        if (this.field1011 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field996[var3] && this.field996[var3] != 0) {
                    var2 = this.field1011[var3];
                }
            }
            if (var2 != -1) {
                return method712(var2).method837(1);
            }
        }
        class101 var4 = class101.method2064(Statics.field994, this.field982, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1015 != 128 || this.field1016 != 128 || this.field1017 != 128) {
            var4.method2078(this.field1015, this.field1016, this.field1017);
        }
        if (this.field984 != null) {
            for (int var5 = 0; var5 < this.field984.length; var5++) {
                var4.method2112(this.field984[var5], this.field997[var5]);
            }
        }
        if (this.field986 != null) {
            for (int var6 = 0; var6 < this.field986.length; var6++) {
                var4.method2082(this.field986[var6], this.field987[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.q(II)Ldo;")
    public final class112 method838(int arg0) {
        if (this.field1011 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field996[var3] && this.field996[var3] != 0) {
                    var2 = this.field1011[var3];
                }
            }
            if (var2 != -1) {
                return method712(var2).method838(1);
            }
        }
        class112 var4 = (class112) field991.method3256((long) this.field981);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2064(Statics.field994, this.field982, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1015 != 128 || this.field1016 != 128 || this.field1017 != 128) {
            var5.method2078(this.field1015, this.field1016, this.field1017);
        }
        if (this.field984 != null) {
            for (int var6 = 0; var6 < this.field984.length; var6++) {
                var5.method2112(this.field984[var6], this.field997[var6]);
            }
        }
        if (this.field986 != null) {
            for (int var7 = 0; var7 < this.field986.length; var7++) {
                var5.method2082(this.field986[var7], this.field987[var7]);
            }
        }
        class112 var8 = var5.method2083(this.field1018 + 64, this.field1003 * 5 + 768, -50, -10, -50);
        var8.field1864 = true;
        field991.method3257(var8, (long) this.field981);
        return var8;
    }

    @ObfuscatedName("aj.t(II)Laj;")
    public class40 method855(int arg0) {
        if (this.field1011 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field996[var3] && this.field996[var3] != 0) {
                    var2 = this.field1011[var3];
                }
            }
            if (var2 != -1) {
                return method712(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("w.n(IIIIZI)Lcu;")
    public static final class86 method180(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field1019.method3256(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method712(arg0);
        if (arg1 > 1 && var8.field1011 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field996[var10] && var8.field996[var10] != 0) {
                    var9 = var8.field1011[var10];
                }
            }
            if (var9 != -1) {
                var8 = method712(var9);
            }
        }
        class112 var11 = var8.method838(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1014 != -1) {
            var12 = method180(var8.field1013, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1497;
        int var14 = Statics.field1501;
        int var15 = Statics.field1498;
        int[] var16 = new int[4];
        class89.method1800(var16);
        class86 var17 = new class86(36, 32);
        class89.method1822(var17.field1479, 36, 32);
        class89.method1855();
        class104.method2152();
        class104.method2146(16, 16);
        class104.field1770 = false;
        int var18 = var8.field974;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1776[var8.field989] * var18 >> 16;
        int var20 = class104.field1791[var8.field989] * var18 >> 16;
        var11.method2240();
        var11.method2252(0, var8.field990, var8.field979, var8.field989, var8.field992, var8.field993 + var11.field1560 / 2 + var19, var8.field993 + var20);
        if (arg2 >= 1) {
            var17.method1687(1);
        }
        if (arg2 >= 2) {
            var17.method1687(16777215);
        }
        if (arg3 != 0) {
            var17.method1688(arg3);
        }
        class89.method1822(var17.field1479, 36, 32);
        if (var8.field1014 != -1) {
            var12.method1775(0, 0);
        }
        if (!arg4 && (var8.field988 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field980.method3383(method55(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1019.method3257(var17, var5);
        }
        class89.method1822(var13, var14, var15);
        class89.method1801(var16);
        class104.method2152();
        class104.field1770 = true;
        return var17;
    }

    @ObfuscatedName("t.i(IB)Ljava/lang/String;")
    public static final String method55(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class135.field2251 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class135.field2249 + "</col>";
        }
    }

    @ObfuscatedName("aj.c(ZS)Z")
    public final boolean method832(boolean arg0) {
        int var2 = this.field999;
        int var3 = this.field1000;
        int var4 = this.field1005;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field1020;
            var4 = this.field1006;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field994.method3083(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field994.method3083(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field994.method3083(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.b(ZI)Lch;")
    public final class101 method870(boolean arg0) {
        int var2 = this.field999;
        int var3 = this.field1000;
        int var4 = this.field1005;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field1020;
            var4 = this.field1006;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2064(Statics.field994, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2064(Statics.field994, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2064(Statics.field994, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1001 != 0) {
            var5.method2074(0, this.field1001, 0);
        }
        if (arg0 && this.field975 != 0) {
            var5.method2074(0, this.field975, 0);
        }
        if (this.field984 != null) {
            for (int var10 = 0; var10 < this.field984.length; var10++) {
                var5.method2112(this.field984[var10], this.field997[var10]);
            }
        }
        if (this.field986 != null) {
            for (int var11 = 0; var11 < this.field986.length; var11++) {
                var5.method2082(this.field986[var11], this.field987[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.m(ZB)Z")
    public final boolean method842(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field1008;
        if (arg0) {
            var2 = this.field1004;
            var3 = this.field1010;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field994.method3083(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field994.method3083(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.g(ZS)Lch;")
    public final class101 method839(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field1008;
        if (arg0) {
            var2 = this.field1004;
            var3 = this.field1010;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2064(Statics.field994, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2064(Statics.field994, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field984 != null) {
            for (int var7 = 0; var7 < this.field984.length; var7++) {
                var4.method2112(this.field984[var7], this.field997[var7]);
            }
        }
        if (this.field986 != null) {
            for (int var8 = 0; var8 < this.field986.length; var8++) {
                var4.method2082(this.field986[var8], this.field987[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.x(B)V")
    public static void method603() {
        field977.method3265();
        field991.method3265();
        field1019.method3265();
    }
}
