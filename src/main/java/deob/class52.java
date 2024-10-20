package deob;

@ObfuscatedName("ad")
public class class52 extends class204 {

    @ObfuscatedName("ad.d")
    public static class193 field1114 = new class193(64);

    @ObfuscatedName("ad.c")
    public static class193 field1147 = new class193(50);

    @ObfuscatedName("ad.y")
    public static class193 field1116 = new class193(200);

    @ObfuscatedName("ad.e")
    public int field1117;

    @ObfuscatedName("ad.z")
    public int field1162;

    @ObfuscatedName("ad.t")
    public String field1119 = "null";

    @ObfuscatedName("ad.b")
    public short[] field1126;

    @ObfuscatedName("ad.l")
    public short[] field1121;

    @ObfuscatedName("ad.s")
    public short[] field1122;

    @ObfuscatedName("ad.f")
    public short[] field1127;

    @ObfuscatedName("ad.g")
    public int field1124 = 2000;

    @ObfuscatedName("ad.u")
    public int field1125 = 0;

    @ObfuscatedName("ad.o")
    public int field1131 = 0;

    @ObfuscatedName("ad.k")
    public int field1139 = 0;

    @ObfuscatedName("ad.a")
    public int field1128 = 0;

    @ObfuscatedName("ad.j")
    public int field1129 = 0;

    @ObfuscatedName("ad.p")
    public int field1130 = 0;

    @ObfuscatedName("ad.w")
    public int field1112 = 1;

    @ObfuscatedName("ad.au")
    public boolean field1137 = false;

    @ObfuscatedName("ad.ar")
    public String[] field1133 = new String[] { null, null, class157.field2305, null, null };

    @ObfuscatedName("ad.ah")
    public String[] field1134 = new String[] { null, null, null, null, class157.field2396 };

    @ObfuscatedName("ad.af")
    public int field1135 = -1;

    @ObfuscatedName("ad.az")
    public int field1136 = -1;

    @ObfuscatedName("ad.av")
    public int field1118 = 0;

    @ObfuscatedName("ad.al")
    public int field1160 = -1;

    @ObfuscatedName("ad.aw")
    public int field1138 = -1;

    @ObfuscatedName("ad.ac")
    public int field1140 = 0;

    @ObfuscatedName("ad.ai")
    public int field1141 = -1;

    @ObfuscatedName("ad.ab")
    public int field1142 = -1;

    @ObfuscatedName("ad.aj")
    public int field1143 = -1;

    @ObfuscatedName("ad.an")
    public int field1144 = -1;

    @ObfuscatedName("ad.ay")
    public int field1145 = -1;

    @ObfuscatedName("ad.ap")
    public int field1146 = -1;

    @ObfuscatedName("ad.ax")
    public int[] field1120;

    @ObfuscatedName("ad.aa")
    public int[] field1157;

    @ObfuscatedName("ad.ae")
    public int field1149 = -1;

    @ObfuscatedName("ad.ao")
    public int field1115 = -1;

    @ObfuscatedName("ad.am")
    public int field1123 = 128;

    @ObfuscatedName("ad.aq")
    public int field1152 = 128;

    @ObfuscatedName("ad.ak")
    public int field1153 = 128;

    @ObfuscatedName("ad.at")
    public int field1154 = 0;

    @ObfuscatedName("ad.as")
    public int field1155 = 0;

    @ObfuscatedName("ad.ag")
    public int field1156 = 0;

    @ObfuscatedName("ad.ad")
    public boolean field1132 = false;

    @ObfuscatedName("ad.bw")
    public int field1158 = -1;

    @ObfuscatedName("ad.bq")
    public int field1159 = -1;

    @ObfuscatedName("s.i(Lfe;Lfe;ZLhy;B)V")
    public static void method163(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1110 = arg0;
        Statics.field1111 = arg1;
        Statics.field1148 = arg2;
        Statics.field1113 = Statics.field1110.method3044(10);
        Statics.field203 = arg3;
    }

