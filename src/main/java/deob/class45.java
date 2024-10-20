package deob;

@ObfuscatedName("ae")
public class class45 extends class182 {

    @ObfuscatedName("ae.v")
    public static class171 field1015 = new class171(64);

    @ObfuscatedName("ae.q")
    public static class171 field1016 = new class171(50);

    @ObfuscatedName("ae.s")
    public static class171 field1017 = new class171(100);

    @ObfuscatedName("ae.u")
    public int field1043;

    @ObfuscatedName("ae.d")
    public int field1020;

    @ObfuscatedName("ae.y")
    public String field1021 = "null";

    @ObfuscatedName("ae.e")
    public short[] field1022;

    @ObfuscatedName("ae.l")
    public short[] field1018;

    @ObfuscatedName("ae.o")
    public short[] field1035;

    @ObfuscatedName("ae.w")
    public short[] field1025;

    @ObfuscatedName("ae.t")
    public int field1012 = 2000;

    @ObfuscatedName("ae.z")
    public int field1027 = 0;

    @ObfuscatedName("ae.b")
    public int field1014 = 0;

    @ObfuscatedName("ae.a")
    public int field1029 = 0;

    @ObfuscatedName("ae.r")
    public int field1019 = 0;

    @ObfuscatedName("ae.m")
    public int field1031 = 0;

    @ObfuscatedName("ae.f")
    public int field1028 = 0;

    @ObfuscatedName("ae.k")
    public int field1030 = 1;

    @ObfuscatedName("ae.p")
    public boolean field1024 = false;

    @ObfuscatedName("ae.n")
    public String[] field1032 = new String[] { null, null, class142.field2142, null, null };

    @ObfuscatedName("ae.j")
    public String[] field1036 = new String[] { null, null, null, null, class142.field2193 };

    @ObfuscatedName("ae.x")
    public int field1037 = -1;

    @ObfuscatedName("ae.al")
    public int field1038 = -1;

    @ObfuscatedName("ae.au")
    public int field1054 = 0;

    @ObfuscatedName("ae.az")
    public int field1040 = -1;

    @ObfuscatedName("ae.ag")
    public int field1041 = -1;

    @ObfuscatedName("ae.aj")
    public int field1034 = 0;

    @ObfuscatedName("ae.af")
    public int field1058 = -1;

    @ObfuscatedName("ae.am")
    public int field1044 = -1;

    @ObfuscatedName("ae.aa")
    public int field1045 = -1;

    @ObfuscatedName("ae.ab")
    public int field1042 = -1;

    @ObfuscatedName("ae.ai")
    public int field1048 = -1;

    @ObfuscatedName("ae.ak")
    public int field1026 = -1;

    @ObfuscatedName("ae.ao")
    public int[] field1049;

    @ObfuscatedName("ae.ar")
    public int[] field1047;

    @ObfuscatedName("ae.aq")
    public int field1051 = -1;

    @ObfuscatedName("ae.an")
    public int field1052 = -1;

    @ObfuscatedName("ae.av")
    public int field1053 = 128;

    @ObfuscatedName("ae.ac")
    public int field1046 = 128;

    @ObfuscatedName("ae.ay")
    public int field1055 = 128;

    @ObfuscatedName("ae.ae")
    public int field1056 = 0;

    @ObfuscatedName("ae.ah")
    public int field1057 = 0;

    @ObfuscatedName("ae.aw")
    public int field1039 = 0;

    @ObfuscatedName("t.i(Ler;Ler;ZLgi;I)V")
    public static void method150(class146 arg0, class146 arg1, boolean arg2, class193 arg3) {
        Statics.field1023 = arg0;
        Statics.field1013 = arg1;
        Statics.field1050 = arg2;
        Statics.field1023.method2750(10);
        Statics.field1033 = arg3;
    }

    @ObfuscatedName("dx.c(II)Lae;")
    public static class45 method2547(int arg0) {
        class45 var1 = (class45) field1015.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1023.method2811(10, arg0);
        class45 var3 = new class45();
        var3.field1043 = arg0;
        if (var2 != null) {
            var3.method855(new class107(var2));
        }
        var3.method864();
        if (var3.field1052 != -1) {
            var3.method853(method2547(var3.field1052), method2547(var3.field1051));
        }
        if (!Statics.field1050 && var3.field1024) {
            var3.field1021 = class142.field2390;
            var3.field1032 = null;
            var3.field1036 = null;
            var3.field1039 = 0;
        }
        field1015.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.h(I)V")
    public void method864() {
    }

    @ObfuscatedName("ae.v(Ldm;B)V")
    public void method855(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method852(arg0, var2);
        }
    }

