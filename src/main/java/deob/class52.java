package deob;

@ObfuscatedName("an")
public class class52 extends class204 {

    @ObfuscatedName("an.i")
    public static class193 field1094 = new class193(64);

    @ObfuscatedName("an.t")
    public static class193 field1137 = new class193(50);

    @ObfuscatedName("an.k")
    public static class193 field1096 = new class193(200);

    @ObfuscatedName("an.w")
    public int field1098;

    @ObfuscatedName("an.e")
    public int field1099;

    @ObfuscatedName("an.z")
    public String field1100 = "null";

    @ObfuscatedName("an.p")
    public short[] field1101;

    @ObfuscatedName("an.r")
    public short[] field1102;

    @ObfuscatedName("an.g")
    public short[] field1103;

    @ObfuscatedName("an.n")
    public short[] field1108;

    @ObfuscatedName("an.y")
    public int field1130 = 2000;

    @ObfuscatedName("an.v")
    public int field1106 = 0;

    @ObfuscatedName("an.q")
    public int field1104 = 0;

    @ObfuscatedName("an.x")
    public int field1090 = 0;

    @ObfuscatedName("an.d")
    public int field1140 = 0;

    @ObfuscatedName("an.o")
    public int field1131 = 0;

    @ObfuscatedName("an.c")
    public int field1111 = 0;

    @ObfuscatedName("an.b")
    public int field1112 = 1;

    @ObfuscatedName("an.aa")
    public boolean field1113 = false;

    @ObfuscatedName("an.ao")
    public String[] field1109 = new String[] { null, null, class157.field2298, null, null };

    @ObfuscatedName("an.as")
    public String[] field1117 = new String[] { null, null, null, null, class157.field2420 };

    @ObfuscatedName("an.ae")
    public int field1116 = -1;

    @ObfuscatedName("an.ai")
    public int field1097 = -1;

    @ObfuscatedName("an.am")
    public int field1118 = 0;

    @ObfuscatedName("an.ax")
    public int field1119 = -1;

    @ObfuscatedName("an.ay")
    public int field1120 = -1;

    @ObfuscatedName("an.az")
    public int field1121 = 0;

    @ObfuscatedName("an.av")
    public int field1122 = -1;

    @ObfuscatedName("an.ap")
    public int field1095 = -1;

    @ObfuscatedName("an.at")
    public int field1124 = -1;

    @ObfuscatedName("an.al")
    public int field1132 = -1;

    @ObfuscatedName("an.ac")
    public int field1110 = -1;

    @ObfuscatedName("an.ar")
    public int field1127 = -1;

    @ObfuscatedName("an.ah")
    public int[] field1128;

    @ObfuscatedName("an.ak")
    public int[] field1129;

    @ObfuscatedName("an.ag")
    public int field1105 = -1;

    @ObfuscatedName("an.aq")
    public int field1115 = -1;

    @ObfuscatedName("an.au")
    public int field1107 = 128;

    @ObfuscatedName("an.aw")
    public int field1133 = 128;

    @ObfuscatedName("an.ad")
    public int field1134 = 128;

    @ObfuscatedName("an.af")
    public int field1135 = 0;

    @ObfuscatedName("an.aj")
    public int field1136 = 0;

    @ObfuscatedName("an.ab")
    public int field1125 = 0;

    @ObfuscatedName("an.an")
    public boolean field1138 = false;

    @ObfuscatedName("an.bj")
    public int field1139 = -1;

    @ObfuscatedName("an.bn")
    public int field1126 = -1;

    @ObfuscatedName("cn.j(Lfa;Lfa;ZLhj;B)V")
    public static void method2062(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field3165 = arg0;
        Statics.field1092 = arg1;
        Statics.field1751 = arg2;
        Statics.field1093 = Statics.field3165.method3094(10);
        Statics.field1114 = arg3;
    }

