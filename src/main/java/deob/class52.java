package deob;

@ObfuscatedName("ax")
public class class52 extends class205 {

    @ObfuscatedName("ax.s")
    public static class194 field1115 = new class194(64);

    @ObfuscatedName("ax.d")
    public static class194 field1116 = new class194(50);

    @ObfuscatedName("ax.l")
    public static class194 field1134 = new class194(200);

    @ObfuscatedName("ax.p")
    public int field1119;

    @ObfuscatedName("ax.k")
    public int field1120;

    @ObfuscatedName("ax.o")
    public String field1121 = "null";

    @ObfuscatedName("ax.b")
    public short[] field1166;

    @ObfuscatedName("ax.j")
    public short[] field1123;

    @ObfuscatedName("ax.a")
    public short[] field1117;

    @ObfuscatedName("ax.u")
    public short[] field1125;

    @ObfuscatedName("ax.c")
    public int field1112 = 2000;

    @ObfuscatedName("ax.n")
    public int field1127 = 0;

    @ObfuscatedName("ax.q")
    public int field1128 = 0;

    @ObfuscatedName("ax.x")
    public int field1145 = 0;

    @ObfuscatedName("ax.v")
    public int field1111 = 0;

    @ObfuscatedName("ax.m")
    public int field1131 = 0;

    @ObfuscatedName("ax.w")
    public int field1132 = 0;

    @ObfuscatedName("ax.e")
    public int field1118 = 1;

    @ObfuscatedName("ax.ad")
    public boolean field1135 = false;

    @ObfuscatedName("ax.as")
    public String[] field1156 = new String[] { null, null, class158.field2448, null, null };

    @ObfuscatedName("ax.ag")
    public String[] field1122 = new String[] { null, null, null, null, class158.field2338 };

    @ObfuscatedName("ax.al")
    public int field1137 = -1;

    @ObfuscatedName("ax.av")
    public int field1130 = -1;

    @ObfuscatedName("ax.ar")
    public int field1139 = 0;

    @ObfuscatedName("ax.ay")
    public int field1140 = -1;

    @ObfuscatedName("ax.aq")
    public int field1141 = -1;

    @ObfuscatedName("ax.ai")
    public int field1136 = 0;

    @ObfuscatedName("ax.an")
    public int field1143 = -1;

    @ObfuscatedName("ax.aw")
    public int field1114 = -1;

    @ObfuscatedName("ax.ap")
    public int field1144 = -1;

    @ObfuscatedName("ax.ak")
    public int field1138 = -1;

    @ObfuscatedName("ax.ac")
    public int field1147 = -1;

    @ObfuscatedName("ax.ao")
    public int field1148 = -1;

    @ObfuscatedName("ax.aj")
    public int[] field1149;

    @ObfuscatedName("ax.ah")
    public int[] field1150;

    @ObfuscatedName("ax.ae")
    public int field1151 = -1;

    @ObfuscatedName("ax.aa")
    public int field1152 = -1;

    @ObfuscatedName("ax.au")
    public int field1142 = 128;

    @ObfuscatedName("ax.ab")
    public int field1154 = 128;

    @ObfuscatedName("ax.am")
    public int field1155 = 128;

    @ObfuscatedName("ax.at")
    public int field1146 = 0;

    @ObfuscatedName("ax.az")
    public int field1157 = 0;

    @ObfuscatedName("ax.af")
    public int field1158 = 0;

    @ObfuscatedName("ax.ax")
    public boolean field1159 = false;

    @ObfuscatedName("ax.bf")
    public int field1160 = -1;

    @ObfuscatedName("ax.bi")
    public int field1129 = -1;

    @ObfuscatedName("ax.br")
    public int field1162 = -1;

    @ObfuscatedName("ax.bd")
    public int field1163 = -1;

    @ObfuscatedName("du.t(II)Lax;")
    public static class52 method2583(int arg0) {
        class52 var1 = (class52) field1115.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1164.method3002(10, arg0);
        class52 var3 = new class52();
        var3.field1119 = arg0;
        if (var2 != null) {
            var3.method993(new class120(var2));
        }
        var3.method960();
        if (var3.field1152 != -1) {
            var3.method963(method2583(var3.field1152), method2583(var3.field1151));
        }
        if (var3.field1129 != -1) {
            var3.method975(method2583(var3.field1129), method2583(var3.field1160));
        }
        if (var3.field1163 != -1) {
            var3.method1012(method2583(var3.field1163), method2583(var3.field1162));
        }
        if (!Statics.field1161 && var3.field1135) {
            var3.field1121 = class158.field2516;
            var3.field1159 = false;
            var3.field1156 = null;
            var3.field1122 = null;
            var3.field1158 = 0;
        }
        field1115.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.i(I)V")
    public void method960() {
    }

    @ObfuscatedName("ax.g(Ldr;I)V")
    public void method993(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method964(arg0, var2);
        }
    }

