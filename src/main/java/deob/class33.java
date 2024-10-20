package deob;

@ObfuscatedName("az")
public class class33 {

    @ObfuscatedName("az.v")
    public static byte[] field759 = new byte[2048];

    @ObfuscatedName("az.l")
    public static byte[] field760 = new byte[2048];

    @ObfuscatedName("az.y")
    public static class119[] field761 = new class119[2048];

    @ObfuscatedName("az.w")
    public static int field762 = 0;

    @ObfuscatedName("az.u")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("az.a")
    public static int field764 = 0;

    @ObfuscatedName("az.e")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("az.b")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("az.o")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("az.m")
    public static int[] field757 = new int[2048];

    @ObfuscatedName("az.x")
    public static int field773 = 0;

    @ObfuscatedName("az.k")
    public static int[] field774 = new int[2048];

    @ObfuscatedName("az.n")
    public static class119 field768 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.d(Ldo;I)V")
    public static final void method182(class122 arg0) {
        arg0.method2624();
        int var1 = client.field413;
        class3 var2 = Statics.field2222 = client.field412[var1] = new class3();
        var2.field52 = var1;
        int var3 = arg0.method2630(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field864[0] = var5 - Statics.field2611;
        var2.field851 = (var2.field864[0] << 7) + (var2.method28() << 6);
        var2.field875[0] = var6 - Statics.field278;
        var2.field821 = (var2.field875[0] << 7) + (var2.method28() << 6);
        Statics.field65 = var2.field56 = var4;
        if (field761[var1] != null) {
            var2.method14(field761[var1]);
        }
        field762 = 0;
        field763[++field762 - 1] = var1;
        field759[var1] = 0;
        field764 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2630(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field766[var7] = (var9 << 28) + (var10 << 14) + var11;
                field758[var7] = 0;
                field757[var7] = -1;
                field765[++field764 - 1] = var7;
                field759[var7] = 0;
            }
        }
        arg0.method2627();
    }

