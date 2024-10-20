package deob;

@ObfuscatedName("cn")
public class class90 {

    @ObfuscatedName("cn.b")
    public static byte[] field1247 = new byte[2048];

    @ObfuscatedName("cn.g")
    public static byte[] field1248 = new byte[2048];

    @ObfuscatedName("cn.z")
    public static class300[] field1249 = new class300[2048];

    @ObfuscatedName("cn.p")
    public static int field1250 = 0;

    @ObfuscatedName("cn.h")
    public static int[] field1251 = new int[2048];

    @ObfuscatedName("cn.y")
    public static int field1260 = 0;

    @ObfuscatedName("cn.w")
    public static int[] field1258 = new int[2048];

    @ObfuscatedName("cn.i")
    public static int[] field1254 = new int[2048];

    @ObfuscatedName("cn.k")
    public static int[] field1255 = new int[2048];

    @ObfuscatedName("cn.x")
    public static int[] field1256 = new int[2048];

    @ObfuscatedName("cn.o")
    public static int field1245 = 0;

    @ObfuscatedName("cn.e")
    public static int[] field1261 = new int[2048];

    @ObfuscatedName("cn.n")
    public static class300 field1253 = new class300(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.u(Lkj;I)V")
    public static final void method3183(class299 arg0) {
        arg0.method5089();
        int var1 = client.field760;
        class67 var2 = Statics.field2558 = client.field759[var1] = new class67();
        var2.field609 = var1;
        int var3 = arg0.method5090(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field991[0] = var5 - Statics.field429;
        var2.field992 = (var2.field991[0] << 7) + (var2.method1094() << 6);
        var2.field956[0] = var6 - Statics.field3244;
        var2.field936 = (var2.field956[0] << 7) + (var2.method1094() << 6);
        Statics.field2321 = var2.field627 = var4;
        if (field1249[var1] != null) {
            var2.method1095(field1249[var1]);
        }
        field1250 = 0;
        field1251[++field1250 - 1] = var1;
        field1247[var1] = 0;
        field1260 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5090(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1254[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1255[var7] = 0;
                field1256[var7] = -1;
                field1258[++field1260 - 1] = var7;
                field1247[var7] = 0;
            }
        }
        arg0.method5091();
    }

    @ObfuscatedName("ez.f(Lkj;II)V")
    public static final void method3074(class299 arg0, int arg1) {
        int var2 = arg0.field3707;
        field1245 = 0;
        method1857(arg0);
        for (int var3 = 0; var3 < field1245; var3++) {
            int var4 = field1261[var3];
            class67 var5 = client.field759[var4];
            int var6 = arg0.method5138();
            if ((var6 & 0x4) != 0) {
                var6 += arg0.method5138() << 8;
            }
            method1964(arg0, var4, var5, var6);
        }
        if (arg0.field3707 - var2 != arg1) {
            throw new RuntimeException(arg0.field3707 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bk.b(Lkj;I)V")
    public static final void method1857(class299 arg0) {
        int var1 = 0;
        arg0.method5089();
        for (int var2 = 0; var2 < field1250; var2++) {
            int var3 = field1251[var2];
            if ((field1247[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1247[var3] = (byte) (field1247[var3] | 0x2);
                } else {
                    int var4 = arg0.method5090(1);
                    if (var4 == 0) {
                        var1 = method1929(arg0);
                        field1247[var3] = (byte) (field1247[var3] | 0x2);
                    } else {
                        method127(arg0, var3);
                    }
                }
            }
        }
        arg0.method5091();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5089();
        for (int var5 = 0; var5 < field1250; var5++) {
            int var6 = field1251[var5];
            if ((field1247[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1247[var6] = (byte) (field1247[var6] | 0x2);
                } else {
                    int var7 = arg0.method5090(1);
                    if (var7 == 0) {
                        var1 = method1929(arg0);
                        field1247[var6] = (byte) (field1247[var6] | 0x2);
                    } else {
                        method127(arg0, var6);
                    }
                }
            }
        }
        arg0.method5091();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5089();
        for (int var8 = 0; var8 < field1260; var8++) {
            int var9 = field1258[var8];
            if ((field1247[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1247[var9] = (byte) (field1247[var9] | 0x2);
                } else {
                    int var10 = arg0.method5090(1);
                    if (var10 == 0) {
                        var1 = method1929(arg0);
                        field1247[var9] = (byte) (field1247[var9] | 0x2);
                    } else if (method1151(arg0, var9)) {
                        field1247[var9] = (byte) (field1247[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5091();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5089();
        for (int var11 = 0; var11 < field1260; var11++) {
            int var12 = field1258[var11];
            if ((field1247[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1247[var12] = (byte) (field1247[var12] | 0x2);
                } else {
                    int var13 = arg0.method5090(1);
                    if (var13 == 0) {
                        var1 = method1929(arg0);
                        field1247[var12] = (byte) (field1247[var12] | 0x2);
                    } else if (method1151(arg0, var12)) {
                        field1247[var12] = (byte) (field1247[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5091();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1250 = 0;
        field1260 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1247[var14] = (byte) (field1247[var14] >> 1);
            class67 var15 = client.field759[var14];
            if (var15 == null) {
                field1258[++field1260 - 1] = var14;
            } else {
                field1251[++field1250 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cr.g(Lkj;I)I")
    public static int method1929(class299 arg0) {
        int var1 = arg0.method5090(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5090(5);
        } else if (var1 == 2) {
            var2 = arg0.method5090(8);
        } else {
            var2 = arg0.method5090(11);
        }
        return var2;
    }

    @ObfuscatedName("x.z(Lkj;II)V")
    public static void method127(class299 arg0, int arg1) {
        boolean var2 = arg0.method5090(1) == 1;
        if (var2) {
            field1261[++field1245 - 1] = arg1;
        }
        int var3 = arg0.method5090(2);
        class67 var4 = client.field759[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field631 = false;
            } else if (client.field760 == arg1) {
                throw new RuntimeException();
            } else {
                field1254[arg1] = (Statics.field3244 + var4.field956[0] >> 13) + (Statics.field429 + var4.field991[0] >> 13 << 14) + (var4.field627 << 28);
                if (var4.field966 == -1) {
                    field1255[arg1] = var4.field987;
                } else {
                    field1255[arg1] = var4.field966;
                }
                field1256[arg1] = var4.field962;
                client.field759[arg1] = null;
                if (arg0.method5090(1) != 0) {
                    method1151(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5090(3);
            int var6 = var4.field991[0];
            int var7 = var4.field956[0];
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
            if (client.field760 == arg1 && var4.field992 < 1536 || var4.field936 < 1536 || var4.field992 >= 11776 || var4.field936 >= 11776) {
                var4.method1105(var6, var7);
                var4.field631 = false;
            } else if (var2) {
                var4.field631 = true;
                var4.field632 = var6;
                var4.field634 = var7;
            } else {
                var4.field631 = false;
                var4.method1104(var6, var7, field1248[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5090(4);
            int var9 = var4.field991[0];
            int var10 = var4.field956[0];
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
            if (client.field760 == arg1 && var4.field992 < 1536 || var4.field936 < 1536 || var4.field992 >= 11776 || var4.field936 >= 11776) {
                var4.method1105(var9, var10);
                var4.field631 = false;
            } else if (var2) {
                var4.field631 = true;
                var4.field632 = var9;
                var4.field634 = var10;
            } else {
                var4.field631 = false;
                var4.method1104(var9, var10, field1248[arg1]);
            }
        } else {
            int var11 = arg0.method5090(1);
            if (var11 == 0) {
                int var12 = arg0.method5090(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field991[0] + var14;
                int var17 = var4.field956[0] + var15;
                if (client.field760 == arg1 && var4.field992 < 1536 || var4.field936 < 1536 || var4.field992 >= 11776 || var4.field936 >= 11776) {
                    var4.method1105(var16, var17);
                    var4.field631 = false;
                } else if (var2) {
                    var4.field631 = true;
                    var4.field632 = var16;
                    var4.field634 = var17;
                } else {
                    var4.field631 = false;
                    var4.method1104(var16, var17, field1248[arg1]);
                }
                var4.field627 = (byte) (var4.field627 + var13 & 0x3);
                if (client.field760 == arg1) {
                    Statics.field2321 = var4.field627;
                }
            } else {
                int var18 = arg0.method5090(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field429 + var4.field991[0] + var20 & 0x3FFF) - Statics.field429;
                int var23 = (Statics.field3244 + var4.field956[0] + var21 & 0x3FFF) - Statics.field3244;
                if (client.field760 == arg1 && var4.field992 < 1536 || var4.field936 < 1536 || var4.field992 >= 11776 || var4.field936 >= 11776) {
                    var4.method1105(var22, var23);
                    var4.field631 = false;
                } else if (var2) {
                    var4.field631 = true;
                    var4.field632 = var22;
                    var4.field634 = var23;
                } else {
                    var4.field631 = false;
                    var4.method1104(var22, var23, field1248[arg1]);
                }
                var4.field627 = (byte) (var4.field627 + var19 & 0x3);
                if (client.field760 == arg1) {
                    Statics.field2321 = var4.field627;
                }
            }
        }
    }

    @ObfuscatedName("client.p(Lkj;II)Z")
    public static boolean method1151(class299 arg0, int arg1) {
        int var2 = arg0.method5090(2);
        if (var2 == 0) {
            if (arg0.method5090(1) != 0) {
                method1151(arg0, arg1);
            }
            int var3 = arg0.method5090(13);
            int var4 = arg0.method5090(13);
            boolean var5 = arg0.method5090(1) == 1;
            if (var5) {
                field1261[++field1245 - 1] = arg1;
            }
            if (client.field759[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field759[arg1] = new class67();
            var6.field609 = arg1;
            if (field1249[arg1] != null) {
                var6.method1095(field1249[arg1]);
            }
            var6.field987 = field1255[arg1];
            var6.field962 = field1256[arg1];
            int var7 = field1254[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field993[0] = field1248[arg1];
            var6.field627 = (byte) var8;
            var6.method1105((var9 << 13) + var3 - Statics.field429, (var10 << 13) + var4 - Statics.field3244);
            var6.field631 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5090(2);
            int var12 = field1254[arg1];
            field1254[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5090(5);
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
            int var20 = arg0.method5090(18);
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

    @ObfuscatedName("cn.h(Lkj;ILbg;II)V")
    public static final void method1964(class299 arg0, int arg1, class67 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x200) != 0) {
            arg2.field947 = arg0.method5170();
            arg2.field980 = arg0.method5309();
            arg2.field979 = arg0.method5170();
            arg2.field981 = arg0.method5174();
            arg2.field935 = arg0.method5256() + client.field655;
            arg2.field983 = arg0.method5177() + client.field655;
            arg2.field984 = arg0.method5256();
            if (arg2.field631) {
                arg2.field947 += arg2.field632;
                arg2.field980 += arg2.field634;
                arg2.field979 += arg2.field632;
                arg2.field981 += arg2.field634;
                arg2.field967 = 0;
            } else {
                arg2.field947 += arg2.field991[0];
                arg2.field980 += arg2.field956[0];
                arg2.field979 += arg2.field991[0];
                arg2.field981 += arg2.field956[0];
                arg2.field967 = 1;
            }
            arg2.field995 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field973 = arg0.method5256();
            int var5 = arg0.method5186();
            arg2.field997 = var5 >> 16;
            arg2.field976 = (var5 & 0xFFFF) + client.field655;
            arg2.field974 = 0;
            arg2.field975 = 0;
            if (arg2.field976 > client.field655) {
                arg2.field974 = -1;
            }
            if (arg2.field973 == 65535) {
                arg2.field973 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method5139();
        }
        if ((arg3 & 0x1000) != 0) {
            field1248[arg1] = arg0.method5170();
        }
        if ((arg3 & 0x80) != 0) {
            int var6 = arg0.method5265();
            byte[] var7 = new byte[var6];
            class300 var8 = new class300(var7);
            arg0.method5228(var7, 0, var6);
            field1249[arg1] = var8;
            arg2.method1095(var8);
        }
        if ((arg3 & 0x100) != 0) {
            for (int var9 = 0; var9 < 3; var9++) {
                arg2.field610[var9] = arg0.method5147();
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field949 = arg0.method5147();
            if (arg2.field949.charAt(0) == '~') {
                arg2.field949 = arg2.field949.substring(1);
                class92.method151(2, arg2.field607.method4837(), arg2.field949);
            } else if (Statics.field2558 == arg2) {
                class92.method151(2, arg2.field607.method4837(), arg2.field949);
            }
            arg2.field994 = false;
            arg2.field953 = 0;
            arg2.field954 = 0;
            arg2.field952 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field962 = arg0.method5256();
            if (arg2.field962 == 65535) {
                arg2.field962 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field966 = arg0.method5177();
            if (arg2.field967 == 0) {
                arg2.field987 = arg2.field966;
                arg2.field966 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method5256();
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg0.method5226();
            client.method276(arg2, var10, var11);
        }
        if ((arg3 & 0x8) != 0) {
            int var12 = arg0.method5138();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = -1;
                    int var15 = -1;
                    int var16 = -1;
                    int var17 = arg0.method5246();
                    if (var17 == 32767) {
                        var17 = arg0.method5246();
                        var15 = arg0.method5246();
                        var14 = arg0.method5246();
                        var16 = arg0.method5246();
                    } else if (var17 == 32766) {
                        var17 = -1;
                    } else {
                        var15 = arg0.method5246();
                    }
                    int var18 = arg0.method5246();
                    arg2.method1578(var17, var15, var14, var16, client.field655, var18);
                }
            }
            int var19 = arg0.method5168();
            if (var19 > 0) {
                for (int var20 = 0; var20 < var19; var20++) {
                    int var21 = arg0.method5246();
                    int var22 = arg0.method5246();
                    if (var22 == 32767) {
                        arg2.method1588(var21);
                    } else {
                        int var23 = arg0.method5246();
                        int var24 = arg0.method5168();
                        int var25 = var22 > 0 ? arg0.method5265() : var24;
                        arg2.method1576(var21, client.field655, var22, var23, var24, var25);
                    }
                }
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var26 = arg0.method5256();
            class229 var27 = (class229) class196.method3304(class229.method21(), arg0.method5265());
            boolean var28 = arg0.method5168() == 1;
            int var29 = arg0.method5138();
            int var30 = arg0.field3707;
            if (arg2.field607 != null && arg2.field617 != null) {
                boolean var31 = false;
                if (var27.field3096 && Statics.field1745.method1723(arg2.field607)) {
                    var31 = true;
                }
                if (!var31 && client.field757 == 0 && !arg2.field626) {
                    field1253.field3707 = 0;
                    arg0.method5228(field1253.field3708, 0, var29);
                    field1253.field3707 = 0;
                    String var32 = class296.method4992(class291.method3391(class211.method122(field1253)));
                    arg2.field949 = var32.trim();
                    arg2.field953 = var26 >> 8;
                    arg2.field954 = var26 & 0xFF;
                    arg2.field952 = 150;
                    arg2.field994 = var28;
                    arg2.field951 = Statics.field2558 != arg2 && var27.field3096 && client.field861 != "" && var32.toLowerCase().indexOf(client.field861) == -1;
                    int var33;
                    if (var27.field3103) {
                        var33 = var28 ? 91 : 1;
                    } else {
                        var33 = var28 ? 90 : 2;
                    }
                    if (var27.field3101 == -1) {
                        class92.method151(var33, arg2.field607.method4837(), var32);
                    } else {
                        class92.method151(var33, class82.method1571(var27.field3101) + arg2.field607.method4837(), var32);
                    }
                }
            }
            arg0.field3707 = var29 + var30;
        }
        if (!arg2.field631) {
            return;
        }
        if (var4 == 127) {
            arg2.method1105(arg2.field632, arg2.field634);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1248[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1104(arg2.field632, arg2.field634, var34);
    }

    @ObfuscatedName("ae.y(I)V")
    public static void method658() {
        field1250 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1249[var0] = null;
            field1248[var0] = 1;
        }
    }
}
