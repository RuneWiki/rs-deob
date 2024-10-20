package deob;

@ObfuscatedName("av")
public class class33 {

    @ObfuscatedName("av.t")
    public static byte[] field748 = new byte[2048];

    @ObfuscatedName("av.p")
    public static byte[] field755 = new byte[2048];

    @ObfuscatedName("av.e")
    public static class120[] field750 = new class120[2048];

    @ObfuscatedName("av.y")
    public static String[] field751 = new String[2048];

    @ObfuscatedName("av.m")
    public static int field752 = 0;

    @ObfuscatedName("av.c")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("av.v")
    public static int field754 = 0;

    @ObfuscatedName("av.l")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("av.z")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("av.s")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("av.j")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("av.q")
    public static int field759 = 0;

    @ObfuscatedName("av.a")
    public static int[] field749 = new int[2048];

    @ObfuscatedName("av.d")
    public static class120 field761 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.w(Lds;I)V")
    public static final void method1767(class123 arg0) {
        arg0.method2605();
        int var1 = client.field417;
        class3 var2 = Statics.field2693 = client.field416[var1] = new class3();
        var2.field61 = var1;
        int var3 = arg0.method2634(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field873[0] = var5 - Statics.field991;
        var2.field850 = (var2.field873[0] << 7) + (var2.method16() << 6);
        var2.field874[0] = var6 - Statics.field38;
        var2.field820 = (var2.field874[0] << 7) + (var2.method16() << 6);
        Statics.field1438 = var2.field63 = var4;
        if (field750[var1] != null) {
            var2.method23(field750[var1]);
        }
        if (field751[var1] != null) {
            var2.field60 = field751[var1];
        }
        field752 = 0;
        field758[++field752 - 1] = var1;
        field748[var1] = 0;
        field754 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2634(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field765[var7] = (var9 << 28) + (var10 << 14) + var11;
                field762[var7] = 0;
                field756[var7] = -1;
                field760[++field754 - 1] = var7;
                field748[var7] = 0;
            }
        }
        arg0.method2609();
    }

