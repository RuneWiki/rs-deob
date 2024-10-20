package deob;

@ObfuscatedName("aq")
public class class52 extends class204 {

    @ObfuscatedName("aq.y")
    public static class193 field1101 = new class193(64);

    @ObfuscatedName("aq.p")
    public static class193 field1109 = new class193(50);

    @ObfuscatedName("aq.t")
    public static class193 field1136 = new class193(200);

    @ObfuscatedName("aq.v")
    public int field1112;

    @ObfuscatedName("aq.l")
    public int field1105;

    @ObfuscatedName("aq.e")
    public String field1145 = "null";

    @ObfuscatedName("aq.a")
    public short[] field1111;

    @ObfuscatedName("aq.w")
    public short[] field1140;

    @ObfuscatedName("aq.d")
    public short[] field1103;

    @ObfuscatedName("aq.z")
    public short[] field1110;

    @ObfuscatedName("aq.s")
    public int field1146 = 2000;

    @ObfuscatedName("aq.j")
    public int field1125 = 0;

    @ObfuscatedName("aq.b")
    public int field1113 = 0;

    @ObfuscatedName("aq.r")
    public int field1114 = 0;

    @ObfuscatedName("aq.n")
    public int field1106 = 0;

    @ObfuscatedName("aq.c")
    public int field1116 = 0;

    @ObfuscatedName("aq.k")
    public int field1117 = 0;

    @ObfuscatedName("aq.x")
    public int field1118 = 1;

    @ObfuscatedName("aq.ar")
    public boolean field1119 = false;

    @ObfuscatedName("aq.as")
    public String[] field1120 = new String[] { null, null, class157.field2299, null, null };

    @ObfuscatedName("aq.ac")
    public String[] field1121 = new String[] { null, null, null, null, class157.field2300 };

    @ObfuscatedName("aq.ah")
    public int field1124 = -1;

    @ObfuscatedName("aq.al")
    public int field1123 = -1;

    @ObfuscatedName("aq.am")
    public int field1148 = 0;

    @ObfuscatedName("aq.ae")
    public int field1107 = -1;

    @ObfuscatedName("aq.ai")
    public int field1126 = -1;

    @ObfuscatedName("aq.aa")
    public int field1127 = 0;

    @ObfuscatedName("aq.ag")
    public int field1128 = -1;

    @ObfuscatedName("aq.an")
    public int field1129 = -1;

    @ObfuscatedName("aq.ap")
    public int field1130 = -1;

    @ObfuscatedName("aq.ay")
    public int field1131 = -1;

    @ObfuscatedName("aq.ax")
    public int field1132 = -1;

    @ObfuscatedName("aq.af")
    public int field1096 = -1;

    @ObfuscatedName("aq.av")
    public int[] field1134;

    @ObfuscatedName("aq.au")
    public int[] field1135;

    @ObfuscatedName("aq.ad")
    public int field1102 = -1;

    @ObfuscatedName("aq.ab")
    public int field1137 = -1;

    @ObfuscatedName("aq.ao")
    public int field1104 = 128;

    @ObfuscatedName("aq.az")
    public int field1139 = 128;

    @ObfuscatedName("aq.aj")
    public int field1138 = 128;

    @ObfuscatedName("aq.ak")
    public int field1141 = 0;

    @ObfuscatedName("aq.aw")
    public int field1142 = 0;

    @ObfuscatedName("aq.at")
    public int field1143 = 0;

    @ObfuscatedName("aq.aq")
    public boolean field1144 = false;

    @ObfuscatedName("aq.bo")
    public int field1108 = -1;

    @ObfuscatedName("aq.bf")
    public int field1133 = -1;

    @ObfuscatedName("cr.o(IB)Laq;")
    public static class52 method1979(int arg0) {
        class52 var1 = (class52) field1101.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1099.method3030(10, arg0);
        class52 var3 = new class52();
        var3.field1112 = arg0;
        if (var2 != null) {
            var3.method969(new class119(var2));
        }
        var3.method968();
        if (var3.field1137 != -1) {
            var3.method986(method1979(var3.field1137), method1979(var3.field1102));
        }
        if (var3.field1133 != -1) {
            var3.method972(method1979(var3.field1133), method1979(var3.field1108));
        }
        if (!Statics.field1035 && var3.field1119) {
            var3.field1145 = class157.field2406;
            var3.field1144 = false;
            var3.field1120 = null;
            var3.field1121 = null;
            var3.field1143 = 0;
        }
        field1101.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.f(I)V")
    public void method968() {
    }

    @ObfuscatedName("aq.i(Ldc;B)V")
    public void method969(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method997(arg0, var2);
        }
    }

