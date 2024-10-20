package deob;

@ObfuscatedName("az")
public class class52 extends class205 {

    @ObfuscatedName("az.b")
    public static class194 field1141 = new class194(64);

    @ObfuscatedName("az.k")
    public static class194 field1132 = new class194(50);

    @ObfuscatedName("az.c")
    public static class194 field1114 = new class194(200);

    @ObfuscatedName("az.t")
    public int field1115;

    @ObfuscatedName("az.i")
    public int field1116;

    @ObfuscatedName("az.r")
    public String field1129 = "null";

    @ObfuscatedName("az.m")
    public short[] field1118;

    @ObfuscatedName("az.e")
    public short[] field1119;

    @ObfuscatedName("az.h")
    public short[] field1150;

    @ObfuscatedName("az.z")
    public short[] field1153;

    @ObfuscatedName("az.a")
    public int field1122 = 2000;

    @ObfuscatedName("az.w")
    public int field1123 = 0;

    @ObfuscatedName("az.g")
    public int field1124 = 0;

    @ObfuscatedName("az.y")
    public int field1127 = 0;

    @ObfuscatedName("az.f")
    public int field1126 = 0;

    @ObfuscatedName("az.q")
    public int field1139 = 0;

    @ObfuscatedName("az.n")
    public int field1128 = 0;

    @ObfuscatedName("az.v")
    public int field1112 = 1;

    @ObfuscatedName("az.ab")
    public boolean field1130 = false;

    @ObfuscatedName("az.ad")
    public String[] field1131 = new String[] { null, null, class158.field2463, null, null };

    @ObfuscatedName("az.an")
    public String[] field1125 = new String[] { null, null, null, null, class158.field2321 };

    @ObfuscatedName("az.au")
    public int field1133 = -1;

    @ObfuscatedName("az.ap")
    public int field1113 = -1;

    @ObfuscatedName("az.am")
    public int field1152 = 0;

    @ObfuscatedName("az.ae")
    public int field1136 = -1;

    @ObfuscatedName("az.ao")
    public int field1137 = -1;

    @ObfuscatedName("az.as")
    public int field1138 = 0;

    @ObfuscatedName("az.ai")
    public int field1159 = -1;

    @ObfuscatedName("az.ah")
    public int field1140 = -1;

    @ObfuscatedName("az.ax")
    public int field1120 = -1;

    @ObfuscatedName("az.aa")
    public int field1142 = -1;

    @ObfuscatedName("az.aq")
    public int field1143 = -1;

    @ObfuscatedName("az.ay")
    public int field1144 = -1;

    @ObfuscatedName("az.aj")
    public int[] field1145;

    @ObfuscatedName("az.ar")
    public int[] field1146;

    @ObfuscatedName("az.aw")
    public int field1147 = -1;

    @ObfuscatedName("az.at")
    public int field1148 = -1;

    @ObfuscatedName("az.af")
    public int field1149 = 128;

    @ObfuscatedName("az.al")
    public int field1107 = 128;

    @ObfuscatedName("az.ag")
    public int field1151 = 128;

    @ObfuscatedName("az.ac")
    public int field1160 = 0;

    @ObfuscatedName("az.ak")
    public int field1134 = 0;

    @ObfuscatedName("az.av")
    public int field1154 = 0;

    @ObfuscatedName("az.az")
    public boolean field1155 = false;

    @ObfuscatedName("az.bd")
    public int field1156 = -1;

    @ObfuscatedName("az.bt")
    public int field1157 = -1;

    @ObfuscatedName("az.bq")
    public int field1158 = -1;

    @ObfuscatedName("az.bj")
    public int field1110 = -1;

    @ObfuscatedName("c.s(II)Laz;")
    public static class52 method126(int arg0) {
        class52 var1 = (class52) field1141.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2925.method3014(10, arg0);
        class52 var3 = new class52();
        var3.field1115 = arg0;
        if (var2 != null) {
            var3.method992(new class120(var2));
        }
        var3.method973();
        if (var3.field1148 != -1) {
            var3.method976(method126(var3.field1148), method126(var3.field1147));
        }
        if (var3.field1157 != -1) {
            var3.method977(method126(var3.field1157), method126(var3.field1156));
        }
        if (var3.field1110 != -1) {
            var3.method978(method126(var3.field1110), method126(var3.field1158));
        }
        if (!Statics.field1092 && var3.field1130) {
            var3.field1129 = class158.field2537;
            var3.field1155 = false;
            var3.field1131 = null;
            var3.field1125 = null;
            var3.field1154 = 0;
        }
        field1141.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.j(I)V")
    public void method973() {
    }

    @ObfuscatedName("az.p(Lds;I)V")
    public void method992(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method975(arg0, var2);
        }
    }

