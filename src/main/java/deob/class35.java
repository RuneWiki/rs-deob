package deob;

@ObfuscatedName("ao")
public class class35 {

    @ObfuscatedName("ao.v")
    public static byte[] field777 = new byte[2048];

    @ObfuscatedName("ao.r")
    public static byte[] field778 = new byte[2048];

    @ObfuscatedName("ao.z")
    public static class123[] field779 = new class123[2048];

    @ObfuscatedName("ao.t")
    public static int field780 = 0;

    @ObfuscatedName("ao.n")
    public static int[] field781 = new int[2048];

    @ObfuscatedName("ao.i")
    public static int field782 = 0;

    @ObfuscatedName("ao.g")
    public static int[] field783 = new int[2048];

    @ObfuscatedName("ao.m")
    public static int[] field795 = new int[2048];

    @ObfuscatedName("ao.k")
    public static int[] field789 = new int[2048];

    @ObfuscatedName("ao.x")
    public static int[] field786 = new int[2048];

    @ObfuscatedName("ao.u")
    public static int field787 = 0;

    @ObfuscatedName("ao.j")
    public static int[] field788 = new int[2048];

    @ObfuscatedName("ao.q")
    public static class123 field793 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.a(Ldz;S)V")
    public static final void method2866(class126 arg0) {
        arg0.method2651();
        int var1 = client.field283;
        class3 var2 = Statics.field68 = client.field404[var1] = new class3();
        var2.field55 = var1;
        int var3 = arg0.method2659(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field895[0] = var5 - Statics.field151;
        var2.field847 = (var2.field895[0] << 7) + (var2.method16() << 6);
        var2.field896[0] = var6 - Statics.field1055;
        var2.field849 = (var2.field896[0] << 7) + (var2.method16() << 6);
        Statics.field707 = var2.field41 = var4;
        if (field779[var1] != null) {
            var2.method15(field779[var1]);
        }
        field780 = 0;
        field781[++field780 - 1] = var1;
        field777[var1] = 0;
        field782 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2659(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field795[var7] = (var9 << 28) + (var10 << 14) + var11;
                field789[var7] = 0;
                field786[var7] = -1;
                field783[++field782 - 1] = var7;
                field777[var7] = 0;
            }
        }
        arg0.method2672();
    }

