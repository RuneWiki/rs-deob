package deob;

@ObfuscatedName("aw")
public class class45 extends class180 {

    @ObfuscatedName("aw.v")
    public static class170 field996 = new class170(64);

    @ObfuscatedName("aw.l")
    public static class170 field1037 = new class170(50);

    @ObfuscatedName("aw.g")
    public static class170 field998 = new class170(100);

    @ObfuscatedName("aw.x")
    public int field1009;

    @ObfuscatedName("aw.r")
    public int field1000;

    @ObfuscatedName("aw.w")
    public String field1001 = "null";

    @ObfuscatedName("aw.c")
    public short[] field1002;

    @ObfuscatedName("aw.f")
    public short[] field1038;

    @ObfuscatedName("aw.o")
    public short[] field1004;

    @ObfuscatedName("aw.p")
    public short[] field1005;

    @ObfuscatedName("aw.n")
    public int field1006 = 2000;

    @ObfuscatedName("aw.m")
    public int field1007 = 0;

    @ObfuscatedName("aw.s")
    public int field1008 = 0;

    @ObfuscatedName("aw.t")
    public int field1021 = 0;

    @ObfuscatedName("aw.j")
    public int field1010 = 0;

    @ObfuscatedName("aw.b")
    public int field1011 = 0;

    @ObfuscatedName("aw.i")
    public int field994 = 0;

    @ObfuscatedName("aw.h")
    public int field1013 = 1;

    @ObfuscatedName("aw.q")
    public boolean field1040 = false;

    @ObfuscatedName("aw.d")
    public String[] field997 = new String[] { null, null, class142.field2152, null, null };

    @ObfuscatedName("aw.z")
    public String[] field1016 = new String[] { null, null, null, null, class142.field2344 };

    @ObfuscatedName("aw.e")
    public int field1003 = -1;

    @ObfuscatedName("aw.av")
    public int field1029 = -1;

    @ObfuscatedName("aw.al")
    public int field1019 = 0;

    @ObfuscatedName("aw.aq")
    public int field1020 = -1;

    @ObfuscatedName("aw.aa")
    public int field1033 = -1;

    @ObfuscatedName("aw.ah")
    public int field1022 = 0;

    @ObfuscatedName("aw.au")
    public int field1023 = -1;

    @ObfuscatedName("aw.ai")
    public int field1024 = -1;

    @ObfuscatedName("aw.ab")
    public int field1025 = -1;

    @ObfuscatedName("aw.ag")
    public int field1026 = -1;

    @ObfuscatedName("aw.ax")
    public int field1027 = -1;

    @ObfuscatedName("aw.af")
    public int field1014 = -1;

    @ObfuscatedName("aw.ao")
    public int[] field1015;

    @ObfuscatedName("aw.ac")
    public int[] field1012;

    @ObfuscatedName("aw.aj")
    public int field1031 = -1;

    @ObfuscatedName("aw.ap")
    public int field1032 = -1;

    @ObfuscatedName("aw.ae")
    public int field1030 = 128;

    @ObfuscatedName("aw.at")
    public int field1034 = 128;

    @ObfuscatedName("aw.as")
    public int field1035 = 128;

    @ObfuscatedName("aw.aw")
    public int field1036 = 0;

    @ObfuscatedName("aw.ak")
    public int field1017 = 0;

    @ObfuscatedName("aw.az")
    public int field999 = 0;

    @ObfuscatedName("ct.y(Lev;Lev;ZLgc;I)V")
    public static void method1850(class145 arg0, class145 arg1, boolean arg2, class190 arg3) {
        Statics.field1041 = arg0;
        Statics.field818 = arg1;
        Statics.field995 = arg2;
        Statics.field1041.method2714(10);
        Statics.field779 = arg3;
    }

    @ObfuscatedName("m.u(II)Law;")
    public static class45 method148(int arg0) {
        class45 var1 = (class45) field996.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1041.method2704(10, arg0);
        class45 var3 = new class45();
        var3.field1009 = arg0;
        if (var2 != null) {
            var3.method843(new class107(var2));
        }
        var3.method842();
        if (var3.field1032 != -1) {
            var3.method845(method148(var3.field1032), method148(var3.field1031));
        }
        if (!Statics.field995 && var3.field1040) {
            var3.field1001 = class142.field2301;
            var3.field997 = null;
            var3.field1016 = null;
            var3.field999 = 0;
        }
        field996.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.k(B)V")
    public void method842() {
    }

    @ObfuscatedName("aw.v(Ldo;I)V")
    public void method843(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method844(arg0, var2);
        }
    }

