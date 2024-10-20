package deob;

@ObfuscatedName("av")
public class class46 {

    @ObfuscatedName("av.c")
    public static byte[] field922 = new byte[2048];

    @ObfuscatedName("av.d")
    public static byte[] field936 = new byte[2048];

    @ObfuscatedName("av.w")
    public static class154[] field924 = new class154[2048];

    @ObfuscatedName("av.h")
    public static int field935 = 0;

    @ObfuscatedName("av.u")
    public static int[] field926 = new int[2048];

    @ObfuscatedName("av.k")
    public static int field927 = 0;

    @ObfuscatedName("av.g")
    public static int[] field928 = new int[2048];

    @ObfuscatedName("av.y")
    public static int[] field929 = new int[2048];

    @ObfuscatedName("av.e")
    public static int[] field930 = new int[2048];

    @ObfuscatedName("av.q")
    public static int[] field931 = new int[2048];

    @ObfuscatedName("av.v")
    public static int field920 = 0;

    @ObfuscatedName("av.l")
    public static int[] field933 = new int[2048];

    @ObfuscatedName("av.s")
    public static class154 field934 = new class154(new byte[5000]);

    public class46() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.x(Lfu;I)V")
    public static final void method217(class160 arg0) {
        arg0.method2883();
        int var1 = client.field435;
        class24 var2 = Statics.field266 = client.field434[var1] = new class24();
        var2.field277 = var1;
        int var3 = arg0.method2895(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field681[0] = var5 - Statics.field791;
        var2.field675 = (var2.field681[0] << 7) + (var2.method246() << 6);
        var2.field632[0] = var6 - Statics.field37;
        var2.field627 = (var2.field632[0] << 7) + (var2.method246() << 6);
        Statics.field744 = var2.field292 = var4;
        if (field924[var1] != null) {
            var2.method245(field924[var1]);
        }
        field935 = 0;
        field926[++field935 - 1] = var1;
        field922[var1] = 0;
        field927 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2895(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field929[var7] = (var9 << 28) + (var10 << 14) + var11;
                field930[var7] = 0;
                field931[var7] = -1;
                field928[++field927 - 1] = var7;
                field922[var7] = 0;
            }
        }
        arg0.method2880();
    }

