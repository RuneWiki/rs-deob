package deob;

@ObfuscatedName("ar")
public class class33 {

    @ObfuscatedName("ar.s")
    public static byte[] field734 = new byte[2048];

    @ObfuscatedName("ar.q")
    public static byte[] field725 = new byte[2048];

    @ObfuscatedName("ar.j")
    public static class119[] field726 = new class119[2048];

    @ObfuscatedName("ar.k")
    public static int field727 = 0;

    @ObfuscatedName("ar.i")
    public static int[] field737 = new int[2048];

    @ObfuscatedName("ar.m")
    public static int field729 = 0;

    @ObfuscatedName("ar.p")
    public static int[] field730 = new int[2048];

    @ObfuscatedName("ar.h")
    public static int[] field731 = new int[2048];

    @ObfuscatedName("ar.e")
    public static int[] field722 = new int[2048];

    @ObfuscatedName("ar.g")
    public static int[] field733 = new int[2048];

    @ObfuscatedName("ar.b")
    public static int field739 = 0;

    @ObfuscatedName("ar.f")
    public static int[] field735 = new int[2048];

    @ObfuscatedName("ar.y")
    public static class119 field736 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.n(Ldi;I)V")
    public static final void method2927(class122 arg0) {
        arg0.method2578();
        int var1 = client.field398;
        class3 var2 = Statics.field119 = client.field397[var1] = new class3();
        var2.field44 = var1;
        int var3 = arg0.method2586(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field844[0] = var5 - Statics.field166;
        var2.field816 = (var2.field844[0] << 7) + (var2.method25() << 6);
        var2.field809[0] = var6 - Statics.field757;
        var2.field815 = (var2.field809[0] << 7) + (var2.method25() << 6);
        Statics.field157 = var2.field49 = var4;
        if (field726[var1] != null) {
            var2.method30(field726[var1]);
        }
        field727 = 0;
        field737[++field727 - 1] = var1;
        field734[var1] = 0;
        field729 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2586(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field731[var7] = (var9 << 28) + (var10 << 14) + var11;
                field722[var7] = 0;
                field733[var7] = -1;
                field730[++field729 - 1] = var7;
                field734[var7] = 0;
            }
        }
        arg0.method2588();
    }

