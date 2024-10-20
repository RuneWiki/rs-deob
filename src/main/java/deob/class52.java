package deob;

@ObfuscatedName("ad")
public class class52 extends class204 {

    @ObfuscatedName("ad.r")
    public static class193 field1113 = new class193(64);

    @ObfuscatedName("ad.k")
    public static class193 field1160 = new class193(50);

    @ObfuscatedName("ad.d")
    public static class193 field1115 = new class193(200);

    @ObfuscatedName("ad.z")
    public int field1116;

    @ObfuscatedName("ad.c")
    public int field1122;

    @ObfuscatedName("ad.b")
    public String field1137 = "null";

    @ObfuscatedName("ad.w")
    public short[] field1119;

    @ObfuscatedName("ad.g")
    public short[] field1147;

    @ObfuscatedName("ad.x")
    public short[] field1121;

    @ObfuscatedName("ad.o")
    public short[] field1142;

    @ObfuscatedName("ad.l")
    public int field1123 = 2000;

    @ObfuscatedName("ad.j")
    public int field1124 = 0;

    @ObfuscatedName("ad.m")
    public int field1125 = 0;

    @ObfuscatedName("ad.e")
    public int field1118 = 0;

    @ObfuscatedName("ad.u")
    public int field1154 = 0;

    @ObfuscatedName("ad.y")
    public int field1128 = 0;

    @ObfuscatedName("ad.t")
    public int field1129 = 0;

    @ObfuscatedName("ad.q")
    public int field1117 = 1;

    @ObfuscatedName("ad.ak")
    public boolean field1131 = false;

    @ObfuscatedName("ad.ap")
    public String[] field1108 = new String[] { null, null, class157.field2308, null, null };

    @ObfuscatedName("ad.al")
    public String[] field1133 = new String[] { null, null, null, null, class157.field2309 };

    @ObfuscatedName("ad.ab")
    public int field1134 = -1;

    @ObfuscatedName("ad.at")
    public int field1110 = -1;

    @ObfuscatedName("ad.au")
    public int field1136 = 0;

    @ObfuscatedName("ad.ae")
    public int field1161 = -1;

    @ObfuscatedName("ad.ax")
    public int field1138 = -1;

    @ObfuscatedName("ad.aq")
    public int field1139 = 0;

    @ObfuscatedName("ad.az")
    public int field1140 = -1;

    @ObfuscatedName("ad.ac")
    public int field1141 = -1;

    @ObfuscatedName("ad.ai")
    public int field1120 = -1;

    @ObfuscatedName("ad.ay")
    public int field1143 = -1;

    @ObfuscatedName("ad.aj")
    public int field1144 = -1;

    @ObfuscatedName("ad.af")
    public int field1145 = -1;

    @ObfuscatedName("ad.ar")
    public int[] field1146;

    @ObfuscatedName("ad.ag")
    public int[] field1132;

    @ObfuscatedName("ad.ah")
    public int field1148 = -1;

    @ObfuscatedName("ad.am")
    public int field1149 = -1;

    @ObfuscatedName("ad.aa")
    public int field1150 = 128;

    @ObfuscatedName("ad.aw")
    public int field1151 = 128;

    @ObfuscatedName("ad.an")
    public int field1152 = 128;

    @ObfuscatedName("ad.as")
    public int field1153 = 0;

    @ObfuscatedName("ad.av")
    public int field1126 = 0;

    @ObfuscatedName("ad.ao")
    public int field1155 = 0;

    @ObfuscatedName("ad.ad")
    public boolean field1114 = false;

    @ObfuscatedName("ad.bi")
    public int field1157 = -1;

    @ObfuscatedName("ad.bb")
    public int field1159 = -1;

    @ObfuscatedName("bt.i(Lfn;Lfn;ZLhw;I)V")
    public static void method1511(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1111 = arg0;
        Statics.field1112 = arg1;
        Statics.field1860 = arg2;
        Statics.field788 = Statics.field1111.method3078(10);
        Statics.field2902 = arg3;
    }

