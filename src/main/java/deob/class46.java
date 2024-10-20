package deob;

@ObfuscatedName("ah")
public class class46 {

    @ObfuscatedName("ah.i")
    public static byte[] field899 = new byte[2048];

    @ObfuscatedName("ah.t")
    public static byte[] field898 = new byte[2048];

    @ObfuscatedName("ah.k")
    public static class154[] field900 = new class154[2048];

    @ObfuscatedName("ah.h")
    public static int field908 = 0;

    @ObfuscatedName("ah.n")
    public static int[] field901 = new int[2048];

    @ObfuscatedName("ah.f")
    public static int field902 = 0;

    @ObfuscatedName("ah.a")
    public static int[] field903 = new int[2048];

    @ObfuscatedName("ah.r")
    public static int[] field904 = new int[2048];

    @ObfuscatedName("ah.x")
    public static int[] field905 = new int[2048];

    @ObfuscatedName("ah.z")
    public static int[] field906 = new int[2048];

    @ObfuscatedName("ah.p")
    public static int field907 = 0;

    @ObfuscatedName("ah.s")
    public static int[] field895 = new int[2048];

    @ObfuscatedName("ah.o")
    public static class154 field909 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.b(Lfx;I)V")
    public static final void method208(class160 arg0) {
        arg0.method2953();
        int var1 = client.field407;
        class24 var2 = Statics.field85 = client.field406[var1] = new class24();
        var2.field262 = var1;
        int var3 = arg0.method2931(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field657[0] = var5 - Statics.field221;
        var2.field658 = (var2.field657[0] << 7) + (var2.method247() << 6);
        var2.field641[0] = var6 - Statics.field21;
        var2.field632 = (var2.field641[0] << 7) + (var2.method247() << 6);
        Statics.field2111 = var2.field261 = var4;
        if (field900[var1] != null) {
            var2.method228(field900[var1]);
        }
        field908 = 0;
        field901[++field908 - 1] = var1;
        field899[var1] = 0;
        field902 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2931(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field904[var7] = (var9 << 28) + (var10 << 14) + var11;
                field905[var7] = 0;
                field906[var7] = -1;
                field903[++field902 - 1] = var7;
                field899[var7] = 0;
            }
        }
        arg0.method2937();
    }

