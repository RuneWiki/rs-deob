package deob;

@ObfuscatedName("az")
public class class52 extends class204 {

    @ObfuscatedName("az.g")
    public static class193 field1134 = new class193(64);

    @ObfuscatedName("az.h")
    public static class193 field1129 = new class193(50);

    @ObfuscatedName("az.n")
    public static class193 field1107 = new class193(200);

    @ObfuscatedName("az.a")
    public int field1109;

    @ObfuscatedName("az.b")
    public int field1110;

    @ObfuscatedName("az.c")
    public String field1127 = "null";

    @ObfuscatedName("az.v")
    public short[] field1112;

    @ObfuscatedName("az.p")
    public short[] field1113;

    @ObfuscatedName("az.i")
    public short[] field1114;

    @ObfuscatedName("az.t")
    public short[] field1115;

    @ObfuscatedName("az.u")
    public int field1116 = 2000;

    @ObfuscatedName("az.e")
    public int field1100 = 0;

    @ObfuscatedName("az.m")
    public int field1118 = 0;

    @ObfuscatedName("az.s")
    public int field1119 = 0;

    @ObfuscatedName("az.x")
    public int field1120 = 0;

    @ObfuscatedName("az.y")
    public int field1121 = 0;

    @ObfuscatedName("az.w")
    public int field1122 = 0;

    @ObfuscatedName("az.o")
    public int field1123 = 1;

    @ObfuscatedName("az.aw")
    public boolean field1124 = false;

    @ObfuscatedName("az.an")
    public String[] field1131 = new String[] { null, null, class157.field2306, null, null };

    @ObfuscatedName("az.ab")
    public String[] field1126 = new String[] { null, null, null, null, class157.field2359 };

    @ObfuscatedName("az.al")
    public int field1147 = -1;

    @ObfuscatedName("az.ay")
    public int field1128 = -1;

    @ObfuscatedName("az.aq")
    public int field1105 = 0;

    @ObfuscatedName("az.ac")
    public int field1130 = -1;

    @ObfuscatedName("az.ak")
    public int field1101 = -1;

    @ObfuscatedName("az.am")
    public int field1132 = 0;

    @ObfuscatedName("az.aj")
    public int field1133 = -1;

    @ObfuscatedName("az.au")
    public int field1149 = -1;

    @ObfuscatedName("az.av")
    public int field1103 = -1;

    @ObfuscatedName("az.ad")
    public int field1136 = -1;

    @ObfuscatedName("az.ae")
    public int field1137 = -1;

    @ObfuscatedName("az.ai")
    public int field1151 = -1;

    @ObfuscatedName("az.at")
    public int[] field1139;

    @ObfuscatedName("az.ah")
    public int[] field1140;

    @ObfuscatedName("az.ao")
    public int field1141 = -1;

    @ObfuscatedName("az.aa")
    public int field1142 = -1;

    @ObfuscatedName("az.ax")
    public int field1135 = 128;

    @ObfuscatedName("az.as")
    public int field1106 = 128;

    @ObfuscatedName("az.ar")
    public int field1145 = 128;

    @ObfuscatedName("az.ap")
    public int field1146 = 0;

    @ObfuscatedName("az.ag")
    public int field1143 = 0;

    @ObfuscatedName("az.af")
    public int field1148 = 0;

    @ObfuscatedName("az.az")
    public boolean field1125 = false;

    @ObfuscatedName("az.bo")
    public int field1150 = -1;

    @ObfuscatedName("az.bu")
    public int field1108 = -1;

    @ObfuscatedName("q.z(II)Laz;")
    public static class52 method10(int arg0) {
        class52 var1 = (class52) field1134.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1102.method2986(10, arg0);
        class52 var3 = new class52();
        var3.field1109 = arg0;
        if (var2 != null) {
            var3.method990(new class119(var2));
        }
        var3.method1012();
        if (var3.field1142 != -1) {
            var3.method1009(method10(var3.field1142), method10(var3.field1141));
        }
        if (var3.field1108 != -1) {
            var3.method993(method10(var3.field1108), method10(var3.field1150));
        }
        if (!Statics.field1104 && var3.field1124) {
            var3.field1127 = class157.field2497;
            var3.field1125 = false;
            var3.field1131 = null;
            var3.field1126 = null;
            var3.field1148 = 0;
        }
        field1134.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.q(I)V")
    public void method1012() {
    }

    @ObfuscatedName("az.k(Lda;B)V")
    public void method990(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method1006(arg0, var2);
        }
    }

