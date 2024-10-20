package deob;

@ObfuscatedName("az")
public class class46 {

    @ObfuscatedName("az.b")
    public static byte[] field899 = new byte[2048];

    @ObfuscatedName("az.g")
    public static byte[] field917 = new byte[2048];

    @ObfuscatedName("az.h")
    public static class154[] field918 = new class154[2048];

    @ObfuscatedName("az.v")
    public static int field901 = 0;

    @ObfuscatedName("az.l")
    public static int[] field903 = new int[2048];

    @ObfuscatedName("az.c")
    public static int field904 = 0;

    @ObfuscatedName("az.u")
    public static int[] field906 = new int[2048];

    @ObfuscatedName("az.k")
    public static int[] field898 = new int[2048];

    @ObfuscatedName("az.z")
    public static int[] field907 = new int[2048];

    @ObfuscatedName("az.y")
    public static int[] field914 = new int[2048];

    @ObfuscatedName("az.j")
    public static int field905 = 0;

    @ObfuscatedName("az.f")
    public static int[] field910 = new int[2048];

    @ObfuscatedName("az.p")
    public static class154 field911 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.o(Lfp;I)V")
    public static final void method755(class160 arg0) {
        arg0.method2784();
        int var1 = client.field409;
        class24 var2 = Statics.field43 = client.field408[var1] = new class24();
        var2.field274 = var1;
        int var3 = arg0.method2801(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field660[0] = var5 - Statics.field1735;
        var2.field608 = (var2.field660[0] << 7) + (var2.method228() << 6);
        var2.field661[0] = var6 - Statics.field284;
        var2.field605 = (var2.field661[0] << 7) + (var2.method228() << 6);
        Statics.field1094 = var2.field257 = var4;
        if (field918[var1] != null) {
            var2.method211(field918[var1]);
        }
        field901 = 0;
        field903[++field901 - 1] = var1;
        field899[var1] = 0;
        field904 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2801(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field898[var7] = (var9 << 28) + (var10 << 14) + var11;
                field907[var7] = 0;
                field914[var7] = -1;
                field906[++field904 - 1] = var7;
                field899[var7] = 0;
            }
        }
        arg0.method2807();
    }

