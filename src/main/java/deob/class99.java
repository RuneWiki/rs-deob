package deob;

@ObfuscatedName("cv")
public class class99 {

    @ObfuscatedName("cv.l")
    public static byte[] field1283 = new byte[2048];

    @ObfuscatedName("cv.m")
    public static byte[] field1296 = new byte[2048];

    @ObfuscatedName("cv.z")
    public static class311[] field1285 = new class311[2048];

    @ObfuscatedName("cv.q")
    public static int field1286 = 0;

    @ObfuscatedName("cv.k")
    public static int[] field1287 = new int[2048];

    @ObfuscatedName("cv.c")
    public static int field1288 = 0;

    @ObfuscatedName("cv.u")
    public static int[] field1284 = new int[2048];

    @ObfuscatedName("cv.t")
    public static int[] field1290 = new int[2048];

    @ObfuscatedName("cv.e")
    public static int[] field1291 = new int[2048];

    @ObfuscatedName("cv.o")
    public static int[] field1282 = new int[2048];

    @ObfuscatedName("cv.n")
    public static int field1294 = 0;

    @ObfuscatedName("cv.x")
    public static int[] field1295 = new int[2048];

    @ObfuscatedName("cv.p")
    public static class311 field1281 = new class311(new byte[5000]);

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.f(Lks;B)V")
    public static final void method2030(class310 arg0) {
        arg0.method5128();
        int var1 = client.field799;
        class76 var2 = Statics.field3130 = client.field798[var1] = new class76();
        var2.field667 = var1;
        int var3 = arg0.method5129(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1031[0] = var5 - Statics.field1641;
        var2.field1000 = (var2.field1031[0] << 7) + (var2.method1174() << 6);
        var2.field1032[0] = var6 - Statics.field132;
        var2.field976 = (var2.field1032[0] << 7) + (var2.method1174() << 6);
        Statics.field99 = var2.field666 = var4;
        if (field1285[var1] != null) {
            var2.method1173(field1285[var1]);
        }
        field1286 = 0;
        field1287[++field1286 - 1] = var1;
        field1283[var1] = 0;
        field1288 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5129(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1290[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1291[var7] = 0;
                field1282[var7] = -1;
                field1284[++field1288 - 1] = var7;
                field1283[var7] = 0;
            }
        }
        arg0.method5153();
    }

    @ObfuscatedName("ag.b(Lks;IS)V")
    public static final void method585(class310 arg0, int arg1) {
        int var2 = arg0.field3741;
        field1294 = 0;
        method140(arg0);
        for (int var3 = 0; var3 < field1294; var3++) {
            int var4 = field1295[var3];
            class76 var5 = client.field798[var4];
            int var6 = arg0.method5276();
            if ((var6 & 0x10) != 0) {
                var6 += arg0.method5276() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x800) != 0) {
                for (int var8 = 0; var8 < 3; var8++) {
                    var5.field673[var8] = arg0.method5189();
                }
            }
            if ((var6 & 0x2) != 0) {
                int var9 = arg0.method5163();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method5211();
                client.method3749(var5, var9, var10);
            }
            if ((var6 & 0x100) != 0) {
                var7 = arg0.method5212();
            }
            if ((var6 & 0x8) != 0) {
                int var11 = arg0.method5202();
                class240 var12 = (class240) class205.method3432(class240.method249(), arg0.method5162());
                boolean var13 = arg0.method5276() == 1;
                int var14 = arg0.method5211();
                int var15 = arg0.field3741;
                if (var5.field660 != null && var5.field646 != null) {
                    boolean var16 = false;
                    if (var12.field3123 && Statics.field150.method1781(var5.field660)) {
                        var16 = true;
                    }
                    if (!var16 && client.field796 == 0 && !var5.field659) {
                        field1281.field3741 = 0;
                        arg0.method5376(field1281.field3742, 0, var14);
                        field1281.field3741 = 0;
                        String var17 = class307.method5032(class302.method296(class220.method2739(field1281)));
                        var5.field989 = var17.trim();
                        var5.field993 = var11 >> 8;
                        var5.field994 = var11 & 0xFF;
                        var5.field992 = 150;
                        var5.field1030 = var13;
                        var5.field975 = Statics.field3130 != var5 && var12.field3123 && client.field711 != "" && var17.toLowerCase().indexOf(client.field711) == -1;
                        int var18;
                        if (var12.field3129) {
                            var18 = var13 ? 91 : 1;
                        } else {
                            var18 = var13 ? 90 : 2;
                        }
                        if (var12.field3128 == -1) {
                            class101.method783(var18, var5.field660.method4912(), var17);
                        } else {
                            class101.method783(var18, Statics.method5531(var12.field3128) + var5.field660.method4912(), var17);
                        }
                    }
                }
                arg0.field3741 = var14 + var15;
            }
            if ((var6 & 0x20) != 0) {
                var5.field1004 = arg0.method5218();
                if (var5.field999 == 0) {
                    var5.field1027 = var5.field1004;
                    var5.field1004 = -1;
                }
            }
            if ((var6 & 0x80) != 0) {
                var5.field989 = arg0.method5189();
                if (var5.field989.charAt(0) == '~') {
                    var5.field989 = var5.field989.substring(1);
                    class101.method783(2, var5.field660.method4912(), var5.field989);
                } else if (Statics.field3130 == var5) {
                    class101.method783(2, var5.field660.method4912(), var5.field989);
                }
                var5.field1030 = false;
                var5.field993 = 0;
                var5.field994 = 0;
                var5.field992 = 150;
            }
            if ((var6 & 0x1000) != 0) {
                var5.field1013 = arg0.method5163();
                int var19 = arg0.method5228();
                var5.field1017 = var19 >> 16;
                var5.field1016 = (var19 & 0xFFFF) + client.field863;
                var5.field1014 = 0;
                var5.field1015 = 0;
                if (var5.field1016 > client.field863) {
                    var5.field1014 = -1;
                }
                if (var5.field1013 == 65535) {
                    var5.field1013 = -1;
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field1002 = arg0.method5218();
                if (var5.field1002 == 65535) {
                    var5.field1002 = -1;
                }
            }
            if ((var6 & 0x4) != 0) {
                int var20 = arg0.method5193();
                byte[] var21 = new byte[var20];
                class311 var22 = new class311(var21);
                arg0.method5232(var21, 0, var20);
                field1285[var4] = var22;
                var5.method1173(var22);
            }
            if ((var6 & 0x1) != 0) {
                int var23 = arg0.method5276();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = arg0.method5194();
                        if (var28 == 32767) {
                            var28 = arg0.method5194();
                            var26 = arg0.method5194();
                            var25 = arg0.method5194();
                            var27 = arg0.method5194();
                        } else if (var28 == 32766) {
                            var28 = -1;
                        } else {
                            var26 = arg0.method5194();
                        }
                        int var29 = arg0.method5194();
                        var5.method1667(var28, var26, var25, var27, client.field863, var29);
                    }
                }
                int var30 = arg0.method5211();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = arg0.method5194();
                        int var33 = arg0.method5194();
                        if (var33 == 32767) {
                            var5.method1669(var32);
                        } else {
                            int var34 = arg0.method5194();
                            int var35 = arg0.method5211();
                            int var36 = var33 > 0 ? arg0.method5276() : var35;
                            var5.method1665(var32, client.field863, var33, var34, var35, var36);
                        }
                    }
                }
            }
            if ((var6 & 0x400) != 0) {
                var5.field1018 = arg0.method5380();
                var5.field1020 = arg0.method5181();
                var5.field1019 = arg0.method5380();
                var5.field1021 = arg0.method5380();
                var5.field1010 = arg0.method5202() + client.field863;
                var5.field1025 = arg0.method5340() + client.field863;
                var5.field1024 = arg0.method5202();
                if (var5.field665) {
                    var5.field1018 += var5.field664;
                    var5.field1020 += var5.field672;
                    var5.field1019 += var5.field664;
                    var5.field1021 += var5.field672;
                    var5.field999 = 0;
                } else {
                    var5.field1018 += var5.field1031[0];
                    var5.field1020 += var5.field1032[0];
                    var5.field1019 += var5.field1031[0];
                    var5.field1021 += var5.field1032[0];
                    var5.field999 = 1;
                }
                var5.field1035 = 0;
            }
            if ((var6 & 0x200) != 0) {
                field1296[var4] = arg0.method5212();
            }
            if (var5.field665) {
                if (var7 == 127) {
                    var5.method1177(var5.field664, var5.field672);
                } else {
                    byte var37;
                    if (var7 == -1) {
                        var37 = field1296[var4];
                    } else {
                        var37 = var7;
                    }
                    var5.method1176(var5.field664, var5.field672, var37);
                }
            }
        }
        if (arg0.field3741 - var2 != arg1) {
            throw new RuntimeException(arg0.field3741 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("y.l(Lks;I)V")
    public static final void method140(class310 arg0) {
        int var1 = 0;
        arg0.method5128();
        for (int var2 = 0; var2 < field1286; var2++) {
            int var3 = field1287[var2];
            if ((field1283[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var3] = (byte) (field1283[var3] | 0x2);
                } else {
                    int var4 = arg0.method5129(1);
                    if (var4 == 0) {
                        var1 = method1061(arg0);
                        field1283[var3] = (byte) (field1283[var3] | 0x2);
                    } else {
                        method687(arg0, var3);
                    }
                }
            }
        }
        arg0.method5153();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5128();
        for (int var5 = 0; var5 < field1286; var5++) {
            int var6 = field1287[var5];
            if ((field1283[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var6] = (byte) (field1283[var6] | 0x2);
                } else {
                    int var7 = arg0.method5129(1);
                    if (var7 == 0) {
                        var1 = method1061(arg0);
                        field1283[var6] = (byte) (field1283[var6] | 0x2);
                    } else {
                        method687(arg0, var6);
                    }
                }
            }
        }
        arg0.method5153();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5128();
        for (int var8 = 0; var8 < field1288; var8++) {
            int var9 = field1284[var8];
            if ((field1283[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var9] = (byte) (field1283[var9] | 0x2);
                } else {
                    int var10 = arg0.method5129(1);
                    if (var10 == 0) {
                        var1 = method1061(arg0);
                        field1283[var9] = (byte) (field1283[var9] | 0x2);
                    } else if (method103(arg0, var9)) {
                        field1283[var9] = (byte) (field1283[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5153();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5128();
        for (int var11 = 0; var11 < field1288; var11++) {
            int var12 = field1284[var11];
            if ((field1283[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1283[var12] = (byte) (field1283[var12] | 0x2);
                } else {
                    int var13 = arg0.method5129(1);
                    if (var13 == 0) {
                        var1 = method1061(arg0);
                        field1283[var12] = (byte) (field1283[var12] | 0x2);
                    } else if (method103(arg0, var12)) {
                        field1283[var12] = (byte) (field1283[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5153();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1286 = 0;
        field1288 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1283[var14] = (byte) (field1283[var14] >> 1);
            class76 var15 = client.field798[var14];
            if (var15 == null) {
                field1284[++field1288 - 1] = var14;
            } else {
                field1287[++field1286 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bw.m(Lks;I)I")
    public static int method1061(class310 arg0) {
        int var1 = arg0.method5129(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5129(5);
        } else if (var1 == 2) {
            var2 = arg0.method5129(8);
        } else {
            var2 = arg0.method5129(11);
        }
        return var2;
    }

    @ObfuscatedName("ae.z(Lks;IB)V")
    public static void method687(class310 arg0, int arg1) {
        boolean var2 = arg0.method5129(1) == 1;
        if (var2) {
            field1295[++field1294 - 1] = arg1;
        }
        int var3 = arg0.method5129(2);
        class76 var4 = client.field798[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field665 = false;
            } else if (client.field799 == arg1) {
                throw new RuntimeException();
            } else {
                field1290[arg1] = (Statics.field132 + var4.field1032[0] >> 13) + (Statics.field1641 + var4.field1031[0] >> 13 << 14) + (var4.field666 << 28);
                if (var4.field1004 == -1) {
                    field1291[arg1] = var4.field1027;
                } else {
                    field1291[arg1] = var4.field1004;
                }
                field1282[arg1] = var4.field1002;
                client.field798[arg1] = null;
                if (arg0.method5129(1) != 0) {
                    method103(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5129(3);
            int var6 = var4.field1031[0];
            int var7 = var4.field1032[0];
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
            if (client.field799 == arg1 && var4.field1000 < 1536 || var4.field976 < 1536 || var4.field1000 >= 11776 || var4.field976 >= 11776) {
                var4.method1177(var6, var7);
                var4.field665 = false;
            } else if (var2) {
                var4.field665 = true;
                var4.field664 = var6;
                var4.field672 = var7;
            } else {
                var4.field665 = false;
                var4.method1176(var6, var7, field1296[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5129(4);
            int var9 = var4.field1031[0];
            int var10 = var4.field1032[0];
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
            if (client.field799 == arg1 && var4.field1000 < 1536 || var4.field976 < 1536 || var4.field1000 >= 11776 || var4.field976 >= 11776) {
                var4.method1177(var9, var10);
                var4.field665 = false;
            } else if (var2) {
                var4.field665 = true;
                var4.field664 = var9;
                var4.field672 = var10;
            } else {
                var4.field665 = false;
                var4.method1176(var9, var10, field1296[arg1]);
            }
        } else {
            int var11 = arg0.method5129(1);
            if (var11 == 0) {
                int var12 = arg0.method5129(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1031[0] + var14;
                int var17 = var4.field1032[0] + var15;
                if (client.field799 == arg1 && var4.field1000 < 1536 || var4.field976 < 1536 || var4.field1000 >= 11776 || var4.field976 >= 11776) {
                    var4.method1177(var16, var17);
                    var4.field665 = false;
                } else if (var2) {
                    var4.field665 = true;
                    var4.field664 = var16;
                    var4.field672 = var17;
                } else {
                    var4.field665 = false;
                    var4.method1176(var16, var17, field1296[arg1]);
                }
                var4.field666 = (byte) (var4.field666 + var13 & 0x3);
                if (client.field799 == arg1) {
                    Statics.field99 = var4.field666;
                }
            } else {
                int var18 = arg0.method5129(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1641 + var4.field1031[0] + var20 & 0x3FFF) - Statics.field1641;
                int var23 = (Statics.field132 + var4.field1032[0] + var21 & 0x3FFF) - Statics.field132;
                if (client.field799 == arg1 && var4.field1000 < 1536 || var4.field976 < 1536 || var4.field1000 >= 11776 || var4.field976 >= 11776) {
                    var4.method1177(var22, var23);
                    var4.field665 = false;
                } else if (var2) {
                    var4.field665 = true;
                    var4.field664 = var22;
                    var4.field672 = var23;
                } else {
                    var4.field665 = false;
                    var4.method1176(var22, var23, field1296[arg1]);
                }
                var4.field666 = (byte) (var4.field666 + var19 & 0x3);
                if (client.field799 == arg1) {
                    Statics.field99 = var4.field666;
                }
            }
        }
    }

    @ObfuscatedName("t.q(Lks;IS)Z")
    public static boolean method103(class310 arg0, int arg1) {
        int var2 = arg0.method5129(2);
        if (var2 == 0) {
            if (arg0.method5129(1) != 0) {
                method103(arg0, arg1);
            }
            int var3 = arg0.method5129(13);
            int var4 = arg0.method5129(13);
            boolean var5 = arg0.method5129(1) == 1;
            if (var5) {
                field1295[++field1294 - 1] = arg1;
            }
            if (client.field798[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field798[arg1] = new class76();
            var6.field667 = arg1;
            if (field1285[arg1] != null) {
                var6.method1173(field1285[arg1]);
            }
            var6.field1027 = field1291[arg1];
            var6.field1002 = field1282[arg1];
            int var7 = field1290[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1033[0] = field1296[arg1];
            var6.field666 = (byte) var8;
            var6.method1177((var9 << 13) + var3 - Statics.field1641, (var10 << 13) + var4 - Statics.field132);
            var6.field665 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5129(2);
            int var12 = field1290[arg1];
            field1290[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5129(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1290[arg1];
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
            field1290[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5129(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1290[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1290[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cn.k(B)V")
    public static void method1970() {
        field1286 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1285[var0] = null;
            field1296[var0] = 1;
        }
    }
}
