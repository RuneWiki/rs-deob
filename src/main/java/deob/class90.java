package deob;

@ObfuscatedName("cx")
public class class90 {

    @ObfuscatedName("cx.y")
    public static byte[] field1231 = new byte[2048];

    @ObfuscatedName("cx.w")
    public static byte[] field1232 = new byte[2048];

    @ObfuscatedName("cx.p")
    public static class300[] field1229 = new class300[2048];

    @ObfuscatedName("cx.b")
    public static int field1234 = 0;

    @ObfuscatedName("cx.e")
    public static int[] field1235 = new int[2048];

    @ObfuscatedName("cx.x")
    public static int field1237 = 0;

    @ObfuscatedName("cx.a")
    public static int[] field1236 = new int[2048];

    @ObfuscatedName("cx.d")
    public static int[] field1238 = new int[2048];

    @ObfuscatedName("cx.c")
    public static int[] field1239 = new int[2048];

    @ObfuscatedName("cx.o")
    public static int[] field1240 = new int[2048];

    @ObfuscatedName("cx.v")
    public static int field1233 = 0;

    @ObfuscatedName("cx.k")
    public static int[] field1242 = new int[2048];

    @ObfuscatedName("cx.s")
    public static class300 field1243 = new class300(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.f(Lkl;I)V")
    public static final void method1855(class299 arg0) {
        arg0.method5062();
        int var1 = client.field676;
        class67 var2 = Statics.field585 = client.field745[var1] = new class67();
        var2.field616 = var1;
        int var3 = arg0.method5063(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field978[0] = var5 - Statics.field2477;
        var2.field937 = (var2.field978[0] << 7) + (var2.method1123() << 6);
        var2.field979[0] = var6 - Statics.field562;
        var2.field923 = (var2.field979[0] << 7) + (var2.method1123() << 6);
        Statics.field1929 = var2.field613 = var4;
        if (field1229[var1] != null) {
            var2.method1092(field1229[var1]);
        }
        field1234 = 0;
        field1235[++field1234 - 1] = var1;
        field1231[var1] = 0;
        field1237 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5063(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1238[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1239[var7] = 0;
                field1240[var7] = -1;
                field1236[++field1237 - 1] = var7;
                field1231[var7] = 0;
            }
        }
        arg0.method5064();
    }

    @ObfuscatedName("ba.i(Lkl;IB)V")
    public static final void method1088(class299 arg0, int arg1) {
        int var2 = arg0.field3703;
        field1233 = 0;
        int var3 = 0;
        arg0.method5062();
        for (int var4 = 0; var4 < field1234; var4++) {
            int var5 = field1235[var4];
            if ((field1231[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1231[var5] = (byte) (field1231[var5] | 0x2);
                } else {
                    int var6 = arg0.method5063(1);
                    if (var6 == 0) {
                        int var7 = arg0.method5063(2);
                        int var8;
                        if (var7 == 0) {
                            var8 = 0;
                        } else if (var7 == 1) {
                            var8 = arg0.method5063(5);
                        } else if (var7 == 2) {
                            var8 = arg0.method5063(8);
                        } else {
                            var8 = arg0.method5063(11);
                        }
                        var3 = var8;
                        field1231[var5] = (byte) (field1231[var5] | 0x2);
                    } else {
                        method576(arg0, var5);
                    }
                }
            }
        }
        arg0.method5064();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5062();
        for (int var10 = 0; var10 < field1234; var10++) {
            int var11 = field1235[var10];
            if ((field1231[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1231[var11] = (byte) (field1231[var11] | 0x2);
                } else {
                    int var12 = arg0.method5063(1);
                    if (var12 == 0) {
                        int var13 = arg0.method5063(2);
                        int var14;
                        if (var13 == 0) {
                            var14 = 0;
                        } else if (var13 == 1) {
                            var14 = arg0.method5063(5);
                        } else if (var13 == 2) {
                            var14 = arg0.method5063(8);
                        } else {
                            var14 = arg0.method5063(11);
                        }
                        var3 = var14;
                        field1231[var11] = (byte) (field1231[var11] | 0x2);
                    } else {
                        method576(arg0, var11);
                    }
                }
            }
        }
        arg0.method5064();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5062();
        for (int var16 = 0; var16 < field1237; var16++) {
            int var17 = field1236[var16];
            if ((field1231[var17] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1231[var17] = (byte) (field1231[var17] | 0x2);
                } else {
                    int var18 = arg0.method5063(1);
                    if (var18 == 0) {
                        int var19 = arg0.method5063(2);
                        int var20;
                        if (var19 == 0) {
                            var20 = 0;
                        } else if (var19 == 1) {
                            var20 = arg0.method5063(5);
                        } else if (var19 == 2) {
                            var20 = arg0.method5063(8);
                        } else {
                            var20 = arg0.method5063(11);
                        }
                        var3 = var20;
                        field1231[var17] = (byte) (field1231[var17] | 0x2);
                    } else if (method3723(arg0, var17)) {
                        field1231[var17] = (byte) (field1231[var17] | 0x2);
                    }
                }
            }
        }
        arg0.method5064();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5062();
        for (int var22 = 0; var22 < field1237; var22++) {
            int var23 = field1236[var22];
            if ((field1231[var23] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1231[var23] = (byte) (field1231[var23] | 0x2);
                } else {
                    int var24 = arg0.method5063(1);
                    if (var24 == 0) {
                        int var25 = arg0.method5063(2);
                        int var26;
                        if (var25 == 0) {
                            var26 = 0;
                        } else if (var25 == 1) {
                            var26 = arg0.method5063(5);
                        } else if (var25 == 2) {
                            var26 = arg0.method5063(8);
                        } else {
                            var26 = arg0.method5063(11);
                        }
                        var3 = var26;
                        field1231[var23] = (byte) (field1231[var23] | 0x2);
                    } else if (method3723(arg0, var23)) {
                        field1231[var23] = (byte) (field1231[var23] | 0x2);
                    }
                }
            }
        }
        arg0.method5064();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1234 = 0;
        field1237 = 0;
        for (int var28 = 1; var28 < 2048; var28++) {
            field1231[var28] = (byte) (field1231[var28] >> 1);
            class67 var29 = client.field745[var28];
            if (var29 == null) {
                field1236[++field1237 - 1] = var28;
            } else {
                field1235[++field1234 - 1] = var28;
            }
        }
        for (int var30 = 0; var30 < field1233; var30++) {
            int var31 = field1242[var30];
            class67 var32 = client.field745[var31];
            int var33 = arg0.method5110();
            if ((var33 & 0x80) != 0) {
                var33 += arg0.method5110() << 8;
            }
            byte var34 = -1;
            if ((var33 & 0x4) != 0) {
                int var35 = arg0.method5110();
                if (var35 > 0) {
                    for (int var36 = 0; var36 < var35; var36++) {
                        int var37 = -1;
                        int var38 = -1;
                        int var39 = -1;
                        int var40 = arg0.method5124();
                        if (var40 == 32767) {
                            var40 = arg0.method5124();
                            var38 = arg0.method5124();
                            var37 = arg0.method5124();
                            var39 = arg0.method5124();
                        } else if (var40 == 32766) {
                            var40 = -1;
                        } else {
                            var38 = arg0.method5124();
                        }
                        int var41 = arg0.method5124();
                        var32.method1581(var40, var38, var37, var39, client.field641, var41);
                    }
                }
                int var42 = arg0.method5139();
                if (var42 > 0) {
                    for (int var43 = 0; var43 < var42; var43++) {
                        int var44 = arg0.method5124();
                        int var45 = arg0.method5124();
                        if (var45 == 32767) {
                            var32.method1578(var44);
                        } else {
                            int var46 = arg0.method5124();
                            int var47 = arg0.method5139();
                            int var48 = var45 > 0 ? arg0.method5195() : var47;
                            var32.method1575(var44, client.field641, var45, var46, var47, var48);
                        }
                    }
                }
            }
            if ((var33 & 0x200) != 0) {
                field1232[var31] = arg0.method5144();
            }
            if ((var33 & 0x1000) != 0) {
                var32.field982 = arg0.method5112();
                int var49 = arg0.method5158();
                var32.field964 = var49 >> 16;
                var32.field944 = (var49 & 0xFFFF) + client.field641;
                var32.field954 = 0;
                var32.field962 = 0;
                if (var32.field944 > client.field641) {
                    var32.field954 = -1;
                }
                if (var32.field982 == 65535) {
                    var32.field982 = -1;
                }
            }
            if ((var33 & 0x20) != 0) {
                var32.field949 = arg0.method5150();
                if (var32.field949 == 65535) {
                    var32.field949 = -1;
                }
            }
            if ((var33 & 0x40) != 0) {
                int var50 = arg0.method5150();
                class229 var51 = (class229) class196.method2065(class229.method3544(), arg0.method5139());
                boolean var52 = arg0.method5139() == 1;
                int var53 = arg0.method5195();
                int var54 = arg0.field3703;
                if (var32.field605 != null && var32.field595 != null) {
                    boolean var55 = false;
                    if (var51.field3076 && Statics.field586.method1682(var32.field605)) {
                        var55 = true;
                    }
                    if (!var55 && client.field679 == 0 && !var32.field599) {
                        field1243.field3703 = 0;
                        arg0.method5307(field1243.field3704, 0, var53);
                        field1243.field3703 = 0;
                        String var56 = class295.method4965(class291.method4809(class207.method1858(field1243)));
                        var32.field936 = var56.trim();
                        var32.field965 = var50 >> 8;
                        var32.field941 = var50 & 0xFF;
                        var32.field939 = 150;
                        var32.field932 = var52;
                        var32.field938 = Statics.field585 != var32 && var51.field3076 && client.field847 != "" && var56.toLowerCase().indexOf(client.field847) == -1;
                        int var57;
                        if (var51.field3075) {
                            var57 = var52 ? 91 : 1;
                        } else {
                            var57 = var52 ? 90 : 2;
                        }
                        if (var51.field3074 == -1) {
                            class92.method1894(var57, var32.field605.method4822(), var56);
                        } else {
                            class92.method1894(var57, class82.method2079(var51.field3074) + var32.field605.method4822(), var56);
                        }
                    }
                }
                arg0.field3703 = var53 + var54;
            }
            if ((var33 & 0x1) != 0) {
                var32.field961 = arg0.method5112();
                if (var32.field977 == 0) {
                    var32.field974 = var32.field961;
                    var32.field961 = -1;
                }
            }
            if ((var33 & 0x800) != 0) {
                var34 = arg0.method5297();
            }
            if ((var33 & 0x8) != 0) {
                int var58 = arg0.method5139();
                byte[] var59 = new byte[var58];
                class300 var60 = new class300(var59);
                arg0.method5160(var59, 0, var58);
                field1229[var31] = var60;
                var32.method1092(var60);
            }
            if ((var33 & 0x2) != 0) {
                int var61 = arg0.method5149();
                if (var61 == 65535) {
                    var61 = -1;
                }
                int var62 = arg0.method5242();
                client.method3083(var32, var61, var62);
            }
            if ((var33 & 0x100) != 0) {
                var32.field922 = arg0.method5144();
                var32.field967 = arg0.method5144();
                var32.field966 = arg0.method5144();
                var32.field930 = arg0.method5297();
                var32.field951 = arg0.method5112() + client.field641;
                var32.field970 = arg0.method5290() + client.field641;
                var32.field971 = arg0.method5150();
                if (var32.field617) {
                    var32.field922 += var32.field612;
                    var32.field967 += var32.field592;
                    var32.field966 += var32.field612;
                    var32.field930 += var32.field592;
                    var32.field977 = 0;
                } else {
                    var32.field922 += var32.field978[0];
                    var32.field967 += var32.field979[0];
                    var32.field966 += var32.field978[0];
                    var32.field930 += var32.field979[0];
                    var32.field977 = 1;
                }
                var32.field927 = 0;
            }
            if ((var33 & 0x10) != 0) {
                var32.field936 = arg0.method5119();
                if (var32.field936.charAt(0) == '~') {
                    var32.field936 = var32.field936.substring(1);
                    class92.method1894(2, var32.field605.method4822(), var32.field936);
                } else if (Statics.field585 == var32) {
                    class92.method1894(2, var32.field605.method4822(), var32.field936);
                }
                var32.field932 = false;
                var32.field965 = 0;
                var32.field941 = 0;
                var32.field939 = 150;
            }
            if ((var33 & 0x400) != 0) {
                for (int var63 = 0; var63 < 3; var63++) {
                    var32.field596[var63] = arg0.method5119();
                }
            }
            if (var32.field617) {
                if (var34 == 127) {
                    var32.method1103(var32.field612, var32.field592);
                } else {
                    byte var64;
                    if (var34 == -1) {
                        var64 = field1232[var31];
                    } else {
                        var64 = var34;
                    }
                    var32.method1120(var32.field612, var32.field592, var64);
                }
            }
        }
        if (arg0.field3703 - var2 != arg1) {
            throw new RuntimeException(arg0.field3703 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ay.y(Lkl;II)V")
    public static void method576(class299 arg0, int arg1) {
        boolean var2 = arg0.method5063(1) == 1;
        if (var2) {
            field1242[++field1233 - 1] = arg1;
        }
        int var3 = arg0.method5063(2);
        class67 var4 = client.field745[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field617 = false;
            } else if (client.field676 == arg1) {
                throw new RuntimeException();
            } else {
                field1238[arg1] = (Statics.field562 + var4.field979[0] >> 13) + (Statics.field2477 + var4.field978[0] >> 13 << 14) + (var4.field613 << 28);
                if (var4.field961 == -1) {
                    field1239[arg1] = var4.field974;
                } else {
                    field1239[arg1] = var4.field961;
                }
                field1240[arg1] = var4.field949;
                client.field745[arg1] = null;
                if (arg0.method5063(1) != 0) {
                    method3723(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5063(3);
            int var6 = var4.field978[0];
            int var7 = var4.field979[0];
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
            if (client.field676 == arg1 && var4.field937 < 1536 || var4.field923 < 1536 || var4.field937 >= 11776 || var4.field923 >= 11776) {
                var4.method1103(var6, var7);
                var4.field617 = false;
            } else if (var2) {
                var4.field617 = true;
                var4.field612 = var6;
                var4.field592 = var7;
            } else {
                var4.field617 = false;
                var4.method1120(var6, var7, field1232[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5063(4);
            int var9 = var4.field978[0];
            int var10 = var4.field979[0];
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
            if (client.field676 == arg1 && var4.field937 < 1536 || var4.field923 < 1536 || var4.field937 >= 11776 || var4.field923 >= 11776) {
                var4.method1103(var9, var10);
                var4.field617 = false;
            } else if (var2) {
                var4.field617 = true;
                var4.field612 = var9;
                var4.field592 = var10;
            } else {
                var4.field617 = false;
                var4.method1120(var9, var10, field1232[arg1]);
            }
        } else {
            int var11 = arg0.method5063(1);
            if (var11 == 0) {
                int var12 = arg0.method5063(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field978[0] + var14;
                int var17 = var4.field979[0] + var15;
                if (client.field676 == arg1 && var4.field937 < 1536 || var4.field923 < 1536 || var4.field937 >= 11776 || var4.field923 >= 11776) {
                    var4.method1103(var16, var17);
                    var4.field617 = false;
                } else if (var2) {
                    var4.field617 = true;
                    var4.field612 = var16;
                    var4.field592 = var17;
                } else {
                    var4.field617 = false;
                    var4.method1120(var16, var17, field1232[arg1]);
                }
                var4.field613 = (byte) (var4.field613 + var13 & 0x3);
                if (client.field676 == arg1) {
                    Statics.field1929 = var4.field613;
                }
            } else {
                int var18 = arg0.method5063(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2477 + var4.field978[0] + var20 & 0x3FFF) - Statics.field2477;
                int var23 = (Statics.field562 + var4.field979[0] + var21 & 0x3FFF) - Statics.field562;
                if (client.field676 == arg1 && var4.field937 < 1536 || var4.field923 < 1536 || var4.field937 >= 11776 || var4.field923 >= 11776) {
                    var4.method1103(var22, var23);
                    var4.field617 = false;
                } else if (var2) {
                    var4.field617 = true;
                    var4.field612 = var22;
                    var4.field592 = var23;
                } else {
                    var4.field617 = false;
                    var4.method1120(var22, var23, field1232[arg1]);
                }
                var4.field613 = (byte) (var4.field613 + var19 & 0x3);
                if (client.field676 == arg1) {
                    Statics.field1929 = var4.field613;
                }
            }
        }
    }

    @ObfuscatedName("hs.w(Lkl;IB)Z")
    public static boolean method3723(class299 arg0, int arg1) {
        int var2 = arg0.method5063(2);
        if (var2 == 0) {
            if (arg0.method5063(1) != 0) {
                method3723(arg0, arg1);
            }
            int var3 = arg0.method5063(13);
            int var4 = arg0.method5063(13);
            boolean var5 = arg0.method5063(1) == 1;
            if (var5) {
                field1242[++field1233 - 1] = arg1;
            }
            if (client.field745[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field745[arg1] = new class67();
            var6.field616 = arg1;
            if (field1229[arg1] != null) {
                var6.method1092(field1229[arg1]);
            }
            var6.field974 = field1239[arg1];
            var6.field949 = field1240[arg1];
            int var7 = field1238[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field931[0] = field1232[arg1];
            var6.field613 = (byte) var8;
            var6.method1103((var9 << 13) + var3 - Statics.field2477, (var10 << 13) + var4 - Statics.field562);
            var6.field617 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5063(2);
            int var12 = field1238[arg1];
            field1238[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5063(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1238[arg1];
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
            field1238[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5063(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1238[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1238[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bd.p(I)V")
    public static void method1663() {
        field1234 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1229[var0] = null;
            field1232[var0] = 1;
        }
    }
}
