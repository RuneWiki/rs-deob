package deob;

@ObfuscatedName("ad")
public class class35 {

    @ObfuscatedName("ad.e")
    public static byte[] field773 = new byte[2048];

    @ObfuscatedName("ad.o")
    public static byte[] field774 = new byte[2048];

    @ObfuscatedName("ad.g")
    public static class123[] field776 = new class123[2048];

    @ObfuscatedName("ad.l")
    public static int field778 = 0;

    @ObfuscatedName("ad.j")
    public static int[] field781 = new int[2048];

    @ObfuscatedName("ad.r")
    public static int field771 = 0;

    @ObfuscatedName("ad.x")
    public static int[] field775 = new int[2048];

    @ObfuscatedName("ad.k")
    public static int[] field780 = new int[2048];

    @ObfuscatedName("ad.v")
    public static int[] field779 = new int[2048];

    @ObfuscatedName("ad.h")
    public static int[] field782 = new int[2048];

    @ObfuscatedName("ad.u")
    public static int field783 = 0;

    @ObfuscatedName("ad.y")
    public static int[] field784 = new int[2048];

    @ObfuscatedName("ad.p")
    public static class123 field787 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.m(Ldx;B)V")
    public static final void method2332(class126 arg0) {
        arg0.method2641();
        int var1 = client.field552;
        class3 var2 = Statics.field2011 = client.field394[var1] = new class3();
        var2.field47 = var1;
        int var3 = arg0.method2655(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field886[0] = var5 - Statics.field839;
        var2.field865 = (var2.field886[0] << 7) + (var2.method15() << 6);
        var2.field887[0] = var6 - Statics.field185;
        var2.field832 = (var2.field887[0] << 7) + (var2.method15() << 6);
        Statics.field1120 = var2.field58 = var4;
        if (field776[var1] != null) {
            var2.method13(field776[var1]);
        }
        field778 = 0;
        field781[++field778 - 1] = var1;
        field773[var1] = 0;
        field771 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2655(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field780[var7] = (var9 << 28) + (var10 << 14) + var11;
                field779[var7] = 0;
                field782[var7] = -1;
                field775[++field771 - 1] = var7;
                field773[var7] = 0;
            }
        }
        arg0.method2642();
    }

