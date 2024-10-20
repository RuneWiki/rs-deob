package deob;

@ObfuscatedName("an")
public class class45 extends class183 {

    @ObfuscatedName("an.i")
    public static class172 field1009 = new class172(64);

    @ObfuscatedName("an.d")
    public static class172 field1027 = new class172(50);

    @ObfuscatedName("an.q")
    public static class172 field1011 = new class172(100);

    @ObfuscatedName("an.a")
    public int field1012;

    @ObfuscatedName("an.w")
    public int field1030;

    @ObfuscatedName("an.e")
    public String field1014 = "null";

    @ObfuscatedName("an.o")
    public short[] field1015;

    @ObfuscatedName("an.v")
    public short[] field1041;

    @ObfuscatedName("an.z")
    public short[] field1017;

    @ObfuscatedName("an.j")
    public short[] field1018;

    @ObfuscatedName("an.r")
    public int field1019 = 2000;

    @ObfuscatedName("an.c")
    public int field1020 = 0;

    @ObfuscatedName("an.u")
    public int field1021 = 0;

    @ObfuscatedName("an.h")
    public int field1022 = 0;

    @ObfuscatedName("an.t")
    public int field1023 = 0;

    @ObfuscatedName("an.f")
    public int field1006 = 0;

    @ObfuscatedName("an.g")
    public int field1025 = 0;

    @ObfuscatedName("an.s")
    public int field1026 = 1;

    @ObfuscatedName("an.y")
    public boolean field1010 = false;

    @ObfuscatedName("an.p")
    public String[] field1028 = new String[] { null, null, class143.field2142, null, null };

    @ObfuscatedName("an.b")
    public String[] field1029 = new String[] { null, null, null, null, class143.field2156 };

    @ObfuscatedName("an.l")
    public int field1013 = -1;

    @ObfuscatedName("an.al")
    public int field1031 = -1;

    @ObfuscatedName("an.aa")
    public int field1032 = 0;

    @ObfuscatedName("an.ar")
    public int field1033 = -1;

    @ObfuscatedName("an.ak")
    public int field1034 = -1;

    @ObfuscatedName("an.ay")
    public int field1045 = 0;

    @ObfuscatedName("an.aw")
    public int field1036 = -1;

    @ObfuscatedName("an.av")
    public int field1037 = -1;

    @ObfuscatedName("an.at")
    public int field1038 = -1;

    @ObfuscatedName("an.af")
    public int field1039 = -1;

    @ObfuscatedName("an.ae")
    public int field1040 = -1;

    @ObfuscatedName("an.ai")
    public int field1049 = -1;

    @ObfuscatedName("an.as")
    public int[] field1044;

    @ObfuscatedName("an.aj")
    public int[] field1035;

    @ObfuscatedName("an.au")
    public int field1043 = -1;

    @ObfuscatedName("an.az")
    public int field1008 = -1;

    @ObfuscatedName("an.ao")
    public int field1046 = 128;

    @ObfuscatedName("an.ag")
    public int field1047 = 128;

    @ObfuscatedName("an.aq")
    public int field1048 = 128;

    @ObfuscatedName("an.an")
    public int field1024 = 0;

    @ObfuscatedName("an.ax")
    public int field1050 = 0;

    @ObfuscatedName("an.ap")
    public int field1051 = 0;

    @ObfuscatedName("cv.n(II)Lan;")
    public static class45 method1982(int arg0) {
        class45 var1 = (class45) field1009.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1042.method2738(10, arg0);
        class45 var3 = new class45();
        var3.field1012 = arg0;
        if (var2 != null) {
            var3.method846(new class107(var2));
        }
        var3.method880();
        if (var3.field1008 != -1) {
            var3.method848(method1982(var3.field1008), method1982(var3.field1043));
        }
        if (!Statics.field1016 && var3.field1010) {
            var3.field1014 = class143.field2339;
            var3.field1028 = null;
            var3.field1029 = null;
            var3.field1051 = 0;
        }
        field1009.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.x(I)V")
    public void method880() {
    }

    @ObfuscatedName("an.k(Ldw;I)V")
    public void method846(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method896(arg0, var2);
        }
    }

