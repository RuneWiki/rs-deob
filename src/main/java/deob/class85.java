package deob;

@ObfuscatedName("ci")
public final class class85 extends class87 {

    @ObfuscatedName("ci.c")
    public class464 field1114;

    @ObfuscatedName("ci.v")
    public class292 field1087;

    @ObfuscatedName("ci.q")
    public int field1088 = -1;

    @ObfuscatedName("ci.f")
    public int field1108 = -1;

    @ObfuscatedName("ci.e")
    public String[] field1090 = new String[3];

    @ObfuscatedName("ci.g")
    public int field1091;

    @ObfuscatedName("ci.w")
    public int field1092;

    @ObfuscatedName("ci.y")
    public int field1093;

    @ObfuscatedName("ci.i")
    public int field1086;

    @ObfuscatedName("ci.s")
    public int field1098;

    @ObfuscatedName("ci.t")
    public int field1096;

    @ObfuscatedName("ci.z")
    public int field1097;

    @ObfuscatedName("ci.r")
    public int field1109;

    @ObfuscatedName("ci.u")
    public class211 field1099;

    @ObfuscatedName("ci.k")
    public int field1100;

    @ObfuscatedName("ci.h")
    public int field1095;

    @ObfuscatedName("ci.x")
    public int field1102;

    @ObfuscatedName("ci.l")
    public int field1115;

    @ObfuscatedName("ci.a")
    public boolean field1104;

    @ObfuscatedName("ci.p")
    public int field1105;

    @ObfuscatedName("ci.b")
    public boolean field1101;

    @ObfuscatedName("ci.n")
    public int field1107;

    @ObfuscatedName("ci.o")
    public int field1112;

    @ObfuscatedName("ci.m")
    public class376 field1111;

    @ObfuscatedName("ci.d")
    public class376 field1110;

    @ObfuscatedName("ci.ad")
    public class376 field1106;

    @ObfuscatedName("ci.ak")
    public boolean field1089;

    @ObfuscatedName("ci.al")
    public int field1113;

    @ObfuscatedName("ci.ao")
    public int field1103;