    @ObfuscatedName("aw.l(Ldo;II)V")
    public void method844(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1000 = arg0.method2111();
        } else if (arg1 == 2) {
            this.field1001 = arg0.method2126();
        } else if (arg1 == 4) {
            this.field1006 = arg0.method2111();
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2111();
        } else if (arg1 == 6) {
            this.field1008 = arg0.method2111();
        } else if (arg1 == 7) {
            this.field1010 = arg0.method2111();
            if (this.field1010 > 32767) {
                this.field1010 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1011 = arg0.method2111();
            if (this.field1011 > 32767) {
                this.field1011 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field994 = 1;
        } else if (arg1 == 12) {
            this.field1013 = arg0.method2114();
        } else if (arg1 == 16) {
            this.field1040 = true;
        } else if (arg1 == 23) {
            this.field1003 = arg0.method2111();
            this.field1019 = arg0.method2109();
        } else if (arg1 == 24) {
            this.field1029 = arg0.method2111();
        } else if (arg1 == 25) {
            this.field1020 = arg0.method2111();
            this.field1022 = arg0.method2109();
        } else if (arg1 == 26) {
            this.field1033 = arg0.method2111();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field997[arg1 - 30] = arg0.method2126();
            if (this.field997[arg1 - 30].equalsIgnoreCase(class142.field2154)) {
                this.field997[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1016[arg1 - 35] = arg0.method2126();
        } else if (arg1 == 40) {
            int var3 = arg0.method2109();
            this.field1002 = new short[var3];
            this.field1038 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1002[var4] = (short) arg0.method2111();
                this.field1038[var4] = (short) arg0.method2111();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2109();
            this.field1004 = new short[var5];
            this.field1005 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1004[var6] = (short) arg0.method2111();
                this.field1005[var6] = (short) arg0.method2111();
            }
        } else if (arg1 == 78) {
            this.field1023 = arg0.method2111();
        } else if (arg1 == 79) {
            this.field1024 = arg0.method2111();
        } else if (arg1 == 90) {
            this.field1025 = arg0.method2111();
        } else if (arg1 == 91) {
            this.field1027 = arg0.method2111();
        } else if (arg1 == 92) {
            this.field1026 = arg0.method2111();
        } else if (arg1 == 93) {
            this.field1014 = arg0.method2111();
        } else if (arg1 == 95) {
            this.field1021 = arg0.method2111();
        } else if (arg1 == 97) {
            this.field1031 = arg0.method2111();
        } else if (arg1 == 98) {
            this.field1032 = arg0.method2111();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1015 == null) {
                this.field1015 = new int[10];
                this.field1012 = new int[10];
            }
            this.field1015[arg1 - 100] = arg0.method2111();
            this.field1012[arg1 - 100] = arg0.method2111();
        } else if (arg1 == 110) {
            this.field1030 = arg0.method2111();
        } else if (arg1 == 111) {
            this.field1034 = arg0.method2111();
        } else if (arg1 == 112) {
            this.field1035 = arg0.method2111();
        } else if (arg1 == 113) {
            this.field1036 = arg0.method2110();
        } else if (arg1 == 114) {
            this.field1017 = arg0.method2110();
        } else if (arg1 == 115) {
            this.field999 = arg0.method2109();
        }
    }

    @ObfuscatedName("aw.g(Law;Law;I)V")
    public void method845(class45 arg0, class45 arg1) {
        this.field1000 = arg0.field1000;
        this.field1006 = arg0.field1006;
        this.field1007 = arg0.field1007;
        this.field1008 = arg0.field1008;
        this.field1021 = arg0.field1021;
        this.field1010 = arg0.field1010;
        this.field1011 = arg0.field1011;
        this.field1002 = arg0.field1002;
        this.field1038 = arg0.field1038;
        this.field1004 = arg0.field1004;
        this.field1005 = arg0.field1005;
        this.field1001 = arg1.field1001;
        this.field1040 = arg1.field1040;
        this.field1013 = arg1.field1013;
        this.field994 = 1;
    }

    @ObfuscatedName("aw.a(II)Lca;")
    public final class93 method868(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1012[var3] && this.field1012[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method148(var2).method868(1);
            }
        }
        class93 var4 = class93.method1873(Statics.field818, this.field1000, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1030 != 128 || this.field1034 != 128 || this.field1035 != 128) {
            var4.method1889(this.field1030, this.field1034, this.field1035);
        }
        if (this.field1002 != null) {
            for (int var5 = 0; var5 < this.field1002.length; var5++) {
                var4.method1886(this.field1002[var5], this.field1038[var5]);
            }
        }
        if (this.field1004 != null) {
            for (int var6 = 0; var6 < this.field1004.length; var6++) {
                var4.method1930(this.field1004[var6], this.field1005[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aw.x(II)Lcz;")
    public final class98 method846(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1012[var3] && this.field1012[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method148(var2).method846(1);
            }
        }
        class98 var4 = (class98) field1037.method3145((long) this.field1009);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1873(Statics.field818, this.field1000, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1030 != 128 || this.field1034 != 128 || this.field1035 != 128) {
            var5.method1889(this.field1030, this.field1034, this.field1035);
        }
        if (this.field1002 != null) {
            for (int var6 = 0; var6 < this.field1002.length; var6++) {
                var5.method1886(this.field1002[var6], this.field1038[var6]);
            }
        }
        if (this.field1004 != null) {
            for (int var7 = 0; var7 < this.field1004.length; var7++) {
                var5.method1930(this.field1004[var7], this.field1005[var7]);
            }
        }
        class98 var8 = var5.method1894(this.field1036 + 64, this.field1017 * 5 + 768, -50, -10, -50);
        var8.field1728 = true;
        field1037.method3147(var8, (long) this.field1009);
        return var8;
    }

    @ObfuscatedName("aw.r(II)Law;")
    public class45 method847(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1012[var3] && this.field1012[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method148(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bb.w(IIIIZI)Lbe;")
    public static final class72 method1355(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field998.method3145(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method148(arg0);
        if (arg1 > 1 && var8.field1015 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1012[var10] && var8.field1012[var10] != 0) {
                    var9 = var8.field1015[var10];
                }
            }
            if (var9 != -1) {
                var8 = method148(var9);
            }
        }
        class98 var11 = var8.method846(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1032 != -1) {
            var12 = method1355(var8.field1031, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1303;
        int var14 = Statics.field1301;
        int var15 = Statics.field1306;
        int[] var16 = new int[4];
        class73.method1510(var16);
        class72 var17 = new class72(36, 32);
        class73.method1559(var17.field1293, 36, 32);
        class73.method1512();
        class84.method1771();
        class84.method1783(16, 16);
        class84.field1452 = false;
        int var18 = var8.field1006;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1472[var8.field1007] * var18 >> 16;
        int var20 = class84.field1449[var8.field1007] * var18 >> 16;
        var11.method1966();
        var11.method1961(0, var8.field1008, var8.field1021, var8.field1007, var8.field1010, var8.field1011 + var11.field1344 / 2 + var19, var8.field1011 + var20);
        if (arg2 >= 1) {
            var17.method1412(1);
        }
        if (arg2 >= 2) {
            var17.method1412(16777215);
        }
        if (arg3 != 0) {
            var17.method1414(arg3);
        }
        class73.method1559(var17.field1293, 36, 32);
        if (var8.field1032 != -1) {
            var12.method1405(0, 0);
        }
        if (!arg4 && (var8.field994 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field779.method3303(method69(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field998.method3147(var17, var5);
        }
        class73.method1559(var13, var14, var15);
        class73.method1511(var16);
        class84.method1771();
        class84.field1452 = true;
        return var17;
    }

    @ObfuscatedName("g.c(II)Ljava/lang/String;")
    public static final String method69(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class142.field2221 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class142.field2302 + "</col>";
        }
    }

    @ObfuscatedName("aw.f(ZI)Z")
    public final boolean method848(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field1029;
        int var4 = this.field1023;
        if (arg0) {
            var2 = this.field1020;
            var3 = this.field1033;
            var4 = this.field1024;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field818.method2737(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field818.method2737(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field818.method2737(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aw.o(ZI)Lca;")
    public final class93 method849(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field1029;
        int var4 = this.field1023;
        if (arg0) {
            var2 = this.field1020;
            var3 = this.field1033;
            var4 = this.field1024;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1873(Statics.field818, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1873(Statics.field818, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1873(Statics.field818, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1019 != 0) {
            var5.method1914(0, this.field1019, 0);
        }
        if (arg0 && this.field1022 != 0) {
            var5.method1914(0, this.field1022, 0);
        }
        if (this.field1002 != null) {
            for (int var10 = 0; var10 < this.field1002.length; var10++) {
                var5.method1886(this.field1002[var10], this.field1038[var10]);
            }
        }
        if (this.field1004 != null) {
            for (int var11 = 0; var11 < this.field1004.length; var11++) {
                var5.method1930(this.field1004[var11], this.field1005[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aw.p(ZI)Z")
    public final boolean method871(boolean arg0) {
        int var2 = this.field1025;
        int var3 = this.field1026;
        if (arg0) {
            var2 = this.field1027;
            var3 = this.field1014;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field818.method2737(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field818.method2737(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aw.n(ZI)Lca;")
    public final class93 method851(boolean arg0) {
        int var2 = this.field1025;
        int var3 = this.field1026;
        if (arg0) {
            var2 = this.field1027;
            var3 = this.field1014;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1873(Statics.field818, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1873(Statics.field818, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1002 != null) {
            for (int var7 = 0; var7 < this.field1002.length; var7++) {
                var4.method1886(this.field1002[var7], this.field1038[var7]);
            }
        }
        if (this.field1004 != null) {
            for (int var8 = 0; var8 < this.field1004.length; var8++) {
                var4.method1930(this.field1004[var8], this.field1005[var8]);
            }
        }
        return var4;
    }
}
