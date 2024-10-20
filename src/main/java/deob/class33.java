package deob;

@ObfuscatedName("aw")
public class class33 {

    @ObfuscatedName("aw.g")
    public static byte[] field747 = new byte[2048];

    @ObfuscatedName("aw.w")
    public static byte[] field745 = new byte[2048];

    @ObfuscatedName("aw.e")
    public static class119[] field754 = new class119[2048];

    @ObfuscatedName("aw.c")
    public static int field750 = 0;

    @ObfuscatedName("aw.a")
    public static int[] field751 = new int[2048];

    @ObfuscatedName("aw.q")
    public static int field757 = 0;

    @ObfuscatedName("aw.m")
    public static int[] field749 = new int[2048];

    @ObfuscatedName("aw.n")
    public static int[] field753 = new int[2048];

    @ObfuscatedName("aw.k")
    public static int[] field755 = new int[2048];

    @ObfuscatedName("aw.o")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("aw.f")
    public static int field752 = 0;

    @ObfuscatedName("aw.s")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("aw.z")
    public static class119 field759 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.y(Lds;I)V")
    public static final void method588(class122 arg0) {
        arg0.method2576();
        int var1 = client.field373;
        class3 var2 = Statics.field677 = client.field412[var1] = new class3();
        var2.field44 = var1;
        int var3 = arg0.method2582(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field856[0] = var5 - Statics.field941;
        var2.field839 = (var2.field856[0] << 7) + (var2.method12() << 6);
        var2.field857[0] = var6 - Statics.field23;
        var2.field803 = (var2.field857[0] << 7) + (var2.method12() << 6);
        Statics.field27 = var2.field49 = var4;
        if (field754[var1] != null) {
            var2.method23(field754[var1]);
        }
        field750 = 0;
        field751[++field750 - 1] = var1;
        field747[var1] = 0;
        field757 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2582(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field753[var7] = (var9 << 28) + (var10 << 14) + var11;
                field755[var7] = 0;
                field756[var7] = -1;
                field749[++field757 - 1] = var7;
                field747[var7] = 0;
            }
        }
        arg0.method2578();
    }

