package deob;

@ObfuscatedName("ac")
public class class33 {

    @ObfuscatedName("ac.k")
    public static byte[] field736 = new byte[2048];

    @ObfuscatedName("ac.f")
    public static byte[] field737 = new byte[2048];

    @ObfuscatedName("ac.d")
    public static class119[] field735 = new class119[2048];

    @ObfuscatedName("ac.l")
    public static int field739 = 0;

    @ObfuscatedName("ac.r")
    public static int[] field734 = new int[2048];

    @ObfuscatedName("ac.g")
    public static int field748 = 0;

    @ObfuscatedName("ac.h")
    public static int[] field742 = new int[2048];

    @ObfuscatedName("ac.n")
    public static int[] field740 = new int[2048];

    @ObfuscatedName("ac.j")
    public static int[] field744 = new int[2048];

    @ObfuscatedName("ac.a")
    public static int[] field745 = new int[2048];

    @ObfuscatedName("ac.b")
    public static int field746 = 0;

    @ObfuscatedName("ac.c")
    public static int[] field747 = new int[2048];

    @ObfuscatedName("ac.v")
    public static class119 field743 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.z(Ldc;S)V")
    public static final void method132(class122 arg0) {
        arg0.method2565();
        int var1 = client.field278;
        class3 var2 = Statics.field859 = client.field402[var1] = new class3();
        var2.field47 = var1;
        int var3 = arg0.method2550(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field854[0] = var5 - Statics.field86;
        var2.field826 = (var2.field854[0] << 7) + (var2.method29() << 6);
        var2.field855[0] = var6 - Statics.field2893;
        var2.field801 = (var2.field855[0] << 7) + (var2.method29() << 6);
        Statics.field2179 = var2.field52 = var4;
        if (field735[var1] != null) {
            var2.method23(field735[var1]);
        }
        field739 = 0;
        field734[++field739 - 1] = var1;
        field736[var1] = 0;
        field748 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2550(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field740[var7] = (var9 << 28) + (var10 << 14) + var11;
                field744[var7] = 0;
                field745[var7] = -1;
                field742[++field748 - 1] = var7;
                field736[var7] = 0;
            }
        }
        arg0.method2551();
    }

