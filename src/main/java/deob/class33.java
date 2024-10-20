package deob;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.r")
    public static byte[] field749 = new byte[2048];

    @ObfuscatedName("al.n")
    public static byte[] field761 = new byte[2048];

    @ObfuscatedName("al.x")
    public static class119[] field752 = new class119[2048];

    @ObfuscatedName("al.q")
    public static int field750 = 0;

    @ObfuscatedName("al.h")
    public static int[] field751 = new int[2048];

    @ObfuscatedName("al.d")
    public static int field747 = 0;

    @ObfuscatedName("al.c")
    public static int[] field753 = new int[2048];

    @ObfuscatedName("al.y")
    public static int[] field754 = new int[2048];

    @ObfuscatedName("al.m")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("al.e")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("al.z")
    public static int field757 = 0;

    @ObfuscatedName("al.t")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("al.b")
    public static class119 field755 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.i(Ldv;I)V")
    public static final void method1768(class122 arg0) {
        arg0.method2580();
        int var1 = client.field410;
        class3 var2 = Statics.field1544 = client.field409[var1] = new class3();
        var2.field50 = var1;
        int var3 = arg0.method2589(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field857[0] = var5 - Statics.field1201;
        var2.field866 = (var2.field857[0] << 7) + (var2.method42() << 6);
        var2.field865[0] = var6 - Statics.field1150;
        var2.field814 = (var2.field865[0] << 7) + (var2.method42() << 6);
        Statics.field1181 = var2.field38 = var4;
        if (field752[var1] != null) {
            var2.method26(field752[var1]);
        }
        field750 = 0;
        field751[++field750 - 1] = var1;
        field749[var1] = 0;
        field747 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2589(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field754[var7] = (var9 << 28) + (var10 << 14) + var11;
                field762[var7] = 0;
                field756[var7] = -1;
                field753[++field747 - 1] = var7;
                field749[var7] = 0;
            }
        }
        arg0.method2582();
    }

    @ObfuscatedName("u.v(Ldv;IB)V")
    public static final void method197(class122 arg0, int arg1) {
        int var2 = arg0.field1980;
        field757 = 0;
        int var3 = 0;
        arg0.method2580();
        for (int var4 = 0; var4 < field750; var4++) {
            int var5 = field751[var4];
            if ((field749[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var5] = (byte) (field749[var5] | 0x2);
                } else {
                    int var6 = arg0.method2589(1);
                    if (var6 == 0) {
                        var3 = method122(arg0);
                        field749[var5] = (byte) (field749[var5] | 0x2);
                    } else {
                        method115(arg0, var5);
                    }
                }
            }
        }
        arg0.method2582();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2580();
        for (int var7 = 0; var7 < field750; var7++) {
            int var8 = field751[var7];
            if ((field749[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var8] = (byte) (field749[var8] | 0x2);
                } else {
                    int var9 = arg0.method2589(1);
                    if (var9 == 0) {
                        var3 = method122(arg0);
                        field749[var8] = (byte) (field749[var8] | 0x2);
                    } else {
                        method115(arg0, var8);
                    }
                }
            }
        }
        arg0.method2582();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2580();
        for (int var10 = 0; var10 < field747; var10++) {
            int var11 = field753[var10];
            if ((field749[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var11] = (byte) (field749[var11] | 0x2);
                } else {
                    int var12 = arg0.method2589(1);
                    if (var12 == 0) {
                        var3 = method122(arg0);
                        field749[var11] = (byte) (field749[var11] | 0x2);
                    } else if (method154(arg0, var11)) {
                        field749[var11] = (byte) (field749[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2582();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2580();
        for (int var13 = 0; var13 < field747; var13++) {
            int var14 = field753[var13];
            if ((field749[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var14] = (byte) (field749[var14] | 0x2);
                } else {
                    int var15 = arg0.method2589(1);
                    if (var15 == 0) {
                        var3 = method122(arg0);
                        field749[var14] = (byte) (field749[var14] | 0x2);
                    } else if (method154(arg0, var14)) {
                        field749[var14] = (byte) (field749[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2582();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field750 = 0;
        field747 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field749[var16] = (byte) (field749[var16] >> 1);
            class3 var17 = client.field409[var16];
            if (var17 == null) {
                field753[++field747 - 1] = var16;
            } else {
                field751[++field750 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field757; var18++) {
            int var19 = field758[var18];
            class3 var20 = client.field409[var19];
            int var21 = arg0.method2380();
            if ((var21 & 0x80) != 0) {
                var21 += arg0.method2380() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x20) != 0) {
                int var23 = arg0.method2380();
                byte[] var24 = new byte[var23];
                class119 var25 = new class119(var24);
                arg0.method2351(var24, 0, var23);
                field752[var19] = var25;
                var20.method26(var25);
            }
            if ((var21 & 0x10) != 0) {
                int var26 = arg0.method2347();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg0.method2380();
                client.method729(var20, var26, var27);
            }
            if ((var21 & 0x4) != 0) {
                var20.field836 = arg0.method2347();
                if (var20.field836 == 65535) {
                    var20.field836 = -1;
                }
            }
            if ((var21 & 0x1) != 0) {
                var20.field823 = arg0.method2356();
                if (var20.field823.charAt(0) == '~') {
                    var20.field823 = var20.field823.substring(1);
                    class12.method112(2, var20.field35, var20.field823);
                } else if (Statics.field1544 == var20) {
                    class12.method112(2, var20.field35, var20.field823);
                }
                var20.field846 = false;
                var20.field827 = 0;
                var20.field828 = 0;
                var20.field826 = 150;
            }
            if ((var21 & 0x40) != 0) {
                int var28 = arg0.method2347();
                int var29 = arg0.method2380();
                var20.method754(var28, var29, client.field290);
                var20.field832 = client.field290 + 300;
                var20.field833 = arg0.method2380();
                var20.field816 = arg0.method2380();
            }
            if ((var21 & 0x8) != 0) {
                var20.field837 = arg0.method2347();
                if (var20.field863 == 0) {
                    var20.field860 = var20.field837;
                    var20.field837 = -1;
                }
            }
            if ((var21 & 0x2) != 0) {
                int var30 = arg0.method2347();
                class152 var31 = (class152) class109.method2293(class152.method47(), arg0.method2380());
                boolean var32 = arg0.method2380() == 1;
                int var33 = arg0.method2380();
                int var34 = arg0.field1980;
                if (var20.field35 != null && var20.field30 != null) {
                    boolean var35 = false;
                    if (var31.field2260 && client.method113(var20.field35)) {
                        var35 = true;
                    }
                    if (!var35 && client.field408 == 0 && !var20.field47) {
                        field755.field1980 = 0;
                        arg0.method2351(field755.field1982, 0, var33);
                        field755.field1980 = 0;
                        String var36 = class223.method3732(class163.method50(class222.method2906(field755)));
                        var20.field823 = var36.trim();
                        var20.field827 = var30 >> 8;
                        var20.field828 = var30 & 0xFF;
                        var20.field826 = 150;
                        var20.field846 = var32;
                        var20.field825 = Statics.field1544 != var20 && var31.field2260 && client.field506 != "" && var36.toLowerCase().indexOf(client.field506) == -1;
                        int var37;
                        if (var31.field2259) {
                            var37 = var32 ? 91 : 1;
                        } else {
                            var37 = var32 ? 90 : 2;
                        }
                        if (var31.field2258 == -1) {
                            class12.method112(var37, var20.field35, var36);
                        } else {
                            int var39 = var31.field2258;
                            String var40 = "<img=" + var39 + ">";
                            class12.method112(var37, var40 + var20.field35, var36);
                        }
                    }
                }
                arg0.field1980 = var33 + var34;
            }
            if ((var21 & 0x100) != 0) {
                var20.field843 = arg0.method2347();
                int var41 = arg0.method2350();
                var20.field850 = var41 >> 16;
                var20.field849 = (var41 & 0xFFFF) + client.field290;
                var20.field847 = 0;
                var20.field848 = 0;
                if (var20.field849 > client.field290) {
                    var20.field847 = -1;
                }
                if (var20.field843 == 65535) {
                    var20.field843 = -1;
                }
            }
            if ((var21 & 0x400) != 0) {
                var20.field851 = arg0.method2346();
                var20.field864 = arg0.method2346();
                var20.field811 = arg0.method2346();
                var20.field854 = arg0.method2346();
                var20.field839 = arg0.method2347() + client.field290;
                var20.field856 = arg0.method2347() + client.field290;
                var20.field834 = arg0.method2347();
                if (var20.field46) {
                    var20.field851 += var20.field52;
                    var20.field864 += var20.field53;
                    var20.field811 += var20.field52;
                    var20.field854 += var20.field53;
                    var20.field863 = 0;
                } else {
                    var20.field851 += var20.field857[0];
                    var20.field864 += var20.field865[0];
                    var20.field811 += var20.field857[0];
                    var20.field854 += var20.field865[0];
                    var20.field863 = 1;
                }
                var20.field824 = 0;
            }
            if ((var21 & 0x200) != 0) {
                int var42 = arg0.method2347();
                int var43 = arg0.method2380();
                var20.method754(var42, var43, client.field290);
                var20.field832 = client.field290 + 300;
                var20.field833 = arg0.method2380();
                var20.field816 = arg0.method2380();
            }
            if ((var21 & 0x800) != 0) {
                field761[var19] = arg0.method2346();
            }
            if ((var21 & 0x1000) != 0) {
                var22 = arg0.method2346();
            }
            if (var20.field46) {
                if (var22 == 127) {
                    var20.method20(var20.field52, var20.field53);
                } else {
                    byte var44;
                    if (var22 == -1) {
                        var44 = field761[var19];
                    } else {
                        var44 = var22;
                    }
                    var20.method19(var20.field52, var20.field53, var44);
                }
            }
        }
        if (arg0.field1980 - var2 != arg1) {
            throw new RuntimeException(arg0.field1980 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("e.r(Ldv;I)I")
    public static int method122(class122 arg0) {
        int var1 = arg0.method2589(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2589(5);
        } else if (var1 == 2) {
            var2 = arg0.method2589(8);
        } else {
            var2 = arg0.method2589(11);
        }
        return var2;
    }

    @ObfuscatedName("y.n(Ldv;II)V")
    public static void method115(class122 arg0, int arg1) {
        boolean var2 = arg0.method2589(1) == 1;
        if (var2) {
            field758[++field757 - 1] = arg1;
        }
        int var3 = arg0.method2589(2);
        class3 var4 = client.field409[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field46 = false;
            } else if (client.field410 == arg1) {
                throw new RuntimeException();
            } else {
                field754[arg1] = (Statics.field1150 + var4.field865[0] >> 6) + (Statics.field1201 + var4.field857[0] >> 6 << 14) + (var4.field38 << 28);
                if (var4.field837 == -1) {
                    field762[arg1] = var4.field860;
                } else {
                    field762[arg1] = var4.field837;
                }
                field756[arg1] = var4.field836;
                client.field409[arg1] = null;
                if (arg0.method2589(1) != 0) {
                    method154(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2589(3);
            int var6 = var4.field857[0];
            int var7 = var4.field865[0];
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
            if (client.field410 == arg1 && var4.field866 < 1536 || var4.field814 < 1536 || var4.field866 >= 11776 || var4.field814 >= 11776) {
                var4.method20(var6, var7);
                var4.field46 = false;
            } else if (var2) {
                var4.field46 = true;
                var4.field52 = var6;
                var4.field53 = var7;
            } else {
                var4.field46 = false;
                var4.method19(var6, var7, field761[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2589(4);
            int var9 = var4.field857[0];
            int var10 = var4.field865[0];
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
            if (client.field410 == arg1 && var4.field866 < 1536 || var4.field814 < 1536 || var4.field866 >= 11776 || var4.field814 >= 11776) {
                var4.method20(var9, var10);
                var4.field46 = false;
            } else if (var2) {
                var4.field46 = true;
                var4.field52 = var9;
                var4.field53 = var10;
            } else {
                var4.field46 = false;
                var4.method19(var9, var10, field761[arg1]);
            }
        } else {
            int var11 = arg0.method2589(1);
            if (var11 == 0) {
                int var12 = arg0.method2589(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field857[0] + var14;
                int var17 = var4.field865[0] + var15;
                if (client.field410 == arg1 && var4.field866 < 1536 || var4.field814 < 1536 || var4.field866 >= 11776 || var4.field814 >= 11776) {
                    var4.method20(var16, var17);
                    var4.field46 = false;
                } else if (var2) {
                    var4.field46 = true;
                    var4.field52 = var16;
                    var4.field53 = var17;
                } else {
                    var4.field46 = false;
                    var4.method19(var16, var17, field761[arg1]);
                }
                var4.field38 = (byte) (var4.field38 + var13 & 0x3);
                if (client.field410 == arg1) {
                    Statics.field1181 = var4.field38;
                }
            } else {
                int var18 = arg0.method2589(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1201 + var4.field857[0] + var20 & 0x3FFF) - Statics.field1201;
                int var23 = (Statics.field1150 + var4.field865[0] + var21 & 0x3FFF) - Statics.field1150;
                if (client.field410 == arg1 && var4.field866 < 1536 || var4.field814 < 1536 || var4.field866 >= 11776 || var4.field814 >= 11776) {
                    var4.method20(var22, var23);
                    var4.field46 = false;
                } else if (var2) {
                    var4.field46 = true;
                    var4.field52 = var22;
                    var4.field53 = var23;
                } else {
                    var4.field46 = false;
                    var4.method19(var22, var23, field761[arg1]);
                }
                var4.field38 = (byte) (var4.field38 + var19 & 0x3);
                if (client.field410 == arg1) {
                    Statics.field1181 = var4.field38;
                }
            }
        }
    }

    @ObfuscatedName("b.x(Ldv;IB)Z")
    public static boolean method154(class122 arg0, int arg1) {
        int var2 = arg0.method2589(2);
        if (var2 == 0) {
            if (arg0.method2589(1) != 0) {
                method154(arg0, arg1);
            }
            int var3 = arg0.method2589(6);
            int var4 = arg0.method2589(6);
            boolean var5 = arg0.method2589(1) == 1;
            if (var5) {
                field758[++field757 - 1] = arg1;
            }
            if (client.field409[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field409[arg1] = new class3();
            var6.field50 = arg1;
            if (field752[arg1] != null) {
                var6.method26(field752[arg1]);
            }
            var6.field860 = field762[arg1];
            var6.field836 = field756[arg1];
            int var7 = field754[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field861[0] = field761[arg1];
            var6.field38 = (byte) var8;
            var6.method20((var9 << 6) + var3 - Statics.field1201, (var10 << 6) + var4 - Statics.field1150);
            var6.field46 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2589(2);
            int var12 = field754[arg1];
            field754[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2589(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field754[arg1];
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
            field754[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2589(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field754[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field754[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
