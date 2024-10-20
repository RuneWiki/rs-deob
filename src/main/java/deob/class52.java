package deob;

@ObfuscatedName("ak")
public class class52 extends class205 {

    @ObfuscatedName("ak.c")
    public static class194 field1090 = new class194(64);

    @ObfuscatedName("ak.n")
    public static class194 field1092 = new class194(50);

    @ObfuscatedName("ak.l")
    public static class194 field1093 = new class194(200);

    @ObfuscatedName("ak.r")
    public int field1094;

    @ObfuscatedName("ak.a")
    public int field1095;

    @ObfuscatedName("ak.d")
    public String field1096 = "null";

    @ObfuscatedName("ak.p")
    public short[] field1086;

    @ObfuscatedName("ak.q")
    public short[] field1141;

    @ObfuscatedName("ak.b")
    public short[] field1099;

    @ObfuscatedName("ak.t")
    public short[] field1100;

    @ObfuscatedName("ak.y")
    public int field1101 = 2000;

    @ObfuscatedName("ak.w")
    public int field1102 = 0;

    @ObfuscatedName("ak.g")
    public int field1085 = 0;

    @ObfuscatedName("ak.s")
    public int field1104 = 0;

    @ObfuscatedName("ak.k")
    public int field1105 = 0;

    @ObfuscatedName("ak.o")
    public int field1097 = 0;

    @ObfuscatedName("ak.v")
    public int field1107 = 0;

    @ObfuscatedName("ak.f")
    public int field1108 = 1;

    @ObfuscatedName("ak.au")
    public boolean field1109 = false;

    @ObfuscatedName("ak.aq")
    public String[] field1089 = new String[] { null, null, class158.field2348, null, null };

    @ObfuscatedName("ak.ab")
    public String[] field1111 = new String[] { null, null, null, null, class158.field2301 };

    @ObfuscatedName("ak.am")
    public int field1112 = -1;

    @ObfuscatedName("ak.an")
    public int field1110 = -1;

    @ObfuscatedName("ak.aj")
    public int field1137 = 0;

    @ObfuscatedName("ak.ay")
    public int field1115 = -1;

    @ObfuscatedName("ak.ao")
    public int field1116 = -1;

    @ObfuscatedName("ak.ag")
    public int field1134 = 0;

    @ObfuscatedName("ak.as")
    public int field1118 = -1;

    @ObfuscatedName("ak.az")
    public int field1113 = -1;

    @ObfuscatedName("ak.av")
    public int field1098 = -1;

    @ObfuscatedName("ak.ax")
    public int field1121 = -1;

    @ObfuscatedName("ak.aa")
    public int field1122 = -1;

    @ObfuscatedName("ak.ah")
    public int field1123 = -1;

    @ObfuscatedName("ak.ai")
    public int[] field1124;

    @ObfuscatedName("ak.ae")
    public int[] field1125;

    @ObfuscatedName("ak.at")
    public int field1126 = -1;

    @ObfuscatedName("ak.ar")
    public int field1140 = -1;

    @ObfuscatedName("ak.aw")
    public int field1120 = 128;

    @ObfuscatedName("ak.ac")
    public int field1129 = 128;

    @ObfuscatedName("ak.ap")
    public int field1130 = 128;

    @ObfuscatedName("ak.af")
    public int field1091 = 0;

    @ObfuscatedName("ak.al")
    public int field1132 = 0;

    @ObfuscatedName("ak.ad")
    public int field1131 = 0;

    @ObfuscatedName("ak.ak")
    public boolean field1128 = false;

    @ObfuscatedName("ak.bb")
    public int field1135 = -1;

    @ObfuscatedName("ak.bt")
    public int field1117 = -1;

    @ObfuscatedName("ak.bd")
    public int field1114 = -1;

    @ObfuscatedName("ak.bx")
    public int field1138 = -1;

    @ObfuscatedName("cp.j(II)Lak;")
    public static class52 method1967(int arg0) {
        class52 var1 = (class52) field1090.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1088.method3011(10, arg0);
        class52 var3 = new class52();
        var3.field1094 = arg0;
        if (var2 != null) {
            var3.method1016(new class120(var2));
        }
        var3.method1007();
        if (var3.field1140 != -1) {
            var3.method1010(method1967(var3.field1140), method1967(var3.field1126));
        }
        if (var3.field1117 != -1) {
            var3.method1033(method1967(var3.field1117), method1967(var3.field1135));
        }
        if (var3.field1138 != -1) {
            var3.method1011(method1967(var3.field1138), method1967(var3.field1114));
        }
        if (!Statics.field1335 && var3.field1109) {
            var3.field1096 = class158.field2448;
            var3.field1128 = false;
            var3.field1089 = null;
            var3.field1111 = null;
            var3.field1131 = 0;
        }
        field1090.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.h(B)V")
    public void method1007() {
    }

    @ObfuscatedName("ak.m(Ldx;I)V")
    public void method1016(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method1009(arg0, var2);
        }
    }

