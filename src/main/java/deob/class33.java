package deob;

@ObfuscatedName("as")
public class class33 {

    @ObfuscatedName("as.i")
    public static byte[] field767 = new byte[2048];

    @ObfuscatedName("as.q")
    public static byte[] field770 = new byte[2048];

    @ObfuscatedName("as.p")
    public static class119[] field756 = new class119[2048];

    @ObfuscatedName("as.c")
    public static int field761 = 0;

    @ObfuscatedName("as.f")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("as.y")
    public static int field763 = 0;

    @ObfuscatedName("as.w")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("as.l")
    public static int[] field758 = new int[2048];

    @ObfuscatedName("as.v")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("as.k")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("as.o")
    public static int field768 = 0;

    @ObfuscatedName("as.u")
    public static int[] field769 = new int[2048];

    @ObfuscatedName("as.s")
    public static class119 field759 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.h(Ldd;B)V")
    public static final void method729(class122 arg0) {
        arg0.method2574();
        int var1 = client.field288;
        class3 var2 = Statics.field2683 = client.field407[var1] = new class3();
        var2.field53 = var1;
        int var3 = arg0.method2594(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field871[0] = var5 - Statics.field77;
        var2.field861 = (var2.field871[0] << 7) + (var2.method10() << 6);
        var2.field872[0] = var6 - Statics.field271;
        var2.field818 = (var2.field872[0] << 7) + (var2.method10() << 6);
        Statics.field880 = var2.field52 = var4;
        if (field756[var1] != null) {
            var2.method9(field756[var1]);
        }
        field761 = 0;
        field765[++field761 - 1] = var1;
        field767[var1] = 0;
        field763 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2594(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field758[var7] = (var9 << 28) + (var10 << 14) + var11;
                field766[var7] = 0;
                field760[var7] = -1;
                field764[++field763 - 1] = var7;
                field767[var7] = 0;
            }
        }
        arg0.method2569();
    }

