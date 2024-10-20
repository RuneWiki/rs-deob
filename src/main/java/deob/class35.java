package deob;

@ObfuscatedName("ag")
public class class35 {

    @ObfuscatedName("ag.f")
    public static byte[] field770 = new byte[2048];

    @ObfuscatedName("ag.c")
    public static byte[] field771 = new byte[2048];

    @ObfuscatedName("ag.v")
    public static class123[] field772 = new class123[2048];

    @ObfuscatedName("ag.j")
    public static int field778 = 0;

    @ObfuscatedName("ag.m")
    public static int[] field774 = new int[2048];

    @ObfuscatedName("ag.y")
    public static int field781 = 0;

    @ObfuscatedName("ag.u")
    public static int[] field776 = new int[2048];

    @ObfuscatedName("ag.h")
    public static int[] field777 = new int[2048];

    @ObfuscatedName("ag.l")
    public static int[] field773 = new int[2048];

    @ObfuscatedName("ag.b")
    public static int[] field779 = new int[2048];

    @ObfuscatedName("ag.g")
    public static int field780 = 0;

    @ObfuscatedName("ag.e")
    public static int[] field768 = new int[2048];

    @ObfuscatedName("ag.p")
    public static class123 field782 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.k(Ldt;I)V")
    public static final void method1128(class126 arg0) {
        arg0.method2662();
        int var1 = client.field404;
        class3 var2 = Statics.field2692 = client.field403[var1] = new class3();
        var2.field52 = var1;
        int var3 = arg0.method2663(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field881[0] = var5 - Statics.field1070;
        var2.field880 = (var2.field881[0] << 7) + (var2.method19() << 6);
        var2.field882[0] = var6 - Statics.field573;
        var2.field827 = (var2.field882[0] << 7) + (var2.method19() << 6);
        Statics.field2225 = var2.field56 = var4;
        if (field772[var1] != null) {
            var2.method12(field772[var1]);
        }
        field778 = 0;
        field774[++field778 - 1] = var1;
        field770[var1] = 0;
        field781 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2663(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field777[var7] = (var9 << 28) + (var10 << 14) + var11;
                field773[var7] = 0;
                field779[var7] = -1;
                field776[++field781 - 1] = var7;
                field770[var7] = 0;
            }
        }
        arg0.method2683();
    }

