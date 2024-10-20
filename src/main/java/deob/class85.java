package deob;

@ObfuscatedName("cl")
public final class class85 extends class87 {

    @ObfuscatedName("cl.c")
    public class466 field1109;

    @ObfuscatedName("cl.p")
    public class294 field1086;

    @ObfuscatedName("cl.f")
    public int field1087 = -1;

    @ObfuscatedName("cl.n")
    public int field1088 = -1;

    @ObfuscatedName("cl.w")
    public String[] field1089 = new String[3];

    @ObfuscatedName("cl.s")
    public int field1090;

    @ObfuscatedName("cl.q")
    public int field1114;

    @ObfuscatedName("cl.m")
    public int field1092;

    @ObfuscatedName("cl.x")
    public int field1111;

    @ObfuscatedName("cl.j")
    public int field1094;

    @ObfuscatedName("cl.v")
    public int field1107;

    @ObfuscatedName("cl.h")
    public int field1096;

    @ObfuscatedName("cl.t")
    public int field1097;

    @ObfuscatedName("cl.u")
    public class212 field1098;

    @ObfuscatedName("cl.d")
    public int field1099;

    @ObfuscatedName("cl.b")
    public int field1102;

    @ObfuscatedName("cl.a")
    public int field1101;

    @ObfuscatedName("cl.l")
    public int field1095;

    @ObfuscatedName("cl.e")
    public boolean field1103;

    @ObfuscatedName("cl.g")
    public int field1093;

    @ObfuscatedName("cl.y")
    public boolean field1105;

    @ObfuscatedName("cl.i")
    public int field1106;

    @ObfuscatedName("cl.r")
    public int field1100;

    @ObfuscatedName("cl.z")
    public class378 field1085;

    @ObfuscatedName("cl.o")
    public class378 field1110;

    @ObfuscatedName("cl.as")
    public class378 field1091;

    @ObfuscatedName("cl.ac")
    public boolean field1104;

    @ObfuscatedName("cl.ao")
    public int field1112;

    @ObfuscatedName("cl.ar")
    public int field1113;

