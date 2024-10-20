package deob;

@ObfuscatedName("cs")
public class class84 {

    @ObfuscatedName("cs.o")
    public static byte[] field1201 = new byte[2048];

    @ObfuscatedName("cs.k")
    public static byte[] field1202 = new byte[2048];

    @ObfuscatedName("cs.u")
    public static class185[] field1203 = new class185[2048];

    @ObfuscatedName("cs.i")
    public static int field1199 = 0;

    @ObfuscatedName("cs.t")
    public static int[] field1205 = new int[2048];

    @ObfuscatedName("cs.p")
    public static int field1206 = 0;

    @ObfuscatedName("cs.l")
    public static int[] field1207 = new int[2048];

    @ObfuscatedName("cs.b")
    public static int[] field1208 = new int[2048];

    @ObfuscatedName("cs.c")
    public static int[] field1200 = new int[2048];

    @ObfuscatedName("cs.d")
    public static int[] field1210 = new int[2048];

    @ObfuscatedName("cs.w")
    public static int field1211 = 0;

    @ObfuscatedName("cs.a")
    public static int[] field1213 = new int[2048];

    @ObfuscatedName("cs.z")
    public static class185 field1209 = new class185(new byte[5000]);

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.v(Lgz;I)V")
    public static final void method3007(class192 arg0) {
        arg0.method3547();
        int var1 = client.field736;
        class62 var2 = Statics.field341 = client.field735[var1] = new class62();
        var2.field606 = var1;
        int var3 = arg0.method3548(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field927[0] = var5 - Statics.field6;
        var2.field933 = (var2.field927[0] << 7) + (var2.method1036() << 6);
        var2.field940[0] = var6 - Statics.field72;
        var2.field964 = (var2.field940[0] << 7) + (var2.method1036() << 6);
        Statics.field348 = var2.field605 = var4;
        if (field1203[var1] != null) {
            var2.method1029(field1203[var1]);
        }
        field1199 = 0;
        field1205[++field1199 - 1] = var1;
        field1201[var1] = 0;
        field1206 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3548(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1208[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1200[var7] = 0;
                field1210[var7] = -1;
                field1207[++field1206 - 1] = var7;
                field1201[var7] = 0;
            }
        }
        arg0.method3549();
    }

    @ObfuscatedName("a.s(Lgz;B)I")
    public static int method144(class192 arg0) {
        int var1 = arg0.method3548(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3548(5);
        } else if (var1 == 2) {
            var2 = arg0.method3548(8);
        } else {
            var2 = arg0.method3548(11);
        }
        return var2;
    }

    @ObfuscatedName("aw.o(Lgz;II)V")
    public static void method652(class192 arg0, int arg1) {
        boolean var2 = arg0.method3548(1) == 1;
        if (var2) {
            field1213[++field1211 - 1] = arg1;
        }
        int var3 = arg0.method3548(2);
        class62 var4 = client.field735[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field609 = false;
            } else if (client.field736 == arg1) {
                throw new RuntimeException();
            } else {
                field1208[arg1] = (Statics.field72 + var4.field940[0] >> 13) + (Statics.field6 + var4.field927[0] >> 13 << 14) + (var4.field605 << 28);
                if (var4.field936 == -1) {
                    field1200[arg1] = var4.field961;
                } else {
                    field1200[arg1] = var4.field936;
                }
                field1210[arg1] = var4.field934;
                client.field735[arg1] = null;
                if (arg0.method3548(1) != 0) {
                    method1771(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3548(3);
            int var6 = var4.field927[0];
            int var7 = var4.field940[0];
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
            if (client.field736 == arg1 && var4.field933 < 1536 || var4.field964 < 1536 || var4.field933 >= 11776 || var4.field964 >= 11776) {
                var4.method1038(var6, var7);
                var4.field609 = false;
            } else if (var2) {
                var4.field609 = true;
                var4.field610 = var6;
                var4.field611 = var7;
            } else {
                var4.field609 = false;
                var4.method1037(var6, var7, field1202[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3548(4);
            int var9 = var4.field927[0];
            int var10 = var4.field940[0];
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
            if (client.field736 == arg1 && var4.field933 < 1536 || var4.field964 < 1536 || var4.field933 >= 11776 || var4.field964 >= 11776) {
                var4.method1038(var9, var10);
                var4.field609 = false;
            } else if (var2) {
                var4.field609 = true;
                var4.field610 = var9;
                var4.field611 = var10;
            } else {
                var4.field609 = false;
                var4.method1037(var9, var10, field1202[arg1]);
            }
        } else {
            int var11 = arg0.method3548(1);
            if (var11 == 0) {
                int var12 = arg0.method3548(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field927[0] + var14;
                int var17 = var4.field940[0] + var15;
                if (client.field736 == arg1 && var4.field933 < 1536 || var4.field964 < 1536 || var4.field933 >= 11776 || var4.field964 >= 11776) {
                    var4.method1038(var16, var17);
                    var4.field609 = false;
                } else if (var2) {
                    var4.field609 = true;
                    var4.field610 = var16;
                    var4.field611 = var17;
                } else {
                    var4.field609 = false;
                    var4.method1037(var16, var17, field1202[arg1]);
                }
                var4.field605 = (byte) (var4.field605 + var13 & 0x3);
                if (client.field736 == arg1) {
                    Statics.field348 = var4.field605;
                }
            } else {
                int var18 = arg0.method3548(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field6 + var4.field927[0] + var20 & 0x3FFF) - Statics.field6;
                int var23 = (Statics.field72 + var4.field940[0] + var21 & 0x3FFF) - Statics.field72;
                if (client.field736 == arg1 && var4.field933 < 1536 || var4.field964 < 1536 || var4.field933 >= 11776 || var4.field964 >= 11776) {
                    var4.method1038(var22, var23);
                    var4.field609 = false;
                } else if (var2) {
                    var4.field609 = true;
                    var4.field610 = var22;
                    var4.field611 = var23;
                } else {
                    var4.field609 = false;
                    var4.method1037(var22, var23, field1202[arg1]);
                }
                var4.field605 = (byte) (var4.field605 + var19 & 0x3);
                if (client.field736 == arg1) {
                    Statics.field348 = var4.field605;
                }
            }
        }
    }

    @ObfuscatedName("cu.k(Lgz;II)Z")
    public static boolean method1771(class192 arg0, int arg1) {
        int var2 = arg0.method3548(2);
        if (var2 == 0) {
            if (arg0.method3548(1) != 0) {
                method1771(arg0, arg1);
            }
            int var3 = arg0.method3548(13);
            int var4 = arg0.method3548(13);
            boolean var5 = arg0.method3548(1) == 1;
            if (var5) {
                field1213[++field1211 - 1] = arg1;
            }
            if (client.field735[arg1] != null) {
                throw new RuntimeException();
            }
            class62 var6 = client.field735[arg1] = new class62();
            var6.field606 = arg1;
            if (field1203[arg1] != null) {
                var6.method1029(field1203[arg1]);
            }
            var6.field961 = field1200[arg1];
            var6.field934 = field1210[arg1];
            int var7 = field1208[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field965[0] = field1202[arg1];
            var6.field605 = (byte) var8;
            var6.method1038((var9 << 13) + var3 - Statics.field6, (var10 << 13) + var4 - Statics.field72);
            var6.field609 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3548(2);
            int var12 = field1208[arg1];
            field1208[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3548(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1208[arg1];
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
            field1208[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3548(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1208[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1208[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bw.u(Lgz;ILbp;II)V")
    public static final void method984(class192 arg0, int arg1, class62 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            arg2.field955 = arg0.method3490();
            if (arg2.field955.charAt(0) == '~') {
                arg2.field955 = arg2.field955.substring(1);
                class86.method1515(2, arg2.field593.method5082(), arg2.field955);
            } else if (Statics.field341 == arg2) {
                class86.method1515(2, arg2.field593.method5082(), arg2.field955);
            }
            arg2.field922 = false;
            arg2.field925 = 0;
            arg2.field939 = 0;
            arg2.field924 = 150;
        }
        if ((arg3 & 0x800) != 0) {
            field1202[arg1] = arg0.method3275();
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field950 = arg0.method3307();
            arg2.field952 = arg0.method3307();
            arg2.field918 = arg0.method3479();
            arg2.field953 = arg0.method3307();
            arg2.field954 = arg0.method3276() + client.field631;
            arg2.field907 = arg0.method3314() + client.field631;
            arg2.field956 = arg0.method3276();
            if (arg2.field609) {
                arg2.field950 += arg2.field610;
                arg2.field952 += arg2.field611;
                arg2.field918 += arg2.field610;
                arg2.field953 += arg2.field611;
                arg2.field962 = 0;
            } else {
                arg2.field950 += arg2.field927[0];
                arg2.field952 += arg2.field940[0];
                arg2.field918 += arg2.field927[0];
                arg2.field953 += arg2.field940[0];
                arg2.field962 = 1;
            }
            arg2.field967 = 0;
        }
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method3313();
            class245[] var6 = new class245[] { class245.field3158, class245.field3156, class245.field3154, class245.field3157, class245.field3159, class245.field3155 };
            class245 var7 = (class245) class180.method34(var6, arg0.method3305());
            boolean var8 = arg0.method3304() == 1;
            int var9 = arg0.method3274();
            int var10 = arg0.field2386;
            if (arg2.field593 != null && arg2.field599 != null) {
                boolean var11 = false;
                if (var7.field3153 && Statics.field1240.method1588(arg2.field593)) {
                    var11 = true;
                }
                if (!var11 && client.field753 == 0 && !arg2.field603) {
                    field1209.field2386 = 0;
                    arg0.method3324(field1209.field2387, 0, var9);
                    field1209.field2386 = 0;
                    class185 var12 = field1209;
                    String var16;
                    try {
                        int var13 = var12.method3288();
                        if (var13 > 32767) {
                            var13 = 32767;
                        }
                        byte[] var14 = new byte[var13];
                        var12.field2386 += Statics.field3746.method3195(var12.field2387, var12.field2386, var14, 0, var13);
                        String var15 = class304.method5090(var14, 0, var13);
                        var16 = var15;
                    } catch (Exception var46) {
                        var16 = "Cabbage";
                    }
                    String var19 = class302.method5237(class308.method1711(var16));
                    arg2.field955 = var19.trim();
                    arg2.field925 = var5 >> 8;
                    arg2.field939 = var5 & 0xFF;
                    arg2.field924 = 150;
                    arg2.field922 = var8;
                    arg2.field923 = Statics.field341 != arg2 && var7.field3153 && client.field835 != "" && var19.toLowerCase().indexOf(client.field835) == -1;
                    int var20;
                    if (var7.field3161) {
                        var20 = var8 ? 91 : 1;
                    } else {
                        var20 = var8 ? 90 : 2;
                    }
                    if (var7.field3160 == -1) {
                        class86.method1515(var20, arg2.field593.method5082(), var19);
                    } else {
                        int var22 = var7.field3160;
                        String var23 = "<img=" + var22 + ">";
                        class86.method1515(var20, var23 + arg2.field593.method5082(), var19);
                    }
                }
            }
            arg0.field2386 = var9 + var10;
        }
        if ((arg3 & 0x80) != 0) {
            int var24 = arg0.method3389();
            if (var24 > 0) {
                for (int var25 = 0; var25 < var24; var25++) {
                    int var26 = -1;
                    int var27 = -1;
                    int var28 = -1;
                    int var29 = arg0.method3288();
                    if (var29 == 32767) {
                        var29 = arg0.method3288();
                        var27 = arg0.method3288();
                        var26 = arg0.method3288();
                        var28 = arg0.method3288();
                    } else if (var29 == 32766) {
                        var29 = -1;
                    } else {
                        var27 = arg0.method3288();
                    }
                    int var30 = arg0.method3288();
                    arg2.method1453(var29, var27, var26, var28, client.field631, var30);
                }
            }
            int var31 = arg0.method3274();
            if (var31 > 0) {
                for (int var32 = 0; var32 < var31; var32++) {
                    int var33 = arg0.method3288();
                    int var34 = arg0.method3288();
                    if (var34 == 32767) {
                        arg2.method1455(var33);
                    } else {
                        int var35 = arg0.method3288();
                        int var36 = arg0.method3304();
                        int var37 = var34 > 0 ? arg0.method3389() : var36;
                        arg2.method1454(var33, client.field631, var34, var35, var36, var37);
                    }
                }
            }
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method3307();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var38 = 0; var38 < 3; var38++) {
                arg2.field604[var38] = arg0.method3490();
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field936 = arg0.method3313();
            if (arg2.field962 == 0) {
                arg2.field961 = arg2.field936;
                arg2.field936 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var39 = arg0.method3304();
            byte[] var40 = new byte[var39];
            class185 var41 = new class185(var40);
            arg0.method3286(var40, 0, var39);
            field1203[arg1] = var41;
            arg2.method1029(var41);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field934 = arg0.method3312();
            if (arg2.field934 == 65535) {
                arg2.field934 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var42 = arg0.method3312();
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = arg0.method3305();
            client.method2885(arg2, var42, var43);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field941 = arg0.method3276();
            int var44 = arg0.method3323();
            arg2.field949 = var44 >> 16;
            arg2.field948 = (var44 & 0xFFFF) + client.field631;
            arg2.field931 = 0;
            arg2.field947 = 0;
            if (arg2.field948 > client.field631) {
                arg2.field931 = -1;
            }
            if (arg2.field941 == 65535) {
                arg2.field941 = -1;
            }
        }
        if (!arg2.field609) {
            return;
        }
        if (var4 == 127) {
            arg2.method1038(arg2.field610, arg2.field611);
            return;
        }
        byte var45;
        if (var4 == -1) {
            var45 = field1202[arg1];
        } else {
            var45 = var4;
        }
        arg2.method1037(arg2.field610, arg2.field611, var45);
    }
}
