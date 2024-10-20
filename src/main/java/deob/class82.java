package deob;

@ObfuscatedName("ct")
public class class82 {

    @ObfuscatedName("ct.q")
    public static byte[] field1184 = new byte[2048];

    @ObfuscatedName("ct.b")
    public static byte[] field1178 = new byte[2048];

    @ObfuscatedName("ct.f")
    public static class183[] field1180 = new class183[2048];

    @ObfuscatedName("ct.n")
    public static int field1181 = 0;

    @ObfuscatedName("ct.h")
    public static int[] field1182 = new int[2048];

    @ObfuscatedName("ct.x")
    public static int field1183 = 0;

    @ObfuscatedName("ct.j")
    public static int[] field1176 = new int[2048];

    @ObfuscatedName("ct.a")
    public static int[] field1185 = new int[2048];

    @ObfuscatedName("ct.l")
    public static int[] field1186 = new int[2048];

    @ObfuscatedName("ct.d")
    public static int[] field1187 = new int[2048];

    @ObfuscatedName("ct.s")
    public static int field1177 = 0;

    @ObfuscatedName("ct.p")
    public static int[] field1189 = new int[2048];

    @ObfuscatedName("ct.g")
    public static class183 field1190 = new class183(new byte[5000]);

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.w(Lge;I)V")
    public static final void method1846(class190 arg0) {
        arg0.method3582();
        int var1 = client.field710;
        class61 var2 = Statics.field1949 = client.field807[var1] = new class61();
        var2.field584 = var1;
        int var3 = arg0.method3555(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field929[0] = var5 - Statics.field2316;
        var2.field901 = (var2.field929[0] << 7) + (var2.method1050() << 6);
        var2.field940[0] = var6 - Statics.field1052;
        var2.field919 = (var2.field940[0] << 7) + (var2.method1050() << 6);
        Statics.field2416 = var2.field582 = var4;
        if (field1180[var1] != null) {
            var2.method1041(field1180[var1]);
        }
        field1181 = 0;
        field1182[++field1181 - 1] = var1;
        field1184[var1] = 0;
        field1183 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3555(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1185[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1186[var7] = 0;
                field1187[var7] = -1;
                field1176[++field1183 - 1] = var7;
                field1184[var7] = 0;
            }
        }
        arg0.method3556();
    }

    @ObfuscatedName("p.m(Lge;IB)V")
    public static final void method126(class190 arg0, int arg1) {
        int var2 = arg0.field2360;
        field1177 = 0;
        method4243(arg0);
        method5094(arg0);
        if (arg0.field2360 - var2 != arg1) {
            throw new RuntimeException(arg0.field2360 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("iu.q(Lge;I)V")
    public static final void method4243(class190 arg0) {
        int var1 = 0;
        arg0.method3582();
        for (int var2 = 0; var2 < field1181; var2++) {
            int var3 = field1182[var2];
            if ((field1184[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1184[var3] = (byte) (field1184[var3] | 0x2);
                } else {
                    int var4 = arg0.method3555(1);
                    if (var4 == 0) {
                        var1 = method1714(arg0);
                        field1184[var3] = (byte) (field1184[var3] | 0x2);
                    } else {
                        method11(arg0, var3);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3582();
        for (int var5 = 0; var5 < field1181; var5++) {
            int var6 = field1182[var5];
            if ((field1184[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1184[var6] = (byte) (field1184[var6] | 0x2);
                } else {
                    int var7 = arg0.method3555(1);
                    if (var7 == 0) {
                        var1 = method1714(arg0);
                        field1184[var6] = (byte) (field1184[var6] | 0x2);
                    } else {
                        method11(arg0, var6);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3582();
        for (int var8 = 0; var8 < field1183; var8++) {
            int var9 = field1176[var8];
            if ((field1184[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1184[var9] = (byte) (field1184[var9] | 0x2);
                } else {
                    int var10 = arg0.method3555(1);
                    if (var10 == 0) {
                        var1 = method1714(arg0);
                        field1184[var9] = (byte) (field1184[var9] | 0x2);
                    } else if (method4204(arg0, var9)) {
                        field1184[var9] = (byte) (field1184[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3582();
        for (int var11 = 0; var11 < field1183; var11++) {
            int var12 = field1176[var11];
            if ((field1184[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1184[var12] = (byte) (field1184[var12] | 0x2);
                } else {
                    int var13 = arg0.method3555(1);
                    if (var13 == 0) {
                        var1 = method1714(arg0);
                        field1184[var12] = (byte) (field1184[var12] | 0x2);
                    } else if (method4204(arg0, var12)) {
                        field1184[var12] = (byte) (field1184[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1181 = 0;
        field1183 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1184[var14] = (byte) (field1184[var14] >> 1);
            class61 var15 = client.field807[var14];
            if (var15 == null) {
                field1176[++field1183 - 1] = var14;
            } else {
                field1182[++field1181 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bg.x(Lge;B)I")
    public static int method1714(class190 arg0) {
        int var1 = arg0.method3555(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3555(5);
        } else if (var1 == 2) {
            var2 = arg0.method3555(8);
        } else {
            var2 = arg0.method3555(11);
        }
        return var2;
    }

    @ObfuscatedName("m.j(Lge;II)V")
    public static void method11(class190 arg0, int arg1) {
        boolean var2 = arg0.method3555(1) == 1;
        if (var2) {
            field1189[++field1177 - 1] = arg1;
        }
        int var3 = arg0.method3555(2);
        class61 var4 = client.field807[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field587 = false;
            } else if (client.field710 == arg1) {
                throw new RuntimeException();
            } else {
                field1185[arg1] = (Statics.field1052 + var4.field940[0] >> 13) + (Statics.field2316 + var4.field929[0] >> 13 << 14) + (var4.field582 << 28);
                if (var4.field898 == -1) {
                    field1186[arg1] = var4.field935;
                } else {
                    field1186[arg1] = var4.field898;
                }
                field1187[arg1] = var4.field936;
                client.field807[arg1] = null;
                if (arg0.method3555(1) != 0) {
                    method4204(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3555(3);
            int var6 = var4.field929[0];
            int var7 = var4.field940[0];
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
            if (client.field710 == arg1 && var4.field901 < 1536 || var4.field919 < 1536 || var4.field901 >= 11776 || var4.field919 >= 11776) {
                var4.method1082(var6, var7);
                var4.field587 = false;
            } else if (var2) {
                var4.field587 = true;
                var4.field586 = var6;
                var4.field589 = var7;
            } else {
                var4.field587 = false;
                var4.method1043(var6, var7, field1178[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3555(4);
            int var9 = var4.field929[0];
            int var10 = var4.field940[0];
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
            if (client.field710 == arg1 && var4.field901 < 1536 || var4.field919 < 1536 || var4.field901 >= 11776 || var4.field919 >= 11776) {
                var4.method1082(var9, var10);
                var4.field587 = false;
            } else if (var2) {
                var4.field587 = true;
                var4.field586 = var9;
                var4.field589 = var10;
            } else {
                var4.field587 = false;
                var4.method1043(var9, var10, field1178[arg1]);
            }
        } else {
            int var11 = arg0.method3555(1);
            if (var11 == 0) {
                int var12 = arg0.method3555(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field929[0] + var14;
                int var17 = var4.field940[0] + var15;
                if (client.field710 == arg1 && var4.field901 < 1536 || var4.field919 < 1536 || var4.field901 >= 11776 || var4.field919 >= 11776) {
                    var4.method1082(var16, var17);
                    var4.field587 = false;
                } else if (var2) {
                    var4.field587 = true;
                    var4.field586 = var16;
                    var4.field589 = var17;
                } else {
                    var4.field587 = false;
                    var4.method1043(var16, var17, field1178[arg1]);
                }
                var4.field582 = (byte) (var4.field582 + var13 & 0x3);
                if (client.field710 == arg1) {
                    Statics.field2416 = var4.field582;
                }
            } else {
                int var18 = arg0.method3555(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2316 + var4.field929[0] + var20 & 0x3FFF) - Statics.field2316;
                int var23 = (Statics.field1052 + var4.field940[0] + var21 & 0x3FFF) - Statics.field1052;
                if (client.field710 == arg1 && var4.field901 < 1536 || var4.field919 < 1536 || var4.field901 >= 11776 || var4.field919 >= 11776) {
                    var4.method1082(var22, var23);
                    var4.field587 = false;
                } else if (var2) {
                    var4.field587 = true;
                    var4.field586 = var22;
                    var4.field589 = var23;
                } else {
                    var4.field587 = false;
                    var4.method1043(var22, var23, field1178[arg1]);
                }
                var4.field582 = (byte) (var4.field582 + var19 & 0x3);
                if (client.field710 == arg1) {
                    Statics.field2416 = var4.field582;
                }
            }
        }
    }

    @ObfuscatedName("hl.a(Lge;IB)Z")
    public static boolean method4204(class190 arg0, int arg1) {
        int var2 = arg0.method3555(2);
        if (var2 == 0) {
            if (arg0.method3555(1) != 0) {
                method4204(arg0, arg1);
            }
            int var3 = arg0.method3555(13);
            int var4 = arg0.method3555(13);
            boolean var5 = arg0.method3555(1) == 1;
            if (var5) {
                field1189[++field1177 - 1] = arg1;
            }
            if (client.field807[arg1] != null) {
                throw new RuntimeException();
            }
            class61 var6 = client.field807[arg1] = new class61();
            var6.field584 = arg1;
            if (field1180[arg1] != null) {
                var6.method1041(field1180[arg1]);
            }
            var6.field935 = field1186[arg1];
            var6.field936 = field1187[arg1];
            int var7 = field1185[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field941[0] = field1178[arg1];
            var6.field582 = (byte) var8;
            var6.method1082((var9 << 13) + var3 - Statics.field2316, (var10 << 13) + var4 - Statics.field1052);
            var6.field587 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3555(2);
            int var12 = field1185[arg1];
            field1185[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3555(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1185[arg1];
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
            field1185[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3555(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1185[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1185[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("kt.l(Lge;B)V")
    public static final void method5094(class190 arg0) {
        for (int var1 = 0; var1 < field1177; var1++) {
            int var2 = field1189[var1];
            class61 var3 = client.field807[var2];
            int var4 = arg0.method3436();
            if ((var4 & 0x1) != 0) {
                var4 += arg0.method3436() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x200) != 0) {
                var3.field921 = arg0.method3370();
                int var6 = arg0.method3267();
                var3.field925 = var6 >> 16;
                var3.field924 = (var6 & 0xFFFF) + client.field680;
                var3.field922 = 0;
                var3.field904 = 0;
                if (var3.field924 > client.field680) {
                    var3.field922 = -1;
                }
                if (var3.field921 == 65535) {
                    var3.field921 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                var5 = arg0.method3294();
            }
            if ((var4 & 0x80) != 0) {
                var3.field936 = arg0.method3256();
                if (var3.field936 == 65535) {
                    var3.field936 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var7 = arg0.method3436();
                byte[] var8 = new byte[var7];
                class183 var9 = new class183(var8);
                arg0.method3314(var8, 0, var7);
                field1180[var2] = var9;
                var3.method1041(var9);
            }
            if ((var4 & 0x20) != 0) {
                int var10 = arg0.method3291();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = arg0.method3293();
                        if (var15 == 32767) {
                            var15 = arg0.method3293();
                            var13 = arg0.method3293();
                            var12 = arg0.method3293();
                            var14 = arg0.method3293();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = arg0.method3293();
                        }
                        int var16 = arg0.method3293();
                        var3.method1469(var15, var13, var12, var14, client.field680, var16);
                    }
                }
                int var17 = arg0.method3436();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = arg0.method3293();
                        int var20 = arg0.method3293();
                        if (var20 == 32767) {
                            var3.method1466(var19);
                        } else {
                            int var21 = arg0.method3293();
                            int var22 = arg0.method3291();
                            int var23 = var20 > 0 ? arg0.method3247() : var22;
                            var3.method1470(var19, client.field680, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field898 = arg0.method3268();
                if (var3.field938 == 0) {
                    var3.field935 = var3.field898;
                    var3.field898 = -1;
                }
            }
            if ((var4 & 0x1000) != 0) {
                field1178[var2] = arg0.method3294();
            }
            if ((var4 & 0x800) != 0) {
                var3.field926 = arg0.method3263();
                var3.field928 = arg0.method3294();
                var3.field927 = arg0.method3263();
                var3.field889 = arg0.method3263();
                var3.field897 = arg0.method3268() + client.field680;
                var3.field902 = arg0.method3256() + client.field680;
                var3.field932 = arg0.method3256();
                if (var3.field587) {
                    var3.field926 += var3.field586;
                    var3.field928 += var3.field589;
                    var3.field927 += var3.field586;
                    var3.field889 += var3.field589;
                    var3.field938 = 0;
                } else {
                    var3.field926 += var3.field929[0];
                    var3.field928 += var3.field940[0];
                    var3.field927 += var3.field929[0];
                    var3.field889 += var3.field940[0];
                    var3.field938 = 1;
                }
                var3.field943 = 0;
            }
            if ((var4 & 0x10) != 0) {
                int var24 = arg0.method3256();
                class243 var25 = (class243) class178.method90(class243.method4860(), arg0.method3247());
                boolean var26 = arg0.method3247() == 1;
                int var27 = arg0.method3247();
                int var28 = arg0.field2360;
                if (var3.field588 != null && var3.field562 != null) {
                    boolean var29 = false;
                    if (var25.field3137 && Statics.field1454.method1553(var3.field588)) {
                        var29 = true;
                    }
                    if (!var29 && client.field707 == 0 && !var3.field568) {
                        field1190.field2360 = 0;
                        arg0.method3313(field1190.field2366, 0, var27);
                        field1190.field2360 = 0;
                        String var30 = class300.method5208(class306.method998(class301.method1037(field1190)));
                        var3.field896 = var30.trim();
                        var3.field900 = var24 >> 8;
                        var3.field888 = var24 & 0xFF;
                        var3.field899 = 150;
                        var3.field939 = var26;
                        var3.field942 = Statics.field1949 != var3 && var25.field3137 && client.field809 != "" && var30.toLowerCase().indexOf(client.field809) == -1;
                        int var31;
                        if (var25.field3144) {
                            var31 = var26 ? 91 : 1;
                        } else {
                            var31 = var26 ? 90 : 2;
                        }
                        if (var25.field3143 == -1) {
                            class84.method1098(var31, var3.field588.method5048(), var30);
                        } else {
                            class84.method1098(var31, class75.method619(var25.field3143) + var3.field588.method5048(), var30);
                        }
                    }
                }
                arg0.field2360 = var27 + var28;
            }
            if ((var4 & 0x2) != 0) {
                var3.field896 = arg0.method3271();
                if (var3.field896.charAt(0) == '~') {
                    var3.field896 = var3.field896.substring(1);
                    class84.method1098(2, var3.field588.method5048(), var3.field896);
                } else if (Statics.field1949 == var3) {
                    class84.method1098(2, var3.field588.method5048(), var3.field896);
                }
                var3.field939 = false;
                var3.field900 = 0;
                var3.field888 = 0;
                var3.field899 = 150;
            }
            if ((var4 & 0x8) != 0) {
                int var32 = arg0.method3256();
                if (var32 == 65535) {
                    var32 = -1;
                }
                int var33 = arg0.method3424();
                client.method2960(var3, var32, var33);
            }
            if ((var4 & 0x400) != 0) {
                for (int var34 = 0; var34 < 3; var34++) {
                    var3.field566[var34] = arg0.method3271();
                }
            }
            if (var3.field587) {
                if (var5 == 127) {
                    var3.method1082(var3.field586, var3.field589);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field1178[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method1043(var3.field586, var3.field589, var35);
                }
            }
        }
    }

    @ObfuscatedName("client.d(I)V")
    public static void method1413() {
        field1181 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1180[var0] = null;
            field1178[var0] = 1;
        }
    }
}
