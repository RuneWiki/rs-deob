package deob;

@ObfuscatedName("ap")
public class class52 extends class205 {

    @ObfuscatedName("ap.c")
    public static class194 field1118 = new class194(64);

    @ObfuscatedName("ap.v")
    public static class194 field1119 = new class194(50);

    @ObfuscatedName("ap.l")
    public static class194 field1120 = new class194(200);

    @ObfuscatedName("ap.s")
    public int field1128;

    @ObfuscatedName("ap.j")
    public int field1146;

    @ObfuscatedName("ap.q")
    public String field1123 = "null";

    @ObfuscatedName("ap.a")
    public short[] field1122;

    @ObfuscatedName("ap.d")
    public short[] field1125;

    @ObfuscatedName("ap.u")
    public short[] field1126;

    @ObfuscatedName("ap.i")
    public short[] field1138;

    @ObfuscatedName("ap.o")
    public int field1159 = 2000;

    @ObfuscatedName("ap.h")
    public int field1141 = 0;

    @ObfuscatedName("ap.k")
    public int field1130 = 0;

    @ObfuscatedName("ap.f")
    public int field1131 = 0;

    @ObfuscatedName("ap.r")
    public int field1132 = 0;

    @ObfuscatedName("ap.n")
    public int field1133 = 0;

    @ObfuscatedName("ap.g")
    public int field1134 = 0;

    @ObfuscatedName("ap.b")
    public int field1163 = 1;

    @ObfuscatedName("ap.af")
    public boolean field1136 = false;

    @ObfuscatedName("ap.am")
    public String[] field1137 = new String[] { null, null, class158.field2336, null, null };

    @ObfuscatedName("ap.ar")
    public String[] field1113 = new String[] { null, null, null, null, class158.field2337 };

    @ObfuscatedName("ap.ay")
    public int field1139 = -1;

    @ObfuscatedName("ap.ai")
    public int field1140 = -1;

    @ObfuscatedName("ap.ab")
    public int field1124 = 0;

    @ObfuscatedName("ap.av")
    public int field1142 = -1;

    @ObfuscatedName("ap.ac")
    public int field1143 = -1;

    @ObfuscatedName("ap.ah")
    public int field1144 = 0;

    @ObfuscatedName("ap.ae")
    public int field1152 = -1;

    @ObfuscatedName("ap.aj")
    public int field1129 = -1;

    @ObfuscatedName("ap.az")
    public int field1147 = -1;

    @ObfuscatedName("ap.al")
    public int field1148 = -1;

    @ObfuscatedName("ap.ag")
    public int field1149 = -1;

    @ObfuscatedName("ap.ad")
    public int field1150 = -1;

    @ObfuscatedName("ap.au")
    public int[] field1135;

    @ObfuscatedName("ap.ao")
    public int[] field1127;

    @ObfuscatedName("ap.ak")
    public int field1151 = -1;

    @ObfuscatedName("ap.at")
    public int field1154 = -1;

    @ObfuscatedName("ap.aw")
    public int field1155 = 128;

    @ObfuscatedName("ap.as")
    public int field1121 = 128;

    @ObfuscatedName("ap.aq")
    public int field1157 = 128;

    @ObfuscatedName("ap.ax")
    public int field1158 = 0;

    @ObfuscatedName("ap.an")
    public int field1156 = 0;

    @ObfuscatedName("ap.aa")
    public int field1160 = 0;

    @ObfuscatedName("ap.ap")
    public boolean field1161 = false;

    @ObfuscatedName("ap.bd")
    public int field1162 = -1;

    @ObfuscatedName("ap.bb")
    public int field1153 = -1;

    @ObfuscatedName("aa.w(IB)Lap;")
    public static class52 method1036(int arg0) {
        class52 var1 = (class52) field1118.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field673.method3127(10, arg0);
        class52 var3 = new class52();
        var3.field1128 = arg0;
        if (var2 != null) {
            var3.method1042(new class120(var2));
        }
        var3.method1076();
        if (var3.field1154 != -1) {
            var3.method1044(method1036(var3.field1154), method1036(var3.field1151));
        }
        if (var3.field1153 != -1) {
            var3.method1045(method1036(var3.field1153), method1036(var3.field1162));
        }
        if (!Statics.field1116 && var3.field1136) {
            var3.field1123 = class158.field2464;
            var3.field1161 = false;
            var3.field1137 = null;
            var3.field1113 = null;
            var3.field1160 = 0;
        }
        field1118.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.x(B)V")
    public void method1076() {
    }

    @ObfuscatedName("ap.t(Lde;I)V")
    public void method1042(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1043(arg0, var2);
        }
    }

