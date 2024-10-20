package deob;

@ObfuscatedName("ck")
public final class class83 extends class85 {

    @ObfuscatedName("ck.c")
    public class440 field1071;

    @ObfuscatedName("ck.b")
    public class279 field1046;

    @ObfuscatedName("ck.p")
    public int field1048 = -1;

    @ObfuscatedName("ck.m")
    public int field1049 = -1;

    @ObfuscatedName("ck.s")
    public String[] field1064 = new String[3];

    @ObfuscatedName("ck.j")
    public int field1052;

    @ObfuscatedName("ck.w")
    public int field1066;

    @ObfuscatedName("ck.n")
    public int field1054;

    @ObfuscatedName("ck.r")
    public int field1053;

    @ObfuscatedName("ck.o")
    public int field1051;

    @ObfuscatedName("ck.v")
    public int field1057;

    @ObfuscatedName("ck.d")
    public int field1073;

    @ObfuscatedName("ck.h")
    public int field1059;

    @ObfuscatedName("ck.g")
    public class204 field1047;

    @ObfuscatedName("ck.e")
    public int field1061;

    @ObfuscatedName("ck.a")
    public int field1062;

    @ObfuscatedName("ck.u")
    public int field1063;

    @ObfuscatedName("ck.k")
    public int field1050;

    @ObfuscatedName("ck.f")
    public boolean field1065;

    @ObfuscatedName("ck.l")
    public int field1060;

    @ObfuscatedName("ck.q")
    public boolean field1067;

    @ObfuscatedName("ck.x")
    public int field1068;

    @ObfuscatedName("ck.z")
    public int field1069;

    @ObfuscatedName("ck.i")
    public class355 field1070;

    @ObfuscatedName("ck.y")
    public class355 field1075;

    @ObfuscatedName("ck.ah")
    public class355 field1072;

    @ObfuscatedName("ck.ao")
    public boolean field1056;

    @ObfuscatedName("ck.ab")
    public int field1074;

    @ObfuscatedName("ck.ax")
    public int field1055;

