package deob;

@ObfuscatedName("aj")
public class class40 extends class174 {

    @ObfuscatedName("aj.z")
    public static class170 field1009 = new class170(64);

    @ObfuscatedName("aj.m")
    public static class170 field977 = new class170(50);

    @ObfuscatedName("aj.k")
    public static class170 field978 = new class170(100);

    @ObfuscatedName("aj.y")
    public int field980;

    @ObfuscatedName("aj.d")
    public int field981;

    @ObfuscatedName("aj.l")
    public String field982 = "null";

    @ObfuscatedName("aj.h")
    public short[] field983;

    @ObfuscatedName("aj.b")
    public short[] field984;

    @ObfuscatedName("aj.r")
    public short[] field985;

    @ObfuscatedName("aj.t")
    public short[] field973;

    @ObfuscatedName("aj.u")
    public int field1001 = 2000;

    @ObfuscatedName("aj.g")
    public int field988 = 0;

    @ObfuscatedName("aj.e")
    public int field989 = 0;

    @ObfuscatedName("aj.n")
    public int field990 = 0;

    @ObfuscatedName("aj.o")
    public int field991 = 0;

    @ObfuscatedName("aj.a")
    public int field992 = 0;

    @ObfuscatedName("aj.f")
    public int field994 = 0;

    @ObfuscatedName("aj.s")
    public int field1020 = 1;

    @ObfuscatedName("aj.w")
    public boolean field995 = false;

    @ObfuscatedName("aj.x")
    public String[] field993 = new String[] { null, null, class135.field2106, null, null };

    @ObfuscatedName("aj.j")
    public String[] field1006 = new String[] { null, null, null, null, class135.field2107 };

    @ObfuscatedName("aj.i")
    public int field997 = -1;

    @ObfuscatedName("aj.ap")
    public int field999 = -1;

    @ObfuscatedName("aj.am")
    public int field1007 = 0;

    @ObfuscatedName("aj.ao")
    public int field987 = -1;

    @ObfuscatedName("aj.af")
    public int field1002 = -1;

    @ObfuscatedName("aj.ae")
    public int field1003 = 0;

    @ObfuscatedName("aj.az")
    public int field1004 = -1;

    @ObfuscatedName("aj.al")
    public int field1005 = -1;

    @ObfuscatedName("aj.ak")
    public int field976 = -1;

    @ObfuscatedName("aj.ac")
    public int field986 = -1;

    @ObfuscatedName("aj.an")
    public int field1008 = -1;

    @ObfuscatedName("aj.ai")
    public int field1011 = -1;

    @ObfuscatedName("aj.aa")
    public int[] field979;

    @ObfuscatedName("aj.ab")
    public int[] field1019;

    @ObfuscatedName("aj.aj")
    public int field996 = -1;

    @ObfuscatedName("aj.au")
    public int field1013 = -1;

    @ObfuscatedName("aj.ar")
    public int field1014 = 128;

    @ObfuscatedName("aj.ad")
    public int field1015 = 128;

    @ObfuscatedName("aj.at")
    public int field1016 = 128;

    @ObfuscatedName("aj.ag")
    public int field1017 = 0;

    @ObfuscatedName("aj.ax")
    public int field1018 = 0;

    @ObfuscatedName("aj.ah")
    public int field1000 = 0;

    @ObfuscatedName("m.q(Ley;Ley;ZLgo;I)V")
    public static void method35(class153 arg0, class153 arg1, boolean arg2, class183 arg3) {
        Statics.field998 = arg0;
        Statics.field974 = arg1;
        Statics.field975 = arg2;
        Statics.field998.method2962(10);
        Statics.field1012 = arg3;
    }

    @ObfuscatedName("an.c(II)Laj;")
    public static class40 method782(int arg0) {
        class40 var1 = (class40) field1009.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field998.method2952(10, arg0);
        class40 var3 = new class40();
        var3.field980 = arg0;
        if (var2 != null) {
            var3.method822(new class127(var2));
        }
        var3.method821();
        if (var3.field1013 != -1) {
            var3.method871(method782(var3.field1013), method782(var3.field996));
        }
        if (!Statics.field975 && var3.field995) {
            var3.field982 = class135.field2162;
            var3.field993 = null;
            var3.field1006 = null;
            var3.field1000 = 0;
        }
        field1009.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.p(B)V")
    public void method821() {
    }

    @ObfuscatedName("aj.z(Ldo;I)V")
    public void method822(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method874(arg0, var2);
        }
    }

