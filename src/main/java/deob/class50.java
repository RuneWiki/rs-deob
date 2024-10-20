package deob;

@ObfuscatedName("aq")
public class class50 extends class198 {

    @ObfuscatedName("aq.i")
    public static class187 field1117 = new class187(64);

    @ObfuscatedName("aq.a")
    public static class187 field1083 = new class187(50);

    @ObfuscatedName("aq.o")
    public static class187 field1084 = new class187(200);

    @ObfuscatedName("aq.m")
    public int field1085;

    @ObfuscatedName("aq.e")
    public int field1086;

    @ObfuscatedName("aq.v")
    public String field1094 = "null";

    @ObfuscatedName("aq.r")
    public short[] field1088;

    @ObfuscatedName("aq.t")
    public short[] field1093;

    @ObfuscatedName("aq.g")
    public short[] field1090;

    @ObfuscatedName("aq.s")
    public short[] field1091;

    @ObfuscatedName("aq.n")
    public int field1092 = 2000;

    @ObfuscatedName("aq.h")
    public int field1123 = 0;

    @ObfuscatedName("aq.p")
    public int field1096 = 0;

    @ObfuscatedName("aq.c")
    public int field1095 = 0;

    @ObfuscatedName("aq.x")
    public int field1099 = 0;

    @ObfuscatedName("aq.q")
    public int field1097 = 0;

    @ObfuscatedName("aq.b")
    public int field1102 = 0;

    @ObfuscatedName("aq.k")
    public int field1079 = 1;

    @ObfuscatedName("aq.at")
    public boolean field1100 = false;

    @ObfuscatedName("aq.au")
    public String[] field1101 = new String[] { null, null, class151.field2284, null, null };

    @ObfuscatedName("aq.aa")
    public String[] field1111 = new String[] { null, null, null, null, class151.field2230 };

    @ObfuscatedName("aq.ak")
    public int field1103 = -1;

    @ObfuscatedName("aq.an")
    public int field1104 = -1;

    @ObfuscatedName("aq.ad")
    public int field1114 = 0;

    @ObfuscatedName("aq.ap")
    public int field1106 = -1;

    @ObfuscatedName("aq.ag")
    public int field1121 = -1;

    @ObfuscatedName("aq.aj")
    public int field1108 = 0;

    @ObfuscatedName("aq.av")
    public int field1109 = -1;

    @ObfuscatedName("aq.ar")
    public int field1110 = -1;

    @ObfuscatedName("aq.ab")
    public int field1107 = -1;

    @ObfuscatedName("aq.ai")
    public int field1112 = -1;

    @ObfuscatedName("aq.ae")
    public int field1128 = -1;

    @ObfuscatedName("aq.ax")
    public int field1098 = -1;

    @ObfuscatedName("aq.aw")
    public int[] field1115;

    @ObfuscatedName("aq.ac")
    public int[] field1116;

    @ObfuscatedName("aq.al")
    public int field1129 = -1;

    @ObfuscatedName("aq.az")
    public int field1118 = -1;

    @ObfuscatedName("aq.as")
    public int field1082 = 128;

    @ObfuscatedName("aq.am")
    public int field1120 = 128;

    @ObfuscatedName("aq.ay")
    public int field1113 = 128;

    @ObfuscatedName("aq.ao")
    public int field1122 = 0;

    @ObfuscatedName("aq.aq")
    public int field1119 = 0;

    @ObfuscatedName("aq.af")
    public int field1124 = 0;

    @ObfuscatedName("aq.ah")
    public boolean field1125 = false;

    @ObfuscatedName("aq.bz")
    public int field1126 = -1;

    @ObfuscatedName("aq.bw")
    public int field1127 = -1;

    @ObfuscatedName("aq.j(IB)Laq;")
    public static class50 method1088(int arg0) {
        class50 var1 = (class50) field1117.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1080.method2995(10, arg0);
        class50 var3 = new class50();
        var3.field1085 = arg0;
        if (var2 != null) {
            var3.method1035(new class114(var2));
        }
        var3.method1034();
        if (var3.field1118 != -1) {
            var3.method1074(method1088(var3.field1118), method1088(var3.field1129));
        }
        if (var3.field1127 != -1) {
            var3.method1079(method1088(var3.field1127), method1088(var3.field1126));
        }
        if (!Statics.field2661 && var3.field1100) {
            var3.field1094 = class151.field2358;
            var3.field1125 = false;
            var3.field1101 = null;
            var3.field1111 = null;
            var3.field1124 = 0;
        }
        field1117.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.y(I)V")
    public void method1034() {
    }

    @ObfuscatedName("aq.z(Lde;B)V")
    public void method1035(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method1036(arg0, var2);
        }
    }

