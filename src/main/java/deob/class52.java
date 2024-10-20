package deob;

@ObfuscatedName("as")
public class class52 extends class205 {

    @ObfuscatedName("as.a")
    public static class194 field1087 = new class194(64);

    @ObfuscatedName("as.r")
    public static class194 field1088 = new class194(50);

    @ObfuscatedName("as.k")
    public static class194 field1130 = new class194(200);

    @ObfuscatedName("as.n")
    public int field1090;

    @ObfuscatedName("as.y")
    public int field1113;

    @ObfuscatedName("as.i")
    public String field1092 = "null";

    @ObfuscatedName("as.j")
    public short[] field1093;

    @ObfuscatedName("as.l")
    public short[] field1094;

    @ObfuscatedName("as.o")
    public short[] field1095;

    @ObfuscatedName("as.c")
    public short[] field1096;

    @ObfuscatedName("as.x")
    public int field1097 = 2000;

    @ObfuscatedName("as.b")
    public int field1098 = 0;

    @ObfuscatedName("as.q")
    public int field1099 = 0;

    @ObfuscatedName("as.u")
    public int field1085 = 0;

    @ObfuscatedName("as.t")
    public int field1107 = 0;

    @ObfuscatedName("as.d")
    public int field1134 = 0;

    @ObfuscatedName("as.z")
    public int field1103 = 0;

    @ObfuscatedName("as.v")
    public int field1126 = 1;

    @ObfuscatedName("as.aq")
    public boolean field1124 = false;

    @ObfuscatedName("as.ap")
    public String[] field1106 = new String[] { null, null, class158.field2308, null, null };

    @ObfuscatedName("as.ai")
    public String[] field1131 = new String[] { null, null, null, null, class158.field2403 };

    @ObfuscatedName("as.ae")
    public int field1108 = -1;

    @ObfuscatedName("as.az")
    public int field1100 = -1;

    @ObfuscatedName("as.ah")
    public int field1110 = 0;

    @ObfuscatedName("as.ar")
    public int field1109 = -1;

    @ObfuscatedName("as.ab")
    public int field1112 = -1;

    @ObfuscatedName("as.aj")
    public int field1091 = 0;

    @ObfuscatedName("as.ay")
    public int field1114 = -1;

    @ObfuscatedName("as.ag")
    public int field1115 = -1;

    @ObfuscatedName("as.av")
    public int field1116 = -1;

    @ObfuscatedName("as.af")
    public int field1117 = -1;

    @ObfuscatedName("as.am")
    public int field1118 = -1;

    @ObfuscatedName("as.aw")
    public int field1119 = -1;

    @ObfuscatedName("as.ad")
    public int[] field1120;

    @ObfuscatedName("as.aa")
    public int[] field1121;

    @ObfuscatedName("as.ac")
    public int field1122 = -1;

    @ObfuscatedName("as.an")
    public int field1123 = -1;

    @ObfuscatedName("as.ax")
    public int field1102 = 128;

    @ObfuscatedName("as.au")
    public int field1089 = 128;

    @ObfuscatedName("as.at")
    public int field1111 = 128;

    @ObfuscatedName("as.ao")
    public int field1081 = 0;

    @ObfuscatedName("as.al")
    public int field1128 = 0;

    @ObfuscatedName("as.ak")
    public int field1125 = 0;

    @ObfuscatedName("as.as")
    public boolean field1105 = false;

    @ObfuscatedName("as.bj")
    public int field1129 = -1;

    @ObfuscatedName("as.bq")
    public int field1132 = -1;

    @ObfuscatedName("x.e(Lft;Lft;ZLhu;I)V")
    public static void method183(class168 arg0, class168 arg1, boolean arg2, class225 arg3) {
        Statics.field102 = arg0;
        Statics.field1084 = arg1;
        Statics.field1101 = arg2;
        Statics.field1127 = Statics.field102.method3075(10);
        Statics.field3182 = arg3;
    }

