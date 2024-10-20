package deob;

@ObfuscatedName("cj")
public class class99 {

    @ObfuscatedName("cj.k")
    public static byte[] field1268 = new byte[2048];

    @ObfuscatedName("cj.d")
    public static byte[] field1274 = new byte[2048];

    @ObfuscatedName("cj.w")
    public static class310[] field1270 = new class310[2048];

    @ObfuscatedName("cj.v")
    public static int field1279 = 0;

    @ObfuscatedName("cj.q")
    public static int[] field1272 = new int[2048];

    @ObfuscatedName("cj.z")
    public static int field1273 = 0;

    @ObfuscatedName("cj.t")
    public static int[] field1271 = new int[2048];

    @ObfuscatedName("cj.e")
    public static int[] field1275 = new int[2048];

    @ObfuscatedName("cj.s")
    public static int[] field1276 = new int[2048];

    @ObfuscatedName("cj.p")
    public static int[] field1277 = new int[2048];

    @ObfuscatedName("cj.n")
    public static int field1266 = 0;

    @ObfuscatedName("cj.u")
    public static int[] field1280 = new int[2048];

    @ObfuscatedName("cj.h")
    public static class310 field1269 = new class310(new byte[5000]);

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kv.x(Lkj;B)V")
    public static final void method4839(class309 arg0) {
        arg0.method5086();
        int var1 = client.field798;
        class76 var2 = Statics.field3718 = client.field791[var1] = new class76();
        var2.field668 = var1;
        int var3 = arg0.method5085(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1029[0] = var5 - Statics.field591;
        var2.field984 = (var2.field1029[0] << 7) + (var2.method1181() << 6);
        var2.field1030[0] = var6 - Statics.field1153;
        var2.field974 = (var2.field1030[0] << 7) + (var2.method1181() << 6);
        Statics.field611 = var2.field667 = var4;
        if (field1270[var1] != null) {
            var2.method1174(field1270[var1]);
        }
        field1279 = 0;
        field1272[++field1279 - 1] = var1;
        field1268[var1] = 0;
        field1273 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5085(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1275[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1276[var7] = 0;
                field1277[var7] = -1;
                field1271[++field1273 - 1] = var7;
                field1268[var7] = 0;
            }
        }
        arg0.method5088();
    }

    @ObfuscatedName("w.m(Lkj;II)V")
    public static final void method50(class309 arg0, int arg1) {
        int var2 = arg0.field3711;
        field1266 = 0;
        method576(arg0);
        for (int var3 = 0; var3 < field1266; var3++) {
            int var4 = field1280[var3];
            class76 var5 = client.field791[var4];
            int var6 = arg0.method5137();
            if ((var6 & 0x40) != 0) {
                var6 += arg0.method5137() << 8;
            }
            method209(arg0, var4, var5, var6);
        }
        if (arg0.field3711 - var2 != arg1) {
            throw new RuntimeException(arg0.field3711 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("av.k(Lkj;B)V")
    public static final void method576(class309 arg0) {
        int var1 = 0;
        arg0.method5086();
        for (int var2 = 0; var2 < field1279; var2++) {
            int var3 = field1272[var2];
            if ((field1268[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1268[var3] = (byte) (field1268[var3] | 0x2);
                } else {
                    int var4 = arg0.method5085(1);
                    if (var4 == 0) {
                        var1 = method1044(arg0);
                        field1268[var3] = (byte) (field1268[var3] | 0x2);
                    } else {
                        method248(arg0, var3);
                    }
                }
            }
        }
        arg0.method5088();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5086();
        for (int var5 = 0; var5 < field1279; var5++) {
            int var6 = field1272[var5];
            if ((field1268[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1268[var6] = (byte) (field1268[var6] | 0x2);
                } else {
                    int var7 = arg0.method5085(1);
                    if (var7 == 0) {
                        var1 = method1044(arg0);
                        field1268[var6] = (byte) (field1268[var6] | 0x2);
                    } else {
                        method248(arg0, var6);
                    }
                }
            }
        }
        arg0.method5088();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5086();
        for (int var8 = 0; var8 < field1273; var8++) {
            int var9 = field1271[var8];
            if ((field1268[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1268[var9] = (byte) (field1268[var9] | 0x2);
                } else {
                    int var10 = arg0.method5085(1);
                    if (var10 == 0) {
                        var1 = method1044(arg0);
                        field1268[var9] = (byte) (field1268[var9] | 0x2);
                    } else if (method227(arg0, var9)) {
                        field1268[var9] = (byte) (field1268[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5088();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5086();
        for (int var11 = 0; var11 < field1273; var11++) {
            int var12 = field1271[var11];
            if ((field1268[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1268[var12] = (byte) (field1268[var12] | 0x2);
                } else {
                    int var13 = arg0.method5085(1);
                    if (var13 == 0) {
                        var1 = method1044(arg0);
                        field1268[var12] = (byte) (field1268[var12] | 0x2);
                    } else if (method227(arg0, var12)) {
                        field1268[var12] = (byte) (field1268[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5088();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1279 = 0;
        field1273 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1268[var14] = (byte) (field1268[var14] >> 1);
            class76 var15 = client.field791[var14];
            if (var15 == null) {
                field1271[++field1273 - 1] = var14;
            } else {
                field1272[++field1279 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bq.d(Lkj;I)I")
    public static int method1044(class309 arg0) {
        int var1 = arg0.method5085(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5085(5);
        } else if (var1 == 2) {
            var2 = arg0.method5085(8);
        } else {
            var2 = arg0.method5085(11);
        }
        return var2;
    }

    @ObfuscatedName("f.w(Lkj;IS)V")
    public static void method248(class309 arg0, int arg1) {
        boolean var2 = arg0.method5085(1) == 1;
        if (var2) {
            field1280[++field1266 - 1] = arg1;
        }
        int var3 = arg0.method5085(2);
        class76 var4 = client.field791[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field671 = false;
            } else if (client.field798 == arg1) {
                throw new RuntimeException();
            } else {
                field1275[arg1] = (Statics.field1153 + var4.field1030[0] >> 13) + (Statics.field591 + var4.field1029[0] >> 13 << 14) + (var4.field667 << 28);
                if (var4.field1016 == -1) {
                    field1276[arg1] = var4.field980;
                } else {
                    field1276[arg1] = var4.field1016;
                }
                field1277[arg1] = var4.field1000;
                client.field791[arg1] = null;
                if (arg0.method5085(1) != 0) {
                    method227(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5085(3);
            int var6 = var4.field1029[0];
            int var7 = var4.field1030[0];
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
            if (client.field798 == arg1 && var4.field984 < 1536 || var4.field974 < 1536 || var4.field984 >= 11776 || var4.field974 >= 11776) {
                var4.method1223(var6, var7);
                var4.field671 = false;
            } else if (var2) {
                var4.field671 = true;
                var4.field666 = var6;
                var4.field673 = var7;
            } else {
                var4.field671 = false;
                var4.method1183(var6, var7, field1274[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5085(4);
            int var9 = var4.field1029[0];
            int var10 = var4.field1030[0];
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
            if (client.field798 == arg1 && var4.field984 < 1536 || var4.field974 < 1536 || var4.field984 >= 11776 || var4.field974 >= 11776) {
                var4.method1223(var9, var10);
                var4.field671 = false;
            } else if (var2) {
                var4.field671 = true;
                var4.field666 = var9;
                var4.field673 = var10;
            } else {
                var4.field671 = false;
                var4.method1183(var9, var10, field1274[arg1]);
            }
        } else {
            int var11 = arg0.method5085(1);
            if (var11 == 0) {
                int var12 = arg0.method5085(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1029[0] + var14;
                int var17 = var4.field1030[0] + var15;
                if (client.field798 == arg1 && var4.field984 < 1536 || var4.field974 < 1536 || var4.field984 >= 11776 || var4.field974 >= 11776) {
                    var4.method1223(var16, var17);
                    var4.field671 = false;
                } else if (var2) {
                    var4.field671 = true;
                    var4.field666 = var16;
                    var4.field673 = var17;
                } else {
                    var4.field671 = false;
                    var4.method1183(var16, var17, field1274[arg1]);
                }
                var4.field667 = (byte) (var4.field667 + var13 & 0x3);
                if (client.field798 == arg1) {
                    Statics.field611 = var4.field667;
                }
            } else {
                int var18 = arg0.method5085(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field591 + var4.field1029[0] + var20 & 0x3FFF) - Statics.field591;
                int var23 = (Statics.field1153 + var4.field1030[0] + var21 & 0x3FFF) - Statics.field1153;
                if (client.field798 == arg1 && var4.field984 < 1536 || var4.field974 < 1536 || var4.field984 >= 11776 || var4.field974 >= 11776) {
                    var4.method1223(var22, var23);
                    var4.field671 = false;
                } else if (var2) {
                    var4.field671 = true;
                    var4.field666 = var22;
                    var4.field673 = var23;
                } else {
                    var4.field671 = false;
                    var4.method1183(var22, var23, field1274[arg1]);
                }
                var4.field667 = (byte) (var4.field667 + var19 & 0x3);
                if (client.field798 == arg1) {
                    Statics.field611 = var4.field667;
                }
            }
        }
    }

    @ObfuscatedName("c.v(Lkj;IB)Z")
    public static boolean method227(class309 arg0, int arg1) {
        int var2 = arg0.method5085(2);
        if (var2 == 0) {
            if (arg0.method5085(1) != 0) {
                method227(arg0, arg1);
            }
            int var3 = arg0.method5085(13);
            int var4 = arg0.method5085(13);
            boolean var5 = arg0.method5085(1) == 1;
            if (var5) {
                field1280[++field1266 - 1] = arg1;
            }
            if (client.field791[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field791[arg1] = new class76();
            var6.field668 = arg1;
            if (field1270[arg1] != null) {
                var6.method1174(field1270[arg1]);
            }
            var6.field980 = field1276[arg1];
            var6.field1000 = field1277[arg1];
            int var7 = field1275[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1023[0] = field1274[arg1];
            var6.field667 = (byte) var8;
            var6.method1223((var9 << 13) + var3 - Statics.field591, (var10 << 13) + var4 - Statics.field1153);
            var6.field671 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5085(2);
            int var12 = field1275[arg1];
            field1275[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5085(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1275[arg1];
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
            field1275[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5085(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1275[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1275[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("r.q(Lkj;ILbi;II)V")
    public static final void method209(class309 arg0, int arg1, class76 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x200) != 0) {
            arg2.field991 = arg0.method5138();
            arg2.field1018 = arg0.method5138();
            arg2.field973 = arg0.method5171();
            arg2.field1019 = arg0.method5169();
            arg2.field1020 = arg0.method5177() + client.field690;
            arg2.field1021 = arg0.method5177() + client.field690;
            arg2.field1022 = arg0.method5139();
            if (arg2.field671) {
                arg2.field991 += arg2.field666;
                arg2.field1018 += arg2.field673;
                arg2.field973 += arg2.field666;
                arg2.field1019 += arg2.field673;
                arg2.field1028 = 0;
            } else {
                arg2.field991 += arg2.field1029[0];
                arg2.field1018 += arg2.field1030[0];
                arg2.field973 += arg2.field1029[0];
                arg2.field1019 += arg2.field1030[0];
                arg2.field1028 = 1;
            }
            arg2.field1033 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1010 = arg0.method5176();
            int var5 = arg0.method5182();
            arg2.field1034 = var5 >> 16;
            arg2.field1014 = (var5 & 0xFFFF) + client.field690;
            arg2.field1007 = 0;
            arg2.field1013 = 0;
            if (arg2.field1014 > client.field690) {
                arg2.field1007 = -1;
            }
            if (arg2.field1010 == 65535) {
                arg2.field1010 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var6 = arg0.method5127();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg0.method5167();
            client.method119(arg2, var6, var7);
        }
        if ((arg3 & 0x2) != 0) {
            int var8 = arg0.method5137();
            byte[] var9 = new byte[var8];
            class310 var10 = new class310(var9);
            arg0.method5185(var9, 0, var8);
            field1270[arg1] = var10;
            arg2.method1174(var10);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1003 = arg0.method5257();
            if (arg2.field1003.charAt(0) == '~') {
                arg2.field1003 = arg2.field1003.substring(1);
                class101.method2911(2, arg2.field653.method4845(), arg2.field1003);
            } else if (Statics.field3718 == arg2) {
                class101.method2911(2, arg2.field653.method4845(), arg2.field1003);
            }
            arg2.field1031 = false;
            arg2.field988 = 0;
            arg2.field992 = 0;
            arg2.field990 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1000 = arg0.method5177();
            if (arg2.field1000 == 65535) {
                arg2.field1000 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            field1274[arg1] = arg0.method5170();
        }
        if ((arg3 & 0x1) != 0) {
            int var11 = arg0.method5176();
            class239 var12 = (class239) class205.method129(class239.method1122(), arg0.method5167());
            boolean var13 = arg0.method5167() == 1;
            int var14 = arg0.method5166();
            int var15 = arg0.field3711;
            if (arg2.field653 != null && arg2.field647 != null) {
                boolean var16 = false;
                if (var12.field3096 && Statics.field1253.method1776(arg2.field653)) {
                    var16 = true;
                }
                if (!var16 && client.field795 == 0 && !arg2.field652) {
                    field1269.field3711 = 0;
                    arg0.method5210(field1269.field3710, 0, var14);
                    field1269.field3711 = 0;
                    String var17 = class306.method4986(class301.method2406(class220.method3269(field1269)));
                    arg2.field1003 = var17.trim();
                    arg2.field988 = var11 >> 8;
                    arg2.field992 = var11 & 0xFF;
                    arg2.field990 = 150;
                    arg2.field1031 = var13;
                    arg2.field989 = Statics.field3718 != arg2 && var12.field3096 && client.field815 != "" && var17.toLowerCase().indexOf(client.field815) == -1;
                    int var18;
                    if (var12.field3087) {
                        var18 = var13 ? 91 : 1;
                    } else {
                        var18 = var13 ? 90 : 2;
                    }
                    if (var12.field3089 == -1) {
                        class101.method2911(var18, arg2.field653.method4845(), var17);
                    } else {
                        class101.method2911(var18, class91.method15(var12.field3089) + arg2.field653.method4845(), var17);
                    }
                }
            }
            arg0.field3711 = var14 + var15;
        }
        if ((arg3 & 0x100) != 0) {
            for (int var19 = 0; var19 < 3; var19++) {
                arg2.field650[var19] = arg0.method5257();
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var20 = arg0.method5137();
            if (var20 > 0) {
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22 = -1;
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = arg0.method5151();
                    if (var25 == 32767) {
                        var25 = arg0.method5151();
                        var23 = arg0.method5151();
                        var22 = arg0.method5151();
                        var24 = arg0.method5151();
                    } else if (var25 == 32766) {
                        var25 = -1;
                    } else {
                        var23 = arg0.method5151();
                    }
                    int var26 = arg0.method5151();
                    arg2.method1677(var25, var23, var22, var24, client.field690, var26);
                }
            }
            int var27 = arg0.method5137();
            if (var27 > 0) {
                for (int var28 = 0; var28 < var27; var28++) {
                    int var29 = arg0.method5151();
                    int var30 = arg0.method5151();
                    if (var30 == 32767) {
                        arg2.method1667(var29);
                    } else {
                        int var31 = arg0.method5151();
                        int var32 = arg0.method5137();
                        int var33 = var30 > 0 ? arg0.method5167() : var32;
                        arg2.method1666(var29, client.field690, var30, var31, var32, var33);
                    }
                }
            }
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method5170();
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1016 = arg0.method5176();
            if (arg2.field1028 == 0) {
                arg2.field980 = arg2.field1016;
                arg2.field1016 = -1;
            }
        }
        if (!arg2.field671) {
            return;
        }
        if (var4 == 127) {
            arg2.method1223(arg2.field666, arg2.field673);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1274[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1183(arg2.field666, arg2.field673, var34);
    }

    @ObfuscatedName("bi.z(I)V")
    public static void method1227() {
        field1279 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1270[var0] = null;
            field1274[var0] = 1;
        }
    }
}
