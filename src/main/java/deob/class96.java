package deob;

@ObfuscatedName("cn")
public class class96 {

    @ObfuscatedName("cn.f")
    public static byte[] field1248 = new byte[2048];

    @ObfuscatedName("cn.j")
    public static byte[] field1246 = new byte[2048];

    @ObfuscatedName("cn.m")
    public static class401[] field1249 = new class401[2048];

    @ObfuscatedName("cn.k")
    public static int field1251 = 0;

    @ObfuscatedName("cn.t")
    public static int[] field1252 = new int[2048];

    @ObfuscatedName("cn.a")
    public static int field1253 = 0;

    @ObfuscatedName("cn.e")
    public static int[] field1254 = new int[2048];

    @ObfuscatedName("cn.i")
    public static int[] field1255 = new int[2048];

    @ObfuscatedName("cn.y")
    public static int[] field1256 = new int[2048];

    @ObfuscatedName("cn.w")
    public static int[] field1262 = new int[2048];

    @ObfuscatedName("cn.g")
    public static int field1258 = 0;

    @ObfuscatedName("cn.v")
    public static int[] field1259 = new int[2048];

    @ObfuscatedName("cn.s")
    public static class401 field1260 = new class401(new byte[5000]);

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ks.l(Loy;B)V")
    public static final void method4694(class400 arg0) {
        arg0.method6225();
        int var1 = client.field608;
        class83 var2 = Statics.field868 = client.field642[var1] = new class83();
        var2.field1084 = var1;
        int var3 = arg0.method6226(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1162[0] = var5 - Statics.field2131;
        var2.field1140 = (var2.field1162[0] << 7) + (var2.method2001() << 6);
        var2.field1163[0] = var6 - Statics.field3028;
        var2.field1124 = (var2.field1163[0] << 7) + (var2.method2001() << 6);
        Statics.field2592 = var2.field1083 = var4;
        if (field1249[var1] != null) {
            var2.method1989(field1249[var1]);
        }
        field1251 = 0;
        field1252[++field1251 - 1] = var1;
        field1248[var1] = 0;
        field1253 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6226(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1255[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1256[var7] = 0;
                field1262[var7] = -1;
                field1254[++field1253 - 1] = var7;
                field1248[var7] = 0;
            }
        }
        arg0.method6239();
    }

    @ObfuscatedName("cq.q(Loy;IB)V")
    public static final void method2103(class400 arg0, int arg1) {
        int var2 = arg0.field4292;
        field1258 = 0;
        int var3 = 0;
        arg0.method6225();
        for (int var4 = 0; var4 < field1251; var4++) {
            int var5 = field1252[var4];
            if ((field1248[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1248[var5] = (byte) (field1248[var5] | 0x2);
                } else {
                    int var6 = arg0.method6226(1);
                    if (var6 == 0) {
                        var3 = method4928(arg0);
                        field1248[var5] = (byte) (field1248[var5] | 0x2);
                    } else {
                        method2154(arg0, var5);
                    }
                }
            }
        }
        arg0.method6239();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6225();
        for (int var7 = 0; var7 < field1251; var7++) {
            int var8 = field1252[var7];
            if ((field1248[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1248[var8] = (byte) (field1248[var8] | 0x2);
                } else {
                    int var9 = arg0.method6226(1);
                    if (var9 == 0) {
                        var3 = method4928(arg0);
                        field1248[var8] = (byte) (field1248[var8] | 0x2);
                    } else {
                        method2154(arg0, var8);
                    }
                }
            }
        }
        arg0.method6239();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6225();
        for (int var10 = 0; var10 < field1253; var10++) {
            int var11 = field1254[var10];
            if ((field1248[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1248[var11] = (byte) (field1248[var11] | 0x2);
                } else {
                    int var12 = arg0.method6226(1);
                    if (var12 == 0) {
                        var3 = method4928(arg0);
                        field1248[var11] = (byte) (field1248[var11] | 0x2);
                    } else if (method1882(arg0, var11)) {
                        field1248[var11] = (byte) (field1248[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6239();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6225();
        for (int var13 = 0; var13 < field1253; var13++) {
            int var14 = field1254[var13];
            if ((field1248[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1248[var14] = (byte) (field1248[var14] | 0x2);
                } else {
                    int var15 = arg0.method6226(1);
                    if (var15 == 0) {
                        var3 = method4928(arg0);
                        field1248[var14] = (byte) (field1248[var14] | 0x2);
                    } else if (method1882(arg0, var14)) {
                        field1248[var14] = (byte) (field1248[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6239();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1251 = 0;
        field1253 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1248[var16] = (byte) (field1248[var16] >> 1);
            class83 var17 = client.field642[var16];
            if (var17 == null) {
                field1254[++field1253 - 1] = var16;
            } else {
                field1252[++field1251 - 1] = var16;
            }
        }
        method754(arg0);
        if (arg0.field4292 - var2 != arg1) {
            throw new RuntimeException(arg0.field4292 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("kd.f(Loy;I)I")
    public static int method4928(class400 arg0) {
        int var1 = arg0.method6226(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6226(5);
        } else if (var1 == 2) {
            var2 = arg0.method6226(8);
        } else {
            var2 = arg0.method6226(11);
        }
        return var2;
    }

    @ObfuscatedName("cz.j(Loy;II)V")
    public static void method2154(class400 arg0, int arg1) {
        boolean var2 = arg0.method6226(1) == 1;
        if (var2) {
            field1259[++field1258 - 1] = arg1;
        }
        int var3 = arg0.method6226(2);
        class83 var4 = client.field642[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1061 = false;
            } else if (client.field608 == arg1) {
                throw new RuntimeException();
            } else {
                field1255[arg1] = (Statics.field3028 + var4.field1163[0] >> 13) + (Statics.field2131 + var4.field1162[0] >> 13 << 14) + (var4.field1083 << 28);
                if (var4.field1135 == -1) {
                    field1256[arg1] = var4.field1158;
                } else {
                    field1256[arg1] = var4.field1135;
                }
                field1262[arg1] = var4.field1160;
                client.field642[arg1] = null;
                if (arg0.method6226(1) != 0) {
                    method1882(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6226(3);
            int var6 = var4.field1162[0];
            int var7 = var4.field1163[0];
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
            if (client.field608 == arg1 && var4.field1140 < 1536 || var4.field1124 < 1536 || var4.field1140 >= 11776 || var4.field1124 >= 11776) {
                var4.method2008(var6, var7);
                var4.field1061 = false;
            } else if (var2) {
                var4.field1061 = true;
                var4.field1089 = var6;
                var4.field1090 = var7;
            } else {
                var4.field1061 = false;
                var4.method2000(var6, var7, field1246[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6226(4);
            int var9 = var4.field1162[0];
            int var10 = var4.field1163[0];
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
            if (client.field608 == arg1 && var4.field1140 < 1536 || var4.field1124 < 1536 || var4.field1140 >= 11776 || var4.field1124 >= 11776) {
                var4.method2008(var9, var10);
                var4.field1061 = false;
            } else if (var2) {
                var4.field1061 = true;
                var4.field1089 = var9;
                var4.field1090 = var10;
            } else {
                var4.field1061 = false;
                var4.method2000(var9, var10, field1246[arg1]);
            }
        } else {
            int var11 = arg0.method6226(1);
            if (var11 == 0) {
                int var12 = arg0.method6226(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1162[0] + var14;
                int var17 = var4.field1163[0] + var15;
                if (client.field608 == arg1 && var4.field1140 < 1536 || var4.field1124 < 1536 || var4.field1140 >= 11776 || var4.field1124 >= 11776) {
                    var4.method2008(var16, var17);
                    var4.field1061 = false;
                } else if (var2) {
                    var4.field1061 = true;
                    var4.field1089 = var16;
                    var4.field1090 = var17;
                } else {
                    var4.field1061 = false;
                    var4.method2000(var16, var17, field1246[arg1]);
                }
                var4.field1083 = (byte) (var4.field1083 + var13 & 0x3);
                if (client.field608 == arg1) {
                    Statics.field2592 = var4.field1083;
                }
            } else {
                int var18 = arg0.method6226(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2131 + var4.field1162[0] + var20 & 0x3FFF) - Statics.field2131;
                int var23 = (Statics.field3028 + var4.field1163[0] + var21 & 0x3FFF) - Statics.field3028;
                if (client.field608 == arg1 && var4.field1140 < 1536 || var4.field1124 < 1536 || var4.field1140 >= 11776 || var4.field1124 >= 11776) {
                    var4.method2008(var22, var23);
                    var4.field1061 = false;
                } else if (var2) {
                    var4.field1061 = true;
                    var4.field1089 = var22;
                    var4.field1090 = var23;
                } else {
                    var4.field1061 = false;
                    var4.method2000(var22, var23, field1246[arg1]);
                }
                var4.field1083 = (byte) (var4.field1083 + var19 & 0x3);
                if (client.field608 == arg1) {
                    Statics.field2592 = var4.field1083;
                }
            }
        }
    }

    @ObfuscatedName("bn.m(Loy;IB)Z")
    public static boolean method1882(class400 arg0, int arg1) {
        int var2 = arg0.method6226(2);
        if (var2 == 0) {
            if (arg0.method6226(1) != 0) {
                method1882(arg0, arg1);
            }
            int var3 = arg0.method6226(13);
            int var4 = arg0.method6226(13);
            boolean var5 = arg0.method6226(1) == 1;
            if (var5) {
                field1259[++field1258 - 1] = arg1;
            }
            if (client.field642[arg1] != null) {
                throw new RuntimeException();
            }
            class83 var6 = client.field642[arg1] = new class83();
            var6.field1084 = arg1;
            if (field1249[arg1] != null) {
                var6.method1989(field1249[arg1]);
            }
            var6.field1158 = field1256[arg1];
            var6.field1160 = field1262[arg1];
            int var7 = field1255[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1114[0] = field1246[arg1];
            var6.field1083 = (byte) var8;
            var6.method2008((var9 << 13) + var3 - Statics.field2131, (var10 << 13) + var4 - Statics.field3028);
            var6.field1061 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6226(2);
            int var12 = field1255[arg1];
            field1255[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6226(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1255[arg1];
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
            field1255[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6226(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1255[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1255[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("at.k(Loy;B)V")
    public static final void method754(class400 arg0) {
        for (int var1 = 0; var1 < field1258; var1++) {
            int var2 = field1259[var1];
            class83 var3 = client.field642[var2];
            int var4 = arg0.method6272();
            if ((var4 & 0x40) != 0) {
                var4 += arg0.method6272() << 8;
            }
            method2040(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ci.t(Loy;ILci;II)V")
    public static final void method2040(class400 arg0, int arg1, class83 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x2000) != 0) {
            for (int var5 = 0; var5 < 3; var5++) {
                arg2.field1078[var5] = arg0.method6474();
            }
        }
        if ((arg3 & 0x400) != 0) {
            field1246[arg1] = arg0.method6273();
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1160 = arg0.method6309();
            if (arg2.field1160 == 65535) {
                arg2.field1160 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1149 = arg0.method6291();
            arg2.field1127 = arg0.method6291();
            arg2.field1150 = arg0.method6305();
            arg2.field1126 = arg0.method6305();
            arg2.field1146 = arg0.method6309() + client.field494;
            arg2.field1166 = arg0.method6309() + client.field494;
            arg2.field1152 = arg0.method6310();
            if (arg2.field1061) {
                arg2.field1149 += arg2.field1089;
                arg2.field1127 += arg2.field1090;
                arg2.field1150 += arg2.field1089;
                arg2.field1126 += arg2.field1090;
                arg2.field1161 = 0;
            } else {
                arg2.field1149 += arg2.field1162[0];
                arg2.field1127 += arg2.field1163[0];
                arg2.field1150 += arg2.field1162[0];
                arg2.field1126 += arg2.field1163[0];
                arg2.field1161 = 1;
            }
            arg2.field1130 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1120 = arg0.method6474();
            if (arg2.field1120.charAt(0) == '~') {
                arg2.field1120 = arg2.field1120.substring(1);
                class98.method5671(2, arg2.field1067.method6815(), arg2.field1120);
            } else if (Statics.field868 == arg2) {
                class98.method5671(2, arg2.field1067.method6815(), arg2.field1120);
            }
            arg2.field1121 = false;
            arg2.field1137 = 0;
            arg2.field1108 = 0;
            arg2.field1123 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var6 = arg0.method6301();
            if (var6 > 0) {
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg0.method6286();
                    if (var11 == 32767) {
                        var11 = arg0.method6286();
                        var9 = arg0.method6286();
                        var8 = arg0.method6286();
                        var10 = arg0.method6286();
                    } else if (var11 == 32766) {
                        var11 = -1;
                    } else {
                        var9 = arg0.method6286();
                    }
                    int var12 = arg0.method6286();
                    arg2.method2046(var11, var9, var8, var10, client.field494, var12);
                }
            }
            int var13 = arg0.method6272();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = arg0.method6286();
                    int var16 = arg0.method6286();
                    if (var16 == 32767) {
                        arg2.method2048(var15);
                    } else {
                        int var17 = arg0.method6286();
                        int var18 = arg0.method6272();
                        int var19 = var16 > 0 ? arg0.method6301() : var18;
                        arg2.method2047(var15, client.field494, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var20 = arg0.method6309();
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = arg0.method6272();
            client.method2819(arg2, var20, var21);
        }
        if ((arg3 & 0x80) != 0) {
            int var22 = arg0.method6435();
            class285 var23 = (class285) class304.method2484(class285.method277(), arg0.method6272());
            boolean var24 = arg0.method6303() == 1;
            int var25 = arg0.method6302();
            int var26 = arg0.field4292;
            if (arg2.field1067 != null && arg2.field1062 != null) {
                boolean var27 = false;
                if (var23.field3664 && Statics.field464.method1569(arg2.field1067)) {
                    var27 = true;
                }
                if (!var27 && client.field560 == 0 && !arg2.field1082) {
                    field1260.field4292 = 0;
                    arg0.method6397(field1260.field4294, 0, var25);
                    field1260.field4292 = 0;
                    String var28 = class316.method5205(class319.method1934(class265.method1862(field1260)));
                    arg2.field1120 = var28.trim();
                    arg2.field1137 = var22 >> 8;
                    arg2.field1108 = var22 & 0xFF;
                    arg2.field1123 = 150;
                    arg2.field1121 = var24;
                    arg2.field1122 = Statics.field868 != arg2 && var23.field3664 && client.field551 != "" && var28.toLowerCase().indexOf(client.field551) == -1;
                    int var29;
                    if (var23.field3663) {
                        var29 = var24 ? 91 : 1;
                    } else {
                        var29 = var24 ? 90 : 2;
                    }
                    if (var23.field3665 == -1) {
                        class98.method5671(var29, arg2.field1067.method6815(), var28);
                    } else {
                        class98.method5671(var29, class92.method1003(var23.field3665) + arg2.field1067.method6815(), var28);
                    }
                }
            }
            arg0.field4292 = var25 + var26;
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1135 = arg0.method6310();
            if (arg2.field1161 == 0) {
                arg2.field1158 = arg2.field1135;
                arg2.field1135 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1125 = arg0.method6435();
            int var30 = arg0.method6252();
            arg2.field1148 = var30 >> 16;
            arg2.field1106 = (var30 & 0xFFFF) + client.field494;
            arg2.field1145 = 0;
            arg2.field1109 = 0;
            if (arg2.field1106 > client.field494) {
                arg2.field1145 = -1;
            }
            if (arg2.field1125 == 65535) {
                arg2.field1125 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method6291();
        }
        if ((arg3 & 0x2) != 0) {
            int var31 = arg0.method6303();
            byte[] var32 = new byte[var31];
            class401 var33 = new class401(var32);
            arg0.method6323(var32, 0, var31);
            field1249[arg1] = var33;
            arg2.method1989(var33);
        }
        if (!arg2.field1061) {
            return;
        }
        if (var4 == 127) {
            arg2.method2008(arg2.field1089, arg2.field1090);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1246[arg1];
        } else {
            var34 = var4;
        }
        arg2.method2000(arg2.field1089, arg2.field1090, var34);
    }
}