    @ObfuscatedName("aq.l(Lde;II)V")
    public void method1036(class114 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1086 = arg0.method2324();
        } else if (arg1 == 2) {
            this.field1094 = arg0.method2440();
        } else if (arg1 == 4) {
            this.field1092 = arg0.method2324();
        } else if (arg1 == 5) {
            this.field1123 = arg0.method2324();
        } else if (arg1 == 6) {
            this.field1096 = arg0.method2324();
        } else if (arg1 == 7) {
            this.field1099 = arg0.method2324();
            if (this.field1099 > 32767) {
                this.field1099 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1097 = arg0.method2324();
            if (this.field1097 > 32767) {
                this.field1097 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1102 = 1;
        } else if (arg1 == 12) {
            this.field1079 = arg0.method2327();
        } else if (arg1 == 16) {
            this.field1100 = true;
        } else if (arg1 == 23) {
            this.field1103 = arg0.method2324();
            this.field1114 = arg0.method2322();
        } else if (arg1 == 24) {
            this.field1104 = arg0.method2324();
        } else if (arg1 == 25) {
            this.field1106 = arg0.method2324();
            this.field1108 = arg0.method2322();
        } else if (arg1 == 26) {
            this.field1121 = arg0.method2324();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1101[arg1 - 30] = arg0.method2440();
            if (this.field1101[arg1 - 30].equalsIgnoreCase(class151.field2231)) {
                this.field1101[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1111[arg1 - 35] = arg0.method2440();
        } else if (arg1 == 40) {
            int var3 = arg0.method2322();
            this.field1088 = new short[var3];
            this.field1093 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1088[var4] = (short) arg0.method2324();
                this.field1093[var4] = (short) arg0.method2324();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2322();
            this.field1090 = new short[var5];
            this.field1091 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1090[var6] = (short) arg0.method2324();
                this.field1091[var6] = (short) arg0.method2324();
            }
        } else if (arg1 == 65) {
            this.field1125 = true;
        } else if (arg1 == 78) {
            this.field1109 = arg0.method2324();
        } else if (arg1 == 79) {
            this.field1110 = arg0.method2324();
        } else if (arg1 == 90) {
            this.field1107 = arg0.method2324();
        } else if (arg1 == 91) {
            this.field1128 = arg0.method2324();
        } else if (arg1 == 92) {
            this.field1112 = arg0.method2324();
        } else if (arg1 == 93) {
            this.field1098 = arg0.method2324();
        } else if (arg1 == 95) {
            this.field1095 = arg0.method2324();
        } else if (arg1 == 97) {
            this.field1129 = arg0.method2324();
        } else if (arg1 == 98) {
            this.field1118 = arg0.method2324();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1115 == null) {
                this.field1115 = new int[10];
                this.field1116 = new int[10];
            }
            this.field1115[arg1 - 100] = arg0.method2324();
            this.field1116[arg1 - 100] = arg0.method2324();
        } else if (arg1 == 110) {
            this.field1082 = arg0.method2324();
        } else if (arg1 == 111) {
            this.field1120 = arg0.method2324();
        } else if (arg1 == 112) {
            this.field1113 = arg0.method2324();
        } else if (arg1 == 113) {
            this.field1122 = arg0.method2323();
        } else if (arg1 == 114) {
            this.field1119 = arg0.method2323();
        } else if (arg1 == 115) {
            this.field1124 = arg0.method2322();
        } else if (arg1 == 139) {
            this.field1126 = arg0.method2324();
        } else if (arg1 == 140) {
            this.field1127 = arg0.method2324();
        }
    }

    @ObfuscatedName("aq.w(Laq;Laq;I)V")
    public void method1074(class50 arg0, class50 arg1) {
        this.field1086 = arg0.field1086;
        this.field1092 = arg0.field1092;
        this.field1123 = arg0.field1123;
        this.field1096 = arg0.field1096;
        this.field1095 = arg0.field1095;
        this.field1099 = arg0.field1099;
        this.field1097 = arg0.field1097;
        this.field1088 = arg0.field1088;
        this.field1093 = arg0.field1093;
        this.field1090 = arg0.field1090;
        this.field1091 = arg0.field1091;
        this.field1094 = arg1.field1094;
        this.field1100 = arg1.field1100;
        this.field1079 = arg1.field1079;
        this.field1102 = 1;
    }

    @ObfuscatedName("aq.d(Laq;Laq;I)V")
    public void method1079(class50 arg0, class50 arg1) {
        this.field1086 = arg0.field1086;
        this.field1092 = arg0.field1092;
        this.field1123 = arg0.field1123;
        this.field1096 = arg0.field1096;
        this.field1095 = arg0.field1095;
        this.field1099 = arg0.field1099;
        this.field1097 = arg0.field1097;
        this.field1088 = arg1.field1088;
        this.field1093 = arg1.field1093;
        this.field1090 = arg1.field1090;
        this.field1091 = arg1.field1091;
        this.field1094 = arg1.field1094;
        this.field1100 = arg1.field1100;
        this.field1102 = arg1.field1102;
        this.field1103 = arg1.field1103;
        this.field1104 = arg1.field1104;
        this.field1109 = arg1.field1109;
        this.field1106 = arg1.field1106;
        this.field1121 = arg1.field1121;
        this.field1110 = arg1.field1110;
        this.field1107 = arg1.field1107;
        this.field1112 = arg1.field1112;
        this.field1128 = arg1.field1128;
        this.field1098 = arg1.field1098;
        this.field1124 = arg1.field1124;
        this.field1101 = arg1.field1101;
        this.field1111 = new String[5];
        if (arg1.field1111 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1111[var3] = arg1.field1111[var3];
            }
        }
        this.field1111[4] = class151.field2306;
        this.field1079 = 0;
    }

