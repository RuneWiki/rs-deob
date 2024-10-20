package deob;

@ObfuscatedName("cu")
public class class90 {

    @ObfuscatedName("cu.n")
    public static byte[] field1228 = new byte[2048];

    @ObfuscatedName("cu.q")
    public static byte[] field1229 = new byte[2048];

    @ObfuscatedName("cu.v")
    public static class300[] field1230 = new class300[2048];

    @ObfuscatedName("cu.l")
    public static int field1240 = 0;

    @ObfuscatedName("cu.c")
    public static int[] field1232 = new int[2048];

    @ObfuscatedName("cu.o")
    public static int field1236 = 0;

    @ObfuscatedName("cu.i")
    public static int[] field1234 = new int[2048];

    @ObfuscatedName("cu.d")
    public static int[] field1235 = new int[2048];

    @ObfuscatedName("cu.m")
    public static int[] field1226 = new int[2048];

    @ObfuscatedName("cu.p")
    public static int[] field1233 = new int[2048];

    @ObfuscatedName("cu.h")
    public static int field1238 = 0;

    @ObfuscatedName("cu.k")
    public static int[] field1231 = new int[2048];

    @ObfuscatedName("cu.x")
    public static class300 field1239 = new class300(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.a(Lkf;B)V")
    public static final void method1057(class299 arg0) {
        arg0.method5073();
        int var1 = client.field738;
        class67 var2 = Statics.field2530 = client.field748[var1] = new class67();
        var2.field619 = var1;
        int var3 = arg0.method5074(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field924[0] = var5 - Statics.field1961;
        var2.field930 = (var2.field924[0] << 7) + (var2.method1158() << 6);
        var2.field931[0] = var6 - Statics.field1108;
        var2.field933 = (var2.field931[0] << 7) + (var2.method1158() << 6);
        Statics.field625 = var2.field618 = var4;
        if (field1230[var1] != null) {
            var2.method1183(field1230[var1]);
        }
        field1240 = 0;
        field1232[++field1240 - 1] = var1;
        field1228[var1] = 0;
        field1236 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5074(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1235[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1226[var7] = 0;
                field1233[var7] = -1;
                field1234[++field1236 - 1] = var7;
                field1228[var7] = 0;
            }
        }
        arg0.method5075();
    }

    @ObfuscatedName("li.t(Lkf;IB)V")
    public static final void method5569(class299 arg0, int arg1) {
        int var2 = arg0.field3694;
        field1238 = 0;
        method745(arg0);
        method28(arg0);
        if (arg0.field3694 - var2 != arg1) {
            throw new RuntimeException(arg0.field3694 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("az.n(Lkf;I)V")
    public static final void method745(class299 arg0) {
        int var1 = 0;
        arg0.method5073();
        for (int var2 = 0; var2 < field1240; var2++) {
            int var3 = field1232[var2];
            if ((field1228[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1228[var3] = (byte) (field1228[var3] | 0x2);
                } else {
                    int var4 = arg0.method5074(1);
                    if (var4 == 0) {
                        var1 = method1989(arg0);
                        field1228[var3] = (byte) (field1228[var3] | 0x2);
                    } else {
                        method3402(arg0, var3);
                    }
                }
            }
        }
        arg0.method5075();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5073();
        for (int var5 = 0; var5 < field1240; var5++) {
            int var6 = field1232[var5];
            if ((field1228[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1228[var6] = (byte) (field1228[var6] | 0x2);
                } else {
                    int var7 = arg0.method5074(1);
                    if (var7 == 0) {
                        var1 = method1989(arg0);
                        field1228[var6] = (byte) (field1228[var6] | 0x2);
                    } else {
                        method3402(arg0, var6);
                    }
                }
            }
        }
        arg0.method5075();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5073();
        for (int var8 = 0; var8 < field1236; var8++) {
            int var9 = field1234[var8];
            if ((field1228[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1228[var9] = (byte) (field1228[var9] | 0x2);
                } else {
                    int var10 = arg0.method5074(1);
                    if (var10 == 0) {
                        var1 = method1989(arg0);
                        field1228[var9] = (byte) (field1228[var9] | 0x2);
                    } else if (method4196(arg0, var9)) {
                        field1228[var9] = (byte) (field1228[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5075();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5073();
        for (int var11 = 0; var11 < field1236; var11++) {
            int var12 = field1234[var11];
            if ((field1228[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1228[var12] = (byte) (field1228[var12] | 0x2);
                } else {
                    int var13 = arg0.method5074(1);
                    if (var13 == 0) {
                        var1 = method1989(arg0);
                        field1228[var12] = (byte) (field1228[var12] | 0x2);
                    } else if (method4196(arg0, var12)) {
                        field1228[var12] = (byte) (field1228[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5075();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1240 = 0;
        field1236 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1228[var14] = (byte) (field1228[var14] >> 1);
            class67 var15 = client.field748[var14];
            if (var15 == null) {
                field1234[++field1236 - 1] = var14;
            } else {
                field1232[++field1240 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cw.q(Lkf;I)I")
    public static int method1989(class299 arg0) {
        int var1 = arg0.method5074(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5074(5);
        } else if (var1 == 2) {
            var2 = arg0.method5074(8);
        } else {
            var2 = arg0.method5074(11);
        }
        return var2;
    }

    @ObfuscatedName("gx.v(Lkf;II)V")
    public static void method3402(class299 arg0, int arg1) {
        boolean var2 = arg0.method5074(1) == 1;
        if (var2) {
            field1231[++field1238 - 1] = arg1;
        }
        int var3 = arg0.method5074(2);
        class67 var4 = client.field748[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field607 = false;
            } else if (client.field738 == arg1) {
                throw new RuntimeException();
            } else {
                field1235[arg1] = (Statics.field1108 + var4.field931[0] >> 13) + (Statics.field1961 + var4.field924[0] >> 13 << 14) + (var4.field618 << 28);
                if (var4.field935 == -1) {
                    field1226[arg1] = var4.field927;
                } else {
                    field1226[arg1] = var4.field935;
                }
                field1233[arg1] = var4.field947;
                client.field748[arg1] = null;
                if (arg0.method5074(1) != 0) {
                    method4196(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5074(3);
            int var6 = var4.field924[0];
            int var7 = var4.field931[0];
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
            if (client.field738 == arg1 && var4.field930 < 1536 || var4.field933 < 1536 || var4.field930 >= 11776 || var4.field933 >= 11776) {
                var4.method1151(var6, var7);
                var4.field607 = false;
            } else if (var2) {
                var4.field607 = true;
                var4.field616 = var6;
                var4.field624 = var7;
            } else {
                var4.field607 = false;
                var4.method1160(var6, var7, field1229[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5074(4);
            int var9 = var4.field924[0];
            int var10 = var4.field931[0];
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
            if (client.field738 == arg1 && var4.field930 < 1536 || var4.field933 < 1536 || var4.field930 >= 11776 || var4.field933 >= 11776) {
                var4.method1151(var9, var10);
                var4.field607 = false;
            } else if (var2) {
                var4.field607 = true;
                var4.field616 = var9;
                var4.field624 = var10;
            } else {
                var4.field607 = false;
                var4.method1160(var9, var10, field1229[arg1]);
            }
        } else {
            int var11 = arg0.method5074(1);
            if (var11 == 0) {
                int var12 = arg0.method5074(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field924[0] + var14;
                int var17 = var4.field931[0] + var15;
                if (client.field738 == arg1 && var4.field930 < 1536 || var4.field933 < 1536 || var4.field930 >= 11776 || var4.field933 >= 11776) {
                    var4.method1151(var16, var17);
                    var4.field607 = false;
                } else if (var2) {
                    var4.field607 = true;
                    var4.field616 = var16;
                    var4.field624 = var17;
                } else {
                    var4.field607 = false;
                    var4.method1160(var16, var17, field1229[arg1]);
                }
                var4.field618 = (byte) (var4.field618 + var13 & 0x3);
                if (client.field738 == arg1) {
                    Statics.field625 = var4.field618;
                }
            } else {
                int var18 = arg0.method5074(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1961 + var4.field924[0] + var20 & 0x3FFF) - Statics.field1961;
                int var23 = (Statics.field1108 + var4.field931[0] + var21 & 0x3FFF) - Statics.field1108;
                if (client.field738 == arg1 && var4.field930 < 1536 || var4.field933 < 1536 || var4.field930 >= 11776 || var4.field933 >= 11776) {
                    var4.method1151(var22, var23);
                    var4.field607 = false;
                } else if (var2) {
                    var4.field607 = true;
                    var4.field616 = var22;
                    var4.field624 = var23;
                } else {
                    var4.field607 = false;
                    var4.method1160(var22, var23, field1229[arg1]);
                }
                var4.field618 = (byte) (var4.field618 + var19 & 0x3);
                if (client.field738 == arg1) {
                    Statics.field625 = var4.field618;
                }
            }
        }
    }

    @ObfuscatedName("ic.l(Lkf;IB)Z")
    public static boolean method4196(class299 arg0, int arg1) {
        int var2 = arg0.method5074(2);
        if (var2 == 0) {
            if (arg0.method5074(1) != 0) {
                method4196(arg0, arg1);
            }
            int var3 = arg0.method5074(13);
            int var4 = arg0.method5074(13);
            boolean var5 = arg0.method5074(1) == 1;
            if (var5) {
                field1231[++field1238 - 1] = arg1;
            }
            if (client.field748[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field748[arg1] = new class67();
            var6.field619 = arg1;
            if (field1230[arg1] != null) {
                var6.method1183(field1230[arg1]);
            }
            var6.field927 = field1226[arg1];
            var6.field947 = field1233[arg1];
            int var7 = field1235[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field982[0] = field1229[arg1];
            var6.field618 = (byte) var8;
            var6.method1151((var9 << 13) + var3 - Statics.field1961, (var10 << 13) + var4 - Statics.field1108);
            var6.field607 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5074(2);
            int var12 = field1235[arg1];
            field1235[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5074(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1235[arg1];
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
            field1235[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5074(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1235[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1235[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("n.c(Lkf;I)V")
    public static final void method28(class299 arg0) {
        for (int var1 = 0; var1 < field1238; var1++) {
            int var2 = field1231[var1];
            class67 var3 = client.field748[var2];
            int var4 = arg0.method5123();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method5123() << 8;
            }
            method3436(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("gf.o(Lkf;ILbj;IB)V")
    public static final void method3436(class299 arg0, int arg1, class67 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method5162();
            class229 var6 = (class229) class196.method292(class229.method800(), arg0.method5153());
            boolean var7 = arg0.method5123() == 1;
            int var8 = arg0.method5123();
            int var9 = arg0.field3694;
            if (arg2.field601 != null && arg2.field597 != null) {
                boolean var10 = false;
                if (var6.field3079 && Statics.field1296.method1826(arg2.field601)) {
                    var10 = true;
                }
                if (!var10 && client.field746 == 0 && !arg2.field617) {
                    field1239.field3694 = 0;
                    arg0.method5216(field1239.field3699, 0, var8);
                    field1239.field3694 = 0;
                    String var11 = class296.method5037(class291.method3853(class211.method58(field1239)));
                    arg2.field948 = var11.trim();
                    arg2.field942 = var5 >> 8;
                    arg2.field943 = var5 & 0xFF;
                    arg2.field951 = 150;
                    arg2.field939 = var7;
                    arg2.field940 = Statics.field2530 != arg2 && var6.field3079 && client.field850 != "" && var11.toLowerCase().indexOf(client.field850) == -1;
                    int var12;
                    if (var6.field3082) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field3080 == -1) {
                        class92.method522(var12, arg2.field601.method4851(), var11);
                    } else {
                        class92.method522(var12, class82.method90(var6.field3080) + arg2.field601.method4851(), var11);
                    }
                }
            }
            arg0.field3694 = var8 + var9;
        }
        if ((arg3 & 0x4) != 0) {
            int var13 = arg0.method5166();
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = arg0.method5211();
            client.method1107(arg2, var13, var14);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field948 = arg0.method5132();
            if (arg2.field948.charAt(0) == '~') {
                arg2.field948 = arg2.field948.substring(1);
                class92.method522(2, arg2.field601.method4851(), arg2.field948);
            } else if (Statics.field2530 == arg2) {
                class92.method522(2, arg2.field601.method4851(), arg2.field948);
            }
            arg2.field939 = false;
            arg2.field942 = 0;
            arg2.field943 = 0;
            arg2.field951 = 150;
        }
        if ((arg3 & 0x800) != 0) {
            field1229[arg1] = arg0.method5154();
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field935 = arg0.method5162();
            if (arg2.field979 == 0) {
                arg2.field927 = arg2.field935;
                arg2.field935 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var15 = arg0.method5136();
            byte[] var16 = new byte[var15];
            class300 var17 = new class300(var16);
            arg0.method5210(var16, 0, var15);
            field1230[arg1] = var17;
            arg2.method1183(var17);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field967 = arg0.method5154();
            arg2.field980 = arg0.method5154();
            arg2.field968 = arg0.method5154();
            arg2.field970 = arg0.method5185();
            arg2.field926 = arg0.method5166() + client.field643;
            arg2.field972 = arg0.method5161() + client.field643;
            arg2.field973 = arg0.method5162();
            if (arg2.field607) {
                arg2.field967 += arg2.field616;
                arg2.field980 += arg2.field624;
                arg2.field968 += arg2.field616;
                arg2.field970 += arg2.field624;
                arg2.field979 = 0;
            } else {
                arg2.field967 += arg2.field924[0];
                arg2.field980 += arg2.field931[0];
                arg2.field968 += arg2.field924[0];
                arg2.field970 += arg2.field931[0];
                arg2.field979 = 1;
            }
            arg2.field984 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method5185();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field947 = arg0.method5166();
            if (arg2.field947 == 65535) {
                arg2.field947 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field962 = arg0.method5162();
            int var18 = arg0.method5155();
            arg2.field966 = var18 >> 16;
            arg2.field974 = (var18 & 0xFFFF) + client.field643;
            arg2.field963 = 0;
            arg2.field964 = 0;
            if (arg2.field974 > client.field643) {
                arg2.field963 = -1;
            }
            if (arg2.field962 == 65535) {
                arg2.field962 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var19 = arg0.method5123();
            if (var19 > 0) {
                for (int var20 = 0; var20 < var19; var20++) {
                    int var21 = -1;
                    int var22 = -1;
                    int var23 = -1;
                    int var24 = arg0.method5309();
                    if (var24 == 32767) {
                        var24 = arg0.method5309();
                        var22 = arg0.method5309();
                        var21 = arg0.method5309();
                        var23 = arg0.method5309();
                    } else if (var24 == 32766) {
                        var24 = -1;
                    } else {
                        var22 = arg0.method5309();
                    }
                    int var25 = arg0.method5309();
                    arg2.method1653(var24, var22, var21, var23, client.field643, var25);
                }
            }
            int var26 = arg0.method5211();
            if (var26 > 0) {
                for (int var27 = 0; var27 < var26; var27++) {
                    int var28 = arg0.method5309();
                    int var29 = arg0.method5309();
                    if (var29 == 32767) {
                        arg2.method1655(var28);
                    } else {
                        int var30 = arg0.method5309();
                        int var31 = arg0.method5136();
                        int var32 = var29 > 0 ? arg0.method5211() : var31;
                        arg2.method1654(var28, client.field643, var29, var30, var31, var32);
                    }
                }
            }
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field609[var33] = arg0.method5132();
            }
        }
        if (!arg2.field607) {
            return;
        }
        if (var4 == 127) {
            arg2.method1151(arg2.field616, arg2.field624);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1229[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1160(arg2.field616, arg2.field624, var34);
    }
}
