package deob;

@ObfuscatedName("at")
public class class52 extends class204 {

    @ObfuscatedName("at.a")
    public static class193 field1113 = new class193(64);

    @ObfuscatedName("at.e")
    public static class193 field1114 = new class193(50);

    @ObfuscatedName("at.b")
    public static class193 field1133 = new class193(200);

    @ObfuscatedName("at.m")
    public int field1116;

    @ObfuscatedName("at.x")
    public int field1145;

    @ObfuscatedName("at.k")
    public String field1118 = "null";

    @ObfuscatedName("at.n")
    public short[] field1119;

    @ObfuscatedName("at.j")
    public short[] field1120;

    @ObfuscatedName("at.t")
    public short[] field1121;

    @ObfuscatedName("at.z")
    public short[] field1117;

    @ObfuscatedName("at.h")
    public int field1153 = 2000;

    @ObfuscatedName("at.i")
    public int field1124 = 0;

    @ObfuscatedName("at.q")
    public int field1125 = 0;

    @ObfuscatedName("at.r")
    public int field1150 = 0;

    @ObfuscatedName("at.s")
    public int field1159 = 0;

    @ObfuscatedName("at.g")
    public int field1128 = 0;

    @ObfuscatedName("at.f")
    public int field1129 = 0;

    @ObfuscatedName("at.c")
    public int field1122 = 1;

    @ObfuscatedName("at.ae")
    public boolean field1131 = false;

    @ObfuscatedName("at.ao")
    public String[] field1148 = new String[] { null, null, class157.field2521, null, null };

    @ObfuscatedName("at.ak")
    public String[] field1144 = new String[] { null, null, null, null, class157.field2281 };

    @ObfuscatedName("at.ah")
    public int field1157 = -1;

    @ObfuscatedName("at.al")
    public int field1115 = -1;

    @ObfuscatedName("at.ax")
    public int field1136 = 0;

    @ObfuscatedName("at.az")
    public int field1112 = -1;

    @ObfuscatedName("at.ad")
    public int field1126 = -1;

    @ObfuscatedName("at.aw")
    public int field1139 = 0;

    @ObfuscatedName("at.as")
    public int field1140 = -1;

    @ObfuscatedName("at.ai")
    public int field1141 = -1;

    @ObfuscatedName("at.aj")
    public int field1142 = -1;

    @ObfuscatedName("at.ap")
    public int field1143 = -1;

    @ObfuscatedName("at.ar")
    public int field1160 = -1;

    @ObfuscatedName("at.ac")
    public int field1134 = -1;

    @ObfuscatedName("at.aq")
    public int[] field1146;

    @ObfuscatedName("at.af")
    public int[] field1147;

    @ObfuscatedName("at.aa")
    public int field1156 = -1;

    @ObfuscatedName("at.ab")
    public int field1149 = -1;

    @ObfuscatedName("at.av")
    public int field1127 = 128;

    @ObfuscatedName("at.au")
    public int field1151 = 128;

    @ObfuscatedName("at.ay")
    public int field1152 = 128;

    @ObfuscatedName("at.ag")
    public int field1130 = 0;

    @ObfuscatedName("at.an")
    public int field1154 = 0;

    @ObfuscatedName("at.am")
    public int field1155 = 0;

    @ObfuscatedName("at.at")
    public boolean field1137 = false;

    @ObfuscatedName("at.bi")
    public int field1138 = -1;

    @ObfuscatedName("at.bl")
    public int field1158 = -1;

    @ObfuscatedName("z.d(IB)Lat;")
    public static class52 method193(int arg0) {
        class52 var1 = (class52) field1113.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1135.method3134(10, arg0);
        class52 var3 = new class52();
        var3.field1116 = arg0;
        if (var2 != null) {
            var3.method1015(new class119(var2));
        }
        var3.method1014();
        if (var3.field1149 != -1) {
            var3.method1063(method193(var3.field1149), method193(var3.field1156));
        }
        if (var3.field1158 != -1) {
            var3.method1027(method193(var3.field1158), method193(var3.field1138));
        }
        if (!Statics.field2890 && var3.field1131) {
            var3.field1118 = class157.field2393;
            var3.field1137 = false;
            var3.field1148 = null;
            var3.field1144 = null;
            var3.field1155 = 0;
        }
        field1113.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.p(I)V")
    public void method1014() {
    }

    @ObfuscatedName("at.v(Ldf;B)V")
    public void method1015(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method1032(arg0, var2);
        }
    }

