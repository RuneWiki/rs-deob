package deob;

@ObfuscatedName("ax")
public class class33 {

    @ObfuscatedName("ax.k")
    public static byte[] field753 = new byte[2048];

    @ObfuscatedName("ax.t")
    public static byte[] field756 = new byte[2048];

    @ObfuscatedName("ax.g")
    public static class119[] field770 = new class119[2048];

    @ObfuscatedName("ax.o")
    public static int field754 = 0;

    @ObfuscatedName("ax.i")
    public static int[] field757 = new int[2048];

    @ObfuscatedName("ax.w")
    public static int field758 = 0;

    @ObfuscatedName("ax.m")
    public static int[] field759 = new int[2048];

    @ObfuscatedName("ax.r")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("ax.y")
    public static int[] field752 = new int[2048];

    @ObfuscatedName("ax.q")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("ax.f")
    public static int field755 = 0;

    @ObfuscatedName("ax.x")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("ax.d")
    public static class119 field765 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.c(Ldg;I)V")
    public static final void method45(class122 arg0) {
        arg0.method2533();
        int var1 = client.field399;
        class3 var2 = Statics.field2644 = client.field404[var1] = new class3();
        var2.field53 = var1;
        int var3 = arg0.method2530(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field866[0] = var5 - Statics.field14;
        var2.field859 = (var2.field866[0] << 7) + (var2.method20() << 6);
        var2.field867[0] = var6 - Statics.field1436;
        var2.field839 = (var2.field867[0] << 7) + (var2.method20() << 6);
        Statics.field2983 = var2.field52 = var4;
        if (field770[var1] != null) {
            var2.method25(field770[var1]);
        }
        field754 = 0;
        field757[++field754 - 1] = var1;
        field753[var1] = 0;
        field758 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2530(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field760[var7] = (var9 << 28) + (var10 << 14) + var11;
                field752[var7] = 0;
                field762[var7] = -1;
                field759[++field758 - 1] = var7;
                field753[var7] = 0;
            }
        }
        arg0.method2531();
    }

