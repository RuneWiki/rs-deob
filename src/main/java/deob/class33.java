package deob;

@ObfuscatedName("aw")
public class class33 {

    @ObfuscatedName("aw.i")
    public static byte[] field759 = new byte[2048];

    @ObfuscatedName("aw.d")
    public static byte[] field756 = new byte[2048];

    @ObfuscatedName("aw.o")
    public static class119[] field757 = new class119[2048];

    @ObfuscatedName("aw.c")
    public static int field767 = 0;

    @ObfuscatedName("aw.p")
    public static int[] field755 = new int[2048];

    @ObfuscatedName("aw.j")
    public static int field760 = 0;

    @ObfuscatedName("aw.a")
    public static int[] field761 = new int[2048];

    @ObfuscatedName("aw.y")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("aw.h")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("aw.z")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("aw.w")
    public static int field763 = 0;

    @ObfuscatedName("aw.l")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("aw.q")
    public static class119 field758 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.v(Ldw;I)V")
    public static final void method3154(class122 arg0) {
        arg0.method2619();
        int var1 = client.field411;
        class3 var2 = Statics.field242 = client.field410[var1] = new class3();
        var2.field60 = var1;
        int var3 = arg0.method2602(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field862[0] = var5 - Statics.field630;
        var2.field863 = (var2.field862[0] << 7) + (var2.method28() << 6);
        var2.field856[0] = var6 - Statics.field147;
        var2.field819 = (var2.field856[0] << 7) + (var2.method28() << 6);
        Statics.field24 = var2.field53 = var4;
        if (field757[var1] != null) {
            var2.method16(field757[var1]);
        }
        field767 = 0;
        field755[++field767 - 1] = var1;
        field759[var1] = 0;
        field760 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2602(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field762[var7] = (var9 << 28) + (var10 << 14) + var11;
                field765[var7] = 0;
                field764[var7] = -1;
                field761[++field760 - 1] = var7;
                field759[var7] = 0;
            }
        }
        arg0.method2603();
    }

