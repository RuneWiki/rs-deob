package deob;

@ObfuscatedName("cw")
public class class96 {

    @ObfuscatedName("cw.p")
    public static byte[] field1244 = new byte[2048];

    @ObfuscatedName("cw.m")
    public static class186[] field1247 = new class186[2048];

    @ObfuscatedName("cw.t")
    public static class419[] field1249 = new class419[2048];

    @ObfuscatedName("cw.s")
    public static int field1246 = 0;

    @ObfuscatedName("cw.j")
    public static int[] field1250 = new int[2048];

    @ObfuscatedName("cw.w")
    public static int field1251 = 0;

    @ObfuscatedName("cw.n")
    public static int[] field1261 = new int[2048];

    @ObfuscatedName("cw.r")
    public static int[] field1245 = new int[2048];

    @ObfuscatedName("cw.o")
    public static int[] field1254 = new int[2048];

    @ObfuscatedName("cw.v")
    public static int[] field1255 = new int[2048];

    @ObfuscatedName("cw.d")
    public static int field1256 = 0;

    @ObfuscatedName("cw.h")
    public static int[] field1257 = new int[2048];

    @ObfuscatedName("cw.g")
    public static class419 field1258 = new class419(new byte[5000]);

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.c(Lpj;B)V")
    public static final void method2989(class418 arg0) {
        arg0.method6621();
        int var1 = client.field594;
        class83 var2 = Statics.field4070 = client.field653[var1] = new class83();
        var2.field1069 = var1;
        int var3 = arg0.method6646(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1152[0] = var5 - Statics.field1533;
        var2.field1130 = (var2.field1152[0] << 7) + (var2.method2076() << 6);
        var2.field1153[0] = var6 - Statics.field1240;
        var2.field1090 = (var2.field1153[0] << 7) + (var2.method2076() << 6);
        Statics.field110 = var2.field1068 = var4;
        if (field1249[var1] != null) {
            var2.method2074(field1249[var1]);
        }
        field1246 = 0;
        field1250[++field1246 - 1] = var1;
        field1244[var1] = 0;
        field1251 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6646(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1245[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1254[var7] = 0;
                field1255[var7] = -1;
                field1261[++field1251 - 1] = var7;
                field1244[var7] = 0;
            }
        }
        arg0.method6615();
    }

    @ObfuscatedName("client.b(Lpj;II)V")
    public static final void method1444(class418 arg0, int arg1) {
        int var2 = arg0.field4475;
        field1256 = 0;
        int var3 = 0;
        arg0.method6621();
        for (int var4 = 0; var4 < field1246; var4++) {
            int var5 = field1250[var4];
            if ((field1244[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1244[var5] = (byte) (field1244[var5] | 0x2);
                } else {
                    int var6 = arg0.method6646(1);
                    if (var6 == 0) {
                        var3 = method2599(arg0);
                        field1244[var5] = (byte) (field1244[var5] | 0x2);
                    } else {
                        method4396(arg0, var5);
                    }
                }
            }
        }
        arg0.method6615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6621();
        for (int var7 = 0; var7 < field1246; var7++) {
            int var8 = field1250[var7];
            if ((field1244[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1244[var8] = (byte) (field1244[var8] | 0x2);
                } else {
                    int var9 = arg0.method6646(1);
                    if (var9 == 0) {
                        var3 = method2599(arg0);
                        field1244[var8] = (byte) (field1244[var8] | 0x2);
                    } else {
                        method4396(arg0, var8);
                    }
                }
            }
        }
        arg0.method6615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6621();
        for (int var10 = 0; var10 < field1251; var10++) {
            int var11 = field1261[var10];
            if ((field1244[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1244[var11] = (byte) (field1244[var11] | 0x2);
                } else {
                    int var12 = arg0.method6646(1);
                    if (var12 == 0) {
                        var3 = method2599(arg0);
                        field1244[var11] = (byte) (field1244[var11] | 0x2);
                    } else if (method1014(arg0, var11)) {
                        field1244[var11] = (byte) (field1244[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6621();
        for (int var13 = 0; var13 < field1251; var13++) {
            int var14 = field1261[var13];
            if ((field1244[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1244[var14] = (byte) (field1244[var14] | 0x2);
                } else {
                    int var15 = arg0.method6646(1);
                    if (var15 == 0) {
                        var3 = method2599(arg0);
                        field1244[var14] = (byte) (field1244[var14] | 0x2);
                    } else if (method1014(arg0, var14)) {
                        field1244[var14] = (byte) (field1244[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1246 = 0;
        field1251 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1244[var16] = (byte) (field1244[var16] >> 1);
            class83 var17 = client.field653[var16];
            if (var17 == null) {
                field1261[++field1251 - 1] = var16;
            } else {
                field1250[++field1246 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1256; var18++) {
            int var19 = field1257[var18];
            class83 var20 = client.field653[var19];
            int var21 = arg0.method6781();
            if ((var21 & 0x10) != 0) {
                var21 += arg0.method6781() << 8;
            }
            Statics.method1870(arg0, var19, var20, var21);
        }
        if (arg0.field4475 - var2 != arg1) {
            throw new RuntimeException(arg0.field4475 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("dl.p(Lpj;B)I")
    public static int method2599(class418 arg0) {
        int var1 = arg0.method6646(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6646(5);
        } else if (var1 == 2) {
            var2 = arg0.method6646(8);
        } else {
            var2 = arg0.method6646(11);
        }
        return var2;
    }

    @ObfuscatedName("hi.m(Lpj;IB)V")
    public static void method4396(class418 arg0, int arg1) {
        boolean var2 = arg0.method6646(1) == 1;
        if (var2) {
            field1257[++field1256 - 1] = arg1;
        }
        int var3 = arg0.method6646(2);
        class83 var4 = client.field653[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1056 = false;
            } else if (client.field594 == arg1) {
                throw new RuntimeException();
            } else {
                field1245[arg1] = (Statics.field1240 + var4.field1153[0] >> 13) + (Statics.field1533 + var4.field1152[0] >> 13 << 14) + (var4.field1068 << 28);
                if (var4.field1123 == -1) {
                    field1254[arg1] = var4.field1140;
                } else {
                    field1254[arg1] = var4.field1123;
                }
                field1255[arg1] = var4.field1156;
                client.field653[arg1] = null;
                if (arg0.method6646(1) != 0) {
                    method1014(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6646(3);
            int var6 = var4.field1152[0];
            int var7 = var4.field1153[0];
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
            if (client.field594 == arg1 && var4.field1130 < 1536 || var4.field1090 < 1536 || var4.field1130 >= 11776 || var4.field1090 >= 11776) {
                var4.method2102(var6, var7);
                var4.field1056 = false;
            } else if (var2) {
                var4.field1056 = true;
                var4.field1074 = var6;
                var4.field1055 = var7;
            } else {
                var4.field1056 = false;
                var4.method2077(var6, var7, field1247[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6646(4);
            int var9 = var4.field1152[0];
            int var10 = var4.field1153[0];
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
            if (client.field594 == arg1 && var4.field1130 < 1536 || var4.field1090 < 1536 || var4.field1130 >= 11776 || var4.field1090 >= 11776) {
                var4.method2102(var9, var10);
                var4.field1056 = false;
            } else if (var2) {
                var4.field1056 = true;
                var4.field1074 = var9;
                var4.field1055 = var10;
            } else {
                var4.field1056 = false;
                var4.method2077(var9, var10, field1247[arg1]);
            }
        } else {
            int var11 = arg0.method6646(1);
            if (var11 == 0) {
                int var12 = arg0.method6646(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1152[0] + var14;
                int var17 = var4.field1153[0] + var15;
                if (client.field594 == arg1 && var4.field1130 < 1536 || var4.field1090 < 1536 || var4.field1130 >= 11776 || var4.field1090 >= 11776) {
                    var4.method2102(var16, var17);
                    var4.field1056 = false;
                } else if (var2) {
                    var4.field1056 = true;
                    var4.field1074 = var16;
                    var4.field1055 = var17;
                } else {
                    var4.field1056 = false;
                    var4.method2077(var16, var17, field1247[arg1]);
                }
                var4.field1068 = (byte) (var4.field1068 + var13 & 0x3);
                if (client.field594 == arg1) {
                    Statics.field110 = var4.field1068;
                }
            } else {
                int var18 = arg0.method6646(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1533 + var4.field1152[0] + var20 & 0x3FFF) - Statics.field1533;
                int var23 = (Statics.field1240 + var4.field1153[0] + var21 & 0x3FFF) - Statics.field1240;
                if (client.field594 == arg1 && var4.field1130 < 1536 || var4.field1090 < 1536 || var4.field1130 >= 11776 || var4.field1090 >= 11776) {
                    var4.method2102(var22, var23);
                    var4.field1056 = false;
                } else if (var2) {
                    var4.field1056 = true;
                    var4.field1074 = var22;
                    var4.field1055 = var23;
                } else {
                    var4.field1056 = false;
                    var4.method2077(var22, var23, field1247[arg1]);
                }
                var4.field1068 = (byte) (var4.field1068 + var19 & 0x3);
                if (client.field594 == arg1) {
                    Statics.field110 = var4.field1068;
                }
            }
        }
    }

    @ObfuscatedName("bp.t(Lpj;IB)Z")
    public static boolean method1014(class418 arg0, int arg1) {
        int var2 = arg0.method6646(2);
        if (var2 == 0) {
            if (arg0.method6646(1) != 0) {
                method1014(arg0, arg1);
            }
            int var3 = arg0.method6646(13);
            int var4 = arg0.method6646(13);
            boolean var5 = arg0.method6646(1) == 1;
            if (var5) {
                field1257[++field1256 - 1] = arg1;
            }
            if (client.field653[arg1] != null) {
                throw new RuntimeException();
            }
            class83 var6 = client.field653[arg1] = new class83();
            var6.field1069 = arg1;
            if (field1249[arg1] != null) {
                var6.method2074(field1249[arg1]);
            }
            var6.field1140 = field1254[arg1];
            var6.field1156 = field1255[arg1];
            int var7 = field1245[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1154[0] = field1247[arg1];
            var6.field1068 = (byte) var8;
            var6.method2102((var9 << 13) + var3 - Statics.field1533, (var10 << 13) + var4 - Statics.field1240);
            var6.field1056 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6646(2);
            int var12 = field1245[arg1];
            field1245[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6646(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1245[arg1];
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
            field1245[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6646(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1245[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1245[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
