package deob;

@ObfuscatedName("ax")
public class class40 extends class174 {

    @ObfuscatedName("ax.v")
    public static class170 field1026 = new class170(64);

    @ObfuscatedName("ax.g")
    public static class170 field1007 = new class170(50);

    @ObfuscatedName("ax.x")
    public static class170 field998 = new class170(100);

    @ObfuscatedName("ax.l")
    public int field1008;

    @ObfuscatedName("ax.a")
    public int field1001;

    @ObfuscatedName("ax.h")
    public String field1030 = "null";

    @ObfuscatedName("ax.t")
    public short[] field1003;

    @ObfuscatedName("ax.m")
    public short[] field1004;

    @ObfuscatedName("ax.s")
    public short[] field994;

    @ObfuscatedName("ax.j")
    public short[] field1002;

    @ObfuscatedName("ax.b")
    public int field1022 = 2000;

    @ObfuscatedName("ax.n")
    public int field1031 = 0;

    @ObfuscatedName("ax.z")
    public int field1009 = 0;

    @ObfuscatedName("ax.d")
    public int field1005 = 0;

    @ObfuscatedName("ax.f")
    public int field1011 = 0;

    @ObfuscatedName("ax.o")
    public int field1012 = 0;

    @ObfuscatedName("ax.r")
    public int field1013 = 0;

    @ObfuscatedName("ax.k")
    public int field1014 = 1;

    @ObfuscatedName("ax.w")
    public boolean field1015 = false;

    @ObfuscatedName("ax.e")
    public String[] field1016 = new String[] { null, null, class135.field2116, null, null };

    @ObfuscatedName("ax.p")
    public String[] field1041 = new String[] { null, null, null, null, class135.field2117 };

    @ObfuscatedName("ax.i")
    public int field1018 = -1;

    @ObfuscatedName("ax.ap")
    public int field1019 = -1;

    @ObfuscatedName("ax.as")
    public int field1040 = 0;

    @ObfuscatedName("ax.ak")
    public int field1021 = -1;

    @ObfuscatedName("ax.af")
    public int field1024 = -1;

    @ObfuscatedName("ax.ag")
    public int field1023 = 0;

    @ObfuscatedName("ax.aj")
    public int field1010 = -1;

    @ObfuscatedName("ax.ac")
    public int field1025 = -1;

    @ObfuscatedName("ax.an")
    public int field1017 = -1;

    @ObfuscatedName("ax.ad")
    public int field1027 = -1;

    @ObfuscatedName("ax.ai")
    public int field1028 = -1;

    @ObfuscatedName("ax.ae")
    public int field1029 = -1;

    @ObfuscatedName("ax.au")
    public int[] field1000;

    @ObfuscatedName("ax.at")
    public int[] field1034;

    @ObfuscatedName("ax.ax")
    public int field1032 = -1;

    @ObfuscatedName("ax.aq")
    public int field1033 = -1;

    @ObfuscatedName("ax.aw")
    public int field1020 = 128;

    @ObfuscatedName("ax.ao")
    public int field1035 = 128;

    @ObfuscatedName("ax.aa")
    public int field997 = 128;

    @ObfuscatedName("ax.ah")
    public int field1037 = 0;

    @ObfuscatedName("ax.av")
    public int field1038 = 0;

    @ObfuscatedName("ax.am")
    public int field1039 = 0;

    @ObfuscatedName("l.c(Ley;Ley;ZLge;I)V")
    public static void method51(class153 arg0, class153 arg1, boolean arg2, class183 arg3) {
        Statics.field1006 = arg0;
        Statics.field995 = arg1;
        Statics.field2841 = arg2;
        Statics.field1006.method2956(10);
        Statics.field999 = arg3;
    }

    @ObfuscatedName("y.q(II)Lax;")
    public static class40 method11(int arg0) {
        class40 var1 = (class40) field1026.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1006.method2886(10, arg0);
        class40 var3 = new class40();
        var3.field1008 = arg0;
        if (var2 != null) {
            var3.method805(new class127(var2));
        }
        var3.method792();
        if (var3.field1033 != -1) {
            var3.method795(method11(var3.field1033), method11(var3.field1032));
        }
        if (!Statics.field2841 && var3.field1015) {
            var3.field1030 = class135.field2235;
            var3.field1016 = null;
            var3.field1041 = null;
            var3.field1039 = 0;
        }
        field1026.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.y(I)V")
    public void method792() {
    }

    @ObfuscatedName("ax.v(Ldg;I)V")
    public void method805(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method829(arg0, var2);
        }
    }

