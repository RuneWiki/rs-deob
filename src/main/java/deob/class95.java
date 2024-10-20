package deob;

@ObfuscatedName("cb")
public class class95 {

    @ObfuscatedName("cb.r")
    public static byte[] field1398 = new byte[2048];

    @ObfuscatedName("cb.g")
    public static byte[] field1399 = new byte[2048];

    @ObfuscatedName("cb.x")
    public static class181[] field1409 = new class181[2048];

    @ObfuscatedName("cb.f")
    public static int field1401 = 0;

    @ObfuscatedName("cb.u")
    public static int[] field1402 = new int[2048];

    @ObfuscatedName("cb.t")
    public static int field1403 = 0;

    @ObfuscatedName("cb.k")
    public static int[] field1404 = new int[2048];

    @ObfuscatedName("cb.n")
    public static int[] field1405 = new int[2048];

    @ObfuscatedName("cb.d")
    public static int[] field1396 = new int[2048];

    @ObfuscatedName("cb.o")
    public static int[] field1410 = new int[2048];

    @ObfuscatedName("cb.a")
    public static int field1408 = 0;

    @ObfuscatedName("cb.q")
    public static int[] field1406 = new int[2048];

    @ObfuscatedName("cb.j")
    public static class181 field1400 = new class181(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.b(Lgd;B)V")
    public static final void method160(class187 arg0) {
        arg0.method3214();
        int var1 = client.field989;
        class74 var2 = Statics.field3721 = client.field1098[var1] = new class74();
        var2.field835 = var1;
        int var3 = arg0.method3208(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1200[0] = var5 - Statics.field269;
        var2.field1195 = (var2.field1200[0] << 7) + (var2.method990() << 6);
        var2.field1201[0] = var6 - Statics.field854;
        var2.field1157 = (var2.field1201[0] << 7) + (var2.method990() << 6);
        Statics.field376 = var2.field836 = var4;
        if (field1409[var1] != null) {
            var2.method1009(field1409[var1]);
        }
        field1401 = 0;
        field1402[++field1401 - 1] = var1;
        field1398[var1] = 0;
        field1403 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3208(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1405[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1396[var7] = 0;
                field1410[var7] = -1;
                field1404[++field1403 - 1] = var7;
                field1398[var7] = 0;
            }
        }
        arg0.method3233();
    }

    @ObfuscatedName("n.s(Lgd;II)V")
    public static final void method45(class187 arg0, int arg1) {
        int var2 = arg0.field2488;
        field1408 = 0;
        int var3 = 0;
        arg0.method3214();
        for (int var4 = 0; var4 < field1401; var4++) {
            int var5 = field1402[var4];
            if ((field1398[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1398[var5] = (byte) (field1398[var5] | 0x2);
                } else {
                    int var6 = arg0.method3208(1);
                    if (var6 == 0) {
                        var3 = method3800(arg0);
                        field1398[var5] = (byte) (field1398[var5] | 0x2);
                    } else {
                        method1443(arg0, var5);
                    }
                }
            }
        }
        arg0.method3233();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3214();
        for (int var7 = 0; var7 < field1401; var7++) {
            int var8 = field1402[var7];
            if ((field1398[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1398[var8] = (byte) (field1398[var8] | 0x2);
                } else {
                    int var9 = arg0.method3208(1);
                    if (var9 == 0) {
                        var3 = method3800(arg0);
                        field1398[var8] = (byte) (field1398[var8] | 0x2);
                    } else {
                        method1443(arg0, var8);
                    }
                }
            }
        }
        arg0.method3233();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3214();
        for (int var10 = 0; var10 < field1403; var10++) {
            int var11 = field1404[var10];
            if ((field1398[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1398[var11] = (byte) (field1398[var11] | 0x2);
                } else {
                    int var12 = arg0.method3208(1);
                    if (var12 == 0) {
                        var3 = method3800(arg0);
                        field1398[var11] = (byte) (field1398[var11] | 0x2);
                    } else if (method4434(arg0, var11)) {
                        field1398[var11] = (byte) (field1398[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3233();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3214();
        for (int var13 = 0; var13 < field1403; var13++) {
            int var14 = field1404[var13];
            if ((field1398[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1398[var14] = (byte) (field1398[var14] | 0x2);
                } else {
                    int var15 = arg0.method3208(1);
                    if (var15 == 0) {
                        var3 = method3800(arg0);
                        field1398[var14] = (byte) (field1398[var14] | 0x2);
                    } else if (method4434(arg0, var14)) {
                        field1398[var14] = (byte) (field1398[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3233();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1401 = 0;
        field1403 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1398[var16] = (byte) (field1398[var16] >> 1);
            class74 var17 = client.field1098[var16];
            if (var17 == null) {
                field1404[++field1403 - 1] = var16;
            } else {
                field1402[++field1401 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1408; var18++) {
            int var19 = field1406[var18];
            class74 var20 = client.field1098[var19];
            int var21 = arg0.method2945();
            if ((var21 & 0x80) != 0) {
                var21 += arg0.method2945() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x100) != 0) {
                field1399[var19] = arg0.method2946();
            }
            if ((var21 & 0x40) != 0) {
                var20.field1173 = arg0.method3081();
                if (var20.field1199 == 0) {
                    var20.field1183 = var20.field1173;
                    var20.field1173 = -1;
                }
            }
            if ((var21 & 0x20) != 0) {
                int var23 = arg0.method2945();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = arg0.method3086();
                        if (var28 == 32767) {
                            var28 = arg0.method3086();
                            var26 = arg0.method3086();
                            var25 = arg0.method3086();
                            var27 = arg0.method3086();
                        } else if (var28 == 32766) {
                            var28 = -1;
                        } else {
                            var26 = arg0.method3086();
                        }
                        int var29 = arg0.method3086();
                        var20.method1390(var28, var26, var25, var27, client.field872, var29);
                    }
                }
                int var30 = arg0.method2942();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = arg0.method3086();
                        int var33 = arg0.method3086();
                        if (var33 == 32767) {
                            var20.method1385(var32);
                        } else {
                            int var34 = arg0.method3086();
                            int var35 = arg0.method2973();
                            int var36 = var33 > 0 ? arg0.method2974() : var35;
                            var20.method1398(var32, client.field872, var33, var34, var35, var36);
                        }
                    }
                }
            }
            if ((var21 & 0x200) != 0) {
                for (int var37 = 0; var37 < 3; var37++) {
                    var20.field837[var37] = arg0.method2953();
                }
            }
            if ((var21 & 0x4) != 0) {
                var20.field1171 = arg0.method3081();
                if (var20.field1171 == 65535) {
                    var20.field1171 = -1;
                }
            }
            if ((var21 & 0x400) != 0) {
                var20.field1187 = arg0.method2975();
                var20.field1163 = arg0.method3037();
                var20.field1175 = arg0.method2975();
                var20.field1165 = arg0.method2975();
                var20.field1179 = arg0.method3049() + client.field872;
                var20.field1192 = arg0.method2983() + client.field872;
                var20.field1196 = arg0.method3049();
                if (var20.field819) {
                    var20.field1187 += var20.field839;
                    var20.field1163 += var20.field834;
                    var20.field1175 += var20.field839;
                    var20.field1165 += var20.field834;
                    var20.field1199 = 0;
                } else {
                    var20.field1187 += var20.field1200[0];
                    var20.field1163 += var20.field1201[0];
                    var20.field1175 += var20.field1200[0];
                    var20.field1165 += var20.field1201[0];
                    var20.field1199 = 1;
                }
                var20.field1204 = 0;
            }
            if ((var21 & 0x10) != 0) {
                int var38 = arg0.method2981();
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = arg0.method2945();
                client.method962(var20, var38, var39);
            }
            if ((var21 & 0x800) != 0) {
                var20.field1182 = arg0.method2983();
                int var40 = arg0.method2990();
                var20.field1186 = var40 >> 16;
                var20.field1185 = (var40 & 0xFFFF) + client.field872;
                var20.field1191 = 0;
                var20.field1184 = 0;
                if (var20.field1185 > client.field872) {
                    var20.field1191 = -1;
                }
                if (var20.field1182 == 65535) {
                    var20.field1182 = -1;
                }
            }
            if ((var21 & 0x1) != 0) {
                var20.field1177 = arg0.method2953();
                if (var20.field1177.charAt(0) == '~') {
                    var20.field1177 = var20.field1177.substring(1);
                    class97.method4(2, var20.field823, var20.field1177);
                } else if (Statics.field3721 == var20) {
                    class97.method4(2, var20.field823, var20.field1177);
                }
                var20.field1159 = false;
                var20.field1162 = 0;
                var20.field1146 = 0;
                var20.field1202 = 150;
            }
            if ((var21 & 0x1000) != 0) {
                var22 = arg0.method2948();
            }
            if ((var21 & 0x8) != 0) {
                int var41 = arg0.method3049();
                class238[] var42 = new class238[] { class238.field3238, class238.field3236, class238.field3235, class238.field3234, class238.field3241, class238.field3233 };
                class238 var43 = (class238) class176.method2719(var42, arg0.method2942());
                boolean var44 = arg0.method2973() == 1;
                int var45 = arg0.method2942();
                int var46 = arg0.field2488;
                if (var20.field823 != null && var20.field816 != null) {
                    boolean var47 = false;
                    if (var43.field3240 && client.method72(var20.field823)) {
                        var47 = true;
                    }
                    if (!var47 && client.field967 == 0 && !var20.field821) {
                        field1400.field2488 = 0;
                        arg0.method3026(field1400.field2495, 0, var45);
                        field1400.field2488 = 0;
                        class181 var48 = field1400;
                        String var52;
                        try {
                            int var49 = var48.method3086();
                            if (var49 > 32767) {
                                var49 = 32767;
                            }
                            byte[] var50 = new byte[var49];
                            var48.field2488 += Statics.field3708.method2884(var48.field2495, var48.field2488, var50, 0, var49);
                            String var51 = class274.method168(var50, 0, var49);
                            var52 = var51;
                        } catch (Exception var61) {
                            var52 = "Cabbage";
                        }
                        String var55 = class272.method4463(class278.method2790(var52));
                        var20.field1177 = var55.trim();
                        var20.field1162 = var41 >> 8;
                        var20.field1146 = var41 & 0xFF;
                        var20.field1202 = 150;
                        var20.field1159 = var44;
                        var20.field1160 = Statics.field3721 != var20 && var43.field3240 && client.field1066 != "" && var55.toLowerCase().indexOf(client.field1066) == -1;
                        int var56;
                        if (var43.field3232) {
                            var56 = var44 ? 91 : 1;
                        } else {
                            var56 = var44 ? 90 : 2;
                        }
                        if (var43.field3239 == -1) {
                            class97.method4(var56, var20.field823, var55);
                        } else {
                            class97.method4(var56, class88.method1379(var43.field3239) + var20.field823, var55);
                        }
                    }
                }
                arg0.field2488 = var45 + var46;
            }
            if ((var21 & 0x2) != 0) {
                int var57 = arg0.method2945();
                byte[] var58 = new byte[var57];
                class181 var59 = new class181(var58);
                arg0.method2984(var58, 0, var57);
                field1409[var19] = var59;
                var20.method1009(var59);
            }
            if (var20.field819) {
                if (var22 == 127) {
                    var20.method985(var20.field839, var20.field834);
                } else {
                    byte var60;
                    if (var22 == -1) {
                        var60 = field1399[var19];
                    } else {
                        var60 = var22;
                    }
                    var20.method988(var20.field839, var20.field834, var60);
                }
            }
        }
        if (arg0.field2488 - var2 != arg1) {
            throw new RuntimeException(arg0.field2488 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("hb.r(Lgd;I)I")
    public static int method3800(class187 arg0) {
        int var1 = arg0.method3208(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3208(5);
        } else if (var1 == 2) {
            var2 = arg0.method3208(8);
        } else {
            var2 = arg0.method3208(11);
        }
        return var2;
    }

    @ObfuscatedName("cg.g(Lgd;II)V")
    public static void method1443(class187 arg0, int arg1) {
        boolean var2 = arg0.method3208(1) == 1;
        if (var2) {
            field1406[++field1408 - 1] = arg1;
        }
        int var3 = arg0.method3208(2);
        class74 var4 = client.field1098[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field819 = false;
            } else if (client.field989 == arg1) {
                throw new RuntimeException();
            } else {
                field1405[arg1] = (Statics.field854 + var4.field1201[0] >> 13) + (Statics.field269 + var4.field1200[0] >> 13 << 14) + (var4.field836 << 28);
                if (var4.field1173 == -1) {
                    field1396[arg1] = var4.field1183;
                } else {
                    field1396[arg1] = var4.field1173;
                }
                field1410[arg1] = var4.field1171;
                client.field1098[arg1] = null;
                if (arg0.method3208(1) != 0) {
                    method4434(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3208(3);
            int var6 = var4.field1200[0];
            int var7 = var4.field1201[0];
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
            if (client.field989 == arg1 && var4.field1195 < 1536 || var4.field1157 < 1536 || var4.field1195 >= 11776 || var4.field1157 >= 11776) {
                var4.method985(var6, var7);
                var4.field819 = false;
            } else if (var2) {
                var4.field819 = true;
                var4.field839 = var6;
                var4.field834 = var7;
            } else {
                var4.field819 = false;
                var4.method988(var6, var7, field1399[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3208(4);
            int var9 = var4.field1200[0];
            int var10 = var4.field1201[0];
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
            if (client.field989 == arg1 && var4.field1195 < 1536 || var4.field1157 < 1536 || var4.field1195 >= 11776 || var4.field1157 >= 11776) {
                var4.method985(var9, var10);
                var4.field819 = false;
            } else if (var2) {
                var4.field819 = true;
                var4.field839 = var9;
                var4.field834 = var10;
            } else {
                var4.field819 = false;
                var4.method988(var9, var10, field1399[arg1]);
            }
        } else {
            int var11 = arg0.method3208(1);
            if (var11 == 0) {
                int var12 = arg0.method3208(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1200[0] + var14;
                int var17 = var4.field1201[0] + var15;
                if (client.field989 == arg1 && var4.field1195 < 1536 || var4.field1157 < 1536 || var4.field1195 >= 11776 || var4.field1157 >= 11776) {
                    var4.method985(var16, var17);
                    var4.field819 = false;
                } else if (var2) {
                    var4.field819 = true;
                    var4.field839 = var16;
                    var4.field834 = var17;
                } else {
                    var4.field819 = false;
                    var4.method988(var16, var17, field1399[arg1]);
                }
                var4.field836 = (byte) (var4.field836 + var13 & 0x3);
                if (client.field989 == arg1) {
                    Statics.field376 = var4.field836;
                }
            } else {
                int var18 = arg0.method3208(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field269 + var4.field1200[0] + var20 & 0x3FFF) - Statics.field269;
                int var23 = (Statics.field854 + var4.field1201[0] + var21 & 0x3FFF) - Statics.field854;
                if (client.field989 == arg1 && var4.field1195 < 1536 || var4.field1157 < 1536 || var4.field1195 >= 11776 || var4.field1157 >= 11776) {
                    var4.method985(var22, var23);
                    var4.field819 = false;
                } else if (var2) {
                    var4.field819 = true;
                    var4.field839 = var22;
                    var4.field834 = var23;
                } else {
                    var4.field819 = false;
                    var4.method988(var22, var23, field1399[arg1]);
                }
                var4.field836 = (byte) (var4.field836 + var19 & 0x3);
                if (client.field989 == arg1) {
                    Statics.field376 = var4.field836;
                }
            }
        }
    }

    @ObfuscatedName("ju.x(Lgd;II)Z")
    public static boolean method4434(class187 arg0, int arg1) {
        int var2 = arg0.method3208(2);
        if (var2 == 0) {
            if (arg0.method3208(1) != 0) {
                method4434(arg0, arg1);
            }
            int var3 = arg0.method3208(13);
            int var4 = arg0.method3208(13);
            boolean var5 = arg0.method3208(1) == 1;
            if (var5) {
                field1406[++field1408 - 1] = arg1;
            }
            if (client.field1098[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field1098[arg1] = new class74();
            var6.field835 = arg1;
            if (field1409[arg1] != null) {
                var6.method1009(field1409[arg1]);
            }
            var6.field1183 = field1396[arg1];
            var6.field1171 = field1410[arg1];
            int var7 = field1405[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1190[0] = field1399[arg1];
            var6.field836 = (byte) var8;
            var6.method985((var9 << 13) + var3 - Statics.field269, (var10 << 13) + var4 - Statics.field854);
            var6.field819 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3208(2);
            int var12 = field1405[arg1];
            field1405[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3208(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1405[arg1];
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
            field1405[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3208(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1405[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1405[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
