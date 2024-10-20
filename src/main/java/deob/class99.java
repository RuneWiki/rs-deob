package deob;

@ObfuscatedName("cx")
public class class99 {

    @ObfuscatedName("cx.d")
    public static byte[] field1276 = new byte[2048];

    @ObfuscatedName("cx.c")
    public static byte[] field1275 = new byte[2048];

    @ObfuscatedName("cx.y")
    public static class311[] field1270 = new class311[2048];

    @ObfuscatedName("cx.h")
    public static int field1271 = 0;

    @ObfuscatedName("cx.z")
    public static int[] field1272 = new int[2048];

    @ObfuscatedName("cx.e")
    public static int field1273 = 0;

    @ObfuscatedName("cx.q")
    public static int[] field1274 = new int[2048];

    @ObfuscatedName("cx.l")
    public static int[] field1268 = new int[2048];

    @ObfuscatedName("cx.s")
    public static int[] field1266 = new int[2048];

    @ObfuscatedName("cx.b")
    public static int[] field1277 = new int[2048];

    @ObfuscatedName("cx.a")
    public static int field1278 = 0;

    @ObfuscatedName("cx.w")
    public static int[] field1279 = new int[2048];

    @ObfuscatedName("cx.k")
    public static class311 field1280 = new class311(new byte[5000]);

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iq.n(Lkd;I)V")
    public static final void method3960(class310 arg0) {
        arg0.method5193();
        int var1 = client.field750;
        class76 var2 = Statics.field1986 = client.field671[var1] = new class76();
        var2.field637 = var1;
        int var3 = arg0.method5194(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1009[0] = var5 - Statics.field109;
        var2.field957 = (var2.field1009[0] << 7) + (var2.method1187() << 6);
        var2.field986[0] = var6 - Statics.field3212;
        var2.field954 = (var2.field986[0] << 7) + (var2.method1187() << 6);
        Statics.field1162 = var2.field650 = var4;
        if (field1270[var1] != null) {
            var2.method1225(field1270[var1]);
        }
        field1271 = 0;
        field1272[++field1271 - 1] = var1;
        field1276[var1] = 0;
        field1273 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5194(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1268[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1266[var7] = 0;
                field1277[var7] = -1;
                field1274[++field1273 - 1] = var7;
                field1276[var7] = 0;
            }
        }
        arg0.method5195();
    }

    @ObfuscatedName("ey.v(Lkd;II)V")
    public static final void method3172(class310 arg0, int arg1) {
        int var2 = arg0.field3747;
        field1278 = 0;
        method341(arg0);
        method3750(arg0);
        if (arg0.field3747 - var2 != arg1) {
            throw new RuntimeException(arg0.field3747 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ax.d(Lkd;B)V")
    public static final void method341(class310 arg0) {
        int var1 = 0;
        arg0.method5193();
        for (int var2 = 0; var2 < field1271; var2++) {
            int var3 = field1272[var2];
            if ((field1276[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1276[var3] = (byte) (field1276[var3] | 0x2);
                } else {
                    int var4 = arg0.method5194(1);
                    if (var4 == 0) {
                        var1 = method3536(arg0);
                        field1276[var3] = (byte) (field1276[var3] | 0x2);
                    } else {
                        method1684(arg0, var3);
                    }
                }
            }
        }
        arg0.method5195();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5193();
        for (int var5 = 0; var5 < field1271; var5++) {
            int var6 = field1272[var5];
            if ((field1276[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1276[var6] = (byte) (field1276[var6] | 0x2);
                } else {
                    int var7 = arg0.method5194(1);
                    if (var7 == 0) {
                        var1 = method3536(arg0);
                        field1276[var6] = (byte) (field1276[var6] | 0x2);
                    } else {
                        method1684(arg0, var6);
                    }
                }
            }
        }
        arg0.method5195();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5193();
        for (int var8 = 0; var8 < field1273; var8++) {
            int var9 = field1274[var8];
            if ((field1276[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1276[var9] = (byte) (field1276[var9] | 0x2);
                } else {
                    int var10 = arg0.method5194(1);
                    if (var10 == 0) {
                        var1 = method3536(arg0);
                        field1276[var9] = (byte) (field1276[var9] | 0x2);
                    } else if (Statics.method1745(arg0, var9)) {
                        field1276[var9] = (byte) (field1276[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5195();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5193();
        for (int var11 = 0; var11 < field1273; var11++) {
            int var12 = field1274[var11];
            if ((field1276[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1276[var12] = (byte) (field1276[var12] | 0x2);
                } else {
                    int var13 = arg0.method5194(1);
                    if (var13 == 0) {
                        var1 = method3536(arg0);
                        field1276[var12] = (byte) (field1276[var12] | 0x2);
                    } else if (Statics.method1745(arg0, var12)) {
                        field1276[var12] = (byte) (field1276[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5195();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1271 = 0;
        field1273 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1276[var14] = (byte) (field1276[var14] >> 1);
            class76 var15 = client.field671[var14];
            if (var15 == null) {
                field1274[++field1273 - 1] = var14;
            } else {
                field1272[++field1271 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("gi.c(Lkd;I)I")
    public static int method3536(class310 arg0) {
        int var1 = arg0.method5194(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5194(5);
        } else if (var1 == 2) {
            var2 = arg0.method5194(8);
        } else {
            var2 = arg0.method5194(11);
        }
        return var2;
    }

    @ObfuscatedName("bo.y(Lkd;IB)V")
    public static void method1684(class310 arg0, int arg1) {
        boolean var2 = arg0.method5194(1) == 1;
        if (var2) {
            field1279[++field1278 - 1] = arg1;
        }
        int var3 = arg0.method5194(2);
        class76 var4 = client.field671[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field653 = false;
            } else if (client.field750 == arg1) {
                throw new RuntimeException();
            } else {
                field1268[arg1] = (Statics.field3212 + var4.field986[0] >> 13) + (Statics.field109 + var4.field1009[0] >> 13 << 14) + (var4.field650 << 28);
                if (var4.field982 == -1) {
                    field1266[arg1] = var4.field1005;
                } else {
                    field1266[arg1] = var4.field982;
                }
                field1277[arg1] = var4.field980;
                client.field671[arg1] = null;
                if (arg0.method5194(1) != 0) {
                    Statics.method1745(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5194(3);
            int var6 = var4.field1009[0];
            int var7 = var4.field986[0];
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
            if (client.field750 == arg1 && var4.field957 < 1536 || var4.field954 < 1536 || var4.field957 >= 11776 || var4.field954 >= 11776) {
                var4.method1190(var6, var7);
                var4.field653 = false;
            } else if (var2) {
                var4.field653 = true;
                var4.field628 = var6;
                var4.field655 = var7;
            } else {
                var4.field653 = false;
                var4.method1189(var6, var7, field1275[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5194(4);
            int var9 = var4.field1009[0];
            int var10 = var4.field986[0];
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
            if (client.field750 == arg1 && var4.field957 < 1536 || var4.field954 < 1536 || var4.field957 >= 11776 || var4.field954 >= 11776) {
                var4.method1190(var9, var10);
                var4.field653 = false;
            } else if (var2) {
                var4.field653 = true;
                var4.field628 = var9;
                var4.field655 = var10;
            } else {
                var4.field653 = false;
                var4.method1189(var9, var10, field1275[arg1]);
            }
        } else {
            int var11 = arg0.method5194(1);
            if (var11 == 0) {
                int var12 = arg0.method5194(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1009[0] + var14;
                int var17 = var4.field986[0] + var15;
                if (client.field750 == arg1 && var4.field957 < 1536 || var4.field954 < 1536 || var4.field957 >= 11776 || var4.field954 >= 11776) {
                    var4.method1190(var16, var17);
                    var4.field653 = false;
                } else if (var2) {
                    var4.field653 = true;
                    var4.field628 = var16;
                    var4.field655 = var17;
                } else {
                    var4.field653 = false;
                    var4.method1189(var16, var17, field1275[arg1]);
                }
                var4.field650 = (byte) (var4.field650 + var13 & 0x3);
                if (client.field750 == arg1) {
                    Statics.field1162 = var4.field650;
                }
            } else {
                int var18 = arg0.method5194(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field109 + var4.field1009[0] + var20 & 0x3FFF) - Statics.field109;
                int var23 = (Statics.field3212 + var4.field986[0] + var21 & 0x3FFF) - Statics.field3212;
                if (client.field750 == arg1 && var4.field957 < 1536 || var4.field954 < 1536 || var4.field957 >= 11776 || var4.field954 >= 11776) {
                    var4.method1190(var22, var23);
                    var4.field653 = false;
                } else if (var2) {
                    var4.field653 = true;
                    var4.field628 = var22;
                    var4.field655 = var23;
                } else {
                    var4.field653 = false;
                    var4.method1189(var22, var23, field1275[arg1]);
                }
                var4.field650 = (byte) (var4.field650 + var19 & 0x3);
                if (client.field750 == arg1) {
                    Statics.field1162 = var4.field650;
                }
            }
        }
    }

    @ObfuscatedName("ha.z(Lkd;I)V")
    public static final void method3750(class310 arg0) {
        for (int var1 = 0; var1 < field1278; var1++) {
            int var2 = field1279[var1];
            class76 var3 = client.field671[var2];
            int var4 = arg0.method5310();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method5310() << 8;
            }
            method3950(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("hl.e(Lkd;ILbk;IB)V")
    public static final void method3950(class310 arg0, int arg1, class76 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1000) != 0) {
            arg2.field993 = arg0.method5277();
            arg2.field953 = arg0.method5293();
            arg2.field997 = arg0.method5303();
            arg2.field999 = arg0.method5303();
            arg2.field1000 = arg0.method5247() + client.field729;
            arg2.field1001 = arg0.method5247() + client.field729;
            arg2.field1002 = arg0.method5247();
            if (arg2.field653) {
                arg2.field993 += arg2.field628;
                arg2.field953 += arg2.field655;
                arg2.field997 += arg2.field628;
                arg2.field999 += arg2.field655;
                arg2.field964 = 0;
            } else {
                arg2.field993 += arg2.field1009[0];
                arg2.field953 += arg2.field986[0];
                arg2.field997 += arg2.field1009[0];
                arg2.field999 += arg2.field986[0];
                arg2.field964 = 1;
            }
            arg2.field1013 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field988 = arg0.method5285();
            int var5 = arg0.method5295();
            arg2.field995 = var5 >> 16;
            arg2.field994 = (var5 & 0xFFFF) + client.field729;
            arg2.field992 = 0;
            arg2.field987 = 0;
            if (arg2.field994 > client.field729) {
                arg2.field992 = -1;
            }
            if (arg2.field988 == 65535) {
                arg2.field988 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var6 = arg0.method5285();
            class240 var7 = (class240) class205.method1123(class240.method1119(), arg0.method5276());
            boolean var8 = arg0.method5332() == 1;
            int var9 = arg0.method5332();
            int var10 = arg0.field3747;
            if (arg2.field630 != null && arg2.field629 != null) {
                boolean var11 = false;
                if (var7.field3137 && Statics.field574.method1818(arg2.field630)) {
                    var11 = true;
                }
                if (!var11 && client.field779 == 0 && !arg2.field649) {
                    field1280.field3747 = 0;
                    arg0.method5296(field1280.field3746, 0, var9);
                    field1280.field3747 = 0;
                    String var12 = class307.method5122(class302.method3205(class220.method3388(field1280)));
                    arg2.field967 = var12.trim();
                    arg2.field971 = var6 >> 8;
                    arg2.field972 = var6 & 0xFF;
                    arg2.field970 = 150;
                    arg2.field968 = var8;
                    arg2.field969 = Statics.field1986 != arg2 && var7.field3137 && client.field883 != "" && var12.toLowerCase().indexOf(client.field883) == -1;
                    int var13;
                    if (var7.field3136) {
                        var13 = var8 ? 91 : 1;
                    } else {
                        var13 = var8 ? 90 : 2;
                    }
                    if (var7.field3132 == -1) {
                        class101.method314(var13, arg2.field630.method4963(), var12);
                    } else {
                        class101.method314(var13, class91.method3300(var7.field3132) + arg2.field630.method4963(), var12);
                    }
                }
            }
            arg0.field3747 = var9 + var10;
        }
        if ((arg3 & 0x100) != 0) {
            for (int var14 = 0; var14 < 3; var14++) {
                arg2.field654[var14] = arg0.method5465();
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1275[arg1] = arg0.method5277();
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field980 = arg0.method5247();
            if (arg2.field980 == 65535) {
                arg2.field980 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var15 = arg0.method5310();
            if (var15 > 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = -1;
                    int var18 = -1;
                    int var19 = -1;
                    int var20 = arg0.method5259();
                    if (var20 == 32767) {
                        var20 = arg0.method5259();
                        var18 = arg0.method5259();
                        var17 = arg0.method5259();
                        var19 = arg0.method5259();
                    } else if (var20 == 32766) {
                        var20 = -1;
                    } else {
                        var18 = arg0.method5259();
                    }
                    int var21 = arg0.method5259();
                    arg2.method1690(var20, var18, var17, var19, client.field729, var21);
                }
            }
            int var22 = arg0.method5332();
            if (var22 > 0) {
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = arg0.method5259();
                    int var25 = arg0.method5259();
                    if (var25 == 32767) {
                        arg2.method1699(var24);
                    } else {
                        int var26 = arg0.method5259();
                        int var27 = arg0.method5273();
                        int var28 = var25 > 0 ? arg0.method5332() : var27;
                        arg2.method1691(var24, client.field729, var25, var26, var27, var28);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method5277();
        }
        if ((arg3 & 0x40) != 0) {
            int var29 = arg0.method5247();
            if (var29 == 65535) {
                var29 = -1;
            }
            int var30 = arg0.method5276();
            client.method3304(arg2, var29, var30);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field982 = arg0.method5285();
            if (arg2.field964 == 0) {
                arg2.field1005 = arg2.field982;
                arg2.field982 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field967 = arg0.method5465();
            if (arg2.field967.charAt(0) == '~') {
                arg2.field967 = arg2.field967.substring(1);
                class101.method314(2, arg2.field630.method4963(), arg2.field967);
            } else if (Statics.field1986 == arg2) {
                class101.method314(2, arg2.field630.method4963(), arg2.field967);
            }
            arg2.field968 = false;
            arg2.field971 = 0;
            arg2.field972 = 0;
            arg2.field970 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var31 = arg0.method5332();
            byte[] var32 = new byte[var31];
            class311 var33 = new class311(var32);
            arg0.method5296(var32, 0, var31);
            field1270[arg1] = var33;
            arg2.method1225(var33);
        }
        if (!arg2.field653) {
            return;
        }
        if (var4 == 127) {
            arg2.method1190(arg2.field628, arg2.field655);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1275[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1189(arg2.field628, arg2.field655, var34);
    }

    @ObfuscatedName("cs.q(I)V")
    public static void method2022() {
        field1271 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1270[var0] = null;
            field1275[var0] = 1;
        }
    }
}