    @ObfuscatedName("aq.h(Ldc;II)V")
    public void method997(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1105 = arg0.method2292();
        } else if (arg1 == 2) {
            this.field1145 = arg0.method2344();
        } else if (arg1 == 4) {
            this.field1146 = arg0.method2292();
        } else if (arg1 == 5) {
            this.field1125 = arg0.method2292();
        } else if (arg1 == 6) {
            this.field1113 = arg0.method2292();
        } else if (arg1 == 7) {
            this.field1106 = arg0.method2292();
            if (this.field1106 > 32767) {
                this.field1106 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1116 = arg0.method2292();
            if (this.field1116 > 32767) {
                this.field1116 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1117 = 1;
        } else if (arg1 == 12) {
            this.field1118 = arg0.method2295();
        } else if (arg1 == 16) {
            this.field1119 = true;
        } else if (arg1 == 23) {
            this.field1124 = arg0.method2292();
            this.field1148 = arg0.method2290();
        } else if (arg1 == 24) {
            this.field1123 = arg0.method2292();
        } else if (arg1 == 25) {
            this.field1107 = arg0.method2292();
            this.field1127 = arg0.method2290();
        } else if (arg1 == 26) {
            this.field1126 = arg0.method2292();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1120[arg1 - 30] = arg0.method2344();
            if (this.field1120[arg1 - 30].equalsIgnoreCase(class157.field2301)) {
                this.field1120[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1121[arg1 - 35] = arg0.method2344();
        } else if (arg1 == 40) {
            int var3 = arg0.method2290();
            this.field1111 = new short[var3];
            this.field1140 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1111[var4] = (short) arg0.method2292();
                this.field1140[var4] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2290();
            this.field1103 = new short[var5];
            this.field1110 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1103[var6] = (short) arg0.method2292();
                this.field1110[var6] = (short) arg0.method2292();
            }
        } else if (arg1 == 65) {
            this.field1144 = true;
        } else if (arg1 == 78) {
            this.field1128 = arg0.method2292();
        } else if (arg1 == 79) {
            this.field1129 = arg0.method2292();
        } else if (arg1 == 90) {
            this.field1130 = arg0.method2292();
        } else if (arg1 == 91) {
            this.field1132 = arg0.method2292();
        } else if (arg1 == 92) {
            this.field1131 = arg0.method2292();
        } else if (arg1 == 93) {
            this.field1096 = arg0.method2292();
        } else if (arg1 == 95) {
            this.field1114 = arg0.method2292();
        } else if (arg1 == 97) {
            this.field1102 = arg0.method2292();
        } else if (arg1 == 98) {
            this.field1137 = arg0.method2292();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1134 == null) {
                this.field1134 = new int[10];
                this.field1135 = new int[10];
            }
            this.field1134[arg1 - 100] = arg0.method2292();
            this.field1135[arg1 - 100] = arg0.method2292();
        } else if (arg1 == 110) {
            this.field1104 = arg0.method2292();
        } else if (arg1 == 111) {
            this.field1139 = arg0.method2292();
        } else if (arg1 == 112) {
            this.field1138 = arg0.method2292();
        } else if (arg1 == 113) {
            this.field1141 = arg0.method2435();
        } else if (arg1 == 114) {
            this.field1142 = arg0.method2435() * 5;
        } else if (arg1 == 115) {
            this.field1143 = arg0.method2290();
        } else if (arg1 == 139) {
            this.field1108 = arg0.method2292();
        } else if (arg1 == 140) {
            this.field1133 = arg0.method2292();
        }
    }

    @ObfuscatedName("aq.q(Laq;Laq;I)V")
    public void method986(class52 arg0, class52 arg1) {
        this.field1105 = arg0.field1105;
        this.field1146 = arg0.field1146;
        this.field1125 = arg0.field1125;
        this.field1113 = arg0.field1113;
        this.field1114 = arg0.field1114;
        this.field1106 = arg0.field1106;
        this.field1116 = arg0.field1116;
        this.field1111 = arg0.field1111;
        this.field1140 = arg0.field1140;
        this.field1103 = arg0.field1103;
        this.field1110 = arg0.field1110;
        this.field1145 = arg1.field1145;
        this.field1119 = arg1.field1119;
        this.field1118 = arg1.field1118;
        this.field1117 = 1;
    }

    @ObfuscatedName("aq.u(Laq;Laq;I)V")
    public void method972(class52 arg0, class52 arg1) {
        this.field1105 = arg0.field1105;
        this.field1146 = arg0.field1146;
        this.field1125 = arg0.field1125;
        this.field1113 = arg0.field1113;
        this.field1114 = arg0.field1114;
        this.field1106 = arg0.field1106;
        this.field1116 = arg0.field1116;
        this.field1111 = arg1.field1111;
        this.field1140 = arg1.field1140;
        this.field1103 = arg1.field1103;
        this.field1110 = arg1.field1110;
        this.field1145 = arg1.field1145;
        this.field1119 = arg1.field1119;
        this.field1117 = arg1.field1117;
        this.field1124 = arg1.field1124;
        this.field1123 = arg1.field1123;
        this.field1128 = arg1.field1128;
        this.field1107 = arg1.field1107;
        this.field1126 = arg1.field1126;
        this.field1129 = arg1.field1129;
        this.field1130 = arg1.field1130;
        this.field1131 = arg1.field1131;
        this.field1132 = arg1.field1132;
        this.field1096 = arg1.field1096;
        this.field1143 = arg1.field1143;
        this.field1120 = arg1.field1120;
        this.field1121 = new String[5];
        if (arg1.field1121 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1121[var3] = arg1.field1121[var3];
            }
        }
        this.field1121[4] = class157.field2305;
        this.field1118 = 0;
    }

