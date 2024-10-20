package deob;

@ObfuscatedName("am")
public class class35 {

    @ObfuscatedName("am.n")
    public static byte[] field760 = new byte[2048];

    @ObfuscatedName("am.t")
    public static byte[] field761 = new byte[2048];

    @ObfuscatedName("am.v")
    public static class123[] field762 = new class123[2048];

    @ObfuscatedName("am.b")
    public static int field764 = 0;

    @ObfuscatedName("am.m")
    public static int[] field759 = new int[2048];

    @ObfuscatedName("am.k")
    public static int field765 = 0;

    @ObfuscatedName("am.c")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("am.w")
    public static int[] field770 = new int[2048];

    @ObfuscatedName("am.l")
    public static int[] field768 = new int[2048];

    @ObfuscatedName("am.h")
    public static int[] field769 = new int[2048];

    @ObfuscatedName("am.i")
    public static int field772 = 0;

    @ObfuscatedName("am.u")
    public static int[] field776 = new int[2048];

    @ObfuscatedName("am.x")
    public static class123 field771 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.f(Ldl;I)V")
    public static final void method599(class126 arg0) {
        arg0.method2636();
        int var1 = client.field376;
        class3 var2 = Statics.field767 = client.field332[var1] = new class3();
        var2.field58 = var1;
        int var3 = arg0.method2637(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field872[0] = var5 - Statics.field713;
        var2.field864 = (var2.field872[0] << 7) + (var2.method41() << 6);
        var2.field837[0] = var6 - Statics.field138;
        var2.field818 = (var2.field837[0] << 7) + (var2.method41() << 6);
        Statics.field223 = var2.field42 = var4;
        if (field762[var1] != null) {
            var2.method19(field762[var1]);
        }
        field764 = 0;
        field759[++field764 - 1] = var1;
        field760[var1] = 0;
        field765 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2637(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field770[var7] = (var9 << 28) + (var10 << 14) + var11;
                field768[var7] = 0;
                field769[var7] = -1;
                field766[++field765 - 1] = var7;
                field760[var7] = 0;
            }
        }
        arg0.method2644();
    }

