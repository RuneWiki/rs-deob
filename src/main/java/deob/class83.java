package deob;

@ObfuscatedName("cw")
public class class83 {

    @ObfuscatedName("cw.v")
    public static byte[] field1175 = new byte[2048];

    @ObfuscatedName("cw.j")
    public static byte[] field1171 = new byte[2048];

    @ObfuscatedName("cw.l")
    public static class385[] field1168 = new class385[2048];

    @ObfuscatedName("cw.n")
    public static int field1172 = 0;

    @ObfuscatedName("cw.w")
    public static int[] field1178 = new int[2048];

    @ObfuscatedName("cw.f")
    public static int field1174 = 0;

    @ObfuscatedName("cw.o")
    public static int[] field1170 = new int[2048];

    @ObfuscatedName("cw.x")
    public static int[] field1177 = new int[2048];

    @ObfuscatedName("cw.r")
    public static int[] field1176 = new int[2048];

    @ObfuscatedName("cw.p")
    public static int[] field1179 = new int[2048];

    @ObfuscatedName("cw.h")
    public static int field1180 = 0;

    @ObfuscatedName("cw.k")
    public static int[] field1181 = new int[2048];

    @ObfuscatedName("cw.a")
    public static class385 field1182 = new class385(new byte[5000]);

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.s(Lnu;B)V")
    public static final void method785(class384 arg0) {
        arg0.method5902();
        int var1 = client.field665;
        class70 var2 = Statics.field140 = client.field524[var1] = new class70();
        var2.field1000 = var1;
        int var3 = arg0.method5903(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1076[0] = var5 - Statics.field3625;
        var2.field1069 = (var2.field1076[0] << 7) + (var2.method1734() << 6);
        var2.field1077[0] = var6 - Statics.field1134;
        var2.field1059 = (var2.field1077[0] << 7) + (var2.method1734() << 6);
        Statics.field3652 = var2.field999 = var4;
        if (field1168[var1] != null) {
            var2.method1724(field1168[var1]);
        }
        field1172 = 0;
        field1178[++field1172 - 1] = var1;
        field1175[var1] = 0;
        field1174 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5903(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1177[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1176[var7] = 0;
                field1179[var7] = -1;
                field1170[++field1174 - 1] = var7;
                field1175[var7] = 0;
            }
        }
        arg0.method5923();
    }

    @ObfuscatedName("cl.t(Lnu;II)V")
    public static final void method1883(class384 arg0, int arg1) {
        int var2 = arg0.field4182;
        field1180 = 0;
        method1654(arg0);
        for (int var3 = 0; var3 < field1180; var3++) {
            int var4 = field1181[var3];
            class70 var5 = client.field524[var4];
            int var6 = arg0.method5958();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method5958() << 8;
            }
            method2968(arg0, var4, var5, var6);
        }
        if (arg0.field4182 - var2 != arg1) {
            throw new RuntimeException(arg0.field4182 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bo.v(Lnu;I)V")
    public static final void method1654(class384 arg0) {
        int var1 = 0;
        arg0.method5902();
        for (int var2 = 0; var2 < field1172; var2++) {
            int var3 = field1178[var2];
            if ((field1175[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1175[var3] = (byte) (field1175[var3] | 0x2);
                } else {
                    int var4 = arg0.method5903(1);
                    if (var4 == 0) {
                        var1 = method4324(arg0);
                        field1175[var3] = (byte) (field1175[var3] | 0x2);
                    } else {
                        method3729(arg0, var3);
                    }
                }
            }
        }
        arg0.method5923();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5902();
        for (int var5 = 0; var5 < field1172; var5++) {
            int var6 = field1178[var5];
            if ((field1175[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1175[var6] = (byte) (field1175[var6] | 0x2);
                } else {
                    int var7 = arg0.method5903(1);
                    if (var7 == 0) {
                        var1 = method4324(arg0);
                        field1175[var6] = (byte) (field1175[var6] | 0x2);
                    } else {
                        method3729(arg0, var6);
                    }
                }
            }
        }
        arg0.method5923();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5902();
        for (int var8 = 0; var8 < field1174; var8++) {
            int var9 = field1170[var8];
            if ((field1175[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1175[var9] = (byte) (field1175[var9] | 0x2);
                } else {
                    int var10 = arg0.method5903(1);
                    if (var10 == 0) {
                        var1 = method4324(arg0);
                        field1175[var9] = (byte) (field1175[var9] | 0x2);
                    } else if (method2114(arg0, var9)) {
                        field1175[var9] = (byte) (field1175[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5923();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5902();
        for (int var11 = 0; var11 < field1174; var11++) {
            int var12 = field1170[var11];
            if ((field1175[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1175[var12] = (byte) (field1175[var12] | 0x2);
                } else {
                    int var13 = arg0.method5903(1);
                    if (var13 == 0) {
                        var1 = method4324(arg0);
                        field1175[var12] = (byte) (field1175[var12] | 0x2);
                    } else if (method2114(arg0, var12)) {
                        field1175[var12] = (byte) (field1175[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5923();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1172 = 0;
        field1174 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1175[var14] = (byte) (field1175[var14] >> 1);
            class70 var15 = client.field524[var14];
            if (var15 == null) {
                field1170[++field1174 - 1] = var14;
            } else {
                field1178[++field1172 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ik.j(Lnu;I)I")
    public static int method4324(class384 arg0) {
        int var1 = arg0.method5903(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5903(5);
        } else if (var1 == 2) {
            var2 = arg0.method5903(8);
        } else {
            var2 = arg0.method5903(11);
        }
        return var2;
    }

    @ObfuscatedName("gy.l(Lnu;II)V")
    public static void method3729(class384 arg0, int arg1) {
        boolean var2 = arg0.method5903(1) == 1;
        if (var2) {
            field1181[++field1180 - 1] = arg1;
        }
        int var3 = arg0.method5903(2);
        class70 var4 = client.field524[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1004 = false;
            } else if (client.field665 == arg1) {
                throw new RuntimeException();
            } else {
                field1177[arg1] = (Statics.field1134 + var4.field1077[0] >> 13) + (Statics.field3625 + var4.field1076[0] >> 13 << 14) + (var4.field999 << 28);
                if (var4.field1049 == -1) {
                    field1176[arg1] = var4.field1043;
                } else {
                    field1176[arg1] = var4.field1049;
                }
                field1179[arg1] = var4.field1047;
                client.field524[arg1] = null;
                if (arg0.method5903(1) != 0) {
                    method2114(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5903(3);
            int var6 = var4.field1076[0];
            int var7 = var4.field1077[0];
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
            if (client.field665 == arg1 && var4.field1069 < 1536 || var4.field1059 < 1536 || var4.field1069 >= 11776 || var4.field1059 >= 11776) {
                var4.method1745(var6, var7);
                var4.field1004 = false;
            } else if (var2) {
                var4.field1004 = true;
                var4.field1005 = var6;
                var4.field1006 = var7;
            } else {
                var4.field1004 = false;
                var4.method1735(var6, var7, field1171[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5903(4);
            int var9 = var4.field1076[0];
            int var10 = var4.field1077[0];
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
            if (client.field665 == arg1 && var4.field1069 < 1536 || var4.field1059 < 1536 || var4.field1069 >= 11776 || var4.field1059 >= 11776) {
                var4.method1745(var9, var10);
                var4.field1004 = false;
            } else if (var2) {
                var4.field1004 = true;
                var4.field1005 = var9;
                var4.field1006 = var10;
            } else {
                var4.field1004 = false;
                var4.method1735(var9, var10, field1171[arg1]);
            }
        } else {
            int var11 = arg0.method5903(1);
            if (var11 == 0) {
                int var12 = arg0.method5903(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1076[0] + var14;
                int var17 = var4.field1077[0] + var15;
                if (client.field665 == arg1 && var4.field1069 < 1536 || var4.field1059 < 1536 || var4.field1069 >= 11776 || var4.field1059 >= 11776) {
                    var4.method1745(var16, var17);
                    var4.field1004 = false;
                } else if (var2) {
                    var4.field1004 = true;
                    var4.field1005 = var16;
                    var4.field1006 = var17;
                } else {
                    var4.field1004 = false;
                    var4.method1735(var16, var17, field1171[arg1]);
                }
                var4.field999 = (byte) (var4.field999 + var13 & 0x3);
                if (client.field665 == arg1) {
                    Statics.field3652 = var4.field999;
                }
            } else {
                int var18 = arg0.method5903(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3625 + var4.field1076[0] + var20 & 0x3FFF) - Statics.field3625;
                int var23 = (Statics.field1134 + var4.field1077[0] + var21 & 0x3FFF) - Statics.field1134;
                if (client.field665 == arg1 && var4.field1069 < 1536 || var4.field1059 < 1536 || var4.field1069 >= 11776 || var4.field1059 >= 11776) {
                    var4.method1745(var22, var23);
                    var4.field1004 = false;
                } else if (var2) {
                    var4.field1004 = true;
                    var4.field1005 = var22;
                    var4.field1006 = var23;
                } else {
                    var4.field1004 = false;
                    var4.method1735(var22, var23, field1171[arg1]);
                }
                var4.field999 = (byte) (var4.field999 + var19 & 0x3);
                if (client.field665 == arg1) {
                    Statics.field3652 = var4.field999;
                }
            }
        }
    }

    @ObfuscatedName("cr.n(Lnu;II)Z")
    public static boolean method2114(class384 arg0, int arg1) {
        int var2 = arg0.method5903(2);
        if (var2 == 0) {
            if (arg0.method5903(1) != 0) {
                method2114(arg0, arg1);
            }
            int var3 = arg0.method5903(13);
            int var4 = arg0.method5903(13);
            boolean var5 = arg0.method5903(1) == 1;
            if (var5) {
                field1181[++field1180 - 1] = arg1;
            }
            if (client.field524[arg1] != null) {
                throw new RuntimeException();
            }
            class70 var6 = client.field524[arg1] = new class70();
            var6.field1000 = arg1;
            if (field1168[arg1] != null) {
                var6.method1724(field1168[arg1]);
            }
            var6.field1043 = field1176[arg1];
            var6.field1047 = field1179[arg1];
            int var7 = field1177[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1031[0] = field1171[arg1];
            var6.field999 = (byte) var8;
            var6.method1745((var9 << 13) + var3 - Statics.field3625, (var10 << 13) + var4 - Statics.field1134);
            var6.field1004 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5903(2);
            int var12 = field1177[arg1];
            field1177[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5903(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1177[arg1];
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
            field1177[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5903(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1177[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1177[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("fv.w(Lnu;ILbb;IB)V")
    public static final void method2968(class384 arg0, int arg1, class70 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            arg2.field1049 = arg0.method6053();
            if (arg2.field1027 == 0) {
                arg2.field1043 = arg2.field1049;
                arg2.field1049 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1058 = arg0.method6086();
            int var5 = arg0.method6005();
            arg2.field1062 = var5 >> 16;
            arg2.field1061 = (var5 & 0xFFFF) + client.field452;
            arg2.field1028 = 0;
            arg2.field1060 = 0;
            if (arg2.field1061 > client.field452) {
                arg2.field1028 = -1;
            }
            if (arg2.field1058 == 65535) {
                arg2.field1058 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var6 = arg0.method5987();
            byte[] var7 = new byte[var6];
            class385 var8 = new class385(var7);
            arg0.method6050(var7, 0, var6);
            field1168[arg1] = var8;
            arg2.method1724(var8);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1034 = arg0.method5967();
            if (arg2.field1034.charAt(0) == '~') {
                arg2.field1034 = arg2.field1034.substring(1);
                class85.method2228(2, arg2.field980.method6520(), arg2.field1034);
            } else if (Statics.field140 == arg2) {
                class85.method2228(2, arg2.field980.method6520(), arg2.field1034);
            }
            arg2.field1035 = false;
            arg2.field1038 = 0;
            arg2.field1039 = 0;
            arg2.field1037 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            int var9 = arg0.method5997();
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = arg0.method5989();
            client.method2608(arg2, var9, var10);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1047 = arg0.method6086();
            if (arg2.field1047 == 65535) {
                arg2.field1047 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1063 = arg0.method5991();
            arg2.field1065 = arg0.method5990();
            arg2.field1064 = arg0.method5959();
            arg2.field1066 = arg0.method5945();
            arg2.field1074 = arg0.method5998() + client.field452;
            arg2.field1068 = arg0.method5997() + client.field452;
            arg2.field1051 = arg0.method6053();
            if (arg2.field1004) {
                arg2.field1063 += arg2.field1005;
                arg2.field1065 += arg2.field1006;
                arg2.field1064 += arg2.field1005;
                arg2.field1066 += arg2.field1006;
                arg2.field1027 = 0;
            } else {
                arg2.field1063 += arg2.field1076[0];
                arg2.field1065 += arg2.field1077[0];
                arg2.field1064 += arg2.field1076[0];
                arg2.field1066 += arg2.field1077[0];
                arg2.field1027 = 1;
            }
            arg2.field1067 = 0;
        }
        if ((arg3 & 0x8) != 0) {
            int var11 = arg0.method5998();
            class272 var12 = (class272) class291.method4326(class272.method1983(), arg0.method5987());
            boolean var13 = arg0.method5958() == 1;
            int var14 = arg0.method6174();
            int var15 = arg0.field4182;
            if (arg2.field980 != null && arg2.field979 != null) {
                boolean var16 = false;
                if (var12.field3548 && Statics.field80.method1347(arg2.field980)) {
                    var16 = true;
                }
                if (!var16 && client.field522 == 0 && !arg2.field998) {
                    field1182.field4182 = 0;
                    arg0.method6008(field1182.field4184, 0, var14);
                    field1182.field4182 = 0;
                    String var17 = class303.method4948(class306.method4620(class252.method3227(field1182)));
                    arg2.field1034 = var17.trim();
                    arg2.field1038 = var11 >> 8;
                    arg2.field1039 = var11 & 0xFF;
                    arg2.field1037 = 150;
                    arg2.field1035 = var13;
                    arg2.field1080 = Statics.field140 != arg2 && var12.field3548 && client.field630 != "" && var17.toLowerCase().indexOf(client.field630) == -1;
                    int var18;
                    if (var12.field3547) {
                        var18 = var13 ? 91 : 1;
                    } else {
                        var18 = var13 ? 90 : 2;
                    }
                    if (var12.field3543 == -1) {
                        class85.method2228(var18, arg2.field980.method6520(), var17);
                    } else {
                        class85.method2228(var18, class79.method1846(var12.field3543) + arg2.field980.method6520(), var17);
                    }
                }
            }
            arg0.field4182 = var14 + var15;
        }
        if ((arg3 & 0x800) != 0) {
            field1171[arg1] = arg0.method5959();
        }
        if ((arg3 & 0x80) != 0) {
            int var19 = arg0.method6174();
            if (var19 > 0) {
                for (int var20 = 0; var20 < var19; var20++) {
                    int var21 = -1;
                    int var22 = -1;
                    int var23 = -1;
                    int var24 = arg0.method5972();
                    if (var24 == 32767) {
                        var24 = arg0.method5972();
                        var22 = arg0.method5972();
                        var21 = arg0.method5972();
                        var23 = arg0.method5972();
                    } else if (var24 == 32766) {
                        var24 = -1;
                    } else {
                        var22 = arg0.method5972();
                    }
                    int var25 = arg0.method5972();
                    arg2.method1783(var24, var22, var21, var23, client.field452, var25);
                }
            }
            int var26 = arg0.method5987();
            if (var26 > 0) {
                for (int var27 = 0; var27 < var26; var27++) {
                    int var28 = arg0.method5972();
                    int var29 = arg0.method5972();
                    if (var29 == 32767) {
                        arg2.method1777(var28);
                    } else {
                        int var30 = arg0.method5972();
                        int var31 = arg0.method5987();
                        int var32 = var29 > 0 ? arg0.method5989() : var31;
                        arg2.method1776(var28, client.field452, var29, var30, var31, var32);
                    }
                }
            }
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field982[var33] = arg0.method5967();
            }
        }
        if ((arg3 & 0x2000) != 0) {
            var4 = arg0.method5959();
        }
        if (!arg2.field1004) {
            return;
        }
        if (var4 == 127) {
            arg2.method1745(arg2.field1005, arg2.field1006);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1171[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1735(arg2.field1005, arg2.field1006, var34);
    }
}
