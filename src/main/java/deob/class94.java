package deob;

@ObfuscatedName("ch")
public class class94 {

    @ObfuscatedName("ch.n")
    public static byte[] field1404 = new byte[2048];

    @ObfuscatedName("ch.r")
    public static byte[] field1405 = new byte[2048];

    @ObfuscatedName("ch.e")
    public static class195[] field1413 = new class195[2048];

    @ObfuscatedName("ch.y")
    public static int field1407 = 0;

    @ObfuscatedName("ch.k")
    public static int[] field1408 = new int[2048];

    @ObfuscatedName("ch.s")
    public static int field1409 = 0;

    @ObfuscatedName("ch.p")
    public static int[] field1410 = new int[2048];

    @ObfuscatedName("ch.x")
    public static int[] field1403 = new int[2048];

    @ObfuscatedName("ch.m")
    public static int[] field1412 = new int[2048];

    @ObfuscatedName("ch.h")
    public static int[] field1406 = new int[2048];

    @ObfuscatedName("ch.t")
    public static int field1411 = 0;

    @ObfuscatedName("ch.i")
    public static int[] field1415 = new int[2048];

    @ObfuscatedName("ch.u")
    public static class195 field1416 = new class195(new byte[5000]);

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kk.d(Lgb;I)V")
    public static final void method4902(class202 arg0) {
        arg0.method3544();
        int var1 = client.field1091;
        class73 var2 = Statics.field302 = client.field967[var1] = new class73();
        var2.field846 = var1;
        int var3 = arg0.method3545(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1195[0] = var5 - Statics.field445;
        var2.field1186 = (var2.field1195[0] << 7) + (var2.method1077() << 6);
        var2.field1196[0] = var6 - Statics.field3556;
        var2.field1151 = (var2.field1196[0] << 7) + (var2.method1077() << 6);
        Statics.field505 = var2.field845 = var4;
        if (field1413[var1] != null) {
            var2.method1036(field1413[var1]);
        }
        field1407 = 0;
        field1408[++field1407 - 1] = var1;
        field1404[var1] = 0;
        field1409 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3545(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1403[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1412[var7] = 0;
                field1406[var7] = -1;
                field1410[++field1409 - 1] = var7;
                field1404[var7] = 0;
            }
        }
        arg0.method3546();
    }

    @ObfuscatedName("it.z(Lgb;II)V")
    public static final void method4269(class202 arg0, int arg1) {
        int var2 = arg0.field2568;
        field1411 = 0;
        method112(arg0);
        method631(arg0);
        if (arg0.field2568 - var2 != arg1) {
            throw new RuntimeException(arg0.field2568 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("f.n(Lgb;I)V")
    public static final void method112(class202 arg0) {
        int var1 = 0;
        arg0.method3544();
        for (int var2 = 0; var2 < field1407; var2++) {
            int var3 = field1408[var2];
            if ((field1404[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1404[var3] = (byte) (field1404[var3] | 0x2);
                } else {
                    int var4 = arg0.method3545(1);
                    if (var4 == 0) {
                        var1 = method987(arg0);
                        field1404[var3] = (byte) (field1404[var3] | 0x2);
                    } else {
                        method1833(arg0, var3);
                    }
                }
            }
        }
        arg0.method3546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3544();
        for (int var5 = 0; var5 < field1407; var5++) {
            int var6 = field1408[var5];
            if ((field1404[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1404[var6] = (byte) (field1404[var6] | 0x2);
                } else {
                    int var7 = arg0.method3545(1);
                    if (var7 == 0) {
                        var1 = method987(arg0);
                        field1404[var6] = (byte) (field1404[var6] | 0x2);
                    } else {
                        method1833(arg0, var6);
                    }
                }
            }
        }
        arg0.method3546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3544();
        for (int var8 = 0; var8 < field1409; var8++) {
            int var9 = field1410[var8];
            if ((field1404[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1404[var9] = (byte) (field1404[var9] | 0x2);
                } else {
                    int var10 = arg0.method3545(1);
                    if (var10 == 0) {
                        var1 = method987(arg0);
                        field1404[var9] = (byte) (field1404[var9] | 0x2);
                    } else if (method179(arg0, var9)) {
                        field1404[var9] = (byte) (field1404[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3544();
        for (int var11 = 0; var11 < field1409; var11++) {
            int var12 = field1410[var11];
            if ((field1404[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1404[var12] = (byte) (field1404[var12] | 0x2);
                } else {
                    int var13 = arg0.method3545(1);
                    if (var13 == 0) {
                        var1 = method987(arg0);
                        field1404[var12] = (byte) (field1404[var12] | 0x2);
                    } else if (method179(arg0, var12)) {
                        field1404[var12] = (byte) (field1404[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1407 = 0;
        field1409 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1404[var14] = (byte) (field1404[var14] >> 1);
            class73 var15 = client.field967[var14];
            if (var15 == null) {
                field1410[++field1409 - 1] = var14;
            } else {
                field1408[++field1407 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bi.r(Lgb;I)I")
    public static int method987(class202 arg0) {
        int var1 = arg0.method3545(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3545(5);
        } else if (var1 == 2) {
            var2 = arg0.method3545(8);
        } else {
            var2 = arg0.method3545(11);
        }
        return var2;
    }

    @ObfuscatedName("cr.e(Lgb;II)V")
    public static void method1833(class202 arg0, int arg1) {
        boolean var2 = arg0.method3545(1) == 1;
        if (var2) {
            field1415[++field1411 - 1] = arg1;
        }
        int var3 = arg0.method3545(2);
        class73 var4 = client.field967[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field841 = false;
            } else if (client.field1091 == arg1) {
                throw new RuntimeException();
            } else {
                field1403[arg1] = (Statics.field3556 + var4.field1196[0] >> 13) + (Statics.field445 + var4.field1195[0] >> 13 << 14) + (var4.field845 << 28);
                if (var4.field1143 == -1) {
                    field1412[arg1] = var4.field1191;
                } else {
                    field1412[arg1] = var4.field1143;
                }
                field1406[arg1] = var4.field1139;
                client.field967[arg1] = null;
                if (arg0.method3545(1) != 0) {
                    method179(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3545(3);
            int var6 = var4.field1195[0];
            int var7 = var4.field1196[0];
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
            if (client.field1091 == arg1 && var4.field1186 < 1536 || var4.field1151 < 1536 || var4.field1186 >= 11776 || var4.field1151 >= 11776) {
                var4.method1046(var6, var7);
                var4.field841 = false;
            } else if (var2) {
                var4.field841 = true;
                var4.field827 = var6;
                var4.field851 = var7;
            } else {
                var4.field841 = false;
                var4.method1045(var6, var7, field1405[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3545(4);
            int var9 = var4.field1195[0];
            int var10 = var4.field1196[0];
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
            if (client.field1091 == arg1 && var4.field1186 < 1536 || var4.field1151 < 1536 || var4.field1186 >= 11776 || var4.field1151 >= 11776) {
                var4.method1046(var9, var10);
                var4.field841 = false;
            } else if (var2) {
                var4.field841 = true;
                var4.field827 = var9;
                var4.field851 = var10;
            } else {
                var4.field841 = false;
                var4.method1045(var9, var10, field1405[arg1]);
            }
        } else {
            int var11 = arg0.method3545(1);
            if (var11 == 0) {
                int var12 = arg0.method3545(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1195[0] + var14;
                int var17 = var4.field1196[0] + var15;
                if (client.field1091 == arg1 && var4.field1186 < 1536 || var4.field1151 < 1536 || var4.field1186 >= 11776 || var4.field1151 >= 11776) {
                    var4.method1046(var16, var17);
                    var4.field841 = false;
                } else if (var2) {
                    var4.field841 = true;
                    var4.field827 = var16;
                    var4.field851 = var17;
                } else {
                    var4.field841 = false;
                    var4.method1045(var16, var17, field1405[arg1]);
                }
                var4.field845 = (byte) (var4.field845 + var13 & 0x3);
                if (client.field1091 == arg1) {
                    Statics.field505 = var4.field845;
                }
            } else {
                int var18 = arg0.method3545(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field445 + var4.field1195[0] + var20 & 0x3FFF) - Statics.field445;
                int var23 = (Statics.field3556 + var4.field1196[0] + var21 & 0x3FFF) - Statics.field3556;
                if (client.field1091 == arg1 && var4.field1186 < 1536 || var4.field1151 < 1536 || var4.field1186 >= 11776 || var4.field1151 >= 11776) {
                    var4.method1046(var22, var23);
                    var4.field841 = false;
                } else if (var2) {
                    var4.field841 = true;
                    var4.field827 = var22;
                    var4.field851 = var23;
                } else {
                    var4.field841 = false;
                    var4.method1045(var22, var23, field1405[arg1]);
                }
                var4.field845 = (byte) (var4.field845 + var19 & 0x3);
                if (client.field1091 == arg1) {
                    Statics.field505 = var4.field845;
                }
            }
        }
    }

    @ObfuscatedName("o.y(Lgb;IB)Z")
    public static boolean method179(class202 arg0, int arg1) {
        int var2 = arg0.method3545(2);
        if (var2 == 0) {
            if (arg0.method3545(1) != 0) {
                method179(arg0, arg1);
            }
            int var3 = arg0.method3545(13);
            int var4 = arg0.method3545(13);
            boolean var5 = arg0.method3545(1) == 1;
            if (var5) {
                field1415[++field1411 - 1] = arg1;
            }
            if (client.field967[arg1] != null) {
                throw new RuntimeException();
            }
            class73 var6 = client.field967[arg1] = new class73();
            var6.field846 = arg1;
            if (field1413[arg1] != null) {
                var6.method1036(field1413[arg1]);
            }
            var6.field1191 = field1412[arg1];
            var6.field1139 = field1406[arg1];
            int var7 = field1403[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1160[0] = field1405[arg1];
            var6.field845 = (byte) var8;
            var6.method1046((var9 << 13) + var3 - Statics.field445, (var10 << 13) + var4 - Statics.field3556);
            var6.field841 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3545(2);
            int var12 = field1403[arg1];
            field1403[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3545(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1403[arg1];
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
            field1403[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3545(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1403[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1403[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ay.k(Lgb;I)V")
    public static final void method631(class202 arg0) {
        for (int var1 = 0; var1 < field1411; var1++) {
            int var2 = field1415[var1];
            class73 var3 = client.field967[var2];
            int var4 = arg0.method3330();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method3330() << 8;
            }
            method483(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ad.s(Lgb;ILbd;IS)V")
    public static final void method483(class202 arg0, int arg1, class73 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x800) != 0) {
            for (int var5 = 0; var5 < 3; var5++) {
                arg2.field828[var5] = arg0.method3268();
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var6 = arg0.method3261();
            byte[] var7 = new byte[var6];
            class195 var8 = new class195(var7);
            arg0.method3327(var7, 0, var6);
            field1413[arg1] = var8;
            arg2.method1036(var8);
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method3458();
        }
        if ((arg3 & 0x200) != 0) {
            field1405[arg1] = arg0.method3290();
        }
        if ((arg3 & 0x8) != 0) {
            int var9 = arg0.method3354();
            class257 var10 = (class257) class190.method500(class257.method4166(), arg0.method3288());
            boolean var11 = arg0.method3288() == 1;
            int var12 = arg0.method3330();
            int var13 = arg0.field2568;
            if (arg2.field848 != null && arg2.field824 != null) {
                boolean var14 = false;
                if (var10.field3334 && Statics.field1319.method1578(arg2.field848)) {
                    var14 = true;
                }
                if (!var14 && client.field965 == 0 && !arg2.field844) {
                    field1416.field2568 = 0;
                    arg0.method3281(field1416.field2569, 0, var12);
                    field1416.field2568 = 0;
                    class195 var15 = field1416;
                    String var16 = class314.method3170(var15, 32767);
                    String var17 = class313.method5161(class319.method1030(var16));
                    arg2.field1153 = var17.trim();
                    arg2.field1157 = var9 >> 8;
                    arg2.field1197 = var9 & 0xFF;
                    arg2.field1156 = 150;
                    arg2.field1154 = var11;
                    arg2.field1155 = Statics.field302 != arg2 && var10.field3334 && client.field1067 != "" && var17.toLowerCase().indexOf(client.field1067) == -1;
                    int var18;
                    if (var10.field3340) {
                        var18 = var11 ? 91 : 1;
                    } else {
                        var18 = var11 ? 90 : 2;
                    }
                    if (var10.field3339 == -1) {
                        class96.method140(var18, arg2.field848.method5095(), var17);
                    } else {
                        class96.method140(var18, class87.method693(var10.field3339) + arg2.field848.method5095(), var17);
                    }
                }
            }
            arg0.field2568 = var12 + var13;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1153 = arg0.method3268();
            if (arg2.field1153.charAt(0) == '~') {
                arg2.field1153 = arg2.field1153.substring(1);
                class96.method140(2, arg2.field848.method5095(), arg2.field1153);
            } else if (Statics.field302 == arg2) {
                class96.method140(2, arg2.field848.method5095(), arg2.field1153);
            }
            arg2.field1154 = false;
            arg2.field1157 = 0;
            arg2.field1197 = 0;
            arg2.field1156 = 150;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1168 = arg0.method3290();
            arg2.field1147 = arg0.method3291();
            arg2.field1182 = arg0.method3290();
            arg2.field1185 = arg0.method3458();
            arg2.field1189 = arg0.method3354() + client.field866;
            arg2.field1187 = arg0.method3354() + client.field866;
            arg2.field1188 = arg0.method3354();
            if (arg2.field841) {
                arg2.field1168 += arg2.field827;
                arg2.field1147 += arg2.field851;
                arg2.field1182 += arg2.field827;
                arg2.field1185 += arg2.field851;
                arg2.field1193 = 0;
            } else {
                arg2.field1168 += arg2.field1195[0];
                arg2.field1147 += arg2.field1196[0];
                arg2.field1182 += arg2.field1195[0];
                arg2.field1185 += arg2.field1196[0];
                arg2.field1193 = 1;
            }
            arg2.field1199 = 0;
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1139 = arg0.method3298();
            if (arg2.field1139 == 65535) {
                arg2.field1139 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var19 = arg0.method3296();
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg0.method3287();
            client.method5258(arg2, var19, var20);
        }
        if ((arg3 & 0x2) != 0) {
            int var21 = arg0.method3261();
            if (var21 > 0) {
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = -1;
                    int var26 = arg0.method3380();
                    if (var26 == 32767) {
                        var26 = arg0.method3380();
                        var24 = arg0.method3380();
                        var23 = arg0.method3380();
                        var25 = arg0.method3380();
                    } else if (var26 == 32766) {
                        var26 = -1;
                    } else {
                        var24 = arg0.method3380();
                    }
                    int var27 = arg0.method3380();
                    arg2.method1505(var26, var24, var23, var25, client.field866, var27);
                }
            }
            int var28 = arg0.method3261();
            if (var28 > 0) {
                for (int var29 = 0; var29 < var28; var29++) {
                    int var30 = arg0.method3380();
                    int var31 = arg0.method3380();
                    if (var31 == 32767) {
                        arg2.method1507(var30);
                    } else {
                        int var32 = arg0.method3380();
                        int var33 = arg0.method3287();
                        int var34 = var31 > 0 ? arg0.method3330() : var33;
                        arg2.method1506(var30, client.field866, var31, var32, var33, var34);
                    }
                }
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1177 = arg0.method3298();
            int var35 = arg0.method3306();
            arg2.field1158 = var35 >> 16;
            arg2.field1180 = (var35 & 0xFFFF) + client.field866;
            arg2.field1178 = 0;
            arg2.field1179 = 0;
            if (arg2.field1180 > client.field866) {
                arg2.field1178 = -1;
            }
            if (arg2.field1177 == 65535) {
                arg2.field1177 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1143 = arg0.method3298();
            if (arg2.field1193 == 0) {
                arg2.field1191 = arg2.field1143;
                arg2.field1143 = -1;
            }
        }
        if (!arg2.field841) {
            return;
        }
        if (var4 == 127) {
            arg2.method1046(arg2.field827, arg2.field851);
            return;
        }
        byte var36;
        if (var4 == -1) {
            var36 = field1405[arg1];
        } else {
            var36 = var4;
        }
        arg2.method1045(arg2.field827, arg2.field851, var36);
    }

    @ObfuscatedName("ch.x(I)V")
    public static void method1832() {
        field1407 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1413[var0] = null;
            field1405[var0] = 1;
        }
    }
}
