package deob;

@ObfuscatedName("ar")
public class class47 extends class194 {

    @ObfuscatedName("ar.m")
    public static class183 field1026 = new class183(64);

    @ObfuscatedName("ar.o")
    public static class183 field1017 = new class183(50);

    @ObfuscatedName("ar.k")
    public static class183 field1025 = new class183(100);

    @ObfuscatedName("ar.u")
    public int field1019;

    @ObfuscatedName("ar.g")
    public int field1020;

    @ObfuscatedName("ar.a")
    public String field1021 = "null";

    @ObfuscatedName("ar.y")
    public short[] field1022;

    @ObfuscatedName("ar.d")
    public short[] field1023;

    @ObfuscatedName("ar.b")
    public short[] field1031;

    @ObfuscatedName("ar.j")
    public short[] field1060;

    @ObfuscatedName("ar.f")
    public int field1054 = 2000;

    @ObfuscatedName("ar.w")
    public int field1027 = 0;

    @ObfuscatedName("ar.z")
    public int field1028 = 0;

    @ObfuscatedName("ar.x")
    public int field1049 = 0;

    @ObfuscatedName("ar.v")
    public int field1037 = 0;

    @ObfuscatedName("ar.i")
    public int field1058 = 0;

    @ObfuscatedName("ar.c")
    public int field1032 = 0;

    @ObfuscatedName("ar.r")
    public int field1033 = 1;

    @ObfuscatedName("ar.an")
    public boolean field1034 = false;

    @ObfuscatedName("ar.ad")
    public String[] field1035 = new String[] { null, null, class148.field2154, null, null };

    @ObfuscatedName("ar.ai")
    public String[] field1036 = new String[] { null, null, null, null, class148.field2155 };

    @ObfuscatedName("ar.ae")
    public int field1030 = -1;

    @ObfuscatedName("ar.aq")
    public int field1038 = -1;

    @ObfuscatedName("ar.av")
    public int field1029 = 0;

    @ObfuscatedName("ar.am")
    public int field1040 = -1;

    @ObfuscatedName("ar.ac")
    public int field1053 = -1;

    @ObfuscatedName("ar.ak")
    public int field1013 = 0;

    @ObfuscatedName("ar.aa")
    public int field1048 = -1;

    @ObfuscatedName("ar.al")
    public int field1044 = -1;

    @ObfuscatedName("ar.ao")
    public int field1045 = -1;

    @ObfuscatedName("ar.af")
    public int field1046 = -1;

    @ObfuscatedName("ar.as")
    public int field1047 = -1;

    @ObfuscatedName("ar.ab")
    public int field1024 = -1;

    @ObfuscatedName("ar.ay")
    public int[] field1016;

    @ObfuscatedName("ar.ax")
    public int[] field1018;

    @ObfuscatedName("ar.au")
    public int field1051 = -1;

    @ObfuscatedName("ar.ap")
    public int field1052 = -1;

    @ObfuscatedName("ar.aw")
    public int field1041 = 128;

    @ObfuscatedName("ar.ar")
    public int field1042 = 128;

    @ObfuscatedName("ar.at")
    public int field1055 = 128;

    @ObfuscatedName("ar.ah")
    public int field1056 = 0;

    @ObfuscatedName("ar.ag")
    public int field1057 = 0;

    @ObfuscatedName("ar.aj")
    public int field1039 = 0;

    @ObfuscatedName("ar.az")
    public boolean field1059 = false;

    @ObfuscatedName("ar.bu")
    public int field1050 = -1;

    @ObfuscatedName("ar.bi")
    public int field1061 = -1;

    @ObfuscatedName("au.q(II)Lar;")
    public static class47 method832(int arg0) {
        class47 var1 = (class47) field1026.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1015.method2811(10, arg0);
        class47 var3 = new class47();
        var3.field1019 = arg0;
        if (var2 != null) {
            var3.method853(new class111(var2));
        }
        var3.method856();
        if (var3.field1052 != -1) {
            var3.method855(method832(var3.field1052), method832(var3.field1051));
        }
        if (var3.field1061 != -1) {
            var3.method899(method832(var3.field1061), method832(var3.field1050));
        }
        if (!Statics.field1896 && var3.field1034) {
            var3.field1021 = class148.field2418;
            var3.field1059 = false;
            var3.field1035 = null;
            var3.field1036 = null;
            var3.field1039 = 0;
        }
        field1026.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.s(B)V")
    public void method856() {
    }

    @ObfuscatedName("ar.h(Ldx;I)V")
    public void method853(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method854(arg0, var2);
        }
    }

