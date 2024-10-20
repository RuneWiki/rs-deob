package deob;

@ObfuscatedName("at")
public class class52 extends class204 {

    @ObfuscatedName("at.p")
    public static class193 field1140 = new class193(64);

    @ObfuscatedName("at.u")
    public static class193 field1113 = new class193(50);

    @ObfuscatedName("at.c")
    public static class193 field1114 = new class193(200);

    @ObfuscatedName("at.o")
    public int field1115;

    @ObfuscatedName("at.n")
    public int field1116;

    @ObfuscatedName("at.k")
    public String field1111 = "null";

    @ObfuscatedName("at.f")
    public short[] field1146;

    @ObfuscatedName("at.x")
    public short[] field1136;

    @ObfuscatedName("at.j")
    public short[] field1120;

    @ObfuscatedName("at.r")
    public short[] field1121;

    @ObfuscatedName("at.y")
    public int field1118 = 2000;

    @ObfuscatedName("at.t")
    public int field1123 = 0;

    @ObfuscatedName("at.a")
    public int field1112 = 0;

    @ObfuscatedName("at.s")
    public int field1125 = 0;

    @ObfuscatedName("at.e")
    public int field1126 = 0;

    @ObfuscatedName("at.q")
    public int field1127 = 0;

    @ObfuscatedName("at.i")
    public int field1128 = 0;

    @ObfuscatedName("at.h")
    public int field1129 = 1;

    @ObfuscatedName("at.ay")
    public boolean field1142 = false;

    @ObfuscatedName("at.ak")
    public String[] field1131 = new String[] { null, null, class157.field2298, null, null };

    @ObfuscatedName("at.ai")
    public String[] field1132 = new String[] { null, null, null, null, class157.field2299 };

    @ObfuscatedName("at.ag")
    public int field1133 = -1;

    @ObfuscatedName("at.ab")
    public int field1134 = -1;

    @ObfuscatedName("at.aa")
    public int field1152 = 0;

    @ObfuscatedName("at.af")
    public int field1124 = -1;

    @ObfuscatedName("at.al")
    public int field1137 = -1;

    @ObfuscatedName("at.ad")
    public int field1135 = 0;

    @ObfuscatedName("at.aw")
    public int field1155 = -1;

    @ObfuscatedName("at.an")
    public int field1119 = -1;

    @ObfuscatedName("at.ax")
    public int field1141 = -1;

    @ObfuscatedName("at.aq")
    public int field1110 = -1;

    @ObfuscatedName("at.ae")
    public int field1143 = -1;

    @ObfuscatedName("at.au")
    public int field1147 = -1;

    @ObfuscatedName("at.ao")
    public int[] field1117;

    @ObfuscatedName("at.aj")
    public int[] field1145;

    @ObfuscatedName("at.am")
    public int field1139 = -1;

    @ObfuscatedName("at.av")
    public int field1148 = -1;

    @ObfuscatedName("at.ap")
    public int field1149 = 128;

    @ObfuscatedName("at.ah")
    public int field1122 = 128;

    @ObfuscatedName("at.ar")
    public int field1151 = 128;

    @ObfuscatedName("at.az")
    public int field1138 = 0;

    @ObfuscatedName("at.ac")
    public int field1153 = 0;

    @ObfuscatedName("at.as")
    public int field1154 = 0;

    @ObfuscatedName("at.at")
    public boolean field1107 = false;

    @ObfuscatedName("at.bt")
    public int field1156 = -1;

    @ObfuscatedName("at.bl")
    public int field1157 = -1;

    @ObfuscatedName("df.g(Lfc;Lfc;ZLhq;S)V")
    public static void method2657(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1108 = arg0;
        Statics.field1109 = arg1;
        Statics.field1150 = arg2;
        Statics.field1144 = Statics.field1108.method3088(10);
        Statics.field3139 = arg3;
    }

