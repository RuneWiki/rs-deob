package deob;

@ObfuscatedName("cj")
public final class class89 extends class92 {

    @ObfuscatedName("cj.h")
    public class490 field1136;

    @ObfuscatedName("cj.e")
    public class303 field1123;

    @ObfuscatedName("cj.v")
    public int field1124 = -1;

    @ObfuscatedName("cj.x")
    public int field1125 = -1;

    @ObfuscatedName("cj.q")
    public String[] field1146 = new String[3];

    @ObfuscatedName("cj.f")
    public int field1127;

    @ObfuscatedName("cj.r")
    public int field1128;

    @ObfuscatedName("cj.u")
    public int field1130;

    @ObfuscatedName("cj.b")
    public int field1147;

    @ObfuscatedName("cj.j")
    public int field1131;

    @ObfuscatedName("cj.g")
    public int field1132;

    @ObfuscatedName("cj.i")
    public int field1122;

    @ObfuscatedName("cj.o")
    public int field1138;

    @ObfuscatedName("cj.n")
    public class224 field1135;

    @ObfuscatedName("cj.k")
    public int field1149;

    @ObfuscatedName("cj.a")
    public int field1137;

    @ObfuscatedName("cj.s")
    public int field1133;

    @ObfuscatedName("cj.l")
    public int field1129;

    @ObfuscatedName("cj.t")
    public boolean field1140;

    @ObfuscatedName("cj.c")
    public int field1126;

    @ObfuscatedName("cj.p")
    public boolean field1142;

    @ObfuscatedName("cj.d")
    public int field1143;

    @ObfuscatedName("cj.y")
    public int field1144;

    @ObfuscatedName("cj.z")
    public class399 field1145;

    @ObfuscatedName("cj.w")
    public class399 field1139;

    @ObfuscatedName("cj.as")
    public class399 field1141;

    @ObfuscatedName("cj.ad")
    public boolean field1134;

    @ObfuscatedName("cj.ao")
    public int field1148;

    @ObfuscatedName("cj.am")
    public int field1150;

