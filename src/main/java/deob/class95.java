package deob;

@ObfuscatedName("cy")
public class class95 {

    @ObfuscatedName("cy.e")
    public static byte[] field1390 = new byte[2048];

    @ObfuscatedName("cy.k")
    public static byte[] field1389 = new byte[2048];

    @ObfuscatedName("cy.u")
    public static class185[] field1393 = new class185[2048];

    @ObfuscatedName("cy.z")
    public static int field1400 = 0;

    @ObfuscatedName("cy.t")
    public static int[] field1394 = new int[2048];

    @ObfuscatedName("cy.f")
    public static int field1395 = 0;

    @ObfuscatedName("cy.g")
    public static int[] field1396 = new int[2048];

    @ObfuscatedName("cy.j")
    public static int[] field1397 = new int[2048];

    @ObfuscatedName("cy.x")
    public static int[] field1398 = new int[2048];

    @ObfuscatedName("cy.c")
    public static int[] field1391 = new int[2048];

    @ObfuscatedName("cy.s")
    public static int field1401 = 0;

    @ObfuscatedName("cy.n")
    public static int[] field1392 = new int[2048];

    @ObfuscatedName("cy.y")
    public static class185 field1402 = new class185(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.a(Lgy;I)V")
    public static final void method1364(class191 arg0) {
        arg0.method3244();
        int var1 = client.field950;
        class74 var2 = Statics.field2088 = client.field949[var1] = new class74();
        var2.field811 = var1;
        int var3 = arg0.method3243(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1178[0] = var5 - Statics.field556;
        var2.field1182 = (var2.field1178[0] << 7) + (var2.method982() << 6);
        var2.field1179[0] = var6 - Statics.field895;
        var2.field1143 = (var2.field1179[0] << 7) + (var2.method982() << 6);
        Statics.field235 = var2.field822 = var4;
        if (field1393[var1] != null) {
            var2.method994(field1393[var1]);
        }
        field1400 = 0;
        field1394[++field1400 - 1] = var1;
        field1390[var1] = 0;
        field1395 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3243(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1397[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1398[var7] = 0;
                field1391[var7] = -1;
                field1396[++field1395 - 1] = var7;
                field1390[var7] = 0;
            }
        }
        arg0.method3263();
    }

    @ObfuscatedName("h.w(Lgy;B)I")
    public static int method159(class191 arg0) {
        int var1 = arg0.method3243(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3243(5);
        } else if (var1 == 2) {
            var2 = arg0.method3243(8);
        } else {
            var2 = arg0.method3243(11);
        }
        return var2;
    }

    @ObfuscatedName("bf.e(Lgy;II)V")
    public static void method921(class191 arg0, int arg1) {
        boolean var2 = arg0.method3243(1) == 1;
        if (var2) {
            field1392[++field1401 - 1] = arg1;
        }
        int var3 = arg0.method3243(2);
        class74 var4 = client.field949[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field815 = false;
            } else if (client.field950 == arg1) {
                throw new RuntimeException();
            } else {
                field1397[arg1] = (Statics.field895 + var4.field1179[0] >> 13) + (Statics.field556 + var4.field1178[0] >> 13 << 14) + (var4.field822 << 28);
                if (var4.field1151 == -1) {
                    field1398[arg1] = var4.field1174;
                } else {
                    field1398[arg1] = var4.field1151;
                }
                field1391[arg1] = var4.field1149;
                client.field949[arg1] = null;
                if (arg0.method3243(1) != 0) {
                    method1517(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3243(3);
            int var6 = var4.field1178[0];
            int var7 = var4.field1179[0];
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
            if (client.field950 == arg1 && var4.field1182 < 1536 || var4.field1143 < 1536 || var4.field1182 >= 11776 || var4.field1143 >= 11776) {
                var4.method983(var6, var7);
                var4.field815 = false;
            } else if (var2) {
                var4.field815 = true;
                var4.field834 = var6;
                var4.field835 = var7;
            } else {
                var4.field815 = false;
                var4.method986(var6, var7, field1389[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3243(4);
            int var9 = var4.field1178[0];
            int var10 = var4.field1179[0];
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
            if (client.field950 == arg1 && var4.field1182 < 1536 || var4.field1143 < 1536 || var4.field1182 >= 11776 || var4.field1143 >= 11776) {
                var4.method983(var9, var10);
                var4.field815 = false;
            } else if (var2) {
                var4.field815 = true;
                var4.field834 = var9;
                var4.field835 = var10;
            } else {
                var4.field815 = false;
                var4.method986(var9, var10, field1389[arg1]);
            }
        } else {
            int var11 = arg0.method3243(1);
            if (var11 == 0) {
                int var12 = arg0.method3243(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1178[0] + var14;
                int var17 = var4.field1179[0] + var15;
                if (client.field950 == arg1 && var4.field1182 < 1536 || var4.field1143 < 1536 || var4.field1182 >= 11776 || var4.field1143 >= 11776) {
                    var4.method983(var16, var17);
                    var4.field815 = false;
                } else if (var2) {
                    var4.field815 = true;
                    var4.field834 = var16;
                    var4.field835 = var17;
                } else {
                    var4.field815 = false;
                    var4.method986(var16, var17, field1389[arg1]);
                }
                var4.field822 = (byte) (var4.field822 + var13 & 0x3);
                if (client.field950 == arg1) {
                    Statics.field235 = var4.field822;
                }
            } else {
                int var18 = arg0.method3243(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field556 + var4.field1178[0] + var20 & 0x3FFF) - Statics.field556;
                int var23 = (Statics.field895 + var4.field1179[0] + var21 & 0x3FFF) - Statics.field895;
                if (client.field950 == arg1 && var4.field1182 < 1536 || var4.field1143 < 1536 || var4.field1182 >= 11776 || var4.field1143 >= 11776) {
                    var4.method983(var22, var23);
                    var4.field815 = false;
                } else if (var2) {
                    var4.field815 = true;
                    var4.field834 = var22;
                    var4.field835 = var23;
                } else {
                    var4.field815 = false;
                    var4.method986(var22, var23, field1389[arg1]);
                }
                var4.field822 = (byte) (var4.field822 + var19 & 0x3);
                if (client.field950 == arg1) {
                    Statics.field235 = var4.field822;
                }
            }
        }
    }

    @ObfuscatedName("ce.k(Lgy;II)Z")
    public static boolean method1517(class191 arg0, int arg1) {
        int var2 = arg0.method3243(2);
        if (var2 == 0) {
            if (arg0.method3243(1) != 0) {
                method1517(arg0, arg1);
            }
            int var3 = arg0.method3243(13);
            int var4 = arg0.method3243(13);
            boolean var5 = arg0.method3243(1) == 1;
            if (var5) {
                field1392[++field1401 - 1] = arg1;
            }
            if (client.field949[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field949[arg1] = new class74();
            var6.field811 = arg1;
            if (field1393[arg1] != null) {
                var6.method994(field1393[arg1]);
            }
            var6.field1174 = field1398[arg1];
            var6.field1149 = field1391[arg1];
            int var7 = field1397[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1168[0] = field1389[arg1];
            var6.field822 = (byte) var8;
            var6.method983((var9 << 13) + var3 - Statics.field556, (var10 << 13) + var4 - Statics.field895);
            var6.field815 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3243(2);
            int var12 = field1397[arg1];
            field1397[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3243(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1397[arg1];
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
            field1397[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3243(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1397[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1397[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("dc.u(Lgy;B)V")
    public static final void method2203(class191 arg0) {
        for (int var1 = 0; var1 < field1401; var1++) {
            int var2 = field1392[var1];
            class74 var3 = client.field949[var2];
            int var4 = arg0.method2962();
            if ((var4 & 0x80) != 0) {
                var4 += arg0.method2962() << 8;
            }
            method665(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("bc.z(Lgy;ILbj;II)V")
    public static final void method665(class191 arg0, int arg1, class74 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x10) != 0) {
            arg2.field1135 = arg0.method3168();
            if (arg2.field1135.charAt(0) == '~') {
                arg2.field1135 = arg2.field1135.substring(1);
                class97.method172(2, arg2.field832, arg2.field1135);
            } else if (Statics.field2088 == arg2) {
                class97.method172(2, arg2.field832, arg2.field1135);
            }
            arg2.field1123 = false;
            arg2.field1180 = 0;
            arg2.field1141 = 0;
            arg2.field1158 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method3036();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = arg0.method3137();
                    if (var10 == 32767) {
                        var10 = arg0.method3137();
                        var8 = arg0.method3137();
                        var7 = arg0.method3137();
                        var9 = arg0.method3137();
                    } else if (var10 == 32766) {
                        var10 = -1;
                    } else {
                        var8 = arg0.method3137();
                    }
                    int var11 = arg0.method3137();
                    arg2.method1341(var10, var8, var7, var9, client.field963, var11);
                }
            }
            int var12 = arg0.method2962();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = arg0.method3137();
                    int var15 = arg0.method3137();
                    if (var15 == 32767) {
                        arg2.method1345(var14);
                    } else {
                        int var16 = arg0.method3137();
                        int var17 = arg0.method2962();
                        int var18 = var15 > 0 ? arg0.method2989() : var17;
                        arg2.method1344(var14, client.field963, var15, var16, var17, var18);
                    }
                }
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var19 = arg0.method2975();
            byte[] var20 = new byte[var19];
            class185 var21 = new class185(var20);
            arg0.method3011(var20, 0, var19);
            field1393[arg1] = var21;
            arg2.method994(var21);
        }
        if ((arg3 & 0x8) != 0) {
            int var22 = arg0.method3000();
            class242 var23 = (class242) class180.method1581(class242.method2282(), arg0.method2962());
            boolean var24 = arg0.method2989() == 1;
            int var25 = arg0.method2975();
            int var26 = arg0.field2509;
            if (arg2.field832 != null && arg2.field827 != null) {
                boolean var27 = false;
                if (var23.field3273 && client.method203(arg2.field832)) {
                    var27 = true;
                }
                if (!var27 && client.field948 == 0 && !arg2.field830) {
                    field1402.field2509 = 0;
                    arg0.method2973(field1402.field2512, 0, var25);
                    field1402.field2509 = 0;
                    String var28 = class276.method4546(class282.method2471(class277.method83(field1402)));
                    arg2.field1135 = var28.trim();
                    arg2.field1180 = var22 >> 8;
                    arg2.field1141 = var22 & 0xFF;
                    arg2.field1158 = 150;
                    arg2.field1123 = var24;
                    arg2.field1138 = Statics.field2088 != arg2 && var23.field3273 && client.field1047 != "" && var28.toLowerCase().indexOf(client.field1047) == -1;
                    int var29;
                    if (var23.field3279) {
                        var29 = var24 ? 91 : 1;
                    } else {
                        var29 = var24 ? 90 : 2;
                    }
                    if (var23.field3280 == -1) {
                        class97.method172(var29, arg2.field832, var28);
                    } else {
                        int var31 = var23.field3280;
                        String var32 = "<img=" + var31 + ">";
                        class97.method172(var29, var32 + arg2.field832, var28);
                    }
                }
            }
            arg0.field2509 = var25 + var26;
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field814[var33] = arg0.method3168();
            }
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method3015();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1149 = arg0.method2999();
            if (arg2.field1149 == 65535) {
                arg2.field1149 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1165 = arg0.method3015();
            arg2.field1167 = arg0.method3015();
            arg2.field1166 = arg0.method3138();
            arg2.field1126 = arg0.method3015();
            arg2.field1139 = arg0.method3194() + client.field963;
            arg2.field1170 = arg0.method2998() + client.field963;
            arg2.field1134 = arg0.method3194();
            if (arg2.field815) {
                arg2.field1165 += arg2.field834;
                arg2.field1167 += arg2.field835;
                arg2.field1166 += arg2.field834;
                arg2.field1126 += arg2.field835;
                arg2.field1136 = 0;
            } else {
                arg2.field1165 += arg2.field1178[0];
                arg2.field1167 += arg2.field1179[0];
                arg2.field1166 += arg2.field1178[0];
                arg2.field1126 += arg2.field1179[0];
                arg2.field1136 = 1;
            }
            arg2.field1156 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1151 = arg0.method2998();
            if (arg2.field1136 == 0) {
                arg2.field1174 = arg2.field1151;
                arg2.field1151 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var34 = arg0.method3000();
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = arg0.method2989();
            client.method473(arg2, var34, var35);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1160 = arg0.method3000();
            int var36 = arg0.method3009();
            arg2.field1164 = var36 >> 16;
            arg2.field1163 = (var36 & 0xFFFF) + client.field963;
            arg2.field1161 = 0;
            arg2.field1144 = 0;
            if (arg2.field1163 > client.field963) {
                arg2.field1161 = -1;
            }
            if (arg2.field1160 == 65535) {
                arg2.field1160 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            field1389[arg1] = arg0.method3138();
        }
        if (!arg2.field815) {
            return;
        }
        if (var4 == 127) {
            arg2.method983(arg2.field834, arg2.field835);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field1389[arg1];
        } else {
            var37 = var4;
        }
        arg2.method986(arg2.field834, arg2.field835, var37);
    }

    @ObfuscatedName("ba.t(B)V")
    public static void method1015() {
        field1400 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1393[var0] = null;
            field1389[var0] = 1;
        }
    }
}