    @ObfuscatedName("aj.m(Ldo;II)V")
    public void method874(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field981 = arg0.method2427();
        } else if (arg1 == 2) {
            this.field982 = arg0.method2460();
        } else if (arg1 == 4) {
            this.field1001 = arg0.method2427();
        } else if (arg1 == 5) {
            this.field988 = arg0.method2427();
        } else if (arg1 == 6) {
            this.field989 = arg0.method2427();
        } else if (arg1 == 7) {
            this.field991 = arg0.method2427();
            if (this.field991 > 32767) {
                this.field991 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field992 = arg0.method2427();
            if (this.field992 > 32767) {
                this.field992 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field994 = 1;
        } else if (arg1 == 12) {
            this.field1020 = arg0.method2430();
        } else if (arg1 == 16) {
            this.field995 = true;
        } else if (arg1 == 23) {
            this.field997 = arg0.method2427();
            this.field1007 = arg0.method2534();
        } else if (arg1 == 24) {
            this.field999 = arg0.method2427();
        } else if (arg1 == 25) {
            this.field987 = arg0.method2427();
            this.field1003 = arg0.method2534();
        } else if (arg1 == 26) {
            this.field1002 = arg0.method2427();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field993[arg1 - 30] = arg0.method2460();
            if (this.field993[arg1 - 30].equalsIgnoreCase(class135.field2108)) {
                this.field993[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1006[arg1 - 35] = arg0.method2460();
        } else if (arg1 == 40) {
            int var3 = arg0.method2534();
            this.field983 = new short[var3];
            this.field984 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field983[var4] = (short) arg0.method2427();
                this.field984[var4] = (short) arg0.method2427();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2534();
            this.field985 = new short[var5];
            this.field973 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field985[var6] = (short) arg0.method2427();
                this.field973[var6] = (short) arg0.method2427();
            }
        } else if (arg1 == 78) {
            this.field1004 = arg0.method2427();
        } else if (arg1 == 79) {
            this.field1005 = arg0.method2427();
        } else if (arg1 == 90) {
            this.field976 = arg0.method2427();
        } else if (arg1 == 91) {
            this.field1008 = arg0.method2427();
        } else if (arg1 == 92) {
            this.field986 = arg0.method2427();
        } else if (arg1 == 93) {
            this.field1011 = arg0.method2427();
        } else if (arg1 == 95) {
            this.field990 = arg0.method2427();
        } else if (arg1 == 97) {
            this.field996 = arg0.method2427();
        } else if (arg1 == 98) {
            this.field1013 = arg0.method2427();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field979 == null) {
                this.field979 = new int[10];
                this.field1019 = new int[10];
            }
            this.field979[arg1 - 100] = arg0.method2427();
            this.field1019[arg1 - 100] = arg0.method2427();
        } else if (arg1 == 110) {
            this.field1014 = arg0.method2427();
        } else if (arg1 == 111) {
            this.field1015 = arg0.method2427();
        } else if (arg1 == 112) {
            this.field1016 = arg0.method2427();
        } else if (arg1 == 113) {
            this.field1017 = arg0.method2426();
        } else if (arg1 == 114) {
            this.field1018 = arg0.method2426();
        } else if (arg1 == 115) {
            this.field1000 = arg0.method2534();
        }
    }

    @ObfuscatedName("aj.k(Laj;Laj;I)V")
    public void method871(class40 arg0, class40 arg1) {
        this.field981 = arg0.field981;
        this.field1001 = arg0.field1001;
        this.field988 = arg0.field988;
        this.field989 = arg0.field989;
        this.field990 = arg0.field990;
        this.field991 = arg0.field991;
        this.field992 = arg0.field992;
        this.field983 = arg0.field983;
        this.field984 = arg0.field984;
        this.field985 = arg0.field985;
        this.field973 = arg0.field973;
        this.field982 = arg1.field982;
        this.field995 = arg1.field995;
        this.field1020 = arg1.field1020;
        this.field994 = 1;
    }

    @ObfuscatedName("aj.v(II)Lcy;")
    public final class101 method825(int arg0) {
        if (this.field979 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1019[var3] && this.field1019[var3] != 0) {
                    var2 = this.field979[var3];
                }
            }
            if (var2 != -1) {
                return method782(var2).method825(1);
            }
        }
        class101 var4 = class101.method2039(Statics.field974, this.field981, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1014 != 128 || this.field1015 != 128 || this.field1016 != 128) {
            var4.method2044(this.field1014, this.field1015, this.field1016);
        }
        if (this.field983 != null) {
            for (int var5 = 0; var5 < this.field983.length; var5++) {
                var4.method2072(this.field983[var5], this.field984[var5]);
            }
        }
        if (this.field985 != null) {
            for (int var6 = 0; var6 < this.field985.length; var6++) {
                var4.method2042(this.field985[var6], this.field973[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.y(II)Ldn;")
    public final class112 method832(int arg0) {
        if (this.field979 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1019[var3] && this.field1019[var3] != 0) {
                    var2 = this.field979[var3];
                }
            }
            if (var2 != -1) {
                return method782(var2).method832(1);
            }
        }
        class112 var4 = (class112) field977.method3215((long) this.field980);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2039(Statics.field974, this.field981, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1014 != 128 || this.field1015 != 128 || this.field1016 != 128) {
            var5.method2044(this.field1014, this.field1015, this.field1016);
        }
        if (this.field983 != null) {
            for (int var6 = 0; var6 < this.field983.length; var6++) {
                var5.method2072(this.field983[var6], this.field984[var6]);
            }
        }
        if (this.field985 != null) {
            for (int var7 = 0; var7 < this.field985.length; var7++) {
                var5.method2042(this.field985[var7], this.field973[var7]);
            }
        }
        class112 var8 = var5.method2049(this.field1017 + 64, this.field1018 * 5 + 768, -50, -10, -50);
        var8.field1863 = true;
        field977.method3225(var8, (long) this.field980);
        return var8;
    }

    @ObfuscatedName("aj.d(IB)Laj;")
    public class40 method827(int arg0) {
        if (this.field979 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1019[var3] && this.field1019[var3] != 0) {
                    var2 = this.field979[var3];
                }
            }
            if (var2 != -1) {
                return method782(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ba.l(IIIIZI)Lcf;")
    public static final class86 method1532(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field978.method3215(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method782(arg0);
        if (arg1 > 1 && var8.field979 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1019[var10] && var8.field1019[var10] != 0) {
                    var9 = var8.field979[var10];
                }
            }
            if (var9 != -1) {
                var8 = method782(var9);
            }
        }
        class112 var11 = var8.method832(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1013 != -1) {
            var12 = method1532(var8.field996, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1502;
        int var14 = Statics.field1498;
        int var15 = Statics.field1497;
        int[] var16 = new int[4];
        class89.method1805(var16);
        class86 var17 = new class86(36, 32);
        class89.method1784(var17.field1487, 36, 32);
        class89.method1790();
        class104.method2122();
        class104.method2119(16, 16);
        class104.field1765 = false;
        int var18 = var8.field1001;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1786[var8.field988] * var18 >> 16;
        int var20 = class104.field1766[var8.field988] * var18 >> 16;
        var11.method2213();
        var11.method2225(0, var8.field989, var8.field990, var8.field988, var8.field991, var8.field992 + var11.field1555 / 2 + var19, var8.field992 + var20);
        if (arg2 >= 1) {
            var17.method1688(1);
        }
        if (arg2 >= 2) {
            var17.method1688(16777215);
        }
        if (arg3 != 0) {
            var17.method1707(arg3);
        }
        class89.method1784(var17.field1487, 36, 32);
        if (var8.field1013 != -1) {
            var12.method1692(0, 0);
        }
        if (!arg4 && (var8.field994 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field1012;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class135.field2260 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class135.field2258 + "</col>";
            }
            var21.method3350(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field978.method3225(var17, var5);
        }
        class89.method1784(var13, var14, var15);
        class89.method1789(var16);
        class104.method2122();
        class104.field1765 = true;
        return var17;
    }

    @ObfuscatedName("aj.h(ZI)Z")
    public final boolean method828(boolean arg0) {
        int var2 = this.field997;
        int var3 = this.field999;
        int var4 = this.field1004;
        if (arg0) {
            var2 = this.field987;
            var3 = this.field1002;
            var4 = this.field1005;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field974.method2971(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field974.method2971(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field974.method2971(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.b(ZI)Lcy;")
    public final class101 method850(boolean arg0) {
        int var2 = this.field997;
        int var3 = this.field999;
        int var4 = this.field1004;
        if (arg0) {
            var2 = this.field987;
            var3 = this.field1002;
            var4 = this.field1005;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2039(Statics.field974, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2039(Statics.field974, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2039(Statics.field974, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1007 != 0) {
            var5.method2068(0, this.field1007, 0);
        }
        if (arg0 && this.field1003 != 0) {
            var5.method2068(0, this.field1003, 0);
        }
        if (this.field983 != null) {
            for (int var10 = 0; var10 < this.field983.length; var10++) {
                var5.method2072(this.field983[var10], this.field984[var10]);
            }
        }
        if (this.field985 != null) {
            for (int var11 = 0; var11 < this.field985.length; var11++) {
                var5.method2042(this.field985[var11], this.field973[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.r(ZB)Z")
    public final boolean method846(boolean arg0) {
        int var2 = this.field976;
        int var3 = this.field986;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1011;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field974.method2971(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field974.method2971(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.t(ZB)Lcy;")
    public final class101 method860(boolean arg0) {
        int var2 = this.field976;
        int var3 = this.field986;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1011;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2039(Statics.field974, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2039(Statics.field974, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field983 != null) {
            for (int var7 = 0; var7 < this.field983.length; var7++) {
                var4.method2072(this.field983[var7], this.field984[var7]);
            }
        }
        if (this.field985 != null) {
            for (int var8 = 0; var8 < this.field985.length; var8++) {
                var4.method2042(this.field985[var8], this.field973[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("h.u(I)V")
    public static void method103() {
        field1009.method3218();
        field977.method3218();
        field978.method3218();
    }
}
