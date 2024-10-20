package deob;

@ObfuscatedName("at")
public class class52 extends class204 {

    @ObfuscatedName("at.t")
    public static class193 field1100 = new class193(64);

    @ObfuscatedName("at.w")
    public static class193 field1101 = new class193(50);

    @ObfuscatedName("at.h")
    public static class193 field1130 = new class193(200);

    @ObfuscatedName("at.l")
    public int field1103;

    @ObfuscatedName("at.n")
    public int field1104;

    @ObfuscatedName("at.q")
    public String field1105 = "null";

    @ObfuscatedName("at.f")
    public short[] field1111;

    @ObfuscatedName("at.v")
    public short[] field1107;

    @ObfuscatedName("at.a")
    public short[] field1122;

    @ObfuscatedName("at.k")
    public short[] field1119;

    @ObfuscatedName("at.r")
    public int field1110 = 2000;

    @ObfuscatedName("at.i")
    public int field1109 = 0;

    @ObfuscatedName("at.j")
    public int field1132 = 0;

    @ObfuscatedName("at.z")
    public int field1113 = 0;

    @ObfuscatedName("at.m")
    public int field1114 = 0;

    @ObfuscatedName("at.g")
    public int field1098 = 0;

    @ObfuscatedName("at.c")
    public int field1102 = 0;

    @ObfuscatedName("at.x")
    public int field1115 = 1;

    @ObfuscatedName("at.ah")
    public boolean field1118 = false;

    @ObfuscatedName("at.ap")
    public String[] field1106 = new String[] { null, null, class157.field2505, null, null };

    @ObfuscatedName("at.aa")
    public String[] field1117 = new String[] { null, null, null, null, class157.field2308 };

    @ObfuscatedName("at.ay")
    public int field1121 = -1;

    @ObfuscatedName("at.ak")
    public int field1120 = -1;

    @ObfuscatedName("at.an")
    public int field1108 = 0;

    @ObfuscatedName("at.af")
    public int field1124 = -1;

    @ObfuscatedName("at.ao")
    public int field1125 = -1;

    @ObfuscatedName("at.as")
    public int field1126 = 0;

    @ObfuscatedName("at.am")
    public int field1127 = -1;

    @ObfuscatedName("at.ae")
    public int field1137 = -1;

    @ObfuscatedName("at.ax")
    public int field1123 = -1;

    @ObfuscatedName("at.aj")
    public int field1129 = -1;

    @ObfuscatedName("at.ab")
    public int field1131 = -1;

    @ObfuscatedName("at.av")
    public int field1116 = -1;

    @ObfuscatedName("at.aq")
    public int[] field1133;

    @ObfuscatedName("at.ac")
    public int[] field1134;

    @ObfuscatedName("at.ar")
    public int field1135 = -1;

    @ObfuscatedName("at.az")
    public int field1136 = -1;

    @ObfuscatedName("at.ad")
    public int field1096 = 128;

    @ObfuscatedName("at.au")
    public int field1142 = 128;

    @ObfuscatedName("at.aw")
    public int field1139 = 128;

    @ObfuscatedName("at.ag")
    public int field1140 = 0;

    @ObfuscatedName("at.al")
    public int field1141 = 0;

    @ObfuscatedName("at.ai")
    public int field1112 = 0;

    @ObfuscatedName("at.at")
    public boolean field1143 = false;

    @ObfuscatedName("at.bp")
    public int field1144 = -1;

    @ObfuscatedName("at.bg")
    public int field1145 = -1;

    @ObfuscatedName("j.o(Lfq;Lfq;ZLhp;I)V")
    public static void method567(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1128 = arg0;
        Statics.field2742 = arg1;
        Statics.field773 = arg2;
        Statics.field1099 = Statics.field1128.method3067(10);
        Statics.field592 = arg3;
    }

    @ObfuscatedName("cv.e(II)Lat;")
    public static class52 method1933(int arg0) {
        class52 var1 = (class52) field1100.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1128.method3057(10, arg0);
        class52 var3 = new class52();
        var3.field1103 = arg0;
        if (var2 != null) {
            var3.method989(new class119(var2));
        }
        var3.method988();
        if (var3.field1136 != -1) {
            var3.method997(method1933(var3.field1136), method1933(var3.field1135));
        }
        if (var3.field1145 != -1) {
            var3.method992(method1933(var3.field1145), method1933(var3.field1144));
        }
        if (!Statics.field773 && var3.field1118) {
            var3.field1105 = class157.field2360;
            var3.field1143 = false;
            var3.field1106 = null;
            var3.field1117 = null;
            var3.field1112 = 0;
        }
        field1100.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.u(I)V")
    public void method988() {
    }

    @ObfuscatedName("at.b(Ldi;I)V")
    public void method989(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1026(arg0, var2);
        }
    }