    @ObfuscatedName("b.d(Ldz;IS)V")
    public static final void method178(class126 arg0, int arg1) {
        int var2 = arg0.field2071;
        field787 = 0;
        method101(arg0);
        method1076(arg0);
        if (arg0.field2071 - var2 != arg1) {
            throw new RuntimeException(arg0.field2071 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("n.v(Ldz;I)V")
    public static final void method101(class126 arg0) {
        int var1 = 0;
        arg0.method2651();
        for (int var2 = 0; var2 < field780; var2++) {
            int var3 = field781[var2];
            if ((field777[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field777[var3] = (byte) (field777[var3] | 0x2);
                } else {
                    int var4 = arg0.method2659(1);
                    if (var4 == 0) {
                        var1 = method1163(arg0);
                        field777[var3] = (byte) (field777[var3] | 0x2);
                    } else {
                        method100(arg0, var3);
                    }
                }
            }
        }
        arg0.method2672();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2651();
        for (int var5 = 0; var5 < field780; var5++) {
            int var6 = field781[var5];
            if ((field777[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field777[var6] = (byte) (field777[var6] | 0x2);
                } else {
                    int var7 = arg0.method2659(1);
                    if (var7 == 0) {
                        var1 = method1163(arg0);
                        field777[var6] = (byte) (field777[var6] | 0x2);
                    } else {
                        method100(arg0, var6);
                    }
                }
            }
        }
        arg0.method2672();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2651();
        for (int var8 = 0; var8 < field782; var8++) {
            int var9 = field783[var8];
            if ((field777[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field777[var9] = (byte) (field777[var9] | 0x2);
                } else {
                    int var10 = arg0.method2659(1);
                    if (var10 == 0) {
                        var1 = method1163(arg0);
                        field777[var9] = (byte) (field777[var9] | 0x2);
                    } else if (method1535(arg0, var9)) {
                        field777[var9] = (byte) (field777[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2672();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2651();
        for (int var11 = 0; var11 < field782; var11++) {
            int var12 = field783[var11];
            if ((field777[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field777[var12] = (byte) (field777[var12] | 0x2);
                } else {
                    int var13 = arg0.method2659(1);
                    if (var13 == 0) {
                        var1 = method1163(arg0);
                        field777[var12] = (byte) (field777[var12] | 0x2);
                    } else if (method1535(arg0, var12)) {
                        field777[var12] = (byte) (field777[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2672();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field780 = 0;
        field782 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field777[var14] = (byte) (field777[var14] >> 1);
            class3 var15 = client.field404[var14];
            if (var15 == null) {
                field783[++field782 - 1] = var14;
            } else {
                field781[++field780 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bs.r(Ldz;I)I")
    public static int method1163(class126 arg0) {
        int var1 = arg0.method2659(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2659(5);
        } else if (var1 == 2) {
            var2 = arg0.method2659(8);
        } else {
            var2 = arg0.method2659(11);
        }
        return var2;
    }

    @ObfuscatedName("n.z(Ldz;II)V")
    public static void method100(class126 arg0, int arg1) {
        boolean var2 = arg0.method2659(1) == 1;
        if (var2) {
            field788[++field787 - 1] = arg1;
        }
        int var3 = arg0.method2659(2);
        class3 var4 = client.field404[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field56 = false;
            } else if (client.field283 == arg1) {
                throw new RuntimeException();
            } else {
                field795[arg1] = (Statics.field1055 + var4.field896[0] >> 6) + (Statics.field151 + var4.field895[0] >> 6 << 14) + (var4.field41 << 28);
                if (var4.field886 == -1) {
                    field789[arg1] = var4.field892;
                } else {
                    field789[arg1] = var4.field886;
                }
                field786[arg1] = var4.field866;
                client.field404[arg1] = null;
                if (arg0.method2659(1) != 0) {
                    method1535(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2659(3);
            int var6 = var4.field895[0];
            int var7 = var4.field896[0];
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
            if (client.field283 == arg1 && var4.field847 < 1536 || var4.field849 < 1536 || var4.field847 >= 11776 || var4.field849 >= 11776) {
                var4.method21(var6, var7);
                var4.field56 = false;
            } else if (var2) {
                var4.field56 = true;
                var4.field46 = var6;
                var4.field58 = var7;
            } else {
                var4.field56 = false;
                var4.method30(var6, var7, field778[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2659(4);
            int var9 = var4.field895[0];
            int var10 = var4.field896[0];
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
            if (client.field283 == arg1 && var4.field847 < 1536 || var4.field849 < 1536 || var4.field847 >= 11776 || var4.field849 >= 11776) {
                var4.method21(var9, var10);
                var4.field56 = false;
            } else if (var2) {
                var4.field56 = true;
                var4.field46 = var9;
                var4.field58 = var10;
            } else {
                var4.field56 = false;
                var4.method30(var9, var10, field778[arg1]);
            }
        } else {
            int var11 = arg0.method2659(1);
            if (var11 == 0) {
                int var12 = arg0.method2659(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field895[0] + var14;
                int var17 = var4.field896[0] + var15;
                if (client.field283 == arg1 && var4.field847 < 1536 || var4.field849 < 1536 || var4.field847 >= 11776 || var4.field849 >= 11776) {
                    var4.method21(var16, var17);
                    var4.field56 = false;
                } else if (var2) {
                    var4.field56 = true;
                    var4.field46 = var16;
                    var4.field58 = var17;
                } else {
                    var4.field56 = false;
                    var4.method30(var16, var17, field778[arg1]);
                }
                var4.field41 = (byte) (var4.field41 + var13 & 0x3);
                if (client.field283 == arg1) {
                    Statics.field707 = var4.field41;
                }
            } else {
                int var18 = arg0.method2659(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field151 + var4.field895[0] + var20 & 0x3FFF) - Statics.field151;
                int var23 = (Statics.field1055 + var4.field896[0] + var21 & 0x3FFF) - Statics.field1055;
                if (client.field283 == arg1 && var4.field847 < 1536 || var4.field849 < 1536 || var4.field847 >= 11776 || var4.field849 >= 11776) {
                    var4.method21(var22, var23);
                    var4.field56 = false;
                } else if (var2) {
                    var4.field56 = true;
                    var4.field46 = var22;
                    var4.field58 = var23;
                } else {
                    var4.field56 = false;
                    var4.method30(var22, var23, field778[arg1]);
                }
                var4.field41 = (byte) (var4.field41 + var19 & 0x3);
                if (client.field283 == arg1) {
                    Statics.field707 = var4.field41;
                }
            }
        }
    }

    @ObfuscatedName("bi.t(Ldz;IB)Z")
    public static boolean method1535(class126 arg0, int arg1) {
        int var2 = arg0.method2659(2);
        if (var2 == 0) {
            if (arg0.method2659(1) != 0) {
                method1535(arg0, arg1);
            }
            int var3 = arg0.method2659(6);
            int var4 = arg0.method2659(6);
            boolean var5 = arg0.method2659(1) == 1;
            if (var5) {
                field788[++field787 - 1] = arg1;
            }
            if (client.field404[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field404[arg1] = new class3();
            var6.field55 = arg1;
            if (field779[arg1] != null) {
                var6.method15(field779[arg1]);
            }
            var6.field892 = field789[arg1];
            var6.field866 = field786[arg1];
            int var7 = field795[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field897[0] = field778[arg1];
            var6.field41 = (byte) var8;
            var6.method21((var9 << 6) + var3 - Statics.field151, (var10 << 6) + var4 - Statics.field1055);
            var6.field56 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2659(2);
            int var12 = field795[arg1];
            field795[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2659(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field795[arg1];
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
            field795[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2659(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field795[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field795[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bg.n(Ldz;B)V")
    public static final void method1076(class126 arg0) {
        for (int var1 = 0; var1 < field787; var1++) {
            int var2 = field788[var1];
            class3 var3 = client.field404[var2];
            int var4 = arg0.method2395();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method2395() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x20) != 0) {
                int var6 = arg0.method2395();
                byte[] var7 = new byte[var6];
                class123 var8 = new class123(var7);
                arg0.method2593(var7, 0, var6);
                field779[var2] = var8;
                var3.method15(var8);
            }
            if ((var4 & 0x1) != 0) {
                int var9 = arg0.method2584();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2395();
                client.method927(var3, var9, var10);
            }
            if ((var4 & 0x80) != 0) {
                var3.field866 = arg0.method2584();
                if (var3.field866 == 65535) {
                    var3.field866 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field853 = arg0.method2397();
                if (var3.field853.charAt(0) == '~') {
                    var3.field853 = var3.field853.substring(1);
                    class12.method130(2, var3.field53, var3.field853);
                } else if (Statics.field68 == var3) {
                    class12.method130(2, var3.field53, var3.field853);
                }
                var3.field854 = false;
                var3.field857 = 0;
                var3.field858 = 0;
                var3.field856 = 150;
            }
            if ((var4 & 0x4) != 0) {
                int var11 = arg0.method2395();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2577();
                        if (var16 == 32767) {
                            var16 = arg0.method2577();
                            var14 = arg0.method2577();
                            var13 = arg0.method2577();
                            var15 = arg0.method2577();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2577();
                        }
                        int var17 = arg0.method2577();
                        var3.method773(var16, var14, var13, var15, client.field565, var17);
                    }
                }
                int var18 = arg0.method2395();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2577();
                        int var21 = arg0.method2577();
                        if (var21 == 32767) {
                            var3.method768(var20);
                        } else {
                            int var22 = arg0.method2577();
                            int var23 = arg0.method2395();
                            int var24 = var21 > 0 ? arg0.method2395() : var23;
                            var3.method767(var20, client.field565, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field886 = arg0.method2584();
                if (var3.field894 == 0) {
                    var3.field892 = var3.field886;
                    var3.field886 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var25 = arg0.method2584();
                class156[] var26 = new class156[] { class156.field2330, class156.field2329, class156.field2331, class156.field2338, class156.field2332 };
                class156 var27 = (class156) class113.method1095(var26, arg0.method2395());
                boolean var28 = arg0.method2395() == 1;
                int var29 = arg0.method2395();
                int var30 = arg0.field2071;
                if (var3.field53 != null && var3.field33 != null) {
                    boolean var31 = false;
                    if (var27.field2337 && client.method1589(var3.field53)) {
                        var31 = true;
                    }
                    if (!var31 && client.field402 == 0 && !var3.field42) {
                        field793.field2071 = 0;
                        arg0.method2593(field793.field2076, 0, var29);
                        field793.field2071 = 0;
                        class123 var32 = field793;
                        String var36;
                        try {
                            int var33 = var32.method2577();
                            if (var33 > 32767) {
                                var33 = 32767;
                            }
                            byte[] var34 = new byte[var33];
                            var32.field2071 += Statics.field3230.method2322(var32.field2076, var32.field2071, var34, 0, var33);
                            String var35 = class169.method3091(var34, 0, var33);
                            var36 = var35;
                        } catch (Exception var47) {
                            var36 = "Cabbage";
                        }
                        String var39 = class227.method3832(class167.method585(var36));
                        var3.field853 = var39.trim();
                        var3.field857 = var25 >> 8;
                        var3.field858 = var25 & 0xFF;
                        var3.field856 = 150;
                        var3.field854 = var28;
                        var3.field873 = Statics.field68 != var3 && var27.field2337 && client.field501 != "" && var39.toLowerCase().indexOf(client.field501) == -1;
                        int var40;
                        if (var27.field2336) {
                            var40 = var28 ? 91 : 1;
                        } else {
                            var40 = var28 ? 90 : 2;
                        }
                        if (var27.field2335 == -1) {
                            class12.method130(var40, var3.field53, var39);
                        } else {
                            int var42 = var27.field2335;
                            String var43 = "<img=" + var42 + ">";
                            class12.method130(var40, var43 + var3.field53, var39);
                        }
                    }
                }
                arg0.field2071 = var29 + var30;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field874 = arg0.method2584();
                int var44 = arg0.method2400();
                var3.field881 = var44 >> 16;
                var3.field880 = (var44 & 0xFFFF) + client.field565;
                var3.field878 = 0;
                var3.field879 = 0;
                if (var3.field880 > client.field565) {
                    var3.field878 = -1;
                }
                if (var3.field874 == 65535) {
                    var3.field874 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.field883 = arg0.method2396();
                var3.field884 = arg0.method2396();
                var3.field855 = arg0.method2396();
                var3.field885 = arg0.method2396();
                var3.field860 = arg0.method2584() + client.field565;
                var3.field846 = arg0.method2584() + client.field565;
                var3.field840 = arg0.method2584();
                if (var3.field56) {
                    var3.field883 += var3.field46;
                    var3.field884 += var3.field58;
                    var3.field855 += var3.field46;
                    var3.field885 += var3.field58;
                    var3.field894 = 0;
                } else {
                    var3.field883 += var3.field895[0];
                    var3.field884 += var3.field896[0];
                    var3.field855 += var3.field895[0];
                    var3.field885 += var3.field896[0];
                    var3.field894 = 1;
                }
                var3.field899 = 0;
            }
            if ((var4 & 0x100) != 0) {
                field778[var2] = arg0.method2396();
            }
            if ((var4 & 0x200) != 0) {
                var5 = arg0.method2396();
            }
            if ((var4 & 0x400) != 0) {
                for (int var45 = 0; var45 < 3; var45++) {
                    var3.field37[var45] = arg0.method2397();
                }
            }
            if (var3.field56) {
                if (var5 == 127) {
                    var3.method21(var3.field46, var3.field58);
                } else {
                    byte var46;
                    if (var5 == -1) {
                        var46 = field778[var2];
                    } else {
                        var46 = var5;
                    }
                    var3.method30(var3.field46, var3.field58, var46);
                }
            }
        }
    }

    @ObfuscatedName("al.i(I)V")
    public static void method781() {
        field780 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field779[var0] = null;
            field778[var0] = 1;
        }
    }
}