    @ObfuscatedName("dx.f(Ldw;IB)V")
    public static final void method2558(class122 arg0, int arg1) {
        int var2 = arg0.field1984;
        field763 = 0;
        method1539(arg0);
        for (int var3 = 0; var3 < field763; var3++) {
            int var4 = field766[var3];
            class3 var5 = client.field410[var4];
            int var6 = arg0.method2400();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2400() << 8;
            }
            method53(arg0, var4, var5, var6);
        }
        if (arg0.field1984 - var2 != arg1) {
            throw new RuntimeException(arg0.field1984 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bh.i(Ldw;I)V")
    public static final void method1539(class122 arg0) {
        int var1 = 0;
        arg0.method2619();
        for (int var2 = 0; var2 < field767; var2++) {
            int var3 = field755[var2];
            if ((field759[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var3] = (byte) (field759[var3] | 0x2);
                } else {
                    int var4 = arg0.method2602(1);
                    if (var4 == 0) {
                        var1 = method97(arg0);
                        field759[var3] = (byte) (field759[var3] | 0x2);
                    } else {
                        method2926(arg0, var3);
                    }
                }
            }
        }
        arg0.method2603();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2619();
        for (int var5 = 0; var5 < field767; var5++) {
            int var6 = field755[var5];
            if ((field759[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var6] = (byte) (field759[var6] | 0x2);
                } else {
                    int var7 = arg0.method2602(1);
                    if (var7 == 0) {
                        var1 = method97(arg0);
                        field759[var6] = (byte) (field759[var6] | 0x2);
                    } else {
                        method2926(arg0, var6);
                    }
                }
            }
        }
        arg0.method2603();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2619();
        for (int var8 = 0; var8 < field760; var8++) {
            int var9 = field761[var8];
            if ((field759[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var9] = (byte) (field759[var9] | 0x2);
                } else {
                    int var10 = arg0.method2602(1);
                    if (var10 == 0) {
                        var1 = method97(arg0);
                        field759[var9] = (byte) (field759[var9] | 0x2);
                    } else if (method2921(arg0, var9)) {
                        field759[var9] = (byte) (field759[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2603();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2619();
        for (int var11 = 0; var11 < field760; var11++) {
            int var12 = field761[var11];
            if ((field759[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field759[var12] = (byte) (field759[var12] | 0x2);
                } else {
                    int var13 = arg0.method2602(1);
                    if (var13 == 0) {
                        var1 = method97(arg0);
                        field759[var12] = (byte) (field759[var12] | 0x2);
                    } else if (method2921(arg0, var12)) {
                        field759[var12] = (byte) (field759[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2603();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field767 = 0;
        field760 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field759[var14] = (byte) (field759[var14] >> 1);
            class3 var15 = client.field410[var14];
            if (var15 == null) {
                field761[++field760 - 1] = var14;
            } else {
                field755[++field767 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("j.d(Ldw;S)I")
    public static int method97(class122 arg0) {
        int var1 = arg0.method2602(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2602(5);
        } else if (var1 == 2) {
            var2 = arg0.method2602(8);
        } else {
            var2 = arg0.method2602(11);
        }
        return var2;
    }

    @ObfuscatedName("eu.o(Ldw;II)V")
    public static void method2926(class122 arg0, int arg1) {
        boolean var2 = arg0.method2602(1) == 1;
        if (var2) {
            field766[++field763 - 1] = arg1;
        }
        int var3 = arg0.method2602(2);
        class3 var4 = client.field410[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field55 = false;
            } else if (client.field411 == arg1) {
                throw new RuntimeException();
            } else {
                field762[arg1] = (Statics.field147 + var4.field856[0] >> 6) + (Statics.field630 + var4.field862[0] >> 6 << 14) + (var4.field53 << 28);
                if (var4.field835 == -1) {
                    field765[arg1] = var4.field858;
                } else {
                    field765[arg1] = var4.field835;
                }
                field764[arg1] = var4.field833;
                client.field410[arg1] = null;
                if (arg0.method2602(1) != 0) {
                    method2921(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2602(3);
            int var6 = var4.field862[0];
            int var7 = var4.field856[0];
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
            if (client.field411 == arg1 && var4.field863 < 1536 || var4.field819 < 1536 || var4.field863 >= 11776 || var4.field819 >= 11776) {
                var4.method11(var6, var7);
                var4.field55 = false;
            } else if (var2) {
                var4.field55 = true;
                var4.field56 = var6;
                var4.field57 = var7;
            } else {
                var4.field55 = false;
                var4.method10(var6, var7, field756[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2602(4);
            int var9 = var4.field862[0];
            int var10 = var4.field856[0];
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
            if (client.field411 == arg1 && var4.field863 < 1536 || var4.field819 < 1536 || var4.field863 >= 11776 || var4.field819 >= 11776) {
                var4.method11(var9, var10);
                var4.field55 = false;
            } else if (var2) {
                var4.field55 = true;
                var4.field56 = var9;
                var4.field57 = var10;
            } else {
                var4.field55 = false;
                var4.method10(var9, var10, field756[arg1]);
            }
        } else {
            int var11 = arg0.method2602(1);
            if (var11 == 0) {
                int var12 = arg0.method2602(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field862[0] + var14;
                int var17 = var4.field856[0] + var15;
                if (client.field411 == arg1 && var4.field863 < 1536 || var4.field819 < 1536 || var4.field863 >= 11776 || var4.field819 >= 11776) {
                    var4.method11(var16, var17);
                    var4.field55 = false;
                } else if (var2) {
                    var4.field55 = true;
                    var4.field56 = var16;
                    var4.field57 = var17;
                } else {
                    var4.field55 = false;
                    var4.method10(var16, var17, field756[arg1]);
                }
                var4.field53 = (byte) (var4.field53 + var13 & 0x3);
                if (client.field411 == arg1) {
                    Statics.field24 = var4.field53;
                }
            } else {
                int var18 = arg0.method2602(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field630 + var4.field862[0] + var20 & 0x3FFF) - Statics.field630;
                int var23 = (Statics.field147 + var4.field856[0] + var21 & 0x3FFF) - Statics.field147;
                if (client.field411 == arg1 && var4.field863 < 1536 || var4.field819 < 1536 || var4.field863 >= 11776 || var4.field819 >= 11776) {
                    var4.method11(var22, var23);
                    var4.field55 = false;
                } else if (var2) {
                    var4.field55 = true;
                    var4.field56 = var22;
                    var4.field57 = var23;
                } else {
                    var4.field55 = false;
                    var4.method10(var22, var23, field756[arg1]);
                }
                var4.field53 = (byte) (var4.field53 + var19 & 0x3);
                if (client.field411 == arg1) {
                    Statics.field24 = var4.field53;
                }
            }
        }
    }

    @ObfuscatedName("eb.c(Ldw;II)Z")
    public static boolean method2921(class122 arg0, int arg1) {
        int var2 = arg0.method2602(2);
        if (var2 == 0) {
            if (arg0.method2602(1) != 0) {
                method2921(arg0, arg1);
            }
            int var3 = arg0.method2602(6);
            int var4 = arg0.method2602(6);
            boolean var5 = arg0.method2602(1) == 1;
            if (var5) {
                field766[++field763 - 1] = arg1;
            }
            if (client.field410[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field410[arg1] = new class3();
            var6.field60 = arg1;
            if (field757[arg1] != null) {
                var6.method16(field757[arg1]);
            }
            var6.field858 = field765[arg1];
            var6.field833 = field764[arg1];
            int var7 = field762[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field864[0] = field756[arg1];
            var6.field53 = (byte) var8;
            var6.method11((var9 << 6) + var3 - Statics.field630, (var10 << 6) + var4 - Statics.field147);
            var6.field55 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2602(2);
            int var12 = field762[arg1];
            field762[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2602(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field762[arg1];
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
            field762[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2602(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field762[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field762[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("c.p(Ldw;ILi;II)V")
    public static final void method53(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method2400();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2360(var6, 0, var5);
            field757[arg1] = var7;
            arg2.method16(var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = arg0.method2334();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2400();
            client.method2929(arg2, var8, var9);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field833 = arg0.method2334();
            if (arg2.field833 == 65535) {
                arg2.field833 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field821 = arg0.method2357();
            if (arg2.field821.charAt(0) == '~') {
                arg2.field821 = arg2.field821.substring(1);
                class12.method869(2, arg2.field36, arg2.field821);
            } else if (Statics.field242 == arg2) {
                class12.method869(2, arg2.field36, arg2.field821);
            }
            arg2.field822 = false;
            arg2.field850 = 0;
            arg2.field826 = 0;
            arg2.field824 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var10 = arg0.method2334();
            int var11 = arg0.method2400();
            arg2.method737(var10, var11, client.field298);
            arg2.field827 = client.field298 + 300;
            arg2.field831 = arg0.method2400();
            arg2.field832 = arg0.method2400();
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field835 = arg0.method2334();
            if (arg2.field842 == 0) {
                arg2.field858 = arg2.field835;
                arg2.field835 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var12 = arg0.method2334();
            class152[] var13 = new class152[] { class152.field2266, class152.field2282, class152.field2269, class152.field2270, class152.field2278 };
            class152 var14 = (class152) class109.method536(var13, arg0.method2400());
            boolean var15 = arg0.method2400() == 1;
            int var16 = arg0.method2400();
            int var17 = arg0.field1984;
            if (arg2.field36 != null && arg2.field32 != null) {
                boolean var18 = false;
                if (var14.field2274 && Statics.method2288(arg2.field36)) {
                    var18 = true;
                }
                if (!var18 && client.field409 == 0 && !arg2.field46) {
                    field758.field1984 = 0;
                    arg0.method2360(field758.field1988, 0, var16);
                    field758.field1984 = 0;
                    class119 var19 = field758;
                    String var20 = class222.method189(var19, 32767);
                    String var21 = class223.method3778(class163.method949(var20));
                    arg2.field821 = var21.trim();
                    arg2.field850 = var12 >> 8;
                    arg2.field826 = var12 & 0xFF;
                    arg2.field824 = 150;
                    arg2.field822 = var15;
                    arg2.field823 = Statics.field242 != arg2 && var14.field2274 && client.field514 != "" && var21.toLowerCase().indexOf(client.field514) == -1;
                    int var22;
                    if (var14.field2273) {
                        var22 = var15 ? 91 : 1;
                    } else {
                        var22 = var15 ? 90 : 2;
                    }
                    if (var14.field2272 == -1) {
                        class12.method869(var22, arg2.field36, var21);
                    } else {
                        int var24 = var14.field2272;
                        String var25 = "<img=" + var24 + ">";
                        class12.method869(var22, var25 + arg2.field36, var21);
                    }
                }
            }
            arg0.field1984 = var16 + var17;
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field844 = arg0.method2334();
            int var26 = arg0.method2354();
            arg2.field848 = var26 >> 16;
            arg2.field847 = (var26 & 0xFFFF) + client.field298;
            arg2.field845 = 0;
            arg2.field846 = 0;
            if (arg2.field847 > client.field298) {
                arg2.field845 = -1;
            }
            if (arg2.field844 == 65535) {
                arg2.field844 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field849 = arg0.method2350();
            arg2.field851 = arg0.method2350();
            arg2.field808 = arg0.method2350();
            arg2.field817 = arg0.method2350();
            arg2.field855 = arg0.method2334() + client.field298;
            arg2.field854 = arg0.method2334() + client.field298;
            arg2.field838 = arg0.method2334();
            if (arg2.field55) {
                arg2.field849 += arg2.field56;
                arg2.field851 += arg2.field57;
                arg2.field808 += arg2.field56;
                arg2.field817 += arg2.field57;
                arg2.field842 = 0;
            } else {
                arg2.field849 += arg2.field862[0];
                arg2.field851 += arg2.field856[0];
                arg2.field808 += arg2.field862[0];
                arg2.field817 += arg2.field856[0];
                arg2.field842 = 1;
            }
            arg2.field853 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            int var27 = arg0.method2334();
            int var28 = arg0.method2400();
            arg2.method737(var27, var28, client.field298);
            arg2.field827 = client.field298 + 300;
            arg2.field831 = arg0.method2400();
            arg2.field832 = arg0.method2400();
        }
        if ((arg3 & 0x2000) != 0) {
            field756[arg1] = arg0.method2350();
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method2350();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var29 = 0; var29 < 3; var29++) {
                arg2.field54[var29] = arg0.method2357();
            }
        }
        if (!arg2.field55) {
            return;
        }
        if (var4 == 127) {
            arg2.method11(arg2.field56, arg2.field57);
            return;
        }
        byte var30;
        if (var4 == -1) {
            var30 = field756[arg1];
        } else {
            var30 = var4;
        }
        arg2.method10(arg2.field56, arg2.field57, var30);
    }

    @ObfuscatedName("fy.j(I)V")
    public static void method3191() {
        field767 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field757[var0] = null;
            field756[var0] = 1;
        }
    }
}
