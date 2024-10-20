package deob;

@ObfuscatedName("an")
public class class52 extends class204 {

    @ObfuscatedName("an.b")
    public static class193 field1088 = new class193(64);

    @ObfuscatedName("an.j")
    public static class193 field1089 = new class193(50);

    @ObfuscatedName("an.f")
    public static class193 field1090 = new class193(200);

    @ObfuscatedName("an.g")
    public int field1092;

    @ObfuscatedName("an.t")
    public int field1100;

    @ObfuscatedName("an.e")
    public String field1131 = "null";

    @ObfuscatedName("an.q")
    public short[] field1095;

    @ObfuscatedName("an.u")
    public short[] field1096;

    @ObfuscatedName("an.r")
    public short[] field1097;

    @ObfuscatedName("an.a")
    public short[] field1108;

    @ObfuscatedName("an.m")
    public int field1086 = 2000;

    @ObfuscatedName("an.y")
    public int field1103 = 0;

    @ObfuscatedName("an.x")
    public int field1101 = 0;

    @ObfuscatedName("an.n")
    public int field1102 = 0;

    @ObfuscatedName("an.v")
    public int field1129 = 0;

    @ObfuscatedName("an.s")
    public int field1104 = 0;

    @ObfuscatedName("an.w")
    public int field1105 = 0;

    @ObfuscatedName("an.p")
    public int field1106 = 1;

    @ObfuscatedName("an.ao")
    public boolean field1107 = false;

    @ObfuscatedName("an.ae")
    public String[] field1094 = new String[] { null, null, class157.field2294, null, null };

    @ObfuscatedName("an.ay")
    public String[] field1109 = new String[] { null, null, null, null, class157.field2470 };

    @ObfuscatedName("an.ad")
    public int field1099 = -1;

    @ObfuscatedName("an.as")
    public int field1111 = -1;

    @ObfuscatedName("an.ag")
    public int field1112 = 0;

    @ObfuscatedName("an.au")
    public int field1113 = -1;

    @ObfuscatedName("an.ar")
    public int field1087 = -1;

    @ObfuscatedName("an.az")
    public int field1115 = 0;

    @ObfuscatedName("an.aw")
    public int field1116 = -1;

    @ObfuscatedName("an.at")
    public int field1117 = -1;

    @ObfuscatedName("an.ap")
    public int field1125 = -1;

    @ObfuscatedName("an.al")
    public int field1119 = -1;

    @ObfuscatedName("an.aq")
    public int field1120 = -1;

    @ObfuscatedName("an.aa")
    public int field1121 = -1;

    @ObfuscatedName("an.ax")
    public int[] field1091;

    @ObfuscatedName("an.ah")
    public int[] field1085;

    @ObfuscatedName("an.av")
    public int field1124 = -1;

    @ObfuscatedName("an.af")
    public int field1093 = -1;

    @ObfuscatedName("an.ai")
    public int field1126 = 128;

    @ObfuscatedName("an.ak")
    public int field1127 = 128;

    @ObfuscatedName("an.ab")
    public int field1098 = 128;

    @ObfuscatedName("an.aj")
    public int field1122 = 0;

    @ObfuscatedName("an.ac")
    public int field1130 = 0;

    @ObfuscatedName("an.am")
    public int field1110 = 0;

    @ObfuscatedName("an.an")
    public boolean field1132 = false;

    @ObfuscatedName("an.ba")
    public int field1133 = -1;

    @ObfuscatedName("an.bf")
    public int field1134 = -1;

    @ObfuscatedName("n.k(Lfo;Lfo;ZLhz;I)V")
    public static void method536(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1123 = arg0;
        Statics.field2232 = arg1;
        Statics.field1531 = arg2;
        Statics.field2276 = Statics.field1123.method3059(10);
        Statics.field1128 = arg3;
    }

