package deob;

@ObfuscatedName("ax")
public class class45 extends class182 {

    @ObfuscatedName("ax.p")
    public static class171 field1049 = new class171(64);

    @ObfuscatedName("ax.c")
    public static class171 field1007 = new class171(50);

    @ObfuscatedName("ax.y")
    public static class171 field1008 = new class171(100);

    @ObfuscatedName("ax.l")
    public int field1010;

    @ObfuscatedName("ax.h")
    public int field1011;

    @ObfuscatedName("ax.n")
    public String field1012 = "null";

    @ObfuscatedName("ax.w")
    public short[] field1028;

    @ObfuscatedName("ax.m")
    public short[] field1014;

    @ObfuscatedName("ax.x")
    public short[] field1041;

    @ObfuscatedName("ax.b")
    public short[] field1018;

    @ObfuscatedName("ax.u")
    public int field1017 = 2000;

    @ObfuscatedName("ax.r")
    public int field1055 = 0;

    @ObfuscatedName("ax.z")
    public int field1019 = 0;

    @ObfuscatedName("ax.v")
    public int field1020 = 0;

    @ObfuscatedName("ax.k")
    public int field1004 = 0;

    @ObfuscatedName("ax.a")
    public int field1022 = 0;

    @ObfuscatedName("ax.d")
    public int field1023 = 0;

    @ObfuscatedName("ax.j")
    public int field1024 = 1;

    @ObfuscatedName("ax.s")
    public boolean field1025 = false;

    @ObfuscatedName("ax.f")
    public String[] field1006 = new String[] { null, null, class142.field2128, null, null };

    @ObfuscatedName("ax.e")
    public String[] field1034 = new String[] { null, null, null, null, class142.field2120 };

    @ObfuscatedName("ax.q")
    public int field1032 = -1;

    @ObfuscatedName("ax.al")
    public int field1016 = -1;

    @ObfuscatedName("ax.ao")
    public int field1030 = 0;

    @ObfuscatedName("ax.ap")
    public int field1031 = -1;

    @ObfuscatedName("ax.aa")
    public int field1036 = -1;

    @ObfuscatedName("ax.ak")
    public int field1015 = 0;

    @ObfuscatedName("ax.ah")
    public int field1044 = -1;

    @ObfuscatedName("ax.as")
    public int field1035 = -1;

    @ObfuscatedName("ax.aw")
    public int field1051 = -1;

    @ObfuscatedName("ax.aj")
    public int field1037 = -1;

    @ObfuscatedName("ax.af")
    public int field1038 = -1;

    @ObfuscatedName("ax.am")
    public int field1039 = -1;

    @ObfuscatedName("ax.ab")
    public int[] field1040;

    @ObfuscatedName("ax.ai")
    public int[] field1005;

    @ObfuscatedName("ax.an")
    public int field1042 = -1;

    @ObfuscatedName("ax.ac")
    public int field1021 = -1;

    @ObfuscatedName("ax.au")
    public int field1027 = 128;

    @ObfuscatedName("ax.av")
    public int field1045 = 128;

    @ObfuscatedName("ax.at")
    public int field1046 = 128;

    @ObfuscatedName("ax.ax")
    public int field1047 = 0;

    @ObfuscatedName("ax.ae")
    public int field1048 = 0;

    @ObfuscatedName("ax.az")
    public int field1013 = 0;

    @ObfuscatedName("f.t(Ley;Ley;ZLgu;B)V")
    public static void method515(class146 arg0, class146 arg1, boolean arg2, class193 arg3) {
        Statics.field1033 = arg0;
        Statics.field1029 = arg1;
        Statics.field685 = arg2;
        Statics.field1033.method2740(10);
        Statics.field1009 = arg3;
    }

    @ObfuscatedName("ca.o(II)Lax;")
    public static class45 method1771(int arg0) {
        class45 var1 = (class45) field1049.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1033.method2668(10, arg0);
        class45 var3 = new class45();
        var3.field1010 = arg0;
        if (var2 != null) {
            var3.method831(new class107(var2));
        }
        var3.method848();
        if (var3.field1021 != -1) {
            var3.method829(method1771(var3.field1021), method1771(var3.field1042));
        }
        if (!Statics.field685 && var3.field1025) {
            var3.field1012 = class142.field2327;
            var3.field1006 = null;
            var3.field1034 = null;
            var3.field1013 = 0;
        }
        field1049.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.i(I)V")
    public void method848() {
    }

    @ObfuscatedName("ax.p(Ldg;I)V")
    public void method831(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method832(arg0, var2);
        }
    }

