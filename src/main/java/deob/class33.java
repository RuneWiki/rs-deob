package deob;

@ObfuscatedName("ac")
public class class33 {

    @ObfuscatedName("ac.f")
    public static byte[] field756 = new byte[2048];

    @ObfuscatedName("ac.s")
    public static byte[] field757 = new byte[2048];

    @ObfuscatedName("ac.y")
    public static class119[] field758 = new class119[2048];

    @ObfuscatedName("ac.e")
    public static int field775 = 0;

    @ObfuscatedName("ac.g")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("ac.m")
    public static int field761 = 0;

    @ObfuscatedName("ac.j")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("ac.n")
    public static int[] field774 = new int[2048];

    @ObfuscatedName("ac.l")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("ac.h")
    public static int[] field759 = new int[2048];

    @ObfuscatedName("ac.i")
    public static int field766 = 0;

    @ObfuscatedName("ac.v")
    public static int[] field767 = new int[2048];

    @ObfuscatedName("ac.z")
    public static class119 field765 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.a(Ldg;I)V")
    public static final void method3169(class122 arg0) {
        arg0.method2587();
        int var1 = client.field417;
        class3 var2 = Statics.field2254 = client.field416[var1] = new class3();
        var2.field49 = var1;
        int var3 = arg0.method2583(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field867[0] = var5 - Statics.field2215;
        var2.field871 = (var2.field867[0] << 7) + (var2.method21() << 6);
        var2.field868[0] = var6 - Statics.field258;
        var2.field814 = (var2.field868[0] << 7) + (var2.method21() << 6);
        Statics.field1079 = var2.field48 = var4;
        if (field758[var1] != null) {
            var2.method20(field758[var1]);
        }
        field775 = 0;
        field760[++field775 - 1] = var1;
        field756[var1] = 0;
        field761 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2583(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field774[var7] = (var9 << 28) + (var10 << 14) + var11;
                field764[var7] = 0;
                field759[var7] = -1;
                field762[++field761 - 1] = var7;
                field756[var7] = 0;
            }
        }
        arg0.method2588();
    }