    @ObfuscatedName("ap.p(Lde;II)V")
    public void method1043(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1146 = arg0.method2365();
        } else if (arg1 == 2) {
            this.field1123 = arg0.method2540();
        } else if (arg1 == 4) {
            this.field1159 = arg0.method2365();
        } else if (arg1 == 5) {
            this.field1141 = arg0.method2365();
        } else if (arg1 == 6) {
            this.field1130 = arg0.method2365();
        } else if (arg1 == 7) {
            this.field1132 = arg0.method2365();
            if (this.field1132 > 32767) {
                this.field1132 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1133 = arg0.method2365();
            if (this.field1133 > 32767) {
                this.field1133 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1134 = 1;
        } else if (arg1 == 12) {
            this.field1163 = arg0.method2368();
        } else if (arg1 == 16) {
            this.field1136 = true;
        } else if (arg1 == 23) {
            this.field1139 = arg0.method2365();
            this.field1124 = arg0.method2363();
        } else if (arg1 == 24) {
            this.field1140 = arg0.method2365();
        } else if (arg1 == 25) {
            this.field1142 = arg0.method2365();
            this.field1144 = arg0.method2363();
        } else if (arg1 == 26) {
            this.field1143 = arg0.method2365();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1137[arg1 - 30] = arg0.method2540();
            if (this.field1137[arg1 - 30].equalsIgnoreCase(class158.field2338)) {
                this.field1137[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1113[arg1 - 35] = arg0.method2540();
        } else if (arg1 == 40) {
            int var3 = arg0.method2363();
            this.field1122 = new short[var3];
            this.field1125 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1122[var4] = (short) arg0.method2365();
                this.field1125[var4] = (short) arg0.method2365();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2363();
            this.field1126 = new short[var5];
            this.field1138 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1126[var6] = (short) arg0.method2365();
                this.field1138[var6] = (short) arg0.method2365();
            }
        } else if (arg1 == 65) {
            this.field1161 = true;
        } else if (arg1 == 78) {
            this.field1152 = arg0.method2365();
        } else if (arg1 == 79) {
            this.field1129 = arg0.method2365();
        } else if (arg1 == 90) {
            this.field1147 = arg0.method2365();
        } else if (arg1 == 91) {
            this.field1149 = arg0.method2365();
        } else if (arg1 == 92) {
            this.field1148 = arg0.method2365();
        } else if (arg1 == 93) {
            this.field1150 = arg0.method2365();
        } else if (arg1 == 95) {
            this.field1131 = arg0.method2365();
        } else if (arg1 == 97) {
            this.field1151 = arg0.method2365();
        } else if (arg1 == 98) {
            this.field1154 = arg0.method2365();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1135 == null) {
                this.field1135 = new int[10];
                this.field1127 = new int[10];
            }
            this.field1135[arg1 - 100] = arg0.method2365();
            this.field1127[arg1 - 100] = arg0.method2365();
        } else if (arg1 == 110) {
            this.field1155 = arg0.method2365();
        } else if (arg1 == 111) {
            this.field1121 = arg0.method2365();
        } else if (arg1 == 112) {
            this.field1157 = arg0.method2365();
        } else if (arg1 == 113) {
            this.field1158 = arg0.method2381();
        } else if (arg1 == 114) {
            this.field1156 = arg0.method2381();
        } else if (arg1 == 115) {
            this.field1160 = arg0.method2363();
        } else if (arg1 == 139) {
            this.field1162 = arg0.method2365();
        } else if (arg1 == 140) {
            this.field1153 = arg0.method2365();
        }
    }

    @ObfuscatedName("ap.e(Lap;Lap;I)V")
    public void method1044(class52 arg0, class52 arg1) {
        this.field1146 = arg0.field1146;
        this.field1159 = arg0.field1159;
        this.field1141 = arg0.field1141;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1132 = arg0.field1132;
        this.field1133 = arg0.field1133;
        this.field1122 = arg0.field1122;
        this.field1125 = arg0.field1125;
        this.field1126 = arg0.field1126;
        this.field1138 = arg0.field1138;
        this.field1123 = arg1.field1123;
        this.field1136 = arg1.field1136;
        this.field1163 = arg1.field1163;
        this.field1134 = 1;
    }

    @ObfuscatedName("ap.y(Lap;Lap;B)V")
    public void method1045(class52 arg0, class52 arg1) {
        this.field1146 = arg0.field1146;
        this.field1159 = arg0.field1159;
        this.field1141 = arg0.field1141;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1132 = arg0.field1132;
        this.field1133 = arg0.field1133;
        this.field1122 = arg1.field1122;
        this.field1125 = arg1.field1125;
        this.field1126 = arg1.field1126;
        this.field1138 = arg1.field1138;
        this.field1123 = arg1.field1123;
        this.field1136 = arg1.field1136;
        this.field1134 = arg1.field1134;
        this.field1139 = arg1.field1139;
        this.field1140 = arg1.field1140;
        this.field1152 = arg1.field1152;
        this.field1142 = arg1.field1142;
        this.field1143 = arg1.field1143;
        this.field1129 = arg1.field1129;
        this.field1147 = arg1.field1147;
        this.field1148 = arg1.field1148;
        this.field1149 = arg1.field1149;
        this.field1150 = arg1.field1150;
        this.field1160 = arg1.field1160;
        this.field1137 = arg1.field1137;
        this.field1113 = new String[5];
        if (arg1.field1113 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1113[var3] = arg1.field1113[var3];
            }
        }
        this.field1113[4] = class158.field2530;
        this.field1163 = 0;
    }

