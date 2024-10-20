package deob;

@ObfuscatedName("ab")
public class class45 extends class182 {

    @ObfuscatedName("ab.w")
    public static class171 field1014 = new class171(64);

    @ObfuscatedName("ab.m")
    public static class171 field1015 = new class171(50);

    @ObfuscatedName("ab.j")
    public static class171 field1036 = new class171(100);

    @ObfuscatedName("ab.p")
    public int field1018;

    @ObfuscatedName("ab.o")
    public int field1019;

    @ObfuscatedName("ab.b")
    public String field1020 = "null";

    @ObfuscatedName("ab.x")
    public short[] field1033;

    @ObfuscatedName("ab.n")
    public short[] field1022;

    @ObfuscatedName("ab.d")
    public short[] field1039;

    @ObfuscatedName("ab.s")
    public short[] field1016;

    @ObfuscatedName("ab.v")
    public int field1025 = 2000;

    @ObfuscatedName("ab.t")
    public int field1052 = 0;

    @ObfuscatedName("ab.u")
    public int field1027 = 0;

    @ObfuscatedName("ab.l")
    public int field1028 = 0;

    @ObfuscatedName("ab.i")
    public int field1029 = 0;

    @ObfuscatedName("ab.h")
    public int field1030 = 0;

    @ObfuscatedName("ab.e")
    public int field1031 = 0;

    @ObfuscatedName("ab.a")
    public int field1035 = 1;

    @ObfuscatedName("ab.c")
    public boolean field1057 = false;

    @ObfuscatedName("ab.f")
    public String[] field1034 = new String[] { null, null, class142.field2149, null, null };

    @ObfuscatedName("ab.q")
    public String[] field1021 = new String[] { null, null, null, null, class142.field2150 };

    @ObfuscatedName("ab.z")
    public int field1050 = -1;

    @ObfuscatedName("ab.aa")
    public int field1037 = -1;

    @ObfuscatedName("ab.ak")
    public int field1038 = 0;

    @ObfuscatedName("ab.al")
    public int field1058 = -1;

    @ObfuscatedName("ab.aw")
    public int field1040 = -1;

    @ObfuscatedName("ab.ai")
    public int field1011 = 0;

    @ObfuscatedName("ab.av")
    public int field1042 = -1;

    @ObfuscatedName("ab.an")
    public int field1048 = -1;

    @ObfuscatedName("ab.aq")
    public int field1044 = -1;

    @ObfuscatedName("ab.aj")
    public int field1053 = -1;

    @ObfuscatedName("ab.az")
    public int field1046 = -1;

    @ObfuscatedName("ab.ax")
    public int field1047 = -1;

    @ObfuscatedName("ab.ap")
    public int[] field1026;

    @ObfuscatedName("ab.ar")
    public int[] field1049;

    @ObfuscatedName("ab.am")
    public int field1043 = -1;

    @ObfuscatedName("ab.ae")
    public int field1051 = -1;

    @ObfuscatedName("ab.as")
    public int field1045 = 128;

    @ObfuscatedName("ab.ad")
    public int field1041 = 128;

    @ObfuscatedName("ab.af")
    public int field1054 = 128;

    @ObfuscatedName("ab.ab")
    public int field1055 = 0;

    @ObfuscatedName("ab.at")
    public int field1056 = 0;

    @ObfuscatedName("ab.ag")
    public int field1024 = 0;

    @ObfuscatedName("n.k(Lee;Lee;ZLgl;I)V")
    public static void method123(class146 arg0, class146 arg1, boolean arg2, class193 arg3) {
        Statics.field1023 = arg0;
        Statics.field1012 = arg1;
        Statics.field1013 = arg2;
        Statics.field1023.method2688(10);
        Statics.field1017 = arg3;
    }

    @ObfuscatedName("cs.r(II)Lab;")
    public static class45 method1864(int arg0) {
        class45 var1 = (class45) field1014.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1023.method2749(10, arg0);
        class45 var3 = new class45();
        var3.field1018 = arg0;
        if (var2 != null) {
            var3.method854(new class107(var2));
        }
        var3.method863();
        if (var3.field1051 != -1) {
            var3.method856(method1864(var3.field1051), method1864(var3.field1043));
        }
        if (!Statics.field1013 && var3.field1057) {
            var3.field1020 = class142.field2295;
            var3.field1034 = null;
            var3.field1021 = null;
            var3.field1024 = 0;
        }
        field1014.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.y(I)V")
    public void method863() {
    }

    @ObfuscatedName("ab.w(Lde;I)V")
    public void method854(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method852(arg0, var2);
        }
    }

