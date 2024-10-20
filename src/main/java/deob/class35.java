package deob;

@ObfuscatedName("ao")
public class class35 {

    @ObfuscatedName("ao.j")
    public static byte[] field758 = new byte[2048];

    @ObfuscatedName("ao.z")
    public static byte[] field759 = new byte[2048];

    @ObfuscatedName("ao.i")
    public static class123[] field760 = new class123[2048];

    @ObfuscatedName("ao.b")
    public static int field761 = 0;

    @ObfuscatedName("ao.l")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("ao.m")
    public static int field765 = 0;

    @ObfuscatedName("ao.p")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("ao.f")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("ao.d")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("ao.v")
    public static int[] field767 = new int[2048];

    @ObfuscatedName("ao.q")
    public static int field763 = 0;

    @ObfuscatedName("ao.t")
    public static int[] field772 = new int[2048];

    @ObfuscatedName("ao.g")
    public static class123 field770 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.x(Ldg;B)V")
    public static final void method2111(class126 arg0) {
        arg0.method2676();
        int var1 = client.field404;
        class3 var2 = Statics.field1067 = client.field510[var1] = new class3();
        var2.field49 = var1;
        int var3 = arg0.method2679(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field873[0] = var5 - Statics.field676;
        var2.field852 = (var2.field873[0] << 7) + (var2.method28() << 6);
        var2.field874[0] = var6 - Statics.field2366;
        var2.field869 = (var2.field874[0] << 7) + (var2.method28() << 6);
        Statics.field1819 = var2.field48 = var4;
        if (field760[var1] != null) {
            var2.method20(field760[var1]);
        }
        field761 = 0;
        field756[++field761 - 1] = var1;
        field758[var1] = 0;
        field765 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2679(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field762[var7] = (var9 << 28) + (var10 << 14) + var11;
                field766[var7] = 0;
                field767[var7] = -1;
                field764[++field765 - 1] = var7;
                field758[var7] = 0;
            }
        }
        arg0.method2674();
    }