    @ObfuscatedName("at.p(Ldi;IB)V")
    public void method1026(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1104 = arg0.method2339();
        } else if (arg1 == 2) {
            this.field1105 = arg0.method2528();
        } else if (arg1 == 4) {
            this.field1110 = arg0.method2339();
        } else if (arg1 == 5) {
            this.field1109 = arg0.method2339();
        } else if (arg1 == 6) {
            this.field1132 = arg0.method2339();
        } else if (arg1 == 7) {
            this.field1114 = arg0.method2339();
            if (this.field1114 > 32767) {
                this.field1114 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1098 = arg0.method2339();
            if (this.field1098 > 32767) {
                this.field1098 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1102 = 1;
        } else if (arg1 == 12) {
            this.field1115 = arg0.method2342();
        } else if (arg1 == 16) {
            this.field1118 = true;
        } else if (arg1 == 23) {
            this.field1121 = arg0.method2339();
            this.field1108 = arg0.method2427();
        } else if (arg1 == 24) {
            this.field1120 = arg0.method2339();
        } else if (arg1 == 25) {
            this.field1124 = arg0.method2339();
            this.field1126 = arg0.method2427();
        } else if (arg1 == 26) {
            this.field1125 = arg0.method2339();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1106[arg1 - 30] = arg0.method2528();
            if (this.field1106[arg1 - 30].equalsIgnoreCase(class157.field2334)) {
                this.field1106[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1117[arg1 - 35] = arg0.method2528();
        } else if (arg1 == 40) {
            int var3 = arg0.method2427();
            this.field1111 = new short[var3];
            this.field1107 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1111[var4] = (short) arg0.method2339();
                this.field1107[var4] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2427();
            this.field1122 = new short[var5];
            this.field1119 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1122[var6] = (short) arg0.method2339();
                this.field1119[var6] = (short) arg0.method2339();
            }
        } else if (arg1 == 65) {
            this.field1143 = true;
        } else if (arg1 == 78) {
            this.field1127 = arg0.method2339();
        } else if (arg1 == 79) {
            this.field1137 = arg0.method2339();
        } else if (arg1 == 90) {
            this.field1123 = arg0.method2339();
        } else if (arg1 == 91) {
            this.field1131 = arg0.method2339();
        } else if (arg1 == 92) {
            this.field1129 = arg0.method2339();
        } else if (arg1 == 93) {
            this.field1116 = arg0.method2339();
        } else if (arg1 == 95) {
            this.field1113 = arg0.method2339();
        } else if (arg1 == 97) {
            this.field1135 = arg0.method2339();
        } else if (arg1 == 98) {
            this.field1136 = arg0.method2339();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1133 == null) {
                this.field1133 = new int[10];
                this.field1134 = new int[10];
            }
            this.field1133[arg1 - 100] = arg0.method2339();
            this.field1134[arg1 - 100] = arg0.method2339();
        } else if (arg1 == 110) {
            this.field1096 = arg0.method2339();
        } else if (arg1 == 111) {
            this.field1142 = arg0.method2339();
        } else if (arg1 == 112) {
            this.field1139 = arg0.method2339();
        } else if (arg1 == 113) {
            this.field1140 = arg0.method2338();
        } else if (arg1 == 114) {
            this.field1141 = arg0.method2338();
        } else if (arg1 == 115) {
            this.field1112 = arg0.method2427();
        } else if (arg1 == 139) {
            this.field1144 = arg0.method2339();
        } else if (arg1 == 140) {
            this.field1145 = arg0.method2339();
        }
    }

    @ObfuscatedName("at.s(Lat;Lat;B)V")
    public void method997(class52 arg0, class52 arg1) {
        this.field1104 = arg0.field1104;
        this.field1110 = arg0.field1110;
        this.field1109 = arg0.field1109;
        this.field1132 = arg0.field1132;
        this.field1113 = arg0.field1113;
        this.field1114 = arg0.field1114;
        this.field1098 = arg0.field1098;
        this.field1111 = arg0.field1111;
        this.field1107 = arg0.field1107;
        this.field1122 = arg0.field1122;
        this.field1119 = arg0.field1119;
        this.field1105 = arg1.field1105;
        this.field1118 = arg1.field1118;
        this.field1115 = arg1.field1115;
        this.field1102 = 1;
    }

    @ObfuscatedName("at.y(Lat;Lat;B)V")
    public void method992(class52 arg0, class52 arg1) {
        this.field1104 = arg0.field1104;
        this.field1110 = arg0.field1110;
        this.field1109 = arg0.field1109;
        this.field1132 = arg0.field1132;
        this.field1113 = arg0.field1113;
        this.field1114 = arg0.field1114;
        this.field1098 = arg0.field1098;
        this.field1111 = arg1.field1111;
        this.field1107 = arg1.field1107;
        this.field1122 = arg1.field1122;
        this.field1119 = arg1.field1119;
        this.field1105 = arg1.field1105;
        this.field1118 = arg1.field1118;
        this.field1102 = arg1.field1102;
        this.field1121 = arg1.field1121;
        this.field1120 = arg1.field1120;
        this.field1127 = arg1.field1127;
        this.field1124 = arg1.field1124;
        this.field1125 = arg1.field1125;
        this.field1137 = arg1.field1137;
        this.field1123 = arg1.field1123;
        this.field1129 = arg1.field1129;
        this.field1131 = arg1.field1131;
        this.field1116 = arg1.field1116;
        this.field1112 = arg1.field1112;
        this.field1106 = arg1.field1106;
        this.field1117 = new String[5];
        if (arg1.field1117 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1117[var3] = arg1.field1117[var3];
            }
        }
        this.field1117[4] = class157.field2487;
        this.field1115 = 0;
    }

