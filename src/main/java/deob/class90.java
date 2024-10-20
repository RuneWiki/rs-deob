package deob;

@ObfuscatedName("cz")
public class class90 {

    @ObfuscatedName("cz.o")
    public static byte[] field1237 = new byte[2048];

    @ObfuscatedName("cz.e")
    public static byte[] field1238 = new byte[2048];

    @ObfuscatedName("cz.i")
    public static class301[] field1236 = new class301[2048];

    @ObfuscatedName("cz.g")
    public static int field1247 = 0;

    @ObfuscatedName("cz.d")
    public static int[] field1241 = new int[2048];

    @ObfuscatedName("cz.l")
    public static int field1242 = 0;

    @ObfuscatedName("cz.j")
    public static int[] field1243 = new int[2048];

    @ObfuscatedName("cz.m")
    public static int[] field1244 = new int[2048];

    @ObfuscatedName("cz.p")
    public static int[] field1245 = new int[2048];

    @ObfuscatedName("cz.h")
    public static int[] field1246 = new int[2048];

    @ObfuscatedName("cz.v")
    public static int field1248 = 0;

    @ObfuscatedName("cz.n")
    public static int[] field1235 = new int[2048];

    @ObfuscatedName("cz.x")
    public static class301 field1249 = new class301(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.c(Lks;I)V")
    public static final void method1924(class300 arg0) {
        arg0.method5079();
        int var1 = client.field739;
        class67 var2 = Statics.field2392 = client.field762[var1] = new class67();
        var2.field625 = var1;
        int var3 = arg0.method5080(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field978[0] = var5 - Statics.field1262;
        var2.field983 = (var2.field978[0] << 7) + (var2.method1130() << 6);
        var2.field996[0] = var6 - Statics.field2367;
        var2.field940 = (var2.field996[0] << 7) + (var2.method1130() << 6);
        Statics.field2055 = var2.field614 = var4;
        if (field1236[var1] != null) {
            var2.method1110(field1236[var1]);
        }
        field1247 = 0;
        field1241[++field1247 - 1] = var1;
        field1237[var1] = 0;
        field1242 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5080(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1244[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1245[var7] = 0;
                field1246[var7] = -1;
                field1243[++field1242 - 1] = var7;
                field1237[var7] = 0;
            }
        }
        arg0.method5083();
    }

    @ObfuscatedName("cd.t(Lks;IB)V")
    public static final void method1930(class300 arg0, int arg1) {
        int var2 = arg0.field3707;
        field1248 = 0;
        method186(arg0);
        method666(arg0);
        if (arg0.field3707 - var2 != arg1) {
            throw new RuntimeException(arg0.field3707 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("z.o(Lks;I)V")
    public static final void method186(class300 arg0) {
        int var1 = 0;
        arg0.method5079();
        for (int var2 = 0; var2 < field1247; var2++) {
            int var3 = field1241[var2];
            if ((field1237[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1237[var3] = (byte) (field1237[var3] | 0x2);
                } else {
                    int var4 = arg0.method5080(1);
                    if (var4 == 0) {
                        var1 = method1913(arg0);
                        field1237[var3] = (byte) (field1237[var3] | 0x2);
                    } else {
                        method3642(arg0, var3);
                    }
                }
            }
        }
        arg0.method5083();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5079();
        for (int var5 = 0; var5 < field1247; var5++) {
            int var6 = field1241[var5];
            if ((field1237[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1237[var6] = (byte) (field1237[var6] | 0x2);
                } else {
                    int var7 = arg0.method5080(1);
                    if (var7 == 0) {
                        var1 = method1913(arg0);
                        field1237[var6] = (byte) (field1237[var6] | 0x2);
                    } else {
                        method3642(arg0, var6);
                    }
                }
            }
        }
        arg0.method5083();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5079();
        for (int var8 = 0; var8 < field1242; var8++) {
            int var9 = field1243[var8];
            if ((field1237[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1237[var9] = (byte) (field1237[var9] | 0x2);
                } else {
                    int var10 = arg0.method5080(1);
                    if (var10 == 0) {
                        var1 = method1913(arg0);
                        field1237[var9] = (byte) (field1237[var9] | 0x2);
                    } else if (method653(arg0, var9)) {
                        field1237[var9] = (byte) (field1237[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5083();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5079();
        for (int var11 = 0; var11 < field1242; var11++) {
            int var12 = field1243[var11];
            if ((field1237[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1237[var12] = (byte) (field1237[var12] | 0x2);
                } else {
                    int var13 = arg0.method5080(1);
                    if (var13 == 0) {
                        var1 = method1913(arg0);
                        field1237[var12] = (byte) (field1237[var12] | 0x2);
                    } else if (method653(arg0, var12)) {
                        field1237[var12] = (byte) (field1237[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5083();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1247 = 0;
        field1242 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1237[var14] = (byte) (field1237[var14] >> 1);
            class67 var15 = client.field762[var14];
            if (var15 == null) {
                field1243[++field1242 - 1] = var14;
            } else {
                field1241[++field1247 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cr.e(Lks;I)I")
    public static int method1913(class300 arg0) {
        int var1 = arg0.method5080(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5080(5);
        } else if (var1 == 2) {
            var2 = arg0.method5080(8);
        } else {
            var2 = arg0.method5080(11);
        }
        return var2;
    }

    @ObfuscatedName("ht.i(Lks;II)V")
    public static void method3642(class300 arg0, int arg1) {
        boolean var2 = arg0.method5080(1) == 1;
        if (var2) {
            field1235[++field1248 - 1] = arg1;
        }
        int var3 = arg0.method5080(2);
        class67 var4 = client.field762[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field622 = false;
            } else if (client.field739 == arg1) {
                throw new RuntimeException();
            } else {
                field1244[arg1] = (Statics.field2367 + var4.field996[0] >> 13) + (Statics.field1262 + var4.field978[0] >> 13 << 14) + (var4.field614 << 28);
                if (var4.field968 == -1) {
                    field1245[arg1] = var4.field991;
                } else {
                    field1245[arg1] = var4.field968;
                }
                field1246[arg1] = var4.field966;
                client.field762[arg1] = null;
                if (arg0.method5080(1) != 0) {
                    method653(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5080(3);
            int var6 = var4.field978[0];
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
            if (client.field739 == arg1 && var4.field983 < 1536 || var4.field940 < 1536 || var4.field983 >= 11776 || var4.field940 >= 11776) {
                var4.method1120(var6, var7);
                var4.field622 = false;
            } else if (var2) {
                var4.field622 = true;
                var4.field639 = var6;
                var4.field640 = var7;
            } else {
                var4.field622 = false;
                var4.method1119(var6, var7, field1238[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5080(4);
            int var9 = var4.field978[0];
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
            if (client.field739 == arg1 && var4.field983 < 1536 || var4.field940 < 1536 || var4.field983 >= 11776 || var4.field940 >= 11776) {
                var4.method1120(var9, var10);
                var4.field622 = false;
            } else if (var2) {
                var4.field622 = true;
                var4.field639 = var9;
                var4.field640 = var10;
            } else {
                var4.field622 = false;
                var4.method1119(var9, var10, field1238[arg1]);
            }
        } else {
            int var11 = arg0.method5080(1);
            if (var11 == 0) {
                int var12 = arg0.method5080(12);
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
                int var17 = var4.field996[0] + var15;
                if (client.field739 == arg1 && var4.field983 < 1536 || var4.field940 < 1536 || var4.field983 >= 11776 || var4.field940 >= 11776) {
                    var4.method1120(var16, var17);
                    var4.field622 = false;
                } else if (var2) {
                    var4.field622 = true;
                    var4.field639 = var16;
                    var4.field640 = var17;
                } else {
                    var4.field622 = false;
                    var4.method1119(var16, var17, field1238[arg1]);
                }
                var4.field614 = (byte) (var4.field614 + var13 & 0x3);
                if (client.field739 == arg1) {
                    Statics.field2055 = var4.field614;
                }
            } else {
                int var18 = arg0.method5080(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1262 + var4.field978[0] + var20 & 0x3FFF) - Statics.field1262;
                int var23 = (Statics.field2367 + var4.field996[0] + var21 & 0x3FFF) - Statics.field2367;
                if (client.field739 == arg1 && var4.field983 < 1536 || var4.field940 < 1536 || var4.field983 >= 11776 || var4.field940 >= 11776) {
                    var4.method1120(var22, var23);
                    var4.field622 = false;
                } else if (var2) {
                    var4.field622 = true;
                    var4.field639 = var22;
                    var4.field640 = var23;
                } else {
                    var4.field622 = false;
                    var4.method1119(var22, var23, field1238[arg1]);
                }
                var4.field614 = (byte) (var4.field614 + var19 & 0x3);
                if (client.field739 == arg1) {
                    Statics.field2055 = var4.field614;
                }
            }
        }
    }

    @ObfuscatedName("av.g(Lks;II)Z")
    public static boolean method653(class300 arg0, int arg1) {
        int var2 = arg0.method5080(2);
        if (var2 == 0) {
            if (arg0.method5080(1) != 0) {
                method653(arg0, arg1);
            }
            int var3 = arg0.method5080(13);
            int var4 = arg0.method5080(13);
            boolean var5 = arg0.method5080(1) == 1;
            if (var5) {
                field1235[++field1248 - 1] = arg1;
            }
            if (client.field762[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field762[arg1] = new class67();
            var6.field625 = arg1;
            if (field1236[arg1] != null) {
                var6.method1110(field1236[arg1]);
            }
            var6.field991 = field1245[arg1];
            var6.field966 = field1246[arg1];
            int var7 = field1244[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field997[0] = field1238[arg1];
            var6.field614 = (byte) var8;
            var6.method1120((var9 << 13) + var3 - Statics.field1262, (var10 << 13) + var4 - Statics.field2367);
            var6.field622 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5080(2);
            int var12 = field1244[arg1];
            field1244[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5080(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1244[arg1];
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
            field1244[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5080(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1244[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1244[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("am.d(Lks;B)V")
    public static final void method666(class300 arg0) {
        for (int var1 = 0; var1 < field1248; var1++) {
            int var2 = field1235[var1];
            class67 var3 = client.field762[var2];
            int var4 = arg0.method5129();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method5129() << 8;
            }
            method523(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("aq.l(Lks;ILba;IB)V")
    public static final void method523(class300 arg0, int arg1, class67 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x400) != 0) {
            arg2.field982 = arg0.method5171();
            arg2.field958 = arg0.method5333();
            arg2.field962 = arg0.method5171();
            arg2.field992 = arg0.method5130();
            arg2.field986 = arg0.method5315() + client.field656;
            arg2.field987 = arg0.method5315() + client.field656;
            arg2.field988 = arg0.method5293();
            if (arg2.field622) {
                arg2.field982 += arg2.field639;
                arg2.field958 += arg2.field640;
                arg2.field962 += arg2.field639;
                arg2.field992 += arg2.field640;
                arg2.field974 = 0;
            } else {
                arg2.field982 += arg2.field978[0];
                arg2.field958 += arg2.field996[0];
                arg2.field962 += arg2.field978[0];
                arg2.field992 += arg2.field996[0];
                arg2.field974 = 1;
            }
            arg2.field999 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field985 = arg0.method5124();
            int var5 = arg0.method5134();
            arg2.field981 = var5 >> 16;
            arg2.field980 = (var5 & 0xFFFF) + client.field656;
            arg2.field979 = 0;
            arg2.field993 = 0;
            if (arg2.field980 > client.field656) {
                arg2.field979 = -1;
            }
            if (arg2.field985 == 65535) {
                arg2.field985 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var6 = arg0.method5129();
            if (var6 > 0) {
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg0.method5143();
                    if (var11 == 32767) {
                        var11 = arg0.method5143();
                        var9 = arg0.method5143();
                        var8 = arg0.method5143();
                        var10 = arg0.method5143();
                    } else if (var11 == 32766) {
                        var11 = -1;
                    } else {
                        var9 = arg0.method5143();
                    }
                    int var12 = arg0.method5143();
                    arg2.method1576(var11, var9, var8, var10, client.field656, var12);
                }
            }
            int var13 = arg0.method5158();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = arg0.method5143();
                    int var16 = arg0.method5143();
                    if (var16 == 32767) {
                        arg2.method1577(var15);
                    } else {
                        int var17 = arg0.method5143();
                        int var18 = arg0.method5324();
                        int var19 = var16 > 0 ? arg0.method5324() : var18;
                        arg2.method1572(var15, client.field656, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1238[arg1] = arg0.method5171();
        }
        if ((arg3 & 0x20) != 0) {
            int var20 = arg0.method5167();
            class230 var21 = (class230) class196.method222(class230.method1984(), arg0.method5324());
            boolean var22 = arg0.method5129() == 1;
            int var23 = arg0.method5158();
            int var24 = arg0.field3707;
            if (arg2.field626 != null && arg2.field612 != null) {
                boolean var25 = false;
                if (var21.field3103 && Statics.field415.method1693(arg2.field626)) {
                    var25 = true;
                }
                if (!var25 && client.field760 == 0 && !arg2.field633) {
                    field1249.field3707 = 0;
                    arg0.method5288(field1249.field3708, 0, var23);
                    field1249.field3707 = 0;
                    String var26 = class297.method4981(class292.method611(class211.method3071(field1249)));
                    arg2.field953 = var26.trim();
                    arg2.field949 = var20 >> 8;
                    arg2.field942 = var20 & 0xFF;
                    arg2.field956 = 150;
                    arg2.field941 = var22;
                    arg2.field955 = Statics.field2392 != arg2 && var21.field3103 && client.field781 != "" && var26.toLowerCase().indexOf(client.field781) == -1;
                    int var27;
                    if (var21.field3094) {
                        var27 = var22 ? 91 : 1;
                    } else {
                        var27 = var22 ? 90 : 2;
                    }
                    if (var21.field3101 == -1) {
                        class92.method1681(var27, arg2.field626.method4829(), var26);
                    } else {
                        class92.method1681(var27, class82.method3404(var21.field3101) + arg2.field626.method4829(), var26);
                    }
                }
            }
            arg0.field3707 = var23 + var24;
        }
        if ((arg3 & 0x1) != 0) {
            int var28 = arg0.method5293();
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg0.method5158();
            client.method1043(arg2, var28, var29);
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method5162();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field966 = arg0.method5124();
            if (arg2.field966 == 65535) {
                arg2.field966 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var30 = arg0.method5324();
            byte[] var31 = new byte[var30];
            class301 var32 = new class301(var31);
            arg0.method5288(var31, 0, var30);
            field1236[arg1] = var32;
            arg2.method1110(var32);
        }
        if ((arg3 & 0x100) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field617[var33] = arg0.method5138();
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field953 = arg0.method5138();
            if (arg2.field953.charAt(0) == '~') {
                arg2.field953 = arg2.field953.substring(1);
                class92.method1681(2, arg2.field626.method4829(), arg2.field953);
            } else if (Statics.field2392 == arg2) {
                class92.method1681(2, arg2.field626.method4829(), arg2.field953);
            }
            arg2.field941 = false;
            arg2.field949 = 0;
            arg2.field942 = 0;
            arg2.field956 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field968 = arg0.method5124();
            if (arg2.field974 == 0) {
                arg2.field991 = arg2.field968;
                arg2.field968 = -1;
            }
        }
        if (!arg2.field622) {
            return;
        }
        if (var4 == 127) {
            arg2.method1120(arg2.field639, arg2.field640);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1238[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1119(arg2.field639, arg2.field640, var34);
    }

    @ObfuscatedName("bd.j(B)V")
    public static void method1161() {
        field1247 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1236[var0] = null;
            field1238[var0] = 1;
        }
    }
}