    @ObfuscatedName("ak.z(Ldx;II)V")
    public void method1009(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1095 = arg0.method2363();
        } else if (arg1 == 2) {
            this.field1096 = arg0.method2369();
        } else if (arg1 == 4) {
            this.field1101 = arg0.method2363();
        } else if (arg1 == 5) {
            this.field1102 = arg0.method2363();
        } else if (arg1 == 6) {
            this.field1085 = arg0.method2363();
        } else if (arg1 == 7) {
            this.field1105 = arg0.method2363();
            if (this.field1105 > 32767) {
                this.field1105 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1097 = arg0.method2363();
            if (this.field1097 > 32767) {
                this.field1097 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1107 = 1;
        } else if (arg1 == 12) {
            this.field1108 = arg0.method2366();
        } else if (arg1 == 16) {
            this.field1109 = true;
        } else if (arg1 == 23) {
            this.field1112 = arg0.method2363();
            this.field1137 = arg0.method2361();
        } else if (arg1 == 24) {
            this.field1110 = arg0.method2363();
        } else if (arg1 == 25) {
            this.field1115 = arg0.method2363();
            this.field1134 = arg0.method2361();
        } else if (arg1 == 26) {
            this.field1116 = arg0.method2363();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1089[arg1 - 30] = arg0.method2369();
            if (this.field1089[arg1 - 30].equalsIgnoreCase(class158.field2302)) {
                this.field1089[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1111[arg1 - 35] = arg0.method2369();
        } else if (arg1 == 40) {
            int var3 = arg0.method2361();
            this.field1086 = new short[var3];
            this.field1141 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1086[var4] = (short) arg0.method2363();
                this.field1141[var4] = (short) arg0.method2363();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2361();
            this.field1099 = new short[var5];
            this.field1100 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1099[var6] = (short) arg0.method2363();
                this.field1100[var6] = (short) arg0.method2363();
            }
        } else if (arg1 == 65) {
            this.field1128 = true;
        } else if (arg1 == 78) {
            this.field1118 = arg0.method2363();
        } else if (arg1 == 79) {
            this.field1113 = arg0.method2363();
        } else if (arg1 == 90) {
            this.field1098 = arg0.method2363();
        } else if (arg1 == 91) {
            this.field1122 = arg0.method2363();
        } else if (arg1 == 92) {
            this.field1121 = arg0.method2363();
        } else if (arg1 == 93) {
            this.field1123 = arg0.method2363();
        } else if (arg1 == 95) {
            this.field1104 = arg0.method2363();
        } else if (arg1 == 97) {
            this.field1126 = arg0.method2363();
        } else if (arg1 == 98) {
            this.field1140 = arg0.method2363();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1124 == null) {
                this.field1124 = new int[10];
                this.field1125 = new int[10];
            }
            this.field1124[arg1 - 100] = arg0.method2363();
            this.field1125[arg1 - 100] = arg0.method2363();
        } else if (arg1 == 110) {
            this.field1120 = arg0.method2363();
        } else if (arg1 == 111) {
            this.field1129 = arg0.method2363();
        } else if (arg1 == 112) {
            this.field1130 = arg0.method2363();
        } else if (arg1 == 113) {
            this.field1091 = arg0.method2531();
        } else if (arg1 == 114) {
            this.field1132 = arg0.method2531() * 5;
        } else if (arg1 == 115) {
            this.field1131 = arg0.method2361();
        } else if (arg1 == 139) {
            this.field1135 = arg0.method2363();
        } else if (arg1 == 140) {
            this.field1117 = arg0.method2363();
        } else if (arg1 == 148) {
            this.field1114 = arg0.method2363();
        } else if (arg1 == 149) {
            this.field1138 = arg0.method2363();
        }
    }

    @ObfuscatedName("ak.x(Lak;Lak;I)V")
    public void method1010(class52 arg0, class52 arg1) {
        this.field1095 = arg0.field1095;
        this.field1101 = arg0.field1101;
        this.field1102 = arg0.field1102;
        this.field1085 = arg0.field1085;
        this.field1104 = arg0.field1104;
        this.field1105 = arg0.field1105;
        this.field1097 = arg0.field1097;
        this.field1086 = arg0.field1086;
        this.field1141 = arg0.field1141;
        this.field1099 = arg0.field1099;
        this.field1100 = arg0.field1100;
        this.field1096 = arg1.field1096;
        this.field1109 = arg1.field1109;
        this.field1108 = arg1.field1108;
        this.field1107 = 1;
    }

    @ObfuscatedName("ak.e(Lak;Lak;B)V")
    public void method1033(class52 arg0, class52 arg1) {
        this.field1095 = arg0.field1095;
        this.field1101 = arg0.field1101;
        this.field1102 = arg0.field1102;
        this.field1085 = arg0.field1085;
        this.field1104 = arg0.field1104;
        this.field1105 = arg0.field1105;
        this.field1097 = arg0.field1097;
        this.field1086 = arg1.field1086;
        this.field1141 = arg1.field1141;
        this.field1099 = arg1.field1099;
        this.field1100 = arg1.field1100;
        this.field1096 = arg1.field1096;
        this.field1109 = arg1.field1109;
        this.field1107 = arg1.field1107;
        this.field1112 = arg1.field1112;
        this.field1110 = arg1.field1110;
        this.field1118 = arg1.field1118;
        this.field1115 = arg1.field1115;
        this.field1116 = arg1.field1116;
        this.field1113 = arg1.field1113;
        this.field1098 = arg1.field1098;
        this.field1121 = arg1.field1121;
        this.field1122 = arg1.field1122;
        this.field1123 = arg1.field1123;
        this.field1131 = arg1.field1131;
        this.field1089 = arg1.field1089;
        this.field1111 = new String[5];
        if (arg1.field1111 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1111[var3] = arg1.field1111[var3];
            }
        }
        this.field1111[4] = class158.field2550;
        this.field1108 = 0;
    }

