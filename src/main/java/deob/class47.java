package deob;

@ObfuscatedName("aa")
public class class47 extends class195 {

    @ObfuscatedName("aa.b")
    public static class184 field1073 = new class184(64);

    @ObfuscatedName("aa.t")
    public static class184 field1108 = new class184(50);

    @ObfuscatedName("aa.i")
    public static class184 field1078 = new class184(200);

    @ObfuscatedName("aa.k")
    public int field1076;

    @ObfuscatedName("aa.x")
    public int field1077;

    @ObfuscatedName("aa.e")
    public String field1068 = "null";

    @ObfuscatedName("aa.q")
    public short[] field1079;

    @ObfuscatedName("aa.o")
    public short[] field1080;

    @ObfuscatedName("aa.r")
    public short[] field1107;

    @ObfuscatedName("aa.v")
    public short[] field1082;

    @ObfuscatedName("aa.h")
    public int field1083 = 2000;

    @ObfuscatedName("aa.p")
    public int field1084 = 0;

    @ObfuscatedName("aa.y")
    public int field1071 = 0;

    @ObfuscatedName("aa.z")
    public int field1086 = 0;

    @ObfuscatedName("aa.u")
    public int field1087 = 0;

    @ObfuscatedName("aa.w")
    public int field1101 = 0;

    @ObfuscatedName("aa.d")
    public int field1092 = 0;

    @ObfuscatedName("aa.l")
    public int field1090 = 1;

    @ObfuscatedName("aa.aj")
    public boolean field1091 = false;

    @ObfuscatedName("aa.aq")
    public String[] field1070 = new String[] { null, null, class148.field2202, null, null };

    @ObfuscatedName("aa.al")
    public String[] field1093 = new String[] { null, null, null, null, class148.field2203 };

    @ObfuscatedName("aa.az")
    public int field1094 = -1;

    @ObfuscatedName("aa.ah")
    public int field1095 = -1;

    @ObfuscatedName("aa.ag")
    public int field1085 = 0;

    @ObfuscatedName("aa.ad")
    public int field1097 = -1;

    @ObfuscatedName("aa.ao")
    public int field1098 = -1;

    @ObfuscatedName("aa.am")
    public int field1111 = 0;

    @ObfuscatedName("aa.ax")
    public int field1096 = -1;

    @ObfuscatedName("aa.at")
    public int field1099 = -1;

    @ObfuscatedName("aa.ar")
    public int field1069 = -1;

    @ObfuscatedName("aa.ai")
    public int field1103 = -1;

    @ObfuscatedName("aa.aw")
    public int field1104 = -1;

    @ObfuscatedName("aa.ak")
    public int field1105 = -1;

    @ObfuscatedName("aa.an")
    public int[] field1106;

    @ObfuscatedName("aa.av")
    public int[] field1075;

    @ObfuscatedName("aa.af")
    public int field1089 = -1;

    @ObfuscatedName("aa.ae")
    public int field1109 = -1;

    @ObfuscatedName("aa.au")
    public int field1110 = 128;

    @ObfuscatedName("aa.aa")
    public int field1067 = 128;

    @ObfuscatedName("aa.ay")
    public int field1112 = 128;

    @ObfuscatedName("aa.ac")
    public int field1113 = 0;

    @ObfuscatedName("aa.ab")
    public int field1114 = 0;

    @ObfuscatedName("aa.ap")
    public int field1115 = 0;

    @ObfuscatedName("aa.as")
    public boolean field1116 = false;

    @ObfuscatedName("aa.bi")
    public int field1117 = -1;

    @ObfuscatedName("aa.bv")
    public int field1118 = -1;

