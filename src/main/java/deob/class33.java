package deob;

@ObfuscatedName("ay")
public class class33 {

    @ObfuscatedName("ay.m")
    public static byte[] field735 = new byte[2048];

    @ObfuscatedName("ay.z")
    public static byte[] field736 = new byte[2048];

    @ObfuscatedName("ay.x")
    public static class120[] field737 = new class120[2048];

    @ObfuscatedName("ay.e")
    public static int field738 = 0;

    @ObfuscatedName("ay.i")
    public static int[] field739 = new int[2048];

    @ObfuscatedName("ay.c")
    public static int field740 = 0;

    @ObfuscatedName("ay.n")
    public static int[] field741 = new int[2048];

    @ObfuscatedName("ay.l")
    public static int[] field742 = new int[2048];

    @ObfuscatedName("ay.u")
    public static int[] field743 = new int[2048];

    @ObfuscatedName("ay.r")
    public static int[] field744 = new int[2048];

    @ObfuscatedName("ay.a")
    public static int field734 = 0;

    @ObfuscatedName("ay.d")
    public static int[] field746 = new int[2048];

    @ObfuscatedName("ay.p")
    public static class120 field733 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.j(Ldc;I)V")
    public static final void method42(class123 arg0) {
        arg0.method2597();
        int var1 = client.field398;
        class3 var2 = Statics.field1054 = client.field397[var1] = new class3();
        var2.field53 = var1;
        int var3 = arg0.method2598(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field849[0] = var5 - Statics.field3015;
        var2.field817 = (var2.field849[0] << 7) + (var2.method11() << 6);
        var2.field823[0] = var6 - Statics.field13;
        var2.field841 = (var2.field823[0] << 7) + (var2.method11() << 6);
        Statics.field656 = var2.field58 = var4;
        if (field737[var1] != null) {
            var2.method9(field737[var1]);
        }
        field738 = 0;
        field739[++field738 - 1] = var1;
        field735[var1] = 0;
        field740 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2598(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field742[var7] = (var9 << 28) + (var10 << 14) + var11;
                field743[var7] = 0;
                field744[var7] = -1;
                field741[++field740 - 1] = var7;
                field735[var7] = 0;
            }
        }
        arg0.method2594();
    }

