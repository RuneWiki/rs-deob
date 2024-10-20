package deob;

@ObfuscatedName("ah")
public class class33 {

    @ObfuscatedName("ah.q")
    public static byte[] field752 = new byte[2048];

    @ObfuscatedName("ah.o")
    public static byte[] field753 = new byte[2048];

    @ObfuscatedName("ah.g")
    public static class119[] field751 = new class119[2048];

    @ObfuscatedName("ah.m")
    public static int field755 = 0;

    @ObfuscatedName("ah.b")
    public static int[] field754 = new int[2048];

    @ObfuscatedName("ah.p")
    public static int field757 = 0;

    @ObfuscatedName("ah.t")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("ah.w")
    public static int[] field759 = new int[2048];

    @ObfuscatedName("ah.x")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("ah.k")
    public static int[] field761 = new int[2048];

    @ObfuscatedName("ah.z")
    public static int field762 = 0;

    @ObfuscatedName("ah.v")
    public static int[] field768 = new int[2048];

    @ObfuscatedName("ah.j")
    public static class119 field764 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.l(Ldx;I)V")
    public static final void method50(class122 arg0) {
        arg0.method2624();
        int var1 = client.field416;
        class3 var2 = Statics.field143 = client.field415[var1] = new class3();
        var2.field55 = var1;
        int var3 = arg0.method2625(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field865[0] = var5 - Statics.field233;
        var2.field861 = (var2.field865[0] << 7) + (var2.method17() << 6);
        var2.field866[0] = var6 - Statics.field647;
        var2.field812 = (var2.field866[0] << 7) + (var2.method17() << 6);
        Statics.field124 = var2.field54 = var4;
        if (field751[var1] != null) {
            var2.method16(field751[var1]);
        }
        field755 = 0;
        field754[++field755 - 1] = var1;
        field752[var1] = 0;
        field757 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2625(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field759[var7] = (var9 << 28) + (var10 << 14) + var11;
                field756[var7] = 0;
                field761[var7] = -1;
                field758[++field757 - 1] = var7;
                field752[var7] = 0;
            }
        }
        arg0.method2636();
    }

