package deob;

@ObfuscatedName("aq")
public class class45 extends class181 {

    @ObfuscatedName("aq.j")
    public static class171 field1014 = new class171(64);

    @ObfuscatedName("aq.o")
    public static class171 field1015 = new class171(50);

    @ObfuscatedName("aq.n")
    public static class171 field1016 = new class171(100);

    @ObfuscatedName("aq.f")
    public int field1052;

    @ObfuscatedName("aq.p")
    public int field1018;

    @ObfuscatedName("aq.l")
    public String field1019 = "null";

    @ObfuscatedName("aq.k")
    public short[] field1020;

    @ObfuscatedName("aq.q")
    public short[] field1011;

    @ObfuscatedName("aq.e")
    public short[] field1022;

    @ObfuscatedName("aq.t")
    public short[] field1030;

    @ObfuscatedName("aq.g")
    public int field1024 = 2000;

    @ObfuscatedName("aq.c")
    public int field1013 = 0;

    @ObfuscatedName("aq.m")
    public int field1026 = 0;

    @ObfuscatedName("aq.i")
    public int field1044 = 0;

    @ObfuscatedName("aq.h")
    public int field1028 = 0;

    @ObfuscatedName("aq.a")
    public int field1029 = 0;

    @ObfuscatedName("aq.w")
    public int field1041 = 0;

    @ObfuscatedName("aq.z")
    public int field1023 = 1;

    @ObfuscatedName("aq.v")
    public boolean field1032 = false;

    @ObfuscatedName("aq.s")
    public String[] field1033 = new String[] { null, null, class142.field2365, null, null };

    @ObfuscatedName("aq.r")
    public String[] field1034 = new String[] { null, null, null, null, class142.field2148 };

    @ObfuscatedName("aq.d")
    public int field1017 = -1;

    @ObfuscatedName("aq.al")
    public int field1036 = -1;

    @ObfuscatedName("aq.ab")
    public int field1037 = 0;

    @ObfuscatedName("aq.au")
    public int field1038 = -1;

    @ObfuscatedName("aq.az")
    public int field1039 = -1;

    @ObfuscatedName("aq.ai")
    public int field1040 = 0;

    @ObfuscatedName("aq.ay")
    public int field1050 = -1;

    @ObfuscatedName("aq.ar")
    public int field1042 = -1;

    @ObfuscatedName("aq.af")
    public int field1043 = -1;

    @ObfuscatedName("aq.as")
    public int field1054 = -1;

    @ObfuscatedName("aq.ap")
    public int field1045 = -1;

    @ObfuscatedName("aq.aj")
    public int field1046 = -1;

    @ObfuscatedName("aq.ac")
    public int[] field1047;

    @ObfuscatedName("aq.aa")
    public int[] field1048;

    @ObfuscatedName("aq.ag")
    public int field1027 = -1;

    @ObfuscatedName("aq.ae")
    public int field1056 = -1;

    @ObfuscatedName("aq.ak")
    public int field1051 = 128;

    @ObfuscatedName("aq.aw")
    public int field1049 = 128;

    @ObfuscatedName("aq.ao")
    public int field1053 = 128;

    @ObfuscatedName("aq.aq")
    public int field1035 = 0;

    @ObfuscatedName("aq.av")
    public int field1055 = 0;

    @ObfuscatedName("aq.am")
    public int field1031 = 0;

    @ObfuscatedName("ce.b(II)Laq;")
    public static class45 method2057(int arg0) {
        class45 var1 = (class45) field1014.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1025.method2692(10, arg0);
        class45 var3 = new class45();
        var3.field1052 = arg0;
        if (var2 != null) {
            var3.method837(new class107(var2));
        }
        var3.method840();
        if (var3.field1056 != -1) {
            var3.method839(method2057(var3.field1056), method2057(var3.field1027));
        }
        if (!Statics.field1021 && var3.field1032) {
            var3.field1019 = class142.field2299;
            var3.field1033 = null;
            var3.field1034 = null;
            var3.field1031 = 0;
        }
        field1014.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.u(B)V")
    public void method840() {
    }

    @ObfuscatedName("aq.x(Ldh;I)V")
    public void method837(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method838(arg0, var2);
        }
    }

