package deob;

@ObfuscatedName("cd")
public class class89 {

    @ObfuscatedName("cd.g")
    public static byte[] field1234 = new byte[2048];

    @ObfuscatedName("cd.x")
    public static byte[] field1235 = new byte[2048];

    @ObfuscatedName("cd.h")
    public static class190[] field1236 = new class190[2048];

    @ObfuscatedName("cd.f")
    public static int field1247 = 0;

    @ObfuscatedName("cd.p")
    public static int[] field1244 = new int[2048];

    @ObfuscatedName("cd.m")
    public static int field1239 = 0;

    @ObfuscatedName("cd.q")
    public static int[] field1240 = new int[2048];

    @ObfuscatedName("cd.b")
    public static int[] field1241 = new int[2048];

    @ObfuscatedName("cd.n")
    public static int[] field1242 = new int[2048];

    @ObfuscatedName("cd.e")
    public static int[] field1243 = new int[2048];

    @ObfuscatedName("cd.r")
    public static int field1232 = 0;

    @ObfuscatedName("cd.t")
    public static int[] field1238 = new int[2048];

    @ObfuscatedName("cd.l")
    public static class190 field1237 = new class190(new byte[5000]);

    public class89() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.a(Lge;I)V")
    public static final void method377(class197 arg0) {
        arg0.method3744();
        int var1 = client.field826;
        class67 var2 = Statics.field187 = client.field766[var1] = new class67();
        var2.field622 = var1;
        int var3 = arg0.method3733(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field999[0] = var5 - Statics.field84;
        var2.field948 = (var2.field999[0] << 7) + (var2.method1119() << 6);
        var2.field996[0] = var6 - Statics.field30;
        var2.field949 = (var2.field996[0] << 7) + (var2.method1119() << 6);
        Statics.field2219 = var2.field632 = var4;
        if (field1236[var1] != null) {
            var2.method1115(field1236[var1]);
        }
        field1247 = 0;
        field1244[++field1247 - 1] = var1;
        field1234[var1] = 0;
        field1239 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3733(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1241[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1242[var7] = 0;
                field1243[var7] = -1;
                field1240[++field1239 - 1] = var7;
                field1234[var7] = 0;
            }
        }
        arg0.method3752();
    }

    @ObfuscatedName("y.s(Lge;II)V")
    public static final void method197(class197 arg0, int arg1) {
        int var2 = arg0.field2419;
        field1232 = 0;
        method4393(arg0);
        method929(arg0);
        if (arg0.field2419 - var2 != arg1) {
            throw new RuntimeException(arg0.field2419 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ik.g(Lge;I)V")
    public static final void method4393(class197 arg0) {
        int var1 = 0;
        arg0.method3744();
        for (int var2 = 0; var2 < field1247; var2++) {
            int var3 = field1244[var2];
            if ((field1234[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1234[var3] = (byte) (field1234[var3] | 0x2);
                } else {
                    int var4 = arg0.method3733(1);
                    if (var4 == 0) {
                        int var5 = arg0.method3733(2);
                        int var6;
                        if (var5 == 0) {
                            var6 = 0;
                        } else if (var5 == 1) {
                            var6 = arg0.method3733(5);
                        } else if (var5 == 2) {
                            var6 = arg0.method3733(8);
                        } else {
                            var6 = arg0.method3733(11);
                        }
                        var1 = var6;
                        field1234[var3] = (byte) (field1234[var3] | 0x2);
                    } else {
                        method592(arg0, var3);
                    }
                }
            }
        }
        arg0.method3752();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3744();
        for (int var8 = 0; var8 < field1247; var8++) {
            int var9 = field1244[var8];
            if ((field1234[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1234[var9] = (byte) (field1234[var9] | 0x2);
                } else {
                    int var10 = arg0.method3733(1);
                    if (var10 == 0) {
                        int var11 = arg0.method3733(2);
                        int var12;
                        if (var11 == 0) {
                            var12 = 0;
                        } else if (var11 == 1) {
                            var12 = arg0.method3733(5);
                        } else if (var11 == 2) {
                            var12 = arg0.method3733(8);
                        } else {
                            var12 = arg0.method3733(11);
                        }
                        var1 = var12;
                        field1234[var9] = (byte) (field1234[var9] | 0x2);
                    } else {
                        method592(arg0, var9);
                    }
                }
            }
        }
        arg0.method3752();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3744();
        for (int var14 = 0; var14 < field1239; var14++) {
            int var15 = field1240[var14];
            if ((field1234[var15] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1234[var15] = (byte) (field1234[var15] | 0x2);
                } else {
                    int var16 = arg0.method3733(1);
                    if (var16 == 0) {
                        int var17 = arg0.method3733(2);
                        int var18;
                        if (var17 == 0) {
                            var18 = 0;
                        } else if (var17 == 1) {
                            var18 = arg0.method3733(5);
                        } else if (var17 == 2) {
                            var18 = arg0.method3733(8);
                        } else {
                            var18 = arg0.method3733(11);
                        }
                        var1 = var18;
                        field1234[var15] = (byte) (field1234[var15] | 0x2);
                    } else if (method3186(arg0, var15)) {
                        field1234[var15] = (byte) (field1234[var15] | 0x2);
                    }
                }
            }
        }
        arg0.method3752();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3744();
        for (int var20 = 0; var20 < field1239; var20++) {
            int var21 = field1240[var20];
            if ((field1234[var21] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1234[var21] = (byte) (field1234[var21] | 0x2);
                } else {
                    int var22 = arg0.method3733(1);
                    if (var22 == 0) {
                        int var23 = arg0.method3733(2);
                        int var24;
                        if (var23 == 0) {
                            var24 = 0;
                        } else if (var23 == 1) {
                            var24 = arg0.method3733(5);
                        } else if (var23 == 2) {
                            var24 = arg0.method3733(8);
                        } else {
                            var24 = arg0.method3733(11);
                        }
                        var1 = var24;
                        field1234[var21] = (byte) (field1234[var21] | 0x2);
                    } else if (method3186(arg0, var21)) {
                        field1234[var21] = (byte) (field1234[var21] | 0x2);
                    }
                }
            }
        }
        arg0.method3752();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1247 = 0;
        field1239 = 0;
        for (int var26 = 1; var26 < 2048; var26++) {
            field1234[var26] = (byte) (field1234[var26] >> 1);
            class67 var27 = client.field766[var26];
            if (var27 == null) {
                field1240[++field1239 - 1] = var26;
            } else {
                field1244[++field1247 - 1] = var26;
            }
        }
    }

    @ObfuscatedName("aj.x(Lge;II)V")
    public static void method592(class197 arg0, int arg1) {
        boolean var2 = arg0.method3733(1) == 1;
        if (var2) {
            field1238[++field1232 - 1] = arg1;
        }
        int var3 = arg0.method3733(2);
        class67 var4 = client.field766[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field636 = false;
            } else if (client.field826 == arg1) {
                throw new RuntimeException();
            } else {
                field1241[arg1] = (Statics.field30 + var4.field996[0] >> 13) + (Statics.field84 + var4.field999[0] >> 13 << 14) + (var4.field632 << 28);
                if (var4.field968 == -1) {
                    field1242[arg1] = var4.field991;
                } else {
                    field1242[arg1] = var4.field968;
                }
                field1243[arg1] = var4.field966;
                client.field766[arg1] = null;
                if (arg0.method3733(1) != 0) {
                    method3186(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3733(3);
            int var6 = var4.field999[0];
            int var7 = var4.field996[0];
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
            if (client.field826 == arg1 && var4.field948 < 1536 || var4.field949 < 1536 || var4.field948 >= 11776 || var4.field949 >= 11776) {
                var4.method1122(var6, var7);
                var4.field636 = false;
            } else if (var2) {
                var4.field636 = true;
                var4.field625 = var6;
                var4.field630 = var7;
            } else {
                var4.field636 = false;
                var4.method1121(var6, var7, field1235[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3733(4);
            int var9 = var4.field999[0];
            int var10 = var4.field996[0];
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
            if (client.field826 == arg1 && var4.field948 < 1536 || var4.field949 < 1536 || var4.field948 >= 11776 || var4.field949 >= 11776) {
                var4.method1122(var9, var10);
                var4.field636 = false;
            } else if (var2) {
                var4.field636 = true;
                var4.field625 = var9;
                var4.field630 = var10;
            } else {
                var4.field636 = false;
                var4.method1121(var9, var10, field1235[arg1]);
            }
        } else {
            int var11 = arg0.method3733(1);
            if (var11 == 0) {
                int var12 = arg0.method3733(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field999[0] + var14;
                int var17 = var4.field996[0] + var15;
                if (client.field826 == arg1 && var4.field948 < 1536 || var4.field949 < 1536 || var4.field948 >= 11776 || var4.field949 >= 11776) {
                    var4.method1122(var16, var17);
                    var4.field636 = false;
                } else if (var2) {
                    var4.field636 = true;
                    var4.field625 = var16;
                    var4.field630 = var17;
                } else {
                    var4.field636 = false;
                    var4.method1121(var16, var17, field1235[arg1]);
                }
                var4.field632 = (byte) (var4.field632 + var13 & 0x3);
                if (client.field826 == arg1) {
                    Statics.field2219 = var4.field632;
                }
            } else {
                int var18 = arg0.method3733(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field84 + var4.field999[0] + var20 & 0x3FFF) - Statics.field84;
                int var23 = (Statics.field30 + var4.field996[0] + var21 & 0x3FFF) - Statics.field30;
                if (client.field826 == arg1 && var4.field948 < 1536 || var4.field949 < 1536 || var4.field948 >= 11776 || var4.field949 >= 11776) {
                    var4.method1122(var22, var23);
                    var4.field636 = false;
                } else if (var2) {
                    var4.field636 = true;
                    var4.field625 = var22;
                    var4.field630 = var23;
                } else {
                    var4.field636 = false;
                    var4.method1121(var22, var23, field1235[arg1]);
                }
                var4.field632 = (byte) (var4.field632 + var19 & 0x3);
                if (client.field826 == arg1) {
                    Statics.field2219 = var4.field632;
                }
            }
        }
    }

    @ObfuscatedName("fg.h(Lge;II)Z")
    public static boolean method3186(class197 arg0, int arg1) {
        int var2 = arg0.method3733(2);
        if (var2 == 0) {
            if (arg0.method3733(1) != 0) {
                method3186(arg0, arg1);
            }
            int var3 = arg0.method3733(13);
            int var4 = arg0.method3733(13);
            boolean var5 = arg0.method3733(1) == 1;
            if (var5) {
                field1238[++field1232 - 1] = arg1;
            }
            if (client.field766[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field766[arg1] = new class67();
            var6.field622 = arg1;
            if (field1236[arg1] != null) {
                var6.method1115(field1236[arg1]);
            }
            var6.field991 = field1242[arg1];
            var6.field966 = field1243[arg1];
            int var7 = field1241[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field956[0] = field1235[arg1];
            var6.field632 = (byte) var8;
            var6.method1122((var9 << 13) + var3 - Statics.field84, (var10 << 13) + var4 - Statics.field30);
            var6.field636 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3733(2);
            int var12 = field1241[arg1];
            field1241[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3733(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1241[arg1];
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
            field1241[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3733(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1241[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1241[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bo.f(Lge;B)V")
    public static final void method929(class197 arg0) {
        for (int var1 = 0; var1 < field1232; var1++) {
            int var2 = field1238[var1];
            class67 var3 = client.field766[var2];
            int var4 = arg0.method3443();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method3443() << 8;
            }
            method5039(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ju.p(Lge;ILbw;II)V")
    public static final void method5039(class197 arg0, int arg1, class67 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method3484();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = arg0.method3638();
                    if (var10 == 32767) {
                        var10 = arg0.method3638();
                        var8 = arg0.method3638();
                        var7 = arg0.method3638();
                        var9 = arg0.method3638();
                    } else if (var10 == 32766) {
                        var10 = -1;
                    } else {
                        var8 = arg0.method3638();
                    }
                    int var11 = arg0.method3638();
                    arg2.method1587(var10, var8, var7, var9, client.field660, var11);
                }
            }
            int var12 = arg0.method3613();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = arg0.method3638();
                    int var15 = arg0.method3638();
                    if (var15 == 32767) {
                        arg2.method1591(var14);
                    } else {
                        int var16 = arg0.method3638();
                        int var17 = arg0.method3484();
                        int var18 = var15 > 0 ? arg0.method3443() : var17;
                        arg2.method1590(var14, client.field660, var15, var16, var17, var18);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field977 = arg0.method3650();
            int var19 = arg0.method3502();
            arg2.field993 = var19 >> 16;
            arg2.field941 = (var19 & 0xFFFF) + client.field660;
            arg2.field965 = 0;
            arg2.field979 = 0;
            if (arg2.field941 > client.field660) {
                arg2.field965 = -1;
            }
            if (arg2.field977 == 65535) {
                arg2.field977 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method3487();
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field982 = arg0.method3489();
            arg2.field984 = arg0.method3487();
            arg2.field944 = arg0.method3487();
            arg2.field985 = arg0.method3489();
            arg2.field986 = arg0.method3494() + client.field660;
            arg2.field987 = arg0.method3678() + client.field660;
            arg2.field988 = arg0.method3610();
            if (arg2.field636) {
                arg2.field982 += arg2.field625;
                arg2.field984 += arg2.field630;
                arg2.field944 += arg2.field625;
                arg2.field985 += arg2.field630;
                arg2.field994 = 0;
            } else {
                arg2.field982 += arg2.field999[0];
                arg2.field984 += arg2.field996[0];
                arg2.field944 += arg2.field999[0];
                arg2.field985 += arg2.field996[0];
                arg2.field994 = 1;
            }
            arg2.field951 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field953 = arg0.method3647();
            if (arg2.field953.charAt(0) == '~') {
                arg2.field953 = arg2.field953.substring(1);
                class91.method696(2, arg2.field619.method5236(), arg2.field953);
            } else if (Statics.field187 == arg2) {
                class91.method696(2, arg2.field619.method5236(), arg2.field953);
            }
            arg2.field954 = false;
            arg2.field957 = 0;
            arg2.field958 = 0;
            arg2.field983 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field968 = arg0.method3678();
            if (arg2.field994 == 0) {
                arg2.field991 = arg2.field968;
                arg2.field968 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var20 = arg0.method3486();
            byte[] var21 = new byte[var20];
            class190 var22 = new class190(var21);
            arg0.method3504(var21, 0, var20);
            field1236[arg1] = var22;
            arg2.method1115(var22);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field966 = arg0.method3494();
            if (arg2.field966 == 65535) {
                arg2.field966 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1235[arg1] = arg0.method3487();
        }
        if ((arg3 & 0x10) != 0) {
            int var23 = arg0.method3494();
            class250 var24 = (class250) Statics.method2007(class250.method245(), arg0.method3443());
            boolean var25 = arg0.method3613() == 1;
            int var26 = arg0.method3443();
            int var27 = arg0.field2419;
            if (arg2.field619 != null && arg2.field612 != null) {
                boolean var28 = false;
                if (var24.field3209 && Statics.field355.method1689(arg2.field619)) {
                    var28 = true;
                }
                if (!var28 && client.field764 == 0 && !arg2.field633) {
                    field1237.field2419 = 0;
                    arg0.method3467(field1237.field2420, 0, var26);
                    field1237.field2419 = 0;
                    String var29 = class306.method5384(class312.method4635(class307.method4414(field1237)));
                    arg2.field953 = var29.trim();
                    arg2.field957 = var23 >> 8;
                    arg2.field958 = var23 & 0xFF;
                    arg2.field983 = 150;
                    arg2.field954 = var25;
                    arg2.field955 = Statics.field187 != arg2 && var24.field3209 && client.field790 != "" && var29.toLowerCase().indexOf(client.field790) == -1;
                    int var30;
                    if (var24.field3208) {
                        var30 = var25 ? 91 : 1;
                    } else {
                        var30 = var25 ? 90 : 2;
                    }
                    if (var24.field3201 == -1) {
                        class91.method696(var30, arg2.field619.method5236(), var29);
                    } else {
                        class91.method696(var30, class81.method515(var24.field3201) + arg2.field619.method5236(), var29);
                    }
                }
            }
            arg0.field2419 = var26 + var27;
        }
        if ((arg3 & 0x100) != 0) {
            for (int var31 = 0; var31 < 3; var31++) {
                arg2.field611[var31] = arg0.method3647();
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var32 = arg0.method3610();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg0.method3443();
            client.method181(arg2, var32, var33);
        }
        if (!arg2.field636) {
            return;
        }
        if (var4 == 127) {
            arg2.method1122(arg2.field625, arg2.field630);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1235[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1121(arg2.field625, arg2.field630, var34);
    }

    @ObfuscatedName("an.m(I)V")
    public static void method519() {
        field1247 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1236[var0] = null;
            field1235[var0] = 1;
        }
    }
}
