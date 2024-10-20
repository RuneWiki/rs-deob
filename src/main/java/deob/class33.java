package deob;

@ObfuscatedName("ap")
public class class33 {

    @ObfuscatedName("ap.c")
    public static byte[] field743 = new byte[2048];

    @ObfuscatedName("ap.l")
    public static byte[] field753 = new byte[2048];

    @ObfuscatedName("ap.r")
    public static class119[] field745 = new class119[2048];

    @ObfuscatedName("ap.u")
    public static int field757 = 0;

    @ObfuscatedName("ap.j")
    public static int[] field747 = new int[2048];

    @ObfuscatedName("ap.w")
    public static int field748 = 0;

    @ObfuscatedName("ap.y")
    public static int[] field749 = new int[2048];

    @ObfuscatedName("ap.o")
    public static int[] field746 = new int[2048];

    @ObfuscatedName("ap.h")
    public static int[] field751 = new int[2048];

    @ObfuscatedName("ap.e")
    public static int[] field752 = new int[2048];

    @ObfuscatedName("ap.v")
    public static int field754 = 0;

    @ObfuscatedName("ap.p")
    public static int[] field744 = new int[2048];

    @ObfuscatedName("ap.m")
    public static class119 field755 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.n(Ldk;I)V")
    public static final void method71(class122 arg0) {
        arg0.method2593();
        int var1 = client.field504;
        class3 var2 = Statics.field180 = client.field415[var1] = new class3();
        var2.field52 = var1;
        int var3 = arg0.method2594(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field861[0] = var5 - Statics.field1941;
        var2.field867 = (var2.field861[0] << 7) + (var2.method13() << 6);
        var2.field862[0] = var6 - Statics.field1588;
        var2.field807 = (var2.field862[0] << 7) + (var2.method13() << 6);
        Statics.field1154 = var2.field56 = var4;
        if (field745[var1] != null) {
            var2.method12(field745[var1]);
        }
        field757 = 0;
        field747[++field757 - 1] = var1;
        field743[var1] = 0;
        field748 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2594(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field746[var7] = (var9 << 28) + (var10 << 14) + var11;
                field751[var7] = 0;
                field752[var7] = -1;
                field749[++field748 - 1] = var7;
                field743[var7] = 0;
            }
        }
        arg0.method2606();
    }