    @ObfuscatedName("dx.v(II)Lad;")
    public static class52 method2618(int arg0) {
        class52 var1 = (class52) field1113.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1111.method3080(10, arg0);
        class52 var3 = new class52();
        var3.field1116 = arg0;
        if (var2 != null) {
            var3.method995(new class119(var2));
        }
        var3.method996();
        if (var3.field1149 != -1) {
            var3.method992(method2618(var3.field1149), method2618(var3.field1148));
        }
        if (var3.field1159 != -1) {
            var3.method989(method2618(var3.field1159), method2618(var3.field1157));
        }
        if (!Statics.field1860 && var3.field1131) {
            var3.field1137 = class157.field2580;
            var3.field1114 = false;
            var3.field1108 = null;
            var3.field1133 = null;
            var3.field1155 = 0;
        }
        field1113.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.f(B)V")
    public void method996() {
    }

    @ObfuscatedName("ad.h(Ldj;I)V")
    public void method995(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method977(arg0, var2);
        }
    }

    @ObfuscatedName("ad.a(Ldj;IB)V")
    public void method977(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1122 = arg0.method2312();
        } else if (arg1 == 2) {
            this.field1137 = arg0.method2318();
        } else if (arg1 == 4) {
            this.field1123 = arg0.method2312();
        } else if (arg1 == 5) {
            this.field1124 = arg0.method2312();
        } else if (arg1 == 6) {
            this.field1125 = arg0.method2312();
        } else if (arg1 == 7) {
            this.field1154 = arg0.method2312();
            if (this.field1154 > 32767) {
                this.field1154 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1128 = arg0.method2312();
            if (this.field1128 > 32767) {
                this.field1128 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1129 = 1;
        } else if (arg1 == 12) {
            this.field1117 = arg0.method2315();
        } else if (arg1 == 16) {
            this.field1131 = true;
        } else if (arg1 == 23) {
            this.field1134 = arg0.method2312();
            this.field1136 = arg0.method2310();
        } else if (arg1 == 24) {
            this.field1110 = arg0.method2312();
        } else if (arg1 == 25) {
            this.field1161 = arg0.method2312();
            this.field1139 = arg0.method2310();
        } else if (arg1 == 26) {
            this.field1138 = arg0.method2312();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1108[arg1 - 30] = arg0.method2318();
            if (this.field1108[arg1 - 30].equalsIgnoreCase(class157.field2548)) {
                this.field1108[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1133[arg1 - 35] = arg0.method2318();
        } else if (arg1 == 40) {
            int var3 = arg0.method2310();
            this.field1119 = new short[var3];
            this.field1147 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1119[var4] = (short) arg0.method2312();
                this.field1147[var4] = (short) arg0.method2312();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2310();
            this.field1121 = new short[var5];
            this.field1142 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1121[var6] = (short) arg0.method2312();
                this.field1142[var6] = (short) arg0.method2312();
            }
        } else if (arg1 == 65) {
            this.field1114 = true;
        } else if (arg1 == 78) {
            this.field1140 = arg0.method2312();
        } else if (arg1 == 79) {
            this.field1141 = arg0.method2312();
        } else if (arg1 == 90) {
            this.field1120 = arg0.method2312();
        } else if (arg1 == 91) {
            this.field1144 = arg0.method2312();
        } else if (arg1 == 92) {
            this.field1143 = arg0.method2312();
        } else if (arg1 == 93) {
            this.field1145 = arg0.method2312();
        } else if (arg1 == 95) {
            this.field1118 = arg0.method2312();
        } else if (arg1 == 97) {
            this.field1148 = arg0.method2312();
        } else if (arg1 == 98) {
            this.field1149 = arg0.method2312();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1146 == null) {
                this.field1146 = new int[10];
                this.field1132 = new int[10];
            }
            this.field1146[arg1 - 100] = arg0.method2312();
            this.field1132[arg1 - 100] = arg0.method2312();
        } else if (arg1 == 110) {
            this.field1150 = arg0.method2312();
        } else if (arg1 == 111) {
            this.field1151 = arg0.method2312();
        } else if (arg1 == 112) {
            this.field1152 = arg0.method2312();
        } else if (arg1 == 113) {
            this.field1153 = arg0.method2311();
        } else if (arg1 == 114) {
            this.field1126 = arg0.method2311();
        } else if (arg1 == 115) {
            this.field1155 = arg0.method2310();
        } else if (arg1 == 139) {
            this.field1157 = arg0.method2312();
        } else if (arg1 == 140) {
            this.field1159 = arg0.method2312();
        }
    }

    @ObfuscatedName("ad.s(Lad;Lad;I)V")
    public void method992(class52 arg0, class52 arg1) {
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1118 = arg0.field1118;
        this.field1154 = arg0.field1154;
        this.field1128 = arg0.field1128;
        this.field1119 = arg0.field1119;
        this.field1147 = arg0.field1147;
        this.field1121 = arg0.field1121;
        this.field1142 = arg0.field1142;
        this.field1137 = arg1.field1137;
        this.field1131 = arg1.field1131;
        this.field1117 = arg1.field1117;
        this.field1129 = 1;
    }

    @ObfuscatedName("ad.p(Lad;Lad;B)V")
    public void method989(class52 arg0, class52 arg1) {
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1118 = arg0.field1118;
        this.field1154 = arg0.field1154;
        this.field1128 = arg0.field1128;
        this.field1119 = arg1.field1119;
        this.field1147 = arg1.field1147;
        this.field1121 = arg1.field1121;
        this.field1142 = arg1.field1142;
        this.field1137 = arg1.field1137;
        this.field1131 = arg1.field1131;
        this.field1129 = arg1.field1129;
        this.field1134 = arg1.field1134;
        this.field1110 = arg1.field1110;
        this.field1140 = arg1.field1140;
        this.field1161 = arg1.field1161;
        this.field1138 = arg1.field1138;
        this.field1141 = arg1.field1141;
        this.field1120 = arg1.field1120;
        this.field1143 = arg1.field1143;
        this.field1144 = arg1.field1144;
        this.field1145 = arg1.field1145;
        this.field1155 = arg1.field1155;
        this.field1108 = arg1.field1108;
        this.field1133 = new String[5];
        if (arg1.field1133 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1133[var3] = arg1.field1133[var3];
            }
        }
        this.field1133[4] = class157.field2314;
        this.field1117 = 0;
    }