    @ObfuscatedName("client.d(Lds;II)V")
    public static final void method453(class122 arg0, int arg1) {
        int var2 = arg0.field1973;
        field752 = 0;
        method2907(arg0);
        method616(arg0);
        if (arg0.field1973 - var2 != arg1) {
            throw new RuntimeException(arg0.field1973 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ex.g(Lds;B)V")
    public static final void method2907(class122 arg0) {
        int var1 = 0;
        arg0.method2576();
        for (int var2 = 0; var2 < field750; var2++) {
            int var3 = field751[var2];
            if ((field747[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var3] = (byte) (field747[var3] | 0x2);
                } else {
                    int var4 = arg0.method2582(1);
                    if (var4 == 0) {
                        var1 = method35(arg0);
                        field747[var3] = (byte) (field747[var3] | 0x2);
                    } else {
                        method2981(arg0, var3);
                    }
                }
            }
        }
        arg0.method2578();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2576();
        for (int var5 = 0; var5 < field750; var5++) {
            int var6 = field751[var5];
            if ((field747[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var6] = (byte) (field747[var6] | 0x2);
                } else {
                    int var7 = arg0.method2582(1);
                    if (var7 == 0) {
                        var1 = method35(arg0);
                        field747[var6] = (byte) (field747[var6] | 0x2);
                    } else {
                        method2981(arg0, var6);
                    }
                }
            }
        }
        arg0.method2578();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2576();
        for (int var8 = 0; var8 < field757; var8++) {
            int var9 = field749[var8];
            if ((field747[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var9] = (byte) (field747[var9] | 0x2);
                } else {
                    int var10 = arg0.method2582(1);
                    if (var10 == 0) {
                        var1 = method35(arg0);
                        field747[var9] = (byte) (field747[var9] | 0x2);
                    } else if (method2272(arg0, var9)) {
                        field747[var9] = (byte) (field747[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2578();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2576();
        for (int var11 = 0; var11 < field757; var11++) {
            int var12 = field749[var11];
            if ((field747[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var12] = (byte) (field747[var12] | 0x2);
                } else {
                    int var13 = arg0.method2582(1);
                    if (var13 == 0) {
                        var1 = method35(arg0);
                        field747[var12] = (byte) (field747[var12] | 0x2);
                    } else if (method2272(arg0, var12)) {
                        field747[var12] = (byte) (field747[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2578();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field750 = 0;
        field757 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field747[var14] = (byte) (field747[var14] >> 1);
            class3 var15 = client.field412[var14];
            if (var15 == null) {
                field749[++field757 - 1] = var14;
            } else {
                field751[++field750 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("g.w(Lds;B)I")
    public static int method35(class122 arg0) {
        int var1 = arg0.method2582(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2582(5);
        } else if (var1 == 2) {
            var2 = arg0.method2582(8);
        } else {
            var2 = arg0.method2582(11);
        }
        return var2;
    }

    @ObfuscatedName("fr.e(Lds;II)V")
    public static void method2981(class122 arg0, int arg1) {
        boolean var2 = arg0.method2582(1) == 1;
        if (var2) {
            field758[++field752 - 1] = arg1;
        }
        int var3 = arg0.method2582(2);
        class3 var4 = client.field412[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field51 = false;
            } else if (client.field373 == arg1) {
                throw new RuntimeException();
            } else {
                field753[arg1] = (Statics.field23 + var4.field857[0] >> 6) + (Statics.field941 + var4.field856[0] >> 6 << 14) + (var4.field49 << 28);
                if (var4.field843 == -1) {
                    field755[arg1] = var4.field822;
                } else {
                    field755[arg1] = var4.field843;
                }
                field756[arg1] = var4.field827;
                client.field412[arg1] = null;
                if (arg0.method2582(1) != 0) {
                    method2272(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2582(3);
            int var6 = var4.field856[0];
            int var7 = var4.field857[0];
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
            if (client.field373 == arg1 && var4.field839 < 1536 || var4.field803 < 1536 || var4.field839 >= 11776 || var4.field803 >= 11776) {
                var4.method14(var6, var7);
                var4.field51 = false;
            } else if (var2) {
                var4.field51 = true;
                var4.field37 = var6;
                var4.field46 = var7;
            } else {
                var4.field51 = false;
                var4.method16(var6, var7, field745[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2582(4);
            int var9 = var4.field856[0];
            int var10 = var4.field857[0];
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
            if (client.field373 == arg1 && var4.field839 < 1536 || var4.field803 < 1536 || var4.field839 >= 11776 || var4.field803 >= 11776) {
                var4.method14(var9, var10);
                var4.field51 = false;
            } else if (var2) {
                var4.field51 = true;
                var4.field37 = var9;
                var4.field46 = var10;
            } else {
                var4.field51 = false;
                var4.method16(var9, var10, field745[arg1]);
            }
        } else {
            int var11 = arg0.method2582(1);
            if (var11 == 0) {
                int var12 = arg0.method2582(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field856[0] + var14;
                int var17 = var4.field857[0] + var15;
                if (client.field373 == arg1 && var4.field839 < 1536 || var4.field803 < 1536 || var4.field839 >= 11776 || var4.field803 >= 11776) {
                    var4.method14(var16, var17);
                    var4.field51 = false;
                } else if (var2) {
                    var4.field51 = true;
                    var4.field37 = var16;
                    var4.field46 = var17;
                } else {
                    var4.field51 = false;
                    var4.method16(var16, var17, field745[arg1]);
                }
                var4.field49 = (byte) (var4.field49 + var13 & 0x3);
                if (client.field373 == arg1) {
                    Statics.field27 = var4.field49;
                }
            } else {
                int var18 = arg0.method2582(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field941 + var4.field856[0] + var20 & 0x3FFF) - Statics.field941;
                int var23 = (Statics.field23 + var4.field857[0] + var21 & 0x3FFF) - Statics.field23;
                if (client.field373 == arg1 && var4.field839 < 1536 || var4.field803 < 1536 || var4.field839 >= 11776 || var4.field803 >= 11776) {
                    var4.method14(var22, var23);
                    var4.field51 = false;
                } else if (var2) {
                    var4.field51 = true;
                    var4.field37 = var22;
                    var4.field46 = var23;
                } else {
                    var4.field51 = false;
                    var4.method16(var22, var23, field745[arg1]);
                }
                var4.field49 = (byte) (var4.field49 + var19 & 0x3);
                if (client.field373 == arg1) {
                    Statics.field27 = var4.field49;
                }
            }
        }
    }

    @ObfuscatedName("dq.c(Lds;IB)Z")
    public static boolean method2272(class122 arg0, int arg1) {
        int var2 = arg0.method2582(2);
        if (var2 == 0) {
            if (arg0.method2582(1) != 0) {
                method2272(arg0, arg1);
            }
            int var3 = arg0.method2582(6);
            int var4 = arg0.method2582(6);
            boolean var5 = arg0.method2582(1) == 1;
            if (var5) {
                field758[++field752 - 1] = arg1;
            }
            if (client.field412[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field412[arg1] = new class3();
            var6.field44 = arg1;
            if (field754[arg1] != null) {
                var6.method23(field754[arg1]);
            }
            var6.field822 = field755[arg1];
            var6.field827 = field756[arg1];
            int var7 = field753[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field813[0] = field745[arg1];
            var6.field49 = (byte) var8;
            var6.method14((var9 << 6) + var3 - Statics.field941, (var10 << 6) + var4 - Statics.field23);
            var6.field51 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2582(2);
            int var12 = field753[arg1];
            field753[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2582(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field753[arg1];
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
            field753[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2582(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field753[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field753[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ah.a(Lds;I)V")
    public static final void method616(class122 arg0) {
        for (int var1 = 0; var1 < field752; var1++) {
            int var2 = field758[var1];
            class3 var3 = client.field412[var2];
            int var4 = arg0.method2326();
            if ((var4 & 0x10) != 0) {
                var4 += arg0.method2326() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x1) != 0) {
                int var6 = arg0.method2326();
                byte[] var7 = new byte[var6];
                class119 var8 = new class119(var7);
                arg0.method2333(var7, 0, var6);
                field754[var2] = var8;
                var3.method23(var8);
            }
            if ((var4 & 0x4) != 0) {
                int var9 = arg0.method2525();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2326();
                client.method733(var3, var9, var10);
            }
            if ((var4 & 0x40) != 0) {
                var3.field827 = arg0.method2525();
                if (var3.field827 == 65535) {
                    var3.field827 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field807 = arg0.method2334();
                if (var3.field807.charAt(0) == '~') {
                    var3.field807 = var3.field807.substring(1);
                    class12.method2628(2, var3.field38, var3.field807);
                } else if (Statics.field677 == var3) {
                    class12.method2628(2, var3.field38, var3.field807);
                }
                var3.field816 = false;
                var3.field819 = 0;
                var3.field844 = 0;
                var3.field818 = 150;
            }
            if ((var4 & 0x2) != 0) {
                int var11 = arg0.method2525();
                int var12 = arg0.method2326();
                var3.method727(var11, var12, client.field303);
                var3.field860 = client.field303 + 300;
                var3.field825 = arg0.method2326();
                var3.field815 = arg0.method2326();
            }
            if ((var4 & 0x20) != 0) {
                var3.field843 = arg0.method2525();
                if (var3.field855 == 0) {
                    var3.field822 = var3.field843;
                    var3.field843 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var13 = arg0.method2525();
                class152 var14 = (class152) class109.method104(class152.method2875(), arg0.method2326());
                boolean var15 = arg0.method2326() == 1;
                int var16 = arg0.method2326();
                int var17 = arg0.field1973;
                if (var3.field38 != null && var3.field39 != null) {
                    boolean var18 = false;
                    if (var14.field2245 && client.method187(var3.field38)) {
                        var18 = true;
                    }
                    if (!var18 && client.field411 == 0 && !var3.field48) {
                        field759.field1973 = 0;
                        arg0.method2333(field759.field1974, 0, var16);
                        field759.field1973 = 0;
                        class119 var19 = field759;
                        String var20 = Statics.method2619(var19, 32767);
                        String var21 = class223.method3766(class163.method2024(var20));
                        var3.field807 = var21.trim();
                        var3.field819 = var13 >> 8;
                        var3.field844 = var13 & 0xFF;
                        var3.field818 = 150;
                        var3.field816 = var15;
                        var3.field845 = Statics.field677 != var3 && var14.field2245 && client.field461 != "" && var21.toLowerCase().indexOf(client.field461) == -1;
                        int var22;
                        if (var14.field2244) {
                            var22 = var15 ? 91 : 1;
                        } else {
                            var22 = var15 ? 90 : 2;
                        }
                        if (var14.field2237 == -1) {
                            class12.method2628(var22, var3.field38, var21);
                        } else {
                            int var24 = var14.field2237;
                            String var25 = "<img=" + var24 + ">";
                            class12.method2628(var22, var25 + var3.field38, var21);
                        }
                    }
                }
                arg0.field1973 = var16 + var17;
            }
            if ((var4 & 0x800) != 0) {
                var3.field838 = arg0.method2525();
                int var26 = arg0.method2331();
                var3.field842 = var26 >> 16;
                var3.field849 = (var26 & 0xFFFF) + client.field303;
                var3.field850 = 0;
                var3.field840 = 0;
                if (var3.field849 > client.field303) {
                    var3.field850 = -1;
                }
                if (var3.field838 == 65535) {
                    var3.field838 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field858 = arg0.method2461();
                var3.field841 = arg0.method2461();
                var3.field824 = arg0.method2461();
                var3.field846 = arg0.method2461();
                var3.field847 = arg0.method2525() + client.field303;
                var3.field848 = arg0.method2525() + client.field303;
                var3.field852 = arg0.method2525();
                if (var3.field51) {
                    var3.field858 += var3.field37;
                    var3.field841 += var3.field46;
                    var3.field824 += var3.field37;
                    var3.field846 += var3.field46;
                    var3.field855 = 0;
                } else {
                    var3.field858 += var3.field856[0];
                    var3.field841 += var3.field857[0];
                    var3.field824 += var3.field856[0];
                    var3.field846 += var3.field857[0];
                    var3.field855 = 1;
                }
                var3.field802 = 0;
            }
            if ((var4 & 0x100) != 0) {
                int var27 = arg0.method2525();
                int var28 = arg0.method2326();
                var3.method727(var27, var28, client.field303);
                var3.field860 = client.field303 + 300;
                var3.field825 = arg0.method2326();
                var3.field815 = arg0.method2326();
            }
            if ((var4 & 0x1000) != 0) {
                field745[var2] = arg0.method2461();
            }
            if ((var4 & 0x200) != 0) {
                var5 = arg0.method2461();
            }
            if (var3.field51) {
                if (var5 == 127) {
                    var3.method14(var3.field37, var3.field46);
                } else {
                    byte var29;
                    if (var5 == -1) {
                        var29 = field745[var2];
                    } else {
                        var29 = var5;
                    }
                    var3.method16(var3.field37, var3.field46, var29);
                }
            }
        }
    }
}