    @ObfuscatedName("ae.q(Ldm;II)V")
    public void method852(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1020 = arg0.method2313();
        } else if (arg1 == 2) {
            this.field1021 = arg0.method2159();
        } else if (arg1 == 4) {
            this.field1012 = arg0.method2313();
        } else if (arg1 == 5) {
            this.field1027 = arg0.method2313();
        } else if (arg1 == 6) {
            this.field1014 = arg0.method2313();
        } else if (arg1 == 7) {
            this.field1019 = arg0.method2313();
            if (this.field1019 > 32767) {
                this.field1019 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1031 = arg0.method2313();
            if (this.field1031 > 32767) {
                this.field1031 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1028 = 1;
        } else if (arg1 == 12) {
            this.field1030 = arg0.method2156();
        } else if (arg1 == 16) {
            this.field1024 = true;
        } else if (arg1 == 23) {
            this.field1037 = arg0.method2313();
            this.field1054 = arg0.method2151();
        } else if (arg1 == 24) {
            this.field1038 = arg0.method2313();
        } else if (arg1 == 25) {
            this.field1040 = arg0.method2313();
            this.field1034 = arg0.method2151();
        } else if (arg1 == 26) {
            this.field1041 = arg0.method2313();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1032[arg1 - 30] = arg0.method2159();
            if (this.field1032[arg1 - 30].equalsIgnoreCase(class142.field2196)) {
                this.field1032[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1036[arg1 - 35] = arg0.method2159();
        } else if (arg1 == 40) {
            int var3 = arg0.method2151();
            this.field1022 = new short[var3];
            this.field1018 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1022[var4] = (short) arg0.method2313();
                this.field1018[var4] = (short) arg0.method2313();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2151();
            this.field1035 = new short[var5];
            this.field1025 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2313();
                this.field1025[var6] = (short) arg0.method2313();
            }
        } else if (arg1 == 78) {
            this.field1058 = arg0.method2313();
        } else if (arg1 == 79) {
            this.field1044 = arg0.method2313();
        } else if (arg1 == 90) {
            this.field1045 = arg0.method2313();
        } else if (arg1 == 91) {
            this.field1048 = arg0.method2313();
        } else if (arg1 == 92) {
            this.field1042 = arg0.method2313();
        } else if (arg1 == 93) {
            this.field1026 = arg0.method2313();
        } else if (arg1 == 95) {
            this.field1029 = arg0.method2313();
        } else if (arg1 == 97) {
            this.field1051 = arg0.method2313();
        } else if (arg1 == 98) {
            this.field1052 = arg0.method2313();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1049 == null) {
                this.field1049 = new int[10];
                this.field1047 = new int[10];
            }
            this.field1049[arg1 - 100] = arg0.method2313();
            this.field1047[arg1 - 100] = arg0.method2313();
        } else if (arg1 == 110) {
            this.field1053 = arg0.method2313();
        } else if (arg1 == 111) {
            this.field1046 = arg0.method2313();
        } else if (arg1 == 112) {
            this.field1055 = arg0.method2313();
        } else if (arg1 == 113) {
            this.field1056 = arg0.method2152();
        } else if (arg1 == 114) {
            this.field1057 = arg0.method2152() * 5;
        } else if (arg1 == 115) {
            this.field1039 = arg0.method2151();
        }
    }

    @ObfuscatedName("ae.s(Lae;Lae;I)V")
    public void method853(class45 arg0, class45 arg1) {
        this.field1020 = arg0.field1020;
        this.field1012 = arg0.field1012;
        this.field1027 = arg0.field1027;
        this.field1014 = arg0.field1014;
        this.field1029 = arg0.field1029;
        this.field1019 = arg0.field1019;
        this.field1031 = arg0.field1031;
        this.field1022 = arg0.field1022;
        this.field1018 = arg0.field1018;
        this.field1035 = arg0.field1035;
        this.field1025 = arg0.field1025;
        this.field1021 = arg1.field1021;
        this.field1024 = arg1.field1024;
        this.field1030 = arg1.field1030;
        this.field1028 = 1;
    }

    @ObfuscatedName("ae.g(IB)Lcx;")
    public final class93 method854(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1047[var3] && this.field1047[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return method2547(var2).method854(1);
            }
        }
        class93 var4 = class93.method1903(Statics.field1013, this.field1020, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1053 != 128 || this.field1046 != 128 || this.field1055 != 128) {
            var4.method1962(this.field1053, this.field1046, this.field1055);
        }
        if (this.field1022 != null) {
            for (int var5 = 0; var5 < this.field1022.length; var5++) {
                var4.method1915(this.field1022[var5], this.field1018[var5]);
            }
        }
        if (this.field1035 != null) {
            for (int var6 = 0; var6 < this.field1035.length; var6++) {
                var4.method1916(this.field1035[var6], this.field1025[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.u(II)Lcc;")
    public final class98 method880(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1047[var3] && this.field1047[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return method2547(var2).method880(1);
            }
        }
        class98 var4 = (class98) field1016.method3185((long) this.field1043);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1903(Statics.field1013, this.field1020, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1053 != 128 || this.field1046 != 128 || this.field1055 != 128) {
            var5.method1962(this.field1053, this.field1046, this.field1055);
        }
        if (this.field1022 != null) {
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var5.method1915(this.field1022[var6], this.field1018[var6]);
            }
        }
        if (this.field1035 != null) {
            for (int var7 = 0; var7 < this.field1035.length; var7++) {
                var5.method1916(this.field1035[var7], this.field1025[var7]);
            }
        }
        class98 var8 = var5.method1902(this.field1056 + 64, this.field1057 + 768, -50, -10, -50);
        var8.field1701 = true;
        field1016.method3186(var8, (long) this.field1043);
        return var8;
    }

    @ObfuscatedName("ae.d(IB)Lae;")
    public class45 method877(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1047[var3] && this.field1047[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return method2547(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bn.y(IIIIZI)Lbp;")
    public static final class72 method1422(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1017.method3185(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method2547(arg0);
        if (arg1 > 1 && var8.field1049 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1047[var10] && var8.field1047[var10] != 0) {
                    var9 = var8.field1049[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2547(var9);
            }
        }
        class98 var11 = var8.method880(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1052 != -1) {
            var12 = method1422(var8.field1051, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1323;
        int var14 = Statics.field1325;
        int var15 = Statics.field1321;
        int[] var16 = new int[4];
        class73.method1541(var16);
        class72 var17 = new class72(36, 32);
        class73.method1559(var17.field1312, 36, 32);
        class73.method1543();
        class84.method1797();
        class84.method1801(16, 16);
        class84.field1483 = false;
        int var18 = var8.field1012;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1464[var8.field1027] * var18 >> 16;
        int var20 = class84.field1463[var8.field1027] * var18 >> 16;
        var11.method2006();
        var11.method2018(0, var8.field1014, var8.field1029, var8.field1027, var8.field1019, var8.field1031 + var11.field1358 / 2 + var19, var8.field1031 + var20);
        if (arg2 >= 1) {
            var17.method1462(1);
        }
        if (arg2 >= 2) {
            var17.method1462(16777215);
        }
        if (arg3 != 0) {
            var17.method1450(arg3);
        }
        class73.method1559(var17.field1312, 36, 32);
        if (var8.field1052 != -1) {
            var12.method1470(0, 0);
        }
        if (!arg4 && (var8.field1028 == 1 || arg1 != 1) && arg1 != -1) {
            class193 var21 = Statics.field1033;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2305 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2303 + "</col>";
            }
            var21.method3392(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1017.method3186(var17, var5);
        }
        class73.method1559(var13, var14, var15);
        class73.method1570(var16);
        class84.method1797();
        class84.field1483 = true;
        return var17;
    }

    @ObfuscatedName("ae.e(ZB)Z")
    public final boolean method857(boolean arg0) {
        int var2 = this.field1037;
        int var3 = this.field1038;
        int var4 = this.field1058;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1041;
            var4 = this.field1044;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1013.method2742(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1013.method2742(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1013.method2742(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ae.l(ZB)Lcx;")
    public final class93 method858(boolean arg0) {
        int var2 = this.field1037;
        int var3 = this.field1038;
        int var4 = this.field1058;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1041;
            var4 = this.field1044;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1903(Statics.field1013, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1903(Statics.field1013, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1903(Statics.field1013, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1054 != 0) {
            var5.method1914(0, this.field1054, 0);
        }
        if (arg0 && this.field1034 != 0) {
            var5.method1914(0, this.field1034, 0);
        }
        if (this.field1022 != null) {
            for (int var10 = 0; var10 < this.field1022.length; var10++) {
                var5.method1915(this.field1022[var10], this.field1018[var10]);
            }
        }
        if (this.field1035 != null) {
            for (int var11 = 0; var11 < this.field1035.length; var11++) {
                var5.method1916(this.field1035[var11], this.field1025[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ae.o(ZB)Z")
    public final boolean method859(boolean arg0) {
        int var2 = this.field1045;
        int var3 = this.field1042;
        if (arg0) {
            var2 = this.field1048;
            var3 = this.field1026;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1013.method2742(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1013.method2742(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ae.w(ZI)Lcx;")
    public final class93 method860(boolean arg0) {
        int var2 = this.field1045;
        int var3 = this.field1042;
        if (arg0) {
            var2 = this.field1048;
            var3 = this.field1026;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1903(Statics.field1013, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1903(Statics.field1013, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1022 != null) {
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                var4.method1915(this.field1022[var7], this.field1018[var7]);
            }
        }
        if (this.field1035 != null) {
            for (int var8 = 0; var8 < this.field1035.length; var8++) {
                var4.method1916(this.field1035[var8], this.field1025[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("co.t(I)V")
    public static void method2095() {
        field1015.method3188();
        field1016.method3188();
        field1017.method3188();
    }

    @ObfuscatedName("es.z(I)V")
    public static void method2846() {
        field1017.method3188();
    }

    @ObfuscatedName("cr.b(ZB)V")
    public static void method1878(boolean arg0) {
        if (Statics.field1050 != arg0) {
            method2095();
            Statics.field1050 = arg0;
        }
    }
}
