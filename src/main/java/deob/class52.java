package deob;

@ObfuscatedName("at")
public class class52 extends class204 {

    @ObfuscatedName("at.q")
    public static class193 field1129 = new class193(64);

    @ObfuscatedName("at.m")
    public static class193 field1114 = new class193(50);

    @ObfuscatedName("at.n")
    public static class193 field1115 = new class193(200);

    @ObfuscatedName("at.o")
    public int field1116;

    @ObfuscatedName("at.f")
    public int field1138;

    @ObfuscatedName("at.s")
    public String field1118 = "null";

    @ObfuscatedName("at.z")
    public short[] field1117;

    @ObfuscatedName("at.b")
    public short[] field1109;

    @ObfuscatedName("at.p")
    public short[] field1140;

    @ObfuscatedName("at.r")
    public short[] field1122;

    @ObfuscatedName("at.x")
    public int field1123 = 2000;

    @ObfuscatedName("at.h")
    public int field1150 = 0;

    @ObfuscatedName("at.j")
    public int field1113 = 0;

    @ObfuscatedName("at.v")
    public int field1126 = 0;

    @ObfuscatedName("at.l")
    public int field1127 = 0;

    @ObfuscatedName("at.u")
    public int field1119 = 0;

    @ObfuscatedName("at.t")
    public int field1149 = 0;

    @ObfuscatedName("at.i")
    public int field1130 = 1;

    @ObfuscatedName("at.ah")
    public boolean field1131 = false;

    @ObfuscatedName("at.aa")
    public String[] field1132 = new String[] { null, null, class157.field2535, null, null };

    @ObfuscatedName("at.ao")
    public String[] field1133 = new String[] { null, null, null, null, class157.field2294 };

    @ObfuscatedName("at.ai")
    public int field1134 = -1;

    @ObfuscatedName("at.ab")
    public int field1135 = -1;

    @ObfuscatedName("at.ae")
    public int field1136 = 0;

    @ObfuscatedName("at.aw")
    public int field1137 = -1;

    @ObfuscatedName("at.aj")
    public int field1112 = -1;

    @ObfuscatedName("at.ay")
    public int field1139 = 0;

    @ObfuscatedName("at.af")
    public int field1157 = -1;

    @ObfuscatedName("at.al")
    public int field1154 = -1;

    @ObfuscatedName("at.aq")
    public int field1142 = -1;

    @ObfuscatedName("at.ak")
    public int field1120 = -1;

    @ObfuscatedName("at.az")
    public int field1144 = -1;

    @ObfuscatedName("at.ar")
    public int field1145 = -1;

    @ObfuscatedName("at.as")
    public int[] field1146;

    @ObfuscatedName("at.am")
    public int[] field1147;

    @ObfuscatedName("at.an")
    public int field1148 = -1;

    @ObfuscatedName("at.au")
    public int field1121 = -1;

    @ObfuscatedName("at.av")
    public int field1128 = 128;

    @ObfuscatedName("at.ac")
    public int field1151 = 128;

    @ObfuscatedName("at.ap")
    public int field1152 = 128;

    @ObfuscatedName("at.ad")
    public int field1153 = 0;

    @ObfuscatedName("at.ag")
    public int field1156 = 0;

    @ObfuscatedName("at.ax")
    public int field1155 = 0;

    @ObfuscatedName("at.at")
    public boolean field1125 = false;

    @ObfuscatedName("at.bm")
    public int field1111 = -1;

    @ObfuscatedName("at.bd")
    public int field1158 = -1;

    @ObfuscatedName("w.y(Lfu;Lfu;ZLhi;I)V")
    public static void method43(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field3137 = arg0;
        Statics.field1622 = arg1;
        Statics.field2050 = arg2;
        Statics.field1143 = Statics.field3137.method3050(10);
        Statics.field3128 = arg3;
    }

