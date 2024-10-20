package deob;

@ObfuscatedName("cr")
public class class84 {

    @ObfuscatedName("cr.e")
    public static byte[] field1224 = new byte[2048];

    @ObfuscatedName("cr.q")
    public static byte[] field1225 = new byte[2048];

    @ObfuscatedName("cr.c")
    public static class185[] field1234 = new class185[2048];

    @ObfuscatedName("cr.l")
    public static int field1227 = 0;

    @ObfuscatedName("cr.b")
    public static int[] field1223 = new int[2048];

    @ObfuscatedName("cr.w")
    public static int field1229 = 0;

    @ObfuscatedName("cr.n")
    public static int[] field1226 = new int[2048];

    @ObfuscatedName("cr.i")
    public static int[] field1231 = new int[2048];

    @ObfuscatedName("cr.p")
    public static int[] field1232 = new int[2048];

    @ObfuscatedName("cr.m")
    public static int[] field1233 = new int[2048];

    @ObfuscatedName("cr.d")
    public static int field1228 = 0;

    @ObfuscatedName("cr.j")
    public static int[] field1235 = new int[2048];

    @ObfuscatedName("cr.x")
    public static class185 field1236 = new class185(new byte[5000]);

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jx.g(Lge;I)V")
    public static final void method4701(class192 arg0) {
        arg0.method3737();
        int var1 = client.field748;
        class62 var2 = Statics.field1064 = client.field699[var1] = new class62();
        var2.field629 = var1;
        int var3 = arg0.method3733(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field995[0] = var5 - Statics.field491;
        var2.field954 = (var2.field995[0] << 7) + (var2.method1099() << 6);
        var2.field953[0] = var6 - Statics.field92;
        var2.field1000 = (var2.field953[0] << 7) + (var2.method1099() << 6);
        Statics.field600 = var2.field621 = var4;
        if (field1234[var1] != null) {
            var2.method1093(field1234[var1]);
        }
        field1227 = 0;
        field1223[++field1227 - 1] = var1;
        field1224[var1] = 0;
        field1229 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3733(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1231[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1232[var7] = 0;
                field1233[var7] = -1;
                field1226[++field1229 - 1] = var7;
                field1224[var7] = 0;
            }
        }
        arg0.method3734();
    }

    @ObfuscatedName("p.e(Lge;I)V")
    public static final void method116(class192 arg0) {
        int var1 = 0;
        arg0.method3737();
        for (int var2 = 0; var2 < field1227; var2++) {
            int var3 = field1223[var2];
            if ((field1224[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1224[var3] = (byte) (field1224[var3] | 0x2);
                } else {
                    int var4 = arg0.method3733(1);
                    if (var4 == 0) {
                        var1 = method314(arg0);
                        field1224[var3] = (byte) (field1224[var3] | 0x2);
                    } else {
                        method3366(arg0, var3);
                    }
                }
            }
        }
        arg0.method3734();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3737();
        for (int var5 = 0; var5 < field1227; var5++) {
            int var6 = field1223[var5];
            if ((field1224[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1224[var6] = (byte) (field1224[var6] | 0x2);
                } else {
                    int var7 = arg0.method3733(1);
                    if (var7 == 0) {
                        var1 = method314(arg0);
                        field1224[var6] = (byte) (field1224[var6] | 0x2);
                    } else {
                        method3366(arg0, var6);
                    }
                }
            }
        }
        arg0.method3734();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3737();
        for (int var8 = 0; var8 < field1229; var8++) {
            int var9 = field1226[var8];
            if ((field1224[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1224[var9] = (byte) (field1224[var9] | 0x2);
                } else {
                    int var10 = arg0.method3733(1);
                    if (var10 == 0) {
                        var1 = method314(arg0);
                        field1224[var9] = (byte) (field1224[var9] | 0x2);
                    } else if (method2032(arg0, var9)) {
                        field1224[var9] = (byte) (field1224[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3734();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3737();
        for (int var11 = 0; var11 < field1229; var11++) {
            int var12 = field1226[var11];
            if ((field1224[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1224[var12] = (byte) (field1224[var12] | 0x2);
                } else {
                    int var13 = arg0.method3733(1);
                    if (var13 == 0) {
                        var1 = method314(arg0);
                        field1224[var12] = (byte) (field1224[var12] | 0x2);
                    } else if (method2032(arg0, var12)) {
                        field1224[var12] = (byte) (field1224[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3734();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1227 = 0;
        field1229 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1224[var14] = (byte) (field1224[var14] >> 1);
            class62 var15 = client.field699[var14];
            if (var15 == null) {
                field1226[++field1229 - 1] = var14;
            } else {
                field1223[++field1227 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("s.q(Lge;S)I")
    public static int method314(class192 arg0) {
        int var1 = arg0.method3733(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3733(5);
        } else if (var1 == 2) {
            var2 = arg0.method3733(8);
        } else {
            var2 = arg0.method3733(11);
        }
        return var2;
    }

    @ObfuscatedName("fm.c(Lge;IB)V")
    public static void method3366(class192 arg0, int arg1) {
        boolean var2 = arg0.method3733(1) == 1;
        if (var2) {
            field1235[++field1228 - 1] = arg1;
        }
        int var3 = arg0.method3733(2);
        class62 var4 = client.field699[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field632 = false;
            } else if (client.field748 == arg1) {
                throw new RuntimeException();
            } else {
                field1231[arg1] = (Statics.field92 + var4.field953[0] >> 13) + (Statics.field491 + var4.field995[0] >> 13 << 14) + (var4.field621 << 28);
                if (var4.field968 == -1) {
                    field1232[arg1] = var4.field991;
                } else {
                    field1232[arg1] = var4.field968;
                }
                field1233[arg1] = var4.field966;
                client.field699[arg1] = null;
                if (arg0.method3733(1) != 0) {
                    method2032(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3733(3);
            int var6 = var4.field995[0];
            int var7 = var4.field953[0];
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
            if (client.field748 == arg1 && var4.field954 < 1536 || var4.field1000 < 1536 || var4.field954 >= 11776 || var4.field1000 >= 11776) {
                var4.method1131(var6, var7);
                var4.field632 = false;
            } else if (var2) {
                var4.field632 = true;
                var4.field633 = var6;
                var4.field634 = var7;
            } else {
                var4.field632 = false;
                var4.method1101(var6, var7, field1225[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3733(4);
            int var9 = var4.field995[0];
            int var10 = var4.field953[0];
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
            if (client.field748 == arg1 && var4.field954 < 1536 || var4.field1000 < 1536 || var4.field954 >= 11776 || var4.field1000 >= 11776) {
                var4.method1131(var9, var10);
                var4.field632 = false;
            } else if (var2) {
                var4.field632 = true;
                var4.field633 = var9;
                var4.field634 = var10;
            } else {
                var4.field632 = false;
                var4.method1101(var9, var10, field1225[arg1]);
            }
        } else {
            int var11 = arg0.method3733(1);
            if (var11 == 0) {
                int var12 = arg0.method3733(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field995[0] + var14;
                int var17 = var4.field953[0] + var15;
                if (client.field748 == arg1 && var4.field954 < 1536 || var4.field1000 < 1536 || var4.field954 >= 11776 || var4.field1000 >= 11776) {
                    var4.method1131(var16, var17);
                    var4.field632 = false;
                } else if (var2) {
                    var4.field632 = true;
                    var4.field633 = var16;
                    var4.field634 = var17;
                } else {
                    var4.field632 = false;
                    var4.method1101(var16, var17, field1225[arg1]);
                }
                var4.field621 = (byte) (var4.field621 + var13 & 0x3);
                if (client.field748 == arg1) {
                    Statics.field600 = var4.field621;
                }
            } else {
                int var18 = arg0.method3733(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field491 + var4.field995[0] + var20 & 0x3FFF) - Statics.field491;
                int var23 = (Statics.field92 + var4.field953[0] + var21 & 0x3FFF) - Statics.field92;
                if (client.field748 == arg1 && var4.field954 < 1536 || var4.field1000 < 1536 || var4.field954 >= 11776 || var4.field1000 >= 11776) {
                    var4.method1131(var22, var23);
                    var4.field632 = false;
                } else if (var2) {
                    var4.field632 = true;
                    var4.field633 = var22;
                    var4.field634 = var23;
                } else {
                    var4.field632 = false;
                    var4.method1101(var22, var23, field1225[arg1]);
                }
                var4.field621 = (byte) (var4.field621 + var19 & 0x3);
                if (client.field748 == arg1) {
                    Statics.field600 = var4.field621;
                }
            }
        }
    }

    @ObfuscatedName("cx.i(Lge;II)Z")
    public static boolean method2032(class192 arg0, int arg1) {
        int var2 = arg0.method3733(2);
        if (var2 == 0) {
            if (arg0.method3733(1) != 0) {
                method2032(arg0, arg1);
            }
            int var3 = arg0.method3733(13);
            int var4 = arg0.method3733(13);
            boolean var5 = arg0.method3733(1) == 1;
            if (var5) {
                field1235[++field1228 - 1] = arg1;
            }
            if (client.field699[arg1] != null) {
                throw new RuntimeException();
            }
            class62 var6 = client.field699[arg1] = new class62();
            var6.field629 = arg1;
            if (field1234[arg1] != null) {
                var6.method1093(field1234[arg1]);
            }
            var6.field991 = field1232[arg1];
            var6.field966 = field1233[arg1];
            int var7 = field1231[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field997[0] = field1225[arg1];
            var6.field621 = (byte) var8;
            var6.method1131((var9 << 13) + var3 - Statics.field491, (var10 << 13) + var4 - Statics.field92);
            var6.field632 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3733(2);
            int var12 = field1231[arg1];
            field1231[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3733(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1231[arg1];
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
            field1231[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3733(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1231[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1231[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ep.p(Lge;I)V")
    public static final void method3173(class192 arg0) {
        for (int var1 = 0; var1 < field1228; var1++) {
            int var2 = field1235[var1];
            class62 var3 = client.field699[var2];
            int var4 = arg0.method3679();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method3679() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x40) != 0) {
                int var6 = arg0.method3579();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg0.method3479();
                        if (var11 == 32767) {
                            var11 = arg0.method3479();
                            var9 = arg0.method3479();
                            var8 = arg0.method3479();
                            var10 = arg0.method3479();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg0.method3479();
                        }
                        int var12 = arg0.method3479();
                        var3.method1568(var11, var9, var8, var10, client.field656, var12);
                    }
                }
                int var13 = arg0.method3495();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg0.method3479();
                        int var16 = arg0.method3479();
                        if (var16 == 32767) {
                            var3.method1561(var15);
                        } else {
                            int var17 = arg0.method3479();
                            int var18 = arg0.method3579();
                            int var19 = var16 > 0 ? arg0.method3679() : var18;
                            var3.method1570(var15, client.field656, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field977 = arg0.method3488();
                int var20 = arg0.method3660();
                var3.field981 = var20 >> 16;
                var3.field980 = (var20 & 0xFFFF) + client.field656;
                var3.field994 = 0;
                var3.field979 = 0;
                if (var3.field980 > client.field656) {
                    var3.field994 = -1;
                }
                if (var3.field977 == 65535) {
                    var3.field977 = -1;
                }
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method3664();
            }
            if ((var4 & 0x400) != 0) {
                var3.field984 = arg0.method3499();
                var3.field996 = arg0.method3664();
                var3.field983 = arg0.method3664();
                var3.field985 = arg0.method3499();
                var3.field986 = arg0.method3504() + client.field656;
                var3.field978 = arg0.method3503() + client.field656;
                var3.field998 = arg0.method3467();
                if (var3.field632) {
                    var3.field984 += var3.field633;
                    var3.field996 += var3.field634;
                    var3.field983 += var3.field633;
                    var3.field985 += var3.field634;
                    var3.field940 = 0;
                } else {
                    var3.field984 += var3.field995[0];
                    var3.field996 += var3.field953[0];
                    var3.field983 += var3.field995[0];
                    var3.field985 += var3.field953[0];
                    var3.field940 = 1;
                }
                var3.field960 = 0;
            }
            if ((var4 & 0x20) != 0) {
                var3.field969 = arg0.method3474();
                if (var3.field969.charAt(0) == '~') {
                    var3.field969 = var3.field969.substring(1);
                    class86.method1084(2, var3.field626.method5269(), var3.field969);
                } else if (Statics.field1064 == var3) {
                    class86.method1084(2, var3.field626.method5269(), var3.field969);
                }
                var3.field959 = false;
                var3.field957 = 0;
                var3.field975 = 0;
                var3.field982 = 150;
            }
            if ((var4 & 0x4) != 0) {
                var3.field968 = arg0.method3503();
                if (var3.field940 == 0) {
                    var3.field991 = var3.field968;
                    var3.field968 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var21 = arg0.method3587();
                byte[] var22 = new byte[var21];
                class185 var23 = new class185(var22);
                arg0.method3615(var22, 0, var21);
                field1234[var2] = var23;
                var3.method1093(var23);
            }
            if ((var4 & 0x2) != 0) {
                var3.field966 = arg0.method3504();
                if (var3.field966 == 65535) {
                    var3.field966 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                field1225[var2] = arg0.method3664();
            }
            if ((var4 & 0x10) != 0) {
                int var24 = arg0.method3504();
                class245 var25 = (class245) class180.method712(class245.method81(), arg0.method3679());
                boolean var26 = arg0.method3495() == 1;
                int var27 = arg0.method3679();
                int var28 = arg0.field2406;
                if (var3.field626 != null && var3.field631 != null) {
                    boolean var29 = false;
                    if (var25.field3191 && Statics.field2151.method1696(var3.field626)) {
                        var29 = true;
                    }
                    if (!var29 && client.field681 == 0 && !var3.field627) {
                        field1236.field2406 = 0;
                        arg0.method3477(field1236.field2405, 0, var27);
                        field1236.field2406 = 0;
                        String var30 = class302.method5347(class308.method4407(class303.method313(field1236)));
                        var3.field969 = var30.trim();
                        var3.field957 = var24 >> 8;
                        var3.field975 = var24 & 0xFF;
                        var3.field982 = 150;
                        var3.field959 = var26;
                        var3.field955 = Statics.field1064 != var3 && var25.field3191 && client.field863 != "" && var30.toLowerCase().indexOf(client.field863) == -1;
                        int var31;
                        if (var25.field3189) {
                            var31 = var26 ? 91 : 1;
                        } else {
                            var31 = var26 ? 90 : 2;
                        }
                        if (var25.field3186 == -1) {
                            class86.method1084(var31, var3.field626.method5269(), var30);
                        } else {
                            class86.method1084(var31, class76.method224(var25.field3186) + var3.field626.method5269(), var30);
                        }
                    }
                }
                arg0.field2406 = var27 + var28;
            }
            if ((var4 & 0x100) != 0) {
                for (int var32 = 0; var32 < 3; var32++) {
                    var3.field628[var32] = arg0.method3474();
                }
            }
            if ((var4 & 0x80) != 0) {
                int var33 = arg0.method3467();
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = arg0.method3679();
                client.method558(var3, var33, var34);
            }
            if (var3.field632) {
                if (var5 == 127) {
                    var3.method1131(var3.field633, var3.field634);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field1225[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method1101(var3.field633, var3.field634, var35);
                }
            }
        }
    }

    @ObfuscatedName("bb.m(I)V")
    public static void method1154() {
        field1227 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1234[var0] = null;
            field1225[var0] = 1;
        }
    }
}