    @ObfuscatedName("ak.v(II)Lad;")
    public static class52 method970(int arg0) {
        class52 var1 = (class52) field1114.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1110.method3035(10, arg0);
        class52 var3 = new class52();
        var3.field1117 = arg0;
        if (var2 != null) {
            var3.method1034(new class119(var2));
        }
        var3.method1059();
        if (var3.field1115 != -1) {
            var3.method1019(method970(var3.field1115), method970(var3.field1149));
        }
        if (var3.field1159 != -1) {
            var3.method1020(method970(var3.field1159), method970(var3.field1158));
        }
        if (!Statics.field1148 && var3.field1137) {
            var3.field1119 = class157.field2330;
            var3.field1132 = false;
            var3.field1133 = null;
            var3.field1134 = null;
            var3.field1156 = 0;
        }
        field1114.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.r(I)V")
    public void method1059() {
    }

    @ObfuscatedName("ad.n(Ldx;I)V")
    public void method1034(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method1018(arg0, var2);
        }
    }

    @ObfuscatedName("ad.x(Ldx;IB)V")
    public void method1018(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1162 = arg0.method2347();
        } else if (arg1 == 2) {
            this.field1119 = arg0.method2356();
        } else if (arg1 == 4) {
            this.field1124 = arg0.method2347();
        } else if (arg1 == 5) {
            this.field1125 = arg0.method2347();
        } else if (arg1 == 6) {
            this.field1131 = arg0.method2347();
        } else if (arg1 == 7) {
            this.field1128 = arg0.method2347();
            if (this.field1128 > 32767) {
                this.field1128 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1129 = arg0.method2347();
            if (this.field1129 > 32767) {
                this.field1129 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1130 = 1;
        } else if (arg1 == 12) {
            this.field1112 = arg0.method2350();
        } else if (arg1 == 16) {
            this.field1137 = true;
        } else if (arg1 == 23) {
            this.field1135 = arg0.method2347();
            this.field1118 = arg0.method2380();
        } else if (arg1 == 24) {
            this.field1136 = arg0.method2347();
        } else if (arg1 == 25) {
            this.field1160 = arg0.method2347();
            this.field1140 = arg0.method2380();
        } else if (arg1 == 26) {
            this.field1138 = arg0.method2347();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1133[arg1 - 30] = arg0.method2356();
            if (this.field1133[arg1 - 30].equalsIgnoreCase(class157.field2302)) {
                this.field1133[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1134[arg1 - 35] = arg0.method2356();
        } else if (arg1 == 40) {
            int var3 = arg0.method2380();
            this.field1126 = new short[var3];
            this.field1121 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1126[var4] = (short) arg0.method2347();
                this.field1121[var4] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2380();
            this.field1122 = new short[var5];
            this.field1127 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1122[var6] = (short) arg0.method2347();
                this.field1127[var6] = (short) arg0.method2347();
            }
        } else if (arg1 == 65) {
            this.field1132 = true;
        } else if (arg1 == 78) {
            this.field1141 = arg0.method2347();
        } else if (arg1 == 79) {
            this.field1142 = arg0.method2347();
        } else if (arg1 == 90) {
            this.field1143 = arg0.method2347();
        } else if (arg1 == 91) {
            this.field1145 = arg0.method2347();
        } else if (arg1 == 92) {
            this.field1144 = arg0.method2347();
        } else if (arg1 == 93) {
            this.field1146 = arg0.method2347();
        } else if (arg1 == 95) {
            this.field1139 = arg0.method2347();
        } else if (arg1 == 97) {
            this.field1149 = arg0.method2347();
        } else if (arg1 == 98) {
            this.field1115 = arg0.method2347();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1120 == null) {
                this.field1120 = new int[10];
                this.field1157 = new int[10];
            }
            this.field1120[arg1 - 100] = arg0.method2347();
            this.field1157[arg1 - 100] = arg0.method2347();
        } else if (arg1 == 110) {
            this.field1123 = arg0.method2347();
        } else if (arg1 == 111) {
            this.field1152 = arg0.method2347();
        } else if (arg1 == 112) {
            this.field1153 = arg0.method2347();
        } else if (arg1 == 113) {
            this.field1154 = arg0.method2346();
        } else if (arg1 == 114) {
            this.field1155 = arg0.method2346() * 5;
        } else if (arg1 == 115) {
            this.field1156 = arg0.method2380();
        } else if (arg1 == 139) {
            this.field1158 = arg0.method2347();
        } else if (arg1 == 140) {
            this.field1159 = arg0.method2347();
        }
    }

    @ObfuscatedName("ad.q(Lad;Lad;I)V")
    public void method1019(class52 arg0, class52 arg1) {
        this.field1162 = arg0.field1162;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1131 = arg0.field1131;
        this.field1139 = arg0.field1139;
        this.field1128 = arg0.field1128;
        this.field1129 = arg0.field1129;
        this.field1126 = arg0.field1126;
        this.field1121 = arg0.field1121;
        this.field1122 = arg0.field1122;
        this.field1127 = arg0.field1127;
        this.field1119 = arg1.field1119;
        this.field1137 = arg1.field1137;
        this.field1112 = arg1.field1112;
        this.field1130 = 1;
    }

    @ObfuscatedName("ad.h(Lad;Lad;B)V")
    public void method1020(class52 arg0, class52 arg1) {
        this.field1162 = arg0.field1162;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1131 = arg0.field1131;
        this.field1139 = arg0.field1139;
        this.field1128 = arg0.field1128;
        this.field1129 = arg0.field1129;
        this.field1126 = arg1.field1126;
        this.field1121 = arg1.field1121;
        this.field1122 = arg1.field1122;
        this.field1127 = arg1.field1127;
        this.field1119 = arg1.field1119;
        this.field1137 = arg1.field1137;
        this.field1130 = arg1.field1130;
        this.field1135 = arg1.field1135;
        this.field1136 = arg1.field1136;
        this.field1141 = arg1.field1141;
        this.field1160 = arg1.field1160;
        this.field1138 = arg1.field1138;
        this.field1142 = arg1.field1142;
        this.field1143 = arg1.field1143;
        this.field1144 = arg1.field1144;
        this.field1145 = arg1.field1145;
        this.field1146 = arg1.field1146;
        this.field1156 = arg1.field1156;
        this.field1133 = arg1.field1133;
        this.field1134 = new String[5];
        if (arg1.field1134 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1134[var3] = arg1.field1134[var3];
            }
        }
        this.field1134[4] = class157.field2393;
        this.field1112 = 0;
    }