    @ObfuscatedName("ax.h(Ldr;II)V")
    public void method964(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1120 = arg0.method2310();
        } else if (arg1 == 2) {
            this.field1121 = arg0.method2316();
        } else if (arg1 == 4) {
            this.field1112 = arg0.method2310();
        } else if (arg1 == 5) {
            this.field1127 = arg0.method2310();
        } else if (arg1 == 6) {
            this.field1128 = arg0.method2310();
        } else if (arg1 == 7) {
            this.field1111 = arg0.method2310();
            if (this.field1111 > 32767) {
                this.field1111 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1131 = arg0.method2310();
            if (this.field1131 > 32767) {
                this.field1131 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1132 = 1;
        } else if (arg1 == 12) {
            this.field1118 = arg0.method2345();
        } else if (arg1 == 16) {
            this.field1135 = true;
        } else if (arg1 == 23) {
            this.field1137 = arg0.method2310();
            this.field1139 = arg0.method2334();
        } else if (arg1 == 24) {
            this.field1130 = arg0.method2310();
        } else if (arg1 == 25) {
            this.field1140 = arg0.method2310();
            this.field1136 = arg0.method2334();
        } else if (arg1 == 26) {
            this.field1141 = arg0.method2310();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1156[arg1 - 30] = arg0.method2316();
            if (this.field1156[arg1 - 30].equalsIgnoreCase(class158.field2339)) {
                this.field1156[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1122[arg1 - 35] = arg0.method2316();
        } else if (arg1 == 40) {
            int var3 = arg0.method2334();
            this.field1166 = new short[var3];
            this.field1123 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1166[var4] = (short) arg0.method2310();
                this.field1123[var4] = (short) arg0.method2310();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2334();
            this.field1117 = new short[var5];
            this.field1125 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1117[var6] = (short) arg0.method2310();
                this.field1125[var6] = (short) arg0.method2310();
            }
        } else if (arg1 == 65) {
            this.field1159 = true;
        } else if (arg1 == 78) {
            this.field1143 = arg0.method2310();
        } else if (arg1 == 79) {
            this.field1114 = arg0.method2310();
        } else if (arg1 == 90) {
            this.field1144 = arg0.method2310();
        } else if (arg1 == 91) {
            this.field1147 = arg0.method2310();
        } else if (arg1 == 92) {
            this.field1138 = arg0.method2310();
        } else if (arg1 == 93) {
            this.field1148 = arg0.method2310();
        } else if (arg1 == 95) {
            this.field1145 = arg0.method2310();
        } else if (arg1 == 97) {
            this.field1151 = arg0.method2310();
        } else if (arg1 == 98) {
            this.field1152 = arg0.method2310();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1149 == null) {
                this.field1149 = new int[10];
                this.field1150 = new int[10];
            }
            this.field1149[arg1 - 100] = arg0.method2310();
            this.field1150[arg1 - 100] = arg0.method2310();
        } else if (arg1 == 110) {
            this.field1142 = arg0.method2310();
        } else if (arg1 == 111) {
            this.field1154 = arg0.method2310();
        } else if (arg1 == 112) {
            this.field1155 = arg0.method2310();
        } else if (arg1 == 113) {
            this.field1146 = arg0.method2309();
        } else if (arg1 == 114) {
            this.field1157 = arg0.method2309() * 5;
        } else if (arg1 == 115) {
            this.field1158 = arg0.method2334();
        } else if (arg1 == 139) {
            this.field1160 = arg0.method2310();
        } else if (arg1 == 140) {
            this.field1129 = arg0.method2310();
        } else if (arg1 == 148) {
            this.field1162 = arg0.method2310();
        } else if (arg1 == 149) {
            this.field1163 = arg0.method2310();
        }
    }

    @ObfuscatedName("ax.z(Lax;Lax;I)V")
    public void method963(class52 arg0, class52 arg1) {
        this.field1120 = arg0.field1120;
        this.field1112 = arg0.field1112;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1145 = arg0.field1145;
        this.field1111 = arg0.field1111;
        this.field1131 = arg0.field1131;
        this.field1166 = arg0.field1166;
        this.field1123 = arg0.field1123;
        this.field1117 = arg0.field1117;
        this.field1125 = arg0.field1125;
        this.field1121 = arg1.field1121;
        this.field1135 = arg1.field1135;
        this.field1118 = arg1.field1118;
        this.field1132 = 1;
    }

    @ObfuscatedName("ax.r(Lax;Lax;I)V")
    public void method975(class52 arg0, class52 arg1) {
        this.field1120 = arg0.field1120;
        this.field1112 = arg0.field1112;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1145 = arg0.field1145;
        this.field1111 = arg0.field1111;
        this.field1131 = arg0.field1131;
        this.field1166 = arg1.field1166;
        this.field1123 = arg1.field1123;
        this.field1117 = arg1.field1117;
        this.field1125 = arg1.field1125;
        this.field1121 = arg1.field1121;
        this.field1135 = arg1.field1135;
        this.field1132 = arg1.field1132;
        this.field1137 = arg1.field1137;
        this.field1130 = arg1.field1130;
        this.field1143 = arg1.field1143;
        this.field1140 = arg1.field1140;
        this.field1141 = arg1.field1141;
        this.field1114 = arg1.field1114;
        this.field1144 = arg1.field1144;
        this.field1138 = arg1.field1138;
        this.field1147 = arg1.field1147;
        this.field1148 = arg1.field1148;
        this.field1158 = arg1.field1158;
        this.field1156 = arg1.field1156;
        this.field1122 = new String[5];
        if (arg1.field1122 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1122[var3] = arg1.field1122[var3];
            }
        }
        this.field1122[4] = class158.field2343;
        this.field1118 = 0;
    }