    @ObfuscatedName("az.f(Lda;II)V")
    public void method1006(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1110 = arg0.method2415();
        } else if (arg1 == 2) {
            this.field1127 = arg0.method2309();
        } else if (arg1 == 4) {
            this.field1116 = arg0.method2415();
        } else if (arg1 == 5) {
            this.field1100 = arg0.method2415();
        } else if (arg1 == 6) {
            this.field1118 = arg0.method2415();
        } else if (arg1 == 7) {
            this.field1120 = arg0.method2415();
            if (this.field1120 > 32767) {
                this.field1120 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1121 = arg0.method2415();
            if (this.field1121 > 32767) {
                this.field1121 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1122 = 1;
        } else if (arg1 == 12) {
            this.field1123 = arg0.method2306();
        } else if (arg1 == 16) {
            this.field1124 = true;
        } else if (arg1 == 23) {
            this.field1147 = arg0.method2415();
            this.field1105 = arg0.method2457();
        } else if (arg1 == 24) {
            this.field1128 = arg0.method2415();
        } else if (arg1 == 25) {
            this.field1130 = arg0.method2415();
            this.field1132 = arg0.method2457();
        } else if (arg1 == 26) {
            this.field1101 = arg0.method2415();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1131[arg1 - 30] = arg0.method2309();
            if (this.field1131[arg1 - 30].equalsIgnoreCase(class157.field2554)) {
                this.field1131[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1126[arg1 - 35] = arg0.method2309();
        } else if (arg1 == 40) {
            int var3 = arg0.method2457();
            this.field1112 = new short[var3];
            this.field1113 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1112[var4] = (short) arg0.method2415();
                this.field1113[var4] = (short) arg0.method2415();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2457();
            this.field1114 = new short[var5];
            this.field1115 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1114[var6] = (short) arg0.method2415();
                this.field1115[var6] = (short) arg0.method2415();
            }
        } else if (arg1 == 65) {
            this.field1125 = true;
        } else if (arg1 == 78) {
            this.field1133 = arg0.method2415();
        } else if (arg1 == 79) {
            this.field1149 = arg0.method2415();
        } else if (arg1 == 90) {
            this.field1103 = arg0.method2415();
        } else if (arg1 == 91) {
            this.field1137 = arg0.method2415();
        } else if (arg1 == 92) {
            this.field1136 = arg0.method2415();
        } else if (arg1 == 93) {
            this.field1151 = arg0.method2415();
        } else if (arg1 == 95) {
            this.field1119 = arg0.method2415();
        } else if (arg1 == 97) {
            this.field1141 = arg0.method2415();
        } else if (arg1 == 98) {
            this.field1142 = arg0.method2415();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1139 == null) {
                this.field1139 = new int[10];
                this.field1140 = new int[10];
            }
            this.field1139[arg1 - 100] = arg0.method2415();
            this.field1140[arg1 - 100] = arg0.method2415();
        } else if (arg1 == 110) {
            this.field1135 = arg0.method2415();
        } else if (arg1 == 111) {
            this.field1106 = arg0.method2415();
        } else if (arg1 == 112) {
            this.field1145 = arg0.method2415();
        } else if (arg1 == 113) {
            this.field1146 = arg0.method2423();
        } else if (arg1 == 114) {
            this.field1143 = arg0.method2423() * 5;
        } else if (arg1 == 115) {
            this.field1148 = arg0.method2457();
        } else if (arg1 == 139) {
            this.field1150 = arg0.method2415();
        } else if (arg1 == 140) {
            this.field1108 = arg0.method2415();
        }
    }

    @ObfuscatedName("az.d(Laz;Laz;I)V")
    public void method1009(class52 arg0, class52 arg1) {
        this.field1110 = arg0.field1110;
        this.field1116 = arg0.field1116;
        this.field1100 = arg0.field1100;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1120 = arg0.field1120;
        this.field1121 = arg0.field1121;
        this.field1112 = arg0.field1112;
        this.field1113 = arg0.field1113;
        this.field1114 = arg0.field1114;
        this.field1115 = arg0.field1115;
        this.field1127 = arg1.field1127;
        this.field1124 = arg1.field1124;
        this.field1123 = arg1.field1123;
        this.field1122 = 1;
    }

    @ObfuscatedName("az.l(Laz;Laz;B)V")
    public void method993(class52 arg0, class52 arg1) {
        this.field1110 = arg0.field1110;
        this.field1116 = arg0.field1116;
        this.field1100 = arg0.field1100;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1120 = arg0.field1120;
        this.field1121 = arg0.field1121;
        this.field1112 = arg1.field1112;
        this.field1113 = arg1.field1113;
        this.field1114 = arg1.field1114;
        this.field1115 = arg1.field1115;
        this.field1127 = arg1.field1127;
        this.field1124 = arg1.field1124;
        this.field1122 = arg1.field1122;
        this.field1147 = arg1.field1147;
        this.field1128 = arg1.field1128;
        this.field1133 = arg1.field1133;
        this.field1130 = arg1.field1130;
        this.field1101 = arg1.field1101;
        this.field1149 = arg1.field1149;
        this.field1103 = arg1.field1103;
        this.field1136 = arg1.field1136;
        this.field1137 = arg1.field1137;
        this.field1151 = arg1.field1151;
        this.field1148 = arg1.field1148;
        this.field1131 = arg1.field1131;
        this.field1126 = new String[5];
        if (arg1.field1126 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1126[var3] = arg1.field1126[var3];
            }
        }
        this.field1126[4] = class157.field2312;
        this.field1123 = 0;
    }