    @ObfuscatedName("er.n(II)Laa;")
    public static class47 method2845(int arg0) {
        class47 var1 = (class47) field1073.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1074.method2929(10, arg0);
        class47 var3 = new class47();
        var3.field1076 = arg0;
        if (var2 != null) {
            var3.method884(new class111(var2));
        }
        var3.method932();
        if (var3.field1109 != -1) {
            var3.method933(method2845(var3.field1109), method2845(var3.field1089));
        }
        if (var3.field1118 != -1) {
            var3.method887(method2845(var3.field1118), method2845(var3.field1117));
        }
        if (!Statics.field1072 && var3.field1091) {
            var3.field1068 = class148.field2328;
            var3.field1116 = false;
            var3.field1070 = null;
            var3.field1093 = null;
            var3.field1115 = 0;
        }
        field1073.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.g(I)V")
    public void method932() {
    }

    @ObfuscatedName("aa.a(Ldp;I)V")
    public void method884(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("aa.m(Ldp;IS)V")
    public void method885(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1077 = arg0.method2395();
        } else if (arg1 == 2) {
            this.field1068 = arg0.method2223();
        } else if (arg1 == 4) {
            this.field1083 = arg0.method2395();
        } else if (arg1 == 5) {
            this.field1084 = arg0.method2395();
        } else if (arg1 == 6) {
            this.field1071 = arg0.method2395();
        } else if (arg1 == 7) {
            this.field1087 = arg0.method2395();
            if (this.field1087 > 32767) {
                this.field1087 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1101 = arg0.method2395();
            if (this.field1101 > 32767) {
                this.field1101 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1092 = 1;
        } else if (arg1 == 12) {
            this.field1090 = arg0.method2366();
        } else if (arg1 == 16) {
            this.field1091 = true;
        } else if (arg1 == 23) {
            this.field1094 = arg0.method2395();
            this.field1085 = arg0.method2211();
        } else if (arg1 == 24) {
            this.field1095 = arg0.method2395();
        } else if (arg1 == 25) {
            this.field1097 = arg0.method2395();
            this.field1111 = arg0.method2211();
        } else if (arg1 == 26) {
            this.field1098 = arg0.method2395();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1070[arg1 - 30] = arg0.method2223();
            if (this.field1070[arg1 - 30].equalsIgnoreCase(class148.field2204)) {
                this.field1070[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1093[arg1 - 35] = arg0.method2223();
        } else if (arg1 == 40) {
            int var3 = arg0.method2211();
            this.field1079 = new short[var3];
            this.field1080 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1079[var4] = (short) arg0.method2395();
                this.field1080[var4] = (short) arg0.method2395();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2211();
            this.field1107 = new short[var5];
            this.field1082 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1107[var6] = (short) arg0.method2395();
                this.field1082[var6] = (short) arg0.method2395();
            }
        } else if (arg1 == 65) {
            this.field1116 = true;
        } else if (arg1 == 78) {
            this.field1096 = arg0.method2395();
        } else if (arg1 == 79) {
            this.field1099 = arg0.method2395();
        } else if (arg1 == 90) {
            this.field1069 = arg0.method2395();
        } else if (arg1 == 91) {
            this.field1104 = arg0.method2395();
        } else if (arg1 == 92) {
            this.field1103 = arg0.method2395();
        } else if (arg1 == 93) {
            this.field1105 = arg0.method2395();
        } else if (arg1 == 95) {
            this.field1086 = arg0.method2395();
        } else if (arg1 == 97) {
            this.field1089 = arg0.method2395();
        } else if (arg1 == 98) {
            this.field1109 = arg0.method2395();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1106 == null) {
                this.field1106 = new int[10];
                this.field1075 = new int[10];
            }
            this.field1106[arg1 - 100] = arg0.method2395();
            this.field1075[arg1 - 100] = arg0.method2395();
        } else if (arg1 == 110) {
            this.field1110 = arg0.method2395();
        } else if (arg1 == 111) {
            this.field1067 = arg0.method2395();
        } else if (arg1 == 112) {
            this.field1112 = arg0.method2395();
        } else if (arg1 == 113) {
            this.field1113 = arg0.method2217();
        } else if (arg1 == 114) {
            this.field1114 = arg0.method2217() * 5;
        } else if (arg1 == 115) {
            this.field1115 = arg0.method2211();
        } else if (arg1 == 139) {
            this.field1117 = arg0.method2395();
        } else if (arg1 == 140) {
            this.field1118 = arg0.method2395();
        }
    }

    @ObfuscatedName("aa.s(Laa;Laa;I)V")
    public void method933(class47 arg0, class47 arg1) {
        this.field1077 = arg0.field1077;
        this.field1083 = arg0.field1083;
        this.field1084 = arg0.field1084;
        this.field1071 = arg0.field1071;
        this.field1086 = arg0.field1086;
        this.field1087 = arg0.field1087;
        this.field1101 = arg0.field1101;
        this.field1079 = arg0.field1079;
        this.field1080 = arg0.field1080;
        this.field1107 = arg0.field1107;
        this.field1082 = arg0.field1082;
        this.field1068 = arg1.field1068;
        this.field1091 = arg1.field1091;
        this.field1090 = arg1.field1090;
        this.field1092 = 1;
    }

    @ObfuscatedName("aa.j(Laa;Laa;S)V")
    public void method887(class47 arg0, class47 arg1) {
        this.field1077 = arg0.field1077;
        this.field1083 = arg0.field1083;
        this.field1084 = arg0.field1084;
        this.field1071 = arg0.field1071;
        this.field1086 = arg0.field1086;
        this.field1087 = arg0.field1087;
        this.field1101 = arg0.field1101;
        this.field1079 = arg1.field1079;
        this.field1080 = arg1.field1080;
        this.field1107 = arg1.field1107;
        this.field1082 = arg1.field1082;
        this.field1068 = arg1.field1068;
        this.field1091 = arg1.field1091;
        this.field1092 = arg1.field1092;
        this.field1094 = arg1.field1094;
        this.field1095 = arg1.field1095;
        this.field1096 = arg1.field1096;
        this.field1097 = arg1.field1097;
        this.field1098 = arg1.field1098;
        this.field1099 = arg1.field1099;
        this.field1069 = arg1.field1069;
        this.field1103 = arg1.field1103;
        this.field1104 = arg1.field1104;
        this.field1105 = arg1.field1105;
        this.field1115 = arg1.field1115;
        this.field1070 = arg1.field1070;
        this.field1093 = new String[5];
        if (arg1.field1093 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1093[var3] = arg1.field1093[var3];
            }
        }
        this.field1093[4] = class148.field2320;
        this.field1090 = 0;
    }

    @ObfuscatedName("aa.f(II)Lci;")
    public final class95 method888(int arg0) {
        if (this.field1106 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1075[var3] && this.field1075[var3] != 0) {
                    var2 = this.field1106[var3];
                }
            }
            if (var2 != -1) {
                return method2845(var2).method888(1);
            }
        }
        class95 var4 = class95.method2011(Statics.field1102, this.field1077, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1110 != 128 || this.field1067 != 128 || this.field1112 != 128) {
            var4.method2020(this.field1110, this.field1067, this.field1112);
        }
        if (this.field1079 != null) {
            for (int var5 = 0; var5 < this.field1079.length; var5++) {
                var4.method1991(this.field1079[var5], this.field1080[var5]);
            }
        }
        if (this.field1107 != null) {
            for (int var6 = 0; var6 < this.field1107.length; var6++) {
                var4.method2030(this.field1107[var6], this.field1082[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aa.b(IB)Lcs;")
    public final class100 method889(int arg0) {
        if (this.field1106 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1075[var3] && this.field1075[var3] != 0) {
                    var2 = this.field1106[var3];
                }
            }
            if (var2 != -1) {
                return method2845(var2).method889(1);
            }
        }
        class100 var4 = (class100) field1108.method3388((long) this.field1076);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method2011(Statics.field1102, this.field1077, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1110 != 128 || this.field1067 != 128 || this.field1112 != 128) {
            var5.method2020(this.field1110, this.field1067, this.field1112);
        }
        if (this.field1079 != null) {
            for (int var6 = 0; var6 < this.field1079.length; var6++) {
                var5.method1991(this.field1079[var6], this.field1080[var6]);
            }
        }
        if (this.field1107 != null) {
            for (int var7 = 0; var7 < this.field1107.length; var7++) {
                var5.method2030(this.field1107[var7], this.field1082[var7]);
            }
        }
        class100 var8 = var5.method1982(this.field1113 + 64, this.field1114 + 768, -50, -10, -50);
        var8.field1765 = true;
        field1108.method3396(var8, (long) this.field1076);
        return var8;
    }

    @ObfuscatedName("aa.t(II)Laa;")
    public class47 method902(int arg0) {
        if (this.field1106 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1075[var3] && this.field1075[var3] != 0) {
                    var2 = this.field1106[var3];
                }
            }
            if (var2 != -1) {
                return method2845(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("v.i(IIIIIZI)Lba;")
    public static final class74 method165(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1078.method3388(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method2845(arg0);
        if (arg1 > 1 && var9.field1106 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1075[var11] && var9.field1075[var11] != 0) {
                    var10 = var9.field1106[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2845(var10);
            }
        }
        class100 var12 = var9.method889(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1109 != -1) {
            var13 = method165(var9.field1089, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1118 != -1) {
            var13 = method165(var9.field1117, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1374;
        int var15 = Statics.field1369;
        int var16 = Statics.field1368;
        int[] var17 = new int[4];
        class75.method1612(var17);
        class74 var18 = new class74(36, 32);
        class75.method1638(var18.field1362, 36, 32);
        class75.method1610();
        class86.method1875();
        class86.method1902(16, 16);
        class86.field1519 = false;
        int var19 = var9.field1083;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1539[var9.field1084] * var19 >> 16;
        int var21 = class86.field1540[var9.field1084] * var19 >> 16;
        var12.method2061();
        var12.method2073(0, var9.field1071, var9.field1086, var9.field1084, var9.field1087, var9.field1101 + var12.field1409 / 2 + var20, var9.field1101 + var21);
        if (var9.field1118 != -1) {
            var13.method1587(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1512(1);
        }
        if (arg2 >= 2) {
            var18.method1512(16777215);
        }
        if (arg3 != 0) {
            var18.method1596(arg3);
        }
        class75.method1638(var18.field1362, 36, 32);
        if (var9.field1109 != -1) {
            var13.method1587(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1092 == 1) {
            Statics.field1633.method3654(method2819(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1078.method3396(var18, var6);
        }
        class75.method1638(var14, var15, var16);
        class75.method1603(var17);
        class86.method1875();
        class86.field1519 = true;
        return var18;
    }

    @ObfuscatedName("ee.c(II)Ljava/lang/String;")
    public static final String method2819(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2366 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2236 + "</col>";
        }
    }

    @ObfuscatedName("aa.k(ZI)Z")
    public final boolean method927(boolean arg0) {
        int var2 = this.field1094;
        int var3 = this.field1095;
        int var4 = this.field1096;
        if (arg0) {
            var2 = this.field1097;
            var3 = this.field1098;
            var4 = this.field1099;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1102.method2987(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1102.method2987(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1102.method2987(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aa.x(ZB)Lci;")
    public final class95 method882(boolean arg0) {
        int var2 = this.field1094;
        int var3 = this.field1095;
        int var4 = this.field1096;
        if (arg0) {
            var2 = this.field1097;
            var3 = this.field1098;
            var4 = this.field1099;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method2011(Statics.field1102, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method2011(Statics.field1102, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method2011(Statics.field1102, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1085 != 0) {
            var5.method1974(0, this.field1085, 0);
        }
        if (arg0 && this.field1111 != 0) {
            var5.method1974(0, this.field1111, 0);
        }
        if (this.field1079 != null) {
            for (int var10 = 0; var10 < this.field1079.length; var10++) {
                var5.method1991(this.field1079[var10], this.field1080[var10]);
            }
        }
        if (this.field1107 != null) {
            for (int var11 = 0; var11 < this.field1107.length; var11++) {
                var5.method2030(this.field1107[var11], this.field1082[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aa.e(ZI)Z")
    public final boolean method893(boolean arg0) {
        int var2 = this.field1069;
        int var3 = this.field1103;
        if (arg0) {
            var2 = this.field1104;
            var3 = this.field1105;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1102.method2987(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1102.method2987(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aa.q(ZI)Lci;")
    public final class95 method894(boolean arg0) {
        int var2 = this.field1069;
        int var3 = this.field1103;
        if (arg0) {
            var2 = this.field1104;
            var3 = this.field1105;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method2011(Statics.field1102, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method2011(Statics.field1102, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1079 != null) {
            for (int var7 = 0; var7 < this.field1079.length; var7++) {
                var4.method1991(this.field1079[var7], this.field1080[var7]);
            }
        }
        if (this.field1107 != null) {
            for (int var8 = 0; var8 < this.field1107.length; var8++) {
                var4.method2030(this.field1107[var8], this.field1082[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dd.o(ZI)V")
    public static void method2440(boolean arg0) {
        if (Statics.field1072 != arg0) {
            field1073.method3398();
            field1108.method3398();
            field1078.method3398();
            Statics.field1072 = arg0;
        }
    }
}