    @ObfuscatedName("ai.e(Ldl;II)V")
    public static final void method771(class126 arg0, int arg1) {
        int var2 = arg0.field2052;
        field772 = 0;
        method669(arg0);
        method2266(arg0);
        if (arg0.field2052 - var2 != arg1) {
            throw new RuntimeException(arg0.field2052 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ae.n(Ldl;B)V")
    public static final void method669(class126 arg0) {
        int var1 = 0;
        arg0.method2636();
        for (int var2 = 0; var2 < field764; var2++) {
            int var3 = field759[var2];
            if ((field760[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field760[var3] = (byte) (field760[var3] | 0x2);
                } else {
                    int var4 = arg0.method2637(1);
                    if (var4 == 0) {
                        var1 = method571(arg0);
                        field760[var3] = (byte) (field760[var3] | 0x2);
                    } else {
                        method2103(arg0, var3);
                    }
                }
            }
        }
        arg0.method2644();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2636();
        for (int var5 = 0; var5 < field764; var5++) {
            int var6 = field759[var5];
            if ((field760[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field760[var6] = (byte) (field760[var6] | 0x2);
                } else {
                    int var7 = arg0.method2637(1);
                    if (var7 == 0) {
                        var1 = method571(arg0);
                        field760[var6] = (byte) (field760[var6] | 0x2);
                    } else {
                        method2103(arg0, var6);
                    }
                }
            }
        }
        arg0.method2644();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2636();
        for (int var8 = 0; var8 < field765; var8++) {
            int var9 = field766[var8];
            if ((field760[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field760[var9] = (byte) (field760[var9] | 0x2);
                } else {
                    int var10 = arg0.method2637(1);
                    if (var10 == 0) {
                        var1 = method571(arg0);
                        field760[var9] = (byte) (field760[var9] | 0x2);
                    } else if (method46(arg0, var9)) {
                        field760[var9] = (byte) (field760[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2644();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2636();
        for (int var11 = 0; var11 < field765; var11++) {
            int var12 = field766[var11];
            if ((field760[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field760[var12] = (byte) (field760[var12] | 0x2);
                } else {
                    int var13 = arg0.method2637(1);
                    if (var13 == 0) {
                        var1 = method571(arg0);
                        field760[var12] = (byte) (field760[var12] | 0x2);
                    } else if (method46(arg0, var12)) {
                        field760[var12] = (byte) (field760[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2644();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field764 = 0;
        field765 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field760[var14] = (byte) (field760[var14] >> 1);
            class3 var15 = client.field332[var14];
            if (var15 == null) {
                field766[++field765 - 1] = var14;
            } else {
                field759[++field764 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("z.t(Ldl;B)I")
    public static int method571(class126 arg0) {
        int var1 = arg0.method2637(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2637(5);
        } else if (var1 == 2) {
            var2 = arg0.method2637(8);
        } else {
            var2 = arg0.method2637(11);
        }
        return var2;
    }

    @ObfuscatedName("cf.v(Ldl;IB)V")
    public static void method2103(class126 arg0, int arg1) {
        boolean var2 = arg0.method2637(1) == 1;
        if (var2) {
            field776[++field772 - 1] = arg1;
        }
        int var3 = arg0.method2637(2);
        class3 var4 = client.field332[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field55 = false;
            } else if (client.field376 == arg1) {
                throw new RuntimeException();
            } else {
                field770[arg1] = (Statics.field138 + var4.field837[0] >> 6) + (Statics.field713 + var4.field872[0] >> 6 << 14) + (var4.field42 << 28);
                if (var4.field845 == -1) {
                    field768[arg1] = var4.field874;
                } else {
                    field768[arg1] = var4.field845;
                }
                field769[arg1] = var4.field846;
                client.field332[arg1] = null;
                if (arg0.method2637(1) != 0) {
                    method46(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2637(3);
            int var6 = var4.field872[0];
            int var7 = var4.field837[0];
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
            if (client.field376 == arg1 && var4.field864 < 1536 || var4.field818 < 1536 || var4.field864 >= 11776 || var4.field818 >= 11776) {
                var4.method23(var6, var7);
                var4.field55 = false;
            } else if (var2) {
                var4.field55 = true;
                var4.field37 = var6;
                var4.field49 = var7;
            } else {
                var4.field55 = false;
                var4.method22(var6, var7, field761[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2637(4);
            int var9 = var4.field872[0];
            int var10 = var4.field837[0];
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
            if (client.field376 == arg1 && var4.field864 < 1536 || var4.field818 < 1536 || var4.field864 >= 11776 || var4.field818 >= 11776) {
                var4.method23(var9, var10);
                var4.field55 = false;
            } else if (var2) {
                var4.field55 = true;
                var4.field37 = var9;
                var4.field49 = var10;
            } else {
                var4.field55 = false;
                var4.method22(var9, var10, field761[arg1]);
            }
        } else {
            int var11 = arg0.method2637(1);
            if (var11 == 0) {
                int var12 = arg0.method2637(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field872[0] + var14;
                int var17 = var4.field837[0] + var15;
                if (client.field376 == arg1 && var4.field864 < 1536 || var4.field818 < 1536 || var4.field864 >= 11776 || var4.field818 >= 11776) {
                    var4.method23(var16, var17);
                    var4.field55 = false;
                } else if (var2) {
                    var4.field55 = true;
                    var4.field37 = var16;
                    var4.field49 = var17;
                } else {
                    var4.field55 = false;
                    var4.method22(var16, var17, field761[arg1]);
                }
                var4.field42 = (byte) (var4.field42 + var13 & 0x3);
                if (client.field376 == arg1) {
                    Statics.field223 = var4.field42;
                }
            } else {
                int var18 = arg0.method2637(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field713 + var4.field872[0] + var20 & 0x3FFF) - Statics.field713;
                int var23 = (Statics.field138 + var4.field837[0] + var21 & 0x3FFF) - Statics.field138;
                if (client.field376 == arg1 && var4.field864 < 1536 || var4.field818 < 1536 || var4.field864 >= 11776 || var4.field818 >= 11776) {
                    var4.method23(var22, var23);
                    var4.field55 = false;
                } else if (var2) {
                    var4.field55 = true;
                    var4.field37 = var22;
                    var4.field49 = var23;
                } else {
                    var4.field55 = false;
                    var4.method22(var22, var23, field761[arg1]);
                }
                var4.field42 = (byte) (var4.field42 + var19 & 0x3);
                if (client.field376 == arg1) {
                    Statics.field223 = var4.field42;
                }
            }
        }
    }

    @ObfuscatedName("t.b(Ldl;IB)Z")
    public static boolean method46(class126 arg0, int arg1) {
        int var2 = arg0.method2637(2);
        if (var2 == 0) {
            if (arg0.method2637(1) != 0) {
                method46(arg0, arg1);
            }
            int var3 = arg0.method2637(6);
            int var4 = arg0.method2637(6);
            boolean var5 = arg0.method2637(1) == 1;
            if (var5) {
                field776[++field772 - 1] = arg1;
            }
            if (client.field332[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field332[arg1] = new class3();
            var6.field58 = arg1;
            if (field762[arg1] != null) {
                var6.method19(field762[arg1]);
            }
            var6.field874 = field768[arg1];
            var6.field846 = field769[arg1];
            int var7 = field770[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field858[0] = field761[arg1];
            var6.field42 = (byte) var8;
            var6.method23((var9 << 6) + var3 - Statics.field713, (var10 << 6) + var4 - Statics.field138);
            var6.field55 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2637(2);
            int var12 = field770[arg1];
            field770[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2637(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field770[arg1];
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
            field770[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2637(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field770[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field770[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("dc.m(Ldl;I)V")
    public static final void method2266(class126 arg0) {
        for (int var1 = 0; var1 < field772; var1++) {
            int var2 = field776[var1];
            class3 var3 = client.field332[var2];
            int var4 = arg0.method2522();
            if ((var4 & 0x1) != 0) {
                var4 += arg0.method2522() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x8) != 0) {
                int var6 = arg0.method2522();
                byte[] var7 = new byte[var6];
                class123 var8 = new class123(var7);
                arg0.method2564(var7, 0, var6);
                field762[var2] = var8;
                var3.method19(var8);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = arg0.method2401();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2522();
                client.method3382(var3, var9, var10);
            }
            if ((var4 & 0x20) != 0) {
                var3.field846 = arg0.method2401();
                if (var3.field846 == 65535) {
                    var3.field846 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field830 = arg0.method2407();
                if (var3.field830.charAt(0) == '~') {
                    var3.field830 = var3.field830.substring(1);
                    class12.method3563(2, var3.field56, var3.field830);
                } else if (Statics.field767 == var3) {
                    class12.method3563(2, var3.field56, var3.field830);
                }
                var3.field831 = false;
                var3.field817 = 0;
                var3.field835 = 0;
                var3.field833 = 150;
            }
            if ((var4 & 0x4) != 0) {
                int var11 = arg0.method2522();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2412();
                        if (var16 == 32767) {
                            var16 = arg0.method2412();
                            var14 = arg0.method2412();
                            var13 = arg0.method2412();
                            var15 = arg0.method2412();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2412();
                        }
                        int var17 = arg0.method2412();
                        var3.method752(var16, var14, var13, var15, client.field291, var17);
                    }
                }
                int var18 = arg0.method2522();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2412();
                        int var21 = arg0.method2412();
                        if (var21 == 32767) {
                            var3.method750(var20);
                        } else {
                            int var22 = arg0.method2412();
                            int var23 = arg0.method2522();
                            int var24 = var21 > 0 ? arg0.method2522() : var23;
                            var3.method753(var20, client.field291, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field845 = arg0.method2401();
                if (var3.field868 == 0) {
                    var3.field874 = var3.field845;
                    var3.field845 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var25 = arg0.method2401();
                class156 var26 = (class156) class113.method3065(class156.method2995(), arg0.method2522());
                boolean var27 = arg0.method2522() == 1;
                int var28 = arg0.method2522();
                int var29 = arg0.field2052;
                if (var3.field56 != null && var3.field32 != null) {
                    boolean var30 = false;
                    if (var26.field2314 && client.method102(var3.field56)) {
                        var30 = true;
                    }
                    if (!var30 && client.field402 == 0 && !var3.field53) {
                        field771.field2052 = 0;
                        arg0.method2564(field771.field2053, 0, var28);
                        field771.field2052 = 0;
                        String var31 = class227.method3926(class167.method670(class226.method3553(field771)));
                        var3.field830 = var31.trim();
                        var3.field817 = var25 >> 8;
                        var3.field835 = var25 & 0xFF;
                        var3.field833 = 150;
                        var3.field831 = var27;
                        var3.field832 = Statics.field767 != var3 && var26.field2314 && client.field500 != "" && var31.toLowerCase().indexOf(client.field500) == -1;
                        int var32;
                        if (var26.field2313) {
                            var32 = var27 ? 91 : 1;
                        } else {
                            var32 = var27 ? 90 : 2;
                        }
                        if (var26.field2312 == -1) {
                            class12.method3563(var32, var3.field56, var31);
                        } else {
                            class12.method3563(var32, class2.method2342(var26.field2312) + var3.field56, var31);
                        }
                    }
                }
                arg0.field2052 = var28 + var29;
            }
            if ((var4 & 0x200) != 0) {
                var3.field854 = arg0.method2401();
                int var33 = arg0.method2404();
                var3.field861 = var33 >> 16;
                var3.field847 = (var33 & 0xFFFF) + client.field291;
                var3.field836 = 0;
                var3.field856 = 0;
                if (var3.field847 > client.field291) {
                    var3.field836 = -1;
                }
                if (var3.field854 == 65535) {
                    var3.field854 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field859 = arg0.method2400();
                var3.field841 = arg0.method2400();
                var3.field860 = arg0.method2400();
                var3.field862 = arg0.method2400();
                var3.field867 = arg0.method2401() + client.field291;
                var3.field842 = arg0.method2401() + client.field291;
                var3.field865 = arg0.method2401();
                if (var3.field55) {
                    var3.field859 += var3.field37;
                    var3.field841 += var3.field49;
                    var3.field860 += var3.field37;
                    var3.field862 += var3.field49;
                    var3.field868 = 0;
                } else {
                    var3.field859 += var3.field872[0];
                    var3.field841 += var3.field837[0];
                    var3.field860 += var3.field872[0];
                    var3.field862 += var3.field837[0];
                    var3.field868 = 1;
                }
                var3.field876 = 0;
            }
            if ((var4 & 0x800) != 0) {
                field761[var2] = arg0.method2400();
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method2400();
            }
            if ((var4 & 0x400) != 0) {
                for (int var34 = 0; var34 < 3; var34++) {
                    var3.field36[var34] = arg0.method2407();
                }
            }
            if (var3.field55) {
                if (var5 == 127) {
                    var3.method23(var3.field37, var3.field49);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field761[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method22(var3.field37, var3.field49, var35);
                }
            }
        }
    }

    @ObfuscatedName("i.k(I)V")
    public static void method142() {
        field764 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field762[var0] = null;
            field761[var0] = 1;
        }
    }
}
