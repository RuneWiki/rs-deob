package deob;

@ObfuscatedName("cc")
public class class96 {

    @ObfuscatedName("cc.s")
    public static byte[] field1245 = new byte[2048];

    @ObfuscatedName("cc.a")
    public static byte[] field1242 = new byte[2048];

    @ObfuscatedName("cc.o")
    public static class401[] field1243 = new class401[2048];

    @ObfuscatedName("cc.g")
    public static int field1244 = 0;

    @ObfuscatedName("cc.e")
    public static int[] field1239 = new int[2048];

    @ObfuscatedName("cc.p")
    public static int field1246 = 0;

    @ObfuscatedName("cc.j")
    public static int[] field1247 = new int[2048];

    @ObfuscatedName("cc.b")
    public static int[] field1248 = new int[2048];

    @ObfuscatedName("cc.x")
    public static int[] field1249 = new int[2048];

    @ObfuscatedName("cc.y")
    public static int[] field1250 = new int[2048];

    @ObfuscatedName("cc.k")
    public static int field1251 = 0;

    @ObfuscatedName("cc.t")
    public static int[] field1252 = new int[2048];

    @ObfuscatedName("cc.l")
    public static class401 field1241 = new class401(new byte[5000]);

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.i(Loj;I)V")
    public static final void method2092(class400 arg0) {
        arg0.method6188();
        int var1 = client.field718;
        class83 var2 = Statics.field1674 = client.field587[var1] = new class83();
        var2.field1064 = var1;
        int var3 = arg0.method6194(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1091[0] = var5 - Statics.field92;
        var2.field1092 = (var2.field1091[0] << 7) + (var2.method2047() << 6);
        var2.field1144[0] = var6 - Statics.field4007;
        var2.field1085 = (var2.field1144[0] << 7) + (var2.method2047() << 6);
        Statics.field3731 = var2.field1063 = var4;
        if (field1243[var1] != null) {
            var2.method2010(field1243[var1]);
        }
        field1244 = 0;
        field1239[++field1244 - 1] = var1;
        field1245[var1] = 0;
        field1246 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6194(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1248[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1249[var7] = 0;
                field1250[var7] = -1;
                field1247[++field1246 - 1] = var7;
                field1245[var7] = 0;
            }
        }
        arg0.method6190();
    }

    @ObfuscatedName("jk.w(Loj;II)V")
    public static final void method4660(class400 arg0, int arg1) {
        int var2 = arg0.field4300;
        field1251 = 0;
        int var3 = 0;
        arg0.method6188();
        for (int var4 = 0; var4 < field1244; var4++) {
            int var5 = field1239[var4];
            if ((field1245[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var5] = (byte) (field1245[var5] | 0x2);
                } else {
                    int var6 = arg0.method6194(1);
                    if (var6 == 0) {
                        var3 = method1892(arg0);
                        field1245[var5] = (byte) (field1245[var5] | 0x2);
                    } else {
                        method1859(arg0, var5);
                    }
                }
            }
        }
        arg0.method6190();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6188();
        for (int var7 = 0; var7 < field1244; var7++) {
            int var8 = field1239[var7];
            if ((field1245[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var8] = (byte) (field1245[var8] | 0x2);
                } else {
                    int var9 = arg0.method6194(1);
                    if (var9 == 0) {
                        var3 = method1892(arg0);
                        field1245[var8] = (byte) (field1245[var8] | 0x2);
                    } else {
                        method1859(arg0, var8);
                    }
                }
            }
        }
        arg0.method6190();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6188();
        for (int var10 = 0; var10 < field1246; var10++) {
            int var11 = field1247[var10];
            if ((field1245[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var11] = (byte) (field1245[var11] | 0x2);
                } else {
                    int var12 = arg0.method6194(1);
                    if (var12 == 0) {
                        var3 = method1892(arg0);
                        field1245[var11] = (byte) (field1245[var11] | 0x2);
                    } else if (method3195(arg0, var11)) {
                        field1245[var11] = (byte) (field1245[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6190();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6188();
        for (int var13 = 0; var13 < field1246; var13++) {
            int var14 = field1247[var13];
            if ((field1245[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var14] = (byte) (field1245[var14] | 0x2);
                } else {
                    int var15 = arg0.method6194(1);
                    if (var15 == 0) {
                        var3 = method1892(arg0);
                        field1245[var14] = (byte) (field1245[var14] | 0x2);
                    } else if (method3195(arg0, var14)) {
                        field1245[var14] = (byte) (field1245[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6190();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1244 = 0;
        field1246 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1245[var16] = (byte) (field1245[var16] >> 1);
            class83 var17 = client.field587[var16];
            if (var17 == null) {
                field1247[++field1246 - 1] = var16;
            } else {
                field1239[++field1244 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1251; var18++) {
            int var19 = field1252[var18];
            class83 var20 = client.field587[var19];
            int var21 = arg0.method6240();
            if ((var21 & 0x80) != 0) {
                var21 += arg0.method6240() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x4) != 0) {
                var20.field1111 = arg0.method6394();
                if (var20.field1111 == 65535) {
                    var20.field1111 = -1;
                }
            }
            if ((var21 & 0x20) != 0) {
                var20.field1113 = arg0.method6394();
                if (var20.field1122 == 0) {
                    var20.field1137 = var20.field1113;
                    var20.field1113 = -1;
                }
            }
            if ((var21 & 0x10) != 0) {
                int var23 = arg0.method6394();
                class285 var24 = (class285) class304.method2319(class285.method2886(), arg0.method6270());
                boolean var25 = arg0.method6240() == 1;
                int var26 = arg0.method6240();
                int var27 = arg0.field4300;
                if (var20.field1048 != null && var20.field1042 != null) {
                    boolean var28 = false;
                    if (var24.field3655 && Statics.field1352.method1598(var20.field1048)) {
                        var28 = true;
                    }
                    if (!var28 && client.field540 == 0 && !var20.field1062) {
                        field1241.field4300 = 0;
                        arg0.method6291(field1241.field4302, 0, var26);
                        field1241.field4300 = 0;
                        String var29 = class316.method5163(class319.method269(class265.method2651(field1241)));
                        var20.field1098 = var29.trim();
                        var20.field1106 = var23 >> 8;
                        var20.field1103 = var23 & 0xFF;
                        var20.field1105 = 150;
                        var20.field1099 = var25;
                        var20.field1100 = Statics.field1674 != var20 && var24.field3655 && client.field693 != "" && var29.toLowerCase().indexOf(client.field693) == -1;
                        int var30;
                        if (var24.field3654) {
                            var30 = var25 ? 91 : 1;
                        } else {
                            var30 = var25 ? 90 : 2;
                        }
                        if (var24.field3652 == -1) {
                            class98.method6175(var30, var20.field1048.method6813(), var29);
                        } else {
                            class98.method6175(var30, class92.method4468(var24.field3652) + var20.field1048.method6813(), var29);
                        }
                    }
                }
                arg0.field4300 = var26 + var27;
            }
            if ((var21 & 0x40) != 0) {
                var20.field1098 = arg0.method6335();
                if (var20.field1098.charAt(0) == '~') {
                    var20.field1098 = var20.field1098.substring(1);
                    class98.method6175(2, var20.field1048.method6813(), var20.field1098);
                } else if (Statics.field1674 == var20) {
                    class98.method6175(2, var20.field1048.method6813(), var20.field1098);
                }
                var20.field1099 = false;
                var20.field1106 = 0;
                var20.field1103 = 0;
                var20.field1105 = 150;
            }
            if ((var21 & 0x1) != 0) {
                int var31 = arg0.method6240();
                byte[] var32 = new byte[var31];
                class401 var33 = new class401(var32);
                arg0.method6405(var32, 0, var31);
                field1243[var19] = var33;
                var20.method2010(var33);
            }
            if ((var21 & 0x400) != 0) {
                for (int var34 = 0; var34 < 3; var34++) {
                    var20.field1046[var34] = arg0.method6335();
                }
            }
            if ((var21 & 0x8) != 0) {
                int var35 = arg0.method6394();
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var36 = arg0.method6270();
                client.method4019(var20, var35, var36);
            }
            if ((var21 & 0x200) != 0) {
                var20.field1084 = arg0.method6247();
                var20.field1101 = arg0.method6241();
                var20.field1129 = arg0.method6241();
                var20.field1131 = arg0.method6241();
                var20.field1132 = arg0.method6278() + client.field555;
                var20.field1133 = arg0.method6394() + client.field555;
                var20.field1134 = arg0.method6242();
                if (var20.field1068) {
                    var20.field1084 += var20.field1069;
                    var20.field1101 += var20.field1070;
                    var20.field1129 += var20.field1069;
                    var20.field1131 += var20.field1070;
                    var20.field1122 = 0;
                } else {
                    var20.field1084 += var20.field1091[0];
                    var20.field1101 += var20.field1144[0];
                    var20.field1129 += var20.field1091[0];
                    var20.field1131 += var20.field1144[0];
                    var20.field1122 = 1;
                }
                var20.field1145 = 0;
            }
            if ((var21 & 0x1000) != 0) {
                var22 = arg0.method6273();
            }
            if ((var21 & 0x100) != 0) {
                var20.field1123 = arg0.method6278();
                int var37 = arg0.method6245();
                var20.field1127 = var37 >> 16;
                var20.field1126 = (var37 & 0xFFFF) + client.field555;
                var20.field1142 = 0;
                var20.field1125 = 0;
                if (var20.field1126 > client.field555) {
                    var20.field1142 = -1;
                }
                if (var20.field1123 == 65535) {
                    var20.field1123 = -1;
                }
            }
            if ((var21 & 0x800) != 0) {
                field1242[var19] = arg0.method6273();
            }
            if ((var21 & 0x2) != 0) {
                int var38 = arg0.method6271();
                if (var38 > 0) {
                    for (int var39 = 0; var39 < var38; var39++) {
                        int var40 = -1;
                        int var41 = -1;
                        int var42 = -1;
                        int var43 = arg0.method6254();
                        if (var43 == 32767) {
                            var43 = arg0.method6254();
                            var41 = arg0.method6254();
                            var40 = arg0.method6254();
                            var42 = arg0.method6254();
                        } else if (var43 == 32766) {
                            var43 = -1;
                        } else {
                            var41 = arg0.method6254();
                        }
                        int var44 = arg0.method6254();
                        var20.method2056(var43, var41, var40, var42, client.field555, var44);
                    }
                }
                int var45 = arg0.method6269();
                if (var45 > 0) {
                    for (int var46 = 0; var46 < var45; var46++) {
                        int var47 = arg0.method6254();
                        int var48 = arg0.method6254();
                        if (var48 == 32767) {
                            var20.method2063(var47);
                        } else {
                            int var49 = arg0.method6254();
                            int var50 = arg0.method6271();
                            int var51 = var48 > 0 ? arg0.method6271() : var50;
                            var20.method2055(var47, client.field555, var48, var49, var50, var51);
                        }
                    }
                }
            }
            if (var20.field1068) {
                if (var22 == 127) {
                    var20.method2001(var20.field1069, var20.field1070);
                } else {
                    byte var52;
                    if (var22 == -1) {
                        var52 = field1242[var19];
                    } else {
                        var52 = var22;
                    }
                    var20.method2002(var20.field1069, var20.field1070, var52);
                }
            }
        }
        if (arg0.field4300 - var2 != arg1) {
            throw new RuntimeException(arg0.field4300 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bn.s(Loj;I)I")
    public static int method1892(class400 arg0) {
        int var1 = arg0.method6194(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6194(5);
        } else if (var1 == 2) {
            var2 = arg0.method6194(8);
        } else {
            var2 = arg0.method6194(11);
        }
        return var2;
    }

    @ObfuscatedName("bi.a(Loj;II)V")
    public static void method1859(class400 arg0, int arg1) {
        boolean var2 = arg0.method6194(1) == 1;
        if (var2) {
            field1252[++field1251 - 1] = arg1;
        }
        int var3 = arg0.method6194(2);
        class83 var4 = client.field587[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1068 = false;
            } else if (client.field718 == arg1) {
                throw new RuntimeException();
            } else {
                field1248[arg1] = (Statics.field4007 + var4.field1144[0] >> 13) + (Statics.field92 + var4.field1091[0] >> 13 << 14) + (var4.field1063 << 28);
                if (var4.field1113 == -1) {
                    field1249[arg1] = var4.field1137;
                } else {
                    field1249[arg1] = var4.field1113;
                }
                field1250[arg1] = var4.field1111;
                client.field587[arg1] = null;
                if (arg0.method6194(1) != 0) {
                    method3195(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6194(3);
            int var6 = var4.field1091[0];
            int var7 = var4.field1144[0];
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
            if (client.field718 == arg1 && var4.field1092 < 1536 || var4.field1085 < 1536 || var4.field1092 >= 11776 || var4.field1085 >= 11776) {
                var4.method2001(var6, var7);
                var4.field1068 = false;
            } else if (var2) {
                var4.field1068 = true;
                var4.field1069 = var6;
                var4.field1070 = var7;
            } else {
                var4.field1068 = false;
                var4.method2002(var6, var7, field1242[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6194(4);
            int var9 = var4.field1091[0];
            int var10 = var4.field1144[0];
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
            if (client.field718 == arg1 && var4.field1092 < 1536 || var4.field1085 < 1536 || var4.field1092 >= 11776 || var4.field1085 >= 11776) {
                var4.method2001(var9, var10);
                var4.field1068 = false;
            } else if (var2) {
                var4.field1068 = true;
                var4.field1069 = var9;
                var4.field1070 = var10;
            } else {
                var4.field1068 = false;
                var4.method2002(var9, var10, field1242[arg1]);
            }
        } else {
            int var11 = arg0.method6194(1);
            if (var11 == 0) {
                int var12 = arg0.method6194(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1091[0] + var14;
                int var17 = var4.field1144[0] + var15;
                if (client.field718 == arg1 && var4.field1092 < 1536 || var4.field1085 < 1536 || var4.field1092 >= 11776 || var4.field1085 >= 11776) {
                    var4.method2001(var16, var17);
                    var4.field1068 = false;
                } else if (var2) {
                    var4.field1068 = true;
                    var4.field1069 = var16;
                    var4.field1070 = var17;
                } else {
                    var4.field1068 = false;
                    var4.method2002(var16, var17, field1242[arg1]);
                }
                var4.field1063 = (byte) (var4.field1063 + var13 & 0x3);
                if (client.field718 == arg1) {
                    Statics.field3731 = var4.field1063;
                }
            } else {
                int var18 = arg0.method6194(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field92 + var4.field1091[0] + var20 & 0x3FFF) - Statics.field92;
                int var23 = (Statics.field4007 + var4.field1144[0] + var21 & 0x3FFF) - Statics.field4007;
                if (client.field718 == arg1 && var4.field1092 < 1536 || var4.field1085 < 1536 || var4.field1092 >= 11776 || var4.field1085 >= 11776) {
                    var4.method2001(var22, var23);
                    var4.field1068 = false;
                } else if (var2) {
                    var4.field1068 = true;
                    var4.field1069 = var22;
                    var4.field1070 = var23;
                } else {
                    var4.field1068 = false;
                    var4.method2002(var22, var23, field1242[arg1]);
                }
                var4.field1063 = (byte) (var4.field1063 + var19 & 0x3);
                if (client.field718 == arg1) {
                    Statics.field3731 = var4.field1063;
                }
            }
        }
    }

    @ObfuscatedName("fv.o(Loj;II)Z")
    public static boolean method3195(class400 arg0, int arg1) {
        int var2 = arg0.method6194(2);
        if (var2 == 0) {
            if (arg0.method6194(1) != 0) {
                method3195(arg0, arg1);
            }
            int var3 = arg0.method6194(13);
            int var4 = arg0.method6194(13);
            boolean var5 = arg0.method6194(1) == 1;
            if (var5) {
                field1252[++field1251 - 1] = arg1;
            }
            if (client.field587[arg1] != null) {
                throw new RuntimeException();
            }
            class83 var6 = client.field587[arg1] = new class83();
            var6.field1064 = arg1;
            if (field1243[arg1] != null) {
                var6.method2010(field1243[arg1]);
            }
            var6.field1137 = field1249[arg1];
            var6.field1111 = field1250[arg1];
            int var7 = field1248[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1143[0] = field1242[arg1];
            var6.field1063 = (byte) var8;
            var6.method2001((var9 << 13) + var3 - Statics.field92, (var10 << 13) + var4 - Statics.field4007);
            var6.field1068 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6194(2);
            int var12 = field1248[arg1];
            field1248[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6194(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1248[arg1];
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
            field1248[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6194(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1248[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1248[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
