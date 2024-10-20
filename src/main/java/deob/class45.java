package deob;

@ObfuscatedName("aj")
public class class45 extends class182 {

    @ObfuscatedName("aj.e")
    public static class171 field999 = new class171(64);

    @ObfuscatedName("aj.d")
    public static class171 field1000 = new class171(50);

    @ObfuscatedName("aj.n")
    public static class171 field1011 = new class171(100);

    @ObfuscatedName("aj.z")
    public int field1003;

    @ObfuscatedName("aj.j")
    public int field1004;

    @ObfuscatedName("aj.u")
    public String field1039 = "null";

    @ObfuscatedName("aj.g")
    public short[] field1001;

    @ObfuscatedName("aj.a")
    public short[] field1007;

    @ObfuscatedName("aj.c")
    public short[] field1020;

    @ObfuscatedName("aj.w")
    public short[] field1009;

    @ObfuscatedName("aj.l")
    public int field1010 = 2000;

    @ObfuscatedName("aj.q")
    public int field1005 = 0;

    @ObfuscatedName("aj.x")
    public int field1041 = 0;

    @ObfuscatedName("aj.p")
    public int field1013 = 0;

    @ObfuscatedName("aj.y")
    public int field1014 = 0;

    @ObfuscatedName("aj.r")
    public int field1015 = 0;

    @ObfuscatedName("aj.k")
    public int field1016 = 0;

    @ObfuscatedName("aj.b")
    public int field1017 = 1;

    @ObfuscatedName("aj.h")
    public boolean field996 = false;

    @ObfuscatedName("aj.i")
    public String[] field1019 = new String[] { null, null, class142.field2137, null, null };

    @ObfuscatedName("aj.o")
    public String[] field1027 = new String[] { null, null, null, null, class142.field2174 };

    @ObfuscatedName("aj.m")
    public int field1021 = -1;

    @ObfuscatedName("aj.ak")
    public int field1022 = -1;

    @ObfuscatedName("aj.aw")
    public int field1012 = 0;

    @ObfuscatedName("aj.af")
    public int field1024 = -1;

    @ObfuscatedName("aj.ab")
    public int field1025 = -1;

    @ObfuscatedName("aj.ao")
    public int field1026 = 0;

    @ObfuscatedName("aj.ah")
    public int field1006 = -1;

    @ObfuscatedName("aj.ae")
    public int field1028 = -1;

    @ObfuscatedName("aj.ax")
    public int field1018 = -1;

    @ObfuscatedName("aj.ar")
    public int field1030 = -1;

    @ObfuscatedName("aj.aq")
    public int field1031 = -1;

    @ObfuscatedName("aj.am")
    public int field1008 = -1;

    @ObfuscatedName("aj.az")
    public int[] field1033;

    @ObfuscatedName("aj.an")
    public int[] field1042;

    @ObfuscatedName("aj.at")
    public int field1035 = -1;

    @ObfuscatedName("aj.av")
    public int field1036 = -1;

    @ObfuscatedName("aj.aa")
    public int field1037 = 128;

    @ObfuscatedName("aj.ag")
    public int field1038 = 128;

    @ObfuscatedName("aj.au")
    public int field1029 = 128;

    @ObfuscatedName("aj.aj")
    public int field1040 = 0;

    @ObfuscatedName("aj.ay")
    public int field1023 = 0;

    @ObfuscatedName("aj.ac")
    public int field1034 = 0;

    @ObfuscatedName("m.t(II)Laj;")
    public static class45 method504(int arg0) {
        class45 var1 = (class45) field999.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method2709(10, arg0);
        class45 var3 = new class45();
        var3.field1003 = arg0;
        if (var2 != null) {
            var3.method829(new class107(var2));
        }
        var3.method828();
        if (var3.field1036 != -1) {
            var3.method856(method504(var3.field1036), method504(var3.field1035));
        }
        if (!Statics.field998 && var3.field996) {
            var3.field1039 = class142.field2283;
            var3.field1019 = null;
            var3.field1027 = null;
            var3.field1034 = 0;
        }
        field999.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.s(B)V")
    public void method828() {
    }

    @ObfuscatedName("aj.f(Ldb;I)V")
    public void method829(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method830(arg0, var2);
        }
    }