    @ObfuscatedName("ad.r(IB)Lcg;")
    public final class100 method980(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1132[var3] && this.field1132[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method2618(var2).method980(1);
            }
        }
        class100 var4 = class100.method2014(Statics.field1112, this.field1122, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1150 != 128 || this.field1151 != 128 || this.field1152 != 128) {
            var4.method2031(this.field1150, this.field1151, this.field1152);
        }
        if (this.field1119 != null) {
            for (int var5 = 0; var5 < this.field1119.length; var5++) {
                var4.method2019(this.field1119[var5], this.field1147[var5]);
            }
        }
        if (this.field1121 != null) {
            for (int var6 = 0; var6 < this.field1121.length; var6++) {
                var4.method2029(this.field1121[var6], this.field1142[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.k(IB)Ldo;")
    public final class105 method1018(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1132[var3] && this.field1132[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method2618(var2).method1018(1);
            }
        }
        class105 var4 = (class105) field1160.method3467((long) this.field1116);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2014(Statics.field1112, this.field1122, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1150 != 128 || this.field1151 != 128 || this.field1152 != 128) {
            var5.method2031(this.field1150, this.field1151, this.field1152);
        }
        if (this.field1119 != null) {
            for (int var6 = 0; var6 < this.field1119.length; var6++) {
                var5.method2019(this.field1119[var6], this.field1147[var6]);
            }
        }
        if (this.field1121 != null) {
            for (int var7 = 0; var7 < this.field1121.length; var7++) {
                var5.method2029(this.field1121[var7], this.field1142[var7]);
            }
        }
        class105 var8 = var5.method2036(this.field1153 + 64, this.field1126 * 5 + 768, -50, -10, -50);
        var8.field1813 = true;
        field1160.method3466(var8, (long) this.field1116);
        return var8;
    }

    @ObfuscatedName("ad.d(IB)Lad;")
    public class52 method982(int arg0) {
        if (this.field1146 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1132[var3] && this.field1132[var3] != 0) {
                    var2 = this.field1146[var3];
                }
            }
            if (var2 != -1) {
                return method2618(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fi.n(IIIIIZI)Lcm;")
    public static final class79 method2975(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1115.method3467(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2618(arg0);
        if (arg1 > 1 && var9.field1146 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1132[var11] && var9.field1132[var11] != 0) {
                    var10 = var9.field1146[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2618(var10);
            }
        }
        class105 var12 = var9.method1018(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1149 != -1) {
            var13 = method2975(var9.field1148, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1159 != -1) {
            var13 = method2975(var9.field1157, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1416;
        int var15 = Statics.field1413;
        int var16 = Statics.field1417;
        int[] var17 = new int[4];
        class80.method1657(var17);
        class79 var18 = new class79(36, 32);
        class80.method1659(var18.field1401, 36, 32);
        class80.method1669();
        class91.method1917();
        class91.method1918(16, 16);
        class91.field1559 = false;
        int var19 = var9.field1123;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1558[var9.field1124] * var19 >> 16;
        int var21 = class91.field1582[var9.field1124] * var19 >> 16;
        var12.method2131();
        var12.method2156(0, var9.field1125, var9.field1118, var9.field1124, var9.field1154, var9.field1128 + var12.field1452 / 2 + var20, var9.field1128 + var21);
        if (var9.field1159 != -1) {
            var13.method1554(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1550(1);
        }
        if (arg2 >= 2) {
            var18.method1550(16777215);
        }
        if (arg3 != 0) {
            var18.method1584(arg3);
        }
        class80.method1659(var18.field1401, 36, 32);
        if (var9.field1149 != -1) {
            var13.method1554(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1129 == 1) {
            class224 var22 = Statics.field2902;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2393 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2470 + "</col>";
            }
            var22.method3724(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1115.method3466(var18, var6);
        }
        class80.method1659(var14, var15, var16);
        class80.method1662(var17);
        class91.method1917();
        class91.field1559 = true;
        return var18;
    }

    @ObfuscatedName("ad.z(ZI)Z")
    public final boolean method983(boolean arg0) {
        int var2 = this.field1134;
        int var3 = this.field1110;
        int var4 = this.field1140;
        if (arg0) {
            var2 = this.field1161;
            var3 = this.field1138;
            var4 = this.field1141;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1112.method3057(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1112.method3057(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1112.method3057(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.c(ZI)Lcg;")
    public final class100 method987(boolean arg0) {
        int var2 = this.field1134;
        int var3 = this.field1110;
        int var4 = this.field1140;
        if (arg0) {
            var2 = this.field1161;
            var3 = this.field1138;
            var4 = this.field1141;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2014(Statics.field1112, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2014(Statics.field1112, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2014(Statics.field1112, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1136 != 0) {
            var5.method2027(0, this.field1136, 0);
        }
        if (arg0 && this.field1139 != 0) {
            var5.method2027(0, this.field1139, 0);
        }
        if (this.field1119 != null) {
            for (int var10 = 0; var10 < this.field1119.length; var10++) {
                var5.method2019(this.field1119[var10], this.field1147[var10]);
            }
        }
        if (this.field1121 != null) {
            for (int var11 = 0; var11 < this.field1121.length; var11++) {
                var5.method2029(this.field1121[var11], this.field1142[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.b(ZB)Z")
    public final boolean method985(boolean arg0) {
        int var2 = this.field1120;
        int var3 = this.field1143;
        if (arg0) {
            var2 = this.field1144;
            var3 = this.field1145;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1112.method3057(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1112.method3057(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.w(ZI)Lcg;")
    public final class100 method986(boolean arg0) {
        int var2 = this.field1120;
        int var3 = this.field1143;
        if (arg0) {
            var2 = this.field1144;
            var3 = this.field1145;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2014(Statics.field1112, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2014(Statics.field1112, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1119 != null) {
            for (int var7 = 0; var7 < this.field1119.length; var7++) {
                var4.method2019(this.field1119[var7], this.field1147[var7]);
            }
        }
        if (this.field1121 != null) {
            for (int var8 = 0; var8 < this.field1121.length; var8++) {
                var4.method2029(this.field1121[var8], this.field1142[var8]);
            }
        }
        return var4;
    }
}
