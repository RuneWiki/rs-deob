package deob;

@ObfuscatedName("cd")
public class class84 {

    @ObfuscatedName("cd.m")
    public static byte[] field1209 = new byte[2048];

    @ObfuscatedName("cd.j")
    public static byte[] field1210 = new byte[2048];

    @ObfuscatedName("cd.g")
    public static class185[] field1219 = new class185[2048];

    @ObfuscatedName("cd.i")
    public static int field1212 = 0;

    @ObfuscatedName("cd.h")
    public static int[] field1211 = new int[2048];

    @ObfuscatedName("cd.l")
    public static int field1214 = 0;

    @ObfuscatedName("cd.d")
    public static int[] field1215 = new int[2048];

    @ObfuscatedName("cd.o")
    public static int[] field1216 = new int[2048];

    @ObfuscatedName("cd.s")
    public static int[] field1217 = new int[2048];

    @ObfuscatedName("cd.k")
    public static int[] field1218 = new int[2048];

    @ObfuscatedName("cd.v")
    public static int field1208 = 0;

    @ObfuscatedName("cd.p")
    public static int[] field1220 = new int[2048];

    @ObfuscatedName("cd.n")
    public static class185 field1221 = new class185(new byte[5000]);

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.c(Lgf;I)V")
    public static final void method975(class192 arg0) {
        arg0.method3508();
        int var1 = client.field860;
        class62 var2 = Statics.field241 = client.field758[var1] = new class62();
        var2.field630 = var1;
        int var3 = arg0.method3509(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field977[0] = var5 - Statics.field31;
        var2.field947 = (var2.field977[0] << 7) + (var2.method1036() << 6);
        var2.field975[0] = var6 - Statics.field1241;
        var2.field960 = (var2.field975[0] << 7) + (var2.method1036() << 6);
        Statics.field325 = var2.field627 = var4;
        if (field1219[var1] != null) {
            var2.method1029(field1219[var1]);
        }
        field1212 = 0;
        field1211[++field1212 - 1] = var1;
        field1209[var1] = 0;
        field1214 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3509(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1216[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1217[var7] = 0;
                field1218[var7] = -1;
                field1215[++field1214 - 1] = var7;
                field1209[var7] = 0;
            }
        }
        arg0.method3521();
    }

    @ObfuscatedName("au.q(Lgf;IB)V")
    public static final void method702(class192 arg0, int arg1) {
        int var2 = arg0.field2386;
        field1208 = 0;
        method157(arg0);
        method18(arg0);
        if (arg0.field2386 - var2 != arg1) {
            throw new RuntimeException(arg0.field2386 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("n.m(Lgf;I)V")
    public static final void method157(class192 arg0) {
        int var1 = 0;
        arg0.method3508();
        for (int var2 = 0; var2 < field1212; var2++) {
            int var3 = field1211[var2];
            if ((field1209[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1209[var3] = (byte) (field1209[var3] | 0x2);
                } else {
                    int var4 = arg0.method3509(1);
                    if (var4 == 0) {
                        var1 = method4795(arg0);
                        field1209[var3] = (byte) (field1209[var3] | 0x2);
                    } else {
                        method29(arg0, var3);
                    }
                }
            }
        }
        arg0.method3521();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3508();
        for (int var5 = 0; var5 < field1212; var5++) {
            int var6 = field1211[var5];
            if ((field1209[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1209[var6] = (byte) (field1209[var6] | 0x2);
                } else {
                    int var7 = arg0.method3509(1);
                    if (var7 == 0) {
                        var1 = method4795(arg0);
                        field1209[var6] = (byte) (field1209[var6] | 0x2);
                    } else {
                        method29(arg0, var6);
                    }
                }
            }
        }
        arg0.method3521();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3508();
        for (int var8 = 0; var8 < field1214; var8++) {
            int var9 = field1215[var8];
            if ((field1209[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1209[var9] = (byte) (field1209[var9] | 0x2);
                } else {
                    int var10 = arg0.method3509(1);
                    if (var10 == 0) {
                        var1 = method4795(arg0);
                        field1209[var9] = (byte) (field1209[var9] | 0x2);
                    } else if (method1452(arg0, var9)) {
                        field1209[var9] = (byte) (field1209[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3521();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3508();
        for (int var11 = 0; var11 < field1214; var11++) {
            int var12 = field1215[var11];
            if ((field1209[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1209[var12] = (byte) (field1209[var12] | 0x2);
                } else {
                    int var13 = arg0.method3509(1);
                    if (var13 == 0) {
                        var1 = method4795(arg0);
                        field1209[var12] = (byte) (field1209[var12] | 0x2);
                    } else if (method1452(arg0, var12)) {
                        field1209[var12] = (byte) (field1209[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3521();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1212 = 0;
        field1214 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1209[var14] = (byte) (field1209[var14] >> 1);
            class62 var15 = client.field758[var14];
            if (var15 == null) {
                field1215[++field1214 - 1] = var14;
            } else {
                field1211[++field1212 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("jt.j(Lgf;B)I")
    public static int method4795(class192 arg0) {
        int var1 = arg0.method3509(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3509(5);
        } else if (var1 == 2) {
            var2 = arg0.method3509(8);
        } else {
            var2 = arg0.method3509(11);
        }
        return var2;
    }

    @ObfuscatedName("m.g(Lgf;IS)V")
    public static void method29(class192 arg0, int arg1) {
        boolean var2 = arg0.method3509(1) == 1;
        if (var2) {
            field1220[++field1208 - 1] = arg1;
        }
        int var3 = arg0.method3509(2);
        class62 var4 = client.field758[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field616 = false;
            } else if (client.field860 == arg1) {
                throw new RuntimeException();
            } else {
                field1216[arg1] = (Statics.field1241 + var4.field975[0] >> 13) + (Statics.field31 + var4.field977[0] >> 13 << 14) + (var4.field627 << 28);
                if (var4.field959 == -1) {
                    field1217[arg1] = var4.field982;
                } else {
                    field1217[arg1] = var4.field959;
                }
                field1218[arg1] = var4.field944;
                client.field758[arg1] = null;
                if (arg0.method3509(1) != 0) {
                    method1452(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3509(3);
            int var6 = var4.field977[0];
            int var7 = var4.field975[0];
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
            if (client.field860 == arg1 && var4.field947 < 1536 || var4.field960 < 1536 || var4.field947 >= 11776 || var4.field960 >= 11776) {
                var4.method1039(var6, var7);
                var4.field616 = false;
            } else if (var2) {
                var4.field616 = true;
                var4.field634 = var6;
                var4.field635 = var7;
            } else {
                var4.field616 = false;
                var4.method1038(var6, var7, field1210[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3509(4);
            int var9 = var4.field977[0];
            int var10 = var4.field975[0];
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
            if (client.field860 == arg1 && var4.field947 < 1536 || var4.field960 < 1536 || var4.field947 >= 11776 || var4.field960 >= 11776) {
                var4.method1039(var9, var10);
                var4.field616 = false;
            } else if (var2) {
                var4.field616 = true;
                var4.field634 = var9;
                var4.field635 = var10;
            } else {
                var4.field616 = false;
                var4.method1038(var9, var10, field1210[arg1]);
            }
        } else {
            int var11 = arg0.method3509(1);
            if (var11 == 0) {
                int var12 = arg0.method3509(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field977[0] + var14;
                int var17 = var4.field975[0] + var15;
                if (client.field860 == arg1 && var4.field947 < 1536 || var4.field960 < 1536 || var4.field947 >= 11776 || var4.field960 >= 11776) {
                    var4.method1039(var16, var17);
                    var4.field616 = false;
                } else if (var2) {
                    var4.field616 = true;
                    var4.field634 = var16;
                    var4.field635 = var17;
                } else {
                    var4.field616 = false;
                    var4.method1038(var16, var17, field1210[arg1]);
                }
                var4.field627 = (byte) (var4.field627 + var13 & 0x3);
                if (client.field860 == arg1) {
                    Statics.field325 = var4.field627;
                }
            } else {
                int var18 = arg0.method3509(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field31 + var4.field977[0] + var20 & 0x3FFF) - Statics.field31;
                int var23 = (Statics.field1241 + var4.field975[0] + var21 & 0x3FFF) - Statics.field1241;
                if (client.field860 == arg1 && var4.field947 < 1536 || var4.field960 < 1536 || var4.field947 >= 11776 || var4.field960 >= 11776) {
                    var4.method1039(var22, var23);
                    var4.field616 = false;
                } else if (var2) {
                    var4.field616 = true;
                    var4.field634 = var22;
                    var4.field635 = var23;
                } else {
                    var4.field616 = false;
                    var4.method1038(var22, var23, field1210[arg1]);
                }
                var4.field627 = (byte) (var4.field627 + var19 & 0x3);
                if (client.field860 == arg1) {
                    Statics.field325 = var4.field627;
                }
            }
        }
    }

    @ObfuscatedName("bv.i(Lgf;II)Z")
    public static boolean method1452(class192 arg0, int arg1) {
        int var2 = arg0.method3509(2);
        if (var2 == 0) {
            if (arg0.method3509(1) != 0) {
                method1452(arg0, arg1);
            }
            int var3 = arg0.method3509(13);
            int var4 = arg0.method3509(13);
            boolean var5 = arg0.method3509(1) == 1;
            if (var5) {
                field1220[++field1208 - 1] = arg1;
            }
            if (client.field758[arg1] != null) {
                throw new RuntimeException();
            }
            class62 var6 = client.field758[arg1] = new class62();
            var6.field630 = arg1;
            if (field1219[arg1] != null) {
                var6.method1029(field1219[arg1]);
            }
            var6.field982 = field1217[arg1];
            var6.field944 = field1218[arg1];
            int var7 = field1216[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field988[0] = field1210[arg1];
            var6.field627 = (byte) var8;
            var6.method1039((var9 << 13) + var3 - Statics.field31, (var10 << 13) + var4 - Statics.field1241);
            var6.field616 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3509(2);
            int var12 = field1216[arg1];
            field1216[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3509(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1216[arg1];
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
            field1216[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3509(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1216[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1216[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("q.h(Lgf;I)V")
    public static final void method18(class192 arg0) {
        for (int var1 = 0; var1 < field1208; var1++) {
            int var2 = field1220[var1];
            class62 var3 = client.field758[var2];
            int var4 = arg0.method3243();
            if ((var4 & 0x10) != 0) {
                var4 += arg0.method3243() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x200) != 0) {
                for (int var6 = 0; var6 < 3; var6++) {
                    var3.field612[var6] = arg0.method3251();
                }
            }
            if ((var4 & 0x2) != 0) {
                int var7 = arg0.method3392();
                byte[] var8 = new byte[var7];
                class185 var9 = new class185(var8);
                arg0.method3292(var8, 0, var7);
                field1219[var2] = var9;
                var3.method1029(var9);
            }
            if ((var4 & 0x80) != 0) {
                int var10 = arg0.method3280();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg0.method3243();
                client.method891(var3, var10, var11);
            }
            if ((var4 & 0x40) != 0) {
                var3.field959 = arg0.method3404();
                if (var3.field985 == 0) {
                    var3.field982 = var3.field959;
                    var3.field959 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field944 = arg0.method3245();
                if (var3.field944 == 65535) {
                    var3.field944 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.field971 = arg0.method3245();
                int var12 = arg0.method3253();
                var3.field972 = var12 >> 16;
                var3.field957 = (var12 & 0xFFFF) + client.field654;
                var3.field969 = 0;
                var3.field966 = 0;
                if (var3.field957 > client.field654) {
                    var3.field969 = -1;
                }
                if (var3.field971 == 65535) {
                    var3.field971 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var13 = arg0.method3281();
                class245[] var14 = new class245[] { class245.field3153, class245.field3160, class245.field3150, class245.field3152, class245.field3155, class245.field3158 };
                class245 var15 = (class245) class180.method3951(var14, arg0.method3243());
                boolean var16 = arg0.method3273() == 1;
                int var17 = arg0.method3273();
                int var18 = arg0.field2386;
                if (var3.field633 != null && var3.field624 != null) {
                    boolean var19 = false;
                    if (var15.field3159 && Statics.field40.method1528(var3.field633)) {
                        var19 = true;
                    }
                    if (!var19 && client.field793 == 0 && !var3.field608) {
                        field1221.field2386 = 0;
                        arg0.method3293(field1221.field2388, 0, var17);
                        field1221.field2386 = 0;
                        class185 var20 = field1221;
                        String var24;
                        try {
                            int var21 = var20.method3256();
                            if (var21 > 32767) {
                                var21 = 32767;
                            }
                            byte[] var22 = new byte[var21];
                            var20.field2386 += Statics.field3754.method3163(var20.field2388, var20.field2386, var22, 0, var21);
                            String var23 = class304.method3475(var22, 0, var21);
                            var24 = var23;
                        } catch (Exception var47) {
                            var24 = "Cabbage";
                        }
                        String var27 = class302.method5147(class308.method3018(var24));
                        var3.field989 = var27.trim();
                        var3.field948 = var13 >> 8;
                        var3.field949 = var13 & 0xFF;
                        var3.field950 = 150;
                        var3.field945 = var16;
                        var3.field946 = Statics.field241 != var3 && var15.field3159 && client.field858 != "" && var27.toLowerCase().indexOf(client.field858) == -1;
                        int var28;
                        if (var15.field3154) {
                            var28 = var16 ? 91 : 1;
                        } else {
                            var28 = var16 ? 90 : 2;
                        }
                        if (var15.field3157 == -1) {
                            class86.method1671(var28, var3.field633.method5075(), var27);
                        } else {
                            int var30 = var15.field3157;
                            String var31 = "<img=" + var30 + ">";
                            class86.method1671(var28, var31 + var3.field633.method5075(), var27);
                        }
                    }
                }
                arg0.field2386 = var17 + var18;
            }
            if ((var4 & 0x8) != 0) {
                int var32 = arg0.method3273();
                if (var32 > 0) {
                    for (int var33 = 0; var33 < var32; var33++) {
                        int var34 = -1;
                        int var35 = -1;
                        int var36 = -1;
                        int var37 = arg0.method3256();
                        if (var37 == 32767) {
                            var37 = arg0.method3256();
                            var35 = arg0.method3256();
                            var34 = arg0.method3256();
                            var36 = arg0.method3256();
                        } else if (var37 == 32766) {
                            var37 = -1;
                        } else {
                            var35 = arg0.method3256();
                        }
                        int var38 = arg0.method3256();
                        var3.method1460(var37, var35, var34, var36, client.field654, var38);
                    }
                }
                int var39 = arg0.method3271();
                if (var39 > 0) {
                    for (int var40 = 0; var40 < var39; var40++) {
                        int var41 = arg0.method3256();
                        int var42 = arg0.method3256();
                        if (var42 == 32767) {
                            var3.method1458(var41);
                        } else {
                            int var43 = arg0.method3256();
                            int var44 = arg0.method3271();
                            int var45 = var42 > 0 ? arg0.method3243() : var44;
                            var3.method1457(var41, client.field654, var42, var43, var44, var45);
                        }
                    }
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field973 = arg0.method3276();
                var3.field968 = arg0.method3244();
                var3.field974 = arg0.method3274();
                var3.field935 = arg0.method3244();
                var3.field965 = arg0.method3404() + client.field654;
                var3.field978 = arg0.method3281() + client.field654;
                var3.field936 = arg0.method3404();
                if (var3.field616) {
                    var3.field973 += var3.field634;
                    var3.field968 += var3.field635;
                    var3.field974 += var3.field634;
                    var3.field935 += var3.field635;
                    var3.field985 = 0;
                } else {
                    var3.field973 += var3.field977[0];
                    var3.field968 += var3.field975[0];
                    var3.field974 += var3.field977[0];
                    var3.field935 += var3.field975[0];
                    var3.field985 = 1;
                }
                var3.field990 = 0;
            }
            if ((var4 & 0x20) != 0) {
                var3.field989 = arg0.method3251();
                if (var3.field989.charAt(0) == '~') {
                    var3.field989 = var3.field989.substring(1);
                    class86.method1671(2, var3.field633.method5075(), var3.field989);
                } else if (Statics.field241 == var3) {
                    class86.method1671(2, var3.field633.method5075(), var3.field989);
                }
                var3.field945 = false;
                var3.field948 = 0;
                var3.field949 = 0;
                var3.field950 = 150;
            }
            if ((var4 & 0x100) != 0) {
                field1210[var2] = arg0.method3275();
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method3274();
            }
            if (var3.field616) {
                if (var5 == 127) {
                    var3.method1039(var3.field634, var3.field635);
                } else {
                    byte var46;
                    if (var5 == -1) {
                        var46 = field1210[var2];
                    } else {
                        var46 = var5;
                    }
                    var3.method1038(var3.field634, var3.field635, var46);
                }
            }
        }
    }

    @ObfuscatedName("s.l(I)V")
    public static void method122() {
        field1212 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1219[var0] = null;
            field1210[var0] = 1;
        }
    }
}
