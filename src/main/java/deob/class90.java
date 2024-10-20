package deob;

@ObfuscatedName("cw")
public class class90 {

    @ObfuscatedName("cw.e")
    public static byte[] field1253 = new byte[2048];

    @ObfuscatedName("cw.p")
    public static byte[] field1251 = new byte[2048];

    @ObfuscatedName("cw.k")
    public static class301[] field1255 = new class301[2048];

    @ObfuscatedName("cw.l")
    public static int field1256 = 0;

    @ObfuscatedName("cw.b")
    public static int[] field1258 = new int[2048];

    @ObfuscatedName("cw.i")
    public static int field1252 = 0;

    @ObfuscatedName("cw.c")
    public static int[] field1259 = new int[2048];

    @ObfuscatedName("cw.f")
    public static int[] field1254 = new int[2048];

    @ObfuscatedName("cw.m")
    public static int[] field1261 = new int[2048];

    @ObfuscatedName("cw.u")
    public static int[] field1262 = new int[2048];

    @ObfuscatedName("cw.x")
    public static int field1263 = 0;

    @ObfuscatedName("cw.r")
    public static int[] field1257 = new int[2048];

    @ObfuscatedName("cw.v")
    public static class301 field1265 = new class301(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.q(Lkx;B)V")
    public static final void method224(class300 arg0) {
        arg0.method5011();
        int var1 = client.field771;
        class67 var2 = Statics.field658 = client.field910[var1] = new class67();
        var2.field638 = var1;
        int var3 = arg0.method5018(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field995[0] = var5 - Statics.field2390;
        var2.field1006 = (var2.field995[0] << 7) + (var2.method1049() << 6);
        var2.field963[0] = var6 - Statics.field2;
        var2.field950 = (var2.field963[0] << 7) + (var2.method1049() << 6);
        Statics.field373 = var2.field630 = var4;
        if (field1255[var1] != null) {
            var2.method1041(field1255[var1]);
        }
        field1256 = 0;
        field1258[++field1256 - 1] = var1;
        field1253[var1] = 0;
        field1252 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5018(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1254[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1261[var7] = 0;
                field1262[var7] = -1;
                field1259[++field1252 - 1] = var7;
                field1253[var7] = 0;
            }
        }
        arg0.method5019();
    }

    @ObfuscatedName("bo.w(Lkx;II)V")
    public static final void method982(class300 arg0, int arg1) {
        int var2 = arg0.field3733;
        field1263 = 0;
        method899(arg0);
        for (int var3 = 0; var3 < field1263; var3++) {
            int var4 = field1257[var3];
            class67 var5 = client.field910[var4];
            int var6 = arg0.method5077();
            if ((var6 & 0x8) != 0) {
                var6 += arg0.method5077() << 8;
            }
            method619(arg0, var4, var5, var6);
        }
        if (arg0.field3733 - var2 != arg1) {
            throw new RuntimeException(arg0.field3733 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bi.e(Lkx;I)V")
    public static final void method899(class300 arg0) {
        int var1 = 0;
        arg0.method5011();
        for (int var2 = 0; var2 < field1256; var2++) {
            int var3 = field1258[var2];
            if ((field1253[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var3] = (byte) (field1253[var3] | 0x2);
                } else {
                    int var4 = arg0.method5018(1);
                    if (var4 == 0) {
                        var1 = method1521(arg0);
                        field1253[var3] = (byte) (field1253[var3] | 0x2);
                    } else {
                        method196(arg0, var3);
                    }
                }
            }
        }
        arg0.method5019();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5011();
        for (int var5 = 0; var5 < field1256; var5++) {
            int var6 = field1258[var5];
            if ((field1253[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var6] = (byte) (field1253[var6] | 0x2);
                } else {
                    int var7 = arg0.method5018(1);
                    if (var7 == 0) {
                        var1 = method1521(arg0);
                        field1253[var6] = (byte) (field1253[var6] | 0x2);
                    } else {
                        method196(arg0, var6);
                    }
                }
            }
        }
        arg0.method5019();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5011();
        for (int var8 = 0; var8 < field1252; var8++) {
            int var9 = field1259[var8];
            if ((field1253[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var9] = (byte) (field1253[var9] | 0x2);
                } else {
                    int var10 = arg0.method5018(1);
                    if (var10 == 0) {
                        var1 = method1521(arg0);
                        field1253[var9] = (byte) (field1253[var9] | 0x2);
                    } else if (method3758(arg0, var9)) {
                        field1253[var9] = (byte) (field1253[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5019();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5011();
        for (int var11 = 0; var11 < field1252; var11++) {
            int var12 = field1259[var11];
            if ((field1253[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1253[var12] = (byte) (field1253[var12] | 0x2);
                } else {
                    int var13 = arg0.method5018(1);
                    if (var13 == 0) {
                        var1 = method1521(arg0);
                        field1253[var12] = (byte) (field1253[var12] | 0x2);
                    } else if (method3758(arg0, var12)) {
                        field1253[var12] = (byte) (field1253[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5019();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1256 = 0;
        field1252 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1253[var14] = (byte) (field1253[var14] >> 1);
            class67 var15 = client.field910[var14];
            if (var15 == null) {
                field1259[++field1252 - 1] = var14;
            } else {
                field1258[++field1256 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bw.p(Lkx;B)I")
    public static int method1521(class300 arg0) {
        int var1 = arg0.method5018(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5018(5);
        } else if (var1 == 2) {
            var2 = arg0.method5018(8);
        } else {
            var2 = arg0.method5018(11);
        }
        return var2;
    }

    @ObfuscatedName("j.k(Lkx;II)V")
    public static void method196(class300 arg0, int arg1) {
        boolean var2 = arg0.method5018(1) == 1;
        if (var2) {
            field1257[++field1263 - 1] = arg1;
        }
        int var3 = arg0.method5018(2);
        class67 var4 = client.field910[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field639 = false;
            } else if (client.field771 == arg1) {
                throw new RuntimeException();
            } else {
                field1254[arg1] = (Statics.field2 + var4.field963[0] >> 13) + (Statics.field2390 + var4.field995[0] >> 13 << 14) + (var4.field630 << 28);
                if (var4.field977 == -1) {
                    field1261[arg1] = var4.field1001;
                } else {
                    field1261[arg1] = var4.field977;
                }
                field1262[arg1] = var4.field976;
                client.field910[arg1] = null;
                if (arg0.method5018(1) != 0) {
                    method3758(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5018(3);
            int var6 = var4.field995[0];
            int var7 = var4.field963[0];
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
            if (client.field771 == arg1 && var4.field1006 < 1536 || var4.field950 < 1536 || var4.field1006 >= 11776 || var4.field950 >= 11776) {
                var4.method1067(var6, var7);
                var4.field639 = false;
            } else if (var2) {
                var4.field639 = true;
                var4.field640 = var6;
                var4.field641 = var7;
            } else {
                var4.field639 = false;
                var4.method1051(var6, var7, field1251[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5018(4);
            int var9 = var4.field995[0];
            int var10 = var4.field963[0];
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
            if (client.field771 == arg1 && var4.field1006 < 1536 || var4.field950 < 1536 || var4.field1006 >= 11776 || var4.field950 >= 11776) {
                var4.method1067(var9, var10);
                var4.field639 = false;
            } else if (var2) {
                var4.field639 = true;
                var4.field640 = var9;
                var4.field641 = var10;
            } else {
                var4.field639 = false;
                var4.method1051(var9, var10, field1251[arg1]);
            }
        } else {
            int var11 = arg0.method5018(1);
            if (var11 == 0) {
                int var12 = arg0.method5018(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field995[0] + var14;
                int var17 = var4.field963[0] + var15;
                if (client.field771 == arg1 && var4.field1006 < 1536 || var4.field950 < 1536 || var4.field1006 >= 11776 || var4.field950 >= 11776) {
                    var4.method1067(var16, var17);
                    var4.field639 = false;
                } else if (var2) {
                    var4.field639 = true;
                    var4.field640 = var16;
                    var4.field641 = var17;
                } else {
                    var4.field639 = false;
                    var4.method1051(var16, var17, field1251[arg1]);
                }
                var4.field630 = (byte) (var4.field630 + var13 & 0x3);
                if (client.field771 == arg1) {
                    Statics.field373 = var4.field630;
                }
            } else {
                int var18 = arg0.method5018(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2390 + var4.field995[0] + var20 & 0x3FFF) - Statics.field2390;
                int var23 = (Statics.field2 + var4.field963[0] + var21 & 0x3FFF) - Statics.field2;
                if (client.field771 == arg1 && var4.field1006 < 1536 || var4.field950 < 1536 || var4.field1006 >= 11776 || var4.field950 >= 11776) {
                    var4.method1067(var22, var23);
                    var4.field639 = false;
                } else if (var2) {
                    var4.field639 = true;
                    var4.field640 = var22;
                    var4.field641 = var23;
                } else {
                    var4.field639 = false;
                    var4.method1051(var22, var23, field1251[arg1]);
                }
                var4.field630 = (byte) (var4.field630 + var19 & 0x3);
                if (client.field771 == arg1) {
                    Statics.field373 = var4.field630;
                }
            }
        }
    }

    @ObfuscatedName("hw.l(Lkx;II)Z")
    public static boolean method3758(class300 arg0, int arg1) {
        int var2 = arg0.method5018(2);
        if (var2 == 0) {
            if (arg0.method5018(1) != 0) {
                method3758(arg0, arg1);
            }
            int var3 = arg0.method5018(13);
            int var4 = arg0.method5018(13);
            boolean var5 = arg0.method5018(1) == 1;
            if (var5) {
                field1257[++field1263 - 1] = arg1;
            }
            if (client.field910[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field910[arg1] = new class67();
            var6.field638 = arg1;
            if (field1255[arg1] != null) {
                var6.method1041(field1255[arg1]);
            }
            var6.field1001 = field1261[arg1];
            var6.field976 = field1262[arg1];
            int var7 = field1254[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1007[0] = field1251[arg1];
            var6.field630 = (byte) var8;
            var6.method1067((var9 << 13) + var3 - Statics.field2390, (var10 << 13) + var4 - Statics.field2);
            var6.field639 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5018(2);
            int var12 = field1254[arg1];
            field1254[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5018(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1254[arg1];
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
            field1254[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5018(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1254[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1254[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("aq.b(Lkx;ILbd;II)V")
    public static final void method619(class300 arg0, int arg1, class67 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method5295();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = arg0.method5081();
                    if (var10 == 32767) {
                        var10 = arg0.method5081();
                        var8 = arg0.method5081();
                        var7 = arg0.method5081();
                        var9 = arg0.method5081();
                    } else if (var10 == 32766) {
                        var10 = -1;
                    } else {
                        var8 = arg0.method5081();
                    }
                    int var11 = arg0.method5081();
                    arg2.method1494(var10, var8, var7, var9, client.field882, var11);
                }
            }
            int var12 = arg0.method5097();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = arg0.method5081();
                    int var15 = arg0.method5081();
                    if (var15 == 32767) {
                        arg2.method1496(var14);
                    } else {
                        int var16 = arg0.method5081();
                        int var17 = arg0.method5295();
                        int var18 = var15 > 0 ? arg0.method5077() : var17;
                        arg2.method1493(var14, client.field882, var15, var16, var17, var18);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field987 = arg0.method5107();
            int var19 = arg0.method5115();
            arg2.field991 = var19 >> 16;
            arg2.field990 = (var19 & 0xFFFF) + client.field882;
            arg2.field988 = 0;
            arg2.field989 = 0;
            if (arg2.field990 > client.field882) {
                arg2.field988 = -1;
            }
            if (arg2.field987 == 65535) {
                arg2.field987 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method5267();
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field992 = arg0.method5101();
            arg2.field994 = arg0.method5267();
            arg2.field993 = arg0.method5267();
            arg2.field984 = arg0.method5101();
            arg2.field996 = arg0.method5091() + client.field882;
            arg2.field997 = arg0.method5105() + client.field882;
            arg2.field998 = arg0.method5069();
            if (arg2.field639) {
                arg2.field992 += arg2.field640;
                arg2.field994 += arg2.field641;
                arg2.field993 += arg2.field640;
                arg2.field984 += arg2.field641;
                arg2.field1004 = 0;
            } else {
                arg2.field992 += arg2.field995[0];
                arg2.field994 += arg2.field963[0];
                arg2.field993 += arg2.field995[0];
                arg2.field984 += arg2.field963[0];
                arg2.field1004 = 1;
            }
            arg2.field1009 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field978 = arg0.method5076();
            if (arg2.field978.charAt(0) == '~') {
                arg2.field978 = arg2.field978.substring(1);
                class92.method994(2, arg2.field622.method4790(), arg2.field978);
            } else if (Statics.field658 == arg2) {
                class92.method994(2, arg2.field622.method4790(), arg2.field978);
            }
            arg2.field964 = false;
            arg2.field967 = 0;
            arg2.field983 = 0;
            arg2.field1003 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field977 = arg0.method5105();
            if (arg2.field1004 == 0) {
                arg2.field1001 = arg2.field977;
                arg2.field977 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var20 = arg0.method5098();
            byte[] var21 = new byte[var20];
            class301 var22 = new class301(var21);
            arg0.method5117(var21, 0, var20);
            field1255[arg1] = var22;
            arg2.method1041(var22);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field976 = arg0.method5091();
            if (arg2.field976 == 65535) {
                arg2.field976 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1251[arg1] = arg0.method5267();
        }
        if ((arg3 & 0x10) != 0) {
            int var23 = arg0.method5091();
            class229 var24 = (class229) class196.method2257(class229.method3130(), arg0.method5077());
            boolean var25 = arg0.method5097() == 1;
            int var26 = arg0.method5077();
            int var27 = arg0.field3733;
            if (arg2.field622 != null && arg2.field614 != null) {
                boolean var28 = false;
                if (var24.field3093 && Statics.field547.method1600(arg2.field622)) {
                    var28 = true;
                }
                if (!var28 && client.field768 == 0 && !arg2.field629) {
                    field1265.field3733 = 0;
                    arg0.method5270(field1265.field3731, 0, var26);
                    field1265.field3733 = 0;
                    String var29 = class297.method4941(class292.method13(class211.method5427(field1265)));
                    arg2.field978 = var29.trim();
                    arg2.field967 = var23 >> 8;
                    arg2.field983 = var23 & 0xFF;
                    arg2.field1003 = 150;
                    arg2.field964 = var25;
                    arg2.field999 = Statics.field658 != arg2 && var24.field3093 && client.field763 != "" && var29.toLowerCase().indexOf(client.field763) == -1;
                    int var30;
                    if (var24.field3092) {
                        var30 = var25 ? 91 : 1;
                    } else {
                        var30 = var25 ? 90 : 2;
                    }
                    if (var24.field3091 == -1) {
                        class92.method994(var30, arg2.field622.method4790(), var29);
                    } else {
                        class92.method994(var30, class82.method491(var24.field3091) + arg2.field622.method4790(), var29);
                    }
                }
            }
            arg0.field3733 = var26 + var27;
        }
        if ((arg3 & 0x100) != 0) {
            for (int var31 = 0; var31 < 3; var31++) {
                arg2.field620[var31] = arg0.method5076();
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var32 = arg0.method5069();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg0.method5077();
            client.method1001(arg2, var32, var33);
        }
        if (!arg2.field639) {
            return;
        }
        if (var4 == 127) {
            arg2.method1067(arg2.field640, arg2.field641);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1251[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1051(arg2.field640, arg2.field641, var34);
    }
}