    @ObfuscatedName("dk.h(II)Lan;")
    public static class52 method2522(int arg0) {
        class52 var1 = (class52) field1088.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1123.method3118(10, arg0);
        class52 var3 = new class52();
        var3.field1092 = arg0;
        if (var2 != null) {
            var3.method975(new class119(var2));
        }
        var3.method1009();
        if (var3.field1093 != -1) {
            var3.method977(method2522(var3.field1093), method2522(var3.field1124));
        }
        if (var3.field1134 != -1) {
            var3.method992(method2522(var3.field1134), method2522(var3.field1133));
        }
        if (!Statics.field1531 && var3.field1107) {
            var3.field1131 = class157.field2514;
            var3.field1132 = false;
            var3.field1094 = null;
            var3.field1109 = null;
            var3.field1110 = 0;
        }
        field1088.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.o(I)V")
    public void method1009() {
    }

    @ObfuscatedName("an.z(Ldk;B)V")
    public void method975(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method976(arg0, var2);
        }
    }

    @ObfuscatedName("an.c(Ldk;II)V")
    public void method976(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1100 = arg0.method2332();
        } else if (arg1 == 2) {
            this.field1131 = arg0.method2337();
        } else if (arg1 == 4) {
            this.field1086 = arg0.method2332();
        } else if (arg1 == 5) {
            this.field1103 = arg0.method2332();
        } else if (arg1 == 6) {
            this.field1101 = arg0.method2332();
        } else if (arg1 == 7) {
            this.field1129 = arg0.method2332();
            if (this.field1129 > 32767) {
                this.field1129 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1104 = arg0.method2332();
            if (this.field1104 > 32767) {
                this.field1104 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1105 = 1;
        } else if (arg1 == 12) {
            this.field1106 = arg0.method2415();
        } else if (arg1 == 16) {
            this.field1107 = true;
        } else if (arg1 == 23) {
            this.field1099 = arg0.method2332();
            this.field1112 = arg0.method2330();
        } else if (arg1 == 24) {
            this.field1111 = arg0.method2332();
        } else if (arg1 == 25) {
            this.field1113 = arg0.method2332();
            this.field1115 = arg0.method2330();
        } else if (arg1 == 26) {
            this.field1087 = arg0.method2332();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1094[arg1 - 30] = arg0.method2337();
            if (this.field1094[arg1 - 30].equalsIgnoreCase(class157.field2296)) {
                this.field1094[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1109[arg1 - 35] = arg0.method2337();
        } else if (arg1 == 40) {
            int var3 = arg0.method2330();
            this.field1095 = new short[var3];
            this.field1096 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1095[var4] = (short) arg0.method2332();
                this.field1096[var4] = (short) arg0.method2332();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2330();
            this.field1097 = new short[var5];
            this.field1108 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1097[var6] = (short) arg0.method2332();
                this.field1108[var6] = (short) arg0.method2332();
            }
        } else if (arg1 == 65) {
            this.field1132 = true;
        } else if (arg1 == 78) {
            this.field1116 = arg0.method2332();
        } else if (arg1 == 79) {
            this.field1117 = arg0.method2332();
        } else if (arg1 == 90) {
            this.field1125 = arg0.method2332();
        } else if (arg1 == 91) {
            this.field1120 = arg0.method2332();
        } else if (arg1 == 92) {
            this.field1119 = arg0.method2332();
        } else if (arg1 == 93) {
            this.field1121 = arg0.method2332();
        } else if (arg1 == 95) {
            this.field1102 = arg0.method2332();
        } else if (arg1 == 97) {
            this.field1124 = arg0.method2332();
        } else if (arg1 == 98) {
            this.field1093 = arg0.method2332();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1091 == null) {
                this.field1091 = new int[10];
                this.field1085 = new int[10];
            }
            this.field1091[arg1 - 100] = arg0.method2332();
            this.field1085[arg1 - 100] = arg0.method2332();
        } else if (arg1 == 110) {
            this.field1126 = arg0.method2332();
        } else if (arg1 == 111) {
            this.field1127 = arg0.method2332();
        } else if (arg1 == 112) {
            this.field1098 = arg0.method2332();
        } else if (arg1 == 113) {
            this.field1122 = arg0.method2413();
        } else if (arg1 == 114) {
            this.field1130 = arg0.method2413() * 5;
        } else if (arg1 == 115) {
            this.field1110 = arg0.method2330();
        } else if (arg1 == 139) {
            this.field1133 = arg0.method2332();
        } else if (arg1 == 140) {
            this.field1134 = arg0.method2332();
        }
    }

    @ObfuscatedName("an.d(Lan;Lan;B)V")
    public void method977(class52 arg0, class52 arg1) {
        this.field1100 = arg0.field1100;
        this.field1086 = arg0.field1086;
        this.field1103 = arg0.field1103;
        this.field1101 = arg0.field1101;
        this.field1102 = arg0.field1102;
        this.field1129 = arg0.field1129;
        this.field1104 = arg0.field1104;
        this.field1095 = arg0.field1095;
        this.field1096 = arg0.field1096;
        this.field1097 = arg0.field1097;
        this.field1108 = arg0.field1108;
        this.field1131 = arg1.field1131;
        this.field1107 = arg1.field1107;
        this.field1106 = arg1.field1106;
        this.field1105 = 1;
    }

    @ObfuscatedName("an.l(Lan;Lan;I)V")
    public void method992(class52 arg0, class52 arg1) {
        this.field1100 = arg0.field1100;
        this.field1086 = arg0.field1086;
        this.field1103 = arg0.field1103;
        this.field1101 = arg0.field1101;
        this.field1102 = arg0.field1102;
        this.field1129 = arg0.field1129;
        this.field1104 = arg0.field1104;
        this.field1095 = arg1.field1095;
        this.field1096 = arg1.field1096;
        this.field1097 = arg1.field1097;
        this.field1108 = arg1.field1108;
        this.field1131 = arg1.field1131;
        this.field1107 = arg1.field1107;
        this.field1105 = arg1.field1105;
        this.field1099 = arg1.field1099;
        this.field1111 = arg1.field1111;
        this.field1116 = arg1.field1116;
        this.field1113 = arg1.field1113;
        this.field1087 = arg1.field1087;
        this.field1117 = arg1.field1117;
        this.field1125 = arg1.field1125;
        this.field1119 = arg1.field1119;
        this.field1120 = arg1.field1120;
        this.field1121 = arg1.field1121;
        this.field1110 = arg1.field1110;
        this.field1094 = arg1.field1094;
        this.field1109 = new String[5];
        if (arg1.field1109 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1109[var3] = arg1.field1109[var3];
            }
        }
        this.field1109[4] = class157.field2300;
        this.field1106 = 0;
    }