    @ObfuscatedName("eq.b(II)Lat;")
    public static class52 method2767(int arg0) {
        class52 var1 = (class52) field1140.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1108.method3112(10, arg0);
        class52 var3 = new class52();
        var3.field1115 = arg0;
        if (var2 != null) {
            var3.method1033(new class119(var2));
        }
        var3.method1032();
        if (var3.field1148 != -1) {
            var3.method1035(method2767(var3.field1148), method2767(var3.field1139));
        }
        if (var3.field1157 != -1) {
            var3.method1048(method2767(var3.field1157), method2767(var3.field1156));
        }
        if (!Statics.field1150 && var3.field1142) {
            var3.field1111 = class157.field2392;
            var3.field1107 = false;
            var3.field1131 = null;
            var3.field1132 = null;
            var3.field1154 = 0;
        }
        field1140.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.w(S)V")
    public void method1032() {
    }

    @ObfuscatedName("at.d(Ldm;B)V")
    public void method1033(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method1088(arg0, var2);
        }
    }

    @ObfuscatedName("at.z(Ldm;II)V")
    public void method1088(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1116 = arg0.method2376();
        } else if (arg1 == 2) {
            this.field1111 = arg0.method2370();
        } else if (arg1 == 4) {
            this.field1118 = arg0.method2376();
        } else if (arg1 == 5) {
            this.field1123 = arg0.method2376();
        } else if (arg1 == 6) {
            this.field1112 = arg0.method2376();
        } else if (arg1 == 7) {
            this.field1126 = arg0.method2376();
            if (this.field1126 > 32767) {
                this.field1126 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1127 = arg0.method2376();
            if (this.field1127 > 32767) {
                this.field1127 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1128 = 1;
        } else if (arg1 == 12) {
            this.field1129 = arg0.method2367();
        } else if (arg1 == 16) {
            this.field1142 = true;
        } else if (arg1 == 23) {
            this.field1133 = arg0.method2376();
            this.field1152 = arg0.method2362();
        } else if (arg1 == 24) {
            this.field1134 = arg0.method2376();
        } else if (arg1 == 25) {
            this.field1124 = arg0.method2376();
            this.field1135 = arg0.method2362();
        } else if (arg1 == 26) {
            this.field1137 = arg0.method2376();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1131[arg1 - 30] = arg0.method2370();
            if (this.field1131[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field1131[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1132[arg1 - 35] = arg0.method2370();
        } else if (arg1 == 40) {
            int var3 = arg0.method2362();
            this.field1146 = new short[var3];
            this.field1136 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1146[var4] = (short) arg0.method2376();
                this.field1136[var4] = (short) arg0.method2376();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2362();
            this.field1120 = new short[var5];
            this.field1121 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1120[var6] = (short) arg0.method2376();
                this.field1121[var6] = (short) arg0.method2376();
            }
        } else if (arg1 == 65) {
            this.field1107 = true;
        } else if (arg1 == 78) {
            this.field1155 = arg0.method2376();
        } else if (arg1 == 79) {
            this.field1119 = arg0.method2376();
        } else if (arg1 == 90) {
            this.field1141 = arg0.method2376();
        } else if (arg1 == 91) {
            this.field1143 = arg0.method2376();
        } else if (arg1 == 92) {
            this.field1110 = arg0.method2376();
        } else if (arg1 == 93) {
            this.field1147 = arg0.method2376();
        } else if (arg1 == 95) {
            this.field1125 = arg0.method2376();
        } else if (arg1 == 97) {
            this.field1139 = arg0.method2376();
        } else if (arg1 == 98) {
            this.field1148 = arg0.method2376();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1117 == null) {
                this.field1117 = new int[10];
                this.field1145 = new int[10];
            }
            this.field1117[arg1 - 100] = arg0.method2376();
            this.field1145[arg1 - 100] = arg0.method2376();
        } else if (arg1 == 110) {
            this.field1149 = arg0.method2376();
        } else if (arg1 == 111) {
            this.field1122 = arg0.method2376();
        } else if (arg1 == 112) {
            this.field1151 = arg0.method2376();
        } else if (arg1 == 113) {
            this.field1138 = arg0.method2391();
        } else if (arg1 == 114) {
            this.field1153 = arg0.method2391();
        } else if (arg1 == 115) {
            this.field1154 = arg0.method2362();
        } else if (arg1 == 139) {
            this.field1156 = arg0.method2376();
        } else if (arg1 == 140) {
            this.field1157 = arg0.method2376();
        }
    }

    @ObfuscatedName("at.l(Lat;Lat;I)V")
    public void method1035(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1118 = arg0.field1118;
        this.field1123 = arg0.field1123;
        this.field1112 = arg0.field1112;
        this.field1125 = arg0.field1125;
        this.field1126 = arg0.field1126;
        this.field1127 = arg0.field1127;
        this.field1146 = arg0.field1146;
        this.field1136 = arg0.field1136;
        this.field1120 = arg0.field1120;
        this.field1121 = arg0.field1121;
        this.field1111 = arg1.field1111;
        this.field1142 = arg1.field1142;
        this.field1129 = arg1.field1129;
        this.field1128 = 1;
    }

    @ObfuscatedName("at.m(Lat;Lat;I)V")
    public void method1048(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1118 = arg0.field1118;
        this.field1123 = arg0.field1123;
        this.field1112 = arg0.field1112;
        this.field1125 = arg0.field1125;
        this.field1126 = arg0.field1126;
        this.field1127 = arg0.field1127;
        this.field1146 = arg1.field1146;
        this.field1136 = arg1.field1136;
        this.field1120 = arg1.field1120;
        this.field1121 = arg1.field1121;
        this.field1111 = arg1.field1111;
        this.field1142 = arg1.field1142;
        this.field1128 = arg1.field1128;
        this.field1133 = arg1.field1133;
        this.field1134 = arg1.field1134;
        this.field1155 = arg1.field1155;
        this.field1124 = arg1.field1124;
        this.field1137 = arg1.field1137;
        this.field1119 = arg1.field1119;
        this.field1141 = arg1.field1141;
        this.field1110 = arg1.field1110;
        this.field1143 = arg1.field1143;
        this.field1147 = arg1.field1147;
        this.field1154 = arg1.field1154;
        this.field1131 = arg1.field1131;
        this.field1132 = new String[5];
        if (arg1.field1132 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1132[var3] = arg1.field1132[var3];
            }
        }
        this.field1132[4] = class157.field2304;
        this.field1129 = 0;
    }

    @ObfuscatedName("at.p(II)Lcd;")
    public final class100 method1037(int arg0) {
        if (this.field1117 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1145[var3] && this.field1145[var3] != 0) {
                    var2 = this.field1117[var3];
                }
            }
            if (var2 != -1) {
                return method2767(var2).method1037(1);
            }
        }
        class100 var4 = class100.method2080(Statics.field1109, this.field1116, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1149 != 128 || this.field1122 != 128 || this.field1151 != 128) {
            var4.method2121(this.field1149, this.field1122, this.field1151);
        }
        if (this.field1146 != null) {
            for (int var5 = 0; var5 < this.field1146.length; var5++) {
                var4.method2093(this.field1146[var5], this.field1136[var5]);
            }
        }
        if (this.field1120 != null) {
            for (int var6 = 0; var6 < this.field1120.length; var6++) {
                var4.method2094(this.field1120[var6], this.field1121[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("at.u(II)Ldd;")
    public final class105 method1060(int arg0) {
        if (this.field1117 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1145[var3] && this.field1145[var3] != 0) {
                    var2 = this.field1117[var3];
                }
            }
            if (var2 != -1) {
                return method2767(var2).method1060(1);
            }
        }
        class105 var4 = (class105) field1113.method3529((long) this.field1115);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2080(Statics.field1109, this.field1116, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1149 != 128 || this.field1122 != 128 || this.field1151 != 128) {
            var5.method2121(this.field1149, this.field1122, this.field1151);
        }
        if (this.field1146 != null) {
            for (int var6 = 0; var6 < this.field1146.length; var6++) {
                var5.method2093(this.field1146[var6], this.field1136[var6]);
            }
        }
        if (this.field1120 != null) {
            for (int var7 = 0; var7 < this.field1120.length; var7++) {
                var5.method2094(this.field1120[var7], this.field1121[var7]);
            }
        }
        class105 var8 = var5.method2079(this.field1138 + 64, this.field1153 * 5 + 768, -50, -10, -50);
        var8.field1797 = true;
        field1113.method3528(var8, (long) this.field1115);
        return var8;
    }

    @ObfuscatedName("at.c(II)Lat;")
    public class52 method1057(int arg0) {
        if (this.field1117 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1145[var3] && this.field1145[var3] != 0) {
                    var2 = this.field1117[var3];
                }
            }
            if (var2 != -1) {
                return method2767(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("q.v(IIIIIZB)Lcy;")
    public static final class79 method605(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1114.method3529(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2767(arg0);
        if (arg1 > 1 && var9.field1117 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1145[var11] && var9.field1145[var11] != 0) {
                    var10 = var9.field1117[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2767(var10);
            }
        }
        class105 var12 = var9.method1060(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1148 != -1) {
            var13 = method605(var9.field1139, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1157 != -1) {
            var13 = method605(var9.field1156, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1411;
        int var15 = Statics.field1409;
        int var16 = Statics.field1410;
        int[] var17 = new int[4];
        class80.method1709(var17);
        class79 var18 = new class79(36, 32);
        class80.method1746(var18.field1407, 36, 32);
        class80.method1711();
        class91.method1984();
        class91.method1986(16, 16);
        class91.field1557 = false;
        int var19 = var9.field1118;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1577[var9.field1123] * var19 >> 16;
        int var21 = class91.field1574[var9.field1123] * var19 >> 16;
        var12.method2208();
        var12.method2191(0, var9.field1112, var9.field1125, var9.field1123, var9.field1126, var9.field1127 + var12.field1452 / 2 + var20, var9.field1127 + var21);
        if (var9.field1157 != -1) {
            var13.method1629(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1625(1);
        }
        if (arg2 >= 2) {
            var18.method1625(16777215);
        }
        if (arg3 != 0) {
            var18.method1626(arg3);
        }
        class80.method1746(var18.field1407, 36, 32);
        if (var9.field1148 != -1) {
            var13.method1629(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1128 == 1) {
            Statics.field3139.method3810(method1614(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1114.method3528(var18, var6);
        }
        class80.method1746(var14, var15, var16);
        class80.method1715(var17);
        class91.method1984();
        class91.field1557 = true;
        return var18;
    }

    @ObfuscatedName("bz.o(IB)Ljava/lang/String;")
    public static final String method1614(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2342 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2497 + "</col>";
        }
    }

    @ObfuscatedName("at.n(ZB)Z")
    public final boolean method1040(boolean arg0) {
        int var2 = this.field1133;
        int var3 = this.field1134;
        int var4 = this.field1155;
        if (arg0) {
            var2 = this.field1124;
            var3 = this.field1137;
            var4 = this.field1119;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1109.method3082(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1109.method3082(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1109.method3082(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("at.k(ZI)Lcd;")
    public final class100 method1041(boolean arg0) {
        int var2 = this.field1133;
        int var3 = this.field1134;
        int var4 = this.field1155;
        if (arg0) {
            var2 = this.field1124;
            var3 = this.field1137;
            var4 = this.field1119;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2080(Statics.field1109, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2080(Statics.field1109, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2080(Statics.field1109, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1152 != 0) {
            var5.method2092(0, this.field1152, 0);
        }
        if (arg0 && this.field1135 != 0) {
            var5.method2092(0, this.field1135, 0);
        }
        if (this.field1146 != null) {
            for (int var10 = 0; var10 < this.field1146.length; var10++) {
                var5.method2093(this.field1146[var10], this.field1136[var10]);
            }
        }
        if (this.field1120 != null) {
            for (int var11 = 0; var11 < this.field1120.length; var11++) {
                var5.method2094(this.field1120[var11], this.field1121[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("at.f(ZI)Z")
    public final boolean method1042(boolean arg0) {
        int var2 = this.field1141;
        int var3 = this.field1110;
        if (arg0) {
            var2 = this.field1143;
            var3 = this.field1147;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1109.method3082(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1109.method3082(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("at.x(ZI)Lcd;")
    public final class100 method1063(boolean arg0) {
        int var2 = this.field1141;
        int var3 = this.field1110;
        if (arg0) {
            var2 = this.field1143;
            var3 = this.field1147;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2080(Statics.field1109, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2080(Statics.field1109, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1146 != null) {
            for (int var7 = 0; var7 < this.field1146.length; var7++) {
                var4.method2093(this.field1146[var7], this.field1136[var7]);
            }
        }
        if (this.field1120 != null) {
            for (int var8 = 0; var8 < this.field1120.length; var8++) {
                var4.method2094(this.field1120[var8], this.field1121[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("u.j(B)V")
    public static void method124() {
        field1140.method3532();
        field1113.method3532();
        field1114.method3532();
    }

    @ObfuscatedName("du.r(ZB)V")
    public static void method2684(boolean arg0) {
        if (Statics.field1150 != arg0) {
            method124();
            Statics.field1150 = arg0;
        }
    }
}