    @ObfuscatedName("af.x(Lds;IB)V")
    public static final void method643(class123 arg0, int arg1) {
        int var2 = arg0.field2012;
        field759 = 0;
        int var3 = 0;
        arg0.method2605();
        for (int var4 = 0; var4 < field752; var4++) {
            int var5 = field758[var4];
            if ((field748[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field748[var5] = (byte) (field748[var5] | 0x2);
                } else {
                    int var6 = arg0.method2634(1);
                    if (var6 == 0) {
                        var3 = method2731(arg0);
                        field748[var5] = (byte) (field748[var5] | 0x2);
                    } else {
                        method2296(arg0, var5);
                    }
                }
            }
        }
        arg0.method2609();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2605();
        for (int var7 = 0; var7 < field752; var7++) {
            int var8 = field758[var7];
            if ((field748[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field748[var8] = (byte) (field748[var8] | 0x2);
                } else {
                    int var9 = arg0.method2634(1);
                    if (var9 == 0) {
                        var3 = method2731(arg0);
                        field748[var8] = (byte) (field748[var8] | 0x2);
                    } else {
                        method2296(arg0, var8);
                    }
                }
            }
        }
        arg0.method2609();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2605();
        for (int var10 = 0; var10 < field754; var10++) {
            int var11 = field760[var10];
            if ((field748[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field748[var11] = (byte) (field748[var11] | 0x2);
                } else {
                    int var12 = arg0.method2634(1);
                    if (var12 == 0) {
                        var3 = method2731(arg0);
                        field748[var11] = (byte) (field748[var11] | 0x2);
                    } else if (method163(arg0, var11)) {
                        field748[var11] = (byte) (field748[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2609();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2605();
        for (int var13 = 0; var13 < field754; var13++) {
            int var14 = field760[var13];
            if ((field748[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field748[var14] = (byte) (field748[var14] | 0x2);
                } else {
                    int var15 = arg0.method2634(1);
                    if (var15 == 0) {
                        var3 = method2731(arg0);
                        field748[var14] = (byte) (field748[var14] | 0x2);
                    } else if (method163(arg0, var14)) {
                        field748[var14] = (byte) (field748[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2609();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field752 = 0;
        field754 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field748[var16] = (byte) (field748[var16] >> 1);
            class3 var17 = client.field416[var16];
            if (var17 == null) {
                field760[++field754 - 1] = var16;
            } else {
                field758[++field752 - 1] = var16;
            }
        }
        method1478(arg0);
        if (arg0.field2012 - var2 != arg1) {
            throw new RuntimeException(arg0.field2012 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ep.t(Lds;I)I")
    public static int method2731(class123 arg0) {
        int var1 = arg0.method2634(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2634(5);
        } else if (var1 == 2) {
            var2 = arg0.method2634(8);
        } else {
            var2 = arg0.method2634(11);
        }
        return var2;
    }

    @ObfuscatedName("dq.p(Lds;IB)V")
    public static void method2296(class123 arg0, int arg1) {
        boolean var2 = arg0.method2634(1) == 1;
        if (var2) {
            field749[++field759 - 1] = arg1;
        }
        int var3 = arg0.method2634(2);
        class3 var4 = client.field416[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field62 = false;
            } else if (client.field417 == arg1) {
                throw new RuntimeException();
            } else {
                field765[arg1] = (Statics.field38 + var4.field874[0] >> 6) + (Statics.field991 + var4.field873[0] >> 6 << 14) + (var4.field63 << 28);
                if (var4.field877 == -1) {
                    field762[arg1] = var4.field848;
                } else {
                    field762[arg1] = var4.field877;
                }
                field756[arg1] = var4.field852;
                client.field416[arg1] = null;
                if (arg0.method2634(1) != 0) {
                    method163(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2634(3);
            int var6 = var4.field873[0];
            int var7 = var4.field874[0];
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
            if (client.field417 == arg1 && var4.field850 < 1536 || var4.field820 < 1536 || var4.field850 >= 11776 || var4.field820 >= 11776) {
                var4.method18(var6, var7);
                var4.field62 = false;
            } else if (var2) {
                var4.field62 = true;
                var4.field59 = var6;
                var4.field64 = var7;
            } else {
                var4.field62 = false;
                var4.method17(var6, var7, field755[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2634(4);
            int var9 = var4.field873[0];
            int var10 = var4.field874[0];
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
            if (client.field417 == arg1 && var4.field850 < 1536 || var4.field820 < 1536 || var4.field850 >= 11776 || var4.field820 >= 11776) {
                var4.method18(var9, var10);
                var4.field62 = false;
            } else if (var2) {
                var4.field62 = true;
                var4.field59 = var9;
                var4.field64 = var10;
            } else {
                var4.field62 = false;
                var4.method17(var9, var10, field755[arg1]);
            }
        } else {
            int var11 = arg0.method2634(1);
            if (var11 == 0) {
                int var12 = arg0.method2634(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field873[0] + var14;
                int var17 = var4.field874[0] + var15;
                if (client.field417 == arg1 && var4.field850 < 1536 || var4.field820 < 1536 || var4.field850 >= 11776 || var4.field820 >= 11776) {
                    var4.method18(var16, var17);
                    var4.field62 = false;
                } else if (var2) {
                    var4.field62 = true;
                    var4.field59 = var16;
                    var4.field64 = var17;
                } else {
                    var4.field62 = false;
                    var4.method17(var16, var17, field755[arg1]);
                }
                var4.field63 = (byte) (var4.field63 + var13 & 0x3);
                if (client.field417 == arg1) {
                    Statics.field1438 = var4.field63;
                }
            } else {
                int var18 = arg0.method2634(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field991 + var4.field873[0] + var20 & 0x3FFF) - Statics.field991;
                int var23 = (Statics.field38 + var4.field874[0] + var21 & 0x3FFF) - Statics.field38;
                if (client.field417 == arg1 && var4.field850 < 1536 || var4.field820 < 1536 || var4.field850 >= 11776 || var4.field820 >= 11776) {
                    var4.method18(var22, var23);
                    var4.field62 = false;
                } else if (var2) {
                    var4.field62 = true;
                    var4.field59 = var22;
                    var4.field64 = var23;
                } else {
                    var4.field62 = false;
                    var4.method17(var22, var23, field755[arg1]);
                }
                var4.field63 = (byte) (var4.field63 + var19 & 0x3);
                if (client.field417 == arg1) {
                    Statics.field1438 = var4.field63;
                }
            }
        }
    }

    @ObfuscatedName("a.e(Lds;II)Z")
    public static boolean method163(class123 arg0, int arg1) {
        int var2 = arg0.method2634(2);
        if (var2 == 0) {
            if (arg0.method2634(1) != 0) {
                method163(arg0, arg1);
            }
            int var3 = arg0.method2634(6);
            int var4 = arg0.method2634(6);
            boolean var5 = arg0.method2634(1) == 1;
            if (var5) {
                field749[++field759 - 1] = arg1;
            }
            if (client.field416[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field416[arg1] = new class3();
            var6.field61 = arg1;
            if (field750[arg1] != null) {
                var6.method23(field750[arg1]);
            }
            if (field751[arg1] != null) {
                var6.field60 = field751[arg1];
            }
            var6.field848 = field762[arg1];
            var6.field852 = field756[arg1];
            int var7 = field765[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field875[0] = field755[arg1];
            var6.field63 = (byte) var8;
            var6.method18((var9 << 6) + var3 - Statics.field991, (var10 << 6) + var4 - Statics.field38);
            var6.field62 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2634(2);
            int var12 = field765[arg1];
            field765[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2634(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field765[arg1];
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
            field765[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2634(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field765[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field765[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bv.y(Lds;I)V")
    public static final void method1478(class123 arg0) {
        for (int var1 = 0; var1 < field759; var1++) {
            int var2 = field749[var1];
            class3 var3 = client.field416[var2];
            int var4 = arg0.method2363();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2363() << 8;
            }
            method740(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ae.m(Lds;ILt;II)V")
    public static final void method740(class123 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method2363();
            byte[] var6 = new byte[var5];
            class120 var7 = new class120(var6);
            arg0.method2388(var6, 0, var5);
            field750[arg1] = var7;
            arg2.method23(var7);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field60 = arg0.method2540();
            field751[arg1] = arg2.field60;
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2365();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2363();
            client.method183(arg2, var8, var9);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field852 = arg0.method2365();
            if (arg2.field852 == 65535) {
                arg2.field852 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field832 = arg0.method2540();
            if (arg2.field832.charAt(0) == '~') {
                arg2.field832 = arg2.field832.substring(1);
                class12.method2156(2, arg2.field60, arg2.field832);
            } else if (Statics.field2693 == arg2) {
                class12.method2156(2, arg2.field60, arg2.field832);
            }
            arg2.field833 = false;
            arg2.field836 = 0;
            arg2.field872 = 0;
            arg2.field835 = 150;
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method2365();
            int var11 = arg0.method2363();
            arg2.method755(var10, var11, client.field306);
            arg2.field841 = client.field306 + 300;
            arg2.field842 = arg0.method2363();
            arg2.field849 = arg0.method2363();
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field877 = arg0.method2365();
            if (arg2.field819 == 0) {
                arg2.field848 = arg2.field877;
                arg2.field877 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            int var12 = arg0.method2365();
            class153 var13 = (class153) class110.method603(class153.method2055(), arg0.method2363());
            boolean var14 = arg0.method2363() == 1;
            int var15 = arg0.method2363();
            int var16 = arg0.field2012;
            if (arg2.field60 != null && arg2.field48 != null) {
                boolean var17 = false;
                if (var13.field2293 && client.method972(arg2.field60)) {
                    var17 = true;
                }
                if (!var17 && client.field415 == 0 && !arg2.field44) {
                    field761.field2012 = 0;
                    arg0.method2388(field761.field2013, 0, var15);
                    field761.field2012 = 0;
                    String var18 = class224.method3852(class164.method1502(class223.method2239(field761)));
                    arg2.field832 = var18.trim();
                    arg2.field836 = var12 >> 8;
                    arg2.field872 = var12 & 0xFF;
                    arg2.field835 = 150;
                    arg2.field833 = var14;
                    arg2.field834 = Statics.field2693 != arg2 && var13.field2293 && client.field515 != "" && var18.toLowerCase().indexOf(client.field515) == -1;
                    int var19;
                    if (var13.field2292) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field2285 == -1) {
                        class12.method2156(var19, arg2.field60, var18);
                    } else {
                        class12.method2156(var19, class2.method2728(var13.field2285) + arg2.field60, var18);
                    }
                }
            }
            arg0.field2012 = var15 + var16;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field855 = arg0.method2365();
            int var20 = arg0.method2368();
            arg2.field859 = var20 >> 16;
            arg2.field858 = (var20 & 0xFFFF) + client.field306;
            arg2.field870 = 0;
            arg2.field857 = 0;
            if (arg2.field858 > client.field306) {
                arg2.field870 = -1;
            }
            if (arg2.field855 == 65535) {
                arg2.field855 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field860 = arg0.method2381();
            arg2.field831 = arg0.method2381();
            arg2.field861 = arg0.method2381();
            arg2.field863 = arg0.method2381();
            arg2.field864 = arg0.method2365() + client.field306;
            arg2.field856 = arg0.method2365() + client.field306;
            arg2.field837 = arg0.method2365();
            if (arg2.field62) {
                arg2.field860 += arg2.field59;
                arg2.field831 += arg2.field64;
                arg2.field861 += arg2.field59;
                arg2.field863 += arg2.field64;
                arg2.field819 = 0;
            } else {
                arg2.field860 += arg2.field873[0];
                arg2.field831 += arg2.field874[0];
                arg2.field861 += arg2.field873[0];
                arg2.field863 += arg2.field874[0];
                arg2.field819 = 1;
            }
            arg2.field876 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            int var21 = arg0.method2365();
            int var22 = arg0.method2363();
            arg2.method755(var21, var22, client.field306);
            arg2.field841 = client.field306 + 300;
            arg2.field842 = arg0.method2363();
            arg2.field849 = arg0.method2363();
        }
        if ((arg3 & 0x400) != 0) {
            field755[arg1] = arg0.method2381();
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method2381();
        }
        if ((arg3 & 0x4000) != 0) {
            for (int var23 = 0; var23 < 3; var23++) {
                arg2.field43[var23] = arg0.method2540();
            }
        }
        if (!arg2.field62) {
            return;
        }
        if (var4 == 127) {
            arg2.method18(arg2.field59, arg2.field64);
            return;
        }
        byte var24;
        if (var4 == -1) {
            var24 = field755[arg1];
        } else {
            var24 = var4;
        }
        arg2.method17(arg2.field59, arg2.field64, var24);
    }

    @ObfuscatedName("ei.c(B)V")
    public static void method2696() {
        field752 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field750[var0] = null;
            field751[var0] = null;
            field755[var0] = 1;
        }
    }
}
