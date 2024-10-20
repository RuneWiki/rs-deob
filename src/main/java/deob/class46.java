package deob;

@ObfuscatedName("ar")
public class class46 {

    @ObfuscatedName("ar.h")
    public static byte[] field919 = new byte[2048];

    @ObfuscatedName("ar.p")
    public static byte[] field924 = new byte[2048];

    @ObfuscatedName("ar.j")
    public static class154[] field921 = new class154[2048];

    @ObfuscatedName("ar.n")
    public static int field922 = 0;

    @ObfuscatedName("ar.r")
    public static int[] field932 = new int[2048];

    @ObfuscatedName("ar.c")
    public static int field930 = 0;

    @ObfuscatedName("ar.i")
    public static int[] field925 = new int[2048];

    @ObfuscatedName("ar.o")
    public static int[] field926 = new int[2048];

    @ObfuscatedName("ar.m")
    public static int[] field927 = new int[2048];

    @ObfuscatedName("ar.s")
    public static int[] field928 = new int[2048];

    @ObfuscatedName("ar.u")
    public static int field929 = 0;

    @ObfuscatedName("ar.b")
    public static int[] field917 = new int[2048];

    @ObfuscatedName("ar.v")
    public static class154 field920 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.q(Lff;B)V")
    public static final void method864(class160 arg0) {
        arg0.method2895();
        int var1 = client.field557;
        class24 var2 = Statics.field792 = client.field426[var1] = new class24();
        var2.field256 = var1;
        int var3 = arg0.method2918(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field679[0] = var5 - Statics.field60;
        var2.field638 = (var2.field679[0] << 7) + (var2.method228() << 6);
        var2.field629[0] = var6 - Statics.field290;
        var2.field625 = (var2.field629[0] << 7) + (var2.method228() << 6);
        Statics.field1569 = var2.field278 = var4;
        if (field921[var1] != null) {
            var2.method227(field921[var1]);
        }
        field922 = 0;
        field932[++field922 - 1] = var1;
        field919[var1] = 0;
        field930 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2918(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field926[var7] = (var9 << 28) + (var10 << 14) + var11;
                field927[var7] = 0;
                field928[var7] = -1;
                field925[++field930 - 1] = var7;
                field919[var7] = 0;
            }
        }
        arg0.method2897();
    }

    @ObfuscatedName("cp.d(Lff;S)I")
    public static int method1885(class160 arg0) {
        int var1 = arg0.method2918(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2918(5);
        } else if (var1 == 2) {
            var2 = arg0.method2918(8);
        } else {
            var2 = arg0.method2918(11);
        }
        return var2;
    }

