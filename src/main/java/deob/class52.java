package deob;

@ObfuscatedName("ae")
public class class52 extends class204 {

    @ObfuscatedName("ae.m")
    public static class193 field1138 = new class193(64);

    @ObfuscatedName("ae.j")
    public static class193 field1112 = new class193(50);

    @ObfuscatedName("ae.n")
    public static class193 field1156 = new class193(200);

    @ObfuscatedName("ae.h")
    public int field1111;

    @ObfuscatedName("ae.i")
    public int field1115;

    @ObfuscatedName("ae.v")
    public String field1116 = "null";

    @ObfuscatedName("ae.z")
    public short[] field1117;

    @ObfuscatedName("ae.u")
    public short[] field1118;

    @ObfuscatedName("ae.t")
    public short[] field1109;

    @ObfuscatedName("ae.b")
    public short[] field1120;

    @ObfuscatedName("ae.c")
    public int field1128 = 2000;

    @ObfuscatedName("ae.x")
    public int field1142 = 0;

    @ObfuscatedName("ae.d")
    public int field1123 = 0;

    @ObfuscatedName("ae.p")
    public int field1150 = 0;

    @ObfuscatedName("ae.q")
    public int field1125 = 0;

    @ObfuscatedName("ae.w")
    public int field1126 = 0;

    @ObfuscatedName("ae.k")
    public int field1127 = 0;

    @ObfuscatedName("ae.o")
    public int field1144 = 1;

    @ObfuscatedName("ae.ad")
    public boolean field1129 = false;

    @ObfuscatedName("ae.at")
    public String[] field1130 = new String[] { null, null, class157.field2294, null, null };

    @ObfuscatedName("ae.aw")
    public String[] field1136 = new String[] { null, null, null, null, class157.field2478 };

    @ObfuscatedName("ae.ax")
    public int field1114 = -1;

    @ObfuscatedName("ae.ak")
    public int field1124 = -1;

    @ObfuscatedName("ae.ah")
    public int field1134 = 0;

    @ObfuscatedName("ae.ac")
    public int field1135 = -1;

    @ObfuscatedName("ae.as")
    public int field1140 = -1;

    @ObfuscatedName("ae.ao")
    public int field1137 = 0;

    @ObfuscatedName("ae.am")
    public int field1131 = -1;

    @ObfuscatedName("ae.ai")
    public int field1139 = -1;

    @ObfuscatedName("ae.ab")
    public int field1107 = -1;

    @ObfuscatedName("ae.al")
    public int field1141 = -1;

    @ObfuscatedName("ae.ar")
    public int field1122 = -1;

    @ObfuscatedName("ae.aa")
    public int field1143 = -1;

    @ObfuscatedName("ae.ag")
    public int[] field1145;

    @ObfuscatedName("ae.an")
    public int[] field1154;

    @ObfuscatedName("ae.av")
    public int field1146 = -1;

    @ObfuscatedName("ae.aj")
    public int field1121 = -1;

    @ObfuscatedName("ae.ap")
    public int field1108 = 128;

    @ObfuscatedName("ae.aq")
    public int field1149 = 128;

    @ObfuscatedName("ae.af")
    public int field1113 = 128;

    @ObfuscatedName("ae.ay")
    public int field1151 = 0;

    @ObfuscatedName("ae.au")
    public int field1152 = 0;

    @ObfuscatedName("ae.az")
    public int field1153 = 0;

    @ObfuscatedName("ae.ae")
    public boolean field1133 = false;

    @ObfuscatedName("ae.bd")
    public int field1155 = -1;

    @ObfuscatedName("ae.br")
    public int field1132 = -1;

    @ObfuscatedName("bk.a(II)Lae;")
    public static class52 method1531(int arg0) {
        class52 var1 = (class52) field1138.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1147.method3025(10, arg0);
        class52 var3 = new class52();
        var3.field1111 = arg0;
        if (var2 != null) {
            var3.method1018(new class119(var2));
        }
        var3.method1045();
        if (var3.field1121 != -1) {
            var3.method1020(method1531(var3.field1121), method1531(var3.field1146));
        }
        if (var3.field1132 != -1) {
            var3.method1021(method1531(var3.field1132), method1531(var3.field1155));
        }
        if (!Statics.field1110 && var3.field1129) {
            var3.field1116 = class157.field2333;
            var3.field1133 = false;
            var3.field1130 = null;
            var3.field1136 = null;
            var3.field1153 = 0;
        }
        field1138.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.r(I)V")
    public void method1045() {
    }

    @ObfuscatedName("ae.f(Lds;I)V")
    public void method1018(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method1019(arg0, var2);
        }
    }