    @ObfuscatedName("dd.d(Ldi;IB)V")
    public static final void method2265(class122 arg0, int arg1) {
        int var2 = arg0.field1977;
        field739 = 0;
        method2703(arg0);
        method2260(arg0);
        if (arg0.field1977 - var2 != arg1) {
            throw new RuntimeException(arg0.field1977 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("er.s(Ldi;I)V")
    public static final void method2703(class122 arg0) {
        int var1 = 0;
        arg0.method2578();
        for (int var2 = 0; var2 < field727; var2++) {
            int var3 = field737[var2];
            if ((field734[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field734[var3] = (byte) (field734[var3] | 0x2);
                } else {
                    int var4 = arg0.method2586(1);
                    if (var4 == 0) {
                        var1 = Statics.method2683(arg0);
                        field734[var3] = (byte) (field734[var3] | 0x2);
                    } else {
                        method2003(arg0, var3);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2578();
        for (int var5 = 0; var5 < field727; var5++) {
            int var6 = field737[var5];
            if ((field734[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field734[var6] = (byte) (field734[var6] | 0x2);
                } else {
                    int var7 = arg0.method2586(1);
                    if (var7 == 0) {
                        var1 = Statics.method2683(arg0);
                        field734[var6] = (byte) (field734[var6] | 0x2);
                    } else {
                        method2003(arg0, var6);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2578();
        for (int var8 = 0; var8 < field729; var8++) {
            int var9 = field730[var8];
            if ((field734[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field734[var9] = (byte) (field734[var9] | 0x2);
                } else {
                    int var10 = arg0.method2586(1);
                    if (var10 == 0) {
                        var1 = Statics.method2683(arg0);
                        field734[var9] = (byte) (field734[var9] | 0x2);
                    } else if (method2938(arg0, var9)) {
                        field734[var9] = (byte) (field734[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2578();
        for (int var11 = 0; var11 < field729; var11++) {
            int var12 = field730[var11];
            if ((field734[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field734[var12] = (byte) (field734[var12] | 0x2);
                } else {
                    int var13 = arg0.method2586(1);
                    if (var13 == 0) {
                        var1 = Statics.method2683(arg0);
                        field734[var12] = (byte) (field734[var12] | 0x2);
                    } else if (method2938(arg0, var12)) {
                        field734[var12] = (byte) (field734[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field727 = 0;
        field729 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field734[var14] = (byte) (field734[var14] >> 1);
            class3 var15 = client.field397[var14];
            if (var15 == null) {
                field730[++field729 - 1] = var14;
            } else {
                field737[++field727 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cz.j(Ldi;II)V")
    public static void method2003(class122 arg0, int arg1) {
        boolean var2 = arg0.method2586(1) == 1;
        if (var2) {
            field735[++field739 - 1] = arg1;
        }
        int var3 = arg0.method2586(2);
        class3 var4 = client.field397[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field51 = -1;
            } else if (client.field398 == arg1) {
                throw new RuntimeException();
            } else {
                field731[arg1] = (Statics.field757 + var4.field809[0] >> 6) + (Statics.field166 + var4.field844[0] >> 6 << 14) + (var4.field49 << 28);
                if (var4.field834 == -1) {
                    field722[arg1] = var4.field845;
                } else {
                    field722[arg1] = var4.field834;
                }
                field733[arg1] = var4.field790;
                client.field397[arg1] = null;
                if (arg0.method2586(1) != 0) {
                    method2938(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2586(3);
            int var6 = var4.field844[0];
            int var7 = var4.field809[0];
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
            if (client.field398 == arg1 && var4.field816 < 1536 || var4.field815 < 1536 || var4.field816 >= 11776 || var4.field815 >= 11776) {
                var4.method20(var6, var7);
                var4.field51 = -1;
            } else if (var2) {
                var4.field51 = var6;
                var4.field50 = var7;
            } else {
                var4.field51 = -1;
                var4.method19(var6, var7, field725[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2586(4);
            int var9 = var4.field844[0];
            int var10 = var4.field809[0];
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
            if (client.field398 == arg1 && var4.field816 < 1536 || var4.field815 < 1536 || var4.field816 >= 11776 || var4.field815 >= 11776) {
                var4.method20(var9, var10);
                var4.field51 = -1;
            } else if (var2) {
                var4.field51 = var9;
                var4.field50 = var10;
            } else {
                var4.field51 = -1;
                var4.method19(var9, var10, field725[arg1]);
            }
        } else {
            int var11 = arg0.method2586(1);
            if (var11 == 0) {
                int var12 = arg0.method2586(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field844[0] + var14;
                int var17 = var4.field809[0] + var15;
                if (client.field398 == arg1 && var4.field816 < 1536 || var4.field815 < 1536 || var4.field816 >= 11776 || var4.field815 >= 11776) {
                    var4.method20(var16, var17);
                    var4.field51 = -1;
                } else if (var2) {
                    var4.field51 = var16;
                    var4.field50 = var17;
                } else {
                    var4.field51 = -1;
                    var4.method19(var16, var17, field725[arg1]);
                }
                var4.field49 = (byte) (var4.field49 + var13 & 0x3);
                if (client.field398 == arg1) {
                    Statics.field157 = var4.field49;
                }
            } else {
                int var18 = arg0.method2586(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field166 + var4.field844[0] + var20 & 0x3FFF) - Statics.field166;
                int var23 = (Statics.field757 + var4.field809[0] + var21 & 0x3FFF) - Statics.field757;
                if (client.field398 == arg1 && var4.field816 < 1536 || var4.field815 < 1536 || var4.field816 >= 11776 || var4.field815 >= 11776) {
                    var4.method20(var22, var23);
                    var4.field51 = -1;
                } else if (var2) {
                    var4.field51 = var22;
                    var4.field50 = var23;
                } else {
                    var4.field51 = -1;
                    var4.method19(var22, var23, field725[arg1]);
                }
                var4.field49 = (byte) (var4.field49 + var19 & 0x3);
                if (client.field398 == arg1) {
                    Statics.field157 = var4.field49;
                }
            }
        }
    }

    @ObfuscatedName("es.k(Ldi;II)Z")
    public static boolean method2938(class122 arg0, int arg1) {
        int var2 = arg0.method2586(2);
        if (var2 == 0) {
            if (arg0.method2586(1) != 0) {
                method2938(arg0, arg1);
            }
            int var3 = arg0.method2586(6);
            int var4 = arg0.method2586(6);
            boolean var5 = arg0.method2586(1) == 1;
            if (var5) {
                field735[++field739 - 1] = arg1;
            }
            if (client.field397[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field397[arg1] = new class3();
            var6.field44 = arg1;
            if (field726[arg1] != null) {
                var6.method30(field726[arg1]);
            }
            var6.field845 = field722[arg1];
            var6.field790 = field733[arg1];
            int var7 = field731[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field817[0] = field725[arg1];
            var6.field49 = (byte) var8;
            var6.method20((var9 << 6) + var3 - Statics.field166, (var10 << 6) + var4 - Statics.field757);
            var6.field51 = -1;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2586(2);
            int var12 = field731[arg1];
            field731[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2586(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field731[arg1];
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
            field731[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2586(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field731[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field731[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("de.i(Ldi;I)V")
    public static final void method2260(class122 arg0) {
        for (int var1 = 0; var1 < field739; var1++) {
            int var2 = field735[var1];
            class3 var3 = client.field397[var2];
            int var4 = arg0.method2338();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2338() << 8;
            }
            method3006(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("fa.m(Ldi;ILs;IB)V")
    public static final void method3006(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method2338();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2358(var6, 0, var5);
            field726[arg1] = var7;
            arg2.method30(var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = arg0.method2377();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2338();
            client.method136(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field790 = arg0.method2377();
            if (arg2.field790 == 65535) {
                arg2.field790 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field803 = arg0.method2492();
            if (arg2.field803.charAt(0) == '~') {
                arg2.field803 = arg2.field803.substring(1);
                class12.method2001(2, arg2.field38, arg2.field803);
            } else if (Statics.field119 == arg2) {
                class12.method2001(2, arg2.field38, arg2.field803);
            }
            arg2.field804 = false;
            arg2.field807 = 0;
            arg2.field808 = 0;
            arg2.field791 = 150;
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method2377();
            int var11 = arg0.method2338();
            arg2.method729(var10, var11, client.field347);
            arg2.field806 = client.field347 + 300;
            arg2.field813 = arg0.method2338();
            arg2.field814 = arg0.method2338();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field834 = arg0.method2377();
            if (arg2.field843 == 0) {
                arg2.field845 = arg2.field834;
                arg2.field834 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var12 = arg0.method2377();
            class152 var13 = (class152) class109.method2120(class152.method1476(), arg0.method2338());
            boolean var14 = arg0.method2338() == 1;
            int var15 = arg0.method2338();
            int var16 = arg0.field1977;
            if (arg2.field38 != null && arg2.field30 != null) {
                boolean var17 = false;
                if (var13.field2248 && client.method713(arg2.field38)) {
                    var17 = true;
                }
                if (!var17 && client.field396 == 0 && !arg2.field48) {
                    field736.field1977 = 0;
                    arg0.method2358(field736.field1981, 0, var15);
                    field736.field1977 = 0;
                    String var18 = class223.method3792(Statics.method2946(class222.method2579(field736)));
                    arg2.field803 = var18.trim();
                    arg2.field807 = var12 >> 8;
                    arg2.field808 = var12 & 0xFF;
                    arg2.field791 = 150;
                    arg2.field804 = var14;
                    arg2.field805 = Statics.field119 != arg2 && var13.field2248 && client.field494 != "" && var18.toLowerCase().indexOf(client.field494) == -1;
                    int var19;
                    if (var13.field2249) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field2246 == -1) {
                        class12.method2001(var19, arg2.field38, var18);
                    } else {
                        class12.method2001(var19, class2.method2220(var13.field2246) + arg2.field38, var18);
                    }
                }
            }
            arg0.field1977 = var15 + var16;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field810 = arg0.method2377();
            int var20 = arg0.method2343();
            arg2.field830 = var20 >> 16;
            arg2.field829 = (var20 & 0xFFFF) + client.field347;
            arg2.field839 = 0;
            arg2.field848 = 0;
            if (arg2.field829 > client.field347) {
                arg2.field839 = -1;
            }
            if (arg2.field810 == 65535) {
                arg2.field810 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field831 = arg0.method2330();
            arg2.field812 = arg0.method2330();
            arg2.field832 = arg0.method2330();
            arg2.field792 = arg0.method2330();
            arg2.field835 = arg0.method2377() + client.field347;
            arg2.field836 = arg0.method2377() + client.field347;
            arg2.field837 = arg0.method2377();
            if (arg2.field51 == -1) {
                arg2.field831 += arg2.field844[0];
                arg2.field812 += arg2.field809[0];
                arg2.field832 += arg2.field844[0];
                arg2.field792 += arg2.field809[0];
                arg2.field843 = 1;
            } else {
                arg2.field831 += arg2.field51;
                arg2.field812 += arg2.field50;
                arg2.field832 += arg2.field51;
                arg2.field792 += arg2.field50;
                arg2.field843 = 0;
            }
            arg2.field820 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            int var21 = arg0.method2377();
            int var22 = arg0.method2338();
            arg2.method729(var21, var22, client.field347);
            arg2.field806 = client.field347 + 300;
            arg2.field813 = arg0.method2338();
            arg2.field814 = arg0.method2338();
        }
        if ((arg3 & 0x200) != 0) {
            field725[arg1] = arg0.method2330();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2330();
        }
        if (arg2.field51 == -1) {
            return;
        }
        if (var4 == 127) {
            arg2.method20(arg2.field51, arg2.field50);
            return;
        }
        byte var23;
        if (var4 == -1) {
            var23 = field725[arg1];
        } else {
            var23 = var4;
        }
        arg2.method19(arg2.field51, arg2.field50, var23);
    }

    @ObfuscatedName("p.p(I)V")
    public static void method102() {
        field727 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field726[var0] = null;
            field725[var0] = 1;
        }
    }
}