    @ObfuscatedName("y.w(Ldx;IB)V")
    public static final void method150(class126 arg0, int arg1) {
        int var2 = arg0.field2046;
        field783 = 0;
        int var3 = 0;
        arg0.method2641();
        for (int var4 = 0; var4 < field778; var4++) {
            int var5 = field781[var4];
            if ((field773[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field773[var5] = (byte) (field773[var5] | 0x2);
                } else {
                    int var6 = arg0.method2655(1);
                    if (var6 == 0) {
                        var3 = Statics.method557(arg0);
                        field773[var5] = (byte) (field773[var5] | 0x2);
                    } else {
                        method656(arg0, var5);
                    }
                }
            }
        }
        arg0.method2642();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2641();
        for (int var7 = 0; var7 < field778; var7++) {
            int var8 = field781[var7];
            if ((field773[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field773[var8] = (byte) (field773[var8] | 0x2);
                } else {
                    int var9 = arg0.method2655(1);
                    if (var9 == 0) {
                        var3 = Statics.method557(arg0);
                        field773[var8] = (byte) (field773[var8] | 0x2);
                    } else {
                        method656(arg0, var8);
                    }
                }
            }
        }
        arg0.method2642();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2641();
        for (int var10 = 0; var10 < field771; var10++) {
            int var11 = field775[var10];
            if ((field773[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field773[var11] = (byte) (field773[var11] | 0x2);
                } else {
                    int var12 = arg0.method2655(1);
                    if (var12 == 0) {
                        var3 = Statics.method557(arg0);
                        field773[var11] = (byte) (field773[var11] | 0x2);
                    } else if (method846(arg0, var11)) {
                        field773[var11] = (byte) (field773[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2642();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2641();
        for (int var13 = 0; var13 < field771; var13++) {
            int var14 = field775[var13];
            if ((field773[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field773[var14] = (byte) (field773[var14] | 0x2);
                } else {
                    int var15 = arg0.method2655(1);
                    if (var15 == 0) {
                        var3 = Statics.method557(arg0);
                        field773[var14] = (byte) (field773[var14] | 0x2);
                    } else if (method846(arg0, var14)) {
                        field773[var14] = (byte) (field773[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2642();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field778 = 0;
        field771 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field773[var16] = (byte) (field773[var16] >> 1);
            class3 var17 = client.field394[var16];
            if (var17 == null) {
                field775[++field771 - 1] = var16;
            } else {
                field781[++field778 - 1] = var16;
            }
        }
        method3076(arg0);
        if (arg0.field2046 - var2 != arg1) {
            throw new RuntimeException(arg0.field2046 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("aa.o(Ldx;II)V")
    public static void method656(class126 arg0, int arg1) {
        boolean var2 = arg0.method2655(1) == 1;
        if (var2) {
            field784[++field783 - 1] = arg1;
        }
        int var3 = arg0.method2655(2);
        class3 var4 = client.field394[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field60 = false;
            } else if (client.field552 == arg1) {
                throw new RuntimeException();
            } else {
                field780[arg1] = (Statics.field185 + var4.field887[0] >> 6) + (Statics.field839 + var4.field886[0] >> 6 << 14) + (var4.field58 << 28);
                if (var4.field868 == -1) {
                    field779[arg1] = var4.field882;
                } else {
                    field779[arg1] = var4.field868;
                }
                field782[arg1] = var4.field857;
                client.field394[arg1] = null;
                if (arg0.method2655(1) != 0) {
                    method846(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2655(3);
            int var6 = var4.field886[0];
            int var7 = var4.field887[0];
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
            if (client.field552 == arg1 && var4.field865 < 1536 || var4.field832 < 1536 || var4.field865 >= 11776 || var4.field832 >= 11776) {
                var4.method18(var6, var7);
                var4.field60 = false;
            } else if (var2) {
                var4.field60 = true;
                var4.field61 = var6;
                var4.field62 = var7;
            } else {
                var4.field60 = false;
                var4.method17(var6, var7, field774[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2655(4);
            int var9 = var4.field886[0];
            int var10 = var4.field887[0];
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
            if (client.field552 == arg1 && var4.field865 < 1536 || var4.field832 < 1536 || var4.field865 >= 11776 || var4.field832 >= 11776) {
                var4.method18(var9, var10);
                var4.field60 = false;
            } else if (var2) {
                var4.field60 = true;
                var4.field61 = var9;
                var4.field62 = var10;
            } else {
                var4.field60 = false;
                var4.method17(var9, var10, field774[arg1]);
            }
        } else {
            int var11 = arg0.method2655(1);
            if (var11 == 0) {
                int var12 = arg0.method2655(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field886[0] + var14;
                int var17 = var4.field887[0] + var15;
                if (client.field552 == arg1 && var4.field865 < 1536 || var4.field832 < 1536 || var4.field865 >= 11776 || var4.field832 >= 11776) {
                    var4.method18(var16, var17);
                    var4.field60 = false;
                } else if (var2) {
                    var4.field60 = true;
                    var4.field61 = var16;
                    var4.field62 = var17;
                } else {
                    var4.field60 = false;
                    var4.method17(var16, var17, field774[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var13 & 0x3);
                if (client.field552 == arg1) {
                    Statics.field1120 = var4.field58;
                }
            } else {
                int var18 = arg0.method2655(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field839 + var4.field886[0] + var20 & 0x3FFF) - Statics.field839;
                int var23 = (Statics.field185 + var4.field887[0] + var21 & 0x3FFF) - Statics.field185;
                if (client.field552 == arg1 && var4.field865 < 1536 || var4.field832 < 1536 || var4.field865 >= 11776 || var4.field832 >= 11776) {
                    var4.method18(var22, var23);
                    var4.field60 = false;
                } else if (var2) {
                    var4.field60 = true;
                    var4.field61 = var22;
                    var4.field62 = var23;
                } else {
                    var4.field60 = false;
                    var4.method17(var22, var23, field774[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var19 & 0x3);
                if (client.field552 == arg1) {
                    Statics.field1120 = var4.field58;
                }
            }
        }
    }

    @ObfuscatedName("al.g(Ldx;II)Z")
    public static boolean method846(class126 arg0, int arg1) {
        int var2 = arg0.method2655(2);
        if (var2 == 0) {
            if (arg0.method2655(1) != 0) {
                method846(arg0, arg1);
            }
            int var3 = arg0.method2655(6);
            int var4 = arg0.method2655(6);
            boolean var5 = arg0.method2655(1) == 1;
            if (var5) {
                field784[++field783 - 1] = arg1;
            }
            if (client.field394[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field394[arg1] = new class3();
            var6.field47 = arg1;
            if (field776[arg1] != null) {
                var6.method13(field776[arg1]);
            }
            var6.field882 = field779[arg1];
            var6.field857 = field782[arg1];
            int var7 = field780[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field888[0] = field774[arg1];
            var6.field58 = (byte) var8;
            var6.method18((var9 << 6) + var3 - Statics.field839, (var10 << 6) + var4 - Statics.field185);
            var6.field60 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2655(2);
            int var12 = field780[arg1];
            field780[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2655(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field780[arg1];
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
            field780[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2655(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field780[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field780[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("fc.l(Ldx;I)V")
    public static final void method3076(class126 arg0) {
        for (int var1 = 0; var1 < field783; var1++) {
            int var2 = field784[var1];
            class3 var3 = client.field394[var2];
            int var4 = arg0.method2398();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2398() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x8) != 0) {
                int var6 = arg0.method2398();
                byte[] var7 = new byte[var6];
                class123 var8 = new class123(var7);
                arg0.method2425(var7, 0, var6);
                field776[var2] = var8;
                var3.method13(var8);
            }
            if ((var4 & 0x40) != 0) {
                int var9 = arg0.method2548();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2398();
                client.method170(var3, var9, var10);
            }
            if ((var4 & 0x20) != 0) {
                var3.field857 = arg0.method2548();
                if (var3.field857 == 65535) {
                    var3.field857 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field844 = arg0.method2422();
                if (var3.field844.charAt(0) == '~') {
                    var3.field844 = var3.field844.substring(1);
                    class12.method1270(2, var3.field44, var3.field844);
                } else if (Statics.field2011 == var3) {
                    class12.method1270(2, var3.field44, var3.field844);
                }
                var3.field845 = false;
                var3.field834 = 0;
                var3.field890 = 0;
                var3.field891 = 150;
            }
            if ((var4 & 0x4) != 0) {
                int var11 = arg0.method2398();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2427();
                        if (var16 == 32767) {
                            var16 = arg0.method2427();
                            var14 = arg0.method2427();
                            var13 = arg0.method2427();
                            var15 = arg0.method2427();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2427();
                        }
                        int var17 = arg0.method2427();
                        var3.method742(var16, var14, var13, var15, client.field283, var17);
                    }
                }
                int var18 = arg0.method2398();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2427();
                        int var21 = arg0.method2427();
                        if (var21 == 32767) {
                            var3.method744(var20);
                        } else {
                            int var22 = arg0.method2427();
                            int var23 = arg0.method2398();
                            int var24 = var21 > 0 ? arg0.method2398() : var23;
                            var3.method743(var20, client.field283, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field868 = arg0.method2548();
                if (var3.field876 == 0) {
                    var3.field882 = var3.field868;
                    var3.field868 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var25 = arg0.method2548();
                class156 var26 = (class156) class113.method78(class156.method2835(), arg0.method2398());
                boolean var27 = arg0.method2398() == 1;
                int var28 = arg0.method2398();
                int var29 = arg0.field2046;
                if (var3.field44 != null && var3.field51 != null) {
                    boolean var30 = false;
                    if (var26.field2320 && client.method1084(var3.field44)) {
                        var30 = true;
                    }
                    if (!var30 && client.field393 == 0 && !var3.field57) {
                        field787.field2046 = 0;
                        arg0.method2425(field787.field2048, 0, var28);
                        field787.field2046 = 0;
                        String var31 = class227.method3837(class167.method1059(class226.method3820(field787)));
                        var3.field844 = var31.trim();
                        var3.field834 = var25 >> 8;
                        var3.field890 = var25 & 0xFF;
                        var3.field891 = 150;
                        var3.field845 = var27;
                        var3.field831 = Statics.field2011 != var3 && var26.field2320 && client.field491 != "" && var31.toLowerCase().indexOf(client.field491) == -1;
                        int var32;
                        if (var26.field2327) {
                            var32 = var27 ? 91 : 1;
                        } else {
                            var32 = var27 ? 90 : 2;
                        }
                        if (var26.field2324 == -1) {
                            class12.method1270(var32, var3.field44, var31);
                        } else {
                            int var34 = var26.field2324;
                            String var35 = "<img=" + var34 + ">";
                            class12.method1270(var32, var35 + var3.field44, var31);
                        }
                    }
                }
                arg0.field2046 = var28 + var29;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field835 = arg0.method2548();
                int var36 = arg0.method2419();
                var3.field872 = var36 >> 16;
                var3.field871 = (var36 & 0xFFFF) + client.field283;
                var3.field869 = 0;
                var3.field870 = 0;
                if (var3.field871 > client.field283) {
                    var3.field869 = -1;
                }
                if (var3.field835 == 65535) {
                    var3.field835 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field873 = arg0.method2415();
                var3.field875 = arg0.method2415();
                var3.field874 = arg0.method2415();
                var3.field837 = arg0.method2415();
                var3.field853 = arg0.method2548() + client.field283;
                var3.field878 = arg0.method2548() + client.field283;
                var3.field847 = arg0.method2548();
                if (var3.field60) {
                    var3.field873 += var3.field61;
                    var3.field875 += var3.field62;
                    var3.field874 += var3.field61;
                    var3.field837 += var3.field62;
                    var3.field876 = 0;
                } else {
                    var3.field873 += var3.field886[0];
                    var3.field875 += var3.field887[0];
                    var3.field874 += var3.field886[0];
                    var3.field837 += var3.field887[0];
                    var3.field876 = 1;
                }
                var3.field852 = 0;
            }
            if ((var4 & 0x800) != 0) {
                field774[var2] = arg0.method2415();
            }
            if ((var4 & 0x200) != 0) {
                var5 = arg0.method2415();
            }
            if ((var4 & 0x100) != 0) {
                for (int var37 = 0; var37 < 3; var37++) {
                    var3.field59[var37] = arg0.method2422();
                }
            }
            if (var3.field60) {
                if (var5 == 127) {
                    var3.method18(var3.field61, var3.field62);
                } else {
                    byte var38;
                    if (var5 == -1) {
                        var38 = field774[var2];
                    } else {
                        var38 = var5;
                    }
                    var3.method17(var3.field61, var3.field62, var38);
                }
            }
        }
    }
}