    @ObfuscatedName("an.i(Ldw;IB)V")
    public void method896(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1030 = arg0.method2140();
        } else if (arg1 == 2) {
            this.field1014 = arg0.method2182();
        } else if (arg1 == 4) {
            this.field1019 = arg0.method2140();
        } else if (arg1 == 5) {
            this.field1020 = arg0.method2140();
        } else if (arg1 == 6) {
            this.field1021 = arg0.method2140();
        } else if (arg1 == 7) {
            this.field1023 = arg0.method2140();
            if (this.field1023 > 32767) {
                this.field1023 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1006 = arg0.method2140();
            if (this.field1006 > 32767) {
                this.field1006 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1025 = 1;
        } else if (arg1 == 12) {
            this.field1026 = arg0.method2183();
        } else if (arg1 == 16) {
            this.field1010 = true;
        } else if (arg1 == 23) {
            this.field1013 = arg0.method2140();
            this.field1032 = arg0.method2148();
        } else if (arg1 == 24) {
            this.field1031 = arg0.method2140();
        } else if (arg1 == 25) {
            this.field1033 = arg0.method2140();
            this.field1045 = arg0.method2148();
        } else if (arg1 == 26) {
            this.field1034 = arg0.method2140();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1028[arg1 - 30] = arg0.method2182();
            if (this.field1028[arg1 - 30].equalsIgnoreCase(class143.field2327)) {
                this.field1028[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1029[arg1 - 35] = arg0.method2182();
        } else if (arg1 == 40) {
            int var3 = arg0.method2148();
            this.field1015 = new short[var3];
            this.field1041 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1015[var4] = (short) arg0.method2140();
                this.field1041[var4] = (short) arg0.method2140();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2148();
            this.field1017 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1017[var6] = (short) arg0.method2140();
                this.field1018[var6] = (short) arg0.method2140();
            }
        } else if (arg1 == 78) {
            this.field1036 = arg0.method2140();
        } else if (arg1 == 79) {
            this.field1037 = arg0.method2140();
        } else if (arg1 == 90) {
            this.field1038 = arg0.method2140();
        } else if (arg1 == 91) {
            this.field1040 = arg0.method2140();
        } else if (arg1 == 92) {
            this.field1039 = arg0.method2140();
        } else if (arg1 == 93) {
            this.field1049 = arg0.method2140();
        } else if (arg1 == 95) {
            this.field1022 = arg0.method2140();
        } else if (arg1 == 97) {
            this.field1043 = arg0.method2140();
        } else if (arg1 == 98) {
            this.field1008 = arg0.method2140();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1044 == null) {
                this.field1044 = new int[10];
                this.field1035 = new int[10];
            }
            this.field1044[arg1 - 100] = arg0.method2140();
            this.field1035[arg1 - 100] = arg0.method2140();
        } else if (arg1 == 110) {
            this.field1046 = arg0.method2140();
        } else if (arg1 == 111) {
            this.field1047 = arg0.method2140();
        } else if (arg1 == 112) {
            this.field1048 = arg0.method2140();
        } else if (arg1 == 113) {
            this.field1024 = arg0.method2175();
        } else if (arg1 == 114) {
            this.field1050 = arg0.method2175() * 5;
        } else if (arg1 == 115) {
            this.field1051 = arg0.method2148();
        }
    }

    @ObfuscatedName("an.d(Lan;Lan;B)V")
    public void method848(class45 arg0, class45 arg1) {
        this.field1030 = arg0.field1030;
        this.field1019 = arg0.field1019;
        this.field1020 = arg0.field1020;
        this.field1021 = arg0.field1021;
        this.field1022 = arg0.field1022;
        this.field1023 = arg0.field1023;
        this.field1006 = arg0.field1006;
        this.field1015 = arg0.field1015;
        this.field1041 = arg0.field1041;
        this.field1017 = arg0.field1017;
        this.field1018 = arg0.field1018;
        this.field1014 = arg1.field1014;
        this.field1010 = arg1.field1010;
        this.field1026 = arg1.field1026;
        this.field1025 = 1;
    }

    @ObfuscatedName("an.q(IB)Lcx;")
    public final class93 method849(int arg0) {
        if (this.field1044 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1035[var3] && this.field1035[var3] != 0) {
                    var2 = this.field1044[var3];
                }
            }
            if (var2 != -1) {
                return method1982(var2).method849(1);
            }
        }
        class93 var4 = class93.method1894(Statics.field1007, this.field1030, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1047 != 128 || this.field1048 != 128) {
            var4.method1903(this.field1046, this.field1047, this.field1048);
        }
        if (this.field1015 != null) {
            for (int var5 = 0; var5 < this.field1015.length; var5++) {
                var4.method1907(this.field1015[var5], this.field1041[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method1953(this.field1017[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.m(II)Lcy;")
    public final class98 method868(int arg0) {
        if (this.field1044 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1035[var3] && this.field1035[var3] != 0) {
                    var2 = this.field1044[var3];
                }
            }
            if (var2 != -1) {
                return method1982(var2).method868(1);
            }
        }
        class98 var4 = (class98) field1027.method3115((long) this.field1012);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1894(Statics.field1007, this.field1030, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1047 != 128 || this.field1048 != 128) {
            var5.method1903(this.field1046, this.field1047, this.field1048);
        }
        if (this.field1015 != null) {
            for (int var6 = 0; var6 < this.field1015.length; var6++) {
                var5.method1907(this.field1015[var6], this.field1041[var6]);
            }
        }
        if (this.field1017 != null) {
            for (int var7 = 0; var7 < this.field1017.length; var7++) {
                var5.method1953(this.field1017[var7], this.field1018[var7]);
            }
        }
        class98 var8 = var5.method1908(this.field1024 + 64, this.field1050 + 768, -50, -10, -50);
        var8.field1705 = true;
        field1027.method3117(var8, (long) this.field1012);
        return var8;
    }

    @ObfuscatedName("an.a(II)Lan;")
    public class45 method851(int arg0) {
        if (this.field1044 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1035[var3] && this.field1035[var3] != 0) {
                    var2 = this.field1044[var3];
                }
            }
            if (var2 != -1) {
                return method1982(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bw.w(IIIIZI)Lbq;")
    public static final class72 method1421(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1011.method3115(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method1982(arg0);
        if (arg1 > 1 && var8.field1044 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1035[var10] && var8.field1035[var10] != 0) {
                    var9 = var8.field1044[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1982(var9);
            }
        }
        class98 var11 = var8.method868(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1008 != -1) {
            var12 = method1421(var8.field1043, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1302;
        int var14 = Statics.field1300;
        int var15 = Statics.field1303;
        int[] var16 = new int[4];
        class73.method1530(var16);
        class72 var17 = new class72(36, 32);
        class73.method1526(var17.field1298, 36, 32);
        class73.method1532();
        class84.method1784();
        class84.method1787(16, 16);
        class84.field1446 = false;
        int var18 = var8.field1019;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1466[var8.field1020] * var18 >> 16;
        int var20 = class84.field1467[var8.field1020] * var18 >> 16;
        var11.method1989();
        var11.method2002(0, var8.field1021, var8.field1022, var8.field1020, var8.field1023, var8.field1006 + var11.field1339 / 2 + var19, var8.field1006 + var20);
        if (arg2 >= 1) {
            var17.method1451(1);
        }
        if (arg2 >= 2) {
            var17.method1451(16777215);
        }
        if (arg3 != 0) {
            var17.method1442(arg3);
        }
        class73.method1526(var17.field1298, 36, 32);
        if (var8.field1008 != -1) {
            var12.method1502(0, 0);
        }
        if (!arg4 && (var8.field1025 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field1899.method3344(method570(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1011.method3117(var17, var5);
        }
        class73.method1526(var13, var14, var15);
        class73.method1579(var16);
        class84.method1784();
        class84.field1446 = true;
        return var17;
    }

    @ObfuscatedName("aa.e(II)Ljava/lang/String;")
    public static final String method570(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class143.field2190 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class143.field2303 + "</col>";
        }
    }

    @ObfuscatedName("an.o(ZB)Z")
    public final boolean method852(boolean arg0) {
        int var2 = this.field1013;
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
        if (!Statics.field1007.method2712(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1007.method2712(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1007.method2712(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.v(ZB)Lcx;")
    public final class93 method860(boolean arg0) {
        int var2 = this.field1013;
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
        class93 var5 = class93.method1894(Statics.field1007, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1894(Statics.field1007, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1894(Statics.field1007, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1032 != 0) {
            var5.method1899(0, this.field1032, 0);
        }
        if (arg0 && this.field1045 != 0) {
            var5.method1899(0, this.field1045, 0);
        }
        if (this.field1015 != null) {
            for (int var10 = 0; var10 < this.field1015.length; var10++) {
                var5.method1907(this.field1015[var10], this.field1041[var10]);
            }
        }
        if (this.field1017 != null) {
            for (int var11 = 0; var11 < this.field1017.length; var11++) {
                var5.method1953(this.field1017[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.z(ZB)Z")
    public final boolean method872(boolean arg0) {
        int var2 = this.field1038;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1049;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1007.method2712(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1007.method2712(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.j(ZI)Lcx;")
    public final class93 method854(boolean arg0) {
        int var2 = this.field1038;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1049;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1894(Statics.field1007, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1894(Statics.field1007, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1015 != null) {
            for (int var7 = 0; var7 < this.field1015.length; var7++) {
                var4.method1907(this.field1015[var7], this.field1041[var7]);
            }
        }
        if (this.field1017 != null) {
            for (int var8 = 0; var8 < this.field1017.length; var8++) {
                var4.method1953(this.field1017[var8], this.field1018[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("w.r(B)V")
    public static void method112() {
        field1011.method3124();
    }
}