    @ObfuscatedName("ad.d(II)Lcx;")
    public final class100 method1021(int arg0) {
        if (this.field1120 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1157[var3] && this.field1157[var3] != 0) {
                    var2 = this.field1120[var3];
                }
            }
            if (var2 != -1) {
                return method970(var2).method1021(1);
            }
        }
        class100 var4 = class100.method2042(Statics.field1111, this.field1162, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1123 != 128 || this.field1152 != 128 || this.field1153 != 128) {
            var4.method2057(this.field1123, this.field1152, this.field1153);
        }
        if (this.field1126 != null) {
            for (int var5 = 0; var5 < this.field1126.length; var5++) {
                var4.method2054(this.field1126[var5], this.field1121[var5]);
            }
        }
        if (this.field1122 != null) {
            for (int var6 = 0; var6 < this.field1122.length; var6++) {
                var4.method2055(this.field1122[var6], this.field1127[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.c(II)Ldj;")
    public final class105 method1022(int arg0) {
        if (this.field1120 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1157[var3] && this.field1157[var3] != 0) {
                    var2 = this.field1120[var3];
                }
            }
            if (var2 != -1) {
                return method970(var2).method1022(1);
            }
        }
        class105 var4 = (class105) field1147.method3464((long) this.field1117);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2042(Statics.field1111, this.field1162, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1123 != 128 || this.field1152 != 128 || this.field1153 != 128) {
            var5.method2057(this.field1123, this.field1152, this.field1153);
        }
        if (this.field1126 != null) {
            for (int var6 = 0; var6 < this.field1126.length; var6++) {
                var5.method2054(this.field1126[var6], this.field1121[var6]);
            }
        }
        if (this.field1122 != null) {
            for (int var7 = 0; var7 < this.field1122.length; var7++) {
                var5.method2055(this.field1122[var7], this.field1127[var7]);
            }
        }
        class105 var8 = var5.method2062(this.field1154 + 64, this.field1155 + 768, -50, -10, -50);
        var8.field1810 = true;
        field1147.method3466(var8, (long) this.field1117);
        return var8;
    }

    @ObfuscatedName("ad.y(II)Lad;")
    public class52 method1026(int arg0) {
        if (this.field1120 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1157[var3] && this.field1157[var3] != 0) {
                    var2 = this.field1120[var3];
                }
            }
            if (var2 != -1) {
                return method970(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ak.m(IIIIIZI)Lck;")
    public static final class79 method983(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1116.method3464(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method970(arg0);
        if (arg1 > 1 && var9.field1120 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1157[var11] && var9.field1157[var11] != 0) {
                    var10 = var9.field1120[var11];
                }
            }
            if (var10 != -1) {
                var9 = method970(var10);
            }
        }
        class105 var12 = var9.method1022(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1115 != -1) {
            var13 = method983(var9.field1149, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1159 != -1) {
            var13 = method983(var9.field1158, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1415;
        int var15 = Statics.field1416;
        int var16 = Statics.field1417;
        int[] var17 = new int[4];
        class80.method1688(var17);
        class79 var18 = new class79(36, 32);
        class80.method1685(var18.field1414, 36, 32);
        class80.method1727();
        class91.method1951();
        class91.method1954(16, 16);
        class91.field1563 = false;
        int var19 = var9.field1124;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1574[var9.field1125] * var19 >> 16;
        int var21 = class91.field1581[var9.field1125] * var19 >> 16;
        var12.method2153();
        var12.method2164(0, var9.field1131, var9.field1139, var9.field1125, var9.field1128, var9.field1129 + var12.field1451 / 2 + var20, var9.field1129 + var21);
        if (var9.field1159 != -1) {
            var13.method1597(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1620(1);
        }
        if (arg2 >= 2) {
            var18.method1620(16777215);
        }
        if (arg3 != 0) {
            var18.method1631(arg3);
        }
        class80.method1685(var18.field1414, 36, 32);
        if (var9.field1115 != -1) {
            var13.method1597(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1130 == 1) {
            class224 var22 = Statics.field203;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2381 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2451 + "</col>";
            }
            var22.method3733(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1116.method3466(var18, var6);
        }
        class80.method1685(var14, var15, var16);
        class80.method1689(var17);
        class91.method1951();
        class91.field1563 = true;
        return var18;
    }

    @ObfuscatedName("ad.e(ZB)Z")
    public final boolean method1024(boolean arg0) {
        int var2 = this.field1135;
        int var3 = this.field1136;
        int var4 = this.field1141;
        if (arg0) {
            var2 = this.field1160;
            var3 = this.field1138;
            var4 = this.field1142;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1111.method3063(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1111.method3063(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1111.method3063(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.z(ZB)Lcx;")
    public final class100 method1025(boolean arg0) {
        int var2 = this.field1135;
        int var3 = this.field1136;
        int var4 = this.field1141;
        if (arg0) {
            var2 = this.field1160;
            var3 = this.field1138;
            var4 = this.field1142;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2042(Statics.field1111, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2042(Statics.field1111, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2042(Statics.field1111, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1118 != 0) {
            var5.method2043(0, this.field1118, 0);
        }
        if (arg0 && this.field1140 != 0) {
            var5.method2043(0, this.field1140, 0);
        }
        if (this.field1126 != null) {
            for (int var10 = 0; var10 < this.field1126.length; var10++) {
                var5.method2054(this.field1126[var10], this.field1121[var10]);
            }
        }
        if (this.field1122 != null) {
            for (int var11 = 0; var11 < this.field1122.length; var11++) {
                var5.method2055(this.field1122[var11], this.field1127[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.t(ZB)Z")
    public final boolean method1064(boolean arg0) {
        int var2 = this.field1143;
        int var3 = this.field1144;
        if (arg0) {
            var2 = this.field1145;
            var3 = this.field1146;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1111.method3063(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1111.method3063(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.b(ZI)Lcx;")
    public final class100 method1027(boolean arg0) {
        int var2 = this.field1143;
        int var3 = this.field1144;
        if (arg0) {
            var2 = this.field1145;
            var3 = this.field1146;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2042(Statics.field1111, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2042(Statics.field1111, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1126 != null) {
            for (int var7 = 0; var7 < this.field1126.length; var7++) {
                var4.method2054(this.field1126[var7], this.field1121[var7]);
            }
        }
        if (this.field1122 != null) {
            for (int var8 = 0; var8 < this.field1122.length; var8++) {
                var4.method2055(this.field1122[var8], this.field1127[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("au.l(I)V")
    public static void method648() {
        field1114.method3467();
        field1147.method3467();
        field1116.method3467();
    }
}