    @ObfuscatedName("an.b(II)Lcg;")
    public final class100 method979(int arg0) {
        if (this.field1091 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1091[var3];
                }
            }
            if (var2 != -1) {
                return method2522(var2).method979(1);
            }
        }
        class100 var4 = class100.method2051(Statics.field2232, this.field1100, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1126 != 128 || this.field1127 != 128 || this.field1098 != 128) {
            var4.method2067(this.field1126, this.field1127, this.field1098);
        }
        if (this.field1095 != null) {
            for (int var5 = 0; var5 < this.field1095.length; var5++) {
                var4.method2064(this.field1095[var5], this.field1096[var5]);
            }
        }
        if (this.field1097 != null) {
            for (int var6 = 0; var6 < this.field1097.length; var6++) {
                var4.method2070(this.field1097[var6], this.field1108[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.j(II)Ldl;")
    public final class105 method1002(int arg0) {
        if (this.field1091 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1091[var3];
                }
            }
            if (var2 != -1) {
                return method2522(var2).method1002(1);
            }
        }
        class105 var4 = (class105) field1089.method3510((long) this.field1092);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2051(Statics.field2232, this.field1100, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1126 != 128 || this.field1127 != 128 || this.field1098 != 128) {
            var5.method2067(this.field1126, this.field1127, this.field1098);
        }
        if (this.field1095 != null) {
            for (int var6 = 0; var6 < this.field1095.length; var6++) {
                var5.method2064(this.field1095[var6], this.field1096[var6]);
            }
        }
        if (this.field1097 != null) {
            for (int var7 = 0; var7 < this.field1097.length; var7++) {
                var5.method2070(this.field1097[var7], this.field1108[var7]);
            }
        }
        class105 var8 = var5.method2089(this.field1122 + 64, this.field1130 + 768, -50, -10, -50);
        var8.field1777 = true;
        field1089.method3512(var8, (long) this.field1092);
        return var8;
    }

    @ObfuscatedName("an.f(IB)Lan;")
    public class52 method1019(int arg0) {
        if (this.field1091 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1091[var3];
                }
            }
            if (var2 != -1) {
                return method2522(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("n.i(IIIIIZB)Lcc;")
    public static final class79 method541(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1090.method3510(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2522(arg0);
        if (arg1 > 1 && var9.field1091 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1085[var11] && var9.field1085[var11] != 0) {
                    var10 = var9.field1091[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2522(var10);
            }
        }
        class105 var12 = var9.method1002(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1093 != -1) {
            var13 = method541(var9.field1124, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1134 != -1) {
            var13 = method541(var9.field1133, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1385;
        int var15 = Statics.field1383;
        int var16 = Statics.field1384;
        int[] var17 = new int[4];
        class80.method1665(var17);
        class79 var18 = new class79(36, 32);
        class80.method1666(var18.field1370, 36, 32);
        class80.method1706();
        class91.method1953();
        class91.method1957(16, 16);
        class91.field1534 = false;
        int var19 = var9.field1086;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1555[var9.field1103] * var19 >> 16;
        int var21 = class91.field1556[var9.field1103] * var19 >> 16;
        var12.method2149();
        var12.method2184(0, var9.field1101, var9.field1102, var9.field1103, var9.field1129, var9.field1104 + var12.field1420 / 2 + var20, var9.field1104 + var21);
        if (var9.field1134 != -1) {
            var13.method1579(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1649(1);
        }
        if (arg2 >= 2) {
            var18.method1649(16777215);
        }
        if (arg3 != 0) {
            var18.method1664(arg3);
        }
        class80.method1666(var18.field1370, 36, 32);
        if (var9.field1093 != -1) {
            var13.method1579(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1105 == 1) {
            class224 var22 = Statics.field1128;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2455 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2453 + "</col>";
            }
            var22.method3786(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1090.method3512(var18, var6);
        }
        class80.method1666(var14, var15, var16);
        class80.method1683(var17);
        class91.method1953();
        class91.field1534 = true;
        return var18;
    }

    @ObfuscatedName("an.g(ZB)Z")
    public final boolean method982(boolean arg0) {
        int var2 = this.field1099;
        int var3 = this.field1111;
        int var4 = this.field1116;
        if (arg0) {
            var2 = this.field1113;
            var3 = this.field1087;
            var4 = this.field1117;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2232.method3051(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2232.method3051(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2232.method3051(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.t(ZB)Lcg;")
    public final class100 method983(boolean arg0) {
        int var2 = this.field1099;
        int var3 = this.field1111;
        int var4 = this.field1116;
        if (arg0) {
            var2 = this.field1113;
            var3 = this.field1087;
            var4 = this.field1117;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2051(Statics.field2232, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2051(Statics.field2232, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2051(Statics.field2232, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1112 != 0) {
            var5.method2120(0, this.field1112, 0);
        }
        if (arg0 && this.field1115 != 0) {
            var5.method2120(0, this.field1115, 0);
        }
        if (this.field1095 != null) {
            for (int var10 = 0; var10 < this.field1095.length; var10++) {
                var5.method2064(this.field1095[var10], this.field1096[var10]);
            }
        }
        if (this.field1097 != null) {
            for (int var11 = 0; var11 < this.field1097.length; var11++) {
                var5.method2070(this.field1097[var11], this.field1108[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.e(ZB)Z")
    public final boolean method984(boolean arg0) {
        int var2 = this.field1125;
        int var3 = this.field1119;
        if (arg0) {
            var2 = this.field1120;
            var3 = this.field1121;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2232.method3051(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2232.method3051(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.q(ZI)Lcg;")
    public final class100 method985(boolean arg0) {
        int var2 = this.field1125;
        int var3 = this.field1119;
        if (arg0) {
            var2 = this.field1120;
            var3 = this.field1121;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2051(Statics.field2232, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2051(Statics.field2232, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1095 != null) {
            for (int var7 = 0; var7 < this.field1095.length; var7++) {
                var4.method2064(this.field1095[var7], this.field1096[var7]);
            }
        }
        if (this.field1097 != null) {
            for (int var8 = 0; var8 < this.field1097.length; var8++) {
                var4.method2070(this.field1097[var8], this.field1108[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fx.u(ZI)V")
    public static void method2990(boolean arg0) {
        if (Statics.field1531 != arg0) {
            field1088.method3518();
            field1089.method3518();
            field1090.method3518();
            Statics.field1531 = arg0;
        }
    }
}