    public class83() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1064[var1] = "";
        }
        this.field1052 = 0;
        this.field1066 = 0;
        this.field1053 = 0;
        this.field1051 = 0;
        this.field1065 = false;
        this.field1060 = 0;
        this.field1067 = false;
        this.field1070 = class355.field4129;
        this.field1075 = class355.field4129;
        this.field1072 = class355.field4129;
        this.field1056 = false;
    }

    @ObfuscatedName("ck.c(Lpi;I)V")
    public final void method2074(class419 arg0) {
        arg0.field4475 = 0;
        int var2 = arg0.method6781();
        this.field1048 = arg0.method6846();
        this.field1049 = arg0.method6846();
        int var3 = -1;
        this.field1060 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6781();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6781();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method6672();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class181.method2432(var4[var5] - 512).field2003;
                    if (var8 != 0) {
                        this.field1060 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6781();
            if (var11 < 0 || var11 >= Statics.field1383[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1095 = arg0.method6672();
        if (this.field1095 == 65535) {
            this.field1095 = -1;
        }
        this.field1146 = arg0.method6672();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1097 = this.field1146;
        this.field1098 = arg0.method6672();
        if (this.field1098 == 65535) {
            this.field1098 = -1;
        }
        this.field1143 = arg0.method6672();
        if (this.field1143 == 65535) {
            this.field1143 = -1;
        }
        this.field1100 = arg0.method6672();
        if (this.field1100 == 65535) {
            this.field1100 = -1;
        }
        this.field1091 = arg0.method6672();
        if (this.field1091 == 65535) {
            this.field1091 = -1;
        }
        this.field1102 = arg0.method6672();
        if (this.field1102 == 65535) {
            this.field1102 = -1;
        }
        this.field1071 = new class440(arg0.method6707(), Statics.field2283);
        this.method2068();
        this.method2071();
        this.method2084();
        if (Statics.field4070 == this) {
            Statics.field4617 = this.field1071.method7187();
        }
        this.field1052 = arg0.method6781();
        this.field1066 = arg0.method6672();
        this.field1067 = arg0.method6781() == 1;
        if (client.field476 == 0 && client.field547 >= 2) {
            this.field1067 = false;
        }
        class161[] var12 = null;
        boolean var13 = false;
        if (arg0.field4475 < arg0.field4477.length) {
            int var14 = arg0.method6672();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class161[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        var12[var15] = class161.method2605(var4[var15] - 512, arg0);
                    }
                }
            }
        }
        if (this.field1046 == null) {
            this.field1046 = new class279();
        }
        this.field1046.method4854(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("ck.p(I)Z")
    public boolean method2067() {
        if (class355.field4129 == this.field1070) {
            this.method2069();
        }
        return class355.field4123 == this.field1070;
    }

    @ObfuscatedName("ck.m(B)V")
    public void method2068() {
        this.field1070 = class355.field4129;
    }

    @ObfuscatedName("ck.t(I)V")
    public void method2069() {
        this.field1070 = Statics.field182.method1700(this.field1071) ? class355.field4123 : class355.field4122;
    }

    @ObfuscatedName("ck.r(B)Z")
    public boolean method2120() {
        if (class355.field4129 == this.field1075) {
            this.method2081();
        }
        return class355.field4123 == this.field1075;
    }

    @ObfuscatedName("ck.o(I)V")
    public void method2071() {
        this.field1075 = class355.field4129;
    }

    @ObfuscatedName("ck.v(B)V")
    public void method2081() {
        this.field1075 = Statics.field1252 != null && Statics.field1252.method5822(this.field1071) ? class355.field4123 : class355.field4122;
    }

    @ObfuscatedName("ck.d(I)V")
    public void method2073() {
        for (int var1 = 0; var1 < 2; var1++) {
            if (client.field706[var1] != null && client.field706[var1].method2672(this.field1071.method7187()) != -1) {
                this.field1072 = class355.field4123;
                return;
            }
        }
        this.field1072 = class355.field4122;
    }

    @ObfuscatedName("ck.h(I)V")
    public void method2084() {
        this.field1072 = class355.field4129;
    }

    @ObfuscatedName("ck.g(I)Z")
    public boolean method2075() {
        if (class355.field4129 == this.field1072) {
            this.method2073();
        }
        return class355.field4123 == this.field1072;
    }

    @ObfuscatedName("ck.e(I)I")
    public int method2076() {
        return this.field1046 == null || this.field1046.field3195 == -1 ? 1 : class171.method4029(this.field1046.field3195).field1839;
    }

    @ObfuscatedName("ck.b(I)Lgo;")
    public final class204 method1860() {
        if (this.field1046 == null) {
            return null;
        }
        class183 var1 = this.field1103 != -1 && this.field1148 == 0 ? class183.method2402(this.field1103) : null;
        class183 var2 = this.field1104 == -1 || this.field1065 || this.field1104 == this.field1095 && var1 != null ? null : class183.method2402(this.field1104);
        class204 var3 = this.field1046.method4876(var1, this.field1124, var2, this.field1089);
        if (var3 == null) {
            return null;
        }
        var3.method3872();
        this.field1113 = var3.field2360;
        if (!this.field1065 && this.field1128 != -1 && this.field1129 != -1) {
            class204 var4 = class173.method6501(this.field1128).method3047(this.field1129);
            if (var4 != null) {
                var4.method3888(0, -this.field1132, 0);
                class204[] var5 = new class204[] { var3, var4 };
                var3 = new class204(var5, 2);
            }
        }
        if (!this.field1065 && this.field1047 != null) {
            if (client.field481 >= this.field1051) {
                this.field1047 = null;
            }
            if (client.field481 >= this.field1053 && client.field481 < this.field1051) {
                class204 var6 = this.field1047;
                var6.method3888(this.field1057 - this.field1130, this.field1073 - this.field1054, this.field1059 - this.field1090);
                if (this.field1140 == 512) {
                    var6.method3884();
                    var6.method3884();
                    var6.method3884();
                } else if (this.field1140 == 1024) {
                    var6.method3884();
                    var6.method3884();
                } else if (this.field1140 == 1536) {
                    var6.method3884();
                }
                class204[] var7 = new class204[] { var3, var6 };
                var3 = new class204(var7, 2);
                if (this.field1140 == 512) {
                    var6.method3884();
                } else if (this.field1140 == 1024) {
                    var6.method3884();
                    var6.method3884();
                } else if (this.field1140 == 1536) {
                    var6.method3884();
                    var6.method3884();
                    var6.method3884();
                }
                var6.method3888(this.field1130 - this.field1057, this.field1054 - this.field1073, this.field1090 - this.field1059);
            }
        }
        var3.field2429 = true;
        if (this.field1147 == 0 || client.field481 < this.field1142 || client.field481 >= this.field1141) {
            var3.field2475 = 0;
        } else {
            var3.field2495 = this.field1144;
            var3.field2496 = this.field1145;
            var3.field2480 = this.field1096;
            var3.field2475 = this.field1147;
        }
        return var3;
    }

    @ObfuscatedName("ck.a(IILgj;I)V")
    public final void method2077(int arg0, int arg1, class186 arg2) {
        if (this.field1103 != -1 && class183.method2402(this.field1103).field2098 == 1) {
            this.field1103 = -1;
        }
        this.field1123 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2102(arg0, arg1);
        } else if (this.field1152[0] >= 0 && this.field1152[0] < 104 && this.field1153[0] >= 0 && this.field1153[0] < 104) {
            if (class186.field2123 == arg2) {
                client.method5047(this, arg0, arg1, class186.field2123);
            }
            this.method2079(arg0, arg1, arg2);
        } else {
            this.method2102(arg0, arg1);
        }
    }

    @ObfuscatedName("ck.u(III)V")
    public void method2102(int arg0, int arg1) {
        this.field1151 = 0;
        this.field1099 = 0;
        this.field1118 = 0;
        this.field1152[0] = arg0;
        this.field1153[0] = arg1;
        int var3 = this.method2076();
        this.field1130 = this.field1152[0] * 128 + var3 * 64;
        this.field1090 = this.field1153[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ck.k(IILgj;I)V")
    public final void method2079(int arg0, int arg1, class186 arg2) {
        if (this.field1151 < 9) {
            this.field1151++;
        }
        for (int var4 = this.field1151; var4 > 0; var4--) {
            this.field1152[var4] = this.field1152[var4 - 1];
            this.field1153[var4] = this.field1153[var4 - 1];
            this.field1154[var4] = this.field1154[var4 - 1];
        }
        this.field1152[0] = arg0;
        this.field1153[0] = arg1;
        this.field1154[0] = arg2;
    }

    @ObfuscatedName("ck.f(B)Z")
    public final boolean method2080() {
        return this.field1046 != null;
    }
}