    @ObfuscatedName("av.q(Ldt;IS)V")
    public static final void method651(class126 arg0, int arg1) {
        int var2 = arg0.field2060;
        field780 = 0;
        method749(arg0);
        Statics.method141(arg0);
        if (arg0.field2060 - var2 != arg1) {
            throw new RuntimeException(arg0.field2060 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ap.f(Ldt;I)V")
    public static final void method749(class126 arg0) {
        int var1 = 0;
        arg0.method2662();
        for (int var2 = 0; var2 < field778; var2++) {
            int var3 = field774[var2];
            if ((field770[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field770[var3] = (byte) (field770[var3] | 0x2);
                } else {
                    int var4 = arg0.method2663(1);
                    if (var4 == 0) {
                        var1 = Statics.method733(arg0);
                        field770[var3] = (byte) (field770[var3] | 0x2);
                    } else {
                        method921(arg0, var3);
                    }
                }
            }
        }
        arg0.method2683();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2662();
        for (int var5 = 0; var5 < field778; var5++) {
            int var6 = field774[var5];
            if ((field770[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field770[var6] = (byte) (field770[var6] | 0x2);
                } else {
                    int var7 = arg0.method2663(1);
                    if (var7 == 0) {
                        var1 = Statics.method733(arg0);
                        field770[var6] = (byte) (field770[var6] | 0x2);
                    } else {
                        method921(arg0, var6);
                    }
                }
            }
        }
        arg0.method2683();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2662();
        for (int var8 = 0; var8 < field781; var8++) {
            int var9 = field776[var8];
            if ((field770[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field770[var9] = (byte) (field770[var9] | 0x2);
                } else {
                    int var10 = arg0.method2663(1);
                    if (var10 == 0) {
                        var1 = Statics.method733(arg0);
                        field770[var9] = (byte) (field770[var9] | 0x2);
                    } else if (method1556(arg0, var9)) {
                        field770[var9] = (byte) (field770[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2683();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2662();
        for (int var11 = 0; var11 < field781; var11++) {
            int var12 = field776[var11];
            if ((field770[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field770[var12] = (byte) (field770[var12] | 0x2);
                } else {
                    int var13 = arg0.method2663(1);
                    if (var13 == 0) {
                        var1 = Statics.method733(arg0);
                        field770[var12] = (byte) (field770[var12] | 0x2);
                    } else if (method1556(arg0, var12)) {
                        field770[var12] = (byte) (field770[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2683();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field778 = 0;
        field781 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field770[var14] = (byte) (field770[var14] >> 1);
            class3 var15 = client.field403[var14];
            if (var15 == null) {
                field776[++field781 - 1] = var14;
            } else {
                field774[++field778 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ac.v(Ldt;II)V")
    public static void method921(class126 arg0, int arg1) {
        boolean var2 = arg0.method2663(1) == 1;
        if (var2) {
            field768[++field780 - 1] = arg1;
        }
        int var3 = arg0.method2663(2);
        class3 var4 = client.field403[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field53 = false;
            } else if (client.field404 == arg1) {
                throw new RuntimeException();
            } else {
                field777[arg1] = (Statics.field573 + var4.field882[0] >> 6) + (Statics.field1070 + var4.field881[0] >> 6 << 14) + (var4.field56 << 28);
                if (var4.field846 == -1) {
                    field773[arg1] = var4.field877;
                } else {
                    field773[arg1] = var4.field846;
                }
                field779[arg1] = var4.field876;
                client.field403[arg1] = null;
                if (arg0.method2663(1) != 0) {
                    method1556(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2663(3);
            int var6 = var4.field881[0];
            int var7 = var4.field882[0];
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
            if (client.field404 == arg1 && var4.field880 < 1536 || var4.field827 < 1536 || var4.field880 >= 11776 || var4.field827 >= 11776) {
                var4.method11(var6, var7);
                var4.field53 = false;
            } else if (var2) {
                var4.field53 = true;
                var4.field54 = var6;
                var4.field36 = var7;
            } else {
                var4.field53 = false;
                var4.method15(var6, var7, field771[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2663(4);
            int var9 = var4.field881[0];
            int var10 = var4.field882[0];
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
            if (client.field404 == arg1 && var4.field880 < 1536 || var4.field827 < 1536 || var4.field880 >= 11776 || var4.field827 >= 11776) {
                var4.method11(var9, var10);
                var4.field53 = false;
            } else if (var2) {
                var4.field53 = true;
                var4.field54 = var9;
                var4.field36 = var10;
            } else {
                var4.field53 = false;
                var4.method15(var9, var10, field771[arg1]);
            }
        } else {
            int var11 = arg0.method2663(1);
            if (var11 == 0) {
                int var12 = arg0.method2663(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field881[0] + var14;
                int var17 = var4.field882[0] + var15;
                if (client.field404 == arg1 && var4.field880 < 1536 || var4.field827 < 1536 || var4.field880 >= 11776 || var4.field827 >= 11776) {
                    var4.method11(var16, var17);
                    var4.field53 = false;
                } else if (var2) {
                    var4.field53 = true;
                    var4.field54 = var16;
                    var4.field36 = var17;
                } else {
                    var4.field53 = false;
                    var4.method15(var16, var17, field771[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var13 & 0x3);
                if (client.field404 == arg1) {
                    Statics.field2225 = var4.field56;
                }
            } else {
                int var18 = arg0.method2663(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1070 + var4.field881[0] + var20 & 0x3FFF) - Statics.field1070;
                int var23 = (Statics.field573 + var4.field882[0] + var21 & 0x3FFF) - Statics.field573;
                if (client.field404 == arg1 && var4.field880 < 1536 || var4.field827 < 1536 || var4.field880 >= 11776 || var4.field827 >= 11776) {
                    var4.method11(var22, var23);
                    var4.field53 = false;
                } else if (var2) {
                    var4.field53 = true;
                    var4.field54 = var22;
                    var4.field36 = var23;
                } else {
                    var4.field53 = false;
                    var4.method15(var22, var23, field771[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var19 & 0x3);
                if (client.field404 == arg1) {
                    Statics.field2225 = var4.field56;
                }
            }
        }
    }

    @ObfuscatedName("bj.j(Ldt;II)Z")
    public static boolean method1556(class126 arg0, int arg1) {
        int var2 = arg0.method2663(2);
        if (var2 == 0) {
            if (arg0.method2663(1) != 0) {
                method1556(arg0, arg1);
            }
            int var3 = arg0.method2663(6);
            int var4 = arg0.method2663(6);
            boolean var5 = arg0.method2663(1) == 1;
            if (var5) {
                field768[++field780 - 1] = arg1;
            }
            if (client.field403[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field403[arg1] = new class3();
            var6.field52 = arg1;
            if (field772[arg1] != null) {
                var6.method12(field772[arg1]);
            }
            var6.field877 = field773[arg1];
            var6.field876 = field779[arg1];
            int var7 = field777[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field883[0] = field771[arg1];
            var6.field56 = (byte) var8;
            var6.method11((var9 << 6) + var3 - Statics.field1070, (var10 << 6) + var4 - Statics.field573);
            var6.field53 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2663(2);
            int var12 = field777[arg1];
            field777[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2663(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field777[arg1];
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
            field777[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2663(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field777[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field777[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("fv.y(Ldt;ILf;IB)V")
    public static final void method2989(class126 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method2427();
            byte[] var6 = new byte[var5];
            class123 var7 = new class123(var6);
            arg0.method2438(var6, 0, var5);
            field772[arg1] = var7;
            arg2.method12(var7);
        }
        if ((arg3 & 0x2) != 0) {
            int var8 = arg0.method2547();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2427();
            client.method2812(arg2, var8, var9);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field876 = arg0.method2547();
            if (arg2.field876 == 65535) {
                arg2.field876 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field839 = arg0.method2435();
            if (arg2.field839.charAt(0) == '~') {
                arg2.field839 = arg2.field839.substring(1);
                class12.method3256(2, arg2.field45, arg2.field839);
            } else if (Statics.field2692 == arg2) {
                class12.method3256(2, arg2.field45, arg2.field839);
            }
            arg2.field869 = false;
            arg2.field843 = 0;
            arg2.field844 = 0;
            arg2.field885 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            int var10 = arg0.method2427();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2410();
                    if (var15 == 32767) {
                        var15 = arg0.method2410();
                        var13 = arg0.method2410();
                        var12 = arg0.method2410();
                        var14 = arg0.method2410();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2410();
                    }
                    int var16 = arg0.method2410();
                    arg2.method745(var15, var13, var12, var14, client.field289, var16);
                }
            }
            int var17 = arg0.method2427();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2410();
                    int var20 = arg0.method2410();
                    if (var20 == 32767) {
                        arg2.method748(var19);
                    } else {
                        int var21 = arg0.method2410();
                        int var22 = arg0.method2427();
                        int var23 = var20 > 0 ? arg0.method2427() : var22;
                        arg2.method753(var19, client.field289, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field846 = arg0.method2547();
            if (arg2.field852 == 0) {
                arg2.field877 = arg2.field846;
                arg2.field846 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var24 = arg0.method2547();
            class156 var25 = (class156) class113.method1561(class156.method648(), arg0.method2427());
            boolean var26 = arg0.method2427() == 1;
            int var27 = arg0.method2427();
            int var28 = arg0.field2060;
            if (arg2.field45 != null && arg2.field30 != null) {
                boolean var29 = false;
                if (var25.field2306 && Statics.method3505(arg2.field45)) {
                    var29 = true;
                }
                if (!var29 && client.field402 == 0 && !arg2.field50) {
                    field782.field2060 = 0;
                    arg0.method2438(field782.field2054, 0, var27);
                    field782.field2060 = 0;
                    String var30 = class227.method3812(class167.method758(class226.method2829(field782)));
                    arg2.field839 = var30.trim();
                    arg2.field843 = var24 >> 8;
                    arg2.field844 = var24 & 0xFF;
                    arg2.field885 = 150;
                    arg2.field869 = var26;
                    arg2.field841 = Statics.field2692 != arg2 && var25.field2306 && client.field501 != "" && var30.toLowerCase().indexOf(client.field501) == -1;
                    int var31;
                    if (var25.field2310) {
                        var31 = var26 ? 91 : 1;
                    } else {
                        var31 = var26 ? 90 : 2;
                    }
                    if (var25.field2303 == -1) {
                        class12.method3256(var31, arg2.field45, var30);
                    } else {
                        class12.method3256(var31, Statics.method2972(var25.field2303) + arg2.field45, var30);
                    }
                }
            }
            arg0.field2060 = var27 + var28;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field863 = arg0.method2547();
            int var32 = arg0.method2432();
            arg2.field867 = var32 >> 16;
            arg2.field866 = (var32 & 0xFFFF) + client.field289;
            arg2.field828 = 0;
            arg2.field865 = 0;
            if (arg2.field866 > client.field289) {
                arg2.field828 = -1;
            }
            if (arg2.field863 == 65535) {
                arg2.field863 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field868 = arg0.method2428();
            arg2.field870 = arg0.method2428();
            arg2.field830 = arg0.method2428();
            arg2.field871 = arg0.method2428();
            arg2.field872 = arg0.method2547() + client.field289;
            arg2.field856 = arg0.method2547() + client.field289;
            arg2.field874 = arg0.method2547();
            if (arg2.field53) {
                arg2.field868 += arg2.field54;
                arg2.field870 += arg2.field36;
                arg2.field830 += arg2.field54;
                arg2.field871 += arg2.field36;
                arg2.field852 = 0;
            } else {
                arg2.field868 += arg2.field881[0];
                arg2.field870 += arg2.field882[0];
                arg2.field830 += arg2.field881[0];
                arg2.field871 += arg2.field882[0];
                arg2.field852 = 1;
            }
            arg2.field864 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            field771[arg1] = arg0.method2428();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2428();
        }
        if ((arg3 & 0x800) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field34[var33] = arg0.method2435();
            }
        }
        if (!arg2.field53) {
            return;
        }
        if (var4 == 127) {
            arg2.method11(arg2.field54, arg2.field36);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field771[arg1];
        } else {
            var34 = var4;
        }
        arg2.method15(arg2.field54, arg2.field36, var34);
    }
}