    @ObfuscatedName("aq.j(Ldh;IB)V")
    public void method838(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1018 = arg0.method2136();
        } else if (arg1 == 2) {
            this.field1019 = arg0.method2339();
        } else if (arg1 == 4) {
            this.field1024 = arg0.method2136();
        } else if (arg1 == 5) {
            this.field1013 = arg0.method2136();
        } else if (arg1 == 6) {
            this.field1026 = arg0.method2136();
        } else if (arg1 == 7) {
            this.field1028 = arg0.method2136();
            if (this.field1028 > 32767) {
                this.field1028 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1029 = arg0.method2136();
            if (this.field1029 > 32767) {
                this.field1029 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1041 = 1;
        } else if (arg1 == 12) {
            this.field1023 = arg0.method2139();
        } else if (arg1 == 16) {
            this.field1032 = true;
        } else if (arg1 == 23) {
            this.field1017 = arg0.method2136();
            this.field1037 = arg0.method2134();
        } else if (arg1 == 24) {
            this.field1036 = arg0.method2136();
        } else if (arg1 == 25) {
            this.field1038 = arg0.method2136();
            this.field1040 = arg0.method2134();
        } else if (arg1 == 26) {
            this.field1039 = arg0.method2136();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1033[arg1 - 30] = arg0.method2339();
            if (this.field1033[arg1 - 30].equalsIgnoreCase(class142.field2149)) {
                this.field1033[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1034[arg1 - 35] = arg0.method2339();
        } else if (arg1 == 40) {
            int var3 = arg0.method2134();
            this.field1020 = new short[var3];
            this.field1011 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1020[var4] = (short) arg0.method2136();
                this.field1011[var4] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2134();
            this.field1022 = new short[var5];
            this.field1030 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1022[var6] = (short) arg0.method2136();
                this.field1030[var6] = (short) arg0.method2136();
            }
        } else if (arg1 == 78) {
            this.field1050 = arg0.method2136();
        } else if (arg1 == 79) {
            this.field1042 = arg0.method2136();
        } else if (arg1 == 90) {
            this.field1043 = arg0.method2136();
        } else if (arg1 == 91) {
            this.field1045 = arg0.method2136();
        } else if (arg1 == 92) {
            this.field1054 = arg0.method2136();
        } else if (arg1 == 93) {
            this.field1046 = arg0.method2136();
        } else if (arg1 == 95) {
            this.field1044 = arg0.method2136();
        } else if (arg1 == 97) {
            this.field1027 = arg0.method2136();
        } else if (arg1 == 98) {
            this.field1056 = arg0.method2136();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1047 == null) {
                this.field1047 = new int[10];
                this.field1048 = new int[10];
            }
            this.field1047[arg1 - 100] = arg0.method2136();
            this.field1048[arg1 - 100] = arg0.method2136();
        } else if (arg1 == 110) {
            this.field1051 = arg0.method2136();
        } else if (arg1 == 111) {
            this.field1049 = arg0.method2136();
        } else if (arg1 == 112) {
            this.field1053 = arg0.method2136();
        } else if (arg1 == 113) {
            this.field1035 = arg0.method2135();
        } else if (arg1 == 114) {
            this.field1055 = arg0.method2135();
        } else if (arg1 == 115) {
            this.field1031 = arg0.method2134();
        }
    }

    @ObfuscatedName("aq.o(Laq;Laq;I)V")
    public void method839(class45 arg0, class45 arg1) {
        this.field1018 = arg0.field1018;
        this.field1024 = arg0.field1024;
        this.field1013 = arg0.field1013;
        this.field1026 = arg0.field1026;
        this.field1044 = arg0.field1044;
        this.field1028 = arg0.field1028;
        this.field1029 = arg0.field1029;
        this.field1020 = arg0.field1020;
        this.field1011 = arg0.field1011;
        this.field1022 = arg0.field1022;
        this.field1030 = arg0.field1030;
        this.field1019 = arg1.field1019;
        this.field1032 = arg1.field1032;
        this.field1023 = arg1.field1023;
        this.field1041 = 1;
    }

    @ObfuscatedName("aq.n(IB)Lct;")
    public final class93 method860(int arg0) {
        if (this.field1047 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1048[var3] && this.field1048[var3] != 0) {
                    var2 = this.field1047[var3];
                }
            }
            if (var2 != -1) {
                return method2057(var2).method860(1);
            }
        }
        class93 var4 = class93.method1901(Statics.field1012, this.field1018, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1051 != 128 || this.field1049 != 128 || this.field1053 != 128) {
            var4.method1906(this.field1051, this.field1049, this.field1053);
        }
        if (this.field1020 != null) {
            for (int var5 = 0; var5 < this.field1020.length; var5++) {
                var4.method1903(this.field1020[var5], this.field1011[var5]);
            }
        }
        if (this.field1022 != null) {
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var4.method1904(this.field1022[var6], this.field1030[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.y(IB)Lcu;")
    public final class98 method871(int arg0) {
        if (this.field1047 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1048[var3] && this.field1048[var3] != 0) {
                    var2 = this.field1047[var3];
                }
            }
            if (var2 != -1) {
                return method2057(var2).method871(1);
            }
        }
        class98 var4 = (class98) field1015.method3114((long) this.field1052);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1901(Statics.field1012, this.field1018, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1051 != 128 || this.field1049 != 128 || this.field1053 != 128) {
            var5.method1906(this.field1051, this.field1049, this.field1053);
        }
        if (this.field1020 != null) {
            for (int var6 = 0; var6 < this.field1020.length; var6++) {
                var5.method1903(this.field1020[var6], this.field1011[var6]);
            }
        }
        if (this.field1022 != null) {
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                var5.method1904(this.field1022[var7], this.field1030[var7]);
            }
        }
        class98 var8 = var5.method1910(this.field1035 + 64, this.field1055 * 5 + 768, -50, -10, -50);
        var8.field1738 = true;
        field1015.method3116(var8, (long) this.field1052);
        return var8;
    }