    @ObfuscatedName("s.m(II)Lan;")
    public static class52 method154(int arg0) {
        class52 var1 = (class52) field1094.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3165.method3124(10, arg0);
        class52 var3 = new class52();
        var3.field1098 = arg0;
        if (var2 != null) {
            var3.method1080(new class119(var2));
        }
        var3.method1046();
        if (var3.field1115 != -1) {
            var3.method1036(method154(var3.field1115), method154(var3.field1105));
        }
        if (var3.field1126 != -1) {
            var3.method1037(method154(var3.field1126), method154(var3.field1139));
        }
        if (!Statics.field1751 && var3.field1113) {
            var3.field1100 = class157.field2403;
            var3.field1138 = false;
            var3.field1109 = null;
            var3.field1117 = null;
            var3.field1125 = 0;
        }
        field1094.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(I)V")
    public void method1046() {
    }

    @ObfuscatedName("an.l(Ldc;B)V")
    public void method1080(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method1035(arg0, var2);
        }
    }

    @ObfuscatedName("an.u(Ldc;II)V")
    public void method1035(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1099 = arg0.method2374();
        } else if (arg1 == 2) {
            this.field1100 = arg0.method2380();
        } else if (arg1 == 4) {
            this.field1130 = arg0.method2374();
        } else if (arg1 == 5) {
            this.field1106 = arg0.method2374();
        } else if (arg1 == 6) {
            this.field1104 = arg0.method2374();
        } else if (arg1 == 7) {
            this.field1140 = arg0.method2374();
            if (this.field1140 > 32767) {
                this.field1140 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1131 = arg0.method2374();
            if (this.field1131 > 32767) {
                this.field1131 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1111 = 1;
        } else if (arg1 == 12) {
            this.field1112 = arg0.method2377();
        } else if (arg1 == 16) {
            this.field1113 = true;
        } else if (arg1 == 23) {
            this.field1116 = arg0.method2374();
            this.field1118 = arg0.method2372();
        } else if (arg1 == 24) {
            this.field1097 = arg0.method2374();
        } else if (arg1 == 25) {
            this.field1119 = arg0.method2374();
            this.field1121 = arg0.method2372();
        } else if (arg1 == 26) {
            this.field1120 = arg0.method2374();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1109[arg1 - 30] = arg0.method2380();
            if (this.field1109[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field1109[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1117[arg1 - 35] = arg0.method2380();
        } else if (arg1 == 40) {
            int var3 = arg0.method2372();
            this.field1101 = new short[var3];
            this.field1102 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1101[var4] = (short) arg0.method2374();
                this.field1102[var4] = (short) arg0.method2374();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2372();
            this.field1103 = new short[var5];
            this.field1108 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1103[var6] = (short) arg0.method2374();
                this.field1108[var6] = (short) arg0.method2374();
            }
        } else if (arg1 == 65) {
            this.field1138 = true;
        } else if (arg1 == 78) {
            this.field1122 = arg0.method2374();
        } else if (arg1 == 79) {
            this.field1095 = arg0.method2374();
        } else if (arg1 == 90) {
            this.field1124 = arg0.method2374();
        } else if (arg1 == 91) {
            this.field1110 = arg0.method2374();
        } else if (arg1 == 92) {
            this.field1132 = arg0.method2374();
        } else if (arg1 == 93) {
            this.field1127 = arg0.method2374();
        } else if (arg1 == 95) {
            this.field1090 = arg0.method2374();
        } else if (arg1 == 97) {
            this.field1105 = arg0.method2374();
        } else if (arg1 == 98) {
            this.field1115 = arg0.method2374();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1128 == null) {
                this.field1128 = new int[10];
                this.field1129 = new int[10];
            }
            this.field1128[arg1 - 100] = arg0.method2374();
            this.field1129[arg1 - 100] = arg0.method2374();
        } else if (arg1 == 110) {
            this.field1107 = arg0.method2374();
        } else if (arg1 == 111) {
            this.field1133 = arg0.method2374();
        } else if (arg1 == 112) {
            this.field1134 = arg0.method2374();
        } else if (arg1 == 113) {
            this.field1135 = arg0.method2373();
        } else if (arg1 == 114) {
            this.field1136 = arg0.method2373() * 5;
        } else if (arg1 == 115) {
            this.field1125 = arg0.method2372();
        } else if (arg1 == 139) {
            this.field1139 = arg0.method2374();
        } else if (arg1 == 140) {
            this.field1126 = arg0.method2374();
        }
    }

    @ObfuscatedName("an.a(Lan;Lan;I)V")
    public void method1036(class52 arg0, class52 arg1) {
        this.field1099 = arg0.field1099;
        this.field1130 = arg0.field1130;
        this.field1106 = arg0.field1106;
        this.field1104 = arg0.field1104;
        this.field1090 = arg0.field1090;
        this.field1140 = arg0.field1140;
        this.field1131 = arg0.field1131;
        this.field1101 = arg0.field1101;
        this.field1102 = arg0.field1102;
        this.field1103 = arg0.field1103;
        this.field1108 = arg0.field1108;
        this.field1100 = arg1.field1100;
        this.field1113 = arg1.field1113;
        this.field1112 = arg1.field1112;
        this.field1111 = 1;
    }

    @ObfuscatedName("an.h(Lan;Lan;B)V")
    public void method1037(class52 arg0, class52 arg1) {
        this.field1099 = arg0.field1099;
        this.field1130 = arg0.field1130;
        this.field1106 = arg0.field1106;
        this.field1104 = arg0.field1104;
        this.field1090 = arg0.field1090;
        this.field1140 = arg0.field1140;
        this.field1131 = arg0.field1131;
        this.field1101 = arg1.field1101;
        this.field1102 = arg1.field1102;
        this.field1103 = arg1.field1103;
        this.field1108 = arg1.field1108;
        this.field1100 = arg1.field1100;
        this.field1113 = arg1.field1113;
        this.field1111 = arg1.field1111;
        this.field1116 = arg1.field1116;
        this.field1097 = arg1.field1097;
        this.field1122 = arg1.field1122;
        this.field1119 = arg1.field1119;
        this.field1120 = arg1.field1120;
        this.field1095 = arg1.field1095;
        this.field1124 = arg1.field1124;
        this.field1132 = arg1.field1132;
        this.field1110 = arg1.field1110;
        this.field1127 = arg1.field1127;
        this.field1125 = arg1.field1125;
        this.field1109 = arg1.field1109;
        this.field1117 = new String[5];
        if (arg1.field1117 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1117[var3] = arg1.field1117[var3];
            }
        }
        this.field1117[4] = class157.field2304;
        this.field1112 = 0;
    }

    @ObfuscatedName("an.i(IB)Lcy;")
    public final class100 method1038(int arg0) {
        if (this.field1128 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1129[var3] && this.field1129[var3] != 0) {
                    var2 = this.field1128[var3];
                }
            }
            if (var2 != -1) {
                return method154(var2).method1038(1);
            }
        }
        class100 var4 = class100.method2063(Statics.field1092, this.field1099, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1107 != 128 || this.field1133 != 128 || this.field1134 != 128) {
            var4.method2080(this.field1107, this.field1133, this.field1134);
        }
        if (this.field1101 != null) {
            for (int var5 = 0; var5 < this.field1101.length; var5++) {
                var4.method2143(this.field1101[var5], this.field1102[var5]);
            }
        }
        if (this.field1103 != null) {
            for (int var6 = 0; var6 < this.field1103.length; var6++) {
                var4.method2078(this.field1103[var6], this.field1108[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.t(II)Lda;")
    public final class105 method1039(int arg0) {
        if (this.field1128 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1129[var3] && this.field1129[var3] != 0) {
                    var2 = this.field1128[var3];
                }
            }
            if (var2 != -1) {
                return method154(var2).method1039(1);
            }
        }
        class105 var4 = (class105) field1137.method3543((long) this.field1098);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2063(Statics.field1092, this.field1099, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1107 != 128 || this.field1133 != 128 || this.field1134 != 128) {
            var5.method2080(this.field1107, this.field1133, this.field1134);
        }
        if (this.field1101 != null) {
            for (int var6 = 0; var6 < this.field1101.length; var6++) {
                var5.method2143(this.field1101[var6], this.field1102[var6]);
            }
        }
        if (this.field1103 != null) {
            for (int var7 = 0; var7 < this.field1103.length; var7++) {
                var5.method2078(this.field1103[var7], this.field1108[var7]);
            }
        }
        class105 var8 = var5.method2092(this.field1135 + 64, this.field1136 + 768, -50, -10, -50);
        var8.field1822 = true;
        field1137.method3540(var8, (long) this.field1098);
        return var8;
    }

    @ObfuscatedName("an.k(II)Lan;")
    public class52 method1040(int arg0) {
        if (this.field1128 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1129[var3] && this.field1129[var3] != 0) {
                    var2 = this.field1128[var3];
                }
            }
            if (var2 != -1) {
                return method154(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dj.s(IIIIIZB)Lcq;")
    public static final class79 method2693(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1096.method3543(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method154(arg0);
        if (arg1 > 1 && var9.field1128 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1129[var11] && var9.field1129[var11] != 0) {
                    var10 = var9.field1128[var11];
                }
            }
            if (var10 != -1) {
                var9 = method154(var10);
            }
        }
        class105 var12 = var9.method1039(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1115 != -1) {
            var13 = method2693(var9.field1105, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1126 != -1) {
            var13 = method2693(var9.field1139, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1407;
        int var15 = Statics.field1402;
        int var16 = Statics.field1405;
        int[] var17 = new int[4];
        class80.method1735(var17);
        class79 var18 = new class79(36, 32);
        class80.method1691(var18.field1395, 36, 32);
        class80.method1725();
        class91.method1964();
        class91.method1967(16, 16);
        class91.field1573 = false;
        int var19 = var9.field1130;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1572[var9.field1106] * var19 >> 16;
        int var21 = class91.field1574[var9.field1106] * var19 >> 16;
        var12.method2179();
        var12.method2222(0, var9.field1104, var9.field1090, var9.field1106, var9.field1140, var9.field1131 + var12.field1442 / 2 + var20, var9.field1131 + var21);
        if (var9.field1126 != -1) {
            var13.method1607(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1650(1);
        }
        if (arg2 >= 2) {
            var18.method1650(16777215);
        }
        if (arg3 != 0) {
            var18.method1667(arg3);
        }
        class80.method1691(var18.field1395, 36, 32);
        if (var9.field1115 != -1) {
            var13.method1607(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1111 == 1) {
            class224 var22 = Statics.field1114;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2407 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2460 + "</col>";
            }
            var22.method3809(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1096.method3540(var18, var6);
        }
        class80.method1691(var14, var15, var16);
        class80.method1705(var17);
        class91.method1964();
        class91.field1573 = true;
        return var18;
    }

    @ObfuscatedName("an.w(ZI)Z")
    public final boolean method1041(boolean arg0) {
        int var2 = this.field1116;
        int var3 = this.field1097;
        int var4 = this.field1122;
        if (arg0) {
            var2 = this.field1119;
            var3 = this.field1120;
            var4 = this.field1095;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1092.method3086(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1092.method3086(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1092.method3086(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.e(ZI)Lcy;")
    public final class100 method1042(boolean arg0) {
        int var2 = this.field1116;
        int var3 = this.field1097;
        int var4 = this.field1122;
        if (arg0) {
            var2 = this.field1119;
            var3 = this.field1120;
            var4 = this.field1095;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2063(Statics.field1092, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2063(Statics.field1092, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2063(Statics.field1092, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1118 != 0) {
            var5.method2084(0, this.field1118, 0);
        }
        if (arg0 && this.field1121 != 0) {
            var5.method2084(0, this.field1121, 0);
        }
        if (this.field1101 != null) {
            for (int var10 = 0; var10 < this.field1101.length; var10++) {
                var5.method2143(this.field1101[var10], this.field1102[var10]);
            }
        }
        if (this.field1103 != null) {
            for (int var11 = 0; var11 < this.field1103.length; var11++) {
                var5.method2078(this.field1103[var11], this.field1108[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.z(ZB)Z")
    public final boolean method1043(boolean arg0) {
        int var2 = this.field1124;
        int var3 = this.field1132;
        if (arg0) {
            var2 = this.field1110;
            var3 = this.field1127;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1092.method3086(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1092.method3086(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.p(ZI)Lcy;")
    public final class100 method1062(boolean arg0) {
        int var2 = this.field1124;
        int var3 = this.field1132;
        if (arg0) {
            var2 = this.field1110;
            var3 = this.field1127;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2063(Statics.field1092, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2063(Statics.field1092, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1101 != null) {
            for (int var7 = 0; var7 < this.field1101.length; var7++) {
                var4.method2143(this.field1101[var7], this.field1102[var7]);
            }
        }
        if (this.field1103 != null) {
            for (int var8 = 0; var8 < this.field1103.length; var8++) {
                var4.method2078(this.field1103[var8], this.field1108[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("q.r(B)V")
    public static void method584() {
        field1094.method3541();
        field1137.method3541();
        field1096.method3541();
    }
}
