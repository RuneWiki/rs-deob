package deob;

@ObfuscatedName("an")
public class class35 {

    @ObfuscatedName("an.c")
    public static byte[] field802 = new byte[2048];

    @ObfuscatedName("an.h")
    public static byte[] field800 = new byte[2048];

    @ObfuscatedName("an.r")
    public static class123[] field799 = new class123[2048];

    @ObfuscatedName("an.a")
    public static int field805 = 0;

    @ObfuscatedName("an.b")
    public static int[] field808 = new int[2048];

    @ObfuscatedName("an.u")
    public static int field803 = 0;

    @ObfuscatedName("an.o")
    public static int[] field811 = new int[2048];

    @ObfuscatedName("an.p")
    public static int[] field804 = new int[2048];

    @ObfuscatedName("an.i")
    public static int[] field801 = new int[2048];

    @ObfuscatedName("an.q")
    public static int[] field806 = new int[2048];

    @ObfuscatedName("an.g")
    public static int field807 = 0;

    @ObfuscatedName("an.j")
    public static int[] field797 = new int[2048];

    @ObfuscatedName("an.w")
    public static class123 field809 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.e(Ldq;I)V")
    public static final void method3069(class126 arg0) {
        arg0.method2732();
        int var1 = client.field418;
        class3 var2 = Statics.field2036 = client.field468[var1] = new class3();
        var2.field40 = var1;
        int var3 = arg0.method2713(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field886[0] = var5 - Statics.field287;
        var2.field897 = (var2.field886[0] << 7) + (var2.method8() << 6);
        var2.field907[0] = var6 - Statics.field129;
        var2.field880 = (var2.field907[0] << 7) + (var2.method8() << 6);
        Statics.field1120 = var2.field58 = var4;
        if (field799[var1] != null) {
            var2.method23(field799[var1]);
        }
        field805 = 0;
        field808[++field805 - 1] = var1;
        field802[var1] = 0;
        field803 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2713(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field804[var7] = (var9 << 28) + (var10 << 14) + var11;
                field801[var7] = 0;
                field806[var7] = -1;
                field811[++field803 - 1] = var7;
                field802[var7] = 0;
            }
        }
        arg0.method2714();
    }

