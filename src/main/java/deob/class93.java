package deob;

@ObfuscatedName("cb")
public class class93 {

    @ObfuscatedName("cb.m")
    public static byte[] field1390 = new byte[2048];

    @ObfuscatedName("cb.h")
    public static byte[] field1391 = new byte[2048];

    @ObfuscatedName("cb.i")
    public static class185[] field1399 = new class185[2048];

    @ObfuscatedName("cb.w")
    public static int field1388 = 0;

    @ObfuscatedName("cb.t")
    public static int[] field1394 = new int[2048];

    @ObfuscatedName("cb.d")
    public static int field1395 = 0;

    @ObfuscatedName("cb.z")
    public static int[] field1403 = new int[2048];

    @ObfuscatedName("cb.k")
    public static int[] field1397 = new int[2048];

    @ObfuscatedName("cb.c")
    public static int[] field1398 = new int[2048];

    @ObfuscatedName("cb.o")
    public static int[] field1393 = new int[2048];

    @ObfuscatedName("cb.l")
    public static int field1400 = 0;

    @ObfuscatedName("cb.f")
    public static int[] field1401 = new int[2048];

    @ObfuscatedName("cb.q")
    public static class185 field1402 = new class185(new byte[5000]);

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.s(Lgt;I)V")
    public static final void method82(class191 arg0) {
        arg0.method3558();
        int var1 = client.field946;
        class72 var2 = Statics.field1754 = client.field945[var1] = new class72();
        var2.field823 = var1;
        int var3 = arg0.method3538(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1170[0] = var5 - Statics.field3737;
        var2.field1129 = (var2.field1170[0] << 7) + (var2.method1038() << 6);
        var2.field1174[0] = var6 - Statics.field435;
        var2.field1116 = (var2.field1174[0] << 7) + (var2.method1038() << 6);
        Statics.field706 = var2.field828 = var4;
        if (field1399[var1] != null) {
            var2.method1031(field1399[var1]);
        }
        field1388 = 0;
        field1394[++field1388 - 1] = var1;
        field1390[var1] = 0;
        field1395 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3538(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1397[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1398[var7] = 0;
                field1393[var7] = -1;
                field1403[++field1395 - 1] = var7;
                field1390[var7] = 0;
            }
        }
        arg0.method3535();
    }

    @ObfuscatedName("co.g(Lgt;B)I")
    public static int method1701(class191 arg0) {
        int var1 = arg0.method3538(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3538(5);
        } else if (var1 == 2) {
            var2 = arg0.method3538(8);
        } else {
            var2 = arg0.method3538(11);
        }
        return var2;
    }

    @ObfuscatedName("ci.m(Lgt;II)V")
    public static void method1743(class191 arg0, int arg1) {
        boolean var2 = arg0.method3538(1) == 1;
        if (var2) {
            field1401[++field1400 - 1] = arg1;
        }
        int var3 = arg0.method3538(2);
        class72 var4 = client.field945[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field832 = false;
            } else if (client.field946 == arg1) {
                throw new RuntimeException();
            } else {
                field1397[arg1] = (Statics.field435 + var4.field1174[0] >> 13) + (Statics.field3737 + var4.field1170[0] >> 13 << 14) + (var4.field828 << 28);
                if (var4.field1143 == -1) {
                    field1398[arg1] = var4.field1148;
                } else {
                    field1398[arg1] = var4.field1143;
                }
                field1393[arg1] = var4.field1156;
                client.field945[arg1] = null;
                if (arg0.method3538(1) != 0) {
                    method1598(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3538(3);
            int var6 = var4.field1170[0];
            int var7 = var4.field1174[0];
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
            if (client.field946 == arg1 && var4.field1129 < 1536 || var4.field1116 < 1536 || var4.field1129 >= 11776 || var4.field1116 >= 11776) {
                var4.method1034(var6, var7);
                var4.field832 = false;
            } else if (var2) {
                var4.field832 = true;
                var4.field833 = var6;
                var4.field834 = var7;
            } else {
                var4.field832 = false;
                var4.method1040(var6, var7, field1391[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3538(4);
            int var9 = var4.field1170[0];
            int var10 = var4.field1174[0];
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
            if (client.field946 == arg1 && var4.field1129 < 1536 || var4.field1116 < 1536 || var4.field1129 >= 11776 || var4.field1116 >= 11776) {
                var4.method1034(var9, var10);
                var4.field832 = false;
            } else if (var2) {
                var4.field832 = true;
                var4.field833 = var9;
                var4.field834 = var10;
            } else {
                var4.field832 = false;
                var4.method1040(var9, var10, field1391[arg1]);
            }
        } else {
            int var11 = arg0.method3538(1);
            if (var11 == 0) {
                int var12 = arg0.method3538(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1170[0] + var14;
                int var17 = var4.field1174[0] + var15;
                if (client.field946 == arg1 && var4.field1129 < 1536 || var4.field1116 < 1536 || var4.field1129 >= 11776 || var4.field1116 >= 11776) {
                    var4.method1034(var16, var17);
                    var4.field832 = false;
                } else if (var2) {
                    var4.field832 = true;
                    var4.field833 = var16;
                    var4.field834 = var17;
                } else {
                    var4.field832 = false;
                    var4.method1040(var16, var17, field1391[arg1]);
                }
                var4.field828 = (byte) (var4.field828 + var13 & 0x3);
                if (client.field946 == arg1) {
                    Statics.field706 = var4.field828;
                }
            } else {
                int var18 = arg0.method3538(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3737 + var4.field1170[0] + var20 & 0x3FFF) - Statics.field3737;
                int var23 = (Statics.field435 + var4.field1174[0] + var21 & 0x3FFF) - Statics.field435;
                if (client.field946 == arg1 && var4.field1129 < 1536 || var4.field1116 < 1536 || var4.field1129 >= 11776 || var4.field1116 >= 11776) {
                    var4.method1034(var22, var23);
                    var4.field832 = false;
                } else if (var2) {
                    var4.field832 = true;
                    var4.field833 = var22;
                    var4.field834 = var23;
                } else {
                    var4.field832 = false;
                    var4.method1040(var22, var23, field1391[arg1]);
                }
                var4.field828 = (byte) (var4.field828 + var19 & 0x3);
                if (client.field946 == arg1) {
                    Statics.field706 = var4.field828;
                }
            }
        }
    }

    @ObfuscatedName("cw.h(Lgt;IB)Z")
    public static boolean method1598(class191 arg0, int arg1) {
        int var2 = arg0.method3538(2);
        if (var2 == 0) {
            if (arg0.method3538(1) != 0) {
                method1598(arg0, arg1);
            }
            int var3 = arg0.method3538(13);
            int var4 = arg0.method3538(13);
            boolean var5 = arg0.method3538(1) == 1;
            if (var5) {
                field1401[++field1400 - 1] = arg1;
            }
            if (client.field945[arg1] != null) {
                throw new RuntimeException();
            }
            class72 var6 = client.field945[arg1] = new class72();
            var6.field823 = arg1;
            if (field1399[arg1] != null) {
                var6.method1031(field1399[arg1]);
            }
            var6.field1148 = field1398[arg1];
            var6.field1156 = field1393[arg1];
            int var7 = field1397[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1166[0] = field1391[arg1];
            var6.field828 = (byte) var8;
            var6.method1034((var9 << 13) + var3 - Statics.field3737, (var10 << 13) + var4 - Statics.field435);
            var6.field832 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3538(2);
            int var12 = field1397[arg1];
            field1397[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3538(5);
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
            int var20 = arg0.method3538(18);
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

    @ObfuscatedName("fm.i(Lgt;ILby;II)V")
    public static final void method3135(class191 arg0, int arg1, class72 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method3237();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = arg0.method3253();
                    if (var10 == 32767) {
                        var10 = arg0.method3253();
                        var8 = arg0.method3253();
                        var7 = arg0.method3253();
                        var9 = arg0.method3253();
                    } else if (var10 == 32766) {
                        var10 = -1;
                    } else {
                        var8 = arg0.method3253();
                    }
                    int var11 = arg0.method3253();
                    arg2.method1484(var10, var8, var7, var9, client.field1036, var11);
                }
            }
            int var12 = arg0.method3239();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = arg0.method3253();
                    int var15 = arg0.method3253();
                    if (var15 == 32767) {
                        arg2.method1489(var14);
                    } else {
                        int var16 = arg0.method3253();
                        int var17 = arg0.method3267();
                        int var18 = var15 > 0 ? arg0.method3237() : var17;
                        arg2.method1485(var14, client.field1036, var15, var16, var17, var18);
                    }
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var19 = arg0.method3276();
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg0.method3269();
            Statics.method4178(arg2, var19, var20);
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1152 = arg0.method3241();
            int var21 = arg0.method3287();
            arg2.field1169 = var21 >> 16;
            arg2.field1155 = (var21 & 0xFFFF) + client.field1036;
            arg2.field1153 = 0;
            arg2.field1154 = 0;
            if (arg2.field1155 > client.field1036) {
                arg2.field1153 = -1;
            }
            if (arg2.field1152 == 65535) {
                arg2.field1152 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1143 = arg0.method3276();
            if (arg2.field1123 == 0) {
                arg2.field1148 = arg2.field1143;
                arg2.field1143 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1139 = arg0.method3248();
            if (arg2.field1139.charAt(0) == '~') {
                arg2.field1139 = arg2.field1139.substring(1);
                class95.method649(2, arg2.field819.method4922(), arg2.field1139);
            } else if (Statics.field1754 == arg2) {
                class95.method649(2, arg2.field819.method4922(), arg2.field1139);
            }
            arg2.field1120 = false;
            arg2.field1132 = 0;
            arg2.field1133 = 0;
            arg2.field1131 = 150;
        }
        if ((arg3 & 0x200) != 0) {
            for (int var22 = 0; var22 < 3; var22++) {
                arg2.field811[var22] = arg0.method3248();
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var23 = arg0.method3278();
            class242 var24 = (class242) class180.method1823(class242.method2613(), arg0.method3239());
            boolean var25 = arg0.method3269() == 1;
            int var26 = arg0.method3267();
            int var27 = arg0.field2514;
            if (arg2.field819 != null && arg2.field820 != null) {
                boolean var28 = false;
                if (var24.field3274 && Statics.field473.method1573(arg2.field819)) {
                    var28 = true;
                }
                if (!var28 && client.field840 == 0 && !arg2.field827) {
                    field1402.field2514 = 0;
                    arg0.method3291(field1402.field2512, 0, var26);
                    field1402.field2514 = 0;
                    String var29 = class288.method5002(class294.method3592(class289.method4552(field1402)));
                    arg2.field1139 = var29.trim();
                    arg2.field1132 = var23 >> 8;
                    arg2.field1133 = var23 & 0xFF;
                    arg2.field1131 = 150;
                    arg2.field1120 = var25;
                    arg2.field1130 = Statics.field1754 != arg2 && var24.field3274 && client.field1043 != "" && var29.toLowerCase().indexOf(client.field1043) == -1;
                    int var30;
                    if (var24.field3273) {
                        var30 = var25 ? 91 : 1;
                    } else {
                        var30 = var25 ? 90 : 2;
                    }
                    if (var24.field3271 == -1) {
                        class95.method649(var30, arg2.field819.method4922(), var29);
                    } else {
                        int var32 = var24.field3271;
                        String var33 = "<img=" + var32 + ">";
                        class95.method649(var30, var33 + arg2.field819.method4922(), var29);
                    }
                }
            }
            arg0.field2514 = var26 + var27;
        }
        if ((arg3 & 0x80) != 0) {
            int var34 = arg0.method3267();
            byte[] var35 = new byte[var34];
            class185 var36 = new class185(var35);
            arg0.method3290(var35, 0, var34);
            field1399[arg1] = var36;
            arg2.method1031(var36);
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method3270();
        }
        if ((arg3 & 0x400) != 0) {
            field1391[arg1] = arg0.method3270();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1156 = arg0.method3278();
            if (arg2.field1156 == 65535) {
                arg2.field1156 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1163 = arg0.method3240();
            arg2.field1159 = arg0.method3271();
            arg2.field1158 = arg0.method3270();
            arg2.field1160 = arg0.method3272();
            arg2.field1161 = arg0.method3278() + client.field1036;
            arg2.field1150 = arg0.method3241() + client.field1036;
            arg2.field1119 = arg0.method3276();
            if (arg2.field832) {
                arg2.field1163 += arg2.field833;
                arg2.field1159 += arg2.field834;
                arg2.field1158 += arg2.field833;
                arg2.field1160 += arg2.field834;
                arg2.field1123 = 0;
            } else {
                arg2.field1163 += arg2.field1170[0];
                arg2.field1159 += arg2.field1174[0];
                arg2.field1158 += arg2.field1170[0];
                arg2.field1160 += arg2.field1174[0];
                arg2.field1123 = 1;
            }
            arg2.field1162 = 0;
        }
        if (!arg2.field832) {
            return;
        }
        if (var4 == 127) {
            arg2.method1034(arg2.field833, arg2.field834);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field1391[arg1];
        } else {
            var37 = var4;
        }
        arg2.method1040(arg2.field833, arg2.field834, var37);
    }
}