    public class89() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1146[var1] = "";
        }
        this.field1127 = 0;
        this.field1128 = 0;
        this.field1147 = 0;
        this.field1131 = 0;
        this.field1140 = false;
        this.field1126 = 0;
        this.field1142 = false;
        this.field1145 = class399.field4546;
        this.field1139 = class399.field4546;
        this.field1141 = class399.field4546;
        this.field1134 = false;
    }

    @ObfuscatedName("cj.h(Lqy;B)V")
    public final void method2185(class467 arg0) {
        arg0.field4915 = 0;
        int var2 = arg0.method7792();
        int var3 = -1;
        this.field1124 = arg0.method7793();
        this.field1125 = arg0.method7793();
        int var4 = -1;
        this.field1126 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method7792();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method7792();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method7794();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class197.method3345(var5[var6] - 512).field2256;
                    if (var9 != 0) {
                        this.field1126 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[5];
        for (int var11 = 0; var11 < 5; var11++) {
            int var12 = arg0.method7792();
            if (var12 < 0 || var12 >= Statics.field4549[var11].length) {
                var12 = 0;
            }
            var10[var11] = var12;
        }
        this.field1184 = arg0.method7794();
        if (this.field1184 == 65535) {
            this.field1184 = -1;
        }
        this.field1189 = arg0.method7794();
        if (this.field1189 == 65535) {
            this.field1189 = -1;
        }
        this.field1251 = this.field1189;
        this.field1187 = arg0.method7794();
        if (this.field1187 == 65535) {
            this.field1187 = -1;
        }
        this.field1248 = arg0.method7794();
        if (this.field1248 == 65535) {
            this.field1248 = -1;
        }
        this.field1205 = arg0.method7794();
        if (this.field1205 == 65535) {
            this.field1205 = -1;
        }
        this.field1190 = arg0.method7794();
        if (this.field1190 == 65535) {
            this.field1190 = -1;
        }
        this.field1181 = arg0.method7794();
        if (this.field1181 == 65535) {
            this.field1181 = -1;
        }
        this.field1136 = new class490(arg0.method7801(), Statics.field986);
        this.method2165();
        this.method2174();
        this.method2171();
        if (Statics.field1790 == this) {
            Statics.field5069 = this.field1136.method8383();
        }
        this.field1127 = arg0.method7792();
        this.field1128 = arg0.method7794();
        this.field1142 = arg0.method7792() == 1;
        if (client.field509 == 0 && client.field769 >= 2) {
            this.field1142 = false;
        }
        class176[] var13 = null;
        boolean var14 = false;
        int var15 = arg0.method7794();
        boolean var16 = (var15 >> 15 & 0x1) == 1;
        if (var15 > 0 && var15 != 32768) {
            var13 = new class176[12];
            for (int var17 = 0; var17 < 12; var17++) {
                int var18 = var15 >> 12 - var17 & 0x1;
                if (var18 == 1) {
                    int var21 = var5[var17] - 512;
                    int var22 = arg0.method7792();
                    boolean var23 = (var22 & 0x1) != 0;
                    boolean var24 = (var22 & 0x2) != 0;
                    class176 var25 = new class176(var21);
                    if (var23) {
                        int var26 = arg0.method7792();
                        int[] var27 = new int[] { var26 & 0xF, var26 >> 4 & 0xF };
                        boolean var28 = var25.field1914 != null && var25.field1914.length == var27.length;
                        for (int var29 = 0; var29 < 2; var29++) {
                            if (var27[var29] != 15) {
                                short var30 = (short) arg0.method7794();
                                if (var28) {
                                    var25.field1914[var27[var29]] = var30;
                                }
                            }
                        }
                    }
                    if (var24) {
                        int var31 = arg0.method7792();
                        int[] var32 = new int[] { var31 & 0xF, var31 >> 4 & 0xF };
                        boolean var33 = var25.field1915 != null && var25.field1915.length == var32.length;
                        for (int var34 = 0; var34 < 2; var34++) {
                            if (var32[var34] != 15) {
                                short var35 = (short) arg0.method7794();
                                if (var33) {
                                    var25.field1915[var32[var34]] = var35;
                                }
                            }
                        }
                    }
                    var13[var17] = var25;
                }
            }
        }
        for (int var37 = 0; var37 < 3; var37++) {
            this.field1146[var37] = arg0.method7801();
        }
        if (client.field516 > 208) {
            var3 = arg0.method7792();
        }
        if (this.field1123 == null) {
            this.field1123 = new class303();
        }
        this.field1123.method5281(var5, var13, var16, var10, var2, var4, var3);
    }

    @ObfuscatedName("cj.m(I)Z")
    public boolean method2163() {
        if (class399.field4546 == this.field1145) {
            this.method2166();
        }
        return class399.field4547 == this.field1145;
    }

    @ObfuscatedName("cj.q(I)V")
    public void method2165() {
        this.field1145 = class399.field4546;
    }

    @ObfuscatedName("cj.f(I)V")
    public void method2166() {
        this.field1145 = Statics.field4582.method1727(this.field1136) ? class399.field4547 : class399.field4548;
    }

    @ObfuscatedName("cj.r(I)Z")
    public boolean method2201() {
        if (class399.field4546 == this.field1139) {
            this.method2169();
        }
        return class399.field4547 == this.field1139;
    }

    @ObfuscatedName("cj.u(I)V")
    public void method2174() {
        this.field1139 = class399.field4546;
    }

    @ObfuscatedName("cj.b(I)V")
    public void method2169() {
        this.field1139 = Statics.field3324 != null && Statics.field3324.method6867(this.field1136) ? class399.field4547 : class399.field4548;
    }

    @ObfuscatedName("cj.j(I)V")
    public void method2170() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field754[var1] != null && client.field754[var1].method2929(this.field1136.method8383()) != -1 && var1 != 2) {
                this.field1141 = class399.field4547;
                return;
            }
        }
        this.field1141 = class399.field4548;
    }

    @ObfuscatedName("cj.g(B)V")
    public void method2171() {
        this.field1141 = class399.field4546;
    }

    @ObfuscatedName("cj.i(I)Z")
    public boolean method2172() {
        if (class399.field4546 == this.field1141) {
            this.method2170();
        }
        return class399.field4547 == this.field1141;
    }

    @ObfuscatedName("cj.o(B)I")
    public int method2178() {
        return this.field1123 == null || this.field1123.field3472 == -1 ? 1 : class187.method2847(this.field1123.field3472).field2035;
    }

    @ObfuscatedName("cj.e(I)Lhh;")
    public final class224 method1915() {
        if (this.field1123 == null) {
            return null;
        }
        class199 var1 = this.field1220 != -1 && this.field1223 == 0 ? class199.method4223(this.field1220) : null;
        class199 var2 = this.field1216 == -1 || this.field1140 || this.field1216 == this.field1184 && var1 != null ? null : class199.method4223(this.field1216);
        class224 var3 = this.field1123.method5263(var1, this.field1211, var2, this.field1217);
        if (var3 == null) {
            return null;
        }
        var3.method4301();
        this.field1238 = var3.field2603;
        int var4 = var3.field2717;
        if (!this.field1140 && this.field1225 != -1 && this.field1226 != -1) {
            class224 var5 = class189.method3000(this.field1225).method3385(this.field1226);
            if (var5 != null) {
                var5.method4297(0, -this.field1247, 0);
                class224[] var6 = new class224[] { var3, var5 };
                var3 = new class224(var6, 2);
            }
        }
        if (!this.field1140 && this.field1135 != null) {
            if (client.field519 >= this.field1131) {
                this.field1135 = null;
            }
            if (client.field519 >= this.field1147 && client.field519 < this.field1131) {
                class224 var7 = this.field1135;
                var7.method4297(this.field1132 - this.field1243, this.field1122 - this.field1130, this.field1138 - this.field1179);
                if (this.field1245 == 512) {
                    var7.method4286();
                    var7.method4286();
                    var7.method4286();
                } else if (this.field1245 == 1024) {
                    var7.method4286();
                    var7.method4286();
                } else if (this.field1245 == 1536) {
                    var7.method4286();
                }
                class224[] var8 = new class224[] { var3, var7 };
                var3 = new class224(var8, 2);
                if (this.field1245 == 512) {
                    var7.method4286();
                } else if (this.field1245 == 1024) {
                    var7.method4286();
                    var7.method4286();
                } else if (this.field1245 == 1536) {
                    var7.method4286();
                    var7.method4286();
                    var7.method4286();
                }
                var7.method4297(this.field1243 - this.field1132, this.field1130 - this.field1122, this.field1179 - this.field1138);
            }
        }
        var3.field2699 = true;
        if (this.field1244 == 0 || client.field519 < this.field1239 || client.field519 >= this.field1201) {
            var3.field2680 = 0;
        } else {
            var3.field2738 = this.field1241;
            var3.field2739 = this.field1221;
            var3.field2740 = this.field1233;
            var3.field2680 = this.field1244;
            var3.field2742 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cj.n(IILgs;B)V")
    public final void method2175(int arg0, int arg1, class205 arg2) {
        if (this.field1220 != -1 && class199.method4223(this.field1220).field2285 == 1) {
            this.field1220 = -1;
        }
        this.field1191 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2176(arg0, arg1);
        } else if (this.field1204[0] >= 0 && this.field1204[0] < 104 && this.field1252[0] >= 0 && this.field1252[0] < 104) {
            if (class205.field2358 == arg2) {
                class89 var4 = this;
                class205 var5 = class205.field2358;
                int var6 = this.field1204[0];
                int var7 = this.field1252[0];
                int var8 = this.method2178();
                if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && arg0 >= var8 && arg0 < 104 - var8 && arg1 >= var8 && arg1 < 104 - var8) {
                    int var9 = class206.method3179(var6, var7, this.method2178(), client.method3911(arg0, arg1), client.field577[this.field1143], true, client.field807, client.field786);
                    if (var9 >= 1) {
                        for (int var10 = 0; var10 < var9 - 1; var10++) {
                            var4.method2177(client.field807[var10], client.field786[var10], var5);
                        }
                    }
                }
            }
            this.method2177(arg0, arg1, arg2);
        } else {
            this.method2176(arg0, arg1);
        }
    }

    @ObfuscatedName("cj.k(IIB)V")
    public void method2176(int arg0, int arg1) {
        this.field1178 = 0;
        this.field1253 = 0;
        this.field1240 = 0;
        this.field1204[0] = arg0;
        this.field1252[0] = arg1;
        int var3 = this.method2178();
        this.field1243 = this.field1204[0] * 128 + var3 * 64;
        this.field1179 = this.field1252[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cj.a(IILgs;I)V")
    public final void method2177(int arg0, int arg1, class205 arg2) {
        if (this.field1178 < 9) {
            this.field1178++;
        }
        for (int var4 = this.field1178; var4 > 0; var4--) {
            this.field1204[var4] = this.field1204[var4 - 1];
            this.field1252[var4] = this.field1252[var4 - 1];
            this.field1232[var4] = this.field1232[var4 - 1];
        }
        this.field1204[0] = arg0;
        this.field1252[0] = arg1;
        this.field1232[0] = arg2;
    }

    @ObfuscatedName("cj.s(I)Z")
    public final boolean method2164() {
        return this.field1123 != null;
    }
}