    @ObfuscatedName("fy.l(Lfx;IB)V")
    public static final void method2971(class160 arg0, int arg1) {
        int var2 = arg0.field2085;
        field907 = 0;
        int var3 = 0;
        arg0.method2953();
        for (int var4 = 0; var4 < field908; var4++) {
            int var5 = field901[var4];
            if ((field899[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var5] = (byte) (field899[var5] | 0x2);
                } else {
                    int var6 = arg0.method2931(1);
                    if (var6 == 0) {
                        var3 = method69(arg0);
                        field899[var5] = (byte) (field899[var5] | 0x2);
                    } else {
                        method97(arg0, var5);
                    }
                }
            }
        }
        arg0.method2937();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2953();
        for (int var7 = 0; var7 < field908; var7++) {
            int var8 = field901[var7];
            if ((field899[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var8] = (byte) (field899[var8] | 0x2);
                } else {
                    int var9 = arg0.method2931(1);
                    if (var9 == 0) {
                        var3 = method69(arg0);
                        field899[var8] = (byte) (field899[var8] | 0x2);
                    } else {
                        method97(arg0, var8);
                    }
                }
            }
        }
        arg0.method2937();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2953();
        for (int var10 = 0; var10 < field902; var10++) {
            int var11 = field903[var10];
            if ((field899[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var11] = (byte) (field899[var11] | 0x2);
                } else {
                    int var12 = arg0.method2931(1);
                    if (var12 == 0) {
                        var3 = method69(arg0);
                        field899[var11] = (byte) (field899[var11] | 0x2);
                    } else if (method3411(arg0, var11)) {
                        field899[var11] = (byte) (field899[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2937();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2953();
        for (int var13 = 0; var13 < field902; var13++) {
            int var14 = field903[var13];
            if ((field899[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field899[var14] = (byte) (field899[var14] | 0x2);
                } else {
                    int var15 = arg0.method2931(1);
                    if (var15 == 0) {
                        var3 = method69(arg0);
                        field899[var14] = (byte) (field899[var14] | 0x2);
                    } else if (method3411(arg0, var14)) {
                        field899[var14] = (byte) (field899[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2937();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field908 = 0;
        field902 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field899[var16] = (byte) (field899[var16] >> 1);
            class24 var17 = client.field406[var16];
            if (var17 == null) {
                field903[++field902 - 1] = var16;
            } else {
                field901[++field908 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field907; var18++) {
            int var19 = field895[var18];
            class24 var20 = client.field406[var19];
            int var21 = arg0.method2678();
            if ((var21 & 0x20) != 0) {
                var21 += arg0.method2678() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x10) != 0) {
                int var23 = arg0.method2678();
                byte[] var24 = new byte[var23];
                class154 var25 = new class154(var24);
                arg0.method2689(var24, 0, var23);
                field900[var19] = var25;
                var20.method228(var25);
            }
            if ((var21 & 0x1) != 0) {
                int var26 = arg0.method2801();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg0.method2678();
                client.method958(var20, var26, var27);
            }
            if ((var21 & 0x8) != 0) {
                var20.field603 = arg0.method2801();
                if (var20.field603 == 65535) {
                    var20.field603 = -1;
                }
            }
            if ((var21 & 0x40) != 0) {
                var20.field615 = arg0.method2686();
                if (var20.field615.charAt(0) == '~') {
                    var20.field615 = var20.field615.substring(1);
                    class48.method2520(2, var20.field264, var20.field615);
                } else if (Statics.field85 == var20) {
                    class48.method2520(2, var20.field264, var20.field615);
                }
                var20.field616 = false;
                var20.field649 = 0;
                var20.field620 = 0;
                var20.field607 = 150;
            }
            if ((var21 & 0x2) != 0) {
                int var28 = arg0.method2678();
                if (var28 > 0) {
                    for (int var29 = 0; var29 < var28; var29++) {
                        int var30 = -1;
                        int var31 = -1;
                        int var32 = -1;
                        int var33 = arg0.method2813();
                        if (var33 == 32767) {
                            var33 = arg0.method2813();
                            var31 = arg0.method2813();
                            var30 = arg0.method2813();
                            var32 = arg0.method2813();
                        } else if (var33 == 32766) {
                            var33 = -1;
                        } else {
                            var31 = arg0.method2813();
                        }
                        int var34 = arg0.method2813();
                        var20.method637(var33, var31, var30, var32, client.field293, var34);
                    }
                }
                int var35 = arg0.method2678();
                if (var35 > 0) {
                    for (int var36 = 0; var36 < var35; var36++) {
                        int var37 = arg0.method2813();
                        int var38 = arg0.method2813();
                        if (var38 == 32767) {
                            var20.method626(var37);
                        } else {
                            int var39 = arg0.method2813();
                            int var40 = arg0.method2678();
                            int var41 = var38 > 0 ? arg0.method2678() : var40;
                            var20.method625(var37, client.field293, var38, var39, var40, var41);
                        }
                    }
                }
            }
            if ((var21 & 0x80) != 0) {
                var20.field611 = arg0.method2801();
                if (var20.field656 == 0) {
                    var20.field653 = var20.field611;
                    var20.field611 = -1;
                }
            }
            if ((var21 & 0x4) != 0) {
                int var42 = arg0.method2801();
                class178[] var43 = new class178[] { class178.field2659, class178.field2662, class178.field2669, class178.field2658, class178.field2664, class178.field2665 };
                class178 var44 = (class178) class149.method784(var43, arg0.method2678());
                boolean var45 = arg0.method2678() == 1;
                int var46 = arg0.method2678();
                int var47 = arg0.field2085;
                if (var20.field264 != null && var20.field241 != null) {
                    boolean var48 = false;
                    if (var44.field2671 && client.method83(var20.field264)) {
                        var48 = true;
                    }
                    if (!var48 && client.field337 == 0 && !var20.field260) {
                        field909.field2085 = 0;
                        arg0.method2689(field909.field2083, 0, var46);
                        field909.field2085 = 0;
                        String var49 = class210.method3768(class208.method2910(class211.method3227(field909)));
                        var20.field615 = var49.trim();
                        var20.field649 = var42 >> 8;
                        var20.field620 = var42 & 0xFF;
                        var20.field607 = 150;
                        var20.field616 = var45;
                        var20.field617 = Statics.field85 != var20 && var44.field2671 && client.field503 != "" && var49.toLowerCase().indexOf(client.field503) == -1;
                        int var50;
                        if (var44.field2660) {
                            var50 = var45 ? 91 : 1;
                        } else {
                            var50 = var45 ? 90 : 2;
                        }
                        if (var44.field2661 == -1) {
                            class48.method2520(var50, var20.field264, var49);
                        } else {
                            class48.method2520(var50, class38.method615(var44.field2661) + var20.field264, var49);
                        }
                    }
                }
                arg0.field2085 = var46 + var47;
            }
            if ((var21 & 0x800) != 0) {
                var20.field639 = arg0.method2801();
                int var51 = arg0.method2683();
                var20.field643 = var51 >> 16;
                var20.field642 = (var51 & 0xFFFF) + client.field293;
                var20.field640 = 0;
                var20.field629 = 0;
                if (var20.field642 > client.field293) {
                    var20.field640 = -1;
                }
                if (var20.field639 == 65535) {
                    var20.field639 = -1;
                }
            }
            if ((var21 & 0x1000) != 0) {
                var20.field644 = arg0.method2679();
                var20.field646 = arg0.method2679();
                var20.field645 = arg0.method2679();
                var20.field647 = arg0.method2679();
                var20.field648 = arg0.method2801() + client.field293;
                var20.field634 = arg0.method2801() + client.field293;
                var20.field650 = arg0.method2801();
                if (var20.field243) {
                    var20.field644 += var20.field245;
                    var20.field646 += var20.field265;
                    var20.field645 += var20.field245;
                    var20.field647 += var20.field265;
                    var20.field656 = 0;
                } else {
                    var20.field644 += var20.field657[0];
                    var20.field646 += var20.field641[0];
                    var20.field645 += var20.field657[0];
                    var20.field647 += var20.field641[0];
                    var20.field656 = 1;
                }
                var20.field661 = 0;
            }
            if ((var21 & 0x400) != 0) {
                field898[var19] = arg0.method2679();
            }
            if ((var21 & 0x100) != 0) {
                var22 = arg0.method2679();
            }
            if ((var21 & 0x200) != 0) {
                for (int var52 = 0; var52 < 3; var52++) {
                    var20.field244[var52] = arg0.method2686();
                }
            }
            if (var20.field243) {
                if (var22 == 127) {
                    var20.method231(var20.field245, var20.field265);
                } else {
                    byte var53;
                    if (var22 == -1) {
                        var53 = field898[var19];
                    } else {
                        var53 = var22;
                    }
                    var20.method254(var20.field245, var20.field265, var53);
                }
            }
        }
        if (arg0.field2085 - var2 != arg1) {
            throw new RuntimeException(arg0.field2085 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("k.i(Lfx;I)I")
    public static int method69(class160 arg0) {
        int var1 = arg0.method2931(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2931(5);
        } else if (var1 == 2) {
            var2 = arg0.method2931(8);
        } else {
            var2 = arg0.method2931(11);
        }
        return var2;
    }

    @ObfuscatedName("n.t(Lfx;II)V")
    public static void method97(class160 arg0, int arg1) {
        boolean var2 = arg0.method2931(1) == 1;
        if (var2) {
            field895[++field907 - 1] = arg1;
        }
        int var3 = arg0.method2931(2);
        class24 var4 = client.field406[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field243 = false;
            } else if (client.field407 == arg1) {
                throw new RuntimeException();
            } else {
                field904[arg1] = (Statics.field21 + var4.field641[0] >> 13) + (Statics.field221 + var4.field657[0] >> 13 << 14) + (var4.field261 << 28);
                if (var4.field611 == -1) {
                    field905[arg1] = var4.field653;
                } else {
                    field905[arg1] = var4.field611;
                }
                field906[arg1] = var4.field603;
                client.field406[arg1] = null;
                if (arg0.method2931(1) != 0) {
                    method3411(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2931(3);
            int var6 = var4.field657[0];
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
            if (client.field407 == arg1 && var4.field658 < 1536 || var4.field632 < 1536 || var4.field658 >= 11776 || var4.field632 >= 11776) {
                var4.method231(var6, var7);
                var4.field243 = false;
            } else if (var2) {
                var4.field243 = true;
                var4.field245 = var6;
                var4.field265 = var7;
            } else {
                var4.field243 = false;
                var4.method254(var6, var7, field898[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2931(4);
            int var9 = var4.field657[0];
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
            if (client.field407 == arg1 && var4.field658 < 1536 || var4.field632 < 1536 || var4.field658 >= 11776 || var4.field632 >= 11776) {
                var4.method231(var9, var10);
                var4.field243 = false;
            } else if (var2) {
                var4.field243 = true;
                var4.field245 = var9;
                var4.field265 = var10;
            } else {
                var4.field243 = false;
                var4.method254(var9, var10, field898[arg1]);
            }
        } else {
            int var11 = arg0.method2931(1);
            if (var11 == 0) {
                int var12 = arg0.method2931(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field657[0] + var14;
                int var17 = var4.field641[0] + var15;
                if (client.field407 == arg1 && var4.field658 < 1536 || var4.field632 < 1536 || var4.field658 >= 11776 || var4.field632 >= 11776) {
                    var4.method231(var16, var17);
                    var4.field243 = false;
                } else if (var2) {
                    var4.field243 = true;
                    var4.field245 = var16;
                    var4.field265 = var17;
                } else {
                    var4.field243 = false;
                    var4.method254(var16, var17, field898[arg1]);
                }
                var4.field261 = (byte) (var4.field261 + var13 & 0x3);
                if (client.field407 == arg1) {
                    Statics.field2111 = var4.field261;
                }
            } else {
                int var18 = arg0.method2931(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field221 + var4.field657[0] + var20 & 0x3FFF) - Statics.field221;
                int var23 = (Statics.field21 + var4.field641[0] + var21 & 0x3FFF) - Statics.field21;
                if (client.field407 == arg1 && var4.field658 < 1536 || var4.field632 < 1536 || var4.field658 >= 11776 || var4.field632 >= 11776) {
                    var4.method231(var22, var23);
                    var4.field243 = false;
                } else if (var2) {
                    var4.field243 = true;
                    var4.field245 = var22;
                    var4.field265 = var23;
                } else {
                    var4.field243 = false;
                    var4.method254(var22, var23, field898[arg1]);
                }
                var4.field261 = (byte) (var4.field261 + var19 & 0x3);
                if (client.field407 == arg1) {
                    Statics.field2111 = var4.field261;
                }
            }
        }
    }

    @ObfuscatedName("gm.k(Lfx;IB)Z")
    public static boolean method3411(class160 arg0, int arg1) {
        int var2 = arg0.method2931(2);
        if (var2 == 0) {
            if (arg0.method2931(1) != 0) {
                method3411(arg0, arg1);
            }
            int var3 = arg0.method2931(13);
            int var4 = arg0.method2931(13);
            boolean var5 = arg0.method2931(1) == 1;
            if (var5) {
                field895[++field907 - 1] = arg1;
            }
            if (client.field406[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field406[arg1] = new class24();
            var6.field262 = arg1;
            if (field900[arg1] != null) {
                var6.method228(field900[arg1]);
            }
            var6.field653 = field905[arg1];
            var6.field603 = field906[arg1];
            int var7 = field904[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field659[0] = field898[arg1];
            var6.field261 = (byte) var8;
            var6.method231((var9 << 13) + var3 - Statics.field221, (var10 << 13) + var4 - Statics.field21);
            var6.field243 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2931(2);
            int var12 = field904[arg1];
            field904[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2931(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field904[arg1];
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
            field904[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2931(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field904[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field904[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("i.x(I)V")
    public static void method27() {
        field908 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field900[var0] = null;
            field898[var0] = 1;
        }
    }
}