    @ObfuscatedName("al.h(Ldc;II)V")
    public static final void method989(class123 arg0, int arg1) {
        int var2 = arg0.field1972;
        field734 = 0;
        method2635(arg0);
        for (int var3 = 0; var3 < field734; var3++) {
            int var4 = field746[var3];
            class3 var5 = client.field397[var4];
            int var6 = arg0.method2361();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2361() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x80) != 0) {
                int var8 = arg0.method2361();
                byte[] var9 = new byte[var8];
                class120 var10 = new class120(var9);
                arg0.method2372(var9, 0, var8);
                field737[var4] = var10;
                var5.method9(var10);
            }
            if ((var6 & 0x8) != 0) {
                int var11 = arg0.method2363();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method2361();
                client.method31(var5, var11, var12);
            }
            if ((var6 & 0x2) != 0) {
                var5.field820 = arg0.method2363();
                if (var5.field820 == 65535) {
                    var5.field820 = -1;
                }
            }
            if ((var6 & 0x1) != 0) {
                var5.field808 = arg0.method2369();
                if (var5.field808.charAt(0) == '~') {
                    var5.field808 = var5.field808.substring(1);
                    class12.method108(2, var5.field59, var5.field808);
                } else if (Statics.field1054 == var5) {
                    class12.method108(2, var5.field59, var5.field808);
                }
                var5.field847 = false;
                var5.field812 = 0;
                var5.field806 = 0;
                var5.field811 = 150;
            }
            if ((var6 & 0x4) != 0) {
                int var13 = arg0.method2363();
                int var14 = arg0.method2361();
                var5.method731(var13, var14, client.field286);
                var5.field829 = client.field286 + 300;
                var5.field818 = arg0.method2361();
                var5.field819 = arg0.method2361();
            }
            if ((var6 & 0x40) != 0) {
                var5.field822 = arg0.method2363();
                if (var5.field821 == 0) {
                    var5.field845 = var5.field822;
                    var5.field822 = -1;
                }
            }
            if ((var6 & 0x10) != 0) {
                int var15 = arg0.method2363();
                class153 var16 = (class153) class110.method2153(class153.method3117(), arg0.method2361());
                boolean var17 = arg0.method2361() == 1;
                int var18 = arg0.method2361();
                int var19 = arg0.field1972;
                if (var5.field59 != null && var5.field37 != null) {
                    boolean var20 = false;
                    if (var16.field2254 && client.method197(var5.field59)) {
                        var20 = true;
                    }
                    if (!var20 && client.field396 == 0 && !var5.field57) {
                        field733.field1972 = 0;
                        arg0.method2372(field733.field1974, 0, var18);
                        field733.field1972 = 0;
                        class120 var21 = field733;
                        String var25;
                        try {
                            int var22 = var21.method2373();
                            if (var22 > 32767) {
                                var22 = 32767;
                            }
                            byte[] var23 = new byte[var22];
                            var21.field1972 += Statics.field2645.method2286(var21.field1974, var21.field1972, var23, 0, var22);
                            String var24 = class166.method2767(var23, 0, var22);
                            var25 = var24;
                        } catch (Exception var35) {
                            var25 = "Cabbage";
                        }
                        String var28 = class224.method3761(class164.method552(var25));
                        var5.field808 = var28.trim();
                        var5.field812 = var15 >> 8;
                        var5.field806 = var15 & 0xFF;
                        var5.field811 = 150;
                        var5.field847 = var17;
                        var5.field831 = Statics.field1054 != var5 && var16.field2254 && client.field482 != "" && var28.toLowerCase().indexOf(client.field482) == -1;
                        int var29;
                        if (var16.field2253) {
                            var29 = var17 ? 91 : 1;
                        } else {
                            var29 = var17 ? 90 : 2;
                        }
                        if (var16.field2252 == -1) {
                            class12.method108(var29, var5.field59, var28);
                        } else {
                            class12.method108(var29, class2.method105(var16.field2252) + var5.field59, var28);
                        }
                    }
                }
                arg0.field1972 = var18 + var19;
            }
            if ((var6 & 0x100) != 0) {
                var5.field857 = arg0.method2363();
                int var30 = arg0.method2366();
                var5.field835 = var30 >> 16;
                var5.field834 = (var30 & 0xFFFF) + client.field286;
                var5.field832 = 0;
                var5.field833 = 0;
                if (var5.field834 > client.field286) {
                    var5.field832 = -1;
                }
                if (var5.field857 == 65535) {
                    var5.field857 = -1;
                }
            }
            if ((var6 & 0x400) != 0) {
                var5.field836 = arg0.method2531();
                var5.field838 = arg0.method2531();
                var5.field814 = arg0.method2531();
                var5.field839 = arg0.method2531();
                var5.field840 = arg0.method2363() + client.field286;
                var5.field802 = arg0.method2363() + client.field286;
                var5.field842 = arg0.method2363();
                if (var5.field60) {
                    var5.field836 += var5.field61;
                    var5.field838 += var5.field52;
                    var5.field814 += var5.field61;
                    var5.field839 += var5.field52;
                    var5.field821 = 0;
                } else {
                    var5.field836 += var5.field849[0];
                    var5.field838 += var5.field823[0];
                    var5.field814 += var5.field849[0];
                    var5.field839 += var5.field823[0];
                    var5.field821 = 1;
                }
                var5.field853 = 0;
            }
            if ((var6 & 0x800) != 0) {
                int var31 = arg0.method2363();
                int var32 = arg0.method2361();
                var5.method731(var31, var32, client.field286);
                var5.field829 = client.field286 + 300;
                var5.field818 = arg0.method2361();
                var5.field819 = arg0.method2361();
            }
            if ((var6 & 0x200) != 0) {
                field736[var4] = arg0.method2531();
            }
            if ((var6 & 0x1000) != 0) {
                var7 = arg0.method2531();
            }
            if ((var6 & 0x2000) != 0) {
                for (int var33 = 0; var33 < 3; var33++) {
                    var5.field62[var33] = arg0.method2369();
                }
            }
            if (var5.field60) {
                if (var7 == 127) {
                    var5.method14(var5.field61, var5.field52);
                } else {
                    byte var34;
                    if (var7 == -1) {
                        var34 = field736[var4];
                    } else {
                        var34 = var7;
                    }
                    var5.method27(var5.field61, var5.field52, var34);
                }
            }
        }
        if (arg0.field1972 - var2 != arg1) {
            throw new RuntimeException(arg0.field1972 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("dd.m(Ldc;I)V")
    public static final void method2635(class123 arg0) {
        int var1 = 0;
        arg0.method2597();
        for (int var2 = 0; var2 < field738; var2++) {
            int var3 = field739[var2];
            if ((field735[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field735[var3] = (byte) (field735[var3] | 0x2);
                } else {
                    int var4 = arg0.method2598(1);
                    if (var4 == 0) {
                        var1 = method554(arg0);
                        field735[var3] = (byte) (field735[var3] | 0x2);
                    } else {
                        method185(arg0, var3);
                    }
                }
            }
        }
        arg0.method2594();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2597();
        for (int var5 = 0; var5 < field738; var5++) {
            int var6 = field739[var5];
            if ((field735[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field735[var6] = (byte) (field735[var6] | 0x2);
                } else {
                    int var7 = arg0.method2598(1);
                    if (var7 == 0) {
                        var1 = method554(arg0);
                        field735[var6] = (byte) (field735[var6] | 0x2);
                    } else {
                        method185(arg0, var6);
                    }
                }
            }
        }
        arg0.method2594();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2597();
        for (int var8 = 0; var8 < field740; var8++) {
            int var9 = field741[var8];
            if ((field735[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field735[var9] = (byte) (field735[var9] | 0x2);
                } else {
                    int var10 = arg0.method2598(1);
                    if (var10 == 0) {
                        var1 = method554(arg0);
                        field735[var9] = (byte) (field735[var9] | 0x2);
                    } else if (method1780(arg0, var9)) {
                        field735[var9] = (byte) (field735[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2594();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2597();
        for (int var11 = 0; var11 < field740; var11++) {
            int var12 = field741[var11];
            if ((field735[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field735[var12] = (byte) (field735[var12] | 0x2);
                } else {
                    int var13 = arg0.method2598(1);
                    if (var13 == 0) {
                        var1 = method554(arg0);
                        field735[var12] = (byte) (field735[var12] | 0x2);
                    } else if (method1780(arg0, var12)) {
                        field735[var12] = (byte) (field735[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2594();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field738 = 0;
        field740 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field735[var14] = (byte) (field735[var14] >> 1);
            class3 var15 = client.field397[var14];
            if (var15 == null) {
                field741[++field740 - 1] = var14;
            } else {
                field739[++field738 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("g.z(Ldc;I)I")
    public static int method554(class123 arg0) {
        int var1 = arg0.method2598(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2598(5);
        } else if (var1 == 2) {
            var2 = arg0.method2598(8);
        } else {
            var2 = arg0.method2598(11);
        }
        return var2;
    }

    @ObfuscatedName("t.x(Ldc;II)V")
    public static void method185(class123 arg0, int arg1) {
        boolean var2 = arg0.method2598(1) == 1;
        if (var2) {
            field746[++field734 - 1] = arg1;
        }
        int var3 = arg0.method2598(2);
        class3 var4 = client.field397[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field60 = false;
            } else if (client.field398 == arg1) {
                throw new RuntimeException();
            } else {
                field742[arg1] = (Statics.field13 + var4.field823[0] >> 6) + (Statics.field3015 + var4.field849[0] >> 6 << 14) + (var4.field58 << 28);
                if (var4.field822 == -1) {
                    field743[arg1] = var4.field845;
                } else {
                    field743[arg1] = var4.field822;
                }
                field744[arg1] = var4.field820;
                client.field397[arg1] = null;
                if (arg0.method2598(1) != 0) {
                    method1780(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2598(3);
            int var6 = var4.field849[0];
            int var7 = var4.field823[0];
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
            if (client.field398 == arg1 && var4.field817 < 1536 || var4.field841 < 1536 || var4.field817 >= 11776 || var4.field841 >= 11776) {
                var4.method14(var6, var7);
                var4.field60 = false;
            } else if (var2) {
                var4.field60 = true;
                var4.field61 = var6;
                var4.field52 = var7;
            } else {
                var4.field60 = false;
                var4.method27(var6, var7, field736[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2598(4);
            int var9 = var4.field849[0];
            int var10 = var4.field823[0];
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
            if (client.field398 == arg1 && var4.field817 < 1536 || var4.field841 < 1536 || var4.field817 >= 11776 || var4.field841 >= 11776) {
                var4.method14(var9, var10);
                var4.field60 = false;
            } else if (var2) {
                var4.field60 = true;
                var4.field61 = var9;
                var4.field52 = var10;
            } else {
                var4.field60 = false;
                var4.method27(var9, var10, field736[arg1]);
            }
        } else {
            int var11 = arg0.method2598(1);
            if (var11 == 0) {
                int var12 = arg0.method2598(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field849[0] + var14;
                int var17 = var4.field823[0] + var15;
                if (client.field398 == arg1 && var4.field817 < 1536 || var4.field841 < 1536 || var4.field817 >= 11776 || var4.field841 >= 11776) {
                    var4.method14(var16, var17);
                    var4.field60 = false;
                } else if (var2) {
                    var4.field60 = true;
                    var4.field61 = var16;
                    var4.field52 = var17;
                } else {
                    var4.field60 = false;
                    var4.method27(var16, var17, field736[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var13 & 0x3);
                if (client.field398 == arg1) {
                    Statics.field656 = var4.field58;
                }
            } else {
                int var18 = arg0.method2598(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3015 + var4.field849[0] + var20 & 0x3FFF) - Statics.field3015;
                int var23 = (Statics.field13 + var4.field823[0] + var21 & 0x3FFF) - Statics.field13;
                if (client.field398 == arg1 && var4.field817 < 1536 || var4.field841 < 1536 || var4.field817 >= 11776 || var4.field841 >= 11776) {
                    var4.method14(var22, var23);
                    var4.field60 = false;
                } else if (var2) {
                    var4.field60 = true;
                    var4.field61 = var22;
                    var4.field52 = var23;
                } else {
                    var4.field60 = false;
                    var4.method27(var22, var23, field736[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var19 & 0x3);
                if (client.field398 == arg1) {
                    Statics.field656 = var4.field58;
                }
            }
        }
    }

    @ObfuscatedName("ck.e(Ldc;II)Z")
    public static boolean method1780(class123 arg0, int arg1) {
        int var2 = arg0.method2598(2);
        if (var2 == 0) {
            if (arg0.method2598(1) != 0) {
                method1780(arg0, arg1);
            }
            int var3 = arg0.method2598(6);
            int var4 = arg0.method2598(6);
            boolean var5 = arg0.method2598(1) == 1;
            if (var5) {
                field746[++field734 - 1] = arg1;
            }
            if (client.field397[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field397[arg1] = new class3();
            var6.field53 = arg1;
            if (field737[arg1] != null) {
                var6.method9(field737[arg1]);
            }
            var6.field845 = field743[arg1];
            var6.field820 = field744[arg1];
            int var7 = field742[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field851[0] = field736[arg1];
            var6.field58 = (byte) var8;
            var6.method14((var9 << 6) + var3 - Statics.field3015, (var10 << 6) + var4 - Statics.field13);
            var6.field60 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2598(2);
            int var12 = field742[arg1];
            field742[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2598(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field742[arg1];
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
            field742[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2598(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field742[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field742[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