    @ObfuscatedName("aq.m(II)Lck;")
    public final class100 method971(int arg0) {
        if (this.field1134 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1135[var3] && this.field1135[var3] != 0) {
                    var2 = this.field1134[var3];
                }
            }
            if (var2 != -1) {
                return method1979(var2).method971(1);
            }
        }
        class100 var4 = class100.method2000(Statics.field1100, this.field1105, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1104 != 128 || this.field1139 != 128 || this.field1138 != 128) {
            var4.method2016(this.field1104, this.field1139, this.field1138);
        }
        if (this.field1111 != null) {
            for (int var5 = 0; var5 < this.field1111.length; var5++) {
                var4.method2013(this.field1111[var5], this.field1140[var5]);
            }
        }
        if (this.field1103 != null) {
            for (int var6 = 0; var6 < this.field1103.length; var6++) {
                var4.method2014(this.field1103[var6], this.field1110[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.y(II)Ldm;")
    public final class105 method1010(int arg0) {
        if (this.field1134 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1135[var3] && this.field1135[var3] != 0) {
                    var2 = this.field1134[var3];
                }
            }
            if (var2 != -1) {
                return method1979(var2).method1010(1);
            }
        }
        class105 var4 = (class105) field1109.method3456((long) this.field1112);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2000(Statics.field1100, this.field1105, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1104 != 128 || this.field1139 != 128 || this.field1138 != 128) {
            var5.method2016(this.field1104, this.field1139, this.field1138);
        }
        if (this.field1111 != null) {
            for (int var6 = 0; var6 < this.field1111.length; var6++) {
                var5.method2013(this.field1111[var6], this.field1140[var6]);
            }
        }
        if (this.field1103 != null) {
            for (int var7 = 0; var7 < this.field1103.length; var7++) {
                var5.method2014(this.field1103[var7], this.field1110[var7]);
            }
        }
        class105 var8 = var5.method2036(this.field1141 + 64, this.field1142 + 768, -50, -10, -50);
        var8.field1815 = true;
        field1109.method3451(var8, (long) this.field1112);
        return var8;
    }

    @ObfuscatedName("aq.p(II)Laq;")
    public class52 method975(int arg0) {
        if (this.field1134 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1135[var3] && this.field1135[var3] != 0) {
                    var2 = this.field1134[var3];
                }
            }
            if (var2 != -1) {
                return method1979(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("client.t(IIIIIZB)Lcb;")
    public static final class79 method525(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1136.method3456(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method1979(arg0);
        if (arg1 > 1 && var9.field1134 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1135[var11] && var9.field1135[var11] != 0) {
                    var10 = var9.field1134[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1979(var10);
            }
        }
        class105 var12 = var9.method1010(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1137 != -1) {
            var13 = method525(var9.field1102, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1133 != -1) {
            var13 = method525(var9.field1108, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1398;
        int var15 = Statics.field1403;
        int var16 = Statics.field1397;
        int[] var17 = new int[4];
        class80.method1635(var17);
        class79 var18 = new class79(36, 32);
        class80.method1631(var18.field1392, 36, 32);
        class80.method1637();
        class91.method1897();
        class91.method1937(16, 16);
        class91.field1559 = false;
        int var19 = var9.field1146;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1579[var9.field1125] * var19 >> 16;
        int var21 = class91.field1580[var9.field1125] * var19 >> 16;
        var12.method2093();
        var12.method2103(0, var9.field1113, var9.field1114, var9.field1125, var9.field1106, var9.field1116 + var12.field1441 / 2 + var20, var9.field1116 + var21);
        if (var9.field1133 != -1) {
            var13.method1547(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1543(1);
        }
        if (arg2 >= 2) {
            var18.method1543(16777215);
        }
        if (arg3 != 0) {
            var18.method1544(arg3);
        }
        class80.method1631(var18.field1392, 36, 32);
        if (var9.field1137 != -1) {
            var13.method1547(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1117 == 1) {
            class224 var22 = Statics.field1954;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2336 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2414 + "</col>";
            }
            var22.method3723(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1136.method3451(var18, var6);
        }
        class80.method1631(var14, var15, var16);
        class80.method1685(var17);
        class91.method1897();
        class91.field1559 = true;
        return var18;
    }

    @ObfuscatedName("aq.g(ZI)Z")
    public final boolean method976(boolean arg0) {
        int var2 = this.field1124;
        int var3 = this.field1123;
        int var4 = this.field1128;
        if (arg0) {
            var2 = this.field1107;
            var3 = this.field1126;
            var4 = this.field1129;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1100.method2976(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1100.method2976(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1100.method2976(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.v(ZI)Lck;")
    public final class100 method977(boolean arg0) {
        int var2 = this.field1124;
        int var3 = this.field1123;
        int var4 = this.field1128;
        if (arg0) {
            var2 = this.field1107;
            var3 = this.field1126;
            var4 = this.field1129;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2000(Statics.field1100, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2000(Statics.field1100, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2000(Statics.field1100, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1148 != 0) {
            var5.method2012(0, this.field1148, 0);
        }
        if (arg0 && this.field1127 != 0) {
            var5.method2012(0, this.field1127, 0);
        }
        if (this.field1111 != null) {
            for (int var10 = 0; var10 < this.field1111.length; var10++) {
                var5.method2013(this.field1111[var10], this.field1140[var10]);
            }
        }
        if (this.field1103 != null) {
            for (int var11 = 0; var11 < this.field1103.length; var11++) {
                var5.method2014(this.field1103[var11], this.field1110[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.l(ZB)Z")
    public final boolean method978(boolean arg0) {
        int var2 = this.field1130;
        int var3 = this.field1131;
        if (arg0) {
            var2 = this.field1132;
            var3 = this.field1096;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1100.method2976(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1100.method2976(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.e(ZI)Lck;")
    public final class100 method979(boolean arg0) {
        int var2 = this.field1130;
        int var3 = this.field1131;
        if (arg0) {
            var2 = this.field1132;
            var3 = this.field1096;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2000(Statics.field1100, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2000(Statics.field1100, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1111 != null) {
            for (int var7 = 0; var7 < this.field1111.length; var7++) {
                var4.method2013(this.field1111[var7], this.field1140[var7]);
            }
        }
        if (this.field1103 != null) {
            for (int var8 = 0; var8 < this.field1103.length; var8++) {
                var4.method2014(this.field1103[var8], this.field1110[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aa.a(ZI)V")
    public static void method713(boolean arg0) {
        if (Statics.field1035 != arg0) {
            field1101.method3452();
            field1109.method3452();
            field1136.method3452();
            Statics.field1035 = arg0;
        }
    }
}
