package deob;

@ObfuscatedName("cd")
public class class99 {

    @ObfuscatedName("cd.q")
    public static byte[] field1283 = new byte[2048];

    @ObfuscatedName("cd.j")
    public static byte[] field1279 = new byte[2048];

    @ObfuscatedName("cd.p")
    public static class310[] field1280 = new class310[2048];

    @ObfuscatedName("cd.g")
    public static int field1281 = 0;

    @ObfuscatedName("cd.n")
    public static int[] field1282 = new int[2048];

    @ObfuscatedName("cd.u")
    public static int field1278 = 0;

    @ObfuscatedName("cd.a")
    public static int[] field1284 = new int[2048];

    @ObfuscatedName("cd.z")
    public static int[] field1276 = new int[2048];

    @ObfuscatedName("cd.w")
    public static int[] field1286 = new int[2048];

    @ObfuscatedName("cd.y")
    public static int[] field1287 = new int[2048];

    @ObfuscatedName("cd.c")
    public static int field1277 = 0;

    @ObfuscatedName("cd.h")
    public static int[] field1289 = new int[2048];

    @ObfuscatedName("cd.k")
    public static class310 field1290 = new class310(new byte[5000]);

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.m(Lkb;B)V")
    public static final void method4350(class309 arg0) {
        arg0.method5170();
        int var1 = client.field791;
        class76 var2 = Statics.field455 = client.field790[var1] = new class76();
        var2.field657 = var1;
        int var3 = arg0.method5171(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1020[0] = var5 - Statics.field2130;
        var2.field983 = (var2.field1020[0] << 7) + (var2.method1130() << 6);
        var2.field1021[0] = var6 - Statics.field1275;
        var2.field965 = (var2.field1021[0] << 7) + (var2.method1130() << 6);
        Statics.field1576 = var2.field656 = var4;
        if (field1280[var1] != null) {
            var2.method1123(field1280[var1]);
        }
        field1281 = 0;
        field1282[++field1281 - 1] = var1;
        field1283[var1] = 0;
        field1278 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5171(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1276[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1286[var7] = 0;
                field1287[var7] = -1;
                field1284[++field1278 - 1] = var7;
                field1283[var7] = 0;
            }
        }
        arg0.method5172();
    }

    @ObfuscatedName("bw.o(Lkb;II)V")
    public static final void method801(class309 arg0, int arg1) {
        int var2 = arg0.field3734;
        field1277 = 0;
        method2146(arg0);
        for (int var3 = 0; var3 < field1277; var3++) {
            int var4 = field1289[var3];
            class76 var5 = client.field790[var4];
            int var6 = arg0.method5227();
            if ((var6 & 0x10) != 0) {
                var6 += arg0.method5227() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x100) != 0) {
                var7 = arg0.method5260();
            }
            if ((var6 & 0x40) != 0) {
                var5.field993 = arg0.method5283();
                if (var5.field976 == 0) {
                    var5.field1016 = var5.field993;
                    var5.field993 = -1;
                }
            }
            if ((var6 & 0x80) != 0) {
                int var8 = arg0.method5267();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg0.method5258();
                client.method1038(var5, var8, var9);
            }
            if ((var6 & 0x2) != 0) {
                var5.field972 = arg0.method5236();
                if (var5.field972.charAt(0) == '~') {
                    var5.field972 = var5.field972.substring(1);
                    class101.method1815(2, var5.field658.method4925(), var5.field972);
                } else if (Statics.field455 == var5) {
                    class101.method1815(2, var5.field658.method4925(), var5.field972);
                }
                var5.field979 = false;
                var5.field997 = 0;
                var5.field977 = 0;
                var5.field981 = 150;
            }
            if ((var6 & 0x200) != 0) {
                var5.field996 = arg0.method5260();
                var5.field1009 = arg0.method5260();
                var5.field1008 = arg0.method5261();
                var5.field1010 = arg0.method5240();
                var5.field967 = arg0.method5283() + client.field671;
                var5.field1012 = arg0.method5265() + client.field671;
                var5.field1007 = arg0.method5283();
                if (var5.field660) {
                    var5.field996 += var5.field634;
                    var5.field1009 += var5.field661;
                    var5.field1008 += var5.field634;
                    var5.field1010 += var5.field661;
                    var5.field976 = 0;
                } else {
                    var5.field996 += var5.field1020[0];
                    var5.field1009 += var5.field1021[0];
                    var5.field1008 += var5.field1020[0];
                    var5.field1010 += var5.field1021[0];
                    var5.field976 = 1;
                }
                var5.field1024 = 0;
            }
            if ((var6 & 0x1) != 0) {
                int var10 = arg0.method5283();
                class239 var11 = (class239) class205.method3095(Statics.method4263(), arg0.method5446());
                boolean var12 = arg0.method5227() == 1;
                int var13 = arg0.method5256();
                int var14 = arg0.field3734;
                if (var5.field658 != null && var5.field635 != null) {
                    boolean var15 = false;
                    if (var11.field3128 && Statics.field2418.method1735(var5.field658)) {
                        var15 = true;
                    }
                    if (!var15 && client.field788 == 0 && !var5.field655) {
                        field1290.field3734 = 0;
                        arg0.method5239(field1290.field3736, 0, var13);
                        field1290.field3734 = 0;
                        String var16 = class306.method5069(class301.method2617(class220.method1950(field1290)));
                        var5.field972 = var16.trim();
                        var5.field997 = var10 >> 8;
                        var5.field977 = var10 & 0xFF;
                        var5.field981 = 150;
                        var5.field979 = var12;
                        var5.field980 = Statics.field455 != var5 && var11.field3128 && client.field756 != "" && var16.toLowerCase().indexOf(client.field756) == -1;
                        int var17;
                        if (var11.field3119) {
                            var17 = var12 ? 91 : 1;
                        } else {
                            var17 = var12 ? 90 : 2;
                        }
                        if (var11.field3123 == -1) {
                            class101.method1815(var17, var5.field658.method4925(), var16);
                        } else {
                            class101.method1815(var17, class91.method534(var11.field3123) + var5.field658.method4925(), var16);
                        }
                    }
                }
                arg0.field3734 = var13 + var14;
            }
            if ((var6 & 0x8) != 0) {
                var5.field991 = arg0.method5283();
                if (var5.field991 == 65535) {
                    var5.field991 = -1;
                }
            }
            if ((var6 & 0x1000) != 0) {
                var5.field1002 = arg0.method5267();
                int var18 = arg0.method5276();
                var5.field1006 = var18 >> 16;
                var5.field988 = (var18 & 0xFFFF) + client.field671;
                var5.field974 = 0;
                var5.field1004 = 0;
                if (var5.field988 > client.field671) {
                    var5.field974 = -1;
                }
                if (var5.field1002 == 65535) {
                    var5.field1002 = -1;
                }
            }
            if ((var6 & 0x400) != 0) {
                for (int var19 = 0; var19 < 3; var19++) {
                    var5.field645[var19] = arg0.method5236();
                }
            }
            if ((var6 & 0x800) != 0) {
                field1279[var4] = arg0.method5260();
            }
            if ((var6 & 0x4) != 0) {
                int var20 = arg0.method5256();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = -1;
                        int var23 = -1;
                        int var24 = -1;
                        int var25 = arg0.method5395();
                        if (var25 == 32767) {
                            var25 = arg0.method5395();
                            var23 = arg0.method5395();
                            var22 = arg0.method5395();
                            var24 = arg0.method5395();
                        } else if (var25 == 32766) {
                            var25 = -1;
                        } else {
                            var23 = arg0.method5395();
                        }
                        int var26 = arg0.method5395();
                        var5.method1620(var25, var23, var22, var24, client.field671, var26);
                    }
                }
                int var27 = arg0.method5227();
                if (var27 > 0) {
                    for (int var28 = 0; var28 < var27; var28++) {
                        int var29 = arg0.method5395();
                        int var30 = arg0.method5395();
                        if (var30 == 32767) {
                            var5.method1618(var29);
                        } else {
                            int var31 = arg0.method5395();
                            int var32 = arg0.method5258();
                            int var33 = var30 > 0 ? arg0.method5256() : var32;
                            var5.method1631(var29, client.field671, var30, var31, var32, var33);
                        }
                    }
                }
            }
            if ((var6 & 0x20) != 0) {
                int var34 = arg0.method5258();
                byte[] var35 = new byte[var34];
                class310 var36 = new class310(var35);
                arg0.method5331(var35, 0, var34);
                field1280[var4] = var36;
                var5.method1123(var36);
            }
            if (var5.field660) {
                if (var7 == 127) {
                    var5.method1133(var5.field634, var5.field661);
                } else {
                    byte var37;
                    if (var7 == -1) {
                        var37 = field1279[var4];
                    } else {
                        var37 = var7;
                    }
                    var5.method1132(var5.field634, var5.field661, var37);
                }
            }
        }
        if (arg0.field3734 - var2 != arg1) {
            throw new RuntimeException(arg0.field3734 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("cr.q(Lkb;I)V")
    public static final void method2146(class309 arg0) {
        int var1 = 0;
        arg0.method5170();
        for (int var2 = 0; var2 < field1281; var2++) {
            int var3 = field1282[var2];
            if ((field1283[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var3] = (byte) (field1283[var3] | 0x2);
                } else {
                    int var4 = arg0.method5171(1);
                    if (var4 == 0) {
                        int var5 = arg0.method5171(2);
                        int var6;
                        if (var5 == 0) {
                            var6 = 0;
                        } else if (var5 == 1) {
                            var6 = arg0.method5171(5);
                        } else if (var5 == 2) {
                            var6 = arg0.method5171(8);
                        } else {
                            var6 = arg0.method5171(11);
                        }
                        var1 = var6;
                        field1283[var3] = (byte) (field1283[var3] | 0x2);
                    } else {
                        method1965(arg0, var3);
                    }
                }
            }
        }
        arg0.method5172();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5170();
        for (int var8 = 0; var8 < field1281; var8++) {
            int var9 = field1282[var8];
            if ((field1283[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var9] = (byte) (field1283[var9] | 0x2);
                } else {
                    int var10 = arg0.method5171(1);
                    if (var10 == 0) {
                        int var11 = arg0.method5171(2);
                        int var12;
                        if (var11 == 0) {
                            var12 = 0;
                        } else if (var11 == 1) {
                            var12 = arg0.method5171(5);
                        } else if (var11 == 2) {
                            var12 = arg0.method5171(8);
                        } else {
                            var12 = arg0.method5171(11);
                        }
                        var1 = var12;
                        field1283[var9] = (byte) (field1283[var9] | 0x2);
                    } else {
                        method1965(arg0, var9);
                    }
                }
            }
        }
        arg0.method5172();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5170();
        for (int var14 = 0; var14 < field1278; var14++) {
            int var15 = field1284[var14];
            if ((field1283[var15] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var15] = (byte) (field1283[var15] | 0x2);
                } else {
                    int var16 = arg0.method5171(1);
                    if (var16 == 0) {
                        int var17 = arg0.method5171(2);
                        int var18;
                        if (var17 == 0) {
                            var18 = 0;
                        } else if (var17 == 1) {
                            var18 = arg0.method5171(5);
                        } else if (var17 == 2) {
                            var18 = arg0.method5171(8);
                        } else {
                            var18 = arg0.method5171(11);
                        }
                        var1 = var18;
                        field1283[var15] = (byte) (field1283[var15] | 0x2);
                    } else if (method3885(arg0, var15)) {
                        field1283[var15] = (byte) (field1283[var15] | 0x2);
                    }
                }
            }
        }
        arg0.method5172();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5170();
        for (int var20 = 0; var20 < field1278; var20++) {
            int var21 = field1284[var20];
            if ((field1283[var21] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var21] = (byte) (field1283[var21] | 0x2);
                } else {
                    int var22 = arg0.method5171(1);
                    if (var22 == 0) {
                        int var23 = arg0.method5171(2);
                        int var24;
                        if (var23 == 0) {
                            var24 = 0;
                        } else if (var23 == 1) {
                            var24 = arg0.method5171(5);
                        } else if (var23 == 2) {
                            var24 = arg0.method5171(8);
                        } else {
                            var24 = arg0.method5171(11);
                        }
                        var1 = var24;
                        field1283[var21] = (byte) (field1283[var21] | 0x2);
                    } else if (method3885(arg0, var21)) {
                        field1283[var21] = (byte) (field1283[var21] | 0x2);
                    }
                }
            }
        }
        arg0.method5172();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1281 = 0;
        field1278 = 0;
        for (int var26 = 1; var26 < 2048; var26++) {
            field1283[var26] = (byte) (field1283[var26] >> 1);
            class76 var27 = client.field790[var26];
            if (var27 == null) {
                field1284[++field1278 - 1] = var26;
            } else {
                field1282[++field1281 - 1] = var26;
            }
        }
    }

    @ObfuscatedName("cq.j(Lkb;II)V")
    public static void method1965(class309 arg0, int arg1) {
        boolean var2 = arg0.method5171(1) == 1;
        if (var2) {
            field1289[++field1277 - 1] = arg1;
        }
        int var3 = arg0.method5171(2);
        class76 var4 = client.field790[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field660 = false;
            } else if (client.field791 == arg1) {
                throw new RuntimeException();
            } else {
                field1276[arg1] = (Statics.field1275 + var4.field1021[0] >> 13) + (Statics.field2130 + var4.field1020[0] >> 13 << 14) + (var4.field656 << 28);
                if (var4.field993 == -1) {
                    field1286[arg1] = var4.field1016;
                } else {
                    field1286[arg1] = var4.field993;
                }
                field1287[arg1] = var4.field991;
                client.field790[arg1] = null;
                if (arg0.method5171(1) != 0) {
                    method3885(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5171(3);
            int var6 = var4.field1020[0];
            int var7 = var4.field1021[0];
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
            if (client.field791 == arg1 && var4.field983 < 1536 || var4.field965 < 1536 || var4.field983 >= 11776 || var4.field965 >= 11776) {
                var4.method1133(var6, var7);
                var4.field660 = false;
            } else if (var2) {
                var4.field660 = true;
                var4.field634 = var6;
                var4.field661 = var7;
            } else {
                var4.field660 = false;
                var4.method1132(var6, var7, field1279[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5171(4);
            int var9 = var4.field1020[0];
            int var10 = var4.field1021[0];
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
            if (client.field791 == arg1 && var4.field983 < 1536 || var4.field965 < 1536 || var4.field983 >= 11776 || var4.field965 >= 11776) {
                var4.method1133(var9, var10);
                var4.field660 = false;
            } else if (var2) {
                var4.field660 = true;
                var4.field634 = var9;
                var4.field661 = var10;
            } else {
                var4.field660 = false;
                var4.method1132(var9, var10, field1279[arg1]);
            }
        } else {
            int var11 = arg0.method5171(1);
            if (var11 == 0) {
                int var12 = arg0.method5171(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1020[0] + var14;
                int var17 = var4.field1021[0] + var15;
                if (client.field791 == arg1 && var4.field983 < 1536 || var4.field965 < 1536 || var4.field983 >= 11776 || var4.field965 >= 11776) {
                    var4.method1133(var16, var17);
                    var4.field660 = false;
                } else if (var2) {
                    var4.field660 = true;
                    var4.field634 = var16;
                    var4.field661 = var17;
                } else {
                    var4.field660 = false;
                    var4.method1132(var16, var17, field1279[arg1]);
                }
                var4.field656 = (byte) (var4.field656 + var13 & 0x3);
                if (client.field791 == arg1) {
                    Statics.field1576 = var4.field656;
                }
            } else {
                int var18 = arg0.method5171(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2130 + var4.field1020[0] + var20 & 0x3FFF) - Statics.field2130;
                int var23 = (Statics.field1275 + var4.field1021[0] + var21 & 0x3FFF) - Statics.field1275;
                if (client.field791 == arg1 && var4.field983 < 1536 || var4.field965 < 1536 || var4.field983 >= 11776 || var4.field965 >= 11776) {
                    var4.method1133(var22, var23);
                    var4.field660 = false;
                } else if (var2) {
                    var4.field660 = true;
                    var4.field634 = var22;
                    var4.field661 = var23;
                } else {
                    var4.field660 = false;
                    var4.method1132(var22, var23, field1279[arg1]);
                }
                var4.field656 = (byte) (var4.field656 + var19 & 0x3);
                if (client.field791 == arg1) {
                    Statics.field1576 = var4.field656;
                }
            }
        }
    }

    @ObfuscatedName("in.p(Lkb;II)Z")
    public static boolean method3885(class309 arg0, int arg1) {
        int var2 = arg0.method5171(2);
        if (var2 == 0) {
            if (arg0.method5171(1) != 0) {
                method3885(arg0, arg1);
            }
            int var3 = arg0.method5171(13);
            int var4 = arg0.method5171(13);
            boolean var5 = arg0.method5171(1) == 1;
            if (var5) {
                field1289[++field1277 - 1] = arg1;
            }
            if (client.field790[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field790[arg1] = new class76();
            var6.field657 = arg1;
            if (field1280[arg1] != null) {
                var6.method1123(field1280[arg1]);
            }
            var6.field1016 = field1286[arg1];
            var6.field991 = field1287[arg1];
            int var7 = field1276[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1022[0] = field1279[arg1];
            var6.field656 = (byte) var8;
            var6.method1133((var9 << 13) + var3 - Statics.field2130, (var10 << 13) + var4 - Statics.field1275);
            var6.field660 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5171(2);
            int var12 = field1276[arg1];
            field1276[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5171(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1276[arg1];
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
            field1276[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5171(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1276[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1276[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cv.g(S)V")
    public static void method1949() {
        field1281 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1280[var0] = null;
            field1279[var0] = 1;
        }
    }
}