    @ObfuscatedName("ar.e(Ldx;II)V")
    public void method854(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1020 = arg0.method2307();
        } else if (arg1 == 2) {
            this.field1021 = arg0.method2156();
        } else if (arg1 == 4) {
            this.field1054 = arg0.method2307();
        } else if (arg1 == 5) {
            this.field1027 = arg0.method2307();
        } else if (arg1 == 6) {
            this.field1028 = arg0.method2307();
        } else if (arg1 == 7) {
            this.field1037 = arg0.method2307();
            if (this.field1037 > 32767) {
                this.field1037 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1058 = arg0.method2307();
            if (this.field1058 > 32767) {
                this.field1058 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1032 = 1;
        } else if (arg1 == 12) {
            this.field1033 = arg0.method2153();
        } else if (arg1 == 16) {
            this.field1034 = true;
        } else if (arg1 == 23) {
            this.field1030 = arg0.method2307();
            this.field1029 = arg0.method2231();
        } else if (arg1 == 24) {
            this.field1038 = arg0.method2307();
        } else if (arg1 == 25) {
            this.field1040 = arg0.method2307();
            this.field1013 = arg0.method2231();
        } else if (arg1 == 26) {
            this.field1053 = arg0.method2307();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1035[arg1 - 30] = arg0.method2156();
            if (this.field1035[arg1 - 30].equalsIgnoreCase(class148.field2156)) {
                this.field1035[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1036[arg1 - 35] = arg0.method2156();
        } else if (arg1 == 40) {
            int var3 = arg0.method2231();
            this.field1022 = new short[var3];
            this.field1023 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1022[var4] = (short) arg0.method2307();
                this.field1023[var4] = (short) arg0.method2307();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2231();
            this.field1031 = new short[var5];
            this.field1060 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1031[var6] = (short) arg0.method2307();
                this.field1060[var6] = (short) arg0.method2307();
            }
        } else if (arg1 == 65) {
            this.field1059 = true;
        } else if (arg1 == 78) {
            this.field1048 = arg0.method2307();
        } else if (arg1 == 79) {
            this.field1044 = arg0.method2307();
        } else if (arg1 == 90) {
            this.field1045 = arg0.method2307();
        } else if (arg1 == 91) {
            this.field1047 = arg0.method2307();
        } else if (arg1 == 92) {
            this.field1046 = arg0.method2307();
        } else if (arg1 == 93) {
            this.field1024 = arg0.method2307();
        } else if (arg1 == 95) {
            this.field1049 = arg0.method2307();
        } else if (arg1 == 97) {
            this.field1051 = arg0.method2307();
        } else if (arg1 == 98) {
            this.field1052 = arg0.method2307();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1016 == null) {
                this.field1016 = new int[10];
                this.field1018 = new int[10];
            }
            this.field1016[arg1 - 100] = arg0.method2307();
            this.field1018[arg1 - 100] = arg0.method2307();
        } else if (arg1 == 110) {
            this.field1041 = arg0.method2307();
        } else if (arg1 == 111) {
            this.field1042 = arg0.method2307();
        } else if (arg1 == 112) {
            this.field1055 = arg0.method2307();
        } else if (arg1 == 113) {
            this.field1056 = arg0.method2149();
        } else if (arg1 == 114) {
            this.field1057 = arg0.method2149() * 5;
        } else if (arg1 == 115) {
            this.field1039 = arg0.method2231();
        } else if (arg1 == 139) {
            this.field1050 = arg0.method2307();
        } else if (arg1 == 140) {
            this.field1061 = arg0.method2307();
        }
    }

    @ObfuscatedName("ar.n(Lar;Lar;I)V")
    public void method855(class47 arg0, class47 arg1) {
        this.field1020 = arg0.field1020;
        this.field1054 = arg0.field1054;
        this.field1027 = arg0.field1027;
        this.field1028 = arg0.field1028;
        this.field1049 = arg0.field1049;
        this.field1037 = arg0.field1037;
        this.field1058 = arg0.field1058;
        this.field1022 = arg0.field1022;
        this.field1023 = arg0.field1023;
        this.field1031 = arg0.field1031;
        this.field1060 = arg0.field1060;
        this.field1021 = arg1.field1021;
        this.field1034 = arg1.field1034;
        this.field1033 = arg1.field1033;
        this.field1032 = 1;
    }

    @ObfuscatedName("ar.t(Lar;Lar;I)V")
    public void method899(class47 arg0, class47 arg1) {
        this.field1020 = arg0.field1020;
        this.field1054 = arg0.field1054;
        this.field1027 = arg0.field1027;
        this.field1028 = arg0.field1028;
        this.field1049 = arg0.field1049;
        this.field1037 = arg0.field1037;
        this.field1058 = arg0.field1058;
        this.field1022 = arg1.field1022;
        this.field1023 = arg1.field1023;
        this.field1031 = arg1.field1031;
        this.field1060 = arg1.field1060;
        this.field1021 = arg1.field1021;
        this.field1034 = arg1.field1034;
        this.field1032 = arg1.field1032;
        this.field1030 = arg1.field1030;
        this.field1038 = arg1.field1038;
        this.field1048 = arg1.field1048;
        this.field1040 = arg1.field1040;
        this.field1053 = arg1.field1053;
        this.field1044 = arg1.field1044;
        this.field1045 = arg1.field1045;
        this.field1046 = arg1.field1046;
        this.field1047 = arg1.field1047;
        this.field1024 = arg1.field1024;
        this.field1039 = arg1.field1039;
        this.field1035 = arg1.field1035;
        this.field1036 = new String[5];
        if (arg1.field1036 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1036[var3] = arg1.field1036[var3];
            }
        }
        this.field1036[4] = class148.field2160;
        this.field1033 = 0;
    }