    @ObfuscatedName("ax.g(Ldg;II)V")
    public void method829(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1001 = arg0.method2327();
        } else if (arg1 == 2) {
            this.field1030 = arg0.method2315();
        } else if (arg1 == 4) {
            this.field1022 = arg0.method2327();
        } else if (arg1 == 5) {
            this.field1031 = arg0.method2327();
        } else if (arg1 == 6) {
            this.field1009 = arg0.method2327();
        } else if (arg1 == 7) {
            this.field1011 = arg0.method2327();
            if (this.field1011 > 32767) {
                this.field1011 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1012 = arg0.method2327();
            if (this.field1012 > 32767) {
                this.field1012 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1013 = 1;
        } else if (arg1 == 12) {
            this.field1014 = arg0.method2323();
        } else if (arg1 == 16) {
            this.field1015 = true;
        } else if (arg1 == 23) {
            this.field1018 = arg0.method2327();
            this.field1040 = arg0.method2383();
        } else if (arg1 == 24) {
            this.field1019 = arg0.method2327();
        } else if (arg1 == 25) {
            this.field1021 = arg0.method2327();
            this.field1023 = arg0.method2383();
        } else if (arg1 == 26) {
            this.field1024 = arg0.method2327();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1016[arg1 - 30] = arg0.method2315();
            if (this.field1016[arg1 - 30].equalsIgnoreCase(class135.field2118)) {
                this.field1016[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1041[arg1 - 35] = arg0.method2315();
        } else if (arg1 == 40) {
            int var3 = arg0.method2383();
            this.field1003 = new short[var3];
            this.field1004 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1003[var4] = (short) arg0.method2327();
                this.field1004[var4] = (short) arg0.method2327();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2383();
            this.field994 = new short[var5];
            this.field1002 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field994[var6] = (short) arg0.method2327();
                this.field1002[var6] = (short) arg0.method2327();
            }
        } else if (arg1 == 78) {
            this.field1010 = arg0.method2327();
        } else if (arg1 == 79) {
            this.field1025 = arg0.method2327();
        } else if (arg1 == 90) {
            this.field1017 = arg0.method2327();
        } else if (arg1 == 91) {
            this.field1028 = arg0.method2327();
        } else if (arg1 == 92) {
            this.field1027 = arg0.method2327();
        } else if (arg1 == 93) {
            this.field1029 = arg0.method2327();
        } else if (arg1 == 95) {
            this.field1005 = arg0.method2327();
        } else if (arg1 == 97) {
            this.field1032 = arg0.method2327();
        } else if (arg1 == 98) {
            this.field1033 = arg0.method2327();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1000 == null) {
                this.field1000 = new int[10];
                this.field1034 = new int[10];
            }
            this.field1000[arg1 - 100] = arg0.method2327();
            this.field1034[arg1 - 100] = arg0.method2327();
        } else if (arg1 == 110) {
            this.field1020 = arg0.method2327();
        } else if (arg1 == 111) {
            this.field1035 = arg0.method2327();
        } else if (arg1 == 112) {
            this.field997 = arg0.method2327();
        } else if (arg1 == 113) {
            this.field1037 = arg0.method2319();
        } else if (arg1 == 114) {
            this.field1038 = arg0.method2319() * 5;
        } else if (arg1 == 115) {
            this.field1039 = arg0.method2383();
        }
    }

    @ObfuscatedName("ax.x(Lax;Lax;I)V")
    public void method795(class40 arg0, class40 arg1) {
        this.field1001 = arg0.field1001;
        this.field1022 = arg0.field1022;
        this.field1031 = arg0.field1031;
        this.field1009 = arg0.field1009;
        this.field1005 = arg0.field1005;
        this.field1011 = arg0.field1011;
        this.field1012 = arg0.field1012;
        this.field1003 = arg0.field1003;
        this.field1004 = arg0.field1004;
        this.field994 = arg0.field994;
        this.field1002 = arg0.field1002;
        this.field1030 = arg1.field1030;
        this.field1015 = arg1.field1015;
        this.field1014 = arg1.field1014;
        this.field1013 = 1;
    }

    @ObfuscatedName("ax.u(II)Lcz;")
    public final class101 method841(int arg0) {
        if (this.field1000 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1034[var3] && this.field1034[var3] != 0) {
                    var2 = this.field1000[var3];
                }
            }
            if (var2 != -1) {
                return method11(var2).method841(1);
            }
        }
        class101 var4 = class101.method1979(Statics.field995, this.field1001, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1020 != 128 || this.field1035 != 128 || this.field997 != 128) {
            var4.method1982(this.field1020, this.field1035, this.field997);
        }
        if (this.field1003 != null) {
            for (int var5 = 0; var5 < this.field1003.length; var5++) {
                var4.method1976(this.field1003[var5], this.field1004[var5]);
            }
        }
        if (this.field994 != null) {
            for (int var6 = 0; var6 < this.field994.length; var6++) {
                var4.method1980(this.field994[var6], this.field1002[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ax.l(II)Ldl;")
    public final class112 method797(int arg0) {
        if (this.field1000 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1034[var3] && this.field1034[var3] != 0) {
                    var2 = this.field1000[var3];
                }
            }
            if (var2 != -1) {
                return method11(var2).method797(1);
            }
        }
        class112 var4 = (class112) field1007.method3097((long) this.field1008);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method1979(Statics.field995, this.field1001, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1020 != 128 || this.field1035 != 128 || this.field997 != 128) {
            var5.method1982(this.field1020, this.field1035, this.field997);
        }
        if (this.field1003 != null) {
            for (int var6 = 0; var6 < this.field1003.length; var6++) {
                var5.method1976(this.field1003[var6], this.field1004[var6]);
            }
        }
        if (this.field994 != null) {
            for (int var7 = 0; var7 < this.field994.length; var7++) {
                var5.method1980(this.field994[var7], this.field1002[var7]);
            }
        }
        class112 var8 = var5.method1971(this.field1037 + 64, this.field1038 + 768, -50, -10, -50);
        var8.field1919 = true;
        field1007.method3092(var8, (long) this.field1008);
        return var8;
    }

    @ObfuscatedName("ax.a(II)Lax;")
    public class40 method798(int arg0) {
        if (this.field1000 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1034[var3] && this.field1034[var3] != 0) {
                    var2 = this.field1000[var3];
                }
            }
            if (var2 != -1) {
                return method11(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ai.h(IIIIZB)Lcd;")
    public static final class86 method745(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field998.method3097(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method11(arg0);
        if (arg1 > 1 && var8.field1000 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1034[var10] && var8.field1034[var10] != 0) {
                    var9 = var8.field1000[var10];
                }
            }
            if (var9 != -1) {
                var8 = method11(var9);
            }
        }
        class112 var11 = var8.method797(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1033 != -1) {
            var12 = method745(var8.field1032, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1515;
        int var14 = Statics.field1514;
        int var15 = Statics.field1512;
        int[] var16 = new int[4];
        class89.method1707(var16);
        class86 var17 = new class86(36, 32);
        class89.method1703(var17.field1497, 36, 32);
        class89.method1726();
        class104.method2032();
        class104.method2035(16, 16);
        class104.field1773 = false;
        int var18 = var8.field1022;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1776[var8.field1031] * var18 >> 16;
        int var20 = class104.field1789[var8.field1031] * var18 >> 16;
        var11.method2192();
        var11.method2150(0, var8.field1009, var8.field1005, var8.field1031, var8.field1011, var8.field1012 + var11.field1569 / 2 + var19, var8.field1012 + var20);
        if (arg2 >= 1) {
            var17.method1637(1);
        }
        if (arg2 >= 2) {
            var17.method1637(16777215);
        }
        if (arg3 != 0) {
            var17.method1600(arg3);
        }
        class89.method1703(var17.field1497, 36, 32);
        if (var8.field1033 != -1) {
            var12.method1603(0, 0);
        }
        if (!arg4 && (var8.field1013 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field999.method3232(method2595(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field998.method3092(var17, var5);
        }
        class89.method1703(var13, var14, var15);
        class89.method1708(var16);
        class104.method2032();
        class104.field1773 = true;
        return var17;
    }

    @ObfuscatedName("et.t(IB)Ljava/lang/String;")
    public static final String method2595(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class135.field2332 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class135.field2268 + "</col>";
        }
    }

    @ObfuscatedName("ax.m(ZB)Z")
    public final boolean method799(boolean arg0) {
        int var2 = this.field1018;
        int var3 = this.field1019;
        int var4 = this.field1010;
        if (arg0) {
            var2 = this.field1021;
            var3 = this.field1024;
            var4 = this.field1025;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field995.method2888(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field995.method2888(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field995.method2888(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ax.s(ZI)Lcz;")
    public final class101 method800(boolean arg0) {
        int var2 = this.field1018;
        int var3 = this.field1019;
        int var4 = this.field1010;
        if (arg0) {
            var2 = this.field1021;
            var3 = this.field1024;
            var4 = this.field1025;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method1979(Statics.field995, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method1979(Statics.field995, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method1979(Statics.field995, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1040 != 0) {
            var5.method1995(0, this.field1040, 0);
        }
        if (arg0 && this.field1023 != 0) {
            var5.method1995(0, this.field1023, 0);
        }
        if (this.field1003 != null) {
            for (int var10 = 0; var10 < this.field1003.length; var10++) {
                var5.method1976(this.field1003[var10], this.field1004[var10]);
            }
        }
        if (this.field994 != null) {
            for (int var11 = 0; var11 < this.field994.length; var11++) {
                var5.method1980(this.field994[var11], this.field1002[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ax.j(ZB)Z")
    public final boolean method801(boolean arg0) {
        int var2 = this.field1017;
        int var3 = this.field1027;
        if (arg0) {
            var2 = this.field1028;
            var3 = this.field1029;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field995.method2888(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field995.method2888(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ax.b(ZB)Lcz;")
    public final class101 method802(boolean arg0) {
        int var2 = this.field1017;
        int var3 = this.field1027;
        if (arg0) {
            var2 = this.field1028;
            var3 = this.field1029;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method1979(Statics.field995, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method1979(Statics.field995, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1003 != null) {
            for (int var7 = 0; var7 < this.field1003.length; var7++) {
                var4.method1976(this.field1003[var7], this.field1004[var7]);
            }
        }
        if (this.field994 != null) {
            for (int var8 = 0; var8 < this.field994.length; var8++) {
                var4.method1980(this.field994[var8], this.field1002[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.n(I)V")
    public static void method727() {
        field998.method3093();
    }
}