    @ObfuscatedName("o.r(Ldg;IB)V")
    public static final void method623(class122 arg0, int arg1) {
        int var2 = arg0.field1980;
        field766 = 0;
        method2277(arg0);
        for (int var3 = 0; var3 < field766; var3++) {
            int var4 = field767[var3];
            class3 var5 = client.field416[var4];
            int var6 = arg0.method2412();
            if ((var6 & 0x1) != 0) {
                var6 += arg0.method2412() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x4) != 0) {
                int var8 = arg0.method2412();
                byte[] var9 = new byte[var8];
                class119 var10 = new class119(var9);
                arg0.method2339(var9, 0, var8);
                field758[var4] = var10;
                var5.method20(var10);
            }
            if ((var6 & 0x40) != 0) {
                int var11 = arg0.method2347();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method2412();
                client.method179(var5, var11, var12);
            }
            if ((var6 & 0x10) != 0) {
                var5.field838 = arg0.method2347();
                if (var5.field838 == 65535) {
                    var5.field838 = -1;
                }
            }
            if ((var6 & 0x80) != 0) {
                var5.field826 = arg0.method2353();
                if (var5.field826.charAt(0) == '~') {
                    var5.field826 = var5.field826.substring(1);
                    class12.method2769(2, var5.field41, var5.field826);
                } else if (Statics.field2254 == var5) {
                    class12.method2769(2, var5.field41, var5.field826);
                }
                var5.field827 = false;
                var5.field823 = 0;
                var5.field828 = 0;
                var5.field856 = 150;
            }
            if ((var6 & 0x2) != 0) {
                int var13 = arg0.method2347();
                int var14 = arg0.method2412();
                var5.method733(var13, var14, client.field304);
                var5.field839 = client.field304 + 300;
                var5.field836 = arg0.method2412();
                var5.field837 = arg0.method2412();
            }
            if ((var6 & 0x20) != 0) {
                var5.field840 = arg0.method2347();
                if (var5.field866 == 0) {
                    var5.field863 = var5.field840;
                    var5.field840 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                int var15 = arg0.method2347();
                class152 var16 = (class152) class109.method2942(class152.method3685(), arg0.method2412());
                boolean var17 = arg0.method2412() == 1;
                int var18 = arg0.method2412();
                int var19 = arg0.field1980;
                if (var5.field41 != null && var5.field44 != null) {
                    boolean var20 = false;
                    if (var16.field2251 && client.method628(var5.field41)) {
                        var20 = true;
                    }
                    if (!var20 && client.field415 == 0 && !var5.field53) {
                        field765.field1980 = 0;
                        arg0.method2339(field765.field1981, 0, var18);
                        field765.field1980 = 0;
                        class119 var21 = field765;
                        String var25;
                        try {
                            int var22 = var21.method2492();
                            if (var22 > 32767) {
                                var22 = 32767;
                            }
                            byte[] var23 = new byte[var22];
                            var21.field1980 += Statics.field3178.method2274(var21.field1981, var21.field1980, var23, 0, var22);
                            String var24 = class165.method984(var23, 0, var22);
                            var25 = var24;
                        } catch (Exception var38) {
                            var25 = "Cabbage";
                        }
                        String var28 = class223.method3845(class163.method3499(var25));
                        var5.field826 = var28.trim();
                        var5.field823 = var15 >> 8;
                        var5.field828 = var15 & 0xFF;
                        var5.field856 = 150;
                        var5.field827 = var17;
                        var5.field830 = Statics.field2254 != var5 && var16.field2251 && client.field515 != "" && var28.toLowerCase().indexOf(client.field515) == -1;
                        int var29;
                        if (var16.field2250) {
                            var29 = var17 ? 91 : 1;
                        } else {
                            var29 = var17 ? 90 : 2;
                        }
                        if (var16.field2249 == -1) {
                            class12.method2769(var29, var5.field41, var28);
                        } else {
                            int var31 = var16.field2249;
                            String var32 = "<img=" + var31 + ">";
                            class12.method2769(var29, var32 + var5.field41, var28);
                        }
                    }
                }
                arg0.field1980 = var18 + var19;
            }
            if ((var6 & 0x2000) != 0) {
                var5.field860 = arg0.method2347();
                int var33 = arg0.method2350();
                var5.field853 = var33 >> 16;
                var5.field869 = (var33 & 0xFFFF) + client.field304;
                var5.field850 = 0;
                var5.field851 = 0;
                if (var5.field869 > client.field304) {
                    var5.field850 = -1;
                }
                if (var5.field860 == 65535) {
                    var5.field860 = -1;
                }
            }
            if ((var6 & 0x200) != 0) {
                var5.field854 = arg0.method2540();
                var5.field813 = arg0.method2540();
                var5.field855 = arg0.method2540();
                var5.field835 = arg0.method2540();
                var5.field858 = arg0.method2347() + client.field304;
                var5.field864 = arg0.method2347() + client.field304;
                var5.field825 = arg0.method2347();
                if (var5.field50) {
                    var5.field854 += var5.field29;
                    var5.field813 += var5.field30;
                    var5.field855 += var5.field29;
                    var5.field835 += var5.field30;
                    var5.field866 = 0;
                } else {
                    var5.field854 += var5.field867[0];
                    var5.field813 += var5.field868[0];
                    var5.field855 += var5.field867[0];
                    var5.field835 += var5.field868[0];
                    var5.field866 = 1;
                }
                var5.field862 = 0;
            }
            if ((var6 & 0x1000) != 0) {
                int var34 = arg0.method2347();
                int var35 = arg0.method2412();
                var5.method733(var34, var35, client.field304);
                var5.field839 = client.field304 + 300;
                var5.field836 = arg0.method2412();
                var5.field837 = arg0.method2412();
            }
            if ((var6 & 0x800) != 0) {
                field757[var4] = arg0.method2540();
            }
            if ((var6 & 0x100) != 0) {
                var7 = arg0.method2540();
            }
            if ((var6 & 0x400) != 0) {
                for (int var36 = 0; var36 < 3; var36++) {
                    var5.field31[var36] = arg0.method2353();
                }
            }
            if (var5.field50) {
                if (var7 == 127) {
                    var5.method40(var5.field29, var5.field30);
                } else {
                    byte var37;
                    if (var7 == -1) {
                        var37 = field757[var4];
                    } else {
                        var37 = var7;
                    }
                    var5.method23(var5.field29, var5.field30, var37);
                }
            }
        }
        if (arg0.field1980 - var2 != arg1) {
            throw new RuntimeException(arg0.field1980 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("do.f(Ldg;S)V")
    public static final void method2277(class122 arg0) {
        int var1 = 0;
        arg0.method2587();
        for (int var2 = 0; var2 < field775; var2++) {
            int var3 = field760[var2];
            if ((field756[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field756[var3] = (byte) (field756[var3] | 0x2);
                } else {
                    int var4 = arg0.method2583(1);
                    if (var4 == 0) {
                        var1 = method582(arg0);
                        field756[var3] = (byte) (field756[var3] | 0x2);
                    } else {
                        method565(arg0, var3);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2587();
        for (int var5 = 0; var5 < field775; var5++) {
            int var6 = field760[var5];
            if ((field756[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field756[var6] = (byte) (field756[var6] | 0x2);
                } else {
                    int var7 = arg0.method2583(1);
                    if (var7 == 0) {
                        var1 = method582(arg0);
                        field756[var6] = (byte) (field756[var6] | 0x2);
                    } else {
                        method565(arg0, var6);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2587();
        for (int var8 = 0; var8 < field761; var8++) {
            int var9 = field762[var8];
            if ((field756[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field756[var9] = (byte) (field756[var9] | 0x2);
                } else {
                    int var10 = arg0.method2583(1);
                    if (var10 == 0) {
                        var1 = method582(arg0);
                        field756[var9] = (byte) (field756[var9] | 0x2);
                    } else if (method51(arg0, var9)) {
                        field756[var9] = (byte) (field756[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2587();
        for (int var11 = 0; var11 < field761; var11++) {
            int var12 = field762[var11];
            if ((field756[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field756[var12] = (byte) (field756[var12] | 0x2);
                } else {
                    int var13 = arg0.method2583(1);
                    if (var13 == 0) {
                        var1 = method582(arg0);
                        field756[var12] = (byte) (field756[var12] | 0x2);
                    } else if (method51(arg0, var12)) {
                        field756[var12] = (byte) (field756[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2588();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field775 = 0;
        field761 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field756[var14] = (byte) (field756[var14] >> 1);
            class3 var15 = client.field416[var14];
            if (var15 == null) {
                field762[++field761 - 1] = var14;
            } else {
                field760[++field775 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("w.s(Ldg;B)I")
    public static int method582(class122 arg0) {
        int var1 = arg0.method2583(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2583(5);
        } else if (var1 == 2) {
            var2 = arg0.method2583(8);
        } else {
            var2 = arg0.method2583(11);
        }
        return var2;
    }

    @ObfuscatedName("p.y(Ldg;IB)V")
    public static void method565(class122 arg0, int arg1) {
        boolean var2 = arg0.method2583(1) == 1;
        if (var2) {
            field767[++field766 - 1] = arg1;
        }
        int var3 = arg0.method2583(2);
        class3 var4 = client.field416[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field50 = false;
            } else if (client.field417 == arg1) {
                throw new RuntimeException();
            } else {
                field774[arg1] = (Statics.field258 + var4.field868[0] >> 6) + (Statics.field2215 + var4.field867[0] >> 6 << 14) + (var4.field48 << 28);
                if (var4.field840 == -1) {
                    field764[arg1] = var4.field863;
                } else {
                    field764[arg1] = var4.field840;
                }
                field759[arg1] = var4.field838;
                client.field416[arg1] = null;
                if (arg0.method2583(1) != 0) {
                    method51(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2583(3);
            int var6 = var4.field867[0];
            int var7 = var4.field868[0];
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
            if (client.field417 == arg1 && var4.field871 < 1536 || var4.field814 < 1536 || var4.field871 >= 11776 || var4.field814 >= 11776) {
                var4.method40(var6, var7);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field29 = var6;
                var4.field30 = var7;
            } else {
                var4.field50 = false;
                var4.method23(var6, var7, field757[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2583(4);
            int var9 = var4.field867[0];
            int var10 = var4.field868[0];
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
            if (client.field417 == arg1 && var4.field871 < 1536 || var4.field814 < 1536 || var4.field871 >= 11776 || var4.field814 >= 11776) {
                var4.method40(var9, var10);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field29 = var9;
                var4.field30 = var10;
            } else {
                var4.field50 = false;
                var4.method23(var9, var10, field757[arg1]);
            }
        } else {
            int var11 = arg0.method2583(1);
            if (var11 == 0) {
                int var12 = arg0.method2583(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field867[0] + var14;
                int var17 = var4.field868[0] + var15;
                if (client.field417 == arg1 && var4.field871 < 1536 || var4.field814 < 1536 || var4.field871 >= 11776 || var4.field814 >= 11776) {
                    var4.method40(var16, var17);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field29 = var16;
                    var4.field30 = var17;
                } else {
                    var4.field50 = false;
                    var4.method23(var16, var17, field757[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var13 & 0x3);
                if (client.field417 == arg1) {
                    Statics.field1079 = var4.field48;
                }
            } else {
                int var18 = arg0.method2583(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2215 + var4.field867[0] + var20 & 0x3FFF) - Statics.field2215;
                int var23 = (Statics.field258 + var4.field868[0] + var21 & 0x3FFF) - Statics.field258;
                if (client.field417 == arg1 && var4.field871 < 1536 || var4.field814 < 1536 || var4.field871 >= 11776 || var4.field814 >= 11776) {
                    var4.method40(var22, var23);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field29 = var22;
                    var4.field30 = var23;
                } else {
                    var4.field50 = false;
                    var4.method23(var22, var23, field757[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var19 & 0x3);
                if (client.field417 == arg1) {
                    Statics.field1079 = var4.field48;
                }
            }
        }
    }

    @ObfuscatedName("s.e(Ldg;II)Z")
    public static boolean method51(class122 arg0, int arg1) {
        int var2 = arg0.method2583(2);
        if (var2 == 0) {
            if (arg0.method2583(1) != 0) {
                method51(arg0, arg1);
            }
            int var3 = arg0.method2583(6);
            int var4 = arg0.method2583(6);
            boolean var5 = arg0.method2583(1) == 1;
            if (var5) {
                field767[++field766 - 1] = arg1;
            }
            if (client.field416[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field416[arg1] = new class3();
            var6.field49 = arg1;
            if (field758[arg1] != null) {
                var6.method20(field758[arg1]);
            }
            var6.field863 = field764[arg1];
            var6.field838 = field759[arg1];
            int var7 = field774[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field832[0] = field757[arg1];
            var6.field48 = (byte) var8;
            var6.method40((var9 << 6) + var3 - Statics.field2215, (var10 << 6) + var4 - Statics.field258);
            var6.field50 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2583(2);
            int var12 = field774[arg1];
            field774[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2583(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field774[arg1];
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
            field774[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2583(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field774[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field774[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ek.g(I)V")
    public static void method2677() {
        field775 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field758[var0] = null;
            field757[var0] = 1;
        }
    }
}