    @ObfuscatedName("ab.w(II)Las;")
    public static class52 method696(int arg0) {
        class52 var1 = (class52) field1087.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field102.method3048(10, arg0);
        class52 var3 = new class52();
        var3.field1090 = arg0;
        if (var2 != null) {
            var3.method991(new class120(var2));
        }
        var3.method1031();
        if (var3.field1123 != -1) {
            var3.method993(method696(var3.field1123), method696(var3.field1122));
        }
        if (var3.field1132 != -1) {
            var3.method1000(method696(var3.field1132), method696(var3.field1129));
        }
        if (!Statics.field1101 && var3.field1124) {
            var3.field1092 = class158.field2489;
            var3.field1105 = false;
            var3.field1106 = null;
            var3.field1131 = null;
            var3.field1125 = 0;
        }
        field1087.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.f(I)V")
    public void method1031() {
    }

    @ObfuscatedName("as.s(Ldq;S)V")
    public void method991(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method992(arg0, var2);
        }
    }

    @ObfuscatedName("as.p(Ldq;IB)V")
    public void method992(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1113 = arg0.method2532();
        } else if (arg1 == 2) {
            this.field1092 = arg0.method2363();
        } else if (arg1 == 4) {
            this.field1097 = arg0.method2532();
        } else if (arg1 == 5) {
            this.field1098 = arg0.method2532();
        } else if (arg1 == 6) {
            this.field1099 = arg0.method2532();
        } else if (arg1 == 7) {
            this.field1107 = arg0.method2532();
            if (this.field1107 > 32767) {
                this.field1107 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1134 = arg0.method2532();
            if (this.field1134 > 32767) {
                this.field1134 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1103 = 1;
        } else if (arg1 == 12) {
            this.field1126 = arg0.method2360();
        } else if (arg1 == 16) {
            this.field1124 = true;
        } else if (arg1 == 23) {
            this.field1108 = arg0.method2532();
            this.field1110 = arg0.method2355();
        } else if (arg1 == 24) {
            this.field1100 = arg0.method2532();
        } else if (arg1 == 25) {
            this.field1109 = arg0.method2532();
            this.field1091 = arg0.method2355();
        } else if (arg1 == 26) {
            this.field1112 = arg0.method2532();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1106[arg1 - 30] = arg0.method2363();
            if (this.field1106[arg1 - 30].equalsIgnoreCase(class158.field2310)) {
                this.field1106[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1131[arg1 - 35] = arg0.method2363();
        } else if (arg1 == 40) {
            int var3 = arg0.method2355();
            this.field1093 = new short[var3];
            this.field1094 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1093[var4] = (short) arg0.method2532();
                this.field1094[var4] = (short) arg0.method2532();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2355();
            this.field1095 = new short[var5];
            this.field1096 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1095[var6] = (short) arg0.method2532();
                this.field1096[var6] = (short) arg0.method2532();
            }
        } else if (arg1 == 65) {
            this.field1105 = true;
        } else if (arg1 == 78) {
            this.field1114 = arg0.method2532();
        } else if (arg1 == 79) {
            this.field1115 = arg0.method2532();
        } else if (arg1 == 90) {
            this.field1116 = arg0.method2532();
        } else if (arg1 == 91) {
            this.field1118 = arg0.method2532();
        } else if (arg1 == 92) {
            this.field1117 = arg0.method2532();
        } else if (arg1 == 93) {
            this.field1119 = arg0.method2532();
        } else if (arg1 == 95) {
            this.field1085 = arg0.method2532();
        } else if (arg1 == 97) {
            this.field1122 = arg0.method2532();
        } else if (arg1 == 98) {
            this.field1123 = arg0.method2532();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1120 == null) {
                this.field1120 = new int[10];
                this.field1121 = new int[10];
            }
            this.field1120[arg1 - 100] = arg0.method2532();
            this.field1121[arg1 - 100] = arg0.method2532();
        } else if (arg1 == 110) {
            this.field1102 = arg0.method2532();
        } else if (arg1 == 111) {
            this.field1089 = arg0.method2532();
        } else if (arg1 == 112) {
            this.field1111 = arg0.method2532();
        } else if (arg1 == 113) {
            this.field1081 = arg0.method2465();
        } else if (arg1 == 114) {
            this.field1128 = arg0.method2465();
        } else if (arg1 == 115) {
            this.field1125 = arg0.method2355();
        } else if (arg1 == 139) {
            this.field1129 = arg0.method2532();
        } else if (arg1 == 140) {
            this.field1132 = arg0.method2532();
        }
    }

    @ObfuscatedName("as.h(Las;Las;I)V")
    public void method993(class52 arg0, class52 arg1) {
        this.field1113 = arg0.field1113;
        this.field1097 = arg0.field1097;
        this.field1098 = arg0.field1098;
        this.field1099 = arg0.field1099;
        this.field1085 = arg0.field1085;
        this.field1107 = arg0.field1107;
        this.field1134 = arg0.field1134;
        this.field1093 = arg0.field1093;
        this.field1094 = arg0.field1094;
        this.field1095 = arg0.field1095;
        this.field1096 = arg0.field1096;
        this.field1092 = arg1.field1092;
        this.field1124 = arg1.field1124;
        this.field1126 = arg1.field1126;
        this.field1103 = 1;
    }

    @ObfuscatedName("as.g(Las;Las;I)V")
    public void method1000(class52 arg0, class52 arg1) {
        this.field1113 = arg0.field1113;
        this.field1097 = arg0.field1097;
        this.field1098 = arg0.field1098;
        this.field1099 = arg0.field1099;
        this.field1085 = arg0.field1085;
        this.field1107 = arg0.field1107;
        this.field1134 = arg0.field1134;
        this.field1093 = arg1.field1093;
        this.field1094 = arg1.field1094;
        this.field1095 = arg1.field1095;
        this.field1096 = arg1.field1096;
        this.field1092 = arg1.field1092;
        this.field1124 = arg1.field1124;
        this.field1103 = arg1.field1103;
        this.field1108 = arg1.field1108;
        this.field1100 = arg1.field1100;
        this.field1114 = arg1.field1114;
        this.field1109 = arg1.field1109;
        this.field1112 = arg1.field1112;
        this.field1115 = arg1.field1115;
        this.field1116 = arg1.field1116;
        this.field1117 = arg1.field1117;
        this.field1118 = arg1.field1118;
        this.field1119 = arg1.field1119;
        this.field1125 = arg1.field1125;
        this.field1106 = arg1.field1106;
        this.field1131 = new String[5];
        if (arg1.field1131 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1131[var3] = arg1.field1131[var3];
            }
        }
        this.field1131[4] = class158.field2311;
        this.field1126 = 0;
    }