    @ObfuscatedName("ae.s(Lds;II)V")
    public void method1019(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1115 = arg0.method2347();
        } else if (arg1 == 2) {
            this.field1116 = arg0.method2353();
        } else if (arg1 == 4) {
            this.field1128 = arg0.method2347();
        } else if (arg1 == 5) {
            this.field1142 = arg0.method2347();
        } else if (arg1 == 6) {
            this.field1123 = arg0.method2347();
        } else if (arg1 == 7) {
            this.field1125 = arg0.method2347();
            if (this.field1125 > 32767) {
                this.field1125 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1126 = arg0.method2347();
            if (this.field1126 > 32767) {
                this.field1126 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1127 = 1;
        } else if (arg1 == 12) {
            this.field1144 = arg0.method2350();
        } else if (arg1 == 16) {
            this.field1129 = true;
        } else if (arg1 == 23) {
            this.field1114 = arg0.method2347();
            this.field1134 = arg0.method2412();
        } else if (arg1 == 24) {
            this.field1124 = arg0.method2347();
        } else if (arg1 == 25) {
            this.field1135 = arg0.method2347();
            this.field1137 = arg0.method2412();
        } else if (arg1 == 26) {
            this.field1140 = arg0.method2347();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1130[arg1 - 30] = arg0.method2353();
            if (this.field1130[arg1 - 30].equalsIgnoreCase(class157.field2296)) {
                this.field1130[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1136[arg1 - 35] = arg0.method2353();
        } else if (arg1 == 40) {
            int var3 = arg0.method2412();
            this.field1117 = new short[var3];
            this.field1118 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1117[var4] = (short) arg0.method2347();
                this.field1118[var4] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2412();
            this.field1109 = new short[var5];
            this.field1120 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1109[var6] = (short) arg0.method2347();
                this.field1120[var6] = (short) arg0.method2347();
            }
        } else if (arg1 == 65) {
            this.field1133 = true;
        } else if (arg1 == 78) {
            this.field1131 = arg0.method2347();
        } else if (arg1 == 79) {
            this.field1139 = arg0.method2347();
        } else if (arg1 == 90) {
            this.field1107 = arg0.method2347();
        } else if (arg1 == 91) {
            this.field1122 = arg0.method2347();
        } else if (arg1 == 92) {
            this.field1141 = arg0.method2347();
        } else if (arg1 == 93) {
            this.field1143 = arg0.method2347();
        } else if (arg1 == 95) {
            this.field1150 = arg0.method2347();
        } else if (arg1 == 97) {
            this.field1146 = arg0.method2347();
        } else if (arg1 == 98) {
            this.field1121 = arg0.method2347();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1145 == null) {
                this.field1145 = new int[10];
                this.field1154 = new int[10];
            }
            this.field1145[arg1 - 100] = arg0.method2347();
            this.field1154[arg1 - 100] = arg0.method2347();
        } else if (arg1 == 110) {
            this.field1108 = arg0.method2347();
        } else if (arg1 == 111) {
            this.field1149 = arg0.method2347();
        } else if (arg1 == 112) {
            this.field1113 = arg0.method2347();
        } else if (arg1 == 113) {
            this.field1151 = arg0.method2540();
        } else if (arg1 == 114) {
            this.field1152 = arg0.method2540() * 5;
        } else if (arg1 == 115) {
            this.field1153 = arg0.method2412();
        } else if (arg1 == 139) {
            this.field1155 = arg0.method2347();
        } else if (arg1 == 140) {
            this.field1132 = arg0.method2347();
        }
    }

    @ObfuscatedName("ae.y(Lae;Lae;B)V")
    public void method1020(class52 arg0, class52 arg1) {
        this.field1115 = arg0.field1115;
        this.field1128 = arg0.field1128;
        this.field1142 = arg0.field1142;
        this.field1123 = arg0.field1123;
        this.field1150 = arg0.field1150;
        this.field1125 = arg0.field1125;
        this.field1126 = arg0.field1126;
        this.field1117 = arg0.field1117;
        this.field1118 = arg0.field1118;
        this.field1109 = arg0.field1109;
        this.field1120 = arg0.field1120;
        this.field1116 = arg1.field1116;
        this.field1129 = arg1.field1129;
        this.field1144 = arg1.field1144;
        this.field1127 = 1;
    }

    @ObfuscatedName("ae.e(Lae;Lae;B)V")
    public void method1021(class52 arg0, class52 arg1) {
        this.field1115 = arg0.field1115;
        this.field1128 = arg0.field1128;
        this.field1142 = arg0.field1142;
        this.field1123 = arg0.field1123;
        this.field1150 = arg0.field1150;
        this.field1125 = arg0.field1125;
        this.field1126 = arg0.field1126;
        this.field1117 = arg1.field1117;
        this.field1118 = arg1.field1118;
        this.field1109 = arg1.field1109;
        this.field1120 = arg1.field1120;
        this.field1116 = arg1.field1116;
        this.field1129 = arg1.field1129;
        this.field1127 = arg1.field1127;
        this.field1114 = arg1.field1114;
        this.field1124 = arg1.field1124;
        this.field1131 = arg1.field1131;
        this.field1135 = arg1.field1135;
        this.field1140 = arg1.field1140;
        this.field1139 = arg1.field1139;
        this.field1107 = arg1.field1107;
        this.field1141 = arg1.field1141;
        this.field1122 = arg1.field1122;
        this.field1143 = arg1.field1143;
        this.field1153 = arg1.field1153;
        this.field1130 = arg1.field1130;
        this.field1136 = new String[5];
        if (arg1.field1136 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1136[var3] = arg1.field1136[var3];
            }
        }
        this.field1136[4] = class157.field2518;
        this.field1144 = 0;
    }

