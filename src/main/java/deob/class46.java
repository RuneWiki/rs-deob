package deob;

@ObfuscatedName("ae")
public class class46 {

    @ObfuscatedName("ae.x")
    public static byte[] field909 = new byte[2048];

    @ObfuscatedName("ae.q")
    public static byte[] field911 = new byte[2048];

    @ObfuscatedName("ae.d")
    public static class154[] field898 = new class154[2048];

    @ObfuscatedName("ae.k")
    public static int field899 = 0;

    @ObfuscatedName("ae.j")
    public static int[] field896 = new int[2048];

    @ObfuscatedName("ae.s")
    public static int field901 = 0;

    @ObfuscatedName("ae.o")
    public static int[] field906 = new int[2048];

    @ObfuscatedName("ae.a")
    public static int[] field903 = new int[2048];

    @ObfuscatedName("ae.c")
    public static int[] field904 = new int[2048];

    @ObfuscatedName("ae.m")
    public static int[] field905 = new int[2048];

    @ObfuscatedName("ae.h")
    public static int field910 = 0;

    @ObfuscatedName("ae.r")
    public static int[] field907 = new int[2048];

    @ObfuscatedName("ae.u")
    public static class154 field895 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.p(Lfg;B)V")
    public static final void method627(class160 arg0) {
        arg0.method2821();
        int var1 = client.field409;
        class24 var2 = Statics.field169 = client.field400[var1] = new class24();
        var2.field261 = var1;
        int var3 = arg0.method2828(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field636[0] = var5 - Statics.field878;
        var2.field622 = (var2.field636[0] << 7) + (var2.method222() << 6);
        var2.field630[0] = var6 - Statics.field33;
        var2.field639 = (var2.field630[0] << 7) + (var2.method222() << 6);
        Statics.field1559 = var2.field260 = var4;
        if (field898[var1] != null) {
            var2.method221(field898[var1]);
        }
        field899 = 0;
        field896[++field899 - 1] = var1;
        field909[var1] = 0;
        field901 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2828(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field903[var7] = (var9 << 28) + (var10 << 14) + var11;
                field904[var7] = 0;
                field905[var7] = -1;
                field906[++field901 - 1] = var7;
                field909[var7] = 0;
            }
        }
        arg0.method2810();
    }