    @ObfuscatedName("ak.i(Lak;Lak;B)V")
    public void method1011(class52 arg0, class52 arg1) {
        this.field1095 = arg0.field1095;
        this.field1101 = arg0.field1101;
        this.field1102 = arg0.field1102;
        this.field1085 = arg0.field1085;
        this.field1104 = arg0.field1104;
        this.field1105 = arg0.field1105;
        this.field1097 = arg0.field1097;
        this.field1086 = arg0.field1086;
        this.field1141 = arg0.field1141;
        this.field1099 = arg0.field1099;
        this.field1100 = arg0.field1100;
        this.field1107 = arg0.field1107;
        this.field1096 = arg1.field1096;
        this.field1108 = 0;
        this.field1109 = false;
        this.field1128 = false;
    }

    @ObfuscatedName("ak.c(IS)Lcd;")
    public final class101 method1012(int arg0) {
        if (this.field1124 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1125[var3] && this.field1125[var3] != 0) {
                    var2 = this.field1124[var3];
                }
            }
            if (var2 != -1) {
                return method1967(var2).method1012(1);
            }
        }
        class101 var4 = class101.method2069(Statics.field1136, this.field1095, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1120 != 128 || this.field1129 != 128 || this.field1130 != 128) {
            var4.method2071(this.field1120, this.field1129, this.field1130);
        }
        if (this.field1086 != null) {
            for (int var5 = 0; var5 < this.field1086.length; var5++) {
                var4.method2073(this.field1086[var5], this.field1141[var5]);
            }
        }
        if (this.field1099 != null) {
            for (int var6 = 0; var6 < this.field1099.length; var6++) {
                var4.method2085(this.field1099[var6], this.field1100[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ak.n(IB)Ldf;")
    public final class106 method1045(int arg0) {
        if (this.field1124 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1125[var3] && this.field1125[var3] != 0) {
                    var2 = this.field1124[var3];
                }
            }
            if (var2 != -1) {
                return method1967(var2).method1045(1);
            }
        }
        class106 var4 = (class106) field1092.method3460((long) this.field1094);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2069(Statics.field1136, this.field1095, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1120 != 128 || this.field1129 != 128 || this.field1130 != 128) {
            var5.method2071(this.field1120, this.field1129, this.field1130);
        }
        if (this.field1086 != null) {
            for (int var6 = 0; var6 < this.field1086.length; var6++) {
                var5.method2073(this.field1086[var6], this.field1141[var6]);
            }
        }
        if (this.field1099 != null) {
            for (int var7 = 0; var7 < this.field1099.length; var7++) {
                var5.method2085(this.field1099[var7], this.field1100[var7]);
            }
        }
        class106 var8 = var5.method2089(this.field1091 + 64, this.field1132 + 768, -50, -10, -50);
        var8.field1810 = true;
        field1092.method3462(var8, (long) this.field1094);
        return var8;
    }

    @ObfuscatedName("ak.l(II)Lak;")
    public class52 method1026(int arg0) {
        if (this.field1124 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1125[var3] && this.field1125[var3] != 0) {
                    var2 = this.field1124[var3];
                }
            }
            if (var2 != -1) {
                return method1967(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("au.u(IIIIIZB)Lce;")
    public static final class79 method625(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1093.method3460(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method1967(arg0);
        if (arg1 > 1 && var9.field1124 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1125[var11] && var9.field1125[var11] != 0) {
                    var10 = var9.field1124[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1967(var10);
            }
        }
        class106 var12 = var9.method1045(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1140 != -1) {
            var13 = method625(var9.field1126, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1117 != -1) {
            var13 = method625(var9.field1135, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1138 != -1) {
            var13 = method625(var9.field1114, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1399;
        int var15 = Statics.field1398;
        int var16 = Statics.field1397;
        int[] var17 = new int[4];
        class80.method1678(var17);
        class79 var18 = new class79(36, 32);
        class80.method1673(var18.field1393, 36, 32);
        class80.method1680();
        class92.method1973();
        class92.method1987(16, 16);
        class92.field1552 = false;
        if (var9.field1138 != -1) {
            var13.method1599(0, 0);
        }
        int var19 = var9.field1101;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1572[var9.field1102] * var19 >> 16;
        int var21 = class92.field1573[var9.field1102] * var19 >> 16;
        var12.method2203();
        var12.method2170(0, var9.field1085, var9.field1104, var9.field1102, var9.field1105, var9.field1097 + var12.field1444 / 2 + var20, var9.field1097 + var21);
        if (var9.field1117 != -1) {
            var13.method1599(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1641(1);
        }
        if (arg2 >= 2) {
            var18.method1641(16777215);
        }
        if (arg3 != 0) {
            var18.method1662(arg3);
        }
        class80.method1673(var18.field1393, 36, 32);
        if (var9.field1140 != -1) {
            var13.method1599(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1107 == 1) {
            Statics.field3129.method3762(method2066(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1093.method3462(var18, var6);
        }
        class80.method1673(var14, var15, var16);
        class80.method1709(var17);
        class92.method1973();
        class92.field1552 = true;
        return var18;
    }

    @ObfuscatedName("cq.r(IB)Ljava/lang/String;")
    public static final String method2066(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class158.field2461 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class158.field2459 + "</col>";
        }
    }

    @ObfuscatedName("ak.a(ZB)Z")
    public final boolean method1014(boolean arg0) {
        int var2 = this.field1112;
        int var3 = this.field1110;
        int var4 = this.field1118;
        if (arg0) {
            var2 = this.field1115;
            var3 = this.field1116;
            var4 = this.field1113;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1136.method3088(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1136.method3088(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1136.method3088(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ak.d(ZI)Lcd;")
    public final class101 method1008(boolean arg0) {
        int var2 = this.field1112;
        int var3 = this.field1110;
        int var4 = this.field1118;
        if (arg0) {
            var2 = this.field1115;
            var3 = this.field1116;
            var4 = this.field1113;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2069(Statics.field1136, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2069(Statics.field1136, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2069(Statics.field1136, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1137 != 0) {
            var5.method2081(0, this.field1137, 0);
        }
        if (arg0 && this.field1134 != 0) {
            var5.method2081(0, this.field1134, 0);
        }
        if (this.field1086 != null) {
            for (int var10 = 0; var10 < this.field1086.length; var10++) {
                var5.method2073(this.field1086[var10], this.field1141[var10]);
            }
        }
        if (this.field1099 != null) {
            for (int var11 = 0; var11 < this.field1099.length; var11++) {
                var5.method2085(this.field1099[var11], this.field1100[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ak.p(ZB)Z")
    public final boolean method1047(boolean arg0) {
        int var2 = this.field1098;
        int var3 = this.field1121;
        if (arg0) {
            var2 = this.field1122;
            var3 = this.field1123;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1136.method3088(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1136.method3088(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ak.q(ZI)Lcd;")
    public final class101 method1017(boolean arg0) {
        int var2 = this.field1098;
        int var3 = this.field1121;
        if (arg0) {
            var2 = this.field1122;
            var3 = this.field1123;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2069(Statics.field1136, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2069(Statics.field1136, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1086 != null) {
            for (int var7 = 0; var7 < this.field1086.length; var7++) {
                var4.method2073(this.field1086[var7], this.field1141[var7]);
            }
        }
        if (this.field1099 != null) {
            for (int var8 = 0; var8 < this.field1099.length; var8++) {
                var4.method2085(this.field1099[var8], this.field1100[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("j.b(I)V")
    public static void method3() {
        field1090.method3463();
        field1092.method3463();
        field1093.method3463();
    }

    @ObfuscatedName("ek.y(ZI)V")
    public static void method2804(boolean arg0) {
        if (Statics.field1335 != arg0) {
            method3();
            Statics.field1335 = arg0;
        }
    }
}