    @ObfuscatedName("aq.f(II)Lcd;")
    public final class98 method1039(int arg0) {
        if (this.field1115 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1116[var3] && this.field1116[var3] != 0) {
                    var2 = this.field1115[var3];
                }
            }
            if (var2 != -1) {
                return method1088(var2).method1039(1);
            }
        }
        class98 var4 = class98.method2092(Statics.field1081, this.field1086, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1082 != 128 || this.field1120 != 128 || this.field1113 != 128) {
            var4.method2089(this.field1082, this.field1120, this.field1113);
        }
        if (this.field1088 != null) {
            for (int var5 = 0; var5 < this.field1088.length; var5++) {
                var4.method2140(this.field1088[var5], this.field1093[var5]);
            }
        }
        if (this.field1090 != null) {
            for (int var6 = 0; var6 < this.field1090.length; var6++) {
                var4.method2087(this.field1090[var6], this.field1091[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.i(II)Lcw;")
    public final class103 method1063(int arg0) {
        if (this.field1115 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1116[var3] && this.field1116[var3] != 0) {
                    var2 = this.field1115[var3];
                }
            }
            if (var2 != -1) {
                return method1088(var2).method1063(1);
            }
        }
        class103 var4 = (class103) field1083.method3432((long) this.field1085);
        if (var4 != null) {
            return var4;
        }
        class98 var5 = class98.method2092(Statics.field1081, this.field1086, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1082 != 128 || this.field1120 != 128 || this.field1113 != 128) {
            var5.method2089(this.field1082, this.field1120, this.field1113);
        }
        if (this.field1088 != null) {
            for (int var6 = 0; var6 < this.field1088.length; var6++) {
                var5.method2140(this.field1088[var6], this.field1093[var6]);
            }
        }
        if (this.field1090 != null) {
            for (int var7 = 0; var7 < this.field1090.length; var7++) {
                var5.method2087(this.field1090[var7], this.field1091[var7]);
            }
        }
        class103 var8 = var5.method2094(this.field1122 + 64, this.field1119 * 5 + 768, -50, -10, -50);
        var8.field1751 = true;
        field1083.method3434(var8, (long) this.field1085);
        return var8;
    }

    @ObfuscatedName("aq.a(IB)Laq;")
    public class50 method1041(int arg0) {
        if (this.field1115 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1116[var3] && this.field1116[var3] != 0) {
                    var2 = this.field1115[var3];
                }
            }
            if (var2 != -1) {
                return method1088(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("m.o(IIIIIZI)Lbh;")
    public static final class77 method148(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class77 var8 = (class77) field1084.method3432(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class50 var9 = method1088(arg0);
        if (arg1 > 1 && var9.field1115 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1116[var11] && var9.field1116[var11] != 0) {
                    var10 = var9.field1115[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1088(var10);
            }
        }
        class103 var12 = var9.method1063(1);
        if (var12 == null) {
            return null;
        }
        class77 var13 = null;
        if (var9.field1118 != -1) {
            var13 = method148(var9.field1129, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1127 != -1) {
            var13 = method148(var9.field1126, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1388;
        int var15 = Statics.field1383;
        int var16 = Statics.field1384;
        int[] var17 = new int[4];
        class78.method1713(var17);
        class77 var18 = new class77(36, 32);
        class78.method1752(var18.field1380, 36, 32);
        class78.method1729();
        class89.method1978();
        class89.method1981(16, 16);
        class89.field1522 = false;
        int var19 = var9.field1092;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class89.field1542[var9.field1123] * var19 >> 16;
        int var21 = class89.field1543[var9.field1123] * var19 >> 16;
        var12.method2170();
        var12.method2227(0, var9.field1096, var9.field1095, var9.field1123, var9.field1099, var9.field1097 + var12.field1419 / 2 + var20, var9.field1097 + var21);
        if (var9.field1127 != -1) {
            var13.method1640(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1700(1);
        }
        if (arg2 >= 2) {
            var18.method1700(16777215);
        }
        if (arg3 != 0) {
            var18.method1639(arg3);
        }
        class78.method1752(var18.field1380, 36, 32);
        if (var9.field1118 != -1) {
            var13.method1640(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1102 == 1) {
            class218 var22 = Statics.field2585;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class151.field2393 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class151.field2391 + "</col>";
            }
            var22.method3665(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1084.method3434(var18, var6);
        }
        class78.method1752(var14, var15, var16);
        class78.method1714(var17);
        class89.method1978();
        class89.field1522 = true;
        return var18;
    }

    @ObfuscatedName("aq.u(ZI)Z")
    public final boolean method1040(boolean arg0) {
        int var2 = this.field1103;
        int var3 = this.field1104;
        int var4 = this.field1109;
        if (arg0) {
            var2 = this.field1106;
            var3 = this.field1121;
            var4 = this.field1110;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1081.method2981(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1081.method2981(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1081.method2981(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.m(ZI)Lcd;")
    public final class98 method1033(boolean arg0) {
        int var2 = this.field1103;
        int var3 = this.field1104;
        int var4 = this.field1109;
        if (arg0) {
            var2 = this.field1106;
            var3 = this.field1121;
            var4 = this.field1110;
        }
        if (var2 == -1) {
            return null;
        }
        class98 var5 = class98.method2092(Statics.field1081, var2, 0);
        if (var3 != -1) {
            class98 var6 = class98.method2092(Statics.field1081, var3, 0);
            if (var4 == -1) {
                class98[] var9 = new class98[] { var5, var6 };
                var5 = new class98(var9, 2);
            } else {
                class98 var7 = class98.method2092(Statics.field1081, var4, 0);
                class98[] var8 = new class98[] { var5, var6, var7 };
                var5 = new class98(var8, 3);
            }
        }
        if (!arg0 && this.field1114 != 0) {
            var5.method2085(0, this.field1114, 0);
        }
        if (arg0 && this.field1108 != 0) {
            var5.method2085(0, this.field1108, 0);
        }
        if (this.field1088 != null) {
            for (int var10 = 0; var10 < this.field1088.length; var10++) {
                var5.method2140(this.field1088[var10], this.field1093[var10]);
            }
        }
        if (this.field1090 != null) {
            for (int var11 = 0; var11 < this.field1090.length; var11++) {
                var5.method2087(this.field1090[var11], this.field1091[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.e(ZB)Z")
    public final boolean method1044(boolean arg0) {
        int var2 = this.field1107;
        int var3 = this.field1112;
        if (arg0) {
            var2 = this.field1128;
            var3 = this.field1098;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1081.method2981(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1081.method2981(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.v(ZB)Lcd;")
    public final class98 method1043(boolean arg0) {
        int var2 = this.field1107;
        int var3 = this.field1112;
        if (arg0) {
            var2 = this.field1128;
            var3 = this.field1098;
        }
        if (var2 == -1) {
            return null;
        }
        class98 var4 = class98.method2092(Statics.field1081, var2, 0);
        if (var3 != -1) {
            class98 var5 = class98.method2092(Statics.field1081, var3, 0);
            class98[] var6 = new class98[] { var4, var5 };
            var4 = new class98(var6, 2);
        }
        if (this.field1088 != null) {
            for (int var7 = 0; var7 < this.field1088.length; var7++) {
                var4.method2140(this.field1088[var7], this.field1093[var7]);
            }
        }
        if (this.field1090 != null) {
            for (int var8 = 0; var8 < this.field1090.length; var8++) {
                var4.method2087(this.field1090[var8], this.field1091[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ec.r(I)V")
    public static void method2878() {
        field1117.method3435();
        field1083.method3435();
        field1084.method3435();
    }
}
