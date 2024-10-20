package deob;

@ObfuscatedName("al")
public class class35 {

    @ObfuscatedName("al.e")
    public static byte[] field786 = new byte[2048];

    @ObfuscatedName("al.g")
    public static byte[] field778 = new byte[2048];

    @ObfuscatedName("al.n")
    public static class123[] field785 = new class123[2048];

    @ObfuscatedName("al.u")
    public static int field780 = 0;

    @ObfuscatedName("al.d")
    public static int[] field787 = new int[2048];

    @ObfuscatedName("al.l")
    public static int field777 = 0;

    @ObfuscatedName("al.m")
    public static int[] field783 = new int[2048];

    @ObfuscatedName("al.j")
    public static int[] field784 = new int[2048];

    @ObfuscatedName("al.y")
    public static int[] field781 = new int[2048];

    @ObfuscatedName("al.s")
    public static int[] field789 = new int[2048];

    @ObfuscatedName("al.p")
    public static int field776 = 0;

    @ObfuscatedName("al.v")
    public static int[] field788 = new int[2048];

    @ObfuscatedName("al.r")
    public static class123 field775 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.i(Ldh;I)V")
    public static final void method53(class126 arg0) {
        arg0.method2646();
        int var1 = client.field425;
        class3 var2 = Statics.field2137 = client.field420[var1] = new class3();
        var2.field55 = var1;
        int var3 = arg0.method2647(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field857[0] = var5 - Statics.field3127;
        var2.field879 = (var2.field857[0] << 7) + (var2.method17() << 6);
        var2.field858[0] = var6 - Statics.field1671;
        var2.field837 = (var2.field858[0] << 7) + (var2.method17() << 6);
        Statics.field2760 = var2.field54 = var4;
        if (field785[var1] != null) {
            var2.method16(field785[var1]);
        }
        field780 = 0;
        field787[++field780 - 1] = var1;
        field786[var1] = 0;
        field777 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2647(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field784[var7] = (var9 << 28) + (var10 << 14) + var11;
                field781[var7] = 0;
                field789[var7] = -1;
                field783[++field777 - 1] = var7;
                field786[var7] = 0;
            }
        }
        arg0.method2650();
    }