    @ObfuscatedName("at.l(Ldf;IS)V")
    public void method1032(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1145 = arg0.method2359();
        } else if (arg1 == 2) {
            this.field1118 = arg0.method2365();
        } else if (arg1 == 4) {
            this.field1153 = arg0.method2359();
        } else if (arg1 == 5) {
            this.field1124 = arg0.method2359();
        } else if (arg1 == 6) {
            this.field1125 = arg0.method2359();
        } else if (arg1 == 7) {
            this.field1159 = arg0.method2359();
            if (this.field1159 > 32767) {
                this.field1159 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1128 = arg0.method2359();
            if (this.field1128 > 32767) {
                this.field1128 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1129 = 1;
        } else if (arg1 == 12) {
            this.field1122 = arg0.method2362();
        } else if (arg1 == 16) {
            this.field1131 = true;
        } else if (arg1 == 23) {
            this.field1157 = arg0.method2359();
            this.field1136 = arg0.method2357();
        } else if (arg1 == 24) {
            this.field1115 = arg0.method2359();
        } else if (arg1 == 25) {
            this.field1112 = arg0.method2359();
            this.field1139 = arg0.method2357();
        } else if (arg1 == 26) {
            this.field1126 = arg0.method2359();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1148[arg1 - 30] = arg0.method2365();
            if (this.field1148[arg1 - 30].equalsIgnoreCase(class157.field2282)) {
                this.field1148[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1144[arg1 - 35] = arg0.method2365();
        } else if (arg1 == 40) {
            int var3 = arg0.method2357();
            this.field1119 = new short[var3];
            this.field1120 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1119[var4] = (short) arg0.method2359();
                this.field1120[var4] = (short) arg0.method2359();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2357();
            this.field1121 = new short[var5];
            this.field1117 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1121[var6] = (short) arg0.method2359();
                this.field1117[var6] = (short) arg0.method2359();
            }
        } else if (arg1 == 65) {
            this.field1137 = true;
        } else if (arg1 == 78) {
            this.field1140 = arg0.method2359();
        } else if (arg1 == 79) {
            this.field1141 = arg0.method2359();
        } else if (arg1 == 90) {
            this.field1142 = arg0.method2359();
        } else if (arg1 == 91) {
            this.field1160 = arg0.method2359();
        } else if (arg1 == 92) {
            this.field1143 = arg0.method2359();
        } else if (arg1 == 93) {
            this.field1134 = arg0.method2359();
        } else if (arg1 == 95) {
            this.field1150 = arg0.method2359();
        } else if (arg1 == 97) {
            this.field1156 = arg0.method2359();
        } else if (arg1 == 98) {
            this.field1149 = arg0.method2359();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1146 == null) {
                this.field1146 = new int[10];
                this.field1147 = new int[10];
            }
            this.field1146[arg1 - 100] = arg0.method2359();
            this.field1147[arg1 - 100] = arg0.method2359();
        } else if (arg1 == 110) {
            this.field1127 = arg0.method2359();
        } else if (arg1 == 111) {
            this.field1151 = arg0.method2359();
        } else if (arg1 == 112) {
            this.field1152 = arg0.method2359();
        } else if (arg1 == 113) {
            this.field1130 = arg0.method2477();
        } else if (arg1 == 114) {
            this.field1154 = arg0.method2477() * 5;
        } else if (arg1 == 115) {
            this.field1155 = arg0.method2357();
        } else if (arg1 == 139) {
            this.field1138 = arg0.method2359();
        } else if (arg1 == 140) {
            this.field1158 = arg0.method2359();
        }
    }

    @ObfuscatedName("at.y(Lat;Lat;I)V")
    public void method1063(class52 arg0, class52 arg1) {
        this.field1145 = arg0.field1145;
        this.field1153 = arg0.field1153;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1150 = arg0.field1150;
        this.field1159 = arg0.field1159;
        this.field1128 = arg0.field1128;
        this.field1119 = arg0.field1119;
        this.field1120 = arg0.field1120;
        this.field1121 = arg0.field1121;
        this.field1117 = arg0.field1117;
        this.field1118 = arg1.field1118;
        this.field1131 = arg1.field1131;
        this.field1122 = arg1.field1122;
        this.field1129 = 1;
    }

    @ObfuscatedName("at.w(Lat;Lat;I)V")
    public void method1027(class52 arg0, class52 arg1) {
        this.field1145 = arg0.field1145;
        this.field1153 = arg0.field1153;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1150 = arg0.field1150;
        this.field1159 = arg0.field1159;
        this.field1128 = arg0.field1128;
        this.field1119 = arg1.field1119;
        this.field1120 = arg1.field1120;
        this.field1121 = arg1.field1121;
        this.field1117 = arg1.field1117;
        this.field1118 = arg1.field1118;
        this.field1131 = arg1.field1131;
        this.field1129 = arg1.field1129;
        this.field1157 = arg1.field1157;
        this.field1115 = arg1.field1115;
        this.field1140 = arg1.field1140;
        this.field1112 = arg1.field1112;
        this.field1126 = arg1.field1126;
        this.field1141 = arg1.field1141;
        this.field1142 = arg1.field1142;
        this.field1143 = arg1.field1143;
        this.field1160 = arg1.field1160;
        this.field1134 = arg1.field1134;
        this.field1155 = arg1.field1155;
        this.field1148 = arg1.field1148;
        this.field1144 = new String[5];
        if (arg1.field1144 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1144[var3] = arg1.field1144[var3];
            }
        }
        this.field1144[4] = class157.field2403;
        this.field1122 = 0;
    }

