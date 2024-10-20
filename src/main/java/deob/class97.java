package deob;

@ObfuscatedName("cw")
public class class97 {

    @ObfuscatedName("cw.w")
    public static byte[] field1298 = new byte[2048];

    @ObfuscatedName("cw.v")
    public static class193[] field1299 = new class193[2048];

    @ObfuscatedName("cw.c")
    public static class444[] field1309 = new class444[2048];

    @ObfuscatedName("cw.q")
    public static int field1301 = 0;

    @ObfuscatedName("cw.i")
    public static int[] field1302 = new int[2048];

    @ObfuscatedName("cw.k")
    public static int field1307 = 0;

    @ObfuscatedName("cw.o")
    public static int[] field1304 = new int[2048];

    @ObfuscatedName("cw.n")
    public static int[] field1311 = new int[2048];

    @ObfuscatedName("cw.d")
    public static int[] field1306 = new int[2048];

    @ObfuscatedName("cw.a")
    public static int[] field1296 = new int[2048];

    @ObfuscatedName("cw.m")
    public static int field1308 = 0;

    @ObfuscatedName("cw.u")
    public static int[] field1303 = new int[2048];

    @ObfuscatedName("cw.l")
    public static class444 field1310 = new class444(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.s(Lqz;B)V")
    public static final void method2234(class443 arg0) {
        arg0.method6876();
        int var1 = client.field763;
        class85 var2 = Statics.field454 = client.field604[var1] = new class85();
        var2.field1085 = var1;
        int var3 = arg0.method6877(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1198[0] = var5 - Statics.field405;
        var2.field1172 = (var2.field1198[0] << 7) + (var2.method1990() << 6);
        var2.field1199[0] = var6 - Statics.field31;
        var2.field1155 = (var2.field1199[0] << 7) + (var2.method1990() << 6);
        Statics.field3173 = var2.field1105 = var4;
        if (field1309[var1] != null) {
            var2.method2019(field1309[var1]);
        }
        field1301 = 0;
        field1302[++field1301 - 1] = var1;
        field1298[var1] = 0;
        field1307 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6877(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1311[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1306[var7] = 0;
                field1296[var7] = -1;
                field1304[++field1307 - 1] = var7;
                field1298[var7] = 0;
            }
        }
        arg0.method6894();
    }

    @ObfuscatedName("bc.h(Lqz;II)V")
    public static final void method1766(class443 arg0, int arg1) {
        int var2 = arg0.field4708;
        field1308 = 0;
        int var3 = 0;
        arg0.method6876();
        for (int var4 = 0; var4 < field1301; var4++) {
            int var5 = field1302[var4];
            if ((field1298[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1298[var5] = (byte) (field1298[var5] | 0x2);
                } else {
                    int var6 = arg0.method6877(1);
                    if (var6 == 0) {
                        var3 = method4837(arg0);
                        field1298[var5] = (byte) (field1298[var5] | 0x2);
                    } else {
                        method155(arg0, var5);
                    }
                }
            }
        }
        arg0.method6894();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6876();
        for (int var7 = 0; var7 < field1301; var7++) {
            int var8 = field1302[var7];
            if ((field1298[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1298[var8] = (byte) (field1298[var8] | 0x2);
                } else {
                    int var9 = arg0.method6877(1);
                    if (var9 == 0) {
                        var3 = method4837(arg0);
                        field1298[var8] = (byte) (field1298[var8] | 0x2);
                    } else {
                        method155(arg0, var8);
                    }
                }
            }
        }
        arg0.method6894();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6876();
        for (int var10 = 0; var10 < field1307; var10++) {
            int var11 = field1304[var10];
            if ((field1298[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1298[var11] = (byte) (field1298[var11] | 0x2);
                } else {
                    int var12 = arg0.method6877(1);
                    if (var12 == 0) {
                        var3 = method4837(arg0);
                        field1298[var11] = (byte) (field1298[var11] | 0x2);
                    } else if (method2577(arg0, var11)) {
                        field1298[var11] = (byte) (field1298[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6894();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6876();
        for (int var13 = 0; var13 < field1307; var13++) {
            int var14 = field1304[var13];
            if ((field1298[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1298[var14] = (byte) (field1298[var14] | 0x2);
                } else {
                    int var15 = arg0.method6877(1);
                    if (var15 == 0) {
                        var3 = method4837(arg0);
                        field1298[var14] = (byte) (field1298[var14] | 0x2);
                    } else if (method2577(arg0, var14)) {
                        field1298[var14] = (byte) (field1298[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6894();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1301 = 0;
        field1307 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1298[var16] = (byte) (field1298[var16] >> 1);
            class85 var17 = client.field604[var16];
            if (var17 == null) {
                field1304[++field1307 - 1] = var16;
            } else {
                field1302[++field1301 - 1] = var16;
            }
        }
        method2631(arg0);
        if (arg0.field4708 - var2 != arg1) {
            throw new RuntimeException(arg0.field4708 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("jz.w(Lqz;I)I")
    public static int method4837(class443 arg0) {
        int var1 = arg0.method6877(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6877(5);
        } else if (var1 == 2) {
            var2 = arg0.method6877(8);
        } else {
            var2 = arg0.method6877(11);
        }
        return var2;
    }

    @ObfuscatedName("u.v(Lqz;II)V")
    public static void method155(class443 arg0, int arg1) {
        boolean var2 = arg0.method6877(1) == 1;
        if (var2) {
            field1303[++field1308 - 1] = arg1;
        }
        int var3 = arg0.method6877(2);
        class85 var4 = client.field604[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1112 = false;
            } else if (client.field763 == arg1) {
                throw new RuntimeException();
            } else {
                field1311[arg1] = (Statics.field31 + var4.field1199[0] >> 13) + (Statics.field405 + var4.field1198[0] >> 13 << 14) + (var4.field1105 << 28);
                if (var4.field1163 == -1) {
                    field1306[arg1] = var4.field1194;
                } else {
                    field1306[arg1] = var4.field1163;
                }
                field1296[arg1] = var4.field1131;
                client.field604[arg1] = null;
                if (arg0.method6877(1) != 0) {
                    method2577(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6877(3);
            int var6 = var4.field1198[0];
            int var7 = var4.field1199[0];
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
            if (client.field763 == arg1 && var4.field1172 < 1536 || var4.field1155 < 1536 || var4.field1172 >= 11776 || var4.field1155 >= 11776) {
                var4.method1991(var6, var7);
                var4.field1112 = false;
            } else if (var2) {
                var4.field1112 = true;
                var4.field1111 = var6;
                var4.field1096 = var7;
            } else {
                var4.field1112 = false;
                var4.method2015(var6, var7, field1299[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6877(4);
            int var9 = var4.field1198[0];
            int var10 = var4.field1199[0];
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
            if (client.field763 == arg1 && var4.field1172 < 1536 || var4.field1155 < 1536 || var4.field1172 >= 11776 || var4.field1155 >= 11776) {
                var4.method1991(var9, var10);
                var4.field1112 = false;
            } else if (var2) {
                var4.field1112 = true;
                var4.field1111 = var9;
                var4.field1096 = var10;
            } else {
                var4.field1112 = false;
                var4.method2015(var9, var10, field1299[arg1]);
            }
        } else {
            int var11 = arg0.method6877(1);
            if (var11 == 0) {
                int var12 = arg0.method6877(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1198[0] + var14;
                int var17 = var4.field1199[0] + var15;
                if (client.field763 == arg1 && var4.field1172 < 1536 || var4.field1155 < 1536 || var4.field1172 >= 11776 || var4.field1155 >= 11776) {
                    var4.method1991(var16, var17);
                    var4.field1112 = false;
                } else if (var2) {
                    var4.field1112 = true;
                    var4.field1111 = var16;
                    var4.field1096 = var17;
                } else {
                    var4.field1112 = false;
                    var4.method2015(var16, var17, field1299[arg1]);
                }
                var4.field1105 = (byte) (var4.field1105 + var13 & 0x3);
                if (client.field763 == arg1) {
                    Statics.field3173 = var4.field1105;
                }
            } else {
                int var18 = arg0.method6877(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field405 + var4.field1198[0] + var20 & 0x3FFF) - Statics.field405;
                int var23 = (Statics.field31 + var4.field1199[0] + var21 & 0x3FFF) - Statics.field31;
                if (client.field763 == arg1 && var4.field1172 < 1536 || var4.field1155 < 1536 || var4.field1172 >= 11776 || var4.field1155 >= 11776) {
                    var4.method1991(var22, var23);
                    var4.field1112 = false;
                } else if (var2) {
                    var4.field1112 = true;
                    var4.field1111 = var22;
                    var4.field1096 = var23;
                } else {
                    var4.field1112 = false;
                    var4.method2015(var22, var23, field1299[arg1]);
                }
                var4.field1105 = (byte) (var4.field1105 + var19 & 0x3);
                if (client.field763 == arg1) {
                    Statics.field3173 = var4.field1105;
                }
            }
        }
    }

    @ObfuscatedName("dn.c(Lqz;II)Z")
    public static boolean method2577(class443 arg0, int arg1) {
        int var2 = arg0.method6877(2);
        if (var2 == 0) {
            if (arg0.method6877(1) != 0) {
                method2577(arg0, arg1);
            }
            int var3 = arg0.method6877(13);
            int var4 = arg0.method6877(13);
            boolean var5 = arg0.method6877(1) == 1;
            if (var5) {
                field1303[++field1308 - 1] = arg1;
            }
            if (client.field604[arg1] != null) {
                throw new RuntimeException();
            }
            class85 var6 = client.field604[arg1] = new class85();
            var6.field1085 = arg1;
            if (field1309[arg1] != null) {
                var6.method2019(field1309[arg1]);
            }
            var6.field1194 = field1306[arg1];
            var6.field1131 = field1296[arg1];
            int var7 = field1311[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1145[0] = field1299[arg1];
            var6.field1105 = (byte) var8;
            var6.method1991((var9 << 13) + var3 - Statics.field405, (var10 << 13) + var4 - Statics.field31);
            var6.field1112 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6877(2);
            int var12 = field1311[arg1];
            field1311[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6877(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1311[arg1];
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
            field1311[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6877(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1311[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1311[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("da.q(Lqz;I)V")
    public static final void method2631(class443 arg0) {
        for (int var1 = 0; var1 < field1308; var1++) {
            int var2 = field1303[var1];
            class85 var3 = client.field604[var2];
            int var4 = arg0.method6929();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method6929() << 8;
            }
            method5977(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ns.i(Lqz;ILcq;II)V")
    public static final void method5977(class443 arg0, int arg1, class85 arg2, int arg3) {
        byte var4 = class193.field2206.field2209;
        if ((arg3 & 0x100) != 0) {
            arg2.field1179 = arg0.method6951();
            arg2.field1128 = arg0.method6965();
            arg2.field1180 = arg0.method6930();
            arg2.field1182 = arg0.method6964();
            arg2.field1183 = arg0.method6933() + client.field487;
            arg2.field1184 = arg0.method6947() + client.field487;
            arg2.field1137 = arg0.method6970();
            if (arg2.field1112) {
                arg2.field1179 += arg2.field1111;
                arg2.field1128 += arg2.field1096;
                arg2.field1180 += arg2.field1111;
                arg2.field1182 += arg2.field1096;
                arg2.field1197 = 0;
            } else {
                arg2.field1179 += arg2.field1198[0];
                arg2.field1128 += arg2.field1199[0];
                arg2.field1180 += arg2.field1198[0];
                arg2.field1182 += arg2.field1199[0];
                arg2.field1197 = 1;
            }
            arg2.field1202 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method6947();
            class311 var6 = (class311) class330.method525(class311.method4084(), arg0.method7001());
            boolean var7 = arg0.method7079() == 1;
            int var8 = arg0.method7079();
            int var9 = arg0.field4708;
            if (arg2.field1110 != null && arg2.field1084 != null) {
                boolean var10 = false;
                if (var6.field3952 && Statics.field4063.method1550(arg2.field1110)) {
                    var10 = true;
                }
                if (!var10 && client.field602 == 0 && !arg2.field1104) {
                    field1310.field4708 = 0;
                    arg0.method6985(field1310.field4707, 0, var8);
                    field1310.field4708 = 0;
                    String var11 = class351.method5714(class344.method4457(class283.method4423(field1310)));
                    arg2.field1143 = var11.trim();
                    arg2.field1152 = var5 >> 8;
                    arg2.field1153 = var5 & 0xFF;
                    arg2.field1178 = 150;
                    arg2.field1185 = var7;
                    arg2.field1165 = Statics.field454 != arg2 && var6.field3952 && client.field712 != "" && var11.toLowerCase().indexOf(client.field712) == -1;
                    int var12;
                    if (var6.field3965) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field3950 == -1) {
                        class99.method2996(var12, arg2.field1110.method7491(), var11);
                    } else {
                        class99.method2996(var12, class93.method713(var6.field3950) + arg2.field1110.method7491(), var11);
                    }
                }
            }
            arg0.field4708 = var8 + var9;
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1131 = arg0.method6970();
            if (arg2.field1131 == 65535) {
                arg2.field1131 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            class193[] var13 = field1299;
            class193[] var15 = new class193[] { class193.field2208, class193.field2210, class193.field2206, class193.field2207 };
            var13[arg1] = (class193) class330.method525(var15, arg0.method6965());
        }
        if ((arg3 & 0x2) != 0) {
            int var16 = arg0.method6970();
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = arg0.method7079();
            client.method5117(arg2, var16, var17);
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field1188 = client.field487 + arg0.method6933();
            arg2.field1189 = client.field487 + arg0.method6947();
            arg2.field1190 = arg0.method6965();
            arg2.field1132 = arg0.method6965();
            arg2.field1192 = arg0.method6951();
            arg2.field1193 = (byte) arg0.method6963();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var18 = 0; var18 < 3; var18++) {
                arg2.field1088[var18] = arg0.method6975();
            }
        }
        if ((arg3 & 0x4000) != 0) {
            var4 = arg0.method6951();
        }
        if ((arg3 & 0x4) != 0) {
            int var19 = arg0.method7001();
            byte[] var20 = new byte[var19];
            class444 var21 = new class444(var20);
            arg0.method7137(var20, 0, var19);
            field1309[arg1] = var21;
            arg2.method2019(var21);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1174 = arg0.method6970();
            int var22 = arg0.method6983();
            arg2.field1196 = var22 >> 16;
            arg2.field1177 = (var22 & 0xFFFF) + client.field487;
            arg2.field1175 = 0;
            arg2.field1176 = 0;
            if (arg2.field1177 > client.field487) {
                arg2.field1175 = -1;
            }
            if (arg2.field1174 == 65535) {
                arg2.field1174 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1163 = arg0.method6970();
            if (arg2.field1197 == 0) {
                arg2.field1194 = arg2.field1163;
                arg2.field1163 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1143 = arg0.method6975();
            if (arg2.field1143.charAt(0) == '~') {
                arg2.field1143 = arg2.field1143.substring(1);
                class99.method2996(2, arg2.field1110.method7491(), arg2.field1143);
            } else if (Statics.field454 == arg2) {
                class99.method2996(2, arg2.field1110.method7491(), arg2.field1143);
            }
            arg2.field1185 = false;
            arg2.field1152 = 0;
            arg2.field1153 = 0;
            arg2.field1178 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var23 = arg0.method6929();
            if (var23 > 0) {
                for (int var24 = 0; var24 < var23; var24++) {
                    int var25 = -1;
                    int var26 = -1;
                    int var27 = -1;
                    int var28 = arg0.method6944();
                    if (var28 == 32767) {
                        var28 = arg0.method6944();
                        var26 = arg0.method6944();
                        var25 = arg0.method6944();
                        var27 = arg0.method6944();
                    } else if (var28 == 32766) {
                        var28 = -1;
                    } else {
                        var26 = arg0.method6944();
                    }
                    int var29 = arg0.method6944();
                    arg2.method2035(var28, var26, var25, var27, client.field487, var29);
                }
            }
            int var30 = arg0.method7001();
            if (var30 > 0) {
                for (int var31 = 0; var31 < var30; var31++) {
                    int var32 = arg0.method6944();
                    int var33 = arg0.method6944();
                    if (var33 == 32767) {
                        arg2.method2037(var32);
                    } else {
                        int var34 = arg0.method6944();
                        int var35 = arg0.method6929();
                        int var36 = var33 > 0 ? arg0.method7079() : var35;
                        arg2.method2036(var32, client.field487, var33, var34, var35, var36);
                    }
                }
            }
        }
        if (!arg2.field1112) {
            return;
        }
        if (var4 == 127) {
            arg2.method1991(arg2.field1111, arg2.field1096);
            return;
        }
        class193 var38;
        if (class193.field2206.field2209 == var4) {
            var38 = field1299[arg1];
        } else {
            class193[] var37 = new class193[] { class193.field2208, class193.field2210, class193.field2206, class193.field2207 };
            var38 = (class193) class330.method525(var37, var4);
        }
        arg2.method2015(arg2.field1111, arg2.field1096, var38);
    }

    @ObfuscatedName("ls.k(S)V")
    public static void method5279() {
        field1301 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1309[var0] = null;
            field1299[var0] = class193.field2207;
        }
    }
}