    public class85() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1090[var1] = "";
        }
        this.field1091 = 0;
        this.field1092 = 0;
        this.field1086 = 0;
        this.field1098 = 0;
        this.field1104 = false;
        this.field1105 = 0;
        this.field1101 = false;
        this.field1111 = class376.field4334;
        this.field1110 = class376.field4334;
        this.field1106 = class376.field4334;
        this.field1089 = false;
    }

    @ObfuscatedName("ci.c(Lqt;I)V")
    public final void method2055(class443 arg0) {
        arg0.field4700 = 0;
        int var2 = arg0.method7047();
        this.field1088 = arg0.method7048();
        this.field1108 = arg0.method7048();
        int var3 = -1;
        this.field1105 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method7047();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method7047();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method7049();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class188.method3161(var4[var5] - 512).field2141;
                    if (var8 != 0) {
                        this.field1105 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method7047();
            if (var11 < 0 || var11 >= Statics.field3343[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1168 = arg0.method7049();
        if (this.field1168 == 65535) {
            this.field1168 = -1;
        }
        this.field1149 = arg0.method7049();
        if (this.field1149 == 65535) {
            this.field1149 = -1;
        }
        this.field1198 = this.field1149;
        this.field1165 = arg0.method7049();
        if (this.field1165 == 65535) {
            this.field1165 = -1;
        }
        this.field1140 = arg0.method7049();
        if (this.field1140 == 65535) {
            this.field1140 = -1;
        }
        this.field1170 = arg0.method7049();
        if (this.field1170 == 65535) {
            this.field1170 = -1;
        }
        this.field1142 = arg0.method7049();
        if (this.field1142 == 65535) {
            this.field1142 = -1;
        }
        this.field1143 = arg0.method7049();
        if (this.field1143 == 65535) {
            this.field1143 = -1;
        }
        this.field1114 = new class464(arg0.method7057(), Statics.field1888);
        this.method2028();
        this.method2031();
        this.method2034();
        if (Statics.field1366 == this) {
            Statics.field4838 = this.field1114.method7617();
        }
        this.field1091 = arg0.method7047();
        this.field1092 = arg0.method7049();
        this.field1101 = arg0.method7047() == 1;
        if (client.field479 == 0 && client.field664 >= 2) {
            this.field1101 = false;
        }
        class168[] var12 = null;
        boolean var13 = false;
        int var14 = arg0.method7049();
        boolean var15 = (var14 >> 15 & 0x1) == 1;
        if (var14 > 0 && var14 != 32768) {
            var12 = new class168[12];
            for (int var16 = 0; var16 < 12; var16++) {
                int var17 = var14 >> 12 - var16 & 0x1;
                if (var17 == 1) {
                    var12[var16] = class168.method2484(var4[var16] - 512, arg0);
                }
            }
        }
        if (arg0.field4700 < arg0.field4701.length) {
            for (int var18 = 0; var18 < 3; var18++) {
                this.field1090[var18] = arg0.method7057();
            }
        }
        if (this.field1087 == null) {
            this.field1087 = new class292();
        }
        this.field1087.method5036(var4, var12, var15, var9, var2 == 1, var3);
    }

    @ObfuscatedName("ci.q(I)Z")
    public boolean method2027() {
        if (class376.field4334 == this.field1111) {
            this.method2073();
        }
        return class376.field4331 == this.field1111;
    }

    @ObfuscatedName("ci.f(I)V")
    public void method2028() {
        this.field1111 = class376.field4334;
    }

    @ObfuscatedName("ci.j(B)V")
    public void method2073() {
        this.field1111 = Statics.field1116.method1558(this.field1114) ? class376.field4331 : class376.field4332;
    }

    @ObfuscatedName("ci.w(I)Z")
    public boolean method2030() {
        if (class376.field4334 == this.field1110) {
            this.method2032();
        }
        return class376.field4331 == this.field1110;
    }

    @ObfuscatedName("ci.y(I)V")
    public void method2031() {
        this.field1110 = class376.field4334;
    }

    @ObfuscatedName("ci.i(I)V")
    public void method2032() {
        this.field1110 = Statics.field3294 != null && Statics.field3294.method6158(this.field1114) ? class376.field4331 : class376.field4332;
    }

    @ObfuscatedName("ci.s(I)V")
    public void method2033() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field724[var1] != null && client.field724[var1].method2780(this.field1114.method7617()) != -1 && var1 != 2) {
                this.field1106 = class376.field4331;
                return;
            }
        }
        this.field1106 = class376.field4332;
    }

    @ObfuscatedName("ci.t(I)V")
    public void method2034() {
        this.field1106 = class376.field4334;
    }

    @ObfuscatedName("ci.z(I)Z")
    public boolean method2035() {
        if (class376.field4334 == this.field1106) {
            this.method2033();
        }
        return class376.field4331 == this.field1106;
    }

    @ObfuscatedName("ci.r(B)I")
    public int method2029() {
        return this.field1087 == null || this.field1087.field3337 == -1 ? 1 : class178.method2492(this.field1087.field3337).field1919;
    }

    @ObfuscatedName("ci.v(I)Lhy;")
    public final class211 method1782() {
        if (this.field1087 == null) {
            return null;
        }
        class190 var1 = this.field1171 != -1 && this.field1174 == 0 ? class190.method983(this.field1171) : null;
        class190 var2 = this.field1147 == -1 || this.field1104 || this.field1168 == this.field1147 && var1 != null ? null : class190.method983(this.field1147);
        class211 var3 = this.field1087.method5064(var1, this.field1176, var2, this.field1169);
        if (var3 == null) {
            return null;
        }
        var3.method4080();
        this.field1189 = var3.field2447;
        if (!this.field1104 && this.field1175 != -1 && this.field1177 != -1) {
            class211 var4 = class180.method1612(this.field1175).method3213(this.field1177);
            if (var4 != null) {
                var4.method4072(0, -this.field1144, 0);
                class211[] var5 = new class211[] { var3, var4 };
                var3 = new class211(var5, 2);
            }
        }
        if (!this.field1104 && this.field1099 != null) {
            if (client.field552 >= this.field1098) {
                this.field1099 = null;
            }
            if (client.field552 >= this.field1086 && client.field552 < this.field1098) {
                class211 var6 = this.field1099;
                var6.method4072(this.field1096 - this.field1137, this.field1097 - this.field1093, this.field1109 - this.field1131);
                if (this.field1196 == 512) {
                    var6.method4068();
                    var6.method4068();
                    var6.method4068();
                } else if (this.field1196 == 1024) {
                    var6.method4068();
                    var6.method4068();
                } else if (this.field1196 == 1536) {
                    var6.method4068();
                }
                class211[] var7 = new class211[] { var3, var6 };
                var3 = new class211(var7, 2);
                if (this.field1196 == 512) {
                    var6.method4068();
                } else if (this.field1196 == 1024) {
                    var6.method4068();
                    var6.method4068();
                } else if (this.field1196 == 1536) {
                    var6.method4068();
                    var6.method4068();
                    var6.method4068();
                }
                var6.method4072(this.field1137 - this.field1096, this.field1093 - this.field1097, this.field1131 - this.field1109);
            }
        }
        var3.field2537 = true;
        if (this.field1134 == 0 || client.field552 < this.field1190 || client.field552 >= this.field1136) {
            var3.field2584 = 0;
        } else {
            var3.field2575 = this.field1192;
            var3.field2582 = this.field1193;
            var3.field2583 = this.field1194;
            var3.field2584 = this.field1134;
        }
        return var3;
    }

    @ObfuscatedName("ci.u(IILgn;S)V")
    public final void method2037(int arg0, int arg1, class193 arg2) {
        if (this.field1171 != -1 && class190.method983(this.field1171).field2189 == 1) {
            this.field1171 = -1;
        }
        this.field1166 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2038(arg0, arg1);
        } else if (this.field1200[0] >= 0 && this.field1200[0] < 104 && this.field1201[0] >= 0 && this.field1201[0] < 104) {
            if (class193.field2212 == arg2) {
                client.method5226(this, arg0, arg1, class193.field2212);
            }
            this.method2039(arg0, arg1, arg2);
        } else {
            this.method2038(arg0, arg1);
        }
    }

    @ObfuscatedName("ci.k(IIB)V")
    public void method2038(int arg0, int arg1) {
        this.field1199 = 0;
        this.field1204 = 0;
        this.field1203 = 0;
        this.field1200[0] = arg0;
        this.field1201[0] = arg1;
        int var3 = this.method2029();
        this.field1137 = this.field1200[0] * 128 + var3 * 64;
        this.field1131 = this.field1201[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ci.h(IILgn;I)V")
    public final void method2039(int arg0, int arg1, class193 arg2) {
        if (this.field1199 < 9) {
            this.field1199++;
        }
        for (int var4 = this.field1199; var4 > 0; var4--) {
            this.field1200[var4] = this.field1200[var4 - 1];
            this.field1201[var4] = this.field1201[var4 - 1];
            this.field1202[var4] = this.field1202[var4 - 1];
        }
        this.field1200[0] = arg0;
        this.field1201[0] = arg1;
        this.field1202[0] = arg2;
    }

    @ObfuscatedName("ci.x(I)Z")
    public final boolean method2059() {
        return this.field1087 != null;
    }
}