    @ObfuscatedName("t.h(Ldh;IB)V")
    public static final void method567(class126 arg0, int arg1) {
        int var2 = arg0.field2046;
        field776 = 0;
        int var3 = 0;
        arg0.method2646();
        for (int var4 = 0; var4 < field780; var4++) {
            int var5 = field787[var4];
            if ((field786[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field786[var5] = (byte) (field786[var5] | 0x2);
                } else {
                    int var6 = arg0.method2647(1);
                    if (var6 == 0) {
                        var3 = method572(arg0);
                        field786[var5] = (byte) (field786[var5] | 0x2);
                    } else {
                        method724(arg0, var5);
                    }
                }
            }
        }
        arg0.method2650();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2646();
        for (int var7 = 0; var7 < field780; var7++) {
            int var8 = field787[var7];
            if ((field786[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field786[var8] = (byte) (field786[var8] | 0x2);
                } else {
                    int var9 = arg0.method2647(1);
                    if (var9 == 0) {
                        var3 = method572(arg0);
                        field786[var8] = (byte) (field786[var8] | 0x2);
                    } else {
                        method724(arg0, var8);
                    }
                }
            }
        }
        arg0.method2650();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2646();
        for (int var10 = 0; var10 < field777; var10++) {
            int var11 = field783[var10];
            if ((field786[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field786[var11] = (byte) (field786[var11] | 0x2);
                } else {
                    int var12 = arg0.method2647(1);
                    if (var12 == 0) {
                        var3 = method572(arg0);
                        field786[var11] = (byte) (field786[var11] | 0x2);
                    } else if (method224(arg0, var11)) {
                        field786[var11] = (byte) (field786[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2650();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2646();
        for (int var13 = 0; var13 < field777; var13++) {
            int var14 = field783[var13];
            if ((field786[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field786[var14] = (byte) (field786[var14] | 0x2);
                } else {
                    int var15 = arg0.method2647(1);
                    if (var15 == 0) {
                        var3 = method572(arg0);
                        field786[var14] = (byte) (field786[var14] | 0x2);
                    } else if (method224(arg0, var14)) {
                        field786[var14] = (byte) (field786[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2650();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field780 = 0;
        field777 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field786[var16] = (byte) (field786[var16] >> 1);
            class3 var17 = client.field420[var16];
            if (var17 == null) {
                field783[++field777 - 1] = var16;
            } else {
                field787[++field780 - 1] = var16;
            }
        }
        method644(arg0);
        if (arg0.field2046 - var2 != arg1) {
            throw new RuntimeException(arg0.field2046 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("am.e(Ldh;I)I")
    public static int method572(class126 arg0) {
        int var1 = arg0.method2647(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2647(5);
        } else if (var1 == 2) {
            var2 = arg0.method2647(8);
        } else {
            var2 = arg0.method2647(11);
        }
        return var2;
    }

    @ObfuscatedName("ar.g(Ldh;II)V")
    public static void method724(class126 arg0, int arg1) {
        boolean var2 = arg0.method2647(1) == 1;
        if (var2) {
            field788[++field776 - 1] = arg1;
        }
        int var3 = arg0.method2647(2);
        class3 var4 = client.field420[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field56 = false;
            } else if (client.field425 == arg1) {
                throw new RuntimeException();
            } else {
                field784[arg1] = (Statics.field1671 + var4.field858[0] >> 6) + (Statics.field3127 + var4.field857[0] >> 6 << 14) + (var4.field54 << 28);
                if (var4.field864 == -1) {
                    field781[arg1] = var4.field887;
                } else {
                    field781[arg1] = var4.field864;
                }
                field789[arg1] = var4.field869;
                client.field420[arg1] = null;
                if (arg0.method2647(1) != 0) {
                    method224(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2647(3);
            int var6 = var4.field857[0];
            int var7 = var4.field858[0];
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
            if (client.field425 == arg1 && var4.field879 < 1536 || var4.field837 < 1536 || var4.field879 >= 11776 || var4.field837 >= 11776) {
                var4.method20(var6, var7);
                var4.field56 = false;
            } else if (var2) {
                var4.field56 = true;
                var4.field57 = var6;
                var4.field34 = var7;
            } else {
                var4.field56 = false;
                var4.method19(var6, var7, field778[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2647(4);
            int var9 = var4.field857[0];
            int var10 = var4.field858[0];
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
            if (client.field425 == arg1 && var4.field879 < 1536 || var4.field837 < 1536 || var4.field879 >= 11776 || var4.field837 >= 11776) {
                var4.method20(var9, var10);
                var4.field56 = false;
            } else if (var2) {
                var4.field56 = true;
                var4.field57 = var9;
                var4.field34 = var10;
            } else {
                var4.field56 = false;
                var4.method19(var9, var10, field778[arg1]);
            }
        } else {
            int var11 = arg0.method2647(1);
            if (var11 == 0) {
                int var12 = arg0.method2647(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field857[0] + var14;
                int var17 = var4.field858[0] + var15;
                if (client.field425 == arg1 && var4.field879 < 1536 || var4.field837 < 1536 || var4.field879 >= 11776 || var4.field837 >= 11776) {
                    var4.method20(var16, var17);
                    var4.field56 = false;
                } else if (var2) {
                    var4.field56 = true;
                    var4.field57 = var16;
                    var4.field34 = var17;
                } else {
                    var4.field56 = false;
                    var4.method19(var16, var17, field778[arg1]);
                }
                var4.field54 = (byte) (var4.field54 + var13 & 0x3);
                if (client.field425 == arg1) {
                    Statics.field2760 = var4.field54;
                }
            } else {
                int var18 = arg0.method2647(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3127 + var4.field857[0] + var20 & 0x3FFF) - Statics.field3127;
                int var23 = (Statics.field1671 + var4.field858[0] + var21 & 0x3FFF) - Statics.field1671;
                if (client.field425 == arg1 && var4.field879 < 1536 || var4.field837 < 1536 || var4.field879 >= 11776 || var4.field837 >= 11776) {
                    var4.method20(var22, var23);
                    var4.field56 = false;
                } else if (var2) {
                    var4.field56 = true;
                    var4.field57 = var22;
                    var4.field34 = var23;
                } else {
                    var4.field56 = false;
                    var4.method19(var22, var23, field778[arg1]);
                }
                var4.field54 = (byte) (var4.field54 + var19 & 0x3);
                if (client.field425 == arg1) {
                    Statics.field2760 = var4.field54;
                }
            }
        }
    }

    @ObfuscatedName("z.n(Ldh;II)Z")
    public static boolean method224(class126 arg0, int arg1) {
        int var2 = arg0.method2647(2);
        if (var2 == 0) {
            if (arg0.method2647(1) != 0) {
                method224(arg0, arg1);
            }
            int var3 = arg0.method2647(6);
            int var4 = arg0.method2647(6);
            boolean var5 = arg0.method2647(1) == 1;
            if (var5) {
                field788[++field776 - 1] = arg1;
            }
            if (client.field420[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field420[arg1] = new class3();
            var6.field55 = arg1;
            if (field785[arg1] != null) {
                var6.method16(field785[arg1]);
            }
            var6.field887 = field781[arg1];
            var6.field869 = field789[arg1];
            int var7 = field784[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field851[0] = field778[arg1];
            var6.field54 = (byte) var8;
            var6.method20((var9 << 6) + var3 - Statics.field3127, (var10 << 6) + var4 - Statics.field1671);
            var6.field56 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2647(2);
            int var12 = field784[arg1];
            field784[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2647(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field784[arg1];
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
            field784[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2647(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field784[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field784[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ak.u(Ldh;I)V")
    public static final void method644(class126 arg0) {
        for (int var1 = 0; var1 < field776; var1++) {
            int var2 = field788[var1];
            class3 var3 = client.field420[var2];
            int var4 = arg0.method2404();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method2404() << 8;
            }
            method523(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("q.d(Ldh;ILe;IB)V")
    public static final void method523(class126 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method2404();
            byte[] var6 = new byte[var5];
            class123 var7 = new class123(var6);
            arg0.method2415(var6, 0, var5);
            field785[arg1] = var7;
            arg2.method16(var7);
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2406();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2404();
            client.method570(arg2, var8, var9);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field869 = arg0.method2406();
            if (arg2.field869 == 65535) {
                arg2.field869 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field862 = arg0.method2412();
            if (arg2.field862.charAt(0) == '~') {
                arg2.field862 = arg2.field862.substring(1);
                class12.method2280(2, arg2.field37, arg2.field862);
            } else if (Statics.field2137 == arg2) {
                class12.method2280(2, arg2.field37, arg2.field862);
            }
            arg2.field850 = false;
            arg2.field853 = 0;
            arg2.field892 = 0;
            arg2.field848 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var10 = arg0.method2404();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2433();
                    if (var15 == 32767) {
                        var15 = arg0.method2433();
                        var13 = arg0.method2433();
                        var12 = arg0.method2433();
                        var14 = arg0.method2433();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2433();
                    }
                    int var16 = arg0.method2433();
                    arg2.method753(var15, var13, var12, var14, client.field333, var16);
                }
            }
            int var17 = arg0.method2404();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2433();
                    int var20 = arg0.method2433();
                    if (var20 == 32767) {
                        arg2.method755(var19);
                    } else {
                        int var21 = arg0.method2433();
                        int var22 = arg0.method2404();
                        int var23 = var20 > 0 ? arg0.method2404() : var22;
                        arg2.method754(var19, client.field333, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field864 = arg0.method2406();
            if (arg2.field890 == 0) {
                arg2.field887 = arg2.field864;
                arg2.field864 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var24 = arg0.method2406();
            class156[] var25 = new class156[] { class156.field2315, class156.field2312, class156.field2313, class156.field2311, class156.field2310, class156.field2320 };
            class156 var26 = (class156) class113.method2810(var25, arg0.method2404());
            boolean var27 = arg0.method2404() == 1;
            int var28 = arg0.method2404();
            int var29 = arg0.field2046;
            if (arg2.field37 != null && arg2.field33 != null) {
                boolean var30 = false;
                if (var26.field2321 && client.method2692(arg2.field37)) {
                    var30 = true;
                }
                if (!var30 && client.field443 == 0 && !arg2.field46) {
                    field775.field2046 = 0;
                    arg0.method2415(field775.field2049, 0, var28);
                    field775.field2046 = 0;
                    class123 var31 = field775;
                    String var35;
                    try {
                        int var32 = var31.method2433();
                        if (var32 > 32767) {
                            var32 = 32767;
                        }
                        byte[] var33 = new byte[var32];
                        var31.field2046 += Statics.field3237.method2339(var31.field2049, var31.field2046, var33, 0, var32);
                        String var34 = class169.method2828(var33, 0, var32);
                        var35 = var34;
                    } catch (Exception var46) {
                        var35 = "Cabbage";
                    }
                    String var38 = class227.method3818(class167.method2702(var35));
                    arg2.field862 = var38.trim();
                    arg2.field853 = var24 >> 8;
                    arg2.field892 = var24 & 0xFF;
                    arg2.field848 = 150;
                    arg2.field850 = var27;
                    arg2.field884 = Statics.field2137 != arg2 && var26.field2321 && client.field506 != "" && var38.toLowerCase().indexOf(client.field506) == -1;
                    int var39;
                    if (var26.field2316) {
                        var39 = var27 ? 91 : 1;
                    } else {
                        var39 = var27 ? 90 : 2;
                    }
                    if (var26.field2318 == -1) {
                        class12.method2280(var39, arg2.field37, var38);
                    } else {
                        int var41 = var26.field2318;
                        String var42 = "<img=" + var41 + ">";
                        class12.method2280(var39, var42 + arg2.field37, var38);
                    }
                }
            }
            arg0.field2046 = var28 + var29;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field873 = arg0.method2406();
            int var43 = arg0.method2409();
            arg2.field877 = var43 >> 16;
            arg2.field836 = (var43 & 0xFFFF) + client.field333;
            arg2.field874 = 0;
            arg2.field875 = 0;
            if (arg2.field836 > client.field333) {
                arg2.field874 = -1;
            }
            if (arg2.field873 == 65535) {
                arg2.field873 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field842 = arg0.method2405();
            arg2.field880 = arg0.method2405();
            arg2.field859 = arg0.method2405();
            arg2.field856 = arg0.method2405();
            arg2.field882 = arg0.method2406() + client.field333;
            arg2.field883 = arg0.method2406() + client.field333;
            arg2.field893 = arg0.method2406();
            if (arg2.field56) {
                arg2.field842 += arg2.field57;
                arg2.field880 += arg2.field34;
                arg2.field859 += arg2.field57;
                arg2.field856 += arg2.field34;
                arg2.field890 = 0;
            } else {
                arg2.field842 += arg2.field857[0];
                arg2.field880 += arg2.field858[0];
                arg2.field859 += arg2.field857[0];
                arg2.field856 += arg2.field858[0];
                arg2.field890 = 1;
            }
            arg2.field895 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field778[arg1] = arg0.method2405();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2405();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var44 = 0; var44 < 3; var44++) {
                arg2.field44[var44] = arg0.method2412();
            }
        }
        if (!arg2.field56) {
            return;
        }
        if (var4 == 127) {
            arg2.method20(arg2.field57, arg2.field34);
            return;
        }
        byte var45;
        if (var4 == -1) {
            var45 = field778[arg1];
        } else {
            var45 = var4;
        }
        arg2.method19(arg2.field57, arg2.field34, var45);
    }
}
