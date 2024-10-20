package deob;

@ObfuscatedName("ag")
public class class35 {

    @ObfuscatedName("ag.r")
    public static byte[] field783 = new byte[2048];

    @ObfuscatedName("ag.e")
    public static byte[] field782 = new byte[2048];

    @ObfuscatedName("ag.h")
    public static class123[] field792 = new class123[2048];

    @ObfuscatedName("ag.s")
    public static int field784 = 0;

    @ObfuscatedName("ag.k")
    public static int[] field785 = new int[2048];

    @ObfuscatedName("ag.u")
    public static int field790 = 0;

    @ObfuscatedName("ag.n")
    public static int[] field787 = new int[2048];

    @ObfuscatedName("ag.b")
    public static int[] field791 = new int[2048];

    @ObfuscatedName("ag.m")
    public static int[] field789 = new int[2048];

    @ObfuscatedName("ag.q")
    public static int[] field781 = new int[2048];

    @ObfuscatedName("ag.p")
    public static int field786 = 0;

    @ObfuscatedName("ag.w")
    public static int[] field780 = new int[2048];

    @ObfuscatedName("ag.o")
    public static class123 field793 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.l(Ldu;B)V")
    public static final void method674(class126 arg0) {
        arg0.method2756();
        int var1 = client.field418;
        class3 var2 = Statics.field66 = client.field303[var1] = new class3();
        var2.field54 = var1;
        int var3 = arg0.method2764(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field887[0] = var5 - Statics.field12;
        var2.field876 = (var2.field887[0] << 7) + (var2.method16() << 6);
        var2.field888[0] = var6 - Statics.field593;
        var2.field833 = (var2.field888[0] << 7) + (var2.method16() << 6);
        Statics.field1702 = var2.field53 = var4;
        if (field792[var1] != null) {
            var2.method30(field792[var1]);
        }
        field784 = 0;
        field785[++field784 - 1] = var1;
        field783[var1] = 0;
        field790 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2764(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field791[var7] = (var9 << 28) + (var10 << 14) + var11;
                field789[var7] = 0;
                field781[var7] = -1;
                field787[++field790 - 1] = var7;
                field783[var7] = 0;
            }
        }
        arg0.method2757();
    }

