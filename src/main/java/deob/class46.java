package deob;

@ObfuscatedName("at")
public class class46 {

    @ObfuscatedName("at.f")
    public static byte[] field892 = new byte[2048];

    @ObfuscatedName("at.h")
    public static byte[] field893 = new byte[2048];

    @ObfuscatedName("at.a")
    public static class154[] field894 = new class154[2048];

    @ObfuscatedName("at.g")
    public static int field895 = 0;

    @ObfuscatedName("at.k")
    public static int[] field897 = new int[2048];

    @ObfuscatedName("at.u")
    public static int field903 = 0;

    @ObfuscatedName("at.b")
    public static int[] field898 = new int[2048];

    @ObfuscatedName("at.x")
    public static int[] field899 = new int[2048];

    @ObfuscatedName("at.r")
    public static int[] field900 = new int[2048];

    @ObfuscatedName("at.n")
    public static int[] field901 = new int[2048];

    @ObfuscatedName("at.m")
    public static int field902 = 0;

    @ObfuscatedName("at.j")
    public static int[] field905 = new int[2048];

    @ObfuscatedName("at.w")
    public static class154 field904 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.s(Lfr;I)V")
    public static final void method1827(class160 arg0) {
        arg0.method2794();
        int var1 = client.field415;
        class24 var2 = Statics.field129 = client.field414[var1] = new class24();
        var2.field279 = var1;
        int var3 = arg0.method2785(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field663[0] = var5 - Statics.field254;
        var2.field609 = (var2.field663[0] << 7) + (var2.method196() << 6);
        var2.field661[0] = var6 - Statics.field1680;
        var2.field606 = (var2.field661[0] << 7) + (var2.method196() << 6);
        Statics.field1853 = var2.field278 = var4;
        if (field894[var1] != null) {
            var2.method213(field894[var1]);
        }
        field895 = 0;
        field897[++field895 - 1] = var1;
        field892[var1] = 0;
        field903 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2785(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field899[var7] = (var9 << 28) + (var10 << 14) + var11;
                field900[var7] = 0;
                field901[var7] = -1;
                field898[++field903 - 1] = var7;
                field892[var7] = 0;
            }
        }
        arg0.method2779();
    }