    public class85() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1089[var1] = "";
        }
        this.field1090 = 0;
        this.field1114 = 0;
        this.field1111 = 0;
        this.field1094 = 0;
        this.field1103 = false;
        this.field1093 = 0;
        this.field1105 = false;
        this.field1085 = class378.field4371;
        this.field1110 = class378.field4371;
        this.field1091 = class378.field4371;
        this.field1104 = false;
    }

    @ObfuscatedName("cl.c(Lqq;S)V")
    public final void method2209(class445 arg0) {
        arg0.field4735 = 0;
        int var2 = arg0.method7196();
        this.field1087 = arg0.method7197();
        this.field1088 = arg0.method7197();
        int var3 = -1;
        this.field1093 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method7196();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method7196();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method7198();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class189.method2643(var4[var5] - 512).field2172;
                    if (var8 != 0) {
                        this.field1093 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method7196();
            if (var11 < 0 || var11 >= Statics.field4280[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1134 = arg0.method7198();
        if (this.field1134 == 65535) {
            this.field1134 = -1;
        }
        this.field1135 = arg0.method7198();
        if (this.field1135 == 65535) {
            this.field1135 = -1;
        }
        this.field1136 = this.field1135;
        this.field1176 = arg0.method7198();
        if (this.field1176 == 65535) {
            this.field1176 = -1;
        }
        this.field1205 = arg0.method7198();
        if (this.field1205 == 65535) {
            this.field1205 = -1;
        }
        this.field1168 = arg0.method7198();
        if (this.field1168 == 65535) {
            this.field1168 = -1;
        }
        this.field1140 = arg0.method7198();
        if (this.field1140 == 65535) {
            this.field1140 = -1;
        }
        this.field1128 = arg0.method7198();
        if (this.field1128 == 65535) {
            this.field1128 = -1;
        }
        this.field1109 = new class466(arg0.method7206(), Statics.field1304);
        this.method2170();
        this.method2173();
        this.method2176();
        if (Statics.field890 == this) {
            Statics.field4867 = this.field1109.method7774();
        }
        this.field1090 = arg0.method7196();
        this.field1114 = arg0.method7198();
        this.field1105 = arg0.method7196() == 1;
        if (client.field495 == 0 && client.field675 >= 2) {
            this.field1105 = false;
        }
        class169[] var12 = null;
        boolean var13 = false;
        int var14 = arg0.method7198();
        boolean var15 = (var14 >> 15 & 0x1) == 1;
        if (var14 > 0 && var14 != 32768) {
            var12 = new class169[12];
            for (int var16 = 0; var16 < 12; var16++) {
                int var17 = var14 >> 12 - var16 & 0x1;
                if (var17 == 1) {
                    int var20 = var4[var16] - 512;
                    int var21 = arg0.method7196();
                    boolean var22 = (var21 & 0x1) != 0;
                    boolean var23 = (var21 & 0x2) != 0;
                    class169 var24 = new class169(var20);
                    if (var22) {
                        int var25 = arg0.method7196();
                        int[] var26 = new int[] { var25 & 0xF, var25 >> 4 & 0xF };
                        boolean var27 = var24.field1836 != null && var24.field1836.length == var26.length;
                        for (int var28 = 0; var28 < 2; var28++) {
                            if (var26[var28] != 15) {
                                short var29 = (short) arg0.method7198();
                                if (var27) {
                                    var24.field1836[var26[var28]] = var29;
                                }
                            }
                        }
                    }
                    if (var23) {
                        int var30 = arg0.method7196();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var24.field1834 != null && var24.field1834.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method7198();
                                if (var32) {
                                    var24.field1834[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    var12[var16] = var24;
                }
            }
        }
        if (arg0.field4735 < arg0.field4733.length) {
            for (int var36 = 0; var36 < 3; var36++) {
                this.field1089[var36] = arg0.method7206();
            }
        }
        if (this.field1086 == null) {
            this.field1086 = new class294();
        }
        this.field1086.method5148(var4, var12, var15, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cl.f(I)Z")
    public boolean method2204() {
        if (class378.field4371 == this.field1085) {
            this.method2181();
        }
        return class378.field4369 == this.field1085;
    }

    @ObfuscatedName("cl.w(I)V")
    public void method2170() {
        this.field1085 = class378.field4371;
    }

    @ObfuscatedName("cl.s(B)V")
    public void method2181() {
        this.field1085 = Statics.field3345.method1705(this.field1109) ? class378.field4369 : class378.field4370;
    }

    @ObfuscatedName("cl.q(I)Z")
    public boolean method2195() {
        if (class378.field4371 == this.field1110) {
            this.method2174();
        }
        return class378.field4369 == this.field1110;
    }

    @ObfuscatedName("cl.m(I)V")
    public void method2173() {
        this.field1110 = class378.field4371;
    }

    @ObfuscatedName("cl.x(I)V")
    public void method2174() {
        this.field1110 = Statics.field1679 != null && Statics.field1679.method6248(this.field1109) ? class378.field4369 : class378.field4370;
    }

    @ObfuscatedName("cl.j(B)V")
    public void method2175() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field548[var1] != null && client.field548[var1].method2904(this.field1109.method7774()) != -1 && var1 != 2) {
                this.field1091 = class378.field4369;
                return;
            }
        }
        this.field1091 = class378.field4370;
    }

    @ObfuscatedName("cl.v(I)V")
    public void method2176() {
        this.field1091 = class378.field4371;
    }

    @ObfuscatedName("cl.h(B)Z")
    public boolean method2177() {
        if (class378.field4371 == this.field1091) {
            this.method2175();
        }
        return class378.field4369 == this.field1091;
    }

    @ObfuscatedName("cl.t(I)I")
    public int method2187() {
        return this.field1086 == null || this.field1086.field3363 == -1 ? 1 : class179.method3662(this.field1086.field3363).field1973;
    }

    @ObfuscatedName("cl.p(B)Lha;")
    public final class212 method1926() {
        if (this.field1086 == null) {
            return null;
        }
        class191 var1 = this.field1147 != -1 && this.field1173 == 0 ? class191.method22(this.field1147) : null;
        class191 var2 = this.field1166 == -1 || this.field1103 || this.field1166 == this.field1134 && var1 != null ? null : class191.method22(this.field1166);
        class212 var3 = this.field1086.method5155(var1, this.field1171, var2, this.field1167);
        if (var3 == null) {
            return null;
        }
        var3.method4136();
        this.field1188 = var3.field2479;
        int var4 = var3.field2551;
        if (!this.field1103 && this.field1175 != -1 && this.field1139 != -1) {
            class212 var5 = class181.method5344(this.field1175).method3307(this.field1139);
            if (var5 != null) {
                var5.method4152(0, -this.field1146, 0);
                class212[] var6 = new class212[] { var3, var5 };
                var3 = new class212(var6, 2);
            }
        }
        if (!this.field1103 && this.field1098 != null) {
            if (client.field504 >= this.field1094) {
                this.field1098 = null;
            }
            if (client.field504 >= this.field1111 && client.field504 < this.field1094) {
                class212 var7 = this.field1098;
                var7.method4152(this.field1107 - this.field1185, this.field1096 - this.field1092, this.field1097 - this.field1129);
                if (this.field1157 == 512) {
                    var7.method4148();
                    var7.method4148();
                    var7.method4148();
                } else if (this.field1157 == 1024) {
                    var7.method4148();
                    var7.method4148();
                } else if (this.field1157 == 1536) {
                    var7.method4148();
                }
                class212[] var8 = new class212[] { var3, var7 };
                var3 = new class212(var8, 2);
                if (this.field1157 == 512) {
                    var7.method4148();
                } else if (this.field1157 == 1024) {
                    var7.method4148();
                    var7.method4148();
                } else if (this.field1157 == 1536) {
                    var7.method4148();
                    var7.method4148();
                    var7.method4148();
                }
                var7.method4152(this.field1185 - this.field1107, this.field1092 - this.field1096, this.field1129 - this.field1097);
            }
        }
        var3.field2567 = true;
        if (this.field1195 == 0 || client.field504 < this.field1189 || client.field504 >= this.field1159) {
            var3.field2598 = 0;
        } else {
            var3.field2555 = this.field1191;
            var3.field2616 = this.field1192;
            var3.field2615 = this.field1170;
            var3.field2598 = this.field1195;
            var3.field2619 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cl.u(IILga;B)V")
    public final void method2179(int arg0, int arg1, class194 arg2) {
        if (this.field1147 != -1 && class191.method22(this.field1147).field2219 == 1) {
            this.field1147 = -1;
        }
        this.field1164 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2180(arg0, arg1);
        } else if (this.field1199[0] >= 0 && this.field1199[0] < 104 && this.field1201[0] >= 0 && this.field1201[0] < 104) {
            if (class194.field2248 == arg2) {
                class85 var4 = this;
                class194 var5 = class194.field2248;
                int var6 = this.field1199[0];
                int var7 = this.field1201[0];
                int var8 = this.method2187();
                if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && arg0 >= var8 && arg0 < 104 - var8 && arg1 >= var8 && arg1 < 104 - var8) {
                    int var9 = this.method2187();
                    class193 var10 = client.method1635(arg0, arg1);
                    class192 var11 = client.field562[this.field1106];
                    int[] var12 = client.field788;
                    int[] var13 = client.field789;
                    int var14 = 0;
                    label202: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var9 == 1) {
                                var16 = Statics.method281(var6, var7, var10, var11);
                            } else if (var9 == 2) {
                                var16 = class195.method3107(var6, var7, var10, var11);
                            } else {
                                var16 = class195.method4836(var6, var7, var9, var10, var11);
                            }
                            int var35;
                            label223: {
                                int var17 = var6 - 64;
                                int var18 = var7 - 64;
                                int var19 = Statics.field4423;
                                int var20 = Statics.field4206;
                                if (!var16) {
                                    int var21 = Integer.MAX_VALUE;
                                    int var22 = Integer.MAX_VALUE;
                                    byte var23 = 10;
                                    int var24 = var10.field2243;
                                    int var25 = var10.field2239;
                                    int var26 = var10.field2240;
                                    int var27 = var10.field2241;
                                    for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
                                        for (int var29 = var25 - var23; var29 <= var23 + var25; var29++) {
                                            int var30 = var28 - var17;
                                            int var31 = var29 - var18;
                                            if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class195.field2252[var30][var31] < 100) {
                                                int var32 = 0;
                                                if (var28 < var24) {
                                                    var32 = var24 - var28;
                                                } else if (var28 > var24 + var26 - 1) {
                                                    var32 = var28 - (var24 + var26 - 1);
                                                }
                                                int var33 = 0;
                                                if (var29 < var25) {
                                                    var33 = var25 - var29;
                                                } else if (var29 > var25 + var27 - 1) {
                                                    var33 = var29 - (var25 + var27 - 1);
                                                }
                                                int var34 = var32 * var32 + var33 * var33;
                                                if (var34 < var21 || var21 == var34 && class195.field2252[var30][var31] < var22) {
                                                    var21 = var34;
                                                    var22 = class195.field2252[var30][var31];
                                                    var19 = var28;
                                                    var20 = var29;
                                                }
                                            }
                                        }
                                    }
                                    if (var21 == Integer.MAX_VALUE) {
                                        var35 = -1;
                                        break label223;
                                    }
                                }
                                if (var6 == var19 && var7 == var20) {
                                    var12[0] = var19;
                                    var13[0] = var20;
                                    var35 = 0;
                                } else {
                                    byte var36 = 0;
                                    class195.field2254[var36] = var19;
                                    int var43 = var36 + 1;
                                    class195.field2257[var36] = var20;
                                    int var37;
                                    int var38 = var37 = class195.field2255[var19 - var17][var20 - var18];
                                    while (var6 != var19 || var7 != var20) {
                                        if (var37 != var38) {
                                            var37 = var38;
                                            class195.field2254[var43] = var19;
                                            class195.field2257[var43++] = var20;
                                        }
                                        if ((var38 & 0x2) != 0) {
                                            var19++;
                                        } else if ((var38 & 0x8) != 0) {
                                            var19--;
                                        }
                                        if ((var38 & 0x1) != 0) {
                                            var20++;
                                        } else if ((var38 & 0x4) != 0) {
                                            var20--;
                                        }
                                        var38 = class195.field2255[var19 - var17][var20 - var18];
                                    }
                                    int var39 = 0;
                                    while (var43-- > 0) {
                                        var12[var39] = class195.field2254[var43];
                                        var13[var39++] = class195.field2257[var43];
                                        if (var39 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var35 = var39;
                                }
                            }
                            int var40 = var35;
                            if (var35 < 1) {
                                break;
                            }
                            int var41 = 0;
                            while (true) {
                                if (var41 >= var40 - 1) {
                                    break label202;
                                }
                                var4.method2184(client.field788[var41], client.field789[var41], var5);
                                var41++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class195.field2255[var14][var15] = 0;
                            class195.field2252[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method2184(arg0, arg1, arg2);
        } else {
            this.method2180(arg0, arg1);
        }
    }

    @ObfuscatedName("cl.d(IIB)V")
    public void method2180(int arg0, int arg1) {
        this.field1198 = 0;
        this.field1203 = 0;
        this.field1202 = 0;
        this.field1199[0] = arg0;
        this.field1201[0] = arg1;
        int var3 = this.method2187();
        this.field1185 = this.field1199[0] * 128 + var3 * 64;
        this.field1129 = this.field1201[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cl.b(IILga;B)V")
    public final void method2184(int arg0, int arg1, class194 arg2) {
        if (this.field1198 < 9) {
            this.field1198++;
        }
        for (int var4 = this.field1198; var4 > 0; var4--) {
            this.field1199[var4] = this.field1199[var4 - 1];
            this.field1201[var4] = this.field1201[var4 - 1];
            this.field1143[var4] = this.field1143[var4 - 1];
        }
        this.field1199[0] = arg0;
        this.field1201[0] = arg1;
        this.field1143[0] = arg2;
    }

    @ObfuscatedName("cl.a(B)Z")
    public final boolean method2182() {
        return this.field1086 != null;
    }
}