    @ObfuscatedName("aj.e(Ldb;IS)V")
    public void method830(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1004 = arg0.method2103();
        } else if (arg1 == 2) {
            this.field1039 = arg0.method2109();
        } else if (arg1 == 4) {
            this.field1010 = arg0.method2103();
        } else if (arg1 == 5) {
            this.field1005 = arg0.method2103();
        } else if (arg1 == 6) {
            this.field1041 = arg0.method2103();
        } else if (arg1 == 7) {
            this.field1014 = arg0.method2103();
            if (this.field1014 > 32767) {
                this.field1014 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1015 = arg0.method2103();
            if (this.field1015 > 32767) {
                this.field1015 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1016 = 1;
        } else if (arg1 == 12) {
            this.field1017 = arg0.method2106();
        } else if (arg1 == 16) {
            this.field996 = true;
        } else if (arg1 == 23) {
            this.field1021 = arg0.method2103();
            this.field1012 = arg0.method2101();
        } else if (arg1 == 24) {
            this.field1022 = arg0.method2103();
        } else if (arg1 == 25) {
            this.field1024 = arg0.method2103();
            this.field1026 = arg0.method2101();
        } else if (arg1 == 26) {
            this.field1025 = arg0.method2103();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1019[arg1 - 30] = arg0.method2109();
            if (this.field1019[arg1 - 30].equalsIgnoreCase(class142.field2229)) {
                this.field1019[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1027[arg1 - 35] = arg0.method2109();
        } else if (arg1 == 40) {
            int var3 = arg0.method2101();
            this.field1001 = new short[var3];
            this.field1007 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1001[var4] = (short) arg0.method2103();
                this.field1007[var4] = (short) arg0.method2103();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2101();
            this.field1020 = new short[var5];
            this.field1009 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1020[var6] = (short) arg0.method2103();
                this.field1009[var6] = (short) arg0.method2103();
            }
        } else if (arg1 == 78) {
            this.field1006 = arg0.method2103();
        } else if (arg1 == 79) {
            this.field1028 = arg0.method2103();
        } else if (arg1 == 90) {
            this.field1018 = arg0.method2103();
        } else if (arg1 == 91) {
            this.field1031 = arg0.method2103();
        } else if (arg1 == 92) {
            this.field1030 = arg0.method2103();
        } else if (arg1 == 93) {
            this.field1008 = arg0.method2103();
        } else if (arg1 == 95) {
            this.field1013 = arg0.method2103();
        } else if (arg1 == 97) {
            this.field1035 = arg0.method2103();
        } else if (arg1 == 98) {
            this.field1036 = arg0.method2103();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1033 == null) {
                this.field1033 = new int[10];
                this.field1042 = new int[10];
            }
            this.field1033[arg1 - 100] = arg0.method2103();
            this.field1042[arg1 - 100] = arg0.method2103();
        } else if (arg1 == 110) {
            this.field1037 = arg0.method2103();
        } else if (arg1 == 111) {
            this.field1038 = arg0.method2103();
        } else if (arg1 == 112) {
            this.field1029 = arg0.method2103();
        } else if (arg1 == 113) {
            this.field1040 = arg0.method2102();
        } else if (arg1 == 114) {
            this.field1023 = arg0.method2102() * 5;
        } else if (arg1 == 115) {
            this.field1034 = arg0.method2101();
        }
    }

    @ObfuscatedName("aj.d(Laj;Laj;I)V")
    public void method856(class45 arg0, class45 arg1) {
        this.field1004 = arg0.field1004;
        this.field1010 = arg0.field1010;
        this.field1005 = arg0.field1005;
        this.field1041 = arg0.field1041;
        this.field1013 = arg0.field1013;
        this.field1014 = arg0.field1014;
        this.field1015 = arg0.field1015;
        this.field1001 = arg0.field1001;
        this.field1007 = arg0.field1007;
        this.field1020 = arg0.field1020;
        this.field1009 = arg0.field1009;
        this.field1039 = arg1.field1039;
        this.field996 = arg1.field996;
        this.field1017 = arg1.field1017;
        this.field1016 = 1;
    }

    @ObfuscatedName("aj.n(II)Lca;")
    public final class93 method832(int arg0) {
        if (this.field1033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1042[var3] && this.field1042[var3] != 0) {
                    var2 = this.field1033[var3];
                }
            }
            if (var2 != -1) {
                return method504(var2).method832(1);
            }
        }
        class93 var4 = class93.method1872(Statics.field997, this.field1004, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1037 != 128 || this.field1038 != 128 || this.field1029 != 128) {
            var4.method1867(this.field1037, this.field1038, this.field1029);
        }
        if (this.field1001 != null) {
            for (int var5 = 0; var5 < this.field1001.length; var5++) {
                var4.method1864(this.field1001[var5], this.field1007[var5]);
            }
        }
        if (this.field1020 != null) {
            for (int var6 = 0; var6 < this.field1020.length; var6++) {
                var4.method1865(this.field1020[var6], this.field1009[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.v(II)Lcc;")
    public final class98 method833(int arg0) {
        if (this.field1033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1042[var3] && this.field1042[var3] != 0) {
                    var2 = this.field1033[var3];
                }
            }
            if (var2 != -1) {
                return method504(var2).method833(1);
            }
        }
        class98 var4 = (class98) field1000.method3170((long) this.field1003);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1872(Statics.field997, this.field1004, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1037 != 128 || this.field1038 != 128 || this.field1029 != 128) {
            var5.method1867(this.field1037, this.field1038, this.field1029);
        }
        if (this.field1001 != null) {
            for (int var6 = 0; var6 < this.field1001.length; var6++) {
                var5.method1864(this.field1001[var6], this.field1007[var6]);
            }
        }
        if (this.field1020 != null) {
            for (int var7 = 0; var7 < this.field1020.length; var7++) {
                var5.method1865(this.field1020[var7], this.field1009[var7]);
            }
        }
        class98 var8 = var5.method1871(this.field1040 + 64, this.field1023 + 768, -50, -10, -50);
        var8.field1710 = true;
        field1000.method3168(var8, (long) this.field1003);
        return var8;
    }

    @ObfuscatedName("aj.z(IB)Laj;")
    public class45 method834(int arg0) {
        if (this.field1033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1042[var3] && this.field1042[var3] != 0) {
                    var2 = this.field1033[var3];
                }
            }
            if (var2 != -1) {
                return method504(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("an.j(IIIIZS)Lbv;")
    public static final class72 method739(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1011.method3170(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method504(arg0);
        if (arg1 > 1 && var8.field1033 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1042[var10] && var8.field1042[var10] != 0) {
                    var9 = var8.field1033[var10];
                }
            }
            if (var9 != -1) {
                var8 = method504(var9);
            }
        }
        class98 var11 = var8.method833(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1036 != -1) {
            var12 = method739(var8.field1035, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1299;
        int var14 = Statics.field1300;
        int var15 = Statics.field1302;
        int[] var16 = new int[4];
        class73.method1493(var16);
        class72 var17 = new class72(36, 32);
        class73.method1489(var17.field1287, 36, 32);
        class73.method1504();
        class84.method1800();
        class84.method1805(16, 16);
        class84.field1456 = false;
        int var18 = var8.field1010;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1461[var8.field1005] * var18 >> 16;
        int var20 = class84.field1471[var8.field1005] * var18 >> 16;
        var11.method1949();
        var11.method1958(0, var8.field1041, var8.field1013, var8.field1005, var8.field1014, var8.field1015 + var11.field1341 / 2 + var19, var8.field1015 + var20);
        if (arg2 >= 1) {
            var17.method1406(1);
        }
        if (arg2 >= 2) {
            var17.method1406(16777215);
        }
        if (arg3 != 0) {
            var17.method1407(arg3);
        }
        class73.method1489(var17.field1287, 36, 32);
        if (var8.field1036 != -1) {
            var12.method1410(0, 0);
        }
        if (!arg4 && (var8.field1016 == 1 || arg1 != 1) && arg1 != -1) {
            class193 var21 = Statics.field1002;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2210 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2298 + "</col>";
            }
            var21.method3341(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1011.method3168(var17, var5);
        }
        class73.method1489(var13, var14, var15);
        class73.method1500(var16);
        class84.method1800();
        class84.field1456 = true;
        return var17;
    }

    @ObfuscatedName("aj.u(ZI)Z")
    public final boolean method835(boolean arg0) {
        int var2 = this.field1021;
        int var3 = this.field1022;
        int var4 = this.field1006;
        if (arg0) {
            var2 = this.field1024;
            var3 = this.field1025;
            var4 = this.field1028;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field997.method2740(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field997.method2740(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field997.method2740(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.g(ZB)Lca;")
    public final class93 method851(boolean arg0) {
        int var2 = this.field1021;
        int var3 = this.field1022;
        int var4 = this.field1006;
        if (arg0) {
            var2 = this.field1024;
            var3 = this.field1025;
            var4 = this.field1028;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1872(Statics.field997, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1872(Statics.field997, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1872(Statics.field997, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1012 != 0) {
            var5.method1863(0, this.field1012, 0);
        }
        if (arg0 && this.field1026 != 0) {
            var5.method1863(0, this.field1026, 0);
        }
        if (this.field1001 != null) {
            for (int var10 = 0; var10 < this.field1001.length; var10++) {
                var5.method1864(this.field1001[var10], this.field1007[var10]);
            }
        }
        if (this.field1020 != null) {
            for (int var11 = 0; var11 < this.field1020.length; var11++) {
                var5.method1865(this.field1020[var11], this.field1009[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.a(ZI)Z")
    public final boolean method865(boolean arg0) {
        int var2 = this.field1018;
        int var3 = this.field1030;
        if (arg0) {
            var2 = this.field1031;
            var3 = this.field1008;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field997.method2740(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field997.method2740(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.c(ZB)Lca;")
    public final class93 method838(boolean arg0) {
        int var2 = this.field1018;
        int var3 = this.field1030;
        if (arg0) {
            var2 = this.field1031;
            var3 = this.field1008;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1872(Statics.field997, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1872(Statics.field997, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1001 != null) {
            for (int var7 = 0; var7 < this.field1001.length; var7++) {
                var4.method1864(this.field1001[var7], this.field1007[var7]);
            }
        }
        if (this.field1020 != null) {
            for (int var8 = 0; var8 < this.field1020.length; var8++) {
                var4.method1865(this.field1020[var8], this.field1009[var8]);
            }
        }
        return var4;
    }
}