    @ObfuscatedName("h.h(Ldg;II)V")
    public static final void method8(class122 arg0, int arg1) {
        field755 = 0;
        int var2 = 0;
        arg0.method2533();
        for (int var3 = 0; var3 < field754; var3++) {
            int var4 = field757[var3];
            if ((field753[var4] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    field753[var4] = (byte) (field753[var4] | 0x2);
                } else {
                    int var5 = arg0.method2530(1);
                    if (var5 == 0) {
                        var2 = method821(arg0);
                        field753[var4] = (byte) (field753[var4] | 0x2);
                    } else {
                        method41(arg0, var4);
                    }
                }
            }
        }
        arg0.method2531();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method2533();
        for (int var6 = 0; var6 < field754; var6++) {
            int var7 = field757[var6];
            if ((field753[var7] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    field753[var7] = (byte) (field753[var7] | 0x2);
                } else {
                    int var8 = arg0.method2530(1);
                    if (var8 == 0) {
                        var2 = method821(arg0);
                        field753[var7] = (byte) (field753[var7] | 0x2);
                    } else {
                        method41(arg0, var7);
                    }
                }
            }
        }
        arg0.method2531();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method2533();
        for (int var9 = 0; var9 < field758; var9++) {
            int var10 = field759[var9];
            if ((field753[var10] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    field753[var10] = (byte) (field753[var10] | 0x2);
                } else {
                    int var11 = arg0.method2530(1);
                    if (var11 == 0) {
                        var2 = method821(arg0);
                        field753[var10] = (byte) (field753[var10] | 0x2);
                    } else if (Statics.method2753(arg0, var10)) {
                        field753[var10] = (byte) (field753[var10] | 0x2);
                    }
                }
            }
        }
        arg0.method2531();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method2533();
        for (int var12 = 0; var12 < field758; var12++) {
            int var13 = field759[var12];
            if ((field753[var13] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    field753[var13] = (byte) (field753[var13] | 0x2);
                } else {
                    int var14 = arg0.method2530(1);
                    if (var14 == 0) {
                        var2 = method821(arg0);
                        field753[var13] = (byte) (field753[var13] | 0x2);
                    } else if (Statics.method2753(arg0, var13)) {
                        field753[var13] = (byte) (field753[var13] | 0x2);
                    }
                }
            }
        }
        arg0.method2531();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        field754 = 0;
        field758 = 0;
        for (int var15 = 1; var15 < 2048; var15++) {
            field753[var15] = (byte) (field753[var15] >> 1);
            class3 var16 = client.field404[var15];
            if (var16 == null) {
                field759[++field758 - 1] = var15;
            } else {
                field757[++field754 - 1] = var15;
            }
        }
        for (int var17 = 0; var17 < field755; var17++) {
            int var18 = field764[var17];
            class3 var19 = client.field404[var18];
            int var20 = arg0.method2291();
            if ((var20 & 0x1) != 0) {
                var20 += arg0.method2291() << 8;
            }
            byte var21 = -1;
            if ((var20 & 0x4) != 0) {
                int var22 = arg0.method2291();
                byte[] var23 = new byte[var22];
                class119 var24 = new class119(var23);
                arg0.method2302(var23, 0, var22);
                field770[var18] = var24;
                var19.method25(var24);
            }
            if ((var20 & 0x8) != 0) {
                int var25 = arg0.method2293();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = arg0.method2291();
                client.method2980(var19, var25, var26);
            }
            if ((var20 & 0x2) != 0) {
                var19.field837 = arg0.method2293();
                if (var19.field837 == 65535) {
                    var19.field837 = -1;
                }
            }
            if ((var20 & 0x40) != 0) {
                var19.field864 = arg0.method2299();
                if (var19.field864.charAt(0) == '~') {
                    var19.field864 = var19.field864.substring(1);
                    class12.method156(2, var19.field35, var19.field864);
                } else if (Statics.field2644 == var19) {
                    class12.method156(2, var19.field35, var19.field864);
                }
                var19.field826 = false;
                var19.field840 = 0;
                var19.field869 = 0;
                var19.field828 = 150;
            }
            if ((var20 & 0x80) != 0) {
                int var27 = arg0.method2293();
                int var28 = arg0.method2291();
                var19.method711(var27, var28, client.field285);
                var19.field834 = client.field285 + 300;
                var19.field835 = arg0.method2291();
                var19.field836 = arg0.method2291();
            }
            if ((var20 & 0x20) != 0) {
                var19.field847 = arg0.method2293();
                if (var19.field829 == 0) {
                    var19.field825 = var19.field847;
                    var19.field847 = -1;
                }
            }
            if ((var20 & 0x10) != 0) {
                int var29 = arg0.method2293();
                class152[] var30 = new class152[] { class152.field2237, class152.field2234, class152.field2236, class152.field2242, class152.field2235 };
                class152 var31 = (class152) class109.method2565(var30, arg0.method2291());
                boolean var32 = arg0.method2291() == 1;
                int var33 = arg0.method2291();
                int var34 = arg0.field1955;
                if (var19.field35 != null && var19.field43 != null) {
                    boolean var35 = false;
                    if (var31.field2241 && client.method109(var19.field35)) {
                        var35 = true;
                    }
                    if (!var35 && client.field403 == 0 && !var19.field51) {
                        field765.field1955 = 0;
                        arg0.method2302(field765.field1956, 0, var33);
                        field765.field1955 = 0;
                        class119 var36 = field765;
                        String var40;
                        try {
                            int var37 = var36.method2301();
                            if (var37 > 32767) {
                                var37 = 32767;
                            }
                            byte[] var38 = new byte[var37];
                            var36.field1955 += Statics.field3157.method2213(var36.field1956, var36.field1955, var38, 0, var37);
                            String var39 = class165.method92(var38, 0, var37);
                            var40 = var39;
                        } catch (Exception var49) {
                            var40 = "Cabbage";
                        }
                        String var43 = class223.method3736(class163.method961(var40));
                        var19.field864 = var43.trim();
                        var19.field840 = var29 >> 8;
                        var19.field869 = var29 & 0xFF;
                        var19.field828 = 150;
                        var19.field826 = var32;
                        var19.field827 = Statics.field2644 != var19 && var31.field2241 && client.field422 != "" && var43.toLowerCase().indexOf(client.field422) == -1;
                        int var44;
                        if (var31.field2244) {
                            var44 = var32 ? 91 : 1;
                        } else {
                            var44 = var32 ? 90 : 2;
                        }
                        if (var31.field2239 == -1) {
                            class12.method156(var44, var19.field35, var43);
                        } else {
                            class12.method156(var44, class2.method2000(var31.field2239) + var19.field35, var43);
                        }
                    }
                }
                arg0.field1955 = var33 + var34;
            }
            if ((var20 & 0x100) != 0) {
                var19.field848 = arg0.method2293();
                int var45 = arg0.method2296();
                var19.field855 = var45 >> 16;
                var19.field851 = (var45 & 0xFFFF) + client.field285;
                var19.field849 = 0;
                var19.field833 = 0;
                if (var19.field851 > client.field285) {
                    var19.field849 = -1;
                }
                if (var19.field848 == 65535) {
                    var19.field848 = -1;
                }
            }
            if ((var20 & 0x200) != 0) {
                var19.field853 = arg0.method2292();
                var19.field830 = arg0.method2292();
                var19.field854 = arg0.method2292();
                var19.field856 = arg0.method2292();
                var19.field857 = arg0.method2293() + client.field285;
                var19.field832 = arg0.method2293() + client.field285;
                var19.field819 = arg0.method2293();
                if (var19.field58 == -1) {
                    var19.field853 += var19.field866[0];
                    var19.field830 += var19.field867[0];
                    var19.field854 += var19.field866[0];
                    var19.field856 += var19.field867[0];
                    var19.field829 = 1;
                } else {
                    var19.field853 += var19.field58;
                    var19.field830 += var19.field55;
                    var19.field854 += var19.field58;
                    var19.field856 += var19.field55;
                    var19.field829 = 0;
                }
                var19.field870 = 0;
            }
            if ((var20 & 0x800) != 0) {
                int var46 = arg0.method2293();
                int var47 = arg0.method2291();
                var19.method711(var46, var47, client.field285);
                var19.field834 = client.field285 + 300;
                var19.field835 = arg0.method2291();
                var19.field836 = arg0.method2291();
            }
            if ((var20 & 0x400) != 0) {
                field756[var18] = arg0.method2292();
            }
            if ((var20 & 0x1000) != 0) {
                var21 = arg0.method2292();
            }
            if (var19.field58 != -1) {
                if (var21 == 127) {
                    var19.method15(var19.field58, var19.field55);
                } else {
                    byte var48;
                    if (var21 == -1) {
                        var48 = field756[var18];
                    } else {
                        var48 = var21;
                    }
                    var19.method14(var19.field58, var19.field55, var48);
                }
            }
        }
        if (arg0.field1955 != arg1) {
            throw new RuntimeException(arg0.field1955 + " " + arg1);
        }
    }