    @ObfuscatedName("ap.m(II)Lcu;")
    public final class101 method1046(int arg0) {
        if (this.field1135 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1127[var3] && this.field1127[var3] != 0) {
                    var2 = this.field1135[var3];
                }
            }
            if (var2 != -1) {
                return method1036(var2).method1046(1);
            }
        }
        class101 var4 = class101.method2081(Statics.field1115, this.field1146, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1155 != 128 || this.field1121 != 128 || this.field1157 != 128) {
            var4.method2074(this.field1155, this.field1121, this.field1157);
        }
        if (this.field1122 != null) {
            for (int var5 = 0; var5 < this.field1122.length; var5++) {
                var4.method2105(this.field1122[var5], this.field1125[var5]);
            }
        }
        if (this.field1126 != null) {
            for (int var6 = 0; var6 < this.field1126.length; var6++) {
                var4.method2072(this.field1126[var6], this.field1138[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ap.c(II)Ldp;")
    public final class106 method1065(int arg0) {
        if (this.field1135 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1127[var3] && this.field1127[var3] != 0) {
                    var2 = this.field1135[var3];
                }
            }
            if (var2 != -1) {
                return method1036(var2).method1065(1);
            }
        }
        class106 var4 = (class106) field1119.method3520((long) this.field1128);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2081(Statics.field1115, this.field1146, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1155 != 128 || this.field1121 != 128 || this.field1157 != 128) {
            var5.method2074(this.field1155, this.field1121, this.field1157);
        }
        if (this.field1122 != null) {
            for (int var6 = 0; var6 < this.field1122.length; var6++) {
                var5.method2105(this.field1122[var6], this.field1125[var6]);
            }
        }
        if (this.field1126 != null) {
            for (int var7 = 0; var7 < this.field1126.length; var7++) {
                var5.method2072(this.field1126[var7], this.field1138[var7]);
            }
        }
        class106 var8 = var5.method2079(this.field1158 + 64, this.field1156 * 5 + 768, -50, -10, -50);
        var8.field1871 = true;
        field1119.method3522(var8, (long) this.field1128);
        return var8;
    }

    @ObfuscatedName("ap.v(IB)Lap;")
    public class52 method1048(int arg0) {
        if (this.field1135 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1127[var3] && this.field1127[var3] != 0) {
                    var2 = this.field1135[var3];
                }
            }
            if (var2 != -1) {
                return method1036(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("da.l(IIIIIZI)Lcv;")
    public static final class79 method2250(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1120.method3520(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method1036(arg0);
        if (arg1 > 1 && var9.field1135 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1127[var11] && var9.field1127[var11] != 0) {
                    var10 = var9.field1135[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1036(var10);
            }
        }
        class106 var12 = var9.method1065(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1154 != -1) {
            var13 = method2250(var9.field1151, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1153 != -1) {
            var13 = method2250(var9.field1162, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1417;
        int var15 = Statics.field1415;
        int var16 = Statics.field1416;
        int[] var17 = new int[4];
        class80.method1668(var17);
        class79 var18 = new class79(36, 32);
        class80.method1664(var18.field1407, 36, 32);
        class80.method1670();
        class92.method1961();
        class92.method1983(16, 16);
        class92.field1575 = false;
        int var19 = var9.field1159;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1574[var9.field1141] * var19 >> 16;
        int var21 = class92.field1596[var9.field1141] * var19 >> 16;
        var12.method2189();
        var12.method2213(0, var9.field1130, var9.field1131, var9.field1141, var9.field1132, var9.field1133 + var12.field1468 / 2 + var20, var9.field1133 + var21);
        if (var9.field1153 != -1) {
            var13.method1592(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1588(1);
        }
        if (arg2 >= 2) {
            var18.method1588(16777215);
        }
        if (arg3 != 0) {
            var18.method1640(arg3);
        }
        class80.method1664(var18.field1407, 36, 32);
        if (var9.field1154 != -1) {
            var13.method1592(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1134 == 1) {
            Statics.field1643.method3786(Statics.method2038(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1120.method3522(var18, var6);
        }
        class80.method1664(var14, var15, var16);
        class80.method1669(var17);
        class92.method1961();
        class92.field1575 = true;
        return var18;
    }

    @ObfuscatedName("ap.s(ZI)Z")
    public final boolean method1066(boolean arg0) {
        int var2 = this.field1139;
        int var3 = this.field1140;
        int var4 = this.field1152;
        if (arg0) {
            var2 = this.field1142;
            var3 = this.field1143;
            var4 = this.field1129;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1115.method3082(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1115.method3082(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1115.method3082(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ap.j(ZI)Lcu;")
    public final class101 method1050(boolean arg0) {
        int var2 = this.field1139;
        int var3 = this.field1140;
        int var4 = this.field1152;
        if (arg0) {
            var2 = this.field1142;
            var3 = this.field1143;
            var4 = this.field1129;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2081(Statics.field1115, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2081(Statics.field1115, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2081(Statics.field1115, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1124 != 0) {
            var5.method2070(0, this.field1124, 0);
        }
        if (arg0 && this.field1144 != 0) {
            var5.method2070(0, this.field1144, 0);
        }
        if (this.field1122 != null) {
            for (int var10 = 0; var10 < this.field1122.length; var10++) {
                var5.method2105(this.field1122[var10], this.field1125[var10]);
            }
        }
        if (this.field1126 != null) {
            for (int var11 = 0; var11 < this.field1126.length; var11++) {
                var5.method2072(this.field1126[var11], this.field1138[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ap.q(ZB)Z")
    public final boolean method1051(boolean arg0) {
        int var2 = this.field1147;
        int var3 = this.field1148;
        if (arg0) {
            var2 = this.field1149;
            var3 = this.field1150;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1115.method3082(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1115.method3082(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ap.a(ZI)Lcu;")
    public final class101 method1053(boolean arg0) {
        int var2 = this.field1147;
        int var3 = this.field1148;
        if (arg0) {
            var2 = this.field1149;
            var3 = this.field1150;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2081(Statics.field1115, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2081(Statics.field1115, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1122 != null) {
            for (int var7 = 0; var7 < this.field1122.length; var7++) {
                var4.method2105(this.field1122[var7], this.field1125[var7]);
            }
        }
        if (this.field1126 != null) {
            for (int var8 = 0; var8 < this.field1126.length; var8++) {
                var4.method2072(this.field1126[var8], this.field1138[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.d(ZI)V")
    public static void method845(boolean arg0) {
        if (Statics.field1116 != arg0) {
            field1118.method3525();
            field1119.method3525();
            field1120.method3525();
            Statics.field1116 = arg0;
        }
    }
}