    @ObfuscatedName("eg.e(Ldx;IB)V")
    public static final void method2945(class122 arg0, int arg1) {
        int var2 = arg0.field1988;
        field762 = 0;
        int var3 = 0;
        arg0.method2624();
        for (int var4 = 0; var4 < field755; var4++) {
            int var5 = field754[var4];
            if ((field752[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field752[var5] = (byte) (field752[var5] | 0x2);
                } else {
                    int var6 = arg0.method2625(1);
                    if (var6 == 0) {
                        var3 = method3(arg0);
                        field752[var5] = (byte) (field752[var5] | 0x2);
                    } else {
                        method143(arg0, var5);
                    }
                }
            }
        }
        arg0.method2636();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2624();
        for (int var7 = 0; var7 < field755; var7++) {
            int var8 = field754[var7];
            if ((field752[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field752[var8] = (byte) (field752[var8] | 0x2);
                } else {
                    int var9 = arg0.method2625(1);
                    if (var9 == 0) {
                        var3 = method3(arg0);
                        field752[var8] = (byte) (field752[var8] | 0x2);
                    } else {
                        method143(arg0, var8);
                    }
                }
            }
        }
        arg0.method2636();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2624();
        for (int var10 = 0; var10 < field757; var10++) {
            int var11 = field758[var10];
            if ((field752[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field752[var11] = (byte) (field752[var11] | 0x2);
                } else {
                    int var12 = arg0.method2625(1);
                    if (var12 == 0) {
                        var3 = method3(arg0);
                        field752[var11] = (byte) (field752[var11] | 0x2);
                    } else if (method641(arg0, var11)) {
                        field752[var11] = (byte) (field752[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2636();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2624();
        for (int var13 = 0; var13 < field757; var13++) {
            int var14 = field758[var13];
            if ((field752[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field752[var14] = (byte) (field752[var14] | 0x2);
                } else {
                    int var15 = arg0.method2625(1);
                    if (var15 == 0) {
                        var3 = method3(arg0);
                        field752[var14] = (byte) (field752[var14] | 0x2);
                    } else if (method641(arg0, var14)) {
                        field752[var14] = (byte) (field752[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2636();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field755 = 0;
        field757 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field752[var16] = (byte) (field752[var16] >> 1);
            class3 var17 = client.field415[var16];
            if (var17 == null) {
                field758[++field757 - 1] = var16;
            } else {
                field754[++field755 - 1] = var16;
            }
        }
        method44(arg0);
        if (arg0.field1988 - var2 != arg1) {
            throw new RuntimeException(arg0.field1988 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("l.q(Ldx;I)I")
    public static int method3(class122 arg0) {
        int var1 = arg0.method2625(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2625(5);
        } else if (var1 == 2) {
            var2 = arg0.method2625(8);
        } else {
            var2 = arg0.method2625(11);
        }
        return var2;
    }

    @ObfuscatedName("k.o(Ldx;II)V")
    public static void method143(class122 arg0, int arg1) {
        boolean var2 = arg0.method2625(1) == 1;
        if (var2) {
            field768[++field762 - 1] = arg1;
        }
        int var3 = arg0.method2625(2);
        class3 var4 = client.field415[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field53 = false;
            } else if (client.field416 == arg1) {
                throw new RuntimeException();
            } else {
                field759[arg1] = (Statics.field647 + var4.field866[0] >> 6) + (Statics.field233 + var4.field865[0] >> 6 << 14) + (var4.field54 << 28);
                if (var4.field828 == -1) {
                    field756[arg1] = var4.field818;
                } else {
                    field756[arg1] = var4.field828;
                }
                field761[arg1] = var4.field840;
                client.field415[arg1] = null;
                if (arg0.method2625(1) != 0) {
                    method641(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2625(3);
            int var6 = var4.field865[0];
            int var7 = var4.field866[0];
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
            if (client.field416 == arg1 && var4.field861 < 1536 || var4.field812 < 1536 || var4.field861 >= 11776 || var4.field812 >= 11776) {
                var4.method23(var6, var7);
                var4.field53 = false;
            } else if (var2) {
                var4.field53 = true;
                var4.field47 = var6;
                var4.field58 = var7;
            } else {
                var4.field53 = false;
                var4.method19(var6, var7, field753[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2625(4);
            int var9 = var4.field865[0];
            int var10 = var4.field866[0];
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
            if (client.field416 == arg1 && var4.field861 < 1536 || var4.field812 < 1536 || var4.field861 >= 11776 || var4.field812 >= 11776) {
                var4.method23(var9, var10);
                var4.field53 = false;
            } else if (var2) {
                var4.field53 = true;
                var4.field47 = var9;
                var4.field58 = var10;
            } else {
                var4.field53 = false;
                var4.method19(var9, var10, field753[arg1]);
            }
        } else {
            int var11 = arg0.method2625(1);
            if (var11 == 0) {
                int var12 = arg0.method2625(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field865[0] + var14;
                int var17 = var4.field866[0] + var15;
                if (client.field416 == arg1 && var4.field861 < 1536 || var4.field812 < 1536 || var4.field861 >= 11776 || var4.field812 >= 11776) {
                    var4.method23(var16, var17);
                    var4.field53 = false;
                } else if (var2) {
                    var4.field53 = true;
                    var4.field47 = var16;
                    var4.field58 = var17;
                } else {
                    var4.field53 = false;
                    var4.method19(var16, var17, field753[arg1]);
                }
                var4.field54 = (byte) (var4.field54 + var13 & 0x3);
                if (client.field416 == arg1) {
                    Statics.field124 = var4.field54;
                }
            } else {
                int var18 = arg0.method2625(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field233 + var4.field865[0] + var20 & 0x3FFF) - Statics.field233;
                int var23 = (Statics.field647 + var4.field866[0] + var21 & 0x3FFF) - Statics.field647;
                if (client.field416 == arg1 && var4.field861 < 1536 || var4.field812 < 1536 || var4.field861 >= 11776 || var4.field812 >= 11776) {
                    var4.method23(var22, var23);
                    var4.field53 = false;
                } else if (var2) {
                    var4.field53 = true;
                    var4.field47 = var22;
                    var4.field58 = var23;
                } else {
                    var4.field53 = false;
                    var4.method19(var22, var23, field753[arg1]);
                }
                var4.field54 = (byte) (var4.field54 + var19 & 0x3);
                if (client.field416 == arg1) {
                    Statics.field124 = var4.field54;
                }
            }
        }
    }

    @ObfuscatedName("ad.g(Ldx;IS)Z")
    public static boolean method641(class122 arg0, int arg1) {
        int var2 = arg0.method2625(2);
        if (var2 == 0) {
            if (arg0.method2625(1) != 0) {
                method641(arg0, arg1);
            }
            int var3 = arg0.method2625(6);
            int var4 = arg0.method2625(6);
            boolean var5 = arg0.method2625(1) == 1;
            if (var5) {
                field768[++field762 - 1] = arg1;
            }
            if (client.field415[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field415[arg1] = new class3();
            var6.field55 = arg1;
            if (field751[arg1] != null) {
                var6.method16(field751[arg1]);
            }
            var6.field818 = field756[arg1];
            var6.field840 = field761[arg1];
            int var7 = field759[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field857[0] = field753[arg1];
            var6.field54 = (byte) var8;
            var6.method23((var9 << 6) + var3 - Statics.field233, (var10 << 6) + var4 - Statics.field647);
            var6.field53 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2625(2);
            int var12 = field759[arg1];
            field759[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2625(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field759[arg1];
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
            field759[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2625(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field759[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field759[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("q.m(Ldx;I)V")
    public static final void method44(class122 arg0) {
        for (int var1 = 0; var1 < field762; var1++) {
            int var2 = field768[var1];
            class3 var3 = client.field415[var2];
            int var4 = arg0.method2388();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2388() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x20) != 0) {
                int var6 = arg0.method2388();
                byte[] var7 = new byte[var6];
                class119 var8 = new class119(var7);
                arg0.method2399(var7, 0, var6);
                field751[var2] = var8;
                var3.method16(var8);
            }
            if ((var4 & 0x8) != 0) {
                int var9 = arg0.method2440();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2388();
                client.method1594(var3, var9, var10);
            }
            if ((var4 & 0x4) != 0) {
                var3.field840 = arg0.method2440();
                if (var3.field840 == 65535) {
                    var3.field840 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field811 = arg0.method2396();
                if (var3.field811.charAt(0) == '~') {
                    var3.field811 = var3.field811.substring(1);
                    class12.method755(2, var3.field48, var3.field811);
                } else if (Statics.field143 == var3) {
                    class12.method755(2, var3.field48, var3.field811);
                }
                var3.field838 = false;
                var3.field867 = 0;
                var3.field829 = 0;
                var3.field822 = 150;
            }
            if ((var4 & 0x40) != 0) {
                int var11 = arg0.method2440();
                int var12 = arg0.method2388();
                var3.method744(var11, var12, client.field548);
                var3.field836 = client.field548 + 300;
                var3.field834 = arg0.method2388();
                var3.field835 = arg0.method2388();
            }
            if ((var4 & 0x10) != 0) {
                var3.field828 = arg0.method2440();
                if (var3.field864 == 0) {
                    var3.field818 = var3.field828;
                    var3.field828 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var13 = arg0.method2440();
                class152 var14 = (class152) class109.method2675(class152.method2691(), arg0.method2388());
                boolean var15 = arg0.method2388() == 1;
                int var16 = arg0.method2388();
                int var17 = arg0.field1988;
                if (var3.field48 != null && var3.field34 != null) {
                    boolean var18 = false;
                    if (var14.field2257 && client.method601(var3.field48)) {
                        var18 = true;
                    }
                    if (!var18 && client.field468 == 0 && !var3.field56) {
                        field764.field1988 = 0;
                        arg0.method2399(field764.field1986, 0, var16);
                        field764.field1988 = 0;
                        String var19 = class223.method3734(class163.method1965(class222.method224(field764)));
                        var3.field811 = var19.trim();
                        var3.field867 = var13 >> 8;
                        var3.field829 = var13 & 0xFF;
                        var3.field822 = 150;
                        var3.field838 = var15;
                        var3.field826 = Statics.field143 != var3 && var14.field2257 && client.field512 != "" && var19.toLowerCase().indexOf(client.field512) == -1;
                        int var20;
                        if (var14.field2254) {
                            var20 = var15 ? 91 : 1;
                        } else {
                            var20 = var15 ? 90 : 2;
                        }
                        if (var14.field2255 == -1) {
                            class12.method755(var20, var3.field48, var19);
                        } else {
                            class12.method755(var20, class2.method1210(var14.field2255) + var3.field48, var19);
                        }
                    }
                }
                arg0.field1988 = var16 + var17;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field871 = arg0.method2440();
                int var21 = arg0.method2393();
                var3.field851 = var21 >> 16;
                var3.field850 = (var21 & 0xFFFF) + client.field548;
                var3.field848 = 0;
                var3.field849 = 0;
                if (var3.field850 > client.field548) {
                    var3.field848 = -1;
                }
                if (var3.field871 == 65535) {
                    var3.field871 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field825 = arg0.method2389();
                var3.field854 = arg0.method2389();
                var3.field827 = arg0.method2389();
                var3.field855 = arg0.method2389();
                var3.field856 = arg0.method2440() + client.field548;
                var3.field837 = arg0.method2440() + client.field548;
                var3.field843 = arg0.method2440();
                if (var3.field53) {
                    var3.field825 += var3.field47;
                    var3.field854 += var3.field58;
                    var3.field827 += var3.field47;
                    var3.field855 += var3.field58;
                    var3.field864 = 0;
                } else {
                    var3.field825 += var3.field865[0];
                    var3.field854 += var3.field866[0];
                    var3.field827 += var3.field865[0];
                    var3.field855 += var3.field866[0];
                    var3.field864 = 1;
                }
                var3.field847 = 0;
            }
            if ((var4 & 0x400) != 0) {
                int var22 = arg0.method2440();
                int var23 = arg0.method2388();
                var3.method744(var22, var23, client.field548);
                var3.field836 = client.field548 + 300;
                var3.field834 = arg0.method2388();
                var3.field835 = arg0.method2388();
            }
            if ((var4 & 0x100) != 0) {
                field753[var2] = arg0.method2389();
            }
            if ((var4 & 0x800) != 0) {
                var5 = arg0.method2389();
            }
            if ((var4 & 0x200) != 0) {
                for (int var24 = 0; var24 < 3; var24++) {
                    var3.field57[var24] = arg0.method2396();
                }
            }
            if (var3.field53) {
                if (var5 == 127) {
                    var3.method23(var3.field47, var3.field58);
                } else {
                    byte var25;
                    if (var5 == -1) {
                        var25 = field753[var2];
                    } else {
                        var25 = var5;
                    }
                    var3.method19(var3.field47, var3.field58, var25);
                }
            }
        }
    }
}
