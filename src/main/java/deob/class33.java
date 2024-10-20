package deob;

@ObfuscatedName("af")
public class class33 {

    @ObfuscatedName("af.w")
    public static byte[] field764 = new byte[2048];

    @ObfuscatedName("af.d")
    public static byte[] field765 = new byte[2048];

    @ObfuscatedName("af.z")
    public static class119[] field766 = new class119[2048];

    @ObfuscatedName("af.l")
    public static int field767 = 0;

    @ObfuscatedName("af.m")
    public static int[] field770 = new int[2048];

    @ObfuscatedName("af.p")
    public static int field774 = 0;

    @ObfuscatedName("af.u")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("af.c")
    public static int[] field771 = new int[2048];

    @ObfuscatedName("af.v")
    public static int[] field772 = new int[2048];

    @ObfuscatedName("af.o")
    public static int[] field768 = new int[2048];

    @ObfuscatedName("af.n")
    public static int field778 = 0;

    @ObfuscatedName("af.k")
    public static int[] field775 = new int[2048];

    @ObfuscatedName("af.f")
    public static class119 field776 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.g(Ldr;B)V")
    public static final void method1007(class122 arg0) {
        arg0.method2623();
        int var1 = client.field418;
        class3 var2 = Statics.field176 = client.field575[var1] = new class3();
        var2.field40 = var1;
        int var3 = arg0.method2614(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field872[0] = var5 - Statics.field3144;
        var2.field875 = (var2.field872[0] << 7) + (var2.method20() << 6);
        var2.field873[0] = var6 - Statics.field656;
        var2.field819 = (var2.field873[0] << 7) + (var2.method20() << 6);
        Statics.field1765 = var2.field61 = var4;
        if (field766[var1] != null) {
            var2.method17(field766[var1]);
        }
        field767 = 0;
        field770[++field767 - 1] = var1;
        field764[var1] = 0;
        field774 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2614(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field771[var7] = (var9 << 28) + (var10 << 14) + var11;
                field772[var7] = 0;
                field768[var7] = -1;
                field763[++field774 - 1] = var7;
                field764[var7] = 0;
            }
        }
        arg0.method2615();
    }

