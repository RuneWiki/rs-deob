package deob;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.i")
    public static byte[] field757 = new byte[2048];

    @ObfuscatedName("ae.h")
    public static byte[] field752 = new byte[2048];

    @ObfuscatedName("ae.q")
    public static class119[] field755 = new class119[2048];

    @ObfuscatedName("ae.u")
    public static int field754 = 0;

    @ObfuscatedName("ae.m")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("ae.y")
    public static int field759 = 0;

    @ObfuscatedName("ae.p")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("ae.t")
    public static int[] field761 = new int[2048];

    @ObfuscatedName("ae.g")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("ae.v")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("ae.l")
    public static int field765 = 0;

    @ObfuscatedName("ae.e")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("ae.a")
    public static class119 field766 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.o(Ldl;I)V")
    public static final void method574(class122 arg0) {
        arg0.method2539();
        int var1 = client.field410;
        class3 var2 = Statics.field2040 = client.field293[var1] = new class3();
        var2.field58 = var1;
        int var3 = arg0.method2558(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field853[0] = var5 - Statics.field585;
        var2.field854 = (var2.field853[0] << 7) + (var2.method11() << 6);
        var2.field862[0] = var6 - Statics.field57;
        var2.field808 = (var2.field862[0] << 7) + (var2.method11() << 6);
        Statics.field1516 = var2.field40 = var4;
        if (field755[var1] != null) {
            var2.method12(field755[var1]);
        }
        field754 = 0;
        field758[++field754 - 1] = var1;
        field757[var1] = 0;
        field759 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2558(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field761[var7] = (var9 << 28) + (var10 << 14) + var11;
                field762[var7] = 0;
                field763[var7] = -1;
                field760[++field759 - 1] = var7;
                field757[var7] = 0;
            }
        }
        arg0.method2546();
    }

    @ObfuscatedName("al.f(Ldl;IS)V")
    public static final void method638(class122 arg0, int arg1) {
        int var2 = arg0.field1984;
        field765 = 0;
        method99(arg0);
        method937(arg0);
        if (arg0.field1984 - var2 != arg1) {
            throw new RuntimeException(arg0.field1984 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("p.i(Ldl;B)V")
    public static final void method99(class122 arg0) {
        int var1 = 0;
        arg0.method2539();
        for (int var2 = 0; var2 < field754; var2++) {
            int var3 = field758[var2];
            if ((field757[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field757[var3] = (byte) (field757[var3] | 0x2);
                } else {
                    int var4 = arg0.method2558(1);
                    if (var4 == 0) {
                        var1 = method2874(arg0);
                        field757[var3] = (byte) (field757[var3] | 0x2);
                    } else {
                        method2970(arg0, var3);
                    }
                }
            }
        }
        arg0.method2546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2539();
        for (int var5 = 0; var5 < field754; var5++) {
            int var6 = field758[var5];
            if ((field757[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field757[var6] = (byte) (field757[var6] | 0x2);
                } else {
                    int var7 = arg0.method2558(1);
                    if (var7 == 0) {
                        var1 = method2874(arg0);
                        field757[var6] = (byte) (field757[var6] | 0x2);
                    } else {
                        method2970(arg0, var6);
                    }
                }
            }
        }
        arg0.method2546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2539();
        for (int var8 = 0; var8 < field759; var8++) {
            int var9 = field760[var8];
            if ((field757[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field757[var9] = (byte) (field757[var9] | 0x2);
                } else {
                    int var10 = arg0.method2558(1);
                    if (var10 == 0) {
                        var1 = method2874(arg0);
                        field757[var9] = (byte) (field757[var9] | 0x2);
                    } else if (method1487(arg0, var9)) {
                        field757[var9] = (byte) (field757[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2539();
        for (int var11 = 0; var11 < field759; var11++) {
            int var12 = field760[var11];
            if ((field757[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field757[var12] = (byte) (field757[var12] | 0x2);
                } else {
                    int var13 = arg0.method2558(1);
                    if (var13 == 0) {
                        var1 = method2874(arg0);
                        field757[var12] = (byte) (field757[var12] | 0x2);
                    } else if (method1487(arg0, var12)) {
                        field757[var12] = (byte) (field757[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2546();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field754 = 0;
        field759 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field757[var14] = (byte) (field757[var14] >> 1);
            class3 var15 = client.field293[var14];
            if (var15 == null) {
                field760[++field759 - 1] = var14;
            } else {
                field758[++field754 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("eo.h(Ldl;B)I")
    public static int method2874(class122 arg0) {
        int var1 = arg0.method2558(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2558(5);
        } else if (var1 == 2) {
            var2 = arg0.method2558(8);
        } else {
            var2 = arg0.method2558(11);
        }
        return var2;
    }

    @ObfuscatedName("fo.q(Ldl;IB)V")
    public static void method2970(class122 arg0, int arg1) {
        boolean var2 = arg0.method2558(1) == 1;
        if (var2) {
            field756[++field765 - 1] = arg1;
        }
        int var3 = arg0.method2558(2);
        class3 var4 = client.field293[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field59 = false;
            } else if (client.field410 == arg1) {
                throw new RuntimeException();
            } else {
                field761[arg1] = (Statics.field57 + var4.field862[0] >> 6) + (Statics.field585 + var4.field853[0] >> 6 << 14) + (var4.field40 << 28);
                if (var4.field834 == -1) {
                    field762[arg1] = var4.field857;
                } else {
                    field762[arg1] = var4.field834;
                }
                field763[arg1] = var4.field844;
                client.field293[arg1] = null;
                if (arg0.method2558(1) != 0) {
                    method1487(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2558(3);
            int var6 = var4.field853[0];
            int var7 = var4.field862[0];
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
            if (client.field410 == arg1 && var4.field854 < 1536 || var4.field808 < 1536 || var4.field854 >= 11776 || var4.field808 >= 11776) {
                var4.method14(var6, var7);
                var4.field59 = false;
            } else if (var2) {
                var4.field59 = true;
                var4.field64 = var6;
                var4.field61 = var7;
            } else {
                var4.field59 = false;
                var4.method13(var6, var7, field752[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2558(4);
            int var9 = var4.field853[0];
            int var10 = var4.field862[0];
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
            if (client.field410 == arg1 && var4.field854 < 1536 || var4.field808 < 1536 || var4.field854 >= 11776 || var4.field808 >= 11776) {
                var4.method14(var9, var10);
                var4.field59 = false;
            } else if (var2) {
                var4.field59 = true;
                var4.field64 = var9;
                var4.field61 = var10;
            } else {
                var4.field59 = false;
                var4.method13(var9, var10, field752[arg1]);
            }
        } else {
            int var11 = arg0.method2558(1);
            if (var11 == 0) {
                int var12 = arg0.method2558(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field853[0] + var14;
                int var17 = var4.field862[0] + var15;
                if (client.field410 == arg1 && var4.field854 < 1536 || var4.field808 < 1536 || var4.field854 >= 11776 || var4.field808 >= 11776) {
                    var4.method14(var16, var17);
                    var4.field59 = false;
                } else if (var2) {
                    var4.field59 = true;
                    var4.field64 = var16;
                    var4.field61 = var17;
                } else {
                    var4.field59 = false;
                    var4.method13(var16, var17, field752[arg1]);
                }
                var4.field40 = (byte) (var4.field40 + var13 & 0x3);
                if (client.field410 == arg1) {
                    Statics.field1516 = var4.field40;
                }
            } else {
                int var18 = arg0.method2558(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field585 + var4.field853[0] + var20 & 0x3FFF) - Statics.field585;
                int var23 = (Statics.field57 + var4.field862[0] + var21 & 0x3FFF) - Statics.field57;
                if (client.field410 == arg1 && var4.field854 < 1536 || var4.field808 < 1536 || var4.field854 >= 11776 || var4.field808 >= 11776) {
                    var4.method14(var22, var23);
                    var4.field59 = false;
                } else if (var2) {
                    var4.field59 = true;
                    var4.field64 = var22;
                    var4.field61 = var23;
                } else {
                    var4.field59 = false;
                    var4.method13(var22, var23, field752[arg1]);
                }
                var4.field40 = (byte) (var4.field40 + var19 & 0x3);
                if (client.field410 == arg1) {
                    Statics.field1516 = var4.field40;
                }
            }
        }
    }

    @ObfuscatedName("bu.u(Ldl;II)Z")
    public static boolean method1487(class122 arg0, int arg1) {
        int var2 = arg0.method2558(2);
        if (var2 == 0) {
            if (arg0.method2558(1) != 0) {
                method1487(arg0, arg1);
            }
            int var3 = arg0.method2558(6);
            int var4 = arg0.method2558(6);
            boolean var5 = arg0.method2558(1) == 1;
            if (var5) {
                field756[++field765 - 1] = arg1;
            }
            if (client.field293[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field293[arg1] = new class3();
            var6.field58 = arg1;
            if (field755[arg1] != null) {
                var6.method12(field755[arg1]);
            }
            var6.field857 = field762[arg1];
            var6.field844 = field763[arg1];
            int var7 = field761[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field863[0] = field752[arg1];
            var6.field40 = (byte) var8;
            var6.method14((var9 << 6) + var3 - Statics.field585, (var10 << 6) + var4 - Statics.field57);
            var6.field59 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2558(2);
            int var12 = field761[arg1];
            field761[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2558(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field761[arg1];
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
            field761[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2558(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field761[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field761[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("aj.m(Ldl;I)V")
    public static final void method937(class122 arg0) {
        for (int var1 = 0; var1 < field765; var1++) {
            int var2 = field756[var1];
            class3 var3 = client.field293[var2];
            int var4 = arg0.method2290();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method2290() << 8;
            }
            method2764(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("et.y(Ldl;ILi;II)V")
    public static final void method2764(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x8) != 0) {
            int var5 = arg0.method2290();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2301(var6, 0, var5);
            field755[arg1] = var7;
            arg2.method12(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2292();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2290();
            client.method3077(arg2, var8, var9);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field844 = arg0.method2292();
            if (arg2.field844 == 65535) {
                arg2.field844 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field838 = arg0.method2344();
            if (arg2.field838.charAt(0) == '~') {
                arg2.field838 = arg2.field838.substring(1);
                class12.method100(2, arg2.field44, arg2.field838);
            } else if (Statics.field2040 == arg2) {
                class12.method100(2, arg2.field44, arg2.field838);
            }
            arg2.field821 = false;
            arg2.field824 = 0;
            arg2.field825 = 0;
            arg2.field823 = 150;
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method2292();
            int var11 = arg0.method2290();
            arg2.method728(var10, var11, client.field299);
            arg2.field807 = client.field299 + 300;
            arg2.field830 = arg0.method2290();
            arg2.field814 = arg0.method2290();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field834 = arg0.method2292();
            if (arg2.field865 == 0) {
                arg2.field857 = arg2.field834;
                arg2.field834 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var12 = arg0.method2292();
            class152[] var13 = new class152[] { class152.field2252, class152.field2257, class152.field2256, class152.field2255, class152.field2250 };
            class152 var14 = (class152) class109.method787(var13, arg0.method2290());
            boolean var15 = arg0.method2290() == 1;
            int var16 = arg0.method2290();
            int var17 = arg0.field1984;
            if (arg2.field44 != null && arg2.field36 != null) {
                boolean var18 = false;
                if (var14.field2259 && client.method1977(arg2.field44)) {
                    var18 = true;
                }
                if (!var18 && client.field407 == 0 && !arg2.field56) {
                    field766.field1984 = 0;
                    arg0.method2301(field766.field1989, 0, var16);
                    field766.field1984 = 0;
                    String var19 = class223.method3722(class163.method2886(class222.method155(field766)));
                    arg2.field838 = var19.trim();
                    arg2.field824 = var12 >> 8;
                    arg2.field825 = var12 & 0xFF;
                    arg2.field823 = 150;
                    arg2.field821 = var15;
                    arg2.field822 = Statics.field2040 != arg2 && var14.field2259 && client.field507 != "" && var19.toLowerCase().indexOf(client.field507) == -1;
                    int var20;
                    if (var14.field2249) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field2251 == -1) {
                        class12.method100(var20, arg2.field44, var19);
                    } else {
                        int var22 = var14.field2251;
                        String var23 = "<img=" + var22 + ">";
                        class12.method100(var20, var23 + arg2.field44, var19);
                    }
                }
            }
            arg0.field1984 = var16 + var17;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field843 = arg0.method2292();
            int var24 = arg0.method2295();
            arg2.field813 = var24 >> 16;
            arg2.field846 = (var24 & 0xFFFF) + client.field299;
            arg2.field835 = 0;
            arg2.field845 = 0;
            if (arg2.field846 > client.field299) {
                arg2.field835 = -1;
            }
            if (arg2.field843 == 65535) {
                arg2.field843 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field861 = arg0.method2435();
            arg2.field850 = arg0.method2435();
            arg2.field837 = arg0.method2435();
            arg2.field851 = arg0.method2435();
            arg2.field852 = arg0.method2292() + client.field299;
            arg2.field839 = arg0.method2292() + client.field299;
            arg2.field810 = arg0.method2292();
            if (arg2.field59) {
                arg2.field861 += arg2.field64;
                arg2.field850 += arg2.field61;
                arg2.field837 += arg2.field64;
                arg2.field851 += arg2.field61;
                arg2.field865 = 0;
            } else {
                arg2.field861 += arg2.field853[0];
                arg2.field850 += arg2.field862[0];
                arg2.field837 += arg2.field853[0];
                arg2.field851 += arg2.field862[0];
                arg2.field865 = 1;
            }
            arg2.field832 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var25 = arg0.method2292();
            int var26 = arg0.method2290();
            arg2.method728(var25, var26, client.field299);
            arg2.field807 = client.field299 + 300;
            arg2.field830 = arg0.method2290();
            arg2.field814 = arg0.method2290();
        }
        if ((arg3 & 0x800) != 0) {
            field752[arg1] = arg0.method2435();
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method2435();
        }
        if (!arg2.field59) {
            return;
        }
        if (var4 == 127) {
            arg2.method14(arg2.field64, arg2.field61);
            return;
        }
        byte var27;
        if (var4 == -1) {
            var27 = field752[arg1];
        } else {
            var27 = var4;
        }
        arg2.method13(arg2.field64, arg2.field61, var27);
    }

    @ObfuscatedName("ap.p(B)V")
    public static void method722() {
        field754 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field755[var0] = null;
            field752[var0] = 1;
        }
    }
}