    @ObfuscatedName("af.q(Ldk;II)V")
    public static final void method887(class122 arg0, int arg1) {
        int var2 = arg0.field1982;
        field754 = 0;
        method2825(arg0);
        method122(arg0);
        if (arg0.field1982 - var2 != arg1) {
            throw new RuntimeException(arg0.field1982 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("en.c(Ldk;B)V")
    public static final void method2825(class122 arg0) {
        int var1 = 0;
        arg0.method2593();
        for (int var2 = 0; var2 < field757; var2++) {
            int var3 = field747[var2];
            if ((field743[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field743[var3] = (byte) (field743[var3] | 0x2);
                } else {
                    int var4 = arg0.method2594(1);
                    if (var4 == 0) {
                        var1 = method3227(arg0);
                        field743[var3] = (byte) (field743[var3] | 0x2);
                    } else {
                        method604(arg0, var3);
                    }
                }
            }
        }
        arg0.method2606();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2593();
        for (int var5 = 0; var5 < field757; var5++) {
            int var6 = field747[var5];
            if ((field743[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field743[var6] = (byte) (field743[var6] | 0x2);
                } else {
                    int var7 = arg0.method2594(1);
                    if (var7 == 0) {
                        var1 = method3227(arg0);
                        field743[var6] = (byte) (field743[var6] | 0x2);
                    } else {
                        method604(arg0, var6);
                    }
                }
            }
        }
        arg0.method2606();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2593();
        for (int var8 = 0; var8 < field748; var8++) {
            int var9 = field749[var8];
            if ((field743[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field743[var9] = (byte) (field743[var9] | 0x2);
                } else {
                    int var10 = arg0.method2594(1);
                    if (var10 == 0) {
                        var1 = method3227(arg0);
                        field743[var9] = (byte) (field743[var9] | 0x2);
                    } else if (method2296(arg0, var9)) {
                        field743[var9] = (byte) (field743[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2606();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2593();
        for (int var11 = 0; var11 < field748; var11++) {
            int var12 = field749[var11];
            if ((field743[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field743[var12] = (byte) (field743[var12] | 0x2);
                } else {
                    int var13 = arg0.method2594(1);
                    if (var13 == 0) {
                        var1 = method3227(arg0);
                        field743[var12] = (byte) (field743[var12] | 0x2);
                    } else if (method2296(arg0, var12)) {
                        field743[var12] = (byte) (field743[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2606();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field757 = 0;
        field748 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field743[var14] = (byte) (field743[var14] >> 1);
            class3 var15 = client.field415[var14];
            if (var15 == null) {
                field749[++field748 - 1] = var14;
            } else {
                field747[++field757 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("fz.l(Ldk;I)I")
    public static int method3227(class122 arg0) {
        int var1 = arg0.method2594(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2594(5);
        } else if (var1 == 2) {
            var2 = arg0.method2594(8);
        } else {
            var2 = arg0.method2594(11);
        }
        return var2;
    }

    @ObfuscatedName("g.r(Ldk;II)V")
    public static void method604(class122 arg0, int arg1) {
        boolean var2 = arg0.method2594(1) == 1;
        if (var2) {
            field744[++field754 - 1] = arg1;
        }
        int var3 = arg0.method2594(2);
        class3 var4 = client.field415[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field48 = false;
            } else if (client.field504 == arg1) {
                throw new RuntimeException();
            } else {
                field746[arg1] = (Statics.field1588 + var4.field862[0] >> 6) + (Statics.field1941 + var4.field861[0] >> 6 << 14) + (var4.field56 << 28);
                if (var4.field813 == -1) {
                    field751[arg1] = var4.field821;
                } else {
                    field751[arg1] = var4.field813;
                }
                field752[arg1] = var4.field832;
                client.field415[arg1] = null;
                if (arg0.method2594(1) != 0) {
                    method2296(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2594(3);
            int var6 = var4.field861[0];
            int var7 = var4.field862[0];
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
            if (client.field504 == arg1 && var4.field867 < 1536 || var4.field807 < 1536 || var4.field867 >= 11776 || var4.field807 >= 11776) {
                var4.method34(var6, var7);
                var4.field48 = false;
            } else if (var2) {
                var4.field48 = true;
                var4.field51 = var6;
                var4.field43 = var7;
            } else {
                var4.field48 = false;
                var4.method30(var6, var7, field753[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2594(4);
            int var9 = var4.field861[0];
            int var10 = var4.field862[0];
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
            if (client.field504 == arg1 && var4.field867 < 1536 || var4.field807 < 1536 || var4.field867 >= 11776 || var4.field807 >= 11776) {
                var4.method34(var9, var10);
                var4.field48 = false;
            } else if (var2) {
                var4.field48 = true;
                var4.field51 = var9;
                var4.field43 = var10;
            } else {
                var4.field48 = false;
                var4.method30(var9, var10, field753[arg1]);
            }
        } else {
            int var11 = arg0.method2594(1);
            if (var11 == 0) {
                int var12 = arg0.method2594(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field861[0] + var14;
                int var17 = var4.field862[0] + var15;
                if (client.field504 == arg1 && var4.field867 < 1536 || var4.field807 < 1536 || var4.field867 >= 11776 || var4.field807 >= 11776) {
                    var4.method34(var16, var17);
                    var4.field48 = false;
                } else if (var2) {
                    var4.field48 = true;
                    var4.field51 = var16;
                    var4.field43 = var17;
                } else {
                    var4.field48 = false;
                    var4.method30(var16, var17, field753[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var13 & 0x3);
                if (client.field504 == arg1) {
                    Statics.field1154 = var4.field56;
                }
            } else {
                int var18 = arg0.method2594(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1941 + var4.field861[0] + var20 & 0x3FFF) - Statics.field1941;
                int var23 = (Statics.field1588 + var4.field862[0] + var21 & 0x3FFF) - Statics.field1588;
                if (client.field504 == arg1 && var4.field867 < 1536 || var4.field807 < 1536 || var4.field867 >= 11776 || var4.field807 >= 11776) {
                    var4.method34(var22, var23);
                    var4.field48 = false;
                } else if (var2) {
                    var4.field48 = true;
                    var4.field51 = var22;
                    var4.field43 = var23;
                } else {
                    var4.field48 = false;
                    var4.method30(var22, var23, field753[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var19 & 0x3);
                if (client.field504 == arg1) {
                    Statics.field1154 = var4.field56;
                }
            }
        }
    }

    @ObfuscatedName("dh.u(Ldk;II)Z")
    public static boolean method2296(class122 arg0, int arg1) {
        int var2 = arg0.method2594(2);
        if (var2 == 0) {
            if (arg0.method2594(1) != 0) {
                method2296(arg0, arg1);
            }
            int var3 = arg0.method2594(6);
            int var4 = arg0.method2594(6);
            boolean var5 = arg0.method2594(1) == 1;
            if (var5) {
                field744[++field754 - 1] = arg1;
            }
            if (client.field415[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field415[arg1] = new class3();
            var6.field52 = arg1;
            if (field745[arg1] != null) {
                var6.method12(field745[arg1]);
            }
            var6.field821 = field751[arg1];
            var6.field832 = field752[arg1];
            int var7 = field746[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field863[0] = field753[arg1];
            var6.field56 = (byte) var8;
            var6.method34((var9 << 6) + var3 - Statics.field1941, (var10 << 6) + var4 - Statics.field1588);
            var6.field48 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2594(2);
            int var12 = field746[arg1];
            field746[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2594(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field746[arg1];
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
            field746[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2594(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field746[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field746[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("o.j(Ldk;I)V")
    public static final void method122(class122 arg0) {
        for (int var1 = 0; var1 < field754; var1++) {
            int var2 = field744[var1];
            class3 var3 = client.field415[var2];
            int var4 = arg0.method2360();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2360() << 8;
            }
            method2624(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("dr.w(Ldk;ILc;IB)V")
    public static final void method2624(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method2360();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2371(var6, 0, var5);
            field745[arg1] = var7;
            arg2.method12(var7);
        }
        if ((arg3 & 0x20) != 0) {
            int var8 = arg0.method2430();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2360();
            client.method3126(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field832 = arg0.method2430();
            if (arg2.field832 == 65535) {
                arg2.field832 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field819 = arg0.method2368();
            if (arg2.field819.charAt(0) == '~') {
                arg2.field819 = arg2.field819.substring(1);
                class12.method3686(2, arg2.field60, arg2.field819);
            } else if (Statics.field180 == arg2) {
                class12.method3686(2, arg2.field60, arg2.field819);
            }
            arg2.field850 = false;
            arg2.field823 = 0;
            arg2.field824 = 0;
            arg2.field822 = 150;
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method2430();
            int var11 = arg0.method2360();
            arg2.method750(var10, var11, client.field303);
            arg2.field857 = client.field303 + 300;
            arg2.field830 = arg0.method2360();
            arg2.field831 = arg0.method2360();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field813 = arg0.method2430();
            if (arg2.field836 == 0) {
                arg2.field821 = arg2.field813;
                arg2.field813 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var12 = arg0.method2430();
            class152 var13 = (class152) class109.method3127(class152.method2928(), arg0.method2360());
            boolean var14 = arg0.method2360() == 1;
            int var15 = arg0.method2360();
            int var16 = arg0.field1982;
            if (arg2.field60 != null && arg2.field37 != null) {
                boolean var17 = false;
                if (var13.field2255 && client.method7(arg2.field60)) {
                    var17 = true;
                }
                if (!var17 && client.field414 == 0 && !arg2.field55) {
                    field755.field1982 = 0;
                    arg0.method2371(field755.field1987, 0, var15);
                    field755.field1982 = 0;
                    class119 var18 = field755;
                    String var22;
                    try {
                        int var19 = var18.method2373();
                        if (var19 > 32767) {
                            var19 = 32767;
                        }
                        byte[] var20 = new byte[var19];
                        var18.field1982 += Statics.field3171.method2293(var18.field1987, var18.field1982, var20, 0, var19);
                        String var21 = class165.method2069(var20, 0, var19);
                        var22 = var21;
                    } catch (Exception var32) {
                        var22 = "Cabbage";
                    }
                    String var25 = class223.method3749(class163.method2157(var22));
                    arg2.field819 = var25.trim();
                    arg2.field823 = var12 >> 8;
                    arg2.field824 = var12 & 0xFF;
                    arg2.field822 = 150;
                    arg2.field850 = var14;
                    arg2.field806 = Statics.field180 != arg2 && var13.field2255 && client.field512 != "" && var25.toLowerCase().indexOf(client.field512) == -1;
                    int var26;
                    if (var13.field2254) {
                        var26 = var14 ? 91 : 1;
                    } else {
                        var26 = var14 ? 90 : 2;
                    }
                    if (var13.field2251 == -1) {
                        class12.method3686(var26, arg2.field60, var25);
                    } else {
                        class12.method3686(var26, class2.method771(var13.field2251) + arg2.field60, var25);
                    }
                }
            }
            arg0.field1982 = var15 + var16;
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field843 = arg0.method2430();
            int var27 = arg0.method2365();
            arg2.field847 = var27 >> 16;
            arg2.field846 = (var27 & 0xFFFF) + client.field303;
            arg2.field844 = 0;
            arg2.field845 = 0;
            if (arg2.field846 > client.field303) {
                arg2.field844 = -1;
            }
            if (arg2.field843 == 65535) {
                arg2.field843 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field848 = arg0.method2512();
            arg2.field864 = arg0.method2512();
            arg2.field860 = arg0.method2512();
            arg2.field812 = arg0.method2512();
            arg2.field852 = arg0.method2430() + client.field303;
            arg2.field853 = arg0.method2430() + client.field303;
            arg2.field854 = arg0.method2430();
            if (arg2.field48) {
                arg2.field848 += arg2.field51;
                arg2.field864 += arg2.field43;
                arg2.field860 += arg2.field51;
                arg2.field812 += arg2.field43;
                arg2.field836 = 0;
            } else {
                arg2.field848 += arg2.field861[0];
                arg2.field864 += arg2.field862[0];
                arg2.field860 += arg2.field861[0];
                arg2.field812 += arg2.field862[0];
                arg2.field836 = 1;
            }
            arg2.field865 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            int var28 = arg0.method2430();
            int var29 = arg0.method2360();
            arg2.method750(var28, var29, client.field303);
            arg2.field857 = client.field303 + 300;
            arg2.field830 = arg0.method2360();
            arg2.field831 = arg0.method2360();
        }
        if ((arg3 & 0x200) != 0) {
            field753[arg1] = arg0.method2512();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2512();
        }
        if ((arg3 & 0x800) != 0) {
            for (int var30 = 0; var30 < 3; var30++) {
                arg2.field39[var30] = arg0.method2368();
            }
        }
        if (!arg2.field48) {
            return;
        }
        if (var4 == 127) {
            arg2.method34(arg2.field51, arg2.field43);
            return;
        }
        byte var31;
        if (var4 == -1) {
            var31 = field753[arg1];
        } else {
            var31 = var4;
        }
        arg2.method30(arg2.field51, arg2.field43, var31);
    }

    @ObfuscatedName("aj.y(I)V")
    public static void method664() {
        field757 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field745[var0] = null;
            field753[var0] = 1;
        }
    }
}