    @ObfuscatedName("ax.f(Lax;Lax;I)V")
    public void method1012(class52 arg0, class52 arg1) {
        this.field1120 = arg0.field1120;
        this.field1112 = arg0.field1112;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1145 = arg0.field1145;
        this.field1111 = arg0.field1111;
        this.field1131 = arg0.field1131;
        this.field1166 = arg0.field1166;
        this.field1123 = arg0.field1123;
        this.field1117 = arg0.field1117;
        this.field1125 = arg0.field1125;
        this.field1132 = arg0.field1132;
        this.field1121 = arg1.field1121;
        this.field1118 = 0;
        this.field1135 = false;
        this.field1159 = false;
    }

    @ObfuscatedName("ax.s(IB)Lca;")
    public final class101 method965(int arg0) {
        if (this.field1149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1150[var3] && this.field1150[var3] != 0) {
                    var2 = this.field1149[var3];
                }
            }
            if (var2 != -1) {
                return method2583(var2).method965(1);
            }
        }
        class101 var4 = class101.method2021(Statics.field3219, this.field1120, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1142 != 128 || this.field1154 != 128 || this.field1155 != 128) {
            var4.method2026(this.field1142, this.field1154, this.field1155);
        }
        if (this.field1166 != null) {
            for (int var5 = 0; var5 < this.field1166.length; var5++) {
                var4.method2050(this.field1166[var5], this.field1123[var5]);
            }
        }
        if (this.field1117 != null) {
            for (int var6 = 0; var6 < this.field1117.length; var6++) {
                var4.method2038(this.field1117[var6], this.field1125[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ax.d(IS)Ldk;")
    public final class106 method966(int arg0) {
        if (this.field1149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1150[var3] && this.field1150[var3] != 0) {
                    var2 = this.field1149[var3];
                }
            }
            if (var2 != -1) {
                return method2583(var2).method966(1);
            }
        }
        class106 var4 = (class106) field1116.method3453((long) this.field1119);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2021(Statics.field3219, this.field1120, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1142 != 128 || this.field1154 != 128 || this.field1155 != 128) {
            var5.method2026(this.field1142, this.field1154, this.field1155);
        }
        if (this.field1166 != null) {
            for (int var6 = 0; var6 < this.field1166.length; var6++) {
                var5.method2050(this.field1166[var6], this.field1123[var6]);
            }
        }
        if (this.field1117 != null) {
            for (int var7 = 0; var7 < this.field1117.length; var7++) {
                var5.method2038(this.field1117[var7], this.field1125[var7]);
            }
        }
        class106 var8 = var5.method2030(this.field1146 + 64, this.field1157 + 768, -50, -10, -50);
        var8.field1807 = true;
        field1116.method3461(var8, (long) this.field1119);
        return var8;
    }

    @ObfuscatedName("ax.l(II)Lax;")
    public class52 method967(int arg0) {
        if (this.field1149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1150[var3] && this.field1150[var3] != 0) {
                    var2 = this.field1149[var3];
                }
            }
            if (var2 != -1) {
                return method2583(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("client.y(IIIIIZI)Lcj;")
    public static final class79 method533(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1134.method3453(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2583(arg0);
        if (arg1 > 1 && var9.field1149 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1150[var11] && var9.field1150[var11] != 0) {
                    var10 = var9.field1149[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2583(var10);
            }
        }
        class106 var12 = var9.method966(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1152 != -1) {
            var13 = method533(var9.field1151, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1129 != -1) {
            var13 = method533(var9.field1160, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1163 != -1) {
            var13 = method533(var9.field1162, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1419;
        int var15 = Statics.field1422;
        int var16 = Statics.field1418;
        int[] var17 = new int[4];
        class80.method1636(var17);
        class79 var18 = new class79(36, 32);
        class80.method1632(var18.field1410, 36, 32);
        class80.method1638();
        class92.method1945();
        class92.method1963(16, 16);
        class92.field1583 = false;
        if (var9.field1163 != -1) {
            var13.method1548(0, 0);
        }
        int var19 = var9.field1112;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1603[var9.field1127] * var19 >> 16;
        int var21 = class92.field1604[var9.field1127] * var19 >> 16;
        var12.method2107();
        var12.method2117(0, var9.field1128, var9.field1145, var9.field1127, var9.field1111, var9.field1131 + var12.field1467 / 2 + var20, var9.field1131 + var21);
        if (var9.field1129 != -1) {
            var13.method1548(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1552(1);
        }
        if (arg2 >= 2) {
            var18.method1552(16777215);
        }
        if (arg3 != 0) {
            var18.method1575(arg3);
        }
        class80.method1632(var18.field1410, 36, 32);
        if (var9.field1152 != -1) {
            var13.method1548(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1132 == 1) {
            Statics.field1133.method3705(method1988(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1134.method3461(var18, var6);
        }
        class80.method1632(var14, var15, var16);
        class80.method1637(var17);
        class92.method1945();
        class92.field1583 = true;
        return var18;
    }

    @ObfuscatedName("cs.p(IB)Ljava/lang/String;")
    public static final String method1988(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class158.field2527 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class158.field2496 + "</col>";
        }
    }

    @ObfuscatedName("ax.k(ZI)Z")
    public final boolean method989(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1130;
        int var4 = this.field1143;
        if (arg0) {
            var2 = this.field1140;
            var3 = this.field1141;
            var4 = this.field1114;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3219.method3040(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3219.method3040(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3219.method3040(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ax.o(ZI)Lca;")
    public final class101 method968(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1130;
        int var4 = this.field1143;
        if (arg0) {
            var2 = this.field1140;
            var3 = this.field1141;
            var4 = this.field1114;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2021(Statics.field3219, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2021(Statics.field3219, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2021(Statics.field3219, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1139 != 0) {
            var5.method2022(0, this.field1139, 0);
        }
        if (arg0 && this.field1136 != 0) {
            var5.method2022(0, this.field1136, 0);
        }
        if (this.field1166 != null) {
            for (int var10 = 0; var10 < this.field1166.length; var10++) {
                var5.method2050(this.field1166[var10], this.field1123[var10]);
            }
        }
        if (this.field1117 != null) {
            for (int var11 = 0; var11 < this.field1117.length; var11++) {
                var5.method2038(this.field1117[var11], this.field1125[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ax.b(ZI)Z")
    public final boolean method970(boolean arg0) {
        int var2 = this.field1144;
        int var3 = this.field1138;
        if (arg0) {
            var2 = this.field1147;
            var3 = this.field1148;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3219.method3040(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3219.method3040(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ax.j(ZB)Lca;")
    public final class101 method971(boolean arg0) {
        int var2 = this.field1144;
        int var3 = this.field1138;
        if (arg0) {
            var2 = this.field1147;
            var3 = this.field1148;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2021(Statics.field3219, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2021(Statics.field3219, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1166 != null) {
            for (int var7 = 0; var7 < this.field1166.length; var7++) {
                var4.method2050(this.field1166[var7], this.field1123[var7]);
            }
        }
        if (this.field1117 != null) {
            for (int var8 = 0; var8 < this.field1117.length; var8++) {
                var4.method2038(this.field1117[var8], this.field1125[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("c.a(B)V")
    public static void method169() {
        field1115.method3454();
        field1116.method3454();
        field1134.method3454();
    }

    @ObfuscatedName("ae.u(B)V")
    public static void method857() {
        field1134.method3454();
    }
}