    @ObfuscatedName("ae.g(IB)Lch;")
    public final class100 method1059(int arg0) {
        if (this.field1145 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1154[var3] && this.field1154[var3] != 0) {
                    var2 = this.field1145[var3];
                }
            }
            if (var2 != -1) {
                return method1531(var2).method1059(1);
            }
        }
        class100 var4 = class100.method2066(Statics.field66, this.field1115, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1108 != 128 || this.field1149 != 128 || this.field1113 != 128) {
            var4.method2081(this.field1108, this.field1149, this.field1113);
        }
        if (this.field1117 != null) {
            for (int var5 = 0; var5 < this.field1117.length; var5++) {
                var4.method2101(this.field1117[var5], this.field1118[var5]);
            }
        }
        if (this.field1109 != null) {
            for (int var6 = 0; var6 < this.field1109.length; var6++) {
                var4.method2121(this.field1109[var6], this.field1120[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.m(II)Ldn;")
    public final class105 method1023(int arg0) {
        if (this.field1145 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1154[var3] && this.field1154[var3] != 0) {
                    var2 = this.field1145[var3];
                }
            }
            if (var2 != -1) {
                return method1531(var2).method1023(1);
            }
        }
        class105 var4 = (class105) field1112.method3507((long) this.field1111);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2066(Statics.field66, this.field1115, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1108 != 128 || this.field1149 != 128 || this.field1113 != 128) {
            var5.method2081(this.field1108, this.field1149, this.field1113);
        }
        if (this.field1117 != null) {
            for (int var6 = 0; var6 < this.field1117.length; var6++) {
                var5.method2101(this.field1117[var6], this.field1118[var6]);
            }
        }
        if (this.field1109 != null) {
            for (int var7 = 0; var7 < this.field1109.length; var7++) {
                var5.method2121(this.field1109[var7], this.field1120[var7]);
            }
        }
        class105 var8 = var5.method2086(this.field1151 + 64, this.field1152 + 768, -50, -10, -50);
        var8.field1813 = true;
        field1112.method3509(var8, (long) this.field1111);
        return var8;
    }

    @ObfuscatedName("ae.j(II)Lae;")
    public class52 method1024(int arg0) {
        if (this.field1145 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1154[var3] && this.field1154[var3] != 0) {
                    var2 = this.field1145[var3];
                }
            }
            if (var2 != -1) {
                return method1531(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fb.n(IIIIIZB)Lca;")
    public static final class79 method2996(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1156.method3507(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method1531(arg0);
        if (arg1 > 1 && var9.field1145 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1154[var11] && var9.field1154[var11] != 0) {
                    var10 = var9.field1145[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1531(var10);
            }
        }
        class105 var12 = var9.method1023(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1121 != -1) {
            var13 = method2996(var9.field1146, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1132 != -1) {
            var13 = method2996(var9.field1155, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1411;
        int var15 = Statics.field1413;
        int var16 = Statics.field1412;
        int[] var17 = new int[4];
        class80.method1700(var17);
        class79 var18 = new class79(36, 32);
        class80.method1696(var18.field1398, 36, 32);
        class80.method1744();
        class91.method2014();
        class91.method1967(16, 16);
        class91.field1558 = false;
        int var19 = var9.field1128;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1573[var9.field1142] * var19 >> 16;
        int var21 = class91.field1579[var9.field1142] * var19 >> 16;
        var12.method2152();
        var12.method2168(0, var9.field1123, var9.field1150, var9.field1142, var9.field1125, var9.field1126 + var12.field1449 / 2 + var20, var9.field1126 + var21);
        if (var9.field1132 != -1) {
            var13.method1679(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1610(1);
        }
        if (arg2 >= 2) {
            var18.method1610(16777215);
        }
        if (arg3 != 0) {
            var18.method1611(arg3);
        }
        class80.method1696(var18.field1398, 36, 32);
        if (var9.field1121 != -1) {
            var13.method1679(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1127 == 1) {
            Statics.field1375.method3772(method738(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1156.method3509(var18, var6);
        }
        class80.method1696(var14, var15, var16);
        class80.method1751(var17);
        class91.method2014();
        class91.field1558 = true;
        return var18;
    }

    @ObfuscatedName("ab.l(II)Ljava/lang/String;")
    public static final String method738(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2406 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2453 + "</col>";
        }
    }

    @ObfuscatedName("ae.h(ZI)Z")
    public final boolean method1025(boolean arg0) {
        int var2 = this.field1114;
        int var3 = this.field1124;
        int var4 = this.field1131;
        if (arg0) {
            var2 = this.field1135;
            var3 = this.field1140;
            var4 = this.field1139;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field66.method3027(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field66.method3027(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field66.method3027(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ae.i(ZI)Lch;")
    public final class100 method1026(boolean arg0) {
        int var2 = this.field1114;
        int var3 = this.field1124;
        int var4 = this.field1131;
        if (arg0) {
            var2 = this.field1135;
            var3 = this.field1140;
            var4 = this.field1139;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2066(Statics.field66, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2066(Statics.field66, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2066(Statics.field66, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1134 != 0) {
            var5.method2133(0, this.field1134, 0);
        }
        if (arg0 && this.field1137 != 0) {
            var5.method2133(0, this.field1137, 0);
        }
        if (this.field1117 != null) {
            for (int var10 = 0; var10 < this.field1117.length; var10++) {
                var5.method2101(this.field1117[var10], this.field1118[var10]);
            }
        }
        if (this.field1109 != null) {
            for (int var11 = 0; var11 < this.field1109.length; var11++) {
                var5.method2121(this.field1109[var11], this.field1120[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ae.v(ZI)Z")
    public final boolean method1027(boolean arg0) {
        int var2 = this.field1107;
        int var3 = this.field1141;
        if (arg0) {
            var2 = this.field1122;
            var3 = this.field1143;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field66.method3027(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field66.method3027(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ae.z(ZI)Lch;")
    public final class100 method1028(boolean arg0) {
        int var2 = this.field1107;
        int var3 = this.field1141;
        if (arg0) {
            var2 = this.field1122;
            var3 = this.field1143;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2066(Statics.field66, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2066(Statics.field66, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1117 != null) {
            for (int var7 = 0; var7 < this.field1117.length; var7++) {
                var4.method2101(this.field1117[var7], this.field1118[var7]);
            }
        }
        if (this.field1109 != null) {
            for (int var8 = 0; var8 < this.field1109.length; var8++) {
                var4.method2121(this.field1109[var8], this.field1120[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ap.u(S)V")
    public static void method937() {
        field1156.method3515();
    }
}