    @ObfuscatedName("az.r(IB)Lcn;")
    public final class100 method994(int arg0) {
        if (this.field1139 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1140[var3] && this.field1140[var3] != 0) {
                    var2 = this.field1139[var3];
                }
            }
            if (var2 != -1) {
                return method10(var2).method994(1);
            }
        }
        class100 var4 = class100.method2071(Statics.field1099, this.field1110, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1135 != 128 || this.field1106 != 128 || this.field1145 != 128) {
            var4.method2000(this.field1135, this.field1106, this.field1145);
        }
        if (this.field1112 != null) {
            for (int var5 = 0; var5 < this.field1112.length; var5++) {
                var4.method2010(this.field1112[var5], this.field1113[var5]);
            }
        }
        if (this.field1114 != null) {
            for (int var6 = 0; var6 < this.field1114.length; var6++) {
                var4.method2011(this.field1114[var6], this.field1115[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.g(IB)Ldb;")
    public final class105 method989(int arg0) {
        if (this.field1139 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1140[var3] && this.field1140[var3] != 0) {
                    var2 = this.field1139[var3];
                }
            }
            if (var2 != -1) {
                return method10(var2).method989(1);
            }
        }
        class105 var4 = (class105) field1129.method3439((long) this.field1109);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2071(Statics.field1099, this.field1110, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1135 != 128 || this.field1106 != 128 || this.field1145 != 128) {
            var5.method2000(this.field1135, this.field1106, this.field1145);
        }
        if (this.field1112 != null) {
            for (int var6 = 0; var6 < this.field1112.length; var6++) {
                var5.method2010(this.field1112[var6], this.field1113[var6]);
            }
        }
        if (this.field1114 != null) {
            for (int var7 = 0; var7 < this.field1114.length; var7++) {
                var5.method2011(this.field1114[var7], this.field1115[var7]);
            }
        }
        class105 var8 = var5.method2019(this.field1146 + 64, this.field1143 + 768, -50, -10, -50);
        var8.field1819 = true;
        field1129.method3429(var8, (long) this.field1109);
        return var8;
    }

    @ObfuscatedName("az.h(IB)Laz;")
    public class52 method1000(int arg0) {
        if (this.field1139 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1140[var3] && this.field1140[var3] != 0) {
                    var2 = this.field1139[var3];
                }
            }
            if (var2 != -1) {
                return method10(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cp.n(IIIIIZS)Lcg;")
    public static final class79 method1971(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1107.method3439(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method10(arg0);
        if (arg1 > 1 && var9.field1139 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1140[var11] && var9.field1140[var11] != 0) {
                    var10 = var9.field1139[var11];
                }
            }
            if (var10 != -1) {
                var9 = method10(var10);
            }
        }
        class105 var12 = var9.method989(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1142 != -1) {
            var13 = method1971(var9.field1141, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1108 != -1) {
            var13 = method1971(var9.field1150, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1415;
        int var15 = Statics.field1410;
        int var16 = Statics.field1412;
        int[] var17 = new int[4];
        class80.method1677(var17);
        class79 var18 = new class79(36, 32);
        class80.method1645(var18.field1400, 36, 32);
        class80.method1639();
        class91.method1892();
        class91.method1895(16, 16);
        class91.field1559 = false;
        int var19 = var9.field1116;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1580[var9.field1100] * var19 >> 16;
        int var21 = class91.field1566[var9.field1100] * var19 >> 16;
        var12.method2106();
        var12.method2118(0, var9.field1118, var9.field1119, var9.field1100, var9.field1120, var9.field1121 + var12.field1453 / 2 + var20, var9.field1121 + var21);
        if (var9.field1108 != -1) {
            var13.method1553(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1549(1);
        }
        if (arg2 >= 2) {
            var18.method1549(16777215);
        }
        if (arg3 != 0) {
            var18.method1550(arg3);
        }
        class80.method1645(var18.field1400, 36, 32);
        if (var9.field1142 != -1) {
            var13.method1553(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1122 == 1) {
            Statics.field1144.method3683(method817(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1107.method3429(var18, var6);
        }
        class80.method1645(var14, var15, var16);
        class80.method1633(var17);
        class91.method1892();
        class91.field1559 = true;
        return var18;
    }

    @ObfuscatedName("at.j(IB)Ljava/lang/String;")
    public static final String method817(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2470 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2468 + "</col>";
        }
    }

    @ObfuscatedName("az.a(ZB)Z")
    public final boolean method997(boolean arg0) {
        int var2 = this.field1147;
        int var3 = this.field1128;
        int var4 = this.field1133;
        if (arg0) {
            var2 = this.field1130;
            var3 = this.field1101;
            var4 = this.field1149;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1099.method3067(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1099.method3067(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1099.method3067(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("az.b(ZI)Lcn;")
    public final class100 method998(boolean arg0) {
        int var2 = this.field1147;
        int var3 = this.field1128;
        int var4 = this.field1133;
        if (arg0) {
            var2 = this.field1130;
            var3 = this.field1101;
            var4 = this.field1149;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2071(Statics.field1099, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2071(Statics.field1099, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2071(Statics.field1099, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1105 != 0) {
            var5.method2009(0, this.field1105, 0);
        }
        if (arg0 && this.field1132 != 0) {
            var5.method2009(0, this.field1132, 0);
        }
        if (this.field1112 != null) {
            for (int var10 = 0; var10 < this.field1112.length; var10++) {
                var5.method2010(this.field1112[var10], this.field1113[var10]);
            }
        }
        if (this.field1114 != null) {
            for (int var11 = 0; var11 < this.field1114.length; var11++) {
                var5.method2011(this.field1114[var11], this.field1115[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("az.c(ZB)Z")
    public final boolean method1027(boolean arg0) {
        int var2 = this.field1103;
        int var3 = this.field1136;
        if (arg0) {
            var2 = this.field1137;
            var3 = this.field1151;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1099.method3067(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1099.method3067(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("az.v(ZI)Lcn;")
    public final class100 method999(boolean arg0) {
        int var2 = this.field1103;
        int var3 = this.field1136;
        if (arg0) {
            var2 = this.field1137;
            var3 = this.field1151;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2071(Statics.field1099, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2071(Statics.field1099, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1112 != null) {
            for (int var7 = 0; var7 < this.field1112.length; var7++) {
                var4.method2010(this.field1112[var7], this.field1113[var7]);
            }
        }
        if (this.field1114 != null) {
            for (int var8 = 0; var8 < this.field1114.length; var8++) {
                var4.method2011(this.field1114[var8], this.field1115[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("be.p(ZI)V")
    public static void method1533(boolean arg0) {
        if (Statics.field1104 != arg0) {
            field1134.method3430();
            field1129.method3430();
            field1107.method3430();
            Statics.field1104 = arg0;
        }
    }
}
