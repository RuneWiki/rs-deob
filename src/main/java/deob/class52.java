package deob;

@ObfuscatedName("aw")
public class class52 extends class205 {

    @ObfuscatedName("aw.p")
    public static class194 field1152 = new class194(64);

    @ObfuscatedName("aw.q")
    public static class194 field1121 = new class194(50);

    @ObfuscatedName("aw.m")
    public static class194 field1147 = new class194(200);

    @ObfuscatedName("aw.x")
    public int field1124;

    @ObfuscatedName("aw.z")
    public int field1125;

    @ObfuscatedName("aw.i")
    public String field1126 = "null";

    @ObfuscatedName("aw.t")
    public short[] field1127;

    @ObfuscatedName("aw.n")
    public short[] field1128;

    @ObfuscatedName("aw.u")
    public short[] field1164;

    @ObfuscatedName("aw.g")
    public short[] field1130;

    @ObfuscatedName("aw.j")
    public int field1149 = 2000;

    @ObfuscatedName("aw.h")
    public int field1132 = 0;

    @ObfuscatedName("aw.s")
    public int field1133 = 0;

    @ObfuscatedName("aw.f")
    public int field1122 = 0;

    @ObfuscatedName("aw.b")
    public int field1135 = 0;

    @ObfuscatedName("aw.l")
    public int field1115 = 0;

    @ObfuscatedName("aw.o")
    public int field1137 = 0;

    @ObfuscatedName("aw.v")
    public int field1151 = 1;

    @ObfuscatedName("aw.ad")
    public boolean field1139 = false;

    @ObfuscatedName("aw.ar")
    public String[] field1140 = new String[] { null, null, class158.field2509, null, null };

    @ObfuscatedName("aw.ah")
    public String[] field1141 = new String[] { null, null, null, null, class158.field2303 };

    @ObfuscatedName("aw.ay")
    public int field1142 = -1;

    @ObfuscatedName("aw.af")
    public int field1143 = -1;

    @ObfuscatedName("aw.al")
    public int field1144 = 0;

    @ObfuscatedName("aw.ai")
    public int field1163 = -1;

    @ObfuscatedName("aw.an")
    public int field1146 = -1;

    @ObfuscatedName("aw.az")
    public int field1162 = 0;

    @ObfuscatedName("aw.ac")
    public int field1148 = -1;

    @ObfuscatedName("aw.ao")
    public int field1166 = -1;

    @ObfuscatedName("aw.ax")
    public int field1150 = -1;

    @ObfuscatedName("aw.at")
    public int field1165 = -1;

    @ObfuscatedName("aw.ab")
    public int field1123 = -1;

    @ObfuscatedName("aw.ae")
    public int field1153 = -1;

    @ObfuscatedName("aw.au")
    public int[] field1154;

    @ObfuscatedName("aw.am")
    public int[] field1155;

    @ObfuscatedName("aw.aj")
    public int field1156 = -1;

    @ObfuscatedName("aw.aq")
    public int field1157 = -1;

    @ObfuscatedName("aw.ag")
    public int field1158 = 128;

    @ObfuscatedName("aw.ap")
    public int field1159 = 128;

    @ObfuscatedName("aw.ak")
    public int field1136 = 128;

    @ObfuscatedName("aw.as")
    public int field1161 = 0;

    @ObfuscatedName("aw.aa")
    public int field1168 = 0;

    @ObfuscatedName("aw.av")
    public int field1134 = 0;

    @ObfuscatedName("aw.aw")
    public boolean field1167 = false;

    @ObfuscatedName("aw.bb")
    public int field1131 = -1;

    @ObfuscatedName("aw.bh")
    public int field1129 = -1;

    @ObfuscatedName("aw.bg")
    public int field1120 = -1;

    @ObfuscatedName("aw.bm")
    public int field1145 = -1;

    @ObfuscatedName("x.a(II)Law;")
    public static class52 method176(int arg0) {
        class52 var1 = (class52) field1152.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2053.method3188(10, arg0);
        class52 var3 = new class52();
        var3.field1124 = arg0;
        if (var2 != null) {
            var3.method1104(new class120(var2));
        }
        var3.method1103();
        if (var3.field1157 != -1) {
            var3.method1122(method176(var3.field1157), method176(var3.field1156));
        }
        if (var3.field1129 != -1) {
            var3.method1107(method176(var3.field1129), method176(var3.field1131));
        }
        if (var3.field1145 != -1) {
            var3.method1108(method176(var3.field1145), method176(var3.field1120));
        }
        if (!Statics.field1118 && var3.field1139) {
            var3.field1126 = class158.field2367;
            var3.field1167 = false;
            var3.field1140 = null;
            var3.field1141 = null;
            var3.field1134 = 0;
        }
        field1152.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.w(I)V")
    public void method1103() {
    }

    @ObfuscatedName("aw.d(Ldx;I)V")
    public void method1104(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1105(arg0, var2);
        }
    }

