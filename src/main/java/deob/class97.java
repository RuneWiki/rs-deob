package deob;

@ObfuscatedName("cl")
public class class97 {

    @ObfuscatedName("cl.l")
    public static byte[] field1302 = new byte[2048];

    @ObfuscatedName("cl.k")
    public static class194[] field1303 = new class194[2048];

    @ObfuscatedName("cl.a")
    public static class440[] field1308 = new class440[2048];

    @ObfuscatedName("cl.m")
    public static int field1305 = 0;

    @ObfuscatedName("cl.p")
    public static int[] field1306 = new int[2048];

    @ObfuscatedName("cl.s")
    public static int field1312 = 0;

    @ObfuscatedName("cl.r")
    public static int[] field1314 = new int[2048];

    @ObfuscatedName("cl.v")
    public static int[] field1309 = new int[2048];

    @ObfuscatedName("cl.y")
    public static int[] field1313 = new int[2048];

    @ObfuscatedName("cl.c")
    public static int[] field1311 = new int[2048];

    @ObfuscatedName("cl.w")
    public static int field1304 = 0;

    @ObfuscatedName("cl.b")
    public static int[] field1300 = new int[2048];

    @ObfuscatedName("cl.t")
    public static class440 field1307 = new class440(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.o(Lpc;B)V")
    public static final void method2040(class439 arg0) {
        arg0.method6839();
        int var1 = client.field610;
        class85 var2 = Statics.field2657 = client.field609[var1] = new class85();
        var2.field1117 = var1;
        int var3 = arg0.method6840(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1194[0] = var5 - Statics.field1001;
        var2.field1182 = (var2.field1194[0] << 7) + (var2.method2004() << 6);
        var2.field1208[0] = var6 - Statics.field477;
        var2.field1138 = (var2.field1208[0] << 7) + (var2.method2004() << 6);
        Statics.field1577 = var2.field1116 = var4;
        if (field1308[var1] != null) {
            var2.method1995(field1308[var1]);
        }
        field1305 = 0;
        field1306[++field1305 - 1] = var1;
        field1302[var1] = 0;
        field1312 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6840(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1309[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1313[var7] = 0;
                field1311[var7] = -1;
                field1314[++field1312 - 1] = var7;
                field1302[var7] = 0;
            }
        }
        arg0.method6841();
    }

    @ObfuscatedName("q.q(Lpc;II)V")
    public static final void method14(class439 arg0, int arg1) {
        int var2 = arg0.field4678;
        field1304 = 0;
        int var3 = 0;
        arg0.method6839();
        for (int var4 = 0; var4 < field1305; var4++) {
            int var5 = field1306[var4];
            if ((field1302[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1302[var5] = (byte) (field1302[var5] | 0x2);
                } else {
                    int var6 = arg0.method6840(1);
                    if (var6 == 0) {
                        var3 = method242(arg0);
                        field1302[var5] = (byte) (field1302[var5] | 0x2);
                    } else {
                        method4389(arg0, var5);
                    }
                }
            }
        }
        arg0.method6841();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6839();
        for (int var7 = 0; var7 < field1305; var7++) {
            int var8 = field1306[var7];
            if ((field1302[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1302[var8] = (byte) (field1302[var8] | 0x2);
                } else {
                    int var9 = arg0.method6840(1);
                    if (var9 == 0) {
                        var3 = method242(arg0);
                        field1302[var8] = (byte) (field1302[var8] | 0x2);
                    } else {
                        method4389(arg0, var8);
                    }
                }
            }
        }
        arg0.method6841();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6839();
        for (int var10 = 0; var10 < field1312; var10++) {
            int var11 = field1314[var10];
            if ((field1302[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1302[var11] = (byte) (field1302[var11] | 0x2);
                } else {
                    int var12 = arg0.method6840(1);
                    if (var12 == 0) {
                        var3 = method242(arg0);
                        field1302[var11] = (byte) (field1302[var11] | 0x2);
                    } else if (method3176(arg0, var11)) {
                        field1302[var11] = (byte) (field1302[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6841();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6839();
        for (int var13 = 0; var13 < field1312; var13++) {
            int var14 = field1314[var13];
            if ((field1302[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1302[var14] = (byte) (field1302[var14] | 0x2);
                } else {
                    int var15 = arg0.method6840(1);
                    if (var15 == 0) {
                        var3 = method242(arg0);
                        field1302[var14] = (byte) (field1302[var14] | 0x2);
                    } else if (method3176(arg0, var14)) {
                        field1302[var14] = (byte) (field1302[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6841();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1305 = 0;
        field1312 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1302[var16] = (byte) (field1302[var16] >> 1);
            class85 var17 = client.field609[var16];
            if (var17 == null) {
                field1314[++field1312 - 1] = var16;
            } else {
                field1306[++field1305 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1304; var18++) {
            int var19 = field1300[var18];
            class85 var20 = client.field609[var19];
            int var21 = arg0.method7071();
            if ((var21 & 0x2) != 0) {
                var21 += arg0.method7071() << 8;
            }
            method5304(arg0, var19, var20, var21);
        }
        if (arg0.field4678 - var2 != arg1) {
            throw new RuntimeException(arg0.field4678 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("e.l(Lpc;I)I")
    public static int method242(class439 arg0) {
        int var1 = arg0.method6840(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6840(5);
        } else if (var1 == 2) {
            var2 = arg0.method6840(8);
        } else {
            var2 = arg0.method6840(11);
        }
        return var2;
    }

    @ObfuscatedName("hh.k(Lpc;II)V")
    public static void method4389(class439 arg0, int arg1) {
        boolean var2 = arg0.method6840(1) == 1;
        if (var2) {
            field1300[++field1304 - 1] = arg1;
        }
        int var3 = arg0.method6840(2);
        class85 var4 = client.field609[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1096 = false;
            } else if (client.field610 == arg1) {
                throw new RuntimeException();
            } else {
                field1309[arg1] = (Statics.field477 + var4.field1208[0] >> 13) + (Statics.field1001 + var4.field1194[0] >> 13 << 14) + (var4.field1116 << 28);
                if (var4.field1173 == -1) {
                    field1313[arg1] = var4.field1203;
                } else {
                    field1313[arg1] = var4.field1173;
                }
                field1311[arg1] = var4.field1183;
                client.field609[arg1] = null;
                if (arg0.method6840(1) != 0) {
                    method3176(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6840(3);
            int var6 = var4.field1194[0];
            int var7 = var4.field1208[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field610 == arg1 && var4.field1182 < 1536 || var4.field1138 < 1536 || var4.field1182 >= 11776 || var4.field1138 >= 11776) {
                var4.method2007(var6, var7);
                var4.field1096 = false;
            } else if (var2) {
                var4.field1096 = true;
                var4.field1101 = var6;
                var4.field1123 = var7;
            } else {
                var4.field1096 = false;
                var4.method2006(var6, var7, field1303[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6840(4);
            int var9 = var4.field1194[0];
            int var10 = var4.field1208[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field610 == arg1 && var4.field1182 < 1536 || var4.field1138 < 1536 || var4.field1182 >= 11776 || var4.field1138 >= 11776) {
                var4.method2007(var9, var10);
                var4.field1096 = false;
            } else if (var2) {
                var4.field1096 = true;
                var4.field1101 = var9;
                var4.field1123 = var10;
            } else {
                var4.field1096 = false;
                var4.method2006(var9, var10, field1303[arg1]);
            }
        } else {
            int var11 = arg0.method6840(1);
            if (var11 == 0) {
                int var12 = arg0.method6840(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1194[0] + var14;
                int var17 = var4.field1208[0] + var15;
                if (client.field610 == arg1 && var4.field1182 < 1536 || var4.field1138 < 1536 || var4.field1182 >= 11776 || var4.field1138 >= 11776) {
                    var4.method2007(var16, var17);
                    var4.field1096 = false;
                } else if (var2) {
                    var4.field1096 = true;
                    var4.field1101 = var16;
                    var4.field1123 = var17;
                } else {
                    var4.field1096 = false;
                    var4.method2006(var16, var17, field1303[arg1]);
                }
                var4.field1116 = (byte) (var4.field1116 + var13 & 0x3);
                if (client.field610 == arg1) {
                    Statics.field1577 = var4.field1116;
                }
            } else {
                int var18 = arg0.method6840(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1001 + var4.field1194[0] + var20 & 0x3FFF) - Statics.field1001;
                int var23 = (Statics.field477 + var4.field1208[0] + var21 & 0x3FFF) - Statics.field477;
                if (client.field610 == arg1 && var4.field1182 < 1536 || var4.field1138 < 1536 || var4.field1182 >= 11776 || var4.field1138 >= 11776) {
                    var4.method2007(var22, var23);
                    var4.field1096 = false;
                } else if (var2) {
                    var4.field1096 = true;
                    var4.field1101 = var22;
                    var4.field1123 = var23;
                } else {
                    var4.field1096 = false;
                    var4.method2006(var22, var23, field1303[arg1]);
                }
                var4.field1116 = (byte) (var4.field1116 + var19 & 0x3);
                if (client.field610 == arg1) {
                    Statics.field1577 = var4.field1116;
                }
            }
        }
    }

    @ObfuscatedName("fa.a(Lpc;II)Z")
    public static boolean method3176(class439 arg0, int arg1) {
        int var2 = arg0.method6840(2);
        if (var2 == 0) {
            if (arg0.method6840(1) != 0) {
                method3176(arg0, arg1);
            }
            int var3 = arg0.method6840(13);
            int var4 = arg0.method6840(13);
            boolean var5 = arg0.method6840(1) == 1;
            if (var5) {
                field1300[++field1304 - 1] = arg1;
            }
            if (client.field609[arg1] != null) {
                throw new RuntimeException();
            }
            class85 var6 = client.field609[arg1] = new class85();
            var6.field1117 = arg1;
            if (field1308[arg1] != null) {
                var6.method1995(field1308[arg1]);
            }
            var6.field1203 = field1313[arg1];
            var6.field1183 = field1311[arg1];
            int var7 = field1309[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1164[0] = field1303[arg1];
            var6.field1116 = (byte) var8;
            var6.method2007((var9 << 13) + var3 - Statics.field1001, (var10 << 13) + var4 - Statics.field477);
            var6.field1096 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6840(2);
            int var12 = field1309[arg1];
            field1309[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6840(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1309[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field1309[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6840(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1309[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1309[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("la.m(Lpc;ILca;IB)V")
    public static final void method5304(class439 arg0, int arg1, class85 arg2, int arg3) {
        byte var4 = class194.field2251.field2253;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method6954();
            class311 var6 = (class311) class330.method4934(class311.method2590(), arg0.method7071());
            boolean var7 = arg0.method6971() == 1;
            int var8 = arg0.method6923();
            int var9 = arg0.field4678;
            if (arg2.field1100 != null && arg2.field1113 != null) {
                boolean var10 = false;
                if (var6.field3981 && Statics.field4350.method1585(arg2.field1100)) {
                    var10 = true;
                }
                if (!var10 && client.field607 == 0 && !arg2.field1115) {
                    field1307.field4678 = 0;
                    arg0.method6947(field1307.field4679, 0, var8);
                    field1307.field4678 = 0;
                    String var11 = class351.method5790(Statics.method4356(class283.method4603(field1307)));
                    arg2.field1158 = var11.trim();
                    arg2.field1162 = var5 >> 8;
                    arg2.field1163 = var5 & 0xFF;
                    arg2.field1209 = 150;
                    arg2.field1159 = var7;
                    arg2.field1199 = Statics.field2657 != arg2 && var6.field3981 && client.field550 != "" && var11.toLowerCase().indexOf(client.field550) == -1;
                    int var12;
                    if (var6.field3989) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field3988 == -1) {
                        class99.method4522(var12, arg2.field1100.method7492(), var11);
                    } else {
                        class99.method4522(var12, class93.method5122(var6.field3988) + arg2.field1100.method7492(), var11);
                    }
                }
            }
            arg0.field4678 = var8 + var9;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1173 = arg0.method6954();
            if (arg2.field1206 == 0) {
                arg2.field1203 = arg2.field1173;
                arg2.field1173 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var13 = arg0.method6971();
            byte[] var14 = new byte[var13];
            class440 var15 = new class440(var14);
            arg0.method6947(var14, 0, var13);
            field1308[arg1] = var15;
            arg2.method1995(var15);
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1207 = arg0.method6954();
            int var16 = arg0.method6945();
            arg2.field1152 = var16 >> 16;
            arg2.field1186 = (var16 & 0xFFFF) + client.field631;
            arg2.field1210 = 0;
            arg2.field1185 = 0;
            if (arg2.field1186 > client.field631) {
                arg2.field1210 = -1;
            }
            if (arg2.field1207 == 65535) {
                arg2.field1207 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            class194[] var17 = field1303;
            class194[] var19 = new class194[] { class194.field2249, class194.field2251, class194.field2250, class194.field2252 };
            var17[arg1] = (class194) class330.method4934(var19, arg0.method6927());
        }
        if ((arg3 & 0x4000) != 0) {
            arg2.field1188 = arg0.method6925();
            arg2.field1190 = arg0.method6926();
            arg2.field1189 = arg0.method6926();
            arg2.field1191 = arg0.method6927();
            arg2.field1192 = arg0.method7082() + client.field631;
            arg2.field1193 = arg0.method6932() + client.field631;
            arg2.field1140 = arg0.method7082();
            if (arg2.field1096) {
                arg2.field1188 += arg2.field1101;
                arg2.field1190 += arg2.field1123;
                arg2.field1189 += arg2.field1101;
                arg2.field1191 += arg2.field1123;
                arg2.field1206 = 0;
            } else {
                arg2.field1188 += arg2.field1194[0];
                arg2.field1190 += arg2.field1208[0];
                arg2.field1189 += arg2.field1194[0];
                arg2.field1191 += arg2.field1208[0];
                arg2.field1206 = 1;
            }
            arg2.field1201 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1197 = client.field631 + arg0.method6954();
            arg2.field1198 = client.field631 + arg0.method7082();
            arg2.field1144 = arg0.method6925();
            arg2.field1200 = arg0.method6927();
            arg2.field1154 = arg0.method6926();
            arg2.field1141 = (byte) arg0.method7071();
        }
        if ((arg3 & 0x20) != 0) {
            int var20 = arg0.method6932();
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = arg0.method6971();
            client.method2887(arg2, var20, var21);
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method6927();
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1183 = arg0.method6932();
            if (arg2.field1183 == 65535) {
                arg2.field1183 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var22 = arg0.method7071();
            if (var22 > 0) {
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = -1;
                    int var25 = -1;
                    int var26 = -1;
                    int var27 = arg0.method7134();
                    if (var27 == 32767) {
                        var27 = arg0.method7134();
                        var25 = arg0.method7134();
                        var24 = arg0.method7134();
                        var26 = arg0.method7134();
                    } else if (var27 == 32766) {
                        var27 = -1;
                    } else {
                        var25 = arg0.method7134();
                    }
                    int var28 = arg0.method7134();
                    arg2.method2054(var27, var25, var24, var26, client.field631, var28);
                }
            }
            int var29 = arg0.method6924();
            if (var29 > 0) {
                for (int var30 = 0; var30 < var29; var30++) {
                    int var31 = arg0.method7134();
                    int var32 = arg0.method7134();
                    if (var32 == 32767) {
                        arg2.method2053(var31);
                    } else {
                        int var33 = arg0.method7134();
                        int var34 = arg0.method7071();
                        int var35 = var32 > 0 ? arg0.method6971() : var34;
                        arg2.method2052(var31, client.field631, var32, var33, var34, var35);
                    }
                }
            }
        }
        if ((arg3 & 0x2000) != 0) {
            for (int var36 = 0; var36 < 3; var36++) {
                arg2.field1124[var36] = arg0.method7044();
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1158 = arg0.method7044();
            if (arg2.field1158.charAt(0) == '~') {
                arg2.field1158 = arg2.field1158.substring(1);
                class99.method4522(2, arg2.field1100.method7492(), arg2.field1158);
            } else if (Statics.field2657 == arg2) {
                class99.method4522(2, arg2.field1100.method7492(), arg2.field1158);
            }
            arg2.field1159 = false;
            arg2.field1162 = 0;
            arg2.field1163 = 0;
            arg2.field1209 = 150;
        }
        if (!arg2.field1096) {
            return;
        }
        if (var4 == 127) {
            arg2.method2007(arg2.field1101, arg2.field1123);
            return;
        }
        class194 var38;
        if (class194.field2251.field2253 == var4) {
            var38 = field1303[arg1];
        } else {
            class194[] var37 = new class194[] { class194.field2249, class194.field2251, class194.field2250, class194.field2252 };
            var38 = (class194) class330.method4934(var37, var4);
        }
        arg2.method2006(arg2.field1101, arg2.field1123, var38);
    }
}
