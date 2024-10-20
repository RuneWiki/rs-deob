package deob;

@ObfuscatedName("co")
public class class89 {

    @ObfuscatedName("co.l")
    public static byte[] field1210 = new byte[2048];

    @ObfuscatedName("co.g")
    public static byte[] field1212 = new byte[2048];

    @ObfuscatedName("co.b")
    public static class190[] field1218 = new class190[2048];

    @ObfuscatedName("co.a")
    public static int field1213 = 0;

    @ObfuscatedName("co.c")
    public static int[] field1214 = new int[2048];

    @ObfuscatedName("co.z")
    public static int field1215 = 0;

    @ObfuscatedName("co.j")
    public static int[] field1216 = new int[2048];

    @ObfuscatedName("co.d")
    public static int[] field1221 = new int[2048];

    @ObfuscatedName("co.t")
    public static int[] field1219 = new int[2048];

    @ObfuscatedName("co.f")
    public static int[] field1217 = new int[2048];

    @ObfuscatedName("co.i")
    public static int field1220 = 0;

    @ObfuscatedName("co.m")
    public static int[] field1209 = new int[2048];

    @ObfuscatedName("co.v")
    public static class190 field1222 = new class190(new byte[5000]);

    public class89() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ij.n(Lgh;B)V")
    public static final void method4521(class197 arg0) {
        arg0.method3744();
        int var1 = client.field747;
        class67 var2 = Statics.field218 = client.field746[var1] = new class67();
        var2.field615 = var1;
        int var3 = arg0.method3745(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field977[0] = var5 - Statics.field512;
        var2.field949 = (var2.field977[0] << 7) + (var2.method1100() << 6);
        var2.field982[0] = var6 - Statics.field318;
        var2.field922 = (var2.field982[0] << 7) + (var2.method1100() << 6);
        Statics.field66 = var2.field614 = var4;
        if (field1218[var1] != null) {
            var2.method1093(field1218[var1]);
        }
        field1213 = 0;
        field1214[++field1213 - 1] = var1;
        field1210[var1] = 0;
        field1215 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3745(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1221[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1219[var7] = 0;
                field1217[var7] = -1;
                field1216[++field1215 - 1] = var7;
                field1210[var7] = 0;
            }
        }
        arg0.method3746();
    }

    @ObfuscatedName("iv.h(Lgh;II)V")
    public static final void method4438(class197 arg0, int arg1) {
        int var2 = arg0.field2423;
        field1220 = 0;
        int var3 = 0;
        arg0.method3744();
        for (int var4 = 0; var4 < field1213; var4++) {
            int var5 = field1214[var4];
            if ((field1210[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1210[var5] = (byte) (field1210[var5] | 0x2);
                } else {
                    int var6 = arg0.method3745(1);
                    if (var6 == 0) {
                        var3 = method4443(arg0);
                        field1210[var5] = (byte) (field1210[var5] | 0x2);
                    } else {
                        method563(arg0, var5);
                    }
                }
            }
        }
        arg0.method3746();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3744();
        for (int var7 = 0; var7 < field1213; var7++) {
            int var8 = field1214[var7];
            if ((field1210[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1210[var8] = (byte) (field1210[var8] | 0x2);
                } else {
                    int var9 = arg0.method3745(1);
                    if (var9 == 0) {
                        var3 = method4443(arg0);
                        field1210[var8] = (byte) (field1210[var8] | 0x2);
                    } else {
                        method563(arg0, var8);
                    }
                }
            }
        }
        arg0.method3746();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3744();
        for (int var10 = 0; var10 < field1215; var10++) {
            int var11 = field1216[var10];
            if ((field1210[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1210[var11] = (byte) (field1210[var11] | 0x2);
                } else {
                    int var12 = arg0.method3745(1);
                    if (var12 == 0) {
                        var3 = method4443(arg0);
                        field1210[var11] = (byte) (field1210[var11] | 0x2);
                    } else if (method1575(arg0, var11)) {
                        field1210[var11] = (byte) (field1210[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3746();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3744();
        for (int var13 = 0; var13 < field1215; var13++) {
            int var14 = field1216[var13];
            if ((field1210[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1210[var14] = (byte) (field1210[var14] | 0x2);
                } else {
                    int var15 = arg0.method3745(1);
                    if (var15 == 0) {
                        var3 = method4443(arg0);
                        field1210[var14] = (byte) (field1210[var14] | 0x2);
                    } else if (method1575(arg0, var14)) {
                        field1210[var14] = (byte) (field1210[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3746();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1213 = 0;
        field1215 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1210[var16] = (byte) (field1210[var16] >> 1);
            class67 var17 = client.field746[var16];
            if (var17 == null) {
                field1216[++field1215 - 1] = var16;
            } else {
                field1214[++field1213 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1220; var18++) {
            int var19 = field1209[var18];
            class67 var20 = client.field746[var19];
            int var21 = arg0.method3511();
            if ((var21 & 0x8) != 0) {
                var21 += arg0.method3511() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x40) != 0) {
                int var23 = arg0.method3540();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = arg0.method3566();
                        if (var28 == 32767) {
                            var28 = arg0.method3566();
                            var26 = arg0.method3566();
                            var25 = arg0.method3566();
                            var27 = arg0.method3566();
                        } else if (var28 == 32766) {
                            var28 = -1;
                        } else {
                            var26 = arg0.method3566();
                        }
                        int var29 = arg0.method3566();
                        var20.method1573(var28, var26, var25, var27, client.field899, var29);
                    }
                }
                int var30 = arg0.method3621();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = arg0.method3566();
                        int var33 = arg0.method3566();
                        if (var33 == 32767) {
                            var20.method1577(var32);
                        } else {
                            int var34 = arg0.method3566();
                            int var35 = arg0.method3540();
                            int var36 = var33 > 0 ? arg0.method3511() : var35;
                            var20.method1576(var32, client.field899, var33, var34, var35, var36);
                        }
                    }
                }
            }
            if ((var21 & 0x200) != 0) {
                var20.field959 = arg0.method3662();
                int var37 = arg0.method3559();
                var20.field966 = var37 >> 16;
                var20.field981 = (var37 & 0xFFFF) + client.field899;
                var20.field960 = 0;
                var20.field961 = 0;
                if (var20.field981 > client.field899) {
                    var20.field960 = -1;
                }
                if (var20.field959 == 65535) {
                    var20.field959 = -1;
                }
            }
            if ((var21 & 0x1000) != 0) {
                var22 = arg0.method3543();
            }
            if ((var21 & 0x400) != 0) {
                var20.field964 = arg0.method3545();
                var20.field943 = arg0.method3543();
                var20.field965 = arg0.method3543();
                var20.field967 = arg0.method3545();
                var20.field968 = arg0.method3550() + client.field899;
                var20.field933 = arg0.method3668() + client.field899;
                var20.field970 = arg0.method3513();
                if (var20.field618) {
                    var20.field964 += var20.field619;
                    var20.field943 += var20.field620;
                    var20.field965 += var20.field619;
                    var20.field967 += var20.field620;
                    var20.field957 = 0;
                } else {
                    var20.field964 += var20.field977[0];
                    var20.field943 += var20.field982[0];
                    var20.field965 += var20.field977[0];
                    var20.field967 += var20.field982[0];
                    var20.field957 = 1;
                }
                var20.field921 = 0;
            }
            if ((var21 & 0x20) != 0) {
                var20.field935 = arg0.method3520();
                if (var20.field935.charAt(0) == '~') {
                    var20.field935 = var20.field935.substring(1);
                    class91.method1872(2, var20.field595.method5261(), var20.field935);
                } else if (Statics.field218 == var20) {
                    class91.method1872(2, var20.field595.method5261(), var20.field935);
                }
                var20.field936 = false;
                var20.field939 = 0;
                var20.field940 = 0;
                var20.field978 = 150;
            }
            if ((var21 & 0x4) != 0) {
                var20.field932 = arg0.method3668();
                if (var20.field957 == 0) {
                    var20.field973 = var20.field932;
                    var20.field932 = -1;
                }
            }
            if ((var21 & 0x1) != 0) {
                int var38 = arg0.method3542();
                byte[] var39 = new byte[var38];
                class190 var40 = new class190(var39);
                arg0.method3587(var39, 0, var38);
                field1218[var19] = var40;
                var20.method1093(var40);
            }
            if ((var21 & 0x2) != 0) {
                var20.field930 = arg0.method3550();
                if (var20.field930 == 65535) {
                    var20.field930 = -1;
                }
            }
            if ((var21 & 0x800) != 0) {
                field1212[var19] = arg0.method3543();
            }
            if ((var21 & 0x10) != 0) {
                int var41 = arg0.method3550();
                class249 var42 = (class249) class185.method3726(class249.method4437(), arg0.method3511());
                boolean var43 = arg0.method3621() == 1;
                int var44 = arg0.method3511();
                int var45 = arg0.field2423;
                if (var20.field595 != null && var20.field593 != null) {
                    boolean var46 = false;
                    if (var42.field3186 && Statics.field2434.method1694(var20.field595)) {
                        var46 = true;
                    }
                    if (!var46 && client.field744 == 0 && !var20.field607) {
                        field1222.field2423 = 0;
                        arg0.method3523(field1222.field2424, 0, var44);
                        field1222.field2423 = 0;
                        String var47 = class305.method5400(class311.method3802(class306.method83(field1222)));
                        var20.field935 = var47.trim();
                        var20.field939 = var41 >> 8;
                        var20.field940 = var41 & 0xFF;
                        var20.field978 = 150;
                        var20.field936 = var43;
                        var20.field938 = Statics.field218 != var20 && var42.field3186 && client.field859 != "" && var47.toLowerCase().indexOf(client.field859) == -1;
                        int var48;
                        if (var42.field3188) {
                            var48 = var43 ? 91 : 1;
                        } else {
                            var48 = var43 ? 90 : 2;
                        }
                        if (var42.field3193 == -1) {
                            class91.method1872(var48, var20.field595.method5261(), var47);
                        } else {
                            class91.method1872(var48, class81.method158(var42.field3193) + var20.field595.method5261(), var47);
                        }
                    }
                }
                arg0.field2423 = var44 + var45;
            }
            if ((var21 & 0x100) != 0) {
                for (int var49 = 0; var49 < 3; var49++) {
                    var20.field611[var49] = arg0.method3520();
                }
            }
            if ((var21 & 0x80) != 0) {
                int var50 = arg0.method3513();
                if (var50 == 65535) {
                    var50 = -1;
                }
                int var51 = arg0.method3511();
                client.method1007(var20, var50, var51);
            }
            if (var20.field618) {
                if (var22 == 127) {
                    var20.method1103(var20.field619, var20.field620);
                } else {
                    byte var52;
                    if (var22 == -1) {
                        var52 = field1212[var19];
                    } else {
                        var52 = var22;
                    }
                    var20.method1102(var20.field619, var20.field620, var52);
                }
            }
        }
        if (arg0.field2423 - var2 != arg1) {
            throw new RuntimeException(arg0.field2423 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ix.l(Lgh;I)I")
    public static int method4443(class197 arg0) {
        int var1 = arg0.method3745(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3745(5);
        } else if (var1 == 2) {
            var2 = arg0.method3745(8);
        } else {
            var2 = arg0.method3745(11);
        }
        return var2;
    }

    @ObfuscatedName("ao.g(Lgh;II)V")
    public static void method563(class197 arg0, int arg1) {
        boolean var2 = arg0.method3745(1) == 1;
        if (var2) {
            field1209[++field1220 - 1] = arg1;
        }
        int var3 = arg0.method3745(2);
        class67 var4 = client.field746[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field618 = false;
            } else if (client.field747 == arg1) {
                throw new RuntimeException();
            } else {
                field1221[arg1] = (Statics.field318 + var4.field982[0] >> 13) + (Statics.field512 + var4.field977[0] >> 13 << 14) + (var4.field614 << 28);
                if (var4.field932 == -1) {
                    field1219[arg1] = var4.field973;
                } else {
                    field1219[arg1] = var4.field932;
                }
                field1217[arg1] = var4.field930;
                client.field746[arg1] = null;
                if (arg0.method3745(1) != 0) {
                    method1575(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3745(3);
            int var6 = var4.field977[0];
            int var7 = var4.field982[0];
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
            if (client.field747 == arg1 && var4.field949 < 1536 || var4.field922 < 1536 || var4.field949 >= 11776 || var4.field922 >= 11776) {
                var4.method1103(var6, var7);
                var4.field618 = false;
            } else if (var2) {
                var4.field618 = true;
                var4.field619 = var6;
                var4.field620 = var7;
            } else {
                var4.field618 = false;
                var4.method1102(var6, var7, field1212[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3745(4);
            int var9 = var4.field977[0];
            int var10 = var4.field982[0];
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
            if (client.field747 == arg1 && var4.field949 < 1536 || var4.field922 < 1536 || var4.field949 >= 11776 || var4.field922 >= 11776) {
                var4.method1103(var9, var10);
                var4.field618 = false;
            } else if (var2) {
                var4.field618 = true;
                var4.field619 = var9;
                var4.field620 = var10;
            } else {
                var4.field618 = false;
                var4.method1102(var9, var10, field1212[arg1]);
            }
        } else {
            int var11 = arg0.method3745(1);
            if (var11 == 0) {
                int var12 = arg0.method3745(12);
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
                int var17 = var4.field982[0] + var15;
                if (client.field747 == arg1 && var4.field949 < 1536 || var4.field922 < 1536 || var4.field949 >= 11776 || var4.field922 >= 11776) {
                    var4.method1103(var16, var17);
                    var4.field618 = false;
                } else if (var2) {
                    var4.field618 = true;
                    var4.field619 = var16;
                    var4.field620 = var17;
                } else {
                    var4.field618 = false;
                    var4.method1102(var16, var17, field1212[arg1]);
                }
                var4.field614 = (byte) (var4.field614 + var13 & 0x3);
                if (client.field747 == arg1) {
                    Statics.field66 = var4.field614;
                }
            } else {
                int var18 = arg0.method3745(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field512 + var4.field977[0] + var20 & 0x3FFF) - Statics.field512;
                int var23 = (Statics.field318 + var4.field982[0] + var21 & 0x3FFF) - Statics.field318;
                if (client.field747 == arg1 && var4.field949 < 1536 || var4.field922 < 1536 || var4.field949 >= 11776 || var4.field922 >= 11776) {
                    var4.method1103(var22, var23);
                    var4.field618 = false;
                } else if (var2) {
                    var4.field618 = true;
                    var4.field619 = var22;
                    var4.field620 = var23;
                } else {
                    var4.field618 = false;
                    var4.method1102(var22, var23, field1212[arg1]);
                }
                var4.field614 = (byte) (var4.field614 + var19 & 0x3);
                if (client.field747 == arg1) {
                    Statics.field66 = var4.field614;
                }
            }
        }
    }

    @ObfuscatedName("bw.b(Lgh;II)Z")
    public static boolean method1575(class197 arg0, int arg1) {
        int var2 = arg0.method3745(2);
        if (var2 == 0) {
            if (arg0.method3745(1) != 0) {
                method1575(arg0, arg1);
            }
            int var3 = arg0.method3745(13);
            int var4 = arg0.method3745(13);
            boolean var5 = arg0.method3745(1) == 1;
            if (var5) {
                field1209[++field1220 - 1] = arg1;
            }
            if (client.field746[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field746[arg1] = new class67();
            var6.field615 = arg1;
            if (field1218[arg1] != null) {
                var6.method1093(field1218[arg1]);
            }
            var6.field973 = field1219[arg1];
            var6.field930 = field1217[arg1];
            int var7 = field1221[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field979[0] = field1212[arg1];
            var6.field614 = (byte) var8;
            var6.method1103((var9 << 13) + var3 - Statics.field512, (var10 << 13) + var4 - Statics.field318);
            var6.field618 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3745(2);
            int var12 = field1221[arg1];
            field1221[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3745(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1221[arg1];
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
            field1221[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3745(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1221[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1221[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