    @ObfuscatedName("at.u(II)Lca;")
    public final class100 method1018(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1147[var3] && this.field1147[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method193(var2).method1018(1);
            }
        }
        class100 var4 = class100.method2064(Statics.field1953, this.field1145, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1127 != 128 || this.field1151 != 128 || this.field1152 != 128) {
            var4.method2078(this.field1127, this.field1151, this.field1152);
        }
        if (this.field1119 != null) {
            for (int var5 = 0; var5 < this.field1119.length; var5++) {
                var4.method2075(this.field1119[var5], this.field1120[var5]);
            }
        }
        if (this.field1121 != null) {
            for (int var6 = 0; var6 < this.field1121.length; var6++) {
                var4.method2076(this.field1121[var6], this.field1117[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("at.a(II)Ldn;")
    public final class105 method1020(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1147[var3] && this.field1147[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method193(var2).method1020(1);
            }
        }
        class105 var4 = (class105) field1114.method3553((long) this.field1116);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2064(Statics.field1953, this.field1145, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1127 != 128 || this.field1151 != 128 || this.field1152 != 128) {
            var5.method2078(this.field1127, this.field1151, this.field1152);
        }
        if (this.field1119 != null) {
            for (int var6 = 0; var6 < this.field1119.length; var6++) {
                var5.method2075(this.field1119[var6], this.field1120[var6]);
            }
        }
        if (this.field1121 != null) {
            for (int var7 = 0; var7 < this.field1121.length; var7++) {
                var5.method2076(this.field1121[var7], this.field1117[var7]);
            }
        }
        class105 var8 = var5.method2083(this.field1130 + 64, this.field1154 + 768, -50, -10, -50);
        var8.field1815 = true;
        field1114.method3554(var8, (long) this.field1116);
        return var8;
    }

    @ObfuscatedName("at.e(IB)Lat;")
    public class52 method1021(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1147[var3] && this.field1147[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method193(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ch.b(IIIIIZI)Lco;")
    public static final class79 method1767(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1133.method3553(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method193(arg0);
        if (arg1 > 1 && var9.field1146 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1147[var11] && var9.field1147[var11] != 0) {
                    var10 = var9.field1146[var11];
                }
            }
            if (var10 != -1) {
                var9 = method193(var10);
            }
        }
        class105 var12 = var9.method1020(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1149 != -1) {
            var13 = method1767(var9.field1156, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1158 != -1) {
            var13 = method1767(var9.field1138, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1411;
        int var15 = Statics.field1415;
        int var16 = Statics.field1410;
        int[] var17 = new int[4];
        class80.method1679(var17);
        class79 var18 = new class79(36, 32);
        class80.method1675(var18.field1408, 36, 32);
        class80.method1729();
        class91.method1961();
        class91.method1964(16, 16);
        class91.field1560 = false;
        int var19 = var9.field1153;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1570[var9.field1124] * var19 >> 16;
        int var21 = class91.field1575[var9.field1124] * var19 >> 16;
        var12.method2157();
        var12.method2183(0, var9.field1125, var9.field1150, var9.field1124, var9.field1159, var9.field1128 + var12.field1448 / 2 + var20, var9.field1128 + var21);
        if (var9.field1158 != -1) {
            var13.method1598(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1605(1);
        }
        if (arg2 >= 2) {
            var18.method1605(16777215);
        }
        if (arg3 != 0) {
            var18.method1652(arg3);
        }
        class80.method1675(var18.field1408, 36, 32);
        if (var9.field1149 != -1) {
            var13.method1598(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1129 == 1) {
            Statics.field1546.method3848(method686(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1133.method3554(var18, var6);
        }
        class80.method1675(var14, var15, var16);
        class80.method1680(var17);
        class91.method1961();
        class91.field1560 = true;
        return var18;
    }

    @ObfuscatedName("ad.o(IB)Ljava/lang/String;")
    public static final String method686(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2388 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2442 + "</col>";
        }
    }

    @ObfuscatedName("at.m(ZI)Z")
    public final boolean method1022(boolean arg0) {
        int var2 = this.field1157;
        int var3 = this.field1115;
        int var4 = this.field1140;
        if (arg0) {
            var2 = this.field1112;
            var3 = this.field1126;
            var4 = this.field1141;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1953.method3113(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1953.method3113(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1953.method3113(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("at.x(ZI)Lca;")
    public final class100 method1023(boolean arg0) {
        int var2 = this.field1157;
        int var3 = this.field1115;
        int var4 = this.field1140;
        if (arg0) {
            var2 = this.field1112;
            var3 = this.field1126;
            var4 = this.field1141;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2064(Statics.field1953, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2064(Statics.field1953, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2064(Statics.field1953, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1136 != 0) {
            var5.method2074(0, this.field1136, 0);
        }
        if (arg0 && this.field1139 != 0) {
            var5.method2074(0, this.field1139, 0);
        }
        if (this.field1119 != null) {
            for (int var10 = 0; var10 < this.field1119.length; var10++) {
                var5.method2075(this.field1119[var10], this.field1120[var10]);
            }
        }
        if (this.field1121 != null) {
            for (int var11 = 0; var11 < this.field1121.length; var11++) {
                var5.method2076(this.field1121[var11], this.field1117[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("at.k(ZI)Z")
    public final boolean method1024(boolean arg0) {
        int var2 = this.field1142;
        int var3 = this.field1143;
        if (arg0) {
            var2 = this.field1160;
            var3 = this.field1134;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1953.method3113(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1953.method3113(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("at.n(ZI)Lca;")
    public final class100 method1051(boolean arg0) {
        int var2 = this.field1142;
        int var3 = this.field1143;
        if (arg0) {
            var2 = this.field1160;
            var3 = this.field1134;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2064(Statics.field1953, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2064(Statics.field1953, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1119 != null) {
            for (int var7 = 0; var7 < this.field1119.length; var7++) {
                var4.method2075(this.field1119[var7], this.field1120[var7]);
            }
        }
        if (this.field1121 != null) {
            for (int var8 = 0; var8 < this.field1121.length; var8++) {
                var4.method2076(this.field1121[var8], this.field1117[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.j(I)V")
    public static void method706() {
        field1133.method3556();
    }
}
