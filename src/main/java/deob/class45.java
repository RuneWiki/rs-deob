package deob;

@ObfuscatedName("ab")
public class class45 extends class183 {

    @ObfuscatedName("ab.m")
    public static class172 field1009 = new class172(64);

    @ObfuscatedName("ab.u")
    public static class172 field1039 = new class172(50);

    @ObfuscatedName("ab.j")
    public static class172 field1011 = new class172(100);

    @ObfuscatedName("ab.v")
    public int field1012;

    @ObfuscatedName("ab.y")
    public int field1013;

    @ObfuscatedName("ab.w")
    public String field1014 = "null";

    @ObfuscatedName("ab.x")
    public short[] field1015;

    @ObfuscatedName("ab.k")
    public short[] field1016;

    @ObfuscatedName("ab.o")
    public short[] field1017;

    @ObfuscatedName("ab.a")
    public short[] field1018;

    @ObfuscatedName("ab.f")
    public int field1019 = 2000;

    @ObfuscatedName("ab.r")
    public int field1022 = 0;

    @ObfuscatedName("ab.e")
    public int field1021 = 0;

    @ObfuscatedName("ab.t")
    public int field1025 = 0;

    @ObfuscatedName("ab.c")
    public int field1010 = 0;

    @ObfuscatedName("ab.l")
    public int field1024 = 0;

    @ObfuscatedName("ab.n")
    public int field1043 = 0;

    @ObfuscatedName("ab.d")
    public int field1026 = 1;

    @ObfuscatedName("ab.p")
    public boolean field1027 = false;

    @ObfuscatedName("ab.z")
    public String[] field1028 = new String[] { null, null, class143.field2236, null, null };

    @ObfuscatedName("ab.q")
    public String[] field1029 = new String[] { null, null, null, null, class143.field2142 };

    @ObfuscatedName("ab.i")
    public int field1020 = -1;

    @ObfuscatedName("ab.ah")
    public int field1031 = -1;

    @ObfuscatedName("ab.aj")
    public int field1032 = 0;

    @ObfuscatedName("ab.aq")
    public int field1033 = -1;

    @ObfuscatedName("ab.aa")
    public int field1034 = -1;

    @ObfuscatedName("ab.ar")
    public int field1035 = 0;

    @ObfuscatedName("ab.at")
    public int field1036 = -1;

    @ObfuscatedName("ab.av")
    public int field1037 = -1;

    @ObfuscatedName("ab.af")
    public int field1007 = -1;

    @ObfuscatedName("ab.ap")
    public int field1044 = -1;

    @ObfuscatedName("ab.ao")
    public int field1040 = -1;

    @ObfuscatedName("ab.az")
    public int field1041 = -1;

    @ObfuscatedName("ab.ac")
    public int[] field1042;

    @ObfuscatedName("ab.ad")
    public int[] field1049;

    @ObfuscatedName("ab.al")
    public int field1051 = -1;

    @ObfuscatedName("ab.ay")
    public int field1023 = -1;

    @ObfuscatedName("ab.ag")
    public int field1046 = 128;

    @ObfuscatedName("ab.ak")
    public int field1047 = 128;

    @ObfuscatedName("ab.an")
    public int field1048 = 128;

    @ObfuscatedName("ab.ab")
    public int field1045 = 0;

    @ObfuscatedName("ab.am")
    public int field1050 = 0;

    @ObfuscatedName("ab.aw")
    public int field1030 = 0;

    @ObfuscatedName("an.g(Leh;Leh;ZLge;I)V")
    public static void method826(class147 arg0, class147 arg1, boolean arg2, class194 arg3) {
        Statics.field1038 = arg0;
        Statics.field1008 = arg1;
        Statics.field2890 = arg2;
        Statics.field1038.method2732(10);
        Statics.field2665 = arg3;
    }

    @ObfuscatedName("av.s(IB)Lab;")
    public static class45 method612(int arg0) {
        class45 var1 = (class45) field1009.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1038.method2667(10, arg0);
        class45 var3 = new class45();
        var3.field1012 = arg0;
        if (var2 != null) {
            var3.method835(new class107(var2));
        }
        var3.method834();
        if (var3.field1023 != -1) {
            var3.method844(method612(var3.field1023), method612(var3.field1051));
        }
        if (!Statics.field2890 && var3.field1027) {
            var3.field1014 = class143.field2289;
            var3.field1028 = null;
            var3.field1029 = null;
            var3.field1030 = 0;
        }
        field1009.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.h(B)V")
    public void method834() {
    }

    @ObfuscatedName("ab.m(Ldi;I)V")
    public void method835(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method836(arg0, var2);
        }
    }