    @ObfuscatedName("am.c(Lfr;II)V")
    public static final void method823(class160 arg0, int arg1) {
        int var2 = arg0.field2098;
        field902 = 0;
        int var3 = 0;
        arg0.method2794();
        for (int var4 = 0; var4 < field895; var4++) {
            int var5 = field897[var4];
            if ((field892[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field892[var5] = (byte) (field892[var5] | 0x2);
                } else {
                    int var6 = arg0.method2785(1);
                    if (var6 == 0) {
                        var3 = method164(arg0);
                        field892[var5] = (byte) (field892[var5] | 0x2);
                    } else {
                        method95(arg0, var5);
                    }
                }
            }
        }
        arg0.method2779();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2794();
        for (int var7 = 0; var7 < field895; var7++) {
            int var8 = field897[var7];
            if ((field892[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field892[var8] = (byte) (field892[var8] | 0x2);
                } else {
                    int var9 = arg0.method2785(1);
                    if (var9 == 0) {
                        var3 = method164(arg0);
                        field892[var8] = (byte) (field892[var8] | 0x2);
                    } else {
                        method95(arg0, var8);
                    }
                }
            }
        }
        arg0.method2779();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2794();
        for (int var10 = 0; var10 < field903; var10++) {
            int var11 = field898[var10];
            if ((field892[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field892[var11] = (byte) (field892[var11] | 0x2);
                } else {
                    int var12 = arg0.method2785(1);
                    if (var12 == 0) {
                        var3 = method164(arg0);
                        field892[var11] = (byte) (field892[var11] | 0x2);
                    } else if (method1760(arg0, var11)) {
                        field892[var11] = (byte) (field892[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2779();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2794();
        for (int var13 = 0; var13 < field903; var13++) {
            int var14 = field898[var13];
            if ((field892[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field892[var14] = (byte) (field892[var14] | 0x2);
                } else {
                    int var15 = arg0.method2785(1);
                    if (var15 == 0) {
                        var3 = method164(arg0);
                        field892[var14] = (byte) (field892[var14] | 0x2);
                    } else if (method1760(arg0, var14)) {
                        field892[var14] = (byte) (field892[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2779();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field895 = 0;
        field903 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field892[var16] = (byte) (field892[var16] >> 1);
            class24 var17 = client.field414[var16];
            if (var17 == null) {
                field898[++field903 - 1] = var16;
            } else {
                field897[++field895 - 1] = var16;
            }
        }
        method3313(arg0);
        if (arg0.field2098 - var2 != arg1) {
            throw new RuntimeException(arg0.field2098 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("z.f(Lfr;I)I")
    public static int method164(class160 arg0) {
        int var1 = arg0.method2785(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2785(5);
        } else if (var1 == 2) {
            var2 = arg0.method2785(8);
        } else {
            var2 = arg0.method2785(11);
        }
        return var2;
    }

    @ObfuscatedName("b.g(Lfr;IS)V")
    public static void method95(class160 arg0, int arg1) {
        boolean var2 = arg0.method2785(1) == 1;
        if (var2) {
            field905[++field902 - 1] = arg1;
        }
        int var3 = arg0.method2785(2);
        class24 var4 = client.field414[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field280 = false;
            } else if (client.field415 == arg1) {
                throw new RuntimeException();
            } else {
                field899[arg1] = (Statics.field1680 + var4.field661[0] >> 6) + (Statics.field254 + var4.field663[0] >> 6 << 14) + (var4.field278 << 28);
                if (var4.field633 == -1) {
                    field900[arg1] = var4.field656;
                } else {
                    field900[arg1] = var4.field633;
                }
                field901[arg1] = var4.field645;
                client.field414[arg1] = null;
                if (arg0.method2785(1) != 0) {
                    method1760(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2785(3);
            int var6 = var4.field663[0];
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
            if (client.field415 == arg1 && var4.field609 < 1536 || var4.field606 < 1536 || var4.field609 >= 11776 || var4.field606 >= 11776) {
                var4.method199(var6, var7);
                var4.field280 = false;
            } else if (var2) {
                var4.field280 = true;
                var4.field281 = var6;
                var4.field282 = var7;
            } else {
                var4.field280 = false;
                var4.method198(var6, var7, field893[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2785(4);
            int var9 = var4.field663[0];
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
            if (client.field415 == arg1 && var4.field609 < 1536 || var4.field606 < 1536 || var4.field609 >= 11776 || var4.field606 >= 11776) {
                var4.method199(var9, var10);
                var4.field280 = false;
            } else if (var2) {
                var4.field280 = true;
                var4.field281 = var9;
                var4.field282 = var10;
            } else {
                var4.field280 = false;
                var4.method198(var9, var10, field893[arg1]);
            }
        } else {
            int var11 = arg0.method2785(1);
            if (var11 == 0) {
                int var12 = arg0.method2785(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field663[0] + var14;
                int var17 = var4.field661[0] + var15;
                if (client.field415 == arg1 && var4.field609 < 1536 || var4.field606 < 1536 || var4.field609 >= 11776 || var4.field606 >= 11776) {
                    var4.method199(var16, var17);
                    var4.field280 = false;
                } else if (var2) {
                    var4.field280 = true;
                    var4.field281 = var16;
                    var4.field282 = var17;
                } else {
                    var4.field280 = false;
                    var4.method198(var16, var17, field893[arg1]);
                }
                var4.field278 = (byte) (var4.field278 + var13 & 0x3);
                if (client.field415 == arg1) {
                    Statics.field1853 = var4.field278;
                }
            } else {
                int var18 = arg0.method2785(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field254 + var4.field663[0] + var20 & 0x3FFF) - Statics.field254;
                int var23 = (Statics.field1680 + var4.field661[0] + var21 & 0x3FFF) - Statics.field1680;
                if (client.field415 == arg1 && var4.field609 < 1536 || var4.field606 < 1536 || var4.field609 >= 11776 || var4.field606 >= 11776) {
                    var4.method199(var22, var23);
                    var4.field280 = false;
                } else if (var2) {
                    var4.field280 = true;
                    var4.field281 = var22;
                    var4.field282 = var23;
                } else {
                    var4.field280 = false;
                    var4.method198(var22, var23, field893[arg1]);
                }
                var4.field278 = (byte) (var4.field278 + var19 & 0x3);
                if (client.field415 == arg1) {
                    Statics.field1853 = var4.field278;
                }
            }
        }
    }

    @ObfuscatedName("cl.k(Lfr;IB)Z")
    public static boolean method1760(class160 arg0, int arg1) {
        int var2 = arg0.method2785(2);
        if (var2 == 0) {
            if (arg0.method2785(1) != 0) {
                method1760(arg0, arg1);
            }
            int var3 = arg0.method2785(6);
            int var4 = arg0.method2785(6);
            boolean var5 = arg0.method2785(1) == 1;
            if (var5) {
                field905[++field902 - 1] = arg1;
            }
            if (client.field414[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field414[arg1] = new class24();
            var6.field279 = arg1;
            if (field894[arg1] != null) {
                var6.method213(field894[arg1]);
            }
            var6.field656 = field900[arg1];
            var6.field645 = field901[arg1];
            int var7 = field899[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field625[0] = field893[arg1];
            var6.field278 = (byte) var8;
            var6.method199((var9 << 6) + var3 - Statics.field254, (var10 << 6) + var4 - Statics.field1680);
            var6.field280 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2785(2);
            int var12 = field899[arg1];
            field899[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2785(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field899[arg1];
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
            field899[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2785(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field899[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field899[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("gg.u(Lfr;S)V")
    public static final void method3313(class160 arg0) {
        for (int var1 = 0; var1 < field902; var1++) {
            int var2 = field905[var1];
            class24 var3 = client.field414[var2];
            int var4 = arg0.method2545();
            if ((var4 & 0x40) != 0) {
                var4 += arg0.method2545() << 8;
            }
            method181(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("t.b(Lfr;ILy;II)V")
    public static final void method181(class160 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x8) != 0) {
            int var5 = arg0.method2545();
            byte[] var6 = new byte[var5];
            class154 var7 = new class154(var6);
            arg0.method2647(var6, 0, var5);
            field894[arg1] = var7;
            arg2.method213(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2541();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2545();
            client.method173(arg2, var8, var9);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field645 = arg0.method2541();
            if (arg2.field645 == 65535) {
                arg2.field645 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field618 = arg0.method2734();
            if (arg2.field618.charAt(0) == '~') {
                arg2.field618 = arg2.field618.substring(1);
                class48.method221(2, arg2.field259, arg2.field618);
            } else if (Statics.field129 == arg2) {
                class48.method221(2, arg2.field259, arg2.field618);
            }
            arg2.field626 = false;
            arg2.field622 = 0;
            arg2.field623 = 0;
            arg2.field650 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var10 = arg0.method2545();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2558();
                    if (var15 == 32767) {
                        var15 = arg0.method2558();
                        var13 = arg0.method2558();
                        var12 = arg0.method2558();
                        var14 = arg0.method2558();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2558();
                    }
                    int var16 = arg0.method2558();
                    arg2.method577(var15, var13, var12, var14, client.field304, var16);
                }
            }
            int var17 = arg0.method2545();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2558();
                    int var20 = arg0.method2558();
                    if (var20 == 32767) {
                        arg2.method580(var19);
                    } else {
                        int var21 = arg0.method2558();
                        int var22 = arg0.method2545();
                        int var23 = var20 > 0 ? arg0.method2545() : var22;
                        arg2.method578(var19, client.field304, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field633 = arg0.method2541();
            if (arg2.field659 == 0) {
                arg2.field656 = arg2.field633;
                arg2.field633 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var24 = arg0.method2541();
            class178 var25 = (class178) class149.method1293(class178.method92(), arg0.method2545());
            boolean var26 = arg0.method2545() == 1;
            int var27 = arg0.method2545();
            int var28 = arg0.field2098;
            if (arg2.field259 != null && arg2.field272 != null) {
                boolean var29 = false;
                if (var25.field2678 && client.method2080(arg2.field259)) {
                    var29 = true;
                }
                if (!var29 && client.field384 == 0 && !arg2.field258) {
                    field904.field2098 = 0;
                    arg0.method2647(field904.field2100, 0, var27);
                    field904.field2098 = 0;
                    class154 var30 = field904;
                    String var34;
                    try {
                        int var31 = var30.method2558();
                        if (var31 > 32767) {
                            var31 = 32767;
                        }
                        byte[] var32 = new byte[var31];
                        var30.field2098 += Statics.field3122.method2471(var30.field2100, var30.field2098, var32, 0, var31);
                        String var33 = class204.method153(var32, 0, var31);
                        var34 = var33;
                    } catch (Exception var45) {
                        var34 = "Cabbage";
                    }
                    String var37 = class210.method3522(class208.method2030(var34));
                    arg2.field618 = var37.trim();
                    arg2.field622 = var24 >> 8;
                    arg2.field623 = var24 & 0xFF;
                    arg2.field650 = 150;
                    arg2.field626 = var26;
                    arg2.field620 = Statics.field129 != arg2 && var25.field2678 && client.field513 != "" && var37.toLowerCase().indexOf(client.field513) == -1;
                    int var38;
                    if (var25.field2677) {
                        var38 = var26 ? 91 : 1;
                    } else {
                        var38 = var26 ? 90 : 2;
                    }
                    if (var25.field2676 == -1) {
                        class48.method221(var38, arg2.field259, var37);
                    } else {
                        int var40 = var25.field2676;
                        String var41 = "<img=" + var40 + ">";
                        class48.method221(var38, var41 + arg2.field259, var37);
                    }
                }
            }
            arg0.field2098 = var27 + var28;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field613 = arg0.method2541();
            int var42 = arg0.method2550();
            arg2.field632 = var42 >> 16;
            arg2.field605 = (var42 & 0xFFFF) + client.field304;
            arg2.field643 = 0;
            arg2.field644 = 0;
            if (arg2.field605 > client.field304) {
                arg2.field643 = -1;
            }
            if (arg2.field613 == 65535) {
                arg2.field613 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field607 = arg0.method2657();
            arg2.field651 = arg0.method2657();
            arg2.field658 = arg0.method2657();
            arg2.field621 = arg0.method2657();
            arg2.field662 = arg0.method2541() + client.field304;
            arg2.field652 = arg0.method2541() + client.field304;
            arg2.field653 = arg0.method2541();
            if (arg2.field280) {
                arg2.field607 += arg2.field281;
                arg2.field651 += arg2.field282;
                arg2.field658 += arg2.field281;
                arg2.field621 += arg2.field282;
                arg2.field659 = 0;
            } else {
                arg2.field607 += arg2.field663[0];
                arg2.field651 += arg2.field661[0];
                arg2.field658 += arg2.field663[0];
                arg2.field621 += arg2.field661[0];
                arg2.field659 = 1;
            }
            arg2.field664 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            field893[arg1] = arg0.method2657();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2657();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var43 = 0; var43 < 3; var43++) {
                arg2.field261[var43] = arg0.method2734();
            }
        }
        if (!arg2.field280) {
            return;
        }
        if (var4 == 127) {
            arg2.method199(arg2.field281, arg2.field282);
            return;
        }
        byte var44;
        if (var4 == -1) {
            var44 = field893[arg1];
        } else {
            var44 = var4;
        }
        arg2.method198(arg2.field281, arg2.field282, var44);
    }
}