    @ObfuscatedName("aq.f(II)Laq;")
    public class45 method842(int arg0) {
        if (this.field1047 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1048[var3] && this.field1048[var3] != 0) {
                    var2 = this.field1047[var3];
                }
            }
            if (var2 != -1) {
                return method2057(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("c.p(IIIIZI)Lbk;")
    public static final class72 method164(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1016.method3114(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method2057(arg0);
        if (arg1 > 1 && var8.field1047 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1048[var10] && var8.field1048[var10] != 0) {
                    var9 = var8.field1047[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2057(var9);
            }
        }
        class98 var11 = var8.method871(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1056 != -1) {
            var12 = method164(var8.field1027, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1306;
        int var14 = Statics.field1311;
        int var15 = Statics.field1307;
        int[] var16 = new int[4];
        class73.method1532(var16);
        class72 var17 = new class72(36, 32);
        class73.method1514(var17.field1301, 36, 32);
        class73.method1574();
        class84.method1791();
        class84.method1805(16, 16);
        class84.field1463 = false;
        int var18 = var8.field1024;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1470[var8.field1013] * var18 >> 16;
        int var20 = class84.field1484[var8.field1013] * var18 >> 16;
        var11.method1989();
        var11.method2001(0, var8.field1026, var8.field1044, var8.field1013, var8.field1028, var8.field1029 + var11.field1346 / 2 + var19, var8.field1029 + var20);
        if (arg2 >= 1) {
            var17.method1472(1);
        }
        if (arg2 >= 2) {
            var17.method1472(16777215);
        }
        if (arg3 != 0) {
            var17.method1510(arg3);
        }
        class73.method1514(var17.field1301, 36, 32);
        if (var8.field1056 != -1) {
            var12.method1435(0, 0);
        }
        if (!arg4 && (var8.field1041 == 1 || arg1 != 1) && arg1 != -1) {
            class191 var21 = Statics.field1457;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2310 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2308 + "</col>";
            }
            var21.method3308(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1016.method3116(var17, var5);
        }
        class73.method1514(var13, var14, var15);
        class73.method1520(var16);
        class84.method1791();
        class84.field1463 = true;
        return var17;
    }

    @ObfuscatedName("aq.l(ZB)Z")
    public final boolean method843(boolean arg0) {
        int var2 = this.field1017;
        int var3 = this.field1036;
        int var4 = this.field1050;
        if (arg0) {
            var2 = this.field1038;
            var3 = this.field1039;
            var4 = this.field1042;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1012.method2694(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1012.method2694(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1012.method2694(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.k(ZI)Lct;")
    public final class93 method835(boolean arg0) {
        int var2 = this.field1017;
        int var3 = this.field1036;
        int var4 = this.field1050;
        if (arg0) {
            var2 = this.field1038;
            var3 = this.field1039;
            var4 = this.field1042;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1901(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1901(Statics.field1012, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1901(Statics.field1012, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1037 != 0) {
            var5.method1902(0, this.field1037, 0);
        }
        if (arg0 && this.field1040 != 0) {
            var5.method1902(0, this.field1040, 0);
        }
        if (this.field1020 != null) {
            for (int var10 = 0; var10 < this.field1020.length; var10++) {
                var5.method1903(this.field1020[var10], this.field1011[var10]);
            }
        }
        if (this.field1022 != null) {
            for (int var11 = 0; var11 < this.field1022.length; var11++) {
                var5.method1904(this.field1022[var11], this.field1030[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.q(ZI)Z")
    public final boolean method869(boolean arg0) {
        int var2 = this.field1043;
        int var3 = this.field1054;
        if (arg0) {
            var2 = this.field1045;
            var3 = this.field1046;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1012.method2694(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1012.method2694(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.e(ZB)Lct;")
    public final class93 method846(boolean arg0) {
        int var2 = this.field1043;
        int var3 = this.field1054;
        if (arg0) {
            var2 = this.field1045;
            var3 = this.field1046;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1901(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1901(Statics.field1012, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1020 != null) {
            for (int var7 = 0; var7 < this.field1020.length; var7++) {
                var4.method1903(this.field1020[var7], this.field1011[var7]);
            }
        }
        if (this.field1022 != null) {
            for (int var8 = 0; var8 < this.field1022.length; var8++) {
                var4.method1904(this.field1022[var8], this.field1030[var8]);
            }
        }
        return var4;
    }
}