    @ObfuscatedName("v.b(Ldr;IB)V")
    public static final void method134(class122 arg0, int arg1) {
        int var2 = arg0.field1977;
        field778 = 0;
        int var3 = 0;
        arg0.method2623();
        for (int var4 = 0; var4 < field767; var4++) {
            int var5 = field770[var4];
            if ((field764[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field764[var5] = (byte) (field764[var5] | 0x2);
                } else {
                    int var6 = arg0.method2614(1);
                    if (var6 == 0) {
                        var3 = method592(arg0);
                        field764[var5] = (byte) (field764[var5] | 0x2);
                    } else {
                        method1012(arg0, var5);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2623();
        for (int var7 = 0; var7 < field767; var7++) {
            int var8 = field770[var7];
            if ((field764[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field764[var8] = (byte) (field764[var8] | 0x2);
                } else {
                    int var9 = arg0.method2614(1);
                    if (var9 == 0) {
                        var3 = method592(arg0);
                        field764[var8] = (byte) (field764[var8] | 0x2);
                    } else {
                        method1012(arg0, var8);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2623();
        for (int var10 = 0; var10 < field774; var10++) {
            int var11 = field763[var10];
            if ((field764[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field764[var11] = (byte) (field764[var11] | 0x2);
                } else {
                    int var12 = arg0.method2614(1);
                    if (var12 == 0) {
                        var3 = method592(arg0);
                        field764[var11] = (byte) (field764[var11] | 0x2);
                    } else if (Statics.method3064(arg0, var11)) {
                        field764[var11] = (byte) (field764[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2623();
        for (int var13 = 0; var13 < field774; var13++) {
            int var14 = field763[var13];
            if ((field764[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field764[var14] = (byte) (field764[var14] | 0x2);
                } else {
                    int var15 = arg0.method2614(1);
                    if (var15 == 0) {
                        var3 = method592(arg0);
                        field764[var14] = (byte) (field764[var14] | 0x2);
                    } else if (Statics.method3064(arg0, var14)) {
                        field764[var14] = (byte) (field764[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field767 = 0;
        field774 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field764[var16] = (byte) (field764[var16] >> 1);
            class3 var17 = client.field575[var16];
            if (var17 == null) {
                field763[++field774 - 1] = var16;
            } else {
                field770[++field767 - 1] = var16;
            }
        }
        method994(arg0);
        if (arg0.field1977 - var2 != arg1) {
            throw new RuntimeException(arg0.field1977 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("e.w(Ldr;I)I")
    public static int method592(class122 arg0) {
        int var1 = arg0.method2614(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2614(5);
        } else if (var1 == 2) {
            var2 = arg0.method2614(8);
        } else {
            var2 = arg0.method2614(11);
        }
        return var2;
    }

    @ObfuscatedName("ac.d(Ldr;II)V")
    public static void method1012(class122 arg0, int arg1) {
        boolean var2 = arg0.method2614(1) == 1;
        if (var2) {
            field775[++field778 - 1] = arg1;
        }
        int var3 = arg0.method2614(2);
        class3 var4 = client.field575[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field63 = false;
            } else if (client.field418 == arg1) {
                throw new RuntimeException();
            } else {
                field771[arg1] = (Statics.field656 + var4.field873[0] >> 6) + (Statics.field3144 + var4.field872[0] >> 6 << 14) + (var4.field61 << 28);
                if (var4.field824 == -1) {
                    field772[arg1] = var4.field868;
                } else {
                    field772[arg1] = var4.field824;
                }
                field768[arg1] = var4.field848;
                client.field575[arg1] = null;
                if (arg0.method2614(1) != 0) {
                    Statics.method3064(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2614(3);
            int var6 = var4.field872[0];
            int var7 = var4.field873[0];
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
            if (client.field418 == arg1 && var4.field875 < 1536 || var4.field819 < 1536 || var4.field875 >= 11776 || var4.field819 >= 11776) {
                var4.method21(var6, var7);
                var4.field63 = false;
            } else if (var2) {
                var4.field63 = true;
                var4.field42 = var6;
                var4.field65 = var7;
            } else {
                var4.field63 = false;
                var4.method30(var6, var7, field765[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2614(4);
            int var9 = var4.field872[0];
            int var10 = var4.field873[0];
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
            if (client.field418 == arg1 && var4.field875 < 1536 || var4.field819 < 1536 || var4.field875 >= 11776 || var4.field819 >= 11776) {
                var4.method21(var9, var10);
                var4.field63 = false;
            } else if (var2) {
                var4.field63 = true;
                var4.field42 = var9;
                var4.field65 = var10;
            } else {
                var4.field63 = false;
                var4.method30(var9, var10, field765[arg1]);
            }
        } else {
            int var11 = arg0.method2614(1);
            if (var11 == 0) {
                int var12 = arg0.method2614(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field872[0] + var14;
                int var17 = var4.field873[0] + var15;
                if (client.field418 == arg1 && var4.field875 < 1536 || var4.field819 < 1536 || var4.field875 >= 11776 || var4.field819 >= 11776) {
                    var4.method21(var16, var17);
                    var4.field63 = false;
                } else if (var2) {
                    var4.field63 = true;
                    var4.field42 = var16;
                    var4.field65 = var17;
                } else {
                    var4.field63 = false;
                    var4.method30(var16, var17, field765[arg1]);
                }
                var4.field61 = (byte) (var4.field61 + var13 & 0x3);
                if (client.field418 == arg1) {
                    Statics.field1765 = var4.field61;
                }
            } else {
                int var18 = arg0.method2614(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3144 + var4.field872[0] + var20 & 0x3FFF) - Statics.field3144;
                int var23 = (Statics.field656 + var4.field873[0] + var21 & 0x3FFF) - Statics.field656;
                if (client.field418 == arg1 && var4.field875 < 1536 || var4.field819 < 1536 || var4.field875 >= 11776 || var4.field819 >= 11776) {
                    var4.method21(var22, var23);
                    var4.field63 = false;
                } else if (var2) {
                    var4.field63 = true;
                    var4.field42 = var22;
                    var4.field65 = var23;
                } else {
                    var4.field63 = false;
                    var4.method30(var22, var23, field765[arg1]);
                }
                var4.field61 = (byte) (var4.field61 + var19 & 0x3);
                if (client.field418 == arg1) {
                    Statics.field1765 = var4.field61;
                }
            }
        }
    }

    @ObfuscatedName("ar.l(Ldr;B)V")
    public static final void method994(class122 arg0) {
        for (int var1 = 0; var1 < field778; var1++) {
            int var2 = field775[var1];
            class3 var3 = client.field575[var2];
            int var4 = arg0.method2362();
            if ((var4 & 0x80) != 0) {
                var4 += arg0.method2362() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x40) != 0) {
                int var6 = arg0.method2362();
                byte[] var7 = new byte[var6];
                class119 var8 = new class119(var7);
                arg0.method2477(var7, 0, var6);
                field766[var2] = var8;
                var3.method17(var8);
            }
            if ((var4 & 0x2) != 0) {
                int var9 = arg0.method2376();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2362();
                client.method242(var3, var9, var10);
            }
            if ((var4 & 0x8) != 0) {
                var3.field848 = arg0.method2376();
                if (var3.field848 == 65535) {
                    var3.field848 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field876 = arg0.method2370();
                if (var3.field876.charAt(0) == '~') {
                    var3.field876 = var3.field876.substring(1);
                    class12.method2737(2, var3.field52, var3.field876);
                } else if (Statics.field176 == var3) {
                    class12.method2737(2, var3.field52, var3.field876);
                }
                var3.field851 = false;
                var3.field835 = 0;
                var3.field836 = 0;
                var3.field834 = 150;
            }
            if ((var4 & 0x20) != 0) {
                int var11 = arg0.method2376();
                int var12 = arg0.method2362();
                var3.method753(var11, var12, client.field302);
                var3.field840 = client.field302 + 300;
                var3.field860 = arg0.method2362();
                var3.field880 = arg0.method2362();
            }
            if ((var4 & 0x10) != 0) {
                var3.field824 = arg0.method2376();
                if (var3.field871 == 0) {
                    var3.field868 = var3.field824;
                    var3.field824 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var13 = arg0.method2376();
                class152 var14 = (class152) class109.method3002(class152.method2854(), arg0.method2362());
                boolean var15 = arg0.method2362() == 1;
                int var16 = arg0.method2362();
                int var17 = arg0.field1977;
                if (var3.field52 != null && var3.field41 != null) {
                    boolean var18 = false;
                    if (var14.field2260 && client.method1603(var3.field52)) {
                        var18 = true;
                    }
                    if (!var18 && client.field505 == 0 && !var3.field56) {
                        field776.field1977 = 0;
                        arg0.method2477(field776.field1986, 0, var16);
                        field776.field1977 = 0;
                        class119 var19 = field776;
                        String var20 = class222.method3067(var19, 32767);
                        String var21 = class223.method3887(class163.method2256(var20));
                        var3.field876 = var21.trim();
                        var3.field835 = var13 >> 8;
                        var3.field836 = var13 & 0xFF;
                        var3.field834 = 150;
                        var3.field851 = var15;
                        var3.field833 = Statics.field176 != var3 && var14.field2260 && client.field514 != "" && var21.toLowerCase().indexOf(client.field514) == -1;
                        int var22;
                        if (var14.field2259) {
                            var22 = var15 ? 91 : 1;
                        } else {
                            var22 = var15 ? 90 : 2;
                        }
                        if (var14.field2257 == -1) {
                            class12.method2737(var22, var3.field52, var21);
                        } else {
                            class12.method2737(var22, class2.method1228(var14.field2257) + var3.field52, var21);
                        }
                    }
                }
                arg0.field1977 = var16 + var17;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field854 = arg0.method2376();
                int var23 = arg0.method2367();
                var3.field858 = var23 >> 16;
                var3.field857 = (var23 & 0xFFFF) + client.field302;
                var3.field855 = 0;
                var3.field856 = 0;
                if (var3.field857 > client.field302) {
                    var3.field855 = -1;
                }
                if (var3.field854 == 65535) {
                    var3.field854 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field843 = arg0.method2391();
                var3.field818 = arg0.method2391();
                var3.field831 = arg0.method2391();
                var3.field829 = arg0.method2391();
                var3.field863 = arg0.method2376() + client.field302;
                var3.field864 = arg0.method2376() + client.field302;
                var3.field865 = arg0.method2376();
                if (var3.field63) {
                    var3.field843 += var3.field42;
                    var3.field818 += var3.field65;
                    var3.field831 += var3.field42;
                    var3.field829 += var3.field65;
                    var3.field871 = 0;
                } else {
                    var3.field843 += var3.field872[0];
                    var3.field818 += var3.field873[0];
                    var3.field831 += var3.field872[0];
                    var3.field829 += var3.field873[0];
                    var3.field871 = 1;
                }
                var3.field849 = 0;
            }
            if ((var4 & 0x400) != 0) {
                int var24 = arg0.method2376();
                int var25 = arg0.method2362();
                var3.method753(var24, var25, client.field302);
                var3.field840 = client.field302 + 300;
                var3.field860 = arg0.method2362();
                var3.field880 = arg0.method2362();
            }
            if ((var4 & 0x100) != 0) {
                field765[var2] = arg0.method2391();
            }
            if ((var4 & 0x800) != 0) {
                var5 = arg0.method2391();
            }
            if ((var4 & 0x2000) != 0) {
                for (int var26 = 0; var26 < 3; var26++) {
                    var3.field49[var26] = arg0.method2370();
                }
            }
            if (var3.field63) {
                if (var5 == 127) {
                    var3.method21(var3.field42, var3.field65);
                } else {
                    byte var27;
                    if (var5 == -1) {
                        var27 = field765[var2];
                    } else {
                        var27 = var5;
                    }
                    var3.method30(var3.field42, var3.field65, var27);
                }
            }
        }
    }

    @ObfuscatedName("ej.m(S)V")
    public static void method2784() {
        field767 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field766[var0] = null;
            field765[var0] = 1;
        }
    }
}