    @ObfuscatedName("aw.c(Ldx;II)V")
    public void method1105(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1125 = arg0.method2464();
        } else if (arg1 == 2) {
            this.field1126 = arg0.method2470();
        } else if (arg1 == 4) {
            this.field1149 = arg0.method2464();
        } else if (arg1 == 5) {
            this.field1132 = arg0.method2464();
        } else if (arg1 == 6) {
            this.field1133 = arg0.method2464();
        } else if (arg1 == 7) {
            this.field1135 = arg0.method2464();
            if (this.field1135 > 32767) {
                this.field1135 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1115 = arg0.method2464();
            if (this.field1115 > 32767) {
                this.field1115 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1137 = 1;
        } else if (arg1 == 12) {
            this.field1151 = arg0.method2467();
        } else if (arg1 == 16) {
            this.field1139 = true;
        } else if (arg1 == 23) {
            this.field1142 = arg0.method2464();
            this.field1144 = arg0.method2462();
        } else if (arg1 == 24) {
            this.field1143 = arg0.method2464();
        } else if (arg1 == 25) {
            this.field1163 = arg0.method2464();
            this.field1162 = arg0.method2462();
        } else if (arg1 == 26) {
            this.field1146 = arg0.method2464();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1140[arg1 - 30] = arg0.method2470();
            if (this.field1140[arg1 - 30].equalsIgnoreCase(class158.field2304)) {
                this.field1140[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1141[arg1 - 35] = arg0.method2470();
        } else if (arg1 == 40) {
            int var3 = arg0.method2462();
            this.field1127 = new short[var3];
            this.field1128 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1127[var4] = (short) arg0.method2464();
                this.field1128[var4] = (short) arg0.method2464();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2462();
            this.field1164 = new short[var5];
            this.field1130 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1164[var6] = (short) arg0.method2464();
                this.field1130[var6] = (short) arg0.method2464();
            }
        } else if (arg1 == 65) {
            this.field1167 = true;
        } else if (arg1 == 78) {
            this.field1148 = arg0.method2464();
        } else if (arg1 == 79) {
            this.field1166 = arg0.method2464();
        } else if (arg1 == 90) {
            this.field1150 = arg0.method2464();
        } else if (arg1 == 91) {
            this.field1123 = arg0.method2464();
        } else if (arg1 == 92) {
            this.field1165 = arg0.method2464();
        } else if (arg1 == 93) {
            this.field1153 = arg0.method2464();
        } else if (arg1 == 95) {
            this.field1122 = arg0.method2464();
        } else if (arg1 == 97) {
            this.field1156 = arg0.method2464();
        } else if (arg1 == 98) {
            this.field1157 = arg0.method2464();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1154 == null) {
                this.field1154 = new int[10];
                this.field1155 = new int[10];
            }
            this.field1154[arg1 - 100] = arg0.method2464();
            this.field1155[arg1 - 100] = arg0.method2464();
        } else if (arg1 == 110) {
            this.field1158 = arg0.method2464();
        } else if (arg1 == 111) {
            this.field1159 = arg0.method2464();
        } else if (arg1 == 112) {
            this.field1136 = arg0.method2464();
        } else if (arg1 == 113) {
            this.field1161 = arg0.method2548();
        } else if (arg1 == 114) {
            this.field1168 = arg0.method2548() * 5;
        } else if (arg1 == 115) {
            this.field1134 = arg0.method2462();
        } else if (arg1 == 139) {
            this.field1131 = arg0.method2464();
        } else if (arg1 == 140) {
            this.field1129 = arg0.method2464();
        } else if (arg1 == 148) {
            this.field1120 = arg0.method2464();
        } else if (arg1 == 149) {
            this.field1145 = arg0.method2464();
        }
    }

    @ObfuscatedName("aw.y(Law;Law;I)V")
    public void method1122(class52 arg0, class52 arg1) {
        this.field1125 = arg0.field1125;
        this.field1149 = arg0.field1149;
        this.field1132 = arg0.field1132;
        this.field1133 = arg0.field1133;
        this.field1122 = arg0.field1122;
        this.field1135 = arg0.field1135;
        this.field1115 = arg0.field1115;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1164 = arg0.field1164;
        this.field1130 = arg0.field1130;
        this.field1126 = arg1.field1126;
        this.field1139 = arg1.field1139;
        this.field1151 = arg1.field1151;
        this.field1137 = 1;
    }

    @ObfuscatedName("aw.k(Law;Law;I)V")
    public void method1107(class52 arg0, class52 arg1) {
        this.field1125 = arg0.field1125;
        this.field1149 = arg0.field1149;
        this.field1132 = arg0.field1132;
        this.field1133 = arg0.field1133;
        this.field1122 = arg0.field1122;
        this.field1135 = arg0.field1135;
        this.field1115 = arg0.field1115;
        this.field1127 = arg1.field1127;
        this.field1128 = arg1.field1128;
        this.field1164 = arg1.field1164;
        this.field1130 = arg1.field1130;
        this.field1126 = arg1.field1126;
        this.field1139 = arg1.field1139;
        this.field1137 = arg1.field1137;
        this.field1142 = arg1.field1142;
        this.field1143 = arg1.field1143;
        this.field1148 = arg1.field1148;
        this.field1163 = arg1.field1163;
        this.field1146 = arg1.field1146;
        this.field1166 = arg1.field1166;
        this.field1150 = arg1.field1150;
        this.field1165 = arg1.field1165;
        this.field1123 = arg1.field1123;
        this.field1153 = arg1.field1153;
        this.field1134 = arg1.field1134;
        this.field1140 = arg1.field1140;
        this.field1141 = new String[5];
        if (arg1.field1141 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1141[var3] = arg1.field1141[var3];
            }
        }
        this.field1141[4] = class158.field2308;
        this.field1151 = 0;
    }