    @ObfuscatedName("az.x(Lds;II)V")
    public void method975(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1116 = arg0.method2430();
        } else if (arg1 == 2) {
            this.field1129 = arg0.method2346();
        } else if (arg1 == 4) {
            this.field1122 = arg0.method2430();
        } else if (arg1 == 5) {
            this.field1123 = arg0.method2430();
        } else if (arg1 == 6) {
            this.field1124 = arg0.method2430();
        } else if (arg1 == 7) {
            this.field1126 = arg0.method2430();
            if (this.field1126 > 32767) {
                this.field1126 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1139 = arg0.method2430();
            if (this.field1139 > 32767) {
                this.field1139 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1128 = 1;
        } else if (arg1 == 12) {
            this.field1112 = arg0.method2343();
        } else if (arg1 == 16) {
            this.field1130 = true;
        } else if (arg1 == 23) {
            this.field1133 = arg0.method2430();
            this.field1152 = arg0.method2338();
        } else if (arg1 == 24) {
            this.field1113 = arg0.method2430();
        } else if (arg1 == 25) {
            this.field1136 = arg0.method2430();
            this.field1138 = arg0.method2338();
        } else if (arg1 == 26) {
            this.field1137 = arg0.method2430();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1131[arg1 - 30] = arg0.method2346();
            if (this.field1131[arg1 - 30].equalsIgnoreCase(class158.field2346)) {
                this.field1131[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1125[arg1 - 35] = arg0.method2346();
        } else if (arg1 == 40) {
            int var3 = arg0.method2338();
            this.field1118 = new short[var3];
            this.field1119 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1118[var4] = (short) arg0.method2430();
                this.field1119[var4] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2338();
            this.field1150 = new short[var5];
            this.field1153 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1150[var6] = (short) arg0.method2430();
                this.field1153[var6] = (short) arg0.method2430();
            }
        } else if (arg1 == 65) {
            this.field1155 = true;
        } else if (arg1 == 78) {
            this.field1159 = arg0.method2430();
        } else if (arg1 == 79) {
            this.field1140 = arg0.method2430();
        } else if (arg1 == 90) {
            this.field1120 = arg0.method2430();
        } else if (arg1 == 91) {
            this.field1143 = arg0.method2430();
        } else if (arg1 == 92) {
            this.field1142 = arg0.method2430();
        } else if (arg1 == 93) {
            this.field1144 = arg0.method2430();
        } else if (arg1 == 95) {
            this.field1127 = arg0.method2430();
        } else if (arg1 == 97) {
            this.field1147 = arg0.method2430();
        } else if (arg1 == 98) {
            this.field1148 = arg0.method2430();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1145 == null) {
                this.field1145 = new int[10];
                this.field1146 = new int[10];
            }
            this.field1145[arg1 - 100] = arg0.method2430();
            this.field1146[arg1 - 100] = arg0.method2430();
        } else if (arg1 == 110) {
            this.field1149 = arg0.method2430();
        } else if (arg1 == 111) {
            this.field1107 = arg0.method2430();
        } else if (arg1 == 112) {
            this.field1151 = arg0.method2430();
        } else if (arg1 == 113) {
            this.field1160 = arg0.method2339();
        } else if (arg1 == 114) {
            this.field1134 = arg0.method2339() * 5;
        } else if (arg1 == 115) {
            this.field1154 = arg0.method2338();
        } else if (arg1 == 139) {
            this.field1156 = arg0.method2430();
        } else if (arg1 == 140) {
            this.field1157 = arg0.method2430();
        } else if (arg1 == 148) {
            this.field1158 = arg0.method2430();
        } else if (arg1 == 149) {
            this.field1110 = arg0.method2430();
        }
    }

    @ObfuscatedName("az.d(Laz;Laz;B)V")
    public void method976(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1127 = arg0.field1127;
        this.field1126 = arg0.field1126;
        this.field1139 = arg0.field1139;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1150 = arg0.field1150;
        this.field1153 = arg0.field1153;
        this.field1129 = arg1.field1129;
        this.field1130 = arg1.field1130;
        this.field1112 = arg1.field1112;
        this.field1128 = 1;
    }

    @ObfuscatedName("az.u(Laz;Laz;I)V")
    public void method977(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1127 = arg0.field1127;
        this.field1126 = arg0.field1126;
        this.field1139 = arg0.field1139;
        this.field1118 = arg1.field1118;
        this.field1119 = arg1.field1119;
        this.field1150 = arg1.field1150;
        this.field1153 = arg1.field1153;
        this.field1129 = arg1.field1129;
        this.field1130 = arg1.field1130;
        this.field1128 = arg1.field1128;
        this.field1133 = arg1.field1133;
        this.field1113 = arg1.field1113;
        this.field1159 = arg1.field1159;
        this.field1136 = arg1.field1136;
        this.field1137 = arg1.field1137;
        this.field1140 = arg1.field1140;
        this.field1120 = arg1.field1120;
        this.field1142 = arg1.field1142;
        this.field1143 = arg1.field1143;
        this.field1144 = arg1.field1144;
        this.field1154 = arg1.field1154;
        this.field1131 = arg1.field1131;
        this.field1125 = new String[5];
        if (arg1.field1125 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1125[var3] = arg1.field1125[var3];
            }
        }
        this.field1125[4] = class158.field2326;
        this.field1112 = 0;
    }