    @ObfuscatedName("ab.m(Lde;II)V")
    public void method852(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field1020 = arg0.method2119();
        } else if (arg1 == 4) {
            this.field1025 = arg0.method2232();
        } else if (arg1 == 5) {
            this.field1052 = arg0.method2232();
        } else if (arg1 == 6) {
            this.field1027 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field1029 = arg0.method2232();
            if (this.field1029 > 32767) {
                this.field1029 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1030 = arg0.method2232();
            if (this.field1030 > 32767) {
                this.field1030 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1031 = 1;
        } else if (arg1 == 12) {
            this.field1035 = arg0.method2116();
        } else if (arg1 == 16) {
            this.field1057 = true;
        } else if (arg1 == 23) {
            this.field1050 = arg0.method2232();
            this.field1038 = arg0.method2111();
        } else if (arg1 == 24) {
            this.field1037 = arg0.method2232();
        } else if (arg1 == 25) {
            this.field1058 = arg0.method2232();
            this.field1011 = arg0.method2111();
        } else if (arg1 == 26) {
            this.field1040 = arg0.method2232();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1034[arg1 - 30] = arg0.method2119();
            if (this.field1034[arg1 - 30].equalsIgnoreCase(class142.field2205)) {
                this.field1034[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1021[arg1 - 35] = arg0.method2119();
        } else if (arg1 == 40) {
            int var3 = arg0.method2111();
            this.field1033 = new short[var3];
            this.field1022 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1033[var4] = (short) arg0.method2232();
                this.field1022[var4] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2111();
            this.field1039 = new short[var5];
            this.field1016 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1039[var6] = (short) arg0.method2232();
                this.field1016[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 78) {
            this.field1042 = arg0.method2232();
        } else if (arg1 == 79) {
            this.field1048 = arg0.method2232();
        } else if (arg1 == 90) {
            this.field1044 = arg0.method2232();
        } else if (arg1 == 91) {
            this.field1046 = arg0.method2232();
        } else if (arg1 == 92) {
            this.field1053 = arg0.method2232();
        } else if (arg1 == 93) {
            this.field1047 = arg0.method2232();
        } else if (arg1 == 95) {
            this.field1028 = arg0.method2232();
        } else if (arg1 == 97) {
            this.field1043 = arg0.method2232();
        } else if (arg1 == 98) {
            this.field1051 = arg0.method2232();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1026 == null) {
                this.field1026 = new int[10];
                this.field1049 = new int[10];
            }
            this.field1026[arg1 - 100] = arg0.method2232();
            this.field1049[arg1 - 100] = arg0.method2232();
        } else if (arg1 == 110) {
            this.field1045 = arg0.method2232();
        } else if (arg1 == 111) {
            this.field1041 = arg0.method2232();
        } else if (arg1 == 112) {
            this.field1054 = arg0.method2232();
        } else if (arg1 == 113) {
            this.field1055 = arg0.method2112();
        } else if (arg1 == 114) {
            this.field1056 = arg0.method2112();
        } else if (arg1 == 115) {
            this.field1024 = arg0.method2111();
        }
    }

    @ObfuscatedName("ab.j(Lab;Lab;I)V")
    public void method856(class45 arg0, class45 arg1) {
        this.field1019 = arg0.field1019;
        this.field1025 = arg0.field1025;
        this.field1052 = arg0.field1052;
        this.field1027 = arg0.field1027;
        this.field1028 = arg0.field1028;
        this.field1029 = arg0.field1029;
        this.field1030 = arg0.field1030;
        this.field1033 = arg0.field1033;
        this.field1022 = arg0.field1022;
        this.field1039 = arg0.field1039;
        this.field1016 = arg0.field1016;
        this.field1020 = arg1.field1020;
        this.field1057 = arg1.field1057;
        this.field1035 = arg1.field1035;
        this.field1031 = 1;
    }

    @ObfuscatedName("ab.g(II)Lcl;")
    public final class93 method888(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1049[var3] && this.field1049[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method1864(var2).method888(1);
            }
        }
        class93 var4 = class93.method1922(Statics.field1012, this.field1019, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1045 != 128 || this.field1041 != 128 || this.field1054 != 128) {
            var4.method1887(this.field1045, this.field1041, this.field1054);
        }
        if (this.field1033 != null) {
            for (int var5 = 0; var5 < this.field1033.length; var5++) {
                var4.method1925(this.field1033[var5], this.field1022[var5]);
            }
        }
        if (this.field1039 != null) {
            for (int var6 = 0; var6 < this.field1039.length; var6++) {
                var4.method1885(this.field1039[var6], this.field1016[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.p(II)Lcp;")
    public final class98 method858(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1049[var3] && this.field1049[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method1864(var2).method858(1);
            }
        }
        class98 var4 = (class98) field1015.method3141((long) this.field1018);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1922(Statics.field1012, this.field1019, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1045 != 128 || this.field1041 != 128 || this.field1054 != 128) {
            var5.method1887(this.field1045, this.field1041, this.field1054);
        }
        if (this.field1033 != null) {
            for (int var6 = 0; var6 < this.field1033.length; var6++) {
                var5.method1925(this.field1033[var6], this.field1022[var6]);
            }
        }
        if (this.field1039 != null) {
            for (int var7 = 0; var7 < this.field1039.length; var7++) {
                var5.method1885(this.field1039[var7], this.field1016[var7]);
            }
        }
        class98 var8 = var5.method1892(this.field1055 + 64, this.field1056 * 5 + 768, -50, -10, -50);
        var8.field1734 = true;
        field1015.method3137(var8, (long) this.field1018);
        return var8;
    }

    @ObfuscatedName("ab.o(II)Lab;")
    public class45 method909(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1049[var3] && this.field1049[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method1864(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ap.b(IIIIZI)Lbp;")
    public static final class72 method736(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1036.method3141(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method1864(arg0);
        if (arg1 > 1 && var8.field1026 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1049[var10] && var8.field1049[var10] != 0) {
                    var9 = var8.field1026[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1864(var9);
            }
        }
        class98 var11 = var8.method858(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1051 != -1) {
            var12 = method736(var8.field1043, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1314;
        int var14 = Statics.field1315;
        int var15 = Statics.field1312;
        int[] var16 = new int[4];
        class73.method1532(var16);
        class72 var17 = new class72(36, 32);
        class73.method1518(var17.field1304, 36, 32);
        class73.method1524();
        class84.method1789();
        class84.method1792(16, 16);
        class84.field1479 = false;
        int var18 = var8.field1025;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1470[var8.field1052] * var18 >> 16;
        int var20 = class84.field1491[var8.field1052] * var18 >> 16;
        var11.method1998();
        var11.method1992(0, var8.field1027, var8.field1028, var8.field1052, var8.field1029, var8.field1030 + var11.field1354 / 2 + var19, var8.field1030 + var20);
        if (arg2 >= 1) {
            var17.method1442(1);
        }
        if (arg2 >= 2) {
            var17.method1442(16777215);
        }
        if (arg3 != 0) {
            var17.method1453(arg3);
        }
        class73.method1518(var17.field1304, 36, 32);
        if (var8.field1051 != -1) {
            var12.method1512(0, 0);
        }
        if (!arg4 && (var8.field1031 == 1 || arg1 != 1) && arg1 != -1) {
            class193 var21 = Statics.field1017;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2312 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2310 + "</col>";
            }
            var21.method3321(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1036.method3137(var17, var5);
        }
        class73.method1518(var13, var14, var15);
        class73.method1523(var16);
        class84.method1789();
        class84.field1479 = true;
        return var17;
    }

    @ObfuscatedName("ab.x(ZI)Z")
    public final boolean method898(boolean arg0) {
        int var2 = this.field1050;
        int var3 = this.field1037;
        int var4 = this.field1042;
        if (arg0) {
            var2 = this.field1058;
            var3 = this.field1040;
            var4 = this.field1048;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1012.method2727(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1012.method2727(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1012.method2727(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ab.n(ZB)Lcl;")
    public final class93 method860(boolean arg0) {
        int var2 = this.field1050;
        int var3 = this.field1037;
        int var4 = this.field1042;
        if (arg0) {
            var2 = this.field1058;
            var3 = this.field1040;
            var4 = this.field1048;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1922(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1922(Statics.field1012, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1922(Statics.field1012, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1038 != 0) {
            var5.method1883(0, this.field1038, 0);
        }
        if (arg0 && this.field1011 != 0) {
            var5.method1883(0, this.field1011, 0);
        }
        if (this.field1033 != null) {
            for (int var10 = 0; var10 < this.field1033.length; var10++) {
                var5.method1925(this.field1033[var10], this.field1022[var10]);
            }
        }
        if (this.field1039 != null) {
            for (int var11 = 0; var11 < this.field1039.length; var11++) {
                var5.method1885(this.field1039[var11], this.field1016[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ab.d(ZB)Z")
    public final boolean method861(boolean arg0) {
        int var2 = this.field1044;
        int var3 = this.field1053;
        if (arg0) {
            var2 = this.field1046;
            var3 = this.field1047;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1012.method2727(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1012.method2727(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ab.s(ZI)Lcl;")
    public final class93 method862(boolean arg0) {
        int var2 = this.field1044;
        int var3 = this.field1053;
        if (arg0) {
            var2 = this.field1046;
            var3 = this.field1047;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1922(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1922(Statics.field1012, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1033 != null) {
            for (int var7 = 0; var7 < this.field1033.length; var7++) {
                var4.method1925(this.field1033[var7], this.field1022[var7]);
            }
        }
        if (this.field1039 != null) {
            for (int var8 = 0; var8 < this.field1039.length; var8++) {
                var4.method1885(this.field1039[var8], this.field1016[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("n.v(I)V")
    public static void method121() {
        field1014.method3138();
        field1015.method3138();
        field1036.method3138();
    }

    @ObfuscatedName("c.t(ZI)V")
    public static void method490(boolean arg0) {
        if (Statics.field1013 != arg0) {
            method121();
            Statics.field1013 = arg0;
        }
    }
}