    @ObfuscatedName("av.k(Ldg;I)I")
    public static int method821(class122 arg0) {
        int var1 = arg0.method2530(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2530(5);
        } else if (var1 == 2) {
            var2 = arg0.method2530(8);
        } else {
            var2 = arg0.method2530(11);
        }
        return var2;
    }

    @ObfuscatedName("t.t(Ldg;II)V")
    public static void method41(class122 arg0, int arg1) {
        boolean var2 = arg0.method2530(1) == 1;
        if (var2) {
            field764[++field755 - 1] = arg1;
        }
        int var3 = arg0.method2530(2);
        class3 var4 = client.field404[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field58 = -1;
            } else if (client.field399 == arg1) {
                throw new RuntimeException();
            } else {
                field760[arg1] = (Statics.field1436 + var4.field867[0] >> 6) + (Statics.field14 + var4.field866[0] >> 6 << 14) + (var4.field52 << 28);
                if (var4.field847 == -1) {
                    field752[arg1] = var4.field825;
                } else {
                    field752[arg1] = var4.field847;
                }
                field762[arg1] = var4.field837;
                client.field404[arg1] = null;
                if (arg0.method2530(1) != 0) {
                    Statics.method2753(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2530(3);
            int var6 = var4.field866[0];
            int var7 = var4.field867[0];
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
            if (var2) {
                var4.field58 = var6;
                var4.field55 = var7;
            } else {
                var4.field58 = -1;
                var4.method14(var6, var7, field756[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2530(4);
            int var9 = var4.field866[0];
            int var10 = var4.field867[0];
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
            if (var2) {
                var4.field58 = var9;
                var4.field55 = var10;
            } else {
                var4.field58 = -1;
                var4.method14(var9, var10, field756[arg1]);
            }
        } else {
            int var11 = arg0.method2530(1);
            if (var11 == 0) {
                int var12 = arg0.method2530(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field866[0] + var14;
                int var17 = var4.field867[0] + var15;
                if (var2) {
                    var4.field58 = var16;
                    var4.field55 = var17;
                } else {
                    var4.field58 = -1;
                    var4.method14(var16, var17, field756[arg1]);
                }
                var4.field52 = (byte) (var4.field52 + var13 & 0x3);
                if (client.field399 == arg1) {
                    Statics.field2983 = var4.field52;
                }
            } else {
                int var18 = arg0.method2530(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field14 + var4.field866[0] + var20 & 0x3FFF) - Statics.field14;
                int var23 = (Statics.field1436 + var4.field867[0] + var21 & 0x3FFF) - Statics.field1436;
                if (var2) {
                    var4.field58 = var22;
                    var4.field55 = var23;
                } else {
                    var4.field58 = -1;
                    var4.method14(var22, var23, field756[arg1]);
                }
                var4.field52 = (byte) (var4.field52 + var19 & 0x3);
                if (client.field399 == arg1) {
                    Statics.field2983 = var4.field52;
                }
            }
        }
    }

    @ObfuscatedName("r.o(B)V")
    public static void method128() {
        field754 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field770[var0] = null;
            field756[var0] = 1;
        }
    }
}