    @ObfuscatedName("f.j(Lfu;II)V")
    public static final void method210(class160 arg0, int arg1) {
        int var2 = arg0.field2086;
        field920 = 0;
        method59(arg0);
        method806(arg0);
        if (arg0.field2086 - var2 != arg1) {
            throw new RuntimeException(arg0.field2086 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("w.c(Lfu;B)V")
    public static final void method59(class160 arg0) {
        int var1 = 0;
        arg0.method2883();
        for (int var2 = 0; var2 < field935; var2++) {
            int var3 = field926[var2];
            if ((field922[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field922[var3] = (byte) (field922[var3] | 0x2);
                } else {
                    int var4 = arg0.method2895(1);
                    if (var4 == 0) {
                        var1 = method931(arg0);
                        field922[var3] = (byte) (field922[var3] | 0x2);
                    } else {
                        method2921(arg0, var3);
                    }
                }
            }
        }
        arg0.method2880();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2883();
        for (int var5 = 0; var5 < field935; var5++) {
            int var6 = field926[var5];
            if ((field922[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field922[var6] = (byte) (field922[var6] | 0x2);
                } else {
                    int var7 = arg0.method2895(1);
                    if (var7 == 0) {
                        var1 = method931(arg0);
                        field922[var6] = (byte) (field922[var6] | 0x2);
                    } else {
                        method2921(arg0, var6);
                    }
                }
            }
        }
        arg0.method2880();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2883();
        for (int var8 = 0; var8 < field927; var8++) {
            int var9 = field928[var8];
            if ((field922[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field922[var9] = (byte) (field922[var9] | 0x2);
                } else {
                    int var10 = arg0.method2895(1);
                    if (var10 == 0) {
                        var1 = method931(arg0);
                        field922[var9] = (byte) (field922[var9] | 0x2);
                    } else if (Statics.method202(arg0, var9)) {
                        field922[var9] = (byte) (field922[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2880();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2883();
        for (int var11 = 0; var11 < field927; var11++) {
            int var12 = field928[var11];
            if ((field922[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field922[var12] = (byte) (field922[var12] | 0x2);
                } else {
                    int var13 = arg0.method2895(1);
                    if (var13 == 0) {
                        var1 = method931(arg0);
                        field922[var12] = (byte) (field922[var12] | 0x2);
                    } else if (Statics.method202(arg0, var12)) {
                        field922[var12] = (byte) (field922[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2880();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field935 = 0;
        field927 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field922[var14] = (byte) (field922[var14] >> 1);
            class24 var15 = client.field434[var14];
            if (var15 == null) {
                field928[++field927 - 1] = var14;
            } else {
                field926[++field935 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("al.d(Lfu;I)I")
    public static int method931(class160 arg0) {
        int var1 = arg0.method2895(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2895(5);
        } else if (var1 == 2) {
            var2 = arg0.method2895(8);
        } else {
            var2 = arg0.method2895(11);
        }
        return var2;
    }

    @ObfuscatedName("fo.w(Lfu;II)V")
    public static void method2921(class160 arg0, int arg1) {
        boolean var2 = arg0.method2895(1) == 1;
        if (var2) {
            field933[++field920 - 1] = arg1;
        }
        int var3 = arg0.method2895(2);
        class24 var4 = client.field434[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field294 = false;
            } else if (client.field435 == arg1) {
                throw new RuntimeException();
            } else {
                field929[arg1] = (Statics.field37 + var4.field632[0] >> 13) + (Statics.field791 + var4.field681[0] >> 13 << 14) + (var4.field292 << 28);
                if (var4.field654 == -1) {
                    field930[arg1] = var4.field677;
                } else {
                    field930[arg1] = var4.field654;
                }
                field931[arg1] = var4.field641;
                client.field434[arg1] = null;
                if (arg0.method2895(1) != 0) {
                    Statics.method202(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2895(3);
            int var6 = var4.field681[0];
            int var7 = var4.field632[0];
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
            if (client.field435 == arg1 && var4.field675 < 1536 || var4.field627 < 1536 || var4.field675 >= 11776 || var4.field627 >= 11776) {
                var4.method249(var6, var7);
                var4.field294 = false;
            } else if (var2) {
                var4.field294 = true;
                var4.field296 = var6;
                var4.field285 = var7;
            } else {
                var4.field294 = false;
                var4.method248(var6, var7, field936[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2895(4);
            int var9 = var4.field681[0];
            int var10 = var4.field632[0];
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
            if (client.field435 == arg1 && var4.field675 < 1536 || var4.field627 < 1536 || var4.field675 >= 11776 || var4.field627 >= 11776) {
                var4.method249(var9, var10);
                var4.field294 = false;
            } else if (var2) {
                var4.field294 = true;
                var4.field296 = var9;
                var4.field285 = var10;
            } else {
                var4.field294 = false;
                var4.method248(var9, var10, field936[arg1]);
            }
        } else {
            int var11 = arg0.method2895(1);
            if (var11 == 0) {
                int var12 = arg0.method2895(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field681[0] + var14;
                int var17 = var4.field632[0] + var15;
                if (client.field435 == arg1 && var4.field675 < 1536 || var4.field627 < 1536 || var4.field675 >= 11776 || var4.field627 >= 11776) {
                    var4.method249(var16, var17);
                    var4.field294 = false;
                } else if (var2) {
                    var4.field294 = true;
                    var4.field296 = var16;
                    var4.field285 = var17;
                } else {
                    var4.field294 = false;
                    var4.method248(var16, var17, field936[arg1]);
                }
                var4.field292 = (byte) (var4.field292 + var13 & 0x3);
                if (client.field435 == arg1) {
                    Statics.field744 = var4.field292;
                }
            } else {
                int var18 = arg0.method2895(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field791 + var4.field681[0] + var20 & 0x3FFF) - Statics.field791;
                int var23 = (Statics.field37 + var4.field632[0] + var21 & 0x3FFF) - Statics.field37;
                if (client.field435 == arg1 && var4.field675 < 1536 || var4.field627 < 1536 || var4.field675 >= 11776 || var4.field627 >= 11776) {
                    var4.method249(var22, var23);
                    var4.field294 = false;
                } else if (var2) {
                    var4.field294 = true;
                    var4.field296 = var22;
                    var4.field285 = var23;
                } else {
                    var4.field294 = false;
                    var4.method248(var22, var23, field936[arg1]);
                }
                var4.field292 = (byte) (var4.field292 + var19 & 0x3);
                if (client.field435 == arg1) {
                    Statics.field744 = var4.field292;
                }
            }
        }
    }

    @ObfuscatedName("ay.y(Lfu;I)V")
    public static final void method806(class160 arg0) {
        for (int var1 = 0; var1 < field920; var1++) {
            int var2 = field933[var1];
            class24 var3 = client.field434[var2];
            int var4 = arg0.method2701();
            if ((var4 & 0x40) != 0) {
                var4 += arg0.method2701() << 8;
            }
            method2600(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("el.e(Lfu;ILn;II)V")
    public static final void method2600(class160 arg0, int arg1, class24 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method2701();
            byte[] var6 = new byte[var5];
            class154 var7 = new class154(var6);
            arg0.method2650(var6, 0, var5);
            field924[arg1] = var7;
            arg2.method245(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method2745();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2701();
            client.method1872(arg2, var8, var9);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field641 = arg0.method2745();
            if (arg2.field641 == 65535) {
                arg2.field641 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field639 = arg0.method2699();
            if (arg2.field639.charAt(0) == '~') {
                arg2.field639 = arg2.field639.substring(1);
                class48.method685(2, arg2.field283, arg2.field639);
            } else if (Statics.field266 == arg2) {
                class48.method685(2, arg2.field283, arg2.field639);
            }
            arg2.field640 = false;
            arg2.field643 = 0;
            arg2.field644 = 0;
            arg2.field642 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var10 = arg0.method2701();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2821();
                    if (var15 == 32767) {
                        var15 = arg0.method2821();
                        var13 = arg0.method2821();
                        var12 = arg0.method2821();
                        var14 = arg0.method2821();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2821();
                    }
                    int var16 = arg0.method2821();
                    arg2.method609(var15, var13, var12, var14, client.field320, var16);
                }
            }
            int var17 = arg0.method2701();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2821();
                    int var20 = arg0.method2821();
                    if (var20 == 32767) {
                        arg2.method607(var19);
                    } else {
                        int var21 = arg0.method2821();
                        int var22 = arg0.method2701();
                        int var23 = var20 > 0 ? arg0.method2701() : var22;
                        arg2.method608(var19, client.field320, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field654 = arg0.method2745();
            if (arg2.field680 == 0) {
                arg2.field677 = arg2.field654;
                arg2.field654 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var24 = arg0.method2745();
            class178[] var25 = new class178[] { class178.field2656, class178.field2660, class178.field2654, class178.field2653, class178.field2658, class178.field2655 };
            class178 var26 = (class178) Statics.method78(var25, arg0.method2701());
            boolean var27 = arg0.method2701() == 1;
            int var28 = arg0.method2701();
            int var29 = arg0.field2086;
            if (arg2.field283 != null && arg2.field270 != null) {
                boolean var30 = false;
                if (var26.field2661 && client.method2088(arg2.field283)) {
                    var30 = true;
                }
                if (!var30 && client.field433 == 0 && !arg2.field291) {
                    field934.field2086 = 0;
                    arg0.method2650(field934.field2091, 0, var28);
                    field934.field2086 = 0;
                    String var31 = class210.method3667(class208.method65(class211.method3068(field934)));
                    arg2.field639 = var31.trim();
                    arg2.field643 = var24 >> 8;
                    arg2.field644 = var24 & 0xFF;
                    arg2.field642 = 150;
                    arg2.field640 = var27;
                    arg2.field662 = Statics.field266 != arg2 && var26.field2661 && client.field534 != "" && var31.toLowerCase().indexOf(client.field534) == -1;
                    int var32;
                    if (var26.field2662) {
                        var32 = var27 ? 91 : 1;
                    } else {
                        var32 = var27 ? 90 : 2;
                    }
                    if (var26.field2659 == -1) {
                        class48.method685(var32, arg2.field283, var31);
                    } else {
                        class48.method685(var32, class38.method2016(var26.field2659) + arg2.field283, var31);
                    }
                }
            }
            arg0.field2086 = var28 + var29;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field634 = arg0.method2745();
            int var33 = arg0.method2644();
            arg2.field667 = var33 >> 16;
            arg2.field666 = (var33 & 0xFFFF) + client.field320;
            arg2.field663 = 0;
            arg2.field665 = 0;
            if (arg2.field666 > client.field320) {
                arg2.field663 = -1;
            }
            if (arg2.field634 == 65535) {
                arg2.field634 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field651 = arg0.method2640();
            arg2.field670 = arg0.method2640();
            arg2.field664 = arg0.method2640();
            arg2.field671 = arg0.method2640();
            arg2.field672 = arg0.method2745() + client.field320;
            arg2.field648 = arg0.method2745() + client.field320;
            arg2.field674 = arg0.method2745();
            if (arg2.field294) {
                arg2.field651 += arg2.field296;
                arg2.field670 += arg2.field285;
                arg2.field664 += arg2.field296;
                arg2.field671 += arg2.field285;
                arg2.field680 = 0;
            } else {
                arg2.field651 += arg2.field681[0];
                arg2.field670 += arg2.field632[0];
                arg2.field664 += arg2.field681[0];
                arg2.field671 += arg2.field632[0];
                arg2.field680 = 1;
            }
            arg2.field637 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field936[arg1] = arg0.method2640();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method2640();
        }
        if ((arg3 & 0x800) != 0) {
            for (int var34 = 0; var34 < 3; var34++) {
                arg2.field275[var34] = arg0.method2699();
            }
        }
        if (!arg2.field294) {
            return;
        }
        if (var4 == 127) {
            arg2.method249(arg2.field296, arg2.field285);
            return;
        }
        byte var35;
        if (var4 == -1) {
            var35 = field936[arg1];
        } else {
            var35 = var4;
        }
        arg2.method248(arg2.field296, arg2.field285, var35);
    }

    @ObfuscatedName("gx.q(B)V")
    public static void method3271() {
        field935 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field924[var0] = null;
            field936[var0] = 1;
        }
    }
}