    @ObfuscatedName("g.r(Ldg;II)V")
    public static final void method163(class126 arg0, int arg1) {
        int var2 = arg0.field2057;
        field763 = 0;
        int var3 = 0;
        arg0.method2676();
        for (int var4 = 0; var4 < field761; var4++) {
            int var5 = field756[var4];
            if ((field758[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field758[var5] = (byte) (field758[var5] | 0x2);
                } else {
                    int var6 = arg0.method2679(1);
                    if (var6 == 0) {
                        var3 = method640(arg0);
                        field758[var5] = (byte) (field758[var5] | 0x2);
                    } else {
                        method121(arg0, var5);
                    }
                }
            }
        }
        arg0.method2674();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2676();
        for (int var7 = 0; var7 < field761; var7++) {
            int var8 = field756[var7];
            if ((field758[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field758[var8] = (byte) (field758[var8] | 0x2);
                } else {
                    int var9 = arg0.method2679(1);
                    if (var9 == 0) {
                        var3 = method640(arg0);
                        field758[var8] = (byte) (field758[var8] | 0x2);
                    } else {
                        method121(arg0, var8);
                    }
                }
            }
        }
        arg0.method2674();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2676();
        for (int var10 = 0; var10 < field765; var10++) {
            int var11 = field764[var10];
            if ((field758[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field758[var11] = (byte) (field758[var11] | 0x2);
                } else {
                    int var12 = arg0.method2679(1);
                    if (var12 == 0) {
                        var3 = method640(arg0);
                        field758[var11] = (byte) (field758[var11] | 0x2);
                    } else if (method638(arg0, var11)) {
                        field758[var11] = (byte) (field758[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2674();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2676();
        for (int var13 = 0; var13 < field765; var13++) {
            int var14 = field764[var13];
            if ((field758[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field758[var14] = (byte) (field758[var14] | 0x2);
                } else {
                    int var15 = arg0.method2679(1);
                    if (var15 == 0) {
                        var3 = method640(arg0);
                        field758[var14] = (byte) (field758[var14] | 0x2);
                    } else if (method638(arg0, var14)) {
                        field758[var14] = (byte) (field758[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2674();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field761 = 0;
        field765 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field758[var16] = (byte) (field758[var16] >> 1);
            class3 var17 = client.field510[var16];
            if (var17 == null) {
                field764[++field765 - 1] = var16;
            } else {
                field756[++field761 - 1] = var16;
            }
        }
        method2096(arg0);
        if (arg0.field2057 - var2 != arg1) {
            throw new RuntimeException(arg0.field2057 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("as.j(Ldg;I)I")
    public static int method640(class126 arg0) {
        int var1 = arg0.method2679(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2679(5);
        } else if (var1 == 2) {
            var2 = arg0.method2679(8);
        } else {
            var2 = arg0.method2679(11);
        }
        return var2;
    }

    @ObfuscatedName("d.z(Ldg;II)V")
    public static void method121(class126 arg0, int arg1) {
        boolean var2 = arg0.method2679(1) == 1;
        if (var2) {
            field772[++field763 - 1] = arg1;
        }
        int var3 = arg0.method2679(2);
        class3 var4 = client.field510[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field50 = false;
            } else if (client.field404 == arg1) {
                throw new RuntimeException();
            } else {
                field762[arg1] = (Statics.field2366 + var4.field874[0] >> 6) + (Statics.field676 + var4.field873[0] >> 6 << 14) + (var4.field48 << 28);
                if (var4.field846 == -1) {
                    field766[arg1] = var4.field836;
                } else {
                    field766[arg1] = var4.field846;
                }
                field767[arg1] = var4.field844;
                client.field510[arg1] = null;
                if (arg0.method2679(1) != 0) {
                    method638(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2679(3);
            int var6 = var4.field873[0];
            int var7 = var4.field874[0];
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
            if (client.field404 == arg1 && var4.field852 < 1536 || var4.field869 < 1536 || var4.field852 >= 11776 || var4.field869 >= 11776) {
                var4.method37(var6, var7);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field51 = var6;
                var4.field27 = var7;
            } else {
                var4.field50 = false;
                var4.method18(var6, var7, field759[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2679(4);
            int var9 = var4.field873[0];
            int var10 = var4.field874[0];
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
            if (client.field404 == arg1 && var4.field852 < 1536 || var4.field869 < 1536 || var4.field852 >= 11776 || var4.field869 >= 11776) {
                var4.method37(var9, var10);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field51 = var9;
                var4.field27 = var10;
            } else {
                var4.field50 = false;
                var4.method18(var9, var10, field759[arg1]);
            }
        } else {
            int var11 = arg0.method2679(1);
            if (var11 == 0) {
                int var12 = arg0.method2679(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field873[0] + var14;
                int var17 = var4.field874[0] + var15;
                if (client.field404 == arg1 && var4.field852 < 1536 || var4.field869 < 1536 || var4.field852 >= 11776 || var4.field869 >= 11776) {
                    var4.method37(var16, var17);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field51 = var16;
                    var4.field27 = var17;
                } else {
                    var4.field50 = false;
                    var4.method18(var16, var17, field759[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var13 & 0x3);
                if (client.field404 == arg1) {
                    Statics.field1819 = var4.field48;
                }
            } else {
                int var18 = arg0.method2679(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field676 + var4.field873[0] + var20 & 0x3FFF) - Statics.field676;
                int var23 = (Statics.field2366 + var4.field874[0] + var21 & 0x3FFF) - Statics.field2366;
                if (client.field404 == arg1 && var4.field852 < 1536 || var4.field869 < 1536 || var4.field852 >= 11776 || var4.field869 >= 11776) {
                    var4.method37(var22, var23);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field51 = var22;
                    var4.field27 = var23;
                } else {
                    var4.field50 = false;
                    var4.method18(var22, var23, field759[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var19 & 0x3);
                if (client.field404 == arg1) {
                    Statics.field1819 = var4.field48;
                }
            }
        }
    }

    @ObfuscatedName("as.i(Ldg;IB)Z")
    public static boolean method638(class126 arg0, int arg1) {
        int var2 = arg0.method2679(2);
        if (var2 == 0) {
            if (arg0.method2679(1) != 0) {
                method638(arg0, arg1);
            }
            int var3 = arg0.method2679(6);
            int var4 = arg0.method2679(6);
            boolean var5 = arg0.method2679(1) == 1;
            if (var5) {
                field772[++field763 - 1] = arg1;
            }
            if (client.field510[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field510[arg1] = new class3();
            var6.field49 = arg1;
            if (field760[arg1] != null) {
                var6.method20(field760[arg1]);
            }
            var6.field836 = field766[arg1];
            var6.field844 = field767[arg1];
            int var7 = field762[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field831[0] = field759[arg1];
            var6.field48 = (byte) var8;
            var6.method37((var9 << 6) + var3 - Statics.field676, (var10 << 6) + var4 - Statics.field2366);
            var6.field50 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2679(2);
            int var12 = field762[arg1];
            field762[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2679(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field762[arg1];
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
            field762[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2679(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field762[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field762[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cu.b(Ldg;I)V")
    public static final void method2096(class126 arg0) {
        for (int var1 = 0; var1 < field763; var1++) {
            int var2 = field772[var1];
            class3 var3 = client.field510[var2];
            int var4 = arg0.method2408();
            if ((var4 & 0x10) != 0) {
                var4 += arg0.method2408() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x2) != 0) {
                int var6 = arg0.method2408();
                byte[] var7 = new byte[var6];
                class123 var8 = new class123(var7);
                arg0.method2419(var7, 0, var6);
                field760[var2] = var8;
                var3.method20(var8);
            }
            if ((var4 & 0x20) != 0) {
                int var9 = arg0.method2403();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2408();
                client.method1822(var3, var9, var10);
            }
            if ((var4 & 0x8) != 0) {
                var3.field844 = arg0.method2403();
                if (var3.field844 == 65535) {
                    var3.field844 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field867 = arg0.method2626();
                if (var3.field867.charAt(0) == '~') {
                    var3.field867 = var3.field867.substring(1);
                    class12.method558(2, var3.field28, var3.field867);
                } else if (Statics.field1067 == var3) {
                    class12.method558(2, var3.field28, var3.field867);
                }
                var3.field829 = false;
                var3.field835 = 0;
                var3.field863 = 0;
                var3.field839 = 150;
            }
            if ((var4 & 0x80) != 0) {
                int var11 = arg0.method2408();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2421();
                        if (var16 == 32767) {
                            var16 = arg0.method2421();
                            var14 = arg0.method2421();
                            var13 = arg0.method2421();
                            var15 = arg0.method2421();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2421();
                        }
                        int var17 = arg0.method2421();
                        var3.method725(var16, var14, var13, var15, client.field291, var17);
                    }
                }
                int var18 = arg0.method2408();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2421();
                        int var21 = arg0.method2421();
                        if (var21 == 32767) {
                            var3.method727(var20);
                        } else {
                            int var22 = arg0.method2421();
                            int var23 = arg0.method2408();
                            int var24 = var21 > 0 ? arg0.method2408() : var23;
                            var3.method726(var20, client.field291, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field846 = arg0.method2403();
                if (var3.field872 == 0) {
                    var3.field836 = var3.field846;
                    var3.field846 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var25 = arg0.method2403();
                class156[] var26 = new class156[] { class156.field2313, class156.field2315, class156.field2314, class156.field2312, class156.field2321 };
                class156 var27 = (class156) class113.method99(var26, arg0.method2408());
                boolean var28 = arg0.method2408() == 1;
                int var29 = arg0.method2408();
                int var30 = arg0.field2057;
                if (var3.field28 != null && var3.field34 != null) {
                    boolean var31 = false;
                    if (var27.field2317 && client.method2813(var3.field28)) {
                        var31 = true;
                    }
                    if (!var31 && client.field305 == 0 && !var3.field30) {
                        field770.field2057 = 0;
                        arg0.method2419(field770.field2056, 0, var29);
                        field770.field2057 = 0;
                        class123 var32 = field770;
                        String var36;
                        try {
                            int var33 = var32.method2421();
                            if (var33 > 32767) {
                                var33 = 32767;
                            }
                            byte[] var34 = new byte[var33];
                            var32.field2057 += Statics.field3233.method2347(var32.field2056, var32.field2057, var34, 0, var33);
                            String var35 = class169.method162(var34, 0, var33);
                            var36 = var35;
                        } catch (Exception var47) {
                            var36 = "Cabbage";
                        }
                        String var39 = class227.method3832(class167.method578(var36));
                        var3.field867 = var39.trim();
                        var3.field835 = var25 >> 8;
                        var3.field863 = var25 & 0xFF;
                        var3.field839 = 150;
                        var3.field829 = var28;
                        var3.field833 = Statics.field1067 != var3 && var27.field2317 && client.field500 != "" && var39.toLowerCase().indexOf(client.field500) == -1;
                        int var40;
                        if (var27.field2318) {
                            var40 = var28 ? 91 : 1;
                        } else {
                            var40 = var28 ? 90 : 2;
                        }
                        if (var27.field2311 == -1) {
                            class12.method558(var40, var3.field28, var39);
                        } else {
                            int var42 = var27.field2311;
                            String var43 = "<img=" + var42 + ">";
                            class12.method558(var40, var43 + var3.field28, var39);
                        }
                    }
                }
                arg0.field2057 = var29 + var30;
            }
            if ((var4 & 0x200) != 0) {
                var3.field855 = arg0.method2403();
                int var44 = arg0.method2413();
                var3.field859 = var44 >> 16;
                var3.field858 = (var44 & 0xFFFF) + client.field291;
                var3.field856 = 0;
                var3.field857 = 0;
                if (var3.field858 > client.field291) {
                    var3.field856 = -1;
                }
                if (var3.field855 == 65535) {
                    var3.field855 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field824 = arg0.method2409();
                var3.field862 = arg0.method2409();
                var3.field861 = arg0.method2409();
                var3.field875 = arg0.method2409();
                var3.field864 = arg0.method2403() + client.field291;
                var3.field865 = arg0.method2403() + client.field291;
                var3.field866 = arg0.method2403();
                if (var3.field50) {
                    var3.field824 += var3.field51;
                    var3.field862 += var3.field27;
                    var3.field861 += var3.field51;
                    var3.field875 += var3.field27;
                    var3.field872 = 0;
                } else {
                    var3.field824 += var3.field873[0];
                    var3.field862 += var3.field874[0];
                    var3.field861 += var3.field873[0];
                    var3.field875 += var3.field874[0];
                    var3.field872 = 1;
                }
                var3.field823 = 0;
            }
            if ((var4 & 0x1000) != 0) {
                field759[var2] = arg0.method2409();
            }
            if ((var4 & 0x100) != 0) {
                var5 = arg0.method2409();
            }
            if ((var4 & 0x800) != 0) {
                for (int var45 = 0; var45 < 3; var45++) {
                    var3.field47[var45] = arg0.method2626();
                }
            }
            if (var3.field50) {
                if (var5 == 127) {
                    var3.method37(var3.field51, var3.field27);
                } else {
                    byte var46;
                    if (var5 == -1) {
                        var46 = field759[var2];
                    } else {
                        var46 = var5;
                    }
                    var3.method18(var3.field51, var3.field27, var46);
                }
            }
        }
    }
}