    @ObfuscatedName("ab.u(Ldi;II)V")
    public void method836(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1013 = arg0.method2166();
        } else if (arg1 == 2) {
            this.field1014 = arg0.method2137();
        } else if (arg1 == 4) {
            this.field1019 = arg0.method2166();
        } else if (arg1 == 5) {
            this.field1022 = arg0.method2166();
        } else if (arg1 == 6) {
            this.field1021 = arg0.method2166();
        } else if (arg1 == 7) {
            this.field1010 = arg0.method2166();
            if (this.field1010 > 32767) {
                this.field1010 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1024 = arg0.method2166();
            if (this.field1024 > 32767) {
                this.field1024 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1043 = 1;
        } else if (arg1 == 12) {
            this.field1026 = arg0.method2286();
        } else if (arg1 == 16) {
            this.field1027 = true;
        } else if (arg1 == 23) {
            this.field1020 = arg0.method2166();
            this.field1032 = arg0.method2101();
        } else if (arg1 == 24) {
            this.field1031 = arg0.method2166();
        } else if (arg1 == 25) {
            this.field1033 = arg0.method2166();
            this.field1035 = arg0.method2101();
        } else if (arg1 == 26) {
            this.field1034 = arg0.method2166();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1028[arg1 - 30] = arg0.method2137();
            if (this.field1028[arg1 - 30].equalsIgnoreCase(class143.field2143)) {
                this.field1028[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1029[arg1 - 35] = arg0.method2137();
        } else if (arg1 == 40) {
            int var3 = arg0.method2101();
            this.field1015 = new short[var3];
            this.field1016 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1015[var4] = (short) arg0.method2166();
                this.field1016[var4] = (short) arg0.method2166();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2101();
            this.field1017 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1017[var6] = (short) arg0.method2166();
                this.field1018[var6] = (short) arg0.method2166();
            }
        } else if (arg1 == 78) {
            this.field1036 = arg0.method2166();
        } else if (arg1 == 79) {
            this.field1037 = arg0.method2166();
        } else if (arg1 == 90) {
            this.field1007 = arg0.method2166();
        } else if (arg1 == 91) {
            this.field1040 = arg0.method2166();
        } else if (arg1 == 92) {
            this.field1044 = arg0.method2166();
        } else if (arg1 == 93) {
            this.field1041 = arg0.method2166();
        } else if (arg1 == 95) {
            this.field1025 = arg0.method2166();
        } else if (arg1 == 97) {
            this.field1051 = arg0.method2166();
        } else if (arg1 == 98) {
            this.field1023 = arg0.method2166();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1042 == null) {
                this.field1042 = new int[10];
                this.field1049 = new int[10];
            }
            this.field1042[arg1 - 100] = arg0.method2166();
            this.field1049[arg1 - 100] = arg0.method2166();
        } else if (arg1 == 110) {
            this.field1046 = arg0.method2166();
        } else if (arg1 == 111) {
            this.field1047 = arg0.method2166();
        } else if (arg1 == 112) {
            this.field1048 = arg0.method2166();
        } else if (arg1 == 113) {
            this.field1045 = arg0.method2263();
        } else if (arg1 == 114) {
            this.field1050 = arg0.method2263() * 5;
        } else if (arg1 == 115) {
            this.field1030 = arg0.method2101();
        }
    }

    @ObfuscatedName("ab.j(Lab;Lab;S)V")
    public void method844(class45 arg0, class45 arg1) {
        this.field1013 = arg0.field1013;
        this.field1019 = arg0.field1019;
        this.field1022 = arg0.field1022;
        this.field1021 = arg0.field1021;
        this.field1025 = arg0.field1025;
        this.field1010 = arg0.field1010;
        this.field1024 = arg0.field1024;
        this.field1015 = arg0.field1015;
        this.field1016 = arg0.field1016;
        this.field1017 = arg0.field1017;
        this.field1018 = arg0.field1018;
        this.field1014 = arg1.field1014;
        this.field1027 = arg1.field1027;
        this.field1026 = arg1.field1026;
        this.field1043 = 1;
    }

    @ObfuscatedName("ab.b(II)Lcv;")
    public final class93 method848(int arg0) {
        if (this.field1042 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1049[var3] && this.field1049[var3] != 0) {
                    var2 = this.field1042[var3];
                }
            }
            if (var2 != -1) {
                return method612(var2).method848(1);
            }
        }
        class93 var4 = class93.method1865(Statics.field1008, this.field1013, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1047 != 128 || this.field1048 != 128) {
            var4.method1880(this.field1046, this.field1047, this.field1048);
        }
        if (this.field1015 != null) {
            for (int var5 = 0; var5 < this.field1015.length; var5++) {
                var4.method1877(this.field1015[var5], this.field1016[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method1878(this.field1017[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.v(IS)Lcl;")
    public final class98 method881(int arg0) {
        if (this.field1042 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1049[var3] && this.field1049[var3] != 0) {
                    var2 = this.field1042[var3];
                }
            }
            if (var2 != -1) {
                return method612(var2).method881(1);
            }
        }
        class98 var4 = (class98) field1039.method3130((long) this.field1012);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1865(Statics.field1008, this.field1013, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1047 != 128 || this.field1048 != 128) {
            var5.method1880(this.field1046, this.field1047, this.field1048);
        }
        if (this.field1015 != null) {
            for (int var6 = 0; var6 < this.field1015.length; var6++) {
                var5.method1877(this.field1015[var6], this.field1016[var6]);
            }
        }
        if (this.field1017 != null) {
            for (int var7 = 0; var7 < this.field1017.length; var7++) {
                var5.method1878(this.field1017[var7], this.field1018[var7]);
            }
        }
        class98 var8 = var5.method1885(this.field1045 + 64, this.field1050 + 768, -50, -10, -50);
        var8.field1717 = true;
        field1039.method3126(var8, (long) this.field1012);
        return var8;
    }

    @ObfuscatedName("ab.y(IB)Lab;")
    public class45 method839(int arg0) {
        if (this.field1042 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1049[var3] && this.field1049[var3] != 0) {
                    var2 = this.field1042[var3];
                }
            }
            if (var2 != -1) {
                return method612(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ah.w(IIIIZI)Lbv;")
    public static final class72 method542(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1011.method3130(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method612(arg0);
        if (arg1 > 1 && var8.field1042 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1049[var10] && var8.field1049[var10] != 0) {
                    var9 = var8.field1042[var10];
                }
            }
            if (var9 != -1) {
                var8 = method612(var9);
            }
        }
        class98 var11 = var8.method881(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1023 != -1) {
            var12 = method542(var8.field1051, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1314;
        int var14 = Statics.field1315;
        int var15 = Statics.field1316;
        int[] var16 = new int[4];
        class73.method1518(var16);
        class72 var17 = new class72(36, 32);
        class73.method1519(var17.field1305, 36, 32);
        class73.method1525();
        class84.method1765();
        class84.method1768(16, 16);
        class84.field1473 = false;
        int var18 = var8.field1019;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1461[var8.field1022] * var18 >> 16;
        int var20 = class84.field1484[var8.field1022] * var18 >> 16;
        var11.method1958();
        var11.method1970(0, var8.field1021, var8.field1025, var8.field1022, var8.field1010, var8.field1024 + var11.field1354 / 2 + var19, var8.field1024 + var20);
        if (arg2 >= 1) {
            var17.method1436(1);
        }
        if (arg2 >= 2) {
            var17.method1436(16777215);
        }
        if (arg3 != 0) {
            var17.method1445(arg3);
        }
        class73.method1519(var17.field1305, 36, 32);
        if (var8.field1023 != -1) {
            var12.method1440(0, 0);
        }
        if (!arg4 && (var8.field1043 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field2665.method3319(method87(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1011.method3126(var17, var5);
        }
        class73.method1519(var13, var14, var15);
        class73.method1524(var16);
        class84.method1765();
        class84.field1473 = true;
        return var17;
    }

    @ObfuscatedName("b.x(II)Ljava/lang/String;")
    public static final String method87(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class143.field2304 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class143.field2372 + "</col>";
        }
    }

    @ObfuscatedName("ab.k(ZB)Z")
    public final boolean method840(boolean arg0) {
        int var2 = this.field1020;
        int var3 = this.field1031;
        int var4 = this.field1036;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
            var4 = this.field1037;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1008.method2716(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1008.method2716(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1008.method2716(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ab.o(ZI)Lcv;")
    public final class93 method851(boolean arg0) {
        int var2 = this.field1020;
        int var3 = this.field1031;
        int var4 = this.field1036;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
            var4 = this.field1037;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1865(Statics.field1008, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1865(Statics.field1008, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1865(Statics.field1008, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1032 != 0) {
            var5.method1876(0, this.field1032, 0);
        }
        if (arg0 && this.field1035 != 0) {
            var5.method1876(0, this.field1035, 0);
        }
        if (this.field1015 != null) {
            for (int var10 = 0; var10 < this.field1015.length; var10++) {
                var5.method1877(this.field1015[var10], this.field1016[var10]);
            }
        }
        if (this.field1017 != null) {
            for (int var11 = 0; var11 < this.field1017.length; var11++) {
                var5.method1878(this.field1017[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ab.a(ZI)Z")
    public final boolean method841(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field1044;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1041;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1008.method2716(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1008.method2716(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ab.f(ZB)Lcv;")
    public final class93 method842(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field1044;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1041;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1865(Statics.field1008, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1865(Statics.field1008, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1015 != null) {
            for (int var7 = 0; var7 < this.field1015.length; var7++) {
                var4.method1877(this.field1015[var7], this.field1016[var7]);
            }
        }
        if (this.field1017 != null) {
            for (int var8 = 0; var8 < this.field1017.length; var8++) {
                var4.method1878(this.field1017[var8], this.field1018[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("client.r(B)V")
    public static void method482() {
        field1009.method3127();
        field1039.method3127();
        field1011.method3127();
    }

    @ObfuscatedName("q.e(I)V")
    public static void method531() {
        field1011.method3127();
    }

    @ObfuscatedName("dn.t(ZB)V")
    public static void method2348(boolean arg0) {
        if (Statics.field2890 != arg0) {
            method482();
            Statics.field2890 = arg0;
        }
    }
}