    @ObfuscatedName("fx.g(Ldu;II)V")
    public static final void method3353(class126 arg0, int arg1) {
        int var2 = arg0.field2051;
        field786 = 0;
        method657(arg0);
        for (int var3 = 0; var3 < field786; var3++) {
            int var4 = field780[var3];
            class3 var5 = client.field303[var4];
            int var6 = arg0.method2490();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2490() << 8;
            }
            method1694(arg0, var4, var5, var6);
        }
        if (arg0.field2051 - var2 != arg1) {
            throw new RuntimeException(arg0.field2051 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("as.r(Ldu;B)V")
    public static final void method657(class126 arg0) {
        int var1 = 0;
        arg0.method2756();
        for (int var2 = 0; var2 < field784; var2++) {
            int var3 = field785[var2];
            if ((field783[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field783[var3] = (byte) (field783[var3] | 0x2);
                } else {
                    int var4 = arg0.method2764(1);
                    if (var4 == 0) {
                        var1 = method606(arg0);
                        field783[var3] = (byte) (field783[var3] | 0x2);
                    } else {
                        method3098(arg0, var3);
                    }
                }
            }
        }
        arg0.method2757();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2756();
        for (int var5 = 0; var5 < field784; var5++) {
            int var6 = field785[var5];
            if ((field783[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field783[var6] = (byte) (field783[var6] | 0x2);
                } else {
                    int var7 = arg0.method2764(1);
                    if (var7 == 0) {
                        var1 = method606(arg0);
                        field783[var6] = (byte) (field783[var6] | 0x2);
                    } else {
                        method3098(arg0, var6);
                    }
                }
            }
        }
        arg0.method2757();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2756();
        for (int var8 = 0; var8 < field790; var8++) {
            int var9 = field787[var8];
            if ((field783[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field783[var9] = (byte) (field783[var9] | 0x2);
                } else {
                    int var10 = arg0.method2764(1);
                    if (var10 == 0) {
                        var1 = method606(arg0);
                        field783[var9] = (byte) (field783[var9] | 0x2);
                    } else if (method1051(arg0, var9)) {
                        field783[var9] = (byte) (field783[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2757();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2756();
        for (int var11 = 0; var11 < field790; var11++) {
            int var12 = field787[var11];
            if ((field783[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field783[var12] = (byte) (field783[var12] | 0x2);
                } else {
                    int var13 = arg0.method2764(1);
                    if (var13 == 0) {
                        var1 = method606(arg0);
                        field783[var12] = (byte) (field783[var12] | 0x2);
                    } else if (method1051(arg0, var12)) {
                        field783[var12] = (byte) (field783[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2757();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field784 = 0;
        field790 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field783[var14] = (byte) (field783[var14] >> 1);
            class3 var15 = client.field303[var14];
            if (var15 == null) {
                field787[++field790 - 1] = var14;
            } else {
                field785[++field784 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("a.e(Ldu;I)I")
    public static int method606(class126 arg0) {
        int var1 = arg0.method2764(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2764(5);
        } else if (var1 == 2) {
            var2 = arg0.method2764(8);
        } else {
            var2 = arg0.method2764(11);
        }
        return var2;
    }

    @ObfuscatedName("ex.h(Ldu;II)V")
    public static void method3098(class126 arg0, int arg1) {
        boolean var2 = arg0.method2764(1) == 1;
        if (var2) {
            field780[++field786 - 1] = arg1;
        }
        int var3 = arg0.method2764(2);
        class3 var4 = client.field303[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field46 = false;
            } else if (client.field418 == arg1) {
                throw new RuntimeException();
            } else {
                field791[arg1] = (Statics.field593 + var4.field888[0] >> 6) + (Statics.field12 + var4.field887[0] >> 6 << 14) + (var4.field53 << 28);
                if (var4.field860 == -1) {
                    field789[arg1] = var4.field883;
                } else {
                    field789[arg1] = var4.field860;
                }
                field781[arg1] = var4.field845;
                client.field303[arg1] = null;
                if (arg0.method2764(1) != 0) {
                    method1051(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2764(3);
            int var6 = var4.field887[0];
            int var7 = var4.field888[0];
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
            if (client.field418 == arg1 && var4.field876 < 1536 || var4.field833 < 1536 || var4.field876 >= 11776 || var4.field833 >= 11776) {
                var4.method20(var6, var7);
                var4.field46 = false;
            } else if (var2) {
                var4.field46 = true;
                var4.field50 = var6;
                var4.field57 = var7;
            } else {
                var4.field46 = false;
                var4.method19(var6, var7, field782[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2764(4);
            int var9 = var4.field887[0];
            int var10 = var4.field888[0];
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
            if (client.field418 == arg1 && var4.field876 < 1536 || var4.field833 < 1536 || var4.field876 >= 11776 || var4.field833 >= 11776) {
                var4.method20(var9, var10);
                var4.field46 = false;
            } else if (var2) {
                var4.field46 = true;
                var4.field50 = var9;
                var4.field57 = var10;
            } else {
                var4.field46 = false;
                var4.method19(var9, var10, field782[arg1]);
            }
        } else {
            int var11 = arg0.method2764(1);
            if (var11 == 0) {
                int var12 = arg0.method2764(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field887[0] + var14;
                int var17 = var4.field888[0] + var15;
                if (client.field418 == arg1 && var4.field876 < 1536 || var4.field833 < 1536 || var4.field876 >= 11776 || var4.field833 >= 11776) {
                    var4.method20(var16, var17);
                    var4.field46 = false;
                } else if (var2) {
                    var4.field46 = true;
                    var4.field50 = var16;
                    var4.field57 = var17;
                } else {
                    var4.field46 = false;
                    var4.method19(var16, var17, field782[arg1]);
                }
                var4.field53 = (byte) (var4.field53 + var13 & 0x3);
                if (client.field418 == arg1) {
                    Statics.field1702 = var4.field53;
                }
            } else {
                int var18 = arg0.method2764(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field12 + var4.field887[0] + var20 & 0x3FFF) - Statics.field12;
                int var23 = (Statics.field593 + var4.field888[0] + var21 & 0x3FFF) - Statics.field593;
                if (client.field418 == arg1 && var4.field876 < 1536 || var4.field833 < 1536 || var4.field876 >= 11776 || var4.field833 >= 11776) {
                    var4.method20(var22, var23);
                    var4.field46 = false;
                } else if (var2) {
                    var4.field46 = true;
                    var4.field50 = var22;
                    var4.field57 = var23;
                } else {
                    var4.field46 = false;
                    var4.method19(var22, var23, field782[arg1]);
                }
                var4.field53 = (byte) (var4.field53 + var19 & 0x3);
                if (client.field418 == arg1) {
                    Statics.field1702 = var4.field53;
                }
            }
        }
    }

    @ObfuscatedName("an.s(Ldu;IB)Z")
    public static boolean method1051(class126 arg0, int arg1) {
        int var2 = arg0.method2764(2);
        if (var2 == 0) {
            if (arg0.method2764(1) != 0) {
                method1051(arg0, arg1);
            }
            int var3 = arg0.method2764(6);
            int var4 = arg0.method2764(6);
            boolean var5 = arg0.method2764(1) == 1;
            if (var5) {
                field780[++field786 - 1] = arg1;
            }
            if (client.field303[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field303[arg1] = new class3();
            var6.field54 = arg1;
            if (field792[arg1] != null) {
                var6.method30(field792[arg1]);
            }
            var6.field883 = field789[arg1];
            var6.field845 = field781[arg1];
            int var7 = field791[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field889[0] = field782[arg1];
            var6.field53 = (byte) var8;
            var6.method20((var9 << 6) + var3 - Statics.field12, (var10 << 6) + var4 - Statics.field593);
            var6.field46 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2764(2);
            int var12 = field791[arg1];
            field791[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2764(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field791[arg1];
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
            field791[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2764(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field791[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field791[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ca.k(Ldu;ILr;IB)V")
    public static final void method1694(class126 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method2490();
            byte[] var6 = new byte[var5];
            class123 var7 = new class123(var6);
            arg0.method2611(var6, 0, var5);
            field792[arg1] = var7;
            arg2.method30(var7);
        }
        if ((arg3 & 0x10) != 0) {
            int var8 = arg0.method2492();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2490();
            client.method561(arg2, var8, var9);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field845 = arg0.method2492();
            if (arg2.field845 == 65535) {
                arg2.field845 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field836 = arg0.method2520();
            if (arg2.field836.charAt(0) == '~') {
                arg2.field836 = arg2.field836.substring(1);
                class12.method1632(2, arg2.field59, arg2.field836);
            } else if (Statics.field66 == arg2) {
                class12.method1632(2, arg2.field59, arg2.field836);
            }
            arg2.field846 = false;
            arg2.field886 = 0;
            arg2.field882 = 0;
            arg2.field848 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var10 = arg0.method2490();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2503();
                    if (var15 == 32767) {
                        var15 = arg0.method2503();
                        var13 = arg0.method2503();
                        var12 = arg0.method2503();
                        var14 = arg0.method2503();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2503();
                    }
                    int var16 = arg0.method2503();
                    arg2.method772(var15, var13, var12, var14, client.field306, var16);
                }
            }
            int var17 = arg0.method2490();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2503();
                    int var20 = arg0.method2503();
                    if (var20 == 32767) {
                        arg2.method774(var19);
                    } else {
                        int var21 = arg0.method2503();
                        int var22 = arg0.method2490();
                        int var23 = var20 > 0 ? arg0.method2490() : var22;
                        arg2.method773(var19, client.field306, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field860 = arg0.method2492();
            if (arg2.field850 == 0) {
                arg2.field883 = arg2.field860;
                arg2.field860 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var24 = arg0.method2492();
            class156 var25 = (class156) class113.method1866(class156.method2805(), arg0.method2490());
            boolean var26 = arg0.method2490() == 1;
            int var27 = arg0.method2490();
            int var28 = arg0.field2051;
            if (arg2.field59 != null && arg2.field32 != null) {
                boolean var29 = false;
                if (var25.field2331 && Statics.method2263(arg2.field59)) {
                    var29 = true;
                }
                if (!var29 && client.field565 == 0 && !arg2.field52) {
                    field793.field2051 = 0;
                    arg0.method2611(field793.field2052, 0, var27);
                    field793.field2051 = 0;
                    class123 var30 = field793;
                    String var34;
                    try {
                        int var31 = var30.method2503();
                        if (var31 > 32767) {
                            var31 = 32767;
                        }
                        byte[] var32 = new byte[var31];
                        var30.field2051 += Statics.field3228.method2415(var30.field2052, var30.field2051, var32, 0, var31);
                        String var33 = class169.method747(var32, 0, var31);
                        var34 = var33;
                    } catch (Exception var42) {
                        var34 = "Cabbage";
                    }
                    String var37 = class227.method3917(class167.method881(var34));
                    arg2.field836 = var37.trim();
                    arg2.field886 = var24 >> 8;
                    arg2.field882 = var24 & 0xFF;
                    arg2.field848 = 150;
                    arg2.field846 = var26;
                    arg2.field853 = Statics.field66 != arg2 && var25.field2331 && client.field416 != "" && var37.toLowerCase().indexOf(client.field416) == -1;
                    int var38;
                    if (var25.field2330) {
                        var38 = var26 ? 91 : 1;
                    } else {
                        var38 = var26 ? 90 : 2;
                    }
                    if (var25.field2326 == -1) {
                        class12.method1632(var38, arg2.field59, var37);
                    } else {
                        class12.method1632(var38, class2.method608(var25.field2326) + arg2.field59, var37);
                    }
                }
            }
            arg0.field2051 = var27 + var28;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field869 = arg0.method2492();
            int var39 = arg0.method2477();
            arg2.field873 = var39 >> 16;
            arg2.field872 = (var39 & 0xFFFF) + client.field306;
            arg2.field891 = 0;
            arg2.field859 = 0;
            if (arg2.field872 > client.field306) {
                arg2.field891 = -1;
            }
            if (arg2.field869 == 65535) {
                arg2.field869 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field874 = arg0.method2491();
            arg2.field857 = arg0.method2491();
            arg2.field875 = arg0.method2491();
            arg2.field877 = arg0.method2491();
            arg2.field892 = arg0.method2492() + client.field306;
            arg2.field879 = arg0.method2492() + client.field306;
            arg2.field885 = arg0.method2492();
            if (arg2.field46) {
                arg2.field874 += arg2.field50;
                arg2.field857 += arg2.field57;
                arg2.field875 += arg2.field50;
                arg2.field877 += arg2.field57;
                arg2.field850 = 0;
            } else {
                arg2.field874 += arg2.field887[0];
                arg2.field857 += arg2.field888[0];
                arg2.field875 += arg2.field887[0];
                arg2.field877 += arg2.field888[0];
                arg2.field850 = 1;
            }
            arg2.field840 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            field782[arg1] = arg0.method2491();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2491();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var40 = 0; var40 < 3; var40++) {
                arg2.field51[var40] = arg0.method2520();
            }
        }
        if (!arg2.field46) {
            return;
        }
        if (var4 == 127) {
            arg2.method20(arg2.field50, arg2.field57);
            return;
        }
        byte var41;
        if (var4 == -1) {
            var41 = field782[arg1];
        } else {
            var41 = var4;
        }
        arg2.method19(arg2.field50, arg2.field57, var41);
    }

    @ObfuscatedName("k.u(B)V")
    public static void method95() {
        field784 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field792[var0] = null;
            field782[var0] = 1;
        }
    }
}