    @ObfuscatedName("as.a(IB)Lcp;")
    public final class101 method995(int arg0) {
        if (this.field1120 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1121[var3] && this.field1121[var3] != 0) {
                    var2 = this.field1120[var3];
                }
            }
            if (var2 != -1) {
                return method696(var2).method995(1);
            }
        }
        class101 var4 = class101.method2063(Statics.field1084, this.field1113, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1102 != 128 || this.field1089 != 128 || this.field1111 != 128) {
            var4.method2091(this.field1102, this.field1089, this.field1111);
        }
        if (this.field1093 != null) {
            for (int var5 = 0; var5 < this.field1093.length; var5++) {
                var4.method2076(this.field1093[var5], this.field1094[var5]);
            }
        }
        if (this.field1095 != null) {
            for (int var6 = 0; var6 < this.field1095.length; var6++) {
                var4.method2077(this.field1095[var6], this.field1096[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.r(II)Ldy;")
    public final class106 method996(int arg0) {
        if (this.field1120 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1121[var3] && this.field1121[var3] != 0) {
                    var2 = this.field1120[var3];
                }
            }
            if (var2 != -1) {
                return method696(var2).method996(1);
            }
        }
        class106 var4 = (class106) field1088.method3473((long) this.field1090);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2063(Statics.field1084, this.field1113, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1102 != 128 || this.field1089 != 128 || this.field1111 != 128) {
            var5.method2091(this.field1102, this.field1089, this.field1111);
        }
        if (this.field1093 != null) {
            for (int var6 = 0; var6 < this.field1093.length; var6++) {
                var5.method2076(this.field1093[var6], this.field1094[var6]);
            }
        }
        if (this.field1095 != null) {
            for (int var7 = 0; var7 < this.field1095.length; var7++) {
                var5.method2077(this.field1095[var7], this.field1096[var7]);
            }
        }
        class106 var8 = var5.method2078(this.field1081 + 64, this.field1128 * 5 + 768, -50, -10, -50);
        var8.field1802 = true;
        field1088.method3475(var8, (long) this.field1090);
        return var8;
    }

    @ObfuscatedName("as.k(II)Las;")
    public class52 method997(int arg0) {
        if (this.field1120 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1121[var3] && this.field1121[var3] != 0) {
                    var2 = this.field1120[var3];
                }
            }
            if (var2 != -1) {
                return method696(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("a.m(IIIIIZI)Lcb;")
    public static final class79 method102(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1130.method3473(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method696(arg0);
        if (arg1 > 1 && var9.field1120 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1121[var11] && var9.field1121[var11] != 0) {
                    var10 = var9.field1120[var11];
                }
            }
            if (var10 != -1) {
                var9 = method696(var10);
            }
        }
        class106 var12 = var9.method996(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1123 != -1) {
            var13 = method102(var9.field1122, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1132 != -1) {
            var13 = method102(var9.field1129, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1384;
        int var15 = Statics.field1388;
        int var16 = Statics.field1385;
        int[] var17 = new int[4];
        class80.method1679(var17);
        class79 var18 = new class79(36, 32);
        class80.method1695(var18.field1380, 36, 32);
        class80.method1681();
        class92.method1957();
        class92.method1960(16, 16);
        class92.field1549 = false;
        int var19 = var9.field1097;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1569[var9.field1098] * var19 >> 16;
        int var21 = class92.field1555[var9.field1098] * var19 >> 16;
        var12.method2183();
        var12.method2221(0, var9.field1099, var9.field1085, var9.field1098, var9.field1107, var9.field1134 + var12.field1439 / 2 + var20, var9.field1134 + var21);
        if (var9.field1132 != -1) {
            var13.method1583(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1616(1);
        }
        if (arg2 >= 2) {
            var18.method1616(16777215);
        }
        if (arg3 != 0) {
            var18.method1609(arg3);
        }
        class80.method1695(var18.field1380, 36, 32);
        if (var9.field1123 != -1) {
            var13.method1583(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1103 == 1) {
            class225 var22 = Statics.field3182;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class158.field2469 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class158.field2371 + "</col>";
            }
            var22.method3738(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1130.method3475(var18, var6);
        }
        class80.method1695(var14, var15, var16);
        class80.method1680(var17);
        class92.method1957();
        class92.field1549 = true;
        return var18;
    }

    @ObfuscatedName("as.n(ZI)Z")
    public final boolean method1021(boolean arg0) {
        int var2 = this.field1108;
        int var3 = this.field1100;
        int var4 = this.field1114;
        if (arg0) {
            var2 = this.field1109;
            var3 = this.field1112;
            var4 = this.field1115;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1084.method3032(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1084.method3032(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1084.method3032(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("as.y(ZI)Lcp;")
    public final class101 method999(boolean arg0) {
        int var2 = this.field1108;
        int var3 = this.field1100;
        int var4 = this.field1114;
        if (arg0) {
            var2 = this.field1109;
            var3 = this.field1112;
            var4 = this.field1115;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2063(Statics.field1084, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2063(Statics.field1084, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2063(Statics.field1084, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1110 != 0) {
            var5.method2075(0, this.field1110, 0);
        }
        if (arg0 && this.field1091 != 0) {
            var5.method2075(0, this.field1091, 0);
        }
        if (this.field1093 != null) {
            for (int var10 = 0; var10 < this.field1093.length; var10++) {
                var5.method2076(this.field1093[var10], this.field1094[var10]);
            }
        }
        if (this.field1095 != null) {
            for (int var11 = 0; var11 < this.field1095.length; var11++) {
                var5.method2077(this.field1095[var11], this.field1096[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("as.i(ZI)Z")
    public final boolean method998(boolean arg0) {
        int var2 = this.field1116;
        int var3 = this.field1117;
        if (arg0) {
            var2 = this.field1118;
            var3 = this.field1119;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1084.method3032(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1084.method3032(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("as.j(ZI)Lcp;")
    public final class101 method1001(boolean arg0) {
        int var2 = this.field1116;
        int var3 = this.field1117;
        if (arg0) {
            var2 = this.field1118;
            var3 = this.field1119;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2063(Statics.field1084, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2063(Statics.field1084, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1093 != null) {
            for (int var7 = 0; var7 < this.field1093.length; var7++) {
                var4.method2076(this.field1093[var7], this.field1094[var7]);
            }
        }
        if (this.field1095 != null) {
            for (int var8 = 0; var8 < this.field1095.length; var8++) {
                var4.method2077(this.field1095[var8], this.field1096[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("h.l(B)V")
    public static void method77() {
        field1087.method3479();
        field1088.method3479();
        field1130.method3479();
    }

    @ObfuscatedName("ac.o(I)V")
    public static void method879() {
        field1130.method3479();
    }
}