    @ObfuscatedName("az.o(Laz;Laz;B)V")
    public void method978(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1127 = arg0.field1127;
        this.field1126 = arg0.field1126;
        this.field1139 = arg0.field1139;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1150 = arg0.field1150;
        this.field1153 = arg0.field1153;
        this.field1128 = arg0.field1128;
        this.field1129 = arg1.field1129;
        this.field1112 = 0;
        this.field1130 = false;
        this.field1155 = false;
    }

    @ObfuscatedName("az.b(IB)Lcq;")
    public final class101 method1010(int arg0) {
        if (this.field1145 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1145[var3];
                }
            }
            if (var2 != -1) {
                return method126(var2).method1010(1);
            }
        }
        class101 var4 = class101.method2040(Statics.field1135, this.field1116, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1149 != 128 || this.field1107 != 128 || this.field1151 != 128) {
            var4.method2056(this.field1149, this.field1107, this.field1151);
        }
        if (this.field1118 != null) {
            for (int var5 = 0; var5 < this.field1118.length; var5++) {
                var4.method2053(this.field1118[var5], this.field1119[var5]);
            }
        }
        if (this.field1150 != null) {
            for (int var6 = 0; var6 < this.field1150.length; var6++) {
                var4.method2054(this.field1150[var6], this.field1153[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.k(II)Ldh;")
    public final class106 method980(int arg0) {
        if (this.field1145 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1145[var3];
                }
            }
            if (var2 != -1) {
                return method126(var2).method980(1);
            }
        }
        class106 var4 = (class106) field1132.method3484((long) this.field1115);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2040(Statics.field1135, this.field1116, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1149 != 128 || this.field1107 != 128 || this.field1151 != 128) {
            var5.method2056(this.field1149, this.field1107, this.field1151);
        }
        if (this.field1118 != null) {
            for (int var6 = 0; var6 < this.field1118.length; var6++) {
                var5.method2053(this.field1118[var6], this.field1119[var6]);
            }
        }
        if (this.field1150 != null) {
            for (int var7 = 0; var7 < this.field1150.length; var7++) {
                var5.method2054(this.field1150[var7], this.field1153[var7]);
            }
        }
        class106 var8 = var5.method2061(this.field1160 + 64, this.field1134 + 768, -50, -10, -50);
        var8.field1835 = true;
        field1132.method3486(var8, (long) this.field1115);
        return var8;
    }

    @ObfuscatedName("az.c(II)Laz;")
    public class52 method972(int arg0) {
        if (this.field1145 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1145[var3];
                }
            }
            if (var2 != -1) {
                return method126(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("x.l(IIIIIZS)Lcs;")
    public static final class79 method34(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1114.method3484(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method126(arg0);
        if (arg1 > 1 && var9.field1145 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1146[var11] && var9.field1146[var11] != 0) {
                    var10 = var9.field1145[var11];
                }
            }
            if (var10 != -1) {
                var9 = method126(var10);
            }
        }
        class106 var12 = var9.method980(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1148 != -1) {
            var13 = method34(var9.field1147, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1157 != -1) {
            var13 = method34(var9.field1156, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1110 != -1) {
            var13 = method34(var9.field1158, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1421;
        int var15 = Statics.field1420;
        int var16 = Statics.field1423;
        int[] var17 = new int[4];
        class80.method1663(var17);
        class79 var18 = new class79(36, 32);
        class80.method1694(var18.field1415, 36, 32);
        class80.method1665();
        class92.method1945();
        class92.method1948(16, 16);
        class92.field1589 = false;
        if (var9.field1110 != -1) {
            var13.method1570(0, 0);
        }
        int var19 = var9.field1122;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1597[var9.field1123] * var19 >> 16;
        int var21 = class92.field1598[var9.field1123] * var19 >> 16;
        var12.method2145();
        var12.method2157(0, var9.field1124, var9.field1127, var9.field1123, var9.field1126, var9.field1139 + var12.field1466 / 2 + var20, var9.field1139 + var21);
        if (var9.field1157 != -1) {
            var13.method1570(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1566(1);
        }
        if (arg2 >= 2) {
            var18.method1566(16777215);
        }
        if (arg3 != 0) {
            var18.method1567(arg3);
        }
        class80.method1694(var18.field1415, 36, 32);
        if (var9.field1148 != -1) {
            var13.method1570(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1128 == 1) {
            class225 var22 = Statics.field1568;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class158.field2419 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class158.field2479 + "</col>";
            }
            var22.method3743(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1114.method3486(var18, var6);
        }
        class80.method1694(var14, var15, var16);
        class80.method1676(var17);
        class92.method1945();
        class92.field1589 = true;
        return var18;
    }

    @ObfuscatedName("az.t(ZB)Z")
    public final boolean method982(boolean arg0) {
        int var2 = this.field1133;
        int var3 = this.field1113;
        int var4 = this.field1159;
        if (arg0) {
            var2 = this.field1136;
            var3 = this.field1137;
            var4 = this.field1140;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1135.method3047(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1135.method3047(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1135.method3047(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("az.i(ZI)Lcq;")
    public final class101 method983(boolean arg0) {
        int var2 = this.field1133;
        int var3 = this.field1113;
        int var4 = this.field1159;
        if (arg0) {
            var2 = this.field1136;
            var3 = this.field1137;
            var4 = this.field1140;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2040(Statics.field1135, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2040(Statics.field1135, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2040(Statics.field1135, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1152 != 0) {
            var5.method2052(0, this.field1152, 0);
        }
        if (arg0 && this.field1138 != 0) {
            var5.method2052(0, this.field1138, 0);
        }
        if (this.field1118 != null) {
            for (int var10 = 0; var10 < this.field1118.length; var10++) {
                var5.method2053(this.field1118[var10], this.field1119[var10]);
            }
        }
        if (this.field1150 != null) {
            for (int var11 = 0; var11 < this.field1150.length; var11++) {
                var5.method2054(this.field1150[var11], this.field1153[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("az.r(ZB)Z")
    public final boolean method984(boolean arg0) {
        int var2 = this.field1120;
        int var3 = this.field1142;
        if (arg0) {
            var2 = this.field1143;
            var3 = this.field1144;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1135.method3047(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1135.method3047(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("az.m(ZI)Lcq;")
    public final class101 method986(boolean arg0) {
        int var2 = this.field1120;
        int var3 = this.field1142;
        if (arg0) {
            var2 = this.field1143;
            var3 = this.field1144;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2040(Statics.field1135, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2040(Statics.field1135, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1118 != null) {
            for (int var7 = 0; var7 < this.field1118.length; var7++) {
                var4.method2053(this.field1118[var7], this.field1119[var7]);
            }
        }
        if (this.field1150 != null) {
            for (int var8 = 0; var8 < this.field1150.length; var8++) {
                var4.method2054(this.field1150[var8], this.field1153[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gz.e(B)V")
    public static void method3471() {
        field1114.method3491();
    }

    @ObfuscatedName("j.h(ZI)V")
    public static void method2(boolean arg0) {
        if (Statics.field1092 != arg0) {
            field1141.method3491();
            field1132.method3491();
            field1114.method3491();
            Statics.field1092 = arg0;
        }
    }
}