    @ObfuscatedName("at.t(II)Lcf;")
    public final class100 method993(int arg0) {
        if (this.field1133 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1134[var3] && this.field1134[var3] != 0) {
                    var2 = this.field1133[var3];
                }
            }
            if (var2 != -1) {
                return method1933(var2).method993(1);
            }
        }
        class100 var4 = class100.method2040(Statics.field2742, this.field1104, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1096 != 128 || this.field1142 != 128 || this.field1139 != 128) {
            var4.method2042(this.field1096, this.field1142, this.field1139);
        }
        if (this.field1111 != null) {
            for (int var5 = 0; var5 < this.field1111.length; var5++) {
                var4.method2062(this.field1111[var5], this.field1107[var5]);
            }
        }
        if (this.field1122 != null) {
            for (int var6 = 0; var6 < this.field1122.length; var6++) {
                var4.method2052(this.field1122[var6], this.field1119[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("at.w(II)Ldk;")
    public final class105 method994(int arg0) {
        if (this.field1133 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1134[var3] && this.field1134[var3] != 0) {
                    var2 = this.field1133[var3];
                }
            }
            if (var2 != -1) {
                return method1933(var2).method994(1);
            }
        }
        class105 var4 = (class105) field1101.method3510((long) this.field1103);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2040(Statics.field2742, this.field1104, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1096 != 128 || this.field1142 != 128 || this.field1139 != 128) {
            var5.method2042(this.field1096, this.field1142, this.field1139);
        }
        if (this.field1111 != null) {
            for (int var6 = 0; var6 < this.field1111.length; var6++) {
                var5.method2062(this.field1111[var6], this.field1107[var6]);
            }
        }
        if (this.field1122 != null) {
            for (int var7 = 0; var7 < this.field1122.length; var7++) {
                var5.method2052(this.field1122[var7], this.field1119[var7]);
            }
        }
        class105 var8 = var5.method2059(this.field1140 + 64, this.field1141 * 5 + 768, -50, -10, -50);
        var8.field1805 = true;
        field1101.method3512(var8, (long) this.field1103);
        return var8;
    }

    @ObfuscatedName("at.h(II)Lat;")
    public class52 method995(int arg0) {
        if (this.field1133 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1134[var3] && this.field1134[var3] != 0) {
                    var2 = this.field1133[var3];
                }
            }
            if (var2 != -1) {
                return method1933(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("t.d(IIIIIZI)Lcu;")
    public static final class79 method103(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1130.method3510(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method1933(arg0);
        if (arg1 > 1 && var9.field1133 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1134[var11] && var9.field1134[var11] != 0) {
                    var10 = var9.field1133[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1933(var10);
            }
        }
        class105 var12 = var9.method994(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1136 != -1) {
            var13 = method103(var9.field1135, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1145 != -1) {
            var13 = method103(var9.field1144, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1408;
        int var15 = Statics.field1403;
        int var16 = Statics.field1404;
        int[] var17 = new int[4];
        class80.method1650(var17);
        class79 var18 = new class79(36, 32);
        class80.method1646(var18.field1398, 36, 32);
        class80.method1654();
        class91.method1940();
        class91.method1999(16, 16);
        class91.field1550 = false;
        int var19 = var9.field1110;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1570[var9.field1109] * var19 >> 16;
        int var21 = class91.field1571[var9.field1109] * var19 >> 16;
        var12.method2125();
        var12.method2201(0, var9.field1132, var9.field1113, var9.field1109, var9.field1114, var9.field1098 + var12.field1441 / 2 + var20, var9.field1098 + var21);
        if (var9.field1145 != -1) {
            var13.method1553(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1618(1);
        }
        if (arg2 >= 2) {
            var18.method1618(16777215);
        }
        if (arg3 != 0) {
            var18.method1636(arg3);
        }
        class80.method1646(var18.field1398, 36, 32);
        if (var9.field1136 != -1) {
            var13.method1553(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1102 == 1) {
            class224 var22 = Statics.field592;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2464 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2469 + "</col>";
            }
            var22.method3785(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1130.method3512(var18, var6);
        }
        class80.method1646(var14, var15, var16);
        class80.method1651(var17);
        class91.method1940();
        class91.field1550 = true;
        return var18;
    }

    @ObfuscatedName("at.l(ZI)Z")
    public final boolean method1002(boolean arg0) {
        int var2 = this.field1121;
        int var3 = this.field1120;
        int var4 = this.field1127;
        if (arg0) {
            var2 = this.field1124;
            var3 = this.field1125;
            var4 = this.field1137;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2742.method3122(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2742.method3122(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2742.method3122(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("at.n(ZB)Lcf;")
    public final class100 method999(boolean arg0) {
        int var2 = this.field1121;
        int var3 = this.field1120;
        int var4 = this.field1127;
        if (arg0) {
            var2 = this.field1124;
            var3 = this.field1125;
            var4 = this.field1137;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2040(Statics.field2742, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2040(Statics.field2742, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2040(Statics.field2742, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1108 != 0) {
            var5.method2061(0, this.field1108, 0);
        }
        if (arg0 && this.field1126 != 0) {
            var5.method2061(0, this.field1126, 0);
        }
        if (this.field1111 != null) {
            for (int var10 = 0; var10 < this.field1111.length; var10++) {
                var5.method2062(this.field1111[var10], this.field1107[var10]);
            }
        }
        if (this.field1122 != null) {
            for (int var11 = 0; var11 < this.field1122.length; var11++) {
                var5.method2052(this.field1122[var11], this.field1119[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("at.q(ZI)Z")
    public final boolean method998(boolean arg0) {
        int var2 = this.field1123;
        int var3 = this.field1129;
        if (arg0) {
            var2 = this.field1131;
            var3 = this.field1116;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2742.method3122(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2742.method3122(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("at.f(ZB)Lcf;")
    public final class100 method1030(boolean arg0) {
        int var2 = this.field1123;
        int var3 = this.field1129;
        if (arg0) {
            var2 = this.field1131;
            var3 = this.field1116;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2040(Statics.field2742, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2040(Statics.field2742, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1111 != null) {
            for (int var7 = 0; var7 < this.field1111.length; var7++) {
                var4.method2062(this.field1111[var7], this.field1107[var7]);
            }
        }
        if (this.field1122 != null) {
            for (int var8 = 0; var8 < this.field1122.length; var8++) {
                var4.method2052(this.field1122[var8], this.field1119[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ak.v(ZB)V")
    public static void method673(boolean arg0) {
        if (Statics.field773 != arg0) {
            field1100.method3522();
            field1101.method3522();
            field1130.method3522();
            Statics.field773 = arg0;
        }
    }
}