    @ObfuscatedName("j.h(Lff;IB)V")
    public static void method57(class160 arg0, int arg1) {
        boolean var2 = arg0.method2918(1) == 1;
        if (var2) {
            field917[++field929 - 1] = arg1;
        }
        int var3 = arg0.method2918(2);
        class24 var4 = client.field426[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field262 = false;
            } else if (client.field557 == arg1) {
                throw new RuntimeException();
            } else {
                field926[arg1] = (Statics.field290 + var4.field629[0] >> 13) + (Statics.field60 + var4.field679[0] >> 13 << 14) + (var4.field278 << 28);
                if (var4.field652 == -1) {
                    field927[arg1] = var4.field675;
                } else {
                    field927[arg1] = var4.field652;
                }
                field928[arg1] = var4.field650;
                client.field426[arg1] = null;
                if (arg0.method2918(1) != 0) {
                    method855(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2918(3);
            int var6 = var4.field679[0];
            int var7 = var4.field629[0];
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
            if (client.field557 == arg1 && var4.field638 < 1536 || var4.field625 < 1536 || var4.field638 >= 11776 || var4.field625 >= 11776) {
                var4.method231(var6, var7);
                var4.field262 = false;
            } else if (var2) {
                var4.field262 = true;
                var4.field281 = var6;
                var4.field279 = var7;
            } else {
                var4.field262 = false;
                var4.method249(var6, var7, field924[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2918(4);
            int var9 = var4.field679[0];
            int var10 = var4.field629[0];
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
            if (client.field557 == arg1 && var4.field638 < 1536 || var4.field625 < 1536 || var4.field638 >= 11776 || var4.field625 >= 11776) {
                var4.method231(var9, var10);
                var4.field262 = false;
            } else if (var2) {
                var4.field262 = true;
                var4.field281 = var9;
                var4.field279 = var10;
            } else {
                var4.field262 = false;
                var4.method249(var9, var10, field924[arg1]);
            }
        } else {
            int var11 = arg0.method2918(1);
            if (var11 == 0) {
                int var12 = arg0.method2918(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field679[0] + var14;
                int var17 = var4.field629[0] + var15;
                if (client.field557 == arg1 && var4.field638 < 1536 || var4.field625 < 1536 || var4.field638 >= 11776 || var4.field625 >= 11776) {
                    var4.method231(var16, var17);
                    var4.field262 = false;
                } else if (var2) {
                    var4.field262 = true;
                    var4.field281 = var16;
                    var4.field279 = var17;
                } else {
                    var4.field262 = false;
                    var4.method249(var16, var17, field924[arg1]);
                }
                var4.field278 = (byte) (var4.field278 + var13 & 0x3);
                if (client.field557 == arg1) {
                    Statics.field1569 = var4.field278;
                }
            } else {
                int var18 = arg0.method2918(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field60 + var4.field679[0] + var20 & 0x3FFF) - Statics.field60;
                int var23 = (Statics.field290 + var4.field629[0] + var21 & 0x3FFF) - Statics.field290;
                if (client.field557 == arg1 && var4.field638 < 1536 || var4.field625 < 1536 || var4.field638 >= 11776 || var4.field625 >= 11776) {
                    var4.method231(var22, var23);
                    var4.field262 = false;
                } else if (var2) {
                    var4.field262 = true;
                    var4.field281 = var22;
                    var4.field279 = var23;
                } else {
                    var4.field262 = false;
                    var4.method249(var22, var23, field924[arg1]);
                }
                var4.field278 = (byte) (var4.field278 + var19 & 0x3);
                if (client.field557 == arg1) {
                    Statics.field1569 = var4.field278;
                }
            }
        }
    }

    @ObfuscatedName("ag.p(Lff;II)Z")
    public static boolean method855(class160 arg0, int arg1) {
        int var2 = arg0.method2918(2);
        if (var2 == 0) {
            if (arg0.method2918(1) != 0) {
                method855(arg0, arg1);
            }
            int var3 = arg0.method2918(13);
            int var4 = arg0.method2918(13);
            boolean var5 = arg0.method2918(1) == 1;
            if (var5) {
                field917[++field929 - 1] = arg1;
            }
            if (client.field426[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field426[arg1] = new class24();
            var6.field256 = arg1;
            if (field921[arg1] != null) {
                var6.method227(field921[arg1]);
            }
            var6.field675 = field927[arg1];
            var6.field650 = field928[arg1];
            int var7 = field926[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field681[0] = field924[arg1];
            var6.field278 = (byte) var8;
            var6.method231((var9 << 13) + var3 - Statics.field60, (var10 << 13) + var4 - Statics.field290);
            var6.field262 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2918(2);
            int var12 = field926[arg1];
            field926[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2918(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field926[arg1];
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
            field926[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2918(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field926[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field926[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("er.j(Lff;ILx;II)V")
    public static final void method2869(class160 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method2666();
            byte[] var6 = new byte[var5];
            class154 var7 = new class154(var6);
            arg0.method2843(var6, 0, var5);
            field921[arg1] = var7;
            arg2.method227(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2668();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2666();
            client.method950(arg2, var8, var9);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field650 = arg0.method2668();
            if (arg2.field650 == 65535) {
                arg2.field650 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field664 = arg0.method2701();
            if (arg2.field664.charAt(0) == '~') {
                arg2.field664 = arg2.field664.substring(1);
                class48.method187(2, arg2.field263, arg2.field664);
            } else if (Statics.field792 == arg2) {
                class48.method187(2, arg2.field263, arg2.field664);
            }
            arg2.field627 = false;
            arg2.field641 = 0;
            arg2.field642 = 0;
            arg2.field639 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var10 = arg0.method2666();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2679();
                    if (var15 == 32767) {
                        var15 = arg0.method2679();
                        var13 = arg0.method2679();
                        var12 = arg0.method2679();
                        var14 = arg0.method2679();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2679();
                    }
                    int var16 = arg0.method2679();
                    arg2.method616(var15, var13, var12, var14, client.field450, var16);
                }
            }
            int var17 = arg0.method2666();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2679();
                    int var20 = arg0.method2679();
                    if (var20 == 32767) {
                        arg2.method620(var19);
                    } else {
                        int var21 = arg0.method2679();
                        int var22 = arg0.method2666();
                        int var23 = var20 > 0 ? arg0.method2666() : var22;
                        arg2.method628(var19, client.field450, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field652 = arg0.method2668();
            if (arg2.field674 == 0) {
                arg2.field675 = arg2.field652;
                arg2.field652 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var24 = arg0.method2668();
            class178 var25 = (class178) class149.method2203(class178.method180(), arg0.method2666());
            boolean var26 = arg0.method2666() == 1;
            int var27 = arg0.method2666();
            int var28 = arg0.field2091;
            if (arg2.field263 != null && arg2.field284 != null) {
                boolean var29 = false;
                if (var25.field2672 && Statics.method207(arg2.field263)) {
                    var29 = true;
                }
                if (!var29 && client.field425 == 0 && !arg2.field277) {
                    field920.field2091 = 0;
                    arg0.method2843(field920.field2092, 0, var27);
                    field920.field2091 = 0;
                    String var30 = class210.method3761(class208.method772(class211.method1446(field920)));
                    arg2.field664 = var30.trim();
                    arg2.field641 = var24 >> 8;
                    arg2.field642 = var24 & 0xFF;
                    arg2.field639 = 150;
                    arg2.field627 = var26;
                    arg2.field624 = Statics.field792 != arg2 && var25.field2672 && client.field526 != "" && var30.toLowerCase().indexOf(client.field526) == -1;
                    int var31;
                    if (var25.field2671) {
                        var31 = var26 ? 91 : 1;
                    } else {
                        var31 = var26 ? 90 : 2;
                    }
                    if (var25.field2670 == -1) {
                        class48.method187(var31, arg2.field263, var30);
                    } else {
                        int var33 = var25.field2670;
                        String var34 = "<img=" + var33 + ">";
                        class48.method187(var31, var34 + arg2.field263, var30);
                    }
                }
            }
            arg0.field2091 = var27 + var28;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field659 = arg0.method2668();
            int var35 = arg0.method2798();
            arg2.field665 = var35 >> 16;
            arg2.field640 = (var35 & 0xFFFF) + client.field450;
            arg2.field662 = 0;
            arg2.field663 = 0;
            if (arg2.field640 > client.field450) {
                arg2.field662 = -1;
            }
            if (arg2.field659 == 65535) {
                arg2.field659 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field666 = arg0.method2835();
            arg2.field668 = arg0.method2835();
            arg2.field667 = arg0.method2835();
            arg2.field669 = arg0.method2835();
            arg2.field670 = arg0.method2668() + client.field450;
            arg2.field671 = arg0.method2668() + client.field450;
            arg2.field672 = arg0.method2668();
            if (arg2.field262) {
                arg2.field666 += arg2.field281;
                arg2.field668 += arg2.field279;
                arg2.field667 += arg2.field281;
                arg2.field669 += arg2.field279;
                arg2.field674 = 0;
            } else {
                arg2.field666 += arg2.field679[0];
                arg2.field668 += arg2.field629[0];
                arg2.field667 += arg2.field679[0];
                arg2.field669 += arg2.field629[0];
                arg2.field674 = 1;
            }
            arg2.field683 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            field924[arg1] = arg0.method2835();
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method2835();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var36 = 0; var36 < 3; var36++) {
                arg2.field261[var36] = arg0.method2701();
            }
        }
        if (!arg2.field262) {
            return;
        }
        if (var4 == 127) {
            arg2.method231(arg2.field281, arg2.field279);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field924[arg1];
        } else {
            var37 = var4;
        }
        arg2.method249(arg2.field281, arg2.field279, var37);
    }
}