    @ObfuscatedName("el.m(Ldd;II)V")
    public static final void method2676(class122 arg0, int arg1) {
        int var2 = arg0.field1988;
        field768 = 0;
        int var3 = 0;
        arg0.method2574();
        for (int var4 = 0; var4 < field761; var4++) {
            int var5 = field765[var4];
            if ((field767[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field767[var5] = (byte) (field767[var5] | 0x2);
                } else {
                    int var6 = arg0.method2594(1);
                    if (var6 == 0) {
                        var3 = method1017(arg0);
                        field767[var5] = (byte) (field767[var5] | 0x2);
                    } else {
                        method179(arg0, var5);
                    }
                }
            }
        }
        arg0.method2569();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2574();
        for (int var7 = 0; var7 < field761; var7++) {
            int var8 = field765[var7];
            if ((field767[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field767[var8] = (byte) (field767[var8] | 0x2);
                } else {
                    int var9 = arg0.method2594(1);
                    if (var9 == 0) {
                        var3 = method1017(arg0);
                        field767[var8] = (byte) (field767[var8] | 0x2);
                    } else {
                        method179(arg0, var8);
                    }
                }
            }
        }
        arg0.method2569();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2574();
        for (int var10 = 0; var10 < field763; var10++) {
            int var11 = field764[var10];
            if ((field767[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field767[var11] = (byte) (field767[var11] | 0x2);
                } else {
                    int var12 = arg0.method2594(1);
                    if (var12 == 0) {
                        var3 = method1017(arg0);
                        field767[var11] = (byte) (field767[var11] | 0x2);
                    } else if (method679(arg0, var11)) {
                        field767[var11] = (byte) (field767[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2569();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2574();
        for (int var13 = 0; var13 < field763; var13++) {
            int var14 = field764[var13];
            if ((field767[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field767[var14] = (byte) (field767[var14] | 0x2);
                } else {
                    int var15 = arg0.method2594(1);
                    if (var15 == 0) {
                        var3 = method1017(arg0);
                        field767[var14] = (byte) (field767[var14] | 0x2);
                    } else if (method679(arg0, var14)) {
                        field767[var14] = (byte) (field767[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2569();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field761 = 0;
        field763 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field767[var16] = (byte) (field767[var16] >> 1);
            class3 var17 = client.field407[var16];
            if (var17 == null) {
                field764[++field763 - 1] = var16;
            } else {
                field765[++field761 - 1] = var16;
            }
        }
        Statics.method2739(arg0);
        if (arg0.field1988 - var2 != arg1) {
            throw new RuntimeException(arg0.field1988 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("an.i(Ldd;I)I")
    public static int method1017(class122 arg0) {
        int var1 = arg0.method2594(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2594(5);
        } else if (var1 == 2) {
            var2 = arg0.method2594(8);
        } else {
            var2 = arg0.method2594(11);
        }
        return var2;
    }

    @ObfuscatedName("x.q(Ldd;II)V")
    public static void method179(class122 arg0, int arg1) {
        boolean var2 = arg0.method2594(1) == 1;
        if (var2) {
            field769[++field768 - 1] = arg1;
        }
        int var3 = arg0.method2594(2);
        class3 var4 = client.field407[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field54 = -1;
            } else if (client.field288 == arg1) {
                throw new RuntimeException();
            } else {
                field758[arg1] = (Statics.field271 + var4.field872[0] >> 6) + (Statics.field77 + var4.field871[0] >> 6 << 14) + (var4.field52 << 28);
                if (var4.field844 == -1) {
                    field766[arg1] = var4.field867;
                } else {
                    field766[arg1] = var4.field844;
                }
                field760[arg1] = var4.field842;
                client.field407[arg1] = null;
                if (arg0.method2594(1) != 0) {
                    method679(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2594(3);
            int var6 = var4.field871[0];
            int var7 = var4.field872[0];
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
            if (client.field288 == arg1 && var4.field861 < 1536 || var4.field818 < 1536 || var4.field861 >= 11776 || var4.field818 >= 11776) {
                var4.method22(var6, var7);
                var4.field54 = -1;
            } else if (var2) {
                var4.field54 = var6;
                var4.field55 = var7;
            } else {
                var4.field54 = -1;
                var4.method16(var6, var7, field770[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2594(4);
            int var9 = var4.field871[0];
            int var10 = var4.field872[0];
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
            if (client.field288 == arg1 && var4.field861 < 1536 || var4.field818 < 1536 || var4.field861 >= 11776 || var4.field818 >= 11776) {
                var4.method22(var9, var10);
                var4.field54 = -1;
            } else if (var2) {
                var4.field54 = var9;
                var4.field55 = var10;
            } else {
                var4.field54 = -1;
                var4.method16(var9, var10, field770[arg1]);
            }
        } else {
            int var11 = arg0.method2594(1);
            if (var11 == 0) {
                int var12 = arg0.method2594(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field871[0] + var14;
                int var17 = var4.field872[0] + var15;
                if (client.field288 == arg1 && var4.field861 < 1536 || var4.field818 < 1536 || var4.field861 >= 11776 || var4.field818 >= 11776) {
                    var4.method22(var16, var17);
                    var4.field54 = -1;
                } else if (var2) {
                    var4.field54 = var16;
                    var4.field55 = var17;
                } else {
                    var4.field54 = -1;
                    var4.method16(var16, var17, field770[arg1]);
                }
                var4.field52 = (byte) (var4.field52 + var13 & 0x3);
                if (client.field288 == arg1) {
                    Statics.field880 = var4.field52;
                }
            } else {
                int var18 = arg0.method2594(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field77 + var4.field871[0] + var20 & 0x3FFF) - Statics.field77;
                int var23 = (Statics.field271 + var4.field872[0] + var21 & 0x3FFF) - Statics.field271;
                if (client.field288 == arg1 && var4.field861 < 1536 || var4.field818 < 1536 || var4.field861 >= 11776 || var4.field818 >= 11776) {
                    var4.method22(var22, var23);
                    var4.field54 = -1;
                } else if (var2) {
                    var4.field54 = var22;
                    var4.field55 = var23;
                } else {
                    var4.field54 = -1;
                    var4.method16(var22, var23, field770[arg1]);
                }
                var4.field52 = (byte) (var4.field52 + var19 & 0x3);
                if (client.field288 == arg1) {
                    Statics.field880 = var4.field52;
                }
            }
        }
    }

    @ObfuscatedName("as.p(Ldd;IB)Z")
    public static boolean method679(class122 arg0, int arg1) {
        int var2 = arg0.method2594(2);
        if (var2 == 0) {
            if (arg0.method2594(1) != 0) {
                method679(arg0, arg1);
            }
            int var3 = arg0.method2594(6);
            int var4 = arg0.method2594(6);
            boolean var5 = arg0.method2594(1) == 1;
            if (var5) {
                field769[++field768 - 1] = arg1;
            }
            if (client.field407[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field407[arg1] = new class3();
            var6.field53 = arg1;
            if (field756[arg1] != null) {
                var6.method9(field756[arg1]);
            }
            var6.field867 = field766[arg1];
            var6.field842 = field760[arg1];
            int var7 = field758[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field873[0] = field770[arg1];
            var6.field52 = (byte) var8;
            var6.method22((var9 << 6) + var3 - Statics.field77, (var10 << 6) + var4 - Statics.field271);
            var6.field54 = -1;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2594(2);
            int var12 = field758[arg1];
            field758[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2594(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field758[arg1];
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
            field758[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2594(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field758[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field758[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("s.f(Ldd;ILi;II)V")
    public static final void method160(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method2320();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2436(var6, 0, var5);
            field756[arg1] = var7;
            arg2.method9(var7);
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2322();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2320();
            client.method2196(arg2, var8, var9);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field842 = arg0.method2322();
            if (arg2.field842 == 65535) {
                arg2.field842 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field845 = arg0.method2350();
            if (arg2.field845.charAt(0) == '~') {
                arg2.field845 = arg2.field845.substring(1);
                class12.method2263(2, arg2.field56, arg2.field845);
            } else if (Statics.field2683 == arg2) {
                class12.method2263(2, arg2.field56, arg2.field845);
            }
            arg2.field838 = false;
            arg2.field834 = 0;
            arg2.field835 = 0;
            arg2.field833 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var10 = arg0.method2322();
            int var11 = arg0.method2320();
            arg2.method722(var10, var11, client.field295);
            arg2.field839 = client.field295 + 300;
            arg2.field840 = arg0.method2320();
            arg2.field841 = arg0.method2320();
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field844 = arg0.method2322();
            if (arg2.field870 == 0) {
                arg2.field867 = arg2.field844;
                arg2.field844 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var12 = arg0.method2322();
            class152 var13 = (class152) class109.method706(class152.method2254(), arg0.method2320());
            boolean var14 = arg0.method2320() == 1;
            int var15 = arg0.method2320();
            int var16 = arg0.field1988;
            if (arg2.field56 != null && arg2.field32 != null) {
                boolean var17 = false;
                if (var13.field2249 && client.method741(arg2.field56)) {
                    var17 = true;
                }
                if (!var17 && client.field406 == 0 && !arg2.field51) {
                    field759.field1988 = 0;
                    arg0.method2436(field759.field1989, 0, var15);
                    field759.field1988 = 0;
                    String var18 = class223.method3730(class163.method2741(class222.method630(field759)));
                    arg2.field845 = var18.trim();
                    arg2.field834 = var12 >> 8;
                    arg2.field835 = var12 & 0xFF;
                    arg2.field833 = 150;
                    arg2.field838 = var14;
                    arg2.field854 = Statics.field2683 != arg2 && var13.field2249 && client.field505 != "" && var18.toLowerCase().indexOf(client.field505) == -1;
                    int var19;
                    if (var13.field2255) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field2259 == -1) {
                        class12.method2263(var19, arg2.field56, var18);
                    } else {
                        class12.method2263(var19, Statics.method2243(var13.field2259) + arg2.field56, var18);
                    }
                }
            }
            arg0.field1988 = var15 + var16;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field853 = arg0.method2322();
            int var20 = arg0.method2324();
            arg2.field857 = var20 >> 16;
            arg2.field851 = (var20 & 0xFFFF) + client.field295;
            arg2.field876 = 0;
            arg2.field858 = 0;
            if (arg2.field851 > client.field295) {
                arg2.field876 = -1;
            }
            if (arg2.field853 == 65535) {
                arg2.field853 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field826 = arg0.method2425();
            arg2.field860 = arg0.method2425();
            arg2.field859 = arg0.method2425();
            arg2.field823 = arg0.method2425();
            arg2.field830 = arg0.method2322() + client.field295;
            arg2.field847 = arg0.method2322() + client.field295;
            arg2.field836 = arg0.method2322();
            if (arg2.field54 == -1) {
                arg2.field826 += arg2.field871[0];
                arg2.field860 += arg2.field872[0];
                arg2.field859 += arg2.field871[0];
                arg2.field823 += arg2.field872[0];
                arg2.field870 = 1;
            } else {
                arg2.field826 += arg2.field54;
                arg2.field860 += arg2.field55;
                arg2.field859 += arg2.field54;
                arg2.field823 += arg2.field55;
                arg2.field870 = 0;
            }
            arg2.field875 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            int var21 = arg0.method2322();
            int var22 = arg0.method2320();
            arg2.method722(var21, var22, client.field295);
            arg2.field839 = client.field295 + 300;
            arg2.field840 = arg0.method2320();
            arg2.field841 = arg0.method2320();
        }
        if ((arg3 & 0x800) != 0) {
            field770[arg1] = arg0.method2425();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2425();
        }
        if (arg2.field54 == -1) {
            return;
        }
        if (var4 == 127) {
            arg2.method22(arg2.field54, arg2.field55);
            return;
        }
        byte var23;
        if (var4 == -1) {
            var23 = field770[arg1];
        } else {
            var23 = var4;
        }
        arg2.method16(arg2.field54, arg2.field55, var23);
    }

    @ObfuscatedName("ek.y(I)V")
    public static void method2794() {
        field761 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field756[var0] = null;
            field770[var0] = 1;
        }
    }
}
