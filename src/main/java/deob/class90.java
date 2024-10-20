package deob;

@ObfuscatedName("cn")
public class class90 {

    @ObfuscatedName("cn.t")
    public static byte[] field1218 = new byte[2048];

    @ObfuscatedName("cn.g")
    public static byte[] field1221 = new byte[2048];

    @ObfuscatedName("cn.l")
    public static class300[] field1222 = new class300[2048];

    @ObfuscatedName("cn.u")
    public static int field1227 = 0;

    @ObfuscatedName("cn.j")
    public static int[] field1224 = new int[2048];

    @ObfuscatedName("cn.v")
    public static int field1225 = 0;

    @ObfuscatedName("cn.d")
    public static int[] field1226 = new int[2048];

    @ObfuscatedName("cn.z")
    public static int[] field1228 = new int[2048];

    @ObfuscatedName("cn.n")
    public static int[] field1234 = new int[2048];

    @ObfuscatedName("cn.h")
    public static int[] field1219 = new int[2048];

    @ObfuscatedName("cn.f")
    public static int field1230 = 0;

    @ObfuscatedName("cn.s")
    public static int[] field1231 = new int[2048];

    @ObfuscatedName("cn.p")
    public static class300 field1232 = new class300(new byte[5000]);

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.c(Lkt;B)V")
    public static final void method1857(class299 arg0) {
        arg0.method5060();
        int var1 = client.field806;
        class67 var2 = Statics.field2495 = client.field625[var1] = new class67();
        var2.field615 = var1;
        int var3 = arg0.method5059(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field940[0] = var5 - Statics.field20;
        var2.field971 = (var2.field940[0] << 7) + (var2.method1061() << 6);
        var2.field974[0] = var6 - Statics.field553;
        var2.field918 = (var2.field974[0] << 7) + (var2.method1061() << 6);
        Statics.field562 = var2.field609 = var4;
        if (field1222[var1] != null) {
            var2.method1054(field1222[var1]);
        }
        field1227 = 0;
        field1224[++field1227 - 1] = var1;
        field1218[var1] = 0;
        field1225 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5059(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1228[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1234[var7] = 0;
                field1219[var7] = -1;
                field1226[++field1225 - 1] = var7;
                field1218[var7] = 0;
            }
        }
        arg0.method5081();
    }

    @ObfuscatedName("gh.x(Lkt;II)V")
    public static final void method3380(class299 arg0, int arg1) {
        int var2 = arg0.field3696;
        field1230 = 0;
        int var3 = 0;
        arg0.method5060();
        for (int var4 = 0; var4 < field1227; var4++) {
            int var5 = field1224[var4];
            if ((field1218[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1218[var5] = (byte) (field1218[var5] | 0x2);
                } else {
                    int var6 = arg0.method5059(1);
                    if (var6 == 0) {
                        var3 = method638(arg0);
                        field1218[var5] = (byte) (field1218[var5] | 0x2);
                    } else {
                        method972(arg0, var5);
                    }
                }
            }
        }
        arg0.method5081();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5060();
        for (int var7 = 0; var7 < field1227; var7++) {
            int var8 = field1224[var7];
            if ((field1218[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1218[var8] = (byte) (field1218[var8] | 0x2);
                } else {
                    int var9 = arg0.method5059(1);
                    if (var9 == 0) {
                        var3 = method638(arg0);
                        field1218[var8] = (byte) (field1218[var8] | 0x2);
                    } else {
                        method972(arg0, var8);
                    }
                }
            }
        }
        arg0.method5081();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5060();
        for (int var10 = 0; var10 < field1225; var10++) {
            int var11 = field1226[var10];
            if ((field1218[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1218[var11] = (byte) (field1218[var11] | 0x2);
                } else {
                    int var12 = arg0.method5059(1);
                    if (var12 == 0) {
                        var3 = method638(arg0);
                        field1218[var11] = (byte) (field1218[var11] | 0x2);
                    } else if (method1044(arg0, var11)) {
                        field1218[var11] = (byte) (field1218[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method5081();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5060();
        for (int var13 = 0; var13 < field1225; var13++) {
            int var14 = field1226[var13];
            if ((field1218[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1218[var14] = (byte) (field1218[var14] | 0x2);
                } else {
                    int var15 = arg0.method5059(1);
                    if (var15 == 0) {
                        var3 = method638(arg0);
                        field1218[var14] = (byte) (field1218[var14] | 0x2);
                    } else if (method1044(arg0, var14)) {
                        field1218[var14] = (byte) (field1218[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method5081();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1227 = 0;
        field1225 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1218[var16] = (byte) (field1218[var16] >> 1);
            class67 var17 = client.field625[var16];
            if (var17 == null) {
                field1226[++field1225 - 1] = var16;
            } else {
                field1224[++field1227 - 1] = var16;
            }
        }
        method997(arg0);
        if (arg0.field3696 - var2 != arg1) {
            throw new RuntimeException(arg0.field3696 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("aa.t(Lkt;I)I")
    public static int method638(class299 arg0) {
        int var1 = arg0.method5059(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5059(5);
        } else if (var1 == 2) {
            var2 = arg0.method5059(8);
        } else {
            var2 = arg0.method5059(11);
        }
        return var2;
    }

    @ObfuscatedName("bv.g(Lkt;II)V")
    public static void method972(class299 arg0, int arg1) {
        boolean var2 = arg0.method5059(1) == 1;
        if (var2) {
            field1231[++field1230 - 1] = arg1;
        }
        int var3 = arg0.method5059(2);
        class67 var4 = client.field625[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field608 = false;
            } else if (client.field806 == arg1) {
                throw new RuntimeException();
            } else {
                field1228[arg1] = (Statics.field553 + var4.field974[0] >> 13) + (Statics.field20 + var4.field940[0] >> 13 << 14) + (var4.field609 << 28);
                if (var4.field946 == -1) {
                    field1234[arg1] = var4.field969;
                } else {
                    field1234[arg1] = var4.field946;
                }
                field1219[arg1] = var4.field944;
                client.field625[arg1] = null;
                if (arg0.method5059(1) != 0) {
                    method1044(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5059(3);
            int var6 = var4.field940[0];
            int var7 = var4.field974[0];
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
            if (client.field806 == arg1 && var4.field971 < 1536 || var4.field918 < 1536 || var4.field971 >= 11776 || var4.field918 >= 11776) {
                var4.method1081(var6, var7);
                var4.field608 = false;
            } else if (var2) {
                var4.field608 = true;
                var4.field597 = var6;
                var4.field613 = var7;
            } else {
                var4.field608 = false;
                var4.method1063(var6, var7, field1221[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5059(4);
            int var9 = var4.field940[0];
            int var10 = var4.field974[0];
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
            if (client.field806 == arg1 && var4.field971 < 1536 || var4.field918 < 1536 || var4.field971 >= 11776 || var4.field918 >= 11776) {
                var4.method1081(var9, var10);
                var4.field608 = false;
            } else if (var2) {
                var4.field608 = true;
                var4.field597 = var9;
                var4.field613 = var10;
            } else {
                var4.field608 = false;
                var4.method1063(var9, var10, field1221[arg1]);
            }
        } else {
            int var11 = arg0.method5059(1);
            if (var11 == 0) {
                int var12 = arg0.method5059(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field940[0] + var14;
                int var17 = var4.field974[0] + var15;
                if (client.field806 == arg1 && var4.field971 < 1536 || var4.field918 < 1536 || var4.field971 >= 11776 || var4.field918 >= 11776) {
                    var4.method1081(var16, var17);
                    var4.field608 = false;
                } else if (var2) {
                    var4.field608 = true;
                    var4.field597 = var16;
                    var4.field613 = var17;
                } else {
                    var4.field608 = false;
                    var4.method1063(var16, var17, field1221[arg1]);
                }
                var4.field609 = (byte) (var4.field609 + var13 & 0x3);
                if (client.field806 == arg1) {
                    Statics.field562 = var4.field609;
                }
            } else {
                int var18 = arg0.method5059(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field20 + var4.field940[0] + var20 & 0x3FFF) - Statics.field20;
                int var23 = (Statics.field553 + var4.field974[0] + var21 & 0x3FFF) - Statics.field553;
                if (client.field806 == arg1 && var4.field971 < 1536 || var4.field918 < 1536 || var4.field971 >= 11776 || var4.field918 >= 11776) {
                    var4.method1081(var22, var23);
                    var4.field608 = false;
                } else if (var2) {
                    var4.field608 = true;
                    var4.field597 = var22;
                    var4.field613 = var23;
                } else {
                    var4.field608 = false;
                    var4.method1063(var22, var23, field1221[arg1]);
                }
                var4.field609 = (byte) (var4.field609 + var19 & 0x3);
                if (client.field806 == arg1) {
                    Statics.field562 = var4.field609;
                }
            }
        }
    }

    @ObfuscatedName("bj.l(Lkt;II)Z")
    public static boolean method1044(class299 arg0, int arg1) {
        int var2 = arg0.method5059(2);
        if (var2 == 0) {
            if (arg0.method5059(1) != 0) {
                method1044(arg0, arg1);
            }
            int var3 = arg0.method5059(13);
            int var4 = arg0.method5059(13);
            boolean var5 = arg0.method5059(1) == 1;
            if (var5) {
                field1231[++field1230 - 1] = arg1;
            }
            if (client.field625[arg1] != null) {
                throw new RuntimeException();
            }
            class67 var6 = client.field625[arg1] = new class67();
            var6.field615 = arg1;
            if (field1222[arg1] != null) {
                var6.method1054(field1222[arg1]);
            }
            var6.field969 = field1234[arg1];
            var6.field944 = field1219[arg1];
            int var7 = field1228[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field975[0] = field1221[arg1];
            var6.field609 = (byte) var8;
            var6.method1081((var9 << 13) + var3 - Statics.field20, (var10 << 13) + var4 - Statics.field553);
            var6.field608 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5059(2);
            int var12 = field1228[arg1];
            field1228[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5059(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1228[arg1];
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
            field1228[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5059(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1228[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1228[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bw.u(Lkt;I)V")
    public static final void method997(class299 arg0) {
        for (int var1 = 0; var1 < field1230; var1++) {
            int var2 = field1231[var1];
            class67 var3 = client.field625[var2];
            int var4 = arg0.method5103();
            if ((var4 & 0x10) != 0) {
                var4 += arg0.method5103() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x200) != 0) {
                for (int var6 = 0; var6 < 3; var6++) {
                    var3.field614[var6] = arg0.method5112();
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.field955 = arg0.method5304();
                int var7 = arg0.method5225();
                var3.field959 = var7 >> 16;
                var3.field958 = (var7 & 0xFFFF) + client.field628;
                var3.field919 = 0;
                var3.field917 = 0;
                if (var3.field958 > client.field628) {
                    var3.field919 = -1;
                }
                if (var3.field955 == 65535) {
                    var3.field955 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = arg0.method5185();
                byte[] var9 = new byte[var8];
                class300 var10 = new class300(var9);
                arg0.method5115(var9, 0, var8);
                field1222[var2] = var10;
                var3.method1054(var10);
            }
            if ((var4 & 0x100) != 0) {
                var5 = arg0.method5135();
            }
            if ((var4 & 0x400) != 0) {
                field1221[var2] = arg0.method5168();
            }
            if ((var4 & 0x1000) != 0) {
                var3.field960 = arg0.method5272();
                var3.field962 = arg0.method5135();
                var3.field961 = arg0.method5272();
                var3.field963 = arg0.method5136();
                var3.field964 = arg0.method5152() + client.field628;
                var3.field965 = arg0.method5097() + client.field628;
                var3.field966 = arg0.method5152();
                if (var3.field608) {
                    var3.field960 += var3.field597;
                    var3.field962 += var3.field613;
                    var3.field961 += var3.field597;
                    var3.field963 += var3.field613;
                    var3.field972 = 0;
                } else {
                    var3.field960 += var3.field940[0];
                    var3.field962 += var3.field974[0];
                    var3.field961 += var3.field940[0];
                    var3.field963 += var3.field974[0];
                    var3.field972 = 1;
                }
                var3.field970 = 0;
            }
            if ((var4 & 0x20) != 0) {
                var3.field944 = arg0.method5152();
                if (var3.field944 == 65535) {
                    var3.field944 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var11 = arg0.method5097();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method5132();
                client.method4109(var3, var11, var12);
            }
            if ((var4 & 0x4) != 0) {
                var3.field921 = arg0.method5112();
                if (var3.field921.charAt(0) == '~') {
                    var3.field921 = var3.field921.substring(1);
                    class92.method500(2, var3.field596.method4815(), var3.field921);
                } else if (Statics.field2495 == var3) {
                    class92.method500(2, var3.field596.method4815(), var3.field921);
                }
                var3.field932 = false;
                var3.field935 = 0;
                var3.field936 = 0;
                var3.field934 = 150;
            }
            if ((var4 & 0x2) != 0) {
                var3.field946 = arg0.method5141();
                if (var3.field972 == 0) {
                    var3.field969 = var3.field946;
                    var3.field946 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var13 = arg0.method5103();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method5117();
                        if (var18 == 32767) {
                            var18 = arg0.method5117();
                            var16 = arg0.method5117();
                            var15 = arg0.method5117();
                            var17 = arg0.method5117();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method5117();
                        }
                        int var19 = arg0.method5117();
                        var3.method1560(var18, var16, var15, var17, client.field628, var19);
                    }
                }
                int var20 = arg0.method5132();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method5117();
                        int var23 = arg0.method5117();
                        if (var23 == 32767) {
                            var3.method1570(var22);
                        } else {
                            int var24 = arg0.method5117();
                            int var25 = arg0.method5134();
                            int var26 = var23 > 0 ? arg0.method5134() : var25;
                            var3.method1561(var22, client.field628, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var27 = arg0.method5304();
                class229 var28 = (class229) class196.method3332(class229.method3710(), arg0.method5132());
                boolean var29 = arg0.method5134() == 1;
                int var30 = arg0.method5185();
                int var31 = arg0.field3696;
                if (var3.field596 != null && var3.field588 != null) {
                    boolean var32 = false;
                    if (var28.field3070 && Statics.field2683.method1688(var3.field596)) {
                        var32 = true;
                    }
                    if (!var32 && client.field736 == 0 && !var3.field591) {
                        field1232.field3696 = 0;
                        arg0.method5115(field1232.field3694, 0, var30);
                        field1232.field3696 = 0;
                        String var33 = class296.method4968(class291.method3355(class211.method46(field1232)));
                        var3.field921 = var33.trim();
                        var3.field935 = var27 >> 8;
                        var3.field936 = var27 & 0xFF;
                        var3.field934 = 150;
                        var3.field932 = var29;
                        var3.field957 = Statics.field2495 != var3 && var28.field3070 && client.field779 != "" && var33.toLowerCase().indexOf(client.field779) == -1;
                        int var34;
                        if (var28.field3069) {
                            var34 = var29 ? 91 : 1;
                        } else {
                            var34 = var29 ? 90 : 2;
                        }
                        if (var28.field3068 == -1) {
                            class92.method500(var34, var3.field596.method4815(), var33);
                        } else {
                            class92.method500(var34, class82.method3819(var28.field3068) + var3.field596.method4815(), var33);
                        }
                    }
                }
                arg0.field3696 = var30 + var31;
            }
            if (var3.field608) {
                if (var5 == 127) {
                    var3.method1081(var3.field597, var3.field613);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field1221[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method1063(var3.field597, var3.field613, var35);
                }
            }
        }
    }

    @ObfuscatedName("hq.j(S)V")
    public static void method3637() {
        field1227 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1222[var0] = null;
            field1221[var0] = 1;
        }
    }
}