    @ObfuscatedName("ar.l(II)Lcl;")
    public final class95 method898(int arg0) {
        if (this.field1016 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1016[var3];
                }
            }
            if (var2 != -1) {
                return method832(var2).method898(1);
            }
        }
        class95 var4 = class95.method1899(Statics.field700, this.field1020, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1041 != 128 || this.field1042 != 128 || this.field1055 != 128) {
            var4.method1916(this.field1041, this.field1042, this.field1055);
        }
        if (this.field1022 != null) {
            for (int var5 = 0; var5 < this.field1022.length; var5++) {
                var4.method1912(this.field1022[var5], this.field1023[var5]);
            }
        }
        if (this.field1031 != null) {
            for (int var6 = 0; var6 < this.field1031.length; var6++) {
                var4.method1913(this.field1031[var6], this.field1060[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ar.m(II)Lch;")
    public final class100 method875(int arg0) {
        if (this.field1016 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1016[var3];
                }
            }
            if (var2 != -1) {
                return method832(var2).method875(1);
            }
        }
        class100 var4 = (class100) field1017.method3243((long) this.field1019);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1899(Statics.field700, this.field1020, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1041 != 128 || this.field1042 != 128 || this.field1055 != 128) {
            var5.method1916(this.field1041, this.field1042, this.field1055);
        }
        if (this.field1022 != null) {
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var5.method1912(this.field1022[var6], this.field1023[var6]);
            }
        }
        if (this.field1031 != null) {
            for (int var7 = 0; var7 < this.field1031.length; var7++) {
                var5.method1913(this.field1031[var7], this.field1060[var7]);
            }
        }
        class100 var8 = var5.method1965(this.field1056 + 64, this.field1057 + 768, -50, -10, -50);
        var8.field1722 = true;
        field1017.method3253(var8, (long) this.field1019);
        return var8;
    }

    @ObfuscatedName("ar.o(II)Lar;")
    public class47 method857(int arg0) {
        if (this.field1016 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1016[var3];
                }
            }
            if (var2 != -1) {
                return method832(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("m.k(IIIIIZB)Lbr;")
    public static final class74 method94(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1025.method3243(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method832(arg0);
        if (arg1 > 1 && var9.field1016 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1018[var11] && var9.field1018[var11] != 0) {
                    var10 = var9.field1016[var11];
                }
            }
            if (var10 != -1) {
                var9 = method832(var10);
            }
        }
        class100 var12 = var9.method875(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1052 != -1) {
            var13 = method94(var9.field1051, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1061 != -1) {
            var13 = method94(var9.field1050, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1315;
        int var15 = Statics.field1314;
        int var16 = Statics.field1316;
        int[] var17 = new int[4];
        class75.method1532(var17);
        class74 var18 = new class74(36, 32);
        class75.method1528(var18.field1313, 36, 32);
        class75.method1563();
        class86.method1846();
        class86.method1792(16, 16);
        class86.field1477 = false;
        int var19 = var9.field1054;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1480[var9.field1027] * var19 >> 16;
        int var21 = class86.field1464[var9.field1027] * var19 >> 16;
        var12.method1995();
        var12.method2012(0, var9.field1028, var9.field1049, var9.field1027, var9.field1037, var9.field1058 + var12.field1355 / 2 + var20, var9.field1058 + var21);
        if (var9.field1061 != -1) {
            var13.method1445(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1434(1);
        }
        if (arg2 >= 2) {
            var18.method1434(16777215);
        }
        if (arg3 != 0) {
            var18.method1435(arg3);
        }
        class75.method1528(var18.field1313, 36, 32);
        if (var9.field1052 != -1) {
            var13.method1445(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1032 == 1) {
            Statics.field599.method3500(method2942(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1025.method3253(var18, var6);
        }
        class75.method1528(var14, var15, var16);
        class75.method1530(var17);
        class86.method1846();
        class86.field1477 = true;
        return var18;
    }

    @ObfuscatedName("fn.p(II)Ljava/lang/String;")
    public static final String method2942(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2318 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2316 + "</col>";
        }
    }

    @ObfuscatedName("ar.u(ZB)Z")
    public final boolean method859(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1038;
        int var4 = this.field1048;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1053;
            var4 = this.field1044;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field700.method2877(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field700.method2877(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field700.method2877(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ar.g(ZB)Lcl;")
    public final class95 method852(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1038;
        int var4 = this.field1048;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1053;
            var4 = this.field1044;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1899(Statics.field700, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1899(Statics.field700, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1899(Statics.field700, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1029 != 0) {
            var5.method1911(0, this.field1029, 0);
        }
        if (arg0 && this.field1013 != 0) {
            var5.method1911(0, this.field1013, 0);
        }
        if (this.field1022 != null) {
            for (int var10 = 0; var10 < this.field1022.length; var10++) {
                var5.method1912(this.field1022[var10], this.field1023[var10]);
            }
        }
        if (this.field1031 != null) {
            for (int var11 = 0; var11 < this.field1031.length; var11++) {
                var5.method1913(this.field1031[var11], this.field1060[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ar.a(ZB)Z")
    public final boolean method862(boolean arg0) {
        int var2 = this.field1045;
        int var3 = this.field1046;
        if (arg0) {
            var2 = this.field1047;
            var3 = this.field1024;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field700.method2877(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field700.method2877(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ar.y(ZI)Lcl;")
    public final class95 method887(boolean arg0) {
        int var2 = this.field1045;
        int var3 = this.field1046;
        if (arg0) {
            var2 = this.field1047;
            var3 = this.field1024;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1899(Statics.field700, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1899(Statics.field700, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1022 != null) {
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                var4.method1912(this.field1022[var7], this.field1023[var7]);
            }
        }
        if (this.field1031 != null) {
            for (int var8 = 0; var8 < this.field1031.length; var8++) {
                var4.method1913(this.field1031[var8], this.field1060[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("da.d(B)V")
    public static void method2436() {
        field1025.method3246();
    }

    @ObfuscatedName("cw.b(ZI)V")
    public static void method2072(boolean arg0) {
        if (Statics.field1896 != arg0) {
            field1026.method3246();
            field1017.method3246();
            field1025.method3246();
            Statics.field1896 = arg0;
        }
    }
}
