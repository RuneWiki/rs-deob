package deob;

@ObfuscatedName("an")
public class class45 extends class180 {

    @ObfuscatedName("an.g")
    public static class170 field1047 = new class170(64);

    @ObfuscatedName("an.u")
    public static class170 field1003 = new class170(50);

    @ObfuscatedName("an.k")
    public static class170 field1004 = new class170(100);

    @ObfuscatedName("an.t")
    public int field1005;

    @ObfuscatedName("an.l")
    public int field1006;

    @ObfuscatedName("an.f")
    public String field999 = "null";

    @ObfuscatedName("an.c")
    public short[] field1008;

    @ObfuscatedName("an.i")
    public short[] field1041;

    @ObfuscatedName("an.o")
    public short[] field1010;

    @ObfuscatedName("an.d")
    public short[] field1011;

    @ObfuscatedName("an.b")
    public int field1012 = 2000;

    @ObfuscatedName("an.v")
    public int field1013 = 0;

    @ObfuscatedName("an.n")
    public int field1001 = 0;

    @ObfuscatedName("an.w")
    public int field1037 = 0;

    @ObfuscatedName("an.z")
    public int field1036 = 0;

    @ObfuscatedName("an.x")
    public int field1043 = 0;

    @ObfuscatedName("an.q")
    public int field1018 = 0;

    @ObfuscatedName("an.s")
    public int field1019 = 1;

    @ObfuscatedName("an.j")
    public boolean field1020 = false;

    @ObfuscatedName("an.y")
    public String[] field1021 = new String[] { null, null, class142.field2261, null, null };

    @ObfuscatedName("an.r")
    public String[] field1022 = new String[] { null, null, null, null, class142.field2146 };

    @ObfuscatedName("an.h")
    public int field1035 = -1;

    @ObfuscatedName("an.ak")
    public int field1024 = -1;

    @ObfuscatedName("an.ab")
    public int field1025 = 0;

    @ObfuscatedName("an.as")
    public int field1026 = -1;

    @ObfuscatedName("an.aq")
    public int field1027 = -1;

    @ObfuscatedName("an.ai")
    public int field1009 = 0;

    @ObfuscatedName("an.aw")
    public int field1029 = -1;

    @ObfuscatedName("an.aj")
    public int field1030 = -1;

    @ObfuscatedName("an.ax")
    public int field1031 = -1;

    @ObfuscatedName("an.ar")
    public int field1014 = -1;

    @ObfuscatedName("an.ac")
    public int field1033 = -1;

    @ObfuscatedName("an.ap")
    public int field1034 = -1;

    @ObfuscatedName("an.az")
    public int[] field1015;

    @ObfuscatedName("an.ae")
    public int[] field1002;

    @ObfuscatedName("an.ah")
    public int field1023 = -1;

    @ObfuscatedName("an.ad")
    public int field1038 = -1;

    @ObfuscatedName("an.ay")
    public int field1039 = 128;

    @ObfuscatedName("an.at")
    public int field1040 = 128;

    @ObfuscatedName("an.au")
    public int field1032 = 128;

    @ObfuscatedName("an.an")
    public int field1042 = 0;

    @ObfuscatedName("an.al")
    public int field1017 = 0;

    @ObfuscatedName("an.am")
    public int field1044 = 0;

    @ObfuscatedName("z.e(Lec;Lec;ZLgb;B)V")
    public static void method481(class145 arg0, class145 arg1, boolean arg2, class190 arg3) {
        Statics.field1016 = arg0;
        Statics.field1000 = arg1;
        Statics.field1028 = arg2;
        Statics.field1016.method2726(10);
        Statics.field210 = arg3;
    }

    @ObfuscatedName("ab.p(II)Lan;")
    public static class45 method573(int arg0) {
        class45 var1 = (class45) field1047.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1016.method2717(10, arg0);
        class45 var3 = new class45();
        var3.field1005 = arg0;
        if (var2 != null) {
            var3.method876(new class107(var2));
        }
        var3.method893();
        if (var3.field1038 != -1) {
            var3.method871(method573(var3.field1038), method573(var3.field1023));
        }
        if (!Statics.field1028 && var3.field1020) {
            var3.field999 = class142.field2297;
            var3.field1021 = null;
            var3.field1022 = null;
            var3.field1044 = 0;
        }
        field1047.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.a(I)V")
    public void method893() {
    }

    @ObfuscatedName("an.g(Ldp;I)V")
    public void method876(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method870(arg0, var2);
        }
    }