    @ObfuscatedName("h.p(Ldo;IB)V")
    public static final void method200(class122 arg0, int arg1) {
        int var2 = arg0.field1966;
        field773 = 0;
        method609(arg0);
        for (int var3 = 0; var3 < field773; var3++) {
            int var4 = field774[var3];
            class3 var5 = client.field412[var4];
            int var6 = arg0.method2357();
            if ((var6 & 0x10) != 0) {
                var6 += arg0.method2357() << 8;
            }
            method2721(arg0, var4, var5, var6);
        }
        if (arg0.field1966 - var2 != arg1) {
            throw new RuntimeException(arg0.field1966 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("c.v(Ldo;I)V")
    public static final void method609(class122 arg0) {
        int var1 = 0;
        arg0.method2624();
        for (int var2 = 0; var2 < field762; var2++) {
            int var3 = field763[var2];
            if ((field759[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var3] = (byte) (field759[var3] | 0x2);
                } else {
                    int var4 = arg0.method2630(1);
                    if (var4 == 0) {
                        var1 = method938(arg0);
                        field759[var3] = (byte) (field759[var3] | 0x2);
                    } else {
                        method31(arg0, var3);
                    }
                }
            }
        }
        arg0.method2627();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2624();
        for (int var5 = 0; var5 < field762; var5++) {
            int var6 = field763[var5];
            if ((field759[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var6] = (byte) (field759[var6] | 0x2);
                } else {
                    int var7 = arg0.method2630(1);
                    if (var7 == 0) {
                        var1 = method938(arg0);
                        field759[var6] = (byte) (field759[var6] | 0x2);
                    } else {
                        method31(arg0, var6);
                    }
                }
            }
        }
        arg0.method2627();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2624();
        for (int var8 = 0; var8 < field764; var8++) {
            int var9 = field765[var8];
            if ((field759[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var9] = (byte) (field759[var9] | 0x2);
                } else {
                    int var10 = arg0.method2630(1);
                    if (var10 == 0) {
                        var1 = method938(arg0);
                        field759[var9] = (byte) (field759[var9] | 0x2);
                    } else if (method631(arg0, var9)) {
                        field759[var9] = (byte) (field759[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2627();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2624();
        for (int var11 = 0; var11 < field764; var11++) {
            int var12 = field765[var11];
            if ((field759[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var12] = (byte) (field759[var12] | 0x2);
                } else {
                    int var13 = arg0.method2630(1);
                    if (var13 == 0) {
                        var1 = method938(arg0);
                        field759[var12] = (byte) (field759[var12] | 0x2);
                    } else if (method631(arg0, var12)) {
                        field759[var12] = (byte) (field759[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2627();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field762 = 0;
        field764 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field759[var14] = (byte) (field759[var14] >> 1);
            class3 var15 = client.field412[var14];
            if (var15 == null) {
                field765[++field764 - 1] = var14;
            } else {
                field763[++field762 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("av.l(Ldo;I)I")
    public static int method938(class122 arg0) {
        int var1 = arg0.method2630(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2630(5);
        } else if (var1 == 2) {
            var2 = arg0.method2630(8);
        } else {
            var2 = arg0.method2630(11);
        }
        return var2;
    }

    @ObfuscatedName("v.y(Ldo;II)V")
    public static void method31(class122 arg0, int arg1) {
        boolean var2 = arg0.method2630(1) == 1;
        if (var2) {
            field774[++field773 - 1] = arg1;
        }
        int var3 = arg0.method2630(2);
        class3 var4 = client.field412[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field51 = false;
            } else if (client.field413 == arg1) {
                throw new RuntimeException();
            } else {
                field766[arg1] = (Statics.field278 + var4.field875[0] >> 6) + (Statics.field2611 + var4.field864[0] >> 6 << 14) + (var4.field56 << 28);
                if (var4.field847 == -1) {
                    field758[arg1] = var4.field873;
                } else {
                    field758[arg1] = var4.field847;
                }
                field757[arg1] = var4.field845;
                client.field412[arg1] = null;
                if (arg0.method2630(1) != 0) {
                    method631(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2630(3);
            int var6 = var4.field864[0];
            int var7 = var4.field875[0];
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
            if (client.field413 == arg1 && var4.field851 < 1536 || var4.field821 < 1536 || var4.field851 >= 11776 || var4.field821 >= 11776) {
                var4.method17(var6, var7);
                var4.field51 = false;
            } else if (var2) {
                var4.field51 = true;
                var4.field54 = var6;
                var4.field55 = var7;
            } else {
                var4.field51 = false;
                var4.method20(var6, var7, field760[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2630(4);
            int var9 = var4.field864[0];
            int var10 = var4.field875[0];
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
            if (client.field413 == arg1 && var4.field851 < 1536 || var4.field821 < 1536 || var4.field851 >= 11776 || var4.field821 >= 11776) {
                var4.method17(var9, var10);
                var4.field51 = false;
            } else if (var2) {
                var4.field51 = true;
                var4.field54 = var9;
                var4.field55 = var10;
            } else {
                var4.field51 = false;
                var4.method20(var9, var10, field760[arg1]);
            }
        } else {
            int var11 = arg0.method2630(1);
            if (var11 == 0) {
                int var12 = arg0.method2630(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field864[0] + var14;
                int var17 = var4.field875[0] + var15;
                if (client.field413 == arg1 && var4.field851 < 1536 || var4.field821 < 1536 || var4.field851 >= 11776 || var4.field821 >= 11776) {
                    var4.method17(var16, var17);
                    var4.field51 = false;
                } else if (var2) {
                    var4.field51 = true;
                    var4.field54 = var16;
                    var4.field55 = var17;
                } else {
                    var4.field51 = false;
                    var4.method20(var16, var17, field760[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var13 & 0x3);
                if (client.field413 == arg1) {
                    Statics.field65 = var4.field56;
                }
            } else {
                int var18 = arg0.method2630(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2611 + var4.field864[0] + var20 & 0x3FFF) - Statics.field2611;
                int var23 = (Statics.field278 + var4.field875[0] + var21 & 0x3FFF) - Statics.field278;
                if (client.field413 == arg1 && var4.field851 < 1536 || var4.field821 < 1536 || var4.field851 >= 11776 || var4.field821 >= 11776) {
                    var4.method17(var22, var23);
                    var4.field51 = false;
                } else if (var2) {
                    var4.field51 = true;
                    var4.field54 = var22;
                    var4.field55 = var23;
                } else {
                    var4.field51 = false;
                    var4.method20(var22, var23, field760[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var19 & 0x3);
                if (client.field413 == arg1) {
                    Statics.field65 = var4.field56;
                }
            }
        }
    }

    @ObfuscatedName("al.w(Ldo;IB)Z")
    public static boolean method631(class122 arg0, int arg1) {
        int var2 = arg0.method2630(2);
        if (var2 == 0) {
            if (arg0.method2630(1) != 0) {
                method631(arg0, arg1);
            }
            int var3 = arg0.method2630(6);
            int var4 = arg0.method2630(6);
            boolean var5 = arg0.method2630(1) == 1;
            if (var5) {
                field774[++field773 - 1] = arg1;
            }
            if (client.field412[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field412[arg1] = new class3();
            var6.field52 = arg1;
            if (field761[arg1] != null) {
                var6.method14(field761[arg1]);
            }
            var6.field873 = field758[arg1];
            var6.field845 = field757[arg1];
            int var7 = field766[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field870[0] = field760[arg1];
            var6.field56 = (byte) var8;
            var6.method17((var9 << 6) + var3 - Statics.field2611, (var10 << 6) + var4 - Statics.field278);
            var6.field51 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2630(2);
            int var12 = field766[arg1];
            field766[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2630(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field766[arg1];
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
            field766[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2630(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field766[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field766[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ei.u(Ldo;ILv;II)V")
    public static final void method2721(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method2357();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2400(var6, 0, var5);
            field761[arg1] = var7;
            arg2.method14(var7);
        }
        if ((arg3 & 0x2) != 0) {
            int var8 = arg0.method2359();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2357();
            client.method2295(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field845 = arg0.method2359();
            if (arg2.field845 == 65535) {
                arg2.field845 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field833 = arg0.method2365();
            if (arg2.field833.charAt(0) == '~') {
                arg2.field833 = arg2.field833.substring(1);
                class12.method2966(2, arg2.field43, arg2.field833);
            } else if (Statics.field2222 == arg2) {
                class12.method2966(2, arg2.field43, arg2.field833);
            }
            arg2.field865 = false;
            arg2.field860 = 0;
            arg2.field838 = 0;
            arg2.field840 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            int var10 = arg0.method2359();
            int var11 = arg0.method2357();
            arg2.method716(var10, var11, client.field299);
            arg2.field842 = client.field299 + 300;
            arg2.field843 = arg0.method2357();
            arg2.field844 = arg0.method2357();
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field847 = arg0.method2359();
            if (arg2.field820 == 0) {
                arg2.field873 = arg2.field847;
                arg2.field847 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var12 = arg0.method2359();
            class152[] var13 = new class152[] { class152.field2237, class152.field2232, class152.field2238, class152.field2233, class152.field2234 };
            class152 var14 = (class152) class109.method164(var13, arg0.method2357());
            boolean var15 = arg0.method2357() == 1;
            int var16 = arg0.method2357();
            int var17 = arg0.field1966;
            if (arg2.field43 != null && arg2.field31 != null) {
                boolean var18 = false;
                if (var14.field2240 && client.method612(arg2.field43)) {
                    var18 = true;
                }
                if (!var18 && client.field507 == 0 && !arg2.field50) {
                    field768.field1966 = 0;
                    arg0.method2400(field768.field1973, 0, var16);
                    field768.field1966 = 0;
                    class119 var19 = field768;
                    String var23;
                    try {
                        int var20 = var19.method2370();
                        if (var20 > 32767) {
                            var20 = 32767;
                        }
                        byte[] var21 = new byte[var20];
                        var19.field1966 += Statics.field3169.method2289(var19.field1973, var19.field1966, var21, 0, var20);
                        String var22 = class165.method2141(var21, 0, var20);
                        var23 = var22;
                    } catch (Exception var33) {
                        var23 = "Cabbage";
                    }
                    String var26 = class223.method3826(class163.method2238(var23));
                    arg2.field833 = var26.trim();
                    arg2.field860 = var12 >> 8;
                    arg2.field838 = var12 & 0xFF;
                    arg2.field840 = 150;
                    arg2.field865 = var15;
                    arg2.field835 = Statics.field2222 != arg2 && var14.field2240 && client.field341 != "" && var26.toLowerCase().indexOf(client.field341) == -1;
                    int var27;
                    if (var14.field2236) {
                        var27 = var15 ? 91 : 1;
                    } else {
                        var27 = var15 ? 90 : 2;
                    }
                    if (var14.field2231 == -1) {
                        class12.method2966(var27, arg2.field43, var26);
                    } else {
                        class12.method2966(var27, class2.method2688(var14.field2231) + arg2.field43, var26);
                    }
                }
            }
            arg0.field1966 = var16 + var17;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field856 = arg0.method2359();
            int var28 = arg0.method2362();
            arg2.field831 = var28 >> 16;
            arg2.field859 = (var28 & 0xFFFF) + client.field299;
            arg2.field837 = 0;
            arg2.field858 = 0;
            if (arg2.field859 > client.field299) {
                arg2.field837 = -1;
            }
            if (arg2.field856 == 65535) {
                arg2.field856 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field874 = arg0.method2477();
            arg2.field863 = arg0.method2477();
            arg2.field862 = arg0.method2477();
            arg2.field836 = arg0.method2477();
            arg2.field841 = arg0.method2359() + client.field299;
            arg2.field866 = arg0.method2359() + client.field299;
            arg2.field867 = arg0.method2359();
            if (arg2.field51) {
                arg2.field874 += arg2.field54;
                arg2.field863 += arg2.field55;
                arg2.field862 += arg2.field54;
                arg2.field836 += arg2.field55;
                arg2.field820 = 0;
            } else {
                arg2.field874 += arg2.field864[0];
                arg2.field863 += arg2.field875[0];
                arg2.field862 += arg2.field864[0];
                arg2.field836 += arg2.field875[0];
                arg2.field820 = 1;
            }
            arg2.field878 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var29 = arg0.method2359();
            int var30 = arg0.method2357();
            arg2.method716(var29, var30, client.field299);
            arg2.field842 = client.field299 + 300;
            arg2.field843 = arg0.method2357();
            arg2.field844 = arg0.method2357();
        }
        if ((arg3 & 0x200) != 0) {
            field760[arg1] = arg0.method2477();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2477();
        }
        if ((arg3 & 0x2000) != 0) {
            for (int var31 = 0; var31 < 3; var31++) {
                arg2.field34[var31] = arg0.method2365();
            }
        }
        if (!arg2.field51) {
            return;
        }
        if (var4 == 127) {
            arg2.method17(arg2.field54, arg2.field55);
            return;
        }
        byte var32;
        if (var4 == -1) {
            var32 = field760[arg1];
        } else {
            var32 = var4;
        }
        arg2.method20(arg2.field54, arg2.field55, var32);
    }
}
