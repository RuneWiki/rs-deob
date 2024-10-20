package deob;

@ObfuscatedName("ae")
public class class46 {

    @ObfuscatedName("ae.o")
    public static byte[] field899 = new byte[2048];

    @ObfuscatedName("ae.r")
    public static byte[] field900 = new byte[2048];

    @ObfuscatedName("ae.w")
    public static class161[] field901 = new class161[2048];

    @ObfuscatedName("ae.j")
    public static int field902 = 0;

    @ObfuscatedName("ae.q")
    public static int[] field903 = new int[2048];

    @ObfuscatedName("ae.d")
    public static int field904 = 0;

    @ObfuscatedName("ae.n")
    public static int[] field906 = new int[2048];

    @ObfuscatedName("ae.c")
    public static int[] field912 = new int[2048];

    @ObfuscatedName("ae.s")
    public static int[] field907 = new int[2048];

    @ObfuscatedName("ae.g")
    public static int[] field908 = new int[2048];

    @ObfuscatedName("ae.i")
    public static int field909 = 0;

    @ObfuscatedName("ae.v")
    public static int[] field910 = new int[2048];

    @ObfuscatedName("ae.a")
    public static class161 field913 = new class161(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.k(Lft;I)V")
    public static final void method622(class167 arg0) {
        arg0.method2973();
        int var1 = client.field473;
        class24 var2 = Statics.field1425 = client.field399[var1] = new class24();
        var2.field257 = var1;
        int var3 = arg0.method2974(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field629[0] = var5 - Statics.field1792;
        var2.field619 = (var2.field629[0] << 7) + (var2.method237() << 6);
        var2.field641[0] = var6 - Statics.field663;
        var2.field609 = (var2.field641[0] << 7) + (var2.method237() << 6);
        Statics.field937 = var2.field264 = var4;
        if (field901[var1] != null) {
            var2.method236(field901[var1]);
        }
        field902 = 0;
        field903[++field902 - 1] = var1;
        field899[var1] = 0;
        field904 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2974(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field912[var7] = (var9 << 28) + (var10 << 14) + var11;
                field907[var7] = 0;
                field908[var7] = -1;
                field906[++field904 - 1] = var7;
                field899[var7] = 0;
            }
        }
        arg0.method2975();
    }

    @ObfuscatedName("ay.y(Lft;II)V")
    public static final void method747(class167 arg0, int arg1) {
        int var2 = arg0.field2267;
        field909 = 0;
        int var3 = 0;
        arg0.method2973();
        for (int var4 = 0; var4 < field902; var4++) {
            int var5 = field903[var4];
            if ((field899[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var5] = (byte) (field899[var5] | 0x2);
                } else {
                    int var6 = arg0.method2974(1);
                    if (var6 == 0) {
                        var3 = method1802(arg0);
                        field899[var5] = (byte) (field899[var5] | 0x2);
                    } else {
                        method1380(arg0, var5);
                    }
                }
            }
        }
        arg0.method2975();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2973();
        for (int var7 = 0; var7 < field902; var7++) {
            int var8 = field903[var7];
            if ((field899[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var8] = (byte) (field899[var8] | 0x2);
                } else {
                    int var9 = arg0.method2974(1);
                    if (var9 == 0) {
                        var3 = method1802(arg0);
                        field899[var8] = (byte) (field899[var8] | 0x2);
                    } else {
                        method1380(arg0, var8);
                    }
                }
            }
        }
        arg0.method2975();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2973();
        for (int var10 = 0; var10 < field904; var10++) {
            int var11 = field906[var10];
            if ((field899[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var11] = (byte) (field899[var11] | 0x2);
                } else {
                    int var12 = arg0.method2974(1);
                    if (var12 == 0) {
                        var3 = method1802(arg0);
                        field899[var11] = (byte) (field899[var11] | 0x2);
                    } else if (method827(arg0, var11)) {
                        field899[var11] = (byte) (field899[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2975();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2973();
        for (int var13 = 0; var13 < field904; var13++) {
            int var14 = field906[var13];
            if ((field899[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var14] = (byte) (field899[var14] | 0x2);
                } else {
                    int var15 = arg0.method2974(1);
                    if (var15 == 0) {
                        var3 = method1802(arg0);
                        field899[var14] = (byte) (field899[var14] | 0x2);
                    } else if (method827(arg0, var14)) {
                        field899[var14] = (byte) (field899[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2975();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field902 = 0;
        field904 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field899[var16] = (byte) (field899[var16] >> 1);
            class24 var17 = client.field399[var16];
            if (var17 == null) {
                field906[++field904 - 1] = var16;
            } else {
                field903[++field902 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field909; var18++) {
            int var19 = field910[var18];
            class24 var20 = client.field399[var19];
            int var21 = arg0.method2733();
            if ((var21 & 0x10) != 0) {
                var21 += arg0.method2733() << 8;
            }
            method32(arg0, var19, var20, var21);
        }
        if (arg0.field2267 - var2 != arg1) {
            throw new RuntimeException(arg0.field2267 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("cm.o(Lft;B)I")
    public static int method1802(class167 arg0) {
        int var1 = arg0.method2974(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2974(5);
        } else if (var1 == 2) {
            var2 = arg0.method2974(8);
        } else {
            var2 = arg0.method2974(11);
        }
        return var2;
    }

    @ObfuscatedName("by.r(Lft;II)V")
    public static void method1380(class167 arg0, int arg1) {
        boolean var2 = arg0.method2974(1) == 1;
        if (var2) {
            field910[++field909 - 1] = arg1;
        }
        int var3 = arg0.method2974(2);
        class24 var4 = client.field399[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field266 = false;
            } else if (client.field473 == arg1) {
                throw new RuntimeException();
            } else {
                field912[arg1] = (Statics.field663 + var4.field641[0] >> 13) + (Statics.field1792 + var4.field629[0] >> 13 << 14) + (var4.field264 << 28);
                if (var4.field636 == -1) {
                    field907[arg1] = var4.field642;
                } else {
                    field907[arg1] = var4.field636;
                }
                field908[arg1] = var4.field627;
                client.field399[arg1] = null;
                if (arg0.method2974(1) != 0) {
                    method827(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2974(3);
            int var6 = var4.field629[0];
            int var7 = var4.field641[0];
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
            if (client.field473 == arg1 && var4.field619 < 1536 || var4.field609 < 1536 || var4.field619 >= 11776 || var4.field609 >= 11776) {
                var4.method251(var6, var7);
                var4.field266 = false;
            } else if (var2) {
                var4.field266 = true;
                var4.field243 = var6;
                var4.field254 = var7;
            } else {
                var4.field266 = false;
                var4.method244(var6, var7, field900[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2974(4);
            int var9 = var4.field629[0];
            int var10 = var4.field641[0];
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
            if (client.field473 == arg1 && var4.field619 < 1536 || var4.field609 < 1536 || var4.field619 >= 11776 || var4.field609 >= 11776) {
                var4.method251(var9, var10);
                var4.field266 = false;
            } else if (var2) {
                var4.field266 = true;
                var4.field243 = var9;
                var4.field254 = var10;
            } else {
                var4.field266 = false;
                var4.method244(var9, var10, field900[arg1]);
            }
        } else {
            int var11 = arg0.method2974(1);
            if (var11 == 0) {
                int var12 = arg0.method2974(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field629[0] + var14;
                int var17 = var4.field641[0] + var15;
                if (client.field473 == arg1 && var4.field619 < 1536 || var4.field609 < 1536 || var4.field619 >= 11776 || var4.field609 >= 11776) {
                    var4.method251(var16, var17);
                    var4.field266 = false;
                } else if (var2) {
                    var4.field266 = true;
                    var4.field243 = var16;
                    var4.field254 = var17;
                } else {
                    var4.field266 = false;
                    var4.method244(var16, var17, field900[arg1]);
                }
                var4.field264 = (byte) (var4.field264 + var13 & 0x3);
                if (client.field473 == arg1) {
                    Statics.field937 = var4.field264;
                }
            } else {
                int var18 = arg0.method2974(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1792 + var4.field629[0] + var20 & 0x3FFF) - Statics.field1792;
                int var23 = (Statics.field663 + var4.field641[0] + var21 & 0x3FFF) - Statics.field663;
                if (client.field473 == arg1 && var4.field619 < 1536 || var4.field609 < 1536 || var4.field619 >= 11776 || var4.field609 >= 11776) {
                    var4.method251(var22, var23);
                    var4.field266 = false;
                } else if (var2) {
                    var4.field266 = true;
                    var4.field243 = var22;
                    var4.field254 = var23;
                } else {
                    var4.field266 = false;
                    var4.method244(var22, var23, field900[arg1]);
                }
                var4.field264 = (byte) (var4.field264 + var19 & 0x3);
                if (client.field473 == arg1) {
                    Statics.field937 = var4.field264;
                }
            }
        }
    }

    @ObfuscatedName("ab.w(Lft;II)Z")
    public static boolean method827(class167 arg0, int arg1) {
        int var2 = arg0.method2974(2);
        if (var2 == 0) {
            if (arg0.method2974(1) != 0) {
                method827(arg0, arg1);
            }
            int var3 = arg0.method2974(13);
            int var4 = arg0.method2974(13);
            boolean var5 = arg0.method2974(1) == 1;
            if (var5) {
                field910[++field909 - 1] = arg1;
            }
            if (client.field399[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field399[arg1] = new class24();
            var6.field257 = arg1;
            if (field901[arg1] != null) {
                var6.method236(field901[arg1]);
            }
            var6.field642 = field907[arg1];
            var6.field627 = field908[arg1];
            int var7 = field912[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field595[0] = field900[arg1];
            var6.field264 = (byte) var8;
            var6.method251((var9 << 13) + var3 - Statics.field1792, (var10 << 13) + var4 - Statics.field663);
            var6.field266 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2974(2);
            int var12 = field912[arg1];
            field912[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2974(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field912[arg1];
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
            field912[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2974(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field912[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field912[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("r.j(Lft;ILe;IB)V")
    public static final void method32(class167 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method2733();
            byte[] var6 = new byte[var5];
            class161 var7 = new class161(var6);
            arg0.method2901(var6, 0, var5);
            field901[arg1] = var7;
            arg2.method236(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2735();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2733();
            client.method189(arg2, var8, var9);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field627 = arg0.method2735();
            if (arg2.field627 == 65535) {
                arg2.field627 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field604 = arg0.method2740();
            if (arg2.field604.charAt(0) == '~') {
                arg2.field604 = arg2.field604.substring(1);
                class48.method888(2, arg2.field262, arg2.field604);
            } else if (Statics.field1425 == arg2) {
                class48.method888(2, arg2.field262, arg2.field604);
            }
            arg2.field605 = false;
            arg2.field608 = 0;
            arg2.field649 = 0;
            arg2.field607 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            int var10 = arg0.method2733();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2745();
                    if (var15 == 32767) {
                        var15 = arg0.method2745();
                        var13 = arg0.method2745();
                        var12 = arg0.method2745();
                        var14 = arg0.method2745();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2745();
                    }
                    int var16 = arg0.method2745();
                    arg2.method627(var15, var13, var12, var14, client.field454, var16);
                }
            }
            int var17 = arg0.method2733();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2745();
                    int var20 = arg0.method2745();
                    if (var20 == 32767) {
                        arg2.method628(var19);
                    } else {
                        int var21 = arg0.method2745();
                        int var22 = arg0.method2733();
                        int var23 = var20 > 0 ? arg0.method2733() : var22;
                        arg2.method625(var19, client.field454, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field636 = arg0.method2735();
            if (arg2.field645 == 0) {
                arg2.field642 = arg2.field636;
                arg2.field636 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            int var24 = arg0.method2735();
            class178 var25 = (class178) class156.method725(class178.method2033(), arg0.method2733());
            boolean var26 = arg0.method2733() == 1;
            int var27 = arg0.method2733();
            int var28 = arg0.field2267;
            if (arg2.field262 != null && arg2.field244 != null) {
                boolean var29 = false;
                if (var25.field2655 && client.method21(arg2.field262)) {
                    var29 = true;
                }
                if (!var29 && client.field398 == 0 && !arg2.field263) {
                    field913.field2267 = 0;
                    arg0.method2901(field913.field2258, 0, var27);
                    field913.field2267 = 0;
                    class161 var30 = field913;
                    String var34;
                    try {
                        int var31 = var30.method2745();
                        if (var31 > 32767) {
                            var31 = 32767;
                        }
                        byte[] var32 = new byte[var31];
                        var30.field2267 += Statics.field3111.method2658(var30.field2258, var30.field2267, var32, 0, var31);
                        String var33 = class204.method1328(var32, 0, var31);
                        var34 = var33;
                    } catch (Exception var42) {
                        var34 = "Cabbage";
                    }
                    String var37 = class210.method3716(class208.method1951(var34));
                    arg2.field604 = var37.trim();
                    arg2.field608 = var24 >> 8;
                    arg2.field649 = var24 & 0xFF;
                    arg2.field607 = 150;
                    arg2.field605 = var26;
                    arg2.field647 = Statics.field1425 != arg2 && var25.field2655 && client.field560 != "" && var37.toLowerCase().indexOf(client.field560) == -1;
                    int var38;
                    if (var25.field2657) {
                        var38 = var26 ? 91 : 1;
                    } else {
                        var38 = var26 ? 90 : 2;
                    }
                    if (var25.field2648 == -1) {
                        class48.method888(var38, arg2.field262, var37);
                    } else {
                        class48.method888(var38, class38.method2035(var25.field2648) + arg2.field262, var37);
                    }
                }
            }
            arg0.field2267 = var27 + var28;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field628 = arg0.method2735();
            int var39 = arg0.method2868();
            arg2.field632 = var39 >> 16;
            arg2.field631 = (var39 & 0xFFFF) + client.field454;
            arg2.field648 = 0;
            arg2.field630 = 0;
            if (arg2.field631 > client.field454) {
                arg2.field648 = -1;
            }
            if (arg2.field628 == 65535) {
                arg2.field628 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field633 = arg0.method2734();
            arg2.field635 = arg0.method2734();
            arg2.field634 = arg0.method2734();
            arg2.field606 = arg0.method2734();
            arg2.field637 = arg0.method2735() + client.field454;
            arg2.field638 = arg0.method2735() + client.field454;
            arg2.field617 = arg0.method2735();
            if (arg2.field266) {
                arg2.field633 += arg2.field243;
                arg2.field635 += arg2.field254;
                arg2.field634 += arg2.field243;
                arg2.field606 += arg2.field254;
                arg2.field645 = 0;
            } else {
                arg2.field633 += arg2.field629[0];
                arg2.field635 += arg2.field641[0];
                arg2.field634 += arg2.field629[0];
                arg2.field606 += arg2.field641[0];
                arg2.field645 = 1;
            }
            arg2.field646 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            field900[arg1] = arg0.method2734();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2734();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var40 = 0; var40 < 3; var40++) {
                arg2.field247[var40] = arg0.method2740();
            }
        }
        if (!arg2.field266) {
            return;
        }
        if (var4 == 127) {
            arg2.method251(arg2.field243, arg2.field254);
            return;
        }
        byte var41;
        if (var4 == -1) {
            var41 = field900[arg1];
        } else {
            var41 = var4;
        }
        arg2.method244(arg2.field243, arg2.field254, var41);
    }
}