    @ObfuscatedName("an.u(Ldp;II)V")
    public void method870(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1006 = arg0.method2182();
        } else if (arg1 == 2) {
            this.field999 = arg0.method2149();
        } else if (arg1 == 4) {
            this.field1012 = arg0.method2182();
        } else if (arg1 == 5) {
            this.field1013 = arg0.method2182();
        } else if (arg1 == 6) {
            this.field1001 = arg0.method2182();
        } else if (arg1 == 7) {
            this.field1036 = arg0.method2182();
            if (this.field1036 > 32767) {
                this.field1036 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1043 = arg0.method2182();
            if (this.field1043 > 32767) {
                this.field1043 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1018 = 1;
        } else if (arg1 == 12) {
            this.field1019 = arg0.method2146();
        } else if (arg1 == 16) {
            this.field1020 = true;
        } else if (arg1 == 23) {
            this.field1035 = arg0.method2182();
            this.field1025 = arg0.method2125();
        } else if (arg1 == 24) {
            this.field1024 = arg0.method2182();
        } else if (arg1 == 25) {
            this.field1026 = arg0.method2182();
            this.field1009 = arg0.method2125();
        } else if (arg1 == 26) {
            this.field1027 = arg0.method2182();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1021[arg1 - 30] = arg0.method2149();
            if (this.field1021[arg1 - 30].equalsIgnoreCase(class142.field2147)) {
                this.field1021[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1022[arg1 - 35] = arg0.method2149();
        } else if (arg1 == 40) {
            int var3 = arg0.method2125();
            this.field1008 = new short[var3];
            this.field1041 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1008[var4] = (short) arg0.method2182();
                this.field1041[var4] = (short) arg0.method2182();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2125();
            this.field1010 = new short[var5];
            this.field1011 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1010[var6] = (short) arg0.method2182();
                this.field1011[var6] = (short) arg0.method2182();
            }
        } else if (arg1 == 78) {
            this.field1029 = arg0.method2182();
        } else if (arg1 == 79) {
            this.field1030 = arg0.method2182();
        } else if (arg1 == 90) {
            this.field1031 = arg0.method2182();
        } else if (arg1 == 91) {
            this.field1033 = arg0.method2182();
        } else if (arg1 == 92) {
            this.field1014 = arg0.method2182();
        } else if (arg1 == 93) {
            this.field1034 = arg0.method2182();
        } else if (arg1 == 95) {
            this.field1037 = arg0.method2182();
        } else if (arg1 == 97) {
            this.field1023 = arg0.method2182();
        } else if (arg1 == 98) {
            this.field1038 = arg0.method2182();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1015 == null) {
                this.field1015 = new int[10];
                this.field1002 = new int[10];
            }
            this.field1015[arg1 - 100] = arg0.method2182();
            this.field1002[arg1 - 100] = arg0.method2182();
        } else if (arg1 == 110) {
            this.field1039 = arg0.method2182();
        } else if (arg1 == 111) {
            this.field1040 = arg0.method2182();
        } else if (arg1 == 112) {
            this.field1032 = arg0.method2182();
        } else if (arg1 == 113) {
            this.field1042 = arg0.method2201();
        } else if (arg1 == 114) {
            this.field1017 = arg0.method2201() * 5;
        } else if (arg1 == 115) {
            this.field1044 = arg0.method2125();
        }
    }

    @ObfuscatedName("an.k(Lan;Lan;B)V")
    public void method871(class45 arg0, class45 arg1) {
        this.field1006 = arg0.field1006;
        this.field1012 = arg0.field1012;
        this.field1013 = arg0.field1013;
        this.field1001 = arg0.field1001;
        this.field1037 = arg0.field1037;
        this.field1036 = arg0.field1036;
        this.field1043 = arg0.field1043;
        this.field1008 = arg0.field1008;
        this.field1041 = arg0.field1041;
        this.field1010 = arg0.field1010;
        this.field1011 = arg0.field1011;
        this.field999 = arg1.field999;
        this.field1020 = arg1.field1020;
        this.field1019 = arg1.field1019;
        this.field1018 = 1;
    }

    @ObfuscatedName("an.m(II)Lcw;")
    public final class93 method872(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1002[var3] && this.field1002[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method573(var2).method872(1);
            }
        }
        class93 var4 = class93.method1960(Statics.field1000, this.field1006, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1039 != 128 || this.field1040 != 128 || this.field1032 != 128) {
            var4.method1923(this.field1039, this.field1040, this.field1032);
        }
        if (this.field1008 != null) {
            for (int var5 = 0; var5 < this.field1008.length; var5++) {
                var4.method1892(this.field1008[var5], this.field1041[var5]);
            }
        }
        if (this.field1010 != null) {
            for (int var6 = 0; var6 < this.field1010.length; var6++) {
                var4.method1904(this.field1010[var6], this.field1011[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.t(II)Lcs;")
    public final class98 method873(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1002[var3] && this.field1002[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method573(var2).method873(1);
            }
        }
        class98 var4 = (class98) field1003.method3166((long) this.field1005);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1960(Statics.field1000, this.field1006, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1039 != 128 || this.field1040 != 128 || this.field1032 != 128) {
            var5.method1923(this.field1039, this.field1040, this.field1032);
        }
        if (this.field1008 != null) {
            for (int var6 = 0; var6 < this.field1008.length; var6++) {
                var5.method1892(this.field1008[var6], this.field1041[var6]);
            }
        }
        if (this.field1010 != null) {
            for (int var7 = 0; var7 < this.field1010.length; var7++) {
                var5.method1904(this.field1010[var7], this.field1011[var7]);
            }
        }
        class98 var8 = var5.method1911(this.field1042 + 64, this.field1017 + 768, -50, -10, -50);
        var8.field1710 = true;
        field1003.method3161(var8, (long) this.field1005);
        return var8;
    }

    @ObfuscatedName("an.l(II)Lan;")
    public class45 method874(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1002[var3] && this.field1002[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method573(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dr.f(IIIIZI)Lbu;")
    public static final class72 method2522(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1004.method3166(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method573(arg0);
        if (arg1 > 1 && var8.field1015 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1002[var10] && var8.field1002[var10] != 0) {
                    var9 = var8.field1015[var10];
                }
            }
            if (var9 != -1) {
                var8 = method573(var9);
            }
        }
        class98 var11 = var8.method873(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1038 != -1) {
            var12 = method2522(var8.field1023, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1303;
        int var14 = Statics.field1301;
        int var15 = Statics.field1305;
        int[] var16 = new int[4];
        class73.method1524(var16);
        class72 var17 = new class72(36, 32);
        class73.method1521(var17.field1292, 36, 32);
        class73.method1526();
        class84.method1796();
        class84.method1803(16, 16);
        class84.field1449 = false;
        int var18 = var8.field1012;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1469[var8.field1013] * var18 >> 16;
        int var20 = class84.field1470[var8.field1013] * var18 >> 16;
        var11.method1988();
        var11.method1983(0, var8.field1001, var8.field1037, var8.field1013, var8.field1036, var8.field1043 + var11.field1343 / 2 + var19, var8.field1043 + var20);
        if (arg2 >= 1) {
            var17.method1446(1);
        }
        if (arg2 >= 2) {
            var17.method1446(16777215);
        }
        if (arg3 != 0) {
            var17.method1442(arg3);
        }
        class73.method1521(var17.field1292, 36, 32);
        if (var8.field1038 != -1) {
            var12.method1436(0, 0);
        }
        if (!arg4 && (var8.field1018 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field210.method3394(Statics.method2665(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1004.method3161(var17, var5);
        }
        class73.method1521(var13, var14, var15);
        class73.method1525(var16);
        class84.method1796();
        class84.field1449 = true;
        return var17;
    }

    @ObfuscatedName("an.i(ZI)Z")
    public final boolean method875(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1024;
        int var4 = this.field1029;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1027;
            var4 = this.field1030;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1000.method2719(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1000.method2719(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1000.method2719(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.o(ZI)Lcw;")
    public final class93 method869(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1024;
        int var4 = this.field1029;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1027;
            var4 = this.field1030;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1960(Statics.field1000, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1960(Statics.field1000, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1960(Statics.field1000, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1025 != 0) {
            var5.method1902(0, this.field1025, 0);
        }
        if (arg0 && this.field1009 != 0) {
            var5.method1902(0, this.field1009, 0);
        }
        if (this.field1008 != null) {
            for (int var10 = 0; var10 < this.field1008.length; var10++) {
                var5.method1892(this.field1008[var10], this.field1041[var10]);
            }
        }
        if (this.field1010 != null) {
            for (int var11 = 0; var11 < this.field1010.length; var11++) {
                var5.method1904(this.field1010[var11], this.field1011[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.d(ZB)Z")
    public final boolean method915(boolean arg0) {
        int var2 = this.field1031;
        int var3 = this.field1014;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1000.method2719(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1000.method2719(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.b(ZB)Lcw;")
    public final class93 method878(boolean arg0) {
        int var2 = this.field1031;
        int var3 = this.field1014;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1960(Statics.field1000, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1960(Statics.field1000, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1008 != null) {
            for (int var7 = 0; var7 < this.field1008.length; var7++) {
                var4.method1892(this.field1008[var7], this.field1041[var7]);
            }
        }
        if (this.field1010 != null) {
            for (int var8 = 0; var8 < this.field1010.length; var8++) {
                var4.method1904(this.field1010[var8], this.field1011[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("k.v(I)V")
    public static void method71() {
        field1047.method3162();
        field1003.method3162();
        field1004.method3162();
    }
}