    @ObfuscatedName("fw.g(Lfg;IB)V")
    public static final void method2990(class160 arg0, int arg1) {
        int var2 = arg0.field2098;
        field910 = 0;
        method1786(arg0);
        for (int var3 = 0; var3 < field910; var3++) {
            int var4 = field907[var3];
            class24 var5 = client.field400[var4];
            int var6 = arg0.method2593();
            if ((var6 & 0x80) != 0) {
                var6 += arg0.method2593() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x20) != 0) {
                int var8 = arg0.method2593();
                byte[] var9 = new byte[var8];
                class154 var10 = new class154(var9);
                arg0.method2603(var9, 0, var8);
                field898[var4] = var10;
                var5.method221(var10);
            }
            if ((var6 & 0x4) != 0) {
                int var11 = arg0.method2595();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method2593();
                Statics.method3009(var5, var11, var12);
            }
            if ((var6 & 0x10) != 0) {
                var5.field641 = arg0.method2595();
                if (var5.field641 == 65535) {
                    var5.field641 = -1;
                }
            }
            if ((var6 & 0x1) != 0) {
                var5.field606 = arg0.method2625();
                if (var5.field606.charAt(0) == '~') {
                    var5.field606 = var5.field606.substring(1);
                    class48.method1829(2, var5.field264, var5.field606);
                } else if (Statics.field169 == var5) {
                    class48.method1829(2, var5.field264, var5.field606);
                }
                var5.field607 = false;
                var5.field595 = 0;
                var5.field610 = 0;
                var5.field609 = 150;
            }
            if ((var6 & 0x8) != 0) {
                int var13 = arg0.method2593();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method2758();
                        if (var18 == 32767) {
                            var18 = arg0.method2758();
                            var16 = arg0.method2758();
                            var15 = arg0.method2758();
                            var17 = arg0.method2758();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method2758();
                        }
                        int var19 = arg0.method2758();
                        var5.method591(var18, var16, var15, var17, client.field289, var19);
                    }
                }
                int var20 = arg0.method2593();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method2758();
                        int var23 = arg0.method2758();
                        if (var23 == 32767) {
                            var5.method583(var22);
                        } else {
                            int var24 = arg0.method2758();
                            int var25 = arg0.method2593();
                            int var26 = var23 > 0 ? arg0.method2593() : var25;
                            var5.method586(var22, client.field289, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var6 & 0x2) != 0) {
                var5.field621 = arg0.method2595();
                if (var5.field647 == 0) {
                    var5.field644 = var5.field621;
                    var5.field621 = -1;
                }
            }
            if ((var6 & 0x40) != 0) {
                int var27 = arg0.method2595();
                class178 var28 = (class178) class149.method1356(class178.method690(), arg0.method2593());
                boolean var29 = arg0.method2593() == 1;
                int var30 = arg0.method2593();
                int var31 = arg0.field2098;
                if (var5.field264 != null && var5.field240 != null) {
                    boolean var32 = false;
                    if (var28.field2666 && client.method3004(var5.field264)) {
                        var32 = true;
                    }
                    if (!var32 && client.field398 == 0 && !var5.field267) {
                        field895.field2098 = 0;
                        arg0.method2603(field895.field2092, 0, var30);
                        field895.field2098 = 0;
                        class154 var33 = field895;
                        String var37;
                        try {
                            int var34 = var33.method2758();
                            if (var34 > 32767) {
                                var34 = 32767;
                            }
                            byte[] var35 = new byte[var34];
                            var33.field2098 += Statics.field3118.method2524(var33.field2092, var33.field2098, var35, 0, var34);
                            String var36 = class204.method609(var35, 0, var34);
                            var37 = var36;
                        } catch (Exception var45) {
                            var37 = "Cabbage";
                        }
                        String var40 = class210.method3665(class208.method23(var37));
                        var5.field606 = var40.trim();
                        var5.field595 = var27 >> 8;
                        var5.field610 = var27 & 0xFF;
                        var5.field609 = 150;
                        var5.field607 = var29;
                        var5.field608 = Statics.field169 != var5 && var28.field2666 && client.field298 != "" && var40.toLowerCase().indexOf(client.field298) == -1;
                        int var41;
                        if (var28.field2665) {
                            var41 = var29 ? 91 : 1;
                        } else {
                            var41 = var29 ? 90 : 2;
                        }
                        if (var28.field2664 == -1) {
                            class48.method1829(var41, var5.field264, var40);
                        } else {
                            class48.method1829(var41, class38.method2930(var28.field2664) + var5.field264, var40);
                        }
                    }
                }
                arg0.field2098 = var30 + var31;
            }
            if ((var6 & 0x1000) != 0) {
                var5.field629 = arg0.method2595();
                int var42 = arg0.method2598();
                var5.field634 = var42 >> 16;
                var5.field619 = (var42 & 0xFFFF) + client.field289;
                var5.field631 = 0;
                var5.field632 = 0;
                if (var5.field619 > client.field289) {
                    var5.field631 = -1;
                }
                if (var5.field629 == 65535) {
                    var5.field629 = -1;
                }
            }
            if ((var6 & 0x100) != 0) {
                var5.field635 = arg0.method2631();
                var5.field637 = arg0.method2631();
                var5.field611 = arg0.method2631();
                var5.field648 = arg0.method2631();
                var5.field653 = arg0.method2595() + client.field289;
                var5.field640 = arg0.method2595() + client.field289;
                var5.field593 = arg0.method2595();
                if (var5.field263) {
                    var5.field635 += var5.field246;
                    var5.field637 += var5.field266;
                    var5.field611 += var5.field246;
                    var5.field648 += var5.field266;
                    var5.field647 = 0;
                } else {
                    var5.field635 += var5.field636[0];
                    var5.field637 += var5.field630[0];
                    var5.field611 += var5.field636[0];
                    var5.field648 += var5.field630[0];
                    var5.field647 = 1;
                }
                var5.field652 = 0;
            }
            if ((var6 & 0x800) != 0) {
                field911[var4] = arg0.method2631();
            }
            if ((var6 & 0x400) != 0) {
                var7 = arg0.method2631();
            }
            if ((var6 & 0x200) != 0) {
                for (int var43 = 0; var43 < 3; var43++) {
                    var5.field243[var43] = arg0.method2625();
                }
            }
            if (var5.field263) {
                if (var7 == 127) {
                    var5.method225(var5.field246, var5.field266);
                } else {
                    byte var44;
                    if (var7 == -1) {
                        var44 = field911[var4];
                    } else {
                        var44 = var7;
                    }
                    var5.method248(var5.field246, var5.field266, var44);
                }
            }
        }
        if (arg0.field2098 - var2 != arg1) {
            throw new RuntimeException(arg0.field2098 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("cg.x(Lfg;B)V")
    public static final void method1786(class160 arg0) {
        int var1 = 0;
        arg0.method2821();
        for (int var2 = 0; var2 < field899; var2++) {
            int var3 = field896[var2];
            if ((field909[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field909[var3] = (byte) (field909[var3] | 0x2);
                } else {
                    int var4 = arg0.method2828(1);
                    if (var4 == 0) {
                        var1 = method694(arg0);
                        field909[var3] = (byte) (field909[var3] | 0x2);
                    } else {
                        method194(arg0, var3);
                    }
                }
            }
        }
        arg0.method2810();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2821();
        for (int var5 = 0; var5 < field899; var5++) {
            int var6 = field896[var5];
            if ((field909[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field909[var6] = (byte) (field909[var6] | 0x2);
                } else {
                    int var7 = arg0.method2828(1);
                    if (var7 == 0) {
                        var1 = method694(arg0);
                        field909[var6] = (byte) (field909[var6] | 0x2);
                    } else {
                        method194(arg0, var6);
                    }
                }
            }
        }
        arg0.method2810();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2821();
        for (int var8 = 0; var8 < field901; var8++) {
            int var9 = field906[var8];
            if ((field909[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field909[var9] = (byte) (field909[var9] | 0x2);
                } else {
                    int var10 = arg0.method2828(1);
                    if (var10 == 0) {
                        var1 = method694(arg0);
                        field909[var9] = (byte) (field909[var9] | 0x2);
                    } else if (method1859(arg0, var9)) {
                        field909[var9] = (byte) (field909[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2810();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2821();
        for (int var11 = 0; var11 < field901; var11++) {
            int var12 = field906[var11];
            if ((field909[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field909[var12] = (byte) (field909[var12] | 0x2);
                } else {
                    int var13 = arg0.method2828(1);
                    if (var13 == 0) {
                        var1 = method694(arg0);
                        field909[var12] = (byte) (field909[var12] | 0x2);
                    } else if (method1859(arg0, var12)) {
                        field909[var12] = (byte) (field909[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2810();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field899 = 0;
        field901 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field909[var14] = (byte) (field909[var14] >> 1);
            class24 var15 = client.field400[var14];
            if (var15 == null) {
                field906[++field901 - 1] = var14;
            } else {
                field896[++field899 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ay.q(Lfg;I)I")
    public static int method694(class160 arg0) {
        int var1 = arg0.method2828(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2828(5);
        } else if (var1 == 2) {
            var2 = arg0.method2828(8);
        } else {
            var2 = arg0.method2828(11);
        }
        return var2;
    }

    @ObfuscatedName("y.d(Lfg;II)V")
    public static void method194(class160 arg0, int arg1) {
        boolean var2 = arg0.method2828(1) == 1;
        if (var2) {
            field907[++field910 - 1] = arg1;
        }
        int var3 = arg0.method2828(2);
        class24 var4 = client.field400[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field263 = false;
            } else if (client.field409 == arg1) {
                throw new RuntimeException();
            } else {
                field903[arg1] = (Statics.field33 + var4.field630[0] >> 13) + (Statics.field878 + var4.field636[0] >> 13 << 14) + (var4.field260 << 28);
                if (var4.field621 == -1) {
                    field904[arg1] = var4.field644;
                } else {
                    field904[arg1] = var4.field621;
                }
                field905[arg1] = var4.field641;
                client.field400[arg1] = null;
                if (arg0.method2828(1) != 0) {
                    method1859(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2828(3);
            int var6 = var4.field636[0];
            int var7 = var4.field630[0];
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
            if (client.field409 == arg1 && var4.field622 < 1536 || var4.field639 < 1536 || var4.field622 >= 11776 || var4.field639 >= 11776) {
                var4.method225(var6, var7);
                var4.field263 = false;
            } else if (var2) {
                var4.field263 = true;
                var4.field246 = var6;
                var4.field266 = var7;
            } else {
                var4.field263 = false;
                var4.method248(var6, var7, field911[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2828(4);
            int var9 = var4.field636[0];
            int var10 = var4.field630[0];
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
            if (client.field409 == arg1 && var4.field622 < 1536 || var4.field639 < 1536 || var4.field622 >= 11776 || var4.field639 >= 11776) {
                var4.method225(var9, var10);
                var4.field263 = false;
            } else if (var2) {
                var4.field263 = true;
                var4.field246 = var9;
                var4.field266 = var10;
            } else {
                var4.field263 = false;
                var4.method248(var9, var10, field911[arg1]);
            }
        } else {
            int var11 = arg0.method2828(1);
            if (var11 == 0) {
                int var12 = arg0.method2828(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field636[0] + var14;
                int var17 = var4.field630[0] + var15;
                if (client.field409 == arg1 && var4.field622 < 1536 || var4.field639 < 1536 || var4.field622 >= 11776 || var4.field639 >= 11776) {
                    var4.method225(var16, var17);
                    var4.field263 = false;
                } else if (var2) {
                    var4.field263 = true;
                    var4.field246 = var16;
                    var4.field266 = var17;
                } else {
                    var4.field263 = false;
                    var4.method248(var16, var17, field911[arg1]);
                }
                var4.field260 = (byte) (var4.field260 + var13 & 0x3);
                if (client.field409 == arg1) {
                    Statics.field1559 = var4.field260;
                }
            } else {
                int var18 = arg0.method2828(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field878 + var4.field636[0] + var20 & 0x3FFF) - Statics.field878;
                int var23 = (Statics.field33 + var4.field630[0] + var21 & 0x3FFF) - Statics.field33;
                if (client.field409 == arg1 && var4.field622 < 1536 || var4.field639 < 1536 || var4.field622 >= 11776 || var4.field639 >= 11776) {
                    var4.method225(var22, var23);
                    var4.field263 = false;
                } else if (var2) {
                    var4.field263 = true;
                    var4.field246 = var22;
                    var4.field266 = var23;
                } else {
                    var4.field263 = false;
                    var4.method248(var22, var23, field911[arg1]);
                }
                var4.field260 = (byte) (var4.field260 + var19 & 0x3);
                if (client.field409 == arg1) {
                    Statics.field1559 = var4.field260;
                }
            }
        }
    }

    @ObfuscatedName("dy.k(Lfg;IB)Z")
    public static boolean method1859(class160 arg0, int arg1) {
        int var2 = arg0.method2828(2);
        if (var2 == 0) {
            if (arg0.method2828(1) != 0) {
                method1859(arg0, arg1);
            }
            int var3 = arg0.method2828(13);
            int var4 = arg0.method2828(13);
            boolean var5 = arg0.method2828(1) == 1;
            if (var5) {
                field907[++field910 - 1] = arg1;
            }
            if (client.field400[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field400[arg1] = new class24();
            var6.field261 = arg1;
            if (field898[arg1] != null) {
                var6.method221(field898[arg1]);
            }
            var6.field644 = field904[arg1];
            var6.field641 = field905[arg1];
            int var7 = field903[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field650[0] = field911[arg1];
            var6.field260 = (byte) var8;
            var6.method225((var9 << 13) + var3 - Statics.field878, (var10 << 13) + var4 - Statics.field33);
            var6.field263 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2828(2);
            int var12 = field903[arg1];
            field903[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2828(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field903[arg1];
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
            field903[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2828(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field903[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field903[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