    @ObfuscatedName("dk.q(Ldc;IB)V")
    public static final void method2592(class122 arg0, int arg1) {
        int var2 = arg0.field1986;
        field746 = 0;
        int var3 = 0;
        arg0.method2565();
        for (int var4 = 0; var4 < field739; var4++) {
            int var5 = field734[var4];
            if ((field736[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field736[var5] = (byte) (field736[var5] | 0x2);
                } else {
                    int var6 = arg0.method2550(1);
                    if (var6 == 0) {
                        var3 = method3590(arg0);
                        field736[var5] = (byte) (field736[var5] | 0x2);
                    } else {
                        method2583(arg0, var5);
                    }
                }
            }
        }
        arg0.method2551();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2565();
        for (int var7 = 0; var7 < field739; var7++) {
            int var8 = field734[var7];
            if ((field736[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field736[var8] = (byte) (field736[var8] | 0x2);
                } else {
                    int var9 = arg0.method2550(1);
                    if (var9 == 0) {
                        var3 = method3590(arg0);
                        field736[var8] = (byte) (field736[var8] | 0x2);
                    } else {
                        method2583(arg0, var8);
                    }
                }
            }
        }
        arg0.method2551();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2565();
        for (int var10 = 0; var10 < field748; var10++) {
            int var11 = field742[var10];
            if ((field736[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field736[var11] = (byte) (field736[var11] | 0x2);
                } else {
                    int var12 = arg0.method2550(1);
                    if (var12 == 0) {
                        var3 = method3590(arg0);
                        field736[var11] = (byte) (field736[var11] | 0x2);
                    } else if (method92(arg0, var11)) {
                        field736[var11] = (byte) (field736[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2551();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2565();
        for (int var13 = 0; var13 < field748; var13++) {
            int var14 = field742[var13];
            if ((field736[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field736[var14] = (byte) (field736[var14] | 0x2);
                } else {
                    int var15 = arg0.method2550(1);
                    if (var15 == 0) {
                        var3 = method3590(arg0);
                        field736[var14] = (byte) (field736[var14] | 0x2);
                    } else if (method92(arg0, var14)) {
                        field736[var14] = (byte) (field736[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2551();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field739 = 0;
        field748 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field736[var16] = (byte) (field736[var16] >> 1);
            class3 var17 = client.field402[var16];
            if (var17 == null) {
                field742[++field748 - 1] = var16;
            } else {
                field734[++field739 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field746; var18++) {
            int var19 = field747[var18];
            class3 var20 = client.field402[var19];
            int var21 = arg0.method2457();
            if ((var21 & 0x1) != 0) {
                var21 += arg0.method2457() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x4) != 0) {
                int var23 = arg0.method2457();
                byte[] var24 = new byte[var23];
                class119 var25 = new class119(var24);
                arg0.method2312(var24, 0, var23);
                field735[var19] = var25;
                var20.method23(var25);
            }
            if ((var21 & 0x40) != 0) {
                int var26 = arg0.method2415();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg0.method2457();
                client.method724(var20, var26, var27);
            }
            if ((var21 & 0x2) != 0) {
                var20.field832 = arg0.method2415();
                if (var20.field832 == 65535) {
                    var20.field832 = -1;
                }
            }
            if ((var21 & 0x80) != 0) {
                var20.field837 = arg0.method2309();
                if (var20.field837.charAt(0) == '~') {
                    var20.field837 = var20.field837.substring(1);
                    class12.method2763(2, var20.field37, var20.field837);
                } else if (Statics.field859 == var20) {
                    class12.method2763(2, var20.field37, var20.field837);
                }
                var20.field814 = false;
                var20.field817 = 0;
                var20.field818 = 0;
                var20.field834 = 150;
            }
            if ((var21 & 0x20) != 0) {
                int var28 = arg0.method2415();
                int var29 = arg0.method2457();
                var20.method716(var28, var29, client.field290);
                var20.field822 = client.field290 + 300;
                var20.field823 = arg0.method2457();
                var20.field824 = arg0.method2457();
            }
            if ((var21 & 0x10) != 0) {
                var20.field838 = arg0.method2415();
                if (var20.field853 == 0) {
                    var20.field850 = var20.field838;
                    var20.field838 = -1;
                }
            }
            if ((var21 & 0x8) != 0) {
                int var30 = arg0.method2415();
                class152[] var31 = new class152[] { class152.field2263, class152.field2261, class152.field2260, class152.field2259, class152.field2258 };
                class152 var32 = (class152) class109.method2221(var31, arg0.method2457());
                boolean var33 = arg0.method2457() == 1;
                int var34 = arg0.method2457();
                int var35 = arg0.field1986;
                if (var20.field37 != null && var20.field53 != null) {
                    boolean var36 = false;
                    if (var32.field2266 && client.method2936(var20.field37)) {
                        var36 = true;
                    }
                    if (!var36 && client.field560 == 0 && !var20.field30) {
                        field743.field1986 = 0;
                        arg0.method2312(field743.field1987, 0, var34);
                        field743.field1986 = 0;
                        String var37 = class223.method3717(class163.method2895(class222.method1130(field743)));
                        var20.field837 = var37.trim();
                        var20.field817 = var30 >> 8;
                        var20.field818 = var30 & 0xFF;
                        var20.field834 = 150;
                        var20.field814 = var33;
                        var20.field815 = Statics.field859 != var20 && var32.field2266 && client.field499 != "" && var37.toLowerCase().indexOf(client.field499) == -1;
                        int var38;
                        if (var32.field2265) {
                            var38 = var33 ? 91 : 1;
                        } else {
                            var38 = var33 ? 90 : 2;
                        }
                        if (var32.field2264 == -1) {
                            class12.method2763(var38, var20.field37, var37);
                        } else {
                            int var40 = var32.field2264;
                            String var41 = "<img=" + var40 + ">";
                            class12.method2763(var38, var41 + var20.field37, var37);
                        }
                    }
                }
                arg0.field1986 = var34 + var35;
            }
            if ((var21 & 0x1000) != 0) {
                var20.field829 = arg0.method2415();
                int var42 = arg0.method2306();
                var20.field840 = var42 >> 16;
                var20.field839 = (var42 & 0xFFFF) + client.field290;
                var20.field802 = 0;
                var20.field860 = 0;
                if (var20.field839 > client.field290) {
                    var20.field802 = -1;
                }
                if (var20.field829 == 65535) {
                    var20.field829 = -1;
                }
            }
            if ((var21 & 0x2000) != 0) {
                var20.field841 = arg0.method2423();
                var20.field843 = arg0.method2423();
                var20.field844 = arg0.method2423();
                var20.field827 = arg0.method2423();
                var20.field825 = arg0.method2415() + client.field290;
                var20.field816 = arg0.method2415() + client.field290;
                var20.field847 = arg0.method2415();
                if (var20.field56) {
                    var20.field841 += var20.field55;
                    var20.field843 += var20.field33;
                    var20.field844 += var20.field55;
                    var20.field827 += var20.field33;
                    var20.field853 = 0;
                } else {
                    var20.field841 += var20.field854[0];
                    var20.field843 += var20.field855[0];
                    var20.field844 += var20.field854[0];
                    var20.field827 += var20.field855[0];
                    var20.field853 = 1;
                }
                var20.field858 = 0;
            }
            if ((var21 & 0x400) != 0) {
                int var43 = arg0.method2415();
                int var44 = arg0.method2457();
                var20.method716(var43, var44, client.field290);
                var20.field822 = client.field290 + 300;
                var20.field823 = arg0.method2457();
                var20.field824 = arg0.method2457();
            }
            if ((var21 & 0x800) != 0) {
                field737[var19] = arg0.method2423();
            }
            if ((var21 & 0x100) != 0) {
                var22 = arg0.method2423();
            }
            if ((var21 & 0x200) != 0) {
                for (int var45 = 0; var45 < 3; var45++) {
                    var20.field35[var45] = arg0.method2309();
                }
            }
            if (var20.field56) {
                if (var22 == 127) {
                    var20.method20(var20.field55, var20.field33);
                } else {
                    byte var46;
                    if (var22 == -1) {
                        var46 = field737[var19];
                    } else {
                        var46 = var22;
                    }
                    var20.method35(var20.field55, var20.field33, var46);
                }
            }
        }
        if (arg0.field1986 - var2 != arg1) {
            throw new RuntimeException(arg0.field1986 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("hj.k(Ldc;I)I")
    public static int method3590(class122 arg0) {
        int var1 = arg0.method2550(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2550(5);
        } else if (var1 == 2) {
            var2 = arg0.method2550(8);
        } else {
            var2 = arg0.method2550(11);
        }
        return var2;
    }

    @ObfuscatedName("dj.f(Ldc;IB)V")
    public static void method2583(class122 arg0, int arg1) {
        boolean var2 = arg0.method2550(1) == 1;
        if (var2) {
            field747[++field746 - 1] = arg1;
        }
        int var3 = arg0.method2550(2);
        class3 var4 = client.field402[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field56 = false;
            } else if (client.field278 == arg1) {
                throw new RuntimeException();
            } else {
                field740[arg1] = (Statics.field2893 + var4.field855[0] >> 6) + (Statics.field86 + var4.field854[0] >> 6 << 14) + (var4.field52 << 28);
                if (var4.field838 == -1) {
                    field744[arg1] = var4.field850;
                } else {
                    field744[arg1] = var4.field838;
                }
                field745[arg1] = var4.field832;
                client.field402[arg1] = null;
                if (arg0.method2550(1) != 0) {
                    method92(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2550(3);
            int var6 = var4.field854[0];
            int var7 = var4.field855[0];
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
            if (client.field278 == arg1 && var4.field826 < 1536 || var4.field801 < 1536 || var4.field826 >= 11776 || var4.field801 >= 11776) {
                var4.method20(var6, var7);
                var4.field56 = false;
            } else if (var2) {
                var4.field56 = true;
                var4.field55 = var6;
                var4.field33 = var7;
            } else {
                var4.field56 = false;
                var4.method35(var6, var7, field737[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2550(4);
            int var9 = var4.field854[0];
            int var10 = var4.field855[0];
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
            if (client.field278 == arg1 && var4.field826 < 1536 || var4.field801 < 1536 || var4.field826 >= 11776 || var4.field801 >= 11776) {
                var4.method20(var9, var10);
                var4.field56 = false;
            } else if (var2) {
                var4.field56 = true;
                var4.field55 = var9;
                var4.field33 = var10;
            } else {
                var4.field56 = false;
                var4.method35(var9, var10, field737[arg1]);
            }
        } else {
            int var11 = arg0.method2550(1);
            if (var11 == 0) {
                int var12 = arg0.method2550(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field854[0] + var14;
                int var17 = var4.field855[0] + var15;
                if (client.field278 == arg1 && var4.field826 < 1536 || var4.field801 < 1536 || var4.field826 >= 11776 || var4.field801 >= 11776) {
                    var4.method20(var16, var17);
                    var4.field56 = false;
                } else if (var2) {
                    var4.field56 = true;
                    var4.field55 = var16;
                    var4.field33 = var17;
                } else {
                    var4.field56 = false;
                    var4.method35(var16, var17, field737[arg1]);
                }
                var4.field52 = (byte) (var4.field52 + var13 & 0x3);
                if (client.field278 == arg1) {
                    Statics.field2179 = var4.field52;
                }
            } else {
                int var18 = arg0.method2550(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field86 + var4.field854[0] + var20 & 0x3FFF) - Statics.field86;
                int var23 = (Statics.field2893 + var4.field855[0] + var21 & 0x3FFF) - Statics.field2893;
                if (client.field278 == arg1 && var4.field826 < 1536 || var4.field801 < 1536 || var4.field826 >= 11776 || var4.field801 >= 11776) {
                    var4.method20(var22, var23);
                    var4.field56 = false;
                } else if (var2) {
                    var4.field56 = true;
                    var4.field55 = var22;
                    var4.field33 = var23;
                } else {
                    var4.field56 = false;
                    var4.method35(var22, var23, field737[arg1]);
                }
                var4.field52 = (byte) (var4.field52 + var19 & 0x3);
                if (client.field278 == arg1) {
                    Statics.field2179 = var4.field52;
                }
            }
        }
    }

    @ObfuscatedName("l.d(Ldc;II)Z")
    public static boolean method92(class122 arg0, int arg1) {
        int var2 = arg0.method2550(2);
        if (var2 == 0) {
            if (arg0.method2550(1) != 0) {
                method92(arg0, arg1);
            }
            int var3 = arg0.method2550(6);
            int var4 = arg0.method2550(6);
            boolean var5 = arg0.method2550(1) == 1;
            if (var5) {
                field747[++field746 - 1] = arg1;
            }
            if (client.field402[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field402[arg1] = new class3();
            var6.field47 = arg1;
            if (field735[arg1] != null) {
                var6.method23(field735[arg1]);
            }
            var6.field850 = field744[arg1];
            var6.field832 = field745[arg1];
            int var7 = field740[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field856[0] = field737[arg1];
            var6.field52 = (byte) var8;
            var6.method20((var9 << 6) + var3 - Statics.field86, (var10 << 6) + var4 - Statics.field2893);
            var6.field56 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2550(2);
            int var12 = field740[arg1];
            field740[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2550(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field740[arg1];
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
            field740[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2550(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field740[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field740[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