    @ObfuscatedName("ad.l(Ldq;II)V")
    public static final void method739(class126 arg0, int arg1) {
        int var2 = arg0.field2062;
        field807 = 0;
        int var3 = 0;
        arg0.method2732();
        for (int var4 = 0; var4 < field805; var4++) {
            int var5 = field808[var4];
            if ((field802[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field802[var5] = (byte) (field802[var5] | 0x2);
                } else {
                    int var6 = arg0.method2713(1);
                    if (var6 == 0) {
                        var3 = method1100(arg0);
                        field802[var5] = (byte) (field802[var5] | 0x2);
                    } else {
                        method43(arg0, var5);
                    }
                }
            }
        }
        arg0.method2714();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2732();
        for (int var7 = 0; var7 < field805; var7++) {
            int var8 = field808[var7];
            if ((field802[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field802[var8] = (byte) (field802[var8] | 0x2);
                } else {
                    int var9 = arg0.method2713(1);
                    if (var9 == 0) {
                        var3 = method1100(arg0);
                        field802[var8] = (byte) (field802[var8] | 0x2);
                    } else {
                        method43(arg0, var8);
                    }
                }
            }
        }
        arg0.method2714();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2732();
        for (int var10 = 0; var10 < field803; var10++) {
            int var11 = field811[var10];
            if ((field802[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field802[var11] = (byte) (field802[var11] | 0x2);
                } else {
                    int var12 = arg0.method2713(1);
                    if (var12 == 0) {
                        var3 = method1100(arg0);
                        field802[var11] = (byte) (field802[var11] | 0x2);
                    } else if (method537(arg0, var11)) {
                        field802[var11] = (byte) (field802[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2714();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2732();
        for (int var13 = 0; var13 < field803; var13++) {
            int var14 = field811[var13];
            if ((field802[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field802[var14] = (byte) (field802[var14] | 0x2);
                } else {
                    int var15 = arg0.method2713(1);
                    if (var15 == 0) {
                        var3 = method1100(arg0);
                        field802[var14] = (byte) (field802[var14] | 0x2);
                    } else if (method537(arg0, var14)) {
                        field802[var14] = (byte) (field802[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2714();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field805 = 0;
        field803 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field802[var16] = (byte) (field802[var16] >> 1);
            class3 var17 = client.field468[var16];
            if (var17 == null) {
                field811[++field803 - 1] = var16;
            } else {
                field808[++field805 - 1] = var16;
            }
        }
        method1054(arg0);
        if (arg0.field2062 - var2 != arg1) {
            throw new RuntimeException(arg0.field2062 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bw.c(Ldq;S)I")
    public static int method1100(class126 arg0) {
        int var1 = arg0.method2713(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2713(5);
        } else if (var1 == 2) {
            var2 = arg0.method2713(8);
        } else {
            var2 = arg0.method2713(11);
        }
        return var2;
    }

    @ObfuscatedName("r.h(Ldq;II)V")
    public static void method43(class126 arg0, int arg1) {
        boolean var2 = arg0.method2713(1) == 1;
        if (var2) {
            field797[++field807 - 1] = arg1;
        }
        int var3 = arg0.method2713(2);
        class3 var4 = client.field468[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field38 = false;
            } else if (client.field418 == arg1) {
                throw new RuntimeException();
            } else {
                field804[arg1] = (Statics.field129 + var4.field907[0] >> 6) + (Statics.field287 + var4.field886[0] >> 6 << 14) + (var4.field58 << 28);
                if (var4.field879 == -1) {
                    field801[arg1] = var4.field890;
                } else {
                    field801[arg1] = var4.field879;
                }
                field806[arg1] = var4.field877;
                client.field468[arg1] = null;
                if (arg0.method2713(1) != 0) {
                    method537(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2713(3);
            int var6 = var4.field886[0];
            int var7 = var4.field907[0];
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
            if (client.field418 == arg1 && var4.field897 < 1536 || var4.field880 < 1536 || var4.field897 >= 11776 || var4.field880 >= 11776) {
                var4.method24(var6, var7);
                var4.field38 = false;
            } else if (var2) {
                var4.field38 = true;
                var4.field55 = var6;
                var4.field56 = var7;
            } else {
                var4.field38 = false;
                var4.method10(var6, var7, field800[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2713(4);
            int var9 = var4.field886[0];
            int var10 = var4.field907[0];
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
            if (client.field418 == arg1 && var4.field897 < 1536 || var4.field880 < 1536 || var4.field897 >= 11776 || var4.field880 >= 11776) {
                var4.method24(var9, var10);
                var4.field38 = false;
            } else if (var2) {
                var4.field38 = true;
                var4.field55 = var9;
                var4.field56 = var10;
            } else {
                var4.field38 = false;
                var4.method10(var9, var10, field800[arg1]);
            }
        } else {
            int var11 = arg0.method2713(1);
            if (var11 == 0) {
                int var12 = arg0.method2713(12);
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
                int var17 = var4.field907[0] + var15;
                if (client.field418 == arg1 && var4.field897 < 1536 || var4.field880 < 1536 || var4.field897 >= 11776 || var4.field880 >= 11776) {
                    var4.method24(var16, var17);
                    var4.field38 = false;
                } else if (var2) {
                    var4.field38 = true;
                    var4.field55 = var16;
                    var4.field56 = var17;
                } else {
                    var4.field38 = false;
                    var4.method10(var16, var17, field800[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var13 & 0x3);
                if (client.field418 == arg1) {
                    Statics.field1120 = var4.field58;
                }
            } else {
                int var18 = arg0.method2713(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field287 + var4.field886[0] + var20 & 0x3FFF) - Statics.field287;
                int var23 = (Statics.field129 + var4.field907[0] + var21 & 0x3FFF) - Statics.field129;
                if (client.field418 == arg1 && var4.field897 < 1536 || var4.field880 < 1536 || var4.field897 >= 11776 || var4.field880 >= 11776) {
                    var4.method24(var22, var23);
                    var4.field38 = false;
                } else if (var2) {
                    var4.field38 = true;
                    var4.field55 = var22;
                    var4.field56 = var23;
                } else {
                    var4.field38 = false;
                    var4.method10(var22, var23, field800[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var19 & 0x3);
                if (client.field418 == arg1) {
                    Statics.field1120 = var4.field58;
                }
            }
        }
    }

    @ObfuscatedName("v.r(Ldq;II)Z")
    public static boolean method537(class126 arg0, int arg1) {
        int var2 = arg0.method2713(2);
        if (var2 == 0) {
            if (arg0.method2713(1) != 0) {
                method537(arg0, arg1);
            }
            int var3 = arg0.method2713(6);
            int var4 = arg0.method2713(6);
            boolean var5 = arg0.method2713(1) == 1;
            if (var5) {
                field797[++field807 - 1] = arg1;
            }
            if (client.field468[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field468[arg1] = new class3();
            var6.field40 = arg1;
            if (field799[arg1] != null) {
                var6.method23(field799[arg1]);
            }
            var6.field890 = field801[arg1];
            var6.field877 = field806[arg1];
            int var7 = field804[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field908[0] = field800[arg1];
            var6.field58 = (byte) var8;
            var6.method24((var9 << 6) + var3 - Statics.field287, (var10 << 6) + var4 - Statics.field129);
            var6.field38 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2713(2);
            int var12 = field804[arg1];
            field804[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2713(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field804[arg1];
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
            field804[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2713(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field804[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field804[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ay.a(Ldq;I)V")
    public static final void method1054(class126 arg0) {
        for (int var1 = 0; var1 < field807; var1++) {
            int var2 = field797[var1];
            class3 var3 = client.field468[var2];
            int var4 = arg0.method2464();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2464() << 8;
            }
            method586(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ah.b(Ldq;ILc;IB)V")
    public static final void method586(class126 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method2464();
            byte[] var6 = new byte[var5];
            class123 var7 = new class123(var6);
            arg0.method2591(var6, 0, var5);
            field799[arg1] = var7;
            arg2.method23(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2466();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2464();
            client.method2385(arg2, var8, var9);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field877 = arg0.method2466();
            if (arg2.field877 == 65535) {
                arg2.field877 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field874 = arg0.method2471();
            if (arg2.field874.charAt(0) == '~') {
                arg2.field874 = arg2.field874.substring(1);
                class12.method577(2, arg2.field53, arg2.field874);
            } else if (Statics.field2036 == arg2) {
                class12.method577(2, arg2.field53, arg2.field874);
            }
            arg2.field865 = false;
            arg2.field868 = 0;
            arg2.field869 = 0;
            arg2.field867 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg0.method2464();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2526();
                    if (var15 == 32767) {
                        var15 = arg0.method2526();
                        var13 = arg0.method2526();
                        var12 = arg0.method2526();
                        var14 = arg0.method2526();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2526();
                    }
                    int var16 = arg0.method2526();
                    arg2.method764(var15, var13, var12, var14, client.field568, var16);
                }
            }
            int var17 = arg0.method2464();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2526();
                    int var20 = arg0.method2526();
                    if (var20 == 32767) {
                        arg2.method762(var19);
                    } else {
                        int var21 = arg0.method2526();
                        int var22 = arg0.method2464();
                        int var23 = var20 > 0 ? arg0.method2464() : var22;
                        arg2.method757(var19, client.field568, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field879 = arg0.method2466();
            if (arg2.field853 == 0) {
                arg2.field890 = arg2.field879;
                arg2.field879 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var24 = arg0.method2466();
            class156[] var25 = new class156[] { class156.field2314, class156.field2311, class156.field2321, class156.field2310, class156.field2312 };
            class156 var26 = (class156) class113.method576(var25, arg0.method2464());
            boolean var27 = arg0.method2464() == 1;
            int var28 = arg0.method2464();
            int var29 = arg0.field2062;
            if (arg2.field53 != null && arg2.field54 != null) {
                boolean var30 = false;
                if (var26.field2322 && client.method2396(arg2.field53)) {
                    var30 = true;
                }
                if (!var30 && client.field491 == 0 && !arg2.field52) {
                    field809.field2062 = 0;
                    arg0.method2591(field809.field2055, 0, var28);
                    field809.field2062 = 0;
                    class123 var31 = field809;
                    String var32 = class226.method995(var31, 32767);
                    String var33 = class227.method3894(class167.method983(var32));
                    arg2.field874 = var33.trim();
                    arg2.field868 = var24 >> 8;
                    arg2.field869 = var24 & 0xFF;
                    arg2.field867 = 150;
                    arg2.field865 = var27;
                    arg2.field898 = Statics.field2036 != arg2 && var26.field2322 && client.field405 != "" && var33.toLowerCase().indexOf(client.field405) == -1;
                    int var34;
                    if (var26.field2316) {
                        var34 = var27 ? 91 : 1;
                    } else {
                        var34 = var27 ? 90 : 2;
                    }
                    if (var26.field2315 == -1) {
                        class12.method577(var34, arg2.field53, var33);
                    } else {
                        int var36 = var26.field2315;
                        String var37 = "<img=" + var36 + ">";
                        class12.method577(var34, var37 + arg2.field53, var33);
                    }
                }
            }
            arg0.field2062 = var28 + var29;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field888 = arg0.method2466();
            int var38 = arg0.method2468();
            arg2.field892 = var38 >> 16;
            arg2.field870 = (var38 & 0xFFFF) + client.field568;
            arg2.field889 = 0;
            arg2.field883 = 0;
            if (arg2.field870 > client.field568) {
                arg2.field889 = -1;
            }
            if (arg2.field888 == 65535) {
                arg2.field888 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field893 = arg0.method2465();
            arg2.field895 = arg0.method2465();
            arg2.field894 = arg0.method2465();
            arg2.field896 = arg0.method2465();
            arg2.field884 = arg0.method2466() + client.field568;
            arg2.field860 = arg0.method2466() + client.field568;
            arg2.field863 = arg0.method2466();
            if (arg2.field38) {
                arg2.field893 += arg2.field55;
                arg2.field895 += arg2.field56;
                arg2.field894 += arg2.field55;
                arg2.field896 += arg2.field56;
                arg2.field853 = 0;
            } else {
                arg2.field893 += arg2.field886[0];
                arg2.field895 += arg2.field907[0];
                arg2.field894 += arg2.field886[0];
                arg2.field896 += arg2.field907[0];
                arg2.field853 = 1;
            }
            arg2.field910 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            field800[arg1] = arg0.method2465();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2465();
        }
        if ((arg3 & 0x400) != 0) {
            for (int var39 = 0; var39 < 3; var39++) {
                arg2.field48[var39] = arg0.method2471();
            }
        }
        if (!arg2.field38) {
            return;
        }
        if (var4 == 127) {
            arg2.method24(arg2.field55, arg2.field56);
            return;
        }
        byte var40;
        if (var4 == -1) {
            var40 = field800[arg1];
        } else {
            var40 = var4;
        }
        arg2.method10(arg2.field55, arg2.field56, var40);
    }

    @ObfuscatedName("ap.u(B)V")
    public static void method697() {
        field805 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field799[var0] = null;
            field800[var0] = 1;
        }
    }
}
