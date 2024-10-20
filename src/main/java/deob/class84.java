package deob;

@ObfuscatedName("ca")
public class class84 {

    @ObfuscatedName("ca.n")
    public static byte[] field1213 = new byte[2048];

    @ObfuscatedName("ca.u")
    public static byte[] field1218 = new byte[2048];

    @ObfuscatedName("ca.i")
    public static class185[] field1215 = new class185[2048];

    @ObfuscatedName("ca.r")
    public static int field1216 = 0;

    @ObfuscatedName("ca.j")
    public static int[] field1217 = new int[2048];

    @ObfuscatedName("ca.p")
    public static int field1224 = 0;

    @ObfuscatedName("ca.e")
    public static int[] field1219 = new int[2048];

    @ObfuscatedName("ca.s")
    public static int[] field1220 = new int[2048];

    @ObfuscatedName("ca.v")
    public static int[] field1221 = new int[2048];

    @ObfuscatedName("ca.k")
    public static int[] field1222 = new int[2048];

    @ObfuscatedName("ca.o")
    public static int field1211 = 0;

    @ObfuscatedName("ca.q")
    public static int[] field1223 = new int[2048];

    @ObfuscatedName("ca.l")
    public static class185 field1214 = new class185(new byte[5000]);

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.y(Lgt;I)V")
    public static final void method599(class192 arg0) {
        arg0.method3539();
        int var1 = client.field742;
        class62 var2 = Statics.field476 = client.field888[var1] = new class62();
        var2.field612 = var1;
        int var3 = arg0.method3542(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field933[0] = var5 - Statics.field2788;
        var2.field951 = (var2.field933[0] << 7) + (var2.method1058() << 6);
        var2.field974[0] = var6 - Statics.field599;
        var2.field956 = (var2.field974[0] << 7) + (var2.method1058() << 6);
        Statics.field585 = var2.field611 = var4;
        if (field1215[var1] != null) {
            var2.method1051(field1215[var1]);
        }
        field1216 = 0;
        field1217[++field1216 - 1] = var1;
        field1213[var1] = 0;
        field1224 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3542(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1220[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1221[var7] = 0;
                field1222[var7] = -1;
                field1219[++field1224 - 1] = var7;
                field1213[var7] = 0;
            }
        }
        arg0.method3543();
    }

    @ObfuscatedName("ko.c(Lgt;IB)V")
    public static final void method5245(class192 arg0, int arg1) {
        int var2 = arg0.field2374;
        field1211 = 0;
        method916(arg0);
        Statics.method5122(arg0);
        if (arg0.field2374 - var2 != arg1) {
            throw new RuntimeException(arg0.field2374 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("at.n(Lgt;B)V")
    public static final void method916(class192 arg0) {
        int var1 = 0;
        arg0.method3539();
        for (int var2 = 0; var2 < field1216; var2++) {
            int var3 = field1217[var2];
            if ((field1213[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1213[var3] = (byte) (field1213[var3] | 0x2);
                } else {
                    int var4 = arg0.method3542(1);
                    if (var4 == 0) {
                        var1 = method987(arg0);
                        field1213[var3] = (byte) (field1213[var3] | 0x2);
                    } else {
                        method600(arg0, var3);
                    }
                }
            }
        }
        arg0.method3543();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3539();
        for (int var5 = 0; var5 < field1216; var5++) {
            int var6 = field1217[var5];
            if ((field1213[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1213[var6] = (byte) (field1213[var6] | 0x2);
                } else {
                    int var7 = arg0.method3542(1);
                    if (var7 == 0) {
                        var1 = method987(arg0);
                        field1213[var6] = (byte) (field1213[var6] | 0x2);
                    } else {
                        method600(arg0, var6);
                    }
                }
            }
        }
        arg0.method3543();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3539();
        for (int var8 = 0; var8 < field1224; var8++) {
            int var9 = field1219[var8];
            if ((field1213[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1213[var9] = (byte) (field1213[var9] | 0x2);
                } else {
                    int var10 = arg0.method3542(1);
                    if (var10 == 0) {
                        var1 = method987(arg0);
                        field1213[var9] = (byte) (field1213[var9] | 0x2);
                    } else if (method1(arg0, var9)) {
                        field1213[var9] = (byte) (field1213[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3543();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3539();
        for (int var11 = 0; var11 < field1224; var11++) {
            int var12 = field1219[var11];
            if ((field1213[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1213[var12] = (byte) (field1213[var12] | 0x2);
                } else {
                    int var13 = arg0.method3542(1);
                    if (var13 == 0) {
                        var1 = method987(arg0);
                        field1213[var12] = (byte) (field1213[var12] | 0x2);
                    } else if (method1(arg0, var12)) {
                        field1213[var12] = (byte) (field1213[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3543();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1216 = 0;
        field1224 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1213[var14] = (byte) (field1213[var14] >> 1);
            class62 var15 = client.field888[var14];
            if (var15 == null) {
                field1219[++field1224 - 1] = var14;
            } else {
                field1217[++field1216 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bp.u(Lgt;I)I")
    public static int method987(class192 arg0) {
        int var1 = arg0.method3542(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3542(5);
        } else if (var1 == 2) {
            var2 = arg0.method3542(8);
        } else {
            var2 = arg0.method3542(11);
        }
        return var2;
    }

    @ObfuscatedName("ai.i(Lgt;IB)V")
    public static void method600(class192 arg0, int arg1) {
        boolean var2 = arg0.method3542(1) == 1;
        if (var2) {
            field1223[++field1211 - 1] = arg1;
        }
        int var3 = arg0.method3542(2);
        class62 var4 = client.field888[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field615 = false;
            } else if (client.field742 == arg1) {
                throw new RuntimeException();
            } else {
                field1220[arg1] = (Statics.field599 + var4.field974[0] >> 13) + (Statics.field2788 + var4.field933[0] >> 13 << 14) + (var4.field611 << 28);
                if (var4.field946 == -1) {
                    field1221[arg1] = var4.field945;
                } else {
                    field1221[arg1] = var4.field946;
                }
                field1222[arg1] = var4.field944;
                client.field888[arg1] = null;
                if (arg0.method3542(1) != 0) {
                    method1(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3542(3);
            int var6 = var4.field933[0];
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
            if (client.field742 == arg1 && var4.field951 < 1536 || var4.field956 < 1536 || var4.field951 >= 11776 || var4.field956 >= 11776) {
                var4.method1061(var6, var7);
                var4.field615 = false;
            } else if (var2) {
                var4.field615 = true;
                var4.field619 = var6;
                var4.field616 = var7;
            } else {
                var4.field615 = false;
                var4.method1063(var6, var7, field1218[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3542(4);
            int var9 = var4.field933[0];
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
            if (client.field742 == arg1 && var4.field951 < 1536 || var4.field956 < 1536 || var4.field951 >= 11776 || var4.field956 >= 11776) {
                var4.method1061(var9, var10);
                var4.field615 = false;
            } else if (var2) {
                var4.field615 = true;
                var4.field619 = var9;
                var4.field616 = var10;
            } else {
                var4.field615 = false;
                var4.method1063(var9, var10, field1218[arg1]);
            }
        } else {
            int var11 = arg0.method3542(1);
            if (var11 == 0) {
                int var12 = arg0.method3542(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field933[0] + var14;
                int var17 = var4.field974[0] + var15;
                if (client.field742 == arg1 && var4.field951 < 1536 || var4.field956 < 1536 || var4.field951 >= 11776 || var4.field956 >= 11776) {
                    var4.method1061(var16, var17);
                    var4.field615 = false;
                } else if (var2) {
                    var4.field615 = true;
                    var4.field619 = var16;
                    var4.field616 = var17;
                } else {
                    var4.field615 = false;
                    var4.method1063(var16, var17, field1218[arg1]);
                }
                var4.field611 = (byte) (var4.field611 + var13 & 0x3);
                if (client.field742 == arg1) {
                    Statics.field585 = var4.field611;
                }
            } else {
                int var18 = arg0.method3542(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2788 + var4.field933[0] + var20 & 0x3FFF) - Statics.field2788;
                int var23 = (Statics.field599 + var4.field974[0] + var21 & 0x3FFF) - Statics.field599;
                if (client.field742 == arg1 && var4.field951 < 1536 || var4.field956 < 1536 || var4.field951 >= 11776 || var4.field956 >= 11776) {
                    var4.method1061(var22, var23);
                    var4.field615 = false;
                } else if (var2) {
                    var4.field615 = true;
                    var4.field619 = var22;
                    var4.field616 = var23;
                } else {
                    var4.field615 = false;
                    var4.method1063(var22, var23, field1218[arg1]);
                }
                var4.field611 = (byte) (var4.field611 + var19 & 0x3);
                if (client.field742 == arg1) {
                    Statics.field585 = var4.field611;
                }
            }
        }
    }

    @ObfuscatedName("y.p(Lgt;IB)Z")
    public static boolean method1(class192 arg0, int arg1) {
        int var2 = arg0.method3542(2);
        if (var2 == 0) {
            if (arg0.method3542(1) != 0) {
                method1(arg0, arg1);
            }
            int var3 = arg0.method3542(13);
            int var4 = arg0.method3542(13);
            boolean var5 = arg0.method3542(1) == 1;
            if (var5) {
                field1223[++field1211 - 1] = arg1;
            }
            if (client.field888[arg1] != null) {
                throw new RuntimeException();
            }
            class62 var6 = client.field888[arg1] = new class62();
            var6.field612 = arg1;
            if (field1215[arg1] != null) {
                var6.method1051(field1215[arg1]);
            }
            var6.field945 = field1221[arg1];
            var6.field944 = field1222[arg1];
            int var7 = field1220[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field918[0] = field1218[arg1];
            var6.field611 = (byte) var8;
            var6.method1061((var9 << 13) + var3 - Statics.field2788, (var10 << 13) + var4 - Statics.field599);
            var6.field615 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3542(2);
            int var12 = field1220[arg1];
            field1220[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3542(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1220[arg1];
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
            field1220[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3542(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1220[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1220[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("l.s(Lgt;ILbg;II)V")
    public static final void method130(class192 arg0, int arg1, class62 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x200) != 0) {
            for (int var5 = 0; var5 < 3; var5++) {
                arg2.field590[var5] = arg0.method3277();
            }
        }
        if ((arg3 & 0x2) != 0) {
            int var6 = arg0.method3297();
            byte[] var7 = new byte[var6];
            class185 var8 = new class185(var7);
            arg0.method3480(var7, 0, var6);
            field1215[arg1] = var8;
            arg2.method1051(var8);
        }
        if ((arg3 & 0x80) != 0) {
            int var9 = arg0.method3307();
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = arg0.method3299();
            client.method4221(arg2, var9, var10);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field946 = arg0.method3363();
            if (arg2.field972 == 0) {
                arg2.field945 = arg2.field946;
                arg2.field946 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field944 = arg0.method3280();
            if (arg2.field944 == 65535) {
                arg2.field944 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field975 = arg0.method3280();
            int var11 = arg0.method3445();
            arg2.field959 = var11 >> 16;
            arg2.field958 = (var11 & 0xFFFF) + client.field637;
            arg2.field934 = 0;
            arg2.field954 = 0;
            if (arg2.field958 > client.field637) {
                arg2.field934 = -1;
            }
            if (arg2.field975 == 65535) {
                arg2.field975 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var12 = arg0.method3306();
            class245 var13 = (class245) class180.method3179(class245.method4213(), arg0.method3299());
            boolean var14 = arg0.method3298() == 1;
            int var15 = arg0.method3298();
            int var16 = arg0.field2374;
            if (arg2.field593 != null && arg2.field591 != null) {
                boolean var17 = false;
                if (var13.field3173 && Statics.field391.method1523(arg2.field593)) {
                    var17 = true;
                }
                if (!var17 && client.field739 == 0 && !arg2.field601) {
                    field1214.field2374 = 0;
                    arg0.method3401(field1214.field2373, 0, var15);
                    field1214.field2374 = 0;
                    String var18 = class302.method5143(class308.method267(class303.method4508(field1214)));
                    arg2.field931 = var18.trim();
                    arg2.field935 = var12 >> 8;
                    arg2.field936 = var12 & 0xFF;
                    arg2.field968 = 150;
                    arg2.field966 = var14;
                    arg2.field969 = Statics.field476 != arg2 && var13.field3173 && client.field820 != "" && var18.toLowerCase().indexOf(client.field820) == -1;
                    int var19;
                    if (var13.field3172) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field3166 == -1) {
                        class86.method876(var19, arg2.field593.method5079(), var18);
                    } else {
                        class86.method876(var19, class76.method93(var13.field3166) + arg2.field593.method5079(), var18);
                    }
                }
            }
            arg0.field2374 = var15 + var16;
        }
        if ((arg3 & 0x8) != 0) {
            int var20 = arg0.method3298();
            if (var20 > 0) {
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22 = -1;
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = arg0.method3356();
                    if (var25 == 32767) {
                        var25 = arg0.method3356();
                        var23 = arg0.method3356();
                        var22 = arg0.method3356();
                        var24 = arg0.method3356();
                    } else if (var25 == 32766) {
                        var25 = -1;
                    } else {
                        var23 = arg0.method3356();
                    }
                    int var26 = arg0.method3356();
                    arg2.method1458(var25, var23, var22, var24, client.field637, var26);
                }
            }
            int var27 = arg0.method3403();
            if (var27 > 0) {
                for (int var28 = 0; var28 < var27; var28++) {
                    int var29 = arg0.method3356();
                    int var30 = arg0.method3356();
                    if (var30 == 32767) {
                        arg2.method1462(var29);
                    } else {
                        int var31 = arg0.method3356();
                        int var32 = arg0.method3403();
                        int var33 = var30 > 0 ? arg0.method3299() : var32;
                        arg2.method1459(var29, client.field637, var30, var31, var32, var33);
                    }
                }
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field960 = arg0.method3301();
            arg2.field937 = arg0.method3319();
            arg2.field961 = arg0.method3455();
            arg2.field963 = arg0.method3319();
            arg2.field919 = arg0.method3363() + client.field637;
            arg2.field965 = arg0.method3306() + client.field637;
            arg2.field929 = arg0.method3363();
            if (arg2.field615) {
                arg2.field960 += arg2.field619;
                arg2.field937 += arg2.field616;
                arg2.field961 += arg2.field619;
                arg2.field963 += arg2.field616;
                arg2.field972 = 0;
            } else {
                arg2.field960 += arg2.field933[0];
                arg2.field937 += arg2.field974[0];
                arg2.field961 += arg2.field933[0];
                arg2.field963 += arg2.field974[0];
                arg2.field972 = 1;
            }
            arg2.field977 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field931 = arg0.method3277();
            if (arg2.field931.charAt(0) == '~') {
                arg2.field931 = arg2.field931.substring(1);
                class86.method876(2, arg2.field593.method5079(), arg2.field931);
            } else if (Statics.field476 == arg2) {
                class86.method876(2, arg2.field593.method5079(), arg2.field931);
            }
            arg2.field966 = false;
            arg2.field935 = 0;
            arg2.field936 = 0;
            arg2.field968 = 150;
        }
        if ((arg3 & 0x100) != 0) {
            field1218[arg1] = arg0.method3300();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method3455();
        }
        if (!arg2.field615) {
            return;
        }
        if (var4 == 127) {
            arg2.method1061(arg2.field619, arg2.field616);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1218[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1063(arg2.field619, arg2.field616, var34);
    }

    @ObfuscatedName("bp.v(I)V")
    public static void method986() {
        field1216 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1215[var0] = null;
            field1218[var0] = 1;
        }
    }
}