    @ObfuscatedName("v.d(II)Lat;")
    public static class52 method560(int arg0) {
        class52 var1 = (class52) field1129.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3137.method3045(10, arg0);
        class52 var3 = new class52();
        var3.field1116 = arg0;
        if (var2 != null) {
            var3.method996(new class119(var2));
        }
        var3.method997();
        if (var3.field1121 != -1) {
            var3.method1000(method560(var3.field1121), method560(var3.field1148));
        }
        if (var3.field1158 != -1) {
            var3.method1035(method560(var3.field1158), method560(var3.field1111));
        }
        if (!Statics.field2050 && var3.field1131) {
            var3.field1118 = class157.field2420;
            var3.field1125 = false;
            var3.field1132 = null;
            var3.field1133 = null;
            var3.field1155 = 0;
        }
        field1129.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.g(I)V")
    public void method997() {
    }

    @ObfuscatedName("at.w(Ldd;B)V")
    public void method996(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method999(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldd;II)V")
    public void method999(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1138 = arg0.method2525();
        } else if (arg1 == 2) {
            this.field1118 = arg0.method2334();
        } else if (arg1 == 4) {
            this.field1123 = arg0.method2525();
        } else if (arg1 == 5) {
            this.field1150 = arg0.method2525();
        } else if (arg1 == 6) {
            this.field1113 = arg0.method2525();
        } else if (arg1 == 7) {
            this.field1127 = arg0.method2525();
            if (this.field1127 > 32767) {
                this.field1127 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1119 = arg0.method2525();
            if (this.field1119 > 32767) {
                this.field1119 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1149 = 1;
        } else if (arg1 == 12) {
            this.field1130 = arg0.method2331();
        } else if (arg1 == 16) {
            this.field1131 = true;
        } else if (arg1 == 23) {
            this.field1134 = arg0.method2525();
            this.field1136 = arg0.method2326();
        } else if (arg1 == 24) {
            this.field1135 = arg0.method2525();
        } else if (arg1 == 25) {
            this.field1137 = arg0.method2525();
            this.field1139 = arg0.method2326();
        } else if (arg1 == 26) {
            this.field1112 = arg0.method2525();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1132[arg1 - 30] = arg0.method2334();
            if (this.field1132[arg1 - 30].equalsIgnoreCase(class157.field2295)) {
                this.field1132[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1133[arg1 - 35] = arg0.method2334();
        } else if (arg1 == 40) {
            int var3 = arg0.method2326();
            this.field1117 = new short[var3];
            this.field1109 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1117[var4] = (short) arg0.method2525();
                this.field1109[var4] = (short) arg0.method2525();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2326();
            this.field1140 = new short[var5];
            this.field1122 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1140[var6] = (short) arg0.method2525();
                this.field1122[var6] = (short) arg0.method2525();
            }
        } else if (arg1 == 65) {
            this.field1125 = true;
        } else if (arg1 == 78) {
            this.field1157 = arg0.method2525();
        } else if (arg1 == 79) {
            this.field1154 = arg0.method2525();
        } else if (arg1 == 90) {
            this.field1142 = arg0.method2525();
        } else if (arg1 == 91) {
            this.field1144 = arg0.method2525();
        } else if (arg1 == 92) {
            this.field1120 = arg0.method2525();
        } else if (arg1 == 93) {
            this.field1145 = arg0.method2525();
        } else if (arg1 == 95) {
            this.field1126 = arg0.method2525();
        } else if (arg1 == 97) {
            this.field1148 = arg0.method2525();
        } else if (arg1 == 98) {
            this.field1121 = arg0.method2525();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1146 == null) {
                this.field1146 = new int[10];
                this.field1147 = new int[10];
            }
            this.field1146[arg1 - 100] = arg0.method2525();
            this.field1147[arg1 - 100] = arg0.method2525();
        } else if (arg1 == 110) {
            this.field1128 = arg0.method2525();
        } else if (arg1 == 111) {
            this.field1151 = arg0.method2525();
        } else if (arg1 == 112) {
            this.field1152 = arg0.method2525();
        } else if (arg1 == 113) {
            this.field1153 = arg0.method2461();
        } else if (arg1 == 114) {
            this.field1156 = arg0.method2461() * 5;
        } else if (arg1 == 115) {
            this.field1155 = arg0.method2326();
        } else if (arg1 == 139) {
            this.field1111 = arg0.method2525();
        } else if (arg1 == 140) {
            this.field1158 = arg0.method2525();
        }
    }

    @ObfuscatedName("at.c(Lat;Lat;B)V")
    public void method1000(class52 arg0, class52 arg1) {
        this.field1138 = arg0.field1138;
        this.field1123 = arg0.field1123;
        this.field1150 = arg0.field1150;
        this.field1113 = arg0.field1113;
        this.field1126 = arg0.field1126;
        this.field1127 = arg0.field1127;
        this.field1119 = arg0.field1119;
        this.field1117 = arg0.field1117;
        this.field1109 = arg0.field1109;
        this.field1140 = arg0.field1140;
        this.field1122 = arg0.field1122;
        this.field1118 = arg1.field1118;
        this.field1131 = arg1.field1131;
        this.field1130 = arg1.field1130;
        this.field1149 = 1;
    }

    @ObfuscatedName("at.a(Lat;Lat;I)V")
    public void method1035(class52 arg0, class52 arg1) {
        this.field1138 = arg0.field1138;
        this.field1123 = arg0.field1123;
        this.field1150 = arg0.field1150;
        this.field1113 = arg0.field1113;
        this.field1126 = arg0.field1126;
        this.field1127 = arg0.field1127;
        this.field1119 = arg0.field1119;
        this.field1117 = arg1.field1117;
        this.field1109 = arg1.field1109;
        this.field1140 = arg1.field1140;
        this.field1122 = arg1.field1122;
        this.field1118 = arg1.field1118;
        this.field1131 = arg1.field1131;
        this.field1149 = arg1.field1149;
        this.field1134 = arg1.field1134;
        this.field1135 = arg1.field1135;
        this.field1157 = arg1.field1157;
        this.field1137 = arg1.field1137;
        this.field1112 = arg1.field1112;
        this.field1154 = arg1.field1154;
        this.field1142 = arg1.field1142;
        this.field1120 = arg1.field1120;
        this.field1144 = arg1.field1144;
        this.field1145 = arg1.field1145;
        this.field1155 = arg1.field1155;
        this.field1132 = arg1.field1132;
        this.field1133 = new String[5];
        if (arg1.field1133 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1133[var3] = arg1.field1133[var3];
            }
        }
        this.field1133[4] = class157.field2299;
        this.field1130 = 0;
    }

    @ObfuscatedName("at.q(II)Lcl;")
    public final class100 method1002(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1147[var3] && this.field1147[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method560(var2).method1002(1);
            }
        }
        class100 var4 = class100.method2031(Statics.field1622, this.field1138, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1128 != 128 || this.field1151 != 128 || this.field1152 != 128) {
            var4.method2046(this.field1128, this.field1151, this.field1152);
        }
        if (this.field1117 != null) {
            for (int var5 = 0; var5 < this.field1117.length; var5++) {
                var4.method2089(this.field1117[var5], this.field1109[var5]);
            }
        }
        if (this.field1140 != null) {
            for (int var6 = 0; var6 < this.field1140.length; var6++) {
                var4.method2044(this.field1140[var6], this.field1122[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("at.m(IB)Ldg;")
    public final class105 method1003(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1147[var3] && this.field1147[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method560(var2).method1003(1);
            }
        }
        class105 var4 = (class105) field1114.method3425((long) this.field1116);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2031(Statics.field1622, this.field1138, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1128 != 128 || this.field1151 != 128 || this.field1152 != 128) {
            var5.method2046(this.field1128, this.field1151, this.field1152);
        }
        if (this.field1117 != null) {
            for (int var6 = 0; var6 < this.field1117.length; var6++) {
                var5.method2089(this.field1117[var6], this.field1109[var6]);
            }
        }
        if (this.field1140 != null) {
            for (int var7 = 0; var7 < this.field1140.length; var7++) {
                var5.method2044(this.field1140[var7], this.field1122[var7]);
            }
        }
        class105 var8 = var5.method2051(this.field1153 + 64, this.field1156 + 768, -50, -10, -50);
        var8.field1814 = true;
        field1114.method3427(var8, (long) this.field1116);
        return var8;
    }

    @ObfuscatedName("at.n(IB)Lat;")
    public class52 method1004(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1147[var3] && this.field1147[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method560(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("di.k(IIIIIZB)Lcy;")
    public static final class79 method2629(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1115.method3425(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method560(arg0);
        if (arg1 > 1 && var9.field1146 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1147[var11] && var9.field1147[var11] != 0) {
                    var10 = var9.field1146[var11];
                }
            }
            if (var10 != -1) {
                var9 = method560(var10);
            }
        }
        class105 var12 = var9.method1003(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1121 != -1) {
            var13 = method2629(var9.field1148, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1158 != -1) {
            var13 = method2629(var9.field1111, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1417;
        int var15 = Statics.field1414;
        int var16 = Statics.field1415;
        int[] var17 = new int[4];
        class80.method1666(var17);
        class79 var18 = new class79(36, 32);
        class80.method1662(var18.field1408, 36, 32);
        class80.method1698();
        class91.method1960();
        class91.method1934(16, 16);
        class91.field1564 = false;
        int var19 = var9.field1123;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1566[var9.field1150] * var19 >> 16;
        int var21 = class91.field1585[var9.field1150] * var19 >> 16;
        var12.method2177();
        var12.method2196(0, var9.field1113, var9.field1126, var9.field1150, var9.field1127, var9.field1119 + var12.field1450 / 2 + var20, var9.field1119 + var21);
        if (var9.field1158 != -1) {
            var13.method1622(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1581(1);
        }
        if (arg2 >= 2) {
            var18.method1581(16777215);
        }
        if (arg3 != 0) {
            var18.method1582(arg3);
        }
        class80.method1662(var18.field1408, 36, 32);
        if (var9.field1121 != -1) {
            var13.method1622(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1149 == 1) {
            Statics.field3128.method3702(method670(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1115.method3427(var18, var6);
        }
        class80.method1662(var14, var15, var16);
        class80.method1667(var17);
        class91.method1960();
        class91.field1564 = true;
        return var18;
    }

    @ObfuscatedName("ae.o(II)Ljava/lang/String;")
    public static final String method670(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2457 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2455 + "</col>";
        }
    }

    @ObfuscatedName("at.f(ZI)Z")
    public final boolean method1005(boolean arg0) {
        int var2 = this.field1134;
        int var3 = this.field1135;
        int var4 = this.field1157;
        if (arg0) {
            var2 = this.field1137;
            var3 = this.field1112;
            var4 = this.field1154;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1622.method2998(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1622.method2998(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1622.method2998(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("at.s(ZI)Lcl;")
    public final class100 method1006(boolean arg0) {
        int var2 = this.field1134;
        int var3 = this.field1135;
        int var4 = this.field1157;
        if (arg0) {
            var2 = this.field1137;
            var3 = this.field1112;
            var4 = this.field1154;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2031(Statics.field1622, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2031(Statics.field1622, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2031(Statics.field1622, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1136 != 0) {
            var5.method2042(0, this.field1136, 0);
        }
        if (arg0 && this.field1139 != 0) {
            var5.method2042(0, this.field1139, 0);
        }
        if (this.field1117 != null) {
            for (int var10 = 0; var10 < this.field1117.length; var10++) {
                var5.method2089(this.field1117[var10], this.field1109[var10]);
            }
        }
        if (this.field1140 != null) {
            for (int var11 = 0; var11 < this.field1140.length; var11++) {
                var5.method2044(this.field1140[var11], this.field1122[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("at.z(ZI)Z")
    public final boolean method1007(boolean arg0) {
        int var2 = this.field1142;
        int var3 = this.field1120;
        if (arg0) {
            var2 = this.field1144;
            var3 = this.field1145;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1622.method2998(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1622.method2998(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("at.b(ZB)Lcl;")
    public final class100 method1008(boolean arg0) {
        int var2 = this.field1142;
        int var3 = this.field1120;
        if (arg0) {
            var2 = this.field1144;
            var3 = this.field1145;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2031(Statics.field1622, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2031(Statics.field1622, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1117 != null) {
            for (int var7 = 0; var7 < this.field1117.length; var7++) {
                var4.method2089(this.field1117[var7], this.field1109[var7]);
            }
        }
        if (this.field1140 != null) {
            for (int var8 = 0; var8 < this.field1140.length; var8++) {
                var4.method2044(this.field1140[var8], this.field1122[var8]);
            }
        }
        return var4;
    }
}