    @ObfuscatedName("aw.r(Law;Law;I)V")
    public void method1108(class52 arg0, class52 arg1) {
        this.field1125 = arg0.field1125;
        this.field1149 = arg0.field1149;
        this.field1132 = arg0.field1132;
        this.field1133 = arg0.field1133;
        this.field1122 = arg0.field1122;
        this.field1135 = arg0.field1135;
        this.field1115 = arg0.field1115;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1164 = arg0.field1164;
        this.field1130 = arg0.field1130;
        this.field1137 = arg0.field1137;
        this.field1126 = arg1.field1126;
        this.field1151 = 0;
        this.field1139 = false;
        this.field1167 = false;
    }

    @ObfuscatedName("aw.p(II)Lcx;")
    public final class101 method1130(int arg0) {
        if (this.field1154 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1155[var3] && this.field1155[var3] != 0) {
                    var2 = this.field1154[var3];
                }
            }
            if (var2 != -1) {
                return method176(var2).method1130(1);
            }
        }
        class101 var4 = class101.method2165(Statics.field2654, this.field1125, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1158 != 128 || this.field1159 != 128 || this.field1136 != 128) {
            var4.method2164(this.field1158, this.field1159, this.field1136);
        }
        if (this.field1127 != null) {
            for (int var5 = 0; var5 < this.field1127.length; var5++) {
                var4.method2161(this.field1127[var5], this.field1128[var5]);
            }
        }
        if (this.field1164 != null) {
            for (int var6 = 0; var6 < this.field1164.length; var6++) {
                var4.method2162(this.field1164[var6], this.field1130[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aw.q(IB)Ldr;")
    public final class106 method1110(int arg0) {
        if (this.field1154 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1155[var3] && this.field1155[var3] != 0) {
                    var2 = this.field1154[var3];
                }
            }
            if (var2 != -1) {
                return method176(var2).method1110(1);
            }
        }
        class106 var4 = (class106) field1121.method3579((long) this.field1124);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2165(Statics.field2654, this.field1125, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1158 != 128 || this.field1159 != 128 || this.field1136 != 128) {
            var5.method2164(this.field1158, this.field1159, this.field1136);
        }
        if (this.field1127 != null) {
            for (int var6 = 0; var6 < this.field1127.length; var6++) {
                var5.method2161(this.field1127[var6], this.field1128[var6]);
            }
        }
        if (this.field1164 != null) {
            for (int var7 = 0; var7 < this.field1164.length; var7++) {
                var5.method2162(this.field1164[var7], this.field1130[var7]);
            }
        }
        class106 var8 = var5.method2226(this.field1161 + 64, this.field1168 + 768, -50, -10, -50);
        var8.field1820 = true;
        field1121.method3581(var8, (long) this.field1124);
        return var8;
    }

    @ObfuscatedName("aw.m(II)Law;")
    public class52 method1152(int arg0) {
        if (this.field1154 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1155[var3] && this.field1155[var3] != 0) {
                    var2 = this.field1154[var3];
                }
            }
            if (var2 != -1) {
                return method176(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("aa.e(IIIIIZB)Lcd;")
    public static final class79 method1087(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1147.method3579(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method176(arg0);
        if (arg1 > 1 && var9.field1154 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1155[var11] && var9.field1155[var11] != 0) {
                    var10 = var9.field1154[var11];
                }
            }
            if (var10 != -1) {
                var9 = method176(var10);
            }
        }
        class106 var12 = var9.method1110(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1157 != -1) {
            var13 = method1087(var9.field1156, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1129 != -1) {
            var13 = method1087(var9.field1131, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1145 != -1) {
            var13 = method1087(var9.field1120, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1414;
        int var15 = Statics.field1418;
        int var16 = Statics.field1415;
        int[] var17 = new int[4];
        class80.method1819(var17);
        class79 var18 = new class79(36, 32);
        class80.method1830(var18.field1412, 36, 32);
        class80.method1781();
        class92.method2040();
        class92.method2043(16, 16);
        class92.field1574 = false;
        if (var9.field1145 != -1) {
            var13.method1686(0, 0);
        }
        int var19 = var9.field1149;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1594[var9.field1132] * var19 >> 16;
        int var21 = class92.field1595[var9.field1132] * var19 >> 16;
        var12.method2274();
        var12.method2276(0, var9.field1133, var9.field1122, var9.field1132, var9.field1135, var9.field1115 + var12.field1466 / 2 + var20, var9.field1115 + var21);
        if (var9.field1129 != -1) {
            var13.method1686(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1764(1);
        }
        if (arg2 >= 2) {
            var18.method1764(16777215);
        }
        if (arg3 != 0) {
            var18.method1682(arg3);
        }
        class80.method1830(var18.field1412, 36, 32);
        if (var9.field1157 != -1) {
            var13.method1686(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1137 == 1) {
            class225 var22 = Statics.field1160;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class158.field2463 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class158.field2461 + "</col>";
            }
            var22.method3855(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1147.method3581(var18, var6);
        }
        class80.method1830(var14, var15, var16);
        class80.method1837(var17);
        class92.method2040();
        class92.field1574 = true;
        return var18;
    }

    @ObfuscatedName("aw.x(ZI)Z")
    public final boolean method1112(boolean arg0) {
        int var2 = this.field1142;
        int var3 = this.field1143;
        int var4 = this.field1148;
        if (arg0) {
            var2 = this.field1163;
            var3 = this.field1146;
            var4 = this.field1166;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2654.method3214(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2654.method3214(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2654.method3214(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aw.z(ZI)Lcx;")
    public final class101 method1126(boolean arg0) {
        int var2 = this.field1142;
        int var3 = this.field1143;
        int var4 = this.field1148;
        if (arg0) {
            var2 = this.field1163;
            var3 = this.field1146;
            var4 = this.field1166;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2165(Statics.field2654, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2165(Statics.field2654, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2165(Statics.field2654, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1144 != 0) {
            var5.method2187(0, this.field1144, 0);
        }
        if (arg0 && this.field1162 != 0) {
            var5.method2187(0, this.field1162, 0);
        }
        if (this.field1127 != null) {
            for (int var10 = 0; var10 < this.field1127.length; var10++) {
                var5.method2161(this.field1127[var10], this.field1128[var10]);
            }
        }
        if (this.field1164 != null) {
            for (int var11 = 0; var11 < this.field1164.length; var11++) {
                var5.method2162(this.field1164[var11], this.field1130[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aw.i(ZB)Z")
    public final boolean method1109(boolean arg0) {
        int var2 = this.field1150;
        int var3 = this.field1165;
        if (arg0) {
            var2 = this.field1123;
            var3 = this.field1153;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2654.method3214(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2654.method3214(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aw.t(ZI)Lcx;")
    public final class101 method1115(boolean arg0) {
        int var2 = this.field1150;
        int var3 = this.field1165;
        if (arg0) {
            var2 = this.field1123;
            var3 = this.field1153;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2165(Statics.field2654, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2165(Statics.field2654, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1127 != null) {
            for (int var7 = 0; var7 < this.field1127.length; var7++) {
                var4.method2161(this.field1127[var7], this.field1128[var7]);
            }
        }
        if (this.field1164 != null) {
            for (int var8 = 0; var8 < this.field1164.length; var8++) {
                var4.method2162(this.field1164[var8], this.field1130[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("y.n(I)V")
    public static void method54() {
        field1152.method3582();
        field1121.method3582();
        field1147.method3582();
    }

    @ObfuscatedName("cz.u(ZB)V")
    public static void method1875(boolean arg0) {
        if (Statics.field1118 != arg0) {
            method54();
            Statics.field1118 = arg0;
        }
    }
}