    @ObfuscatedName("an.m(Lfp;II)V")
    public static final void method712(class160 arg0, int arg1) {
        int var2 = arg0.field2105;
        field905 = 0;
        method698(arg0);
        method73(arg0);
        if (arg0.field2105 - var2 != arg1) {
            throw new RuntimeException(arg0.field2105 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ay.b(Lfp;I)V")
    public static final void method698(class160 arg0) {
        int var1 = 0;
        arg0.method2784();
        for (int var2 = 0; var2 < field901; var2++) {
            int var3 = field903[var2];
            if ((field899[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field899[var3] = (byte) (field899[var3] | 0x2);
                } else {
                    int var4 = arg0.method2801(1);
                    if (var4 == 0) {
                        var1 = method2766(arg0);
                        field899[var3] = (byte) (field899[var3] | 0x2);
                    } else {
                        method877(arg0, var3);
                    }
                }
            }
        }
        arg0.method2807();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2784();
        for (int var5 = 0; var5 < field901; var5++) {
            int var6 = field903[var5];
            if ((field899[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field899[var6] = (byte) (field899[var6] | 0x2);
                } else {
                    int var7 = arg0.method2801(1);
                    if (var7 == 0) {
                        var1 = method2766(arg0);
                        field899[var6] = (byte) (field899[var6] | 0x2);
                    } else {
                        method877(arg0, var6);
                    }
                }
            }
        }
        arg0.method2807();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2784();
        for (int var8 = 0; var8 < field904; var8++) {
            int var9 = field906[var8];
            if ((field899[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field899[var9] = (byte) (field899[var9] | 0x2);
                } else {
                    int var10 = arg0.method2801(1);
                    if (var10 == 0) {
                        var1 = method2766(arg0);
                        field899[var9] = (byte) (field899[var9] | 0x2);
                    } else if (method2873(arg0, var9)) {
                        field899[var9] = (byte) (field899[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2807();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2784();
        for (int var11 = 0; var11 < field904; var11++) {
            int var12 = field906[var11];
            if ((field899[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field899[var12] = (byte) (field899[var12] | 0x2);
                } else {
                    int var13 = arg0.method2801(1);
                    if (var13 == 0) {
                        var1 = method2766(arg0);
                        field899[var12] = (byte) (field899[var12] | 0x2);
                    } else if (method2873(arg0, var12)) {
                        field899[var12] = (byte) (field899[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2807();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field901 = 0;
        field904 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field899[var14] = (byte) (field899[var14] >> 1);
            class24 var15 = client.field408[var14];
            if (var15 == null) {
                field906[++field904 - 1] = var14;
            } else {
                field903[++field901 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("fy.g(Lfp;I)I")
    public static int method2766(class160 arg0) {
        int var1 = arg0.method2801(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2801(5);
        } else if (var1 == 2) {
            var2 = arg0.method2801(8);
        } else {
            var2 = arg0.method2801(11);
        }
        return var2;
    }

    @ObfuscatedName("as.l(Lfp;II)V")
    public static void method877(class160 arg0, int arg1) {
        boolean var2 = arg0.method2801(1) == 1;
        if (var2) {
            field910[++field905 - 1] = arg1;
        }
        int var3 = arg0.method2801(2);
        class24 var4 = client.field408[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field272 = false;
            } else if (client.field409 == arg1) {
                throw new RuntimeException();
            } else {
                field898[arg1] = (Statics.field284 + var4.field661[0] >> 6) + (Statics.field1735 + var4.field660[0] >> 6 << 14) + (var4.field257 << 28);
                if (var4.field615 == -1) {
                    field907[arg1] = var4.field656;
                } else {
                    field907[arg1] = var4.field615;
                }
                field914[arg1] = var4.field614;
                client.field408[arg1] = null;
                if (arg0.method2801(1) != 0) {
                    method2873(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2801(3);
            int var6 = var4.field660[0];
            int var7 = var4.field661[0];
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
            if (client.field409 == arg1 && var4.field608 < 1536 || var4.field605 < 1536 || var4.field608 >= 11776 || var4.field605 >= 11776) {
                var4.method214(var6, var7);
                var4.field272 = false;
            } else if (var2) {
                var4.field272 = true;
                var4.field273 = var6;
                var4.field252 = var7;
            } else {
                var4.field272 = false;
                var4.method213(var6, var7, field917[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2801(4);
            int var9 = var4.field660[0];
            int var10 = var4.field661[0];
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
            if (client.field409 == arg1 && var4.field608 < 1536 || var4.field605 < 1536 || var4.field608 >= 11776 || var4.field605 >= 11776) {
                var4.method214(var9, var10);
                var4.field272 = false;
            } else if (var2) {
                var4.field272 = true;
                var4.field273 = var9;
                var4.field252 = var10;
            } else {
                var4.field272 = false;
                var4.method213(var9, var10, field917[arg1]);
            }
        } else {
            int var11 = arg0.method2801(1);
            if (var11 == 0) {
                int var12 = arg0.method2801(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field660[0] + var14;
                int var17 = var4.field661[0] + var15;
                if (client.field409 == arg1 && var4.field608 < 1536 || var4.field605 < 1536 || var4.field608 >= 11776 || var4.field605 >= 11776) {
                    var4.method214(var16, var17);
                    var4.field272 = false;
                } else if (var2) {
                    var4.field272 = true;
                    var4.field273 = var16;
                    var4.field252 = var17;
                } else {
                    var4.field272 = false;
                    var4.method213(var16, var17, field917[arg1]);
                }
                var4.field257 = (byte) (var4.field257 + var13 & 0x3);
                if (client.field409 == arg1) {
                    Statics.field1094 = var4.field257;
                }
            } else {
                int var18 = arg0.method2801(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1735 + var4.field660[0] + var20 & 0x3FFF) - Statics.field1735;
                int var23 = (Statics.field284 + var4.field661[0] + var21 & 0x3FFF) - Statics.field284;
                if (client.field409 == arg1 && var4.field608 < 1536 || var4.field605 < 1536 || var4.field608 >= 11776 || var4.field605 >= 11776) {
                    var4.method214(var22, var23);
                    var4.field272 = false;
                } else if (var2) {
                    var4.field272 = true;
                    var4.field273 = var22;
                    var4.field252 = var23;
                } else {
                    var4.field272 = false;
                    var4.method213(var22, var23, field917[arg1]);
                }
                var4.field257 = (byte) (var4.field257 + var19 & 0x3);
                if (client.field409 == arg1) {
                    Statics.field1094 = var4.field257;
                }
            }
        }
    }

    @ObfuscatedName("ff.c(Lfp;II)Z")
    public static boolean method2873(class160 arg0, int arg1) {
        int var2 = arg0.method2801(2);
        if (var2 == 0) {
            if (arg0.method2801(1) != 0) {
                method2873(arg0, arg1);
            }
            int var3 = arg0.method2801(6);
            int var4 = arg0.method2801(6);
            boolean var5 = arg0.method2801(1) == 1;
            if (var5) {
                field910[++field905 - 1] = arg1;
            }
            if (client.field408[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field408[arg1] = new class24();
            var6.field274 = arg1;
            if (field918[arg1] != null) {
                var6.method211(field918[arg1]);
            }
            var6.field656 = field907[arg1];
            var6.field614 = field914[arg1];
            int var7 = field898[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field662[0] = field917[arg1];
            var6.field257 = (byte) var8;
            var6.method214((var9 << 6) + var3 - Statics.field1735, (var10 << 6) + var4 - Statics.field284);
            var6.field272 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2801(2);
            int var12 = field898[arg1];
            field898[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2801(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field898[arg1];
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
            field898[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2801(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field898[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field898[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("l.u(Lfp;I)V")
    public static final void method73(class160 arg0) {
        for (int var1 = 0; var1 < field905; var1++) {
            int var2 = field910[var1];
            class24 var3 = client.field408[var2];
            int var4 = arg0.method2552();
            if ((var4 & 0x10) != 0) {
                var4 += arg0.method2552() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x2) != 0) {
                int var6 = arg0.method2552();
                byte[] var7 = new byte[var6];
                class154 var8 = new class154(var7);
                arg0.method2622(var7, 0, var6);
                field918[var2] = var8;
                var3.method211(var8);
            }
            if ((var4 & 0x1) != 0) {
                int var9 = arg0.method2554();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2552();
                client.method644(var3, var9, var10);
            }
            if ((var4 & 0x8) != 0) {
                var3.field614 = arg0.method2554();
                if (var3.field614 == 65535) {
                    var3.field614 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field617 = arg0.method2606();
                if (var3.field617.charAt(0) == '~') {
                    var3.field617 = var3.field617.substring(1);
                    class48.method184(2, var3.field264, var3.field617);
                } else if (Statics.field43 == var3) {
                    class48.method184(2, var3.field264, var3.field617);
                }
                var3.field618 = false;
                var3.field609 = 0;
                var3.field622 = 0;
                var3.field620 = 150;
            }
            if ((var4 & 0x80) != 0) {
                int var11 = arg0.method2552();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2668();
                        if (var16 == 32767) {
                            var16 = arg0.method2668();
                            var14 = arg0.method2668();
                            var13 = arg0.method2668();
                            var15 = arg0.method2668();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2668();
                        }
                        int var17 = arg0.method2668();
                        var3.method576(var16, var14, var13, var15, client.field299, var17);
                    }
                }
                int var18 = arg0.method2552();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2668();
                        int var21 = arg0.method2668();
                        if (var21 == 32767) {
                            var3.method572(var20);
                        } else {
                            int var22 = arg0.method2668();
                            int var23 = arg0.method2552();
                            int var24 = var21 > 0 ? arg0.method2552() : var23;
                            var3.method574(var20, client.field299, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field615 = arg0.method2554();
                if (var3.field657 == 0) {
                    var3.field656 = var3.field615;
                    var3.field615 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var25 = arg0.method2554();
                class178[] var26 = new class178[] { class178.field2673, class178.field2674, class178.field2670, class178.field2672, class178.field2677, class178.field2669 };
                class178 var27 = (class178) class149.method1314(var26, arg0.method2552());
                boolean var28 = arg0.method2552() == 1;
                int var29 = arg0.method2552();
                int var30 = arg0.field2105;
                if (var3.field264 != null && var3.field254 != null) {
                    boolean var31 = false;
                    if (var27.field2678 && client.method151(var3.field264)) {
                        var31 = true;
                    }
                    if (!var31 && client.field543 == 0 && !var3.field269) {
                        field911.field2105 = 0;
                        arg0.method2622(field911.field2108, 0, var29);
                        field911.field2105 = 0;
                        class154 var32 = field911;
                        String var33 = class211.method2012(var32, 32767);
                        String var34 = class210.method3583(class208.method2973(var33));
                        var3.field617 = var34.trim();
                        var3.field609 = var25 >> 8;
                        var3.field622 = var25 & 0xFF;
                        var3.field620 = 150;
                        var3.field618 = var28;
                        var3.field619 = Statics.field43 != var3 && var27.field2678 && client.field304 != "" && var34.toLowerCase().indexOf(client.field304) == -1;
                        int var35;
                        if (var27.field2681) {
                            var35 = var28 ? 91 : 1;
                        } else {
                            var35 = var28 ? 90 : 2;
                        }
                        if (var27.field2676 == -1) {
                            class48.method184(var35, var3.field264, var34);
                        } else {
                            class48.method184(var35, class38.method167(var27.field2676) + var3.field264, var34);
                        }
                    }
                }
                arg0.field2105 = var29 + var30;
            }
            if ((var4 & 0x400) != 0) {
                var3.field642 = arg0.method2554();
                int var36 = arg0.method2557();
                var3.field655 = var36 >> 16;
                var3.field645 = (var36 & 0xFFFF) + client.field299;
                var3.field643 = 0;
                var3.field665 = 0;
                if (var3.field645 > client.field299) {
                    var3.field643 = -1;
                }
                if (var3.field642 == 65535) {
                    var3.field642 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.field659 = arg0.method2553();
                var3.field633 = arg0.method2553();
                var3.field648 = arg0.method2553();
                var3.field650 = arg0.method2553();
                var3.field651 = arg0.method2554() + client.field299;
                var3.field652 = arg0.method2554() + client.field299;
                var3.field653 = arg0.method2554();
                if (var3.field272) {
                    var3.field659 += var3.field273;
                    var3.field633 += var3.field252;
                    var3.field648 += var3.field273;
                    var3.field650 += var3.field252;
                    var3.field657 = 0;
                } else {
                    var3.field659 += var3.field660[0];
                    var3.field633 += var3.field661[0];
                    var3.field648 += var3.field660[0];
                    var3.field650 += var3.field661[0];
                    var3.field657 = 1;
                }
                var3.field664 = 0;
            }
            if ((var4 & 0x100) != 0) {
                field917[var2] = arg0.method2553();
            }
            if ((var4 & 0x200) != 0) {
                var5 = arg0.method2553();
            }
            if ((var4 & 0x1000) != 0) {
                for (int var37 = 0; var37 < 3; var37++) {
                    var3.field249[var37] = arg0.method2606();
                }
            }
            if (var3.field272) {
                if (var5 == 127) {
                    var3.method214(var3.field273, var3.field252);
                } else {
                    byte var38;
                    if (var5 == -1) {
                        var38 = field917[var2];
                    } else {
                        var38 = var5;
                    }
                    var3.method213(var3.field273, var3.field252, var38);
                }
            }
        }
    }

    @ObfuscatedName("gx.k(I)V")
    public static void method3271() {
        field901 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field918[var0] = null;
            field917[var0] = 1;
        }
    }
}