    @ObfuscatedName("ax.c(Ldg;II)V")
    public void method832(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2120();
        } else if (arg1 == 2) {
            this.field1012 = arg0.method2126();
        } else if (arg1 == 4) {
            this.field1017 = arg0.method2120();
        } else if (arg1 == 5) {
            this.field1055 = arg0.method2120();
        } else if (arg1 == 6) {
            this.field1019 = arg0.method2120();
        } else if (arg1 == 7) {
            this.field1004 = arg0.method2120();
            if (this.field1004 > 32767) {
                this.field1004 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1022 = arg0.method2120();
            if (this.field1022 > 32767) {
                this.field1022 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1023 = 1;
        } else if (arg1 == 12) {
            this.field1024 = arg0.method2152();
        } else if (arg1 == 16) {
            this.field1025 = true;
        } else if (arg1 == 23) {
            this.field1032 = arg0.method2120();
            this.field1030 = arg0.method2118();
        } else if (arg1 == 24) {
            this.field1016 = arg0.method2120();
        } else if (arg1 == 25) {
            this.field1031 = arg0.method2120();
            this.field1015 = arg0.method2118();
        } else if (arg1 == 26) {
            this.field1036 = arg0.method2120();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1006[arg1 - 30] = arg0.method2126();
            if (this.field1006[arg1 - 30].equalsIgnoreCase(class142.field2121)) {
                this.field1006[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1034[arg1 - 35] = arg0.method2126();
        } else if (arg1 == 40) {
            int var3 = arg0.method2118();
            this.field1028 = new short[var3];
            this.field1014 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1028[var4] = (short) arg0.method2120();
                this.field1014[var4] = (short) arg0.method2120();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2118();
            this.field1041 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1041[var6] = (short) arg0.method2120();
                this.field1018[var6] = (short) arg0.method2120();
            }
        } else if (arg1 == 78) {
            this.field1044 = arg0.method2120();
        } else if (arg1 == 79) {
            this.field1035 = arg0.method2120();
        } else if (arg1 == 90) {
            this.field1051 = arg0.method2120();
        } else if (arg1 == 91) {
            this.field1038 = arg0.method2120();
        } else if (arg1 == 92) {
            this.field1037 = arg0.method2120();
        } else if (arg1 == 93) {
            this.field1039 = arg0.method2120();
        } else if (arg1 == 95) {
            this.field1020 = arg0.method2120();
        } else if (arg1 == 97) {
            this.field1042 = arg0.method2120();
        } else if (arg1 == 98) {
            this.field1021 = arg0.method2120();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1040 == null) {
                this.field1040 = new int[10];
                this.field1005 = new int[10];
            }
            this.field1040[arg1 - 100] = arg0.method2120();
            this.field1005[arg1 - 100] = arg0.method2120();
        } else if (arg1 == 110) {
            this.field1027 = arg0.method2120();
        } else if (arg1 == 111) {
            this.field1045 = arg0.method2120();
        } else if (arg1 == 112) {
            this.field1046 = arg0.method2120();
        } else if (arg1 == 113) {
            this.field1047 = arg0.method2253();
        } else if (arg1 == 114) {
            this.field1048 = arg0.method2253() * 5;
        } else if (arg1 == 115) {
            this.field1013 = arg0.method2118();
        }
    }

    @ObfuscatedName("ax.y(Lax;Lax;S)V")
    public void method829(class45 arg0, class45 arg1) {
        this.field1011 = arg0.field1011;
        this.field1017 = arg0.field1017;
        this.field1055 = arg0.field1055;
        this.field1019 = arg0.field1019;
        this.field1020 = arg0.field1020;
        this.field1004 = arg0.field1004;
        this.field1022 = arg0.field1022;
        this.field1028 = arg0.field1028;
        this.field1014 = arg0.field1014;
        this.field1041 = arg0.field1041;
        this.field1018 = arg0.field1018;
        this.field1012 = arg1.field1012;
        this.field1025 = arg1.field1025;
        this.field1024 = arg1.field1024;
        this.field1023 = 1;
    }

    @ObfuscatedName("ax.g(II)Lcd;")
    public final class93 method858(int arg0) {
        if (this.field1040 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field1040[var3];
                }
            }
            if (var2 != -1) {
                return method1771(var2).method858(1);
            }
        }
        class93 var4 = class93.method1883(Statics.field1029, this.field1011, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1027 != 128 || this.field1045 != 128 || this.field1046 != 128) {
            var4.method1898(this.field1027, this.field1045, this.field1046);
        }
        if (this.field1028 != null) {
            for (int var5 = 0; var5 < this.field1028.length; var5++) {
                var4.method1924(this.field1028[var5], this.field1014[var5]);
            }
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var4.method1945(this.field1041[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ax.l(II)Lcx;")
    public final class98 method834(int arg0) {
        if (this.field1040 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field1040[var3];
                }
            }
            if (var2 != -1) {
                return method1771(var2).method834(1);
            }
        }
        class98 var4 = (class98) field1007.method3099((long) this.field1010);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1883(Statics.field1029, this.field1011, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1027 != 128 || this.field1045 != 128 || this.field1046 != 128) {
            var5.method1898(this.field1027, this.field1045, this.field1046);
        }
        if (this.field1028 != null) {
            for (int var6 = 0; var6 < this.field1028.length; var6++) {
                var5.method1924(this.field1028[var6], this.field1014[var6]);
            }
        }
        if (this.field1041 != null) {
            for (int var7 = 0; var7 < this.field1041.length; var7++) {
                var5.method1945(this.field1041[var7], this.field1018[var7]);
            }
        }
        class98 var8 = var5.method1917(this.field1047 + 64, this.field1048 + 768, -50, -10, -50);
        var8.field1688 = true;
        field1007.method3101(var8, (long) this.field1010);
        return var8;
    }

    @ObfuscatedName("ax.h(IS)Lax;")
    public class45 method833(int arg0) {
        if (this.field1040 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field1040[var3];
                }
            }
            if (var2 != -1) {
                return method1771(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ct.n(IIIIZI)Lbr;")
    public static final class72 method1865(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1008.method3099(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method1771(arg0);
        if (arg1 > 1 && var8.field1040 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1005[var10] && var8.field1005[var10] != 0) {
                    var9 = var8.field1040[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1771(var9);
            }
        }
        class98 var11 = var8.method834(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1021 != -1) {
            var12 = method1865(var8.field1042, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1312;
        int var14 = Statics.field1310;
        int var15 = Statics.field1311;
        int[] var16 = new int[4];
        class73.method1500(var16);
        class72 var17 = new class72(36, 32);
        class73.method1542(var17.field1303, 36, 32);
        class73.method1502();
        class84.method1773();
        class84.method1776(16, 16);
        class84.field1463 = false;
        int var18 = var8.field1017;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1483[var8.field1055] * var18 >> 16;
        int var20 = class84.field1484[var8.field1055] * var18 >> 16;
        var11.method1974();
        var11.method1984(0, var8.field1019, var8.field1020, var8.field1055, var8.field1004, var8.field1022 + var11.field1351 / 2 + var19, var8.field1022 + var20);
        if (arg2 >= 1) {
            var17.method1414(1);
        }
        if (arg2 >= 2) {
            var17.method1414(16777215);
        }
        if (arg3 != 0) {
            var17.method1415(arg3);
        }
        class73.method1542(var17.field1303, 36, 32);
        if (var8.field1021 != -1) {
            var12.method1418(0, 0);
        }
        if (!arg4 && (var8.field1023 == 1 || arg1 != 1) && arg1 != -1) {
            class193 var21 = Statics.field1009;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2282 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2246 + "</col>";
            }
            var21.method3295(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1008.method3101(var17, var5);
        }
        class73.method1542(var13, var14, var15);
        class73.method1537(var16);
        class84.method1773();
        class84.field1463 = true;
        return var17;
    }

    @ObfuscatedName("ax.w(ZI)Z")
    public final boolean method867(boolean arg0) {
        int var2 = this.field1032;
        int var3 = this.field1016;
        int var4 = this.field1044;
        if (arg0) {
            var2 = this.field1031;
            var3 = this.field1036;
            var4 = this.field1035;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1029.method2670(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1029.method2670(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1029.method2670(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ax.m(ZB)Lcd;")
    public final class93 method838(boolean arg0) {
        int var2 = this.field1032;
        int var3 = this.field1016;
        int var4 = this.field1044;
        if (arg0) {
            var2 = this.field1031;
            var3 = this.field1036;
            var4 = this.field1035;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1883(Statics.field1029, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1883(Statics.field1029, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1883(Statics.field1029, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1030 != 0) {
            var5.method1895(0, this.field1030, 0);
        }
        if (arg0 && this.field1015 != 0) {
            var5.method1895(0, this.field1015, 0);
        }
        if (this.field1028 != null) {
            for (int var10 = 0; var10 < this.field1028.length; var10++) {
                var5.method1924(this.field1028[var10], this.field1014[var10]);
            }
        }
        if (this.field1041 != null) {
            for (int var11 = 0; var11 < this.field1041.length; var11++) {
                var5.method1945(this.field1041[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ax.x(ZB)Z")
    public final boolean method839(boolean arg0) {
        int var2 = this.field1051;
        int var3 = this.field1037;
        if (arg0) {
            var2 = this.field1038;
            var3 = this.field1039;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1029.method2670(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1029.method2670(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ax.b(ZI)Lcd;")
    public final class93 method836(boolean arg0) {
        int var2 = this.field1051;
        int var3 = this.field1037;
        if (arg0) {
            var2 = this.field1038;
            var3 = this.field1039;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1883(Statics.field1029, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1883(Statics.field1029, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1028 != null) {
            for (int var7 = 0; var7 < this.field1028.length; var7++) {
                var4.method1924(this.field1028[var7], this.field1014[var7]);
            }
        }
        if (this.field1041 != null) {
            for (int var8 = 0; var8 < this.field1041.length; var8++) {
                var4.method1945(this.field1041[var8], this.field1018[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cf.u(I)V")
    public static void method1852() {
        field1049.method3104();
        field1007.method3104();
        field1008.method3104();
    }
}
